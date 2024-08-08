import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-246153511"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1597628099"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldg;",
		garbageValue = "-59"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class210.method4100(var1, var0); // L: 38
		Script var4 = class141.method3202(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			int var5 = (-3 - var2 << 8) + var0; // L: 45
			var4 = class141.method3202(var5, var0); // L: 48
			if (var4 != null) { // L: 49
				return var4; // L: 50
			} else {
				var3 = class166.method3473(var0); // L: 52
				var4 = class141.method3202(var3, var0); // L: 53
				return var4 != null ? var4 : null; // L: 54 57
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "907811651"
	)
	public static int method4344(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}
}
