import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class341 implements Comparator {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field3699;

	class341() {
	} // L: 699

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lme;I)I",
		garbageValue = "-62561141"
	)
	int method6435(class334 var1, class334 var2) {
		return var1.field3647 - var2.field3647; // L: 702
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 710
	}

	public int compare(Object var1, Object var2) {
		return this.method6435((class334)var1, (class334)var2); // L: 706
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-975761526"
	)
	static int method6427(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5160
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = AttackOption.method2786() ? 1 : 0; // L: 5161
			return 1; // L: 5162
		} else {
			return 2; // L: 5164
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lde;IZI)V",
		garbageValue = "528326967"
	)
	static void method6437(class101 var0, int var1, boolean var2) {
		Player var3 = var0.field1326[var1]; // L: 5340
		if (var3 != null && var3.isVisible() && !var3.field1138) { // L: 5341
			var3.field1125 = false; // L: 5342
			if ((Client.isLowDetail && var0.field1319.field1404 > 50 || var0.field1319.field1404 > 200) && var2 && var3.field1196 == var3.field1198) { // L: 5343 5344
				var3.field1125 = true;
			}

			int var4 = var3.x >> 7; // L: 5346
			int var5 = var3.field1191 >> 7; // L: 5347
			if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) { // L: 5348
				long var6 = FileSystem.method4223(0, 0, 0, false, var3.field1140, var0.field1328); // L: 5349
				if (var3.field1131 != null && Client.cycle >= var3.field1119 && Client.cycle < var3.field1118) { // L: 5350
					var3.field1125 = false; // L: 5351
					var3.field1123 = class169.method3519(var0, var3.x, var3.field1191, var0.field1318); // L: 5352
					var3.field1195 = Client.cycle; // L: 5353
					var0.field1316.method5661(var0.field1318, var3.x, var3.field1191, var3.field1123, 60, var3, var3.field1192, var6, var3.field1132, var3.field1126, var3.field1134, var3.field1139); // L: 5354
				} else {
					if ((var3.x & 127) == 64 && (var3.field1191 & 127) == 64) { // L: 5357
						if (var0.field1338[var4][var5] == Client.viewportDrawCount) { // L: 5358
							return;
						}

						var0.field1338[var4][var5] = Client.viewportDrawCount; // L: 5359
					}

					var3.field1123 = class169.method3519(var0, var3.x, var3.field1191, var0.field1318); // L: 5361
					var3.field1195 = Client.cycle; // L: 5362
					var0.field1316.method5425(var0.field1318, var3.x, var3.field1191, var3.field1123, 60, var3, var3.field1192, var6, var3.field1193); // L: 5363
				}
			}
		}

	} // L: 5367
}
