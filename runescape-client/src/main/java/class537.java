import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("um")
public class class537 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field5294;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("DBTableType_cache")
	public static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("ag")
	public int[][] field5296;
	@ObfuscatedName("ak")
	public Object[][] field5297;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	class537() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-101301944"
	)
	void method9435(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.method9442(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "2081586782"
	)
	void method9442(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			int var3 = var1.readUnsignedByte(); // L: 43
			if (this.field5296 == null) { // L: 44
				this.field5296 = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 45 46 73
				int var5 = var4 & 127; // L: 47
				boolean var6 = (var4 & 128) != 0; // L: 48
				int[] var7 = new int[var1.readUnsignedByte()]; // L: 49

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 50
					var7[var8] = var1.readUShortSmart(); // L: 51
				}

				this.field5296[var5] = var7; // L: 53
				if (var6) { // L: 54
					if (this.field5297 == null) { // L: 55
						this.field5297 = new Object[this.field5296.length][];
					}

					Object[][] var17 = this.field5297; // L: 56
					int var11 = var1.readUShortSmart(); // L: 60
					Object[] var12 = new Object[var7.length * var11]; // L: 61

					for (int var13 = 0; var13 < var11; ++var13) { // L: 62
						for (int var14 = 0; var14 < var7.length; ++var14) { // L: 63
							int var15 = var14 + var7.length * var13; // L: 64
							class534 var16 = AttackOption.method2792(var7[var14]); // L: 65
							var12[var15] = var16.method9409(var1); // L: 66
						}
					}

					var17[var5] = var12; // L: 71
				}
			}
		}

	} // L: 77

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method9436() {
	} // L: 79

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "2111951717"
	)
	public static String method9449(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class276.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4); // L: 25
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-387580854"
	)
	static int method9448(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 477
			class130.Interpreter_intStackSize -= 3; // L: 478
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 479
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 480
			int var11 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 481
			if (var4 == 0) { // L: 482
				throw new RuntimeException(); // L: 483
			} else {
				Widget var6 = ModeWhere.field4649.method6519(var9); // L: 485
				if (var6.children == null) { // L: 486
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 487
					Widget[] var7 = new Widget[var11 + 1]; // L: 488

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 489
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 490
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1)); // L: 492
				} else {
					Widget var12 = new Widget(); // L: 493
					var12.type = var4; // L: 494
					var12.parentId = var12.id = var6.id; // L: 495
					var12.childIndex = var11; // L: 496
					var12.isIf3 = true; // L: 497
					if (var4 == 12) { // L: 498
						var12.method6888(); // L: 499
						var12.method6991().method6631(new class108(var12)); // L: 500
						var12.method6991().method6630(new class109(var12)); // L: 510
					}

					var6.children[var11] = var12; // L: 521
					if (var2) { // L: 522
						Interpreter.scriptDotWidget = var12;
					} else {
						class30.field142 = var12; // L: 523
					}

					TriBool.invalidateWidget(var6); // L: 524
					return 1; // L: 525
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 527
				var3 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 528
				Widget var10 = ModeWhere.field4649.method6519(var3.id); // L: 529
				var10.children[var3.childIndex] = null; // L: 530
				TriBool.invalidateWidget(var10); // L: 531
				return 1; // L: 532
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 534
				var3 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 535
				var3.children = null; // L: 536
				TriBool.invalidateWidget(var3); // L: 537
				return 1; // L: 538
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 540
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 553
					var3 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 554
					if (var3 != null) { // L: 555
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 556
						if (var2) { // L: 557
							Interpreter.scriptDotWidget = var3;
						} else {
							class30.field142 = var3; // L: 558
						}
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 560
					}

					return 1; // L: 561
				} else {
					return 2; // L: 563
				}
			} else {
				class130.Interpreter_intStackSize -= 2; // L: 541
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 542
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 543
				Widget var5 = ModeWhere.field4649.method6513(var9, var4); // L: 544
				if (var5 != null && var4 != -1) { // L: 545
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 546
					if (var2) { // L: 547
						Interpreter.scriptDotWidget = var5;
					} else {
						class30.field142 = var5; // L: 548
					}
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 550
				}

				return 1; // L: 551
			}
		}
	}
}
