import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("aq")
	static boolean field2299;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -116545325
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("au")
	public Map field2287;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 996333495
	)
	int field2288;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1347016563
	)
	int field2289;
	@ObfuscatedName("ax")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ac")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("al")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lhg;"
	)
	public class205[] field2295;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -922081079
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("aa")
	int[] field2285;
	@ObfuscatedName("as")
	boolean[] field2296;
	@ObfuscatedName("aw")
	public boolean field2297;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2074913605
	)
	public int field2298;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1645317391
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1527780161
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1041319035
	)
	public int field2280;
	@ObfuscatedName("bt")
	public boolean field2304;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -524750121
	)
	public int field2303;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 65422091
	)
	public int field2283;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -543932181
	)
	public int field2305;

	static {
		field2299 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 25
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2288 = 0; // L: 29
		this.field2289 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2297 = false; // L: 38
		this.field2298 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2280 = 99; // L: 42
		this.field2304 = false; // L: 43
		this.field2303 = -1; // L: 44
		this.field2283 = -1; // L: 45
		this.field2305 = 2; // L: 46
	} // L: 48

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1231470696"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 73
			if (var2 == 0) { // L: 74
				return; // L: 77
			}

			this.decodeNext(var1, var2); // L: 75
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "549881438"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 80
			var3 = var1.readUnsignedShort(); // L: 81
			this.frameLengths = new int[var3]; // L: 82

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 84

			for (var4 = 0; var4 < var3; ++var4) { // L: 85
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 86
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 88
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 89
			var3 = var1.readUnsignedByte(); // L: 90
			this.field2285 = new int[var3 + 1]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.field2285[var4] = var1.readUnsignedByte();
			}

			this.field2285[var3] = 9999999; // L: 93
		} else if (var2 == 4) { // L: 95
			this.field2297 = true;
		} else if (var2 == 5) { // L: 96
			this.field2298 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 97
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 98
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 99
			this.field2280 = var1.readUnsignedByte(); // L: 100
			this.field2304 = true; // L: 101
		} else if (var2 == 9) { // L: 103
			this.field2303 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 104
			this.field2283 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 105
			this.field2305 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 106
			var3 = var1.readUnsignedByte(); // L: 107
			this.chatFrameIds = new int[var3]; // L: 108

			for (var4 = 0; var4 < var3; ++var4) { // L: 109
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 110
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else {
			boolean var8;
			boolean var9;
			boolean var10;
			int var16;
			int var17;
			int var18;
			if (var2 == 13) { // L: 112
				var3 = var1.readUnsignedByte(); // L: 113
				this.field2295 = new class205[var3]; // L: 114

				for (var4 = 0; var4 < var3; ++var4) { // L: 115
					class205 var12;
					class205[] var13;
					label156: {
						var13 = this.field2295; // L: 116
						if (var1 != null) { // L: 120
							var8 = false; // L: 121
							var9 = false; // L: 122
							var10 = false; // L: 123
							boolean var11 = false; // L: 124
							var16 = var1.readUnsignedShort(); // L: 125
							var17 = var1.readUnsignedByte(); // L: 126
							var18 = var1.readUnsignedByte(); // L: 127
							int var19 = var1.readUnsignedByte(); // L: 128
							if (var16 >= 1 && var17 >= 1 && var18 >= 0 && var19 >= 0) { // L: 129
								var12 = new class205(var16, var17, var18, var19); // L: 130
								break label156; // L: 131
							}
						}

						var12 = null; // L: 134
					}

					var13[var4] = var12; // L: 136
				}
			} else if (var2 == 14) { // L: 139
				this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 140
			} else if (var2 == 15) { // L: 142
				var3 = var1.readUnsignedShort(); // L: 143
				this.field2287 = new HashMap(); // L: 144

				for (var4 = 0; var4 < var3; ++var4) { // L: 145
					int var5;
					class205 var6;
					label169: {
						var5 = var1.readUnsignedShort(); // L: 146
						if (var1 != null) { // L: 149
							boolean var7 = false; // L: 150
							var8 = false; // L: 151
							var9 = false; // L: 152
							var10 = false; // L: 153
							int var15 = var1.readUnsignedShort(); // L: 154
							var16 = var1.readUnsignedByte(); // L: 155
							var17 = var1.readUnsignedByte(); // L: 156
							var18 = var1.readUnsignedByte(); // L: 157
							if (var15 >= 1 && var16 >= 1 && var17 >= 0 && var18 >= 0) { // L: 158
								var6 = new class205(var15, var16, var17, var18); // L: 159
								break label169; // L: 160
							}
						}

						var6 = null; // L: 163
					}

					this.field2287.put(var5, var6); // L: 166
				}
			} else if (var2 == 16) { // L: 169
				this.field2288 = var1.readUnsignedShort(); // L: 170
				this.field2289 = var1.readUnsignedShort(); // L: 171
			} else if (var2 == 17) { // L: 173
				this.field2296 = new boolean[256]; // L: 174

				for (var3 = 0; var3 < this.field2296.length; ++var3) { // L: 175
					this.field2296[var3] = false; // L: 176
				}

				var3 = var1.readUnsignedByte(); // L: 178

				for (var4 = 0; var4 < var3; ++var4) { // L: 179
					this.field2296[var1.readUnsignedByte()] = true; // L: 180
				}
			}
		}

	} // L: 184

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1751869717"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2303 == -1) { // L: 187
			if (this.field2285 == null && this.field2296 == null) { // L: 188
				this.field2303 = 0; // L: 189
			} else {
				this.field2303 = 2;
			}
		}

		if (this.field2283 == -1) { // L: 191
			if (this.field2285 == null && this.field2296 == null) { // L: 192
				this.field2283 = 0; // L: 193
			} else {
				this.field2283 = 2;
			}
		}

	} // L: 195

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llv;II)Llv;",
		garbageValue = "-1857948661"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 198
			var2 = this.frameIds[var2]; // L: 199
			Frames var9 = MouseHandler.getFrames(var2 >> 16); // L: 200
			var2 &= 65535; // L: 201
			if (var9 == null) { // L: 202
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2)); // L: 203
				var8.animate(var9, var2); // L: 204
				return var8; // L: 205
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 209
			class142 var6 = class138.method3190(var4); // L: 213
			int var5;
			if (var6 == null) { // L: 214
				var5 = 2; // L: 215
			} else {
				var5 = var6.method3231() ? 0 : 1; // L: 218
			}

			class142 var3;
			if (var5 != 0) { // L: 220
				var3 = null; // L: 221
			} else {
				var3 = class138.method3190(var4); // L: 224
			}

			if (var3 == null) { // L: 227
				return var1.toSharedSequenceModel(true);
			} else {
				Model var10 = var1.toSharedSequenceModel(!var3.method3206()); // L: 228
				var10.method5822(var3, var2); // L: 229
				return var10; // L: 230
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llv;III)Llv;",
		garbageValue = "762383690"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) { // L: 235
			var2 = this.frameIds[var2]; // L: 236
			Frames var10 = MouseHandler.getFrames(var2 >> 16); // L: 237
			var2 &= 65535; // L: 238
			if (var10 == null) { // L: 239
				return var1.toSharedSequenceModel(true);
			} else {
				Model var9 = var1.toSharedSequenceModel(!var10.hasAlphaTransform(var2)); // L: 240
				var3 &= 3; // L: 241
				if (var3 == 1) { // L: 242
					var9.rotateY270Ccw();
				} else if (var3 == 2) { // L: 243
					var9.rotateY180();
				} else if (var3 == 3) { // L: 244
					var9.rotateY90Ccw();
				}

				var9.animate(var10, var2); // L: 245
				if (var3 == 1) { // L: 246
					var9.rotateY90Ccw();
				} else if (var3 == 2) { // L: 247
					var9.rotateY180();
				} else if (var3 == 3) { // L: 248
					var9.rotateY270Ccw();
				}

				return var9; // L: 249
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId; // L: 253
			class142 var7 = class138.method3190(var5); // L: 257
			int var6;
			if (var7 == null) { // L: 258
				var6 = 2; // L: 259
			} else {
				var6 = var7.method3231() ? 0 : 1; // L: 262
			}

			class142 var4;
			if (var6 != 0) { // L: 264
				var4 = null; // L: 265
			} else {
				var4 = class138.method3190(var5); // L: 268
			}

			if (var4 == null) { // L: 271
				return var1.toSharedSequenceModel(true);
			} else {
				Model var11 = var1.toSharedSequenceModel(!var4.method3206()); // L: 272
				var3 &= 3; // L: 273
				if (var3 == 1) {
					var11.rotateY270Ccw(); // L: 274
				} else if (var3 == 2) { // L: 275
					var11.rotateY180();
				} else if (var3 == 3) { // L: 276
					var11.rotateY90Ccw();
				}

				var11.method5822(var4, var2); // L: 277
				if (var3 == 1) { // L: 278
					var11.rotateY90Ccw();
				} else if (var3 == 2) { // L: 279
					var11.rotateY180();
				} else if (var3 == 3) { // L: 280
					var11.rotateY270Ccw();
				}

				return var11; // L: 281
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llv;II)Llv;",
		garbageValue = "1281742568"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2]; // L: 287
			Frames var9 = MouseHandler.getFrames(var2 >> 16);
			var2 &= 65535; // L: 289
			if (var9 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var8 = var1.toSharedSpotAnimationModel(!var9.hasAlphaTransform(var2)); // L: 291
				var8.animate(var9, var2); // L: 292
				return var8; // L: 293
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 297
			class142 var6 = class138.method3190(var4); // L: 301
			int var5;
			if (var6 == null) { // L: 302
				var5 = 2; // L: 303
			} else {
				var5 = var6.method3231() ? 0 : 1; // L: 306
			}

			class142 var3;
			if (var5 != 0) { // L: 308
				var3 = null; // L: 309
			} else {
				var3 = class138.method3190(var4); // L: 312
			}

			if (var3 == null) { // L: 315
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var10 = var1.toSharedSpotAnimationModel(!var3.method3206()); // L: 316
				var10.method5822(var3, var2); // L: 317
				return var10; // L: 318
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llv;ILii;II)Llv;",
		garbageValue = "-2041267323"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2299 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 323
			return this.method4061(var1, var2, var3, var4); // L: 324
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 326
			boolean var6 = false; // L: 327
			Frames var7 = null; // L: 328
			Skeleton var8 = null; // L: 329
			class142 var9;
			if (this.isCachedModelIdSet()) { // L: 330
				var9 = this.method4060(); // L: 331
				if (var9 == null) { // L: 332
					return var5; // L: 333
				}

				if (var3.isCachedModelIdSet() && this.field2296 == null) { // L: 335
					var5.method5822(var9, var2); // L: 336
					return var5; // L: 337
				}

				var8 = var9.field1651; // L: 339
				var5.method5860(var8, var9, var2, this.field2296, false, !var3.isCachedModelIdSet()); // L: 340
			} else {
				var2 = this.frameIds[var2]; // L: 343
				var7 = MouseHandler.getFrames(var2 >> 16); // L: 344
				var2 &= 65535; // L: 345
				if (var7 == null) { // L: 346
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2285 == null || var4 == -1)) { // L: 347
					var5.animate(var7, var2); // L: 348
					return var5; // L: 349
				}

				if (this.field2285 == null || var4 == -1) { // L: 351
					var5.animate(var7, var2); // L: 352
					return var5; // L: 353
				}

				var6 = var3.isCachedModelIdSet(); // L: 355
				if (!var6) { // L: 356
					var5.method5775(var7, var2, this.field2285, false); // L: 357
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 360
				var9 = var3.method4060(); // L: 361
				if (var9 == null) { // L: 362
					return var5; // L: 363
				}

				if (var8 == null) { // L: 365
					var8 = var9.field1651; // L: 366
				}

				var5.method5860(var8, var9, var4, this.field2296, true, true); // L: 368
			} else {
				var4 = var3.frameIds[var4]; // L: 371
				Frames var10 = MouseHandler.getFrames(var4 >> 16); // L: 372
				var4 &= 65535; // L: 373
				if (var10 == null) { // L: 374
					return this.transformActorModel(var1, var2);
				}

				var5.method5775(var10, var4, this.field2285, true); // L: 375
			}

			if (var6 && var7 != null) { // L: 377
				var5.method5775(var7, var2, this.field2285, false); // L: 378
			}

			var5.resetBounds(); // L: 380
			return var5; // L: 381
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Llv;ILii;II)Llv;",
		garbageValue = "-787208312"
	)
	Model method4061(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 385
		Frames var5 = MouseHandler.getFrames(var2 >> 16); // L: 386
		var2 &= 65535; // L: 387
		if (var5 == null) { // L: 388
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 389
			Frames var6 = MouseHandler.getFrames(var4 >> 16); // L: 390
			var4 &= 65535; // L: 391
			Model var7;
			if (var6 == null) { // L: 392
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 393
				var7.animate(var5, var2); // L: 394
				return var7; // L: 395
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 397
				var7.animate2(var5, var2, var6, var4, this.field2285); // L: 398
				return var7; // L: 399
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Llv;II)Llv;",
		garbageValue = "-1428875187"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 403
			int var3 = this.frameIds[var2]; // L: 404
			Frames var4 = MouseHandler.getFrames(var3 >> 16); // L: 405
			var3 &= 65535; // L: 406
			if (var4 == null) { // L: 407
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 408
				int var6 = 0; // L: 409
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 410
					var6 = this.chatFrameIds[var2]; // L: 411
					var5 = MouseHandler.getFrames(var6 >> 16); // L: 412
					var6 &= 65535; // L: 413
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 415
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 420
					var7.animate(var4, var3); // L: 421
					var7.animate(var5, var6); // L: 422
					return var7; // L: 423
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 416
					var7.animate(var4, var3); // L: 417
					return var7; // L: 418
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 426
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1987539688"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 431
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-22"
	)
	public int method4059() {
		return this.field2289 - this.field2288; // L: 435
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lft;",
		garbageValue = "2131319309"
	)
	class142 method4060() {
		if (this.isCachedModelIdSet()) { // L: 455
			int var2 = this.SequenceDefinition_cachedModelId; // L: 457
			class142 var4 = class138.method3190(var2); // L: 461
			int var3;
			if (var4 == null) { // L: 462
				var3 = 2; // L: 463
			} else {
				var3 = var4.method3231() ? 0 : 1; // L: 466
			}

			class142 var1;
			if (var3 != 0) { // L: 468
				var1 = null; // L: 469
			} else {
				var1 = class138.method3190(var2); // L: 472
			}

			return var1; // L: 474
		} else {
			return null; // L: 477
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "857885835"
	)
	public static void method4093(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 283
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 285
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 286
			} catch (Exception var3) { // L: 288
			}
		}

	} // L: 290
}
