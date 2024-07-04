import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class178 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field1872;

	static {
		field1872 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lhf;",
		garbageValue = "292309746"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 39
			var1 = new SpotAnimationDefinition(); // L: 40
			var1.id = var0; // L: 41
			if (var2 != null) { // L: 42
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 43
			return var1; // L: 44
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	public static void method3568() {
		FileSystem.FileSystem_cacheFiles.clear(); // L: 52
	} // L: 53
}
