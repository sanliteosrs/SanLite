import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class145 extends class147 {
	@ObfuscatedName("ap")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1684;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 1778310617
	)
	static int field1682;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 3441742155483086295L
	)
	long field1685;
	@ObfuscatedName("ad")
	String field1683;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class145(class150 var1) {
		this.this$0 = var1;
		this.field1685 = -1L; // L: 74
		this.field1683 = null; // L: 75
	} // L: 77

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1685 = var1.readLong(); // L: 82
		}

		this.field1683 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3378(this.field1685, this.field1683, 0); // L: 88
	} // L: 89
}
