import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return class401.method7407(); // L: 46
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lnx;III)V",
		garbageValue = "-2064856444"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11810
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11811
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11812
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11813
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11814
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11815
		}

		if (var0.yAlignment == 0) { // L: 11816
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11817
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11818
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 11819
		} else if (var0.yAlignment == 4) { // L: 11820
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11821
		}

	} // L: 11822
}
