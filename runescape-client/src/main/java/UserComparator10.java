import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("jb")
	static int[][] field1509;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;B)I",
		garbageValue = "-53"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-17"
	)
	public static boolean method3027(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lus;",
		garbageValue = "1511539322"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class214.cacheDir, "preferences" + var0 + ".dat"); // L: 255
		if (var3.exists()) { // L: 256
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 258
				return var10; // L: 259
			} catch (IOException var9) { // L: 261
			}
		}

		String var4 = ""; // L: 263
		if (JagexCache.cacheGamebuild == 33) { // L: 264
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) { // L: 265
			var4 = "_wip";
		}

		File var5 = new File(class74.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 266
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 267
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 269
				return var6; // L: 270
			} catch (IOException var8) { // L: 272
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 275
			return var6; // L: 276
		} catch (IOException var7) { // L: 278
			throw new RuntimeException(); // L: 279
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Loz;Ljava/lang/String;I)V",
		garbageValue = "-320658812"
	)
	static void method3025(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1549
		Client.archiveLoaders.add(var2); // L: 1550
		Client.field574 += var2.groupCount; // L: 1551
	} // L: 1552

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldw;IIIIIB)V",
		garbageValue = "2"
	)
	static final void method3026(class101 var0, Actor var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null && var1.isVisible()) { // L: 5473
			if (var1 instanceof class103) { // L: 5474
				NPCComposition var7 = ((class103)var1).field1347; // L: 5475
				if (var7.transforms != null) { // L: 5476
					var7 = var7.transform();
				}

				if (var7 == null) { // L: 5477
					return;
				}
			}

			int var76 = var0.field1319.field1404; // L: 5479
			int[] var8 = var0.field1319.field1409; // L: 5480
			boolean var9 = var2 < var76; // L: 5481
			int var10 = -2; // L: 5482
			if (var1.field1211 != null && (!var9 || !var1.field1213 && (Client.publicChatMode == 4 || !var1.field1212 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var1).method2405())))) { // L: 5483 5484
				GrandExchangeOfferNameComparator.method7320(var0, var1, var1.vmethod2708()); // L: 5485
				if (Client.field618 > -1 && Client.field606 < Client.field607) { // L: 5486
					Client.field667[Client.field606] = ParamComposition.fontBold12.stringWidth(var1.field1211) / 2; // L: 5487
					Client.field610[Client.field606] = ParamComposition.fontBold12.ascent; // L: 5488
					Client.field608[Client.field606] = Client.field618; // L: 5489
					Client.field609[Client.field606] = Client.field585 - var10; // L: 5490
					Client.field612[Client.field606] = var1.field1226; // L: 5491
					Client.field613[Client.field606] = var1.field1216; // L: 5492
					Client.field615[Client.field606] = var1.field1206; // L: 5493
					Client.field540[Client.field606] = var1.field1217; // L: 5494
					Client.field616[Client.field606] = var1.field1211; // L: 5495
					++Client.field606; // L: 5496
					var10 += 12; // L: 5497
				}
			}

			int var16;
			int var23;
			int var24;
			if (!var1.healthBars.method7494()) { // L: 5501
				GrandExchangeOfferNameComparator.method7320(var0, var1, var1.vmethod2708() + 15); // L: 5502

				for (HealthBar var11 = (HealthBar)var1.healthBars.last(); var11 != null; var11 = (HealthBar)var1.healthBars.previous()) { // L: 5503
					HealthBarUpdate var12 = var11.getInventorySprite(Client.cycle); // L: 5504
					if (var12 == null) { // L: 5505
						if (var11.isEmpty()) { // L: 5563
							var11.remove();
						}
					} else {
						HealthBarDefinition var13 = var11.definition; // L: 5506
						SpritePixels var80 = var13.method3653(); // L: 5507
						SpritePixels var84 = var13.method3652(); // L: 5508
						int var85 = 0; // L: 5510
						if (var80 != null && var84 != null) { // L: 5511
							if (var13.widthPadding * 2 < var84.subWidth) { // L: 5512
								var85 = var13.widthPadding;
							}

							var16 = var84.subWidth - var85 * 2; // L: 5513
						} else {
							var16 = var13.width; // L: 5515
						}

						int var82 = 255; // L: 5516
						boolean var86 = true; // L: 5517
						int var87 = Client.cycle - var12.cycle; // L: 5518
						int var88 = var16 * var12.health2 / var13.width; // L: 5519
						int var89;
						int var99;
						if (var12.cycleOffset > var87) { // L: 5520
							var89 = var13.field1936 == 0 ? 0 : var13.field1936 * (var87 / var13.field1936); // L: 5521
							var23 = var16 * var12.health / var13.width; // L: 5522
							var99 = var89 * (var88 - var23) / var12.cycleOffset + var23; // L: 5523
						} else {
							var99 = var88; // L: 5526
							var89 = var13.int5 + var12.cycleOffset - var87; // L: 5527
							if (var13.int3 >= 0) { // L: 5528
								var82 = (var89 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var12.health2 > 0 && var99 < 1) { // L: 5530
							var99 = 1;
						}

						if (var80 != null && var84 != null) { // L: 5531
							if (var99 == var16) { // L: 5532
								var99 += var85 * 2;
							} else {
								var99 += var85; // L: 5533
							}

							var89 = var80.subHeight; // L: 5534
							var10 += var89; // L: 5535
							var23 = var3 + Client.field618 - (var16 >> 1); // L: 5536
							var24 = var4 + Client.field585 - var10; // L: 5537
							var23 -= var85; // L: 5538
							if (var82 >= 0 && var82 < 255) { // L: 5539
								var80.drawTransAt(var23, var24, var82); // L: 5540
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var99, var89 + var24); // L: 5541
								var84.drawTransAt(var23, var24, var82); // L: 5542
							} else {
								var80.drawTransBgAt(var23, var24); // L: 5545
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var99, var89 + var24); // L: 5546
								var84.drawTransBgAt(var23, var24); // L: 5547
							}

							Rasterizer2D.Rasterizer2D_setClip(var3, var4, var3 + var5, var4 + var6); // L: 5549
							var10 += 2; // L: 5550
						} else {
							var10 += 5; // L: 5553
							if (Client.field618 > -1) { // L: 5554
								var89 = var3 + Client.field618 - (var16 >> 1); // L: 5555
								var23 = var4 + Client.field585 - var10; // L: 5556
								Rasterizer2D.Rasterizer2D_fillRectangle(var89, var23, var99, 5, 65280); // L: 5557
								Rasterizer2D.Rasterizer2D_fillRectangle(var99 + var89, var23, var16 - var99, 5, 16711680); // L: 5558
							}

							var10 += 2; // L: 5560
						}
					}
				}
			}

			if (var10 == -2) { // L: 5566
				var10 += 7;
			}

			Player var90;
			if (var9 && Client.cycle == var1.field1195 && WorldMapDecorationType.method7063((Player)var1)) { // L: 5567
				var90 = (Player)var1; // L: 5568
				if (var9) { // L: 5569
					GrandExchangeOfferNameComparator.method7320(var0, var1, var1.vmethod2708() + 15); // L: 5570
					AbstractFont var91 = (AbstractFont)Client.field570.get(FontName.FontName_plain12); // L: 5571
					var10 += 4; // L: 5572
					var91.drawCentered(var90.username.getName(), var3 + Client.field618, var4 + Client.field585 - var10, 16777215, 0); // L: 5573
					var10 += 18; // L: 5574
				}
			}

			if (var9) { // L: 5577
				var90 = (Player)var1; // L: 5578
				if (var90.field1138) { // L: 5579
					return;
				}

				if (var90.field1120 != -1 || var90.field1137 != -1) { // L: 5580
					GrandExchangeOfferNameComparator.method7320(var0, var1, var1.field1250 + 15); // L: 5581
					if (Client.field618 > -1) { // L: 5582
						if (var90.field1120 != -1) { // L: 5583
							var10 += 25; // L: 5584
							FaceNormal.field3019[var90.field1120].drawTransBgAt(var3 + Client.field618 - 12, var4 + Client.field585 - var10); // L: 5585
						}

						if (var90.field1137 != -1) { // L: 5587
							var10 += 25; // L: 5588
							ArchiveDiskActionHandler.field4476[var90.field1137].drawTransBgAt(var3 + Client.field618 - 12, var4 + Client.field585 - var10); // L: 5589
						}
					}
				}

				if (var2 >= 0 && Client.field524 == 10 && var8[var2] == Client.field526) { // L: 5593
					GrandExchangeOfferNameComparator.method7320(var0, var1, var1.field1250 + 15); // L: 5594
					if (Client.field618 > -1) { // L: 5595
						var10 += class337.field3665[1].subHeight; // L: 5596
						class337.field3665[1].drawTransBgAt(var3 + Client.field618 - 12, var4 + Client.field585 - var10); // L: 5597
					}
				}
			} else {
				class103 var92 = (class103)var1; // L: 5602
				int[] var93 = var92.method2707(); // L: 5603
				short[] var94 = var92.method2720(); // L: 5604
				if (var94 != null && var93 != null) { // L: 5605
					for (int var14 = 0; var14 < var94.length; ++var14) { // L: 5606
						if (var94[var14] >= 0 && var93[var14] >= 0) { // L: 5607
							long var15 = (long)var93[var14] << 8 | (long)var94[var14]; // L: 5610
							SpritePixels var17 = (SpritePixels)Client.field795.method8418(var15); // L: 5611
							if (var17 == null) { // L: 5612
								SpritePixels[] var18 = FriendsChatMember.method8542(class7.field29, var93[var14], 0); // L: 5613
								if (var18 != null && var94[var14] < var18.length) { // L: 5614
									var17 = var18[var94[var14]]; // L: 5615
									Client.field795.method8419(var15, var17); // L: 5616
								}
							}

							if (var17 != null) { // L: 5619
								GrandExchangeOfferNameComparator.method7320(var0, var1, var1.vmethod2708() + 15); // L: 5620
								if (Client.field618 > -1) { // L: 5621
									var17.drawTransBgAt(var3 + Client.field618 - (var17.subWidth >> 1), (var14 + 1) * (var4 - var17.subHeight - 2) - var17.subHeight + Client.field585 - 4); // L: 5622
								}
							}
						}
					}
				}

				if (Client.field524 == 1 && var0.field1330[var2 - var76] == Client.field794 && Client.cycle % 20 < 10) { // L: 5627
					GrandExchangeOfferNameComparator.method7320(var0, var1, var1.vmethod2708() + 15); // L: 5628
					if (Client.field618 > -1) { // L: 5629
						class337.field3665[0].drawTransBgAt(var3 + Client.field618 - 12, var4 + Client.field585 - 28);
					}
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) { // L: 5632
				int var78 = var1.hitSplatCycles[var77]; // L: 5633
				int var79 = var1.hitSplatTypes[var77]; // L: 5634
				HitSplatDefinition var97 = null; // L: 5635
				int var81 = 0; // L: 5636
				if (var79 >= 0) { // L: 5637
					if (var78 <= Client.cycle) { // L: 5638
						continue;
					}

					var97 = WorldMapSectionType.method4961(var1.hitSplatTypes[var77]); // L: 5639
					var81 = var97.field2131; // L: 5640
					if (var97 != null && var97.transforms != null) { // L: 5641
						var97 = var97.transform(); // L: 5642
						if (var97 == null) { // L: 5643
							var1.hitSplatCycles[var77] = -1; // L: 5644
							continue; // L: 5645
						}
					}
				} else if (var78 < 0) { // L: 5649
					continue;
				}

				var16 = var1.hitSplatTypes2[var77]; // L: 5650
				HitSplatDefinition var95 = null; // L: 5651
				if (var16 >= 0) { // L: 5652
					var95 = WorldMapSectionType.method4961(var16); // L: 5653
					if (var95 != null && var95.transforms != null) { // L: 5654
						var95 = var95.transform();
					}
				}

				if (var78 - var81 <= Client.cycle) { // L: 5656
					if (var97 == null) { // L: 5657
						var1.hitSplatCycles[var77] = -1; // L: 5658
					} else {
						GrandExchangeOfferNameComparator.method7320(var0, var1, var1.vmethod2708() / 2); // L: 5661
						if (Client.field618 > -1) { // L: 5662
							boolean var98 = true; // L: 5663
							if (var77 == 1) { // L: 5664
								Client.field585 -= 20; // L: 5665
							}

							if (var77 == 2) { // L: 5667
								Client.field618 -= 15; // L: 5668
								Client.field585 -= 10; // L: 5669
							}

							if (var77 == 3) { // L: 5671
								Client.field618 += 15; // L: 5672
								Client.field585 -= 10; // L: 5673
							}

							SpritePixels var19 = null; // L: 5675
							SpritePixels var20 = null; // L: 5676
							SpritePixels var21 = null; // L: 5677
							SpritePixels var22 = null; // L: 5678
							var23 = 0; // L: 5679
							var24 = 0; // L: 5680
							int var25 = 0; // L: 5681
							int var26 = 0; // L: 5682
							int var27 = 0; // L: 5683
							int var28 = 0; // L: 5684
							int var29 = 0; // L: 5685
							int var30 = 0; // L: 5686
							SpritePixels var31 = null; // L: 5687
							SpritePixels var32 = null; // L: 5688
							SpritePixels var33 = null; // L: 5689
							SpritePixels var34 = null; // L: 5690
							int var35 = 0; // L: 5691
							int var36 = 0; // L: 5692
							int var37 = 0; // L: 5693
							int var38 = 0; // L: 5694
							int var39 = 0; // L: 5695
							int var40 = 0; // L: 5696
							int var41 = 0; // L: 5697
							int var42 = 0; // L: 5698
							int var43 = 0; // L: 5699
							var19 = var97.method3879(); // L: 5700
							int var44;
							if (var19 != null) { // L: 5701
								var23 = var19.subWidth; // L: 5702
								var44 = var19.subHeight; // L: 5703
								if (var44 > var43) { // L: 5704
									var43 = var44;
								}

								var27 = var19.xOffset; // L: 5705
							}

							var20 = var97.method3880(); // L: 5707
							if (var20 != null) { // L: 5708
								var24 = var20.subWidth; // L: 5709
								var44 = var20.subHeight; // L: 5710
								if (var44 > var43) { // L: 5711
									var43 = var44;
								}

								var28 = var20.xOffset; // L: 5712
							}

							var21 = var97.method3881(); // L: 5714
							if (var21 != null) { // L: 5715
								var25 = var21.subWidth; // L: 5716
								var44 = var21.subHeight; // L: 5717
								if (var44 > var43) { // L: 5718
									var43 = var44;
								}

								var29 = var21.xOffset; // L: 5719
							}

							var22 = var97.method3882(); // L: 5721
							if (var22 != null) { // L: 5722
								var26 = var22.subWidth; // L: 5723
								var44 = var22.subHeight; // L: 5724
								if (var44 > var43) { // L: 5725
									var43 = var44;
								}

								var30 = var22.xOffset; // L: 5726
							}

							if (var95 != null) { // L: 5728
								var31 = var95.method3879(); // L: 5729
								if (var31 != null) { // L: 5730
									var35 = var31.subWidth; // L: 5731
									var44 = var31.subHeight; // L: 5732
									if (var44 > var43) { // L: 5733
										var43 = var44;
									}

									var39 = var31.xOffset; // L: 5734
								}

								var32 = var95.method3880(); // L: 5736
								if (var32 != null) { // L: 5737
									var36 = var32.subWidth; // L: 5738
									var44 = var32.subHeight; // L: 5739
									if (var44 > var43) { // L: 5740
										var43 = var44;
									}

									var40 = var32.xOffset; // L: 5741
								}

								var33 = var95.method3881(); // L: 5743
								if (var33 != null) { // L: 5744
									var37 = var33.subWidth; // L: 5745
									var44 = var33.subHeight; // L: 5746
									if (var44 > var43) { // L: 5747
										var43 = var44;
									}

									var41 = var33.xOffset; // L: 5748
								}

								var34 = var95.method3882(); // L: 5750
								if (var34 != null) { // L: 5751
									var38 = var34.subWidth; // L: 5752
									var44 = var34.subHeight; // L: 5753
									if (var44 > var43) { // L: 5754
										var43 = var44;
									}

									var42 = var34.xOffset; // L: 5755
								}
							}

							Font var83 = var97.getFont(); // L: 5760
							if (var83 == null) { // L: 5761
								var83 = GrandExchangeOfferOwnWorldComparator.field468;
							}

							Font var45;
							if (var95 != null) { // L: 5762
								var45 = var95.getFont(); // L: 5763
								if (var45 == null) { // L: 5764
									var45 = GrandExchangeOfferOwnWorldComparator.field468;
								}
							} else {
								var45 = GrandExchangeOfferOwnWorldComparator.field468; // L: 5766
							}

							String var46 = null; // L: 5767
							String var47 = null; // L: 5768
							boolean var48 = false; // L: 5769
							int var49 = 0; // L: 5770
							var46 = var97.getString(var1.hitSplatValues[var77]); // L: 5771
							int var96 = var83.stringWidth(var46); // L: 5772
							if (var95 != null) { // L: 5773
								var47 = var95.getString(var1.hitSplatValues2[var77]); // L: 5774
								var49 = var45.stringWidth(var47); // L: 5775
							}

							int var50 = 0; // L: 5777
							int var51 = 0; // L: 5778
							if (var24 > 0) { // L: 5779
								if (var21 == null && var22 == null) { // L: 5780
									var50 = 1; // L: 5781
								} else {
									var50 = var96 / var24 + 1;
								}
							}

							if (var95 != null && var36 > 0) { // L: 5783 5784
								if (var33 == null && var34 == null) { // L: 5785
									var51 = 1; // L: 5786
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0; // L: 5789
							int var53 = var52; // L: 5790
							if (var23 > 0) { // L: 5791
								var52 += var23;
							}

							var52 += 2; // L: 5792
							int var54 = var52; // L: 5793
							if (var25 > 0) { // L: 5794
								var52 += var25;
							}

							int var55 = var52; // L: 5795
							int var56 = var52; // L: 5796
							int var57;
							if (var24 > 0) { // L: 5797
								var57 = var50 * var24; // L: 5798
								var52 += var57; // L: 5799
								var56 += (var57 - var96) / 2; // L: 5800
							} else {
								var52 += var96; // L: 5803
							}

							var57 = var52; // L: 5805
							if (var26 > 0) { // L: 5806
								var52 += var26;
							}

							int var58 = 0; // L: 5807
							int var59 = 0; // L: 5808
							int var60 = 0; // L: 5809
							int var61 = 0; // L: 5810
							int var62 = 0; // L: 5811
							int var63;
							if (var95 != null) { // L: 5812
								var52 += 2; // L: 5813
								var58 = var52; // L: 5814
								if (var35 > 0) { // L: 5815
									var52 += var35;
								}

								var52 += 2; // L: 5816
								var59 = var52; // L: 5817
								if (var37 > 0) { // L: 5818
									var52 += var37;
								}

								var60 = var52; // L: 5819
								var62 = var52; // L: 5820
								if (var36 > 0) { // L: 5821
									var63 = var51 * var36; // L: 5822
									var52 += var63; // L: 5823
									var62 += (var63 - var49) / 2; // L: 5824
								} else {
									var52 += var49; // L: 5827
								}

								var61 = var52; // L: 5829
								if (var38 > 0) { // L: 5830
									var52 += var38;
								}
							}

							var63 = var1.hitSplatCycles[var77] - Client.cycle; // L: 5832
							int var64 = var97.field2128 - var63 * var97.field2128 / var97.field2131; // L: 5833
							int var65 = var63 * var97.field2137 / var97.field2131 + -var97.field2137; // L: 5834
							int var66 = var64 + (var3 + Client.field618 - (var52 >> 1)); // L: 5835
							int var67 = var65 + (var4 + Client.field585 - 12); // L: 5836
							int var68 = var67; // L: 5837
							int var69 = var67 + var43; // L: 5838
							int var70 = var67 + var97.maleModel1 + 15; // L: 5839
							int var71 = var70 - var83.maxAscent; // L: 5840
							int var72 = var70 + var83.maxDescent; // L: 5841
							if (var71 < var67) { // L: 5842
								var68 = var71;
							}

							if (var72 > var69) { // L: 5843
								var69 = var72;
							}

							int var73 = 0; // L: 5844
							int var74;
							int var75;
							if (var95 != null) { // L: 5845
								var73 = var67 + var95.maleModel1 + 15; // L: 5846
								var74 = var73 - var45.maxAscent; // L: 5847
								var75 = var73 + var45.maxDescent; // L: 5848
								if (var74 < var68) { // L: 5849
									;
								}

								if (var75 > var69) { // L: 5850
									;
								}
							}

							var74 = 255; // L: 5852
							if (var97.field2138 >= 0) { // L: 5853
								var74 = (var63 << 8) / (var97.field2131 - var97.field2138);
							}

							if (var74 >= 0 && var74 < 255) { // L: 5854
								if (var19 != null) { // L: 5855
									var19.drawTransAt(var53 + var66 - var27, var67, var74);
								}

								if (var21 != null) { // L: 5856
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) { // L: 5857
									for (var75 = 0; var75 < var50; ++var75) { // L: 5858
										var20.drawTransAt(var75 * var24 + (var55 + var66 - var28), var67, var74); // L: 5859
									}
								}

								if (var22 != null) { // L: 5862
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var83.drawAlpha(var46, var66 + var56, var70, var97.textColor, 0, var74); // L: 5863
								if (var95 != null) { // L: 5864
									if (var31 != null) { // L: 5865
										var31.drawTransAt(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) { // L: 5866
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}

									if (var32 != null) { // L: 5867
										for (var75 = 0; var75 < var51; ++var75) { // L: 5868
											var32.drawTransAt(var36 * var75 + (var66 + var60 - var40), var67, var74); // L: 5869
										}
									}

									if (var34 != null) { // L: 5872
										var34.drawTransAt(var66 + var61 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var62 + var66, var73, var95.textColor, 0, var74); // L: 5873
								}
							} else {
								if (var19 != null) { // L: 5877
									var19.drawTransBgAt(var66 + var53 - var27, var67);
								}

								if (var21 != null) { // L: 5878
									var21.drawTransBgAt(var54 + var66 - var29, var67);
								}

								if (var20 != null) { // L: 5879
									for (var75 = 0; var75 < var50; ++var75) { // L: 5880
										var20.drawTransBgAt(var24 * var75 + (var66 + var55 - var28), var67); // L: 5881
									}
								}

								if (var22 != null) { // L: 5884
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var83.draw(var46, var56 + var66, var70, var97.textColor | -16777216, 0); // L: 5885
								if (var95 != null) { // L: 5886
									if (var31 != null) { // L: 5887
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) { // L: 5888
										var33.drawTransBgAt(var66 + var59 - var41, var67);
									}

									if (var32 != null) { // L: 5889
										for (var75 = 0; var75 < var51; ++var75) { // L: 5890
											var32.drawTransBgAt(var75 * var36 + (var66 + var60 - var40), var67); // L: 5891
										}
									}

									if (var34 != null) { // L: 5894
										var34.drawTransBgAt(var61 + var66 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var95.textColor | -16777216, 0); // L: 5895
								}
							}
						}
					}
				}
			}

		}
	} // L: 5900
}
