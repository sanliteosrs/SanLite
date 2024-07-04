import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class438 extends class444 {
	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public class438(class444 var1) {
		super(var1); // L: 8
		super.field4814 = "SwapSongTask"; // L: 9
	} // L: 10

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		if (class330.field3584.size() > 1 && class330.field3584.get(0) != null && ((class342)class330.field3584.get(0)).field3713.isReady() && class330.field3584.get(1) != null && ((class342)class330.field3584.get(1)).field3713.isReady()) { // L: 14
			class342 var1 = (class342)class330.field3584.get(0); // L: 15
			class330.field3584.set(0, class330.field3584.get(1)); // L: 16
			class330.field3584.set(1, var1); // L: 17
		}

		return true; // L: 19
	}
}
