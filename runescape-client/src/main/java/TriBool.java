import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "-1273536850"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field720) { // L: 12767
			Client.field721[var0.rootIndex] = true; // L: 12768
		}

	} // L: 12770
}
