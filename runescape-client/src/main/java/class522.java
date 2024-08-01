import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
public class class522 implements class521 {
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1588295485
	)
	static int field5244;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("aq")
	Map field5242;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvu;"
	)
	final class554 field5241;

	@ObfuscatedSignature(
		descriptor = "(Lvu;)V"
	)
	public class522(class554 var1) {
		this.field5241 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-113"
	)
	public int vmethod9300(int var1) {
		if (this.field5242 != null) { // L: 20
			class555 var2 = (class555)this.field5242.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field5429; // L: 22
			}
		}

		return (Integer)this.field5241.vmethod9874(var1); // L: 24
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1884747483"
	)
	public void vmethod9294(int var1, Object var2) {
		if (this.field5242 == null) { // L: 29
			this.field5242 = new HashMap(); // L: 30
			this.field5242.put(var1, new class555(var1, var2)); // L: 31
		} else {
			class555 var3 = (class555)this.field5242.get(var1); // L: 34
			if (var3 == null) {
				this.field5242.put(var1, new class555(var1, var2)); // L: 35
			} else {
				var3.field5429 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field5242 == null ? Collections.emptyList().iterator() : this.field5242.values().iterator(); // L: 42 43
	}
}
