import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("an")
	static final int[] field2107;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 1654877821
	)
	static int field2102;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -403599393
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -957731269
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -989672663
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2107 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) {
			field2107[var1] = var0 - 1;
			var0 += var0; // L: 21
		}

	} // L: 23

	VarbitComposition() {
	} // L: 25

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "109"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "-2018721401"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.baseVar = var1.readUnsignedShort(); // L: 47
			this.startBit = var1.readUnsignedByte(); // L: 48
			this.endBit = var1.readUnsignedByte(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1718879795"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		ArchiveDiskAction.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1702551401"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 4149
			class137.method3187(0, 0); // L: 4150
		} else if (var0 != -1 && !class237.method4469(var0) && class105.clientPreferences.method2654() != 0) { // L: 4152
			ArrayList var1 = new ArrayList(); // L: 4153
			var1.add(new class342(class199.field2100, var0, 0, class105.clientPreferences.method2654(), false)); // L: 4154
			if (Client.playingJingle) { // L: 4155
				class157.method3343(var1, 0, 100, 100, 0); // L: 4156
			} else {
				FontName.method9220(var1, 0, 100, 100, 0, false); // L: 4159
			}
		}

	} // L: 4162
}
