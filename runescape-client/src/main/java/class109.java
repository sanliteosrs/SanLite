import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
final class class109 implements class348 {
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static StudioGame field1400;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnx;)V"
	)
	class109(Widget var1) {
		this.val$cc = var1; // L: 510
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2099855571"
	)
	public void vmethod6510() {
		if (this.val$cc != null && this.val$cc.method6892().field3766 != null) { // L: 512
			ScriptEvent var1 = new ScriptEvent(); // L: 513
			var1.method2378(this.val$cc); // L: 514
			var1.setArgs(this.val$cc.method6892().field3766); // L: 515
			Varps.method6447().addFirst(var1); // L: 516
		}

	} // L: 518

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lth;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1909911513"
	)
	static String method2817(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	static final void method2818() {
		PacketBufferNode var0 = class170.getPacketBufferNode(ClientPacket.field3358, Client.packetWriter.isaacCipher); // L: 13031
		Client.packetWriter.addNode(var0); // L: 13032
		Interpreter.field870 = true; // L: 13033

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 13034
			if (var1.type == 0 || var1.type == 3) { // L: 13035
				ArchiveDiskActionHandler.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 13037
			TriBool.invalidateWidget(Client.meslayerContinueWidget); // L: 13038
			Client.meslayerContinueWidget = null; // L: 13039
		}

		Interpreter.field870 = false; // L: 13041
	} // L: 13042
}
