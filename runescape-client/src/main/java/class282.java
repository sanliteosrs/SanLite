import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class282 extends Renderable {
	@ObfuscatedName("ad")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("bq")
	static final int[] field2963;
	@ObfuscatedName("bd")
	static final int[] field2964;
	@ObfuscatedName("bz")
	static final int[] field2990;
	@ObfuscatedName("bk")
	static final int[] field2931;
	@ObfuscatedName("br")
	static final int[] field2925;
	@ObfuscatedName("bf")
	static final int[] field2951;
	@ObfuscatedName("cf")
	static final int[] field2993;
	@ObfuscatedName("aq")
	final int field2976;
	@ObfuscatedName("ag")
	public int field2966;
	@ObfuscatedName("ak")
	int field2920;
	@ObfuscatedName("ap")
	int field2921;
	@ObfuscatedName("an")
	int field2922;
	@ObfuscatedName("aj")
	int[][][] field2972;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[[Lki;"
	)
	class276[][][] field2924;
	@ObfuscatedName("ab")
	int field2989;
	@ObfuscatedName("ai")
	int field2926;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	class304[] field2927;
	@ObfuscatedName("au")
	int[][][] field2928;
	@ObfuscatedName("ay")
	int field2954;
	@ObfuscatedName("ao")
	int field2969;
	@ObfuscatedName("aa")
	public int field2917;
	@ObfuscatedName("as")
	int field2952;
	@ObfuscatedName("aw")
	int field2938;
	@ObfuscatedName("at")
	int field2939;
	@ObfuscatedName("af")
	int field2984;
	@ObfuscatedName("am")
	int field2941;
	@ObfuscatedName("ar")
	int field2942;
	@ObfuscatedName("bt")
	int field2943;
	@ObfuscatedName("bj")
	int field2944;
	@ObfuscatedName("be")
	int field2945;
	@ObfuscatedName("bm")
	int field2946;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	class304[] field2947;
	@ObfuscatedName("bi")
	boolean field2948;
	@ObfuscatedName("ba")
	int field2949;
	@ObfuscatedName("bg")
	int field2950;
	@ObfuscatedName("bs")
	int field2986;
	@ObfuscatedName("bp")
	public int field2934;
	@ObfuscatedName("bx")
	public int field2967;
	@ObfuscatedName("bu")
	boolean field2919;
	@ObfuscatedName("bl")
	int field2935;
	@ObfuscatedName("bc")
	int[] field2958;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[[Llq;"
	)
	Occluder[][] field2959;
	@ObfuscatedName("bb")
	int field2960;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Llq;"
	)
	Occluder[] field2961;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	NodeDeque field2962;
	@ObfuscatedName("cu")
	int[][] field2974;
	@ObfuscatedName("cn")
	int[][] field2975;
	@ObfuscatedName("ce")
	int[] field2998;
	@ObfuscatedName("co")
	int field2977;
	@ObfuscatedName("ch")
	int field2981;
	@ObfuscatedName("ct")
	int field2979;
	@ObfuscatedName("cd")
	int field2980;
	@ObfuscatedName("ck")
	final int field2957;
	@ObfuscatedName("cq")
	BitSet field2982;
	@ObfuscatedName("cs")
	BitSet field2983;
	@ObfuscatedName("cp")
	final int field2970;
	@ObfuscatedName("cy")
	final int field2985;
	@ObfuscatedName("cw")
	final int field2936;
	@ObfuscatedName("ci")
	final int field2987;
	@ObfuscatedName("cc")
	BitSet field2988;
	@ObfuscatedName("cr")
	BitSet field2965;
	@ObfuscatedName("cb")
	final int field2997;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1515787825
	)
	final int field2991;
	@ObfuscatedName("cj")
	final int field2992;
	@ObfuscatedName("cx")
	int field2968;
	@ObfuscatedName("ca")
	int field2994;
	@ObfuscatedName("df")
	int field2995;
	@ObfuscatedName("dd")
	int field2996;
	@ObfuscatedName("dg")
	int field2940;
	@ObfuscatedName("dr")
	int field2971;
	@ObfuscatedName("dn")
	int field2999;
	@ObfuscatedName("ds")
	int field3000;

	static {
		Scene_isLowDetail = false; // L: 12
		field2963 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 57
		field2964 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 58
		field2990 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 59
		field2931 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 60
		field2925 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 61
		field2951 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 62
		field2993 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 63
	}

	public class282(int var1, int var2, int var3, int var4, int var5, int[][][] var6) {
		this.field2989 = 0; // L: 19
		this.field2926 = 0; // L: 20
		this.field2927 = new class304[5000]; // L: 21
		this.field2954 = 0; // L: 28
		this.field2969 = 0; // L: 29
		this.field2917 = 0; // L: 30
		this.field2947 = new class304[100]; // L: 41
		this.field2948 = false; // L: 42
		this.field2949 = 0; // L: 43
		this.field2950 = 0; // L: 44
		this.field2986 = 0; // L: 45
		this.field2934 = -1; // L: 46
		this.field2967 = -1; // L: 47
		this.field2919 = false; // L: 48
		this.field2935 = 4; // L: 51
		this.field2958 = new int[this.field2935]; // L: 52
		this.field2959 = new Occluder[this.field2935][500]; // L: 53
		this.field2960 = 0; // L: 54
		this.field2961 = new Occluder[500]; // L: 55
		this.field2962 = new NodeDeque(); // L: 56
		this.field2974 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}}; // L: 68
		this.field2975 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}}; // L: 83
		this.field2998 = new int[9]; // L: 89
		this.field2920 = var2; // L: 116
		this.field2921 = var3; // L: 117
		this.field2922 = var4; // L: 118
		this.field2924 = new class276[var2][var3][var4]; // L: 119
		this.field2928 = new int[var2][var3 + 1][var4 + 1]; // L: 120
		this.field2972 = var6; // L: 121
		this.field2954 = var5; // L: 122
		this.field2976 = var1; // L: 123
		if (var1 != -1) { // L: 124
			this.field2957 = 0; // L: 125
			this.field2982 = null; // L: 126
			this.field2983 = null; // L: 127
			this.field2970 = 0; // L: 128
			this.field2985 = 0; // L: 129
			this.field2936 = 0; // L: 130
			this.field2987 = 0; // L: 131
			this.field2988 = null; // L: 132
			this.field2965 = null; // L: 133
			this.field2997 = 0; // L: 134
			this.field2991 = 0; // L: 135
			this.field2992 = 0; // L: 136
		} else {
			this.field2957 = 8386816; // L: 139
			this.field2982 = new BitSet(this.field2957); // L: 140
			this.field2983 = new BitSet(this.field2957); // L: 141
			this.field2970 = 1048352; // L: 142
			this.field2985 = 32761; // L: 143
			this.field2936 = 181; // L: 144
			this.field2987 = 9644832; // L: 145
			this.field2988 = new BitSet(this.field2987); // L: 146
			this.field2965 = new BitSet(this.field2987); // L: 147
			this.field2997 = 1071648; // L: 148
			this.field2991 = 1; // L: 149
			this.field2992 = 183; // L: 150
		}

		class280.method5371(var5); // L: 152
		this.method5414(); // L: 153
	} // L: 154

	@ObfuscatedName("aq")
	public void method5414() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.field2920; ++var1) { // L: 157
			for (var2 = 0; var2 < this.field2921; ++var2) { // L: 158
				for (int var3 = 0; var3 < this.field2922; ++var3) { // L: 159
					this.field2924[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < this.field2935; ++var1) { // L: 162
			for (var2 = 0; var2 < this.field2958[var1]; ++var2) { // L: 163
				this.field2959[var1][var2] = null;
			}

			this.field2958[var1] = 0; // L: 164
		}

		for (var1 = 0; var1 < this.field2926; ++var1) { // L: 166
			this.field2927[var1] = null; // L: 167
		}

		this.field2926 = 0; // L: 169

		for (var1 = 0; var1 < this.field2947.length; ++var1) { // L: 170
			this.field2947[var1] = null;
		}

	} // L: 171

	@ObfuscatedName("ad")
	public void method5653(int var1) {
		this.field2989 = var1; // L: 174

		for (int var2 = 0; var2 < this.field2921; ++var2) { // L: 175
			for (int var3 = 0; var3 < this.field2922; ++var3) { // L: 176
				if (this.field2924[var1][var2][var3] == null) { // L: 177
					this.field2924[var1][var2][var3] = new class276(var1, var2, var3);
				}
			}
		}

	} // L: 180

	@ObfuscatedName("ag")
	public void method5416(int var1, int var2) {
		class276 var3 = this.field2924[0][var1][var2]; // L: 183

		for (int var4 = 0; var4 < 3; ++var4) { // L: 184
			class276 var5 = this.field2924[var4][var1][var2] = this.field2924[var4 + 1][var1][var2]; // L: 185
			if (var5 != null) { // L: 186
				--var5.field2853; // L: 187

				for (int var6 = 0; var6 < var5.field2859; ++var6) { // L: 188
					class304 var7 = var5.field2860[var6]; // L: 189
					long var9 = var7.field3245; // L: 191
					int var11 = (int)(var9 >>> 14 & 3L); // L: 195
					boolean var8 = var11 == 2; // L: 197
					if (var8 && var7.field3239 == var1 && var2 == var7.field3233) { // L: 199
						--var7.field3234;
					}
				}
			}
		}

		if (this.field2924[0][var1][var2] == null) { // L: 203
			this.field2924[0][var1][var2] = new class276(0, var1, var2);
		}

		this.field2924[0][var1][var2].field2871 = var3; // L: 204
		this.field2924[3][var1][var2] = null; // L: 205
	} // L: 206

	@ObfuscatedName("ak")
	public void method5417(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Occluder var9 = new Occluder(); // L: 209
		var9.field3042 = var3 / 128; // L: 210
		var9.field3029 = var4 / 128; // L: 211
		var9.field3030 = var5 / 128; // L: 212
		var9.field3028 = var6 / 128; // L: 213
		var9.field3040 = var2; // L: 214
		var9.field3033 = var3; // L: 215
		var9.field3034 = var4; // L: 216
		var9.field3035 = var5; // L: 217
		var9.field3036 = var6; // L: 218
		var9.field3037 = var7; // L: 219
		var9.field3038 = var8; // L: 220
		this.field2959[var1][this.field2958[var1]++] = var9; // L: 221
	} // L: 222

	@ObfuscatedName("ap")
	public void method5418(int var1, int var2, int var3, int var4) {
		class276 var5 = this.field2924[var1][var2][var3]; // L: 225
		if (var5 != null) { // L: 226
			this.field2924[var1][var2][var3].field2850 = var4; // L: 227
		}
	} // L: 228

	@ObfuscatedName("an")
	public void method5473(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) { // L: 231
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false); // L: 232

			for (var22 = var1; var22 >= 0; --var22) { // L: 233
				if (this.field2924[var22][var2][var3] == null) {
					this.field2924[var22][var2][var3] = new class276(var22, var2, var3);
				}
			}

			this.field2924[var1][var2][var3].field2863 = var21; // L: 234
		} else if (var4 != 1) { // L: 237
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20); // L: 243

			for (var22 = var1; var22 >= 0; --var22) { // L: 244
				if (this.field2924[var22][var2][var3] == null) {
					this.field2924[var22][var2][var3] = new class276(var22, var2, var3);
				}
			}

			this.field2924[var1][var2][var3].field2854 = var23; // L: 245
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7); // L: 238

			for (var22 = var1; var22 >= 0; --var22) { // L: 239
				if (this.field2924[var22][var2][var3] == null) {
					this.field2924[var22][var2][var3] = new class276(var22, var2, var3);
				}
			}

			this.field2924[var1][var2][var3].field2863 = var21; // L: 240
		}
	} // L: 235 241 246

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIILkt;JI)V"
	)
	public void method5420(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 249
			class273 var9 = new class273(); // L: 250
			var9.field2817 = var5; // L: 251
			var9.field2813 = var2 * 8192 + 4096; // L: 252
			var9.field2814 = var3 * 128 + 64; // L: 253
			var9.field2815 = var4; // L: 254
			var9.field2816 = var6; // L: 255
			var9.field2812 = var8; // L: 256
			if (this.field2924[var1][var2][var3] == null) { // L: 257
				this.field2924[var1][var2][var3] = new class276(var1, var2, var3);
			}

			this.field2924[var1][var2][var3].field2857 = var9; // L: 258
		}
	} // L: 259

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIILkt;JLkt;Lkt;)V"
	)
	public void method5421(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		class271 var10 = new class271(); // L: 262
		var10.field2758 = var5; // L: 263
		var10.field2759 = var2 * 128 + 64; // L: 264
		var10.field2761 = var3 * 8192 + 4096; // L: 265
		var10.field2764 = var4; // L: 266
		var10.field2760 = var6; // L: 267
		var10.field2762 = var8; // L: 268
		var10.field2763 = var9; // L: 269
		int var11 = 0; // L: 270
		class276 var12 = this.field2924[var1][var2][var3]; // L: 271
		if (var12 != null) { // L: 272
			for (int var13 = 0; var13 < var12.field2859; ++var13) { // L: 273
				if ((var12.field2860[var13].field3246 & 256) == 256 && var12.field2860[var13].field3237 instanceof Model) { // L: 274
					Model var14 = (Model)var12.field2860[var13].field3237; // L: 275
					var14.calculateBoundsCylinder(); // L: 276
					if (var14.height > var11) { // L: 277
						var11 = var14.height;
					}
				}
			}
		}

		var10.field2765 = var11; // L: 281
		if (this.field2924[var1][var2][var3] == null) {
			this.field2924[var1][var2][var3] = new class276(var1, var2, var3); // L: 282
		}

		this.field2924[var1][var2][var3].field2858 = var10; // L: 283
	} // L: 284

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILkt;Lkt;IIJI)V"
	)
	public void method5422(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 287
			class301 var12 = new class301(); // L: 288
			var12.field3214 = var9; // L: 289
			var12.field3216 = var11; // L: 290
			var12.field3218 = var2 * 128 + 64; // L: 291
			var12.field3210 = var3 * 128 + 64; // L: 292
			var12.field3209 = var4; // L: 293
			var12.field3213 = var5; // L: 294
			var12.field3208 = var6; // L: 295
			var12.field3211 = var7; // L: 296
			var12.field3212 = var8; // L: 297

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.field2924[var13][var2][var3] == null) {
					this.field2924[var13][var2][var3] = new class276(var13, var2, var3); // L: 298
				}
			}

			this.field2924[var1][var2][var3].field2855 = var12; // L: 299
		}
	} // L: 300

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIILkt;Lkt;IIIIJI)V"
	)
	public void method5512(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 303
			class303 var14 = new class303(); // L: 304
			var14.field3221 = var11; // L: 305
			var14.field3230 = var13; // L: 306
			var14.field3222 = var2 * 128 + 64; // L: 307
			var14.field3231 = var3 * 128 + 64; // L: 308
			var14.field3229 = var4; // L: 309
			var14.field3220 = var5; // L: 310
			var14.field3228 = var6; // L: 311
			var14.field3227 = var7; // L: 312
			var14.field3224 = var8; // L: 313
			var14.field3225 = var9; // L: 314
			var14.field3226 = var10; // L: 315

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.field2924[var15][var2][var3] == null) {
					this.field2924[var15][var2][var3] = new class276(var15, var2, var3); // L: 316
				}
			}

			this.field2924[var1][var2][var3].field2856 = var14; // L: 317
		}
	} // L: 318

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILkt;IJI)Z"
	)
	public boolean method5424(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 321
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 322
			int var13 = var6 * 64 + var3 * 128; // L: 323
			return this.method5589(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 324
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIILkt;IJZ)Z"
	)
	public boolean method5425(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) { // L: 328
			return true;
		} else {
			int var11 = var2 - var5; // L: 329
			int var12 = var3 - var5; // L: 330
			int var13 = var5 + var2; // L: 331
			int var14 = var3 + var5; // L: 332
			if (var10) { // L: 333
				if (var7 > 640 && var7 < 1408) { // L: 334
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) { // L: 335
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) { // L: 336
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) { // L: 337
					var11 -= 128;
				}
			}

			var11 /= 128; // L: 339
			var12 /= 128; // L: 340
			var13 /= 128; // L: 341
			var14 /= 128; // L: 342
			return this.method5589(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 343
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIILkt;IJIIII)Z"
	)
	public boolean method5661(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.method5589(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 347 348
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILkt;IZJI)Z"
	)
	boolean method5589(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) { // L: 352
			for (var16 = var3; var16 < var3 + var5; ++var16) { // L: 353
				if (var15 < 0 || var16 < 0 || var15 >= this.field2921 || var16 >= this.field2922) { // L: 354
					return false;
				}

				class276 var23 = this.field2924[var1][var15][var16]; // L: 355
				if (var23 != null && var23.field2859 >= 5) { // L: 356
					return false;
				}
			}
		}

		class304 var21 = new class304(); // L: 359
		var21.field3245 = var12; // L: 360
		var21.field3246 = var14; // L: 361
		var21.field3234 = var1; // L: 362
		var21.field3238 = var6; // L: 363
		var21.field3236 = var7; // L: 364
		var21.field3243 = var8; // L: 365
		var21.field3237 = var9; // L: 366
		var21.field3240 = var10; // L: 367
		var21.field3239 = var2; // L: 368
		var21.field3233 = var3; // L: 369
		var21.field3241 = var2 + var4 - 1; // L: 370
		var21.field3242 = var3 + var5 - 1; // L: 371

		for (var16 = var2; var16 < var2 + var4; ++var16) { // L: 372
			for (int var17 = var3; var17 < var3 + var5; ++var17) { // L: 373
				int var18 = 0; // L: 374
				if (var16 > var2) { // L: 375
					++var18;
				}

				if (var16 < var2 + var4 - 1) { // L: 376
					var18 += 4;
				}

				if (var17 > var3) { // L: 377
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) { // L: 378
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.field2924[var19][var16][var17] == null) {
						this.field2924[var19][var16][var17] = new class276(var19, var16, var17); // L: 379
					}
				}

				class276 var22 = this.field2924[var1][var16][var17]; // L: 380
				var22.field2860[var22.field2859] = var21; // L: 381
				var22.field2869[var22.field2859] = var18; // L: 382
				var22.field2862 |= var18; // L: 384
				++var22.field2859; // L: 385
			}
		}

		if (var11) { // L: 388
			this.field2927[this.field2926++] = var21;
		}

		return true; // L: 389
	}

	@ObfuscatedName("ao")
	public void method5592() {
		for (int var1 = 0; var1 < this.field2926; ++var1) { // L: 393
			class304 var2 = this.field2927[var1]; // L: 394
			this.method5429(var2); // L: 395
			this.field2927[var1] = null; // L: 396
		}

		this.field2926 = 0; // L: 398
	} // L: 399

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	void method5429(class304 var1) {
		for (int var2 = var1.field3239; var2 <= var1.field3241; ++var2) { // L: 402
			for (int var3 = var1.field3233; var3 <= var1.field3242; ++var3) { // L: 403
				class276 var4 = this.field2924[var1.field3234][var2][var3]; // L: 404
				if (var4 != null) { // L: 405
					int var5;
					for (var5 = 0; var5 < var4.field2859; ++var5) { // L: 406
						if (var4.field2860[var5] == var1) { // L: 407
							--var4.field2859; // L: 408

							for (int var6 = var5; var6 < var4.field2859; ++var6) { // L: 409
								var4.field2860[var6] = var4.field2860[var6 + 1]; // L: 410
								var4.field2869[var6] = var4.field2869[var6 + 1]; // L: 411
							}

							var4.field2860[var4.field2859] = null; // L: 413
							break;
						}
					}

					var4.field2862 = 0; // L: 417

					for (var5 = 0; var5 < var4.field2859; ++var5) { // L: 418
						var4.field2862 |= var4.field2869[var5]; // L: 420
					}
				}
			}
		}

	} // L: 425

	@ObfuscatedName("as")
	public void method5515(int var1, int var2, int var3, int var4) {
		class276 var5 = this.field2924[var1][var2][var3]; // L: 428
		if (var5 != null) { // L: 429
			class303 var6 = var5.field2856; // L: 430
			if (var6 != null) { // L: 431
				var6.field3225 = var4 * var6.field3225 / 16; // L: 432
				var6.field3226 = var4 * var6.field3226 / 16; // L: 433
			}
		}
	} // L: 434

	@ObfuscatedName("aw")
	public void method5551(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 437
		if (var4 != null) {
			var4.field2855 = null; // L: 439
		}
	} // L: 438 440

	@ObfuscatedName("at")
	public void method5432(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 443
		if (var4 != null) {
			var4.field2856 = null; // L: 445
		}
	} // L: 444 446

	@ObfuscatedName("af")
	public void method5662(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 449
		if (var4 != null) { // L: 450
			for (int var5 = 0; var5 < var4.field2859; ++var5) { // L: 451
				class304 var6 = var4.field2860[var5]; // L: 452
				long var8 = var6.field3245; // L: 454
				int var10 = (int)(var8 >>> 14 & 3L); // L: 458
				boolean var7 = var10 == 2; // L: 460
				if (var7 && var2 == var6.field3239 && var3 == var6.field3233) { // L: 462
					this.method5429(var6); // L: 463
					return; // L: 464
				}
			}

		}
	} // L: 467

	@ObfuscatedName("am")
	public void method5434(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 470
		if (var4 != null) {
			var4.field2857 = null; // L: 472
		}
	} // L: 471 473

	@ObfuscatedName("ar")
	public void method5435(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 476
		if (var4 != null) {
			var4.field2858 = null; // L: 478
		}
	} // L: 477 479

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)Lla;"
	)
	public class301 method5528(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 482
		return var4 == null ? null : var4.field2855; // L: 483 484
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)Llu;"
	)
	public class303 method5437(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 488
		return var4 == null ? null : var4.field2856; // L: 489 490
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)Llp;"
	)
	public class304 method5438(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 494
		if (var4 == null) { // L: 495
			return null;
		} else {
			for (int var5 = 0; var5 < var4.field2859; ++var5) { // L: 496
				class304 var6 = var4.field2860[var5]; // L: 497
				long var8 = var6.field3245; // L: 499
				int var10 = (int)(var8 >>> 14 & 3L); // L: 503
				boolean var7 = var10 == 2; // L: 505
				if (var7 && var2 == var6.field3239 && var3 == var6.field3233) { // L: 507
					return var6;
				}
			}

			return null; // L: 509
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(III)Lkk;"
	)
	public class273 method5549(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 513
		return var4 != null && var4.field2857 != null ? var4.field2857 : null; // L: 514 515
	}

	@ObfuscatedName("bo")
	public long method5440(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 519
		return var4 != null && var4.field2855 != null ? var4.field2855.field3214 : 0L; // L: 520 521
	}

	@ObfuscatedName("bi")
	public long method5441(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 525
		return var4 != null && var4.field2856 != null ? var4.field2856.field3221 : 0L; // L: 526 527
	}

	@ObfuscatedName("ba")
	public long method5442(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 531
		if (var4 == null) { // L: 532
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.field2859; ++var5) { // L: 533
				class304 var6 = var4.field2860[var5]; // L: 534
				long var8 = var6.field3245; // L: 536
				int var10 = (int)(var8 >>> 14 & 3L); // L: 540
				boolean var7 = var10 == 2; // L: 542
				if (var7 && var2 == var6.field3239 && var3 == var6.field3233) { // L: 544
					return var6.field3245;
				}
			}

			return 0L; // L: 546
		}
	}

	@ObfuscatedName("bg")
	public long method5546(int var1, int var2, int var3) {
		class276 var4 = this.field2924[var1][var2][var3]; // L: 550
		return var4 != null && var4.field2857 != null ? var4.field2857.field2816 : 0L; // L: 551 552
	}

	@ObfuscatedName("bs")
	public int method5444(int var1, int var2, int var3, long var4) {
		class276 var6 = this.field2924[var1][var2][var3]; // L: 556
		if (var6 == null) { // L: 557
			return -1;
		} else if (var6.field2855 != null && var6.field2855.field3214 == var4) { // L: 558
			return var6.field2855.field3216 & 255;
		} else if (var6.field2856 != null && var6.field2856.field3221 == var4) { // L: 559
			return var6.field2856.field3230 & 255;
		} else if (var6.field2857 != null && var6.field2857.field2816 == var4) { // L: 560
			return var6.field2857.field2812 & 255;
		} else {
			for (int var7 = 0; var7 < var6.field2859; ++var7) { // L: 561
				if (var6.field2860[var7].field3245 == var4) { // L: 562
					return var6.field2860[var7].field3246 & 255;
				}
			}

			return -1; // L: 564
		}
	}

	@ObfuscatedName("bp")
	public void method5494(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2920; ++var4) { // L: 568
			for (int var5 = 0; var5 < this.field2921; ++var5) { // L: 569
				for (int var6 = 0; var6 < this.field2922; ++var6) { // L: 570
					class276 var7 = this.field2924[var4][var5][var6]; // L: 571
					if (var7 != null) { // L: 572
						class301 var8 = var7.field2855; // L: 573
						ModelData var10;
						if (var8 != null && var8.field3213 instanceof ModelData) { // L: 574
							ModelData var9 = (ModelData)var8.field3213; // L: 575
							this.method5447(var9, var4, var5, var6, 1, 1); // L: 576
							if (var8.field3208 instanceof ModelData) { // L: 577
								var10 = (ModelData)var8.field3208; // L: 578
								this.method5447(var10, var4, var5, var6, 1, 1); // L: 579
								ModelData.method5179(var9, var10, 0, 0, 0, false); // L: 580
								var8.field3208 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 581
							}

							var8.field3213 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 583
						}

						for (int var12 = 0; var12 < var7.field2859; ++var12) { // L: 585
							class304 var14 = var7.field2860[var12]; // L: 586
							if (var14 != null && var14.field3237 instanceof ModelData) { // L: 587
								ModelData var11 = (ModelData)var14.field3237; // L: 588
								this.method5447(var11, var4, var5, var6, var14.field3241 - var14.field3239 + 1, var14.field3242 - var14.field3233 + 1); // L: 589
								var14.field3237 = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 590
							}
						}

						class273 var13 = var7.field2857; // L: 593
						if (var13 != null && var13.field2817 instanceof ModelData) { // L: 594
							var10 = (ModelData)var13.field2817; // L: 595
							this.method5640(var10, var4, var5, var6); // L: 596
							var13.field2817 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 597
						}
					}
				}
			}
		}

	} // L: 603

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lkr;III)V"
	)
	void method5640(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1; // L: 607
		int var7 = var4 - 1; // L: 608
		int var8 = var4 + 1; // L: 609

		for (int var9 = var3; var9 <= var6; ++var9) { // L: 610
			if (var9 >= 0 && var9 < this.field2921) { // L: 611
				for (int var10 = var7; var10 <= var8; ++var10) { // L: 612
					if (var10 >= 0 && var10 < this.field2922 && (var9 >= var6 || var10 >= var8)) { // L: 613 614
						class276 var11 = this.field2924[var2][var9][var10]; // L: 615
						if (var11 != null && var11.field2857 != null && var11.field2857.field2817 instanceof ModelData) { // L: 616 617
							int var12 = this.method5448(var2, var9, var10, var2, var3, var4); // L: 618
							ModelData var13 = (ModelData)var11.field2857.field2817; // L: 619
							ModelData.method5179(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true); // L: 620
						}
					}
				}
			}
		}

	} // L: 624

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lkr;IIIII)V"
	)
	void method5447(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 627
		int var8 = var3; // L: 628
		int var9 = var3 + var5; // L: 629
		int var10 = var4 - 1; // L: 630
		int var11 = var4 + var6; // L: 631

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 632
			if (var12 != this.field2920) { // L: 633
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 634
					if (var13 >= 0 && var13 < this.field2921) { // L: 635
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 636
							if (var14 >= 0 && var14 < this.field2922 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 637 638
								class276 var15 = this.field2924[var12][var13][var14]; // L: 639
								if (var15 != null) { // L: 640
									int var16 = this.method5448(var12, var13, var14, var2, var3, var4); // L: 641
									class301 var17 = var15.field2855; // L: 642
									if (var17 != null) { // L: 643
										ModelData var18;
										if (var17.field3213 instanceof ModelData) { // L: 644
											var18 = (ModelData)var17.field3213; // L: 645
											ModelData.method5179(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 646
										}

										if (var17.field3208 instanceof ModelData) { // L: 648
											var18 = (ModelData)var17.field3208; // L: 649
											ModelData.method5179(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 650
										}
									}

									for (int var23 = 0; var23 < var15.field2859; ++var23) { // L: 653
										class304 var19 = var15.field2860[var23]; // L: 654
										if (var19 != null && var19.field3237 instanceof ModelData) { // L: 655
											ModelData var20 = (ModelData)var19.field3237; // L: 656
											int var21 = var19.field3241 - var19.field3239 + 1; // L: 657
											int var22 = var19.field3242 - var19.field3233 + 1; // L: 658
											ModelData.method5179(var1, var20, (var21 - var5) * 64 + (var19.field3239 - var3) * 128, var16, (var19.field3233 - var4) * 128 + (var22 - var6) * 64, var7); // L: 659
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 664
				var7 = false; // L: 665
			}
		}

	} // L: 667

	@ObfuscatedName("by")
	int method5448(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method5650(var1, var2, var3) - this.method5650(var4, var5, var6); // L: 670
	}

	@ObfuscatedName("bw")
	int method5650(int var1, int var2, int var3) {
		return (this.field2972[var1][var2 + 1][var3 + 1] + this.field2972[var1][var2][var3] + this.field2972[var1][var2][var3 + 1] + this.field2972[var1][var2 + 1][var3]) / 4; // L: 674
	}

	@ObfuscatedName("bl")
	public void method5426(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		class276 var7 = this.field2924[var4][var5][var6]; // L: 678
		if (var7 != null) { // L: 679
			SceneTilePaint var8 = var7.field2863; // L: 680
			int var10;
			if (var8 != null) { // L: 681
				int var18 = var8.rgb; // L: 682
				if (var18 != 0) { // L: 683
					for (var10 = 0; var10 < 4; ++var10) { // L: 684
						var1[var2] = var18; // L: 685
						var1[var2 + 1] = var18; // L: 686
						var1[var2 + 2] = var18; // L: 687
						var1[var2 + 3] = var18; // L: 688
						var2 += var3; // L: 689
					}

				}
			} else {
				SceneTileModel var9 = var7.field2854; // L: 693
				if (var9 != null) { // L: 694
					var10 = var9.shape; // L: 695
					int var11 = var9.rotation; // L: 696
					int var12 = var9.underlayRgb; // L: 697
					int var13 = var9.overlayRgb; // L: 698
					int[] var14 = this.field2974[var10]; // L: 699
					int[] var15 = this.field2975[var11]; // L: 700
					int var16 = 0; // L: 701
					int var17;
					if (var12 != 0) { // L: 702
						for (var17 = 0; var17 < 4; ++var17) { // L: 703
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 704
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 705
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 706
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 707
							var2 += var3; // L: 708
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 712
							if (var14[var15[var16++]] != 0) { // L: 713
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 714
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 715
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 716
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 717
						}
					}

				}
			}
		}
	} // L: 691 720

	@ObfuscatedName("bc")
	public void method5451(int var1) {
		this.field2954 = class154.method3321(25, 90, var1); // L: 723
		class280.method5371(this.field2954); // L: 724
		if (this.field2998 != null && this.field2998.length > 0) { // L: 725
			this.method5464(this.field2998, this.field2977, this.field2981, this.field2979, this.field2980); // L: 726
		}

	} // L: 728

	@ObfuscatedName("bv")
	boolean method5452(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2936 + var2 * this.field2970 + var3 * this.field2985); // L: 731
	}

	@ObfuscatedName("bb")
	boolean method5524(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2936 + var2 * this.field2970 + var3 * this.field2985, var6); // L: 735
		return var6; // L: 736
	}

	@ObfuscatedName("bn")
	boolean method5632(int var1, int var2, int var3, int var4) {
		return this.method5452(this.field2982, var1, var2, var3, var4); // L: 740
	}

	@ObfuscatedName("bh")
	boolean method5455(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5524(this.field2982, var1, var2, var3, var4, var5); // L: 744
	}

	@ObfuscatedName("bq")
	boolean method5456(int var1, int var2, int var3, int var4) {
		return this.method5452(this.field2983, var1, var2, var3, var4); // L: 748
	}

	@ObfuscatedName("bd")
	boolean method5483(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5524(this.field2983, var1, var2, var3, var4, var5); // L: 752
	}

	@ObfuscatedName("bz")
	boolean method5458(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2992 + var3 * this.field2991 * 33489 + var2 * this.field2997); // L: 756
	}

	@ObfuscatedName("bk")
	boolean method5569(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2992 + var3 * this.field2991 * 33489 + var2 * this.field2997, var6); // L: 760
		return var6; // L: 761
	}

	@ObfuscatedName("br")
	boolean method5460(int var1, int var2, int var3, int var4) {
		return this.method5458(this.field2988, var1, var2, var3, var4); // L: 765
	}

	@ObfuscatedName("bf")
	boolean method5461(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5569(this.field2988, var1, var2, var3, var4, var5); // L: 769
	}

	@ObfuscatedName("cf")
	boolean method5462(int var1, int var2, int var3, int var4) {
		return this.method5458(this.field2965, var1, var2, var3, var4); // L: 773
	}

	@ObfuscatedName("cv")
	boolean method5463(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5569(this.field2965, var1, var2, var3, var4, var5); // L: 777
	}

	@ObfuscatedName("cl")
	public void method5464(int[] var1, int var2, int var3, int var4, int var5) {
		this.field2998 = var1; // L: 781
		this.field2977 = var2; // L: 782
		this.field2981 = var3; // L: 783
		this.field2979 = var4; // L: 784
		this.field2980 = var5; // L: 785
		this.field2940 = 0; // L: 786
		this.field2971 = 0; // L: 787
		this.field2999 = var4; // L: 788
		this.field3000 = var5; // L: 789
		this.field2995 = var4 / 2; // L: 790
		this.field2996 = var5 / 2; // L: 791
		this.field2983.set(0, this.field2983.size()); // L: 792
		this.field2965.set(0, this.field2965.size()); // L: 793
	} // L: 794

	@ObfuscatedName("cm")
	void method5465(int var1, int var2) {
		this.field2968 = var1; // L: 797
		this.field2994 = var2; // L: 798
	} // L: 799

	@ObfuscatedName("cg")
	boolean method5597(int var1, int var2) {
		if (!this.method5456(this.field2968, this.field2994, var1, var2)) { // L: 802
			return this.method5632(this.field2968, this.field2994, var1, var2); // L: 803
		} else {
			this.method5483(this.field2968, this.field2994, var1, var2, false); // L: 805
			boolean var3 = false; // L: 806

			for (int var4 = -1; var4 <= 1; ++var4) { // L: 807
				for (int var5 = -1; var5 <= 1; ++var5) { // L: 808
					if (this.method5480(this.field2968, this.field2994, var4 + var1 + 1, var5 + var2 + 1)) { // L: 809
						var3 = true; // L: 810
						var4 = 2; // L: 811
						break;
					}

					if (this.method5480(this.field2968, (this.field2994 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) { // L: 814
						var3 = true; // L: 815
						var4 = 2; // L: 816
						break; // L: 817
					}

					if (this.method5480(this.field2968 + 1, this.field2994, var4 + var1 + 1, var5 + var2 + 1)) { // L: 819
						var3 = true; // L: 820
						var4 = 2; // L: 821
						break; // L: 822
					}

					if (this.method5480(this.field2968 + 1, (this.field2994 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) { // L: 824
						var3 = true; // L: 825
						var4 = 2; // L: 826
						break; // L: 827
					}
				}
			}

			return this.method5455(this.field2968, this.field2994, var1, var2, var3); // L: 831
		}
	}

	@ObfuscatedName("cu")
	boolean method5480(int var1, int var2, int var3, int var4) {
		if (!this.method5462(var1, var2, var3, var4)) { // L: 835
			return this.method5460(var1, var2, var3, var4); // L: 836
		} else {
			this.method5463(var1, var2, var3, var4, false); // L: 838
			int var5 = var1 * 32 + 128; // L: 839
			int var6 = var2 * 64; // L: 840
			int var7 = (var3 - this.field2954 - 1) * 128; // L: 841
			int var8 = (var4 - this.field2954 - 1) * 128; // L: 842

			for (int var9 = -this.field2977; var9 <= this.field2981; var9 += 128) { // L: 843
				if (this.method5548(var7, var9 + this.field2998[var1], var8, var5, var6)) { // L: 844
					return this.method5461(var1, var2, var3, var4, true); // L: 845
				}
			}

			return this.method5461(var1, var2, var3, var4, false); // L: 848
		}
	}

	@ObfuscatedName("cn")
	boolean method5548(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = Rasterizer3D.Rasterizer3D_sine; // L: 852
		int[] var7 = Rasterizer3D.Rasterizer3D_cosine; // L: 853
		int var8 = var6[var4]; // L: 854
		int var9 = var7[var4]; // L: 855
		int var10 = var6[var5]; // L: 856
		int var11 = var7[var5]; // L: 857
		int var12 = var11 * var1 + var3 * var10 >> 16; // L: 858
		int var13 = var3 * var11 - var10 * var1 >> 16; // L: 859
		int var14 = var13 * var9 + var8 * var2 >> 16; // L: 860
		int var15 = var9 * var2 - var13 * var8 >> 16; // L: 861
		if (var14 >= 50 && var14 <= class280.method5369()) { // L: 862
			int var16 = var12 * 128 / var14 + this.field2995; // L: 865
			int var17 = var15 * 128 / var14 + this.field2996; // L: 866
			return var16 >= this.field2940 && var16 <= this.field2999 && var17 >= this.field2971 && var17 <= this.field3000; // L: 867
		} else {
			return false; // L: 863
		}
	}

	@ObfuscatedName("ce")
	public void method5469(int var1, int var2, int var3, boolean var4) {
		if (!this.method5617() || var4) { // L: 874
			this.field2948 = true; // L: 875
			this.field2919 = var4; // L: 876
			this.field2949 = var1; // L: 877
			this.field2950 = var2; // L: 878
			this.field2986 = var3; // L: 879
			this.field2934 = -1; // L: 880
			this.field2967 = -1; // L: 881
		}
	} // L: 882

	@ObfuscatedName("co")
	public void method5470() {
		this.field2919 = true; // L: 885
	} // L: 886

	@ObfuscatedName("ch")
	public boolean method5617() {
		return this.field2919 && this.field2934 != -1; // L: 889
	}

	@ObfuscatedName("ct")
	public void method5531() {
		this.field2934 = -1; // L: 893
		this.field2919 = false; // L: 894
	} // L: 895

	@ObfuscatedName("cd")
	public void method5505(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 898
			var1 = 0;
		} else if (var1 >= this.field2921 * 128) { // L: 899
			var1 = this.field2921 * 128 - 1;
		}

		if (var3 < 0) { // L: 900
			var3 = 0;
		} else if (var3 >= this.field2922 * 128) { // L: 901
			var3 = this.field2922 * 128 - 1;
		}

		if (var4 < 128) { // L: 902
			var4 = 128;
		} else if (var4 > 383) { // L: 903
			var4 = 383;
		}

		this.method5465((var4 - 128) / 32, var5 / 64); // L: 904
		this.field2944 = var1; // L: 905
		this.field2945 = var2; // L: 906
		this.field2946 = var3; // L: 907
		this.field2942 = var1 / 128; // L: 908
		this.field2943 = var3 / 128; // L: 909
		this.field2917 = var6; // L: 910
		class278 var7 = new class278(var1, var2, var3, var4, var5); // L: 911
		this.method5415(var7); // L: 912
	} // L: 913

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lln;)V"
	)
	void method5415(class290 var1) {
		++this.field2952; // L: 916
		this.field2938 = this.field2942 - this.field2954; // L: 917
		if (this.field2938 < 0) { // L: 918
			this.field2938 = 0;
		}

		this.field2984 = this.field2943 - this.field2954; // L: 919
		if (this.field2984 < 0) { // L: 920
			this.field2984 = 0;
		}

		this.field2939 = this.field2942 + this.field2954; // L: 921
		if (this.field2939 > this.field2921) { // L: 922
			this.field2939 = this.field2921;
		}

		this.field2941 = this.field2943 + this.field2954; // L: 923
		if (this.field2941 > this.field2922) { // L: 924
			this.field2941 = this.field2922;
		}

		if (this.field2976 == -1) { // L: 925
			this.method5478();
		}

		this.field2969 = 0; // L: 926

		int var2;
		class276[][] var3;
		int var4;
		int var5;
		for (var2 = this.field2989; var2 < this.field2920; ++var2) { // L: 927
			var3 = this.field2924[var2]; // L: 928

			for (var4 = this.field2938; var4 < this.field2939; ++var4) { // L: 929
				for (var5 = this.field2984; var5 < this.field2941; ++var5) { // L: 930
					class276 var11 = var3[var4][var5]; // L: 931
					if (var11 != null) { // L: 932
						if (var11.field2850 > this.field2917 || this.field2976 == -1 && !this.method5597(var4 - this.field2942 + this.field2954, var5 - this.field2943 + this.field2954) && this.field2972[var2][var4][var5] - this.field2945 < 2000) { // L: 933
							var11.field2864 = false; // L: 934
							var11.field2865 = false; // L: 935
							var11.field2867 = 0; // L: 936
						} else {
							var11.field2864 = true; // L: 939
							var11.field2865 = true; // L: 940
							if (var11.field2859 > 0) { // L: 941
								var11.field2866 = true;
							} else {
								var11.field2866 = false; // L: 942
							}

							++this.field2969; // L: 943
						}
					}
				}
			}
		}

		int var6;
		int var7;
		int var8;
		int var9;
		class276 var10;
		for (var2 = this.field2989; var2 < this.field2920; ++var2) { // L: 949
			var3 = this.field2924[var2]; // L: 950

			for (var4 = -this.field2954; var4 <= 0; ++var4) { // L: 951
				var5 = var4 + this.field2942; // L: 952
				var6 = this.field2942 - var4; // L: 953
				if (var5 >= this.field2938 || var6 < this.field2939) { // L: 954
					for (var7 = -this.field2954; var7 <= 0; ++var7) { // L: 955
						var8 = var7 + this.field2943; // L: 956
						var9 = this.field2943 - var7; // L: 957
						if (var5 >= this.field2938 && var5 < this.field2939) { // L: 958
							if (var8 >= this.field2984 && var8 < this.field2941) { // L: 959
								var10 = var3[var5][var8]; // L: 960
								if (var10 != null && var10.field2864) { // L: 961
									this.method5475(var1, var10, true);
								}
							}

							if (var9 >= this.field2984 && var9 < this.field2941) { // L: 963
								var10 = var3[var5][var9]; // L: 964
								if (var10 != null && var10.field2864) { // L: 965
									this.method5475(var1, var10, true);
								}
							}
						}

						if (var6 >= this.field2938 && var6 < this.field2939) { // L: 968
							if (var8 >= this.field2984 && var8 < this.field2941) { // L: 969
								var10 = var3[var6][var8]; // L: 970
								if (var10 != null && var10.field2864) { // L: 971
									this.method5475(var1, var10, true);
								}
							}

							if (var9 >= this.field2984 && var9 < this.field2941) { // L: 973
								var10 = var3[var6][var9]; // L: 974
								if (var10 != null && var10.field2864) { // L: 975
									this.method5475(var1, var10, true);
								}
							}
						}

						if (this.field2969 == 0) { // L: 978
							this.field2948 = false; // L: 979
							return; // L: 980
						}
					}
				}
			}
		}

		for (var2 = this.field2989; var2 < this.field2920; ++var2) { // L: 986
			var3 = this.field2924[var2]; // L: 987

			for (var4 = -this.field2954; var4 <= 0; ++var4) { // L: 988
				var5 = var4 + this.field2942; // L: 989
				var6 = this.field2942 - var4; // L: 990
				if (var5 >= this.field2938 || var6 < this.field2939) { // L: 991
					for (var7 = -this.field2954; var7 <= 0; ++var7) { // L: 992
						var8 = var7 + this.field2943; // L: 993
						var9 = this.field2943 - var7; // L: 994
						if (var5 >= this.field2938 && var5 < this.field2939) { // L: 995
							if (var8 >= this.field2984 && var8 < this.field2941) { // L: 996
								var10 = var3[var5][var8]; // L: 997
								if (var10 != null && var10.field2864) { // L: 998
									this.method5475(var1, var10, false);
								}
							}

							if (var9 >= this.field2984 && var9 < this.field2941) { // L: 1000
								var10 = var3[var5][var9]; // L: 1001
								if (var10 != null && var10.field2864) { // L: 1002
									this.method5475(var1, var10, false);
								}
							}
						}

						if (var6 >= this.field2938 && var6 < this.field2939) { // L: 1005
							if (var8 >= this.field2984 && var8 < this.field2941) { // L: 1006
								var10 = var3[var6][var8]; // L: 1007
								if (var10 != null && var10.field2864) { // L: 1008
									this.method5475(var1, var10, false);
								}
							}

							if (var9 >= this.field2984 && var9 < this.field2941) { // L: 1010
								var10 = var3[var6][var9]; // L: 1011
								if (var10 != null && var10.field2864) {
									this.method5475(var1, var10, false); // L: 1012
								}
							}
						}

						if (this.field2969 == 0) { // L: 1015
							this.field2948 = false; // L: 1016
							return; // L: 1017
						}
					}
				}
			}
		}

		this.field2948 = false; // L: 1023
	} // L: 1024

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lki;Z)V"
	)
	void method5475(class290 var1, class276 var2, boolean var3) {
		this.field2962.addFirst(var2); // L: 1027

		while (true) {
			class276 var4;
			int var5;
			int var6;
			int var7;
			int var8;
			class276[][] var9;
			class276 var10;
			int var12;
			int var15;
			int var16;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										class301 var11;
										class304 var13;
										int var17;
										int var18;
										int var19;
										boolean var20;
										int var21;
										class276 var36;
										while (true) {
											do {
												var4 = (class276)this.field2962.removeLast(); // L: 1029
												if (var4 == null) { // L: 1030
													return;
												}
											} while(!var4.field2865); // L: 1031

											var5 = var4.field2851; // L: 1032
											var6 = var4.field2861; // L: 1033
											var7 = var4.field2853; // L: 1034
											var8 = var4.field2852; // L: 1035
											var9 = this.field2924[var7]; // L: 1036
											if (!var4.field2864) { // L: 1037
												break;
											}

											if (var3) { // L: 1038
												if (var7 > 0) { // L: 1039
													var10 = this.field2924[var7 - 1][var5][var6]; // L: 1040
													if (var10 != null && var10.field2865) { // L: 1041
														continue;
													}
												}

												if (var5 <= this.field2942 && var5 > this.field2938) { // L: 1043
													var10 = var9[var5 - 1][var6]; // L: 1044
													if (var10 != null && var10.field2865 && (var10.field2864 || (var4.field2862 & 1) == 0)) { // L: 1045
														continue;
													}
												}

												if (var5 >= this.field2942 && var5 < this.field2939 - 1) { // L: 1047
													var10 = var9[var5 + 1][var6]; // L: 1048
													if (var10 != null && var10.field2865 && (var10.field2864 || (var4.field2862 & 4) == 0)) { // L: 1049
														continue;
													}
												}

												if (var6 <= this.field2943 && var6 > this.field2984) { // L: 1051
													var10 = var9[var5][var6 - 1]; // L: 1052
													if (var10 != null && var10.field2865 && (var10.field2864 || (var4.field2862 & 8) == 0)) { // L: 1053
														continue;
													}
												}

												if (var6 >= this.field2943 && var6 < this.field2941 - 1) { // L: 1055
													var10 = var9[var5][var6 + 1]; // L: 1056
													if (var10 != null && var10.field2865 && (var10.field2864 || (var4.field2862 & 2) == 0)) { // L: 1057
														continue;
													}
												}
											} else {
												var3 = true; // L: 1060
											}

											var4.field2864 = false; // L: 1061
											if (var4.field2871 != null) { // L: 1062
												var10 = var4.field2871; // L: 1063
												if (var10.field2863 != null) { // L: 1064
													if (!this.method5479(0, var5, var6)) { // L: 1065
														var1.vmethod5725(this, var10.field2863, 0, var5, var6);
													}
												} else if (var10.field2854 != null && !this.method5479(0, var5, var6)) { // L: 1067 1068
													var1.vmethod5739(this, var10.field2854, var5, var6);
												}

												var11 = var10.field2855; // L: 1070
												if (var11 != null) { // L: 1071
													var1.vmethod5737(var11.field3213, 0, var11.field3218 * 4096, var11.field3209, var11.field3210 * 4096, var11.field3214);
												}

												for (var12 = 0; var12 < var10.field2859; ++var12) { // L: 1072
													var13 = var10.field2860[var12]; // L: 1073
													if (var13 != null) { // L: 1074
														var1.vmethod5737(var13.field3237, var13.field3240, var13.field3238, var13.field3243, var13.field3236, var13.field3245);
													}
												}
											}

											var20 = false; // L: 1077
											if (var4.field2863 != null) { // L: 1078
												if (!this.method5479(var8, var5, var6)) { // L: 1079
													var20 = true; // L: 1080
													if (var4.field2863.neColor != 12345678 || this.field2948 && var7 <= this.field2949) { // L: 1081
														var1.vmethod5725(this, var4.field2863, var8, var5, var6);
													}
												}
											} else if (var4.field2854 != null && !this.method5479(var8, var5, var6)) { // L: 1084 1085
												var20 = true; // L: 1086
												var1.vmethod5739(this, var4.field2854, var5, var6); // L: 1087
											}

											var21 = 0; // L: 1090
											var12 = 0; // L: 1091
											class301 var31 = var4.field2855; // L: 1092
											class303 var14 = var4.field2856; // L: 1093
											if (var31 != null || var14 != null) { // L: 1094
												if (var5 == this.field2942) { // L: 1095
													++var21;
												} else if (this.field2942 < var5) { // L: 1096
													var21 += 2;
												}

												if (var6 == this.field2943) { // L: 1097
													var21 += 3;
												} else if (this.field2943 > var6) { // L: 1098
													var21 += 6;
												}

												var12 = field2963[var21]; // L: 1099
												var4.field2870 = field2990[var21]; // L: 1100
											}

											if (var31 != null) { // L: 1102
												if ((var31.field3211 & field2964[var21]) != 0) { // L: 1103
													if (var31.field3211 == 16) { // L: 1104
														var4.field2867 = 3; // L: 1105
														var4.field2873 = field2931[var21]; // L: 1106
														var4.field2849 = 3 - var4.field2873; // L: 1107
													} else if (var31.field3211 == 32) { // L: 1109
														var4.field2867 = 6; // L: 1110
														var4.field2873 = field2925[var21]; // L: 1111
														var4.field2849 = 6 - var4.field2873; // L: 1112
													} else if (var31.field3211 == 64) { // L: 1114
														var4.field2867 = 12; // L: 1115
														var4.field2873 = field2951[var21]; // L: 1116
														var4.field2849 = 12 - var4.field2873; // L: 1117
													} else {
														var4.field2867 = 9; // L: 1120
														var4.field2873 = field2993[var21]; // L: 1121
														var4.field2849 = 9 - var4.field2873; // L: 1122
													}
												} else {
													var4.field2867 = 0; // L: 1125
												}

												if ((var31.field3211 & var12) != 0 && !this.method5439(var8, var5, var6, var31.field3211)) { // L: 1126
													var1.vmethod5737(var31.field3213, 0, var31.field3218 * 4096, var31.field3209, var31.field3210 * 4096, var31.field3214);
												}

												if ((var31.field3212 & var12) != 0 && !this.method5439(var8, var5, var6, var31.field3212)) { // L: 1127
													var1.vmethod5737(var31.field3208, 0, var31.field3218 * 4096, var31.field3209, var31.field3210 * 4096, var31.field3214);
												}
											}

											if (var14 != null && !this.method5481(var8, var5, var6, var14.field3220.height)) { // L: 1129
												if ((var14.field3227 & var12) != 0) { // L: 1130
													var1.vmethod5737(var14.field3220, 0, var14.field3222 * 4096 + var14.field3225, var14.field3229, var14.field3231 * 4096 + var14.field3226, var14.field3221); // L: 1131
												} else if (var14.field3227 == 256) { // L: 1133
													var15 = var14.field3222 * 4096 - this.field2944; // L: 1134
													var16 = var14.field3231 * 4096 - this.field2946; // L: 1135
													var17 = var14.field3224; // L: 1136
													if (var17 != 1 && var17 != 2) { // L: 1138
														var18 = var15; // L: 1139
													} else {
														var18 = -var15;
													}

													if (var17 != 2 && var17 != 3) { // L: 1141
														var19 = var16; // L: 1142
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 1143
														var1.vmethod5737(var14.field3220, 0, var14.field3222 * 4096 + var14.field3225, var14.field3229, var14.field3231 * 4096 + var14.field3226, var14.field3221); // L: 1144
													} else if (var14.field3228 != null) { // L: 1146
														var1.vmethod5737(var14.field3228, 0, var14.field3222 * 4096, var14.field3229, var14.field3231 * 4096, var14.field3221); // L: 1147
													}
												}
											}

											if (var20) { // L: 1151
												class273 var22 = var4.field2857; // L: 1152
												if (var22 != null) { // L: 1153
													var1.vmethod5737(var22.field2817, 0, var22.field2813 * 64, var22.field2815, var22.field2814 * 4096, var22.field2816);
												}

												class271 var23 = var4.field2858; // L: 1154
												if (var23 != null && var23.field2765 == 0) { // L: 1155
													if (var23.field2762 != null) { // L: 1156
														var1.vmethod5737(var23.field2762, 0, var23.field2759 * 4096, var23.field2764, var23.field2761 * 64, var23.field2760);
													}

													if (var23.field2763 != null) { // L: 1157
														var1.vmethod5737(var23.field2763, 0, var23.field2759 * 4096, var23.field2764, var23.field2761 * 64, var23.field2760);
													}

													if (var23.field2758 != null) { // L: 1158
														var1.vmethod5737(var23.field2758, 0, var23.field2759 * 4096, var23.field2764, var23.field2761 * 64, var23.field2760);
													}
												}
											}

											var15 = var4.field2862; // L: 1161
											if (var15 != 0) { // L: 1162
												if (var5 < this.field2942 && var5 >= this.field2938 && var5 < this.field2939 - 1 && (var15 & 4) != 0) { // L: 1163
													var36 = var9[var5 + 1][var6]; // L: 1164
													if (var36 != null && var36.field2865) { // L: 1165
														this.field2962.addFirst(var36);
													}
												}

												if (var6 < this.field2943 && var6 >= this.field2984 && var6 < this.field2941 - 1 && (var15 & 2) != 0) { // L: 1167
													var36 = var9[var5][var6 + 1]; // L: 1168
													if (var36 != null && var36.field2865) { // L: 1169
														this.field2962.addFirst(var36);
													}
												}

												if (var5 > this.field2942 && var5 > this.field2938 && var5 < this.field2939 && (var15 & 1) != 0) { // L: 1171
													var36 = var9[var5 - 1][var6]; // L: 1172
													if (var36 != null && var36.field2865) { // L: 1173
														this.field2962.addFirst(var36);
													}
												}

												if (var6 > this.field2943 && var6 > this.field2984 && var6 < this.field2941 && (var15 & 8) != 0) { // L: 1175
													var36 = var9[var5][var6 - 1]; // L: 1176
													if (var36 != null && var36.field2865) { // L: 1177
														this.field2962.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var4.field2867 != 0) { // L: 1181
											var20 = true; // L: 1182

											for (var21 = 0; var21 < var4.field2859; ++var21) { // L: 1183
												if (var4.field2860[var21].field3244 != this.field2952 && (var4.field2869[var21] & var4.field2867) == var4.field2873) { // L: 1184
													var20 = false; // L: 1185
													break; // L: 1186
												}
											}

											if (var20) { // L: 1189
												var11 = var4.field2855; // L: 1190
												if (!this.method5439(var8, var5, var6, var11.field3211)) {
													var1.vmethod5737(var11.field3213, 0, var11.field3218 * 4096, var11.field3209, var11.field3210 * 4096, var11.field3214); // L: 1191
												}

												var4.field2867 = 0; // L: 1192
											}
										}

										if (!var4.field2866) { // L: 1195
											break;
										}

										try {
											int var34 = var4.field2859; // L: 1197
											var4.field2866 = false; // L: 1198
											var21 = 0; // L: 1199

											label595:
											for (var12 = 0; var12 < var34; ++var12) { // L: 1200
												var13 = var4.field2860[var12]; // L: 1201
												if (var13.field3244 != this.field2952) { // L: 1202
													for (var24 = var13.field3239; var24 <= var13.field3241; ++var24) { // L: 1203
														for (var15 = var13.field3233; var15 <= var13.field3242; ++var15) { // L: 1204
															var36 = var9[var24][var15]; // L: 1205
															if (var36.field2864) { // L: 1206
																var4.field2866 = true; // L: 1207
																continue label595; // L: 1208
															}

															if (var36.field2867 != 0) { // L: 1210
																var17 = 0; // L: 1211
																if (var24 > var13.field3239) { // L: 1212
																	++var17;
																}

																if (var24 < var13.field3241) { // L: 1213
																	var17 += 4;
																}

																if (var15 > var13.field3233) { // L: 1214
																	var17 += 8;
																}

																if (var15 < var13.field3242) { // L: 1215
																	var17 += 2;
																}

																if ((var17 & var36.field2867) == var4.field2849) { // L: 1216
																	var4.field2866 = true; // L: 1217
																	continue label595; // L: 1218
																}
															}
														}
													}

													this.field2947[var21++] = var13; // L: 1223
													var24 = this.field2942 - var13.field3239; // L: 1224
													var15 = var13.field3241 - this.field2942; // L: 1225
													if (var15 > var24) { // L: 1226
														var24 = var15;
													}

													var16 = this.field2943 - var13.field3233; // L: 1227
													var17 = var13.field3242 - this.field2943; // L: 1228
													if (var17 > var16) { // L: 1229
														var13.field3235 = var24 + var17;
													} else {
														var13.field3235 = var24 + var16; // L: 1230
													}
												}
											}

											while (var21 > 0) { // L: 1233
												var12 = -50; // L: 1234
												var25 = -1; // L: 1235

												for (var24 = 0; var24 < var21; ++var24) { // L: 1236
													class304 var35 = this.field2947[var24]; // L: 1237
													if (var35.field3244 != this.field2952) { // L: 1238
														if (var35.field3235 > var12) { // L: 1239
															var12 = var35.field3235; // L: 1240
															var25 = var24; // L: 1241
														} else if (var12 == var35.field3235) { // L: 1243
															var16 = var35.field3238 - this.field2944; // L: 1244
															var17 = var35.field3236 - this.field2946; // L: 1245
															var18 = this.field2947[var25].field3238 - this.field2944; // L: 1246
															var19 = this.field2947[var25].field3236 - this.field2946; // L: 1247
															if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) { // L: 1248
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1252
													break;
												}

												class304 var33 = this.field2947[var25]; // L: 1253
												var33.field3244 = this.field2952; // L: 1254
												if (!this.method5503(var8, var33.field3239, var33.field3241, var33.field3233, var33.field3242, var33.field3237.height)) { // L: 1255
													var1.vmethod5737(var33.field3237, var33.field3240, var33.field3238, var33.field3243, var33.field3236, var33.field3245); // L: 1256
												}

												for (var15 = var33.field3239; var15 <= var33.field3241; ++var15) { // L: 1258
													for (var16 = var33.field3233; var16 <= var33.field3242; ++var16) { // L: 1259
														class276 var26 = var9[var15][var16]; // L: 1260
														if (var26.field2867 != 0) { // L: 1261
															this.field2962.addFirst(var26);
														} else if ((var15 != var5 || var16 != var6) && var26.field2865) { // L: 1262
															this.field2962.addFirst(var26);
														}
													}
												}
											}

											if (!var4.field2866) { // L: 1266
												break;
											}
										} catch (Exception var28) { // L: 1268
											var4.field2866 = false; // L: 1269
											break;
										}
									}
								} while(!var4.field2865); // L: 1272
							} while(var4.field2867 != 0); // L: 1273

							if (var5 > this.field2942 || var5 <= this.field2938) { // L: 1274
								break;
							}

							var10 = var9[var5 - 1][var6]; // L: 1275
						} while(var10 != null && var10.field2865); // L: 1276

						if (var5 < this.field2942 || var5 >= this.field2939 - 1) { // L: 1278
							break;
						}

						var10 = var9[var5 + 1][var6]; // L: 1279
					} while(var10 != null && var10.field2865); // L: 1280

					if (var6 > this.field2943 || var6 <= this.field2984) { // L: 1282
						break;
					}

					var10 = var9[var5][var6 - 1]; // L: 1283
				} while(var10 != null && var10.field2865); // L: 1284

				if (var6 < this.field2943 || var6 >= this.field2941 - 1) { // L: 1286
					break;
				}

				var10 = var9[var5][var6 + 1]; // L: 1287
			} while(var10 != null && var10.field2865); // L: 1288

			var4.field2865 = false; // L: 1290
			--this.field2969; // L: 1291
			class271 var32 = var4.field2858; // L: 1292
			if (var32 != null && var32.field2765 != 0) { // L: 1293
				if (var32.field2762 != null) { // L: 1294
					var1.vmethod5737(var32.field2762, 0, var32.field2759 * 4096, var32.field2764 - var32.field2765, var32.field2761 * 64, var32.field2760);
				}

				if (var32.field2763 != null) { // L: 1295
					var1.vmethod5737(var32.field2763, 0, var32.field2759 * 4096, var32.field2764 - var32.field2765, var32.field2761 * 64, var32.field2760);
				}

				if (var32.field2758 != null) { // L: 1296
					var1.vmethod5737(var32.field2758, 0, var32.field2759 * 4096, var32.field2764 - var32.field2765, var32.field2761 * 64, var32.field2760);
				}
			}

			if (var4.field2870 != 0) { // L: 1298
				class303 var29 = var4.field2856; // L: 1299
				if (var29 != null && !this.method5481(var8, var5, var6, var29.field3220.height)) { // L: 1300
					if ((var29.field3227 & var4.field2870) != 0) { // L: 1301
						var1.vmethod5737(var29.field3220, 0, var29.field3222 * 4096 + var29.field3225, var29.field3229, var29.field3231 * 4096 + var29.field3226, var29.field3221); // L: 1302
					} else if (var29.field3227 == 256) { // L: 1304
						var12 = var29.field3222 * 4096 - this.field2944; // L: 1305
						var25 = var29.field3231 * 4096 - this.field2946; // L: 1306
						var24 = var29.field3224; // L: 1307
						if (var24 != 1 && var24 != 2) { // L: 1309
							var15 = var12; // L: 1310
						} else {
							var15 = -var12;
						}

						if (var24 != 2 && var24 != 3) { // L: 1312
							var16 = var25; // L: 1313
						} else {
							var16 = -var25;
						}

						if (var16 >= var15) { // L: 1314
							var1.vmethod5737(var29.field3220, 0, var29.field3222 * 4096 + var29.field3225, var29.field3229, var29.field3231 * 4096 + var29.field3226, var29.field3221); // L: 1315
						} else if (var29.field3228 != null) { // L: 1317
							var1.vmethod5737(var29.field3228, 0, var29.field3222 * 4096, var29.field3229, var29.field3231 * 4096, var29.field3221); // L: 1318
						}
					}
				}

				class301 var27 = var4.field2855; // L: 1322
				if (var27 != null) { // L: 1323
					if ((var27.field3212 & var4.field2870) != 0 && !this.method5439(var8, var5, var6, var27.field3212)) { // L: 1324
						var1.vmethod5737(var27.field3208, 0, var27.field3218 * 4096, var27.field3209, var27.field3210 * 4096, var27.field3214);
					}

					if ((var27.field3211 & var4.field2870) != 0 && !this.method5439(var8, var5, var6, var27.field3211)) { // L: 1325
						var1.vmethod5737(var27.field3213, 0, var27.field3218 * 4096, var27.field3209, var27.field3210 * 4096, var27.field3214);
					}
				}
			}

			class276 var30;
			if (var7 < this.field2920 - 1) { // L: 1328
				var30 = this.field2924[var7 + 1][var5][var6]; // L: 1329
				if (var30 != null && var30.field2865) { // L: 1330
					this.field2962.addFirst(var30);
				}
			}

			if (var5 < this.field2942 && var5 >= this.field2938 && var5 < this.field2939 - 1) { // L: 1332
				var30 = var9[var5 + 1][var6]; // L: 1333
				if (var30 != null && var30.field2865) { // L: 1334
					this.field2962.addFirst(var30);
				}
			}

			if (var6 < this.field2943 && var6 >= this.field2984 && var6 < this.field2941 - 1) { // L: 1336
				var30 = var9[var5][var6 + 1]; // L: 1337
				if (var30 != null && var30.field2865) { // L: 1338
					this.field2962.addFirst(var30);
				}
			}

			if (var5 > this.field2942 && var5 > this.field2938 && var5 < this.field2939) { // L: 1340
				var30 = var9[var5 - 1][var6]; // L: 1341
				if (var30 != null && var30.field2865) { // L: 1342
					this.field2962.addFirst(var30);
				}
			}

			if (var6 > this.field2943 && var6 > this.field2984 && var6 < this.field2941) { // L: 1344
				var30 = var9[var5][var6 - 1]; // L: 1345
				if (var30 != null && var30.field2865) { // L: 1346
					this.field2962.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("cy")
	void method5478() {
		int var1 = this.field2958[this.field2917]; // L: 1377
		Occluder[] var2 = this.field2959[this.field2917]; // L: 1378
		this.field2960 = 0; // L: 1379

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1380
			Occluder var4 = var2[var3]; // L: 1381
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.field3040 == 1) { // L: 1382
				var5 = var4.field3042 - this.field2942 + this.field2954; // L: 1383
				if (var5 >= 0 && var5 <= this.field2954 + this.field2954) { // L: 1384
					var6 = var4.field3030 - this.field2943 + this.field2954; // L: 1385
					if (var6 < 0) { // L: 1386
						var6 = 0;
					}

					var7 = var4.field3028 - this.field2943 + this.field2954; // L: 1387
					if (var7 > this.field2954 + this.field2954) { // L: 1388
						var7 = this.field2954 + this.field2954;
					}

					var13 = false; // L: 1389

					while (var6 <= var7) { // L: 1390
						if (this.method5597(var5, var6++)) { // L: 1391
							var13 = true; // L: 1392
							break;
						}
					}

					if (var13) { // L: 1396
						var9 = this.field2944 - var4.field3033; // L: 1397
						if (var9 > 32) { // L: 1398
							var4.field3039 = 1;
						} else {
							if (var9 >= -32) { // L: 1399
								continue;
							}

							var4.field3039 = 2; // L: 1400
							var9 = -var9; // L: 1401
						}

						var4.field3044 = (var4.field3035 - this.field2946 << 8) / var9; // L: 1404
						var4.field3031 = (var4.field3036 - this.field2946 << 8) / var9; // L: 1405
						var4.field3032 = (var4.field3037 - this.field2945 << 8) / var9; // L: 1406
						var4.field3045 = (var4.field3038 - this.field2945 << 8) / var9; // L: 1407
						this.field2961[this.field2960++] = var4; // L: 1408
					}
				}
			} else if (var4.field3040 == 2) { // L: 1411
				var5 = var4.field3030 - this.field2943 + this.field2954; // L: 1412
				if (var5 >= 0 && var5 <= this.field2954 + this.field2954) { // L: 1413
					var6 = var4.field3042 - this.field2942 + this.field2954; // L: 1414
					if (var6 < 0) { // L: 1415
						var6 = 0;
					}

					var7 = var4.field3029 - this.field2942 + this.field2954; // L: 1416
					if (var7 > this.field2954 + this.field2954) {
						var7 = this.field2954 + this.field2954; // L: 1417
					}

					var13 = false; // L: 1418

					while (var6 <= var7) { // L: 1419
						if (this.method5597(var6++, var5)) { // L: 1420
							var13 = true; // L: 1421
							break;
						}
					}

					if (var13) { // L: 1425
						var9 = this.field2946 - var4.field3035; // L: 1426
						if (var9 > 32) { // L: 1427
							var4.field3039 = 3;
						} else {
							if (var9 >= -32) { // L: 1428
								continue;
							}

							var4.field3039 = 4; // L: 1429
							var9 = -var9; // L: 1430
						}

						var4.field3043 = (var4.field3033 - this.field2944 << 8) / var9; // L: 1433
						var4.field3041 = (var4.field3034 - this.field2944 << 8) / var9; // L: 1434
						var4.field3032 = (var4.field3037 - this.field2945 << 8) / var9; // L: 1435
						var4.field3045 = (var4.field3038 - this.field2945 << 8) / var9; // L: 1436
						this.field2961[this.field2960++] = var4; // L: 1437
					}
				}
			} else if (var4.field3040 == 4) { // L: 1440
				var5 = var4.field3037 - this.field2945; // L: 1441
				if (var5 > 128) { // L: 1442
					var6 = var4.field3030 - this.field2943 + this.field2954; // L: 1443
					if (var6 < 0) { // L: 1444
						var6 = 0;
					}

					var7 = var4.field3028 - this.field2943 + this.field2954; // L: 1445
					if (var7 > this.field2954 + this.field2954) { // L: 1446
						var7 = this.field2954 + this.field2954;
					}

					if (var6 <= var7) { // L: 1447
						int var8 = var4.field3042 - this.field2942 + this.field2954; // L: 1448
						if (var8 < 0) { // L: 1449
							var8 = 0;
						}

						var9 = var4.field3029 - this.field2942 + this.field2954; // L: 1450
						if (var9 > this.field2954 + this.field2954) { // L: 1451
							var9 = this.field2954 + this.field2954;
						}

						boolean var10 = false; // L: 1452

						label148:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1453
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1454
								if (this.method5597(var11, var12)) { // L: 1455
									var10 = true; // L: 1456
									break label148;
								}
							}
						}

						if (var10) { // L: 1461
							var4.field3039 = 5; // L: 1462
							var4.field3043 = (var4.field3033 - this.field2944 << 8) / var5; // L: 1463
							var4.field3041 = (var4.field3034 - this.field2944 << 8) / var5; // L: 1464
							var4.field3044 = (var4.field3035 - this.field2946 << 8) / var5; // L: 1465
							var4.field3031 = (var4.field3036 - this.field2946 << 8) / var5; // L: 1466
							this.field2961[this.field2960++] = var4; // L: 1467
						}
					}
				}
			}
		}

	} // L: 1471

	@ObfuscatedName("cw")
	boolean method5479(int var1, int var2, int var3) {
		int var4 = this.field2928[var1][var2][var3]; // L: 1474
		if (var4 == -this.field2952) { // L: 1475
			return false;
		} else if (var4 == this.field2952) { // L: 1476
			return true;
		} else {
			int var5 = var2 << 7; // L: 1477
			int var6 = var3 << 7; // L: 1478
			if (this.method5553(var5 + 1, this.field2972[var1][var2][var3], var6 + 1) && this.method5553(var5 + 128 - 1, this.field2972[var1][var2 + 1][var3], var6 + 1) && this.method5553(var5 + 128 - 1, this.field2972[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method5553(var5 + 1, this.field2972[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1479
				this.field2928[var1][var2][var3] = this.field2952; // L: 1480
				return true; // L: 1481
			} else {
				this.field2928[var1][var2][var3] = -this.field2952; // L: 1484
				return false; // L: 1485
			}
		}
	}

	@ObfuscatedName("ci")
	boolean method5439(int var1, int var2, int var3, int var4) {
		if (!this.method5479(var1, var2, var3)) { // L: 1490
			return false;
		} else {
			int var5 = var2 << 7; // L: 1491
			int var6 = var3 << 7; // L: 1492
			int var7 = this.field2972[var1][var2][var3] - 1; // L: 1493
			int var8 = var7 - 120; // L: 1494
			int var9 = var7 - 230; // L: 1495
			int var10 = var7 - 238; // L: 1496
			if (var4 < 16) { // L: 1497
				if (var4 == 1) { // L: 1498
					if (var5 > this.field2944) { // L: 1499
						if (!this.method5553(var5, var7, var6)) { // L: 1500
							return false;
						}

						if (!this.method5553(var5, var7, var6 + 128)) { // L: 1501
							return false;
						}
					}

					if (var1 > 0) { // L: 1503
						if (!this.method5553(var5, var8, var6)) { // L: 1504
							return false;
						}

						if (!this.method5553(var5, var8, var6 + 128)) { // L: 1505
							return false;
						}
					}

					if (!this.method5553(var5, var9, var6)) { // L: 1507
						return false;
					}

					if (!this.method5553(var5, var9, var6 + 128)) { // L: 1508
						return false;
					}

					return true; // L: 1509
				}

				if (var4 == 2) { // L: 1511
					if (var6 < this.field2946) { // L: 1512
						if (!this.method5553(var5, var7, var6 + 128)) { // L: 1513
							return false;
						}

						if (!this.method5553(var5 + 128, var7, var6 + 128)) { // L: 1514
							return false;
						}
					}

					if (var1 > 0) { // L: 1516
						if (!this.method5553(var5, var8, var6 + 128)) { // L: 1517
							return false;
						}

						if (!this.method5553(var5 + 128, var8, var6 + 128)) { // L: 1518
							return false;
						}
					}

					if (!this.method5553(var5, var9, var6 + 128)) { // L: 1520
						return false;
					}

					if (!this.method5553(var5 + 128, var9, var6 + 128)) { // L: 1521
						return false;
					}

					return true; // L: 1522
				}

				if (var4 == 4) { // L: 1524
					if (var5 < this.field2944) { // L: 1525
						if (!this.method5553(var5 + 128, var7, var6)) { // L: 1526
							return false;
						}

						if (!this.method5553(var5 + 128, var7, var6 + 128)) { // L: 1527
							return false;
						}
					}

					if (var1 > 0) { // L: 1529
						if (!this.method5553(var5 + 128, var8, var6)) { // L: 1530
							return false;
						}

						if (!this.method5553(var5 + 128, var8, var6 + 128)) { // L: 1531
							return false;
						}
					}

					if (!this.method5553(var5 + 128, var9, var6)) { // L: 1533
						return false;
					}

					if (!this.method5553(var5 + 128, var9, var6 + 128)) { // L: 1534
						return false;
					}

					return true; // L: 1535
				}

				if (var4 == 8) { // L: 1537
					if (var6 > this.field2946) { // L: 1538
						if (!this.method5553(var5, var7, var6)) { // L: 1539
							return false;
						}

						if (!this.method5553(var5 + 128, var7, var6)) { // L: 1540
							return false;
						}
					}

					if (var1 > 0) { // L: 1542
						if (!this.method5553(var5, var8, var6)) { // L: 1543
							return false;
						}

						if (!this.method5553(var5 + 128, var8, var6)) { // L: 1544
							return false;
						}
					}

					if (!this.method5553(var5, var9, var6)) { // L: 1546
						return false;
					}

					if (!this.method5553(var5 + 128, var9, var6)) { // L: 1547
						return false;
					}

					return true; // L: 1548
				}
			}

			if (!this.method5553(var5 + 64, var10, var6 + 64)) { // L: 1551
				return false;
			} else if (var4 == 16) { // L: 1552
				return this.method5553(var5, var9, var6 + 128); // L: 1553
			} else if (var4 == 32) { // L: 1556
				return this.method5553(var5 + 128, var9, var6 + 128); // L: 1557
			} else if (var4 == 64) { // L: 1560
				return this.method5553(var5 + 128, var9, var6); // L: 1561
			} else if (var4 == 128) { // L: 1564
				return this.method5553(var5, var9, var6); // L: 1565
			} else {
				return true; // L: 1568
			}
		}
	}

	@ObfuscatedName("cc")
	boolean method5481(int var1, int var2, int var3, int var4) {
		if (!this.method5479(var1, var2, var3)) { // L: 1572
			return false;
		} else {
			int var5 = var2 << 7; // L: 1573
			int var6 = var3 << 7; // L: 1574
			return this.method5553(var5 + 1, this.field2972[var1][var2][var3] - var4, var6 + 1) && this.method5553(var5 + 128 - 1, this.field2972[var1][var2 + 1][var3] - var4, var6 + 1) && this.method5553(var5 + 128 - 1, this.field2972[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method5553(var5 + 1, this.field2972[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1575
		}
	}

	@ObfuscatedName("cr")
	boolean method5503(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1580
			if (!this.method5479(var1, var2, var4)) { // L: 1581
				return false;
			} else {
				var7 = var2 << 7; // L: 1582
				var8 = var4 << 7; // L: 1583
				return this.method5553(var7 + 1, this.field2972[var1][var2][var4] - var6, var8 + 1) && this.method5553(var7 + 128 - 1, this.field2972[var1][var2 + 1][var4] - var6, var8 + 1) && this.method5553(var7 + 128 - 1, this.field2972[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method5553(var7 + 1, this.field2972[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1584
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1587
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1588
					if (this.field2928[var1][var7][var8] == -this.field2952) { // L: 1589
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1592
			var8 = (var4 << 7) + 2; // L: 1593
			int var9 = this.field2972[var1][var2][var4] - var6; // L: 1594
			if (!this.method5553(var7, var9, var8)) { // L: 1595
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1596
				if (!this.method5553(var10, var9, var8)) { // L: 1597
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1598
					if (!this.method5553(var7, var9, var11)) { // L: 1599
						return false;
					} else if (!this.method5553(var10, var9, var11)) { // L: 1600
						return false;
					} else {
						return true; // L: 1601
					}
				}
			}
		}
	}

	@ObfuscatedName("cb")
	boolean method5553(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2960; ++var4) { // L: 1605
			Occluder var5 = this.field2961[var4]; // L: 1606
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field3039 == 1) { // L: 1607
				var6 = var5.field3033 - var1; // L: 1608
				if (var6 > 0) { // L: 1609
					var7 = (var6 * var5.field3044 >> 8) + var5.field3035; // L: 1610
					var8 = (var6 * var5.field3031 >> 8) + var5.field3036; // L: 1611
					var9 = (var6 * var5.field3032 >> 8) + var5.field3037; // L: 1612
					var10 = (var6 * var5.field3045 >> 8) + var5.field3038; // L: 1613
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1614
						return true;
					}
				}
			} else if (var5.field3039 == 2) { // L: 1618
				var6 = var1 - var5.field3033; // L: 1619
				if (var6 > 0) { // L: 1620
					var7 = (var6 * var5.field3044 >> 8) + var5.field3035; // L: 1621
					var8 = (var6 * var5.field3031 >> 8) + var5.field3036; // L: 1622
					var9 = (var6 * var5.field3032 >> 8) + var5.field3037; // L: 1623
					var10 = (var6 * var5.field3045 >> 8) + var5.field3038; // L: 1624
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1625
						return true;
					}
				}
			} else if (var5.field3039 == 3) { // L: 1629
				var6 = var5.field3035 - var3; // L: 1630
				if (var6 > 0) { // L: 1631
					var7 = (var6 * var5.field3043 >> 8) + var5.field3033; // L: 1632
					var8 = (var6 * var5.field3041 >> 8) + var5.field3034; // L: 1633
					var9 = (var6 * var5.field3032 >> 8) + var5.field3037; // L: 1634
					var10 = (var6 * var5.field3045 >> 8) + var5.field3038; // L: 1635
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1636
						return true;
					}
				}
			} else if (var5.field3039 == 4) { // L: 1640
				var6 = var3 - var5.field3035; // L: 1641
				if (var6 > 0) { // L: 1642
					var7 = (var6 * var5.field3043 >> 8) + var5.field3033; // L: 1643
					var8 = (var6 * var5.field3041 >> 8) + var5.field3034; // L: 1644
					var9 = (var6 * var5.field3032 >> 8) + var5.field3037; // L: 1645
					var10 = (var6 * var5.field3045 >> 8) + var5.field3038; // L: 1646
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1647
						return true;
					}
				}
			} else if (var5.field3039 == 5) { // L: 1651
				var6 = var2 - var5.field3037; // L: 1652
				if (var6 > 0) { // L: 1653
					var7 = (var6 * var5.field3043 >> 8) + var5.field3033; // L: 1654
					var8 = (var6 * var5.field3041 >> 8) + var5.field3034; // L: 1655
					var9 = (var6 * var5.field3044 >> 8) + var5.field3035; // L: 1656
					var10 = (var6 * var5.field3031 >> 8) + var5.field3036; // L: 1657
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1658
						return true;
					}
				}
			}
		}

		return false; // L: 1663
	}

	@ObfuscatedName("eh")
	void vmethod5778(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		class425 var12 = new class425(); // L: 1668
		var12.method7861((float)((double)(-var2) * 0.0030679615D)); // L: 1669
		var12.method7871((float)((double)(-var3) * 0.0030679615D)); // L: 1670
		var12.method7864((float)var7, (float)var8, (float)var9); // L: 1671
		class424 var13 = new class424(); // L: 1672
		var13.method7788(var12); // L: 1673
		var13.method7790(); // L: 1674
		int var14 = this.field2966 % 300; // L: 1675
		float var15 = (float)var14 / 300.0F * 6.283F; // L: 1676
		float var16 = (float)Math.sin((double)var15); // L: 1677
		float var17 = (float)Math.cos((double)var15); // L: 1678
		float var18 = var16 * 3.14159F / 100.0F; // L: 1679
		float var19 = var17 * 3.14159F / 100.0F; // L: 1680
		class418 var20 = new class418(); // L: 1681
		class424 var21 = new class424(); // L: 1682
		var20.field4681 = new class423((float)((double)var1 * 0.0030679615D), var18, var19); // L: 1683
		var20.field4682 = new class422((float)var4, (float)var5, (float)var6); // L: 1684
		class424 var22 = new class424(); // L: 1685
		var22.method7786(var20); // L: 1686
		var22.method7790(); // L: 1687
		class418 var23 = new class418(); // L: 1688
		var23.field4682 = new class422((float)(-(this.field2921 * 64)), 0.0F, (float)(-(this.field2922 * 64))); // L: 1689
		class424 var24 = new class424(); // L: 1690
		var24.method7786(var23); // L: 1691
		var21.method7791(1.0F, 1.0F, 1.0F, 1.0F); // L: 1692
		var24.method7785(var21); // L: 1693
		var21.method7786(var20); // L: 1694
		var24.method7785(var21); // L: 1695
		var24.method7785(var13); // L: 1696
		this.field2944 = (int)var22.method7784((float)var7, (float)var8, (float)var9); // L: 1697
		this.field2945 = (int)var22.method7853((float)var7, (float)var8, (float)var9); // L: 1698
		this.field2946 = (int)var22.method7795((float)var7, (float)var8, (float)var9); // L: 1699
		this.field2942 = this.field2944 / 128; // L: 1700
		this.field2943 = this.field2946 / 128; // L: 1701
		class283 var25 = new class283(var24); // L: 1702
		this.method5415(var25); // L: 1703
	} // L: 1704

	@ObfuscatedName("cs")
	static final int method5643(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1353
		if (var1 < 2) { // L: 1354
			var1 = 2;
		} else if (var1 > 126) { // L: 1355
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1356
	}

	@ObfuscatedName("cp")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1360
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1361
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1362
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1363
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1364
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1365
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1366
			if (var8 == 0) { // L: 1367
				if (var9 != 0) { // L: 1370
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1371
				} else {
					return true; // L: 1373
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1368
			}
		}
	}
}
