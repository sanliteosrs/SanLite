import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class175 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static EvictingDualNodeHashTable field1862;

	static {
		field1862 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "450419066"
	)
	public static void method3558(String[] var0, short[] var1) {
		NPCComposition.sortItemsByName(var0, var1, 0, var0.length - 1); // L: 9
	} // L: 10

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lqg;",
		garbageValue = "-1682414796"
	)
	public static class424 method3560() {
		synchronized(class424.field4704) { // L: 27
			if (class424.field4706 == 0) { // L: 28
				return new class424();
			} else {
				class424.field4704[--class424.field4706].method7789(); // L: 30
				return class424.field4704[class424.field4706]; // L: 31
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1434182904"
	)
	public static String method3562(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : ""; // L: 201 202
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "979184681"
	)
	static void method3559(int var0) {
		class188.tempMenuAction = new MenuAction(); // L: 12755
		class188.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12756
		class188.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12757
		class188.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12758
		class188.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12759
		class188.tempMenuAction.field904 = Client.field763[var0]; // L: 12760
		class188.tempMenuAction.field898 = Client.menuActions[var0]; // L: 12761
		class188.tempMenuAction.field905 = Client.menuTargets[var0]; // L: 12762
		class188.tempMenuAction.field903 = Client.field653[var0]; // L: 12763
	} // L: 12764

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Z",
		garbageValue = "1740313426"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 13364
	}
}
