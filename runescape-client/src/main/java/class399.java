import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class399 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	class395 field4508;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1377527347
	)
	int field4506;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1582717359
	)
	int field4507;

	@ObfuscatedSignature(
		descriptor = "(Lpt;II)V"
	)
	class399(class395 var1, int var2, int var3) {
		this.field4506 = 0; // L: 7
		this.field4507 = 0; // L: 8
		this.field4508 = var1; // L: 11
		this.field4506 = var2; // L: 12
		this.field4507 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1809601354"
	)
	public String method7582() {
		if (this.method7584()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7585()); // L: 18

			for (int var2 = this.field4506; var2 < this.field4507; ++var2) { // L: 19
				class397 var3 = this.field4508.method7312(var2); // L: 20
				var1.append(var3.field4480); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1827126332"
	)
	boolean method7604(int var1) {
		return this.field4508.method7343() == 2 || this.field4508.method7343() == 1 && (!this.field4508.field4462 || this.field4507 - 1 != var1); // L: 27
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-587840558"
	)
	public boolean method7584() {
		return this.field4506 == this.field4507; // L: 31
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "107"
	)
	public int method7585() {
		return this.field4507 - this.field4506; // L: 35
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lpz;I)Z",
		garbageValue = "-1646717603"
	)
	boolean method7586(class397 var1) {
		if (this.field4508.field4472 == 2) { // L: 39
			return true;
		} else if (this.field4508.field4472 == 0) { // L: 40
			return false;
		} else {
			return this.field4508.method7313() != var1; // L: 41
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1502136655"
	)
	int method7591() {
		if (this.method7584()) { // L: 46
			return 0;
		} else {
			class397 var1 = this.field4508.method7312(this.field4507 - 1); // L: 47
			if (var1.field4480 == '\n') { // L: 48
				return 0;
			} else if (this.method7586(var1)) {
				return this.field4508.field4461.advances[42]; // L: 49
			} else {
				int var2 = this.field4508.field4461.advances[var1.field4480]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4480 == '\t' ? this.field4508.field4461.advances[32] * 3 : this.field4508.field4461.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "-631307887"
	)
	public class486 method7588() {
		if (this.method7584()) { // L: 65
			return new class486(0, 0); // L: 66
		} else {
			class397 var1 = this.field4508.method7312(this.field4507 - 1); // L: 68
			return new class486(var1.field4479 + this.method7591(), var1.field4481); // L: 69
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "-2132806837"
	)
	public class397 method7589(int var1) {
		return var1 >= 0 && var1 < this.method7585() ? this.field4508.method7312(this.field4506 + var1) : null; // L: 73 74
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "687406142"
	)
	static int method7610(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 936
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 937
		}
	}
}
