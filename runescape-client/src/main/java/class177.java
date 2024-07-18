import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class177 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static EvictingDualNodeHashTable field1869;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("decimator")
	static Decimator decimator;

	static {
		field1869 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "13"
	)
	static final int method3567(int var0, int var1) {
		int var2 = class353.method6535(45365 + var0, var1 + 91923, 4) - 128 + (class353.method6535(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (class353.method6535(var0, var1, 1) - 128 >> 2); // L: 976
		var2 = (int)((double)var2 * 0.3D) + 35; // L: 977
		if (var2 < 10) { // L: 978
			var2 = 10;
		} else if (var2 > 60) { // L: 979
			var2 = 60;
		}

		return var2; // L: 980
	}
}
