import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class201 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field2110;

	static {
		field2110 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZS)Ljava/lang/String;",
		garbageValue = "8489"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 116
			int var3 = var0; // L: 118
			String var2;
			if (var1 && var0 >= 0) { // L: 121
				int var4 = 2; // L: 125

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 126 127 129
					var5 /= 10; // L: 128
				}

				char[] var6 = new char[var4]; // L: 131
				var6[0] = '+'; // L: 132

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 133
					int var8 = var3; // L: 134
					var3 /= 10; // L: 135
					int var9 = var8 - var3 * 10; // L: 136
					if (var9 >= 10) { // L: 137
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 138
					}
				}

				var2 = new String(var6); // L: 140
			} else {
				var2 = Integer.toString(var0, 10); // L: 122
			}

			return var2; // L: 142
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "-1721987072"
	)
	static void method3827(class101 var0) {
		int var1 = var0.field1332 / 8; // L: 6529
		int var2 = var0.field1320 / 8; // L: 6530
		boolean var3 = false; // L: 6531
		class7.method55(false); // L: 6532
		var3 = true; // L: 6533

		int var4;
		for (var4 = 0; var4 < class492.field5041.length; ++var4) { // L: 6534
			if (class30.field147[var4] != -1 && class492.field5041[var4] == null) { // L: 6535 6536
				class492.field5041[var4] = class157.field1756.takeFile(class30.field147[var4], 0); // L: 6537
				if (class492.field5041[var4] == null) { // L: 6538
					var3 = false; // L: 6539
				}
			}

			if (class147.field1696[var4] != -1 && class366.field4005[var4] == null) { // L: 6543 6544
				class366.field4005[var4] = class157.field1756.takeFileEncrypted(class147.field1696[var4], 0, ApproximateRouteStrategy.field460[var4]); // L: 6545
				if (class366.field4005[var4] == null) { // L: 6546
					var3 = false; // L: 6547
				}
			}
		}

		if (var3) { // L: 6552
			class7.method55(false); // L: 6553
			var3 = true; // L: 6554

			for (var4 = 0; var4 < class492.field5041.length; ++var4) { // L: 6555
				byte[] var17 = class366.field4005[var4]; // L: 6556
				if (var17 != null) { // L: 6557
					byte var6 = 10; // L: 6558
					byte var7 = 10; // L: 6559
					var3 &= class4.method16(var17, var6, var7); // L: 6560
				}
			}

			if (var3) { // L: 6563
				int var5;
				for (var4 = 0; var4 < 4; ++var4) { // L: 6564
					for (var5 = 0; var5 < var0.field1325[var4].length; ++var5) { // L: 6565
						Arrays.fill(var0.field1325[var4][var5], (byte)0); // L: 6566
					}
				}

				class157.method3347(); // L: 6569
				class224.method4301(); // L: 6570
				class60.method1172(); // L: 6571
				class7.method55(true); // L: 6572

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) { // L: 6573
					class157.method3347(); // L: 6574

					for (var5 = 0; var5 < var1; ++var5) { // L: 6575
						for (var18 = 0; var18 < var2; ++var18) { // L: 6576
							boolean var19 = false; // L: 6577
							var8 = Client.field683[var4][var5][var18]; // L: 6578
							if (var8 != -1) { // L: 6579
								var9 = var8 >> 24 & 3; // L: 6580
								var10 = var8 >> 1 & 3; // L: 6581
								var11 = var8 >> 14 & 1023; // L: 6582
								var12 = var8 >> 3 & 2047; // L: 6583
								var13 = (var11 / 8 << 8) + var12 / 8; // L: 6584

								for (int var14 = 0; var14 < class284.field3014.length; ++var14) { // L: 6585
									if (class284.field3014[var14] == var13 && class492.field5041[var14] != null) { // L: 6586
										int var15 = (var11 - var5) * 8; // L: 6587
										int var16 = (var12 - var18) * 8; // L: 6588
										FileSystem.method4224(var0, class492.field5041[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16); // L: 6589
										var19 = true; // L: 6590
										break;
									}
								}
							}

							if (!var19) { // L: 6595
								ScriptFrame.method1193(var0.field1327, var4, var5 * 8, var18 * 8); // L: 6596
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) { // L: 6601
					for (var5 = 0; var5 < 13; ++var5) { // L: 6602
						var18 = Client.field683[0][var4][var5]; // L: 6603
						if (var18 == -1) { // L: 6604
							TextureProvider.method5720(var0, var4 * 8, var5 * 8, 8, 8); // L: 6605
						}
					}
				}

				class7.method55(true); // L: 6609

				for (var4 = 0; var4 < 4; ++var4) { // L: 6610
					class157.method3347(); // L: 6611

					for (var5 = 0; var5 < var1; ++var5) { // L: 6612
						for (var18 = 0; var18 < var2; ++var18) { // L: 6613
							int var20 = Client.field683[var4][var5][var18]; // L: 6614
							if (var20 != -1) { // L: 6615
								var8 = var20 >> 24 & 3; // L: 6616
								var9 = var20 >> 1 & 3; // L: 6617
								var10 = var20 >> 14 & 1023; // L: 6618
								var11 = var20 >> 3 & 2047; // L: 6619
								var12 = (var10 / 8 << 8) + var11 / 8; // L: 6620

								for (var13 = 0; var13 < class284.field3014.length; ++var13) { // L: 6621
									if (class284.field3014[var13] == var12 && class366.field4005[var13] != null) { // L: 6622
										class83.method2287(var0, class366.field4005[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9); // L: 6623
										break; // L: 6624
									}
								}
							}
						}
					}
				}

				class7.method55(true); // L: 6631
				class157.method3347(); // L: 6632
				class36.method709(var0); // L: 6633
				class7.method55(true); // L: 6634
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6635
				class157.method3347(); // L: 6636
				class328.method6151(); // L: 6637
				Client.field510 = false; // L: 6638
			}
		}
	} // L: 6639
}
