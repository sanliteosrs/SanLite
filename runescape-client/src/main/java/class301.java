import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public final class class301 {
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 48501363
	)
	static int field3215;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 813042761
	)
	int field3209;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -35525971
	)
	int field3218;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1279477689
	)
	int field3210;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1427307041
	)
	int field3211;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1529712313
	)
	int field3212;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	public Renderable field3213;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	public Renderable field3208;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 7437302260060701101L
	)
	public long field3214;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 696972967
	)
	int field3216;

	class301() {
		this.field3214 = 0L; // L: 11
		this.field3216 = 0; // L: 12
	} // L: 14

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "101"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lok;IB)Lvv;",
		garbageValue = "3"
	)
	public static IndexedSprite method6014(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1); // L: 162
		boolean var2;
		if (var3 == null) { // L: 163
			var2 = false; // L: 164
		} else {
			DefaultsGroup.SpriteBuffer_decode(var3); // L: 167
			var2 = true; // L: 168
		}

		return !var2 ? null : class159.method3419(); // L: 170 171
	}
}
