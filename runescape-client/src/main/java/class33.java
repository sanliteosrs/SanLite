import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class33 {
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 2046874205
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 677815153
	)
	int field164;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1667996831
	)
	int field163;

	class33(int var1, int var2) {
		this.field164 = var1;
		this.field163 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbm;I)Z",
		garbageValue = "884934195"
	)
	boolean method477(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field164) {
			case 1:
				return var1.vmethod4396(this.field163); // L: 22
			case 2:
				return var1.vmethod4375(this.field163);
			case 3:
				return var1.vmethod4378((char)this.field163);
			case 4:
				return var1.vmethod4380(this.field163 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;II)Lmv;",
		garbageValue = "1882744642"
	)
	static MusicPatch method482(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2); // L: 26
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpe;I)I",
		garbageValue = "-1400843805"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = class91.method2389(var9); // L: 33
			var8 = class91.method2389(var10); // L: 34
			var9 = class141.standardizeChar(var9, var2); // L: 35
			var10 = class141.standardizeChar(var10, var2); // L: 36
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var10 != var9) { // L: 40
					return class415.lowercaseChar(var9, var2) - class415.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) { // L: 55
					return class415.lowercaseChar(var11, var2) - class415.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var12 != var13) { // L: 63
					return class415.lowercaseChar(var12, var2) - class415.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfd;FFFFFFFFB)V",
		garbageValue = "35"
	)
	static void method480(class135 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 259
			float var9 = var4 - var1; // L: 262
			if ((double)var9 != 0.0D) { // L: 263
				float var10 = var2 - var1; // L: 266
				float var11 = var3 - var1; // L: 267
				float[] var12 = new float[]{var10 / var9, var11 / var9}; // L: 268 269 270
				var0.field1594 = var12[0] == 0.33333334F && 0.6666667F == var12[1]; // L: 271
				float var13 = var12[0]; // L: 272
				float var14 = var12[1]; // L: 273
				if ((double)var12[0] < 0.0D) { // L: 274
					var12[0] = 0.0F;
				}

				if ((double)var12[1] > 1.0D) { // L: 275
					var12[1] = 1.0F;
				}

				float var15;
				if ((double)var12[0] > 1.0D || var12[1] < -1.0F) { // L: 276
					var12[1] = 1.0F - var12[1]; // L: 278
					if (var12[0] < 0.0F) { // L: 279
						var12[0] = 0.0F;
					}

					if (var12[1] < 0.0F) { // L: 280
						var12[1] = 0.0F;
					}

					if (var12[0] > 1.0F || var12[1] > 1.0F) { // L: 281
						var15 = (float)((double)(var12[0] * (var12[0] - 2.0F + var12[1])) + ((double)var12[1] - 2.0D) * (double)var12[1] + 1.0D); // L: 282
						if (var15 + class131.field1544 > 0.0F) { // L: 283
							BuddyRankComparator.method3029(var12); // L: 284
						}
					}

					var12[1] = 1.0F - var12[1]; // L: 287
				}

				if (var13 != var12[0]) { // L: 290
					var2 = var9 * var12[0] + var1; // L: 291
					if ((double)var13 != 0.0D) { // L: 292
						var6 = (var6 - var5) * var12[0] / var13 + var5; // L: 293
					}
				}

				if (var14 != var12[1]) { // L: 296
					float var10000 = var1 + var12[1] * var9; // L: 297
					if (1.0D != (double)var14) { // L: 298
						var7 = (float)((double)var8 - (1.0D - (double)var12[1]) * (double)(var8 - var7) / (1.0D - (double)var14)); // L: 299
					}
				}

				var0.field1592 = var1; // L: 302
				var0.field1591 = var4; // L: 303
				TileItem.method2795(0.0F, var12[0], var12[1], 1.0F, var0); // L: 304
				var15 = var6 - var5; // L: 306
				float var16 = var7 - var6; // L: 307
				float var17 = var8 - var7; // L: 308
				float var18 = var16 - var15; // L: 309
				var0.field1582 = var17 - var16 - var18; // L: 310
				var0.field1589 = var18 + var18 + var18; // L: 311
				var0.field1588 = var15 + var15 + var15; // L: 312
				var0.field1587 = var5; // L: 313
			}
		}
	} // L: 260 264 315

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-26"
	)
	static void method476(int var0, int var1, int var2, int var3) {
		class330.field3580 = var0; // L: 251
		class330.field3589 = var1; // L: 252
		class330.field3590 = var2; // L: 253
		class330.field3586 = var3; // L: 254
	} // L: 255

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "98"
	)
	static int method483(int var0, Script var1, boolean var2) {
		return 2; // L: 5156
	}
}
