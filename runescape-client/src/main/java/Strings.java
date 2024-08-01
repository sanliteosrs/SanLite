import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fh")
	public static String field4247;
	@ObfuscatedName("kx")
	public static String field4293;
	@ObfuscatedName("ka")
	public static String field4161;
	@ObfuscatedName("kt")
	public static String field4384;

	static {
		field4247 = "Please visit the support page for assistance."; // L: 138
		field4293 = ""; // L: 288
		field4161 = "Page has opened in the browser."; // L: 289
		field4384 = ""; // L: 290
	} // L: 334

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-11094289"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class172.World_request == null) { // L: 32
				class172.World_request = ByteArrayPool.urlRequester.request(new URL(Archive.field4493));
			} else if (class172.World_request.isDone()) { // L: 34
				byte[] var0 = class172.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				class357.World_worlds = new World[World.World_count]; // L: 39

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 40 48
					var3 = class357.World_worlds[var2] = new World(); // L: 41
					var3.id = var1.readUnsignedShort(); // L: 42
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated(); // L: 44
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 45
					var3.location = var1.readUnsignedByte(); // L: 46
					var3.population = var1.readShort(); // L: 47
				}

				AbstractWorldMapData.sortWorlds(class357.World_worlds, 0, class357.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				class172.World_request = null; // L: 51
				return true; // L: 52
			}
		} catch (Exception var4) { // L: 56
			var4.printStackTrace(); // L: 57
			class172.World_request = null; // L: 58
		}

		return false; // L: 60
	}
}
