import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2050678185
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 203441303
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1382347441
	)
	int field1389;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -104143091
	)
	int field1390;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 587627049
	)
	int field1388;
	@ObfuscatedName("an")
	boolean field1392;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1829546599
	)
	int field1394;

	TileItem() {
		this.field1394 = 31; // L: 24
	} // L: 26

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1837399962"
	)
	void method2794(int var1) {
		this.field1394 = var1; // L: 29
	} // L: 30

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-94"
	)
	boolean method2799(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 33
			return (this.field1394 & 1 << var1) != 0; // L: 34
		} else {
			return true; // L: 36
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class164.ItemComposition_get(this.id).getModel(this.quantity); // L: 40
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfd;B)V",
		garbageValue = "2"
	)
	static void method2795(float var0, float var1, float var2, float var3, class135 var4) {
		float var5 = var1 - var0; // L: 340
		float var6 = var2 - var1; // L: 341
		float var7 = var3 - var2; // L: 342
		float var8 = var6 - var5; // L: 343
		var4.field1586 = var7 - var6 - var8; // L: 344
		var4.field1585 = var8 + var8 + var8; // L: 345
		var4.field1590 = var5 + var5 + var5; // L: 346
		var4.field1581 = var0; // L: 347
	} // L: 348

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1609375983"
	)
	static boolean method2805() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1555
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1556
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1557
				if (!var0.isLoaded()) {
					return false; // L: 1558
				}

				++Client.archiveLoadersDone; // L: 1559
			}

			return true; // L: 1561
		} else {
			return true; // L: 1560
		}
	}
}
