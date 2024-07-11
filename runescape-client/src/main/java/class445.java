import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public class class445 extends class444 {
	@ObfuscatedName("aq")
	ArrayList field4817;

	@ObfuscatedSignature(
		descriptor = "(Lro;Ljava/util/ArrayList;)V"
	)
	public class445(class444 var1, ArrayList var2) {
		super(var1);
		this.field4817 = var2;
		super.field4814 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		for (int var1 = 0; var1 < this.field4817.size(); ++var1) {
			class444 var2 = (class444)this.field4817.get(var1);
			if (var2 == null) {
				this.field4817.remove(var1); // L: 19
				--var1; // L: 20
			} else if (var2.vmethod8276()) {
				if (var2.method8249()) { // L: 24
					this.method8253(var2.method8251()); // L: 25
					this.field4817.clear();
					return true; // L: 27
				}

				if (var2.method8254() != null) { // L: 30
					this.field4817.add(var2.method8254()); // L: 31
				}

				super.field4816 = var2.field4816; // L: 33
				this.field4817.remove(var1); // L: 35
				--var1; // L: 36
			}
		}

		if (this.field4817.isEmpty()) { // L: 39
			return true; // L: 40
		} else {
			return false; // L: 42
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "-1012537953"
	)
	public static int method8274(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 9
		int var4 = var1; // L: 10

		for (int var5 = 0; var5 < var3; ++var5) { // L: 11
			char var6 = var2.charAt(var5); // L: 12
			if (var6 <= 127) { // L: 13
				var0[var4++] = (byte)var6; // L: 14
			} else if (var6 <= 2047) { // L: 16
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 17
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 18
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 21
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 22
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 23
			}
		}

		return var4 - var1; // L: 26
	}
}
