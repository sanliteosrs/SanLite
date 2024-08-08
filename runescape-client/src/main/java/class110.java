import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class110 {
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -1135168521
	)
	static int field1418;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field1408;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	class101 field1419;
	@ObfuscatedName("ak")
	byte[] field1405;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ljb;"
	)
	class238[] field1406;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lvp;"
	)
	Buffer[] field1407;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1390831493
	)
	int field1404;
	@ObfuscatedName("av")
	int[] field1409;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1634733587
	)
	int field1410;
	@ObfuscatedName("ai")
	int[] field1411;
	@ObfuscatedName("ae")
	int[] field1402;
	@ObfuscatedName("au")
	int[] field1413;
	@ObfuscatedName("ah")
	int[] field1414;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1077360317
	)
	int field1415;
	@ObfuscatedName("ax")
	int[] field1416;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field1417;

	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	class110(class101 var1) {
		this.field1405 = new byte[2048]; // L: 22
		this.field1406 = new class238[2048]; // L: 23
		this.field1407 = new Buffer[2048]; // L: 24
		this.field1404 = 0; // L: 25
		this.field1409 = new int[2048]; // L: 26
		this.field1410 = 0; // L: 27
		this.field1411 = new int[2048]; // L: 28
		this.field1402 = new int[2048]; // L: 29
		this.field1413 = new int[2048]; // L: 30
		this.field1414 = new int[2048]; // L: 31
		this.field1415 = 0; // L: 32
		this.field1416 = new int[2048]; // L: 33
		this.field1417 = new Buffer(new byte[5000]); // L: 34
		this.field1419 = var1; // L: 37
	} // L: 38

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lug;ZI)V",
		garbageValue = "-1557479044"
	)
	final void method2820(PacketBuffer var1, boolean var2) {
		var1.importIndex(); // L: 41
		Player var3 = new Player(); // L: 42
		int var4 = Client.field706; // L: 43
		if (var2) { // L: 44
			SoundCache.localPlayer = var3; // L: 45
			class511.field5137.field1326[var4] = var3; // L: 46
		} else {
			this.field1419.field1326[var4] = var3; // L: 49
		}

		var3.field1140 = var4; // L: 51
		int var5 = var1.readBits(30); // L: 52
		byte var6 = (byte)Coord.method6469(var5); // L: 53
		int var7 = Coord.method6468(var5); // L: 54
		int var8 = Coord.method6474(var5); // L: 55
		var3.field1204[0] = var7 - this.field1419.field1321; // L: 56
		var3.x = (var3.field1204[0] << 7) + (var3.transformedSize() << 6); // L: 57
		var3.field1246[0] = var8 - this.field1419.field1323; // L: 58
		var3.field1191 = (var3.field1246[0] << 7) + (var3.transformedSize() << 6); // L: 59
		if (var2) { // L: 60
			this.field1419.field1318 = var3.plane = var6;
		}

		if (this.field1407[var4] != null) { // L: 61
			var3.read(this.field1407[var4]);
		}

		this.field1404 = 0; // L: 62
		this.field1409[++this.field1404 - 1] = var4; // L: 63
		this.field1405[var4] = 0; // L: 64
		this.field1410 = 0; // L: 65

		for (int var9 = 1; var9 < 2048; ++var9) { // L: 66
			if (var9 != var4) { // L: 67
				int var10 = var1.readBits(18); // L: 68
				int var11 = var10 >> 16; // L: 69
				int var12 = var10 >> 8 & 597; // L: 70
				int var13 = var10 & 597; // L: 71
				this.field1402[var9] = Coord.method6460(var11, var12, var13); // L: 72
				this.field1413[var9] = 0; // L: 73
				this.field1414[var9] = -1; // L: 74
				this.field1411[++this.field1410 - 1] = var9; // L: 75
				this.field1405[var9] = 0; // L: 76
			}
		}

		var1.exportIndex(); // L: 78
	} // L: 79

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lug;II)V",
		garbageValue = "1679600610"
	)
	final void method2826(PacketBuffer var1, int var2) {
		int var3 = var1.offset; // L: 82
		this.field1415 = 0; // L: 83
		this.method2821(var1); // L: 84
		this.method2825(var1); // L: 85
		if (var2 != var1.offset - var3) { // L: 86
			throw new RuntimeException(var1.offset - var3 + " " + var2); // L: 87
		}
	} // L: 89

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lug;B)V",
		garbageValue = "38"
	)
	final void method2821(PacketBuffer var1) {
		int var2 = 0; // L: 92
		var1.importIndex(); // L: 93

		byte[] var10000;
		int var3;
		int var5;
		int var6;
		for (var3 = 0; var3 < this.field1404; ++var3) { // L: 94
			var6 = this.field1409[var3]; // L: 95
			if ((this.field1405[var6] & 1) == 0) { // L: 96
				if (var2 > 0) { // L: 97
					--var2; // L: 98
					var10000 = this.field1405; // L: 99
					var10000[var6] = (byte)(var10000[var6] | 2);
				} else {
					var5 = var1.readBits(1); // L: 102
					if (var5 == 0) { // L: 103
						var2 = this.method2822(var1); // L: 104
						var10000 = this.field1405; // L: 105
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						this.method2823(var1, var6); // L: 108
					}
				}
			}
		}

		var1.exportIndex(); // L: 111
		if (var2 != 0) { // L: 112
			throw new RuntimeException(); // L: 113
		} else {
			var1.importIndex(); // L: 115

			for (var3 = 0; var3 < this.field1404; ++var3) { // L: 116
				var6 = this.field1409[var3]; // L: 117
				if ((this.field1405[var6] & 1) != 0) { // L: 118
					if (var2 > 0) { // L: 119
						--var2; // L: 120
						var10000 = this.field1405; // L: 121
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						var5 = var1.readBits(1); // L: 124
						if (var5 == 0) { // L: 125
							var2 = this.method2822(var1); // L: 126
							var10000 = this.field1405; // L: 127
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							this.method2823(var1, var6); // L: 130
						}
					}
				}
			}

			var1.exportIndex(); // L: 133
			if (var2 != 0) { // L: 134
				throw new RuntimeException(); // L: 135
			} else {
				var1.importIndex(); // L: 137

				for (var3 = 0; var3 < this.field1410; ++var3) { // L: 138
					var6 = this.field1411[var3]; // L: 139
					if ((this.field1405[var6] & 1) != 0) { // L: 140
						if (var2 > 0) { // L: 141
							--var2; // L: 142
							var10000 = this.field1405; // L: 143
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							var5 = var1.readBits(1); // L: 146
							if (var5 == 0) { // L: 147
								var2 = this.method2822(var1); // L: 148
								var10000 = this.field1405; // L: 149
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else if (this.method2847(var1, var6)) { // L: 152
								var10000 = this.field1405;
								var10000[var6] = (byte)(var10000[var6] | 2);
							}
						}
					}
				}

				var1.exportIndex(); // L: 155
				if (var2 != 0) { // L: 156
					throw new RuntimeException(); // L: 157
				} else {
					var1.importIndex(); // L: 159

					for (var3 = 0; var3 < this.field1410; ++var3) { // L: 160
						var6 = this.field1411[var3]; // L: 161
						if ((this.field1405[var6] & 1) == 0) { // L: 162
							if (var2 > 0) { // L: 163
								--var2; // L: 164
								var10000 = this.field1405; // L: 165
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else {
								var5 = var1.readBits(1); // L: 168
								if (var5 == 0) { // L: 169
									var2 = this.method2822(var1); // L: 170
									var10000 = this.field1405; // L: 171
									var10000[var6] = (byte)(var10000[var6] | 2);
								} else if (this.method2847(var1, var6)) { // L: 174
									var10000 = this.field1405;
									var10000[var6] = (byte)(var10000[var6] | 2);
								}
							}
						}
					}

					var1.exportIndex(); // L: 177
					if (var2 != 0) { // L: 178
						throw new RuntimeException(); // L: 179
					} else {
						this.field1404 = 0; // L: 181
						this.field1410 = 0; // L: 182

						for (var3 = 1; var3 < 2048; ++var3) { // L: 183
							var10000 = this.field1405; // L: 184
							var10000[var3] = (byte)(var10000[var3] >> 1);
							Player var4 = this.field1419.field1326[var3]; // L: 185
							if (var4 != null) { // L: 186
								this.field1409[++this.field1404 - 1] = var3;
							} else {
								this.field1411[++this.field1410 - 1] = var3; // L: 187
							}
						}

					}
				}
			}
		}
	} // L: 189

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lug;I)I",
		garbageValue = "1114269"
	)
	int method2822(PacketBuffer var1) {
		int var2 = var1.readBits(2); // L: 192
		int var3;
		if (var2 == 0) { // L: 194
			var3 = 0;
		} else if (var2 == 1) { // L: 195
			var3 = var1.readBits(5);
		} else if (var2 == 2) { // L: 196
			var3 = var1.readBits(8);
		} else {
			var3 = var1.readBits(11); // L: 197
		}

		return var3; // L: 198
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lug;II)V",
		garbageValue = "715158123"
	)
	void method2823(PacketBuffer var1, int var2) {
		boolean var3 = var1.readBits(1) == 1; // L: 202
		if (var3) { // L: 203
			this.field1416[++this.field1415 - 1] = var2;
		}

		int var4 = var1.readBits(2); // L: 204
		Player var5 = this.field1419.field1326[var2]; // L: 205
		if (var4 == 0) { // L: 206
			if (var3) { // L: 207
				var5.field1144 = false; // L: 208
			} else if (var2 == Client.field706) { // L: 211
				throw new RuntimeException();
			} else {
				this.field1402[var2] = Coord.method6460(var5.plane, this.field1419.field1321 + var5.field1204[0] >> 13, this.field1419.field1323 + var5.field1246[0] >> 13); // L: 212
				if (var5.field1227 != -1) { // L: 213
					this.field1413[var2] = var5.field1227;
				} else {
					this.field1413[var2] = var5.field1257; // L: 214
				}

				this.field1414[var2] = var5.field1190; // L: 215
				this.field1419.field1326[var2] = null; // L: 216
				if (var1.readBits(1) != 0) { // L: 217
					this.method2847(var1, var2);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) { // L: 220
				var6 = var1.readBits(3); // L: 221
				var7 = var5.field1204[0]; // L: 222
				var8 = var5.field1246[0]; // L: 223
				if (var6 == 0) { // L: 224
					--var7; // L: 225
					--var8; // L: 226
				} else if (var6 == 1) { // L: 228
					--var8;
				} else if (var6 == 2) { // L: 229
					++var7; // L: 230
					--var8; // L: 231
				} else if (var6 == 3) { // L: 233
					--var7;
				} else if (var6 == 4) { // L: 234
					++var7;
				} else if (var6 == 5) { // L: 235
					--var7; // L: 236
					++var8; // L: 237
				} else if (var6 == 6) { // L: 239
					++var8;
				} else if (var6 == 7) { // L: 240
					++var7; // L: 241
					++var8; // L: 242
				}

				if (var2 == Client.field706 && this.field1419.method2676() && (var5.x < 1536 || var5.field1191 < 1536 || var5.x >= 11776 || var5.field1191 >= 11776)) { // L: 244
					var5.resetPath(var7, var8); // L: 245
					var5.field1144 = false; // L: 246
				} else if (var3) { // L: 248
					var5.field1144 = true; // L: 249
					var5.field1135 = var7; // L: 250
					var5.field1145 = var8; // L: 251
				} else {
					var5.field1144 = false; // L: 254
					var5.method2437(this.field1419, var7, var8, this.field1406[var2]); // L: 255
				}

			} else if (var4 == 2) { // L: 259
				var6 = var1.readBits(4); // L: 260
				var7 = var5.field1204[0]; // L: 261
				var8 = var5.field1246[0]; // L: 262
				if (var6 == 0) { // L: 263
					var7 -= 2; // L: 264
					var8 -= 2; // L: 265
				} else if (var6 == 1) { // L: 267
					--var7; // L: 268
					var8 -= 2; // L: 269
				} else if (var6 == 2) { // L: 271
					var8 -= 2;
				} else if (var6 == 3) { // L: 272
					++var7; // L: 273
					var8 -= 2; // L: 274
				} else if (var6 == 4) { // L: 276
					var7 += 2; // L: 277
					var8 -= 2; // L: 278
				} else if (var6 == 5) { // L: 280
					var7 -= 2; // L: 281
					--var8; // L: 282
				} else if (var6 == 6) { // L: 284
					var7 += 2; // L: 285
					--var8; // L: 286
				} else if (var6 == 7) { // L: 288
					var7 -= 2;
				} else if (var6 == 8) { // L: 289
					var7 += 2;
				} else if (var6 == 9) { // L: 290
					var7 -= 2; // L: 291
					++var8; // L: 292
				} else if (var6 == 10) { // L: 294
					var7 += 2; // L: 295
					++var8; // L: 296
				} else if (var6 == 11) { // L: 298
					var7 -= 2; // L: 299
					var8 += 2; // L: 300
				} else if (var6 == 12) { // L: 302
					--var7; // L: 303
					var8 += 2; // L: 304
				} else if (var6 == 13) { // L: 306
					var8 += 2;
				} else if (var6 == 14) { // L: 307
					++var7; // L: 308
					var8 += 2; // L: 309
				} else if (var6 == 15) { // L: 311
					var7 += 2; // L: 312
					var8 += 2; // L: 313
				}

				if (var2 == Client.field706 && this.field1419.method2676() && (var5.x < 1536 || var5.field1191 < 1536 || var5.x >= 11776 || var5.field1191 >= 11776)) { // L: 315
					var5.resetPath(var7, var8); // L: 316
					var5.field1144 = false; // L: 317
				} else if (var3) { // L: 319
					var5.field1144 = true; // L: 320
					var5.field1135 = var7; // L: 321
					var5.field1145 = var8; // L: 322
				} else {
					var5.field1144 = false; // L: 325
					var5.method2437(this.field1419, var7, var8, this.field1406[var2]); // L: 326
				}

			} else {
				var6 = var1.readBits(1); // L: 330
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) { // L: 331
					var7 = var1.readBits(12); // L: 332
					var8 = var7 >> 10; // L: 333
					var9 = var7 >> 5 & 31; // L: 334
					if (var9 > 15) { // L: 335
						var9 -= 32;
					}

					var10 = var7 & 31; // L: 336
					if (var10 > 15) { // L: 337
						var10 -= 32;
					}

					var11 = var9 + var5.field1204[0]; // L: 338
					var12 = var10 + var5.field1246[0]; // L: 339
					if (var2 == Client.field706 && this.field1419.method2676() && (var5.x < 1536 || var5.field1191 < 1536 || var5.x >= 11776 || var5.field1191 >= 11776)) { // L: 340
						var5.resetPath(var11, var12); // L: 341
						var5.field1144 = false; // L: 342
					} else if (var3) { // L: 344
						var5.field1144 = true; // L: 345
						var5.field1135 = var11; // L: 346
						var5.field1145 = var12; // L: 347
					} else {
						var5.field1144 = false; // L: 350
						var5.method2437(this.field1419, var11, var12, this.field1406[var2]); // L: 351
					}

					var5.plane = (byte)(var8 + var5.plane & 3); // L: 353
					if (var2 == Client.field706 && this.field1419.method2676()) { // L: 354
						this.field1419.field1318 = var5.plane;
					}

				} else {
					var7 = var1.readBits(30); // L: 357
					var8 = Coord.method6469(var7); // L: 358
					var9 = Coord.method6468(var7); // L: 359
					var10 = Coord.method6474(var7); // L: 360
					var11 = (this.field1419.field1321 + var9 + var5.field1204[0] & 16383) - this.field1419.field1321; // L: 361
					var12 = (this.field1419.field1323 + var10 + var5.field1246[0] & 16383) - this.field1419.field1323; // L: 362
					if (var2 == Client.field706 && this.field1419.method2676() && (var5.x < 1536 || var5.field1191 < 1536 || var5.x >= 11776 || var5.field1191 >= 11776)) { // L: 363
						var5.resetPath(var11, var12); // L: 364
						var5.field1144 = false; // L: 365
					} else if (var3) { // L: 367
						var5.field1144 = true; // L: 368
						var5.field1135 = var11; // L: 369
						var5.field1145 = var12; // L: 370
					} else {
						var5.field1144 = false; // L: 373
						var5.method2437(this.field1419, var11, var12, this.field1406[var2]); // L: 374
					}

					var5.plane = (byte)(var8 + var5.plane & 3); // L: 376
					if (var2 == Client.field706 && this.field1419.method2676()) { // L: 377
						this.field1419.field1318 = var5.plane;
					}

				}
			}
		}
	} // L: 209 218 257 328 355 378

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lug;II)Z",
		garbageValue = "-455914517"
	)
	boolean method2847(PacketBuffer var1, int var2) {
		int var3 = var1.readBits(2); // L: 381
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) { // L: 382
			if (var1.readBits(1) != 0) { // L: 383
				this.method2847(var1, var2);
			}

			var4 = var1.readBits(13); // L: 384
			var5 = var1.readBits(13); // L: 385
			boolean var13 = var1.readBits(1) == 1; // L: 386
			if (var13) { // L: 387
				this.field1416[++this.field1415 - 1] = var2;
			}

			if (this.field1419.field1326[var2] != null) { // L: 388
				throw new RuntimeException(); // L: 389
			} else {
				Player var12 = this.field1419.field1326[var2] = new Player(); // L: 391
				var12.field1140 = var2; // L: 392
				if (this.field1407[var2] != null) { // L: 393
					var12.read(this.field1407[var2]);
				}

				var12.field1257 = this.field1413[var2]; // L: 394
				var12.field1190 = this.field1414[var2]; // L: 395
				var8 = this.field1402[var2]; // L: 396
				var9 = var8 >> 28; // L: 397
				var10 = var8 >> 14 & 255; // L: 398
				var11 = var8 & 255; // L: 399
				var12.field1263[0] = this.field1406[var2]; // L: 400
				var12.plane = (byte)var9; // L: 401
				var12.resetPath((var10 << 13) + var4 - this.field1419.field1321, (var11 << 13) + var5 - this.field1419.field1323); // L: 402
				var12.field1144 = false; // L: 403
				return true; // L: 404
			}
		} else if (var3 == 1) { // L: 406
			var4 = var1.readBits(2); // L: 407
			var5 = this.field1402[var2]; // L: 408
			this.field1402[var2] = (((var5 >> 28) + var4 & 3) << 28) + (var5 & 268435455); // L: 409
			return false; // L: 410
		} else {
			int var6;
			int var7;
			if (var3 == 2) { // L: 412
				var4 = var1.readBits(5); // L: 413
				var5 = var4 >> 3; // L: 414
				var6 = var4 & 7; // L: 415
				var7 = this.field1402[var2]; // L: 416
				var8 = (var7 >> 28) + var5 & 3; // L: 417
				var9 = var7 >> 14 & 255; // L: 418
				var10 = var7 & 255; // L: 419
				if (var6 == 0) { // L: 420
					--var9; // L: 421
					--var10; // L: 422
				}

				if (var6 == 1) { // L: 424
					--var10;
				}

				if (var6 == 2) { // L: 425
					++var9; // L: 426
					--var10; // L: 427
				}

				if (var6 == 3) { // L: 429
					--var9;
				}

				if (var6 == 4) { // L: 430
					++var9;
				}

				if (var6 == 5) { // L: 431
					--var9; // L: 432
					++var10; // L: 433
				}

				if (var6 == 6) { // L: 435
					++var10;
				}

				if (var6 == 7) { // L: 436
					++var9; // L: 437
					++var10; // L: 438
				}

				this.field1402[var2] = Coord.method6460(var8, var9, var10); // L: 440
				return false; // L: 441
			} else {
				var4 = var1.readBits(18); // L: 443
				var5 = var4 >> 16; // L: 444
				var6 = var4 >> 8 & 255; // L: 445
				var7 = var4 & 255; // L: 446
				var8 = this.field1402[var2]; // L: 447
				var9 = (var8 >> 28) + var5 & 3; // L: 448
				var10 = var6 + (var8 >> 14) & 255; // L: 449
				var11 = var7 + var8 & 255; // L: 450
				this.field1402[var2] = Coord.method6460(var9, var10, var11); // L: 451
				return false; // L: 452
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lug;B)V",
		garbageValue = "-32"
	)
	final void method2825(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.field1415; ++var2) { // L: 456
			int var3 = this.field1416[var2]; // L: 457
			Player var4 = this.field1419.field1326[var3]; // L: 458
			int var5 = var1.readUnsignedByte(); // L: 459
			if ((var5 & 16) != 0) { // L: 460
				var5 += var1.readUnsignedByte() << 8;
			}

			if ((var5 & 4096) != 0) { // L: 461
				var5 += var1.readUnsignedByte() << 16;
			}

			this.method2833(var1, var3, var4, var5); // L: 462
		}

	} // L: 464

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lug;ILdb;II)V",
		garbageValue = "-311624259"
	)
	final void method2833(PacketBuffer var1, int var2, Player var3, int var4) {
		byte var5 = class238.field2512.field2515; // L: 467
		if ((var4 & 2048) != 0) { // L: 468
			this.field1406[var2] = (class238)class210.findEnumerated(class193.method3759(), var1.method9595()); // L: 469
		}

		if ((var4 & 256) != 0) { // L: 471
			var5 = var1.readByte(); // L: 472
		}

		if ((var4 & 2) != 0) { // L: 474
			var3.field1211 = var1.readStringCp1252NullTerminated(); // L: 475
			if (var3.field1211.charAt(0) == '~') { // L: 476
				var3.field1211 = var3.field1211.substring(1); // L: 477
				VarbitComposition.addGameMessage(2, var3.username.getName(), var3.field1211); // L: 478
			} else if (var3 == SoundCache.localPlayer) { // L: 480
				VarbitComposition.addGameMessage(2, var3.username.getName(), var3.field1211); // L: 481
			}

			var3.field1212 = false; // L: 483
			var3.field1226 = 0; // L: 484
			var3.field1216 = 0; // L: 485
			var3.field1206 = 150; // L: 486
		}

		int var6;
		if ((var4 & 32768) != 0) { // L: 488
			for (var6 = 0; var6 < 3; ++var6) { // L: 489
				var3.field1122[var6] = var1.readStringCp1252NullTerminated();
			}
		}

		if ((var4 & 8192) != 0) { // L: 491
			var3.field1251 = Client.cycle + var1.method9599(); // L: 492
			var3.field1215 = Client.cycle + var1.method9712(); // L: 493
			var3.field1223 = var1.method9749(); // L: 494
			var3.field1254 = var1.method9595(); // L: 495
			var3.field1255 = var1.method9749(); // L: 496
			var3.field1239 = (byte)var1.method9591(); // L: 497
		}

		int var7;
		if ((var4 & 64) != 0) { // L: 499
			var6 = var1.readUnsignedShort(); // L: 500
			if (var6 == 65535) { // L: 501
				var6 = -1;
			}

			var7 = var1.method9591(); // L: 502
			Canvas.method324(var3, var6, var7); // L: 503
		}

		if ((var4 & 1) != 0) { // L: 505
			var6 = var1.method9592(); // L: 506
			byte[] var21 = new byte[var6]; // L: 507
			Buffer var8 = new Buffer(var21); // L: 508
			var1.method9559(var21, 0, var6); // L: 509
			this.field1407[var2] = var8; // L: 510
			var3.read(var8); // L: 511
		}

		if ((var4 & 512) != 0) { // L: 513
			var3.field1242 = var1.method9594(); // L: 514
			var3.field1244 = var1.method9749(); // L: 515
			var3.field1243 = var1.method9595(); // L: 516
			var3.field1245 = var1.readByte(); // L: 517
			var3.field1253 = var1.method9600() + Client.cycle; // L: 518
			var3.field1260 = var1.method9600() + Client.cycle; // L: 519
			var3.field1248 = var1.method9599(); // L: 520
			if (var3.field1144) { // L: 521
				var3.field1242 += var3.field1135; // L: 522
				var3.field1244 += var3.field1145; // L: 523
				var3.field1243 += var3.field1135; // L: 524
				var3.field1245 += var3.field1145; // L: 525
				var3.field1229 = 0; // L: 526
			} else {
				var3.field1242 += var3.field1204[0]; // L: 529
				var3.field1244 += var3.field1246[0]; // L: 530
				var3.field1243 += var3.field1204[0]; // L: 531
				var3.field1245 += var3.field1246[0]; // L: 532
				var3.field1229 = 1; // L: 533
			}

			var3.field1265 = 0; // L: 535
		}

		int var9;
		int var10;
		int var22;
		if ((var4 & 65536) != 0) { // L: 537
			var6 = var1.method9591(); // L: 538

			for (var7 = 0; var7 < var6; ++var7) { // L: 539
				var22 = var1.method9592(); // L: 540
				var9 = var1.method9600(); // L: 541
				var10 = var1.method9586(); // L: 542
				var3.method2481(var22, var9, var10 >> 16, var10 & 65535); // L: 543
			}
		}

		int var11;
		int var13;
		int var24;
		if ((var4 & 8) != 0) { // L: 546
			var6 = var1.method9592(); // L: 547
			if (var6 > 0) { // L: 548
				for (var7 = 0; var7 < var6; ++var7) { // L: 549
					var9 = -1; // L: 551
					var10 = -1; // L: 552
					var11 = -1; // L: 553
					var22 = var1.readUShortSmart(); // L: 554
					if (var22 == 32767) { // L: 555
						var22 = var1.readUShortSmart(); // L: 556
						var10 = var1.readUShortSmart(); // L: 557
						var9 = var1.readUShortSmart(); // L: 558
						var11 = var1.readUShortSmart(); // L: 559
					} else if (var22 != 32766) { // L: 561
						var10 = var1.readUShortSmart(); // L: 562
					} else {
						var22 = -1; // L: 564
					}

					var24 = var1.readUShortSmart(); // L: 565
					var3.addHitSplat(var22, var10, var9, var11, Client.cycle, var24); // L: 566
				}
			}

			var7 = var1.method9590(); // L: 569
			if (var7 > 0) { // L: 570
				for (var22 = 0; var22 < var7; ++var22) { // L: 571
					var9 = var1.readUShortSmart(); // L: 572
					var10 = var1.readUShortSmart(); // L: 573
					if (var10 != 32767) { // L: 574
						var11 = var1.readUShortSmart(); // L: 575
						var24 = var1.method9592(); // L: 576
						var13 = var10 > 0 ? var1.method9590() : var24; // L: 577
						var3.addHealthBar(var9, Client.cycle, var10, var11, var24, var13); // L: 578
					} else {
						var3.removeHealthBar(var9); // L: 580
					}
				}
			}
		}

		if ((var4 & 32) != 0) { // L: 584
			var3.field1190 = var1.method9712(); // L: 586
			var3.field1190 += var1.method9592() << 16; // L: 587
			var6 = 16777215; // L: 588
			if (var6 == var3.field1190) { // L: 589
				var3.field1190 = -1; // L: 590
			}
		}

		if ((var4 & 4) != 0) { // L: 593
			var6 = var1.method9599(); // L: 594
			PlayerType var31 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var1.method9592()); // L: 595
			boolean var32 = var1.method9591() == 1; // L: 596
			var9 = var1.method9592(); // L: 597
			var10 = var1.offset; // L: 598
			if (var3.username != null && var3.appearance != null) { // L: 599
				boolean var28 = false; // L: 600
				if (var31.isUser && class135.friendSystem.isIgnored(var3.username)) { // L: 601 602
					var28 = true;
				}

				if (!var28 && Client.field625 == 0 && !var3.field1138) { // L: 604
					this.field1417.offset = 0; // L: 605
					var1.method9615(this.field1417.array, 0, var9); // L: 606
					this.field1417.offset = 0; // L: 607
					String var12 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(this.field1417))); // L: 608
					var3.field1211 = var12.trim(); // L: 609
					var3.field1226 = var6 >> 8; // L: 610
					var3.field1216 = var6 & 255; // L: 611
					var3.field1206 = 150; // L: 612
					var3.field1217 = null; // L: 613
					var3.field1212 = var32; // L: 614
					var3.field1213 = var3 != SoundCache.localPlayer && var31.isUser && !Client.field736.isEmpty() && var12.toLowerCase().indexOf(Client.field736) == -1; // L: 615
					if (var31.isPrivileged) {
						var13 = var32 ? 91 : 1; // L: 617
					} else {
						var13 = var32 ? 90 : 2; // L: 618
					}

					if (var31.modIcon != -1) { // L: 619
						VarbitComposition.addGameMessage(var13, class385.method7175(var31.modIcon) + var3.username.getName(), var12);
					} else {
						VarbitComposition.addGameMessage(var13, var3.username.getName(), var12); // L: 620
					}
				}
			}

			var1.offset = var9 + var10; // L: 623
		}

		if ((var4 & 16384) != 0) { // L: 625
			var6 = var1.method9712(); // L: 626
			var7 = var6 >> 8; // L: 627
			var22 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0; // L: 628
			PlayerType var23 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var1.method9590()); // L: 629
			boolean var29 = var1.method9591() == 1; // L: 630
			var11 = var1.method9592(); // L: 631
			var24 = var1.offset; // L: 632
			if (var3.username != null && var3.appearance != null) { // L: 633
				boolean var30 = false; // L: 634
				if (var23.isUser && class135.friendSystem.isIgnored(var3.username)) { // L: 635 636
					var30 = true;
				}

				if (!var30 && Client.field625 == 0 && !var3.field1138) { // L: 638
					this.field1417.offset = 0; // L: 639
					var1.method9615(this.field1417.array, 0, var11); // L: 640
					this.field1417.offset = 0; // L: 641
					String var14 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(this.field1417))); // L: 642
					var3.field1211 = var14.trim(); // L: 643
					var3.field1226 = var6 >> 8; // L: 644
					var3.field1216 = var6 & 255; // L: 645
					var3.field1206 = 150; // L: 646
					byte[] var15 = null; // L: 647
					if (var22 > 0 && var22 <= 8) { // L: 648
						var15 = new byte[var22]; // L: 649

						for (int var16 = 0; var16 < var22; ++var16) { // L: 650
							var15[var16] = var1.method9594(); // L: 651
						}
					}

					byte[] var18 = var15; // L: 656
					int[] var17;
					if (var15 != null && var15.length != 0 && var15.length <= 8) { // L: 658
						int[] var19 = new int[var15.length]; // L: 662
						int var20 = 0;

						while (true) {
							if (var20 >= var18.length) {
								var17 = var19; // L: 670
								break;
							}

							if (var18[var20] < 0 || var18[var20] >= class569.field5515.length) { // L: 664
								var17 = null; // L: 665
								break; // L: 666
							}

							var19[var20] = class569.field5515[var18[var20]]; // L: 668
							++var20; // L: 663
						}
					} else {
						var17 = null; // L: 659
					}

					var3.field1217 = var17; // L: 672
					var3.field1212 = var29; // L: 673
					var3.field1213 = var3 != SoundCache.localPlayer && var23.isUser && !Client.field736.isEmpty() && var14.toLowerCase().indexOf(Client.field736) == -1; // L: 674
					int var26;
					if (var23.isPrivileged) { // L: 676
						var26 = var29 ? 91 : 1;
					} else {
						var26 = var29 ? 90 : 2; // L: 677
					}

					if (var23.modIcon != -1) { // L: 678
						VarbitComposition.addGameMessage(var26, class385.method7175(var23.modIcon) + var3.username.getName(), var14);
					} else {
						VarbitComposition.addGameMessage(var26, var3.username.getName(), var14); // L: 679
					}
				}
			}

			var1.offset = var24 + var11 + var22; // L: 682
		}

		if ((var4 & 128) != 0) { // L: 684
			var3.field1227 = var1.method9599(); // L: 685
			if (var3.field1229 == 0) { // L: 686
				var3.field1257 = var3.field1227; // L: 687
				var3.method2485(); // L: 688
			}
		}

		if (var3.field1144) { // L: 691
			if (var5 == 127) { // L: 692
				var3.resetPath(var3.field1135, var3.field1145);
			} else {
				class238 var27;
				if (var5 != class238.field2512.field2515) { // L: 695
					var27 = (class238)class210.findEnumerated(class193.method3759(), var5);
				} else {
					var27 = this.field1406[var2]; // L: 696
				}

				var3.method2437(this.field1419, var3.field1135, var3.field1145, var27); // L: 697
			}
		}

	} // L: 701
}
