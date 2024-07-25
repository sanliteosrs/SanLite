import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("ap")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -854808799
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("av")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0; // L: 13
		this.loaded = false; // L: 14
		this.archive = var1; // L: 17
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-524005317"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 21
			if (var1 != this.cacheName) { // L: 24
				this.cacheName = var1; // L: 27
				this.percentLoaded = 0; // L: 28
				this.loaded = false; // L: 29
				this.load(); // L: 30
			}
		}
	} // L: 22 25 31

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) { // L: 34
			this.percentLoaded = 100; // L: 35
			this.loaded = true; // L: 36
		} else {
			if (this.percentLoaded < 33) { // L: 39
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2738.name, this.cacheName)) { // L: 40
					return this.percentLoaded; // L: 41
				}

				this.percentLoaded = 33; // L: 43
			}

			if (this.percentLoaded == 33) { // L: 45
				if (this.archive.isValidFileName(WorldMapCacheName.field2739.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2739.name, this.cacheName)) { // L: 46 47
					return this.percentLoaded; // L: 48
				}

				this.percentLoaded = 66; // L: 51
			}

			if (this.percentLoaded == 66) { // L: 53
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2741.name)) { // L: 54
					return this.percentLoaded; // L: 55
				}

				this.percentLoaded = 100; // L: 57
				this.loaded = true; // L: 58
			}
		}

		return this.percentLoaded; // L: 61
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1504653592"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded; // L: 65
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1155216193"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded; // L: 69
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;Ljava/lang/String;I)[Lvv;",
		garbageValue = "1107623391"
	)
	public static IndexedSprite[] method8998(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 87
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 88
			int var4 = var0.getFileId(var3, var2); // L: 89
			IndexedSprite[] var5;
			if (!class146.method3260(var0, var3, var4)) { // L: 92
				var5 = null; // L: 93
			} else {
				IndexedSprite[] var7 = new IndexedSprite[class561.SpriteBuffer_spriteCount]; // L: 98

				for (int var8 = 0; var8 < class561.SpriteBuffer_spriteCount; ++var8) { // L: 99
					IndexedSprite var9 = var7[var8] = new IndexedSprite(); // L: 100
					var9.width = class561.SpriteBuffer_spriteWidth; // L: 101
					var9.height = class561.SpriteBuffer_spriteHeight; // L: 102
					var9.xOffset = UserComparator4.SpriteBuffer_xOffsets[var8]; // L: 103
					var9.yOffset = class145.SpriteBuffer_yOffsets[var8]; // L: 104
					var9.subWidth = class561.SpriteBuffer_spriteWidths[var8]; // L: 105
					var9.subHeight = class315.SpriteBuffer_spriteHeights[var8] * -897865968; // L: 106
					var9.palette = class561.SpriteBuffer_spritePalette; // L: 107
					var9.pixels = class561.SpriteBuffer_pixels[var8]; // L: 108
				}

				Calendar.method7029(); // L: 110
				var5 = var7; // L: 113
			}

			return var5; // L: 115
		}
	}
}
