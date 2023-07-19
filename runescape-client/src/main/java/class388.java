import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("on")
public final class class388 {
	@ObfuscatedName("ai")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("aj")
	static long[] field4424;
	@ObfuscatedName("aq")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4424 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4424.length; ++var0) { // L: 8
			field4424[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9
}
