import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class60 {
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1983512085
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("aq")
	byte[] field413;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1939909553
	)
	int field410;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1005414431
	)
	int field412;

	class60() {
		this.field413 = null; // L: 4
		this.field410 = 0; // L: 5
		this.field412 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "9"
	)
	int method1178(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field412; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field412; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field413[this.field410] >> this.field412 & var5) << var3; // L: 16
			this.field412 = 0; // L: 17
			++this.field410; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field413[this.field410] >> this.field412 & var4) << var3; // L: 24
			this.field412 += var1; // L: 25
		}

		return var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1896393256"
	)
	int method1166() {
		int var1 = this.field413[this.field410] >> this.field412 & 1;
		++this.field412;
		this.field410 += this.field412 >> 3;
		this.field412 &= 7;
		return var1; // L: 35
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-2030419149"
	)
	void method1168(byte[] var1, int var2) {
		this.field413 = var1; // L: 39
		this.field410 = var2; // L: 40
		this.field412 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lie;",
		garbageValue = "11"
	)
	public static FloorOverlayDefinition method1179(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 28
			var1 = new FloorOverlayDefinition(); // L: 29
			if (var2 != null) { // L: 30
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-3016048"
	)
	static void method1172() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 31
			if (var0.stream1 != null) { // L: 32
				class238.pcmStreamMixer.removeSubStream(var0.stream1); // L: 33
				var0.stream1 = null; // L: 34
			}

			if (var0.stream2 != null) { // L: 36
				class238.pcmStreamMixer.removeSubStream(var0.stream2); // L: 37
				var0.stream2 = null; // L: 38
			}
		}

		ObjectSound.objectSounds.clear(); // L: 41
	} // L: 42

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1708397335"
	)
	static final void method1180(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ModeWhere.field4649.method6514(var0)) { // L: 12079
			class18.updateInterface(ModeWhere.field4649.field3740[var0], -1, var1, var2, var3, var4, var5, var6); // L: 12080
		}
	} // L: 12081
}
