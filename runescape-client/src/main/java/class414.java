import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class414 {
	@ObfuscatedName("aq")
	public static char[] field4669;
	@ObfuscatedName("ad")
	static char[] field4673;
	@ObfuscatedName("ag")
	static char[] field4671;
	@ObfuscatedName("ak")
	static int[] field4672;
	@ObfuscatedName("dp")
	static boolean field4670;

	static {
		field4669 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4669[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4669[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4669[var0] = (char)(var0 + 48 - 52);
		}

		field4669[62] = '+'; // L: 11
		field4669[63] = '/'; // L: 12
		field4673 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4673[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4673[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4673[var0] = (char)(var0 + 48 - 52);
		}

		field4673[62] = '*';
		field4673[63] = '-'; // L: 23
		field4671 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4671[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4671[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4671[var0] = (char)(var0 + 48 - 52);
		}

		field4671[62] = '-'; // L: 33
		field4671[63] = '_'; // L: 34
		field4672 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4672.length; ++var0) { // L: 41
			field4672[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4672[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4672[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4672[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4672; // L: 45
		field4672[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4672; // L: 48
		field4672[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-48"
	)
	public static int method7619(int var0) {
		return var0 >>> 4 & class540.field5313; // L: 22
	}
}
