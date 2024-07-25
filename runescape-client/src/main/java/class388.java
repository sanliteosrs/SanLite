import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oe")
public class class388 {
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field4545;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	AbstractSocket field4547;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1469341211
	)
	int field4567;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -831200158254530275L
	)
	long field4548;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4554;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 893442467
	)
	int field4550;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4551;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1839274781
	)
	int field4552;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	DualNodeDeque field4553;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4562;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -175499425
	)
	int field4555;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4556;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 538790613
	)
	int field4557;
	@ObfuscatedName("ay")
	boolean field4558;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	class386 field4543;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field4560;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field4561;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2124691059
	)
	int field4546;
	@ObfuscatedName("af")
	CRC32 field4571;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field4564;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	Archive[] field4565;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1848769151
	)
	int field4566;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1957149133
	)
	int field4559;
	@ObfuscatedName("be")
	byte field4568;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -784341467
	)
	public int field4569;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -944356257
	)
	public int field4570;

	public class388() {
		this.field4567 = 0; // L: 19
		this.field4554 = new NodeHashTable(4096); // L: 21
		this.field4550 = 0; // L: 22
		this.field4551 = new NodeHashTable(32); // L: 23
		this.field4552 = 0; // L: 24
		this.field4553 = new DualNodeDeque(); // L: 25
		this.field4562 = new NodeHashTable(4096); // L: 26
		this.field4555 = 0; // L: 27
		this.field4556 = new NodeHashTable(4096); // L: 28
		this.field4557 = 0; // L: 29
		this.field4560 = new Buffer(8); // L: 32
		this.field4546 = 0; // L: 34
		this.field4571 = new CRC32(); // L: 36
		this.field4565 = new Archive[256]; // L: 38
		this.field4566 = -1; // L: 39
		this.field4559 = 255; // L: 40
		this.field4568 = 0; // L: 41
		this.field4569 = 0; // L: 42
		this.field4570 = 0; // L: 43
	} // L: 45

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-70"
	)
	public boolean method7270() {
		long var1 = WorldMapData_1.method4861(); // L: 48
		int var3 = (int)(var1 - this.field4548); // L: 49
		this.field4548 = var1; // L: 50
		if (var3 > 200) { // L: 51
			var3 = 200;
		}

		this.field4567 += var3; // L: 52
		if (this.field4557 == 0 && this.field4552 == 0 && this.field4555 == 0 && this.field4550 == 0) { // L: 53
			return true;
		} else if (this.field4547 == null) { // L: 54
			return false;
		} else {
			try {
				if (this.field4567 > 30000) { // L: 56
					throw new IOException();
				} else {
					class386 var4;
					Buffer var5;
					while (this.field4552 < 200 && this.field4550 > 0) { // L: 57
						var4 = (class386)this.field4554.first(); // L: 58
						var5 = new Buffer(4); // L: 59
						var5.writeByte(1); // L: 60
						var5.method9542((int)var4.key); // L: 61
						this.field4547.write(var5.array, 0, 4); // L: 62
						this.field4551.put(var4, var4.key); // L: 63
						--this.field4550; // L: 64
						++this.field4552; // L: 65
					}

					while (this.field4557 < 200 && this.field4555 > 0) { // L: 67
						var4 = (class386)this.field4553.removeLast(); // L: 68
						var5 = new Buffer(4); // L: 69
						var5.writeByte(0); // L: 70
						var5.method9542((int)var4.key); // L: 71
						this.field4547.write(var5.array, 0, 4); // L: 72
						var4.removeDual(); // L: 73
						this.field4556.put(var4, var4.key); // L: 74
						--this.field4555; // L: 75
						++this.field4557; // L: 76
					}

					for (int var16 = 0; var16 < 100; ++var16) { // L: 78
						int var17 = this.field4547.vmethod8729(); // L: 79
						if (var17 < 0) { // L: 80
							throw new IOException();
						}

						if (var17 == 0) { // L: 81
							break;
						}

						this.field4567 = 0; // L: 82
						byte var6 = 0; // L: 83
						if (this.field4543 == null) { // L: 84
							var6 = 8;
						} else if (this.field4546 == 0) { // L: 85
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) { // L: 86
							var7 = var6 - this.field4560.offset; // L: 87
							if (var7 > var17) { // L: 88
								var7 = var17;
							}

							this.field4547.read(this.field4560.array, this.field4560.offset, var7); // L: 89
							if (this.field4568 != 0) { // L: 90
								for (var8 = 0; var8 < var7; ++var8) { // L: 91
									var10000 = this.field4560.array;
									var10001 = this.field4560.offset + var8;
									var10000[var10001] ^= this.field4568;
								}
							}

							var22 = this.field4560; // L: 93
							var22.offset += var7;
							if (this.field4560.offset < var6) { // L: 94
								break;
							}

							if (this.field4543 == null) { // L: 95
								this.field4560.offset = 0; // L: 96
								var8 = this.field4560.readUnsignedByte(); // L: 97
								var9 = this.field4560.readUnsignedShort(); // L: 98
								int var10 = this.field4560.readUnsignedByte(); // L: 99
								int var11 = this.field4560.readInt(); // L: 100
								long var12 = (long)(var9 + (var8 << 16)); // L: 101
								class386 var14 = (class386)this.field4551.get(var12); // L: 102
								this.field4558 = true; // L: 103
								if (var14 == null) { // L: 104
									var14 = (class386)this.field4556.get(var12); // L: 105
									this.field4558 = false; // L: 106
								}

								if (var14 == null) { // L: 108
									throw new IOException(); // L: 109
								}

								int var15 = var10 == 0 ? 5 : 9; // L: 111
								this.field4543 = var14; // L: 112
								this.field4561 = new Buffer(this.field4543.field4522 + var11 + var15); // L: 113
								this.field4561.writeByte(var10); // L: 114
								this.field4561.writeInt(var11); // L: 115
								this.field4546 = 8; // L: 116
								this.field4560.offset = 0; // L: 117
							} else if (this.field4546 == 0) { // L: 120
								if (this.field4560.array[0] == -1) { // L: 121
									this.field4546 = 1; // L: 122
									this.field4560.offset = 0; // L: 123
								} else {
									this.field4543 = null; // L: 127
								}
							}
						} else {
							var7 = this.field4561.array.length - this.field4543.field4522; // L: 133
							var8 = 512 - this.field4546; // L: 134
							if (var8 > var7 - this.field4561.offset) { // L: 135
								var8 = var7 - this.field4561.offset;
							}

							if (var8 > var17) { // L: 136
								var8 = var17;
							}

							this.field4547.read(this.field4561.array, this.field4561.offset, var8); // L: 137
							if (this.field4568 != 0) { // L: 138
								for (var9 = 0; var9 < var8; ++var9) { // L: 139
									var10000 = this.field4561.array;
									var10001 = this.field4561.offset + var9;
									var10000[var10001] ^= this.field4568;
								}
							}

							var22 = this.field4561; // L: 141
							var22.offset += var8;
							this.field4546 += var8; // L: 142
							if (this.field4561.offset == var7) { // L: 143
								if (16711935L == this.field4543.key) { // L: 144
									this.field4564 = this.field4561; // L: 145

									for (var9 = 0; var9 < 256; ++var9) { // L: 146
										Archive var18 = this.field4565[var9]; // L: 147
										if (var18 != null) { // L: 148
											this.method7292(var18, var9); // L: 149
										}
									}
								} else {
									this.field4571.reset(); // L: 154
									this.field4571.update(this.field4561.array, 0, var7); // L: 155
									var9 = (int)this.field4571.getValue(); // L: 156
									if (this.field4543.field4524 != var9) { // L: 157
										try {
											this.field4547.close(); // L: 159
										} catch (Exception var20) { // L: 161
										}

										++this.field4569; // L: 162
										this.field4547 = null; // L: 163
										this.field4568 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 164
										return false; // L: 165
									}

									this.field4569 = 0; // L: 167
									this.field4570 = 0; // L: 168
									this.field4543.field4523.write((int)(this.field4543.key & 65535L), this.field4561.array, 16711680L == (this.field4543.key & 16711680L), this.field4558); // L: 169
								}

								this.field4543.remove(); // L: 171
								if (this.field4558) { // L: 172
									--this.field4552;
								} else {
									--this.field4557; // L: 173
								}

								this.field4546 = 0; // L: 174
								this.field4543 = null; // L: 175
								this.field4561 = null; // L: 176
							} else {
								if (this.field4546 != 512) { // L: 178
									break;
								}

								this.field4546 = 0;
							}
						}
					}

					return true; // L: 182
				}
			} catch (IOException var21) {
				try {
					this.field4547.close(); // L: 186
				} catch (Exception var19) { // L: 188
				}

				++this.field4570; // L: 189
				this.field4547 = null; // L: 190
				return false; // L: 191
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "95"
	)
	public void method7271(boolean var1) {
		if (this.field4547 != null) { // L: 196
			try {
				Buffer var2 = new Buffer(4); // L: 198
				var2.writeByte(var1 ? 2 : 3); // L: 199
				var2.method9542(0); // L: 200
				this.field4547.write(var2.array, 0, 4); // L: 201
			} catch (IOException var5) {
				try {
					this.field4547.close(); // L: 205
				} catch (Exception var4) { // L: 207
				}

				++this.field4570; // L: 208
				this.field4547 = null; // L: 209
			}

		}
	} // L: 211

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lsp;ZB)V",
		garbageValue = "-26"
	)
	public void method7272(AbstractSocket var1, boolean var2) {
		if (this.field4547 != null) { // L: 214
			try {
				this.field4547.close(); // L: 216
			} catch (Exception var7) { // L: 218
			}

			this.field4547 = null; // L: 219
		}

		this.field4547 = var1; // L: 221
		this.method7271(var2); // L: 222
		this.field4560.offset = 0; // L: 223
		this.field4543 = null; // L: 224
		this.field4561 = null; // L: 225
		this.field4546 = 0; // L: 226

		while (true) {
			class386 var3 = (class386)this.field4551.first(); // L: 228
			if (var3 == null) { // L: 229
				while (true) {
					var3 = (class386)this.field4556.first(); // L: 235
					if (var3 == null) { // L: 236
						if (this.field4568 != 0) { // L: 242
							try {
								Buffer var8 = new Buffer(4); // L: 244
								var8.writeByte(4); // L: 245
								var8.writeByte(this.field4568); // L: 246
								var8.writeShort(0); // L: 247
								this.field4547.write(var8.array, 0, 4); // L: 248
							} catch (IOException var6) {
								try {
									this.field4547.close(); // L: 252
								} catch (Exception var5) { // L: 254
								}

								++this.field4570; // L: 255
								this.field4547 = null; // L: 256
							}
						}

						this.field4567 = 0; // L: 259
						this.field4548 = WorldMapData_1.method4861(); // L: 260
						return; // L: 261
					}

					this.field4553.method7436(var3); // L: 237
					this.field4562.put(var3, var3.key); // L: 238
					++this.field4555; // L: 239
					--this.field4557; // L: 240
				}
			}

			this.field4554.put(var3, var3.key); // L: 230
			++this.field4550; // L: 231
			--this.field4552; // L: 232
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Loz;II)V",
		garbageValue = "-1515384832"
	)
	void method7273(Archive var1, int var2) {
		if (var1.field4490 && !var1.field4488) { // L: 264
			if (var2 <= this.field4566) { // L: 265
				throw new RuntimeException(""); // L: 266
			}

			if (var2 < this.field4559) { // L: 268
				this.field4559 = var2; // L: 269
			}
		} else {
			if (var2 >= this.field4559) { // L: 273
				throw new RuntimeException(""); // L: 274
			}

			if (var2 > this.field4566) { // L: 276
				this.field4566 = var2; // L: 277
			}
		}

		if (this.field4564 != null) { // L: 280
			this.method7292(var1, var2); // L: 281
		} else {
			this.method7275((Archive)null, class385.field4513.field4518, 255, 0, (byte)0, true); // L: 284
			this.field4565[var2] = var1; // L: 285
		}
	} // L: 282 286

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Loz;II)V",
		garbageValue = "1266819270"
	)
	void method7292(Archive var1, int var2) {
		this.field4564.offset = var2 * 8 + 5; // L: 289
		if (this.field4564.offset >= this.field4564.array.length) { // L: 290
			if (var1.field4490) { // L: 291
				var1.method7132(); // L: 292
			} else {
				throw new RuntimeException(""); // L: 295
			}
		} else {
			int var3 = this.field4564.readInt(); // L: 297
			int var4 = this.field4564.readInt(); // L: 298
			var1.loadIndex(var3, var4); // L: 299
		}
	} // L: 293 300

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Loz;IIIBZI)V",
		garbageValue = "-561026136"
	)
	void method7275(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16)); // L: 303
		class386 var9 = (class386)this.field4554.get(var7); // L: 304
		if (var9 == null) { // L: 305
			var9 = (class386)this.field4551.get(var7); // L: 306
			if (var9 == null) { // L: 307
				var9 = (class386)this.field4562.get(var7); // L: 308
				if (var9 != null) { // L: 309
					if (var6) { // L: 310
						var9.removeDual(); // L: 311
						this.field4554.put(var9, var7); // L: 312
						--this.field4555; // L: 313
						++this.field4550; // L: 314
					}

				} else {
					if (!var6) { // L: 318
						var9 = (class386)this.field4556.get(var7); // L: 319
						if (var9 != null) { // L: 320
							return;
						}
					}

					var9 = new class386(); // L: 322
					var9.field4523 = var1; // L: 323
					var9.field4524 = var4; // L: 324
					var9.field4522 = var5; // L: 325
					if (var6) { // L: 326
						this.field4554.put(var9, var7); // L: 327
						++this.field4550; // L: 328
					} else {
						this.field4553.method7435(var9); // L: 331
						this.field4562.put(var9, var7); // L: 332
						++this.field4555; // L: 333
					}

				}
			}
		}
	} // L: 316 335

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-59"
	)
	void method7279(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 338
		class386 var5 = (class386)this.field4562.get(var3); // L: 339
		if (var5 != null) { // L: 340
			this.field4553.method7436(var5); // L: 341
		}
	} // L: 342

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-256203628"
	)
	int method7285(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2); // L: 345
		return this.field4543 != null && this.field4543.key == var3 ? this.field4561.offset * 99 / (this.field4561.array.length - this.field4543.field4522) + 1 : 0; // L: 346 347
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "43"
	)
	public int method7278(boolean var1, boolean var2) {
		byte var3 = 0; // L: 351
		int var4 = var3 + this.field4550 + this.field4552; // L: 352
		return var4; // L: 353
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	public void method7282() {
		if (this.field4547 != null) { // L: 358
			try {
				this.field4547.close(); // L: 360
			} catch (Exception var2) { // L: 362
			}

			this.field4547 = null; // L: 363
		}

	} // L: 365

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "77707455"
	)
	static int method7305(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 618
		Widget var3;
		if (var0 >= 2000) { // L: 619
			var0 -= 1000; // L: 620
			var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 621
			var3 = ModeWhere.field4649.method6519(var4); // L: 622
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 624
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 625
			class130.Interpreter_intStackSize -= 2; // L: 626
			var23 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 627
			int var16 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 628
			if (var3.type == 12) { // L: 629
				class356 var17 = var3.method6991(); // L: 630
				if (var17 != null && var17.method6730(var23, var16)) { // L: 631
					TriBool.invalidateWidget(var3); // L: 632
				}
			} else {
				var3.scrollX = var23; // L: 636
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 637
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 638
					var3.scrollX = 0;
				}

				var3.scrollY = var16; // L: 639
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 640
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 641
					var3.scrollY = 0;
				}

				TriBool.invalidateWidget(var3); // L: 642
			}

			return 1; // L: 644
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 647
			TriBool.invalidateWidget(var3); // L: 648
			return 1; // L: 649
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 652
			TriBool.invalidateWidget(var3); // L: 653
			return 1; // L: 654
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 657
			TriBool.invalidateWidget(var3); // L: 658
			return 1; // L: 659
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 662
			TriBool.invalidateWidget(var3); // L: 663
			return 1; // L: 664
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 667
			TriBool.invalidateWidget(var3); // L: 668
			return 1; // L: 669
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 672
			TriBool.invalidateWidget(var3); // L: 673
			return 1; // L: 674
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 677
			TriBool.invalidateWidget(var3); // L: 678
			return 1; // L: 679
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 682
			var3.modelId = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 683
			TriBool.invalidateWidget(var3); // L: 684
			return 1; // L: 685
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class130.Interpreter_intStackSize -= 6; // L: 688
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 689
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 690
			var3.modelAngleX = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 691
			var3.modelAngleY = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 692
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 4]; // L: 693
			var3.modelZoom = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 5]; // L: 694
			TriBool.invalidateWidget(var3); // L: 695
			return 1; // L: 696
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 699
			if (var23 != var3.sequenceId) { // L: 700
				var3.sequenceId = var23; // L: 701
				var3.modelFrame = 0; // L: 702
				var3.modelFrameCycle = 0; // L: 703
				TriBool.invalidateWidget(var3); // L: 704
			}

			return 1; // L: 706
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 709
			TriBool.invalidateWidget(var3); // L: 710
			return 1; // L: 711
		} else {
			String var15;
			class356 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 714
				if (var3.type == 12) { // L: 715
					var21 = var3.method6991(); // L: 716
					if (var21 != null && var21.method6640()) { // L: 717
						var21.method6658(var15); // L: 718
					} else {
						var3.text = var15; // L: 721
					}

					TriBool.invalidateWidget(var3); // L: 723
				} else if (!var15.equals(var3.text)) { // L: 725
					var3.text = var15; // L: 726
					TriBool.invalidateWidget(var3); // L: 727
				}

				return 1; // L: 729
			} else {
				class356 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 732
					if (var3.type == 12) { // L: 733
						var19 = var3.method6991(); // L: 734
						if (var19 != null) { // L: 735
							var19.method6600(); // L: 736
						}
					}

					TriBool.invalidateWidget(var3); // L: 739
					return 1; // L: 740
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					class130.Interpreter_intStackSize -= 3; // L: 743
					if (var3.type == 12) { // L: 744
						var19 = var3.method6991(); // L: 745
						if (var19 != null) { // L: 746
							var19.method6649(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 747
							var19.method6620(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]); // L: 748
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 752
						var3.textYAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 753
						var3.textLineHeight = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 754
					}

					TriBool.invalidateWidget(var3); // L: 756
					return 1; // L: 757
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 760
					TriBool.invalidateWidget(var3); // L: 761
					return 1; // L: 762
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 765
					TriBool.invalidateWidget(var3); // L: 766
					return 1; // L: 767
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 770
					TriBool.invalidateWidget(var3); // L: 771
					return 1; // L: 772
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 775
					TriBool.invalidateWidget(var3); // L: 776
					return 1; // L: 777
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 780
					TriBool.invalidateWidget(var3); // L: 781
					return 1; // L: 782
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					class130.Interpreter_intStackSize -= 2; // L: 785
					var3.scrollWidth = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 786
					var3.scrollHeight = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 787
					TriBool.invalidateWidget(var3); // L: 788
					if (var4 != -1 && var3.type == 0) { // L: 789
						class238.revalidateWidgetScroll(ModeWhere.field4649.field3740[var4 >> 16], var3, false);
					}

					return 1; // L: 790
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					ClanSettings.resumePauseWidget(var3.id, var3.childIndex); // L: 793
					Client.meslayerContinueWidget = var3; // L: 794
					TriBool.invalidateWidget(var3); // L: 795
					return 1; // L: 796
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 799
					TriBool.invalidateWidget(var3); // L: 800
					return 1; // L: 801
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 804
					TriBool.invalidateWidget(var3); // L: 805
					return 1; // L: 806
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 809
					TriBool.invalidateWidget(var3); // L: 810
					return 1; // L: 811
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 814
					class558 var22 = (class558)class210.findEnumerated(class142.FillMode_values(), var23); // L: 815
					if (var22 != null) { // L: 816
						var3.fillMode = var22; // L: 817
						TriBool.invalidateWidget(var3); // L: 818
					}

					return 1; // L: 820
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 823
						var3.field3880 = var14; // L: 824
						return 1; // L: 825
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 828
						var3.modelTransparency = var14; // L: 829
						return 1; // L: 830
					} else if (var0 == 1129) {
						var3.field3868 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 833
						TriBool.invalidateWidget(var3); // L: 834
						return 1; // L: 835
					} else if (var0 == 1130) {
						var3.method6872(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize], "", ByteArrayPool.urlRequester, class452.method8353()); // L: 838
						return 1; // L: 839
					} else if (var0 == 1131) {
						class130.Interpreter_intStackSize -= 2; // L: 842
						var3.swapItems(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 843
						return 1; // L: 844
					} else if (var0 == 1132) {
						var3.method6981(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 847
						return 1; // L: 848
					} else {
						class350 var20;
						if (var0 == 1133) {
							--class130.Interpreter_intStackSize; // L: 851
							var20 = var3.method6890(); // L: 852
							if (var20 != null) { // L: 853
								var20.field3752 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 854
								TriBool.invalidateWidget(var3); // L: 855
							}

							return 1; // L: 857
						} else if (var0 == 1134) {
							--class130.Interpreter_intStackSize; // L: 860
							var20 = var3.method6890(); // L: 861
							if (var20 != null) { // L: 862
								var20.field3751 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 863
								TriBool.invalidateWidget(var3); // L: 864
							}

							return 1; // L: 866
						} else if (var0 == 1135) {
							--class337.Interpreter_stringStackSize; // L: 869
							var19 = var3.method6991(); // L: 870
							if (var19 != null) { // L: 871
								var3.field3895 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 872
							}

							return 1; // L: 874
						} else if (var0 == 1136) {
							--class130.Interpreter_intStackSize; // L: 877
							var20 = var3.method6890(); // L: 878
							if (var20 != null) { // L: 879
								var20.field3750 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 880
								TriBool.invalidateWidget(var3); // L: 881
							}

							return 1; // L: 883
						} else if (var0 == 1137) {
							--class130.Interpreter_intStackSize; // L: 886
							var19 = var3.method6991(); // L: 887
							if (var19 != null && var19.method6716(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize])) { // L: 888
								TriBool.invalidateWidget(var3); // L: 889
							}

							return 1; // L: 891
						} else if (var0 == 1138) {
							--class130.Interpreter_intStackSize; // L: 894
							var19 = var3.method6991(); // L: 895
							if (var19 != null && var19.method6591(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize])) { // L: 896
								TriBool.invalidateWidget(var3); // L: 897
							}

							return 1; // L: 899
						} else if (var0 == 1139) {
							--class130.Interpreter_intStackSize; // L: 902
							var19 = var3.method6991(); // L: 903
							if (var19 != null && var19.method6592(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize])) { // L: 904
								TriBool.invalidateWidget(var3); // L: 905
							}

							return 1; // L: 907
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 910
							Client.field740.method4349(); // L: 911
							var21 = var3.method6991(); // L: 912
							if (var21 != null && var21.method6763(var14)) { // L: 913
								if (var14) { // L: 914
									Client.field740.method4347(var3); // L: 915
								}

								TriBool.invalidateWidget(var3); // L: 917
							}

							return 1; // L: 919
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 922
							if (!var14 && Client.field740.method4348() == var3) { // L: 923
								Client.field740.method4349(); // L: 924
								TriBool.invalidateWidget(var3); // L: 925
							}

							var21 = var3.method6991(); // L: 927
							if (var21 != null) { // L: 928
								var21.method6585(var14); // L: 929
							}

							return 1; // L: 931
						} else if (var0 == 1142) {
							class130.Interpreter_intStackSize -= 2; // L: 934
							var19 = var3.method6991(); // L: 935
							if (var19 != null && var19.method6608(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1])) { // L: 936
								TriBool.invalidateWidget(var3); // L: 937
							}

							return 1; // L: 939
						} else if (var0 == 1143) {
							--class130.Interpreter_intStackSize; // L: 942
							var19 = var3.method6991(); // L: 943
							if (var19 != null && var19.method6608(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize])) { // L: 944
								TriBool.invalidateWidget(var3); // L: 945
							}

							return 1; // L: 947
						} else if (var0 == 1144) {
							--class130.Interpreter_intStackSize; // L: 950
							var19 = var3.method6991(); // L: 951
							if (var19 != null) { // L: 952
								var19.method6597(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]); // L: 953
								TriBool.invalidateWidget(var3); // L: 954
							}

							return 1; // L: 956
						} else if (var0 == 1145) {
							--class130.Interpreter_intStackSize; // L: 959
							var19 = var3.method6991(); // L: 960
							if (var19 != null) { // L: 961
								var19.method6749(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]); // L: 962
							}

							return 1; // L: 964
						} else if (var0 == 1146) {
							--class130.Interpreter_intStackSize; // L: 967
							var19 = var3.method6991(); // L: 968
							if (var19 != null) { // L: 969
								var19.method6599(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]); // L: 970
							}

							return 1; // L: 972
						} else if (var0 == 1147) {
							--class130.Interpreter_intStackSize; // L: 975
							var19 = var3.method6991(); // L: 976
							if (var19 != null) { // L: 977
								var19.method6613(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]); // L: 978
								TriBool.invalidateWidget(var3); // L: 979
							}

							return 1; // L: 981
						} else {
							class27 var18;
							if (var0 == 1148) {
								class130.Interpreter_intStackSize -= 2; // L: 984
								var18 = var3.method6940(); // L: 985
								if (var18 != null) { // L: 986
									var18.method392(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 987
								}

								return 1; // L: 989
							} else if (var0 == 1149) {
								class130.Interpreter_intStackSize -= 2; // L: 992
								var18 = var3.method6940(); // L: 993
								if (var18 != null) { // L: 994
									var18.method393((char)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 995
								}

								return 1; // L: 997
							} else if (var0 == 1150) {
								var3.method6874(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize], ByteArrayPool.urlRequester); // L: 1000
								return 1; // L: 1001
							} else if (var0 == 1151) {
								class337.Interpreter_stringStackSize -= 3; // L: 1004
								var15 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 1005
								String var13 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1]; // L: 1006
								String var7 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 2]; // L: 1007
								long var8 = class452.method8353(); // L: 1008
								long var10 = class229.method4372(); // L: 1009
								String var12 = class446.method8275().method8931(class446.method8275().field5095); // L: 1010
								if (var8 != -1L) { // L: 1011
									var15 = var15.replaceAll("%userid%", Long.toString(var8)); // L: 1012
								}

								if (-1L != var10) { // L: 1014
									var15 = var15.replaceAll("%userhash%", Long.toString(var10)); // L: 1015
								}

								if (!var12.isEmpty()) { // L: 1017
									var15 = var15.replaceAll("%deviceid%", var12); // L: 1018
								}

								var3.method6869(var15, var13, var7, var12, Long.toString(var10), ByteArrayPool.urlRequester); // L: 1020
								return 1; // L: 1021
							} else if (var0 == 1152) {
								if (var3.type != 11) { // L: 1024
									throw new RuntimeException(); // L: 1030
								} else {
									class213 var5 = var3.method6920(); // L: 1025
									boolean var6 = var5 != null && class433.method8077().method4250(var5.method4132()); // L: 1026
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6 ? 1 : 0; // L: 1027
									return 1; // L: 1032
								}
							} else {
								return 2; // L: 1034
							}
						}
					}
				}
			}
		}
	}
}
