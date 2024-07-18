import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public class class31 {
	@ObfuscatedName("aq")
	public static Applet field154;
	@ObfuscatedName("ad")
	public static String field150;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	static {
		field154 = null; // L: 10
		field150 = ""; // L: 11
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-458350569"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1932459491"
	)
	static void method462() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12773
			int var1 = var0.group; // L: 12774
			if (ModeWhere.field4649.method6514(var1)) { // L: 12775
				boolean var2 = true; // L: 12776
				Widget[] var3 = ModeWhere.field4649.field3740[var1]; // L: 12777

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12778
					if (var3[var4] != null) { // L: 12779
						var2 = var3[var4].isIf3; // L: 12780
						break;
					}
				}

				if (!var2) { // L: 12784
					var4 = (int)var0.key; // L: 12785
					Widget var5 = ModeWhere.field4649.method6519(var4); // L: 12786
					if (var5 != null) { // L: 12787
						TriBool.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12791
}
