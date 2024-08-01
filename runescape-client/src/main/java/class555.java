import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vt")
public class class555 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1593412931
	)
	public final int field5428;
	@ObfuscatedName("ad")
	public Object field5429;

	public class555(int var1) {
		this.field5428 = var1; // L: 8
	} // L: 9

	public class555(int var1, Object var2) {
		this.field5428 = var1; // L: 12
		this.field5429 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 18
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class555)) { // L: 23
			return false;
		} else {
			class555 var2 = (class555)var1; // L: 24
			if (var2.field5429 == null && this.field5429 != null) { // L: 25
				return false;
			} else if (this.field5429 == null && var2.field5429 != null) { // L: 26
				return false;
			} else {
				return this.field5428 == var2.field5428 && var2.field5429.equals(this.field5429); // L: 27
			}
		}
	}
}
