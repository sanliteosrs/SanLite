/*
 * Copyright (c) 2021, Siraz <https://github.com/Sirazzz>
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
package net.sanlite.client.plugins.gauntlet;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Provides;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.sanlite.client.game.SoundManager;
import net.sanlite.client.plugins.gauntlet.event.BossAttackStyleSwitched;
import net.sanlite.client.plugins.gauntlet.event.DemiBossSpawned;
import net.sanlite.client.plugins.gauntlet.event.GauntletEvent;
import net.sanlite.client.plugins.gauntlet.id.GauntletBossId;
import net.sanlite.client.plugins.gauntlet.id.GauntletId;
import net.sanlite.client.plugins.gauntlet.id.GauntletNpc;
import net.sanlite.client.util.SoundUtil;

import javax.inject.Inject;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.Map.entry;
import static net.runelite.api.ObjectID.*;
import static net.runelite.api.Varbits.*;

@Slf4j
@PluginDescriptor(
		name = "The Gauntlet",
		description = "Assists with The Gauntlet minigame",
		tags = {"combat", "overlay", "pve", "pvm", "gauntlet", "crystal", "hunllef", "custom", "minigame", "sanlite"},
		enabledByDefault = false
)
public class GauntletPlugin extends Plugin
{
	private final Clip magicAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "magic.wav");
	private final Clip rangedAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "ranged.wav");
	private final Clip crystalAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "crystal.wav");
	private final Clip prayerDisabledAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "prayer_disabled.wav");
	private final Clip overheadSwitchAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "switch_weapon.wav");
	private final Clip playerDeathAudioClip = SoundUtil.getResourceStreamFromClass(getClass(), "player_death.wav");
	private final Set<String> hiddenDeadNpcNames = ImmutableSet.of(
			"Crystalline rat",
			"Crystalline spider",
			"Crystalline bat",
			"Crystalline unicorn",
			"Crystalline scorpion",
			"Crystalline wolf",
			"Crystalline bear",
			"Crystalline dragon",
			"Crystalline dark beast",
			"Corrupted rat",
			"Corrupted spider",
			"Corrupted bat",
			"Corrupted unicorn",
			"Corrupted scorpion",
			"Corrupted wolf",
			"Corrupted bear",
			"Corrupted dragon",
			"Corrupted dark beast"
	);

	private final Set<Integer> bigTreeGameObjects = ImmutableSet.of(
			NullObjectID.NULL_36100,
			NullObjectID.NULL_35997
	);

	private final Set<Integer> gauntletWallObjects = ImmutableSet.of(
			NullObjectID.NULL_35995,
			NullObjectID.NULL_35996,
			ILLUMINATED_SYMBOL,
			INACTIVE_SYMBOL,
			ILLUMINATED_SYMBOL_36095,
			INACTIVE_SYMBOL_36097,
			NullObjectID.NULL_36098,
			NullObjectID.NULL_36099,
			NullObjectID.NULL_36103,
			NullObjectID.NULL_36104
	);

	private Map<GauntletResourceSpot, Boolean> resourceSpotEnabledConfigs;
	private Map<GauntletResourceSpot, Color> resourceSpotColorConfigs;

	@Inject
	private Client client;

	@Inject
	private GauntletConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private GauntletOverlay overlay;

	@Inject
	private GauntletBossOverlay bossOverlay;

	@Inject
	private GauntletProtectedStyleOverlay protectedStyleOverlay;

	@Inject
	private GauntletResourceSpotOverlay resourceSpotOverlay;

	@Inject
	private GauntletResourceSpotMinimapOverlay resourceSpotMinimapOverlay;

	@Inject
	private GauntletDebugOverlay debugOverlay;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ScheduledExecutorService scheduledExecutorService;

	@Inject
	private SoundManager soundManager;

	@Getter
	private Gauntlet gauntlet;

	private NPC cachedBossNpc;

	@Provides
	GauntletConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GauntletConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		resourceSpotEnabledConfigs = Map.ofEntries(
				entry(GauntletResourceSpot.PADDLEFISH, config.showPaddlefishSpots()),
				entry(GauntletResourceSpot.CRYSTAL_DEPOSIT, config.showCrystalDeposits()),
				entry(GauntletResourceSpot.GRYM_ROOT, config.showGrymRoots()),
				entry(GauntletResourceSpot.PHREN_ROOTS, config.showPhrenRoots()),
				entry(GauntletResourceSpot.LINUM_TIRINUM, config.showLinumTirinum())
		);

		resourceSpotColorConfigs = Map.ofEntries(
				entry(GauntletResourceSpot.PADDLEFISH, config.getPaddlefishSpotColor()),
				entry(GauntletResourceSpot.CRYSTAL_DEPOSIT, config.getCrystalDepositColor()),
				entry(GauntletResourceSpot.GRYM_ROOT, config.getGrymRootColor()),
				entry(GauntletResourceSpot.PHREN_ROOTS, config.getPhrenRootsColor()),
				entry(GauntletResourceSpot.LINUM_TIRINUM, config.getLinumTirinumColor())
		);

		overlayManager.add(overlay);
		overlayManager.add(bossOverlay);
		overlayManager.add(protectedStyleOverlay);
		overlayManager.add(resourceSpotOverlay);
		overlayManager.add(resourceSpotMinimapOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.add(debugOverlay);
		}

		clientThread.invoke(this::reset);
	}

	@Override
	protected void shutDown() throws Exception
	{
		clientThread.invoke(this::reset);
		overlayManager.remove(overlay);
		overlayManager.remove(bossOverlay);
		overlayManager.remove(protectedStyleOverlay);
		overlayManager.remove(resourceSpotOverlay);
		overlayManager.remove(resourceSpotMinimapOverlay);
		if (config.showDebugOverlay())
		{
			overlayManager.remove(debugOverlay);
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals(GauntletConfig.GROUP))
		{
			return;
		}

		for (GauntletResourceSpot resourceSpot : GauntletResourceSpot.values())
		{
			if (!resourceSpotEnabledConfigs.get(resourceSpot))
			{
				gauntlet.resourceSpotDisabled(resourceSpot);
			}
		}

		switch (event.getKey())
		{
			case "hideNpcDeathAnimations":
				if (config.hideNpcDeathAnimations())
				{
					clientThread.invoke(() ->  hiddenDeadNpcNames.forEach(client::addHiddenDeadNpcName));
					break;
				}

				clientThread.invoke(() ->  hiddenDeadNpcNames.forEach(client::removeHiddenDeadNpcName));
				break;
			case "hideBigTreeObjects":
				if (config.hideBigTreeObjects())
				{
					clientThread.invoke(() -> bigTreeGameObjects.forEach((id) -> client.getScene().hideGameObjectId(id)));
					break;
				}

				clientThread.invoke(() -> bigTreeGameObjects.forEach((id) -> client.getScene().unhideGameObjectId(id)));
				break;
			case "hideWallObjects":
				if (config.hideWallObjects())
				{
					clientThread.invoke(() -> gauntletWallObjects.forEach((id) -> client.getScene().hideGameObjectId(id)));
					break;
				}

				clientThread.invoke(() -> gauntletWallObjects.forEach((id) -> client.getScene().unhideGameObjectId(id)));
				break;
			case "showDebugOverlay":
				if (config.showDebugOverlay())
				{
					overlayManager.add(debugOverlay);
					break;
				}

				overlayManager.remove(debugOverlay);
				break;
		}
	}

	private Clip getAudioClipForAttackStyle(GauntletBoss.AttackStyle attackStyle)
	{
		switch (attackStyle)
		{
			case RANGED:
				return rangedAudioClip;
			case MAGIC:
				return magicAudioClip;
			default:
				return null;
		}
	}

	private void reset()
	{
		gauntlet = null;
		cachedBossNpc = null;
		if (config.hideNpcDeathAnimations())
		{
			hiddenDeadNpcNames.forEach(client::removeHiddenDeadNpcName);
		}

		if (config.hideBigTreeObjects())
		{
			bigTreeGameObjects.forEach((id) -> client.getScene().unhideGameObjectId(id));
		}

		if (config.hideWallObjects())
		{
			gauntletWallObjects.forEach((id) -> client.getScene().unhideGameObjectId(id));
		}

		log.debug("Gauntlet session reset");
	}

	private void updateGauntletStatus()
	{
		boolean isGauntletEntered = Gauntlet.isGauntletEntered(client.getVar(GAUNTLET_ENTERED));
		if (gauntlet != null && !isGauntletEntered)
		{
			reset();
		}
		else if (gauntlet == null && isGauntletEntered)
		{
			Player player = client.getLocalPlayer();
			if (player == null)
			{
				return;
			}

			gauntlet = new Gauntlet(player, cachedBossNpc, this::onGauntletEvent);
			cachedBossNpc = null;

			if (config.hideNpcDeathAnimations())
			{
				clientThread.invoke(() -> hiddenDeadNpcNames.forEach(client::addHiddenDeadNpcName));
			}

			if (config.hideBigTreeObjects())
			{
				clientThread.invoke(() -> bigTreeGameObjects.forEach((id) -> client.getScene().hideGameObjectId(id)));
			}

			if (config.hideWallObjects())
			{
				clientThread.invoke(() -> gauntletWallObjects.forEach((id) -> client.getScene().hideGameObjectId(id)));
			}
			log.debug("Gauntlet session started");
		}
	}

	@Subscribe
	protected void onVarbitChanged(VarbitChanged event)
	{
		if (!GauntletId.inGauntletRegion(client.getMapRegions(), client.isInInstancedRegion()))
		{
			return;
		}

		updateGauntletStatus();
		if (gauntlet == null)
		{
			return;
		}

		gauntlet.checkFinalRoomEntered(client.getVar(GAUNTLET_FINAL_ROOM_ENTERED));
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		GameState gameState = event.getGameState();

		// Clear resource spots when a new gauntlet room is loaded
		if (gameState == GameState.LOADING && gauntlet != null)
		{
			gauntlet.newRoomLoading();
		}

		if (gameState == GameState.LOGGING_IN || gameState == GameState.CONNECTION_LOST || gameState == GameState.HOPPING)
		{
			reset();
		}
	}

	@Subscribe
	public void onAnimationChanged(AnimationChanged event)
	{
		if (gauntlet == null)
		{
			return;
		}

		int animationId = event.getActor().getAnimation();
		if (!GauntletId.isGauntletAnimation(animationId))
		{
			return;
		}

		if (!gauntlet.isInBossRoom())
		{
			return;
		}

		gauntlet.onAnimation(event.getActor(), animationId, client.getTickCount());
	}

	@Subscribe
	public void onProjectileSpawned(ProjectileSpawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		int projectileId = event.getProjectile().getId();
		if (!GauntletBossId.isBossProjectile(projectileId))
		{
			return;
		}

		gauntlet.onProjectile(projectileId, client.getTickCount());
	}

	@Subscribe
	public void onNpcSpawned(NpcSpawned event)
	{
		if (gauntlet == null && GauntletBossId.isBossNpc(event.getNpc().getId()))
		{
			cachedBossNpc = event.getNpc();
			log.debug("Cached boss spawn: {}", event.getNpc().getId());
		}

		if (gauntlet == null)
		{
			return;
		}

		NPC npc = event.getNpc();
		if (GauntletBossId.isBossNpc(npc.getId()))
		{
			gauntlet.bossSpawned(npc);
			return;
		}

		if (GauntletNpc.isDemiBoss(npc.getId()))
		{
			gauntlet.demiBossSpawned(npc);
			return;
		}

		if (gauntlet.getBoss() == null)
		{
			return;
		}

		if (GauntletBossId.isCrystalNpc(npc.getId()))
		{
			gauntlet.getBoss().crystalSpawned(npc);
		}
	}

	@Subscribe
	public void onNpcDespawned(NpcDespawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		NPC npc = event.getNpc();
		if (GauntletBossId.isBossNpc(npc.getId()))
		{
			gauntlet.bossDespawned();
			return;
		}

		if (GauntletNpc.isDemiBoss(npc.getId()))
		{
			gauntlet.demiBossDespawned(npc);
			return;
		}

		if (gauntlet.getBoss() == null)
		{
			return;
		}

		if (GauntletBossId.isCrystalNpc(npc.getId()))
		{
			gauntlet.getBoss().crystalDespawned(npc);
		}
	}

	@Subscribe
	public void onGameObjectSpawned(GameObjectSpawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		final GameObject gameObject = event.getGameObject();
		if (gameObject == null || !GauntletResourceSpot.getSPOTS().containsKey(gameObject.getId()))
		{
			return;
		}

		for (GauntletResourceSpot resourceSpot : GauntletResourceSpot.values())
		{
			if (GauntletResourceSpot.isResourceSpot(gameObject.getId(), resourceSpot) && resourceSpotEnabledConfigs.get(resourceSpot))
			{
//				log.debug("Gauntlet resource spot spawned: {}", gameObject.getId());
				gauntlet.resourceSpotSpawned(gameObject, client.getCameraX(), client.getCameraY());
			}
		}

	}

	@Subscribe
	public void onGameObjectDespawned(GameObjectDespawned event)
	{
		if (gauntlet == null)
		{
			return;
		}

		final GameObject gameObject = event.getGameObject();
		if (gameObject == null || !GauntletResourceSpot.getSPOTS().containsKey(gameObject.getId()))
		{
			return;
		}

//		log.debug("Gauntlet resource spot despawned: {}", gameObject.getId());
		gauntlet.resourceSpotDespawned(gameObject);
	}

	@Subscribe
	public void onHitsplatApplied(HitsplatApplied event)
	{
		if (gauntlet == null || gauntlet.getBoss() == null)
		{
			return;
		}

		final Actor actor = event.getActor();
		if (actor instanceof NPC && GauntletBossId.isBossNpc(((NPC) actor).getId()))
		{
			log.debug("Hitsplat applied on gauntlet boss at tick: {}", client.getTickCount());
			gauntlet.getBoss().checkProtectionPrayer(client.getTickCount());
		}
	}

	// TODO: use colors config map
	Color getResourceSpotColor(int gameObjectId)
	{
		switch (gameObjectId)
		{
			case FISHING_SPOT_36068:
			case FISHING_SPOT_35971:
				return config.getPaddlefishSpotColor();
			case CRYSTAL_DEPOSIT:
			case CORRUPT_DEPOSIT:
				return config.getCrystalDepositColor();
			case GRYM_ROOT_36070:
			case GRYM_ROOT:
				return config.getGrymRootColor();
			case PHREN_ROOTS_36066:
			case PHREN_ROOTS:
				return config.getPhrenRootsColor();
			case LINUM_TIRINUM_36072:
			case LINUM_TIRINUM:
				return config.getLinumTirinumColor();
			default:
				log.warn("Unknown gauntlet resource spot with id {}", gameObjectId);
				return Color.GRAY;
		}
	}

	/**
	 * Handles events emitted in the gauntlet
	 *
	 * @param event gauntlet event
	 */
	private void onGauntletEvent(GauntletEvent event)
	{
		switch (event.getType())
		{
			case ATTACK_STYLE_SWITCHED:
				GauntletBoss.AttackStyle newAttackStyle = ((BossAttackStyleSwitched) event).getNewAttackStyle();
				playSoundIfEnabled(getAudioClipForAttackStyle(newAttackStyle), config.playSoundOnAttackStyleSwitch());
				break;
			case PROTECTION_PRAYER_SWITCHED:
				playSoundIfEnabled(overheadSwitchAudioClip, config.playSoundOnOverheadSwitch());
				break;
			case CRYSTAL_ATTACK:
				playSoundIfEnabled(crystalAudioClip, config.playSoundOnCrystalAttack());
				break;
			case PLAYER_PRAYER_DISABLED:
				playSoundIfEnabled(prayerDisabledAudioClip, config.playSoundOnDisablePrayerAttack());
				break;
			case PLAYER_DEATH:
				playSoundIfEnabled(playerDeathAudioClip, config.playSoundOnPlayerDeath());
				break;
			case DEMI_BOSS_SPAWNED:
				NPC demiBoss = ((DemiBossSpawned) event).getNpc();
				if (isHighlightEnabledForDemiBoss(demiBoss.getId()))
				{
					client.setHintArrow(demiBoss.getWorldLocation());
				}
				break;
			default:
				log.warn("Unknown gauntlet event: {}", event.getType());
		}
	}

	boolean isHighlightEnabledForDemiBoss(int npcId)
	{
		return (GauntletNpc.isMeleeDemiBoss(npcId) && config.highlightBearDemiBoss()) ||
				(GauntletNpc.isRangedDemiBoss(npcId) && config.highlightDarkBeastDemiBoss()) ||
				(GauntletNpc.isMagicDemiBoss(npcId) && config.highlightDragonDemiBoss());
	}

	private void playSoundIfEnabled(Clip soundClip, boolean isConfigEnabled)
	{
		if (!isConfigEnabled)
		{
			return;
		}

		scheduledExecutorService.submit(() -> soundManager.playCustomSound(soundClip));
	}
}
