import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public final class class276 extends Node {
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2872;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 608241537
	)
	int field2853;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -720986189
	)
	int field2851;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2079615869
	)
	int field2861;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -608515825
	)
	int field2852;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	SceneTilePaint field2863;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	SceneTileModel field2854;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	class301 field2855;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	class303 field2856;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	class273 field2857;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	class271 field2858;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1837845291
	)
	int field2859;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	class304[] field2860;
	@ObfuscatedName("ah")
	int[] field2869;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1687914105
	)
	int field2862;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 336523667
	)
	int field2850;
	@ObfuscatedName("ac")
	boolean field2864;
	@ObfuscatedName("al")
	boolean field2865;
	@ObfuscatedName("ay")
	boolean field2866;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 690710773
	)
	int field2867;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1732174243
	)
	int field2873;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1384418897
	)
	int field2849;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1923980729
	)
	int field2870;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	class276 field2871;

	class276(int var1, int var2, int var3) {
		this.field2860 = new class304[5];
		this.field2869 = new int[5];
		this.field2862 = 0;
		this.field2852 = this.field2853 = var1;
		this.field2851 = var2;
		this.field2861 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-1848754324"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110; // L: 27
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}
}
