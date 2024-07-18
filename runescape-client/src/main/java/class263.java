import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class263 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lma;",
		garbageValue = "1123961108"
	)
	static class323[] method5015() {
		return new class323[]{class323.field3538, class323.field3542, class323.field3537, class323.field3540, class323.field3544, class323.field3539, class323.field3543, class323.field3541}; // L: 25
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I[B[BI)V",
		garbageValue = "-1058813367"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3907 == null) { // L: 1240
			if (var2 == null) { // L: 1241
				return; // L: 1247
			}

			var0.field3907 = new byte[11][]; // L: 1242
			var0.field3980 = new byte[11][]; // L: 1243
			var0.field3966 = new int[11]; // L: 1244
			var0.field3910 = new int[11]; // L: 1245
		}

		var0.field3907[var1] = var2; // L: 1249
		if (var2 != null) {
			var0.field3915 = true; // L: 1250
		} else {
			var0.field3915 = false; // L: 1252

			for (int var4 = 0; var4 < var0.field3907.length; ++var4) { // L: 1253
				if (var0.field3907[var4] != null) { // L: 1254
					var0.field3915 = true; // L: 1255
					break;
				}
			}
		}

		var0.field3980[var1] = var3; // L: 1260
	} // L: 1261
}
