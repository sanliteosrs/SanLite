import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public class class437 extends class444 {
	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public class437(class444 var1) {
		super(var1); // L: 9
		super.field4814 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		while (!class330.field3587.isEmpty()) { // L: 15
			class342 var1 = (class342)class330.field3587.peek(); // L: 16
			if (var1 == null) { // L: 17
				class330.field3587.pop(); // L: 18
			} else {
				var1.field3713 = this.method8224(); // L: 21
				class330.field3584.add(var1); // L: 22
				class330.field3587.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lmc;",
		garbageValue = "2"
	)
	MidiPcmStream method8224() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class330.field3582.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3627; // L: 39
							if (var1.method6187() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.method6190(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null); // L: 33
			} while(var1 != null && var1.field3627 <= var3.field3627 && (var3.method6187() != 0 || !var3.isReady()));

			var1 = var3; // L: 34
		}
	}
}
