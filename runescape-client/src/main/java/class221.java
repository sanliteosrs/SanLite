import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class221 extends class227 {
	@ObfuscatedName("aq")
	String field2376;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	final class224 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lif;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class221(class224 var1, String var2, String var3) {
		super(var1, var2); // L: 314
		this.this$0 = var1; // L: 313
		this.field2376 = var3; // L: 315
	} // L: 316

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int vmethod4325() {
		return 1; // L: 319
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-22"
	)
	public String vmethod4323() {
		return this.field2376; // L: 324
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "575229037"
	)
	static final int method4242(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 9
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705352891"
	)
	static final boolean method4235(int var0) {
		return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51; // L: 159
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-40"
	)
	static int method4240(String var0) {
		if (var0.equals("centre")) { // L: 239
			return 1; // L: 240
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 242 243 245
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Loz;",
		garbageValue = "1722600163"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2123
		if (JagexCache.JagexCache_dat2File != null) { // L: 2124
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class163.JagexCache_idxFiles[var0], 1000000); // L: 2125
		}

		return new Archive(var5, MouseHandler.field224, class233.field2486, var0, var1, var2, var3, var4, false); // L: 2127
	}
}
