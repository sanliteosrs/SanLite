import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("ItemComposition_archive")
	static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("av")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1944766345
	)
	@Export("id")
	int id;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 52249075
	)
	@Export("model")
	int model;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("al")
	public String field2216;
	@ObfuscatedName("ay")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ao")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("aa")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("as")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -174695287
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -932511077
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1790208239
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1823481547
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 794356069
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -676718343
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1206294019
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 602889903
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 770061685
	)
	public int field2229;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1058476449
	)
	public int field2223;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1426058655
	)
	public int field2231;
	@ObfuscatedName("bs")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bp")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bx")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 273396703
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -382618487
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1583651461
	)
	int field2237;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 524238055
	)
	int field2262;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1182568221
	)
	int field2239;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1808964033
	)
	int field2240;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1446734963
	)
	int field2241;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1743456221
	)
	int field2254;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1651349577
	)
	int field2243;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -790573063
	)
	int field2205;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 157356601
	)
	int field2245;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1689177827
	)
	int field2246;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1133676929
	)
	int field2248;
	@ObfuscatedName("bf")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cf")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1988212629
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 653842041
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -291982029
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -438789713
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 153443347
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1423274177
	)
	public int field2255;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1819108785
	)
	public int field2210;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1975893581
	)
	public int field2257;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1261871325
	)
	public int field2258;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cd")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -303297341
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1051074605
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1535727593
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -672657563
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemComposition_cached = new EvictingDualNodeHashTable(64); // L: 28
		ItemComposition_cachedModels = new EvictingDualNodeHashTable(50); // L: 29
		ItemComposition_cachedSprites = new EvictingDualNodeHashTable(200); // L: 30
	}

	ItemComposition() {
		this.name = "null"; // L: 34
		this.field2216 = "null"; // L: 35
		this.zoom2d = 2000; // L: 40
		this.xan2d = 0; // L: 41
		this.yan2d = 0; // L: 42
		this.zan2d = 0; // L: 43
		this.offsetX2d = 0; // L: 44
		this.offsetY2d = 0; // L: 45
		this.isStackable = 0; // L: 48
		this.price = 1; // L: 49
		this.field2229 = -1; // L: 50
		this.field2223 = -1; // L: 51
		this.field2231 = -1; // L: 52
		this.isMembersOnly = false; // L: 53
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 54
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 55
		this.shiftClickIndex = -2; // L: 57
		this.femaleModel1 = -1; // L: 58
		this.field2237 = -1; // L: 59
		this.field2262 = 0; // L: 60
		this.field2239 = -1; // L: 61
		this.field2240 = -1; // L: 62
		this.field2241 = 0; // L: 63
		this.field2254 = -1; // L: 64
		this.field2243 = -1; // L: 65
		this.field2205 = -1; // L: 66
		this.field2245 = -1; // L: 67
		this.field2246 = -1; // L: 68
		this.field2248 = -1; // L: 69
		this.note = -1; // L: 72
		this.noteTemplate = -1; // L: 73
		this.resizeX = 128; // L: 74
		this.resizeY = 128; // L: 75
		this.resizeZ = 128; // L: 76
		this.field2255 = 0; // L: 77
		this.field2210 = 0; // L: 78
		this.field2257 = 0; // L: 79
		this.field2258 = 0; // L: 80
		this.isTradable = false; // L: 82
		this.unnotedId = -1; // L: 83
		this.notedId = -1; // L: 84
		this.placeholder = -1; // L: 85
		this.placeholderTemplate = -1; // L: 86
	} // L: 88

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 140
			this.field2258 = 0;
		}

	} // L: 141

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-2039876064"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 145
			if (var2 == 0) { // L: 146
				return; // L: 149
			}

			this.method3965(var1, var2); // L: 147
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "2138087206"
	)
	void method3965(Buffer var1, int var2) {
		if (var2 == 1) { // L: 152
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 153
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 3) { // L: 154
			this.field2216 = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 155
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 156
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 157
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 158
			this.offsetX2d = var1.readUnsignedShort(); // L: 159
			if (this.offsetX2d > 32767) { // L: 160
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 162
			this.offsetY2d = var1.readUnsignedShort(); // L: 163
			if (this.offsetY2d > 32767) { // L: 164
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 166
			var1.readStringCp1252NullTerminated(); // L: 167
		} else if (var2 == 11) { // L: 169
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 170
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 171
			this.field2229 = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 172
			this.field2223 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 173
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 174
			this.femaleModel1 = var1.readUnsignedShort(); // L: 175
			this.field2262 = var1.readUnsignedByte(); // L: 176
		} else if (var2 == 24) { // L: 178
			this.field2237 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 179
			this.field2239 = var1.readUnsignedShort(); // L: 180
			this.field2241 = var1.readUnsignedByte(); // L: 181
		} else if (var2 == 26) { // L: 183
			this.field2240 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 184
			this.field2231 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 185
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 186
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 187
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 189
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 190
				var3 = var1.readUnsignedByte(); // L: 191
				this.recolorFrom = new short[var3]; // L: 192
				this.recolorTo = new short[var3]; // L: 193

				for (var4 = 0; var4 < var3; ++var4) { // L: 194
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 195
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 196
				}
			} else if (var2 == 41) { // L: 199
				var3 = var1.readUnsignedByte(); // L: 200
				this.retextureFrom = new short[var3]; // L: 201
				this.retextureTo = new short[var3]; // L: 202

				for (var4 = 0; var4 < var3; ++var4) { // L: 203
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 204
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 205
				}
			} else if (var2 == 42) { // L: 208
				this.shiftClickIndex = var1.readByte(); // L: 209
			} else if (var2 == 65) { // L: 211
				this.isTradable = true; // L: 212
			} else if (var2 == 75) { // L: 214
				this.field2258 = var1.readShort();
			} else if (var2 == 78) { // L: 215
				this.field2254 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 216
				this.field2243 = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.field2205 = var1.readUnsignedShort(); // L: 217
			} else if (var2 == 91) { // L: 218
				this.field2246 = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 219
				this.field2245 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 220
				this.field2248 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 221
				var1.readUnsignedShort(); // L: 222
			} else if (var2 == 95) { // L: 224
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 225
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 226
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 227
				if (this.countobj == null) { // L: 228
					this.countobj = new int[10]; // L: 229
					this.countco = new int[10]; // L: 230
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 232
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 233
			} else if (var2 == 110) { // L: 235
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 236
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 237
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 238
				this.field2255 = var1.readByte();
			} else if (var2 == 114) { // L: 239
				this.field2210 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 240
				this.field2257 = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 241
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 242
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 243
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 244
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 245
				this.params = AttackOption.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 247

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhe;Lhe;B)V",
		garbageValue = "8"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 250
		this.zoom2d = var1.zoom2d; // L: 251
		this.xan2d = var1.xan2d; // L: 252
		this.yan2d = var1.yan2d; // L: 253
		this.zan2d = var1.zan2d; // L: 254
		this.offsetX2d = var1.offsetX2d; // L: 255
		this.offsetY2d = var1.offsetY2d; // L: 256
		this.recolorFrom = var1.recolorFrom; // L: 257
		this.recolorTo = var1.recolorTo; // L: 258
		this.retextureFrom = var1.retextureFrom; // L: 259
		this.retextureTo = var1.retextureTo; // L: 260
		this.name = var2.name; // L: 261
		this.field2216 = "Swap this note at any bank for the equivalent item"; // L: 262
		this.isMembersOnly = var2.isMembersOnly; // L: 263
		this.price = var2.price; // L: 264
		this.isStackable = 1; // L: 265
	} // L: 266

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhe;Lhe;B)V",
		garbageValue = "2"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 269
		this.zoom2d = var1.zoom2d; // L: 270
		this.xan2d = var1.xan2d; // L: 271
		this.yan2d = var1.yan2d; // L: 272
		this.zan2d = var1.zan2d; // L: 273
		this.offsetX2d = var1.offsetX2d; // L: 274
		this.offsetY2d = var1.offsetY2d; // L: 275
		this.recolorFrom = var2.recolorFrom; // L: 276
		this.recolorTo = var2.recolorTo; // L: 277
		this.retextureFrom = var2.retextureFrom; // L: 278
		this.retextureTo = var2.retextureTo; // L: 279
		this.name = var2.name; // L: 280
		this.field2216 = var2.field2216; // L: 281
		this.isMembersOnly = var2.isMembersOnly; // L: 282
		this.isStackable = var2.isStackable; // L: 283
		this.field2229 = var2.field2229; // L: 284
		this.field2223 = var2.field2223; // L: 285
		this.field2231 = var2.field2231; // L: 286
		this.femaleModel1 = var2.femaleModel1; // L: 287
		this.field2237 = var2.field2237; // L: 288
		this.field2254 = var2.field2254; // L: 289
		this.field2239 = var2.field2239; // L: 290
		this.field2240 = var2.field2240; // L: 291
		this.field2243 = var2.field2243; // L: 292
		this.field2205 = var2.field2205; // L: 293
		this.field2245 = var2.field2245; // L: 294
		this.field2246 = var2.field2246; // L: 295
		this.field2248 = var2.field2248; // L: 296
		this.field2257 = var2.field2257; // L: 297
		this.groundActions = var2.groundActions; // L: 298
		this.field2258 = var2.field2258; // L: 299
		this.inventoryActions = new String[5]; // L: 300
		if (var2.inventoryActions != null) { // L: 301
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 302
		this.price = 0; // L: 303
	} // L: 304

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lhe;Lhe;B)V",
		garbageValue = "-103"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 307
		this.zoom2d = var1.zoom2d; // L: 308
		this.xan2d = var1.xan2d; // L: 309
		this.yan2d = var1.yan2d; // L: 310
		this.zan2d = var1.zan2d; // L: 311
		this.offsetX2d = var1.offsetX2d; // L: 312
		this.offsetY2d = var1.offsetY2d; // L: 313
		this.recolorFrom = var1.recolorFrom; // L: 314
		this.recolorTo = var1.recolorTo; // L: 315
		this.retextureFrom = var1.retextureFrom; // L: 316
		this.retextureTo = var1.retextureTo; // L: 317
		this.isStackable = var1.isStackable; // L: 318
		this.name = var2.name; // L: 319
		this.field2216 = var2.field2216; // L: 320
		this.price = 0; // L: 321
		this.isMembersOnly = false; // L: 322
		this.isTradable = false; // L: 323
	} // L: 324

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkr;",
		garbageValue = "6"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 327
			int var2 = -1; // L: 328

			for (var3 = 0; var3 < 10; ++var3) { // L: 329
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 330
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 332
				return class164.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(SecureRandomFuture.ItemComposition_modelArchive, this.model, 0); // L: 334
		if (var4 == null) { // L: 335
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 336
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 337
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 338
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 339
				}
			}

			if (this.retextureFrom != null) { // L: 342
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 343
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 344
				}
			}

			return var4; // L: 347
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Llv;",
		garbageValue = "0"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 351
			int var2 = -1; // L: 352

			for (int var3 = 0; var3 < 10; ++var3) { // L: 353
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 354
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 356
				return class164.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 358
		if (var5 != null) { // L: 359
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(SecureRandomFuture.ItemComposition_modelArchive, this.model, 0); // L: 360
			if (var6 == null) { // L: 361
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 362
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 363
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 364
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 365
					}
				}

				if (this.retextureFrom != null) { // L: 368
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 369
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 370
					}
				}

				var5 = var6.toModel(this.field2255 + 64, this.field2210 + 768, -50, -10, -50); // L: 373
				var5.isSingleTile = true; // L: 374
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 375
				return var5; // L: 376
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhe;",
		garbageValue = "-7"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 380
			int var2 = -1; // L: 381

			for (int var3 = 0; var3 < 10; ++var3) { // L: 382
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 383
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 385
				return class164.ItemComposition_get(var2);
			}
		}

		return this; // L: 387
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-100680306"
	)
	public final boolean method3967(int var1) {
		int var2 = this.femaleModel1; // L: 466
		int var3 = this.field2237; // L: 467
		int var4 = this.field2254; // L: 468
		if (var1 == 1) { // L: 469
			var2 = this.field2239; // L: 470
			var3 = this.field2240; // L: 471
			var4 = this.field2243; // L: 472
		}

		if (var2 == -1) { // L: 474
			return true;
		} else {
			boolean var5 = true; // L: 475
			if (!SecureRandomFuture.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 476
				var5 = false;
			}

			if (var3 != -1 && !SecureRandomFuture.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 477
				var5 = false;
			}

			if (var4 != -1 && !SecureRandomFuture.ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 478
				var5 = false;
			}

			return var5; // L: 479
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lkr;",
		garbageValue = "2120948983"
	)
	public final ModelData method3972(int var1) {
		int var2 = this.femaleModel1; // L: 483
		int var3 = this.field2237; // L: 484
		int var4 = this.field2254; // L: 485
		if (var1 == 1) { // L: 486
			var2 = this.field2239; // L: 487
			var3 = this.field2240; // L: 488
			var4 = this.field2243; // L: 489
		}

		if (var2 == -1) { // L: 491
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(SecureRandomFuture.ItemComposition_modelArchive, var2, 0); // L: 492
			if (var3 != -1) { // L: 493
				ModelData var6 = ModelData.ModelData_get(SecureRandomFuture.ItemComposition_modelArchive, var3, 0); // L: 494
				if (var4 != -1) { // L: 495
					ModelData var7 = ModelData.ModelData_get(SecureRandomFuture.ItemComposition_modelArchive, var4, 0); // L: 496
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 497
					var5 = new ModelData(var8, 3); // L: 498
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 501
					var5 = new ModelData(var10, 2); // L: 502
				}
			}

			if (var1 == 0 && this.field2262 != 0) { // L: 505
				var5.changeOffset(0, this.field2262, 0);
			}

			if (var1 == 1 && this.field2241 != 0) { // L: 506
				var5.changeOffset(0, this.field2241, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 507
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 508
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 509
				}
			}

			if (this.retextureFrom != null) { // L: 512
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 513
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 514
				}
			}

			return var5; // L: 517
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "37"
	)
	public final boolean method3983(int var1) {
		int var2 = this.field2205; // L: 521
		int var3 = this.field2245; // L: 522
		if (var1 == 1) { // L: 523
			var2 = this.field2246; // L: 524
			var3 = this.field2248; // L: 525
		}

		if (var2 == -1) { // L: 527
			return true;
		} else {
			boolean var4 = true; // L: 528
			if (!SecureRandomFuture.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 529
				var4 = false;
			}

			if (var3 != -1 && !SecureRandomFuture.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 530
				var4 = false;
			}

			return var4; // L: 531
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lkr;",
		garbageValue = "-56592842"
	)
	public final ModelData method4014(int var1) {
		int var2 = this.field2205; // L: 535
		int var3 = this.field2245; // L: 536
		if (var1 == 1) { // L: 537
			var2 = this.field2246; // L: 538
			var3 = this.field2248; // L: 539
		}

		if (var2 == -1) { // L: 541
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(SecureRandomFuture.ItemComposition_modelArchive, var2, 0); // L: 542
			if (var3 != -1) { // L: 543
				ModelData var5 = ModelData.ModelData_get(SecureRandomFuture.ItemComposition_modelArchive, var3, 0); // L: 544
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 545
				var4 = new ModelData(var6, 2); // L: 546
			}

			int var7;
			if (this.recolorFrom != null) { // L: 548
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 549
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 550
				}
			}

			if (this.retextureFrom != null) { // L: 553
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 554
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 555
				}
			}

			return var4; // L: 558
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1645821643"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return WorldMapRectangle.method4997(this.params, var1, var2); // L: 562
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1312271541"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class109.method2817(this.params, var1, var2); // L: 566
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-8281"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 570
			if (this.shiftClickIndex >= 0) { // L: 571
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 572
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-51"
	)
	boolean method3977() {
		return this.recolorTo != null; // L: 576
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1708808107"
	)
	boolean method3978() {
		return this.retextureTo != null; // L: 580
	}
}
