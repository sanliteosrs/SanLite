import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public enum class238 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2512((byte)-1, 0.0F),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2520((byte)0, 0.5F),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2519((byte)1, 1.0F),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2509((byte)2, 2.0F),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2510((byte)3, 1.5F),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2511((byte)4, 2.5F),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2516((byte)5, 3.0F),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2513((byte)6, 3.5F),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	field2507((byte)7, 4.0F);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Ljb;"
	)
	static class238[] field2508 = class193.method3759();
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("ai")
	public final byte field2515;
	@ObfuscatedName("ae")
	public final float field2517;

	static {
		class562.method10144(); // L: 21
	} // L: 22

	class238(byte var3, float var4) {
		this.field2515 = var3; // L: 29
		this.field2517 = var4; // L: 30
	} // L: 31

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2515; // L: 35
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lde;ZI)V",
		garbageValue = "2064026790"
	)
	static final void method4510(class101 var0, boolean var1) {
		for (int var2 = 0; var2 < var0.field1329; ++var2) { // L: 5370
			class103 var3 = var0.field1315[var0.field1330[var2]]; // L: 5371
			if (var3 != null && var3.isVisible() && var3.field1347.field2017 == var1 && var3.field1347.transformIsVisible()) { // L: 5372
				int var4 = var3.x >> 7; // L: 5373
				int var5 = var3.field1191 >> 7; // L: 5374
				if (var4 >= 0 && var4 < var0.field1332 && var5 >= 0 && var5 < var0.field1320) { // L: 5375
					if (var3.field1194 == 1 && (var3.x & 127) == 64 && (var3.field1191 & 127) == 64) { // L: 5376
						if (var0.field1338[var4][var5] == Client.viewportDrawCount) { // L: 5377
							continue;
						}

						var0.field1338[var4][var5] = Client.viewportDrawCount; // L: 5378
					}

					long var6 = FileSystem.method4223(0, 0, 1, !var3.field1347.field2021, var0.field1330[var2], var0.field1328); // L: 5380
					var3.field1195 = Client.cycle; // L: 5381
					var0.field1316.method5425(var0.field1318, var3.x, var3.field1191, class169.method3519(var0, var3.field1194 * 64 - 64 + var3.x, var3.field1194 * 64 - 64 + var3.field1191, var0.field1318), var3.field1194 * 64 - 64 + 60, var3, var3.field1192, var6, var3.field1193); // L: 5382
				}
			}
		}

	} // L: 5386

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1905415221"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 11727

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 11728
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 11729
		}

		if (var1.length() > 9) { // L: 11731
			return " " + class191.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class191.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class191.colorStartTag(16776960) + var1 + "</col>"; // L: 11732 11733
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "([Lnx;Lnx;ZI)V",
		garbageValue = "-1942820533"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 11757
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 11758
		ArchiveLoader.resizeInterface(var0, var1.id, var3, var4, var2); // L: 11759
		if (var1.children != null) { // L: 11760
			ArchiveLoader.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 11761
		if (var5 != null) { // L: 11762
			ClanChannel.method3488(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) { // L: 11763
		}

	} // L: 11764
}
