import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public final class class385 implements Comparable {
	@ObfuscatedName("h")
	Object field4498;
	@ObfuscatedName("e")
	Object field4497;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -6635718008833307511L
	)
	long field4496;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 5181820872538493099L
	)
	long field4499;

	class385(Object var1, Object var2) {
		this.field4498 = var1; // L: 10
		this.field4497 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)I",
		garbageValue = "16470781"
	)
	int method7393(class385 var1) {
		if (this.field4499 < var1.field4499) {
			return -1; // L: 15
		} else {
			return this.field4499 > var1.field4499 ? 1 : 0; // L: 16 17
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class385) { // L: 22
			return this.field4497.equals(((class385)var1).field4497);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int hashCode() {
		return this.field4497.hashCode(); // L: 28
	}

	public int compareTo(Object var1) {
		return this.method7393((class385)var1); // L: 32
	}
}
