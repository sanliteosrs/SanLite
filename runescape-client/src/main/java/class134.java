import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class134 implements Callable {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static class68 field1572;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class135 field1571;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	final class136 field1574;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	final class137 field1570;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -13995373
	)
	final int field1569;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;Lfd;Lfi;Lfb;I)V"
	)
	class134(class142 var1, class135 var2, class136 var3, class137 var4, int var5) {
		this.this$0 = var1; // L: 249
		this.field1571 = var2; // L: 250
		this.field1574 = var3; // L: 251
		this.field1570 = var4; // L: 252
		this.field1569 = var5; // L: 253
	} // L: 254

	public Object call() {
		this.field1571.method3139(); // L: 258
		class135[][] var1;
		if (this.field1574 == class136.field1601) { // L: 260
			var1 = this.this$0.field1650; // L: 261
		} else {
			var1 = this.this$0.field1654; // L: 264
		}

		var1[this.field1569][this.field1570.method3178()] = this.field1571; // L: 266
		return null; // L: 267
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILho;IB)V",
		garbageValue = "-19"
	)
	static void method3130(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 77
		var5.plane = var0; // L: 78
		var5.x = var1 * 128; // L: 79
		var5.y = var2 * 16384; // L: 80
		int var6 = var3.sizeX; // L: 81
		int var7 = var3.sizeY; // L: 82
		if (var4 == 1 || var4 == 3) { // L: 83
			var6 = var3.sizeY; // L: 84
			var7 = var3.sizeX; // L: 85
		}

		var5.maxX = (var6 + var1) * 128; // L: 87
		var5.maxY = (var7 + var2) * 128; // L: 88
		var5.soundEffectId = var3.ambientSoundId; // L: 89
		var5.field845 = var3.int7 * 16384; // L: 90
		var5.field846 = Math.max(var3.field2198 * 16384 - 128, 0); // L: 91
		var5.field849 = var3.int6; // L: 92
		var5.field850 = var3.field2200; // L: 93
		var5.soundEffectIds = var3.soundEffectIds; // L: 94
		if (var3.transforms != null) { // L: 95
			var5.obj = var3; // L: 96
			var5.set(); // L: 97
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 99
		if (var5.soundEffectIds != null) { // L: 100
			var5.field840 = var5.field849 + (int)(Math.random() * (double)(var5.field850 - var5.field849));
		}

	} // L: 101

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)Lij;",
		garbageValue = "784571849"
	)
	static class231 method3133() {
		return Client.field728; // L: 1107
	}
}
