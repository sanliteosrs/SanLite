import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class441 extends class444 {
	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public class441(class444 var1) {
		super(var1); // L: 9
		super.field4814 = "StartSongTask"; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		Iterator var1 = class330.field3584.iterator(); // L: 15

		while (var1.hasNext()) {
			class342 var2 = (class342)var1.next(); // L: 16
			if (var2 != null && !var2.field3710 && var2.field3713 != null) { // L: 18
				try {
					var2.field3713.removeAll(); // L: 22
					var2.field3713.setPcmStreamVolume(0); // L: 23
					if (var2.field3703 != null) { // L: 24
						var2.field3713.setMusicTrack(var2.field3703, var2.field3711); // L: 25
					}

					var2.field3703 = null; // L: 27
					var2.field3714 = null; // L: 28
					var2.field3708 = null; // L: 29
					var2.field3710 = true; // L: 30
				} catch (Exception var4) { // L: 32
					FriendsChatManager.RunException_sendStackTrace((String)null, var4); // L: 33
					this.method8253(var4.getMessage()); // L: 34
					return true; // L: 35
				}
			}
		}

		super.field4816 = true; // L: 39
		return true; // L: 40
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "579002211"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 13279
			PacketBufferNode var1 = class170.getPacketBufferNode(ClientPacket.field3365, Client.packetWriter.isaacCipher); // L: 13281
			var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0)); // L: 13282
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 13283
			Client.packetWriter.addNode(var1); // L: 13284
		}
	} // L: 13285
}
