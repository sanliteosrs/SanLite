import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class328 {
	@ObfuscatedName("aq")
	static int[] field3561;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = 1411387951
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 1489005223
	)
	static int field3560;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = 130012625
	)
	static int field3565;

	static {
		new Object();
		field3561 = new int[33]; // L: 10
		field3561[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3561[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	static void method6151() {
		class83.field1033 = null; // L: 59
		class83.field1034 = null; // L: 60
		class83.field1035 = null; // L: 61
		class356.field3810 = null; // L: 62
		class25.field110 = null; // L: 63
		WorldMapScaleHandler.field2749 = null; // L: 64
		class83.field1039 = null; // L: 65
		class83.field1037 = null; // L: 66
		class83.field1038 = null; // L: 67
		Canvas.field105 = null; // L: 68
		class83.field1036 = null; // L: 69
		class534.field5292 = null; // L: 70
	} // L: 71
}
