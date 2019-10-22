package net.runelite.client.plugins.spelleffecttimers;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Actor;
import net.runelite.api.Constants;

@Slf4j
class SpellEffectInfo
{
	@Getter(AccessLevel.PACKAGE)
	private final Actor actor;

	@Getter(AccessLevel.PACKAGE)
	private final SpellEffect spellEffect;

	@Getter(AccessLevel.PACKAGE)
	private final int initialHitClientTick;

	@Getter(AccessLevel.PACKAGE)
	private final int expireClientTick;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private int remainingClientTicks;

	@Getter(AccessLevel.PACKAGE)
	@Setter(AccessLevel.PACKAGE)
	private int remainingTime;

	@Getter(AccessLevel.PACKAGE)
	private final boolean halved;

	SpellEffectInfo(Actor actor, SpellEffect spellEffect, int initialHitClientTick, boolean halved)
	{
		this.actor = actor;
		this.spellEffect = spellEffect;
		this.initialHitClientTick = initialHitClientTick;
		this.halved = halved;
		if (this.halved)
		{
			this.expireClientTick = initialHitClientTick + ((spellEffect.getSpellLength() / 2) / Constants.CLIENT_TICK_LENGTH);
		}
		else
		{
			this.expireClientTick = initialHitClientTick + (spellEffect.getSpellLength() / Constants.CLIENT_TICK_LENGTH);
		}
		this.remainingClientTicks = expireClientTick - initialHitClientTick;
		this.remainingTime = remainingClientTicks / 5;
		log.debug("Expire game tick: {}", expireClientTick);
	}
}
