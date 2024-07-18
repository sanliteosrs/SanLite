import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -270571109
	)
	@Export("xInset")
	int xInset;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -883837443
	)
	@Export("yInset")
	int yInset;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1510995225
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 928232177
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("by")
	@Export("flags")
	public int[][] flags;

	public CollisionMap(int var1, int var2) {
		this.xInset = 0; // L: 45
		this.yInset = 0; // L: 46
		this.xSize = var1; // L: 47
		this.ySize = var2; // L: 48
		this.flags = new int[this.xSize][this.ySize]; // L: 49
		this.clear(); // L: 50
	} // L: 51

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2020997075"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) { // L: 54
			for (int var2 = 0; var2 < this.ySize; ++var2) { // L: 55
				if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) { // L: 56
					this.flags[var1][var2] = 1073741824; // L: 57
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	} // L: 60

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1514398241"
	)
	public void method4412(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 63
		var2 -= this.yInset; // L: 64
		if (var3 == 0) { // L: 65
			if (var4 == 0) { // L: 66
				this.setFlag(var1, var2, 128); // L: 67
				this.setFlag(var1 - 1, var2, 8); // L: 68
			}

			if (var4 == 1) { // L: 70
				this.setFlag(var1, var2, 2); // L: 71
				this.setFlag(var1, var2 + 1, 32); // L: 72
			}

			if (var4 == 2) { // L: 74
				this.setFlag(var1, var2, 8); // L: 75
				this.setFlag(var1 + 1, var2, 128); // L: 76
			}

			if (var4 == 3) { // L: 78
				this.setFlag(var1, var2, 32); // L: 79
				this.setFlag(var1, var2 - 1, 2); // L: 80
			}
		}

		if (var3 == 1 || var3 == 3) { // L: 83
			if (var4 == 0) { // L: 84
				this.setFlag(var1, var2, 1); // L: 85
				this.setFlag(var1 - 1, var2 + 1, 16); // L: 86
			}

			if (var4 == 1) { // L: 88
				this.setFlag(var1, var2, 4); // L: 89
				this.setFlag(var1 + 1, var2 + 1, 64); // L: 90
			}

			if (var4 == 2) { // L: 92
				this.setFlag(var1, var2, 16); // L: 93
				this.setFlag(var1 + 1, var2 - 1, 1); // L: 94
			}

			if (var4 == 3) { // L: 96
				this.setFlag(var1, var2, 64); // L: 97
				this.setFlag(var1 - 1, var2 - 1, 4); // L: 98
			}
		}

		if (var3 == 2) { // L: 101
			if (var4 == 0) { // L: 102
				this.setFlag(var1, var2, 130); // L: 103
				this.setFlag(var1 - 1, var2, 8); // L: 104
				this.setFlag(var1, var2 + 1, 32); // L: 105
			}

			if (var4 == 1) { // L: 107
				this.setFlag(var1, var2, 10); // L: 108
				this.setFlag(var1, var2 + 1, 32); // L: 109
				this.setFlag(var1 + 1, var2, 128); // L: 110
			}

			if (var4 == 2) { // L: 112
				this.setFlag(var1, var2, 40); // L: 113
				this.setFlag(var1 + 1, var2, 128); // L: 114
				this.setFlag(var1, var2 - 1, 2); // L: 115
			}

			if (var4 == 3) { // L: 117
				this.setFlag(var1, var2, 160); // L: 118
				this.setFlag(var1, var2 - 1, 2); // L: 119
				this.setFlag(var1 - 1, var2, 8); // L: 120
			}
		}

		if (var5) { // L: 123
			if (var3 == 0) { // L: 124
				if (var4 == 0) { // L: 125
					this.setFlag(var1, var2, 65536); // L: 126
					this.setFlag(var1 - 1, var2, 4096); // L: 127
				}

				if (var4 == 1) { // L: 129
					this.setFlag(var1, var2, 1024); // L: 130
					this.setFlag(var1, var2 + 1, 16384); // L: 131
				}

				if (var4 == 2) { // L: 133
					this.setFlag(var1, var2, 4096); // L: 134
					this.setFlag(var1 + 1, var2, 65536); // L: 135
				}

				if (var4 == 3) { // L: 137
					this.setFlag(var1, var2, 16384); // L: 138
					this.setFlag(var1, var2 - 1, 1024); // L: 139
				}
			}

			if (var3 == 1 || var3 == 3) { // L: 142
				if (var4 == 0) { // L: 143
					this.setFlag(var1, var2, 512); // L: 144
					this.setFlag(var1 - 1, var2 + 1, 8192); // L: 145
				}

				if (var4 == 1) { // L: 147
					this.setFlag(var1, var2, 2048); // L: 148
					this.setFlag(var1 + 1, var2 + 1, 32768); // L: 149
				}

				if (var4 == 2) { // L: 151
					this.setFlag(var1, var2, 8192); // L: 152
					this.setFlag(var1 + 1, var2 - 1, 512); // L: 153
				}

				if (var4 == 3) { // L: 155
					this.setFlag(var1, var2, 32768); // L: 156
					this.setFlag(var1 - 1, var2 - 1, 2048); // L: 157
				}
			}

			if (var3 == 2) { // L: 160
				if (var4 == 0) { // L: 161
					this.setFlag(var1, var2, 66560); // L: 162
					this.setFlag(var1 - 1, var2, 4096); // L: 163
					this.setFlag(var1, var2 + 1, 16384); // L: 164
				}

				if (var4 == 1) { // L: 166
					this.setFlag(var1, var2, 5120); // L: 167
					this.setFlag(var1, var2 + 1, 16384); // L: 168
					this.setFlag(var1 + 1, var2, 65536); // L: 169
				}

				if (var4 == 2) { // L: 171
					this.setFlag(var1, var2, 20480); // L: 172
					this.setFlag(var1 + 1, var2, 65536); // L: 173
					this.setFlag(var1, var2 - 1, 1024); // L: 174
				}

				if (var4 == 3) { // L: 176
					this.setFlag(var1, var2, 81920); // L: 177
					this.setFlag(var1, var2 - 1, 1024); // L: 178
					this.setFlag(var1 - 1, var2, 4096); // L: 179
				}
			}
		}

	} // L: 183

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1592901653"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		int var6 = 256; // L: 186
		if (var5) { // L: 187
			var6 += 131072;
		}

		var1 -= this.xInset; // L: 188
		var2 -= this.yInset; // L: 189

		for (int var7 = var1; var7 < var3 + var1; ++var7) { // L: 190
			if (var7 >= 0 && var7 < this.xSize) { // L: 191
				for (int var8 = var2; var8 < var2 + var4; ++var8) { // L: 192
					if (var8 >= 0 && var8 < this.ySize) { // L: 193
						this.setFlag(var7, var8, var6);
					}
				}
			}
		}

	} // L: 197

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1733502883"
	)
	public void method4428(int var1, int var2) {
		var1 -= this.xInset; // L: 200
		var2 -= this.yInset; // L: 201
		int[] var10000 = this.flags[var1]; // L: 202
		var10000[var2] |= 2097152;
	} // L: 203

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1843022456"
	)
	public void method4415(int var1, int var2) {
		var1 -= this.xInset; // L: 206
		var2 -= this.yInset; // L: 207
		int[] var10000 = this.flags[var1]; // L: 208
		var10000[var2] |= 262144;
	} // L: 209

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "540001645"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 212
		var10000[var2] |= var3;
	} // L: 213

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1428053501"
	)
	public void method4440(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset; // L: 216
		var2 -= this.yInset; // L: 217
		if (var3 == 0) { // L: 218
			if (var4 == 0) { // L: 219
				this.setFlagOff(var1, var2, 128); // L: 220
				this.setFlagOff(var1 - 1, var2, 8); // L: 221
			}

			if (var4 == 1) { // L: 223
				this.setFlagOff(var1, var2, 2); // L: 224
				this.setFlagOff(var1, var2 + 1, 32); // L: 225
			}

			if (var4 == 2) { // L: 227
				this.setFlagOff(var1, var2, 8); // L: 228
				this.setFlagOff(var1 + 1, var2, 128); // L: 229
			}

			if (var4 == 3) { // L: 231
				this.setFlagOff(var1, var2, 32); // L: 232
				this.setFlagOff(var1, var2 - 1, 2); // L: 233
			}
		}

		if (var3 == 1 || var3 == 3) { // L: 236
			if (var4 == 0) { // L: 237
				this.setFlagOff(var1, var2, 1); // L: 238
				this.setFlagOff(var1 - 1, var2 + 1, 16); // L: 239
			}

			if (var4 == 1) { // L: 241
				this.setFlagOff(var1, var2, 4); // L: 242
				this.setFlagOff(var1 + 1, var2 + 1, 64); // L: 243
			}

			if (var4 == 2) { // L: 245
				this.setFlagOff(var1, var2, 16); // L: 246
				this.setFlagOff(var1 + 1, var2 - 1, 1); // L: 247
			}

			if (var4 == 3) { // L: 249
				this.setFlagOff(var1, var2, 64); // L: 250
				this.setFlagOff(var1 - 1, var2 - 1, 4); // L: 251
			}
		}

		if (var3 == 2) { // L: 254
			if (var4 == 0) { // L: 255
				this.setFlagOff(var1, var2, 130); // L: 256
				this.setFlagOff(var1 - 1, var2, 8); // L: 257
				this.setFlagOff(var1, var2 + 1, 32); // L: 258
			}

			if (var4 == 1) { // L: 260
				this.setFlagOff(var1, var2, 10); // L: 261
				this.setFlagOff(var1, var2 + 1, 32); // L: 262
				this.setFlagOff(var1 + 1, var2, 128); // L: 263
			}

			if (var4 == 2) { // L: 265
				this.setFlagOff(var1, var2, 40); // L: 266
				this.setFlagOff(var1 + 1, var2, 128); // L: 267
				this.setFlagOff(var1, var2 - 1, 2); // L: 268
			}

			if (var4 == 3) { // L: 270
				this.setFlagOff(var1, var2, 160); // L: 271
				this.setFlagOff(var1, var2 - 1, 2); // L: 272
				this.setFlagOff(var1 - 1, var2, 8); // L: 273
			}
		}

		if (var5) { // L: 276
			if (var3 == 0) { // L: 277
				if (var4 == 0) { // L: 278
					this.setFlagOff(var1, var2, 65536); // L: 279
					this.setFlagOff(var1 - 1, var2, 4096); // L: 280
				}

				if (var4 == 1) { // L: 282
					this.setFlagOff(var1, var2, 1024); // L: 283
					this.setFlagOff(var1, var2 + 1, 16384); // L: 284
				}

				if (var4 == 2) { // L: 286
					this.setFlagOff(var1, var2, 4096); // L: 287
					this.setFlagOff(var1 + 1, var2, 65536); // L: 288
				}

				if (var4 == 3) { // L: 290
					this.setFlagOff(var1, var2, 16384); // L: 291
					this.setFlagOff(var1, var2 - 1, 1024); // L: 292
				}
			}

			if (var3 == 1 || var3 == 3) { // L: 295
				if (var4 == 0) { // L: 296
					this.setFlagOff(var1, var2, 512); // L: 297
					this.setFlagOff(var1 - 1, var2 + 1, 8192); // L: 298
				}

				if (var4 == 1) { // L: 300
					this.setFlagOff(var1, var2, 2048); // L: 301
					this.setFlagOff(var1 + 1, var2 + 1, 32768); // L: 302
				}

				if (var4 == 2) { // L: 304
					this.setFlagOff(var1, var2, 8192); // L: 305
					this.setFlagOff(var1 + 1, var2 - 1, 512); // L: 306
				}

				if (var4 == 3) { // L: 308
					this.setFlagOff(var1, var2, 32768); // L: 309
					this.setFlagOff(var1 - 1, var2 - 1, 2048); // L: 310
				}
			}

			if (var3 == 2) { // L: 313
				if (var4 == 0) { // L: 314
					this.setFlagOff(var1, var2, 66560); // L: 315
					this.setFlagOff(var1 - 1, var2, 4096); // L: 316
					this.setFlagOff(var1, var2 + 1, 16384); // L: 317
				}

				if (var4 == 1) { // L: 319
					this.setFlagOff(var1, var2, 5120); // L: 320
					this.setFlagOff(var1, var2 + 1, 16384); // L: 321
					this.setFlagOff(var1 + 1, var2, 65536); // L: 322
				}

				if (var4 == 2) { // L: 324
					this.setFlagOff(var1, var2, 20480); // L: 325
					this.setFlagOff(var1 + 1, var2, 65536); // L: 326
					this.setFlagOff(var1, var2 - 1, 1024); // L: 327
				}

				if (var4 == 3) { // L: 329
					this.setFlagOff(var1, var2, 81920); // L: 330
					this.setFlagOff(var1, var2 - 1, 1024); // L: 331
					this.setFlagOff(var1 - 1, var2, 4096); // L: 332
				}
			}
		}

	} // L: 336

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "-655182886"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 33554688; // L: 339
		if (var6) { // L: 340
			var7 += 131072; // L: 341
		}

		var1 -= this.xInset; // L: 343
		var2 -= this.yInset; // L: 344
		int var8;
		if (var5 == 1 || var5 == 3) { // L: 345
			var8 = var3; // L: 346
			var3 = var4; // L: 347
			var4 = var8; // L: 348
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) { // L: 350
			if (var8 >= 0 && var8 < this.xSize) { // L: 351
				for (int var9 = var2; var9 < var2 + var4; ++var9) { // L: 352
					if (var9 >= 0 && var9 < this.ySize) { // L: 353
						this.setFlagOff(var8, var9, var7); // L: 354
					}
				}
			}
		}

	} // L: 359

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "271071563"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1]; // L: 362
		var10000[var2] &= ~var3;
	} // L: 363

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1153744765"
	)
	public void method4419(int var1, int var2) {
		var1 -= this.xInset; // L: 366
		var2 -= this.yInset; // L: 367
		int[] var10000 = this.flags[var1]; // L: 368
		var10000[var2] &= -262145;
	} // L: 369
}
