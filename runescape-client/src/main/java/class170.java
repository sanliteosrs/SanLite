import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class170 extends class163 {
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static class101 field1839;
	@ObfuscatedName("aq")
	String field1835;
	@ObfuscatedName("ad")
	byte field1838;
	@ObfuscatedName("ag")
	byte field1836;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class170(class164 var1) {
		this.this$0 = var1; // L: 157
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	void vmethod3524(Buffer var1) {
		this.field1835 = var1.readStringCp1252NullTerminatedOrNull(); // L: 160
		if (this.field1835 != null) { // L: 161
			var1.readUnsignedByte(); // L: 162
			this.field1838 = var1.readByte(); // L: 163
			this.field1836 = var1.readByte(); // L: 164
		}

	} // L: 166

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	void vmethod3523(ClanChannel var1) {
		var1.name = this.field1835; // L: 169
		if (this.field1835 != null) { // L: 170
			var1.field1823 = this.field1838; // L: 171
			var1.field1817 = this.field1836; // L: 172
		}

	} // L: 174

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lvs;S)Lmb;",
		garbageValue = "25118"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class323.method6113(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0; // L: 37
		return var2; // L: 38
	}
}
