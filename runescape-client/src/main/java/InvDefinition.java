import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 142521319
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.decodeNext(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IS)V",
		garbageValue = "-28230"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.size = var1.readUnsignedShort();
		}

	} // L: 41

	@ObfuscatedName("ns")
	static final void method3555(double var0) {
		Rasterizer3D.method5248(var0); // L: 12879
		((TextureProvider)Rasterizer3D.field2876.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12880
		if (VertexNormal.worldMap != null) { // L: 12881
			VertexNormal.worldMap.method9066(); // L: 12882
		}

		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12885
		class105.clientPreferences.method2638(var0); // L: 12887
	} // L: 12888

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(IB)Luh;",
		garbageValue = "-82"
	)
	static class538 method3556(int var0) {
		class538 var1 = (class538)Client.field797.get((long)var0); // L: 13552
		if (var1 == null) { // L: 13553
			var1 = new class538(AbstractWorldMapData.field2675, var0); // L: 13554
		}

		return var1; // L: 13556
	}
}
