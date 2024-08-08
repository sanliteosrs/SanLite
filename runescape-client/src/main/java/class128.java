import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ef")
public enum class128 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	field1524(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	field1520(4, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	field1519(2, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	field1525(3, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	field1521(1, 4);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -788619659
	)
	static int field1517;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1225591323
	)
	public final int field1522;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 961190565
	)
	@Export("id")
	final int id;

	class128(int var3, int var4) {
		this.field1522 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfd;FB)F",
		garbageValue = "14"
	)
	static float method3050(class135 var0, float var1) {
		if (var0 != null && var0.method3150() != 0) { // L: 20
			if (var1 < (float)var0.field1579[0].field1526) { // L: 23
				return var0.field1580 == class133.field1565 ? var0.field1579[0].field1527 : class189.method3695(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1579[var0.method3150() - 1].field1526) { // L: 29
				return var0.field1583 == class133.field1565 ? var0.field1579[var0.method3150() - 1].field1527 : class189.method3695(var0, var1, false); // L: 30 31 33
			} else if (var0.field1576) { // L: 35
				return var0.field1579[0].field1527; // L: 36
			} else {
				class130 var2 = var0.method3159(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 169
				} else {
					float var5;
					float var6;
					float var7;
					if (0.0D == (double)var2.field1535 && 0.0D == (double)var2.field1531) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1535 && Float.MAX_VALUE == var2.field1531) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1532 != null) { // L: 48
						if (var0.field1578) { // L: 49
							var5 = (float)var2.field1526; // L: 58
							float var9 = var2.field1527; // L: 59
							var6 = var5 + var2.field1535 * 0.33333334F; // L: 60
							float var10 = var2.field1531 * 0.33333334F + var9; // L: 61
							float var8 = (float)var2.field1532.field1526; // L: 62
							float var12 = var2.field1532.field1527; // L: 63
							var7 = var8 - 0.33333334F * var2.field1532.field1528; // L: 64
							float var11 = var12 - var2.field1532.field1529 * 0.33333334F; // L: 65
							if (var0.field1575) { // L: 66
								class33.method480(var0, var5, var6, var7, var8, var9, var10, var11, var12); // L: 67
							} else if (var0 != null) { // L: 71
								var0.field1592 = var5; // L: 74
								float var13 = var8 - var5; // L: 75
								float var14 = var12 - var9; // L: 76
								float var15 = var6 - var5; // L: 77
								float var16 = 0.0F; // L: 78
								float var17 = 0.0F; // L: 79
								if (0.0D != (double)var15) { // L: 80
									var16 = (var10 - var9) / var15; // L: 81
								}

								var15 = var8 - var7; // L: 83
								if ((double)var15 != 0.0D) { // L: 84
									var17 = (var12 - var11) / var15; // L: 85
								}

								float var18 = 1.0F / (var13 * var13); // L: 87
								float var19 = var16 * var13; // L: 88
								float var20 = var13 * var17; // L: 89
								var0.field1581 = var18 * (var20 + var19 - var14 - var14) / var13; // L: 90
								var0.field1590 = (var14 + var14 + var14 - var19 - var19 - var20) * var18; // L: 91
								var0.field1585 = var16; // L: 92
								var0.field1586 = var9; // L: 93
							}

							var0.field1578 = false; // L: 96
						}
					} else {
						var3 = true; // L: 100
					}

					if (var3) { // L: 102
						return var2.field1527; // L: 103
					} else if (var4) { // L: 105
						return var1 != (float)var2.field1526 && var2.field1532 != null ? var2.field1532.field1527 : var2.field1527; // L: 106 107 110
					} else if (var0.field1575) { // L: 113
						if (var0 == null) { // L: 116
							var5 = 0.0F; // L: 117
						} else {
							if (var0.field1592 == var1) { // L: 121
								var6 = 0.0F; // L: 122
							} else if (var1 == var0.field1591) { // L: 124
								var6 = 1.0F; // L: 125
							} else {
								var6 = (var1 - var0.field1592) / (var0.field1591 - var0.field1592); // L: 128
							}

							if (var0.field1594) { // L: 131
								var7 = var6; // L: 132
							} else {
								class131.field1540[3] = var0.field1586; // L: 135
								class131.field1540[2] = var0.field1585; // L: 136
								class131.field1540[1] = var0.field1590; // L: 137
								class131.field1540[0] = var0.field1581 - var6; // L: 138
								class131.field1542[0] = 0.0F; // L: 139
								class131.field1542[1] = 0.0F; // L: 140
								class131.field1542[2] = 0.0F; // L: 141
								class131.field1542[3] = 0.0F; // L: 142
								class131.field1542[4] = 0.0F; // L: 143
								int var21 = DirectByteArrayCopier.method7035(class131.field1540, 3, 0.0F, true, 1.0F, true, class131.field1542); // L: 144
								if (var21 == 1) { // L: 145
									var7 = class131.field1542[0]; // L: 146
								} else {
									var7 = 0.0F; // L: 149
								}
							}

							var5 = var0.field1587 + (var7 * (var0.field1582 * var7 + var0.field1589) + var0.field1588) * var7; // L: 152
						}

						return var5; // L: 154
					} else {
						if (var0 == null) { // L: 159
							var5 = 0.0F; // L: 160
						} else {
							var6 = var1 - var0.field1592; // L: 163
							var5 = var0.field1586 + var6 * (var0.field1585 + (var0.field1581 * var6 + var0.field1590) * var6); // L: 164
						}

						return var5; // L: 166
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1095298527"
	)
	static int method3049(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 567
		Widget var4;
		if (var0 >= 2000) { // L: 569
			var0 -= 1000; // L: 570
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 571
			var4 = ModeWhere.field4649.method6519(var3); // L: 572
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 574
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 575
			class130.Interpreter_intStackSize -= 4; // L: 576
			var4.rawX = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 577
			var4.rawY = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 578
			var4.xAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 579
			var4.yAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 580
			TriBool.invalidateWidget(var4); // L: 581
			class415.client.alignWidget(var4); // L: 582
			if (var3 != -1 && var4.type == 0) { // L: 583
				class238.revalidateWidgetScroll(ModeWhere.field4649.field3740[var3 >> 16], var4, false);
			}

			return 1; // L: 584
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 586
			class130.Interpreter_intStackSize -= 4; // L: 587
			var4.rawWidth = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 588
			var4.rawHeight = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 589
			var4.widthAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 590
			var4.heightAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 591
			TriBool.invalidateWidget(var4); // L: 592
			class415.client.alignWidget(var4); // L: 593
			if (var3 != -1 && var4.type == 0) { // L: 594
				class238.revalidateWidgetScroll(ModeWhere.field4649.field3740[var3 >> 16], var4, false);
			}

			return 1; // L: 595
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 597
			boolean var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 598
			if (var5 != var4.isHidden) { // L: 599
				var4.isHidden = var5; // L: 600
				TriBool.invalidateWidget(var4); // L: 601
			}

			return 1; // L: 603
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 605
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 606
			return 1; // L: 607
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 609
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 610
			return 1; // L: 611
		} else {
			return 2; // L: 613
		}
	}
}
