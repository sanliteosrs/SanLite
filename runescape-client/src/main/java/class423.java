import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public final class class423 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	static class423[] field4701;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 585310265
	)
	static int field4697;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1088343129
	)
	static int field4698;
	@ObfuscatedName("ak")
	float field4699;
	@ObfuscatedName("ap")
	float field4700;
	@ObfuscatedName("an")
	float field4696;
	@ObfuscatedName("aj")
	float field4702;

	static {
		field4701 = new class423[0]; // L: 4
		class4.method17(100); // L: 9
		new class423();
	} // L: 14

	class423() {
		this.method7762(); // L: 44
	} // L: 45

	public class423(float var1, float var2, float var3) {
		this.method7761(var1, var2, var3); // L: 48
	} // L: 49

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "550213906"
	)
	public void method7764() {
		synchronized(field4701) { // L: 38
			if (field4698 < field4697 - 1) { // L: 39
				field4701[++field4698 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1347724555"
	)
	void method7760(float var1, float var2, float var3, float var4) {
		this.field4699 = var1; // L: 52
		this.field4700 = var2; // L: 53
		this.field4696 = var3; // L: 54
		this.field4702 = var4; // L: 55
	} // L: 56

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1693998273"
	)
	public void method7734(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4)); // L: 59
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 60
		this.field4699 = var1 * var5; // L: 61
		this.field4700 = var2 * var5; // L: 62
		this.field4696 = var3 * var5; // L: 63
		this.field4702 = var6; // L: 64
	} // L: 65

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1799840039"
	)
	void method7761(float var1, float var2, float var3) {
		this.method7734(0.0F, 1.0F, 0.0F, var1); // L: 68
		class423 var4 = class81.method2270(); // L: 69
		var4.method7734(1.0F, 0.0F, 0.0F, var2); // L: 70
		this.method7737(var4); // L: 71
		var4.method7734(0.0F, 0.0F, 1.0F, var3); // L: 72
		this.method7737(var4); // L: 73
		var4.method7764(); // L: 74
	} // L: 75

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	final void method7762() {
		this.field4696 = 0.0F; // L: 78
		this.field4700 = 0.0F; // L: 79
		this.field4699 = 0.0F; // L: 80
		this.field4702 = 1.0F; // L: 81
	} // L: 82

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)V",
		garbageValue = "6"
	)
	public final void method7737(class423 var1) {
		this.method7760(var1.field4702 * this.field4699 + this.field4702 * var1.field4699 + var1.field4700 * this.field4696 - var1.field4696 * this.field4700, var1.field4696 * this.field4699 + var1.field4702 * this.field4700 - var1.field4699 * this.field4696 + this.field4702 * var1.field4700, var1.field4699 * this.field4700 + this.field4696 * var1.field4702 - var1.field4700 * this.field4699 + var1.field4696 * this.field4702, this.field4702 * var1.field4702 - var1.field4699 * this.field4699 - var1.field4700 * this.field4700 - var1.field4696 * this.field4696); // L: 85
	}

	public int hashCode() {
		boolean var1 = true; // L: 99
		float var2 = 1.0F;
		var2 = 31.0F * var2 + this.field4699;
		var2 = this.field4700 + 31.0F * var2;
		var2 = this.field4696 + var2 * 31.0F;
		var2 = this.field4702 + 31.0F * var2;
		return (int)var2;
	}

	public String toString() {
		return this.field4699 + "," + this.field4700 + "," + this.field4696 + "," + this.field4702; // L: 110
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class423)) {
			return false;
		} else {
			class423 var2 = (class423)var1;
			return this.field4699 == var2.field4699 && this.field4700 == var2.field4700 && var2.field4696 == this.field4696 && var2.field4702 == this.field4702;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-900588011"
	)
	public static int method7732(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 86
			boolean var3 = false; // L: 87
			boolean var4 = false; // L: 88
			int var5 = 0; // L: 89
			int var6 = var0.length(); // L: 90

			for (int var7 = 0; var7 < var6; ++var7) { // L: 91
				char var8 = var0.charAt(var7); // L: 92
				if (var7 == 0) { // L: 93
					if (var8 == '-') { // L: 94
						var3 = true; // L: 95
						continue;
					}

					if (var8 == '+') { // L: 98
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 100
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 101
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 102
						throw new NumberFormatException(); // L: 103
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 104
					throw new NumberFormatException();
				}

				if (var3) { // L: 105
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 106
				if (var9 / var1 != var5) { // L: 107
					throw new NumberFormatException();
				}

				var5 = var9; // L: 108
				var4 = true; // L: 109
			}

			if (!var4) { // L: 111
				throw new NumberFormatException();
			} else {
				return var5; // L: 112
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
