import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 942374317
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -338655735
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Loz;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1670769241"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method7148(var1) || this.archive.method7138(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Lok;I)V",
		garbageValue = "346869431"
	)
	public static void method2357(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		AbstractSocket.SequenceDefinition_archive = var0; // L: 51
		class177.SequenceDefinition_animationsArchive = var1; // L: 52
		WorldMapLabelSize.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "788851463"
	)
	static void method2359() {
		if ((Client.worldProperties & class542.field5342.rsOrdinal()) != 0) { // L: 1002
			Login.Login_response0 = ""; // L: 1003
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 1004
			Login.Login_response2 = "Your normal account will not be affected."; // L: 1005
			Login.Login_response3 = ""; // L: 1006
			class163.method3447(1); // L: 1007
			UserComparator4.method2995(); // L: 1008
		} else if ((Client.worldProperties & class542.field5319.rsOrdinal()) != 0) { // L: 1010
			if ((Client.worldProperties & class542.field5337.rsOrdinal()) != 0) { // L: 1011
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 1012
				Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 1013
				Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 1014
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 1017
				Login.Login_response2 = "Players can attack each other"; // L: 1018
				Login.Login_response3 = "almost everywhere."; // L: 1019
			}

			Login.Login_response0 = "Warning!"; // L: 1021
			class163.method3447(1); // L: 1022
			UserComparator4.method2995(); // L: 1023
		} else if ((Client.worldProperties & class542.field5337.rsOrdinal()) != 0) { // L: 1025
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 1026
			Login.Login_response2 = "The Protect Item prayer will"; // L: 1027
			Login.Login_response3 = "not work on this world."; // L: 1028
			Login.Login_response0 = "Warning!"; // L: 1029
			class163.method3447(1); // L: 1030
			UserComparator4.method2995(); // L: 1031
		} else {
			class155.Login_promptCredentials(false); // L: 1034
		}

	} // L: 1036

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "([Lnx;IIIZI)V",
		garbageValue = "-1695472477"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 11772
			Widget var6 = var0[var5]; // L: 11773
			if (var6 != null && var6.parentId == var1) { // L: 11774 11775
				AbstractWorldMapData.alignWidgetSize(var6, var2, var3, var4); // L: 11776
				SecureRandomCallable.alignWidgetPosition(var6, var2, var3); // L: 11777
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 11778
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 11779
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 11780
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 11781
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 11782
					class238.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 11784
}
