import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("wi")
	static Iterator field1489;
	@ObfuscatedName("ak")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;I)I",
		garbageValue = "-1868614741"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	static void method2995() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 266
			Login.currentLoginField = 1; // L: 267
		} else {
			Login.currentLoginField = 0; // L: 270
		}

	} // L: 272

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-999803974"
	)
	static final void method2994() {
		int var0 = class105.menuX; // L: 9830
		int var1 = UserComparator9.menuY; // L: 9831
		int var2 = class330.menuWidth; // L: 9832
		int var3 = class278.menuHeight; // L: 9833
		int var4 = 6116423; // L: 9834
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 9835
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 9836
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 9837
		ParamComposition.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 9838
		int var5 = MouseHandler.MouseHandler_x; // L: 9839
		int var6 = MouseHandler.MouseHandler_y; // L: 9840

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 9841
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 9842
			int var9 = 16777215; // L: 9843
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 9844
				var9 = 16776960;
			}

			ParamComposition.fontBold12.draw(WorldMapIcon_1.method4580(var7), var0 + 3, var8, var9, 0); // L: 9845
		}

		class101.method2684(class105.menuX, UserComparator9.menuY, class330.menuWidth, class278.menuHeight); // L: 9847
	} // L: 9848
}
