import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class261 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static final class261 field2709;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static final class261 field2705;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	static IndexedSprite[] field2707;
	@ObfuscatedName("an")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 121987833
	)
	@Export("value")
	final int value;

	static {
		field2709 = new class261(0); // L: 4
		field2705 = new class261(1); // L: 5
	}

	class261(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1991501876"
	)
	static int method5006(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class538 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5177
			if (var0 != 7501) { // L: 5199
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5208
					class130.Interpreter_intStackSize -= 3; // L: 5209
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 5210
					var19 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 5211
					var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 5212
					var20 = class162.method3436(var19); // L: 5213
					var7 = class414.method7619(var19); // L: 5214
					int var21 = GrandExchangeEvents.method7311(var19); // L: 5215
					class539 var26 = WorldMapSectionType.method4963(var3); // L: 5216
					class537 var27 = StructComposition.method3873(var20); // L: 5217
					int[] var28 = var27.field5296[var7]; // L: 5218
					int var12 = 0; // L: 5219
					int var13 = var28.length; // L: 5220
					if (var21 >= 0) { // L: 5221
						if (var21 >= var13) { // L: 5222
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5223
						}

						var12 = var21; // L: 5225
						var13 = var21 + 1; // L: 5226
					}

					Object[] var14 = var26.method9461(var7); // L: 5228
					if (var14 == null && var27.field5297 != null) { // L: 5229 5230
						var14 = var27.field5297[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5232
						for (var15 = var12; var15 < var13; ++var15) { // L: 5233
							var16 = var28[var15]; // L: 5234
							class534 var22 = AttackOption.method2792(var16); // L: 5235
							if (var22 == class534.field5286) { // L: 5236
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = BufferedFile.method9360(var16); // L: 5237
							}
						}

						return 1; // L: 5239
					} else {
						var15 = var14.length / var28.length; // L: 5241
						if (var5 >= 0 && var5 < var15) { // L: 5242
							for (var16 = var12; var16 < var13; ++var16) { // L: 5245
								int var17 = var16 + var28.length * var5; // L: 5246
								class534 var18 = AttackOption.method2792(var28[var16]); // L: 5247
								if (var18 == class534.field5286) { // L: 5248
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5249
								}
							}

							return 1; // L: 5251
						} else {
							throw new RuntimeException(); // L: 5243
						}
					}
				} else if (var0 == 7503) { // L: 5253
					class130.Interpreter_intStackSize -= 2; // L: 5254
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 5255
					var19 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 5256
					var5 = 0; // L: 5257
					var20 = class162.method3436(var19); // L: 5258
					var7 = class414.method7619(var19); // L: 5259
					class539 var25 = WorldMapSectionType.method4963(var3); // L: 5260
					class537 var9 = StructComposition.method3873(var20); // L: 5261
					int[] var10 = var9.field5296[var7]; // L: 5262
					Object[] var11 = var25.method9461(var7); // L: 5263
					if (var11 == null && var9.field5297 != null) { // L: 5264 5265
						var11 = var9.field5297[var7]; // L: 5266
					}

					if (var11 != null) { // L: 5269
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5; // L: 5270
					return 1; // L: 5271
				} else if (var0 != 7504 && var0 != 7510) { // L: 5273
					if (var0 == 7505) { // L: 5290
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5291
						class539 var24 = WorldMapSectionType.method4963(var3); // L: 5292
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var24.field5304; // L: 5293
						return 1; // L: 5294
					} else if (var0 == 7506) { // L: 5296
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5297
						var19 = -1; // L: 5298
						if (FloorOverlayDefinition.field2278 != null && var3 >= 0 && var3 < FloorOverlayDefinition.field2278.size()) { // L: 5299
							var19 = (Integer)FloorOverlayDefinition.field2278.get(var3); // L: 5300
						}

						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var19; // L: 5302
						return 1; // L: 5303
					} else if (var0 != 7507 && var0 != 7509) { // L: 5305
						return 2; // L: 5332
					} else {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5306
						var4 = class240.method4522(var3); // L: 5307
						var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5308
						var6 = class379.method7091(var5); // L: 5309
						if (var6 == null) { // L: 5310
							throw new RuntimeException(); // L: 5311
						} else if (class162.method3436(var5) != Client.field798) { // L: 5313
							throw new RuntimeException(); // L: 5314
						} else if (FloorOverlayDefinition.field2278 == null && FloorOverlayDefinition.field2278.isEmpty()) { // L: 5316
							throw new RuntimeException(); // L: 5317
						} else {
							var7 = GrandExchangeEvents.method7311(var5); // L: 5319
							List var8 = var6.method9452(var4, var7); // L: 5320
							FloorOverlayDefinition.field2278 = new LinkedList(FloorOverlayDefinition.field2278); // L: 5321
							if (var8 != null) { // L: 5322
								FloorOverlayDefinition.field2278.retainAll(var8); // L: 5323
							} else {
								FloorOverlayDefinition.field2278.clear(); // L: 5326
							}

							UserComparator4.field1489 = FloorOverlayDefinition.field2278.iterator(); // L: 5328
							if (var0 == 7507) { // L: 5329
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = FloorOverlayDefinition.field2278.size();
							}

							return 1; // L: 5330
						}
					}
				} else {
					--class130.Interpreter_intStackSize; // L: 5274
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 5275
					class538 var23 = InvDefinition.method3556(var3); // L: 5276
					if (var23 == null) { // L: 5277
						throw new RuntimeException(); // L: 5278
					} else {
						FloorOverlayDefinition.field2278 = var23.method9452(0, 0); // L: 5280
						var5 = 0; // L: 5281
						if (FloorOverlayDefinition.field2278 != null) { // L: 5282
							Client.field798 = var3; // L: 5283
							UserComparator4.field1489 = FloorOverlayDefinition.field2278.iterator(); // L: 5284
							var5 = FloorOverlayDefinition.field2278.size(); // L: 5285
						}

						if (var0 == 7504) { // L: 5287
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5288
					}
				}
			} else {
				if (UserComparator4.field1489 != null && UserComparator4.field1489.hasNext()) { // L: 5200
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (Integer)UserComparator4.field1489.next(); // L: 5201
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 5204
				}

				return 1; // L: 5206
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5178
			var4 = class240.method4522(var3); // L: 5179
			var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5180
			var6 = class379.method7091(var5); // L: 5181
			if (var6 == null) { // L: 5182
				throw new RuntimeException(); // L: 5183
			} else {
				var7 = GrandExchangeEvents.method7311(var5); // L: 5185
				FloorOverlayDefinition.field2278 = var6.method9452(var4, var7); // L: 5186
				if (FloorOverlayDefinition.field2278 != null) { // L: 5187
					Client.field798 = class162.method3436(var5); // L: 5188
					UserComparator4.field1489 = FloorOverlayDefinition.field2278.iterator(); // L: 5189
					if (var0 == 7500) { // L: 5190
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = FloorOverlayDefinition.field2278.size();
					}
				} else {
					Client.field798 = -1; // L: 5193
					UserComparator4.field1489 = null; // L: 5194
					if (var0 == 7500) { // L: 5195
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5197
			}
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Ldx;IIIIB)V",
		garbageValue = "22"
	)
	static final void method5005(class103 var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.field1347; // L: 11109
		if (Client.menuOptionsCount < 400) { // L: 11110
			if (var5.transforms != null) { // L: 11111
				var5 = var5.transform();
			}

			if (var5 != null) { // L: 11112
				if (var5.field2021) { // L: 11113
					if (!var5.field2026 || Client.followerIndex == var1) { // L: 11114
						String var6 = var0.method2702(); // L: 11115
						int var7;
						if (var5.headIconPrayer != 0 && var0.field1266 != 0) { // L: 11116
							var7 = var0.field1266 != -1 ? var0.field1266 : var5.headIconPrayer; // L: 11117
							var6 = var6 + class205.method3908(var7, SoundCache.localPlayer.field1121) + " " + " (" + "level-" + var7 + ")"; // L: 11118
						}

						if (var5.field2027 && Client.followerOpsLowPriority) { // L: 11120
							WorldMapArea.method4699("Examine", class191.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4); // L: 11121
						}

						if (!ChatChannel.field1030 && Client.isItemSelected == 1) { // L: 11124
							WorldMapArea.method4699("Use", Client.field642 + " " + "->" + " " + class191.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4); // L: 11125
						} else if (Client.isSpellSelected) { // L: 11128
							if (!ChatChannel.field1030 && (class92.field1114 & 2) == 2) { // L: 11129
								WorldMapArea.method4699(Client.field669, Client.field670 + " " + "->" + " " + class191.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4); // L: 11130
							}
						} else {
							var7 = var5.field2027 && Client.followerOpsLowPriority ? 2000 : 0; // L: 11135
							String[] var8 = var5.actions; // L: 11136
							int var9;
							int var10;
							if (var8 != null) { // L: 11137
								for (var9 = 4; var9 >= 0; --var9) { // L: 11138
									if (!ChatChannel.field1030 && var0.method2752(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) { // L: 11139 11140
										var10 = 0; // L: 11141
										if (var9 == 0) { // L: 11142
											var10 = var7 + 9;
										}

										if (var9 == 1) { // L: 11143
											var10 = var7 + 10;
										}

										if (var9 == 2) { // L: 11144
											var10 = var7 + 11;
										}

										if (var9 == 3) { // L: 11145
											var10 = var7 + 12;
										}

										if (var9 == 4) { // L: 11146
											var10 = var7 + 13;
										}

										WorldMapArea.method4699(var8[var9], class191.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4); // L: 11147
									}
								}
							}

							if (var8 != null) { // L: 11152
								for (var9 = 4; var9 >= 0; --var9) { // L: 11153
									if (!ChatChannel.field1030 && var0.method2752(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) { // L: 11154 11155
										short var11 = 0; // L: 11156
										if (AttackOption.field1382 != Client.npcAttackOption) { // L: 11157
											if (Client.npcAttackOption == AttackOption.field1381 || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var5.headIconPrayer > SoundCache.localPlayer.field1121) { // L: 11158
												var11 = 2000; // L: 11159
											}

											var10 = 0; // L: 11161
											if (var9 == 0) { // L: 11162
												var10 = var11 + 9;
											}

											if (var9 == 1) { // L: 11163
												var10 = var11 + 10;
											}

											if (var9 == 2) { // L: 11164
												var10 = var11 + 11;
											}

											if (var9 == 3) { // L: 11165
												var10 = var11 + 12;
											}

											if (var9 == 4) { // L: 11166
												var10 = var11 + 13;
											}

											WorldMapArea.method4699(var8[var9], class191.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4); // L: 11167
										}
									}
								}
							}

							if (!var5.field2027 || !Client.followerOpsLowPriority) { // L: 11172
								WorldMapArea.method4699("Examine", class191.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4); // L: 11173
							}
						}

					}
				}
			}
		}
	} // L: 11177
}
