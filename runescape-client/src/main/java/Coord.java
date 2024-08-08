import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 194034093
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1492035379
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1884235445
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lnl;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 17
		this.x = var1.x; // L: 18
		this.y = var1.y; // L: 19
	} // L: 20

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 11
		this.x = var2; // L: 12
		this.y = var3; // L: 13
	} // L: 14

	public Coord(int var1) {
		if (var1 == -1) { // L: 23
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 25
			this.x = var1 >> 14 & 16383; // L: 26
			this.y = var1 & 16383; // L: 27
		}

	} // L: 29

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	@Export("packed")
	public int packed() {
		return method6460(this.plane, this.x, this.y); // L: 32
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)Z",
		garbageValue = "794880841"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 59
			return false;
		} else if (this.x != var1.x) { // L: 60
			return false;
		} else {
			return this.y == var1.y; // L: 61
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1664964664"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 75
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 53
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 54 55
		}
	}

	public int hashCode() {
		return this.packed(); // L: 67
	}

	public String toString() {
		return this.toString(","); // L: 71
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "911272682"
	)
	public static int method6460(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 36
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-701103374"
	)
	public static int method6469(int var0) {
		return var0 >> 28 & 3; // L: 40
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "91"
	)
	public static int method6468(int var0) {
		return var0 >> 14 & 16383; // L: 44
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-665658663"
	)
	public static int method6474(int var0) {
		return var0 & 16383; // L: 48
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "38"
	)
	public static int method6483(int var0) {
		return var0 >> 3; // L: 79
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-24"
	)
	public static int method6467(int var0) {
		return var0 << 3; // L: 83
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "826326374"
	)
	public static int method6489(int var0) {
		return var0 << 3; // L: 87
	}
}
