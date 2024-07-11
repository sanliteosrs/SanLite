import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field2123;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field2126;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field2127;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 740567617
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -886926797
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1750332237
	)
	public int field2131;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1801737031
	)
	int field2132;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -290743515
	)
	int field2122;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -510782169
	)
	int field2134;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2141591761
	)
	int field2135;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1456549433
	)
	public int field2128;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 590461861
	)
	public int field2137;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1345009173
	)
	public int field2138;
	@ObfuscatedName("aw")
	String field2139;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 506293749
	)
	public int field2140;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1372659175
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("am")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1141721607
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1111852629
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		field2126 = new EvictingDualNodeHashTable(64); // L: 19
		field2127 = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2131 = 70; // L: 28
		this.field2132 = -1; // L: 29
		this.field2122 = -1; // L: 30
		this.field2134 = -1; // L: 31
		this.field2135 = -1; // L: 32
		this.field2128 = 0; // L: 33
		this.field2137 = 0; // L: 34
		this.field2138 = -1; // L: 35
		this.field2139 = ""; // L: 36
		this.field2140 = -1; // L: 37
		this.maleModel1 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "48"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 63
			if (var2 == 0) { // L: 64
				return; // L: 67
			}

			this.decodeNext(var1, var2); // L: 65
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "113"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method9602();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field2132 = var1.method9602();
		} else if (var2 == 4) { // L: 73
			this.field2134 = var1.method9602();
		} else if (var2 == 5) { // L: 74
			this.field2122 = var1.method9602();
		} else if (var2 == 6) { // L: 75
			this.field2135 = var1.method9602();
		} else if (var2 == 7) { // L: 76
			this.field2128 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field2139 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field2131 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field2137 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field2138 = 0;
		} else if (var2 == 12) { // L: 81
			this.field2140 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.maleModel1 = var1.readShort();
		} else if (var2 == 14) {
			this.field2138 = var1.readUnsignedShort(); // L: 83
		} else if (var2 == 17 || var2 == 18) { // L: 84
			this.transformVarbit = var1.readUnsignedShort(); // L: 85
			if (this.transformVarbit == 65535) { // L: 86
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 87
			if (this.transformVarp == 65535) { // L: 88
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 89
			if (var2 == 18) { // L: 90
				var3 = var1.readUnsignedShort(); // L: 91
				if (var3 == 65535) { // L: 92
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 94
			this.transforms = new int[var4 + 2]; // L: 95

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 96
				this.transforms[var5] = var1.readUnsignedShort(); // L: 97
				if (this.transforms[var5] == 65535) { // L: 98
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 100
		}

	} // L: 103

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lha;",
		garbageValue = "73"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = class162.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? WorldMapSectionType.method4961(var2) : null; // L: 112 113
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "9"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2139; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + class201.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "1822100421"
	)
	public SpritePixels method3879() {
		if (this.field2132 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2126.get((long)this.field2132); // L: 128
			if (var1 != null) {
				return var1; // L: 129
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field2123, this.field2132, 0); // L: 130
				if (var1 != null) {
					field2126.put(var1, (long)this.field2132); // L: 131
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "1402217327"
	)
	public SpritePixels method3880() {
		if (this.field2122 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2126.get((long)this.field2122); // L: 138
			if (var1 != null) {
				return var1; // L: 139
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field2123, this.field2122, 0); // L: 140
				if (var1 != null) {
					field2126.put(var1, (long)this.field2122); // L: 141
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "-1874709059"
	)
	public SpritePixels method3881() {
		if (this.field2134 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2126.get((long)this.field2134); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field2123, this.field2134, 0); // L: 150
				if (var1 != null) { // L: 151
					field2126.put(var1, (long)this.field2134);
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "-91"
	)
	public SpritePixels method3882() {
		if (this.field2135 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field2126.get((long)this.field2135); // L: 158
			if (var1 != null) {
				return var1; // L: 159
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field2123, this.field2135, 0); // L: 160
				if (var1 != null) { // L: 161
					field2126.put(var1, (long)this.field2135);
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lqh;",
		garbageValue = "1"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 167
			return null;
		} else {
			Font var1 = (Font)field2127.get((long)this.fontId); // L: 168
			if (var1 != null) { // L: 169
				return var1;
			} else {
				var1 = class148.method3275(field2123, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 170
				if (var1 != null) {
					field2127.put(var1, (long)this.fontId); // L: 171
				}

				return var1; // L: 173
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lvg;",
		garbageValue = "-1601288293"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 391
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 392
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0; // L: 393
		SpritePixels var8;
		if (!var5) { // L: 395
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 396
			if (var8 != null) { // L: 397
				return var8;
			}
		}

		ItemComposition var9 = class164.ItemComposition_get(var0); // L: 399
		if (var1 > 1 && var9.countobj != null) { // L: 400
			int var10 = -1; // L: 401

			for (int var11 = 0; var11 < 10; ++var11) { // L: 402
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 403
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 405
				var9 = class164.ItemComposition_get(var10);
			}
		}

		Model var20 = var9.getModel(1); // L: 407
		if (var20 == null) { // L: 408
			return null;
		} else {
			SpritePixels var21 = null; // L: 409
			if (var9.noteTemplate != -1) { // L: 410
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 411
				if (var21 == null) { // L: 412
					return null;
				}
			} else if (var9.notedId != -1) { // L: 414
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 415
				if (var21 == null) { // L: 416
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 418
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 419
				if (var21 == null) { // L: 420
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 422
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 423
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 424
			float[] var15 = Rasterizer2D.field5435; // L: 425
			int[] var16 = new int[4]; // L: 426
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 427
			var8 = new SpritePixels(36, 32); // L: 428
			Rasterizer3D.method5259(var8.pixels, 36, 32, (float[])null); // L: 429
			Rasterizer2D.Rasterizer2D_clear(); // L: 430
			Rasterizer3D.method5302(); // L: 431
			Rasterizer3D.method5307(16, 16); // L: 432
			Rasterizer3D.field2876.field3185 = false; // L: 433
			if (var9.placeholderTemplate != -1) { // L: 434
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 435
			if (var5) { // L: 436
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) { // L: 437
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 438
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 439
			var20.calculateBoundsCylinder(); // L: 440
			var20.method5783(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 441
			if (var9.notedId != -1) { // L: 442
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 443
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 444
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 445
				var8.shadow(var3);
			}

			Rasterizer3D.method5259(var8.pixels, 36, 32, (float[])null); // L: 446
			if (var9.noteTemplate != -1) { // L: 447
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 448
				class136.ItemComposition_fontPlain11.draw(class108.method2810(var1), 0, 9, 16776960, 1); // L: 449
			}

			if (!var5) { // L: 451
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method5259(var12, var13, var14, var15); // L: 452
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 453
			Rasterizer3D.method5302(); // L: 454
			Rasterizer3D.field2876.field3185 = true; // L: 455
			return var8; // L: 456
		}
	}
}
