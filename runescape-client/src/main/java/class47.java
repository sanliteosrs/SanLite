import java.awt.Component;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class47 {
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1951368845
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1043320483
	)
	static int field314;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	VorbisSample field310;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	RawSound field311;
	@ObfuscatedName("ag")
	ReentrantLock field313;

	@ObfuscatedSignature(
		descriptor = "(Lcl;Lbl;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field310 = var1; // L: 11
		this.field311 = var2; // L: 12
		this.field313 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "0"
	)
	static void method899(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 43
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 44
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 45
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 46
	} // L: 47

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "690538178"
	)
	static final boolean method902(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 187
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 188
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 189
			if (var7 > var0 && var7 > var1 && var7 > var2) { // L: 190
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 191
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 192
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 193
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 194
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	static void method901() {
		class163.method3447(24); // L: 2135
		VerticalAlignment.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2136
	} // L: 2137

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1935757196"
	)
	static void method900() {
		if (!class105.clientPreferences.method2602()) { // L: 2149
			ArrayList var0 = new ArrayList(); // L: 2150
			var0.add(new class342(class199.field2100, "scape main", "", 255, false)); // L: 2151
			FontName.method9220(var0, 0, 0, 0, 100, false); // L: 2152
		} else {
			class137.method3187(0, 0); // L: 2154
		}

	} // L: 2155

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1933764384"
	)
	static void method903(int var0, String var1) {
		int var2 = SoundCache.localPlayer.field1147.field1319.field1404; // L: 10697
		int[] var3 = SoundCache.localPlayer.field1147.field1319.field1409; // L: 10698
		boolean var4 = false; // L: 10699
		Username var5 = new Username(var1, Projectile.loginType); // L: 10700

		for (int var6 = 0; var6 < var2; ++var6) { // L: 10701
			Player var7 = SoundCache.localPlayer.field1147.field1326[var3[var6]]; // L: 10702
			if (var7 != null && var7 != SoundCache.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 10703
				PacketBufferNode var8;
				if (var0 == 1) { // L: 10704
					var8 = class170.getPacketBufferNode(ClientPacket.field3345, Client.packetWriter.isaacCipher); // L: 10706
					var8.packetBuffer.method9756(0); // L: 10707
					var8.packetBuffer.method9767(var3[var6]); // L: 10708
					Client.packetWriter.addNode(var8); // L: 10709
				} else if (var0 == 4) { // L: 10711
					var8 = class170.getPacketBufferNode(ClientPacket.field3372, Client.packetWriter.isaacCipher); // L: 10713
					var8.packetBuffer.method9756(0); // L: 10714
					var8.packetBuffer.writeShort(var3[var6]); // L: 10715
					Client.packetWriter.addNode(var8); // L: 10716
				} else if (var0 == 6) { // L: 10718
					var8 = class170.getPacketBufferNode(ClientPacket.field3319, Client.packetWriter.isaacCipher); // L: 10720
					var8.packetBuffer.method9597(var3[var6]); // L: 10721
					var8.packetBuffer.method9587(0); // L: 10722
					Client.packetWriter.addNode(var8); // L: 10723
				} else if (var0 == 7) { // L: 10725
					var8 = class170.getPacketBufferNode(ClientPacket.field3328, Client.packetWriter.isaacCipher); // L: 10727
					var8.packetBuffer.method9597(var3[var6]); // L: 10728
					var8.packetBuffer.method9587(0); // L: 10729
					Client.packetWriter.addNode(var8); // L: 10730
				}

				var4 = true; // L: 10732
				break;
			}
		}

		if (!var4) { // L: 10736
			VarbitComposition.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 10737
}
