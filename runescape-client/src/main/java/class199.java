import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class199 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field2099;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2100;

	static {
		field2099 = new EvictingDualNodeHashTable(64); // L: 8
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Lvg;",
		garbageValue = "-733013164"
	)
	public static final SpritePixels method3813(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var7 * var6]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "620280580"
	)
	static void method3809(int var0) {
		Client.oculusOrbState = var0; // L: 13489
	} // L: 13490
}
