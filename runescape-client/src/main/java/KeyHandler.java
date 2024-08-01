import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("KeyHandler")
public class KeyHandler {
	@ObfuscatedName("dk")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static class506 field140;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 92
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "727611248"
	)
	static void method432() {
		Login.Login_username = Login.Login_username.trim(); // L: 987
		if (Login.Login_username.length() == 0) { // L: 988
			VerticalAlignment.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 989
		} else if (Login.Login_password.length() == 0) { // L: 992
			VerticalAlignment.setLoginResponseString("", "Please enter your password.", ""); // L: 993
		} else {
			VerticalAlignment.setLoginResponseString("", "Connecting to server...", ""); // L: 996
			class213.method4134(false); // L: 997
			ClanChannelMember.method3282(20); // L: 998
		}
	} // L: 990 994 999

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIIIIIII)V",
		garbageValue = "-739570824"
	)
	static void method433(class101 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		NodeDeque var11 = var0.field1335; // L: 9036
		class96 var12 = null; // L: 9037

		for (class96 var13 = (class96)var11.last(); var13 != null; var13 = (class96)var11.previous()) { // L: 9038 9039 9044
			if (var13.field1174 == var1 && var2 == var13.field1178 && var3 == var13.field1177 && var4 == var13.field1172) { // L: 9040
				var12 = var13; // L: 9041
				break;
			}
		}

		if (var12 == null) { // L: 9046
			var12 = new class96(); // L: 9047
			var12.field1174 = var1; // L: 9048
			var12.field1172 = var4; // L: 9049
			var12.field1178 = var2; // L: 9050
			var12.field1177 = var3; // L: 9051
			var12.field1181 = -1; // L: 9052
			class137.method3189(var0, var12); // L: 9053
			var11.addFirst(var12); // L: 9054
		}

		var12.field1175 = var5; // L: 9056
		var12.field1186 = var6; // L: 9057
		var12.field1179 = var7; // L: 9058
		var12.field1184 = var9; // L: 9059
		var12.field1173 = var10; // L: 9060
		var12.method2474(var8); // L: 9061
	} // L: 9062

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "296708301"
	)
	static void method434(class68 var0) {
		if (class134.field1572 != var0) { // L: 13534
			class134.field1572 = var0; // L: 13535
		}
	} // L: 13536
}
