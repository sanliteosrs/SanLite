import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lkz;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2028628447
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1041474121
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("ap")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1163704053
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2; // L: 17
		this.capacity = var3; // L: 18
		this.remaining = this.capacity; // L: 19
		this.brightness = var4; // L: 20
		this.textureSize = var6; // L: 21
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		if (var7 != null) { // L: 23
			int var8 = var7.length; // L: 24
			this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 25

			for (int var9 = 0; var9 < var8; ++var9) { // L: 26
				Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 27
				this.textures[var7[var9]] = new Texture(var10); // L: 28
			}
		} else {
			this.textures = new Texture[0]; // L: 32
		}

	} // L: 34

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1112949135"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		if (this.textures.length == 0) { // L: 37
			return 100;
		} else {
			int var1 = 0; // L: 38
			int var2 = 0; // L: 39
			Texture[] var3 = this.textures; // L: 41

			for (int var4 = 0; var4 < var3.length; ++var4) { // L: 42
				Texture var5 = var3[var4]; // L: 43
				if (var5 != null && var5.fileIds != null) { // L: 45
					var1 += var5.fileIds.length; // L: 46
					int[] var6 = var5.fileIds; // L: 48

					for (int var7 = 0; var7 < var6.length; ++var7) { // L: 49
						int var8 = var6[var7]; // L: 50
						if (this.archive.method7184(var8)) { // L: 52
							++var2; // L: 53
						}
					}
				}
			}

			if (var1 == 0) { // L: 61
				return 0;
			} else {
				return var2 * 100 / var1; // L: 62
			}
		}
	}

	@ObfuscatedName("ad")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 66
		this.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "1"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 71
		if (var2 != null) { // L: 72
			if (var2.pixels != null) { // L: 73
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining;
				}

				this.deque.addLast(var2); // L: 85
				var2.isLoaded = true; // L: 86
				return var2.pixels; // L: 87
			}
		}

		return null; // L: 90
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2019200691"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 94 95
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-372101735"
	)
	public boolean vmethod6017(int var1) {
		return this.textures[var1].field2828; // L: 99
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-615727832"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 103
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 107
			if (this.textures[var1] != null) { // L: 108
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 110
		this.remaining = this.capacity; // L: 111
	} // L: 112

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1591756578"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 115
			Texture var3 = this.textures[var2]; // L: 116
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 117
				var3.animate(var1); // L: 118
				var3.isLoaded = false; // L: 119
			}
		}

	} // L: 122

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIII)V",
		garbageValue = "-1275756427"
	)
	static final void method5720(class101 var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.field1327; // L: 74
		int var6 = var0.field1332 - 1; // L: 75
		int var7 = var0.field1320 - 1; // L: 76

		for (int var8 = var2; var8 <= var2 + var4; ++var8) { // L: 77
			for (int var9 = var1; var9 <= var3 + var1; ++var9) { // L: 78
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) { // L: 79
					WorldMapScaleHandler.field2749[0][var9][var8] = 127; // L: 80
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8]; // L: 81
					}

					if (var3 + var1 == var9 && var9 < var6) { // L: 82
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) { // L: 83
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var8 == var2 + var4 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1]; // L: 84
					}
				}
			}
		}

	} // L: 88

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lcw;",
		garbageValue = "3"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 238
		return World.getNextWorldListWorld(); // L: 239
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1299623605"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 223
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 224
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 225
		}
	}
}
