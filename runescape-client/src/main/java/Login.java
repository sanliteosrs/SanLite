import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Login")
public class Login {
	@ObfuscatedName("ad")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 48347693
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field922;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field945;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field925;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 769603281
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 3332333
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1109948055
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("am")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -782608359
	)
	static int field931;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 920051483
	)
	static int field932;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -59444677
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cv")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cl")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cm")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cg")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cu")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cn")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1139372411
	)
	static int field950;
	@ObfuscatedName("ch")
	static String[] field941;
	@ObfuscatedName("cs")
	static String field948;
	@ObfuscatedName("cb")
	static boolean field943;
	@ObfuscatedName("cz")
	static boolean field959;
	@ObfuscatedName("ca")
	static boolean field924;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1276208829
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dn")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1391907999
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -2077730609
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1867410509
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		longValue = 5231889937501240551L
	)
	static long field953;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		longValue = 7259940804597753815L
	)
	static long field954;
	@ObfuscatedName("dy")
	static String[] field955;
	@ObfuscatedName("dw")
	static String[] field940;
	@ObfuscatedName("dh")
	static String[] field942;

	static {
		xPadding = 0; // L: 59
		loginBoxX = xPadding + 202; // L: 78
		Login_loadingPercent = 10; // L: 80
		Login_loadingText = ""; // L: 81
		field931 = -1;
		field932 = 1;
		loginIndex = 0; // L: 109
		Login_response0 = "";
		Login_response1 = ""; // L: 111
		Login_response2 = ""; // L: 112
		Login_response3 = ""; // L: 113
		Login_username = ""; // L: 114
		Login_password = ""; // L: 115
		field950 = 0; // L: 117
		field941 = new String[8]; // L: 118
		field948 = ""; // L: 123
		field943 = false; // L: 130
		field959 = false; // L: 131
		field924 = true; // L: 134
		currentLoginField = 0; // L: 135
		worldSelectOpen = false; // L: 139
		hoveredWorldIndex = -1; // L: 147
		worldSelectPage = 0; // L: 148
		worldSelectPagesCount = 0; // L: 149
		new DecimalFormat("##0.00"); // L: 152
		new class138();
		field953 = -1L; // L: 160
		field954 = -1L; // L: 161
		field955 = new String[]{"title.jpg"}; // L: 164
		field940 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 167
		field942 = new String[]{"logo_speedrunning"}; // L: 170
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lde;[BIIIII)V",
		garbageValue = "-383129273"
	)
	static final void method2220(class101 var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var7;
		int var8;
		if (var0.field1317 != null) { // L: 91
			for (int var6 = 0; var6 < 4; ++var6) { // L: 92
				for (var7 = 0; var7 < 64; ++var7) { // L: 93
					for (var8 = 0; var8 < 64; ++var8) { // L: 94
						if (var7 + var2 > 0 && var7 + var2 < var0.field1317[var6].flags.length && var3 + var8 > 0 && var3 + var8 < var0.field1317[var6].flags[var7 + var2].length) { // L: 95
							int[] var10000 = var0.field1317[var6].flags[var7 + var2];
							var10000[var8 + var3] &= -1073741825;
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1); // L: 100

		for (var7 = 0; var7 < 4; ++var7) { // L: 101
			for (var8 = 0; var8 < 64; ++var8) { // L: 102
				for (int var9 = 0; var9 < 64; ++var9) { // L: 103
					int var10 = var8 + var2; // L: 104
					int var11 = var3 + var9; // L: 105
					WorldMapSection1.method5043(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0); // L: 106
				}
			}
		}

	} // L: 110

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1190216591"
	)
	static final int method2201(int var0, int var1) {
		int var2 = class176.method3563(var0 - 1, var1 - 1) + class176.method3563(1 + var0, var1 - 1) + class176.method3563(var0 - 1, var1 + 1) + class176.method3563(1 + var0, 1 + var1); // L: 1003
		int var3 = class176.method3563(var0 - 1, var1) + class176.method3563(var0 + 1, var1) + class176.method3563(var0, var1 - 1) + class176.method3563(var0, 1 + var1); // L: 1004
		int var4 = class176.method3563(var0, var1); // L: 1005
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 1006
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIIIILip;S)V",
		garbageValue = "339"
	)
	static final void method2206(class101 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, CollisionMap var9) {
		ObjectComposition var10 = class10.getObjectDefinition(var5); // L: 1047
		int var11 = var8 >= 0 ? var8 : var10.animationId; // L: 1048
		int var12;
		int var13;
		if (var6 != 1 && var6 != 3) { // L: 1051
			var12 = var10.sizeX; // L: 1056
			var13 = var10.sizeY; // L: 1057
		} else {
			var12 = var10.sizeY; // L: 1052
			var13 = var10.sizeX; // L: 1053
		}

		int var14;
		int var15;
		if (var3 + var12 <= var0.field1332) { // L: 1063
			var14 = var3 + (var12 >> 1); // L: 1064
			var15 = var3 + (var12 + 1 >> 1); // L: 1065
		} else {
			var14 = var3; // L: 1068
			var15 = var3 + 1; // L: 1069
		}

		int var16;
		int var17;
		if (var13 + var4 <= var0.field1320) { // L: 1071
			var16 = (var13 >> 1) + var4; // L: 1072
			var17 = (var13 + 1 >> 1) + var4; // L: 1073
		} else {
			var16 = var4; // L: 1076
			var17 = var4 + 1; // L: 1077
		}

		int[][] var18 = var0.field1327[var2]; // L: 1079
		int var19 = var18[var15][var16] + var18[var14][var16] + var18[var14][var17] + var18[var15][var17] >> 2; // L: 1080
		int var20 = (var3 << 7) + (var12 << 6); // L: 1081
		int var21 = (var4 << 7) + (var13 << 6); // L: 1082
		class282 var22 = var0.field1316; // L: 1083
		long var23 = FileSystem.method4223(var3, var4, 2, var10.int1 == 0, var5, var0.field1328); // L: 1084
		int var25 = (var6 << 6) + var7; // L: 1085
		if (var10.int3 == 1) { // L: 1086
			var25 += 256;
		}

		Object var33;
		if (var7 == 22) { // L: 1087
			if (var11 == -1 && var10.transforms == null) { // L: 1089
				var33 = var10.getModel(22, var6, var18, var20, var19, var21);
			} else {
				var33 = new class81(var0, var5, 22, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1090
			}

			var22.method5420(var1, var3, var4, var19, (Renderable)var33, var23, var25); // L: 1091
			if (var10.interactType == 1 && var9 != null) { // L: 1092
				var9.method4415(var3, var4);
			}

		} else if (var7 != 10 && var7 != 11) { // L: 1095
			if (var7 >= 12) { // L: 1103
				if (var11 == -1 && var10.transforms == null) { // L: 1105
					var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
				} else {
					var33 = new class81(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1106
				}

				var22.method5424(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25); // L: 1107
				if (var10.interactType != 0 && var9 != null) { // L: 1108
					var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
				}

			} else if (var7 == 0) { // L: 1111
				if (var11 == -1 && var10.transforms == null) { // L: 1113
					var33 = var10.getModel(0, var6, var18, var20, var19, var21);
				} else {
					var33 = new class81(var0, var5, 0, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1114
				}

				var22.method5422(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, class83.field1040[var6], 0, var23, var25); // L: 1115
				if (var10.interactType != 0 && var9 != null) { // L: 1116
					var9.method4412(var3, var4, var7, var6, var10.boolean1);
				}

			} else if (var7 == 1) { // L: 1119
				if (var11 == -1 && var10.transforms == null) { // L: 1121
					var33 = var10.getModel(1, var6, var18, var20, var19, var21);
				} else {
					var33 = new class81(var0, var5, 1, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1122
				}

				var22.method5422(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, class83.field1041[var6], 0, var23, var25); // L: 1123
				if (var10.interactType != 0 && var9 != null) { // L: 1124
					var9.method4412(var3, var4, var7, var6, var10.boolean1);
				}

			} else {
				int var26;
				if (var7 == 2) { // L: 1127
					var26 = var6 + 1 & 3; // L: 1128
					Object var28;
					Object var34;
					if (var11 == -1 && var10.transforms == null) { // L: 1131
						var34 = var10.getModel(2, var6 + 4, var18, var20, var19, var21); // L: 1132
						var28 = var10.getModel(2, var26, var18, var20, var19, var21); // L: 1133
					} else {
						var34 = new class81(var0, var5, 2, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1136
						var28 = new class81(var0, var5, 2, var26, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1137
					}

					var22.method5422(var1, var3, var4, var19, (Renderable)var34, (Renderable)var28, class83.field1040[var6], class83.field1040[var26], var23, var25); // L: 1139
					if (var10.interactType != 0 && var9 != null) { // L: 1140
						var9.method4412(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 3) { // L: 1143
					if (var11 == -1 && var10.transforms == null) { // L: 1145
						var33 = var10.getModel(3, var6, var18, var20, var19, var21);
					} else {
						var33 = new class81(var0, var5, 3, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1146
					}

					var22.method5422(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, class83.field1041[var6], 0, var23, var25); // L: 1147
					if (var10.interactType != 0 && var9 != null) { // L: 1148
						var9.method4412(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 9) { // L: 1151
					if (var11 == -1 && var10.transforms == null) { // L: 1153
						var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
					} else {
						var33 = new class81(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1154
					}

					var22.method5424(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25); // L: 1155
					if (var10.interactType != 0 && var9 != null) { // L: 1156
						var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
					}

				} else if (var7 == 4) { // L: 1159
					if (var11 == -1 && var10.transforms == null) { // L: 1161
						var33 = var10.getModel(4, var6, var18, var20, var19, var21);
					} else {
						var33 = new class81(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1162
					}

					var22.method5512(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, class83.field1040[var6], 0, 0, 0, var23, var25); // L: 1163
				} else {
					long var27;
					Object var29;
					if (var7 == 5) { // L: 1166
						var26 = 16; // L: 1167
						var27 = var22.method5440(var1, var3, var4); // L: 1168
						if (0L != var27) { // L: 1169
							var26 = class10.getObjectDefinition(class229.Entity_unpackID(var27)).int2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1171
							var29 = var10.getModel(4, var6, var18, var20, var19, var21);
						} else {
							var29 = new class81(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1172
						}

						var22.method5512(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, class83.field1040[var6], 0, class83.field1042[var6] * var26, class83.field1043[var6] * var26, var23, var25); // L: 1173
					} else if (var7 == 6) { // L: 1176
						var26 = 8; // L: 1177
						var27 = var22.method5440(var1, var3, var4); // L: 1178
						if (var27 != 0L) { // L: 1179
							var26 = class10.getObjectDefinition(class229.Entity_unpackID(var27)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) { // L: 1181
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
						} else {
							var29 = new class81(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1182
						}

						var22.method5512(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, 256, var6, class83.field1032[var6] * var26, class83.field1045[var6] * var26, var23, var25); // L: 1183
					} else if (var7 == 7) { // L: 1186
						int var32 = var6 + 2 & 3; // L: 1188
						if (var11 == -1 && var10.transforms == null) { // L: 1189
							var33 = var10.getModel(4, var32 + 4, var18, var20, var19, var21);
						} else {
							var33 = new class81(var0, var5, 4, var32 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1190
						}

						var22.method5512(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, 256, var32, 0, 0, var23, var25); // L: 1191
					} else if (var7 == 8) { // L: 1194
						var26 = 8; // L: 1195
						var27 = var22.method5440(var1, var3, var4); // L: 1196
						if (0L != var27) { // L: 1197
							var26 = class10.getObjectDefinition(class229.Entity_unpackID(var27)).int2 / 2;
						}

						int var31 = var6 + 2 & 3; // L: 1200
						Object var30;
						if (var11 == -1 && var10.transforms == null) { // L: 1201
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21); // L: 1202
							var30 = var10.getModel(4, var31 + 4, var18, var20, var19, var21); // L: 1203
						} else {
							var29 = new class81(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1206
							var30 = new class81(var0, var5, 4, var31 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1207
						}

						var22.method5512(var1, var3, var4, var19, (Renderable)var29, (Renderable)var30, 256, var6, class83.field1032[var6] * var26, class83.field1045[var6] * var26, var23, var25); // L: 1209
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) { // L: 1097
				var33 = var10.getModel(10, var6, var18, var20, var19, var21);
			} else {
				var33 = new class81(var0, var5, 10, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null); // L: 1098
			}

			if (var33 != null) {
				var22.method5424(var1, var3, var4, var19, var12, var13, (Renderable)var33, var7 == 11 ? 256 : 0, var23, var25); // L: 1099
			}

			if (var10.interactType != 0 && var9 != null) { // L: 1100
				var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
			}

		}
	} // L: 1093 1101 1109 1117 1125 1141 1149 1157 1164 1174 1184 1192 1210 1212

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-2104138455"
	)
	static void method2185(int var0, String var1) {
		Login_loadingText = var1; // L: 2158
		Login_loadingPercent = var0; // L: 2159
	} // L: 2160
}
