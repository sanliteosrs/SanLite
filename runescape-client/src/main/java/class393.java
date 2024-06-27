import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public class class393 {
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldv;",
		garbageValue = "-78627862"
	)
	static final InterfaceParent method7338(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 13045
		var3.group = var1; // L: 13046
		var3.type = var2; // L: 13047
		Client.interfaceParents.put(var3, (long)var0); // L: 13048
		class137.method3176(var1); // L: 13049
		Widget var4 = ModeWhere.field4649.method6519(var0); // L: 13050
		TriBool.invalidateWidget(var4); // L: 13051
		if (Client.meslayerContinueWidget != null) { // L: 13052
			TriBool.invalidateWidget(Client.meslayerContinueWidget); // L: 13053
			Client.meslayerContinueWidget = null; // L: 13054
		}

		class238.revalidateWidgetScroll(ModeWhere.field4649.field3740[var0 >> 16], var4, false); // L: 13056
		class7.method56(var1); // L: 13057
		if (Client.rootInterface != -1) { // L: 13058
			BuddyRankComparator.method3037(Client.rootInterface, 1);
		}

		return var3; // L: 13059
	}
}
