import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = -1059193651
	)
	static int field4583;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;B)I",
		garbageValue = "4"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "114"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10926
			UrlRequester.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10927
		}

		long var4 = -1L; // L: 10930
		int var6 = 0; // L: 10931
		long var7 = -1L; // L: 10932
		int var9 = 0;

		while (true) {
			int var11 = ViewportMouse.ViewportMouse_entityCount; // L: 10937
			if (var9 >= var11) { // L: 10939
				if (var4 != -1L) { // L: 11096
					var9 = PacketWriter.method2920(var4); // L: 11097
					int var10 = (int)(var4 >>> 7 & 127L); // L: 11100
					Player var12 = class511.field5137.field1326[Client.combatTargetPlayerIndex]; // L: 11103
					class81.method2266(var12, Client.combatTargetPlayerIndex, var9, var10, var6); // L: 11104
				}

				return; // L: 11106
			}

			long var31 = ViewportMouse.ViewportMouse_entityTags[var9]; // L: 10942
			if (var7 != var31) { // L: 10945
				var7 = var31; // L: 10946
				int var16 = PacketWriter.method2920(ViewportMouse.ViewportMouse_entityTags[var9]); // L: 10949
				int var17 = var16; // L: 10951
				int var18 = WorldMapDecorationType.method7062(var9); // L: 10952
				long var21 = ViewportMouse.ViewportMouse_entityTags[var9]; // L: 10956
				int var20 = (int)(var21 >>> 14 & 3L); // L: 10958
				int var33 = class147.method3268(var9); // L: 10963
				int var22 = class132.method3073(var9); // L: 10964
				if (var22 == 2047) { // L: 10965
					var22 = -1;
				}

				class101 var23 = null; // L: 10966
				if (var22 >= 0 && class511.field5137.field1331[var22] != null) { // L: 10967
					var23 = class511.field5137.field1331[var22].field4971;
				} else if (var22 == -1) { // L: 10968
					var23 = class511.field5137;
				}

				if (var23 != null) { // L: 10969
					label410: {
						int var24 = var23.field1318; // L: 10970
						int var28;
						if (var20 == 2 && var23.field1316.method5444(var24, var16, var18, var31) >= 0) { // L: 10971 10972
							ObjectComposition var25 = class10.getObjectDefinition(var33); // L: 10973
							if (var25.transforms != null) { // L: 10974
								var25 = var25.transform();
							}

							if (var25 == null) { // L: 10975
								break label410;
							}

							class96 var26 = null; // L: 10976

							for (class96 var27 = (class96)var23.field1335.last(); var27 != null; var27 = (class96)var23.field1335.previous()) { // L: 10977
								if (var24 == var27.field1174 && var17 == var27.field1178 && var18 == var27.field1177 && var33 == var27.field1175) { // L: 10978
									var26 = var27; // L: 10979
									break;
								}
							}

							if (!class414.field4670 && Client.isItemSelected == 1) { // L: 10983
								WorldMapArea.method4699("Use", Client.field642 + " " + "->" + " " + class191.colorStartTag(65535) + var25.name, 1, var33, var17, var18, -1, false, var22); // L: 10984
							} else if (Client.isSpellSelected) { // L: 10987
								if (!class414.field4670 && (class92.field1114 & 4) == 4) { // L: 10988
									WorldMapArea.method4699(Client.field669, Client.field670 + " " + "->" + " " + class191.colorStartTag(65535) + var25.name, 2, var33, var17, var18, -1, false, var22); // L: 10989
								}
							} else {
								String[] var41 = var25.actions; // L: 10994
								if (var41 != null) { // L: 10995
									for (var28 = 4; var28 >= 0; --var28) { // L: 10996
										if (!class414.field4670 && (var26 == null || var26.method2469(var28)) && var41[var28] != null) { // L: 10997 10998
											short var29 = 0; // L: 10999
											if (var28 == 0) { // L: 11000
												var29 = 3;
											}

											if (var28 == 1) { // L: 11001
												var29 = 4;
											}

											if (var28 == 2) { // L: 11002
												var29 = 5;
											}

											if (var28 == 3) { // L: 11003
												var29 = 6;
											}

											if (var28 == 4) { // L: 11004
												var29 = 1001;
											}

											WorldMapArea.method4699(var41[var28], class191.colorStartTag(65535) + var25.name, var29, var33, var17, var18, -1, false, var22); // L: 11005
										}
									}
								}

								WorldMapArea.method4699("Examine", class191.colorStartTag(65535) + var25.name, 1002, var25.id, var17, var18, -1, false, var22); // L: 11010
							}
						}

						int var34;
						Player var35;
						class103 var42;
						int[] var43;
						if (var20 == 1) { // L: 11015
							class103 var37 = var23.field1315[var33]; // L: 11016
							if (var37 == null) { // L: 11017
								break label410;
							}

							if (var37.field1347.size == 1 && (var37.x & 127) == 64 && (var37.field1191 & 127) == 64) { // L: 11018
								for (var34 = 0; var34 < var23.field1329; ++var34) { // L: 11019
									var42 = var23.field1315[var23.field1330[var34]]; // L: 11020
									if (var42 != null && var42 != var37 && var42.field1347.size == 1 && var42.x == var37.x && var42.field1191 == var37.field1191) { // L: 11021
										class261.method5005(var42, var23.field1330[var34], var17, var18, var22);
									}
								}

								var34 = var23.field1319.field1404; // L: 11023
								var43 = var23.field1319.field1409; // L: 11024

								for (var28 = 0; var28 < var34; ++var28) { // L: 11025
									var35 = var23.field1326[var43[var28]]; // L: 11026
									if (var35 != null && var37.x == var35.x && var37.field1191 == var35.field1191) { // L: 11027
										class81.method2266(var35, var43[var28], var17, var18, var22);
									}
								}
							}

							class261.method5005(var37, var33, var17, var18, var22); // L: 11030
						}

						if (var20 == 0) { // L: 11032
							Player var38 = var23.field1326[var33]; // L: 11033
							if (var38 == null) { // L: 11034
								break label410;
							}

							if ((var38.x & 127) == 64 && (var38.field1191 & 127) == 64) { // L: 11035
								for (var34 = 0; var34 < var23.field1329; ++var34) { // L: 11036
									var42 = var23.field1315[var23.field1330[var34]]; // L: 11037
									if (var42 != null && var42.field1347.size == 1 && var38.x == var42.x && var38.field1191 == var42.field1191) { // L: 11038
										class261.method5005(var42, var23.field1330[var34], var17, var18, var22);
									}
								}

								var34 = var23.field1319.field1404; // L: 11040
								var43 = var23.field1319.field1409; // L: 11041

								for (var28 = 0; var28 < var34; ++var28) { // L: 11042
									var35 = var23.field1326[var43[var28]]; // L: 11043
									if (var35 != null && var35 != var38 && var35.x == var38.x && var35.field1191 == var38.field1191) { // L: 11044
										class81.method2266(var35, var43[var28], var17, var18, var22);
									}
								}
							}

							if (var33 != Client.combatTargetPlayerIndex) { // L: 11047
								class81.method2266(var38, var33, var17, var18, var22);
							} else {
								var4 = var31; // L: 11049
								var6 = var22; // L: 11050
							}
						}

						if (var20 == 3) { // L: 11053
							NodeDeque var39 = var23.field1334[var24][var17][var18]; // L: 11054
							if (var39 != null) { // L: 11055
								for (TileItem var40 = (TileItem)var39.first(); var40 != null; var40 = (TileItem)var39.next()) { // L: 11056 11057 11091
									ItemComposition var44 = class164.ItemComposition_get(var40.id); // L: 11058
									if (!class152.field1724 && Client.isItemSelected == 1) { // L: 11059
										WorldMapArea.method4699("Use", Client.field642 + " " + "->" + " " + class191.colorStartTag(16748608) + var44.name, 16, var40.id, var17, var18, -1, false, var22); // L: 11060
									} else if (Client.isSpellSelected) { // L: 11063
										if (!class152.field1724 && (class92.field1114 & 1) == 1) { // L: 11064
											WorldMapArea.method4699(Client.field669, Client.field670 + " " + "->" + " " + class191.colorStartTag(16748608) + var44.name, 17, var40.id, var17, var18, -1, false, var22); // L: 11065
										}
									} else {
										String[] var36 = var44.groundActions; // L: 11070

										for (int var45 = 4; var45 >= 0; --var45) { // L: 11071
											if (!class152.field1724 && var40.method2799(var45)) { // L: 11072
												if (var36 != null && var36[var45] != null) { // L: 11073
													byte var30 = 0; // L: 11074
													if (var45 == 0) { // L: 11075
														var30 = 18;
													}

													if (var45 == 1) { // L: 11076
														var30 = 19;
													}

													if (var45 == 2) { // L: 11077
														var30 = 20;
													}

													if (var45 == 3) { // L: 11078
														var30 = 21;
													}

													if (var45 == 4) { // L: 11079
														var30 = 22;
													}

													WorldMapArea.method4699(var36[var45], class191.colorStartTag(16748608) + var44.name, var30, var40.id, var17, var18, -1, false, var22); // L: 11080
												} else if (var45 == 2) { // L: 11083
													WorldMapArea.method4699("Take", class191.colorStartTag(16748608) + var44.name, 20, var40.id, var17, var18, -1, false, var22); // L: 11084
												}
											}
										}

										WorldMapArea.method4699("Examine", class191.colorStartTag(16748608) + var44.name, 1004, var40.id, var17, var18, -1, false, var22); // L: 11088
									}
								}
							}
						}
					}
				}
			}

			++var9; // L: 10933
		}
	}
}
