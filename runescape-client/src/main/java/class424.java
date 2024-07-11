import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public final class class424 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	public static class424[] field4704;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1373796869
	)
	static int field4705;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1620544593
	)
	public static int field4706;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	public static final class424 field4707;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ap")
	public float[] field4709;

	static {
		field4704 = new class424[0]; // L: 9
		FaceNormal.method5685(100); // L: 14
		field4707 = new class424(); // L: 18
	}

	public class424() {
		this.field4709 = new float[16];
		this.method7789(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lqg;)V"
	)
	public class424(class424 var1) {
		this.field4709 = new float[16];
		this.method7809(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Lvp;Z)V"
	)
	public class424(Buffer var1, boolean var2) {
		this.field4709 = new float[16]; // L: 17
		this.method7777(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1696304839"
	)
	public void method7801() {
		synchronized(field4704) { // L: 37
			if (field4706 < field4705 - 1) { // L: 38
				field4704[++field4706 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;ZI)V",
		garbageValue = "1801643449"
	)
	void method7777(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class425 var13 = new class425(); // L: 56
			int var6 = var1.readShort(); // L: 59
			var6 &= 16383; // L: 61
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D); // L: 62
			var13.method7861(var5); // L: 64
			int var9 = var1.readShort(); // L: 67
			var9 &= 16383; // L: 69
			float var8 = (float)(6.283185307179586D * (double)((float)var9 / 16384.0F)); // L: 70
			var13.method7871(var8); // L: 72
			int var12 = var1.readShort(); // L: 75
			var12 &= 16383; // L: 77
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F)); // L: 78
			var13.method7863(var11); // L: 80
			var13.method7864((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 81
			this.method7788(var13); // L: 82
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 85
				this.field4709[var3] = var1.method9565(); // L: 86
			}
		}

	} // L: 89

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "425158414"
	)
	float[] method7778() {
		float[] var1 = new float[3]; // L: 92
		if ((double)this.field4709[2] < 0.999D && (double)this.field4709[2] > -0.999D) { // L: 93
			var1[1] = (float)(-Math.asin((double)this.field4709[2])); // L: 94
			double var2 = Math.cos((double)var1[1]); // L: 95
			var1[0] = (float)Math.atan2((double)this.field4709[6] / var2, (double)this.field4709[10] / var2); // L: 96
			var1[2] = (float)Math.atan2((double)this.field4709[1] / var2, (double)this.field4709[0] / var2); // L: 97
		} else {
			var1[0] = 0.0F; // L: 100
			var1[1] = (float)Math.atan2((double)this.field4709[2], 0.0D); // L: 101
			var1[2] = (float)Math.atan2((double)(-this.field4709[9]), (double)this.field4709[5]); // L: 102
		}

		return var1; // L: 104
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1983045784"
	)
	public float[] method7779() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4709[6])), 0.0F, 0.0F}; // L: 108 109
		double var2 = Math.cos((double)var1[0]); // L: 110
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 111
			var4 = (double)this.field4709[2]; // L: 112
			var6 = (double)this.field4709[10]; // L: 113
			double var8 = (double)this.field4709[4]; // L: 114
			double var10 = (double)this.field4709[5]; // L: 115
			var1[1] = (float)Math.atan2(var4, var6); // L: 116
			var1[2] = (float)Math.atan2(var8, var10); // L: 117
		} else {
			var4 = (double)this.field4709[1]; // L: 120
			var6 = (double)this.field4709[0]; // L: 121
			if (this.field4709[6] < 0.0F) { // L: 122
				var1[1] = (float)Math.atan2(var4, var6); // L: 123
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 126
			}

			var1[2] = 0.0F; // L: 128
		}

		return var1; // L: 130
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2101209059"
	)
	public void method7789() {
		this.field4709[0] = 1.0F; // L: 134
		this.field4709[1] = 0.0F; // L: 135
		this.field4709[2] = 0.0F; // L: 136
		this.field4709[3] = 0.0F; // L: 137
		this.field4709[4] = 0.0F; // L: 138
		this.field4709[5] = 1.0F; // L: 139
		this.field4709[6] = 0.0F; // L: 140
		this.field4709[7] = 0.0F; // L: 141
		this.field4709[8] = 0.0F; // L: 142
		this.field4709[9] = 0.0F; // L: 143
		this.field4709[10] = 1.0F; // L: 144
		this.field4709[11] = 0.0F; // L: 145
		this.field4709[12] = 0.0F; // L: 146
		this.field4709[13] = 0.0F; // L: 147
		this.field4709[14] = 0.0F; // L: 148
		this.field4709[15] = 1.0F; // L: 149
	} // L: 150

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1044154901"
	)
	public void method7781() {
		this.field4709[0] = 0.0F; // L: 153
		this.field4709[1] = 0.0F; // L: 154
		this.field4709[2] = 0.0F; // L: 155
		this.field4709[3] = 0.0F; // L: 156
		this.field4709[4] = 0.0F; // L: 157
		this.field4709[5] = 0.0F; // L: 158
		this.field4709[6] = 0.0F; // L: 159
		this.field4709[7] = 0.0F; // L: 160
		this.field4709[8] = 0.0F; // L: 161
		this.field4709[9] = 0.0F; // L: 162
		this.field4709[10] = 0.0F; // L: 163
		this.field4709[11] = 0.0F; // L: 164
		this.field4709[12] = 0.0F; // L: 165
		this.field4709[13] = 0.0F; // L: 166
		this.field4709[14] = 0.0F; // L: 167
		this.field4709[15] = 0.0F; // L: 168
	} // L: 169

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqg;B)V",
		garbageValue = "70"
	)
	public void method7809(class424 var1) {
		System.arraycopy(var1.field4709, 0, this.field4709, 0, 16); // L: 172
	} // L: 173

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-21"
	)
	public void method7783(float var1) {
		this.method7804(var1, var1, var1); // L: 176
	} // L: 177

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "0"
	)
	public void method7804(float var1, float var2, float var3) {
		this.method7789(); // L: 180
		this.field4709[0] = var1; // L: 181
		this.field4709[5] = var2; // L: 182
		this.field4709[10] = var3; // L: 183
	} // L: 184

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqg;I)V",
		garbageValue = "-746584732"
	)
	public void method7782(class424 var1) {
		for (int var2 = 0; var2 < this.field4709.length; ++var2) { // L: 187
			float[] var10000 = this.field4709; // L: 188
			var10000[var2] += var1.field4709[var2];
		}

	} // L: 190

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqg;I)V",
		garbageValue = "-578486569"
	)
	public void method7785(class424 var1) {
		float var2 = this.field4709[0] * var1.field4709[0] + this.field4709[1] * var1.field4709[4] + var1.field4709[8] * this.field4709[2] + this.field4709[3] * var1.field4709[12]; // L: 193
		float var3 = this.field4709[3] * var1.field4709[13] + var1.field4709[5] * this.field4709[1] + var1.field4709[1] * this.field4709[0] + var1.field4709[9] * this.field4709[2]; // L: 194
		float var4 = var1.field4709[2] * this.field4709[0] + this.field4709[1] * var1.field4709[6] + this.field4709[2] * var1.field4709[10] + var1.field4709[14] * this.field4709[3]; // L: 195
		float var5 = var1.field4709[3] * this.field4709[0] + var1.field4709[7] * this.field4709[1] + var1.field4709[11] * this.field4709[2] + var1.field4709[15] * this.field4709[3]; // L: 196
		float var6 = this.field4709[6] * var1.field4709[8] + var1.field4709[0] * this.field4709[4] + var1.field4709[4] * this.field4709[5] + this.field4709[7] * var1.field4709[12]; // L: 197
		float var7 = var1.field4709[13] * this.field4709[7] + this.field4709[6] * var1.field4709[9] + var1.field4709[5] * this.field4709[5] + var1.field4709[1] * this.field4709[4]; // L: 198
		float var8 = this.field4709[7] * var1.field4709[14] + var1.field4709[10] * this.field4709[6] + this.field4709[5] * var1.field4709[6] + this.field4709[4] * var1.field4709[2]; // L: 199
		float var9 = this.field4709[7] * var1.field4709[15] + this.field4709[5] * var1.field4709[7] + var1.field4709[3] * this.field4709[4] + var1.field4709[11] * this.field4709[6]; // L: 200
		float var10 = this.field4709[10] * var1.field4709[8] + var1.field4709[0] * this.field4709[8] + var1.field4709[4] * this.field4709[9] + var1.field4709[12] * this.field4709[11]; // L: 201
		float var11 = var1.field4709[9] * this.field4709[10] + this.field4709[8] * var1.field4709[1] + var1.field4709[5] * this.field4709[9] + this.field4709[11] * var1.field4709[13]; // L: 202
		float var12 = var1.field4709[10] * this.field4709[10] + var1.field4709[6] * this.field4709[9] + this.field4709[8] * var1.field4709[2] + var1.field4709[14] * this.field4709[11]; // L: 203
		float var13 = this.field4709[11] * var1.field4709[15] + var1.field4709[7] * this.field4709[9] + var1.field4709[3] * this.field4709[8] + var1.field4709[11] * this.field4709[10]; // L: 204
		float var14 = var1.field4709[8] * this.field4709[14] + var1.field4709[0] * this.field4709[12] + var1.field4709[4] * this.field4709[13] + this.field4709[15] * var1.field4709[12]; // L: 205
		float var15 = this.field4709[14] * var1.field4709[9] + var1.field4709[1] * this.field4709[12] + var1.field4709[5] * this.field4709[13] + this.field4709[15] * var1.field4709[13]; // L: 206
		float var16 = var1.field4709[14] * this.field4709[15] + this.field4709[14] * var1.field4709[10] + this.field4709[13] * var1.field4709[6] + this.field4709[12] * var1.field4709[2]; // L: 207
		float var17 = var1.field4709[15] * this.field4709[15] + this.field4709[14] * var1.field4709[11] + var1.field4709[7] * this.field4709[13] + this.field4709[12] * var1.field4709[3]; // L: 208
		this.field4709[0] = var2; // L: 209
		this.field4709[1] = var3; // L: 210
		this.field4709[2] = var4; // L: 211
		this.field4709[3] = var5; // L: 212
		this.field4709[4] = var6; // L: 213
		this.field4709[5] = var7; // L: 214
		this.field4709[6] = var8; // L: 215
		this.field4709[7] = var9; // L: 216
		this.field4709[8] = var10; // L: 217
		this.field4709[9] = var11; // L: 218
		this.field4709[10] = var12; // L: 219
		this.field4709[11] = var13; // L: 220
		this.field4709[12] = var14; // L: 221
		this.field4709[13] = var15; // L: 222
		this.field4709[14] = var16; // L: 223
		this.field4709[15] = var17; // L: 224
	} // L: 225

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqe;B)V",
		garbageValue = "0"
	)
	public void method7786(class418 var1) {
		float var2 = var1.field4681.field4702 * var1.field4681.field4702; // L: 228
		float var3 = var1.field4681.field4702 * var1.field4681.field4699; // L: 229
		float var4 = var1.field4681.field4700 * var1.field4681.field4702; // L: 230
		float var5 = var1.field4681.field4702 * var1.field4681.field4696; // L: 231
		float var6 = var1.field4681.field4699 * var1.field4681.field4699; // L: 232
		float var7 = var1.field4681.field4700 * var1.field4681.field4699; // L: 233
		float var8 = var1.field4681.field4696 * var1.field4681.field4699; // L: 234
		float var9 = var1.field4681.field4700 * var1.field4681.field4700; // L: 235
		float var10 = var1.field4681.field4696 * var1.field4681.field4700; // L: 236
		float var11 = var1.field4681.field4696 * var1.field4681.field4696; // L: 237
		this.field4709[0] = var6 + var2 - var11 - var9; // L: 238
		this.field4709[1] = var5 + var7 + var5 + var7; // L: 239
		this.field4709[2] = var8 - var4 - var4 + var8; // L: 240
		this.field4709[4] = var7 + (var7 - var5 - var5); // L: 241
		this.field4709[5] = var9 + var2 - var6 - var11; // L: 242
		this.field4709[6] = var3 + var10 + var10 + var3; // L: 243
		this.field4709[8] = var4 + var4 + var8 + var8; // L: 244
		this.field4709[9] = var10 - var3 - var3 + var10; // L: 245
		this.field4709[10] = var11 + var2 - var9 - var6; // L: 246
		float[] var12 = this.field4709; // L: 247
		float[] var13 = this.field4709; // L: 248
		this.field4709[11] = 0.0F; // L: 249
		var13[7] = 0.0F; // L: 250
		var12[3] = 0.0F; // L: 251
		this.field4709[12] = var1.field4682.field4695; // L: 252
		this.field4709[13] = var1.field4682.field4692; // L: 253
		this.field4709[14] = var1.field4682.field4693; // L: 254
		this.field4709[15] = 1.0F; // L: 255
	} // L: 256

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)V",
		garbageValue = "2094394353"
	)
	public void method7797(class423 var1) {
		float var2 = var1.field4702 * var1.field4702; // L: 259
		float var3 = var1.field4702 * var1.field4699; // L: 260
		float var4 = var1.field4700 * var1.field4702; // L: 261
		float var5 = var1.field4696 * var1.field4702; // L: 262
		float var6 = var1.field4699 * var1.field4699; // L: 263
		float var7 = var1.field4699 * var1.field4700; // L: 264
		float var8 = var1.field4699 * var1.field4696; // L: 265
		float var9 = var1.field4700 * var1.field4700; // L: 266
		float var10 = var1.field4696 * var1.field4700; // L: 267
		float var11 = var1.field4696 * var1.field4696; // L: 268
		this.field4709[0] = var2 + var6 - var11 - var9; // L: 269
		this.field4709[1] = var7 + var7 + var5 + var5; // L: 270
		this.field4709[2] = var8 + (var8 - var4 - var4); // L: 271
		this.field4709[4] = var7 + (var7 - var5 - var5); // L: 272
		this.field4709[5] = var9 + var2 - var6 - var11; // L: 273
		this.field4709[6] = var3 + var10 + var3 + var10; // L: 274
		this.field4709[8] = var8 + var8 + var4 + var4; // L: 275
		this.field4709[9] = var10 - var3 - var3 + var10; // L: 276
		this.field4709[10] = var2 + var11 - var9 - var6; // L: 277
	} // L: 278

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqx;B)V",
		garbageValue = "4"
	)
	public void method7788(class425 var1) {
		this.field4709[0] = var1.field4711; // L: 281
		this.field4709[1] = var1.field4710; // L: 282
		this.field4709[2] = var1.field4712; // L: 283
		this.field4709[3] = 0.0F; // L: 284
		this.field4709[4] = var1.field4713; // L: 285
		this.field4709[5] = var1.field4714; // L: 286
		this.field4709[6] = var1.field4715; // L: 287
		this.field4709[7] = 0.0F; // L: 288
		this.field4709[8] = var1.field4719; // L: 289
		this.field4709[9] = var1.field4717; // L: 290
		this.field4709[10] = var1.field4716; // L: 291
		this.field4709[11] = 0.0F; // L: 292
		this.field4709[12] = var1.field4720; // L: 293
		this.field4709[13] = var1.field4718; // L: 294
		this.field4709[14] = var1.field4721; // L: 295
		this.field4709[15] = 1.0F; // L: 296
	} // L: 297

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1547223641"
	)
	float method7839() {
		return this.field4709[14] * this.field4709[8] * this.field4709[5] * this.field4709[3] + this.field4709[7] * this.field4709[2] * this.field4709[8] * this.field4709[13] + this.field4709[12] * this.field4709[2] * this.field4709[5] * this.field4709[11] + (this.field4709[4] * this.field4709[2] * this.field4709[9] * this.field4709[15] + this.field4709[12] * this.field4709[10] * this.field4709[1] * this.field4709[7] + (this.field4709[14] * this.field4709[9] * this.field4709[7] * this.field4709[0] + this.field4709[0] * this.field4709[5] * this.field4709[10] * this.field4709[15] - this.field4709[14] * this.field4709[11] * this.field4709[0] * this.field4709[5] - this.field4709[15] * this.field4709[9] * this.field4709[6] * this.field4709[0] + this.field4709[6] * this.field4709[0] * this.field4709[11] * this.field4709[13] - this.field4709[13] * this.field4709[10] * this.field4709[0] * this.field4709[7] - this.field4709[15] * this.field4709[4] * this.field4709[1] * this.field4709[10] + this.field4709[4] * this.field4709[1] * this.field4709[11] * this.field4709[14] + this.field4709[15] * this.field4709[8] * this.field4709[6] * this.field4709[1] - this.field4709[12] * this.field4709[11] * this.field4709[1] * this.field4709[6] - this.field4709[1] * this.field4709[7] * this.field4709[8] * this.field4709[14]) - this.field4709[13] * this.field4709[11] * this.field4709[2] * this.field4709[4] - this.field4709[15] * this.field4709[5] * this.field4709[2] * this.field4709[8]) - this.field4709[12] * this.field4709[2] * this.field4709[7] * this.field4709[9] - this.field4709[4] * this.field4709[3] * this.field4709[9] * this.field4709[14] + this.field4709[4] * this.field4709[3] * this.field4709[10] * this.field4709[13] - this.field4709[10] * this.field4709[3] * this.field4709[5] * this.field4709[12] - this.field4709[3] * this.field4709[6] * this.field4709[8] * this.field4709[13] + this.field4709[12] * this.field4709[6] * this.field4709[3] * this.field4709[9]; // L: 300
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1366817561"
	)
	public void method7790() {
		float var1 = 1.0F / this.method7839(); // L: 304
		float var2 = var1 * (this.field4709[7] * this.field4709[9] * this.field4709[14] + this.field4709[15] * this.field4709[5] * this.field4709[10] - this.field4709[11] * this.field4709[5] * this.field4709[14] - this.field4709[9] * this.field4709[6] * this.field4709[15] + this.field4709[11] * this.field4709[6] * this.field4709[13] - this.field4709[13] * this.field4709[10] * this.field4709[7]); // L: 305
		float var3 = (this.field4709[15] * this.field4709[2] * this.field4709[9] + this.field4709[11] * this.field4709[1] * this.field4709[14] + this.field4709[15] * this.field4709[10] * -this.field4709[1] - this.field4709[13] * this.field4709[2] * this.field4709[11] - this.field4709[14] * this.field4709[9] * this.field4709[3] + this.field4709[3] * this.field4709[10] * this.field4709[13]) * var1; // L: 306
		float var4 = var1 * (this.field4709[13] * this.field4709[2] * this.field4709[7] + (this.field4709[1] * this.field4709[6] * this.field4709[15] - this.field4709[14] * this.field4709[1] * this.field4709[7] - this.field4709[15] * this.field4709[5] * this.field4709[2]) + this.field4709[3] * this.field4709[5] * this.field4709[14] - this.field4709[13] * this.field4709[6] * this.field4709[3]); // L: 307
		float var5 = (this.field4709[3] * this.field4709[6] * this.field4709[9] + (this.field4709[7] * this.field4709[1] * this.field4709[10] + this.field4709[6] * -this.field4709[1] * this.field4709[11] + this.field4709[2] * this.field4709[5] * this.field4709[11] - this.field4709[9] * this.field4709[7] * this.field4709[2] - this.field4709[5] * this.field4709[3] * this.field4709[10])) * var1; // L: 308
		float var6 = (this.field4709[10] * -this.field4709[4] * this.field4709[15] + this.field4709[4] * this.field4709[11] * this.field4709[14] + this.field4709[15] * this.field4709[6] * this.field4709[8] - this.field4709[11] * this.field4709[6] * this.field4709[12] - this.field4709[7] * this.field4709[8] * this.field4709[14] + this.field4709[12] * this.field4709[10] * this.field4709[7]) * var1; // L: 309
		float var7 = var1 * (this.field4709[14] * this.field4709[8] * this.field4709[3] + this.field4709[15] * this.field4709[0] * this.field4709[10] - this.field4709[14] * this.field4709[0] * this.field4709[11] - this.field4709[15] * this.field4709[8] * this.field4709[2] + this.field4709[12] * this.field4709[11] * this.field4709[2] - this.field4709[10] * this.field4709[3] * this.field4709[12]); // L: 310
		float var8 = (this.field4709[14] * this.field4709[0] * this.field4709[7] + -this.field4709[0] * this.field4709[6] * this.field4709[15] + this.field4709[4] * this.field4709[2] * this.field4709[15] - this.field4709[12] * this.field4709[7] * this.field4709[2] - this.field4709[4] * this.field4709[3] * this.field4709[14] + this.field4709[6] * this.field4709[3] * this.field4709[12]) * var1; // L: 311
		float var9 = var1 * (this.field4709[4] * this.field4709[3] * this.field4709[10] + this.field4709[8] * this.field4709[7] * this.field4709[2] + (this.field4709[11] * this.field4709[0] * this.field4709[6] - this.field4709[7] * this.field4709[0] * this.field4709[10] - this.field4709[11] * this.field4709[4] * this.field4709[2]) - this.field4709[8] * this.field4709[3] * this.field4709[6]); // L: 312
		float var10 = var1 * (this.field4709[13] * this.field4709[7] * this.field4709[8] + this.field4709[12] * this.field4709[11] * this.field4709[5] + (this.field4709[9] * this.field4709[4] * this.field4709[15] - this.field4709[11] * this.field4709[4] * this.field4709[13] - this.field4709[8] * this.field4709[5] * this.field4709[15]) - this.field4709[12] * this.field4709[9] * this.field4709[7]); // L: 313
		float var11 = (this.field4709[13] * this.field4709[0] * this.field4709[11] + this.field4709[15] * -this.field4709[0] * this.field4709[9] + this.field4709[15] * this.field4709[1] * this.field4709[8] - this.field4709[12] * this.field4709[11] * this.field4709[1] - this.field4709[13] * this.field4709[3] * this.field4709[8] + this.field4709[12] * this.field4709[3] * this.field4709[9]) * var1; // L: 314
		float var12 = var1 * (this.field4709[3] * this.field4709[4] * this.field4709[13] + this.field4709[12] * this.field4709[1] * this.field4709[7] + (this.field4709[5] * this.field4709[0] * this.field4709[15] - this.field4709[7] * this.field4709[0] * this.field4709[13] - this.field4709[4] * this.field4709[1] * this.field4709[15]) - this.field4709[12] * this.field4709[3] * this.field4709[5]); // L: 315
		float var13 = (this.field4709[5] * this.field4709[3] * this.field4709[8] + (this.field4709[11] * this.field4709[5] * -this.field4709[0] + this.field4709[7] * this.field4709[0] * this.field4709[9] + this.field4709[11] * this.field4709[1] * this.field4709[4] - this.field4709[1] * this.field4709[7] * this.field4709[8] - this.field4709[4] * this.field4709[3] * this.field4709[9])) * var1; // L: 316
		float var14 = (this.field4709[12] * this.field4709[9] * this.field4709[6] + (this.field4709[14] * this.field4709[9] * -this.field4709[4] + this.field4709[4] * this.field4709[10] * this.field4709[13] + this.field4709[5] * this.field4709[8] * this.field4709[14] - this.field4709[12] * this.field4709[5] * this.field4709[10] - this.field4709[6] * this.field4709[8] * this.field4709[13])) * var1; // L: 317
		float var15 = (this.field4709[0] * this.field4709[9] * this.field4709[14] - this.field4709[13] * this.field4709[0] * this.field4709[10] - this.field4709[8] * this.field4709[1] * this.field4709[14] + this.field4709[12] * this.field4709[1] * this.field4709[10] + this.field4709[13] * this.field4709[2] * this.field4709[8] - this.field4709[12] * this.field4709[2] * this.field4709[9]) * var1; // L: 318
		float var16 = (this.field4709[14] * this.field4709[4] * this.field4709[1] + this.field4709[13] * this.field4709[6] * this.field4709[0] + this.field4709[14] * this.field4709[5] * -this.field4709[0] - this.field4709[1] * this.field4709[6] * this.field4709[12] - this.field4709[13] * this.field4709[4] * this.field4709[2] + this.field4709[2] * this.field4709[5] * this.field4709[12]) * var1; // L: 319
		float var17 = var1 * (this.field4709[0] * this.field4709[5] * this.field4709[10] - this.field4709[6] * this.field4709[0] * this.field4709[9] - this.field4709[4] * this.field4709[1] * this.field4709[10] + this.field4709[8] * this.field4709[6] * this.field4709[1] + this.field4709[4] * this.field4709[2] * this.field4709[9] - this.field4709[8] * this.field4709[5] * this.field4709[2]); // L: 320
		this.field4709[0] = var2; // L: 321
		this.field4709[1] = var3; // L: 322
		this.field4709[2] = var4; // L: 323
		this.field4709[3] = var5; // L: 324
		this.field4709[4] = var6; // L: 325
		this.field4709[5] = var7; // L: 326
		this.field4709[6] = var8; // L: 327
		this.field4709[7] = var9; // L: 328
		this.field4709[8] = var10; // L: 329
		this.field4709[9] = var11; // L: 330
		this.field4709[10] = var12; // L: 331
		this.field4709[11] = var13; // L: 332
		this.field4709[12] = var14; // L: 333
		this.field4709[13] = var15; // L: 334
		this.field4709[14] = var16; // L: 335
		this.field4709[15] = var17; // L: 336
	} // L: 337

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1440282828"
	)
	public void method7791(float var1, float var2, float var3, float var4) {
		this.field4709[0] = var1; // L: 340
		this.field4709[1] = 0.0F; // L: 341
		this.field4709[2] = 0.0F; // L: 342
		this.field4709[3] = 0.0F; // L: 343
		this.field4709[4] = 0.0F; // L: 344
		this.field4709[5] = var2; // L: 345
		this.field4709[6] = 0.0F; // L: 346
		this.field4709[7] = 0.0F; // L: 347
		this.field4709[8] = 0.0F; // L: 348
		this.field4709[9] = 0.0F; // L: 349
		this.field4709[10] = var3; // L: 350
		this.field4709[11] = 0.0F; // L: 351
		this.field4709[12] = 0.0F; // L: 352
		this.field4709[13] = 0.0F; // L: 353
		this.field4709[14] = 0.0F; // L: 354
		this.field4709[15] = var4; // L: 355
	} // L: 356

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFF[FB)V",
		garbageValue = "36"
	)
	public void method7792(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field4709[12] + var3 * this.field4709[8] + var1 * this.field4709[0] + this.field4709[4] * var2; // L: 359
		var4[1] = this.field4709[13] + this.field4709[9] * var3 + this.field4709[5] * var2 + var1 * this.field4709[1]; // L: 360
		var4[2] = this.field4709[14] + var3 * this.field4709[10] + var2 * this.field4709[6] + this.field4709[2] * var1; // L: 361
		if (var4.length > 3) {
			var4[3] = this.field4709[15] + var2 * this.field4709[7] + this.field4709[3] * var1 + this.field4709[11] * var3; // L: 362
		}

	} // L: 363

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-17904142"
	)
	public float method7784(float var1, float var2, float var3) {
		return this.field4709[4] * var2 + var1 * this.field4709[0] + this.field4709[8] * var3 + this.field4709[12]; // L: 366
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "105"
	)
	public float method7853(float var1, float var2, float var3) {
		return this.field4709[1] * var1 + this.field4709[5] * var2 + var3 * this.field4709[9] + this.field4709[13]; // L: 370
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "42"
	)
	public float method7795(float var1, float var2, float var3) {
		return this.field4709[2] * var1 + this.field4709[6] * var2 + var3 * this.field4709[10] + this.field4709[14]; // L: 374
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1293258905"
	)
	public float[] method7798() {
		float[] var1 = new float[3]; // L: 412
		class422 var2 = new class422(this.field4709[0], this.field4709[1], this.field4709[2]); // L: 413
		class422 var3 = new class422(this.field4709[4], this.field4709[5], this.field4709[6]); // L: 414
		class422 var4 = new class422(this.field4709[8], this.field4709[9], this.field4709[10]); // L: 415
		var1[0] = var2.method7723(); // L: 416
		var1[1] = var3.method7723(); // L: 417
		var1[2] = var4.method7723(); // L: 418
		return var1; // L: 419
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 380
		this.method7779(); // L: 381
		this.method7778(); // L: 382

		for (int var2 = 0; var2 < 4; ++var2) { // L: 383
			for (int var3 = 0; var3 < 4; ++var3) { // L: 384
				if (var3 > 0) {
					var1.append("\t"); // L: 385
				}

				float var4 = this.field4709[var3 + var2 * 4]; // L: 386
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 387
					var4 = 0.0F;
				}

				var1.append(var4); // L: 388
			}

			var1.append("\n"); // L: 390
		}

		return var1.toString(); // L: 392
	}

	public int hashCode() {
		boolean var1 = true; // L: 397
		byte var2 = 1; // L: 398
		int var3 = 31 * var2 + Arrays.hashCode(this.field4709); // L: 399
		return var3; // L: 400
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class424)) { // L: 405
			return false;
		} else {
			class424 var2 = (class424)var1; // L: 406

			for (int var3 = 0; var3 < 16; ++var3) { // L: 407
				if (this.field4709[var3] != var2.field4709[var3]) {
					return false;
				}
			}

			return true; // L: 408
		}
	}
}
