import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ak")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -191524709
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("aw")
	static String field2355;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}
}
