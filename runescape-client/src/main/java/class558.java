import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
public enum class558 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	field5444(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	field5446(2, 2);

	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -484581119
	)
	public final int field5443;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1671682405
	)
	final int field5447;

	class558(int var3, int var4) {
		this.field5443 = var3; // L: 19
		this.field5447 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5447; // L: 25
	}
}
