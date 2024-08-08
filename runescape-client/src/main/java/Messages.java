import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("aq")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 108964459
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field1449;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method2916() {
		class177.field1869.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-125"
	)
	static String method2917() {
		StringBuilder var0 = new StringBuilder(); // L: 71

		Message var2;
		for (Iterator var1 = Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 72 78 80
			var2 = (Message)var1.next(); // L: 73
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 75
				var0.append(var2.sender).append(':'); // L: 76
			}
		}

		return var0.toString(); // L: 81
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "32"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Decimator.friendsChatManager != null) { // L: 13271
			PacketBufferNode var1 = class170.getPacketBufferNode(ClientPacket.field3359, Client.packetWriter.isaacCipher); // L: 13272
			var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0)); // L: 13273
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 13274
			Client.packetWriter.addNode(var1); // L: 13275
		}
	} // L: 13276

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2136125959"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class170.getPacketBufferNode(ClientPacket.field3365, Client.packetWriter.isaacCipher); // L: 13289
		var0.packetBuffer.writeByte(0); // L: 13290
		Client.packetWriter.addNode(var0); // L: 13291
	} // L: 13292
}
