import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class439 extends class444 {
	@ObfuscatedName("aq")
	ArrayList field4800;

	@ObfuscatedSignature(
		descriptor = "(Lro;Ljava/util/ArrayList;)V"
	)
	public class439(class444 var1, ArrayList var2) {
		super(var1); // L: 12
		super.field4814 = "ClearRequestTask"; // L: 13
		this.field4800 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		if (this.field4800.isEmpty()) { // L: 19
			return true; // L: 20
		} else {
			Iterator var1 = this.field4800.iterator(); // L: 22

			while (var1.hasNext()) {
				class342 var2 = (class342)var1.next(); // L: 23

				try {
					if (class330.field3584.contains(var2)) { // L: 26
						if (var2 == null) { // L: 27
							class330.field3584.remove(var2); // L: 28
						} else {
							if (var2.field3713.field3627 > 0) { // L: 31
								--var2.field3713.field3627; // L: 32
							}

							if (var2.field3713.field3627 == 0) { // L: 34
								var2.field3713.clear(); // L: 35
								var2.field3713.method6190(); // L: 36
								var2.field3713.setPcmStreamVolume(0); // L: 37
							}

							int var3 = var2.field3716; // L: 39
							int var4 = var2.field3705; // L: 40
							Iterator var5 = class330.field3588.iterator(); // L: 42

							while (var5.hasNext()) {
								class336 var6 = (class336)var5.next(); // L: 43
								var6.vmethod6382(var3, var4); // L: 45
							}

							class330.field3584.remove(var2); // L: 49
						}
					}
				} catch (Exception var8) { // L: 52
					FriendsChatManager.RunException_sendStackTrace((String)null, var8); // L: 53
					this.method8253(var8.getMessage()); // L: 54
					class330.field3584.clear(); // L: 55
					return true; // L: 56
				}
			}

			return true; // L: 60
		}
	}
}
