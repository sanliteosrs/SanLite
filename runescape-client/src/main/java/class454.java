import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
public class class454 {
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class157.method3347(); // L: 13102
		SpriteMask var4 = var0.method6943(ModeWhere.field4649, false); // L: 13103
		if (var4 != null) { // L: 13104
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 13105
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 13106
				int var5 = Client.camAngleY & 2047; // L: 13107
				int var6 = 48 + StudioGame.field4084.vmethod8670() / 32; // L: 13108
				int var7 = 464 - StudioGame.field4084.vmethod8671() / 32; // L: 13109
				class196.field2057.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 13110

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.field512; ++var8) { // L: 13111
					var16 = Client.field749[var8] * 4 + 2 - StudioGame.field4084.vmethod8670() / 32; // L: 13112
					var10 = Client.field750[var8] * 4 + 2 - StudioGame.field4084.vmethod8671() / 32; // L: 13113
					Archive.drawSpriteOnMinimap(var1, var2, var16, var10, Client.field554[var8], var4); // L: 13114
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 13116
					for (var16 = 0; var16 < 104; ++var16) { // L: 13117
						NodeDeque var14 = class511.field5137.field1334[class511.field5137.field1318][var8][var16]; // L: 13118
						if (var14 != null) { // L: 13119
							var11 = var8 * 4 + 2 - StudioGame.field4084.vmethod8670() / 32; // L: 13120
							var12 = var16 * 4 + 2 - StudioGame.field4084.vmethod8671() / 32; // L: 13121
							Archive.drawSpriteOnMinimap(var1, var2, var11, var12, class446.field4821[0], var4); // L: 13122
						}
					}
				}

				for (var8 = 0; var8 < class511.field5137.field1329; ++var8) { // L: 13126
					class103 var9 = class511.field5137.field1315[class511.field5137.field1330[var8]]; // L: 13127
					if (var9 != null && var9.isVisible()) { // L: 13128
						NPCComposition var18 = var9.field1347; // L: 13129
						if (var18 != null && var18.transforms != null) { // L: 13130
							var18 = var18.transform();
						}

						if (var18 != null && var18.field2024 && var18.field2021) { // L: 13131
							var11 = var9.x / 32 - StudioGame.field4084.vmethod8670() / 32; // L: 13132
							var12 = var9.field1191 / 32 - StudioGame.field4084.vmethod8671() / 32; // L: 13133
							Archive.drawSpriteOnMinimap(var1, var2, var11, var12, class446.field4821[1], var4); // L: 13134
						}
					}
				}

				var8 = class511.field5137.field1319.field1404; // L: 13138
				int[] var17 = class511.field5137.field1319.field1409; // L: 13139

				for (var10 = 0; var10 < var8; ++var10) { // L: 13140
					Player var15 = class511.field5137.field1326[var17[var10]]; // L: 13141
					if (var15 != null && var15.isVisible() && !var15.field1138 && var15 != SoundCache.localPlayer) { // L: 13142
						var12 = var15.x / 32 - StudioGame.field4084.vmethod8670() / 32; // L: 13143
						int var13 = var15.field1191 / 32 - StudioGame.field4084.vmethod8671() / 32; // L: 13144
						if (var15.method2405()) { // L: 13145
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[3], var4);
						} else if (SoundCache.localPlayer.field1143 != 0 && var15.field1143 != 0 && var15.field1143 == SoundCache.localPlayer.field1143) { // L: 13146
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[4], var4);
						} else if (var15.method2408()) { // L: 13147
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[5], var4);
						} else if (var15.method2413()) { // L: 13148
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[6], var4);
						} else {
							Archive.drawSpriteOnMinimap(var1, var2, var12, var13, class446.field4821[2], var4); // L: 13149
						}
					}
				}

				if (Client.field524 != 0 && Client.cycle % 20 < 10) { // L: 13152
					if (Client.field524 == 1 && Client.field794 >= 0 && Client.field794 < class511.field5137.field1315.length) { // L: 13153
						class103 var19 = class511.field5137.field1315[Client.field794]; // L: 13154
						if (var19 != null) { // L: 13155
							var11 = var19.x / 32 - StudioGame.field4084.vmethod8670() / 32; // L: 13156
							var12 = var19.field1191 / 32 - StudioGame.field4084.vmethod8671() / 32; // L: 13157
							class14.worldToMinimap(var1, var2, var11, var12, class25.field118[1], var4); // L: 13158
						}
					}

					if (Client.field524 == 2) { // L: 13161
						var10 = Client.field527 * 4 - class511.field5137.field1321 * 4 + 2 - StudioGame.field4084.vmethod8670() / 32; // L: 13162
						var11 = Client.field787 * 4 - class511.field5137.field1323 * 4 + 2 - StudioGame.field4084.vmethod8671() / 32; // L: 13163
						class14.worldToMinimap(var1, var2, var10, var11, class25.field118[1], var4); // L: 13164
					}

					if (Client.field524 == 10 && Client.field526 >= 0 && Client.field526 < class511.field5137.field1326.length) { // L: 13166
						Player var20 = class511.field5137.field1326[Client.field526]; // L: 13167
						if (var20 != null) { // L: 13168
							var11 = var20.x / 32 - StudioGame.field4084.vmethod8670() / 32; // L: 13169
							var12 = var20.field1191 / 32 - StudioGame.field4084.vmethod8671() / 32; // L: 13170
							class14.worldToMinimap(var1, var2, var11, var12, class25.field118[1], var4); // L: 13171
						}
					}
				}

				if (Client.field752 != 0) { // L: 13175
					var10 = Client.field752 * 4 + 2 - StudioGame.field4084.vmethod8670() / 32; // L: 13176
					var11 = Client.field753 * 4 + 2 - StudioGame.field4084.vmethod8671() / 32; // L: 13177
					Archive.drawSpriteOnMinimap(var1, var2, var10, var11, class25.field118[0], var4); // L: 13178
				}

				if (!SoundCache.localPlayer.field1138) { // L: 13180
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 13182
			}

			Client.field722[var3] = true; // L: 13183
		}
	} // L: 13184
}
