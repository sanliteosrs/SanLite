import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class166 extends class147 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 370831747
	)
	int field1816;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class166(class150 var1) {
		this.this$0 = var1;
		this.field1816 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1816 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3369(this.field1816); // L: 153
	} // L: 154

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-460998762"
	)
	public static int method3473(int var0) {
		return var0 + -512; // L: 18
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "27764"
	)
	public static int method3477(int var0, int var1, int var2) {
		int var3 = GraphicsObject.method2153(var2 - var1 + 1); // L: 45
		var3 <<= var1; // L: 46
		var0 |= var3; // L: 47
		return var0; // L: 48
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1423674669"
	)
	static final void method3476(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12867
		var0 = 100 - var0; // L: 12868
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 12869
		InvDefinition.method3555((double)var1); // L: 12870
	} // L: 12871
}
