import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class188 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("aq")
	public static final void method3688(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-2"
	)
	static int method3687(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Lii;IIIZI)V",
		garbageValue = "-210290307"
	)
	static void method3684(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) { // L: 4098
			if (var0.field2295 != null && var1 < var0.field2295.length && var0.field2295[var1] != null) { // L: 4099
				int var5 = var0.field2295[var1].field2148 & 31; // L: 4100
				if ((var5 <= 0 || class105.clientPreferences.method2618() != 0) && (var5 != 0 || class105.clientPreferences.method2588() != 0)) { // L: 4101
					class452.method8354(var0.field2295[var1], var2, var3, var4); // L: 4102
				}
			}
		}
	} // L: 4103
}
