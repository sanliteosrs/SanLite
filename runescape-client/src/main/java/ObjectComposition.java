import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("aq")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lkr;"
	)
	static ModelData[] field2158;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1778792619
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ai")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ae")
	@Export("models")
	int[] models;
	@ObfuscatedName("au")
	@Export("name")
	public String name;
	@ObfuscatedName("ah")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("az")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ax")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ac")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1939931417
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1608175373
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1991980265
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("aa")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1219976399
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1975017005
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("at")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("af")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1386147655
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 90758133
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 162663989
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -984713745
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("be")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1446305355
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1499221133
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("bi")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ba")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1454400289
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1434702943
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 765533771
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1696671669
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1981686791
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1338309999
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("bw")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("bl")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -114673113
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("bv")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -437553519
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -808370635
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 328856131
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 761604736
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1408552576
	)
	public int field2198;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -2017268985
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 269635639
	)
	public int field2200;
	@ObfuscatedName("br")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("bf")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("cf")
	public boolean field2203;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field2158 = new ModelData[4]; // L: 24
	}

	ObjectComposition() {
		this.name = "null"; // L: 28
		this.sizeX = 1; // L: 33
		this.sizeY = 1; // L: 34
		this.interactType = 2; // L: 35
		this.boolean1 = true; // L: 36
		this.int1 = -1; // L: 37
		this.clipType = -1; // L: 38
		this.nonFlatShading = false; // L: 39
		this.modelClipped = false; // L: 40
		this.animationId = -1; // L: 41
		this.int2 = 16; // L: 42
		this.ambient = 0; // L: 43
		this.contrast = 0; // L: 44
		this.actions = new String[5]; // L: 45
		this.mapIconId = -1; // L: 46
		this.mapSceneId = -1; // L: 47
		this.isRotated = false; // L: 48
		this.clipped = true; // L: 49
		this.modelSizeX = 128; // L: 50
		this.modelHeight = 128; // L: 51
		this.modelSizeY = 128; // L: 52
		this.offsetX = 0; // L: 53
		this.offsetHeight = 0; // L: 54
		this.offsetY = 0; // L: 55
		this.boolean2 = false; // L: 56
		this.isSolid = false; // L: 57
		this.int3 = -1; // L: 58
		this.transformVarbit = -1; // L: 60
		this.transformVarp = -1; // L: 61
		this.ambientSoundId = -1; // L: 62
		this.int7 = 0; // L: 63
		this.field2198 = 0; // L: 64
		this.int6 = 0; // L: 65
		this.field2200 = 0; // L: 66
		this.boolean3 = true; // L: 68
		this.field2203 = false; // L: 69
	} // L: 72

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-952903219"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) { // L: 91
			this.int1 = 0; // L: 92
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 93
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) { // L: 94
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) { // L: 96
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	} // L: 97

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1745047728"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 101
			if (var2 == 0) { // L: 102
				return; // L: 105
			}

			this.decodeNext(var1, var2); // L: 103
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "2127787697"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 108
			var3 = var1.readUnsignedByte(); // L: 109
			if (var3 > 0) { // L: 110
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 111
					var1.offset += var3 * 3; // L: 119
				} else {
					this.models = new int[var3]; // L: 112
					this.modelIds = new int[var3]; // L: 113

					for (var4 = 0; var4 < var3; ++var4) { // L: 114
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 115
						this.models[var4] = var1.readUnsignedByte(); // L: 116
					}
				}
			}
		} else if (var2 == 2) { // L: 122
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) { // L: 123
			var3 = var1.readUnsignedByte(); // L: 124
			if (var3 > 0) { // L: 125
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 126
					var1.offset += 2 * var3; // L: 131
				} else {
					this.models = null; // L: 127
					this.modelIds = new int[var3]; // L: 128

					for (var4 = 0; var4 < var3; ++var4) { // L: 129
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) { // L: 134
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 135
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 136
			this.interactType = 0; // L: 137
			this.boolean1 = false; // L: 138
		} else if (var2 == 18) { // L: 140
			this.boolean1 = false;
		} else if (var2 == 19) { // L: 141
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) { // L: 142
			this.clipType = 0;
		} else if (var2 == 22) { // L: 143
			this.nonFlatShading = true;
		} else if (var2 == 23) { // L: 144
			this.modelClipped = true;
		} else if (var2 == 24) { // L: 145
			this.animationId = var1.readUnsignedShort(); // L: 146
			if (this.animationId == 65535) { // L: 147
				this.animationId = -1;
			}
		} else if (var2 == 27) { // L: 149
			this.interactType = 1;
		} else if (var2 == 28) { // L: 150
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) { // L: 151
			this.ambient = var1.readByte();
		} else if (var2 == 39) { // L: 152
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) { // L: 153
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 154
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 155
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 157
			var3 = var1.readUnsignedByte(); // L: 158
			this.recolorFrom = new short[var3]; // L: 159
			this.recolorTo = new short[var3]; // L: 160

			for (var4 = 0; var4 < var3; ++var4) { // L: 161
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 162
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 163
			}
		} else if (var2 == 41) { // L: 166
			var3 = var1.readUnsignedByte(); // L: 167
			this.retextureFrom = new short[var3]; // L: 168
			this.retextureTo = new short[var3]; // L: 169

			for (var4 = 0; var4 < var3; ++var4) { // L: 170
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 171
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 172
			}
		} else if (var2 == 61) { // L: 175
			var1.readUnsignedShort(); // L: 176
		} else if (var2 == 62) { // L: 178
			this.isRotated = true;
		} else if (var2 == 64) { // L: 179
			this.clipped = false;
		} else if (var2 == 65) { // L: 180
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 181
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 182
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 183
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 184
			var1.readUnsignedByte(); // L: 185
		} else if (var2 == 70) { // L: 187
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 188
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) { // L: 189
			this.offsetY = var1.readShort();
		} else if (var2 == 73) { // L: 190
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 191
			this.isSolid = true;
		} else if (var2 == 75) { // L: 192
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 193
			if (var2 == 78) { // L: 211
				this.ambientSoundId = var1.readUnsignedShort(); // L: 212
				this.int7 = var1.readUnsignedByte() * 128; // L: 213
				this.field2198 = var1.readUnsignedByte() * 128; // L: 214
			} else if (var2 == 79) { // L: 216
				this.int6 = var1.readUnsignedShort(); // L: 217
				this.field2200 = var1.readUnsignedShort(); // L: 218
				this.int7 = var1.readUnsignedByte() * 128; // L: 219
				this.field2198 = var1.readUnsignedByte() * 128; // L: 220
				var3 = var1.readUnsignedByte(); // L: 221
				this.soundEffectIds = new int[var3]; // L: 222

				for (var4 = 0; var4 < var3; ++var4) { // L: 223
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 225
				var1.readUnsignedByte();
			} else if (var2 == 82) { // L: 226
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 227
				this.boolean3 = false;
			} else if (var2 == 90) { // L: 228
				this.field2203 = true;
			} else if (var2 == 249) { // L: 229
				this.params = AttackOption.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 194
			if (this.transformVarbit == 65535) { // L: 195
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 196
			if (this.transformVarp == 65535) { // L: 197
				this.transformVarp = -1;
			}

			var3 = -1; // L: 198
			if (var2 == 92) { // L: 199
				var3 = var1.readUnsignedShort(); // L: 200
				if (var3 == 65535) { // L: 201
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 203
			this.transforms = new int[var4 + 2]; // L: 204

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 205
				this.transforms[var5] = var1.readUnsignedShort(); // L: 206
				if (this.transforms[var5] == 65535) { // L: 207
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 209
		}

	} // L: 231

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1728200290"
	)
	public final boolean method3913(int var1) {
		if (this.models != null) { // L: 234
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 244
				if (this.models[var4] == var1) { // L: 245
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 247
		} else if (this.modelIds == null) { // L: 235
			return true;
		} else if (var1 != 10) { // L: 236
			return true;
		} else {
			boolean var2 = true; // L: 237

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 238
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 239
			}

			return var2; // L: 241
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-41"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 252
			return true;
		} else {
			boolean var1 = true; // L: 253

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 254
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 255
			}

			return var1; // L: 257
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lkt;",
		garbageValue = "115"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 262
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 263
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 264
		if (var9 == null) { // L: 265
			ModelData var10 = this.getModelData(var1, var2); // L: 266
			if (var10 == null) { // L: 267
				return null;
			}

			if (!this.nonFlatShading) { // L: 268
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 270
				var10.contrast = (short)(this.contrast + 768); // L: 271
				var10.calculateVertexNormals(); // L: 272
				var9 = var10; // L: 273
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 275
		}

		if (this.nonFlatShading) { // L: 277
			var9 = ((ModelData)var9).shallowCopy(); // L: 278
		}

		if (this.clipType >= 0) { // L: 280
			if (var9 instanceof Model) { // L: 281
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method5163(var3, var4, var5, var6, true, this.clipType); // L: 282
			}
		}

		return (Renderable)var9; // L: 284
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Llv;",
		garbageValue = "-695708890"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 289
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 290
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 291
		if (var9 == null) { // L: 292
			ModelData var10 = this.getModelData(var1, var2); // L: 293
			if (var10 == null) { // L: 294
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 295
			ObjectDefinition_cachedModels.put(var9, var7); // L: 296
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType); // L: 298
		}

		return var9; // L: 299
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILii;IB)Llv;",
		garbageValue = "-1"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 304
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 305
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 306
		if (var11 == null) { // L: 307
			ModelData var12 = this.getModelData(var1, var2); // L: 308
			if (var12 == null) { // L: 309
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 310
			ObjectDefinition_cachedModels.put(var11, var9); // L: 311
		}

		if (var7 == null && this.clipType == -1) { // L: 313
			return var11;
		} else {
			if (var7 != null) { // L: 314
				var11 = var7.transformObjectModel(var11, var8, var2); // L: 315
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 317
			}

			if (this.clipType >= 0) { // L: 318
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11; // L: 319
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Lkr;",
		garbageValue = "-1121158917"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 323
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 324
			if (var1 != 10) { // L: 325
				return null;
			}

			if (this.modelIds == null) { // L: 326
				return null;
			}

			var4 = this.isRotated; // L: 327
			if (var1 == 2 && var2 > 3) { // L: 328
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 329

			for (int var6 = 0; var6 < var5; ++var6) { // L: 330
				var7 = this.modelIds[var6]; // L: 331
				if (var4) { // L: 332
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 333
				if (var3 == null) { // L: 334
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 335
					if (var3 == null) { // L: 336
						return null;
					}

					if (var4) { // L: 337
						var3.method5172();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 338
				}

				if (var5 > 1) { // L: 340
					field2158[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 342
				var3 = new ModelData(field2158, var5);
			}
		} else {
			int var9 = -1; // L: 345

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 346
				if (this.models[var5] == var1) { // L: 347
					var9 = var5; // L: 348
					break;
				}
			}

			if (var9 == -1) { // L: 352
				return null;
			}

			var5 = this.modelIds[var9]; // L: 353
			boolean var10 = this.isRotated ^ var2 > 3; // L: 354
			if (var10) { // L: 355
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 356
			if (var3 == null) { // L: 357
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 358
				if (var3 == null) { // L: 359
					return null;
				}

				if (var10) { // L: 360
					var3.method5172();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 361
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 365
			var4 = false; // L: 366
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 368
			var11 = false; // L: 369
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true); // L: 370
		if (var1 == 4 && var2 > 3) { // L: 371
			var8.method5168(256); // L: 372
			var8.changeOffset(45, 0, -45); // L: 373
		}

		var2 &= 3; // L: 375
		if (var2 == 1) { // L: 376
			var8.method5165();
		} else if (var2 == 2) { // L: 377
			var8.method5160();
		} else if (var2 == 3) { // L: 378
			var8.method5167();
		}

		if (this.recolorFrom != null) { // L: 379
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 380
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 381
			}
		}

		if (this.retextureFrom != null) { // L: 384
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 385
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 386
			}
		}

		if (var4) { // L: 389
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 390
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 391
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lho;",
		garbageValue = "1866628811"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 395
		if (this.transformVarbit != -1) { // L: 396
			var1 = class162.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 397
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 399
			var2 = this.transforms[var1]; // L: 400
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class10.getObjectDefinition(var2) : null; // L: 401 402
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1346432164"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return WorldMapRectangle.method4997(this.params, var1, var2); // L: 406
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2037388818"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class109.method2817(this.params, var1, var2); // L: 410
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1722968962"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 421
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 422
				if (this.transforms[var1] != -1) { // L: 423
					ObjectComposition var2 = class10.getObjectDefinition(this.transforms[var1]); // L: 424
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 425
						return true;
					}
				}
			}

			return false; // L: 428
		}
	}
}
