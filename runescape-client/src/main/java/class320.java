import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class320 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3378;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3379;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3380;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3386;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3382;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3384;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3381;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3385;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3383;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3387;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3388;

	static {
		field3378 = new class320(2); // L: 5
		field3379 = new class320(7); // L: 6
		field3380 = new class320(14); // L: 7
		field3386 = new class320(14); // L: 8
		field3382 = new class320(4); // L: 9
		field3384 = new class320(4); // L: 10
		field3381 = new class320(5); // L: 11
		field3385 = new class320(6); // L: 12
		field3383 = new class320(11); // L: 13
		field3387 = new class320(20); // L: 14
		field3388 = new class320(7);
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2"
	)
	class320(int var1) {
	} // L: 21

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIII)V",
		garbageValue = "1815594213"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3966 == null) { // L: 1264
			throw new RuntimeException(); // L: 1265
		} else {
			var0.field3966[var1] = var2; // L: 1267
			var0.field3910[var1] = var3; // L: 1268
		}
	} // L: 1269
}
