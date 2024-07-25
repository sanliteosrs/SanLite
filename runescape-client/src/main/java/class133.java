import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public enum class133 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1565(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1561(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1562(2, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1563(3, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	field1564(4, 4);

	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -1524882693
	)
	static int field1560;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -997691535
	)
	final int field1568;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1133507491
	)
	final int field1566;

	class133(int var3, int var4) {
		this.field1568 = var3; // L: 147
		this.field1566 = var4; // L: 148
	} // L: 149

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1566; // L: 152
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-507118558"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 122

		try {
			var0 = UserComparator10.getPreferencesFile("", class109.field1400.name, true); // L: 124
			Buffer var1 = class105.clientPreferences.toBuffer(); // L: 125
			var0.write(var1.array, 0, var1.offset); // L: 126
		} catch (Exception var3) { // L: 128
		}

		try {
			if (var0 != null) { // L: 130
				var0.closeSync(true); // L: 131
			}
		} catch (Exception var2) { // L: 134
		}

	} // L: 135
}
