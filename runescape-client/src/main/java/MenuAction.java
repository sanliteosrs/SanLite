import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		intValue = -363728951
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2062474031
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1267834327
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 891244755
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -214451643
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1511342341
	)
	int field904;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -919022825
	)
	int field903;
	@ObfuscatedName("aj")
	String field898;
	@ObfuscatedName("av")
	String field905;

	MenuAction() {
	} // L: 13672

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-37"
	)
	static final void method2160(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		class101 var10 = null; // L: 10032
		if (var5 >= 0 && class511.field5137.field1331[var5] != null) { // L: 10033
			var10 = class511.field5137.field1331[var5].field4971; // L: 10034
		} else if (var5 == -1) { // L: 10036
			var10 = class511.field5137; // L: 10037
		}

		if (var10 != null) { // L: 10039
			int var11 = var10.field1321; // L: 10040
			int var12 = var10.field1323; // L: 10041
			class103[] var13 = var10.field1315; // L: 10042
			Player[] var14 = var10.field1326; // L: 10043
			if (var2 >= 2000) { // L: 10044
				var2 -= 2000;
			}

			PacketBufferNode var15;
			if (var2 == 1002) { // L: 10045
				Client.field525 = var8; // L: 10046
				Client.field621 = var9; // L: 10047
				Client.field674 = 2; // L: 10048
				Client.field622 = 0; // L: 10049
				var15 = class170.getPacketBufferNode(ClientPacket.field3326, Client.packetWriter.isaacCipher); // L: 10051
				var15.packetBuffer.method9767(var3); // L: 10052
				Client.packetWriter.addNode(var15); // L: 10053
			}

			PacketBufferNode var16;
			class103 var21;
			if (var2 == 7) { // L: 10055
				var21 = var13[var3]; // L: 10056
				if (var21 != null) { // L: 10057
					Client.field525 = var8; // L: 10058
					Client.field621 = var9; // L: 10059
					Client.field674 = 2; // L: 10060
					Client.field622 = 0; // L: 10061
					Client.field752 = var0; // L: 10062
					Client.field753 = var1; // L: 10063
					var16 = class170.getPacketBufferNode(ClientPacket.field3295, Client.packetWriter.isaacCipher); // L: 10065
					var16.packetBuffer.writeInt(class20.field94); // L: 10066
					var16.packetBuffer.method9597(var3); // L: 10067
					var16.packetBuffer.writeByte(Client.field728.method4384(82) ? 1 : 0); // L: 10068
					var16.packetBuffer.writeShort(class328.field3560); // L: 10069
					var16.packetBuffer.method9767(class30.field143); // L: 10070
					Client.packetWriter.addNode(var16); // L: 10071
				}
			}

			if (var2 == 17) { // L: 10074
				Client.field525 = var8; // L: 10075
				Client.field621 = var9; // L: 10076
				Client.field674 = 2; // L: 10077
				Client.field622 = 0; // L: 10078
				Client.field752 = var0; // L: 10079
				Client.field753 = var1; // L: 10080
				var15 = class170.getPacketBufferNode(ClientPacket.field3288, Client.packetWriter.isaacCipher); // L: 10081
				var15.packetBuffer.method9767(var3); // L: 10082
				var15.packetBuffer.writeShort(var12 + var1); // L: 10083
				var15.packetBuffer.method9767(Client.field801); // L: 10084
				var15.packetBuffer.writeByte(Client.field728.method4384(82) ? 1 : 0); // L: 10085
				var15.packetBuffer.writeInt(Message.field457); // L: 10086
				var15.packetBuffer.method9597(Client.field587); // L: 10087
				var15.packetBuffer.writeShort(var0 + var11); // L: 10088
				Client.packetWriter.addNode(var15); // L: 10089
			}

			Player var22;
			if (var2 == 50) { // L: 10091
				var22 = var14[var3]; // L: 10092
				if (var22 != null) { // L: 10093
					Client.field525 = var8; // L: 10094
					Client.field621 = var9; // L: 10095
					Client.field674 = 2; // L: 10096
					Client.field622 = 0; // L: 10097
					Client.field752 = var0; // L: 10098
					Client.field753 = var1; // L: 10099
					var16 = class170.getPacketBufferNode(ClientPacket.field3328, Client.packetWriter.isaacCipher); // L: 10101
					var16.packetBuffer.method9597(var3); // L: 10102
					var16.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10103
					Client.packetWriter.addNode(var16); // L: 10104
				}
			}

			if (var2 == 23) { // L: 10107
				if (Client.isMenuOpen) { // L: 10108
					class511.field5137.field1316.method5470();
				} else {
					class511.field5137.field1316.method5469(class511.field5137.field1318, var0, var1, true); // L: 10109
				}

				for (int var18 = 0; var18 < class511.field5137.field1322; ++var18) { // L: 10110
					class476 var23 = class511.field5137.field1331[class511.field5137.field1333[var18]]; // L: 10111
					if (var23 != null) { // L: 10112
						if (Client.isMenuOpen) { // L: 10113
							var23.field4971.field1316.method5470();
						} else {
							var23.field4971.field1316.method5469(var23.field4971.field1318, var0, var1, true); // L: 10114
						}
					}
				}
			}

			if (var2 == 5) { // L: 10117
				Client.field525 = var8; // L: 10118
				Client.field621 = var9; // L: 10119
				Client.field674 = 2; // L: 10120
				Client.field622 = 0; // L: 10121
				Client.field752 = var0; // L: 10122
				Client.field753 = var1; // L: 10123
				var15 = class170.getPacketBufferNode(ClientPacket.field3297, Client.packetWriter.isaacCipher); // L: 10125
				var15.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10126
				var15.packetBuffer.method9741(var12 + var1); // L: 10127
				var15.packetBuffer.method9767(var3); // L: 10128
				var15.packetBuffer.method9767(var0 + var11); // L: 10129
				Client.packetWriter.addNode(var15); // L: 10130
			}

			if (var2 == 9) { // L: 10132
				var21 = var13[var3]; // L: 10133
				if (var21 != null) { // L: 10134
					Client.field525 = var8; // L: 10135
					Client.field621 = var9; // L: 10136
					Client.field674 = 2; // L: 10137
					Client.field622 = 0; // L: 10138
					Client.field752 = var0; // L: 10139
					Client.field753 = var1; // L: 10140
					var16 = class170.getPacketBufferNode(ClientPacket.field3310, Client.packetWriter.isaacCipher); // L: 10142
					var16.packetBuffer.method9597(var3); // L: 10143
					var16.packetBuffer.writeByte(Client.field728.method4384(82) ? 1 : 0); // L: 10144
					Client.packetWriter.addNode(var16); // L: 10145
				}
			}

			if (var2 == 6) { // L: 10148
				Client.field525 = var8; // L: 10149
				Client.field621 = var9; // L: 10150
				Client.field674 = 2; // L: 10151
				Client.field622 = 0; // L: 10152
				Client.field752 = var0; // L: 10153
				Client.field753 = var1; // L: 10154
				var15 = class170.getPacketBufferNode(ClientPacket.field3369, Client.packetWriter.isaacCipher); // L: 10156
				var15.packetBuffer.method9767(var12 + var1); // L: 10157
				var15.packetBuffer.method9597(var0 + var11); // L: 10158
				var15.packetBuffer.method9597(var3); // L: 10159
				var15.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10160
				Client.packetWriter.addNode(var15); // L: 10161
			}

			if (var2 == 44) { // L: 10163
				var22 = var14[var3]; // L: 10164
				if (var22 != null) { // L: 10165
					Client.field525 = var8; // L: 10166
					Client.field621 = var9; // L: 10167
					Client.field674 = 2; // L: 10168
					Client.field622 = 0; // L: 10169
					Client.field752 = var0; // L: 10170
					Client.field753 = var1; // L: 10171
					var16 = class170.getPacketBufferNode(ClientPacket.field3345, Client.packetWriter.isaacCipher); // L: 10173
					var16.packetBuffer.method9756(Client.field728.method4384(82) ? 1 : 0); // L: 10174
					var16.packetBuffer.method9767(var3); // L: 10175
					Client.packetWriter.addNode(var16); // L: 10176
				}
			}

			if (var2 == 22) { // L: 10179
				Client.field525 = var8; // L: 10180
				Client.field621 = var9; // L: 10181
				Client.field674 = 2; // L: 10182
				Client.field622 = 0; // L: 10183
				Client.field752 = var0; // L: 10184
				Client.field753 = var1; // L: 10185
				var15 = class170.getPacketBufferNode(ClientPacket.field3292, Client.packetWriter.isaacCipher); // L: 10187
				var15.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10188
				var15.packetBuffer.method9767(var3); // L: 10189
				var15.packetBuffer.writeShort(var12 + var1); // L: 10190
				var15.packetBuffer.method9741(var0 + var11); // L: 10191
				Client.packetWriter.addNode(var15); // L: 10192
			}

			if (var2 == 48) { // L: 10194
				var22 = var14[var3]; // L: 10195
				if (var22 != null) { // L: 10196
					Client.field525 = var8; // L: 10197
					Client.field621 = var9; // L: 10198
					Client.field674 = 2; // L: 10199
					Client.field622 = 0; // L: 10200
					Client.field752 = var0; // L: 10201
					Client.field753 = var1; // L: 10202
					var16 = class170.getPacketBufferNode(ClientPacket.field3289, Client.packetWriter.isaacCipher); // L: 10204
					var16.packetBuffer.method9588(Client.field728.method4384(82) ? 1 : 0); // L: 10205
					var16.packetBuffer.method9767(var3); // L: 10206
					Client.packetWriter.addNode(var16); // L: 10207
				}
			}

			if (var2 == 15) { // L: 10210
				var22 = var14[var3]; // L: 10211
				if (var22 != null) { // L: 10212
					Client.field525 = var8; // L: 10213
					Client.field621 = var9; // L: 10214
					Client.field674 = 2; // L: 10215
					Client.field622 = 0; // L: 10216
					Client.field752 = var0; // L: 10217
					Client.field753 = var1; // L: 10218
					var16 = class170.getPacketBufferNode(ClientPacket.field3322, Client.packetWriter.isaacCipher); // L: 10219
					var16.packetBuffer.writeShort(Client.field587); // L: 10220
					var16.packetBuffer.method9767(Client.field801); // L: 10221
					var16.packetBuffer.writeShort(var3); // L: 10222
					var16.packetBuffer.method9611(Message.field457); // L: 10223
					var16.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10224
					Client.packetWriter.addNode(var16); // L: 10225
				}
			}

			if (var2 == 4) { // L: 10228
				Client.field525 = var8; // L: 10229
				Client.field621 = var9; // L: 10230
				Client.field674 = 2; // L: 10231
				Client.field622 = 0; // L: 10232
				Client.field752 = var0; // L: 10233
				Client.field753 = var1; // L: 10234
				var15 = class170.getPacketBufferNode(ClientPacket.field3350, Client.packetWriter.isaacCipher); // L: 10236
				var15.packetBuffer.writeByte(Client.field728.method4384(82) ? 1 : 0); // L: 10237
				var15.packetBuffer.method9597(var3); // L: 10238
				var15.packetBuffer.method9767(var0 + var11); // L: 10239
				var15.packetBuffer.writeShort(var12 + var1); // L: 10240
				Client.packetWriter.addNode(var15); // L: 10241
			}

			if (var2 == 1) { // L: 10243
				Client.field525 = var8; // L: 10244
				Client.field621 = var9; // L: 10245
				Client.field674 = 2; // L: 10246
				Client.field622 = 0; // L: 10247
				Client.field752 = var0; // L: 10248
				Client.field753 = var1; // L: 10249
				var15 = class170.getPacketBufferNode(ClientPacket.field3363, Client.packetWriter.isaacCipher); // L: 10251
				var15.packetBuffer.writeShort(var0 + var11); // L: 10252
				var15.packetBuffer.method9741(class30.field143); // L: 10253
				var15.packetBuffer.writeInt(class20.field94); // L: 10254
				var15.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10255
				var15.packetBuffer.method9741(var12 + var1); // L: 10256
				var15.packetBuffer.method9741(var3); // L: 10257
				var15.packetBuffer.method9767(class328.field3560); // L: 10258
				Client.packetWriter.addNode(var15); // L: 10259
			}

			if (var2 == 51) { // L: 10261
				var22 = var14[var3]; // L: 10262
				if (var22 != null) { // L: 10263
					Client.field525 = var8; // L: 10264
					Client.field621 = var9; // L: 10265
					Client.field674 = 2; // L: 10266
					Client.field622 = 0; // L: 10267
					Client.field752 = var0; // L: 10268
					Client.field753 = var1; // L: 10269
					var16 = class170.getPacketBufferNode(ClientPacket.field3301, Client.packetWriter.isaacCipher); // L: 10271
					var16.packetBuffer.method9741(var3); // L: 10272
					var16.packetBuffer.method9588(Client.field728.method4384(82) ? 1 : 0); // L: 10273
					Client.packetWriter.addNode(var16); // L: 10274
				}
			}

			if (var2 == 1004) { // L: 10277
				Client.field525 = var8; // L: 10278
				Client.field621 = var9; // L: 10279
				Client.field674 = 2; // L: 10280
				Client.field622 = 0; // L: 10281
				var15 = class170.getPacketBufferNode(ClientPacket.field3347, Client.packetWriter.isaacCipher); // L: 10283
				var15.packetBuffer.method9597(var0 + var11); // L: 10284
				var15.packetBuffer.writeShort(var3); // L: 10285
				var15.packetBuffer.writeShort(var12 + var1); // L: 10286
				Client.packetWriter.addNode(var15); // L: 10287
			}

			if (var2 == 47) { // L: 10289
				var22 = var14[var3]; // L: 10290
				if (var22 != null) { // L: 10291
					Client.field525 = var8; // L: 10292
					Client.field621 = var9; // L: 10293
					Client.field674 = 2; // L: 10294
					Client.field622 = 0; // L: 10295
					Client.field752 = var0; // L: 10296
					Client.field753 = var1; // L: 10297
					var16 = class170.getPacketBufferNode(ClientPacket.field3372, Client.packetWriter.isaacCipher); // L: 10299
					var16.packetBuffer.method9756(Client.field728.method4384(82) ? 1 : 0); // L: 10300
					var16.packetBuffer.writeShort(var3); // L: 10301
					Client.packetWriter.addNode(var16); // L: 10302
				}
			}

			if (var2 == 14) { // L: 10305
				var22 = var14[var3]; // L: 10306
				if (var22 != null) { // L: 10307
					Client.field525 = var8; // L: 10308
					Client.field621 = var9; // L: 10309
					Client.field674 = 2; // L: 10310
					Client.field622 = 0; // L: 10311
					Client.field752 = var0; // L: 10312
					Client.field753 = var1; // L: 10313
					var16 = class170.getPacketBufferNode(ClientPacket.field3318, Client.packetWriter.isaacCipher); // L: 10315
					var16.packetBuffer.writeShort(class30.field143); // L: 10316
					var16.packetBuffer.writeShort(class328.field3560); // L: 10317
					var16.packetBuffer.writeInt(class20.field94); // L: 10318
					var16.packetBuffer.method9767(var3); // L: 10319
					var16.packetBuffer.method9588(Client.field728.method4384(82) ? 1 : 0); // L: 10320
					Client.packetWriter.addNode(var16); // L: 10321
				}
			}

			int var17;
			Widget var24;
			if (var2 == 29) { // L: 10324
				var15 = class170.getPacketBufferNode(ClientPacket.field3351, Client.packetWriter.isaacCipher); // L: 10326
				var15.packetBuffer.writeInt(var1); // L: 10327
				Client.packetWriter.addNode(var15); // L: 10328
				var24 = ModeWhere.field4649.method6519(var1); // L: 10329
				if (var24 != null && var24.cs1Instructions != null && var24.cs1Instructions[0][0] == 5) { // L: 10330
					var17 = var24.cs1Instructions[0][1]; // L: 10331
					if (Varps.Varps_main[var17] != var24.cs1ComparisonValues[0]) { // L: 10332
						Varps.Varps_main[var17] = var24.cs1ComparisonValues[0]; // L: 10333
						SecureRandomFuture.changeGameOptions(var17); // L: 10334
					}
				}
			}

			if (var2 == 20) { // L: 10338
				Client.field525 = var8; // L: 10339
				Client.field621 = var9; // L: 10340
				Client.field674 = 2; // L: 10341
				Client.field622 = 0; // L: 10342
				Client.field752 = var0; // L: 10343
				Client.field753 = var1; // L: 10344
				var15 = class170.getPacketBufferNode(ClientPacket.field3315, Client.packetWriter.isaacCipher); // L: 10346
				var15.packetBuffer.method9597(var12 + var1); // L: 10347
				var15.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10348
				var15.packetBuffer.method9597(var0 + var11); // L: 10349
				var15.packetBuffer.method9597(var3); // L: 10350
				Client.packetWriter.addNode(var15); // L: 10351
			}

			if (var2 == 49) { // L: 10353
				var22 = var14[var3]; // L: 10354
				if (var22 != null) { // L: 10355
					Client.field525 = var8; // L: 10356
					Client.field621 = var9; // L: 10357
					Client.field674 = 2; // L: 10358
					Client.field622 = 0; // L: 10359
					Client.field752 = var0; // L: 10360
					Client.field753 = var1; // L: 10361
					var16 = class170.getPacketBufferNode(ClientPacket.field3319, Client.packetWriter.isaacCipher); // L: 10363
					var16.packetBuffer.method9597(var3); // L: 10364
					var16.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10365
					Client.packetWriter.addNode(var16); // L: 10366
				}
			}

			if (var2 == 13) { // L: 10369
				var21 = var13[var3]; // L: 10370
				if (var21 != null) { // L: 10371
					Client.field525 = var8; // L: 10372
					Client.field621 = var9; // L: 10373
					Client.field674 = 2; // L: 10374
					Client.field622 = 0; // L: 10375
					Client.field752 = var0; // L: 10376
					Client.field753 = var1; // L: 10377
					var16 = class170.getPacketBufferNode(ClientPacket.field3370, Client.packetWriter.isaacCipher); // L: 10379
					var16.packetBuffer.method9597(var3); // L: 10380
					var16.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10381
					Client.packetWriter.addNode(var16); // L: 10382
				}
			}

			if (var2 == 19) { // L: 10385
				Client.field525 = var8; // L: 10386
				Client.field621 = var9; // L: 10387
				Client.field674 = 2; // L: 10388
				Client.field622 = 0; // L: 10389
				Client.field752 = var0; // L: 10390
				Client.field753 = var1; // L: 10391
				var15 = class170.getPacketBufferNode(ClientPacket.field3305, Client.packetWriter.isaacCipher); // L: 10393
				var15.packetBuffer.method9767(var3); // L: 10394
				var15.packetBuffer.method9588(Client.field728.method4384(82) ? 1 : 0); // L: 10395
				var15.packetBuffer.method9767(var0 + var11); // L: 10396
				var15.packetBuffer.method9741(var12 + var1); // L: 10397
				Client.packetWriter.addNode(var15); // L: 10398
			}

			Widget var27;
			if (var2 == 57 || var2 == 1007) { // L: 10400
				var27 = ModeWhere.field4649.method6513(var1, var0); // L: 10401
				if (var27 != null) { // L: 10402
					class444.widgetDefaultMenuAction(var3, var1, var0, var4, var7); // L: 10403
				}
			}

			if (var2 == 58) { // L: 10406
				var27 = ModeWhere.field4649.method6513(var1, var0); // L: 10407
				if (var27 != null) { // L: 10408
					if (var27.field3939 != null) { // L: 10409
						ScriptEvent var25 = new ScriptEvent(); // L: 10410
						var25.widget = var27; // L: 10411
						var25.opIndex = var3; // L: 10412
						var25.targetName = var7; // L: 10413
						var25.args = var27.field3939; // L: 10414
						Projectile.runScriptEvent(var25); // L: 10415
					}

					var16 = class170.getPacketBufferNode(ClientPacket.field3293, Client.packetWriter.isaacCipher); // L: 10418
					var16.packetBuffer.writeIntME(Message.field457); // L: 10419
					var16.packetBuffer.method9611(var1); // L: 10420
					var16.packetBuffer.method9767(Client.field587); // L: 10421
					var16.packetBuffer.method9741(Client.field801); // L: 10422
					var16.packetBuffer.method9597(var0); // L: 10423
					var16.packetBuffer.method9767(var4); // L: 10424
					Client.packetWriter.addNode(var16); // L: 10425
				}
			}

			if (var2 == 18) { // L: 10428
				Client.field525 = var8; // L: 10429
				Client.field621 = var9; // L: 10430
				Client.field674 = 2; // L: 10431
				Client.field622 = 0; // L: 10432
				Client.field752 = var0; // L: 10433
				Client.field753 = var1; // L: 10434
				var15 = class170.getPacketBufferNode(ClientPacket.field3346, Client.packetWriter.isaacCipher); // L: 10436
				var15.packetBuffer.method9741(var3); // L: 10437
				var15.packetBuffer.method9767(var12 + var1); // L: 10438
				var15.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10439
				var15.packetBuffer.method9741(var0 + var11); // L: 10440
				Client.packetWriter.addNode(var15); // L: 10441
			}

			if (var2 == 3) { // L: 10443
				Client.field525 = var8; // L: 10444
				Client.field621 = var9; // L: 10445
				Client.field674 = 2; // L: 10446
				Client.field622 = 0; // L: 10447
				Client.field752 = var0; // L: 10448
				Client.field753 = var1; // L: 10449
				var15 = class170.getPacketBufferNode(ClientPacket.field3316, Client.packetWriter.isaacCipher); // L: 10451
				var15.packetBuffer.writeShort(var3); // L: 10452
				var15.packetBuffer.method9741(var0 + var11); // L: 10453
				var15.packetBuffer.method9767(var12 + var1); // L: 10454
				var15.packetBuffer.writeByte(Client.field728.method4384(82) ? 1 : 0); // L: 10455
				Client.packetWriter.addNode(var15); // L: 10456
			}

			if (var2 == 1001) { // L: 10458
				Client.field525 = var8; // L: 10459
				Client.field621 = var9; // L: 10460
				Client.field674 = 2; // L: 10461
				Client.field622 = 0; // L: 10462
				Client.field752 = var0; // L: 10463
				Client.field753 = var1; // L: 10464
				var15 = class170.getPacketBufferNode(ClientPacket.field3335, Client.packetWriter.isaacCipher); // L: 10466
				var15.packetBuffer.method9767(var12 + var1); // L: 10467
				var15.packetBuffer.method9597(var3); // L: 10468
				var15.packetBuffer.method9597(var0 + var11); // L: 10469
				var15.packetBuffer.method9588(Client.field728.method4384(82) ? 1 : 0); // L: 10470
				Client.packetWriter.addNode(var15); // L: 10471
			}

			PacketBufferNode var20;
			if (var2 == 24) { // L: 10473
				var27 = ModeWhere.field4649.method6519(var1); // L: 10474
				if (var27 != null) { // L: 10475
					boolean var19 = true; // L: 10476
					if (var27.contentType > 0) { // L: 10477
						var19 = class155.method3331(var27);
					}

					if (var19) { // L: 10478
						var20 = class170.getPacketBufferNode(ClientPacket.field3351, Client.packetWriter.isaacCipher); // L: 10480
						var20.packetBuffer.writeInt(var1); // L: 10481
						Client.packetWriter.addNode(var20); // L: 10482
					}
				}
			}

			if (var2 == 1003) { // L: 10486
				Client.field525 = var8; // L: 10487
				Client.field621 = var9; // L: 10488
				Client.field674 = 2; // L: 10489
				Client.field622 = 0; // L: 10490
				var21 = var13[var3]; // L: 10491
				if (var21 != null) { // L: 10492
					NPCComposition var26 = var21.field1347; // L: 10493
					if (var26.transforms != null) { // L: 10494
						var26 = var26.transform();
					}

					if (var26 != null) { // L: 10495
						var20 = class170.getPacketBufferNode(ClientPacket.field3283, Client.packetWriter.isaacCipher); // L: 10497
						var20.packetBuffer.method9767(var26.id); // L: 10498
						Client.packetWriter.addNode(var20); // L: 10499
					}
				}
			}

			if (var2 == 12) { // L: 10503
				var21 = var13[var3]; // L: 10504
				if (var21 != null) { // L: 10505
					Client.field525 = var8; // L: 10506
					Client.field621 = var9; // L: 10507
					Client.field674 = 2; // L: 10508
					Client.field622 = 0; // L: 10509
					Client.field752 = var0; // L: 10510
					Client.field753 = var1; // L: 10511
					var16 = class170.getPacketBufferNode(ClientPacket.field3362, Client.packetWriter.isaacCipher); // L: 10513
					var16.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10514
					var16.packetBuffer.method9741(var3); // L: 10515
					Client.packetWriter.addNode(var16); // L: 10516
				}
			}

			if (var2 == 16) { // L: 10519
				Client.field525 = var8; // L: 10520
				Client.field621 = var9; // L: 10521
				Client.field674 = 2; // L: 10522
				Client.field622 = 0; // L: 10523
				Client.field752 = var0; // L: 10524
				Client.field753 = var1; // L: 10525
				var15 = class170.getPacketBufferNode(ClientPacket.field3306, Client.packetWriter.isaacCipher); // L: 10527
				var15.packetBuffer.method9597(class30.field143); // L: 10528
				var15.packetBuffer.method9767(var0 + var11); // L: 10529
				var15.packetBuffer.method9597(var12 + var1); // L: 10530
				var15.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10531
				var15.packetBuffer.writeInt(class20.field94); // L: 10532
				var15.packetBuffer.method9597(var3); // L: 10533
				var15.packetBuffer.method9741(class328.field3560); // L: 10534
				Client.packetWriter.addNode(var15); // L: 10535
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 10537
				VertexNormal.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 10538
			}

			if (var2 == 26) { // L: 10540
				class109.method2818(); // L: 10541
			}

			if (var2 == 2) { // L: 10543
				Client.field525 = var8; // L: 10544
				Client.field621 = var9; // L: 10545
				Client.field674 = 2; // L: 10546
				Client.field622 = 0; // L: 10547
				Client.field752 = var0; // L: 10548
				Client.field753 = var1; // L: 10549
				var15 = class170.getPacketBufferNode(ClientPacket.field3324, Client.packetWriter.isaacCipher); // L: 10550
				var15.packetBuffer.method9741(Client.field801); // L: 10551
				var15.packetBuffer.method9767(Client.field587); // L: 10552
				var15.packetBuffer.writeShort(var12 + var1); // L: 10553
				var15.packetBuffer.method9588(Client.field728.method4384(82) ? 1 : 0); // L: 10554
				var15.packetBuffer.method9597(var0 + var11); // L: 10555
				var15.packetBuffer.method9609(Message.field457); // L: 10556
				var15.packetBuffer.method9741(var3); // L: 10557
				Client.packetWriter.addNode(var15); // L: 10558
			}

			if (var2 == 25) { // L: 10560
				var27 = ModeWhere.field4649.method6513(var1, var0); // L: 10561
				if (var27 != null) { // L: 10562
					Canvas.method322(); // L: 10563
					class290.method5744(var1, var0, class301.Widget_unpackTargetMask(ClanChannel.getWidgetFlags(var27)), var4); // L: 10564
					Client.isItemSelected = 0; // L: 10565
					Client.field669 = class142.Widget_getSpellActionName(var27); // L: 10566
					if (Client.field669 == null) { // L: 10567
						Client.field669 = "null";
					}

					if (var27.isIf3) { // L: 10568
						Client.field670 = var27.dataText + class191.colorStartTag(16777215);
					} else {
						Client.field670 = class191.colorStartTag(65280) + var27.field3960 + class191.colorStartTag(16777215); // L: 10569
					}
				}

			} else {
				if (var2 == 45) { // L: 10573
					var22 = var14[var3]; // L: 10574
					if (var22 != null) { // L: 10575
						Client.field525 = var8; // L: 10576
						Client.field621 = var9; // L: 10577
						Client.field674 = 2; // L: 10578
						Client.field622 = 0; // L: 10579
						Client.field752 = var0; // L: 10580
						Client.field753 = var1; // L: 10581
						var16 = class170.getPacketBufferNode(ClientPacket.field3323, Client.packetWriter.isaacCipher); // L: 10583
						var16.packetBuffer.method9767(var3); // L: 10584
						var16.packetBuffer.method9588(Client.field728.method4384(82) ? 1 : 0); // L: 10585
						Client.packetWriter.addNode(var16); // L: 10586
					}
				}

				if (var2 == 21) { // L: 10589
					Client.field525 = var8; // L: 10590
					Client.field621 = var9; // L: 10591
					Client.field674 = 2; // L: 10592
					Client.field622 = 0; // L: 10593
					Client.field752 = var0; // L: 10594
					Client.field753 = var1; // L: 10595
					var15 = class170.getPacketBufferNode(ClientPacket.field3325, Client.packetWriter.isaacCipher); // L: 10597
					var15.packetBuffer.method9756(Client.field728.method4384(82) ? 1 : 0); // L: 10598
					var15.packetBuffer.method9767(var0 + var11); // L: 10599
					var15.packetBuffer.method9767(var12 + var1); // L: 10600
					var15.packetBuffer.method9597(var3); // L: 10601
					Client.packetWriter.addNode(var15); // L: 10602
				}

				if (var2 == 8) { // L: 10604
					var21 = var13[var3]; // L: 10605
					if (var21 != null) { // L: 10606
						Client.field525 = var8; // L: 10607
						Client.field621 = var9; // L: 10608
						Client.field674 = 2; // L: 10609
						Client.field622 = 0; // L: 10610
						Client.field752 = var0; // L: 10611
						Client.field753 = var1; // L: 10612
						var16 = class170.getPacketBufferNode(ClientPacket.field3333, Client.packetWriter.isaacCipher); // L: 10613
						var16.packetBuffer.writeInt(Message.field457); // L: 10614
						var16.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10615
						var16.packetBuffer.method9741(Client.field801); // L: 10616
						var16.packetBuffer.method9741(Client.field587); // L: 10617
						var16.packetBuffer.method9597(var3); // L: 10618
						Client.packetWriter.addNode(var16); // L: 10619
					}
				}

				if (var2 == 10) { // L: 10622
					var21 = var13[var3]; // L: 10623
					if (var21 != null) { // L: 10624
						Client.field525 = var8; // L: 10625
						Client.field621 = var9; // L: 10626
						Client.field674 = 2; // L: 10627
						Client.field622 = 0; // L: 10628
						Client.field752 = var0; // L: 10629
						Client.field753 = var1; // L: 10630
						var16 = class170.getPacketBufferNode(ClientPacket.field3278, Client.packetWriter.isaacCipher); // L: 10632
						var16.packetBuffer.method9767(var3); // L: 10633
						var16.packetBuffer.writeByte(Client.field728.method4384(82) ? 1 : 0); // L: 10634
						Client.packetWriter.addNode(var16); // L: 10635
					}
				}

				if (var2 == 28) { // L: 10638
					var15 = class170.getPacketBufferNode(ClientPacket.field3351, Client.packetWriter.isaacCipher); // L: 10640
					var15.packetBuffer.writeInt(var1); // L: 10641
					Client.packetWriter.addNode(var15); // L: 10642
					var24 = ModeWhere.field4649.method6519(var1); // L: 10643
					if (var24 != null && var24.cs1Instructions != null && var24.cs1Instructions[0][0] == 5) { // L: 10644
						var17 = var24.cs1Instructions[0][1]; // L: 10645
						Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17]; // L: 10646
						SecureRandomFuture.changeGameOptions(var17); // L: 10647
					}
				}

				if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 10650 10651
					ClanSettings.resumePauseWidget(var1, var0); // L: 10652
					Client.meslayerContinueWidget = ModeWhere.field4649.method6513(var1, var0); // L: 10653
					TriBool.invalidateWidget(Client.meslayerContinueWidget); // L: 10654
				}

				if (var2 == 11) { // L: 10657
					var21 = var13[var3]; // L: 10658
					if (var21 != null) { // L: 10659
						Client.field525 = var8; // L: 10660
						Client.field621 = var9; // L: 10661
						Client.field674 = 2; // L: 10662
						Client.field622 = 0; // L: 10663
						Client.field752 = var0; // L: 10664
						Client.field753 = var1; // L: 10665
						var16 = class170.getPacketBufferNode(ClientPacket.field3312, Client.packetWriter.isaacCipher); // L: 10667
						var16.packetBuffer.method9767(var3); // L: 10668
						var16.packetBuffer.method9756(Client.field728.method4384(82) ? 1 : 0); // L: 10669
						Client.packetWriter.addNode(var16); // L: 10670
					}
				}

				if (var2 == 46) { // L: 10673
					var22 = var14[var3]; // L: 10674
					if (var22 != null) { // L: 10675
						Client.field525 = var8; // L: 10676
						Client.field621 = var9; // L: 10677
						Client.field674 = 2; // L: 10678
						Client.field622 = 0; // L: 10679
						Client.field752 = var0; // L: 10680
						Client.field753 = var1; // L: 10681
						var16 = class170.getPacketBufferNode(ClientPacket.field3371, Client.packetWriter.isaacCipher); // L: 10683
						var16.packetBuffer.method9587(Client.field728.method4384(82) ? 1 : 0); // L: 10684
						var16.packetBuffer.method9597(var3); // L: 10685
						Client.packetWriter.addNode(var16); // L: 10686
					}
				}

				if (Client.isItemSelected != 0) { // L: 10689
					Client.isItemSelected = 0; // L: 10690
					TriBool.invalidateWidget(ModeWhere.field4649.method6519(class20.field94)); // L: 10691
				}

				if (Client.isSpellSelected) { // L: 10693
					Canvas.method322();
				}

			}
		}
	} // L: 10571 10694
}
