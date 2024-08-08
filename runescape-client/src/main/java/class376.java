import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class376 {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1861554639
	)
	static final int field4093;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1412380809
	)
	static final int field4094;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 744109287
	)
	static final int field4109;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -71092613
	)
	static final int field4110;

	static {
		field4093 = Coord.method6489(256); // L: 9
		field4094 = Coord.method6489(256); // L: 10
		Coord.method6467(field4093); // L: 13
		Coord.method6467(field4094); // L: 17
		Coord.method6489(100); // L: 33
		Coord.method6489(200); // L: 37
		Coord.method6489(1); // L: 44
		Coord.method6489(1); // L: 48
		short var0 = 6400; // L: 57
		field4109 = var0; // L: 59
		field4110 = Coord.method6483(field4109); // L: 62
		Coord.method6489(1); // L: 65
		Coord.method6489(1); // L: 69
		int var5 = 0; // L: 73
		int var1 = 0; // L: 74
		class372[] var2 = class372.field4067; // L: 76

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 77
			class372 var4 = var2[var3]; // L: 78
			if (var4.field4066 > var5) { // L: 80
				var5 = var4.field4066;
			}

			if (var4.field4068 > var1) { // L: 81
				var1 = var4.field4068;
			}
		}

	} // L: 85

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-440187537"
	)
	public static int method7084(int var0) {
		return var0 * 128 + 64; // L: 92
	}
}
