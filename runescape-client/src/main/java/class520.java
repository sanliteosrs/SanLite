import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
public final class class520 {
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIIB)V",
		garbageValue = "-29"
	)
	static final void method9265(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6745(class380.field4414, false); // L: 12411
		if (var4 != null) { // L: 12412
			if (Client.minimapState < 3) { // L: 12413
				DecorativeObject.field3121.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12414
			}

		}
	} // L: 12415
}
