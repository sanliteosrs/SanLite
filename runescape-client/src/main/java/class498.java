import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
public class class498 {
	@ObfuscatedName("an")
	static int[] field5067;
	@ObfuscatedName("aj")
	public static int[] field5064;
	@ObfuscatedName("bn")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field5069;

	static {
		field5067 = new int[32768]; // L: 14

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 15
			field5067[var0] = method8889(var0);
		}

		if (field5064 == null) { // L: 17
			field5064 = new int[65536]; // L: 18
			double var25 = 0.949999988079071D; // L: 19

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 20
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D; // L: 21
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D; // L: 22
				double var7 = (double)(var2 & 127) / 128.0D; // L: 23
				double var9 = var7; // L: 24
				double var11 = var7; // L: 25
				double var13 = var7; // L: 26
				if (0.0D != var5) { // L: 27
					double var15;
					if (var7 < 0.5D) { // L: 29
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var5 + var7 - var5 * var7; // L: 30
					}

					double var17 = var7 * 2.0D - var15; // L: 31
					double var19 = var3 + 0.3333333333333333D; // L: 32
					if (var19 > 1.0D) { // L: 33
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D; // L: 35
					if (var23 < 0.0D) { // L: 36
						++var23;
					}

					if (var19 * 6.0D < 1.0D) { // L: 37
						var9 = var17 + 6.0D * (var15 - var17) * var19;
					} else if (2.0D * var19 < 1.0D) { // L: 38
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) { // L: 39
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17; // L: 40
					}

					if (var3 * 6.0D < 1.0D) { // L: 41
						var11 = var17 + var3 * 6.0D * (var15 - var17);
					} else if (var3 * 2.0D < 1.0D) { // L: 42
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) { // L: 43
						var11 = var17 + 6.0D * (var15 - var17) * (0.6666666666666666D - var3);
					} else {
						var11 = var17; // L: 44
					}

					if (var23 * 6.0D < 1.0D) { // L: 45
						var13 = var23 * 6.0D * (var15 - var17) + var17;
					} else if (2.0D * var23 < 1.0D) { // L: 46
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) { // L: 47
						var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
					} else {
						var13 = var17; // L: 48
					}
				}

				var9 = Math.pow(var9, var25); // L: 50
				var11 = Math.pow(var11, var25); // L: 51
				var13 = Math.pow(var13, var25); // L: 52
				int var27 = (int)(256.0D * var9); // L: 53
				int var16 = (int)(var11 * 256.0D); // L: 54
				int var28 = (int)(256.0D * var13); // L: 55
				int var18 = var28 + (var16 << 8) + (var27 << 16); // L: 56
				field5064[var2] = var18 & 16777215; // L: 57
			}
		}

	} // L: 60

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1046258857"
	)
	static final int method8889(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D; // L: 67
		double var3 = (double)(var0 >> 5 & 31) / 31.0D; // L: 68
		double var5 = (double)(var0 & 31) / 31.0D; // L: 69
		double var7 = var1; // L: 70
		if (var3 < var1) { // L: 71
			var7 = var3;
		}

		if (var5 < var7) { // L: 72
			var7 = var5;
		}

		double var9 = var1; // L: 73
		if (var3 > var1) { // L: 74
			var9 = var3;
		}

		if (var5 > var9) { // L: 75
			var9 = var5;
		}

		double var11 = 0.0D; // L: 76
		double var13 = 0.0D; // L: 77
		double var15 = (var7 + var9) / 2.0D; // L: 78
		if (var9 != var7) { // L: 79
			if (var15 < 0.5D) { // L: 80
				var13 = (var9 - var7) / (var7 + var9);
			}

			if (var15 >= 0.5D) { // L: 81
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var9 == var1) { // L: 82
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) { // L: 83
				var11 = (var5 - var1) / (var9 - var7) + 2.0D;
			} else if (var5 == var9) { // L: 84
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D); // L: 86
		var17 &= 255; // L: 87
		double var18 = 256.0D * var13; // L: 88
		if (var18 < 0.0D) { // L: 89
			var18 = 0.0D;
		} else if (var18 > 255.0D) {
			var18 = 255.0D;
		}

		if (var15 > 0.7D) { // L: 91
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75D) { // L: 95
			var18 /= 2.0D; // L: 96
			var18 = Math.floor(var18); // L: 97
		}

		if (var15 > 0.85D) { // L: 99
			var18 /= 2.0D; // L: 100
			var18 = Math.floor(var18); // L: 101
		}

		if (var15 > 0.95D) { // L: 103
			var18 /= 2.0D; // L: 104
			var18 = Math.floor(var18); // L: 105
		}

		if (var15 > 0.995D) { // L: 107
			var15 = 0.995D;
		}

		int var20 = (int)(var18 / 32.0D + (double)(var17 / 4 * 8)); // L: 108
		return (int)(128.0D * var15) + (var20 << 7); // L: 109
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-441009304"
	)
	public static int method8893(int var0) {
		return 255 - (var0 & 255); // L: 113
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "366528255"
	)
	static class137 method8898(int var0) {
		class137[] var1 = new class137[]{class137.field1622, class137.field1621, class137.field1614, class137.field1634, class137.field1616, class137.field1617, class137.field1618, class137.field1619, class137.field1613, class137.field1631, class137.field1615, class137.field1623, class137.field1624, class137.field1625, class137.field1626, class137.field1627, class137.field1628}; // L: 90
		class137 var2 = (class137)class210.findEnumerated(var1, var0); // L: 92
		if (var2 == null) { // L: 93
			var2 = class137.field1622;
		}

		return var2; // L: 94
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "4095"
	)
	static final void method8897(String var0) {
		AbstractWorldMapIcon.method5076("Please remove " + var0 + " from your ignore list first"); // L: 116
	} // L: 117

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "-1173020279"
	)
	static void method8899(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) { // L: 4165
			int var5 = (Integer)var0.get(0); // L: 4168
			if (var5 == -1 && !Client.playingJingle) { // L: 4169
				class137.method3187(0, 0); // L: 4170
			} else if (var5 != -1) { // L: 4172
				boolean var6;
				if (class330.field3585.isEmpty()) { // L: 4175
					var6 = false; // L: 4180
				} else {
					class342 var7 = (class342)class330.field3585.get(0); // L: 4176
					var6 = var7 != null && var5 == var7.field3716; // L: 4177
				}

				if (!var6 && class105.clientPreferences.method2654() != 0) { // L: 4182 4183
					ArrayList var9 = new ArrayList(); // L: 4184

					for (int var8 = 0; var8 < var0.size(); ++var8) { // L: 4185
						var9.add(new class342(class199.field2100, (Integer)var0.get(var8), 0, class105.clientPreferences.method2654(), false)); // L: 4186
					}

					if (Client.playingJingle) { // L: 4188
						class157.method3343(var9, var1, var2, var3, var4); // L: 4189
					} else {
						FontName.method9220(var9, var1, var2, var3, var4, false); // L: 4192
					}
				}
			}

		}
	} // L: 4166 4197

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-120"
	)
	static final void method8901() {
		for (class96 var0 = (class96)class511.field5137.field1335.last(); var0 != null; var0 = (class96)class511.field5137.field1335.previous()) { // L: 9076 9077 9083
			if (var0.field1173 == -1) { // L: 9078
				var0.field1184 = 0; // L: 9079
				class137.method3189(class511.field5137, var0); // L: 9080
			} else {
				var0.remove(); // L: 9082
			}
		}

	} // L: 9085

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1822131388"
	)
	static final void method8900() {
		Client.field705 = Client.cycleCntr; // L: 13257
	} // L: 13258
}
