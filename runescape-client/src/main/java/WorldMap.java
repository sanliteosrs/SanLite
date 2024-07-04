import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("az")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ac")
	@Export("details")
	HashMap details;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	WorldMapArea field5164;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 726023317
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1037523117
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2111299207
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 339182027
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ar")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bt")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 412214793
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1217478649
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -633270133
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1496461701
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2061982451
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1472614383
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bg")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bs")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -988749081
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1660914053
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -433758033
	)
	int field5183;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -440386403
	)
	int field5204;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 360088355
	)
	int field5207;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 701079749
	)
	int field5186;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		longValue = -6945096001606229017L
	)
	long field5158;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 357929951
	)
	int field5188;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1135341129
	)
	int field5189;
	@ObfuscatedName("bn")
	boolean field5165;
	@ObfuscatedName("bd")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bz")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bk")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("br")
	HashSet field5194;
	@ObfuscatedName("bf")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1950756805
	)
	int field5156;
	@ObfuscatedName("cl")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cm")
	List field5198;
	@ObfuscatedName("cg")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cu")
	HashSet field5205;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ce")
	public boolean field5187;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1973390925
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1054887437
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1900110705
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1027213083
	)
	int field5190;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11; // L: 48
		fontNameVerdana13 = FontName.FontName_verdana13; // L: 49
		fontNameVerdana15 = FontName.FontName_verdana15; // L: 50
	}

	public WorldMap() {
		this.worldMapTargetX = -1; // L: 62
		this.worldMapTargetY = -1; // L: 63
		this.worldMapDisplayWidth = -1; // L: 66
		this.worldMapDisplayHeight = -1; // L: 67
		this.worldMapDisplayX = -1; // L: 68
		this.worldMapDisplayY = -1; // L: 69
		this.maxFlashCount = 3; // L: 70
		this.cyclesPerFlash = 50; // L: 71
		this.perpetualFlash = false; // L: 72
		this.flashingElements = null; // L: 73
		this.flashCount = -1; // L: 74
		this.flashCycle = -1; // L: 75
		this.field5183 = -1; // L: 76
		this.field5204 = -1; // L: 77
		this.field5207 = -1; // L: 78
		this.field5186 = -1; // L: 79
		this.field5165 = true; // L: 83
		this.enabledElements = new HashSet(); // L: 86
		this.enabledCategories = new HashSet(); // L: 87
		this.enabledElementIds = new HashSet(); // L: 88
		this.field5194 = new HashSet(); // L: 89
		this.elementsDisabled = false; // L: 90
		this.field5156 = 0; // L: 91
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 93
		this.field5205 = new HashSet(); // L: 96
		this.mouseCoord = null; // L: 97
		this.field5187 = false; // L: 98
		this.minCachedTileX = -1; // L: 101
		this.minCachedTileY = -1; // L: 102
		this.field5190 = -1; // L: 103
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Lok;Lqh;Ljava/util/HashMap;[Lvv;I)V",
		garbageValue = "25208224"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6; // L: 107
		this.WorldMap_archive = var1; // L: 108
		this.WorldMap_geographyArchive = var2; // L: 109
		this.WorldMap_groundArchive = var3; // L: 110
		this.font = var4; // L: 111
		this.fonts = new HashMap(); // L: 112
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11)); // L: 113
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13)); // L: 114
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15)); // L: 115
		this.cacheLoader = new WorldMapArchiveLoader(var1); // L: 116
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2740.name); // L: 117
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 118
		int var9 = var8 == null ? 0 : var8.length; // L: 119
		this.details = new HashMap(var9); // L: 120

		for (int var10 = 0; var10 < var9; ++var10) { // L: 121
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10])); // L: 122
			WorldMapArea var12 = new WorldMapArea(); // L: 123
			var12.read(var11, var8[var10]); // L: 124
			this.details.put(var12.getInternalName(), var12); // L: 125
			if (var12.getIsMain()) { // L: 126
				this.mainMapArea = var12; // L: 127
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 130
		this.field5164 = null; // L: 131
	} // L: 132

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2023309818"
	)
	public void method9001() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 136
	} // L: 138

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "1742502103"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 141
			this.smoothZoom(); // L: 144
			this.scrollToTarget(); // L: 145
			if (var3) { // L: 146
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 149
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 150
				List var10 = this.worldMapManager.method4850(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 151
				HashSet var11 = new HashSet(); // L: 152

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); Projectile.runScriptEvent(var14)) { // L: 153 166
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 154
					var11.add(var13); // L: 156
					var14 = new ScriptEvent(); // L: 157
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 158
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 159
					if (this.field5205.contains(var13)) { // L: 160
						var14.setType(17); // L: 161
					} else {
						var14.setType(15); // L: 164
					}
				}

				var12 = this.field5205.iterator(); // L: 169

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 170
					if (!var11.contains(var13)) { // L: 172
						var14 = new ScriptEvent(); // L: 173
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 174
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 175
						var14.setType(16); // L: 176
						Projectile.runScriptEvent(var14); // L: 177
					}
				}

				this.field5205 = var11; // L: 181
			}
		}
	} // L: 142 147 182

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-820997134"
	)
	public void method9003(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = WorldMapData_1.method4861(); // L: 185
			this.method9199(var1, var2, var4, var5); // L: 186
			if (!this.hasTarget() && (var4 || var3)) { // L: 188
				boolean var7 = Client.clickedWidget != null; // L: 191
				if (!var7) { // L: 193
					if (var4) { // L: 194
						this.field5207 = var1; // L: 195
						this.field5186 = var2; // L: 196
						this.field5183 = this.centerTileX; // L: 197
						this.field5204 = this.centerTileY; // L: 198
					}

					if (this.field5183 != -1) { // L: 200
						int var8 = var1 - this.field5207; // L: 201
						int var9 = var2 - this.field5186; // L: 202
						this.setWorldMapPosition(this.field5183 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field5204, false); // L: 203
					}
					break label41;
				}
			}

			this.method9008(); // L: 208
		}

		if (var4) { // L: 210
			this.field5158 = var5; // L: 211
			this.field5188 = var1; // L: 212
			this.field5189 = var2; // L: 213
		}

	} // L: 215

	@ObfuscatedName("ap")
	void method9199(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 218
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 219
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 220
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 221
			if (this.mouseCoord != null && var3) { // L: 222
				class231 var8 = Client.field728; // L: 225
				if (BuddyRankComparator.method3038() && var8.method4384(82) && var8.method4384(81)) { // L: 228
					class103.method2713(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 229
				} else {
					boolean var10 = true; // L: 232
					if (this.field5165) { // L: 233
						int var11 = var1 - this.field5188; // L: 234
						int var12 = var2 - this.field5189; // L: 235
						if (var4 - this.field5158 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) { // L: 236
							var10 = false; // L: 237
						}
					}

					if (var10) { // L: 240
						PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.field3339, Client.packetWriter.isaacCipher); // L: 241
						var13.packetBuffer.writeIntME(this.mouseCoord.packed()); // L: 242
						Client.packetWriter.addNode(var13); // L: 243
						this.field5158 = 0L; // L: 244
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 249
		}

	} // L: 250

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1602520512"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class485.field5030 != null) { // L: 253
			this.zoom = this.zoomTarget; // L: 254
		} else {
			if (this.zoom < this.zoomTarget) { // L: 257
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F); // L: 258
			}

			if (this.zoom > this.zoomTarget) { // L: 260
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 261
			}

		}
	} // L: 255 263

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-989672663"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 266
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 269
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 270
			if (var1 != 0) { // L: 271
				var1 /= Math.min(8, Math.abs(var1)); // L: 272
			}

			if (var2 != 0) { // L: 274
				var2 /= Math.min(8, Math.abs(var2)); // L: 275
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 277
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) { // L: 278
				this.worldMapTargetX = -1; // L: 279
				this.worldMapTargetY = -1; // L: 280
			}

		}
	} // L: 267 282

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "158446480"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 285
		this.centerTileY = var2; // L: 286
		WorldMapData_1.method4861(); // L: 287
		if (var3) {
			this.method9008(); // L: 288
		}

	} // L: 289

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2090657076"
	)
	final void method9008() {
		this.field5186 = -1; // L: 292
		this.field5207 = -1; // L: 293
		this.field5204 = -1; // L: 294
		this.field5183 = -1; // L: 295
	} // L: 296

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2125982961"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 299
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ljm;",
		garbageValue = "802672685"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 303

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 311
			}

			var5 = (WorldMapArea)var4.next(); // L: 304
		} while(!var5.containsCoord(var1, var2, var3)); // L: 306

		return var5; // L: 307
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-10679878"
	)
	public void method9011(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 315
		if (var5 == null) { // L: 316
			if (!var4) { // L: 317
				return; // L: 320
			}

			var5 = this.mainMapArea; // L: 318
		}

		boolean var6 = false; // L: 322
		if (var5 != this.field5164 || var4) { // L: 323
			this.field5164 = var5; // L: 324
			this.setCurrentMapArea(var5); // L: 325
			var6 = true; // L: 326
		}

		if (var6 || var4) { // L: 328
			this.jump(var1, var2, var3); // L: 329
		}

	} // L: 331

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2006513716"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 334
		if (var2 != null) { // L: 335
			this.setCurrentMapArea(var2); // L: 336
		}

	} // L: 338

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1961719461"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 341 342 344
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljm;",
		garbageValue = "-471501961"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 348
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljm;B)V",
		garbageValue = "1"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 352
			this.initializeWorldMapManager(var1); // L: 355
			this.jump(-1, -1, -1); // L: 356
		}
	} // L: 353 357

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "-157720836"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 360
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 361
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName()); // L: 362
	} // L: 363

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljm;Lnl;Lnl;ZI)V",
		garbageValue = "-1761963154"
	)
	public void method9017(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 366
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 369
				this.initializeWorldMapManager(var1); // L: 370
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 372
				this.jump(var2.plane, var2.x, var2.y); // L: 376
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 373
			}

		}
	} // L: 367 378

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1947983663"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 381
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 384
			if (var4 == null) { // L: 385
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 386
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 388
			this.worldMapTargetX = -1; // L: 389
			this.worldMapTargetY = -1; // L: 390
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 391
			this.zoomTarget = this.zoom; // L: 392
			this.field5198 = null; // L: 393
			this.iconIterator = null; // L: 394
			this.worldMapManager.clearIcons(); // L: 395
		}
	} // L: 382 396

	@ObfuscatedName("aa")
	public void method9116(int var1, int var2, int var3, int var4, int var5, double var6) {
		int[] var8 = new int[4]; // L: 399
		Rasterizer2D.Rasterizer2D_getClipArray(var8); // L: 400
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 401
		int var9 = this.cacheLoader.getPercentLoaded(); // L: 402
		if (var9 < 100) { // L: 403
			this.drawLoading(var1, var2, var3, var4, var9); // L: 404
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 407
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 408
				if (!this.worldMapManager.isLoaded()) { // L: 409
					return; // L: 410
				}
			}

			int var11 = this.worldMapManager.method4819(); // L: 414
			double var12 = (double)(var11 >> 16 & 255) / 256.0D; // L: 416
			double var14 = (double)(var11 >> 8 & 255) / 256.0D; // L: 417
			double var16 = (double)(var11 & 255) / 256.0D; // L: 418
			var12 = Math.pow(var12, var6); // L: 419
			var14 = Math.pow(var14, var6); // L: 420
			var16 = Math.pow(var16, var6); // L: 421
			int var18 = (int)(var12 * 256.0D); // L: 422
			int var19 = (int)(var14 * 256.0D); // L: 423
			int var20 = (int)(var16 * 256.0D); // L: 424
			int var10 = var20 + (var19 << 8) + (var18 << 16) + -16777216; // L: 425
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10); // L: 428
			if (this.flashingElements != null) { // L: 429
				++this.flashCycle; // L: 430
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 431
					this.flashCycle = 0; // L: 432
					++this.flashCount; // L: 433
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 435
					this.flashingElements = null; // L: 436
				}
			}

			int var13 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 439
			int var22 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 440
			this.worldMapManager.drawTiles(this.centerTileX - var13 / 2, this.centerTileY - var22 / 2, var13 / 2 + this.centerTileX, var22 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 441
			if (!this.elementsDisabled) { // L: 442
				boolean var15 = false; // L: 443
				if (var5 - this.field5156 > 100) { // L: 444
					this.field5156 = var5; // L: 445
					var15 = true; // L: 446
				}

				this.worldMapManager.drawElements(this.centerTileX - var13 / 2, this.centerTileY - var22 / 2, var13 / 2 + this.centerTileX, var22 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5194, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var15); // L: 448
			}

			this.method9013(var1, var2, var3, var4, var13, var22); // L: 450
			if (BuddyRankComparator.method3038() && this.field5187 && this.mouseCoord != null) { // L: 451
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var13; // L: 452
			this.worldMapDisplayHeight = var22; // L: 453
			this.worldMapDisplayX = var1; // L: 454
			this.worldMapDisplayY = var2; // L: 455
			Rasterizer2D.Rasterizer2D_setClipArray(var8); // L: 456
		}
	} // L: 405 457

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2053924176"
	)
	public void method9066() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 461
	} // L: 463

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "67"
	)
	boolean method9083(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 466
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 467
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 468
				return true;
			} else if (this.field5190 != Client.field799) { // L: 469
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 470
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 471
			} else {
				return true; // L: 472
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1586308991"
	)
	void method9013(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class485.field5030 != null) { // L: 476
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 477
			int var8 = var3 + 512; // L: 478
			int var9 = var4 + 512; // L: 479
			float var10 = 1.0F; // L: 480
			var8 = (int)((float)var8 / var10); // L: 481
			var9 = (int)((float)var9 / var10); // L: 482
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 483
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 484
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 485
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 486
			if (this.method9083(var8, var9, var13, var14, var3, var4)) { // L: 487
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 488
					Arrays.fill(this.sprite.pixels, 0); // L: 491
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 489
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 492
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 493
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 494
				class485.field5030.method7388(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 495
				this.field5190 = Client.field799; // L: 496
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 497
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 498
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 500
			if (var10 == 1.0F) { // L: 501
				this.sprite.method10019(var13, var14, 192); // L: 502
			} else {
				this.sprite.method10021(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192); // L: 505
			}
		}

	} // L: 508

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-880473091"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 511
			if (!this.worldMapManager.isLoaded()) { // L: 514
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 515
				if (!this.worldMapManager.isLoaded()) { // L: 516
					return; // L: 517
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 520
		}
	} // L: 512 521

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1783409593"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 524
	} // L: 525

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "276046287"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 528
		int var7 = var3 / 2 + var1; // L: 529
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 530
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 531
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 532
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 533
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 534
	} // L: 535

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-86"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 538
			return 1.0F;
		} else if (var1 == 37) { // L: 539
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 540
		} else if (var1 == 75) { // L: 541
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 542 543
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "711194994"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) { // L: 547
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) { // L: 548
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) { // L: 549
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 550
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200; // L: 551 552
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 556
	} // L: 557

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1744584606"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 560
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "-983074910"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 564

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 572
			}

			var3 = (WorldMapArea)var2.next(); // L: 565
		} while(var3.getId() != var1); // L: 567

		return var3; // L: 568
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1948790576"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 576
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 579
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 580
		}
	} // L: 577 581

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "274550039"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 584
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 587
			this.worldMapTargetX = -1; // L: 588
			this.worldMapTargetY = -1; // L: 589
		}
	} // L: 585 590

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-959147283"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 593
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 596
			if (var4 != null) { // L: 597
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 598
			}

		}
	} // L: 594 600

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1886433491"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 603
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 606
			if (var4 != null) { // L: 607
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 608
			}

		}
	} // L: 604 610

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-102"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 613 614 616
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1046281474"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 620 621 623
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lnl;",
		garbageValue = "-1713768897"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 627 628 630
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1301306069"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 634
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1793509256"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 638
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 642
			this.maxFlashCount = var1; // L: 643
		}

	} // L: 645

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 648
	} // L: 649

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2146996983"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 652
			this.cyclesPerFlash = var1; // L: 653
		}

	} // L: 655

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "434939029"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 658
	} // L: 659

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1196389082"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 662
	} // L: 663

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "120"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 666
		this.flashingElements.add(var1); // L: 667
		this.flashCount = 0; // L: 668
		this.flashCycle = 0; // L: 669
	} // L: 670

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-17"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 673
		this.flashCount = 0; // L: 674
		this.flashCycle = 0; // L: 675

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 676
			if (class165.WorldMapElement_get(var2) != null && class165.WorldMapElement_get(var2).category == var1) { // L: 677 680
				this.flashingElements.add(class165.WorldMapElement_get(var2).objectId); // L: 681
			}
		}

	} // L: 684

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1073593463"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 687
	} // L: 688

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "67"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 691
	} // L: 692

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "227181200"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 695
			this.enabledElements.add(var1); // L: 696
		} else {
			this.enabledElements.remove(var1); // L: 699
		}

		this.method9128(); // L: 701
	} // L: 702

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "59"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 705
			this.enabledCategories.add(var1); // L: 706
		} else {
			this.enabledCategories.remove(var1); // L: 709
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 711
			if (class165.WorldMapElement_get(var3) != null && class165.WorldMapElement_get(var3).category == var1) { // L: 712 715
				int var4 = class165.WorldMapElement_get(var3).objectId; // L: 716
				if (!var2) { // L: 717
					this.enabledElementIds.add(var4); // L: 718
				} else {
					this.enabledElementIds.remove(var4); // L: 721
				}
			}
		}

		this.method9128(); // L: 725
	} // L: 726

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-850052283"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 729
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1410298200"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 733
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 737
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-621020219"
	)
	void method9128() {
		this.field5194.clear(); // L: 741
		this.field5194.addAll(this.enabledElements); // L: 742
		this.field5194.addAll(this.enabledElementIds); // L: 743
	} // L: 744

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "91"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 747
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 750
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 751
			List var9 = this.worldMapManager.method4850(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 752
			if (!var9.isEmpty()) { // L: 753
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 756
						return; // L: 772
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 757
					WorldMapElement var12 = class165.WorldMapElement_get(var11.getElement()); // L: 759
					var13 = false; // L: 760

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 761
						if (var12.menuActions[var14] != null) { // L: 762
							UrlRequester.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 763
							var13 = true; // L: 764
						}
					}
				} while(!var13); // L: 767

			}
		}
	} // L: 748 754 768

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILnl;B)Lnl;",
		garbageValue = "82"
	)
	public Coord method9056(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 775
			return null; // L: 776
		} else if (!this.worldMapManager.isLoaded()) { // L: 778
			return null; // L: 779
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 781
			return null; // L: 782
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 784
			List var4 = (List)var3.get(var1); // L: 785
			if (var4 != null && !var4.isEmpty()) { // L: 786
				AbstractWorldMapIcon var5 = null; // L: 789
				int var6 = -1; // L: 790
				Iterator var7 = var4.iterator(); // L: 791

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 806
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 792
						int var9 = var8.coord2.x - var2.x; // L: 794
						int var10 = var8.coord2.y - var2.y; // L: 795
						var11 = var10 * var10 + var9 * var9; // L: 796
						if (var11 == 0) { // L: 797
							return var8.coord2; // L: 798
						}
					} while(var11 >= var6 && var5 != null); // L: 800

					var5 = var8; // L: 801
					var6 = var11; // L: 802
				}
			} else {
				return null; // L: 787
			}
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IILnl;Lnl;B)V",
		garbageValue = "21"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 810
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 811
		var5.setArgs(new Object[]{var6}); // L: 812
		switch(var1) { // L: 813
		case 1008:
			var5.setType(10); // L: 816
			break;
		case 1009:
			var5.setType(11); // L: 831
			break; // L: 832
		case 1010:
			var5.setType(12); // L: 836
			break;
		case 1011:
			var5.setType(13); // L: 821
			break; // L: 822
		case 1012:
			var5.setType(14); // L: 826
		}

		Projectile.runScriptEvent(var5); // L: 840
	} // L: 841

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Lkh;",
		garbageValue = "504963130"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 844
			return null; // L: 845
		} else if (!this.worldMapManager.isLoaded()) { // L: 847
			return null; // L: 848
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 850
			this.field5198 = new LinkedList(); // L: 851
			Iterator var2 = var1.values().iterator(); // L: 852

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 853
				this.field5198.addAll(var3); // L: 855
			}

			this.iconIterator = this.field5198.iterator(); // L: 858
			return this.iconNext(); // L: 859
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Lkh;",
		garbageValue = "-2125905855"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 863
			return null; // L: 864
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 866
					return null; // L: 872
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 867
			} while(var1.getElement() == -1); // L: 868

			return var1; // L: 869
		}
	}
}
