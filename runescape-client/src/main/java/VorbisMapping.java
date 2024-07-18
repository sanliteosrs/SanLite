import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("br")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("aq")
	int field337;
	@ObfuscatedName("ad")
	int field335;
	@ObfuscatedName("ag")
	int[] field336;
	@ObfuscatedName("ak")
	int[] field334;

	VorbisMapping() {
		class60 var1 = VorbisSample.field353; // L: 12
		var1.method1178(16); // L: 13
		this.field337 = var1.method1166() != 0 ? var1.method1178(4) + 1 : 1; // L: 14
		if (var1.method1166() != 0) { // L: 15
			var1.method1178(8); // L: 16
		}

		var1.method1178(2); // L: 19
		if (this.field337 > 1) { // L: 20
			this.field335 = var1.method1178(4); // L: 21
		}

		this.field336 = new int[this.field337]; // L: 23
		this.field334 = new int[this.field337]; // L: 24

		for (int var2 = 0; var2 < this.field337; ++var2) { // L: 25
			var1.method1178(8); // L: 26
			this.field336[var2] = var1.method1178(8); // L: 27
			this.field334[var2] = var1.method1178(8); // L: 28
		}

	} // L: 30
}
