import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ad")
	String field1011;
	@ObfuscatedName("ag")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("ak")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ap")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1746577925
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1287810367
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 63573081
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1982128447
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lth;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)[Lth;",
		garbageValue = "978095262"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 128
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	static final void method2265(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12891
		if (var0 != class105.clientPreferences.method2654()) { // L: 12892
			if (class105.clientPreferences.method2654() == 0 && class243.method4563()) { // L: 12893
				Archive var1 = class199.field2100; // L: 12894
				if (!class330.field3585.isEmpty()) { // L: 12896
					ArrayList var2 = new ArrayList(); // L: 12899
					Iterator var3 = class330.field3585.iterator(); // L: 12900

					while (var3.hasNext()) {
						class342 var4 = (class342)var3.next(); // L: 12901
						var4.field3710 = false; // L: 12903
						var4.field3709 = false; // L: 12904
						var4.field3715 = false; // L: 12905
						var4.field3712 = false; // L: 12906
						var4.field3708 = var1; // L: 12907
						var4.field3706 = var0; // L: 12908
						var4.field3704 = 0.0F; // L: 12909
						var2.add(var4); // L: 12910
					}

					FontName.method9220(var2, class330.field3580, class330.field3589, class330.field3590, class330.field3586, false); // L: 12913
				}

				Client.playingJingle = false; // L: 12915
			} else if (var0 == 0) { // L: 12917
				class137.method3187(0, 0); // L: 12918
				Client.playingJingle = false; // L: 12919
			} else {
				class20.method300(var0); // L: 12921
			}

			class105.clientPreferences.method2590(var0); // L: 12922
		}

	} // L: 12924
}
