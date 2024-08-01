import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public enum class379 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4429(-1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4430(0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4431(1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4432(2);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2095821695
	)
	public static int field4434;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1933661759
	)
	final int field4433;

	class379(int var3) {
		this.field4433 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4433; // L: 20
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(II)Luh;",
		garbageValue = "-103845045"
	)
	static class538 method7091(int var0) {
		class538 var1 = (class538)Client.Widget_cachedModels.get((long)var0); // L: 13543
		if (var1 == null) { // L: 13544
			var1 = new class538(AbstractWorldMapData.field2675, class162.method3436(var0), class414.method7619(var0)); // L: 13545
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 13546
		}

		return var1; // L: 13548
	}
}
