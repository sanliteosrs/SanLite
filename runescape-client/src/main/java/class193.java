import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class193 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field2036;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	static Bounds field2035;

	static {
		field2036 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljb;",
		garbageValue = "92"
	)
	public static class238[] method3759() {
		return new class238[]{class238.field2511, class238.field2520, class238.field2513, class238.field2519, class238.field2509, class238.field2507, class238.field2512, class238.field2516, class238.field2510}; // L: 25
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1190585246"
	)
	public static int method3757(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 97
		return (var0 + var2) / var1 - var2; // L: 98
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-185854113"
	)
	static void method3758(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1574

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1575
			int var4 = var3 * 32 + 15 + 128; // L: 1576
			int var5 = var4 * 3 + 600; // L: 1579
			int var7 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1582
			int var9 = var1 - 334; // L: 1585
			if (var9 < 0) { // L: 1586
				var9 = 0;
			} else if (var9 > 100) { // L: 1587
				var9 = 100;
			}

			int var10 = (Client.zoomWidth - Client.zoomHeight) * var9 / 100 + Client.zoomHeight; // L: 1588
			int var8 = var5 * var10 / 256; // L: 1589
			var2[var3] = var8 * var7 >> 16; // L: 1592
		}

		class511.field5137.field1316.method5464(var2, 500, 800, var0 * 334 / var1, 334); // L: 1594
	} // L: 1595
}
