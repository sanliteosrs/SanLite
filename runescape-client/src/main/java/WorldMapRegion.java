import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1928952533
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1160426561
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("ab")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1507079313
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1369509233
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("au")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ah")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("az")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 38
		this.regionY = var2; // L: 39
		this.worldMapData1List = new LinkedList(); // L: 40
		this.icon0List = new LinkedList(); // L: 41
		this.iconMap = new HashMap(); // L: 42
		this.backgroundColor = var3 | -16777216; // L: 43
		this.fonts = var4; // L: 44
	} // L: 45

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2110616313"
	)
	void method4702(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 49
		int var6 = this.regionY; // L: 50
		int var7 = this.pixelsPerTile; // L: 51
		DemotingHashTable var8 = WorldMapRegion_cachedSprites; // L: 53
		long var9 = (long)(var7 << 16 | var5 << 8 | var6); // L: 56
		SpritePixels var4 = (SpritePixels)var8.get(var9); // L: 58
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) { // L: 62
				var4.drawAt(var1, var2); // L: 63
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 66
			}

		}
	} // L: 61 68

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljn;Ljava/util/List;S)V",
		garbageValue = "-9826"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 71
		this.worldMapData_0 = var1; // L: 72
		this.addAllToIconList(var2); // L: 73
	} // L: 74

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;B)V",
		garbageValue = "-13"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 77
		Iterator var3 = var1.iterator(); // L: 78

		while (var3.hasNext()) { // L: 85
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 79
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) { // L: 81
				this.worldMapData1List.add(var4); // L: 82
			}
		}

		this.addAllToIconList(var2); // L: 86
	} // L: 87

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIILjk;I)V",
		garbageValue = "-964396700"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) { // L: 90
			label73:
			for (int var7 = var2; var7 < var2 + var4; ++var7) { // L: 91
				for (int var8 = 0; var8 < var5.planes; ++var8) { // L: 92
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) { // L: 94
						WorldMapDecoration[] var10 = var9; // L: 98

						for (int var11 = 0; var11 < var10.length; ++var11) { // L: 99
							ObjectComposition var13;
							boolean var14;
							label64: {
								WorldMapDecoration var12 = var10[var11]; // L: 100
								var13 = class10.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;

									for (int var16 = 0; var16 < var15.length; ++var16) { // L: 108
										int var17 = var15[var16]; // L: 109
										ObjectComposition var18 = class10.getObjectDefinition(var17);
										if (var18.mapIconId != -1) { // L: 112
											var14 = true; // L: 113
											break label64;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 120
									var14 = true;
									break label64; // L: 122
								}

								var14 = false; // L: 124
							}

							if (var14) { // L: 126
								this.getIcon(var13, var8, var6, var7, var5); // L: 129
								continue label73;
							}
						}
					}
				}
			}
		}

	} // L: 137

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lho;IIILjk;I)V",
		garbageValue = "-199507930"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 140
		Coord var7 = null;
		if (this.worldMapData_0 != null) { // L: 142
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64); // L: 143
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = class165.WorldMapElement_get(var1.mapIconId); // L: 154
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = class165.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field1896) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator();

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next();
			if (var2 instanceof WorldMapIcon_1) { // L: 167
				((WorldMapIcon_1)var2).init();
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-385532001"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 176
			if (class165.WorldMapElement_get(var3.element).field1896 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 181
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4731(var3.element)); // L: 182
				this.icon0List.add(var4); // L: 183
			}
		}

	} // L: 187

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "505032615"
	)
	void method4709() {
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator();

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next();
				var2.reset();
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)Z",
		garbageValue = "1"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear();
		if (this.worldMapData_0 != null) { // L: 205
			this.worldMapData_0.loadGeography(var1); // L: 206
			if (this.worldMapData_0.isFullyLoaded()) { // L: 207
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 208
				return true; // L: 209
			} else {
				return false; // L: 211
			}
		} else {
			boolean var2 = true; // L: 214

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 215 219
				var4 = (WorldMapData_1)var3.next(); // L: 216
				var4.loadGeography(var1); // L: 218
			}

			if (var2) { // L: 222
				var3 = this.worldMapData1List.iterator(); // L: 223

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 224
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 226
				}
			}

			return var2; // L: 230
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILkp;[Lvv;Lok;Lok;I)V",
		garbageValue = "-1888482257"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 235
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 236
			int var7 = this.regionX; // L: 240
			int var8 = this.regionY; // L: 241
			DemotingHashTable var9 = WorldMapRegion_cachedSprites; // L: 243
			long var10 = (long)(var1 << 16 | var7 << 8 | var8); // L: 246
			SpritePixels var6 = (SpritePixels)var9.get(var10); // L: 248
			if (var6 == null) { // L: 250
				boolean var21 = true; // L: 253
				var21 &= this.loadGeography(var4); // L: 254
				int var11;
				if (this.worldMapData_0 != null) { // L: 257
					var11 = this.worldMapData_0.groupId; // L: 258
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 261
				}

				var21 &= var5.tryLoadGroup(var11); // L: 263
				if (var21) { // L: 264
					byte[] var22 = var5.takeFileFlat(var11); // L: 265
					WorldMapSprite var12 = class132.method3118(var22); // L: 266
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 267
					var13.setRaster(); // L: 268
					if (this.worldMapData_0 != null) { // L: 269
						this.method4714(var2, var3, var12); // L: 270
					} else {
						this.method4715(var2, var3, var12); // L: 273
					}

					int var14 = this.regionX; // L: 275
					int var15 = this.regionY; // L: 276
					int var16 = this.pixelsPerTile; // L: 277
					DemotingHashTable var17 = WorldMapRegion_cachedSprites; // L: 279
					long var19 = (long)(var16 << 16 | var14 << 8 | var15); // L: 283
					var17.put(var13, var19, var13.pixels.length * 4); // L: 285
					this.method4709(); // L: 287
				}
			}
		}
	} // L: 237 251 288

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-265612327"
	)
	void method4712(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 291
			var4 = new HashSet(); // L: 292
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 294
		this.drawMapLinks(var1, var2, var4, var3); // L: 295
	} // L: 296

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "0"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 299

		while (var4.hasNext()) { // L: 309
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 300
			if (var5.hasValidElement()) { // L: 302
				int var6 = var5.getElement(); // L: 303
				if (var1.contains(var6)) { // L: 304
					WorldMapElement var7 = class165.WorldMapElement_get(var6); // L: 305
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 306
				}
			}
		}

		this.method4723(var1, var2, var3); // L: 310
	} // L: 311

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lkp;[Lvv;Ljg;I)V",
		garbageValue = "-1381075989"
	)
	void method4714(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 314
			for (var5 = 0; var5 < 64; ++var5) { // L: 315
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 316
				this.method4718(var4, var5, this.worldMapData_0, var1); // L: 317
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 320
			for (var5 = 0; var5 < 64; ++var5) { // L: 321
				this.method4716(var4, var5, this.worldMapData_0, var1, var2); // L: 322
			}
		}

	} // L: 325

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkp;[Lvv;Ljg;I)V",
		garbageValue = "396253425"
	)
	void method4715(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 328

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 329

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 331
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 332
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 333
					this.method4718(var6, var7, var5, var1); // L: 334
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 339

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 340

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 342
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 343
					this.method4716(var6, var7, var5, var1, var2); // L: 344
				}
			}
		}

	} // L: 349

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILjk;Lkp;[Lvv;I)V",
		garbageValue = "1285169443"
	)
	void method4716(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4806(var1, var2, var3); // L: 352
		this.method4791(var1, var2, var3, var5); // L: 353
	} // L: 354

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjk;Lkp;Ljg;B)V",
		garbageValue = "-98"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 357
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 358
		if (var6 == -1 && var7 == -1) { // L: 359
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 360
		}

		int var8 = 16711935; // L: 362
		if (var7 != -1) { // L: 363
			var8 = class323.method6112(var7, this.backgroundColor); // L: 364
		}

		if (var7 > -1 && var3.field2677[0][var1][var2] == 0) { // L: 366
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 367
		} else {
			int var9 = this.method4719(var1, var2, var3, var5); // L: 370
			if (var7 == -1) { // L: 371
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 372
			} else {
				var4.method5109(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2677[0][var1][var2], var3.field2678[0][var1][var2]); // L: 375
			}
		}
	} // L: 368 373 376

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILjk;Lkp;B)V",
		garbageValue = "-23"
	)
	void method4718(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 379
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 380
			if (var6 > -1) { // L: 381
				int var7 = class323.method6112(var6, this.backgroundColor); // L: 382
				if (var3.field2677[var5][var1][var2] == 0) { // L: 383
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 384
				} else {
					var4.method5109(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2677[var5][var1][var2], var3.field2678[var5][var1][var2]); // L: 387
				}
			}
		}

	} // L: 391

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILjk;Ljg;I)I",
		garbageValue = "-12664889"
	)
	int method4719(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 394 395 397
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILjk;[Lvv;B)V",
		garbageValue = "25"
	)
	void method4791(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 401
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 402
			if (var6 != null && var6.length != 0) { // L: 403
				WorldMapDecoration[] var7 = var6; // L: 407

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 408
					WorldMapDecoration var9 = var7[var8]; // L: 409
					if (class324.method6117(var9.decoration) || class91.method2395(var9.decoration)) { // L: 411
						ObjectComposition var10 = class10.getObjectDefinition(var9.objectDefinitionId); // L: 412
						if (var10.mapSceneId != -1) { // L: 413
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 414
								var4[var10.mapSceneId].method9987(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 418
							} else {
								var4[var10.mapSceneId].method9987(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 415
							}
						}
					}
				}
			}
		}

	} // L: 426

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IILjk;I)V",
		garbageValue = "571617227"
	)
	void method4806(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 429
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 430
			if (var5 != null && var5.length != 0) { // L: 431
				WorldMapDecoration[] var6 = var5; // L: 435

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 436
					WorldMapDecoration var8 = var6[var7]; // L: 437
					if (class334.method6371(var8.decoration)) { // L: 439
						ObjectComposition var9 = class10.getObjectDefinition(var8.objectDefinitionId); // L: 440
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 441
						if (var8.decoration == WorldMapDecorationType.field4011.id) { // L: 442
							this.method4735(var1, var2, var8.rotation, var10); // L: 443
						}

						if (var8.decoration == WorldMapDecorationType.field4027.id) { // L: 445
							this.method4735(var1, var2, var8.rotation, -3355444); // L: 446
							this.method4735(var1, var2, var8.rotation + 1, var10); // L: 447
						}

						if (var8.decoration == WorldMapDecorationType.field4032.id) { // L: 449
							if (var8.rotation == 0) { // L: 450
								Rasterizer2D.method9884(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.method9884(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 451
							}

							if (var8.rotation == 2) { // L: 452
								Rasterizer2D.method9884(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 453
								Rasterizer2D.method9884(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field4013.id) { // L: 455
							int var11 = var8.rotation % 2; // L: 456
							int var12;
							if (var11 == 0) { // L: 457
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 458
									Rasterizer2D.method9884(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 459
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 463
									Rasterizer2D.method9884(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 464
								}
							}
						}
					}
				}
			}
		}

	} // L: 473

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-37"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 476
		float var6 = var5 / 2.0F; // L: 477
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 478

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 479
			Coord var9 = (Coord)var8.getKey(); // L: 481
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6); // L: 482
			int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6); // L: 483
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 484
			if (var12 != null && var12.hasValidElement()) { // L: 485
				var12.screenX = var10; // L: 486
				var12.screenY = var11; // L: 487
				WorldMapElement var13 = class165.WorldMapElement_get(var12.getElement()); // L: 488
				if (!var3.contains(var13.getObjectId())) { // L: 489
					this.method4726(var12, var10, var11, var5); // L: 490
				}
			}
		}

	} // L: 495

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-30"
	)
	void method4723(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 498

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 499
			if (var5.hasValidElement()) { // L: 501
				WorldMapElement var6 = class165.WorldMapElement_get(var5.getElement()); // L: 502
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 503
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 504
				}
			}
		}

	} // L: 508

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgg;IIIIB)V",
		garbageValue = "78"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 511
		if (var6 != null) { // L: 512
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 515
			if (var4 % var5 < var5 / 2) { // L: 516
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 517
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 518
			}

		}
	} // L: 513 520

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lkh;IIFI)V",
		garbageValue = "1471422076"
	)
	void method4726(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class165.WorldMapElement_get(var1.getElement()); // L: 523
		this.method4805(var5, var2, var3); // L: 524
		this.method4727(var1, var5, var2, var3, var4); // L: 525
	} // L: 526

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lgg;IIB)V",
		garbageValue = "8"
	)
	void method4805(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 529
		if (var4 != null) { // L: 530
			int var5 = this.method4729(var4, var1.horizontalAlignment); // L: 531
			int var6 = this.method4730(var4, var1.verticalAlignment); // L: 532
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 533
		}

	} // L: 535

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkh;Lgg;IIFI)V",
		garbageValue = "1930598695"
	)
	void method4727(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 538
		if (var6 != null) { // L: 539
			if (var6.size.method4566(var5)) { // L: 542
				Font var7 = (Font)this.fonts.get(var6.size); // L: 545
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1891, 0, 1, 0, var7.ascent / 2); // L: 546
			}
		}
	} // L: 540 543 547

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-1"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 550
		Iterator var6 = this.icon0List.iterator(); // L: 551

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 552
			if (var7.hasValidElement()) { // L: 554
				int var8 = var7.coord2.x % 64; // L: 555
				int var9 = var7.coord2.y % 64; // L: 556
				var7.screenX = (int)((float)var1 + (float)var8 * var5); // L: 557
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2); // L: 558
				if (!var3.contains(var7.getElement())) { // L: 559
					this.method4726(var7, var7.screenX, var7.screenY, var5); // L: 562
				}
			}
		}

	} // L: 565

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lvg;Lhp;B)I",
		garbageValue = "-3"
	)
	int method4729(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 568
		case 0:
			return -var1.subWidth / 2; // L: 575
		case 2:
			return 0; // L: 571
		default:
			return -var1.subWidth; // L: 579
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lvg;Lhx;I)I",
		garbageValue = "2089915000"
	)
	int method4730(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 585
		case 0:
			return 0; // L: 588
		case 2:
			return -var1.subHeight / 2; // L: 596
		default:
			return -var1.subHeight; // L: 592
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkm;",
		garbageValue = "-105"
	)
	WorldMapLabel method4731(int var1) {
		WorldMapElement var2 = class165.WorldMapElement_get(var1); // L: 602
		return this.createMapLabel(var2); // L: 603
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)Lkm;",
		garbageValue = "-831793730"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 607
			int var3 = var1.textSize; // L: 611
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_small}; // L: 616
			WorldMapLabelSize[] var5 = var4; // L: 618
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 629
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 620
				if (var3 == var7.field2545) { // L: 622
					var2 = var7; // L: 623
					break;
				}

				++var6; // L: 619
			}

			if (var2 == null) { // L: 632
				return null; // L: 633
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 635
				if (var14 == null) { // L: 636
					return null; // L: 637
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 639
					String[] var15 = new String[var6]; // L: 640
					var14.breakLines(var1.name, (int[])null, var15); // L: 641
					int var8 = var15.length * var14.ascent / 2; // L: 642
					int var9 = 0; // L: 643
					String[] var10 = var15; // L: 645

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 646
						String var12 = var10[var11]; // L: 647
						int var13 = var14.stringWidth(var12); // L: 649
						if (var13 > var9) { // L: 650
							var9 = var13; // L: 651
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 656
				}
			}
		} else {
			return null; // L: 608
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "-120"
	)
	List method4733(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 660
		if (var4 >= var1 && var5 >= var2) { // L: 661
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 662
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) { // L: 663
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 664
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 666
						var6.add(var8); // L: 667
					}
				}

				var7 = this.icon0List.iterator(); // L: 671

				while (var7.hasNext()) { // L: 678
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 672
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 674
						var6.add(var8); // L: 675
					}
				}

				return var6; // L: 679
			} else {
				return var6; // L: 670
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "-4"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 683
		var1.addAll(this.icon0List); // L: 684
		var1.addAll(this.iconMap.values()); // L: 685
		return var1; // L: 686
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-17308"
	)
	void method4735(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 690
		if (var3 == 0) { // L: 691
			Rasterizer2D.method9938(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 692
			Rasterizer2D.method9884(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 693
			Rasterizer2D.method9938(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.method9884(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 694
		}

	} // L: 695

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvg;",
		garbageValue = "-1576092202"
	)
	static SpritePixels[] method4809() {
		SpritePixels[] var0 = new SpritePixels[class561.SpriteBuffer_spriteCount]; // L: 189

		for (int var1 = 0; var1 < class561.SpriteBuffer_spriteCount; ++var1) { // L: 190
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 191
			var2.width = class561.SpriteBuffer_spriteWidth; // L: 192
			var2.height = class561.SpriteBuffer_spriteHeight; // L: 193
			var2.xOffset = UserComparator4.SpriteBuffer_xOffsets[var1]; // L: 194
			var2.yOffset = class145.SpriteBuffer_yOffsets[var1]; // L: 195
			var2.subWidth = class561.SpriteBuffer_spriteWidths[var1]; // L: 196
			var2.subHeight = class315.SpriteBuffer_spriteHeights[var1]; // L: 197
			int var3 = var2.subHeight * var2.subWidth; // L: 198
			byte[] var4 = class561.SpriteBuffer_pixels[var1]; // L: 199
			var2.pixels = new int[var3]; // L: 200

			for (int var5 = 0; var5 < var3; ++var5) { // L: 201
				var2.pixels[var5] = class561.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		Calendar.method7029(); // L: 203
		return var0; // L: 204
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llv;IIIIIIIII)Z",
		garbageValue = "-1920305559"
	)
	static final boolean method4785(Model var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		boolean var9 = ViewportMouse.ViewportMouse_isInViewport; // L: 93
		if (!var9) { // L: 95
			return false;
		} else {
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var28;
			if (!ViewportMouse.ViewportMouse_false0) { // L: 97
				byte var14 = 50; // L: 102
				var15 = class280.method5369(); // L: 103
				var16 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method5251()) * var14 / Rasterizer3D.method5257(); // L: 104
				var17 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method5246()) * var14 / Rasterizer3D.method5257(); // L: 105
				var18 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method5251()) * var15 / Rasterizer3D.method5257(); // L: 106
				var19 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method5246()) * var15 / Rasterizer3D.method5257(); // L: 107
				int var21 = var6 * var17 + var5 * var14 >> 16; // L: 111
				var28 = AbstractWorldMapIcon.method5075(var17, var14, var6, var5); // L: 114
				int var22 = var6 * var19 + var15 * var5 >> 16; // L: 118
				var15 = AbstractWorldMapIcon.method5075(var19, var15, var6, var5); // L: 121
				int var23 = var16 * var8 - var7 * var28 >> 16; // L: 125
				int var24 = var7 * var16 + var28 * var8 >> 16; // L: 130
				int var25 = var18 * var8 - var7 * var15 >> 16; // L: 136
				int var26 = var8 * var15 + var7 * var18 >> 16; // L: 141
				ViewportMouse.field3161 = (var23 + var25) / 2; // L: 145
				class140.field1643 = (var22 + var21) / 2; // L: 146
				ViewportMouse.field3163 = (var26 + var24) / 2; // L: 147
				class351.field3753 = (var25 - var23) / 2; // L: 148
				class448.field4826 = (var22 - var21) / 2; // L: 149
				class128.field1517 = (var26 - var24) / 2; // L: 150
				MusicPatchPcmStream.field3672 = Math.abs(class351.field3753); // L: 151
				WorldMapRectangle.field2687 = Math.abs(class448.field4826); // L: 152
				class488.field5035 = Math.abs(class128.field1517); // L: 153
			}

			class284 var27 = (class284)var0.field3117.get(var1); // L: 155
			int var11 = var2 + var27.field3012; // L: 156
			int var12 = var3 + var27.field3008; // L: 157
			int var13 = var4 + var27.field3007; // L: 158
			var28 = var27.field3010; // L: 159
			var15 = var27.field3011; // L: 160
			var16 = var27.field3009; // L: 161
			var17 = ViewportMouse.field3161 - var11; // L: 162
			var18 = class140.field1643 - var12; // L: 163
			var19 = ViewportMouse.field3163 - var13; // L: 164
			if (Math.abs(var17) > var28 + MusicPatchPcmStream.field3672) { // L: 165
				return false; // L: 166
			} else if (Math.abs(var18) > var15 + WorldMapRectangle.field2687) { // L: 168
				return false; // L: 169
			} else if (Math.abs(var19) > var16 + class488.field5035) { // L: 171
				return false; // L: 172
			} else if (Math.abs(var19 * class448.field4826 - var18 * class128.field1517) > var16 * WorldMapRectangle.field2687 + var15 * class488.field5035) { // L: 174
				return false; // L: 175
			} else if (Math.abs(var17 * class128.field1517 - var19 * class351.field3753) > var16 * MusicPatchPcmStream.field3672 + var28 * class488.field5035) { // L: 177
				return false; // L: 178
			} else {
				return Math.abs(var18 * class351.field3753 - var17 * class448.field4826) <= var28 * WorldMapRectangle.field2687 + var15 * MusicPatchPcmStream.field3672; // L: 180
			}
		}
	}
}
