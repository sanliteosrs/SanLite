import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ad")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ag")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhc;",
		garbageValue = "-2087182582"
	)
	public static VarbitComposition method2361(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 28
		if (var1 != null) { // L: 29
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 30
			var1 = new VarbitComposition(); // L: 31
			if (var2 != null) { // L: 32
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 33
			return var1; // L: 34
		}
	}
}
