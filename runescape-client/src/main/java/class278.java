import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class278 extends class290 {
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 1244909991
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1431280305
	)
	int field2891;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1099588265
	)
	int field2884;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -705159913
	)
	int field2885;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1404845653
	)
	int field2886;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 136535019
	)
	int field2887;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1611315841
	)
	int field2883;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -919142613
	)
	int field2889;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1173490183
	)
	int field2890;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -903591805
	)
	int field2888;

	class278(int var1, int var2, int var3, int var4, int var5) {
		this.field2891 = var1; // L: 15
		this.field2884 = var2; // L: 16
		this.field2885 = var3; // L: 17
		this.field2886 = var4; // L: 18
		this.field2887 = var5; // L: 19
		this.field2883 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 20
		this.field2889 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 21
		this.field2890 = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 22
		this.field2888 = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 23
	} // L: 24

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lkt;IIIIJ)V"
	)
	void vmethod5737(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5778(var2, this.field2886, this.field2887, var3, var4, var5, this.field2891, this.field2884, this.field2885, var6); // L: 28
	} // L: 29

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llt;IIII)V",
		garbageValue = "1938115394"
	)
	void vmethod5725(class282 var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = (var4 << 7) - this.field2891; // L: 34
		int var8;
		int var9 = var8 = (var5 << 7) - this.field2885; // L: 36
		int var10;
		int var11 = var10 = var7 + 128; // L: 38
		int var12;
		int var13 = var12 = var9 + 128; // L: 40
		int var14 = var1.field2972[var3][var4][var5] - this.field2884; // L: 41
		int var15 = var1.field2972[var3][var4 + 1][var5] - this.field2884; // L: 42
		int var16 = var1.field2972[var3][var4 + 1][var5 + 1] - this.field2884; // L: 43
		int var17 = var1.field2972[var3][var4][var5 + 1] - this.field2884; // L: 44
		int var18 = var9 * this.field2890 + var7 * this.field2888 >> 16; // L: 45
		var9 = var9 * this.field2888 - var7 * this.field2890 >> 16; // L: 46
		var7 = var18; // L: 47
		var18 = var14 * this.field2889 - var9 * this.field2883 >> 16; // L: 48
		var9 = var14 * this.field2883 + var9 * this.field2889 >> 16; // L: 49
		var14 = var18; // L: 50
		if (var9 >= 50) { // L: 51
			var18 = var11 * this.field2888 + var8 * this.field2890 >> 16; // L: 52
			var8 = var8 * this.field2888 - var11 * this.field2890 >> 16; // L: 53
			var11 = var18; // L: 54
			var18 = var15 * this.field2889 - var8 * this.field2883 >> 16; // L: 55
			var8 = var15 * this.field2883 + var8 * this.field2889 >> 16; // L: 56
			var15 = var18; // L: 57
			if (var8 >= 50) { // L: 58
				var18 = var13 * this.field2890 + var10 * this.field2888 >> 16; // L: 59
				var13 = var13 * this.field2888 - var10 * this.field2890 >> 16; // L: 60
				var10 = var18; // L: 61
				var18 = var16 * this.field2889 - var13 * this.field2883 >> 16; // L: 62
				var13 = var13 * this.field2889 + var16 * this.field2883 >> 16; // L: 63
				var16 = var18; // L: 64
				if (var13 >= 50) { // L: 65
					var18 = var6 * this.field2888 + var12 * this.field2890 >> 16; // L: 66
					var12 = var12 * this.field2888 - var6 * this.field2890 >> 16; // L: 67
					var6 = var18; // L: 68
					var18 = var17 * this.field2889 - var12 * this.field2883 >> 16; // L: 69
					var12 = var12 * this.field2889 + var17 * this.field2883 >> 16; // L: 70
					if (var12 >= 50) { // L: 72
						this.method5727(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12); // L: 73
					}
				}
			}
		}
	} // L: 74

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llw;IIB)V",
		garbageValue = "112"
	)
	void vmethod5739(class282 var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length; // L: 78

		for (int var6 = 0; var6 < var5; ++var6) { // L: 79
			int var7 = var2.vertexX[var6] - this.field2891; // L: 80
			int var8 = var2.vertexY[var6] - this.field2884; // L: 81
			int var9 = var2.vertexZ[var6] - this.field2885; // L: 82
			int var10 = var9 * this.field2890 + var7 * this.field2888 >> 16; // L: 83
			var9 = var9 * this.field2888 - var7 * this.field2890 >> 16; // L: 84
			var7 = var10; // L: 85
			var10 = var8 * this.field2889 - var9 * this.field2883 >> 16; // L: 86
			var9 = var8 * this.field2883 + var9 * this.field2889 >> 16; // L: 87
			if (var9 < 50) { // L: 89
				return;
			}

			if (var2.triangleTextureId != null) { // L: 90
				SceneTileModel.field3063[var6] = var7; // L: 91
				SceneTileModel.field3075[var6] = var10; // L: 92
				SceneTileModel.field3076[var6] = var9; // L: 93
			}

			SceneTileModel.field3065[var6] = Rasterizer3D.method5251() + var7 * Rasterizer3D.method5257() / var9; // L: 95
			SceneTileModel.field3073[var6] = Rasterizer3D.method5246() + var10 * Rasterizer3D.method5257() / var9; // L: 96
			SceneTileModel.field3072[var6] = class386.method7177(var9); // L: 97
		}

		this.method5738(var1, var2, var3, var4); // L: 99
	} // L: 100

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "448213075"
	)
	static void method5336(String var0) {
		Login.field948 = class175.method3562(var0); // L: 2145
	} // L: 2146
}
