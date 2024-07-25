import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2728;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 502415749
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1809402251
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1715220047
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1345453013
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 407425227
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1317582751
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "1568670940"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 18
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 19
		}

		if (var1.regionLowY > this.regionEndY) { // L: 20
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 21
			var1.regionHighY = this.regionEndY;
		}

	} // L: 22

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "115"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-898385408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 34
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-35"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lnl;",
		garbageValue = "-55064754"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null; // L: 51
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 53
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2; // L: 54
			return new Coord(this.minPlane, var3, var4); // L: 55
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "301668137"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 60
		this.planes = var1.readUnsignedByte(); // L: 61
		this.regionStartX = var1.readUnsignedShort(); // L: 62
		this.regionStartY = var1.readUnsignedShort(); // L: 63
		this.regionEndX = var1.readUnsignedShort(); // L: 64
		this.regionEndY = var1.readUnsignedShort(); // L: 65
		this.postRead(); // L: 66
	} // L: 67

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26437"
	)
	@Export("postRead")
	void postRead() {
	} // L: 69

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lde;Lvp;IIIIIII)V",
		garbageValue = "-1270068304"
	)
	static final void method5043(class101 var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.field1327; // L: 175
		byte[][][] var9 = var0.field1325; // L: 176
		int var10;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) { // L: 177
			var9[var2][var3][var4] = 0; // L: 178

			while (true) {
				var10 = var1.readUnsignedShort(); // L: 180
				if (var10 == 0) { // L: 181
					if (var2 == 0) { // L: 182
						var8[0][var3][var4] = -class177.method3567(var5 + 932731, 556238 + var6) * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240; // L: 183
					}
					break;
				}

				if (var10 == 1) { // L: 186
					int var11 = var1.readUnsignedByte(); // L: 187
					if (var11 == 1) { // L: 188
						var11 = 0;
					}

					if (var2 == 0) { // L: 189
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8; // L: 190
					}
					break;
				}

				if (var10 <= 49) { // L: 193
					class83.field1034[var2][var3][var4] = (short)var1.readShort(); // L: 194
					class83.field1035[var2][var3][var4] = (byte)((var10 - 2) / 4); // L: 195
					class356.field3810[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3); // L: 196
				} else if (var10 <= 81) { // L: 199
					var9[var2][var3][var4] = (byte)(var10 - 49); // L: 200
				} else {
					class83.field1033[var2][var3][var4] = (short)(var10 - 81); // L: 203
				}
			}
		} else {
			while (true) {
				var10 = var1.readUnsignedShort(); // L: 208
				if (var10 == 0) { // L: 209
					break;
				}

				if (var10 == 1) { // L: 210
					var1.readUnsignedByte(); // L: 211
					break;
				}

				if (var10 <= 49) { // L: 214
					var1.readShort(); // L: 215
				}
			}
		}

	} // L: 219

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "-9"
	)
	static final void method5042(class101 var0) {
		for (Projectile var1 = (Projectile)var0.field1324.last(); var1 != null; var1 = (Projectile)var0.field1324.previous()) { // L: 5389 5390 5428
			if (var0.field1318 == var1.plane && Client.cycle <= var1.cycleEnd) { // L: 5391
				if (Client.cycle >= var1.cycleStart) { // L: 5392
					class103 var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field975 != 0) { // L: 5393
						if (var1.field975 > 0) { // L: 5394
							var2 = class20.field91.field1315[var1.field975 - 1]; // L: 5395
							if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.field1191 && var2.field1191 < 13312) { // L: 5396
								var1.sourceX = var2.x; // L: 5397
								var1.sourceY = var2.field1191; // L: 5398
								var1.setDestination(var1.field968, var1.field985, var1.field970, Client.cycle); // L: 5399
							}
						} else {
							var3 = -var1.field975 - 1; // L: 5404
							if (var3 == Client.field706) { // L: 5405
								var4 = SoundCache.localPlayer;
							} else {
								var4 = class20.field91.field1326[var3]; // L: 5406
							}

							if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.field1191 && var4.field1191 < 13312) { // L: 5407
								var1.sourceX = var4.x; // L: 5408
								var1.sourceY = var4.field1191; // L: 5409
								var1.setDestination(var1.field968, var1.field985, var1.field970, Client.cycle); // L: 5410
							}
						}
					}

					if (var1.targetIndex > 0) { // L: 5414
						var2 = var0.field1315[var1.targetIndex - 1]; // L: 5415
						if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.field1191 && var2.field1191 < 13312) { // L: 5416
							var1.setDestination(var2.x, var2.field1191, class169.method3519(var0, var2.x, var2.field1191, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) { // L: 5418
						var3 = -var1.targetIndex - 1; // L: 5420
						if (var3 == Client.field706) { // L: 5421
							var4 = SoundCache.localPlayer;
						} else {
							var4 = var0.field1326[var3]; // L: 5422
						}

						if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.field1191 && var4.field1191 < 13312) {
							var1.setDestination(var4.x, var4.field1191, class169.method3519(var0, var4.x, var4.field1191, var1.plane) - var1.endHeight, Client.cycle); // L: 5423
						}
					}

					var1.advance(Client.field805); // L: 5425
					var0.field1316.method5425(var0.field1318, (int)var1.x, (int)var1.y, (int)var1.z, 60, var1, var1.yaw, -1L, false); // L: 5426
				}
			} else {
				var1.remove();
			}
		}

	} // L: 5430
}
