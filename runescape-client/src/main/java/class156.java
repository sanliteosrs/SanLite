import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class156 extends class159 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2144762309
	)
	int field1731;
	@ObfuscatedName("ap")
	byte field1729;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1849804193
	)
	int field1730;
	@ObfuscatedName("aj")
	String field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class156(class160 var1) {
		this.this$0 = var1;
		this.field1731 = -1; // L: 127
	} // L: 132

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1814222712"
	)
	void vmethod3518(Buffer var1) {
		var1.readUnsignedByte(); // L: 135
		this.field1731 = var1.readUnsignedShort(); // L: 136
		this.field1729 = var1.readByte(); // L: 137
		this.field1730 = var1.readUnsignedShort(); // L: 138
		var1.readLong(); // L: 139
		this.field1728 = var1.readStringCp1252NullTerminated(); // L: 140
		var1.readUnsignedByte(); // L: 141
	} // L: 142

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "1662663599"
	)
	void vmethod3519(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1731); // L: 145
		var2.rank = this.field1729; // L: 146
		var2.world = this.field1730; // L: 147
		var2.username = new Username(this.field1728); // L: 148
	} // L: 149

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "165807683"
	)
	public static int method3433(int var0) {
		return class167.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 72
	}
}
