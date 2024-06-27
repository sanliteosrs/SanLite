import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jz")
public class class240 {
	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	static IndexedSprite[] field2526;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	class237[] field2528;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	public void method4538() {
		this.field2528 = new class237[1]; // L: 7
		class233 var1 = class233.field2478; // L: 8
		this.field2528[0] = new class237(var1.field2483, var1.field2475); // L: 9
	} // L: 10

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIILjv;Lip;Z[I[II)I",
		garbageValue = "-325600919"
	)
	public int method4512(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method4515(var1, var2, var3, var4, var5, var6, var7, var8, this.field2528[0]); // L: 13
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILjv;Lip;Z[I[ILjf;B)I",
		garbageValue = "-92"
	)
	int method4515(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class237 var9) {
		var9.method4458(); // L: 17
		int var10 = var9.method4462(); // L: 18
		int var11 = var9.method4463(); // L: 19
		int[][] var12 = var9.method4465(); // L: 20
		int[][] var13 = var9.method4464(); // L: 21
		int[] var14 = var9.method4466(); // L: 22
		int[] var15 = var9.method4467(); // L: 23
		boolean var16;
		if (var3 == 1) { // L: 25
			var16 = this.method4516(var1, var2, var4, var5, var9);
		} else if (var3 == 2) { // L: 26
			var16 = this.method4517(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method4531(var1, var2, var3, var4, var5, var9); // L: 27
		}

		int var17 = var1 - (var10 >> 1); // L: 28
		int var18 = var2 - (var11 >> 1); // L: 29
		int var19 = var9.method4494(); // L: 30
		int var20 = var9.method4461(); // L: 31
		int var21;
		int var22;
		int var24;
		if (!var16) { // L: 32
			if (!var6) { // L: 33
				return -1; // L: 66
			}

			var21 = Integer.MAX_VALUE; // L: 34
			var22 = Integer.MAX_VALUE; // L: 35
			byte var23 = 10; // L: 36
			var24 = var4.approxDestinationX; // L: 37
			int var25 = var4.approxDestinationY; // L: 38
			int var26 = var4.approxDestinationSizeX; // L: 39
			int var27 = var4.approxDestinationSizeY; // L: 40

			for (int var28 = var24 - var23; var28 <= var23 + var24; ++var28) { // L: 41
				for (int var29 = var25 - var23; var29 <= var23 + var25; ++var29) { // L: 42
					int var30 = var28 - var17; // L: 43
					int var31 = var29 - var18; // L: 44
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) { // L: 45 46
						int var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) {
							var32 = var28 - (var26 + var24 - 1);
						}

						int var33 = 0; // L: 50
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var27 + var25 - 1) {
							var33 = var29 - (var25 + var27 - 1);
						}

						int var34 = var33 * var33 + var32 * var32; // L: 53
						if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) { // L: 54
							var21 = var34; // L: 55
							var22 = var12[var30][var31]; // L: 56
							var19 = var28; // L: 57
							var20 = var29; // L: 58
						}
					}
				}
			}

			if (var21 == Integer.MAX_VALUE) { // L: 64
				return -1;
			}
		}

		if (var19 == var1 && var20 == var2) { // L: 68
			var7[0] = var19; // L: 69
			var8[0] = var20; // L: 70
			return 0; // L: 71
		} else {
			byte var36 = 0; // L: 73
			var14[var36] = var19; // L: 76
			var21 = var36 + 1; // L: 77
			var15[var36] = var20;

			int var37;
			for (var22 = var37 = var13[var19 - var17][var20 - var18]; var19 != var1 || var20 != var2; var22 = var13[var19 - var17][var20 - var18]) { // L: 78 79 89
				if (var37 != var22) { // L: 80
					var37 = var22; // L: 81
					var14[var21] = var19; // L: 82
					var15[var21++] = var20; // L: 83
				}

				if ((var22 & 2) != 0) { // L: 85
					++var19;
				} else if ((var22 & 8) != 0) { // L: 86
					--var19;
				}

				if ((var22 & 1) != 0) { // L: 87
					++var20;
				} else if ((var22 & 4) != 0) { // L: 88
					--var20;
				}
			}

			var24 = 0; // L: 91

			while (var21-- > 0) { // L: 92
				var7[var24] = var14[var21]; // L: 93
				var8[var24++] = var15[var21]; // L: 94
				if (var24 >= var7.length) { // L: 95
					break;
				}
			}

			return var24; // L: 97
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjv;Lip;Ljf;I)Z",
		garbageValue = "417425771"
	)
	final boolean method4516(int var1, int var2, RouteStrategy var3, CollisionMap var4, class237 var5) {
		int var6 = var5.method4462(); // L: 101
		int var7 = var5.method4463(); // L: 102
		int[][] var8 = var5.method4465(); // L: 103
		int[][] var9 = var5.method4464(); // L: 104
		int[] var10 = var5.method4466(); // L: 105
		int[] var11 = var5.method4467(); // L: 106
		int var12 = var5.method4468(); // L: 107
		int var13 = var1; // L: 108
		int var14 = var2; // L: 109
		int var15 = var6 >> 1; // L: 110
		int var16 = var7 >> 1; // L: 111
		int var17 = var1 - var15; // L: 112
		int var18 = var2 - var16; // L: 113
		var9[var15][var16] = 99; // L: 114
		var8[var15][var16] = 0; // L: 115
		byte var19 = 0; // L: 116
		int var20 = 0; // L: 117
		var10[var19] = var1; // L: 118
		byte var10001 = var19;
		int var25 = var19 + 1; // L: 119
		var11[var10001] = var2;
		int[][] var21 = var4.flags; // L: 120

		while (var20 != var25) { // L: 123
			var13 = var10[var20]; // L: 124
			var14 = var11[var20]; // L: 125
			var20 = var20 + 1 & var12; // L: 126
			var15 = var13 - var17; // L: 127
			var16 = var14 - var18; // L: 128
			int var22 = var13 - var4.xInset; // L: 129
			int var23 = var14 - var4.yInset; // L: 130
			if (var3.hasArrived(1, var13, var14, var4)) { // L: 131
				var5.method4483(var13, var14); // L: 132
				return true; // L: 133
			}

			int var24 = var8[var15][var16] + 1; // L: 135
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 1076101384) == 0) { // L: 136
				var10[var25] = var13 - 1; // L: 137
				var11[var25] = var14; // L: 138
				var25 = var25 + 1 & var12; // L: 139
				var9[var15 - 1][var16] = 2; // L: 140
				var8[var15 - 1][var16] = var24; // L: 141
			}

			if (var15 < var6 - 1 && var9[var15 + 1][var16] == 0 && (var21[var22 + 1][var23] & 1076101504) == 0) { // L: 143
				var10[var25] = var13 + 1; // L: 144
				var11[var25] = var14; // L: 145
				var25 = var25 + 1 & var12; // L: 146
				var9[var15 + 1][var16] = 8; // L: 147
				var8[var15 + 1][var16] = var24; // L: 148
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 1076101378) == 0) { // L: 150
				var10[var25] = var13; // L: 151
				var11[var25] = var14 - 1; // L: 152
				var25 = var25 + 1 & var12; // L: 153
				var9[var15][var16 - 1] = 1; // L: 154
				var8[var15][var16 - 1] = var24; // L: 155
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 1] & 1076101408) == 0) { // L: 157
				var10[var25] = var13; // L: 158
				var11[var25] = var14 + 1; // L: 159
				var25 = var25 + 1 & var12; // L: 160
				var9[var15][var16 + 1] = 4; // L: 161
				var8[var15][var16 + 1] = var24; // L: 162
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && (var21[var22][var23 - 1] & 1076101378) == 0) { // L: 164
				var10[var25] = var13 - 1; // L: 165
				var11[var25] = var14 - 1; // L: 166
				var25 = var25 + 1 & var12; // L: 167
				var9[var15 - 1][var16 - 1] = 3; // L: 168
				var8[var15 - 1][var16 - 1] = var24; // L: 169
			}

			if (var15 < var6 - 1 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 1076101507) == 0 && (var21[var22 + 1][var23] & 1076101504) == 0 && (var21[var22][var23 - 1] & 1076101378) == 0) { // L: 171
				var10[var25] = var13 + 1; // L: 172
				var11[var25] = var14 - 1; // L: 173
				var25 = var25 + 1 & var12; // L: 174
				var9[var15 + 1][var16 - 1] = 9; // L: 175
				var8[var15 + 1][var16 - 1] = var24; // L: 176
			}

			if (var15 > 0 && var16 < var7 - 1 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 1076101432) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && (var21[var22][var23 + 1] & 1076101408) == 0) { // L: 178
				var10[var25] = var13 - 1; // L: 179
				var11[var25] = var14 + 1; // L: 180
				var25 = var25 + 1 & var12; // L: 181
				var9[var15 - 1][var16 + 1] = 6; // L: 182
				var8[var15 - 1][var16 + 1] = var24; // L: 183
			}

			if (var15 < var6 - 1 && var16 < var7 - 1 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 1] & 1076101600) == 0 && (var21[var22 + 1][var23] & 1076101504) == 0 && (var21[var22][var23 + 1] & 1076101408) == 0) { // L: 185
				var10[var25] = var13 + 1; // L: 186
				var11[var25] = var14 + 1; // L: 187
				var25 = var25 + 1 & var12; // L: 188
				var9[var15 + 1][var16 + 1] = 12; // L: 189
				var8[var15 + 1][var16 + 1] = var24; // L: 190
			}
		}

		var5.method4483(var13, var14); // L: 193
		return false; // L: 194
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILjv;Lip;Ljf;I)Z",
		garbageValue = "-2008444200"
	)
	final boolean method4517(int var1, int var2, RouteStrategy var3, CollisionMap var4, class237 var5) {
		int var6 = var5.method4462(); // L: 198
		int var7 = var5.method4463(); // L: 199
		int[][] var8 = var5.method4465(); // L: 200
		int[][] var9 = var5.method4464(); // L: 201
		int[] var10 = var5.method4466(); // L: 202
		int[] var11 = var5.method4467(); // L: 203
		int var12 = var5.method4468(); // L: 204
		int var13 = var1; // L: 205
		int var14 = var2; // L: 206
		int var15 = var6 >> 1; // L: 207
		int var16 = var7 >> 1; // L: 208
		int var17 = var1 - var15; // L: 209
		int var18 = var2 - var16; // L: 210
		var9[var15][var16] = 99; // L: 211
		var8[var15][var16] = 0; // L: 212
		byte var19 = 0; // L: 213
		int var20 = 0; // L: 214
		var10[var19] = var1; // L: 215
		byte var10001 = var19;
		int var25 = var19 + 1; // L: 216
		var11[var10001] = var2;
		int[][] var21 = var4.flags; // L: 217

		while (var20 != var25) { // L: 218
			var13 = var10[var20]; // L: 219
			var14 = var11[var20]; // L: 220
			var20 = var20 + 1 & var12; // L: 221
			var15 = var13 - var17; // L: 222
			var16 = var14 - var18; // L: 223
			int var22 = var13 - var4.xInset; // L: 224
			int var23 = var14 - var4.yInset; // L: 225
			if (var3.hasArrived(2, var13, var14, var4)) { // L: 226
				var5.method4483(var13, var14); // L: 227
				return true; // L: 228
			}

			int var24 = var8[var15][var16] + 1; // L: 230
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && (var21[var22 - 1][var23] & 1076101390) == 0 && (var21[var22 - 1][var23 + 1] & 1076101432) == 0) { // L: 231 232 233 234
				var10[var25] = var13 - 1; // L: 235
				var11[var25] = var14; // L: 236
				var25 = var25 + 1 & var12; // L: 237
				var9[var15 - 1][var16] = 2; // L: 238
				var8[var15 - 1][var16] = var24; // L: 239
			}

			if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & 1076101507) == 0 && (var21[var22 + 2][var23 + 1] & 1076101600) == 0) { // L: 241 242 243 244
				var10[var25] = var13 + 1; // L: 245
				var11[var25] = var14; // L: 246
				var25 = var25 + 1 & var12; // L: 247
				var9[var15 + 1][var16] = 8; // L: 248
				var8[var15 + 1][var16] = var24; // L: 249
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && (var21[var22][var23 - 1] & 1076101390) == 0 && (var21[var22 + 1][var23 - 1] & 1076101507) == 0) { // L: 251 252 253 254
				var10[var25] = var13; // L: 255
				var11[var25] = var14 - 1; // L: 256
				var25 = var25 + 1 & var12; // L: 257
				var9[var15][var16 - 1] = 1; // L: 258
				var8[var15][var16 - 1] = var24; // L: 259
			}

			if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 1076101432) == 0 && (var21[var22 + 1][var23 + 2] & 1076101600) == 0) { // L: 261 262 263 264
				var10[var25] = var13; // L: 265
				var11[var25] = var14 + 1; // L: 266
				var25 = var25 + 1 & var12; // L: 267
				var9[var15][var16 + 1] = 4; // L: 268
				var8[var15][var16 + 1] = var24; // L: 269
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23] & 1076101438) == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22][var23 - 1] & 1076101519) == 0) { // L: 271 272 273 274 275
				var10[var25] = var13 - 1; // L: 276
				var11[var25] = var14 - 1; // L: 277
				var25 = var25 + 1 & var12; // L: 278
				var9[var15 - 1][var16 - 1] = 3; // L: 279
				var8[var15 - 1][var16 - 1] = var24; // L: 280
			}

			if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && (var21[var22 + 1][var23 - 1] & 1076101519) == 0 && (var21[var22 + 2][var23 - 1] & 1076101507) == 0 && (var21[var22 + 2][var23] & 1076101603) == 0) { // L: 282 283 284 285 286
				var10[var25] = var13 + 1; // L: 287
				var11[var25] = var14 - 1; // L: 288
				var25 = var25 + 1 & var12; // L: 289
				var9[var15 + 1][var16 - 1] = 9; // L: 290
				var8[var15 + 1][var16 - 1] = var24; // L: 291
			}

			if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][var23 + 1] & 1076101438) == 0 && (var21[var22 - 1][var23 + 2] & 1076101432) == 0 && (var21[var22][var23 + 2] & 1076101624) == 0) { // L: 293 294 295 296 297
				var10[var25] = var13 - 1; // L: 298
				var11[var25] = var14 + 1; // L: 299
				var25 = var25 + 1 & var12; // L: 300
				var9[var15 - 1][var16 + 1] = 6; // L: 301
				var8[var15 - 1][var16 + 1] = var24; // L: 302
			}

			if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && (var21[var22 + 1][var23 + 2] & 1076101624) == 0 && (var21[var22 + 2][var23 + 2] & 1076101600) == 0 && (var21[var22 + 2][var23 + 1] & 1076101603) == 0) { // L: 304 305 306 307 308
				var10[var25] = var13 + 1; // L: 309
				var11[var25] = var14 + 1; // L: 310
				var25 = var25 + 1 & var12; // L: 311
				var9[var15 + 1][var16 + 1] = 12; // L: 312
				var8[var15 + 1][var16 + 1] = var24; // L: 313
			}
		}

		var5.method4483(var13, var14); // L: 316
		return false; // L: 317
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILjv;Lip;Ljf;I)Z",
		garbageValue = "-1600755395"
	)
	final boolean method4531(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class237 var6) {
		int var7 = var6.method4462(); // L: 321
		int var8 = var6.method4463(); // L: 322
		int[][] var9 = var6.method4465(); // L: 323
		int[][] var10 = var6.method4464(); // L: 324
		int[] var11 = var6.method4466(); // L: 325
		int[] var12 = var6.method4467(); // L: 326
		int var13 = var6.method4468(); // L: 327
		int var14 = var1; // L: 328
		int var15 = var2; // L: 329
		int var16 = var7 >> 1; // L: 330
		int var17 = var8 >> 1; // L: 331
		int var18 = var1 - var16; // L: 332
		int var19 = var2 - var17; // L: 333
		var10[var16][var17] = 99; // L: 334
		var9[var16][var17] = 0; // L: 335
		byte var20 = 0; // L: 336
		int var21 = 0; // L: 337
		var11[var20] = var1; // L: 338
		int var27 = var20 + 1; // L: 339
		var12[var20] = var2;
		int[][] var22 = var5.flags; // L: 340

		while (true) {
			label309:
			while (true) {
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label286:
							do {
								if (var27 == var21) { // L: 341
									var6.method4483(var14, var15); // L: 459
									return false; // L: 460
								}

								var14 = var11[var21]; // L: 342
								var15 = var12[var21]; // L: 343
								var21 = var21 + 1 & var13; // L: 344
								var16 = var14 - var18; // L: 345
								var17 = var15 - var19; // L: 346
								var23 = var14 - var5.xInset; // L: 347
								var24 = var15 - var5.yInset; // L: 348
								if (var4.hasArrived(var3, var14, var15, var5)) { // L: 349
									var6.method4483(var14, var15); // L: 350
									return true; // L: 351
								}

								var25 = var9[var16][var17] + 1; // L: 353
								if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 1076101390) == 0 && (var22[var23 - 1][var3 + var24 - 1] & 1076101432) == 0) { // L: 354 355 356 357
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14 - 1; // L: 361
											var12[var27] = var15; // L: 362
											var27 = var27 + 1 & var13; // L: 363
											var10[var16 - 1][var17] = 2; // L: 364
											var9[var16 - 1][var17] = var25; // L: 365
											break;
										}

										if ((var22[var23 - 1][var24 + var26] & 1076101438) != 0) { // L: 359
											break;
										}

										++var26; // L: 358
									}
								}

								if (var16 < var7 - var3 && var10[var16 + 1][var17] == 0 && (var22[var3 + var23][var24] & 1076101507) == 0 && (var22[var3 + var23][var3 + var24 - 1] & 1076101600) == 0) { // L: 367 368 369 370
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14 + 1; // L: 374
											var12[var27] = var15; // L: 375
											var27 = var27 + 1 & var13; // L: 376
											var10[var16 + 1][var17] = 8; // L: 377
											var9[var16 + 1][var17] = var25; // L: 378
											break;
										}

										if ((var22[var3 + var23][var26 + var24] & 1076101603) != 0) { // L: 372
											break;
										}

										++var26; // L: 371
									}
								}

								if (var17 > 0 && var10[var16][var17 - 1] == 0 && (var22[var23][var24 - 1] & 1076101390) == 0 && (var22[var3 + var23 - 1][var24 - 1] & 1076101507) == 0) { // L: 380 381 382 383
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14; // L: 387
											var12[var27] = var15 - 1; // L: 388
											var27 = var27 + 1 & var13; // L: 389
											var10[var16][var17 - 1] = 1; // L: 390
											var9[var16][var17 - 1] = var25; // L: 391
											break;
										}

										if ((var22[var23 + var26][var24 - 1] & 1076101519) != 0) { // L: 385
											break;
										}

										++var26; // L: 384
									}
								}

								if (var17 < var8 - var3 && var10[var16][var17 + 1] == 0 && (var22[var23][var3 + var24] & 1076101432) == 0 && (var22[var3 + var23 - 1][var3 + var24] & 1076101600) == 0) { // L: 393 394 395 396
									var26 = 1;

									while (true) {
										if (var26 >= var3 - 1) {
											var11[var27] = var14; // L: 400
											var12[var27] = var15 + 1; // L: 401
											var27 = var27 + 1 & var13; // L: 402
											var10[var16][var17 + 1] = 4; // L: 403
											var9[var16][var17 + 1] = var25; // L: 404
											break;
										}

										if ((var22[var23 + var26][var3 + var24] & 1076101624) != 0) { // L: 398
											break;
										}

										++var26; // L: 397
									}
								}

								if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 1076101390) == 0) { // L: 406 407 408
									var26 = 1;

									while (true) {
										if (var26 >= var3) {
											var11[var27] = var14 - 1; // L: 413
											var12[var27] = var15 - 1; // L: 414
											var27 = var27 + 1 & var13; // L: 415
											var10[var16 - 1][var17 - 1] = 3; // L: 416
											var9[var16 - 1][var17 - 1] = var25; // L: 417
											break;
										}

										if ((var22[var23 - 1][var26 + (var24 - 1)] & 1076101438) != 0 || (var22[var26 + (var23 - 1)][var24 - 1] & 1076101519) != 0) { // L: 410 411
											break;
										}

										++var26; // L: 409
									}
								}

								if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var3 + var23][var24 - 1] & 1076101507) == 0) { // L: 419 420 421
									var26 = 1;

									while (true) {
										if (var26 >= var3) {
											var11[var27] = var14 + 1; // L: 426
											var12[var27] = var15 - 1; // L: 427
											var27 = var27 + 1 & var13; // L: 428
											var10[var16 + 1][var17 - 1] = 9; // L: 429
											var9[var16 + 1][var17 - 1] = var25; // L: 430
											break;
										}

										if ((var22[var3 + var23][var26 + (var24 - 1)] & 1076101603) != 0 || (var22[var23 + var26][var24 - 1] & 1076101519) != 0) { // L: 423 424
											break;
										}

										++var26; // L: 422
									}
								}

								if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][var17 + 1] == 0 && (var22[var23 - 1][var3 + var24] & 1076101432) == 0) { // L: 432 433 434
									for (var26 = 1; var26 < var3; ++var26) { // L: 435
										if ((var22[var23 - 1][var24 + var26] & 1076101438) != 0 || (var22[var26 + (var23 - 1)][var3 + var24] & 1076101624) != 0) { // L: 436 437
											continue label286;
										}
									}

									var11[var27] = var14 - 1; // L: 439
									var12[var27] = var15 + 1; // L: 440
									var27 = var27 + 1 & var13; // L: 441
									var10[var16 - 1][var17 + 1] = 6; // L: 442
									var9[var16 - 1][var17 + 1] = var25; // L: 443
								}
							} while(var16 >= var7 - var3); // L: 445
						} while(var17 >= var8 - var3);
					} while(var10[var16 + 1][var17 + 1] != 0); // L: 446
				} while((var22[var3 + var23][var3 + var24] & 1076101600) != 0); // L: 447

				for (var26 = 1; var26 < var3; ++var26) { // L: 448
					if ((var22[var26 + var23][var3 + var24] & 1076101624) != 0 || (var22[var3 + var23][var24 + var26] & 1076101603) != 0) { // L: 449 450
						continue label309;
					}
				}

				var11[var27] = var14 + 1; // L: 452
				var12[var27] = var15 + 1; // L: 453
				var27 = var27 + 1 & var13; // L: 454
				var10[var16 + 1][var17 + 1] = 12; // L: 455
				var9[var16 + 1][var17 + 1] = var25; // L: 456
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-12954708"
	)
	public static int method4537(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "656489867"
	)
	static int method4536(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4753
			var3 = class511.field5137.field1318; // L: 4754
			int var15 = (SoundCache.localPlayer.x >> 7) + class511.field5137.field1321; // L: 4755
			int var8 = (SoundCache.localPlayer.field1191 >> 7) + class511.field5137.field1323; // L: 4756
			class16.getWorldMap().method9011(var3, var15, var8, true); // L: 4757
			return 1; // L: 4758
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4760
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4761
				String var16 = ""; // L: 4762
				var9 = class16.getWorldMap().getMapArea(var3); // L: 4763
				if (var9 != null) { // L: 4764
					var16 = var9.getExternalName(); // L: 4765
				}

				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var16; // L: 4767
				return 1; // L: 4768
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4770
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4771
				class16.getWorldMap().setCurrentMapAreaId(var3); // L: 4772
				return 1; // L: 4773
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4775
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().getZoomLevel(); // L: 4776
				return 1; // L: 4777
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4779
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4780
				class16.getWorldMap().setZoomPercentage(var3); // L: 4781
				return 1; // L: 4782
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4784
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4785
				return 1; // L: 4786
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4788
					var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4789
					class16.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4790
					return 1; // L: 4791
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4793
					var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4794
					class16.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4795
					return 1; // L: 4796
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4798
					var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4799
					class16.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4800
					return 1; // L: 4801
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4803
					var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4804
					class16.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4805
					return 1; // L: 4806
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4808
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().getDisplayX(); // L: 4809
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().getDisplayY(); // L: 4810
					return 1; // L: 4811
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4813
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4814
						var11 = class16.getWorldMap().getMapArea(var3); // L: 4815
						if (var11 == null) { // L: 4816
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4817
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4820
						}

						return 1; // L: 4822
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4824
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4825
						var11 = class16.getWorldMap().getMapArea(var3); // L: 4826
						if (var11 == null) { // L: 4827
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4828
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4829
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4832
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4833
						}

						return 1; // L: 4835
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4837
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4838
						var11 = class16.getWorldMap().getMapArea(var3); // L: 4839
						if (var11 == null) { // L: 4840
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4841
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4842
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4843
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4844
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4847
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4848
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4849
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4850
						}

						return 1; // L: 4852
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4854
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4855
						var11 = class16.getWorldMap().getMapArea(var3); // L: 4856
						if (var11 == null) { // L: 4857
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4858
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4861
						}

						return 1; // L: 4863
					} else if (var0 == 6615) { // L: 4865
						var14 = class16.getWorldMap().getDisplayCoord(); // L: 4866
						if (var14 == null) { // L: 4867
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4868
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4869
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var14.x; // L: 4872
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var14.y; // L: 4873
						}

						return 1; // L: 4875
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4877
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().currentMapAreaId(); // L: 4878
						return 1; // L: 4879
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4881
						var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4882
						var11 = class16.getWorldMap().getCurrentMapArea(); // L: 4883
						if (var11 == null) { // L: 4884
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4885
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4886
							return 1; // L: 4887
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4889
							if (var12 == null) { // L: 4890
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4891
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4892
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var12[0]; // L: 4895
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var12[1]; // L: 4896
							}

							return 1; // L: 4898
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4900
							var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4901
							var11 = class16.getWorldMap().getCurrentMapArea(); // L: 4902
							if (var11 == null) { // L: 4903
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4904
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4905
								return 1; // L: 4906
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4908
								if (var5 == null) { // L: 4909
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4910
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.packed(); // L: 4913
								}

								return 1; // L: 4915
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4917
								class130.Interpreter_intStackSize -= 2; // L: 4918
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4919
								var10 = new Coord(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 4920
								class304.method6031(var3, var10, false); // L: 4921
								return 1; // L: 4922
							} else if (var0 == 6620) { // L: 4924
								class130.Interpreter_intStackSize -= 2; // L: 4925
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4926
								var10 = new Coord(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 4927
								class304.method6031(var3, var10, true); // L: 4928
								return 1; // L: 4929
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4931
								class130.Interpreter_intStackSize -= 2; // L: 4932
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4933
								var10 = new Coord(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 4934
								var9 = class16.getWorldMap().getMapArea(var3); // L: 4935
								if (var9 == null) { // L: 4936
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4937
									return 1; // L: 4938
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4940
									return 1; // L: 4941
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4943
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().getDisplayWith(); // L: 4944
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().getDisplayHeight(); // L: 4945
								return 1; // L: 4946
							} else if (var0 == 6623) { // L: 4948
								var14 = new Coord(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4949
								var11 = class16.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4950
								if (var11 == null) { // L: 4951
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4952
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var11.getId(); // L: 4955
								}

								return 1; // L: 4957
							} else if (var0 == 6624) { // L: 4959
								class16.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4960
								return 1; // L: 4961
							} else if (var0 == 6625) { // L: 4963
								class16.getWorldMap().resetMaxFlashCount(); // L: 4964
								return 1; // L: 4965
							} else if (var0 == 6626) { // L: 4967
								class16.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 4968
								return 1; // L: 4969
							} else if (var0 == 6627) { // L: 4971
								class16.getWorldMap().resetCyclesPerFlash(); // L: 4972
								return 1; // L: 4973
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4975
									var13 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 4976
									class16.getWorldMap().setPerpetualFlash(var13); // L: 4977
									return 1; // L: 4978
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4980
									var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4981
									class16.getWorldMap().flashElement(var3); // L: 4982
									return 1; // L: 4983
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4985
									var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4986
									class16.getWorldMap().flashCategory(var3); // L: 4987
									return 1; // L: 4988
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4990
									class16.getWorldMap().stopCurrentFlashes(); // L: 4991
									return 1; // L: 4992
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4994
									var13 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 4995
									class16.getWorldMap().setElementsDisabled(var13); // L: 4996
									return 1; // L: 4997
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4999
										class130.Interpreter_intStackSize -= 2; // L: 5000
										var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 5001
										var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1; // L: 5002
										class16.getWorldMap().disableElement(var3, var7); // L: 5003
										return 1; // L: 5004
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 5006
										class130.Interpreter_intStackSize -= 2; // L: 5007
										var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 5008
										var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1; // L: 5009
										class16.getWorldMap().setCategoryDisabled(var3, var7); // L: 5010
										return 1; // L: 5011
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 5013
										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 5014
										return 1; // L: 5015
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 5017
										var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5018
										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 5019
										return 1; // L: 5020
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 5022
										var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5023
										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class16.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 5024
										return 1; // L: 5025
									} else if (var0 == 6638) { // L: 5027
										class130.Interpreter_intStackSize -= 2; // L: 5028
										var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 5029
										var10 = new Coord(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 5030
										var5 = class16.getWorldMap().method9056(var3, var10); // L: 5031
										if (var5 == null) { // L: 5032
											Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 5033
										} else {
											Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.packed(); // L: 5036
										}

										return 1; // L: 5038
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 5040
											var6 = class16.getWorldMap().iconStart(); // L: 5041
											if (var6 == null) { // L: 5042
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 5043
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 5044
											} else {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5047
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5048
											}

											return 1; // L: 5050
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 5052
											var6 = class16.getWorldMap().iconNext(); // L: 5053
											if (var6 == null) { // L: 5054
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 5055
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 5056
											} else {
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5059
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5060
											}

											return 1; // L: 5062
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 5064
												var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5065
												var4 = class165.WorldMapElement_get(var3); // L: 5066
												if (var4.name == null) { // L: 5067
													Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 5068
												} else {
													Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.name; // L: 5071
												}

												return 1; // L: 5073
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5075
												var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5076
												var4 = class165.WorldMapElement_get(var3); // L: 5077
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.textSize; // L: 5078
												return 1; // L: 5079
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5081
												var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5082
												var4 = class165.WorldMapElement_get(var3); // L: 5083
												if (var4 == null) { // L: 5084
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 5085
												} else {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.category; // L: 5088
												}

												return 1; // L: 5090
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5092
												var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5093
												var4 = class165.WorldMapElement_get(var3); // L: 5094
												if (var4 == null) { // L: 5095
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 5096
												} else {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5099
												}

												return 1; // L: 5101
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5103
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class283.worldMapEvent.mapElement; // L: 5104
												return 1; // L: 5105
											} else if (var0 == 6698) { // L: 5107
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class283.worldMapEvent.coord1.packed(); // L: 5108
												return 1; // L: 5109
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5111
												Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class283.worldMapEvent.coord2.packed(); // L: 5112
												return 1; // L: 5113
											} else {
												return 2; // L: 5115
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-9"
	)
	static Object method4522(int var0) {
		return Player.method2461((class534)class210.findEnumerated(class534.method9415(), var0)); // L: 5399
	}
}
