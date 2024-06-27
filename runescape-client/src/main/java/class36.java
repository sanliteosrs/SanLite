import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class36 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("gj")
	static String field227;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "99"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 64
		if (var1 == null) { // L: 65
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 66 67
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "1"
	)
	static final void method709(class101 var0) {
		int var1 = var0.field1332; // L: 606
		int var2 = var0.field1320; // L: 607
		int[][][] var3 = var0.field1327; // L: 608
		byte[][][] var4 = var0.field1325; // L: 609
		class282 var5 = var0.field1316; // L: 610
		CollisionMap[] var6 = var0.field1317; // L: 611

		int var7;
		int var8;
		int var9;
		int var10;
		for (var7 = 0; var7 < 4; ++var7) { // L: 612
			for (var8 = 0; var8 < var1; ++var8) { // L: 613
				for (var9 = 0; var9 < var2; ++var9) { // L: 614
					if ((var0.field1325[var7][var8][var9] & 1) == 1) { // L: 615
						var10 = var7; // L: 616
						if ((var0.field1325[1][var8][var9] & 2) == 2) { // L: 617
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) { // L: 618
							var6[var10].method4428(var8, var9);
						}
					}
				}
			}
		}

		class83.field1046 += (int)(Math.random() * 5.0D) - 2; // L: 623
		if (class83.field1046 < -8) { // L: 624
			class83.field1046 = -8;
		}

		if (class83.field1046 > 8) { // L: 625
			class83.field1046 = 8;
		}

		class83.field1047 += (int)(Math.random() * 5.0D) - 2; // L: 626
		if (class83.field1047 < -16) { // L: 627
			class83.field1047 = -16;
		}

		if (class83.field1047 > 16) { // L: 628
			class83.field1047 = 16;
		}

		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		for (var7 = 0; var7 < 4; ++var7) { // L: 629
			byte[][] var50 = WorldMapScaleHandler.field2749[var7]; // L: 630
			boolean var61 = true; // L: 631
			boolean var62 = true; // L: 632
			boolean var11 = true; // L: 633
			boolean var12 = true; // L: 634
			boolean var13 = true; // L: 635
			var14 = (int)Math.sqrt(5100.0D); // L: 636
			var15 = var14 * 768 >> 8; // L: 637

			int var24;
			int var58;
			for (var16 = 1; var16 < var2 - 1; ++var16) { // L: 638
				for (var17 = 1; var17 < var1 - 1; ++var17) { // L: 639
					var18 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16]; // L: 640
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1]; // L: 641
					var20 = (int)Math.sqrt((double)(var19 * var19 + var18 * var18 + 65536)); // L: 642
					var21 = (var18 << 8) / var20; // L: 643
					var22 = 65536 / var20; // L: 644
					var23 = (var19 << 8) / var20; // L: 645
					var24 = (var21 * -50 + var23 * -50 + var22 * -10) / var15 + 96; // L: 646
					var58 = (var50[var17][var16 + 1] >> 3) + (var50[var17 - 1][var16] >> 2) + (var50[var17][var16 - 1] >> 2) + (var50[var17 + 1][var16] >> 3) + (var50[var17][var16] >> 1); // L: 647
					class83.field1039[var17][var16] = var24 - var58; // L: 648
				}
			}

			for (var16 = 0; var16 < var2; ++var16) { // L: 651
				class83.field1037[var16] = 0; // L: 652
				class83.field1038[var16] = 0; // L: 653
				Canvas.field105[var16] = 0; // L: 654
				class83.field1036[var16] = 0; // L: 655
				class534.field5292[var16] = 0; // L: 656
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) { // L: 658
				for (var17 = 0; var17 < var2; ++var17) { // L: 659
					var18 = var16 + 5; // L: 660
					int var10002;
					if (var18 >= 0 && var18 < var1) { // L: 661
						long var52 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 667
						var21 = (int)var52; // L: 669
						var22 = class83.field1033[var7][var18][var17] & var21; // L: 670
						if (var22 > 0) { // L: 671
							var24 = var22 - 1; // L: 673
							FloorUnderlayDefinition var54 = (FloorUnderlayDefinition)FloorUnderlayDefinition.field2086.get((long)var24); // L: 675
							FloorUnderlayDefinition var55;
							if (var54 != null) { // L: 676
								var55 = var54; // L: 677
							} else {
								byte[] var26 = FloorUnderlayDefinition.field2091.takeFile(1, var24); // L: 680
								var54 = new FloorUnderlayDefinition(); // L: 681
								if (var26 != null) { // L: 682
									var54.decode(new Buffer(var26), var24);
								}

								var54.postDecode(); // L: 683
								FloorUnderlayDefinition.field2086.put(var54, (long)var24); // L: 684
								var55 = var54; // L: 685
							}

							var10000 = class83.field1037; // L: 688
							var10000[var17] += var55.hue;
							var10000 = class83.field1038; // L: 689
							var10000[var17] += var55.saturation;
							var10000 = Canvas.field105; // L: 690
							var10000[var17] += var55.lightness;
							var10000 = class83.field1036; // L: 691
							var10000[var17] += var55.hueMultiplier;
							var10002 = class534.field5292[var17]++; // L: 692
						}
					}

					var19 = var16 - 5; // L: 695
					if (var19 >= 0 && var19 < var1) { // L: 696
						long var56 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 702
						var22 = (int)var56; // L: 704
						var23 = class83.field1033[var7][var19][var17] & var22; // L: 705
						if (var23 > 0) { // L: 706
							var58 = var23 - 1; // L: 708
							FloorUnderlayDefinition var67 = (FloorUnderlayDefinition)FloorUnderlayDefinition.field2086.get((long)var58); // L: 710
							FloorUnderlayDefinition var60;
							if (var67 != null) { // L: 711
								var60 = var67; // L: 712
							} else {
								byte[] var59 = FloorUnderlayDefinition.field2091.takeFile(1, var58); // L: 715
								var67 = new FloorUnderlayDefinition(); // L: 716
								if (var59 != null) { // L: 717
									var67.decode(new Buffer(var59), var58);
								}

								var67.postDecode(); // L: 718
								FloorUnderlayDefinition.field2086.put(var67, (long)var58); // L: 719
								var60 = var67; // L: 720
							}

							var10000 = class83.field1037; // L: 723
							var10000[var17] -= var60.hue;
							var10000 = class83.field1038; // L: 724
							var10000[var17] -= var60.saturation;
							var10000 = Canvas.field105; // L: 725
							var10000[var17] -= var60.lightness;
							var10000 = class83.field1036; // L: 726
							var10000[var17] -= var60.hueMultiplier;
							var10002 = class534.field5292[var17]--; // L: 727
						}
					}
				}

				if (var16 >= 1 && var16 < var1 - 1) { // L: 731
					var17 = 0; // L: 732
					var18 = 0; // L: 733
					var19 = 0; // L: 734
					var20 = 0; // L: 735
					var21 = 0; // L: 736

					for (var22 = -5; var22 < var2 + 5; ++var22) { // L: 737
						var23 = var22 + 5; // L: 738
						if (var23 >= 0 && var23 < var2) { // L: 739
							var17 += class83.field1037[var23]; // L: 740
							var18 += class83.field1038[var23]; // L: 741
							var19 += Canvas.field105[var23]; // L: 742
							var20 += class83.field1036[var23]; // L: 743
							var21 += class534.field5292[var23]; // L: 744
						}

						var24 = var22 - 5; // L: 746
						if (var24 >= 0 && var24 < var2) { // L: 747
							var17 -= class83.field1037[var24]; // L: 748
							var18 -= class83.field1038[var24]; // L: 749
							var19 -= Canvas.field105[var24]; // L: 750
							var20 -= class83.field1036[var24]; // L: 751
							var21 -= class534.field5292[var24]; // L: 752
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) { // L: 754 755 756 757
							if (var7 < class83.field1044) { // L: 760
								class83.field1044 = var7;
							}

							long var25 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 766
							int var27 = (int)var25; // L: 768
							int var28 = class83.field1033[var7][var16][var22] & var27; // L: 769
							int var29 = class83.field1034[var7][var16][var22] & var27; // L: 770
							if (var28 > 0 || var29 > 0) { // L: 771
								int var30 = var3[var7][var16][var22]; // L: 772
								int var31 = var3[var7][var16 + 1][var22]; // L: 773
								int var32 = var3[var7][var16 + 1][var22 + 1]; // L: 774
								int var33 = var3[var7][var16][var22 + 1]; // L: 775
								int var34 = class83.field1039[var16][var22]; // L: 776
								int var35 = class83.field1039[var16 + 1][var22]; // L: 777
								int var36 = class83.field1039[var16 + 1][var22 + 1]; // L: 778
								int var37 = class83.field1039[var16][var22 + 1]; // L: 779
								int var38 = -1; // L: 780
								int var39 = -1; // L: 781
								int var40;
								int var41;
								if (var28 > 0) { // L: 782
									var40 = var17 * 256 / var20; // L: 783
									var41 = var18 / var21; // L: 784
									int var42 = var19 / var21; // L: 785
									var38 = HealthBarUpdate.hslToRgb(var40, var41, var42); // L: 786
									var40 = var40 + class83.field1046 & 255; // L: 787
									var42 += class83.field1047; // L: 788
									if (var42 < 0) { // L: 789
										var42 = 0;
									} else if (var42 > 255) { // L: 790
										var42 = 255;
									}

									var39 = HealthBarUpdate.hslToRgb(var40, var41, var42); // L: 791
								}

								if (var7 > 0) { // L: 793
									boolean var68 = true; // L: 794
									if (var28 == 0 && class83.field1035[var7][var16][var22] != 0) { // L: 795
										var68 = false;
									}

									if (var29 > 0 && !class60.method1179(var29 - 1).hideUnderlay) { // L: 796
										var68 = false;
									}

									if (var68 && var30 == var31 && var30 == var32 && var30 == var33) { // L: 797 798
										var10000 = class25.field110[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var40 = 0; // L: 801
								if (var39 != -1) { // L: 802
									var40 = Rasterizer3D.Rasterizer3D_colorPalette[class231.method4392(var39, 96)];
								}

								if (var29 == 0) { // L: 803
									var5.method5473(var7, var16, var22, 0, 0, -1, var30, var31, var32, var33, class231.method4392(var38, var34), class231.method4392(var38, var35), class231.method4392(var38, var36), class231.method4392(var38, var37), 0, 0, 0, 0, var40, 0); // L: 804
								} else {
									var41 = class83.field1035[var7][var16][var22] + 1; // L: 807
									byte var69 = class356.field3810[var7][var16][var22]; // L: 808
									FloorOverlayDefinition var43 = class60.method1179(var29 - 1); // L: 809
									int var44 = var43.texture; // L: 810
									int var45;
									int var46;
									int var47;
									int var48;
									if (var44 >= 0) { // L: 813
										var46 = Rasterizer3D.field2876.Rasterizer3D_textureLoader.getAverageTextureRGB(var44); // L: 814
										var45 = -1; // L: 815
									} else if (var43.primaryRgb == 16711935) { // L: 818
										var45 = -2; // L: 819
										var44 = -1; // L: 820
										var46 = -2; // L: 821
									} else {
										var45 = HealthBarUpdate.hslToRgb(var43.hue, var43.saturation, var43.lightness); // L: 824
										var47 = var43.hue + class83.field1046 & 255; // L: 825
										var48 = var43.lightness + class83.field1047; // L: 826
										if (var48 < 0) { // L: 827
											var48 = 0;
										} else if (var48 > 255) { // L: 828
											var48 = 255;
										}

										var46 = HealthBarUpdate.hslToRgb(var47, var43.saturation, var48); // L: 829
									}

									var47 = 0; // L: 832
									if (var46 != -2) { // L: 833
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[FriendSystem.method1931(var46, 96)];
									}

									if (var43.secondaryRgb != -1) { // L: 834
										var48 = var43.secondaryHue + class83.field1046 & 255; // L: 835
										int var49 = var43.secondaryLightness + class83.field1047; // L: 836
										if (var49 < 0) { // L: 837
											var49 = 0;
										} else if (var49 > 255) { // L: 838
											var49 = 255;
										}

										var46 = HealthBarUpdate.hslToRgb(var48, var43.secondarySaturation, var49); // L: 839
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[FriendSystem.method1931(var46, 96)]; // L: 840
									}

									var5.method5473(var7, var16, var22, var41, var69, var44, var30, var31, var32, var33, class231.method4392(var38, var34), class231.method4392(var38, var35), class231.method4392(var38, var36), class231.method4392(var38, var37), FriendSystem.method1931(var45, var34), FriendSystem.method1931(var45, var35), FriendSystem.method1931(var45, var36), FriendSystem.method1931(var45, var37), var40, var47); // L: 842
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) { // L: 849
				for (var17 = 1; var17 < var1 - 1; ++var17) { // L: 850
					if ((var0.field1325[var7][var17][var16] & 8) != 0) { // L: 857
						var22 = 0; // L: 858
					} else if (var7 > 0 && (var0.field1325[1][var17][var16] & 2) != 0) { // L: 861
						var22 = var7 - 1; // L: 862
					} else {
						var22 = var7; // L: 865
					}

					var5.method5418(var7, var17, var16, var22); // L: 867
				}
			}

			class83.field1033[var7] = null; // L: 870
			class83.field1034[var7] = null; // L: 871
			class83.field1035[var7] = null; // L: 872
			class356.field3810[var7] = null; // L: 873
			WorldMapScaleHandler.field2749[var7] = null; // L: 874
		}

		var5.method5494(-50, -10, -50); // L: 876

		for (var7 = 0; var7 < var1; ++var7) { // L: 877
			for (var8 = 0; var8 < var2; ++var8) { // L: 878
				if ((var4[1][var7][var8] & 2) == 2) { // L: 879
					var5.method5416(var7, var8);
				}
			}
		}

		var7 = 1; // L: 882
		var8 = 2; // L: 883
		var9 = 4; // L: 884

		for (var10 = 0; var10 < 4; ++var10) { // L: 885
			if (var10 > 0) { // L: 886
				var7 <<= 3; // L: 887
				var8 <<= 3; // L: 888
				var9 <<= 3; // L: 889
			}

			for (int var63 = 0; var63 <= var10; ++var63) { // L: 891
				for (int var64 = 0; var64 <= var2; ++var64) { // L: 892
					for (int var65 = 0; var65 <= var1; ++var65) { // L: 893
						short var66;
						if ((class25.field110[var63][var65][var64] & var7) != 0) { // L: 894
							var14 = var64; // L: 895
							var15 = var64; // L: 896
							var16 = var63; // L: 897

							for (var17 = var63; var14 > 0 && (class25.field110[var63][var65][var14 - 1] & var7) != 0; --var14) { // L: 898 899
							}

							while (var15 < var2 && (class25.field110[var63][var65][var15 + 1] & var7) != 0) { // L: 900
								++var15;
							}

							label458:
							while (var16 > 0) { // L: 901
								for (var18 = var14; var18 <= var15; ++var18) { // L: 902
									if ((class25.field110[var16 - 1][var65][var18] & var7) == 0) {
										break label458;
									}
								}

								--var16; // L: 903
							}

							label447:
							while (var17 < var10) { // L: 905
								for (var18 = var14; var18 <= var15; ++var18) { // L: 906
									if ((class25.field110[var17 + 1][var65][var18] & var7) == 0) {
										break label447;
									}
								}

								++var17; // L: 907
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16); // L: 909
							if (var18 >= 8) { // L: 910
								var66 = 240; // L: 911
								var20 = var3[var17][var65][var14] - var66; // L: 912
								var21 = var3[var16][var65][var14]; // L: 913
								var5.method5417(var10, 1, var65 * 128, var65 * 128, var14 * 128, var15 * 128 + 128, var20, var21); // L: 914

								for (var22 = var16; var22 <= var17; ++var22) { // L: 915
									for (var23 = var14; var23 <= var15; ++var23) { // L: 916
										var10000 = class25.field110[var22][var65];
										var10000[var23] &= ~var7;
									}
								}
							}
						}

						if ((class25.field110[var63][var65][var64] & var8) != 0) { // L: 920
							var14 = var65; // L: 921
							var15 = var65; // L: 922
							var16 = var63; // L: 923

							for (var17 = var63; var14 > 0 && (class25.field110[var63][var14 - 1][var64] & var8) != 0; --var14) { // L: 924 925
							}

							while (var15 < var1 && (class25.field110[var63][var15 + 1][var64] & var8) != 0) { // L: 926
								++var15;
							}

							label511:
							while (var16 > 0) { // L: 927
								for (var18 = var14; var18 <= var15; ++var18) { // L: 928
									if ((class25.field110[var16 - 1][var18][var64] & var8) == 0) {
										break label511;
									}
								}

								--var16; // L: 929
							}

							label500:
							while (var17 < var10) { // L: 931
								for (var18 = var14; var18 <= var15; ++var18) { // L: 932
									if ((class25.field110[var17 + 1][var18][var64] & var8) == 0) {
										break label500;
									}
								}

								++var17; // L: 933
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16); // L: 935
							if (var18 >= 8) { // L: 936
								var66 = 240; // L: 937
								var20 = var3[var17][var14][var64] - var66; // L: 938
								var21 = var3[var16][var14][var64]; // L: 939
								var5.method5417(var10, 2, var14 * 128, var15 * 128 + 128, var64 * 128, var64 * 128, var20, var21); // L: 940

								for (var22 = var16; var22 <= var17; ++var22) { // L: 941
									for (var23 = var14; var23 <= var15; ++var23) { // L: 942
										var10000 = class25.field110[var22][var23];
										var10000[var64] &= ~var8;
									}
								}
							}
						}

						if ((class25.field110[var63][var65][var64] & var9) != 0) { // L: 946
							var14 = var65; // L: 947
							var15 = var65; // L: 948
							var16 = var64; // L: 949

							for (var17 = var64; var16 > 0 && (class25.field110[var63][var65][var16 - 1] & var9) != 0; --var16) { // L: 950 951
							}

							while (var17 < var2 && (class25.field110[var63][var65][var17 + 1] & var9) != 0) { // L: 952
								++var17;
							}

							label564:
							while (var14 > 0) { // L: 953
								for (var18 = var16; var18 <= var17; ++var18) { // L: 954
									if ((class25.field110[var63][var14 - 1][var18] & var9) == 0) {
										break label564;
									}
								}

								--var14; // L: 955
							}

							label553:
							while (var15 < var1) { // L: 957
								for (var18 = var16; var18 <= var17; ++var18) { // L: 958
									if ((class25.field110[var63][var15 + 1][var18] & var9) == 0) {
										break label553;
									}
								}

								++var15; // L: 959
							}

							if ((var15 - var14 + 1) * (var17 - var16 + 1) >= 4) { // L: 961
								var18 = var3[var63][var14][var16]; // L: 962
								var5.method5417(var10, 4, var14 * 128, var15 * 128 + 128, var16 * 128, var17 * 128 + 128, var18, var18); // L: 963

								for (var19 = var14; var19 <= var15; ++var19) { // L: 964
									for (var20 = var16; var20 <= var17; ++var20) { // L: 965
										var10000 = class25.field110[var63][var19];
										var10000[var20] &= ~var9;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 973

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264757193"
	)
	static void method708() {
		Client.field739 = true; // L: 1289
		if (Archive.varcs != null && Archive.varcs.method2862()) { // L: 1290
			Archive.varcs.write();
		}

		class132.method3099(); // L: 1291
		WorldMapElement.method3595(); // L: 1292
		if (Client.mouseRecorder != null) { // L: 1293
			Client.mouseRecorder.isRunning = false;
		}

		Client.mouseRecorder = null; // L: 1294
		Client.packetWriter.close(); // L: 1295
		if (GameEngine.taskHandler != null) { // L: 1296
			try {
				GameEngine.taskHandler.close(); // L: 1298
			} catch (Exception var3) { // L: 1300
			}
		}

		GameEngine.taskHandler = null; // L: 1302
		class96.method2471(); // L: 1303
		FloorOverlayDefinition.method4034(); // L: 1304
		class20.field91.method2677(); // L: 1305

		for (int var1 = 0; var1 < 4; ++var1) { // L: 1306
			if (class20.field91.field1317[var1] != null) { // L: 1307
				class20.field91.field1317[var1].clear(); // L: 1308
			}
		}

		VertexNormal.worldMap = null; // L: 1311
		class137.method3187(0, 0); // L: 1312
		WorldMapIcon_1.method4578(); // L: 1313
		Client.playingJingle = false; // L: 1314
		class60.method1172(); // L: 1315
		if (Projectile.pcmPlayer1 != null) { // L: 1316
			Projectile.pcmPlayer1.shutdown();
		}

		class233.field2486.method7282(); // L: 1317
		class380.method7094(); // L: 1318
		if (ByteArrayPool.urlRequester != null) { // L: 1319
			ByteArrayPool.urlRequester.close(); // L: 1320
		}

		MouseRecorder.method2386(); // L: 1322
		JagexCache.JagexCache_dat2File = null; // L: 1323
		JagexCache.JagexCache_idx255File = null; // L: 1324
		class163.JagexCache_idxFiles = null; // L: 1325
		class178.method3568(); // L: 1326
		MouseHandler.field224 = null; // L: 1327
		Client.archiveLoaders.clear(); // L: 1328
		Client.field574 = 0; // L: 1329
		class233.field2486 = new class388(); // L: 1330
		ByteArrayPool.urlRequester = new class117(class415.client.field549, 223); // L: 1331

		try {
			class216.method4191("oldschool", class401.field4618, class283.field3003.name, 0, 23); // L: 1333
		} catch (IOException var2) { // L: 1335
			throw new RuntimeException(var2); // L: 1336
		}

		MouseHandler.field224 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1338
		GameEngine.taskHandler = new TaskHandler(); // L: 1339
		class415.client.method505(); // L: 1340
		UserComparator7.method3008(class94.field1157); // L: 1341
		ClanChannelMember.method3282(0); // L: 1342
	} // L: 1343

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "1753991300"
	)
	static boolean method702(int var0, int var1, int var2, int var3, int var4, int var5) {
		return class111.method2849(class20.field91.field1318, var0, var1, var2, var3, var4, var5); // L: 8978
	}
}
