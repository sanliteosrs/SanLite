import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class210 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("Widget_cachedSprites")
	static final class210 Widget_cachedSprites;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("Widget_cachedModels")
	static final class210 Widget_cachedModels;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("Widget_cachedFonts")
	static final class210 Widget_cachedFonts;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("Widget_cachedSpriteMasks")
	static final class210 Widget_cachedSpriteMasks;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2317;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2319;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2312;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2320;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2314;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2315;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2310;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class210 field2307;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2318;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class210 field2313;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1289947479
	)
	public final int field2311;

	static {
		Widget_cachedSprites = new class210(0); // L: 4
		Widget_cachedModels = new class210(1); // L: 5
		Widget_cachedFonts = new class210(2); // L: 6
		Widget_cachedSpriteMasks = new class210(3); // L: 7
		field2317 = new class210(4, class196.field2064); // L: 8
		field2319 = new class210(5); // L: 9
		field2312 = new class210(6, class196.field2054); // L: 10
		field2320 = new class210(7, class196.field2066); // L: 11
		field2314 = new class210(8, class196.field2055); // L: 12
		field2315 = new class210(9, class196.field2058); // L: 13
		field2310 = new class210(10, class196.field2060);
		field2307 = new class210(11, class196.field2059); // L: 15
		field2318 = new class210(12); // L: 16
		field2313 = new class210(13);
	}

	class210(int var1) {
		this(var1, (class196)null);
	} // L: 26

	@ObfuscatedSignature(
		descriptor = "(ILht;)V"
	)
	class210(int var1, class196 var2) {
		this.field2311 = var1;
	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Lpc;II)Lpc;",
		garbageValue = "1515296574"
	)
	@Export("findEnumerated")
	public static class400 findEnumerated(class400[] var0, int var1) {
		class400[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class400 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "38"
	)
	public static int method4100(int var0, int var1) {
		return (var0 << 8) + var1; // L: 14
	}
}
