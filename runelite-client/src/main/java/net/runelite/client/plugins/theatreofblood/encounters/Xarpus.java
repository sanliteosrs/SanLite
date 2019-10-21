/*
 * Copyright (c) 2019, Siraz
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
package net.runelite.client.plugins.theatreofblood.encounters;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.GraphicID;
import net.runelite.api.GraphicsObject;
import net.runelite.api.GroundObject;
import net.runelite.api.ObjectID;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Xarpus extends TheatreOfBloodEncounter
{
	@Getter
	@Setter
	private List<GroundObject> groundObjects;

	public Xarpus(TheatreOfBloodEncounters encounter)
	{
		super(encounter);
		groundObjects = new ArrayList<>();
	}

	public boolean isPoisonAttackLanding(int graphicsObjectId)
	{
		return graphicsObjectId == GraphicID.XARPUS_POISON_SPLAT_ON_LANDING;
	}

	public boolean isHealingPoolTileObject(int objectId)
	{
		return objectId == ObjectID.EXHUMED;
	}

	public boolean isPoisonTileObject(int objectId)
	{
		return objectId == ObjectID.ACIDIC_MIASMA;
	}

	public void checkXarpusTileObjects(List<GroundObject> clientGroundObjects)
	{
		setGroundObjects(
				clientGroundObjects.stream()
						.filter(x -> isPoisonTileObject(x.getId()) || isHealingPoolTileObject(x.getId()))
						.collect(Collectors.toList()));
	}

	public void checkPoisonAttackLandingGraphicObjects(List<GraphicsObject> clientGraphicObjects)
	{
		setAoeEffects(
				clientGraphicObjects.stream()
						.filter(x -> isPoisonAttackLanding(x.getId()))
						.collect(Collectors.toList()));
	}
}
