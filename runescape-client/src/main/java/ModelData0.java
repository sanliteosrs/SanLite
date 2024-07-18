import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	} // L: 4

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lcw;Lcw;IZI)I",
		garbageValue = "-254289583"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 212
			int var4 = var0.population; // L: 213
			int var5 = var1.population; // L: 214
			if (!var3) { // L: 215
				if (var4 == -1) { // L: 216
					var4 = 2001;
				}

				if (var5 == -1) { // L: 217
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 219
		} else if (var2 == 2) { // L: 221
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 222
			if (var0.activity.equals("-")) { // L: 223
				if (var1.activity.equals("-")) { // L: 224
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 225
				}
			} else if (var1.activity.equals("-")) { // L: 227
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 228
			}
		} else if (var2 == 4) { // L: 230
			return var0.method1875() ? (var1.method1875() ? 0 : 1) : (var1.method1875() ? -1 : 0);
		} else if (var2 == 5) { // L: 231
			return var0.method1847() ? (var1.method1847() ? 0 : 1) : (var1.method1847() ? -1 : 0);
		} else if (var2 == 6) { // L: 232
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 233
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 234
		}
	}
}
