import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class46 {
	@ObfuscatedName("aq")
	int field306;
	@ObfuscatedName("ad")
	int field304;
	@ObfuscatedName("ag")
	int field305;
	@ObfuscatedName("ak")
	int field308;
	@ObfuscatedName("ap")
	int field307;
	@ObfuscatedName("an")
	int field303;
	@ObfuscatedName("aj")
	int[] field309;

	class46() {
		class60 var1 = VorbisSample.field353; // L: 15
		this.field306 = var1.method1178(16); // L: 16
		this.field304 = var1.method1178(24); // L: 17
		this.field305 = var1.method1178(24); // L: 18
		this.field308 = var1.method1178(24) + 1; // L: 19
		this.field307 = var1.method1178(6) + 1; // L: 20
		this.field303 = var1.method1178(8); // L: 21
		int[] var2 = new int[this.field307]; // L: 22

		int var3;
		for (var3 = 0; var3 < this.field307; ++var3) { // L: 23
			int var4 = 0; // L: 24
			int var5 = var1.method1178(3); // L: 25
			boolean var6 = var1.method1166() != 0; // L: 26
			if (var6) { // L: 27
				var4 = var1.method1178(5);
			}

			var2[var3] = var4 << 3 | var5; // L: 28
		}

		this.field309 = new int[this.field307 * 8]; // L: 30

		for (var3 = 0; var3 < this.field307 * 8; ++var3) { // L: 31
			this.field309[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1178(8) : -1;
		}

	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FIZLco;)V"
	)
	void method898(float[] var1, int var2, boolean var3, class60 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) { // L: 35
			var1[var5] = 0.0F;
		}

		if (!var3) { // L: 36
			var5 = VorbisSample.field347[this.field303].field341; // L: 37
			int var6 = this.field305 - this.field304; // L: 38
			int var7 = var6 / this.field308; // L: 39
			int[] var8 = new int[var7]; // L: 40

			for (int var9 = 0; var9 < 8; ++var9) { // L: 41
				int var10 = 0; // L: 42

				while (var10 < var7) { // L: 43
					int var11;
					int var12;
					if (var9 == 0) { // L: 44
						var11 = VorbisSample.field347[this.field303].method1081(var4); // L: 46

						for (var12 = var5 - 1; var12 >= 0; --var12) { // L: 47
							if (var10 + var12 < var7) { // L: 48
								var8[var10 + var12] = var11 % this.field307;
							}

							var11 /= this.field307; // L: 49
						}
					}

					for (var11 = 0; var11 < var5; ++var11) { // L: 53
						var12 = var8[var10]; // L: 55
						int var13 = this.field309[var9 + var12 * 8]; // L: 56
						if (var13 >= 0) { // L: 57
							int var14 = var10 * this.field308 + this.field304; // L: 58
							VorbisCodebook var15 = VorbisSample.field347[var13]; // L: 59
							int var16;
							if (this.field306 == 0) { // L: 60
								var16 = this.field308 / var15.field341; // L: 61

								for (int var20 = 0; var20 < var16; ++var20) { // L: 62
									float[] var21 = var15.method1092(var4); // L: 63

									for (int var19 = 0; var19 < var15.field341; ++var19) { // L: 64
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0; // L: 68

								while (var16 < this.field308) { // L: 69
									float[] var17 = var15.method1092(var4); // L: 70

									for (int var18 = 0; var18 < var15.field341; ++var18) { // L: 71
										var1[var14 + var16] += var17[var18]; // L: 72
										++var16; // L: 73
									}
								}
							}
						}

						++var10; // L: 79
						if (var10 >= var7) { // L: 80
							break;
						}
					}
				}
			}

		}
	} // L: 84
}
