import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class426 {
	@ObfuscatedName("aq")
	float[] field4722;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1741438289
	)
	int field4723;

	class426(float[] var1, int var2) {
		this.field4722 = var1; // L: 10
		this.field4723 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIII)V",
		garbageValue = "-1866067100"
	)
	@Export("drawActor2d")
	static void drawActor2d(class101 var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) { // L: 6030
			int var6 = class169.method3519(var0, var3, var4, var0.field1318) - var5; // L: 6035
			var1 -= class47.cameraX; // L: 6036
			var6 -= class328.cameraY; // L: 6037
			var2 -= class60.cameraZ; // L: 6038
			int var7 = Rasterizer3D.Rasterizer3D_sine[Language.cameraPitch]; // L: 6039
			int var8 = Rasterizer3D.Rasterizer3D_cosine[Language.cameraPitch]; // L: 6040
			int var9 = Rasterizer3D.Rasterizer3D_sine[class337.cameraYaw]; // L: 6041
			int var10 = Rasterizer3D.Rasterizer3D_cosine[class337.cameraYaw]; // L: 6042
			int var11 = var9 * var2 + var10 * var1 >> 16; // L: 6043
			var2 = var10 * var2 - var9 * var1 >> 16; // L: 6044
			var1 = var11; // L: 6045
			var11 = var8 * var6 - var7 * var2 >> 16; // L: 6046
			var2 = var8 * var2 + var6 * var7 >> 16; // L: 6047
			if (var2 >= 50) { // L: 6049
				Client.field618 = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2; // L: 6050
				Client.field585 = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2; // L: 6051
			} else {
				Client.field618 = -1; // L: 6054
				Client.field585 = -1; // L: 6055
			}

		} else {
			Client.field618 = -1; // L: 6031
			Client.field585 = -1; // L: 6032
		}
	} // L: 6033 6057
}
