/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.Locale;
import javax.annotation.Nullable;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.SwingUtilities;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.ValueConversionException;
import joptsimple.ValueConverter;
import joptsimple.util.EnumConverter;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.account.SessionManager;
import net.runelite.client.callback.Hooks;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.CommandManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.discord.DiscordService;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.game.ClanManager;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.LootManager;
import net.runelite.client.game.chatbox.ChatboxPanelManager;
import net.runelite.client.menus.MenuManager;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.rs.ClientLoader;
import net.runelite.client.rs.ClientUpdateCheckMode;
import net.runelite.client.ui.ClientUI;
import net.runelite.client.ui.DrawManager;
import net.runelite.client.ui.FatalErrorDialog;
import net.runelite.client.ui.SanLiteSplashScreen;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.OverlayRenderer;
import net.runelite.client.ui.overlay.WidgetOverlay;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.ui.overlay.infobox.InfoBoxOverlay;
import net.runelite.client.ui.overlay.tooltip.TooltipManager;
import net.runelite.client.ui.overlay.tooltip.TooltipOverlay;
import net.runelite.client.ui.overlay.worldmap.WorldMapOverlay;
import net.runelite.client.ws.PartyService;
import org.slf4j.LoggerFactory;

@Singleton
@Slf4j
public class RuneLite
{
	public static final File RUNELITE_DIR = new File(System.getProperty("user.home"), ".sanlite");
	public static final File CACHE_DIR = new File(RUNELITE_DIR, "cache");
	public static final File PROFILES_DIR = new File(RUNELITE_DIR, "profiles");
	public static final File SCREENSHOT_DIR = new File(RUNELITE_DIR, "screenshots");
	public static final File LOGS_DIR = new File(RUNELITE_DIR, "logs");
	public static final File DEFAULT_SESSION_FILE = new File(RUNELITE_DIR, "session");
	public static final File DEFAULT_CONFIG_FILE = new File(RUNELITE_DIR, "settings.properties");
	private static final SanLiteSplashScreen splashScreen = new SanLiteSplashScreen();

	@Getter
	private static Injector injector;

	@Inject
	private PluginManager pluginManager;

	@Inject
	private EventBus eventBus;

	@Inject
	private ConfigManager configManager;

	@Inject
	private DrawManager drawManager;

	@Inject
	private SessionManager sessionManager;

	@Inject
	private DiscordService discordService;

	@Inject
	private ClientSessionManager clientSessionManager;

	@Inject
	private ClientUI clientUI;

	@Inject
	private InfoBoxManager infoBoxManager;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private TooltipManager tooltipManager;

	@Inject
	private Provider<PartyService> partyService;

	@Inject
	private Provider<ItemManager> itemManager;

	@Inject
	private Provider<OverlayRenderer> overlayRenderer;

	@Inject
	private Provider<ClanManager> clanManager;

	@Inject
	private Provider<ChatMessageManager> chatMessageManager;

	@Inject
	private Provider<MenuManager> menuManager;

	@Inject
	private Provider<CommandManager> commandManager;

	@Inject
	private Provider<InfoBoxOverlay> infoBoxOverlay;

	@Inject
	private Provider<TooltipOverlay> tooltipOverlay;

	@Inject
	private Provider<WorldMapOverlay> worldMapOverlay;

	@Inject
	private Provider<LootManager> lootManager;

	@Inject
	private Provider<ChatboxPanelManager> chatboxPanelManager;

	@Inject
	private Provider<Hooks> hooks;

	@Inject
	@Nullable
	private Client client;

	public static void main(String[] args) throws Exception
	{
		Locale.setDefault(Locale.ENGLISH);

		final OptionParser parser = new OptionParser();
		parser.accepts("debug", "Show extra debugging output");
		parser.accepts("local-injected", "Use local injected-client");
		parser.accepts("no-splash-screen", "Do not show the splash screen");

		final ArgumentAcceptingOptionSpec<File> sessionfile = parser.accepts("sessionfile", "Use a specified session file")
			.withRequiredArg()
			.withValuesConvertedBy(new ConfigFileConverter())
			.defaultsTo(DEFAULT_SESSION_FILE);

		final ArgumentAcceptingOptionSpec<File> configfile = parser.accepts("config", "Use a specified config file")
			.withRequiredArg()
			.withValuesConvertedBy(new ConfigFileConverter())
			.defaultsTo(DEFAULT_CONFIG_FILE);

		final ArgumentAcceptingOptionSpec<ClientUpdateCheckMode> updateMode = parser
			.accepts("rs", "Select client type")
			.withRequiredArg()
			.ofType(ClientUpdateCheckMode.class)
			.defaultsTo(ClientUpdateCheckMode.AUTO)
			.withValuesConvertedBy(new EnumConverter<ClientUpdateCheckMode>(ClientUpdateCheckMode.class)
			{
				@Override
				public ClientUpdateCheckMode convert(String v)
				{
					return super.convert(v.toUpperCase());
				}
			});

		parser.accepts("help", "Show this text").forHelp();
		OptionSet options = parser.parse(args);

		if (options.has("help"))
		{
			parser.printHelpOn(System.out);
			System.exit(0);
		}

		if (options.has("debug"))
		{
			final Logger logger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
			logger.setLevel(Level.DEBUG);
		}

		if (options.has("local-injected"))
		{
			ClientLoader.USE_LOCAL_INJECTED = true;
		}

		Thread.setDefaultUncaughtExceptionHandler((thread, throwable) ->
		{
			log.error("Uncaught exception:", throwable);
			if (throwable instanceof AbstractMethodError)
			{
				log.error("Classes are out of date; Build with maven again.");
			}
		});

		if (!options.has("no-splash-screen"))
		{
			splashScreen.open(6);
		}

		splashScreen.setMessage("Starting SanLite Injector");

		try
		{
			final ClientLoader clientLoader = new ClientLoader(options.valueOf(updateMode));

			new Thread(() ->
			{
				clientLoader.get();
				ClassPreloader.preload();
			}, "Preloader").start();

			PROFILES_DIR.mkdirs();

			final long start = System.currentTimeMillis();

			injector = Guice.createInjector(new RuneLiteModule(
					clientLoader,
					options.valueOf(sessionfile),
					options.valueOf(configfile)));

			injector.getInstance(RuneLite.class).start();

			final long end = System.currentTimeMillis();
			final RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
			final long uptime = rb.getUptime();
			log.info("Client initialization took {}ms. Uptime: {}ms", end - start, uptime);
		}
		catch (Exception e)
		{
			log.warn("Failure during startup", e);
			splashScreen.close();
			SwingUtilities.invokeLater(() ->
				new FatalErrorDialog("SanLite has encountered an unexpected error during startup.")
					.open());
		}
	}

	public void start() throws Exception
	{
		// Load RuneLite or Vanilla client
		final boolean isOutdated = client == null;

		if (!isOutdated)
		{
			// Inject members into client
			injector.injectMembers(client);
		}

		// Load user configuration
		splashScreen.setMessage("Loading configuration");
		configManager.load();

		// Load the session, including saved configuration
		sessionManager.loadSession();

		// Tell the plugin manager if client is outdated or not
		splashScreen.setMessage("Loading plugins");
		pluginManager.setOutdated(isOutdated);

		// Load the plugins, but does not start them yet.
		// This will initialize configuration
		try
		{
			SwingUtilities.invokeAndWait(() ->
			{
				try
				{
					pluginManager.loadCorePlugins();
				}
				catch (PluginInstantiationException | IOException ex)
				{
					log.error("Unable to load core plugins", ex);
				}
			});
		}
		catch (InterruptedException | InvocationTargetException e)
		{
			throw new RuntimeException(e);
		}

		splashScreen.setMessage("Finalizing configuration");

		// Plugins have provided their config, so set default config
		// to main settings
		pluginManager.loadDefaultPluginConfiguration(null);

		// Start client session
		splashScreen.setMessage("Starting session");
		clientSessionManager.start();

		// Initialize UI
		splashScreen.setMessage("Starting core interface");
		clientUI.init(this);

		// Close the splash screen
		splashScreen.close();

		// Initialize Discord service
		discordService.init();

		// Register event listeners
		eventBus.register(clientUI);
		eventBus.register(pluginManager);
		eventBus.register(overlayManager);
		eventBus.register(drawManager);
		eventBus.register(infoBoxManager);
		eventBus.register(tooltipManager);

		if (!isOutdated)
		{
			// Initialize chat colors
			chatMessageManager.get().loadColors();

			eventBus.register(partyService.get());
			eventBus.register(overlayRenderer.get());
			eventBus.register(clanManager.get());
			eventBus.register(itemManager.get());
			eventBus.register(menuManager.get());
			eventBus.register(chatMessageManager.get());
			eventBus.register(commandManager.get());
			eventBus.register(lootManager.get());
			eventBus.register(chatboxPanelManager.get());
			eventBus.register(hooks.get());

			// Add core overlays
			WidgetOverlay.createOverlays(client).forEach(overlayManager::add);
			overlayManager.add(infoBoxOverlay.get());
			overlayManager.add(worldMapOverlay.get());
			overlayManager.add(tooltipOverlay.get());
		}

		// Start plugins
		pluginManager.startPlugins();

		clientUI.show();
	}

	public void shutdown()
	{
		configManager.sendConfig();
		clientSessionManager.shutdown();
		discordService.close();
	}

	@VisibleForTesting
	public static void setInjector(Injector injector)
	{
		RuneLite.injector = injector;
	}

	private static class ConfigFileConverter implements ValueConverter<File>
	{
		@Override
		public File convert(String fileName)
		{
			final File file;

			if (Paths.get(fileName).isAbsolute()
				|| fileName.startsWith("./")
				|| fileName.startsWith(".\\"))
			{
				file = new File(fileName);
			}
			else
			{
				file = new File(RuneLite.RUNELITE_DIR, fileName);
			}

			if (file.exists() && (!file.isFile() || !file.canWrite()))
			{
				throw new ValueConversionException(String.format("File %s is not accessible", file.getAbsolutePath()));
			}

			return file;
		}

		@Override
		public Class<? extends File> valueType()
		{
			return File.class;
		}

		@Override
		public String valuePattern()
		{
			return null;
		}
	}
}
