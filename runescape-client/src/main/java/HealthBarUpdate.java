import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("as")
	public static String field1270;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2015000729
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1494090523
	)
	@Export("health")
	int health;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -71484607
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1704684721
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "7"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-324766040"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false; // L: 43
		boolean var3 = false; // L: 44
		int var4 = 0; // L: 45
		int var5 = var0.length(); // L: 46
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3; // L: 76
				break;
			}

			label84: {
				char var7 = var0.charAt(var6); // L: 48
				if (var6 == 0) { // L: 49
					if (var7 == '-') {
						var2 = true;
						break label84;
					}

					if (var7 == '+') {
						break label84;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') { // L: 56
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') { // L: 57
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') { // L: 58
						var1 = false; // L: 60
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) { // L: 63
					var1 = false; // L: 64
					break; // L: 65
				}

				if (var2) { // L: 67
					var9 = -var9;
				}

				int var8 = var9 + var4 * 10; // L: 68
				if (var4 != var8 / 10) { // L: 69
					var1 = false; // L: 70
					break; // L: 71
				}

				var4 = var8; // L: 73
				var3 = true; // L: 74
			}

			++var6; // L: 47
		}

		return var1; // L: 78
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1040978209"
	)
	static void method2528() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-591091524"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1038
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1039
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1040
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1041
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1042
		return var3; // L: 1043
	}
}
