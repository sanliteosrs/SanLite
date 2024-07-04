import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ad")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ak")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static class424 field3114;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static class424 field3085;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static class424 field3127;
	@ObfuscatedName("bw")
	static boolean[] field3116;
	@ObfuscatedName("bl")
	static boolean[] field3120;
	@ObfuscatedName("bc")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bv")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bb")
	static float[] field3123;
	@ObfuscatedName("bn")
	static int[] field3094;
	@ObfuscatedName("bh")
	static int[] field3146;
	@ObfuscatedName("bq")
	static int[] field3141;
	@ObfuscatedName("bd")
	static int[] field3124;
	@ObfuscatedName("bk")
	static char[] field3126;
	@ObfuscatedName("br")
	static char[][] field3130;
	@ObfuscatedName("bf")
	static int[] field3131;
	@ObfuscatedName("cf")
	static int[][] field3132;
	@ObfuscatedName("cv")
	static int[] field3086;
	@ObfuscatedName("cl")
	static float[] field3153;
	@ObfuscatedName("cm")
	static int[] field3139;
	@ObfuscatedName("cg")
	static int[] field3145;
	@ObfuscatedName("cu")
	static int[] field3080;
	@ObfuscatedName("cn")
	static int[] field3089;
	@ObfuscatedName("ce")
	static int[] field3138;
	@ObfuscatedName("co")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("ch")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("ct")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cd")
	static boolean field3143;
	@ObfuscatedName("cs")
	static int[] field3105;
	@ObfuscatedName("cp")
	static int[] field3147;
	@ObfuscatedName("cy")
	static int[] field3135;
	@ObfuscatedName("cw")
	static int[] field3149;
	@ObfuscatedName("cc")
	static final float field3151;
	@ObfuscatedName("ca")
	static float[] field3157;
	@ObfuscatedName("av")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ab")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ai")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ae")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("au")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ah")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("az")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ax")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ac")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("al")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ay")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ao")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("aa")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("as")
	byte[] field3100;
	@ObfuscatedName("aw")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("at")
	public byte field3155;
	@ObfuscatedName("af")
	public int field3108;
	@ObfuscatedName("am")
	int[] field3104;
	@ObfuscatedName("ar")
	int[] field3134;
	@ObfuscatedName("bt")
	int[] field3111;
	@ObfuscatedName("bj")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("be")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bm")
	int[][] field3109;
	@ObfuscatedName("bo")
	int[][] field3110;
	@ObfuscatedName("bi")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ba")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bg")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bs")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bp")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bx")
	@Export("radius")
	int radius;
	@ObfuscatedName("bu")
	HashMap field3117;
	@ObfuscatedName("cr")
	public byte field3152;
	@ObfuscatedName("cb")
	public byte field3106;
	@ObfuscatedName("cz")
	public byte field3154;
	@ObfuscatedName("cj")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cx")
	public short field3156;

	static {
		Model_sharedSequenceModel = new Model(); // L: 16
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 17
		Model_sharedSpotAnimationModel = new Model(); // L: 18
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 19
		field3114 = new class424(); // L: 20
		field3085 = new class424(); // L: 21
		field3127 = new class424(); // L: 22
		field3116 = new boolean[6500]; // L: 58
		field3120 = new boolean[6500]; // L: 59
		modelViewportXs = new int[6500]; // L: 60
		modelViewportYs = new int[6500]; // L: 61
		field3123 = new float[6500]; // L: 62
		field3094 = new int[6500]; // L: 63
		field3146 = new int[6500]; // L: 64
		field3141 = new int[6500]; // L: 65
		field3124 = new int[6500]; // L: 66
		field3126 = new char[6000]; // L: 68
		field3130 = new char[6000][512]; // L: 69
		field3131 = new int[12]; // L: 70
		field3132 = new int[12][2000]; // L: 71
		field3086 = new int[2000]; // L: 72
		field3139 = new int[2000]; // L: 73
		field3145 = new int[12]; // L: 74
		field3080 = new int[10]; // L: 75
		field3089 = new int[10]; // L: 76
		field3138 = new int[10]; // L: 77
		field3153 = new float[10]; // L: 78
		field3143 = true; // L: 82
		field3105 = Rasterizer3D.Rasterizer3D_sine; // L: 85
		field3147 = Rasterizer3D.Rasterizer3D_cosine; // L: 86
		field3135 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 87
		field3149 = Rasterizer3D.field2880; // L: 88
		field3151 = class386.method7177(50); // L: 90
		field3157 = new float[3]; // L: 96
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3155 = 0;
		this.field3108 = 0;
		this.isSingleTile = false;
		this.field3117 = new HashMap();
	} // L: 98

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3155 = 0;
		this.field3108 = 0;
		this.isSingleTile = false;
		this.field3117 = new HashMap();
		this.method5878(var1, var2, var3); // L: 124
		this.field3155 = var4; // L: 125
		this.verticesCount = 0; // L: 126
		this.indicesCount = 0; // L: 127
		this.field3108 = 0; // L: 128
	} // L: 129

	@ObfuscatedSignature(
		descriptor = "([Llv;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 23
		this.indicesCount = 0; // L: 27
		this.field3155 = 0; // L: 38
		this.field3108 = 0; // L: 39
		this.isSingleTile = false; // L: 47
		this.field3117 = new HashMap(); // L: 53
		this.verticesCount = 0; // L: 101
		this.indicesCount = 0; // L: 102
		this.field3108 = 0; // L: 103
		this.field3155 = -1; // L: 104

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 105
			Model var4 = var1[var3]; // L: 106
			if (var4 != null) { // L: 107
				this.verticesCount += var4.verticesCount; // L: 108
				this.indicesCount += var4.indicesCount; // L: 109
				this.field3108 += var4.field3108; // L: 110
				if (this.field3155 == -1) { // L: 111
					this.field3155 = var4.field3155;
				}
			}
		}

		this.method5878(this.verticesCount, this.indicesCount, this.field3108); // L: 114
		this.verticesCount = 0; // L: 115
		this.indicesCount = 0; // L: 116
		this.field3108 = 0; // L: 117

		for (var3 = 0; var3 < var2; ++var3) { // L: 118
			this.method5759(var1[var3]); // L: 119
		}

	} // L: 121

	@ObfuscatedName("aq")
	void method5878(int var1, int var2, int var3) {
		this.verticesX = new int[var1]; // L: 132
		this.verticesY = new int[var1]; // L: 133
		this.verticesZ = new int[var1]; // L: 134
		this.indices1 = new int[var2]; // L: 135
		this.indices2 = new int[var2]; // L: 136
		this.indices3 = new int[var2]; // L: 137
		this.faceColors1 = new int[var2]; // L: 138
		this.faceColors2 = new int[var2]; // L: 139
		this.faceColors3 = new int[var2]; // L: 140
		if (var3 > 0) { // L: 141
			this.field3104 = new int[var3]; // L: 142
			this.field3134 = new int[var3]; // L: 143
			this.field3111 = new int[var3]; // L: 144
		}

	} // L: 146

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llv;)V"
	)
	void method5758(Model var1) {
		int var2 = this.indices1.length; // L: 149
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field3155 != var1.field3155)) { // L: 150
			this.faceRenderPriorities = new byte[var2]; // L: 151
			Arrays.fill(this.faceRenderPriorities, this.field3155); // L: 152
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) { // L: 154
			this.faceAlphas = new byte[var2]; // L: 155
			Arrays.fill(this.faceAlphas, (byte)0); // L: 156
		}

		if (this.faceTextures == null && var1.faceTextures != null) { // L: 158
			this.faceTextures = new short[var2]; // L: 159
			Arrays.fill(this.faceTextures, (short)-1); // L: 160
		}

		if (this.field3100 == null && var1.field3100 != null) { // L: 162
			this.field3100 = new byte[var2]; // L: 163
			Arrays.fill(this.field3100, (byte)-1); // L: 164
		}

	} // L: 166

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Llv;)V"
	)
	public void method5759(Model var1) {
		if (var1 != null) { // L: 169
			this.method5758(var1); // L: 172

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) { // L: 173
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2]; // L: 174
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2]; // L: 175
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2]; // L: 176
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2]; // L: 177
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2]; // L: 178
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2]; // L: 179
				if (this.faceRenderPriorities != null) { // L: 180
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field3155; // L: 181
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) { // L: 183
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2]; // L: 184
				}

				if (this.faceTextures != null) { // L: 186
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1; // L: 187
				}

				if (this.field3100 != null) { // L: 189
					if (var1.field3100 != null && var1.field3100[var2] != -1) { // L: 190
						this.field3100[this.indicesCount] = (byte)(var1.field3100[var2] + this.field3108); // L: 191
					} else {
						this.field3100[this.indicesCount] = -1; // L: 194
					}
				}

				++this.indicesCount; // L: 197
			}

			for (var2 = 0; var2 < var1.field3108; ++var2) { // L: 199
				this.field3104[this.field3108] = this.verticesCount + var1.field3104[var2]; // L: 200
				this.field3134[this.field3108] = this.verticesCount + var1.field3134[var2]; // L: 201
				this.field3111[this.field3108] = this.verticesCount + var1.field3111[var2]; // L: 202
				++this.field3108; // L: 203
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) { // L: 205
				this.verticesX[this.verticesCount] = var1.verticesX[var2]; // L: 206
				this.verticesY[this.verticesCount] = var1.verticesY[var2]; // L: 207
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2]; // L: 208
				++this.verticesCount; // L: 209
			}

		}
	} // L: 170 211

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Llv;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder(); // L: 214
		int var7 = var2 - this.xzRadius; // L: 215
		int var8 = var2 + this.xzRadius; // L: 216
		int var9 = var4 - this.xzRadius; // L: 217
		int var10 = var4 + this.xzRadius; // L: 218
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) { // L: 219
			var7 >>= 7; // L: 220
			var8 = var8 + 127 >> 7; // L: 221
			var9 >>= 7; // L: 222
			var10 = var10 + 127 >> 7; // L: 223
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) { // L: 224
				return this;
			} else {
				Model var11;
				if (var5) { // L: 226
					var11 = new Model(); // L: 227
					var11.verticesCount = this.verticesCount; // L: 228
					var11.indicesCount = this.indicesCount; // L: 229
					var11.field3108 = this.field3108; // L: 230
					var11.verticesX = this.verticesX; // L: 231
					var11.verticesZ = this.verticesZ; // L: 232
					var11.indices1 = this.indices1; // L: 233
					var11.indices2 = this.indices2; // L: 234
					var11.indices3 = this.indices3; // L: 235
					var11.faceColors1 = this.faceColors1; // L: 236
					var11.faceColors2 = this.faceColors2; // L: 237
					var11.faceColors3 = this.faceColors3; // L: 238
					var11.faceRenderPriorities = this.faceRenderPriorities; // L: 239
					var11.faceAlphas = this.faceAlphas; // L: 240
					var11.field3100 = this.field3100; // L: 241
					var11.faceTextures = this.faceTextures; // L: 242
					var11.field3155 = this.field3155; // L: 243
					var11.field3104 = this.field3104; // L: 244
					var11.field3134 = this.field3134; // L: 245
					var11.field3111 = this.field3111; // L: 246
					var11.vertexLabels = this.vertexLabels; // L: 247
					var11.faceLabelsAlpha = this.faceLabelsAlpha; // L: 248
					var11.isSingleTile = this.isSingleTile; // L: 249
					var11.verticesY = new int[var11.verticesCount]; // L: 250
				} else {
					var11 = this; // L: 253
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) { // L: 255
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 256
						var13 = var2 + this.verticesX[var12]; // L: 257
						var14 = var4 + this.verticesZ[var12]; // L: 258
						var15 = var13 & 127; // L: 259
						var16 = var14 & 127; // L: 260
						var17 = var13 >> 7; // L: 261
						var18 = var14 >> 7; // L: 262
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7; // L: 263
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7; // L: 264
						var21 = var19 * (128 - var16) + var20 * var16 >> 7; // L: 265
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3; // L: 266
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 270
						var13 = (-this.verticesY[var12] << 16) / super.height; // L: 271
						if (var13 < var6) { // L: 272
							var14 = var2 + this.verticesX[var12]; // L: 273
							var15 = var4 + this.verticesZ[var12]; // L: 274
							var16 = var14 & 127; // L: 275
							var17 = var15 & 127; // L: 276
							var18 = var14 >> 7; // L: 277
							var19 = var15 >> 7; // L: 278
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7; // L: 279
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7; // L: 280
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7; // L: 281
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12]; // L: 282
						}
					}
				}

				var11.resetBounds(); // L: 286
				return var11; // L: 287
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)Llv;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 291
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 292
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Z)Llv;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 296
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 297
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZLlv;[B)Llv;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 301
		var2.indicesCount = this.indicesCount; // L: 302
		var2.field3108 = this.field3108; // L: 303
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) { // L: 304
			var2.verticesX = new int[this.verticesCount + 100]; // L: 305
			var2.verticesY = new int[this.verticesCount + 100]; // L: 306
			var2.verticesZ = new int[this.verticesCount + 100]; // L: 307
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) { // L: 309
			var2.verticesX[var4] = this.verticesX[var4]; // L: 310
			var2.verticesY[var4] = this.verticesY[var4]; // L: 311
			var2.verticesZ[var4] = this.verticesZ[var4]; // L: 312
		}

		if (var1) { // L: 314
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3; // L: 316
			if (this.faceAlphas == null) { // L: 317
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 318
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 321
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1; // L: 324
		var2.indices2 = this.indices2; // L: 325
		var2.indices3 = this.indices3; // L: 326
		var2.faceColors1 = this.faceColors1; // L: 327
		var2.faceColors2 = this.faceColors2; // L: 328
		var2.faceColors3 = this.faceColors3; // L: 329
		var2.faceRenderPriorities = this.faceRenderPriorities; // L: 330
		var2.field3100 = this.field3100; // L: 331
		var2.faceTextures = this.faceTextures; // L: 332
		var2.field3155 = this.field3155; // L: 333
		var2.field3104 = this.field3104; // L: 334
		var2.field3134 = this.field3134; // L: 335
		var2.field3111 = this.field3111; // L: 336
		var2.vertexLabels = this.vertexLabels; // L: 337
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 338
		var2.field3109 = this.field3109; // L: 339
		var2.field3110 = this.field3110; // L: 340
		var2.isSingleTile = this.isSingleTile; // L: 341
		var2.resetBounds(); // L: 342
		var2.overrideAmount = 0; // L: 343
		return var2; // L: 344
	}

	@ObfuscatedName("av")
	void method5755(int var1) {
		if (!this.field3117.containsKey(var1)) { // L: 348
			int var2 = 0; // L: 349
			int var3 = 0; // L: 350
			int var4 = 0; // L: 351
			int var5 = 0; // L: 352
			int var6 = 0; // L: 353
			int var7 = 0; // L: 354
			int var8 = field3147[var1]; // L: 355
			int var9 = field3105[var1]; // L: 356

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 357
				int var12 = this.verticesX[var10]; // L: 359
				int var13 = this.verticesZ[var10]; // L: 360
				int var11 = var12 * var8 + var9 * var13 >> 16; // L: 362
				int var15 = this.verticesY[var10]; // L: 365
				int var16 = class221.method4242(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 366
				if (var11 < var2) { // L: 367
					var2 = var11;
				}

				if (var11 > var5) { // L: 368
					var5 = var11;
				}

				if (var15 < var3) { // L: 369
					var3 = var15;
				}

				if (var15 > var6) { // L: 370
					var6 = var15;
				}

				if (var16 < var4) { // L: 371
					var4 = var16;
				}

				if (var16 > var7) { // L: 372
					var7 = var16;
				}
			}

			class284 var17 = new class284((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2); // L: 374
			boolean var18 = true; // L: 375
			if (var17.field3010 < 32) { // L: 376
				var17.field3010 = 32;
			}

			if (var17.field3009 < 32) { // L: 377
				var17.field3009 = 32;
			}

			if (this.isSingleTile) { // L: 378
				boolean var19 = true; // L: 379
				var17.field3010 += 8; // L: 380
				var17.field3009 += 8; // L: 381
			}

			this.field3117.put(var1, var17); // L: 383
		}
	} // L: 384

	@ObfuscatedName("ab")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 387
			this.boundsType = 1; // L: 388
			super.height = 0; // L: 389
			this.bottomY = 0; // L: 390
			this.xzRadius = 0; // L: 391

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 392
				int var2 = this.verticesX[var1]; // L: 393
				int var3 = this.verticesY[var1]; // L: 394
				int var4 = this.verticesZ[var1]; // L: 395
				if (-var3 > super.height) { // L: 396
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 397
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 398
				if (var5 > this.xzRadius) { // L: 399
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 401
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 402
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 403
		}
	} // L: 404

	@ObfuscatedName("ai")
	void method5766() {
		if (this.boundsType != 2) { // L: 407
			this.boundsType = 2; // L: 408
			this.xzRadius = 0; // L: 409

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 410
				int var2 = this.verticesX[var1]; // L: 411
				int var3 = this.verticesY[var1]; // L: 412
				int var4 = this.verticesZ[var1]; // L: 413
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 414
				if (var5 > this.xzRadius) { // L: 415
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 417
			this.radius = this.xzRadius; // L: 418
			this.diameter = this.xzRadius + this.xzRadius; // L: 419
		}
	} // L: 420

	@ObfuscatedName("ae")
	public int method5767() {
		this.calculateBoundsCylinder(); // L: 423
		return this.xzRadius; // L: 424
	}

	@ObfuscatedName("au")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 428
		this.field3117.clear(); // L: 429
	} // L: 430

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llf;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 433
			if (var2 != -1) { // L: 434
				Animation var3 = var1.frames[var2]; // L: 435
				Skeleton var4 = var3.skeleton; // L: 436
				Model_transformTempX = 0; // L: 437
				Model_transformTempY = 0; // L: 438
				Model_transformTempZ = 0; // L: 439

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 440
					int var6 = var3.transformSkeletonLabels[var5]; // L: 441
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 442
				}

				this.resetBounds(); // L: 444
			}
		}
	} // L: 445

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lft;I)V"
	)
	public void method5822(class142 var1, int var2) {
		Skeleton var3 = var1.field1651; // L: 448
		class279 var4 = var3.method5407(); // L: 449
		if (var4 != null) { // L: 450
			var3.method5407().method5345(var1, var2); // L: 451
			this.method5800(var3.method5407(), var1.method3205()); // L: 452
		}

		if (var1.method3206()) { // L: 454
			this.method5771(var1, var2); // L: 455
		}

		this.resetBounds(); // L: 457
	} // L: 458

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lft;I)V"
	)
	void method5771(class142 var1, int var2) {
		Skeleton var3 = var1.field1651; // L: 461

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 462
			int var5 = var3.transformTypes[var4]; // L: 463
			if (var5 == 5 && var1.field1654 != null && var1.field1654[var4] != null && var1.field1654[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 464 465
				class135 var6 = var1.field1654[var4][0]; // L: 466
				int[] var7 = var3.labels[var4]; // L: 467
				int var8 = var7.length; // L: 468

				for (int var9 = 0; var9 < var8; ++var9) { // L: 469
					int var10 = var7[var9]; // L: 470
					if (var10 < this.faceLabelsAlpha.length) { // L: 471
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 472

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 473
							int var13 = var11[var12]; // L: 474
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3137(var2) * 255.0F); // L: 475
							if (var14 < 0) { // L: 476
								var14 = 0;
							} else if (var14 > 255) { // L: 477
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14; // L: 478
						}
					}
				}
			}
		}

	} // L: 485

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V"
	)
	void method5800(class279 var1, int var2) {
		this.method5794(var1, var2); // L: 489
	} // L: 491

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llf;ILlf;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 494
			if (var5 != null && var4 != -1) { // L: 495
				Animation var6 = var1.frames[var2]; // L: 499
				Animation var7 = var3.frames[var4]; // L: 500
				Skeleton var8 = var6.skeleton; // L: 501
				Model_transformTempX = 0; // L: 502
				Model_transformTempY = 0; // L: 503
				Model_transformTempZ = 0; // L: 504
				byte var9 = 0; // L: 505
				int var13 = var9 + 1; // L: 506
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 507
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 508 509
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 510
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 512
				Model_transformTempY = 0; // L: 513
				Model_transformTempZ = 0; // L: 514
				var9 = 0; // L: 515
				var13 = var9 + 1; // L: 516
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 517
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 518 519
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 520
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 522
			} else {
				this.animate(var1, var2); // L: 496
			}
		}
	} // L: 497 523

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lft;I[ZZZ)V"
	)
	public void method5860(Skeleton var1, class142 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class279 var7 = var1.method5407(); // L: 526
		if (var7 != null) { // L: 527
			var7.method5346(var2, var3, var4, var5); // L: 528
			if (var6) { // L: 529
				this.method5800(var7, var2.method3205()); // L: 530
			}
		}

		if (!var5 && var2.method3206()) { // L: 533
			this.method5771(var2, var3); // L: 534
		}

	} // L: 536

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llf;I[IZ)V"
	)
	public void method5775(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) { // L: 539
			this.animate(var1, var2); // L: 540
		} else {
			Animation var5 = var1.frames[var2]; // L: 543
			Skeleton var6 = var5.skeleton; // L: 544
			byte var7 = 0; // L: 545
			int var11 = var7 + 1; // L: 546
			int var8 = var3[var7];
			Model_transformTempX = 0; // L: 547
			Model_transformTempY = 0; // L: 548
			Model_transformTempZ = 0; // L: 549

			for (int var9 = 0; var9 < var5.transformCount; ++var9) { // L: 550
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) { // L: 551 552
				}

				if (var4) { // L: 553
					if (var10 == var8 || var6.transformTypes[var10] == 0) { // L: 554
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]); // L: 557
				}
			}

		}
	} // L: 541 560

	@ObfuscatedName("af")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 563
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 564
			var7 = 0; // L: 565
			Model_transformTempX = 0; // L: 566
			Model_transformTempY = 0; // L: 567
			Model_transformTempZ = 0; // L: 568

			for (var8 = 0; var8 < var6; ++var8) { // L: 569
				int var18 = var2[var8]; // L: 570
				if (var18 < this.vertexLabels.length) { // L: 571
					int[] var19 = this.vertexLabels[var18]; // L: 572

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 573
						var12 = var19[var11]; // L: 574
						Model_transformTempX += this.verticesX[var12]; // L: 575
						Model_transformTempY += this.verticesY[var12]; // L: 576
						Model_transformTempZ += this.verticesZ[var12]; // L: 577
						++var7; // L: 578
					}
				}
			}

			if (var7 > 0) { // L: 582
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 583
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 584
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 585
			} else {
				Model_transformTempX = var3; // L: 588
				Model_transformTempY = var4; // L: 589
				Model_transformTempZ = var5; // L: 590
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 594
				for (var7 = 0; var7 < var6; ++var7) { // L: 595
					var8 = var2[var7]; // L: 596
					if (var8 < this.vertexLabels.length) { // L: 597
						var9 = this.vertexLabels[var8]; // L: 598

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 599
							var11 = var9[var10]; // L: 600
							var10000 = this.verticesX; // L: 601
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 602
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 603
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 609
				for (var7 = 0; var7 < var6; ++var7) { // L: 610
					var8 = var2[var7]; // L: 611
					if (var8 < this.vertexLabels.length) { // L: 612
						var9 = this.vertexLabels[var8]; // L: 613

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 614
							var11 = var9[var10]; // L: 615
							var10000 = this.verticesX; // L: 616
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 617
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 618
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 619
							int var13 = (var4 & 255) * 8; // L: 620
							int var14 = (var5 & 255) * 8; // L: 621
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 622
								var15 = field3105[var14]; // L: 623
								var16 = field3147[var14]; // L: 624
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 625
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 626
								this.verticesX[var11] = var17; // L: 627
							}

							if (var12 != 0) { // L: 629
								var15 = field3105[var12]; // L: 630
								var16 = field3147[var12]; // L: 631
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 632
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 633
								this.verticesY[var11] = var17; // L: 634
							}

							if (var13 != 0) { // L: 636
								var15 = field3105[var13]; // L: 637
								var16 = field3147[var13]; // L: 638
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 639
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 640
								this.verticesX[var11] = var17; // L: 641
							}

							var10000 = this.verticesX; // L: 643
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 644
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 645
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 651
				for (var7 = 0; var7 < var6; ++var7) { // L: 652
					var8 = var2[var7]; // L: 653
					if (var8 < this.vertexLabels.length) { // L: 654
						var9 = this.vertexLabels[var8]; // L: 655

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 656
							var11 = var9[var10]; // L: 657
							var10000 = this.verticesX; // L: 658
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 659
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 660
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 661
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 662
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 663
							var10000 = this.verticesX; // L: 664
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 665
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 666
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 672
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 673
					for (var7 = 0; var7 < var6; ++var7) { // L: 674
						var8 = var2[var7]; // L: 675
						if (var8 < this.faceLabelsAlpha.length) { // L: 676
							var9 = this.faceLabelsAlpha[var8]; // L: 677

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 678
								var11 = var9[var10]; // L: 679
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 680
								if (var12 < 0) { // L: 681
									var12 = 0;
								} else if (var12 > 255) { // L: 682
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 683
							}
						}
					}
				}

			}
		}
	} // L: 592 607 649 670 688 690

	@ObfuscatedName("am")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 693
			int var2 = this.verticesX[var1]; // L: 694
			this.verticesX[var1] = this.verticesZ[var1]; // L: 695
			this.verticesZ[var1] = -var2; // L: 696
		}

		this.resetBounds(); // L: 698
	} // L: 699

	@ObfuscatedName("ar")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 702
			this.verticesX[var1] = -this.verticesX[var1]; // L: 703
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 704
		}

		this.resetBounds(); // L: 706
	} // L: 707

	@ObfuscatedName("bt")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 710
			int var2 = this.verticesZ[var1]; // L: 711
			this.verticesZ[var1] = this.verticesX[var1]; // L: 712
			this.verticesX[var1] = -var2; // L: 713
		}

		this.resetBounds(); // L: 715
	} // L: 716

	@ObfuscatedName("bj")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field3105[var1]; // L: 719
		int var3 = field3147[var1]; // L: 720

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 721
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 722
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 723
			this.verticesY[var4] = var5; // L: 724
		}

		this.resetBounds(); // L: 726
	} // L: 727

	@ObfuscatedName("be")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 730
			int[] var10000 = this.verticesX; // L: 731
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 732
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 733
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 735
	} // L: 736

	@ObfuscatedName("bm")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 739
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 740
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 741
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 742
		}

		this.resetBounds(); // L: 744
	} // L: 745

	@ObfuscatedName("bo")
	public final void method5783(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 748
			this.method5766();
		}

		int var8 = Rasterizer3D.method5251(); // L: 749
		int var9 = Rasterizer3D.method5246(); // L: 750
		int var10 = field3105[var1]; // L: 751
		int var11 = field3147[var1]; // L: 752
		int var12 = field3105[var2]; // L: 753
		int var13 = field3147[var2]; // L: 754
		int var14 = field3105[var3]; // L: 755
		int var15 = field3147[var3]; // L: 756
		int var16 = field3105[var4]; // L: 757
		int var17 = field3147[var4]; // L: 758
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 759

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 760
			int var20 = this.verticesX[var19]; // L: 761
			int var21 = this.verticesY[var19]; // L: 762
			int var22 = this.verticesZ[var19]; // L: 763
			int var23;
			if (var3 != 0) { // L: 764
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 765
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 766
				var20 = var23; // L: 767
			}

			if (var1 != 0) { // L: 769
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 770
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 771
				var21 = var23; // L: 772
			}

			if (var2 != 0) { // L: 774
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 775
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 776
				var20 = var23; // L: 777
			}

			var20 += var5; // L: 779
			var21 += var6; // L: 780
			var22 += var7; // L: 781
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 782
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 783
			field3094[var19] = var22 - var18; // L: 785
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.method5257() / var22; // L: 786
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.method5257() / var22; // L: 787
			field3123[var19] = class386.method7177(var22); // L: 788
			if (this.field3108 > 0) { // L: 789
				field3146[var19] = var20; // L: 790
				field3141[var19] = var23; // L: 791
				field3124[var19] = var22; // L: 792
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 796
		} catch (Exception var25) { // L: 798
		}

	} // L: 799

	@ObfuscatedName("bi")
	public final void method5784(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 802
			this.method5766();
		}

		int var9 = Rasterizer3D.method5251(); // L: 803
		int var10 = Rasterizer3D.method5246(); // L: 804
		int var11 = field3105[var1]; // L: 805
		int var12 = field3147[var1]; // L: 806
		int var13 = field3105[var2]; // L: 807
		int var14 = field3147[var2]; // L: 808
		int var15 = field3105[var3]; // L: 809
		int var16 = field3147[var3]; // L: 810
		int var17 = field3105[var4]; // L: 811
		int var18 = field3147[var4]; // L: 812
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 813

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 814
			int var21 = this.verticesX[var20]; // L: 815
			int var22 = this.verticesY[var20]; // L: 816
			int var23 = this.verticesZ[var20]; // L: 817
			int var24;
			if (var3 != 0) { // L: 818
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 819
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 820
				var21 = var24; // L: 821
			}

			if (var1 != 0) { // L: 823
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 824
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 825
				var22 = var24; // L: 826
			}

			if (var2 != 0) { // L: 828
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 829
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 830
				var21 = var24; // L: 831
			}

			var21 += var5; // L: 833
			var22 += var6; // L: 834
			var23 += var7; // L: 835
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 836
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 837
			field3094[var20] = var23 - var19; // L: 839
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.method5257() / var8; // L: 840
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.method5257() / var8; // L: 841
			field3123[var20] = class386.method7177(var8); // L: 842
			if (this.field3108 > 0) { // L: 843
				field3146[var20] = var21; // L: 844
				field3141[var20] = var24; // L: 845
				field3124[var20] = var23; // L: 846
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 850
		} catch (Exception var26) { // L: 852
		}

	} // L: 853

	@ObfuscatedName("ba")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 865
			this.calculateBoundsCylinder();
		}

		this.method5755(var1); // L: 866
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 867
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 868
		int var13 = var3 * this.xzRadius >> 16; // L: 869
		int var14 = var12 + var13; // L: 870
		if (var14 > 50 && var12 < class280.method5369()) { // L: 871
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 872
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.method5257(); // L: 873
			if (var16 / var14 < Rasterizer3D.method5254()) { // L: 874
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.method5257(); // L: 875
				if (var17 / var14 > Rasterizer3D.method5252()) { // L: 876
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 877
					int var19 = var2 * this.xzRadius >> 16; // L: 878
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 879
					int var21 = (var18 + var20) * Rasterizer3D.method5257(); // L: 880
					if (var21 / var14 > Rasterizer3D.method5271()) { // L: 881
						int var22 = (var3 * super.height >> 16) + var19; // L: 882
						int var23 = (var18 - var22) * Rasterizer3D.method5257(); // L: 883
						if (var23 / var14 < Rasterizer3D.method5255()) { // L: 884
							int var24 = var13 + (var2 * super.height >> 16); // L: 885
							boolean var25 = false; // L: 886
							boolean var26 = false; // L: 887
							if (var12 - var24 <= 50) { // L: 888
								var26 = true;
							}

							boolean var27 = var26 || this.field3108 > 0; // L: 889
							int var28 = ViewportMouse.ViewportMouse_x; // L: 892
							int var30 = class225.method4306(); // L: 895
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport; // L: 898
							boolean var34 = var9 != 0L; // L: 903
							boolean var35;
							if (var34) { // L: 904
								var35 = (int)(var9 >>> 16 & 1L) == 1; // L: 907
								var34 = !var35; // L: 909
							}

							var35 = false; // L: 914
							int var37;
							int var38;
							int var39;
							if (var34 && var31) { // L: 915
								boolean var36 = false; // L: 916
								if (field3143) { // L: 917
									var36 = WorldMapRegion.method4785(this, var1, var6, var7, var8, var2, var3, var4, var5); // L: 918
								} else {
									var37 = var12 - var13; // L: 921
									if (var37 <= 50) { // L: 922
										var37 = 50;
									}

									if (var15 > 0) { // L: 923
										var16 /= var14; // L: 924
										var17 /= var37; // L: 925
									} else {
										var17 /= var14; // L: 928
										var16 /= var37; // L: 929
									}

									if (var18 > 0) { // L: 931
										var23 /= var14; // L: 932
										var21 /= var37; // L: 933
									} else {
										var21 /= var14; // L: 936
										var23 /= var37; // L: 937
									}

									var38 = var28 - Rasterizer3D.method5251(); // L: 939
									var39 = var30 - Rasterizer3D.method5246(); // L: 940
									if (var38 > var16 && var38 < var17 && var39 > var23 && var39 < var21) { // L: 941
										var36 = true; // L: 942
									}
								}

								if (var36) { // L: 945
									if (this.isSingleTile) { // L: 946
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 949
									} else {
										var35 = true; // L: 952
									}
								}
							}

							int var49 = Rasterizer3D.method5251(); // L: 955
							var37 = Rasterizer3D.method5246(); // L: 956
							var38 = 0; // L: 957
							var39 = 0; // L: 958
							if (var1 != 0) { // L: 959
								var38 = field3105[var1]; // L: 960
								var39 = field3147[var1]; // L: 961
							}

							for (int var40 = 0; var40 < this.verticesCount; ++var40) { // L: 963
								int var41 = this.verticesX[var40]; // L: 964
								int var42 = this.verticesY[var40]; // L: 965
								int var43 = this.verticesZ[var40]; // L: 966
								int var44;
								if (var1 != 0) { // L: 967
									var44 = var43 * var38 + var41 * var39 >> 16; // L: 968
									var43 = var43 * var39 - var41 * var38 >> 16; // L: 969
									var41 = var44; // L: 970
								}

								var41 += var6; // L: 972
								var42 += var7; // L: 973
								var43 += var8; // L: 974
								var44 = var43 * var4 + var5 * var41 >> 16; // L: 975
								var43 = var5 * var43 - var41 * var4 >> 16; // L: 976
								var41 = var44; // L: 977
								var44 = var3 * var42 - var43 * var2 >> 16; // L: 978
								var43 = var42 * var2 + var3 * var43 >> 16; // L: 979
								field3094[var40] = var43 - var12; // L: 981
								if (var43 >= 50) { // L: 982
									modelViewportXs[var40] = var49 + var41 * Rasterizer3D.method5257() / var43; // L: 983
									modelViewportYs[var40] = var37 + var44 * Rasterizer3D.method5257() / var43; // L: 984
									field3123[var40] = class386.method7177(var43); // L: 985
								} else {
									modelViewportXs[var40] = -5000; // L: 988
									var25 = true; // L: 989
								}

								if (var27) { // L: 991
									field3146[var40] = var41; // L: 992
									field3141[var40] = var44; // L: 993
									field3124[var40] = var43; // L: 994
								}
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9); // L: 998
							} catch (Exception var48) { // L: 1000
							}

						}
					}
				}
			}
		}
	} // L: 1001

	@ObfuscatedName("bg")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 1070
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 1071
				field3126[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 1072

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 1073
				if (this.faceColors3[var7] != -2) { // L: 1074
					var8 = this.indices1[var7]; // L: 1075
					var9 = this.indices2[var7]; // L: 1076
					var10 = this.indices3[var7]; // L: 1077
					var11 = modelViewportXs[var8]; // L: 1078
					var12 = modelViewportXs[var9]; // L: 1079
					var28 = modelViewportXs[var10]; // L: 1080
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 1081
						if (var2 && class47.method902(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) { // L: 1107
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1110
							var2 = false; // L: 1112
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1114
							field3120[var7] = false; // L: 1115
							var29 = Rasterizer3D.method5258(); // L: 1116
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) { // L: 1117
								field3116[var7] = false; // L: 1118
							} else {
								field3116[var7] = true;
							}

							var15 = (field3094[var8] + field3094[var9] + field3094[var10]) / 3 + this.radius; // L: 1119
							field3130[var15][field3126[var15]++] = var7; // L: 1120
						}
					} else {
						var29 = field3146[var8]; // L: 1082
						var15 = field3146[var9]; // L: 1083
						var16 = field3146[var10]; // L: 1084
						int var30 = field3141[var8]; // L: 1085
						var18 = field3141[var9]; // L: 1086
						int var19 = field3141[var10]; // L: 1087
						int var20 = field3124[var8]; // L: 1088
						int var21 = field3124[var9]; // L: 1089
						int var22 = field3124[var10]; // L: 1090
						var29 -= var15; // L: 1091
						var16 -= var15; // L: 1092
						var30 -= var18; // L: 1093
						var19 -= var18; // L: 1094
						var20 -= var21; // L: 1095
						var22 -= var21; // L: 1096
						int var23 = var30 * var22 - var20 * var19; // L: 1097
						int var24 = var20 * var16 - var29 * var22; // L: 1098
						int var25 = var29 * var19 - var30 * var16; // L: 1099
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 1100
							field3120[var7] = true; // L: 1101
							int var26 = (field3094[var8] + field3094[var9] + field3094[var10]) / 3 + this.radius; // L: 1102
							field3130[var26][field3126[var26]++] = var7; // L: 1103
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1124
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1125
					var34 = field3126[var33]; // L: 1126
					if (var34 > 0) { // L: 1127
						var27 = field3130[var33]; // L: 1128

						for (var10 = 0; var10 < var34; ++var10) { // L: 1129
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1134
					field3131[var33] = 0; // L: 1135
					field3145[var33] = 0; // L: 1136
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1138
					var34 = field3126[var33]; // L: 1139
					if (var34 > 0) { // L: 1140
						var27 = field3130[var33]; // L: 1141

						for (var10 = 0; var10 < var34; ++var10) { // L: 1142
							char var35 = var27[var10]; // L: 1143
							byte var36 = this.faceRenderPriorities[var35]; // L: 1144
							var28 = field3131[var36]++; // L: 1145
							field3132[var36][var28] = var35; // L: 1146
							if (var36 < 10) { // L: 1147
								int[] var37 = field3145;
								var37[var36] += var33;
							} else if (var36 == 10) { // L: 1148
								field3086[var28] = var33;
							} else {
								field3139[var28] = var33; // L: 1149
							}
						}
					}
				}

				var33 = 0; // L: 1153
				if (field3131[1] > 0 || field3131[2] > 0) { // L: 1154
					var33 = (field3145[1] + field3145[2]) / (field3131[1] + field3131[2]);
				}

				var8 = 0; // L: 1155
				if (field3131[3] > 0 || field3131[4] > 0) { // L: 1156
					var8 = (field3145[3] + field3145[4]) / (field3131[3] + field3131[4]);
				}

				var9 = 0; // L: 1157
				if (field3131[6] > 0 || field3131[8] > 0) { // L: 1158
					var9 = (field3145[8] + field3145[6]) / (field3131[8] + field3131[6]);
				}

				var11 = 0; // L: 1160
				var12 = field3131[10]; // L: 1161
				int[] var13 = field3132[10]; // L: 1162
				int[] var14 = field3086; // L: 1163
				if (var11 == var12) { // L: 1164
					var11 = 0; // L: 1165
					var12 = field3131[11]; // L: 1166
					var13 = field3132[11]; // L: 1167
					var14 = field3139; // L: 1168
				}

				if (var11 < var12) { // L: 1170
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1171
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1172
					while (var15 == 0 && var10 > var33) { // L: 1173
						this.drawFace(var13[var11++]); // L: 1174
						if (var11 == var12 && var13 != field3132[11]) { // L: 1175
							var11 = 0; // L: 1176
							var12 = field3131[11]; // L: 1177
							var13 = field3132[11]; // L: 1178
							var14 = field3139; // L: 1179
						}

						if (var11 < var12) { // L: 1181
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1182
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1184
						this.drawFace(var13[var11++]); // L: 1185
						if (var11 == var12 && var13 != field3132[11]) { // L: 1186
							var11 = 0; // L: 1187
							var12 = field3131[11]; // L: 1188
							var13 = field3132[11]; // L: 1189
							var14 = field3139; // L: 1190
						}

						if (var11 < var12) { // L: 1192
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1193
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1195
						this.drawFace(var13[var11++]); // L: 1196
						if (var11 == var12 && var13 != field3132[11]) { // L: 1197
							var11 = 0; // L: 1198
							var12 = field3131[11]; // L: 1199
							var13 = field3132[11]; // L: 1200
							var14 = field3139; // L: 1201
						}

						if (var11 < var12) { // L: 1203
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1204
						}
					}

					var16 = field3131[var15]; // L: 1206
					int[] var17 = field3132[var15]; // L: 1207

					for (var18 = 0; var18 < var16; ++var18) { // L: 1208
						this.drawFace(var17[var18]); // L: 1209
					}
				}

				while (var10 != -1000) { // L: 1212
					this.drawFace(var13[var11++]); // L: 1213
					if (var11 == var12 && var13 != field3132[11]) { // L: 1214
						var11 = 0; // L: 1215
						var13 = field3132[11]; // L: 1216
						var12 = field3131[11]; // L: 1217
						var14 = field3139; // L: 1218
					}

					if (var11 < var12) { // L: 1220
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1221
					}
				}

			}
		}
	} // L: 1132 1223

	@ObfuscatedName("bs")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field3120[var1]) { // L: 1226
			this.method5792(var1); // L: 1227
		} else {
			int var2 = this.indices1[var1]; // L: 1230
			int var3 = this.indices2[var1]; // L: 1231
			int var4 = this.indices3[var1]; // L: 1232
			Rasterizer3D.field2876.field3192 = field3116[var1]; // L: 1233
			if (this.faceAlphas == null) { // L: 1234
				Rasterizer3D.field2876.field3186 = 0; // L: 1235
			} else {
				Rasterizer3D.field2876.field3186 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255; // L: 1238
			}

			this.method5864(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field3123[var2], field3123[var3], field3123[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1240
		}
	} // L: 1228 1241

	@ObfuscatedName("bp")
	boolean method5870(int var1) {
		return this.overrideAmount > 0 && var1 < this.field3156; // L: 1244
	}

	@ObfuscatedName("bx")
	final void method5864(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1248
			int var15;
			int var16;
			int var18;
			if (this.field3100 != null && this.field3100[var1] != -1) { // L: 1267
				int var17 = this.field3100[var1] & 255; // L: 1268
				var18 = this.field3104[var17]; // L: 1269
				var15 = this.field3134[var17]; // L: 1270
				var16 = this.field3111[var17]; // L: 1271
			} else {
				var18 = this.indices1[var1]; // L: 1274
				var15 = this.indices2[var1]; // L: 1275
				var16 = this.indices3[var1]; // L: 1276
			}

			if (this.faceColors3[var1] == -1) { // L: 1278
				Rasterizer3D.method5267(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3146[var18], field3146[var15], field3146[var16], field3141[var18], field3141[var15], field3141[var16], field3124[var18], field3124[var15], field3124[var16], this.faceTextures[var1]); // L: 1279
			} else {
				Rasterizer3D.method5267(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3146[var18], field3146[var15], field3146[var16], field3141[var18], field3141[var15], field3141[var16], field3124[var18], field3124[var15], field3124[var16], this.faceTextures[var1]); // L: 1282
			}
		} else {
			boolean var14 = this.method5870(var1); // L: 1249
			if (this.faceColors3[var1] == -1 && var14) { // L: 1250
				Rasterizer3D.method5270(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3135[this.faceColors1[var1]], this.field3152, this.field3106, this.field3154, this.overrideAmount); // L: 1251
			} else if (this.faceColors3[var1] == -1) { // L: 1253
				Rasterizer3D.method5266(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3135[this.faceColors1[var1]]); // L: 1254
			} else if (var14) { // L: 1256
				Rasterizer3D.method5269(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.field3152, this.field3106, this.field3154, this.overrideAmount); // L: 1257
			} else {
				Rasterizer3D.method5265(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13); // L: 1260
			}
		}

	} // L: 1285

	@ObfuscatedName("bu")
	final void method5792(int var1) {
		int var2 = Rasterizer3D.method5251(); // L: 1288
		int var3 = Rasterizer3D.method5246(); // L: 1289
		int var4 = 0; // L: 1290
		int var5 = this.indices1[var1]; // L: 1291
		int var6 = this.indices2[var1]; // L: 1292
		int var7 = this.indices3[var1]; // L: 1293
		int var8 = field3124[var5]; // L: 1294
		int var9 = field3124[var6]; // L: 1295
		int var10 = field3124[var7]; // L: 1296
		if (this.faceAlphas == null) { // L: 1297
			Rasterizer3D.field2876.field3186 = 0;
		} else {
			Rasterizer3D.field2876.field3186 = this.faceAlphas[var1] & 255; // L: 1298
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1299
			field3080[var4] = modelViewportXs[var5]; // L: 1300
			field3089[var4] = modelViewportYs[var5]; // L: 1301
			field3153[var4] = field3123[var7]; // L: 1302
			field3138[var4++] = this.faceColors1[var1]; // L: 1303
		} else {
			var11 = field3146[var5]; // L: 1306
			var12 = field3141[var5]; // L: 1307
			var13 = this.faceColors1[var1]; // L: 1308
			if (var10 >= 50) { // L: 1309
				var14 = field3149[var10 - var8] * (50 - var8); // L: 1310
				field3080[var4] = var2 + (var11 + ((field3146[var7] - var11) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1311
				field3089[var4] = var3 + (var12 + ((field3141[var7] - var12) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1312
				field3153[var4] = field3151; // L: 1313
				field3138[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1314
			}

			if (var9 >= 50) { // L: 1316
				var14 = field3149[var9 - var8] * (50 - var8); // L: 1317
				field3080[var4] = var2 + (var11 + ((field3146[var6] - var11) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1318
				field3089[var4] = var3 + (var12 + ((field3141[var6] - var12) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1319
				field3153[var4] = field3151; // L: 1320
				field3138[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1321
			}
		}

		if (var9 >= 50) { // L: 1324
			field3080[var4] = modelViewportXs[var6]; // L: 1325
			field3089[var4] = modelViewportYs[var6]; // L: 1326
			field3153[var4] = field3123[var7]; // L: 1327
			field3138[var4++] = this.faceColors2[var1]; // L: 1328
		} else {
			var11 = field3146[var6]; // L: 1331
			var12 = field3141[var6]; // L: 1332
			var13 = this.faceColors2[var1]; // L: 1333
			if (var8 >= 50) { // L: 1334
				var14 = field3149[var8 - var9] * (50 - var9); // L: 1335
				field3080[var4] = var2 + (var11 + ((field3146[var5] - var11) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1336
				field3089[var4] = var3 + (var12 + ((field3141[var5] - var12) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1337
				field3153[var4] = field3151; // L: 1338
				field3138[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1339
			}

			if (var10 >= 50) { // L: 1341
				var14 = field3149[var10 - var9] * (50 - var9); // L: 1342
				field3080[var4] = var2 + (var11 + ((field3146[var7] - var11) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1343
				field3089[var4] = var3 + (var12 + ((field3141[var7] - var12) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1344
				field3138[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1345
			}
		}

		if (var10 >= 50) { // L: 1348
			field3080[var4] = modelViewportXs[var7]; // L: 1349
			field3089[var4] = modelViewportYs[var7]; // L: 1350
			field3153[var4] = field3123[var7]; // L: 1351
			field3138[var4++] = this.faceColors3[var1]; // L: 1352
		} else {
			var11 = field3146[var7]; // L: 1355
			var12 = field3141[var7]; // L: 1356
			var13 = this.faceColors3[var1]; // L: 1357
			if (var9 >= 50) { // L: 1358
				var14 = field3149[var9 - var10] * (50 - var10); // L: 1359
				field3080[var4] = var2 + (var11 + ((field3146[var6] - var11) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1360
				field3089[var4] = var3 + (var12 + ((field3141[var6] - var12) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1361
				field3153[var4] = field3151; // L: 1362
				field3138[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1363
			}

			if (var8 >= 50) { // L: 1365
				var14 = field3149[var8 - var10] * (50 - var10); // L: 1366
				field3080[var4] = var2 + (var11 + ((field3146[var5] - var11) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1367
				field3089[var4] = var3 + (var12 + ((field3141[var5] - var12) * var14 >> 16)) * Rasterizer3D.method5257() / 50; // L: 1368
				field3153[var4] = field3151; // L: 1369
				field3138[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1370
			}
		}

		var11 = field3080[0]; // L: 1373
		var12 = field3080[1]; // L: 1374
		var13 = field3080[2]; // L: 1375
		var14 = field3089[0]; // L: 1376
		int var15 = field3089[1]; // L: 1377
		int var16 = field3089[2]; // L: 1378
		float var17 = field3153[0]; // L: 1379
		float var18 = field3153[1]; // L: 1380
		float var19 = field3153[2]; // L: 1381
		Rasterizer3D.field2876.field3192 = false; // L: 1382
		int var20 = Rasterizer3D.method5258(); // L: 1383
		if (var4 == 3) { // L: 1384
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) { // L: 1385
				Rasterizer3D.field2876.field3192 = true;
			}

			this.method5864(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3138[0], field3138[1], field3138[2]); // L: 1386
		}

		if (var4 == 4) { // L: 1388
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3080[3] < 0 || field3080[3] > var20) { // L: 1389
				Rasterizer3D.field2876.field3192 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1390
				int var23;
				int var25;
				if (this.field3100 != null && this.field3100[var1] != -1) { // L: 1415
					int var24 = this.field3100[var1] & 255; // L: 1416
					var25 = this.field3104[var24]; // L: 1417
					var22 = this.field3134[var24]; // L: 1418
					var23 = this.field3111[var24]; // L: 1419
				} else {
					var25 = var5; // L: 1422
					var22 = var6; // L: 1423
					var23 = var7; // L: 1424
				}

				short var26 = this.faceTextures[var1]; // L: 1426
				if (this.faceColors3[var1] == -1) { // L: 1427
					Rasterizer3D.method5267(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3146[var25], field3146[var22], field3146[var23], field3141[var25], field3141[var22], field3141[var23], field3124[var25], field3124[var22], field3124[var23], var26); // L: 1428
					Rasterizer3D.method5267(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3146[var25], field3146[var22], field3146[var23], field3141[var25], field3141[var22], field3141[var23], field3124[var25], field3124[var22], field3124[var23], var26); // L: 1429
				} else {
					Rasterizer3D.method5267(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3138[0], field3138[1], field3138[2], field3146[var25], field3146[var22], field3146[var23], field3141[var25], field3141[var22], field3141[var23], field3124[var25], field3124[var22], field3124[var23], var26); // L: 1432
					Rasterizer3D.method5267(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], field3138[0], field3138[2], field3138[3], field3146[var25], field3146[var22], field3146[var23], field3141[var25], field3141[var22], field3141[var23], field3124[var25], field3124[var22], field3124[var23], var26); // L: 1433
				}
			} else {
				boolean var21 = this.method5870(var1); // L: 1391
				if (this.faceColors3[var1] == -1 && var21) { // L: 1392
					var22 = field3135[this.faceColors1[var1]]; // L: 1393
					Rasterizer3D.method5270(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.field3152, this.field3106, this.field3154, this.overrideAmount); // L: 1394
					Rasterizer3D.method5270(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], var22, this.field3152, this.field3106, this.field3154, this.overrideAmount); // L: 1395
				} else if (this.faceColors3[var1] == -1) { // L: 1397
					var22 = field3135[this.faceColors1[var1]]; // L: 1398
					Rasterizer3D.method5266(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22); // L: 1399
					Rasterizer3D.method5266(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], var22); // L: 1400
				} else if (var21) { // L: 1402
					Rasterizer3D.method5269(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3138[0], field3138[1], field3138[2], this.field3152, this.field3154, this.field3106, this.overrideAmount); // L: 1403
					Rasterizer3D.method5269(var14, var16, field3089[3], var11, var13, field3080[3], 0.0F, 0.0F, 0.0F, field3138[0], field3138[2], field3138[3], this.field3152, this.field3154, this.field3106, this.overrideAmount); // L: 1404
				} else {
					Rasterizer3D.method5265(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3138[0], field3138[1], field3138[2]); // L: 1407
					Rasterizer3D.method5265(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], field3138[0], field3138[2], field3138[3]); // L: 1408
				}
			}
		}

	} // L: 1437

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILqg;)V"
	)
	void method5793(int var1, class424 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1440
		float var4 = (float)(-this.verticesY[var1]); // L: 1441
		float var5 = (float)(-this.verticesZ[var1]); // L: 1442
		float var6 = 1.0F; // L: 1443
		this.verticesX[var1] = (int)(var2.field4709[0] * var3 + var2.field4709[4] * var4 + var2.field4709[8] * var5 + var2.field4709[12] * var6); // L: 1444
		this.verticesY[var1] = -((int)(var2.field4709[1] * var3 + var2.field4709[5] * var4 + var2.field4709[9] * var5 + var2.field4709[13] * var6)); // L: 1445
		this.verticesZ[var1] = -((int)(var2.field4709[2] * var3 + var2.field4709[6] * var4 + var2.field4709[10] * var5 + var2.field4709[14] * var6)); // L: 1446
	} // L: 1447

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V"
	)
	void method5794(class279 var1, int var2) {
		if (this.field3109 != null) { // L: 1450
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1451
				int[] var4 = this.field3109[var3]; // L: 1452
				if (var4 != null && var4.length != 0) { // L: 1453
					int[] var5 = this.field3110[var3]; // L: 1454
					field3114.method7781(); // L: 1455

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1456
						int var7 = var4[var6]; // L: 1457
						class132 var8 = var1.method5343(var7); // L: 1458
						if (var8 != null) { // L: 1459
							field3085.method7783((float)var5[var6] / 255.0F); // L: 1460
							field3127.method7809(var8.method3093(var2)); // L: 1461
							field3127.method7785(field3085); // L: 1462
							field3114.method7782(field3127); // L: 1463
						}
					}

					this.method5793(var3, field3114); // L: 1465
				}
			}

		}
	} // L: 1467

	@ObfuscatedName("eh")
	void vmethod5778(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		int var12 = Rasterizer3D.Rasterizer3D_sine[var2]; // L: 857
		int var13 = Rasterizer3D.Rasterizer3D_cosine[var2]; // L: 858
		int var14 = Rasterizer3D.Rasterizer3D_sine[var3]; // L: 859
		int var15 = Rasterizer3D.Rasterizer3D_cosine[var3]; // L: 860
		this.draw(var1, var12, var13, var14, var15, var4 - var7, var5 - var8, var6 - var9, var10); // L: 861
	} // L: 862

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ILqg;IIIJ)V"
	)
	void vmethod5787(int var1, class424 var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) { // L: 1004
			this.calculateBoundsCylinder();
		}

		this.method5755(var1); // L: 1005
		class418 var8 = new class418(); // L: 1006
		var8.field4681 = new class423((float)((double)var1 * 0.0030679615D), 0.0F, 0.0F); // L: 1007
		var8.field4684 = new class422(1.0F, 1.0F, 1.0F); // L: 1008
		var8.field4682 = new class422((float)var3, (float)var4, (float)var5); // L: 1009
		class424 var9 = new class424(); // L: 1010
		var9.method7786(var8); // L: 1011
		var9.method7785(var2); // L: 1012
		int var10 = (int)var9.method7795(0.0F, 0.0F, 0.0F); // L: 1013
		boolean var11 = false; // L: 1014
		int var12 = Rasterizer3D.method5251(); // L: 1015
		int var13 = Rasterizer3D.method5246(); // L: 1016
		if (var1 != 0) { // L: 1017
		}

		for (int var14 = 0; var14 < this.verticesCount; ++var14) { // L: 1018
			int var15 = this.verticesX[var14]; // L: 1019
			int var16 = this.verticesY[var14]; // L: 1020
			int var17 = this.verticesZ[var14]; // L: 1021
			var9.method7792((float)var15, (float)var16, (float)var17, field3157); // L: 1022
			var15 = (int)field3157[0]; // L: 1023
			var16 = (int)field3157[1]; // L: 1024
			var17 = (int)field3157[2]; // L: 1025
			field3094[var14] = var17 - var10; // L: 1026
			if (var17 >= 50) { // L: 1027
				modelViewportXs[var14] = var12 + var15 * Rasterizer3D.method5257() / var17; // L: 1028
				modelViewportYs[var14] = var13 + var16 * Rasterizer3D.method5257() / var17; // L: 1029
				field3123[var14] = class386.method7177(var17); // L: 1030
			} else {
				modelViewportXs[var14] = -5000; // L: 1033
				var11 = true; // L: 1034
			}

			if (this.field3108 > 0) { // L: 1036
				field3146[var14] = var15; // L: 1037
				field3141[var14] = var16; // L: 1038
				field3124[var14] = var17; // L: 1039
			}
		}

		boolean var21 = ViewportMouse.ViewportMouse_isInViewport; // L: 1044
		boolean var22 = var21; // L: 1046
		if (var21) { // L: 1047
			boolean var24 = 0L != var6; // L: 1050
			if (var24) { // L: 1051
				boolean var18 = (int)(var6 >>> 16 & 1L) == 1; // L: 1054
				var24 = !var18; // L: 1056
			}

			var22 = var24; // L: 1060
		}

		boolean var23 = var22; // L: 1062

		try {
			this.draw0(var11, var23, this.isSingleTile, var6); // L: 1064
		} catch (Exception var20) { // L: 1066
		}

	} // L: 1067
}
