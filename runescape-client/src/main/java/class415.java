import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@nn
@ObfuscatedName("pw")
public final class class415 {
	@ObfuscatedName("br")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;

	static {
		Pattern.compile("^\\D*(\\d+)\\D*$"); // L: 9
	} // L: 10

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CLpe;I)I",
		garbageValue = "-1294766597"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}
}
