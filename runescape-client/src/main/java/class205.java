import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class205 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 443044167
	)
	public int field2150;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -363435057
	)
	public int field2147;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1233321151
	)
	public int field2148;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1599145757
	)
	public int field2149;

	class205(int var1, int var2, int var3, int var4) {
		this.field2150 = 0; // L: 4
		this.field2147 = 0; // L: 5
		this.field2148 = 0; // L: 6
		this.field2149 = 0; // L: 7
		this.field2150 = var1; // L: 10
		this.field2147 = var2; // L: 11
		this.field2148 = var3; // L: 12
		this.field2149 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-118"
	)
	static int method3909(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 57
			var1 /= 2;
		}

		if (var2 > 192) { // L: 58
			var1 /= 2;
		}

		if (var2 > 217) { // L: 59
			var1 /= 2;
		}

		if (var2 > 243) { // L: 60
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 61
		return var3; // L: 62
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "1047946300"
	)
	static final String method3908(int var0, int var1) {
		int var2 = var1 - var0; // L: 11229
		if (var2 < -9) { // L: 11230
			return class191.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 11231
			return class191.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 11232
			return class191.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 11233
			return class191.colorStartTag(16756736);
		} else if (var2 > 9) { // L: 11234
			return class191.colorStartTag(65280);
		} else if (var2 > 6) { // L: 11235
			return class191.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 11236
			return class191.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class191.colorStartTag(12648192) : class191.colorStartTag(16776960); // L: 11237 11238
		}
	}
}
