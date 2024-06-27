import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class169 extends class147 {
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 139559131
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -7094035019809500935L
	)
	long field1833;
	@ObfuscatedName("ad")
	String field1830;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class169(class150 var1) {
		this.this$0 = var1;
		this.field1833 = -1L; // L: 194
		this.field1830 = null; // L: 195
	} // L: 197

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1833 = var1.readLong(); // L: 202
		}

		this.field1830 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3358(this.field1833, this.field1830); // L: 208
	} // L: 209

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2086937635"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4989
		class511.field5137.field1316.field2966 = Client.cycle; // L: 4990
		if (SoundCache.localPlayer.x >> 7 == Client.field752 && SoundCache.localPlayer.field1191 >> 7 == Client.field753) { // L: 4992
			Client.field752 = 0; // L: 4993
		}

		class101 var4 = class511.field5137; // L: 4996
		if (Client.field551) { // L: 4998
			class341.method6437(var4, Client.field706, false); // L: 4999
		}

		class101 var5 = class511.field5137; // L: 5002
		if (Client.combatTargetPlayerIndex >= 0 && var5.field1326[Client.combatTargetPlayerIndex] != null) { // L: 5004
			class341.method6437(var5, Client.combatTargetPlayerIndex, false); // L: 5005
		}

		class238.method4510(class511.field5137, true); // L: 5008
		class101 var6 = class511.field5137; // L: 5009
		int var7 = var6.field1319.field1404; // L: 5011
		int[] var8 = var6.field1319.field1409; // L: 5012

		int var9;
		for (var9 = 0; var9 < var7; ++var9) { // L: 5013
			if (var8[var9] != Client.combatTargetPlayerIndex && var8[var9] != Client.field706) { // L: 5014
				class341.method6437(var6, var8[var9], true); // L: 5015
			}
		}

		class238.method4510(class511.field5137, false); // L: 5018
		class101 var30 = class511.field5137; // L: 5019

		int var12;
		for (int var31 = 0; var31 < var30.field1322; ++var31) { // L: 5021
			class476 var32 = var30.field1331[var30.field1333[var31]]; // L: 5022
			if (var32 != null) { // L: 5023
				var32.field4973 = method3519(var30, var32.field4967, var32.field4969, var30.field1318); // L: 5024
				var32.field4971.field1316.field2966 = Client.cycle; // L: 5025
				var32.method8669(); // L: 5026
				var30.field1316.method5425(var30.field1318, var32.field4967, var32.field4969, var32.field4973, 60, var32.field4971.field1316, var32.field4970, 0L, false); // L: 5027
				ClanChannel.method3505(var32.field4971); // L: 5028
				class101 var35 = var32.field4971; // L: 5029
				if (Client.combatTargetPlayerIndex >= 0 && var35.field1326[Client.combatTargetPlayerIndex] != null) { // L: 5031
					class341.method6437(var35, Client.combatTargetPlayerIndex, false); // L: 5032
				}

				class238.method4510(var32.field4971, true); // L: 5035
				class101 var36 = var32.field4971; // L: 5036
				var12 = var36.field1319.field1404; // L: 5038
				int[] var37 = var36.field1319.field1409; // L: 5039

				for (int var14 = 0; var14 < var12; ++var14) { // L: 5040
					if (var37[var14] != Client.combatTargetPlayerIndex && var37[var14] != Client.field706) { // L: 5041
						class341.method6437(var36, var37[var14], true); // L: 5042
					}
				}

				class238.method4510(var32.field4971, false); // L: 5045
				WorldMapSection1.method5042(var32.field4971); // L: 5046
				class101 var38 = var32.field4971; // L: 5047

				for (GraphicsObject var41 = (GraphicsObject)var38.field1337.last(); var41 != null; var41 = (GraphicsObject)var38.field1337.previous()) { // L: 5049 5050 5057
					if (var38.field1318 == var41.plane && !var41.isFinished) { // L: 5051
						if (Client.cycle >= var41.cycleStart) { // L: 5052
							var41.advance(Client.field805); // L: 5053
							if (var41.isFinished) { // L: 5054
								var41.remove();
							} else {
								var38.field1316.method5425(var41.plane, var41.x, var41.y, var41.z, 60, var41, 0, -1L, false); // L: 5055
							}
						}
					} else {
						var41.remove();
					}
				}
			}
		}

		WorldMapSection1.method5042(class511.field5137); // L: 5063
		class101 var39 = class511.field5137; // L: 5064

		for (GraphicsObject var40 = (GraphicsObject)var39.field1337.last(); var40 != null; var40 = (GraphicsObject)var39.field1337.previous()) { // L: 5066 5067 5074
			if (var40.plane == var39.field1318 && !var40.isFinished) { // L: 5068
				if (Client.cycle >= var40.cycleStart) { // L: 5069
					var40.advance(Client.field805); // L: 5070
					if (var40.isFinished) { // L: 5071
						var40.remove();
					} else {
						var39.field1316.method5425(var40.plane, var40.x, var40.y, var40.z, 60, var40, 0, -1L, false); // L: 5072
					}
				}
			} else {
				var40.remove();
			}
		}

		PacketWriter.setViewportShape(var0, var1, var2, var3, true); // L: 5077
		var0 = Client.viewportOffsetX; // L: 5078
		var1 = Client.viewportOffsetY; // L: 5079
		var2 = Client.viewportWidth; // L: 5080
		var3 = Client.viewportHeight; // L: 5081
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5082
		Rasterizer3D.method5302(); // L: 5083
		Rasterizer2D.method9906(); // L: 5084
		var9 = Client.camAngleX; // L: 5085
		if (Client.field605 / 256 > var9) { // L: 5086
			var9 = Client.field605 / 256;
		}

		if (Client.field771[4] && Client.field664[4] + 128 > var9) { // L: 5087
			var9 = Client.field664[4] + 128;
		}

		int var10 = Client.camAngleY & 2047; // L: 5088
		int var11 = class371.field4064; // L: 5089
		var12 = class301.field3215; // L: 5090
		int var13 = PacketBufferNode.field3398; // L: 5091
		int var16 = var9 * 3 + 600; // L: 5096
		Canvas.method323(var11, var12, var13, var9, var10, var16, var3); // L: 5098
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		int var25;
		int var26;
		int var27;
		int var28;
		if (!Client.isCameraLocked) { // L: 5100
			if (class105.clientPreferences.method2664()) { // L: 5103
				var18 = class511.field5137.field1318; // L: 5104
			} else {
				label485: {
					var19 = 3; // L: 5107
					var20 = StudioGame.field4084.vmethod8670() >> 7; // L: 5108
					var21 = StudioGame.field4084.vmethod8671() >> 7; // L: 5109
					if (Language.cameraPitch < 310) { // L: 5110
						if (Client.oculusOrbState == 1) { // L: 5113
							var22 = class371.field4064 >> 7; // L: 5114
							var23 = PacketBufferNode.field3398 >> 7; // L: 5115
						} else {
							var22 = var20; // L: 5118
							var23 = var21; // L: 5119
						}

						var24 = class47.cameraX >> 7; // L: 5121
						var25 = class60.cameraZ >> 7; // L: 5122
						if (var24 < 0 || 104 <= var24 || var25 < 0 || 104 <= var25) { // L: 5123
							var18 = class511.field5137.field1318; // L: 5124
							break label485; // L: 5125
						}

						if (var22 < 0 || 104 <= var22 || var23 < 0 || 104 <= var23) { // L: 5127
							var18 = class511.field5137.field1318; // L: 5128
							break label485; // L: 5129
						}

						if ((class511.field5137.field1325[class511.field5137.field1318][var24][var25] & 4) != 0) { // L: 5131
							var19 = class511.field5137.field1318;
						}

						if (var22 > var24) { // L: 5133
							var26 = var22 - var24;
						} else {
							var26 = var24 - var22; // L: 5134
						}

						if (var23 > var25) { // L: 5136
							var27 = var23 - var25;
						} else {
							var27 = var25 - var23; // L: 5137
						}

						int var29;
						if (var26 > var27) { // L: 5138
							var28 = var27 * 65536 / var26; // L: 5139
							var29 = 32768; // L: 5140

							while (var22 != var24) { // L: 5141
								if (var24 < var22) { // L: 5142
									++var24;
								} else if (var24 > var22) { // L: 5143
									--var24;
								}

								if ((class511.field5137.field1325[class511.field5137.field1318][var24][var25] & 4) != 0) { // L: 5144
									var19 = class511.field5137.field1318;
								}

								var29 += var28; // L: 5145
								if (var29 >= 65536) { // L: 5146
									var29 -= 65536; // L: 5147
									if (var25 < var23) { // L: 5148
										++var25;
									} else if (var25 > var23) { // L: 5149
										--var25;
									}

									if ((class511.field5137.field1325[class511.field5137.field1318][var24][var25] & 4) != 0) { // L: 5150
										var19 = class511.field5137.field1318;
									}
								}
							}
						} else if (var27 > 0) { // L: 5154
							var28 = var26 * 65536 / var27; // L: 5155
							var29 = 32768; // L: 5156

							while (var23 != var25) { // L: 5157
								if (var25 < var23) { // L: 5158
									++var25;
								} else if (var25 > var23) { // L: 5159
									--var25;
								}

								if ((class511.field5137.field1325[class511.field5137.field1318][var24][var25] & 4) != 0) { // L: 5160
									var19 = class511.field5137.field1318;
								}

								var29 += var28; // L: 5161
								if (var29 >= 65536) { // L: 5162
									var29 -= 65536; // L: 5163
									if (var24 < var22) { // L: 5164
										++var24;
									} else if (var24 > var22) { // L: 5165
										--var24;
									}

									if ((class511.field5137.field1325[class511.field5137.field1318][var24][var25] & 4) != 0) { // L: 5166
										var19 = class511.field5137.field1318;
									}
								}
							}
						}
					}

					if (var20 >= 0 && 104 > var20 && var21 >= 0 && 104 > var21) { // L: 5171
						if ((class511.field5137.field1325[class511.field5137.field1318][var20][var21] & 4) != 0) { // L: 5175
							var19 = class511.field5137.field1318;
						}

						var18 = var19; // L: 5176
					} else {
						var18 = class511.field5137.field1318; // L: 5172
					}
				}
			}

			var17 = var18; // L: 5178
		} else {
			if (class105.clientPreferences.method2664()) { // L: 5183
				var18 = class511.field5137.field1318; // L: 5184
			} else {
				var19 = method3519(class511.field5137, class47.cameraX, class60.cameraZ, class511.field5137.field1318); // L: 5187
				if (var19 - class328.cameraY < 800 && (class511.field5137.field1325[class511.field5137.field1318][class47.cameraX >> 7][class60.cameraZ >> 7] & 4) != 0) { // L: 5188
					var18 = class511.field5137.field1318; // L: 5189
				} else {
					var18 = 3; // L: 5192
				}
			}

			var17 = var18; // L: 5194
		}

		var18 = class47.cameraX; // L: 5196
		var19 = class328.cameraY; // L: 5197
		var20 = class60.cameraZ; // L: 5198
		var21 = Language.cameraPitch; // L: 5199
		var22 = class337.cameraYaw; // L: 5200

		for (var23 = 0; var23 < 5; ++var23) { // L: 5201
			if (Client.field771[var23]) { // L: 5202
				var24 = (int)(Math.random() * (double)(Client.field772[var23] * 2 + 1) - (double)Client.field772[var23] + Math.sin((double)Client.field774[var23] / 100.0D * (double)Client.field498[var23]) * (double)Client.field664[var23]); // L: 5203
				if (var23 == 0) { // L: 5204
					class47.cameraX += var24;
				}

				if (var23 == 1) { // L: 5205
					class328.cameraY += var24;
				}

				if (var23 == 2) { // L: 5206
					class60.cameraZ += var24;
				}

				if (var23 == 3) { // L: 5207
					class337.cameraYaw = var24 + class337.cameraYaw & 2047;
				}

				if (var23 == 4) { // L: 5208
					Language.cameraPitch += var24; // L: 5209
					if (Language.cameraPitch < 128) { // L: 5210
						Language.cameraPitch = 128;
					}

					if (Language.cameraPitch > 383) { // L: 5211
						Language.cameraPitch = 383;
					}
				}
			}
		}

		var23 = MouseHandler.MouseHandler_x; // L: 5215
		var24 = MouseHandler.MouseHandler_y; // L: 5216
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 5217
			var23 = MouseHandler.MouseHandler_lastPressedX; // L: 5218
			var24 = MouseHandler.MouseHandler_lastPressedY; // L: 5219
		}

		if (var23 >= var0 && var23 < var0 + var2 && var24 >= var1 && var24 < var3 + var1) { // L: 5221
			var25 = var23 - var0; // L: 5222
			var26 = var24 - var1; // L: 5223
			ViewportMouse.ViewportMouse_x = var25; // L: 5225
			ViewportMouse.ViewportMouse_y = var26; // L: 5226
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 5227
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 5228
			ViewportMouse.ViewportMouse_false0 = false; // L: 5229
		} else {
			class180.method3580(); // L: 5233
		}

		class157.method3347(); // L: 5235
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5236
		class157.method3347(); // L: 5237
		var25 = Rasterizer3D.method5257(); // L: 5238
		Rasterizer3D.method5325(class415.client.field187); // L: 5239
		Rasterizer3D.field2876.field3184 = Client.viewportZoom; // L: 5240
		class511.field5137.field1316.method5505(class47.cameraX, class328.cameraY, class60.cameraZ, Language.cameraPitch, class337.cameraYaw, var17); // L: 5241
		Rasterizer3D.method5325(false); // L: 5242
		if (Client.renderSelf) { // L: 5243
			Rasterizer2D.method9907(); // L: 5244
		}

		Rasterizer3D.field2876.field3184 = var25; // L: 5246
		class157.method3347(); // L: 5247
		class511.field5137.field1316.method5592(); // L: 5248

		class476 var34;
		for (var26 = 0; var26 < class511.field5137.field1322; ++var26) { // L: 5249
			var34 = class511.field5137.field1331[class511.field5137.field1333[var26]]; // L: 5250
			if (var34 != null) { // L: 5251
				var34.field4971.field1316.method5592();
			}
		}

		Nameable.method8567(class511.field5137, var0, var1, var2, var3); // L: 5253

		for (var26 = 0; var26 < class511.field5137.field1322; ++var26) { // L: 5254
			var34 = class511.field5137.field1331[class511.field5137.field1333[var26]]; // L: 5255
			if (var34 != null) { // L: 5256
				Nameable.method8567(var34.field4971, var0, var1, var2, var3); // L: 5257
			}
		}

		class101 var33 = class511.field5137; // L: 5260
		if (Client.field524 == 2) { // L: 5262
			var27 = (Client.field527 - var33.field1321 << 7) + Client.field600 * 4096; // L: 5263
			var28 = (Client.field787 - var33.field1323 << 7) + Client.field531 * 4096; // L: 5264
			class426.drawActor2d(var33, var27, var28, var27, var28, Client.field543 * 4); // L: 5265
			if (Client.field618 > -1 && Client.cycle % 20 < 10) { // L: 5266
				class337.field3665[0].drawTransBgAt(var0 + Client.field618 - 12, Client.field585 + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.field2876.Rasterizer3D_textureLoader).animate(Client.field805); // L: 5268
		class315.method6088(var0, var1, var2, var3); // L: 5269
		class47.cameraX = var18; // L: 5270
		class328.cameraY = var19; // L: 5271
		class60.cameraZ = var20; // L: 5272
		Language.cameraPitch = var21; // L: 5273
		class337.cameraYaw = var22; // L: 5274
		if (Client.field514 && class233.field2486.method7278(true, false) == 0) { // L: 5275
			Client.field514 = false;
		}

		if (Client.field514) { // L: 5276
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 5277
			class59.drawLoadingMessage("Loading - please wait.", false); // L: 5278
		}

	} // L: 5280

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIB)I",
		garbageValue = "-104"
	)
	static final int method3519(class101 var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7; // L: 6060
		int var5 = var2 >> 7; // L: 6061
		if (var4 >= 0 && var5 >= 0 && var4 < var0.field1325[0].length && var5 < var0.field1325[0][0].length) { // L: 6062
			int var6 = var3; // L: 6063
			if (var3 < 3 && (var0.field1325[1][var4][var5] & 2) == 2) { // L: 6064
				var6 = var3 + 1;
			}

			int var7 = var1 & 127; // L: 6065
			int var8 = var2 & 127; // L: 6066
			int var9 = var0.field1327[var6][var4][var5] * (128 - var7) + var0.field1327[var6][var4 + 1][var5] * var7 >> 7; // L: 6067
			int var10 = var0.field1327[var6][var4][var5 + 1] * (128 - var7) + var7 * var0.field1327[var6][var4 + 1][var5 + 1] >> 7; // L: 6068
			return var9 * (128 - var8) + var8 * var10 >> 7; // L: 6069
		} else {
			return 0;
		}
	}
}
