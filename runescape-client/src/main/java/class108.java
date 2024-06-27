import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
final class class108 implements class348 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnx;)V"
	)
	class108(Widget var1) {
		this.val$cc = var1; // L: 500
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2099855571"
	)
	public void vmethod6510() {
		if (this.val$cc != null && this.val$cc.method6892().field3763 != null) { // L: 502
			ScriptEvent var1 = new ScriptEvent(); // L: 503
			var1.method2378(this.val$cc); // L: 504
			var1.setArgs(this.val$cc.method6892().field3763); // L: 505
			Varps.method6447().addFirst(var1); // L: 506
		}

	} // L: 508

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1115336218"
	)
	public static void method2812(int var0, int var1, int var2, int var3) {
		if (class330.field3584.size() > 1 && class330.field3584.get(0) != null && ((class342)class330.field3584.get(0)).field3713.isReady() && class330.field3584.get(1) != null && ((class342)class330.field3584.get(1)).field3713.isReady()) { // L: 201
			class33.method476(var0, var1, var2, var3); // L: 202
			class330.field3581.add(new class438((class444)null)); // L: 203
			ArrayList var4 = new ArrayList(); // L: 204
			var4.add(new class440(new class443((class444)null, 1, false, class330.field3586), class330.field3590)); // L: 205
			var4.add(new class440(new class442((class444)null, 0, false, class330.field3589), class330.field3580)); // L: 206
			class330.field3581.add(new class445((class444)null, var4)); // L: 207
			if (class330.field3585.get(0) != null && class330.field3585.get(1) != null) { // L: 208
				class342 var5 = (class342)class330.field3585.get(0); // L: 209
				class330.field3585.set(0, class330.field3584.get(1)); // L: 210
				class330.field3585.set(1, var5); // L: 211
			}
		}

	} // L: 214

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2090608479"
	)
	static final String method2810(int var0) {
		if (var0 < 100000) { // L: 460
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 461 462
		}
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-271329578"
	)
	static final void method2811(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class276.guestClanChannel; // L: 13295
		if (var2 != null && var1 >= 0 && var1 < var2.method3501()) { // L: 13296
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 13297
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 13299
				PacketBufferNode var5 = class170.getPacketBufferNode(ClientPacket.field3375, Client.packetWriter.isaacCipher); // L: 13300
				var5.packetBuffer.writeByte(3 + Actor.stringCp1252NullTerminatedByteSize(var4)); // L: 13301
				var5.packetBuffer.writeByte(var0); // L: 13302
				var5.packetBuffer.writeShort(var1); // L: 13303
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 13304
				Client.packetWriter.addNode(var5); // L: 13305
			}
		}
	} // L: 13298 13306
}
