import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tx")
public class class497 {
	@ObfuscatedName("az")
	static final int[] field5060;
	@ObfuscatedName("ax")
	static final int[] field5054;

	static {
		field5060 = new int[2048]; // L: 17
		field5054 = new int[2048]; // L: 18
		double var0 = 0.0030679615757712823D; // L: 21

		for (int var2 = 0; var2 < 2048; ++var2) { // L: 22
			field5060[var2] = (int)(65536.0D * Math.sin((double)var2 * var0)); // L: 23
			field5054[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2)); // L: 24
		}

	} // L: 26
}
