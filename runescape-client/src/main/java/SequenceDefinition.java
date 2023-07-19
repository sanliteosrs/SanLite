import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ai")
	static boolean field2293;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1388445055
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ao")
	public Map field2300;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -804281429
	)
	int field2284;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 238612147
	)
	int field2285;
	@ObfuscatedName("ag")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("aa")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ar")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ad")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1496012423
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("af")
	int[] field2291;
	@ObfuscatedName("ae")
	boolean[] field2283;
	@ObfuscatedName("al")
	public boolean field2290;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1029043745
	)
	public int field2294;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1632090529
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1711972955
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1588632987
	)
	public int field2292;
	@ObfuscatedName("bm")
	public boolean field2298;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1246831265
	)
	public int field2299;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1689170463
	)
	public int field2275;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1419624641
	)
	public int field2301;

	static {
		field2293 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 25
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2284 = 0; // L: 29
		this.field2285 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2290 = false; // L: 38
		this.field2294 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2292 = 99; // L: 42
		this.field2298 = false; // L: 43
		this.field2299 = -1; // L: 44
		this.field2275 = -1; // L: 45
		this.field2301 = 2; // L: 46
	} // L: 48

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-899709222"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "42"
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
			this.field2291 = new int[var3 + 1]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.field2291[var4] = var1.readUnsignedByte();
			}

			this.field2291[var3] = 9999999; // L: 93
		} else if (var2 == 4) { // L: 95
			this.field2290 = true;
		} else if (var2 == 5) { // L: 96
			this.field2294 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 97
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 98
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 99
			this.field2292 = var1.readUnsignedByte(); // L: 100
			this.field2298 = true; // L: 101
		} else if (var2 == 9) { // L: 103
			this.field2299 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 104
			this.field2275 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 105
			this.field2301 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 106
			var3 = var1.readUnsignedByte(); // L: 107
			this.chatFrameIds = new int[var3]; // L: 108

			for (var4 = 0; var4 < var3; ++var4) { // L: 109
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 110
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 112
			var3 = var1.readUnsignedByte(); // L: 113
			this.soundEffects = new int[var3]; // L: 114

			for (var4 = 0; var4 < var3; ++var4) { // L: 115
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) { // L: 117
			this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 118
		} else if (var2 == 15) { // L: 120
			var3 = var1.readUnsignedShort(); // L: 121
			this.field2300 = new HashMap(); // L: 122

			for (var4 = 0; var4 < var3; ++var4) { // L: 123
				int var5 = var1.readUnsignedShort(); // L: 124
				int var6 = var1.readMedium(); // L: 125
				this.field2300.put(var5, var6); // L: 126
			}
		} else if (var2 == 16) { // L: 129
			this.field2284 = var1.readUnsignedShort(); // L: 130
			this.field2285 = var1.readUnsignedShort(); // L: 131
		} else if (var2 == 17) { // L: 133
			this.field2283 = new boolean[256]; // L: 134

			for (var3 = 0; var3 < this.field2283.length; ++var3) { // L: 135
				this.field2283[var3] = false; // L: 136
			}

			var3 = var1.readUnsignedByte(); // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2283[var1.readUnsignedByte()] = true; // L: 140
			}
		}

	} // L: 144

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2103660316"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2299 == -1) { // L: 147
			if (this.field2291 == null && this.field2283 == null) { // L: 148
				this.field2299 = 0; // L: 149
			} else {
				this.field2299 = 2;
			}
		}

		if (this.field2275 == -1) { // L: 151
			if (this.field2291 == null && this.field2283 == null) { // L: 152
				this.field2275 = 0; // L: 153
			} else {
				this.field2275 = 2;
			}
		}

	} // L: 155

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljr;II)Ljr;",
		garbageValue = "1016130962"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 158
			var2 = this.frameIds[var2]; // L: 159
			Frames var5 = class415.getFrames(var2 >> 16); // L: 160
			var2 &= 65535; // L: 161
			if (var5 == null) { // L: 162
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 163
				var4.animate(var5, var2); // L: 164
				return var4; // L: 165
			}
		} else {
			class138 var3 = FriendSystem.method1923(this.SequenceDefinition_cachedModelId); // L: 168
			if (var3 == null) { // L: 169
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3141()); // L: 170
				var4.method4901(var3, var2); // L: 171
				return var4; // L: 172
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljr;IIB)Ljr;",
		garbageValue = "-69"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 177
			var2 = this.frameIds[var2]; // L: 178
			Frames var6 = class415.getFrames(var2 >> 16); // L: 179
			var2 &= 65535; // L: 180
			if (var6 == null) { // L: 181
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2)); // L: 182
				var3 &= 3; // L: 183
				if (var3 == 1) { // L: 184
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 185
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 186
				}

				var5.animate(var6, var2); // L: 187
				if (var3 == 1) { // L: 188
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 189
					var5.rotateY180();
				} else if (var3 == 3) { // L: 190
					var5.rotateY270Ccw();
				}

				return var5; // L: 191
			}
		} else {
			class138 var4 = FriendSystem.method1923(this.SequenceDefinition_cachedModelId); // L: 194
			if (var4 == null) { // L: 195
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3141()); // L: 196
				var3 &= 3; // L: 197
				if (var3 == 1) { // L: 198
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 199
					var5.rotateY180();
				} else if (var3 == 3) { // L: 200
					var5.rotateY90Ccw();
				}

				var5.method4901(var4, var2); // L: 201
				if (var3 == 1) { // L: 202
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180(); // L: 203
				} else if (var3 == 3) { // L: 204
					var5.rotateY270Ccw();
				}

				return var5; // L: 205
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljr;II)Ljr;",
		garbageValue = "190876912"
	)
	Model method4212(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 210
			var2 = this.frameIds[var2]; // L: 211
			Frames var5 = class415.getFrames(var2 >> 16); // L: 212
			var2 &= 65535; // L: 213
			if (var5 == null) { // L: 214
				return var1.method4919(true);
			} else {
				var4 = var1.method4919(!var5.hasAlphaTransform(var2)); // L: 215
				var4.animate(var5, var2); // L: 216
				return var4; // L: 217
			}
		} else {
			class138 var3 = FriendSystem.method1923(this.SequenceDefinition_cachedModelId); // L: 220
			if (var3 == null) { // L: 221
				return var1.method4919(true);
			} else {
				var4 = var1.method4919(!var3.method3141()); // L: 222
				var4.method4901(var3, var2); // L: 223
				return var4; // L: 224
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljr;ILik;IB)Ljr;",
		garbageValue = "-97"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2293 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 229
			return this.method4171(var1, var2, var3, var4); // L: 230
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 232
			boolean var6 = false; // L: 233
			Frames var7 = null; // L: 234
			Skeleton var8 = null; // L: 235
			class138 var9;
			if (this.isCachedModelIdSet()) { // L: 236
				var9 = this.method4175(); // L: 237
				if (var9 == null) { // L: 238
					return var5; // L: 239
				}

				if (var3.isCachedModelIdSet() && this.field2283 == null) { // L: 241
					var5.method4901(var9, var2); // L: 242
					return var5; // L: 243
				}

				var8 = var9.field1602; // L: 245
				var5.method4985(var8, var9, var2, this.field2283, false, !var3.isCachedModelIdSet()); // L: 246
			} else {
				var2 = this.frameIds[var2]; // L: 249
				var7 = class415.getFrames(var2 >> 16); // L: 250
				var2 &= 65535; // L: 251
				if (var7 == null) { // L: 252
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2291 == null || var4 == -1)) { // L: 253
					var5.animate(var7, var2); // L: 254
					return var5; // L: 255
				}

				if (this.field2291 == null || var4 == -1) { // L: 257
					var5.animate(var7, var2); // L: 258
					return var5; // L: 259
				}

				var6 = var3.isCachedModelIdSet(); // L: 261
				if (!var6) { // L: 262
					var5.method4868(var7, var2, this.field2291, false); // L: 263
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 266
				var9 = var3.method4175(); // L: 267
				if (var9 == null) { // L: 268
					return var5; // L: 269
				}

				if (var8 == null) { // L: 271
					var8 = var9.field1602; // L: 272
				}

				var5.method4985(var8, var9, var4, this.field2283, true, true); // L: 274
			} else {
				var4 = var3.frameIds[var4]; // L: 277
				Frames var10 = class415.getFrames(var4 >> 16); // L: 278
				var4 &= 65535; // L: 279
				if (var10 == null) { // L: 280
					return this.transformActorModel(var1, var2);
				}

				var5.method4868(var10, var4, this.field2291, true); // L: 281
			}

			if (var6 && var7 != null) { // L: 283
				var5.method4868(var7, var2, this.field2291, false); // L: 284
			}

			var5.resetBounds(); // L: 286
			return var5; // L: 287
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljr;ILik;II)Ljr;",
		garbageValue = "-914129267"
	)
	Model method4171(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 291
		Frames var5 = class415.getFrames(var2 >> 16); // L: 292
		var2 &= 65535; // L: 293
		if (var5 == null) { // L: 294
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 295
			Frames var6 = class415.getFrames(var4 >> 16); // L: 296
			var4 &= 65535; // L: 297
			Model var7;
			if (var6 == null) { // L: 298
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 299
				var7.animate(var5, var2); // L: 300
				return var7; // L: 301
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 303
				var7.animate2(var5, var2, var6, var4, this.field2291); // L: 304
				return var7; // L: 305
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljr;II)Ljr;",
		garbageValue = "-1222055034"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 309
			int var3 = this.frameIds[var2]; // L: 310
			Frames var4 = class415.getFrames(var3 >> 16); // L: 311
			var3 &= 65535; // L: 312
			if (var4 == null) { // L: 313
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 314
				int var6 = 0; // L: 315
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 316
					var6 = this.chatFrameIds[var2]; // L: 317
					var5 = class415.getFrames(var6 >> 16); // L: 318
					var6 &= 65535; // L: 319
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 321
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 326
					var7.animate(var4, var3); // L: 327
					var7.animate(var5, var6); // L: 328
					return var7; // L: 329
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 322
					var7.animate(var4, var3); // L: 323
					return var7; // L: 324
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 332
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1311810095"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 337
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "324954721"
	)
	public int method4174() {
		return this.field2285 - this.field2284; // L: 341
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lfw;",
		garbageValue = "-275214162"
	)
	class138 method4175() {
		return this.isCachedModelIdSet() ? FriendSystem.method1923(this.SequenceDefinition_cachedModelId) : null; // L: 382 383 386
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1156087682"
	)
	public static int method4222(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}
}
