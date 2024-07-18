import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
public class class562 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	static ClanSettings field5476;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1724065494"
	)
	static String method10144() {
		StringBuilder var0 = new StringBuilder(); // L: 54
		class238[] var1 = class238.field2508; // L: 56

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 57
			class238 var3 = var1[var2]; // L: 58
			var0.append(var3.field2515); // L: 60
			var0.append(", "); // L: 61
		}

		String var4 = var0.toString(); // L: 65
		return var4.substring(0, var4.length() - 2); // L: 66
	}
}
