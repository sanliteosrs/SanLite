import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tu")
public class class517 {
	@ObfuscatedName("aq")
	public final Object field5225;
	@ObfuscatedName("ad")
	public final Object field5222;

	public class517(Object var1, Object var2) {
		this.field5225 = var1; // L: 8
		this.field5222 = var2; // L: 9
	} // L: 10

	public String toString() {
		return this.field5225 + ", " + this.field5222; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field5225 != null) { // L: 38
			var1 += this.field5225.hashCode();
		}

		if (this.field5222 != null) {
			var1 += 31 * this.field5222.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class517) { // L: 20
			class517 var2 = (class517)var1; // L: 23
			if (this.field5225 == null) { // L: 24
				if (var2.field5225 != null) { // L: 25
					return false;
				}
			} else if (!this.field5225.equals(var2.field5225)) { // L: 27
				return false;
			}

			if (this.field5222 == null) { // L: 28
				if (var2.field5222 != null) { // L: 29
					return false;
				}
			} else if (!this.field5222.equals(var2.field5222)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}
}
