import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 776464435
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 7
	} // L: 9

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 32
	}

	@ObfuscatedName("eh")
	void vmethod5778(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		Model var12 = this.getModel(); // L: 12
		if (var12 != null) { // L: 13
			this.height = var12.height; // L: 14
			int var13 = Rasterizer3D.Rasterizer3D_sine[var2]; // L: 15
			int var14 = Rasterizer3D.Rasterizer3D_cosine[var2]; // L: 16
			int var15 = Rasterizer3D.Rasterizer3D_sine[var3]; // L: 17
			int var16 = Rasterizer3D.Rasterizer3D_cosine[var3]; // L: 18
			var12.draw(var1, var13, var14, var15, var16, var4 - var7, var5 - var8, var6 - var9, var10); // L: 19
		}

	} // L: 21

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ILqg;IIIJ)V"
	)
	void vmethod5787(int var1, class424 var2, int var3, int var4, int var5, long var6) {
		Model var8 = this.getModel(); // L: 24
		if (var8 != null) { // L: 25
			this.height = var8.height; // L: 26
			var8.vmethod5787(var1, var2, var3, var4, var5, var6); // L: 27
		}

	} // L: 29

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "90"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 170
		int var4 = 0; // L: 171

		for (int var5 = 0; var5 < var2; ++var5) { // L: 172
			int var6 = var0[var5 + var1] & 255; // L: 173
			if (var6 != 0) { // L: 174
				if (var6 >= 128 && var6 < 160) { // L: 175
					char var7 = class413.cp1252AsciiExtension[var6 - 128]; // L: 176
					if (var7 == 0) { // L: 177
						var7 = '?';
					}

					var6 = var7; // L: 178
				}

				var3[var4++] = (char)var6; // L: 180
			}
		}

		return new String(var3, 0, var4); // L: 182
	}
}
