import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class165 extends class147 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1586739759
	)
	int field1815;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1757786379
	)
	int field1814;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class165(class150 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1815 = var1.readInt(); // L: 274
		this.field1814 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3364(this.field1815, this.field1814); // L: 279
	} // L: 280

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lgg;",
		garbageValue = "-1362390097"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "-53"
	)
	public static byte[] method3465(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		byte[] var2 = new byte[var1]; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 > 127) { // L: 13
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 14
			}
		}

		return var2; // L: 16
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1609232635"
	)
	static int method3467(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}
}
