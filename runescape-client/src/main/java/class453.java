import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public class class453 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 331279603
	)
	public static int field4867;

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIB)Ldy;",
		garbageValue = "-15"
	)
	static final class96 method8355(class101 var0, int var1, int var2, int var3, int var4) {
		for (class96 var5 = (class96)var0.field1335.last(); var5 != null; var5 = (class96)var0.field1335.previous()) { // L: 9065 9066 9070
			if (var5.field1174 == var1 && var2 == var5.field1178 && var3 == var5.field1177 && var4 == var5.field1172) { // L: 9067
				return var5; // L: 9068
			}
		}

		return null; // L: 9072
	}
}
