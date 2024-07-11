import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class241 implements Comparator {
	class241() {
	} // L: 39

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Liz;Liz;I)I",
		garbageValue = "-1784501046"
	)
	int method4540(class233 var1, class233 var2) {
		return var1.method4441() - var2.method4441(); // L: 42
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}

	public int compare(Object var1, Object var2) {
		return this.method4540((class233)var1, (class233)var2); // L: 46
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1536617207"
	)
	static final void method4542(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 11672
		int var7 = var3 - var1; // L: 11673
		int var8 = var6 >= 0 ? var6 : -var6; // L: 11674
		int var9 = var7 >= 0 ? var7 : -var7; // L: 11675
		int var10 = var8; // L: 11676
		if (var8 < var9) { // L: 11677
			var10 = var9;
		}

		if (var10 != 0) { // L: 11678
			int var11 = (var6 << 16) / var10; // L: 11679
			int var12 = (var7 << 16) / var10; // L: 11680
			if (var12 <= var11) { // L: 11681
				var11 = -var11;
			} else {
				var12 = -var12; // L: 11682
			}

			int var13 = var5 * var12 >> 17; // L: 11683
			int var14 = var5 * var12 + 1 >> 17; // L: 11684
			int var15 = var5 * var11 >> 17; // L: 11685
			int var16 = var5 * var11 + 1 >> 17; // L: 11686
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 11687
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 11688
			int var17 = var0 + var13; // L: 11689
			int var18 = var0 - var14; // L: 11690
			int var19 = var0 + var6 - var14; // L: 11691
			int var20 = var0 + var6 + var13; // L: 11692
			int var21 = var15 + var1; // L: 11693
			int var22 = var1 - var16; // L: 11694
			int var23 = var7 + var1 - var16; // L: 11695
			int var24 = var15 + var7 + var1; // L: 11696
			Rasterizer3D.method5326(var17, var18, var19); // L: 11697
			Rasterizer3D.method5266(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 11698
			Rasterizer3D.method5326(var17, var19, var20); // L: 11699
			Rasterizer3D.method5266(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 11700
		}
	} // L: 11701
}
