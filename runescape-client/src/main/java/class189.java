import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class189 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	static {
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "2141473903"
	)
	public static String method3693(CharSequence var0) {
		long var3 = 0L; // L: 44
		int var5 = var0.length(); // L: 45

		for (int var6 = 0; var6 < var5; ++var6) { // L: 46
			var3 *= 37L; // L: 47
			char var7 = var0.charAt(var6); // L: 48
			if (var7 >= 'A' && var7 <= 'Z') { // L: 49
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') { // L: 50
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48); // L: 51
			}

			if (var3 >= 177917621779460413L) { // L: 52
				break;
			}
		}

		while (var3 % 37L == 0L && var3 != 0L) { // L: 54
			var3 /= 37L;
		}

		String var8 = class237.base37DecodeLong(var3); // L: 57
		if (var8 == null) { // L: 58
			var8 = "";
		}

		return var8; // L: 59
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfd;FZI)F",
		garbageValue = "-131890586"
	)
	static float method3695(class135 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 173
		if (var0 != null && var0.method3150() != 0) { // L: 174
			float var4 = (float)var0.field1579[0].field1526; // L: 177
			float var5 = (float)var0.field1579[var0.method3150() - 1].field1526; // L: 178
			float var6 = var5 - var4; // L: 179
			if (0.0D == (double)var6) { // L: 180
				return var0.field1579[0].field1527; // L: 181
			} else {
				float var7 = 0.0F; // L: 183
				if (var1 > var5) { // L: 184
					var7 = (var1 - var5) / var6; // L: 185
				} else {
					var7 = (var1 - var4) / var6; // L: 188
				}

				double var8 = (double)((int)var7); // L: 190
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 191
				float var11 = var6 * var10; // L: 192
				var8 = Math.abs(1.0D + var8); // L: 193
				double var12 = var8 / 2.0D; // L: 194
				double var14 = (double)((int)var12); // L: 195
				var10 = (float)(var12 - var14); // L: 196
				float var16;
				float var17;
				if (var2) { // L: 199
					if (var0.field1580 == class133.field1564) { // L: 200
						if ((double)var10 != 0.0D) { // L: 201
							var11 += var4; // L: 202
						} else {
							var11 = var5 - var11; // L: 205
						}
					} else if (var0.field1580 != class133.field1562 && var0.field1580 != class133.field1563) { // L: 208
						if (var0.field1580 == class133.field1561) { // L: 211
							var11 = var4 - var1; // L: 212
							var16 = var0.field1579[0].field1528; // L: 213
							var17 = var0.field1579[0].field1529; // L: 214
							var3 = var0.field1579[0].field1527; // L: 215
							if ((double)var16 != 0.0D) { // L: 216
								var3 -= var11 * var17 / var16; // L: 217
							}

							return var3; // L: 219
						}
					} else {
						var11 = var5 - var11; // L: 209
					}
				} else if (var0.field1583 == class133.field1564) { // L: 223
					if (0.0D != (double)var10) { // L: 224
						var11 = var5 - var11; // L: 225
					} else {
						var11 += var4; // L: 228
					}
				} else if (var0.field1583 != class133.field1562 && var0.field1583 != class133.field1563) { // L: 231
					if (var0.field1583 == class133.field1561) { // L: 234
						var11 = var1 - var5; // L: 235
						var16 = var0.field1579[var0.method3150() - 1].field1535; // L: 236
						var17 = var0.field1579[var0.method3150() - 1].field1531; // L: 237
						var3 = var0.field1579[var0.method3150() - 1].field1527; // L: 238
						if ((double)var16 != 0.0D) { // L: 239
							var3 += var11 * var17 / var16; // L: 240
						}

						return var3; // L: 242
					}
				} else {
					var11 += var4; // L: 232
				}

				var3 = class128.method3050(var0, var11); // L: 245
				float var18;
				if (var2 && var0.field1580 == class133.field1563) { // L: 247
					var18 = var0.field1579[var0.method3150() - 1].field1527 - var0.field1579[0].field1527; // L: 248
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 249
				} else if (!var2 && var0.field1583 == class133.field1563) { // L: 251
					var18 = var0.field1579[var0.method3150() - 1].field1527 - var0.field1579[0].field1527; // L: 252
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 253
				}

				return var3; // L: 255
			}
		} else {
			return var3; // L: 175
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-680016432"
	)
	public static byte[] method3694(CharSequence var0) {
		int var1 = var0.length(); // L: 95
		byte[] var2 = new byte[var1]; // L: 96

		for (int var3 = 0; var3 < var1; ++var3) { // L: 97
			char var4 = var0.charAt(var3); // L: 98
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 99
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 100
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 101
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 102
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 103
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 104
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 105
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 106
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 107
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 108
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118; // L: 109
			} else if (var4 == 8249) { // L: 110
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 111
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 112
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 113
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 114
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 115
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 116
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 117
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 118
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 119
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 120
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 121
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 122
				var2[var3] = -102;
			} else if (var4 == 8250) { // L: 123
				var2[var3] = -101;
			} else if (var4 == 339) { // L: 124
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 125
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 126
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 127
			}
		}

		return var2; // L: 129
	}
}
