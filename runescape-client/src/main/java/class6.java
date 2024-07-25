import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public enum class6 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	field19(0, 0);

	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 957914991
	)
	static int field20;
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -251261135
	)
	static int field16;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -262485181
	)
	public final int field17;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1967221797
	)
	final int field18;

	class6(int var3, int var4) {
		this.field17 = var3; // L: 12
		this.field18 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field18;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lvc;",
		garbageValue = "-16782974"
	)
	public static PrivateChatMode method40(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5501, PrivateChatMode.field5502, PrivateChatMode.field5500};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field5503) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-2126449872"
	)
	public static String method41(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) { // L: 18
			CharSequence var10 = var0[var1]; // L: 19
			return var10 == null ? "null" : var10.toString(); // L: 20 21
		} else {
			int var3 = var2 + var1; // L: 23
			int var4 = 0; // L: 24

			for (int var5 = var1; var5 < var3; ++var5) { // L: 25
				CharSequence var9 = var0[var5]; // L: 26
				if (var9 == null) { // L: 27
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 28
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 30

			for (int var6 = var1; var6 < var3; ++var6) { // L: 31
				CharSequence var7 = var0[var6];
				if (var7 == null) { // L: 33
					var8.append("null");
				} else {
					var8.append(var7); // L: 34
				}
			}

			return var8.toString(); // L: 36
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Lda;",
		garbageValue = "0"
	)
	static class92[] method37() {
		return new class92[]{class92.field1117, class92.field1109, class92.field1116, class92.field1110, class92.field1113, class92.field1112}; // L: 17
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "140788292"
	)
	public static int method39(int var0) {
		return class496.field5051[var0 & 16383]; // L: 32
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	static void method36() {
		Login.Login_username = Login.Login_username.trim(); // L: 1094
		if (Login.Login_username.length() == 0) { // L: 1095
			VerticalAlignment.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1096
		} else {
			long var1 = GrandExchangeOfferOwnWorldComparator.method1234(); // L: 1100
			byte var0;
			if (var1 == 0L) { // L: 1101
				var0 = 5;
			} else {
				String var4 = Login.Login_username; // L: 1104
				Random var5 = new Random(); // L: 1106
				Buffer var6 = new Buffer(128); // L: 1107
				Buffer var7 = new Buffer(128); // L: 1108
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1109 1110 1111 1112 1113
				var6.writeByte(10); // L: 1114

				int var9;
				for (var9 = 0; var9 < 4; ++var9) { // L: 1115
					var6.writeInt(var5.nextInt()); // L: 1116
				}

				var6.writeInt(var8[0]); // L: 1118
				var6.writeInt(var8[1]); // L: 1119
				var6.writeLong(var1); // L: 1120
				var6.writeLong(0L); // L: 1121

				for (var9 = 0; var9 < 4; ++var9) { // L: 1122
					var6.writeInt(var5.nextInt()); // L: 1123
				}

				var6.encryptRsa(class74.field888, class74.field897); // L: 1125
				var7.writeByte(10); // L: 1126

				for (var9 = 0; var9 < 3; ++var9) { // L: 1127
					var7.writeInt(var5.nextInt()); // L: 1128
				}

				var7.writeLong(var5.nextLong()); // L: 1130
				var7.method9544(var5.nextLong()); // L: 1131
				SoundSystem.method873(var7); // L: 1132
				var7.writeLong(var5.nextLong()); // L: 1133
				var7.encryptRsa(class74.field888, class74.field897); // L: 1134
				var9 = Actor.stringCp1252NullTerminatedByteSize(var4); // L: 1135
				if (var9 % 8 != 0) { // L: 1136
					var9 += 8 - var9 % 8;
				}

				Buffer var10 = new Buffer(var9); // L: 1137
				var10.writeStringCp1252NullTerminated(var4); // L: 1138
				var10.offset = var9; // L: 1139
				var10.xteaEncryptAll(var8); // L: 1140
				Buffer var11 = new Buffer(var10.offset + var6.offset + var7.offset + 5); // L: 1141
				var11.writeByte(2); // L: 1142
				var11.writeByte(var6.offset); // L: 1143
				var11.writeBytes(var6.array, 0, var6.offset); // L: 1144
				var11.writeByte(var7.offset); // L: 1145
				var11.writeBytes(var7.array, 0, var7.offset); // L: 1146
				var11.writeShort(var10.offset); // L: 1147
				var11.writeBytes(var10.array, 0, var10.offset); // L: 1148
				String var12 = Player.method2464(var11.array); // L: 1149

				byte var3;
				try {
					URL var13 = new URL(class68.method1248("services", false) + "m=accountappeal/login.ws"); // L: 1151
					URLConnection var14 = var13.openConnection(); // L: 1152
					var14.setDoInput(true); // L: 1153
					var14.setDoOutput(true); // L: 1154
					var14.setConnectTimeout(5000); // L: 1155
					OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream()); // L: 1156
					var15.write("data2=" + class537.method9449(var12) + "&dest=" + class537.method9449("passwordchoice.ws")); // L: 1157
					var15.flush(); // L: 1158
					InputStream var16 = var14.getInputStream(); // L: 1159
					var11 = new Buffer(new byte[1000]); // L: 1160

					while (true) {
						int var17 = var16.read(var11.array, var11.offset, 1000 - var11.offset); // L: 1162
						if (var17 == -1) { // L: 1163
							var15.close(); // L: 1170
							var16.close(); // L: 1171
							String var20 = new String(var11.array); // L: 1172
							if (var20.startsWith("OFFLINE")) { // L: 1173
								var3 = 4; // L: 1174
							} else if (var20.startsWith("WRONG")) { // L: 1177
								var3 = 7; // L: 1178
							} else if (var20.startsWith("RELOAD")) { // L: 1181
								var3 = 3; // L: 1182
							} else if (var20.startsWith("Not permitted for social network accounts.")) { // L: 1185
								var3 = 6; // L: 1186
							} else {
								var11.xteaDecryptAll(var8); // L: 1189

								while (var11.offset > 0 && var11.array[var11.offset - 1] == 0) { // L: 1190
									--var11.offset; // L: 1191
								}

								var20 = new String(var11.array, 0, var11.offset); // L: 1193
								boolean var18;
								if (var20 == null) { // L: 1196
									var18 = false; // L: 1197
								} else {
									label103: {
										try {
											new URL(var20);
										} catch (MalformedURLException var21) { // L: 1203
											var18 = false; // L: 1204
											break label103; // L: 1205
										}

										var18 = true; // L: 1207
									}
								}

								if (var18) { // L: 1209
									class421.openURL(var20, true, false); // L: 1210
									var3 = 2; // L: 1211
								} else {
									var3 = 5; // L: 1213
								}
							}
							break;
						}

						var11.offset += var17; // L: 1164
						if (var11.offset >= 1000) { // L: 1165
							var3 = 5; // L: 1166
							break;
						}
					}
				} catch (Throwable var22) { // L: 1215
					var22.printStackTrace(); // L: 1216
					var3 = 5; // L: 1217
				}

				var0 = var3; // L: 1220
			}

			switch(var0) { // L: 1222
			case 2:
				VerticalAlignment.setLoginResponseString(Strings.field4293, Strings.field4161, Strings.field4384); // L: 1227
				class163.method3447(6); // L: 1228
				break; // L: 1229
			case 3:
				VerticalAlignment.setLoginResponseString("", "Error connecting to server.", ""); // L: 1240
				break;
			case 4:
				VerticalAlignment.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1234
				break; // L: 1235
			case 5:
				VerticalAlignment.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1237
				break; // L: 1238
			case 6:
				VerticalAlignment.setLoginResponseString("", "Error connecting to server.", ""); // L: 1231
				break; // L: 1232
			case 7:
				VerticalAlignment.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1224
			}

		}
	} // L: 1097 1243

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1930833559"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 13407
		short[] var2 = new short[16]; // L: 13408
		int var3 = 0; // L: 13409

		for (int var4 = 0; var4 < class76.ItemComposition_fileCount; ++var4) { // L: 13410
			ItemComposition var9 = class164.ItemComposition_get(var4); // L: 13411
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 13412 13413 13414
				if (var3 >= 250) { // L: 13415
					InterfaceParent.foundItemIdCount = -1; // L: 13416
					WorldMapLabelSize.foundItemIds = null; // L: 13417
					return; // L: 13418
				}

				if (var3 >= var2.length) { // L: 13420
					short[] var6 = new short[var2.length * 2]; // L: 13421

					for (int var7 = 0; var7 < var3; ++var7) { // L: 13422
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 13423
				}

				var2[var3++] = (short)var4; // L: 13425
			}
		}

		WorldMapLabelSize.foundItemIds = var2; // L: 13427
		MenuAction.foundItemIndex = 0; // L: 13428
		InterfaceParent.foundItemIdCount = var3; // L: 13429
		String[] var8 = new String[InterfaceParent.foundItemIdCount]; // L: 13430

		for (int var5 = 0; var5 < InterfaceParent.foundItemIdCount; ++var5) { // L: 13431
			var8[var5] = class164.ItemComposition_get(var2[var5]).name;
		}

		class175.method3558(var8, WorldMapLabelSize.foundItemIds); // L: 13432
	} // L: 13433
}
