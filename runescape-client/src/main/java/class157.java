import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class157 extends class147 {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1756;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1680782365
	)
	int field1754;
	@ObfuscatedName("ad")
	String field1752;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class157(class150 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1754 = var1.readInt(); // L: 326
		this.field1752 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3367(this.field1754, this.field1752); // L: 331
	} // L: 332

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "94"
	)
	public static void method3343(ArrayList var0, int var1, int var2, int var3, int var4) {
		class330.field3585.clear(); // L: 269
		class330.field3585.addAll(var0); // L: 270
		class33.method476(var1, var2, var3, var4); // L: 271
	} // L: 272

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254433407"
	)
	static final void method3347() {
		if (Projectile.pcmPlayer1 != null) { // L: 4011
			Projectile.pcmPlayer1.run();
		}

	} // L: 4012
}
