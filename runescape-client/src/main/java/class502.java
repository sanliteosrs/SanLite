import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
final class class502 implements class499 {
	@ObfuscatedName("az")
	@Export("ItemComposition_inMembersWorld")
	static boolean ItemComposition_inMembersWorld;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lty;I)V",
		garbageValue = "-791895690"
	)
	public void vmethod8956(Object var1, Buffer var2) {
		this.method8921((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)Ljava/lang/Object;",
		garbageValue = "1270618633"
	)
	public Object vmethod8959(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lty;I)V",
		garbageValue = "-338210683"
	)
	void method8921(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27
}
