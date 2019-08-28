package net.runelite.client.plugins.theatreofblood;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.client.plugins.theatreofblood.encounters.*;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.*;

@Slf4j
public class TheatreOfBloodOverlay extends Overlay
{

	private Client client;
	private TheatreOfBloodPlugin plugin;

	@Inject
	private TheatreOfBloodConfig config;

	@Inject
	public TheatreOfBloodOverlay(Client client, TheatreOfBloodPlugin plugin)
	{
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_SCENE);
		this.client = client;
		this.plugin = plugin;
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		TheatreOfBloodEncounter encounter = plugin.getCurrentEncounter();
		if (encounter != null && encounter.isStarted() && encounter.getNpc() != null)
		{
			if (config.highlightBloodSplatAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.SUGADINTI_MAIDEN)
			{
				renderMaidenBloodSplatAoeEffects(graphics, (SugadintiMaiden) encounter);
			}

			if (config.highlightBloodSpawnTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.SUGADINTI_MAIDEN)
			{
				renderMaidenBloodSpawnAoeEffects(graphics, (SugadintiMaiden) encounter);
			}

			if (config.highlightBloatHandAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.PESTILENT_BLOAT)
			{
				renderBloatHandAoeEffects(graphics, (PestilentBloat) encounter);
			}

			if (config.highlightXarpusPoisonAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
			{
				renderXarpusPoisonAttackLandingAoeEffects(graphics, (Xarpus) encounter);
			}

			if (config.highlightXarpusPoisonAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
			{
				renderXarpusPoisonTileObjects(graphics, (Xarpus) encounter);
			}

			if (config.highlightXarpusHealingPoolTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.XARPUS)
			{
				renderXarpusHealingPoolTileObjects(graphics, (Xarpus) encounter);
			}

			if (config.highlightVerzikSkullAttackTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.VERZIK)
			{
				renderVerzikSkullAoeEffects(graphics, (Verzik) encounter);
			}

			if (config.highlightVerzikGreenOrbPoolTiles() && encounter.getEncounter() == TheatreOfBloodEncounters.VERZIK)
			{
				renderVerzikGreenOrbPoolAoeEffects(graphics, (Verzik) encounter);
			}
		}
		return null;
	}

	private void renderMaidenBloodSplatAoeEffects(Graphics2D graphics, SugadintiMaiden sugadintiMaiden)
	{
		for (GraphicsObject graphicsObject : sugadintiMaiden.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (sugadintiMaiden.isBloodSplatAttack(graphicsObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getBloodSplatAttackColor());
				}
			}
		}
	}

	private void renderMaidenBloodSpawnAoeEffects(Graphics2D graphics, SugadintiMaiden sugadintiMaiden)
	{
		for (GameObject gameObject : sugadintiMaiden.getGameObjects())
		{
			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (sugadintiMaiden.isBloodSpawnBloodTile(gameObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getBloodSpawnBloodColor());
				}
			}
		}
	}

	private void renderBloatHandAoeEffects(Graphics2D graphics, PestilentBloat pestilentBloat)
	{
		for (GraphicsObject graphicsObject : pestilentBloat.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (pestilentBloat.isHandAttack(graphicsObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getBloatHandAttackColor());
				}
			}
		}
	}

	private void renderXarpusPoisonAttackLandingAoeEffects(Graphics2D graphics, Xarpus xarpus)
	{
		for (GraphicsObject graphicsObject : xarpus.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (xarpus.isPoisonAttackLanding(graphicsObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getXarpusPoisonAttackColor());
				}
			}
		}
	}

	private void renderXarpusPoisonTileObjects(Graphics2D graphics, Xarpus xarpus)
	{
		for (GameObject gameObject : xarpus.getGameObjects())
		{
			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (xarpus.isPoisonTileObject(gameObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getXarpusPoisonAttackColor());
				}
			}
		}
	}

	private void renderXarpusHealingPoolTileObjects(Graphics2D graphics, Xarpus xarpus)
	{
		for (GameObject gameObject : xarpus.getGameObjects())
		{
			LocalPoint localPoint = gameObject.getLocalLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (xarpus.isHealingPoolTileObject(gameObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getXarpusHealingPoolColor());
				}
			}
		}
	}

	private void renderVerzikSkullAoeEffects(Graphics2D graphics, Verzik verzik)
	{
		for (GraphicsObject graphicsObject : verzik.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (verzik.isSkullAttack(graphicsObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getVerzikSkullAttackColor());
				}
			}
		}
	}

	private void renderVerzikGreenOrbPoolAoeEffects(Graphics2D graphics, Verzik verzik)
	{
		for (GraphicsObject graphicsObject : verzik.getAoeEffects())
		{
			LocalPoint localPoint = graphicsObject.getLocation();
			Polygon polygon = Perspective.getCanvasTilePoly(client, localPoint);

			if (polygon != null)
			{
				if (verzik.isGreenOrbPool(graphicsObject.getId()))
				{
					OverlayUtil.renderPolygon(graphics, polygon, config.getVerzikGreenOrbPoolColor());
				}
			}
		}
	}
}