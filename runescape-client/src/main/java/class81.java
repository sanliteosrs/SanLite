import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class81 extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	final class101 field1024;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1563928111
	)
	final int field1020;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1437264679
	)
	final int field1015;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2076222903
	)
	final int field1016;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -129198571
	)
	final int field1017;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1080493665
	)
	final int field1018;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 289855771
	)
	final int field1013;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	SequenceDefinition field1019;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -405582099
	)
	int field1021;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 302909337
	)
	int field1022;

	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIIIZLkt;)V"
	)
	class81(class101 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.field1024 = var1; // L: 23
		this.field1020 = var2; // L: 24
		this.field1015 = var3; // L: 25
		this.field1016 = var4; // L: 26
		this.field1017 = var5; // L: 27
		this.field1018 = var6;
		this.field1013 = var7;
		if (var8 != -1) { // L: 30
			this.field1019 = class353.SequenceDefinition_get(var8);
			this.field1021 = 0;
			this.field1022 = Client.cycle - 1; // L: 33
			if (this.field1019.field2305 == 0 && var10 instanceof class81) { // L: 34
				class81 var11 = (class81)var10; // L: 35
				if (this.field1019 == var11.field1019) { // L: 36
					this.field1021 = var11.field1021; // L: 37
					this.field1022 = var11.field1022; // L: 38
					return; // L: 39
				}
			}

			if (var9 && this.field1019.frameCount != -1) { // L: 42
				if (!this.field1019.isCachedModelIdSet()) { // L: 43
					this.field1021 = (int)(Math.random() * (double)this.field1019.frameIds.length); // L: 44
					this.field1022 -= (int)(Math.random() * (double)this.field1019.frameLengths[this.field1021]); // L: 45
				} else {
					this.field1021 = (int)(Math.random() * (double)this.field1019.method4059()); // L: 48
				}
			}
		}

	} // L: 52

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = class10.getObjectDefinition(this.field1020); // L: 55
		if (var1.transforms != null) { // L: 56
			var1 = var1.transform();
		}

		if (var1 == null) { // L: 57
			return null;
		} else {
			int var2;
			int var3;
			if (this.field1016 != 1 && this.field1016 != 3) { // L: 60
				var2 = var1.sizeX; // L: 65
				var3 = var1.sizeY; // L: 66
			} else {
				var2 = var1.sizeY; // L: 61
				var3 = var1.sizeX; // L: 62
			}

			int var4 = (var2 >> 1) + this.field1018; // L: 68
			int var5 = (var2 + 1 >> 1) + this.field1018; // L: 69
			int var6 = (var3 >> 1) + this.field1013; // L: 70
			int var7 = (var3 + 1 >> 1) + this.field1013; // L: 71
			int[][] var8 = this.field1024.field1327[this.field1017]; // L: 72
			int var9 = var8[var5][var7] + var8[var4][var7] + var8[var5][var6] + var8[var4][var6] >> 2; // L: 73
			int var10 = (this.field1018 << 7) + (var2 << 6); // L: 74
			int var11 = (this.field1013 << 7) + (var3 << 6); // L: 75
			if (this.field1019 != null) { // L: 76
				int var12 = Client.cycle - this.field1022; // L: 77
				if (var12 > 100 && this.field1019.frameCount > 0) { // L: 78
					var12 = 100;
				}

				if (!this.field1019.isCachedModelIdSet()) { // L: 79
					label61: {
						do {
							while (true) {
								if (var12 <= this.field1019.frameLengths[this.field1021]) { // L: 80
									break label61;
								}

								var12 -= this.field1019.frameLengths[this.field1021]; // L: 81
								++this.field1021; // L: 82
								if (this.field1021 >= this.field1019.frameIds.length) { // L: 83
									this.field1021 -= this.field1019.frameCount; // L: 84
									break;
								}

								class188.method3684(this.field1019, this.field1021, var10, var11, false); // L: 91
							}
						} while(this.field1021 >= 0 && this.field1021 < this.field1019.frameIds.length); // L: 85

						this.field1019 = null; // L: 86
					}
				} else {
					int var13 = this.field1019.method4059(); // L: 96
					this.field1021 += var12; // L: 97
					var12 = 0; // L: 98
					if (this.field1021 >= var13) { // L: 99
						this.field1021 = var13 - this.field1019.frameCount; // L: 100
						if (this.field1021 < 0 || this.field1021 > var13) { // L: 101
							this.field1019 = null; // L: 102
						}
					}

					if (this.field1019 != null) { // L: 105
						WorldMapLabelSize.method4571(this.field1019, this.field1021, var10, var11, false); // L: 106
					}
				}

				this.field1022 = Client.cycle - var12; // L: 109
			}

			return var1.getModelDynamic(this.field1015, this.field1016, var8, var10, var9, var11, this.field1019, this.field1021); // L: 111
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lqi;",
		garbageValue = "72"
	)
	public static class423 method2270() {
		synchronized(class423.field4701) { // L: 28
			if (class423.field4698 == 0) { // L: 29
				return new class423();
			} else {
				class423.field4701[--class423.field4698].method7762(); // L: 31
				return class423.field4701[class423.field4698]; // L: 32
			}
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Ldb;IIIII)V",
		garbageValue = "2048531961"
	)
	static final void method2266(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.field1140 != Client.field706) { // L: 11180
			if (Client.menuOptionsCount < 400) { // L: 11181
				String var5;
				if (var0.field1124 == 0) { // L: 11183
					var5 = var0.field1122[0] + var0.username + var0.field1122[1] + class205.method3908(var0.field1121, SoundCache.localPlayer.field1121) + " " + " (" + "level-" + var0.field1121 + ")" + var0.field1122[2];
				} else {
					var5 = var0.field1122[0] + var0.username + var0.field1122[1] + " " + " (" + "skill-" + var0.field1124 + ")" + var0.field1122[2]; // L: 11184
				}

				int var6;
				if (Client.isItemSelected == 1) { // L: 11185
					WorldMapArea.method4699("Use", Client.field642 + " " + "->" + " " + class191.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4); // L: 11186
				} else if (Client.isSpellSelected) { // L: 11189
					if ((class92.field1114 & 8) == 8) { // L: 11190
						WorldMapArea.method4699(Client.field669, Client.field670 + " " + "->" + " " + class191.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4); // L: 11191
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) { // L: 11196
						if (Client.field686[var6] != null) { // L: 11197
							short var7 = 0; // L: 11198
							if (Client.field686[var6].equalsIgnoreCase("Attack")) { // L: 11199
								if (Client.playerAttackOption == AttackOption.field1382) { // L: 11200
									continue;
								}

								if (AttackOption.field1381 == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.field1121 > SoundCache.localPlayer.field1121) { // L: 11201
									var7 = 2000; // L: 11202
								}

								if (SoundCache.localPlayer.field1143 != 0 && var0.field1143 != 0) { // L: 11204
									if (var0.field1143 == SoundCache.localPlayer.field1143) { // L: 11205
										var7 = 2000;
									} else {
										var7 = 0; // L: 11206
									}
								} else if (AttackOption.field1384 == Client.playerAttackOption && var0.method2413()) { // L: 11208
									var7 = 2000; // L: 11209
								}
							} else if (Client.field638[var6]) { // L: 11212
								var7 = 2000;
							}

							boolean var8 = false; // L: 11213
							int var9 = Client.field636[var6] + var7; // L: 11214
							WorldMapArea.method4699(Client.field686[var6], class191.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4); // L: 11215
						}
					}
				}

				for (var6 = 0; var6 < Client.menuOptionsCount; ++var6) { // L: 11220
					if (Client.menuOpcodes[var6] == 23) { // L: 11221
						Client.menuTargets[var6] = class191.colorStartTag(16777215) + var5; // L: 11222
						break;
					}
				}

			}
		}
	} // L: 11226
}
