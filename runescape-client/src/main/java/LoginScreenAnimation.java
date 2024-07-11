import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1296;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aj")
	int[] field1280;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1310190489
	)
	int field1281;
	@ObfuscatedName("ab")
	int[] field1282;
	@ObfuscatedName("ai")
	int[] field1289;
	@ObfuscatedName("ae")
	int[] field1291;
	@ObfuscatedName("au")
	int[] field1288;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1601274563
	)
	int field1286;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1587381431
	)
	int field1287;
	@ObfuscatedName("ax")
	int[] field1278;
	@ObfuscatedName("ac")
	int[] field1283;
	@ObfuscatedName("al")
	int[] field1290;
	@ObfuscatedName("ay")
	int[] field1275;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -632961439
	)
	int field1292;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -769331888
	)
	int field1285;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1230032791
	)
	int field1294;

	@ObfuscatedSignature(
		descriptor = "([Lvv;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1280 = new int[256]; // L: 13
		this.field1281 = 0; // L: 14
		this.field1286 = 0; // L: 19
		this.field1287 = 0; // L: 20
		this.field1292 = 0; // L: 25
		this.field1285 = 0; // L: 26
		this.field1294 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "410645251"
	)
	@Export("initColors")
	void initColors() {
		this.field1289 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1289[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1289[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1289[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1289[var1 + 192] = 16777215;
		}

		this.field1291 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1291[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1291[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1291[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1291[var1 + 192] = 16777215;
		}

		this.field1288 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1288[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1288[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1288[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1288[var1 + 192] = 16777215;
		}

		this.field1282 = new int[256]; // L: 50
		this.field1292 = 0; // L: 51
		this.field1290 = new int[32768]; // L: 52
		this.field1275 = new int[32768]; // L: 53
		this.method2543((IndexedSprite)null); // L: 54
		this.field1278 = new int[32768]; // L: 55
		this.field1283 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1515385056"
	)
	void method2566() {
		this.field1289 = null; // L: 60
		this.field1291 = null; // L: 61
		this.field1288 = null; // L: 62
		this.field1282 = null; // L: 63
		this.field1290 = null; // L: 64
		this.field1275 = null; // L: 65
		this.field1278 = null; // L: 66
		this.field1283 = null; // L: 67
		this.field1292 = 0; // L: 68
		this.field1285 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1588657219"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1278 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1294 == 0) { // L: 76
			this.field1294 = var2; // L: 77
		}

		int var3 = var2 - this.field1294; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1294 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2538(var3); // L: 83
		}

		this.method2540(var1); // L: 85
	} // L: 86

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "13162537"
	)
	final void method2538(int var1) {
		this.field1292 += 128 * var1; // L: 89
		int var2;
		if (this.field1292 > this.field1290.length) { // L: 90
			this.field1292 -= this.field1290.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2543(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1278[var2 + var3] - this.field1290[var2 + this.field1292 & this.field1290.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1278[var2++] = var6; // L: 101
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15; // L: 104

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 105
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1278[var9 + var8] = 255;
				} else {
					this.field1278[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1286 * 16 > 0) { // L: 113
			this.field1286 = this.field1286 * 16 - var1 * 4;
		}

		if (this.field1287 * 16 > 0) { // L: 114
			this.field1287 = this.field1287 * 16 - var1 * 4;
		}

		if (this.field1286 * 16 == 0 && this.field1287 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1286 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1287 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1280[var7] = this.field1280[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1280[var7] = (int)(Math.sin((double)this.field1281 / 14.0D) * 16.0D + Math.sin((double)this.field1281 / 15.0D) * 14.0D + Math.sin((double)this.field1281 / 16.0D) * 12.0D); // L: 122
			++this.field1281; // L: 123
		}

		this.field1285 = this.field1285 * 10000 + var1 * 10000; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1285 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1278[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1285 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var14 + var7 < 128) { // L: 141
						var12 += this.field1278[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1278[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1283[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var7 + var13 < 256) { // L: 150
						var12 += this.field1283[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1283[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1278[var11 + var14] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1490646676"
	)
	final int method2539(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1146996789"
	)
	final void method2540(int var1) {
		int var2 = this.field1282.length; // L: 164
		if (this.field1286 * 16 > 0) { // L: 165
			this.method2541(this.field1286 * 16, this.field1291); // L: 166
		} else if (this.field1287 * 16 > 0) { // L: 168
			this.method2541(this.field1287 * 16, this.field1288); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1282[var3] = this.field1289[var3];
			}
		}

		this.method2542(var1); // L: 174
	} // L: 175

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "1700924358"
	)
	final void method2541(int var1, int[] var2) {
		int var3 = this.field1282.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1282[var4] = this.method2539(this.field1289[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1282[var4] = var2[var4]; // L: 181
			} else {
				this.field1282[var4] = this.method2539(var2[var4], this.field1289[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1393612384"
	)
	final void method2542(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1280[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class434.rasterProvider.width) { // L: 197
				var7 = class434.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class434.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1278[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1282[var10];
					int var14 = class434.rasterProvider.pixels[var8];
					class434.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7; // L: 214
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)V",
		garbageValue = "641317882"
	)
	final void method2543(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1290.length; ++var2) {
			this.field1290[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1290[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1275[var5] = (this.field1290[var5 - 128] + this.field1290[var5 + 1] + this.field1290[var5 + 128] + this.field1290[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1290;
			this.field1290 = this.field1275;
			this.field1275 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight * 912646400; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1290[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;ZII)V",
		garbageValue = "1328682198"
	)
	static void method2563(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 194
			if (var3 == 4) { // L: 195
				class163.method3447(4); // L: 196
			}

		} else {
			if (var3 == 0) { // L: 200
				UserComparator8.method2998(var2); // L: 201
			} else {
				class163.method3447(var3); // L: 204
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 206
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 207
			Login.leftTitleSprite = class199.method3813(var4); // L: 208
			class189.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 209
			int var5 = Client.worldProperties; // L: 210
			if ((var5 & class542.field5320.rsOrdinal()) != 0) { // L: 212
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 213
			} else if ((var5 & class542.field5347.rsOrdinal()) != 0) { // L: 215
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 216
			} else if ((var5 & class542.field5325.rsOrdinal()) != 0) { // L: 218
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 219
			} else {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 222
			}

			class486.titleboxSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 225
			Fonts.field5213 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 226
			UserComparator9.field1506 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 227
			Login.field922 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 228
			ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 229
			class261.field2707 = WorldMapArchiveLoader.method8998(var1, "runes", ""); // L: 230
			class428.title_muteSprite = WorldMapArchiveLoader.method8998(var1, "title_mute", ""); // L: 231
			class141.field1647 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 232
			Login.field945 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 233
			Login.field925 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 234
			class341.field3699 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 235
			class522.field5244 = class141.field1647.subWidth; // L: 236
			class10.field58 = class141.field1647.subHeight * 912646400; // L: 237
			class91.loginScreenRunesAnimation = new LoginScreenAnimation(class261.field2707); // L: 238
			if (var2) { // L: 239
				Login.Login_username = ""; // L: 240
				Login.Login_password = ""; // L: 241
				Login.field941 = new String[8]; // L: 242
				Login.field950 = 0; // L: 243
			}

			class6.field20 = 0; // L: 245
			class146.otp = ""; // L: 246
			Login.field924 = true; // L: 247
			Login.worldSelectOpen = false; // L: 248
			class47.method900(); // L: 249
			WorldMapIcon_1.method4578(); // L: 250
			class147.method3269().method7271(false); // L: 251
			Login.clearLoginScreen = true; // L: 252
			Login.xPadding = (class74.canvasWidth - 765) / 2; // L: 253
			Login.loginBoxX = Login.xPadding + 202; // L: 254
			Login.loginBoxCenter = Login.loginBoxX + 180; // L: 255
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 256
			class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 257
			ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18);
		}
	} // L: 198

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "2017824549"
	)
	static ArrayList method2564() {
		ArrayList var0 = new ArrayList(); // L: 258
		Iterator var1 = class330.field3584.iterator(); // L: 259

		while (var1.hasNext()) {
			class342 var2 = (class342)var1.next(); // L: 260
			var0.add(var2); // L: 262
		}

		return var0; // L: 265
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1563247861"
	)
	static void method2551(int var0, int var1) {
		if (class105.clientPreferences.method2654() != 0 && var0 != -1) { // L: 4200
			ArrayList var2 = new ArrayList(); // L: 4201
			var2.add(new class342(class388.field4545, var0, 0, class105.clientPreferences.method2654(), false)); // L: 4202
			FontName.method9220(var2, 0, 0, 0, 0, true); // L: 4203
			Client.playingJingle = true; // L: 4204
		}

	} // L: 4206
}
