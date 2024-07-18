import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class155 extends class163 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1796418191
	)
	int field1743;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class155(class164 var1) {
		this.this$0 = var1;
		this.field1743 = -1; // L: 84
	} // L: 86

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	void vmethod3524(Buffer var1) {
		this.field1743 = var1.readUnsignedShort(); // L: 89
		var1.readUnsignedByte(); // L: 90
		if (var1.readUnsignedByte() != 255) { // L: 91
			--var1.offset; // L: 92
			var1.readLong(); // L: 93
		}

	} // L: 95

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	void vmethod3523(ClanChannel var1) {
		var1.removeMember(this.field1743); // L: 98
	} // L: 99

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1749388721"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class415.client.method1830() && !class415.client.isOtlTokenRequesterInitialized() && !class415.client.method1259()) { // L: 1043
			Login.Login_response1 = ""; // L: 1047
			Login.Login_response2 = "Enter your username/email & password."; // L: 1048
			Login.Login_response3 = ""; // L: 1049
			class163.method3447(2); // L: 1050
			if (var0) { // L: 1051
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1053
				if (class105.clientPreferences.method2592() != null) { // L: 1054
					Login.Login_username = class105.clientPreferences.method2592(); // L: 1055
					Client.Login_isUsernameRemembered = true; // L: 1056
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1058
				}
			}

			UserComparator4.method2995(); // L: 1060
		} else {
			class163.method3447(10); // L: 1044
		}
	} // L: 1045 1061

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-45"
	)
	static int method3324(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 4472
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Z",
		garbageValue = "-767698753"
	)
	static final boolean method3331(Widget var0) {
		int var1 = var0.contentType; // L: 13074
		if (var1 == 205) { // L: 13075
			Client.logoutTimer = 250; // L: 13076
			return true; // L: 13077
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 13079
				var2 = (var1 - 300) / 2; // L: 13080
				var3 = var1 & 1; // L: 13081
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 13082
			}

			if (var1 >= 314 && var1 <= 323) { // L: 13084
				var2 = (var1 - 314) / 2; // L: 13085
				var3 = var1 & 1; // L: 13086
				Client.playerAppearance.method6558(var2, var3 == 1); // L: 13087
			}

			if (var1 == 324) {
				Client.playerAppearance.method6544(0); // L: 13089
			}

			if (var1 == 325) { // L: 13090
				Client.playerAppearance.method6544(1);
			}

			if (var1 == 326) { // L: 13091
				PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.field3299, Client.packetWriter.isaacCipher); // L: 13093
				Client.playerAppearance.write(var4.packetBuffer); // L: 13094
				Client.packetWriter.addNode(var4); // L: 13095
				return true; // L: 13096
			} else {
				return false; // L: 13098
			}
		}
	}
}
