import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class28 {
	@ObfuscatedName("f")
	int[] field154;
	@ObfuscatedName("r")
	int[] field155;

	public class28() {
		this.field154 = new int[112]; // L: 12
		this.field155 = new int[192]; // L: 13
		Arrays.fill(this.field154, 3); // L: 16
		Arrays.fill(this.field155, 3); // L: 17
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1368624225"
	)
	public void method400(int var1, int var2) {
		if (this.method402(var1) && this.method403(var2)) { // L: 21
			this.field154[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "1784799880"
	)
	public void method394(char var1, int var2) {
		if (this.method410(var1) && this.method403(var2)) { // L: 27
			this.field155[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "32"
	)
	public int method393(int var1) {
		return this.method402(var1) ? this.field154[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "-1468094014"
	)
	public int method396(char var1) {
		return this.method410(var1) ? this.field155[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1654206318"
	)
	public boolean method422(int var1) {
		return this.method402(var1) && (this.field154[var1] == 1 || this.field154[var1] == 3); // L: 47
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1403697419"
	)
	public boolean method398(char var1) {
		return this.method410(var1) && (this.field155[var1] == 1 || this.field155[var1] == 3); // L: 51
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2025762954"
	)
	public boolean method401(int var1) {
		return this.method402(var1) && (this.field154[var1] == 2 || this.field154[var1] == 3); // L: 55
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-11"
	)
	public boolean method411(char var1) {
		return this.method410(var1) && (this.field155[var1] == 2 || this.field155[var1] == 3); // L: 59
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method402(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-1"
	)
	boolean method410(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-361086221"
	)
	boolean method403(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ldu;FI)F",
		garbageValue = "-834185099"
	)
	static float method425(class125 var0, float var1) {
		if (var0 == null) { // L: 192
			return 0.0F; // L: 193
		} else {
			float var2;
			if (var0.field1543 == var1) { // L: 196
				var2 = 0.0F; // L: 197
			} else if (var1 == var0.field1544) { // L: 199
				var2 = 1.0F; // L: 200
			} else {
				var2 = (var1 - var0.field1543) / (var0.field1544 - var0.field1543); // L: 203
			}

			float var3;
			if (var0.field1557) { // L: 206
				var3 = var2; // L: 207
			} else {
				class122.field1505[3] = var0.field1548; // L: 210
				class122.field1505[2] = var0.field1537; // L: 211
				class122.field1505[1] = var0.field1559; // L: 212
				class122.field1505[0] = var0.field1545 - var2; // L: 213
				class122.field1509[0] = 0.0F; // L: 214
				class122.field1509[1] = 0.0F; // L: 215
				class122.field1509[2] = 0.0F; // L: 216
				class122.field1509[3] = 0.0F; // L: 217
				class122.field1509[4] = 0.0F; // L: 218
				int var4 = WorldMapArchiveLoader.method7986(class122.field1505, 3, 0.0F, true, 1.0F, true, class122.field1509); // L: 219
				if (var4 == 1) { // L: 220
					var3 = class122.field1509[0]; // L: 221
				} else {
					var3 = 0.0F; // L: 224
				}
			}

			return var0.field1549 + var3 * (var0.field1550 + (var3 * var0.field1552 + var0.field1551) * var3); // L: 227
		}
	}
}
