import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cy")
public class class68 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field480;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field469;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field471;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field472;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field473;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field474;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field496;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field476;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field487;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field470;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field479;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field488;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field481;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field482;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field478;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field484;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field485;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field486;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field475;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field483;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field489;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field490;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field491;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field492;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final class68 field493;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field497;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -2061426685
	)
	static int field477;

	static {
		field480 = new class68(); // L: 13586
		field469 = new class68(); // L: 13587
		field471 = new class68(); // L: 13588
		field472 = new class68(); // L: 13589
		field473 = new class68(); // L: 13590
		field474 = new class68(); // L: 13591
		field496 = new class68(); // L: 13592
		field476 = new class68(); // L: 13593
		field487 = new class68(); // L: 13594
		field470 = new class68(); // L: 13595
		field479 = new class68(); // L: 13596
		field488 = new class68(); // L: 13597
		field481 = new class68(); // L: 13598
		field482 = new class68(); // L: 13599
		field478 = new class68(); // L: 13600
		field484 = new class68(); // L: 13601
		field485 = new class68(); // L: 13602
		field486 = new class68(); // L: 13603
		field475 = new class68(); // L: 13604
		field483 = new class68(); // L: 13605
		field489 = new class68(); // L: 13606
		field490 = new class68(); // L: 13607
		field491 = new class68(); // L: 13608
		field492 = new class68(); // L: 13609
		field493 = new class68(); // L: 13610
	}

	class68() {
	} // L: 13612

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqu;FFFB)F",
		garbageValue = "1"
	)
	static float method1249(class426 var0, float var1, float var2, float var3) {
		float var4 = WorldMapLabel.method5003(var0.field4722, var0.field4723, var1); // L: 116
		if (Math.abs(var4) < class131.field1544) { // L: 117
			return var1;
		} else {
			float var5 = WorldMapLabel.method5003(var0.field4722, var0.field4723, var2); // L: 118
			if (Math.abs(var5) < class131.field1544) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class131.field1539 * Math.abs(var2) + var3 * 0.5F; // L: 147
					float var17 = (var6 - var2) * 0.5F; // L: 148
					boolean var18 = Math.abs(var17) > var16 && 0.0F != var5; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var1 == var6) { // L: 157
								var9 = var12 * var17 * 2.0F; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = var12 * ((var10 - var11) * 2.0F * var17 * var10 - (var2 - var1) * (var11 - 1.0F)); // L: 164
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (var9 * 2.0F < 3.0F * var17 * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var10 * 0.5F * var12)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = WorldMapLabel.method5003(var0.field4722, var0.field4723, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-647009043"
	)
	static int method1247(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4070
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4071
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class164.ItemComposition_get(var3).name; // L: 4072
			return 1; // L: 4073
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4075
				class130.Interpreter_intStackSize -= 2; // L: 4076
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4077
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4078
				var5 = class164.ItemComposition_get(var3); // L: 4079
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4080
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4081
				}

				return 1; // L: 4082
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4084
				class130.Interpreter_intStackSize -= 2; // L: 4085
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4086
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4087
				var5 = class164.ItemComposition_get(var3); // L: 4088
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4089
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4090
				}

				return 1; // L: 4091
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4093
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4094
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemComposition_get(var3).price; // L: 4095
				return 1; // L: 4096
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4098
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4099
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4100
				return 1; // L: 4101
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4103
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4104
					var4 = class164.ItemComposition_get(var3); // L: 4105
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4106
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3; // L: 4107
					}

					return 1; // L: 4108
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4110
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4111
					var4 = class164.ItemComposition_get(var3); // L: 4112
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4113
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3; // L: 4114
					}

					return 1; // L: 4115
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4117
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4118
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4119
					return 1; // L: 4120
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4122
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4123
					var4 = class164.ItemComposition_get(var3); // L: 4124
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4125
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3; // L: 4126
					}

					return 1; // L: 4127
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4129
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4130
					var4 = class164.ItemComposition_get(var3); // L: 4131
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4132
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3; // L: 4133
					}

					return 1; // L: 4134
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4136
					String var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4137
					var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4138
					class6.findItemDefinitions(var7, var6 == 1); // L: 4139
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = InterfaceParent.foundItemIdCount; // L: 4140
					return 1; // L: 4141
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4143
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4148
						MenuAction.foundItemIndex = 0; // L: 4149
						return 1; // L: 4150
					} else if (var0 == 4213) { // L: 4152
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4153
						var6 = class164.ItemComposition_get(var3).getShiftClickIndex(); // L: 4154
						if (var6 == -1) { // L: 4155
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6; // L: 4156
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6 + 1; // L: 4159
						}

						return 1; // L: 4161
					} else if (var0 == 4214) { // L: 4163
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4164
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemComposition_get(var3).field2229; // L: 4165
						return 1; // L: 4166
					} else if (var0 == 4215) { // L: 4168
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4169
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemComposition_get(var3).field2223; // L: 4170
						return 1; // L: 4171
					} else if (var0 == 4216) { // L: 4173
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4174
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemComposition_get(var3).field2231; // L: 4175
						return 1; // L: 4176
					} else if (var0 == 4217) { // L: 4178
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4179
						var4 = class164.ItemComposition_get(var3); // L: 4180
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.field2258; // L: 4181
						return 1; // L: 4182
					} else if (var0 == 4218) { // L: 4184
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4185
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class164.ItemComposition_get(var3).field2216; // L: 4186
						return 1; // L: 4187
					} else {
						return 2; // L: 4189
					}
				} else {
					if (WorldMapLabelSize.foundItemIds != null && MenuAction.foundItemIndex < InterfaceParent.foundItemIdCount) { // L: 4144
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = WorldMapLabelSize.foundItemIds[++MenuAction.foundItemIndex - 1] & '\uffff'; // L: 4145
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4146
				}
			}
		}
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "-78"
	)
	static String method1248(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 13376
		if (Client.gameBuild == 1) { // L: 13377
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 13378
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 13379
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 13380
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 13381
			var0 = "local";
		}

		String var3 = ""; // L: 13382
		if (class18.field81 != null) { // L: 13383
			var3 = "/p=" + class18.field81;
		}

		String var4 = "runescape.com"; // L: 13384
		return var2 + var0 + "." + var4 + "/l=" + BuddyRankComparator.clientLanguage + "/a=" + SpotAnimationDefinition.field2083 + var3 + "/"; // L: 13385
	}
}
