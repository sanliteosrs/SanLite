import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class252 {
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "10"
	)
	static final void method4911(int var0, int var1) {
		if (var0 < 128) { // L: 4390
			var0 = 128; // L: 4391
		} else if (var0 > 383) { // L: 4393
			var0 = 383; // L: 4394
		}

		if (Language.cameraPitch < var0) { // L: 4396
			Language.cameraPitch = (var0 - Language.cameraPitch) * class104.field1354 / 1000 + Language.cameraPitch + class133.field1560; // L: 4397
			if (Language.cameraPitch > var0) { // L: 4398
				Language.cameraPitch = var0; // L: 4399
			}
		} else if (Language.cameraPitch > var0) { // L: 4402
			Language.cameraPitch -= (Language.cameraPitch - var0) * class104.field1354 / 1000 + class133.field1560; // L: 4403
			if (Language.cameraPitch < var0) { // L: 4404
				Language.cameraPitch = var0; // L: 4405
			}
		}

		var1 &= 2047; // L: 4408
		int var2 = var1 - class337.cameraYaw; // L: 4409
		if (var2 > 1024) { // L: 4410
			var2 -= 2048; // L: 4411
		} else if (var2 < -1024) { // L: 4413
			var2 += 2048; // L: 4414
		}

		if (var2 > 0) { // L: 4416
			class337.cameraYaw = class337.cameraYaw + class133.field1560 + var2 * class104.field1354 / 1000; // L: 4417
			class337.cameraYaw &= 2047; // L: 4418
		} else if (var2 < 0) { // L: 4420
			class337.cameraYaw -= class133.field1560 + -var2 * class104.field1354 / 1000; // L: 4421
			class337.cameraYaw &= 2047; // L: 4422
		}

		int var3 = var1 - class337.cameraYaw; // L: 4424
		if (var3 > 1024) { // L: 4425
			var3 -= 2048; // L: 4426
		} else if (var3 < -1024) { // L: 4428
			var3 += 2048; // L: 4429
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4431
			class337.cameraYaw = var1; // L: 4432
		}

	} // L: 4434
}
