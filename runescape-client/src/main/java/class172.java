import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class172 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ag")
	public short[] field1845;
	@ObfuscatedName("ak")
	public short[] field1846;

	class172(int var1) {
		ItemComposition var2 = class164.ItemComposition_get(var1); // L: 12
		if (var2.method3977()) { // L: 13
			this.field1845 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1845, 0, this.field1845.length); // L: 15
		}

		if (var2.method3978()) { // L: 17
			this.field1846 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1846, 0, this.field1846.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfr;",
		garbageValue = "65367968"
	)
	static class143 method3537(int var0) {
		class143[] var1 = new class143[]{class143.field1663, class143.field1666, class143.field1662, class143.field1667, class143.field1671, class143.field1670, class143.field1668, class143.field1664, class143.field1669}; // L: 124
		class143 var2 = (class143)class210.findEnumerated(var1, var0); // L: 126
		if (var2 == null) { // L: 127
			var2 = class143.field1669;
		}

		return var2; // L: 128
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "52"
	)
	static byte[] method3539(byte[] var0) {
		int var1 = var0.length; // L: 35
		byte[] var2 = new byte[var1]; // L: 36
		System.arraycopy(var0, 0, var2, 0, var1); // L: 37
		return var2; // L: 38
	}
}
