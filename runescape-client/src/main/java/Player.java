import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -227316761
	)
	int field1120;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -526627409
	)
	int field1137;
	@ObfuscatedName("aj")
	String[] field1122;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -928426009
	)
	int field1121;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 493218289
	)
	int field1124;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1427353479
	)
	int field1123;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1883916637
	)
	int field1119;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -804506783
	)
	int field1118;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1067051769
	)
	int field1128;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -762257201
	)
	int field1129;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1969000863
	)
	int field1130;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	Model field1131;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 453202295
	)
	int field1132;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 950609833
	)
	int field1126;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1925049089
	)
	int field1134;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1321984477
	)
	int field1139;
	@ObfuscatedName("as")
	boolean field1125;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1196811517
	)
	int field1143;
	@ObfuscatedName("at")
	boolean field1138;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 661219069
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1676236885
	)
	int field1140;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	TriBool field1141;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	TriBool field1142;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	TriBool field1133;
	@ObfuscatedName("be")
	boolean field1144;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -277668463
	)
	int field1135;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -222891375
	)
	int field1145;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	class101 field1147;

	Player() {
		this.field1120 = -1; // L: 19
		this.field1137 = -1; // L: 20
		this.field1122 = new String[3]; // L: 22

		for (int var1 = 0; var1 < 3; ++var1) { // L: 25
			this.field1122[var1] = "";
		}

		this.field1121 = 0; // L: 28
		this.field1124 = 0; // L: 29
		this.field1119 = 0; // L: 31
		this.field1118 = 0; // L: 32
		this.field1125 = false;
		this.field1143 = 0;
		this.field1138 = false; // L: 43
		this.field1141 = TriBool.TriBool_unknown; // L: 46
		this.field1142 = TriBool.TriBool_unknown;
		this.field1133 = TriBool.TriBool_unknown;
		this.field1144 = false; // L: 49
		this.field1147 = class511.field5137;
	} // L: 54

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 204
			return null;
		} else {
			SequenceDefinition var1 = super.field1235 != -1 && super.field1238 == 0 ? class353.SequenceDefinition_get(super.field1235) : null; // L: 205
			SequenceDefinition var2 = super.field1198 == -1 || this.field1125 || super.field1198 == super.field1196 && var1 != null ? null : class353.SequenceDefinition_get(super.field1198); // L: 206
			Model var3 = this.appearance.getModel(var1, super.field1236, var2, super.field1232); // L: 207
			if (var3 == null) { // L: 208
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 209
				super.field1250 = var3.height; // L: 210
				int var4 = var3.indicesCount; // L: 211
				if (!this.field1125) { // L: 212
					var3 = this.method2476(var3); // L: 213
				}

				if (!this.field1125 && this.field1131 != null) { // L: 215
					if (Client.cycle >= this.field1118) { // L: 216
						this.field1131 = null;
					}

					if (Client.cycle >= this.field1119 && Client.cycle < this.field1118) { // L: 217
						Model var5 = this.field1131; // L: 218
						var5.offsetBy(this.field1128 * 4096 - super.x, this.field1129 - this.field1123, this.field1130 * 4096 - super.field1191); // L: 219
						if (super.field1257 == 512) { // L: 220
							var5.rotateY90Ccw(); // L: 221
							var5.rotateY90Ccw(); // L: 222
							var5.rotateY90Ccw(); // L: 223
						} else if (super.field1257 == 1024) { // L: 225
							var5.rotateY90Ccw(); // L: 226
							var5.rotateY90Ccw(); // L: 227
						} else if (super.field1257 == 1536) { // L: 229
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5}; // L: 230
						var3 = new Model(var6, 2); // L: 231
						if (super.field1257 == 512) { // L: 232
							var5.rotateY90Ccw();
						} else if (super.field1257 == 1024) { // L: 233
							var5.rotateY90Ccw(); // L: 234
							var5.rotateY90Ccw(); // L: 235
						} else if (super.field1257 == 1536) { // L: 237
							var5.rotateY90Ccw(); // L: 238
							var5.rotateY90Ccw(); // L: 239
							var5.rotateY90Ccw(); // L: 240
						}

						var5.offsetBy(super.x - this.field1128 * 4096, this.field1123 - this.field1129, super.field1191 - this.field1130 * 4096); // L: 242
					}
				}

				var3.isSingleTile = true; // L: 245
				if (super.field1239 != 0 && Client.cycle >= super.field1251 && Client.cycle < super.field1215) { // L: 246
					var3.field3152 = super.field1223; // L: 247
					var3.field3106 = super.field1254; // L: 248
					var3.field3154 = super.field1255; // L: 249
					var3.overrideAmount = super.field1239; // L: 250
					var3.field3156 = (short)var4; // L: 251
				} else {
					var3.overrideAmount = 0; // L: 254
				}

				return var3; // L: 256
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "572565498"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 57
		byte var2 = var1.readByte(); // L: 58
		boolean var3 = true;
		this.field1120 = var1.readByte(); // L: 60
		this.field1137 = var1.readByte();
		int var4 = -1;
		this.field1143 = 0;
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 == 0) {
				var5[var6] = 0;
			} else {
				var8 = var1.readUnsignedByte(); // L: 71
				var5[var6] = var8 + (var7 << 8);
				if (var6 == 0 && var5[0] == 65535) { // L: 73
					var4 = var1.readUnsignedShort();
					break;
				}

				if (var5[var6] >= 512) { // L: 77
					var9 = class164.ItemComposition_get(var5[var6] - 512).field2257;
					if (var9 != 0) { // L: 79
						this.field1143 = var9;
					}
				}
			}
		}

		int[] var13 = new int[12]; // L: 82

		for (var7 = 0; var7 < 12; ++var7) { // L: 83
			var8 = var1.readUnsignedByte(); // L: 84
			if (var8 == 0) { // L: 85
				var13[var7] = 0; // L: 86
			} else {
				var9 = var1.readUnsignedByte(); // L: 89
				var13[var7] = var9 + (var8 << 8); // L: 90
			}
		}

		int[] var14 = new int[5]; // L: 92

		for (var8 = 0; var8 < 5; ++var8) { // L: 93
			var9 = var1.readUnsignedByte(); // L: 94
			if (var9 < 0 || var9 >= class105.field1371[var8].length) { // L: 95
				var9 = 0;
			}

			var14[var8] = var9; // L: 96
		}

		super.field1196 = var1.readUnsignedShort(); // L: 98
		if (super.field1196 == 65535) { // L: 99
			super.field1196 = -1;
		}

		super.field1197 = var1.readUnsignedShort(); // L: 100
		if (super.field1197 == 65535) { // L: 101
			super.field1197 = -1;
		}

		super.field1207 = super.field1197; // L: 102
		super.field1199 = var1.readUnsignedShort(); // L: 103
		if (super.field1199 == 65535) { // L: 104
			super.field1199 = -1;
		}

		super.field1200 = var1.readUnsignedShort(); // L: 105
		if (super.field1200 == 65535) { // L: 106
			super.field1200 = -1;
		}

		super.field1201 = var1.readUnsignedShort(); // L: 107
		if (super.field1201 == 65535) { // L: 108
			super.field1201 = -1;
		}

		super.field1222 = var1.readUnsignedShort(); // L: 109
		if (super.field1222 == 65535) { // L: 110
			super.field1222 = -1;
		}

		super.field1203 = var1.readUnsignedShort(); // L: 111
		if (super.field1203 == 65535) { // L: 112
			super.field1203 = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), Projectile.loginType); // L: 113
		this.method2406();
		this.method2457();
		this.method2412();
		if (this == SoundCache.localPlayer) {
			RunException.field5518 = this.username.getName();
		}

		this.field1121 = var1.readUnsignedByte(); // L: 118
		this.field1124 = var1.readUnsignedShort();
		this.field1138 = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.field1138 = false;
		}

		class172[] var15 = null; // L: 122
		boolean var17 = false;
		int var10 = var1.readUnsignedShort();
		var17 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) { // L: 126
			var15 = new class172[12];

			for (var11 = 0; var11 < 12; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) { // L: 130
					var15[var11] = class216.method4192(var5[var11] - 512, var1);
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.field1122[var11] = var1.readStringCp1252NullTerminated(); // L: 136
		}

		byte var16 = var1.readByte(); // L: 138
		if (this.appearance == null) { // L: 139
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6572(var13, var5, var15, var17, var14, var2, var4, var16);
	} // L: 141

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "24542"
	)
	boolean method2405() {
		if (this.field1141 == TriBool.TriBool_unknown) { // L: 144
			this.checkIsFriend(); // L: 145
		}

		return this.field1141 == TriBool.TriBool_true; // L: 147
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	void method2406() {
		this.field1141 = TriBool.TriBool_unknown; // L: 151
	} // L: 152

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1848612579"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.field1141 = class135.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 155
	} // L: 156

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1947378964"
	)
	boolean method2408() {
		if (this.field1142 == TriBool.TriBool_unknown) { // L: 159
			this.updateIsInFriendsChat(); // L: 160
		}

		return this.field1142 == TriBool.TriBool_true; // L: 162
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1252838484"
	)
	void method2457() {
		this.field1142 = TriBool.TriBool_unknown; // L: 166
	} // L: 167

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1302191943"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.field1142 = Decimator.friendsChatManager != null && Decimator.friendsChatManager.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 170
	} // L: 171

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "866332921"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 174
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3409(this.username.getName()) != -1 && var1 != 2) { // L: 175 176
				this.field1133 = TriBool.TriBool_true; // L: 177
				return; // L: 178
			}
		}

		this.field1133 = TriBool.TriBool_false; // L: 182
	} // L: 183

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	void method2412() {
		this.field1133 = TriBool.TriBool_unknown; // L: 186
	} // L: 187

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1671772168"
	)
	boolean method2413() {
		if (this.field1133 == TriBool.TriBool_unknown) { // L: 190
			this.updateIsInClanChat(); // L: 191
		}

		return this.field1133 == TriBool.TriBool_true; // L: 193
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1621403048"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class76.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 197 198 200
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lde;IILjb;B)V",
		garbageValue = "14"
	)
	final void method2437(class101 var1, int var2, int var3, class238 var4) {
		if (super.field1235 != -1 && class353.SequenceDefinition_get(super.field1235).field2283 == 1) { // L: 260
			super.field1235 = -1;
		}

		this.method2485(); // L: 261
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 262
			if (super.field1204[0] >= 0 && super.field1204[0] < 104 && super.field1246[0] >= 0 && super.field1246[0] < 104) { // L: 263
				if (var4 == class238.field2509) { // L: 265
					Player var5 = this; // L: 266
					class238 var6 = class238.field2509; // L: 267
					int var7 = super.field1204[0]; // L: 269
					int var8 = super.field1246[0]; // L: 270
					int var9 = this.transformedSize(); // L: 271
					if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var2 >= var9 && var2 < 104 - var9 && var3 >= var9 && var3 < 104 - var9) { // L: 272 273
						int var10 = Client.field520.method4512(var7, var8, this.transformedSize(), Timer.method8348(var2, var3), var1.field1317[this.plane], true, Client.field641, Client.field671); // L: 274
						if (var10 >= 1) { // L: 275
							for (int var11 = 0; var11 < var10 - 1; ++var11) { // L: 276
								var5.method2418(Client.field641[var11], Client.field671[var11], var6);
							}
						}
					}
				}

				this.method2418(var2, var3, var4); // L: 279
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	} // L: 281

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-17"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.field1229 = 0; // L: 284
		super.field1265 = 0; // L: 285
		super.field1264 = 0; // L: 286
		super.field1204[0] = var1; // L: 287
		super.field1246[0] = var2; // L: 288
		int var3 = this.transformedSize(); // L: 289
		super.x = var3 * 64 + super.field1204[0] * 128; // L: 290
		super.field1191 = var3 * 64 + super.field1246[0] * 128; // L: 291
	} // L: 292

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IILjb;B)V",
		garbageValue = "-20"
	)
	final void method2418(int var1, int var2, class238 var3) {
		if (super.field1229 < 9) { // L: 295
			++super.field1229;
		}

		for (int var4 = super.field1229; var4 > 0; --var4) { // L: 296
			super.field1204[var4] = super.field1204[var4 - 1]; // L: 297
			super.field1246[var4] = super.field1246[var4 - 1]; // L: 298
			super.field1263[var4] = super.field1263[var4 - 1]; // L: 299
		}

		super.field1204[0] = var1; // L: 301
		super.field1246[0] = var2; // L: 302
		super.field1263[0] = var3; // L: 303
	} // L: 304

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1756478951"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 307
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BB)Ljava/lang/String;",
		garbageValue = "64"
	)
	public static String method2464(byte[] var0) {
		int var2 = var0.length; // L: 59
		StringBuilder var3 = new StringBuilder(); // L: 61

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) { // L: 62
			int var5 = var0[var4] & 255; // L: 63
			var3.append(class414.field4669[var5 >>> 2]); // L: 64
			if (var4 < var2 - 1) { // L: 65
				int var6 = var0[var4 + 1] & 255; // L: 66
				var3.append(class414.field4669[(var5 & 3) << 4 | var6 >>> 4]); // L: 67
				if (var4 < var2 - 2) { // L: 68
					int var7 = var0[var4 + 2] & 255; // L: 69
					var3.append(class414.field4669[(var6 & 15) << 2 | var7 >>> 6]).append(class414.field4669[var7 & 63]); // L: 70
				} else {
					var3.append(class414.field4669[(var6 & 15) << 2]).append("="); // L: 72
				}
			} else {
				var3.append(class414.field4669[(var5 & 3) << 4]).append("=="); // L: 74
			}
		}

		String var1 = var3.toString(); // L: 76
		return var1; // L: 78
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "12"
	)
	static int method2462(int var0, int var1) {
		if (var0 == -2) { // L: 39
			return 12345678;
		} else if (var0 == -1) { // L: 40
			if (var1 < 0) { // L: 41
				var1 = 0; // L: 42
			} else if (var1 > 127) { // L: 44
				var1 = 127; // L: 45
			}

			var1 = 127 - var1; // L: 47
			return var1; // L: 48
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 50
			if (var1 < 2) { // L: 51
				var1 = 2;
			} else if (var1 > 126) { // L: 52
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 53
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-15"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4830) { // L: 114
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4844) { // L: 115
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 116
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4837) { // L: 119
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 120
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4828) { // L: 123
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 124
			} else if (var0.length == 30000 && ByteArrayPool.field4835 < ByteArrayPool.field4839) { // L: 127
				ByteArrayPool.field4843[++ByteArrayPool.field4835 - 1] = var0; // L: 128
			} else {
				if (class19.ByteArrayPool_arrays != null) { // L: 131
					for (int var2 = 0; var2 < class153.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 132
						if (var0.length == class153.ByteArrayPool_alternativeSizes[var2] && class450.ByteArrayPool_altSizeArrayCounts[var2] < class19.ByteArrayPool_arrays[var2].length) { // L: 133
							class19.ByteArrayPool_arrays[var2][class450.ByteArrayPool_altSizeArrayCounts[var2]++] = var0; // L: 134
							return; // L: 135
						}
					}
				}

			}
		}
	} // L: 117 121 125 129 140

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lue;B)Ljava/lang/Object;",
		garbageValue = "-13"
	)
	static Object method2461(class534 var0) {
		if (var0 == null) { // L: 5385
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5386
		} else {
			switch(var0.field5287) { // L: 5388
			case 0:
				return Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5394
			case 1:
				return Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 5390
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5392
			}
		}
	}
}
