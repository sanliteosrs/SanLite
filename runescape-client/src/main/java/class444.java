import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public abstract class class444 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	class444 field4815;
	@ObfuscatedName("ak")
	String field4812;
	@ObfuscatedName("ap")
	String field4814;
	@ObfuscatedName("an")
	boolean field4813;
	@ObfuscatedName("aj")
	boolean field4816;

	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	class444(class444 var1) {
		this.field4815 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public abstract boolean vmethod8276();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "131549987"
	)
	public boolean method8249() {
		return this.field4813; // L: 17
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1551144894"
	)
	public boolean method8250() {
		return this.field4816; // L: 21
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1477526739"
	)
	public String method8251() {
		return "Error in task: " + this.field4814 + ", Error message: " + this.field4812; // L: 25
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lro;",
		garbageValue = "-1949503996"
	)
	public class444 method8254() {
		return this.field4815; // L: 29
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1766646668"
	)
	void method8253(String var1) {
		this.field4813 = true; // L: 33
		this.field4812 = var1; // L: 34
	} // L: 35

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-7"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ModeWhere.field4649.method6513(var1, var2); // L: 10778
		if (var5 != null) { // L: 10779
			if (var5.onOp != null) { // L: 10780
				ScriptEvent var6 = new ScriptEvent(); // L: 10781
				var6.widget = var5; // L: 10782
				var6.opIndex = var0; // L: 10783
				var6.targetName = var4; // L: 10784
				var6.args = var5.onOp; // L: 10785
				Projectile.runScriptEvent(var6); // L: 10786
			}

			boolean var8 = true; // L: 10788
			if (var5.contentType > 0) { // L: 10789
				var8 = class155.method3331(var5);
			}

			if (var8) { // L: 10790
				if (Varps.method6452(ClanChannel.getWidgetFlags(var5), var0 - 1)) { // L: 10791
					PacketBufferNode var7;
					if (var0 == 1) { // L: 10794
						var7 = class170.getPacketBufferNode(ClientPacket.field3307, Client.packetWriter.isaacCipher); // L: 10796
						var7.packetBuffer.writeInt(var1); // L: 10797
						var7.packetBuffer.writeShort(var2); // L: 10798
						var7.packetBuffer.writeShort(var3); // L: 10799
						Client.packetWriter.addNode(var7); // L: 10800
					}

					if (var0 == 2) { // L: 10802
						var7 = class170.getPacketBufferNode(ClientPacket.field3304, Client.packetWriter.isaacCipher); // L: 10804
						var7.packetBuffer.writeInt(var1); // L: 10805
						var7.packetBuffer.writeShort(var2); // L: 10806
						var7.packetBuffer.writeShort(var3); // L: 10807
						Client.packetWriter.addNode(var7); // L: 10808
					}

					if (var0 == 3) { // L: 10810
						var7 = class170.getPacketBufferNode(ClientPacket.field3374, Client.packetWriter.isaacCipher); // L: 10812
						var7.packetBuffer.writeInt(var1); // L: 10813
						var7.packetBuffer.writeShort(var2); // L: 10814
						var7.packetBuffer.writeShort(var3); // L: 10815
						Client.packetWriter.addNode(var7); // L: 10816
					}

					if (var0 == 4) { // L: 10818
						var7 = class170.getPacketBufferNode(ClientPacket.field3344, Client.packetWriter.isaacCipher); // L: 10820
						var7.packetBuffer.writeInt(var1); // L: 10821
						var7.packetBuffer.writeShort(var2); // L: 10822
						var7.packetBuffer.writeShort(var3); // L: 10823
						Client.packetWriter.addNode(var7); // L: 10824
					}

					if (var0 == 5) { // L: 10826
						var7 = class170.getPacketBufferNode(ClientPacket.field3308, Client.packetWriter.isaacCipher); // L: 10828
						var7.packetBuffer.writeInt(var1); // L: 10829
						var7.packetBuffer.writeShort(var2); // L: 10830
						var7.packetBuffer.writeShort(var3); // L: 10831
						Client.packetWriter.addNode(var7); // L: 10832
					}

					if (var0 == 6) { // L: 10834
						var7 = class170.getPacketBufferNode(ClientPacket.field3334, Client.packetWriter.isaacCipher); // L: 10836
						var7.packetBuffer.writeInt(var1); // L: 10837
						var7.packetBuffer.writeShort(var2); // L: 10838
						var7.packetBuffer.writeShort(var3); // L: 10839
						Client.packetWriter.addNode(var7); // L: 10840
					}

					if (var0 == 7) { // L: 10842
						var7 = class170.getPacketBufferNode(ClientPacket.field3336, Client.packetWriter.isaacCipher); // L: 10844
						var7.packetBuffer.writeInt(var1); // L: 10845
						var7.packetBuffer.writeShort(var2); // L: 10846
						var7.packetBuffer.writeShort(var3); // L: 10847
						Client.packetWriter.addNode(var7); // L: 10848
					}

					if (var0 == 8) { // L: 10850
						var7 = class170.getPacketBufferNode(ClientPacket.field3331, Client.packetWriter.isaacCipher); // L: 10852
						var7.packetBuffer.writeInt(var1); // L: 10853
						var7.packetBuffer.writeShort(var2); // L: 10854
						var7.packetBuffer.writeShort(var3); // L: 10855
						Client.packetWriter.addNode(var7); // L: 10856
					}

					if (var0 == 9) { // L: 10858
						var7 = class170.getPacketBufferNode(ClientPacket.field3355, Client.packetWriter.isaacCipher); // L: 10860
						var7.packetBuffer.writeInt(var1); // L: 10861
						var7.packetBuffer.writeShort(var2); // L: 10862
						var7.packetBuffer.writeShort(var3); // L: 10863
						Client.packetWriter.addNode(var7); // L: 10864
					}

					if (var0 == 10) { // L: 10866
						var7 = class170.getPacketBufferNode(ClientPacket.field3343, Client.packetWriter.isaacCipher); // L: 10868
						var7.packetBuffer.writeInt(var1); // L: 10869
						var7.packetBuffer.writeShort(var2); // L: 10870
						var7.packetBuffer.writeShort(var3); // L: 10871
						Client.packetWriter.addNode(var7); // L: 10872
					}

				}
			}
		}
	} // L: 10792 10874
}
