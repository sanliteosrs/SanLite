import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
public class class434 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	static final class434 field4666;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	static final class434 field4665;
	@ObfuscatedName("af")
	final String field4664;

	static {
		field4666 = new class434("Basic"); // L: 4
		field4665 = new class434("Bearer"); // L: 5
	}

	class434(String var1) {
		this.field4664 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-359404551"
	)
	String method8067() {
		return this.field4664; // L: 13
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FB)I",
		garbageValue = "-110"
	)
	public static int method8069(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class127.field1487; // L: 19
		if (var7 <= var44) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1]; // L: 23

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) { // L: 24
				var9[var10] = 1.0F / var7 * var0[var10]; // L: 25
			}

			while (Math.abs(var9[var1]) < var44) { // L: 27
				--var1; // L: 28
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var42 = var3 ? var2 < var6[0] + var44 : var2 < var6[0] - var44; // L: 36
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var6[0] + var44; // L: 37
				var10 = var42 && var43 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class468 var11 = new class468(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = (float)var13 * var9[var13]; // L: 53
				}

				float[] var41 = new float[var1 + 1]; // L: 55
				int var14 = method8069(var12, var1 - 1, var2, false, var4, false, var41); // L: 56
				if (var14 == -1) { // L: 57
					return 0; // L: 58
				} else {
					boolean var15 = false; // L: 60
					float var17 = 0.0F; // L: 62
					float var18 = 0.0F; // L: 63
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) { // L: 65
						if (var10 > var1) { // L: 66
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = LoginScreenAnimation.method2530(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var44 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var20 == var14) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var41[var20]; // L: 81
						}

						var17 = LoginScreenAnimation.method2530(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var44) { // L: 88
							if (var14 != var20 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							int var22 = var10++; // L: 96
							float var24 = var16; // L: 98
							float var25 = var19; // L: 99
							float var26 = LoginScreenAnimation.method2530(var11.field4826, var11.field4825, var16); // L: 101
							float var23;
							if (Math.abs(var26) < class127.field1487) { // L: 102
								var23 = var16; // L: 103
							} else {
								float var27 = LoginScreenAnimation.method2530(var11.field4826, var11.field4825, var19); // L: 106
								if (Math.abs(var27) < class127.field1487) { // L: 107
									var23 = var19; // L: 108
								} else {
									float var28 = 0.0F; // L: 111
									float var29 = 0.0F; // L: 112
									float var30 = 0.0F; // L: 113
									float var35 = 0.0F; // L: 118
									boolean var36 = true; // L: 119
									boolean var37 = false; // L: 120

									do {
										var37 = false; // L: 122
										if (var36) { // L: 123
											var28 = var24; // L: 124
											var35 = var26; // L: 125
											var29 = var25 - var24; // L: 126
											var30 = var29; // L: 127
											var36 = false; // L: 128
										}

										if (Math.abs(var35) < Math.abs(var27)) { // L: 130
											var24 = var25; // L: 131
											var25 = var28; // L: 132
											var28 = var24; // L: 133
											var26 = var27; // L: 134
											var27 = var35; // L: 135
											var35 = var26; // L: 136
										}

										float var38 = class127.field1490 * Math.abs(var25) + 0.0F; // L: 138
										float var39 = (var28 - var25) * 0.5F; // L: 139
										boolean var40 = Math.abs(var39) > var38 && 0.0F != var27; // L: 140
										if (var40) { // L: 141
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) { // L: 142
												float var34 = var27 / var26; // L: 147
												float var31;
												float var32;
												if (var24 == var28) { // L: 148
													var31 = 2.0F * var39 * var34; // L: 149
													var32 = 1.0F - var34; // L: 150
												} else {
													var32 = var26 / var35; // L: 153
													float var33 = var27 / var35; // L: 154
													var31 = (var39 * 2.0F * var32 * (var32 - var33) - (var33 - 1.0F) * (var25 - var24)) * var34; // L: 155
													var32 = (var32 - 1.0F) * (var33 - 1.0F) * (var34 - 1.0F); // L: 156
												}

												if ((double)var31 > 0.0D) { // L: 158
													var32 = -var32;
												} else {
													var31 = -var31; // L: 159
												}

												var34 = var30; // L: 160
												var30 = var29; // L: 161
												if (var31 * 2.0F < var32 * 3.0F * var39 - Math.abs(var32 * var38) && var31 < Math.abs(var34 * 0.5F * var32)) { // L: 162
													var29 = var31 / var32; // L: 163
												} else {
													var29 = var39; // L: 166
													var30 = var39; // L: 167
												}
											} else {
												var29 = var39; // L: 143
												var30 = var39; // L: 144
											}

											var24 = var25; // L: 170
											var26 = var27; // L: 171
											if (Math.abs(var29) > var38) { // L: 172
												var25 += var29;
											} else if ((double)var39 > 0.0D) { // L: 173
												var25 += var38;
											} else {
												var25 -= var38; // L: 174
											}

											var27 = LoginScreenAnimation.method2530(var11.field4826, var11.field4825, var25); // L: 175
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) { // L: 176
												var36 = true; // L: 177
												var37 = true; // L: 178
											} else {
												var37 = true; // L: 181
											}
										}
									} while(var37);

									var23 = var25; // L: 185
								}
							}

							var6[var22] = var23; // L: 187
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) { // L: 188
								var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F; // L: 189
								--var10; // L: 190
							}
						}
					}

					return var10; // L: 196
				}
			}
		}
	}
}
