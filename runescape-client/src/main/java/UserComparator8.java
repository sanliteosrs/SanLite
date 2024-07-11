import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;I)I",
		garbageValue = "1919618517"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "11"
	)
	static void method2998(boolean var0) {
		byte var1 = 0; // L: 1064
		boolean var2 = class105.clientPreferences.method2594() >= Client.field637; // L: 1067
		if (!var2) { // L: 1069
			var1 = 12; // L: 1070
		} else if (class415.client.method1830() || class415.client.isOtlTokenRequesterInitialized() || class415.client.method1259()) { // L: 1072
			var1 = 10; // L: 1073
		}

		class163.method3447(var1); // L: 1075
		if (var0) { // L: 1076
			Login.Login_username = ""; // L: 1077
			Login.Login_password = ""; // L: 1078
			class6.field20 = 0; // L: 1079
			class146.otp = ""; // L: 1080
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1083
			if (class105.clientPreferences.method2592() != null) { // L: 1084
				Login.Login_username = class105.clientPreferences.method2592(); // L: 1085
				Client.Login_isUsernameRemembered = true; // L: 1086
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1088
			}
		}

		UserComparator4.method2995(); // L: 1090
	} // L: 1091
}
