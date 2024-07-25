import java.util.Collections;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public final class class83 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1409837805
	)
	static int field1044;
	@ObfuscatedName("ad")
	static short[][][] field1033;
	@ObfuscatedName("ag")
	static short[][][] field1034;
	@ObfuscatedName("ak")
	static byte[][][] field1035;
	@ObfuscatedName("aj")
	static int[][] field1039;
	@ObfuscatedName("av")
	static int[] field1037;
	@ObfuscatedName("ab")
	static int[] field1038;
	@ObfuscatedName("ae")
	static int[] field1036;
	@ObfuscatedName("al")
	static final int[] field1040;
	@ObfuscatedName("ay")
	static final int[] field1041;
	@ObfuscatedName("ao")
	static final int[] field1042;
	@ObfuscatedName("aa")
	static final int[] field1043;
	@ObfuscatedName("as")
	static final int[] field1032;
	@ObfuscatedName("aw")
	static final int[] field1045;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1581876365
	)
	static int field1046;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1640997177
	)
	static int field1047;

	static {
		field1044 = 99; // L: 13
		field1040 = new int[]{1, 2, 4, 8}; // L: 29
		field1041 = new int[]{16, 32, 64, 128}; // L: 30
		field1042 = new int[]{1, 0, -1, 0}; // L: 31
		field1043 = new int[]{0, -1, 0, 1}; // L: 32
		field1032 = new int[]{1, -1, -1, 1}; // L: 33
		field1045 = new int[]{-1, -1, 1, 1}; // L: 34
		field1046 = (int)(Math.random() * 17.0D) - 8; // L: 35
		field1047 = (int)(Math.random() * 33.0D) - 16; // L: 36
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "31168282"
	)
	public static void method2345(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 44
			class153.ByteArrayPool_alternativeSizes = var0; // L: 51
			class450.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 52
			class19.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 53

			for (int var2 = 0; var2 < class153.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 54
				class19.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 55
				ByteArrayPool.field4842.add(var0[var2]); // L: 56
			}

			Collections.sort(ByteArrayPool.field4842); // L: 58
		} else {
			class153.ByteArrayPool_alternativeSizes = null; // L: 45
			class450.ByteArrayPool_altSizeArrayCounts = null; // L: 46
			class19.ByteArrayPool_arrays = null; // L: 47
			class323.method6110(); // L: 48
		}
	} // L: 49 59

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1582739656"
	)
	public static int method2340(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 87 88 91
			var2 = var2 << 1 | var0 & 1; // L: 89
			var0 >>>= 1; // L: 90
		}

		return var2; // L: 93
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lde;[BIIIIIII)V"
	)
	static final void method2287(class101 var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Buffer var9 = new Buffer(var1); // L: 294
		int var10 = -1; // L: 295

		while (true) {
			int var11 = var9.method9575(); // L: 297
			if (var11 == 0) { // L: 298
				return; // L: 353
			}

			var10 += var11; // L: 299
			int var12 = 0; // L: 300

			while (true) {
				int var13 = var9.readUShortSmart(); // L: 302
				if (var13 == 0) { // L: 303
					break;
				}

				var12 += var13 - 1; // L: 304
				int var14 = var12 & 63; // L: 305
				int var15 = var12 >> 6 & 63; // L: 306
				int var16 = var12 >> 12; // L: 307
				int var17 = var9.readUnsignedByte(); // L: 308
				int var18 = var17 >> 2; // L: 309
				int var19 = var17 & 3; // L: 310
				if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) { // L: 311
					ObjectComposition var20 = class10.getObjectDefinition(var10); // L: 312
					int var21 = var3 + Clock.method4344(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19); // L: 313
					int var24 = var15 & 7; // L: 316
					int var25 = var14 & 7; // L: 317
					int var27 = var20.sizeX; // L: 319
					int var28 = var20.sizeY; // L: 320
					int var29;
					if ((var19 & 1) == 1) { // L: 322
						var29 = var27; // L: 323
						var27 = var28; // L: 324
						var28 = var29; // L: 325
					}

					int var26 = var8 & 3; // L: 327
					int var23;
					if (var26 == 0) { // L: 328
						var23 = var25; // L: 329
					} else if (var26 == 1) { // L: 332
						var23 = 7 - var24 - (var27 - 1); // L: 333
					} else if (var26 == 2) { // L: 336
						var23 = 7 - var25 - (var28 - 1); // L: 337
					} else {
						var23 = var24; // L: 340
					}

					var29 = var23 + var4; // L: 342
					if (var21 > 0 && var29 > 0 && var21 < var0.field1332 - 1 && var29 < var0.field1320 - 1) { // L: 343
						int var30 = var2; // L: 344
						if ((var0.field1325[1][var21][var29] & 2) == 2) { // L: 345
							var30 = var2 - 1;
						}

						CollisionMap var31 = null; // L: 346
						if (var30 >= 0 && var0.field1317 != null) { // L: 347
							var31 = var0.field1317[var30];
						}

						class25.method371(var0, var2, var21, var29, var10, var19 + var8 & 3, var18, var31); // L: 348
					}
				}
			}
		}
	}
}
