import java.io.File;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("x")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lqa;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "-2126803038"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("h")
	public static String method3467(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 31
		int var2 = Calendar.Calendar_calendar.get(7); // L: 32
		int var3 = Calendar.Calendar_calendar.get(5); // L: 33
		int var4 = Calendar.Calendar_calendar.get(2); // L: 34
		int var5 = Calendar.Calendar_calendar.get(1); // L: 35
		int var6 = Calendar.Calendar_calendar.get(11); // L: 36
		int var7 = Calendar.Calendar_calendar.get(12); // L: 37
		int var8 = Calendar.Calendar_calendar.get(13); // L: 38
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 39
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-14"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 132
		int var2 = 0; // L: 133

		for (int var3 = 0; var3 < var1; ++var3) { // L: 134
			var2 = (var2 << 5) - var2 + class299.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 135
	}
}
