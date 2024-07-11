import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ti")
public class class496 {
	@ObfuscatedName("ap")
	static final int[] field5052;
	@ObfuscatedName("an")
	static final int[] field5051;

	static {
		field5052 = new int[16384]; // L: 8
		field5051 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field5052[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2)); // L: 14
			field5051[var2] = (int)(16384.0D * Math.cos((double)var2 * var0)); // L: 15
		}

	} // L: 17
}
