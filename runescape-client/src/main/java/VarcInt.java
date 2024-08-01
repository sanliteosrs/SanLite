import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ag")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1896636736"
	)
	public void method3611(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 16
			if (var2 == 0) { // L: 17
				return; // L: 20
			}

			this.method3612(var1, var2); // L: 18
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "-49"
	)
	void method3612(Buffer var1, int var2) {
		if (var2 == 2) { // L: 23
			this.persist = true; // L: 24
		}

	} // L: 27

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "1905252321"
	)
	public static void method3622(String[] var0, int[] var1) {
		ClientPreferences.method2674(var0, var1, 0, var0.length - 1); // L: 43
	} // L: 44
}
