import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class181 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static IndexedSprite field1931;

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "2"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class412.World_worlds != null) { // L: 171
			Language.doWorldSorting(0, class412.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174
}
