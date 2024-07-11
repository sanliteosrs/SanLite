import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class140 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 796681421
	)
	static int field1643;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqh;Lqh;B)V",
		garbageValue = "50"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class74.canvasWidth - 765) / 2; // L: 1246
		Login.loginBoxX = Login.xPadding + 202; // L: 1247
		Login.loginBoxCenter = Login.loginBoxX + 180; // L: 1248
		if (Login.worldSelectOpen) { // L: 1249
			class7.method58(var0, var1); // L: 1250
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1253
			class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1254
			ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18); // L: 1255
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1256
				byte var3 = 20; // L: 1257
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1258
				var4 = 253 - var3; // L: 1259
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1260
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1261
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1262
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1263
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1264
			}

			String var6;
			String var8;
			String var9;
			int var10;
			char[] var11;
			int var12;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) { // L: 1266
				class486.titleboxSprite.drawAt(Login.loginBoxX + 180 - class486.titleboxSprite.subWidth / 2, 271 - class486.titleboxSprite.subHeight * 912646400 / 2); // L: 1267
				var23 = 201; // L: 1268
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1269
				var24 = var23 + 15; // L: 1270
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1271
				var24 += 15; // L: 1272
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1273
				var24 += 15; // L: 1274
				var24 += 7; // L: 1275
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1276
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0); // L: 1277
					var25 = 200; // L: 1278
					if (!class105.clientPreferences.method2672()) { // L: 1282
						var6 = Login.Login_username; // L: 1297
					} else {
						var8 = Login.Login_username; // L: 1284
						var10 = var8.length(); // L: 1287
						var11 = new char[var10]; // L: 1289

						for (var12 = 0; var12 < var10; ++var12) { // L: 1290
							var11[var12] = '*';
						}

						var9 = new String(var11); // L: 1291
						var6 = var9; // L: 1295
					}

					for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) { // L: 1300 1301 1302
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0); // L: 1304
					var24 += 15; // L: 1305
					var8 = Login.Login_password; // L: 1307
					var10 = var8.length(); // L: 1310
					var11 = new char[var10]; // L: 1312

					for (var12 = 0; var12 < var10; ++var12) { // L: 1313
						var11[var12] = '*';
					}

					var9 = new String(var11); // L: 1314

					for (var9 = var9; var0.stringWidth(var9) > var25; var9 = var9.substring(1)) { // L: 1318 1319 1320
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1322
					var24 += 15; // L: 1323
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1326
				class486.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1327
				short var14;
				if (Login.loginIndex == 0) { // L: 1328
					var23 = 251; // L: 1329
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1330
					var24 = var23 + 30; // L: 1331
					var4 = Login.loginBoxX + 180 - 80; // L: 1332
					var14 = 291; // L: 1333
					Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1334
					var0.drawLines("New User", var4 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1335
					var4 = Login.loginBoxX + 180 + 80; // L: 1336
					Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1337
					var0.drawLines("Existing User", var4 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1338
				} else if (Login.loginIndex == 1) { // L: 1340
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1341
					var23 = 236; // L: 1342
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1343
					var24 = var23 + 15; // L: 1344
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1345
					var24 += 15; // L: 1346
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1347
					var24 += 15; // L: 1348
					var4 = Login.loginBoxX + 180 - 80; // L: 1349
					var14 = 321; // L: 1350
					Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1351
					var0.drawCentered("Continue", var4, var14 + 5, 16777215, 0); // L: 1352
					var4 = Login.loginBoxX + 180 + 80; // L: 1353
					Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1354
					var0.drawCentered("Cancel", var4, var14 + 5, 16777215, 0); // L: 1355
				} else if (Login.loginIndex == 2) { // L: 1357
					var23 = 201; // L: 1358
					var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var23, 16776960, 0); // L: 1359
					var24 = var23 + 15; // L: 1360
					var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var24, 16776960, 0); // L: 1361
					var24 += 15; // L: 1362
					var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var24, 16776960, 0); // L: 1363
					var24 += 15; // L: 1364
					var24 += 7; // L: 1365
					var0.draw("Login: ", Login.loginBoxCenter - 110, var24, 16777215, 0); // L: 1366
					var25 = 200; // L: 1367
					if (!class105.clientPreferences.method2672()) { // L: 1371
						var6 = Login.Login_username; // L: 1386
					} else {
						var8 = Login.Login_username; // L: 1373
						var10 = var8.length(); // L: 1376
						var11 = new char[var10]; // L: 1378

						for (var12 = 0; var12 < var10; ++var12) { // L: 1379
							var11[var12] = '*';
						}

						var9 = new String(var11); // L: 1380
						var6 = var9; // L: 1384
					}

					for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1389 1390 1391
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class191.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var24, 16777215, 0); // L: 1393
					var24 += 15; // L: 1394
					var8 = Login.Login_password; // L: 1396
					var10 = var8.length(); // L: 1399
					var11 = new char[var10]; // L: 1401

					for (var12 = 0; var12 < var10; ++var12) { // L: 1402
						var11[var12] = '*';
					}

					var9 = new String(var11); // L: 1403

					for (var9 = var9; var0.stringWidth(var9) > var25; var9 = var9.substring(1)) { // L: 1407 1408 1409
					}

					var0.draw("Password: " + var9 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class191.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var24, 16777215, 0); // L: 1411
					var24 += 15; // L: 1412
					var23 = 277; // L: 1413
					var10 = Login.loginBoxCenter + -117; // L: 1414
					IndexedSprite var26 = Message.method1194(Client.Login_isUsernameRemembered, Login.field943); // L: 1415
					var26.drawAt(var10, var23); // L: 1416
					var10 = var10 + var26.subWidth + 5; // L: 1417
					var1.draw("Remember username", var10, var23 + 13, 16776960, 0); // L: 1418
					var10 = Login.loginBoxCenter + 24; // L: 1419
					var26 = Message.method1194(class105.clientPreferences.method2672(), Login.field959); // L: 1420
					var26.drawAt(var10, var23); // L: 1421
					var10 = var10 + var26.subWidth + 5; // L: 1422
					var1.draw("Hide username", var10, var23 + 13, 16776960, 0); // L: 1423
					var24 = var23 + 15; // L: 1424
					var12 = Login.loginBoxCenter - 80; // L: 1425
					short var13 = 321; // L: 1426
					Fonts.field5213.drawAt(var12 - 73, var13 - 20); // L: 1427
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0); // L: 1428
					var12 = Login.loginBoxCenter + 80; // L: 1429
					Fonts.field5213.drawAt(var12 - 73, var13 - 20); // L: 1430
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0); // L: 1431
					var23 = 357; // L: 1432
					switch(Login.field932) { // L: 1433
					case 2:
						WorldMapSection0.field2656 = "Having trouble logging in?"; // L: 1438
						break;
					default:
						WorldMapSection0.field2656 = "Can't login? Click here."; // L: 1435
					}

					class193.field2035 = new Bounds(Login.loginBoxCenter, var23, var1.stringWidth(WorldMapSection0.field2656), 11); // L: 1441
					WorldMapSection0.field2657 = new Bounds(Login.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1442
					var1.drawCentered(WorldMapSection0.field2656, Login.loginBoxCenter, var23, 16777215, 0); // L: 1443
				} else if (Login.loginIndex == 3) { // L: 1445
					var23 = 201; // L: 1446
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1447
					var24 = var23 + 20; // L: 1448
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1449
					var24 += 20; // L: 1450
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1451
					var24 += 15; // L: 1452
					var4 = Login.loginBoxX + 180; // L: 1453
					var14 = 276; // L: 1454
					Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1455
					var2.drawCentered("Try again", var4, var14 + 5, 16777215, 0); // L: 1456
					var4 = Login.loginBoxX + 180; // L: 1457
					var14 = 326; // L: 1458
					Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1459
					var2.drawCentered("Forgotten password?", var4, var14 + 5, 16777215, 0); // L: 1460
				} else {
					String var5;
					if (Login.loginIndex == 4) { // L: 1462
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1463
						var23 = 236; // L: 1464
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1465
						var24 = var23 + 15; // L: 1466
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1467
						var24 += 15; // L: 1468
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1469
						var24 += 15; // L: 1470
						var5 = "PIN: "; // L: 1472
						String var7 = class146.otp; // L: 1474
						int var19 = var7.length(); // L: 1477
						char[] var20 = new char[var19]; // L: 1479

						int var21;
						for (var21 = 0; var21 < var19; ++var21) { // L: 1480
							var20[var21] = '*';
						}

						var8 = new String(var20); // L: 1481
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? class191.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1485
						var24 -= 8; // L: 1486
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1487
						var24 += 15; // L: 1488
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1489
						int var17 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1490
						var19 = var24 - var0.ascent; // L: 1491
						IndexedSprite var33;
						if (Login.field924) { // L: 1493
							var33 = Login.field925; // L: 1494
						} else {
							var33 = class141.field1647; // L: 1497
						}

						var33.drawAt(var17, var19); // L: 1499
						var24 += 15; // L: 1500
						var21 = Login.loginBoxX + 180 - 80; // L: 1501
						short var27 = 321; // L: 1502
						Fonts.field5213.drawAt(var21 - 73, var27 - 20); // L: 1503
						var0.drawCentered("Continue", var21, var27 + 5, 16777215, 0); // L: 1504
						var21 = Login.loginBoxX + 180 + 80; // L: 1505
						Fonts.field5213.drawAt(var21 - 73, var27 - 20); // L: 1506
						var0.drawCentered("Cancel", var21, var27 + 5, 16777215, 0); // L: 1507
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var27 + 36, 16777215, 0); // L: 1508
					} else {
						int var16;
						short var29;
						if (Login.loginIndex == 5) { // L: 1510
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1511
							var23 = 221; // L: 1512
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1513
							var24 = var23 + 15; // L: 1514
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1515
							var24 += 15; // L: 1516
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1517
							var24 += 15; // L: 1518
							var24 += 14; // L: 1519
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var24, 16777215, 0); // L: 1520
							var25 = 174; // L: 1521
							if (!class105.clientPreferences.method2672()) { // L: 1525
								var6 = Login.Login_username; // L: 1540
							} else {
								var8 = Login.Login_username; // L: 1527
								var10 = var8.length(); // L: 1530
								var11 = new char[var10]; // L: 1532

								for (var12 = 0; var12 < var10; ++var12) { // L: 1533
									var11[var12] = '*';
								}

								var9 = new String(var11); // L: 1534
								var6 = var9; // L: 1538
							}

							for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1543 1544 1545
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? class191.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0); // L: 1547
							var24 += 15; // L: 1548
							var16 = Login.loginBoxX + 180 - 80; // L: 1549
							var29 = 321; // L: 1550
							Fonts.field5213.drawAt(var16 - 73, var29 - 20); // L: 1551
							var0.drawCentered("Recover", var16, var29 + 5, 16777215, 0); // L: 1552
							var16 = Login.loginBoxX + 180 + 80; // L: 1553
							Fonts.field5213.drawAt(var16 - 73, var29 - 20); // L: 1554
							var0.drawCentered("Back", var16, var29 + 5, 16777215, 0); // L: 1555
							var29 = 356; // L: 1556
							var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var29, 268435455, 0); // L: 1557
						} else if (Login.loginIndex == 6) { // L: 1559
							var23 = 201; // L: 1560
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1561
							var24 = var23 + 15; // L: 1562
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1563
							var24 += 15; // L: 1564
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1565
							var24 += 15; // L: 1566
							var4 = Login.loginBoxX + 180; // L: 1567
							var14 = 321; // L: 1568
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1569
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1570
						} else if (Login.loginIndex == 7) { // L: 1572
							if (UserComparator3.field1501 && !Client.onMobile) { // L: 1573
								var23 = 201; // L: 1574
								var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var23, 16776960, 0); // L: 1575
								var24 = var23 + 15; // L: 1576
								var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var24, 16776960, 0); // L: 1577
								var24 += 15; // L: 1578
								var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var24, 16776960, 0); // L: 1579
								var4 = Login.loginBoxCenter - 150; // L: 1580
								var24 += 10; // L: 1581

								int var28;
								for (var28 = 0; var28 < 8; ++var28) { // L: 1582
									Fonts.field5213.method9987(var4, var24, 30, 40); // L: 1583
									boolean var18 = var28 == Login.field950 & Client.cycle % 40 < 20; // L: 1584
									var0.draw((Login.field941[var28] == null ? "" : Login.field941[var28]) + (var18 ? class191.colorStartTag(16776960) + "|" : ""), var4 + 10, var24 + 27, 16777215, 0); // L: 1585
									if (var28 != 1 && var28 != 3) { // L: 1586
										var4 += 35; // L: 1591
									} else {
										var4 += 50; // L: 1587
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var24 + 27, 16777215, 0); // L: 1588
									}
								}

								var28 = Login.loginBoxCenter - 80; // L: 1594
								short var30 = 321; // L: 1595
								Fonts.field5213.drawAt(var28 - 73, var30 - 20); // L: 1596
								var0.drawCentered("Submit", var28, var30 + 5, 16777215, 0); // L: 1597
								var28 = Login.loginBoxCenter + 80; // L: 1598
								Fonts.field5213.drawAt(var28 - 73, var30 - 20); // L: 1599
								var0.drawCentered("Cancel", var28, var30 + 5, 16777215, 0); // L: 1600
							} else {
								var23 = 216; // L: 1603
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1604
								var24 = var23 + 15; // L: 1605
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1606
								var24 += 15; // L: 1607
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1608
								var24 += 15; // L: 1609
								var4 = Login.loginBoxX + 180 - 80; // L: 1610
								var14 = 321; // L: 1611
								Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1612
								var0.drawCentered("Set Date of Birth", var4, var14 + 5, 16777215, 0); // L: 1613
								var4 = Login.loginBoxX + 180 + 80; // L: 1614
								Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1615
								var0.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1616
							}
						} else if (Login.loginIndex == 8) { // L: 1619
							var23 = 216; // L: 1620
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1621
							var24 = var23 + 15; // L: 1622
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1623
							var24 += 15; // L: 1624
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1625
							var24 += 15; // L: 1626
							var4 = Login.loginBoxX + 180 - 80; // L: 1627
							var14 = 321; // L: 1628
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1629
							var0.drawCentered("Privacy Policy", var4, var14 + 5, 16777215, 0); // L: 1630
							var4 = Login.loginBoxX + 180 + 80; // L: 1631
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1632
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1633
						} else if (Login.loginIndex == 9) { // L: 1635
							var23 = 221; // L: 1636
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1637
							var24 = var23 + 25; // L: 1638
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1639
							var24 += 25; // L: 1640
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1641
							var4 = Login.loginBoxX + 180; // L: 1642
							var14 = 311; // L: 1643
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1644
							var0.drawCentered("Try again", var4, var14 + 5, 16777215, 0); // L: 1645
						} else if (Login.loginIndex == 10) { // L: 1647
							var24 = Login.loginBoxX + 180; // L: 1648
							var25 = 209; // L: 1649
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1650
							var4 = var25 + 20; // L: 1651
							UserComparator9.field1506.drawAt(var24 - 109, var4); // L: 1652
							if (Login.field948.isEmpty()) { // L: 1653
								Login.field922.drawAt(var24 - 48, var4 + 18); // L: 1654
							} else {
								Login.field922.drawAt(var24 - 48, var4 + 5); // L: 1657
								var0.drawCentered(Login.field948, var24, var4 + 68 - 15, 16776960, 0); // L: 1658
							}
						} else if (Login.loginIndex == 12) { // L: 1661
							var24 = Login.loginBoxCenter; // L: 1662
							var25 = 216; // L: 1663
							var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0); // L: 1664
							var4 = var25 + 17; // L: 1665
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0); // L: 1666
							var4 += 17; // L: 1667
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0); // L: 1668
							var4 += 17; // L: 1669
							var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0); // L: 1670
							var24 = Login.loginBoxCenter - 80; // L: 1671
							var25 = 311; // L: 1672
							Fonts.field5213.drawAt(var24 - 73, var25 - 20); // L: 1673
							var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0); // L: 1674
							var24 = Login.loginBoxCenter + 80; // L: 1675
							Fonts.field5213.drawAt(var24 - 73, var25 - 20); // L: 1676
							var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0); // L: 1677
						} else if (Login.loginIndex == 13) { // L: 1679
							var23 = 231; // L: 1680
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0); // L: 1681
							var24 = var23 + 20; // L: 1682
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0); // L: 1683
							var4 = Login.loginBoxX + 180; // L: 1684
							var23 = 311; // L: 1685
							Fonts.field5213.drawAt(var4 - 73, var23 - 20); // L: 1686
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1687
						} else if (Login.loginIndex == 14) { // L: 1689
							var23 = 201; // L: 1690
							String var15 = ""; // L: 1691
							var5 = ""; // L: 1692
							var6 = ""; // L: 1693
							switch(Login.field931) { // L: 1694
							case 0:
								var15 = "Your account has been involved"; // L: 1704
								var5 = "in serious rule breaking."; // L: 1705
								var6 = ""; // L: 1706
								break; // L: 1707
							case 1:
								var15 = "Your account has been locked due to"; // L: 1711
								var5 = "suspicious activity."; // L: 1712
								var6 = "Please recover your account."; // L: 1713
								break; // L: 1714
							case 2:
								var15 = "The unpaid balance on your account needs"; // L: 1697
								var5 = "to be resolved before you can play."; // L: 1698
								var6 = Strings.field4247; // L: 1699
								break;
							default:
								class155.Login_promptCredentials(false); // L: 1718
							}

							var0.drawCentered(var15, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1722
							var24 = var23 + 20; // L: 1723
							var0.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1724
							var24 += 20; // L: 1725
							var0.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1726
							var16 = Login.loginBoxX + 180; // L: 1727
							var29 = 276; // L: 1728
							Fonts.field5213.drawAt(var16 - 73, var29 - 20); // L: 1729
							if (Login.field931 == 1) { // L: 1730
								var0.drawCentered("Recover Account", var16, var29 + 5, 16777215, 0); // L: 1731
							} else {
								var0.drawCentered("View Appeal Options", var16, var29 + 5, 16777215, 0); // L: 1734
							}

							var16 = Login.loginBoxX + 180; // L: 1736
							var29 = 326; // L: 1737
							Fonts.field5213.drawAt(var16 - 73, var29 - 20); // L: 1738
							var0.drawCentered("Back", var16, var29 + 5, 16777215, 0); // L: 1739
						} else if (Login.loginIndex == 24) { // L: 1741
							var23 = 221; // L: 1742
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1743
							var24 = var23 + 15; // L: 1744
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1745
							var24 += 15; // L: 1746
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1747
							var24 += 15; // L: 1748
							var4 = Login.loginBoxX + 180; // L: 1749
							var14 = 301; // L: 1750
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1751
							var0.drawCentered("Ok", var4, var14 + 5, 16777215, 0); // L: 1752
						} else if (Login.loginIndex == 32) { // L: 1754
							var23 = 216; // L: 1755
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1756
							var24 = var23 + 15; // L: 1757
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1758
							var24 += 15; // L: 1759
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1760
							var24 += 15; // L: 1761
							var4 = Login.loginBoxX + 180 - 80; // L: 1762
							var14 = 321; // L: 1763
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1764
							var0.drawCentered("Set Date of Birth", var4, var14 + 5, 16777215, 0); // L: 1765
							var4 = Login.loginBoxX + 180 + 80; // L: 1766
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1767
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1768
						} else if (Login.loginIndex == 33) { // L: 1770
							var23 = 201; // L: 1771
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1772
							var24 = var23 + 20; // L: 1773
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1774
							var24 += 20; // L: 1775
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1776
							var24 += 15; // L: 1777
							var4 = Login.loginBoxX + 180; // L: 1778
							var14 = 276; // L: 1779
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1780
							var2.drawCentered("Download Launcher", var4, var14 + 5, 16777215, 0); // L: 1781
							var4 = Login.loginBoxX + 180; // L: 1782
							var14 = 326; // L: 1783
							Fonts.field5213.drawAt(var4 - 73, var14 - 20); // L: 1784
							var2.drawCentered("Back", var4, var14 + 5, 16777215, 0); // L: 1785
						}
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1788
				int[] var22 = new int[4]; // L: 1789
				Rasterizer2D.Rasterizer2D_getClipArray(var22); // L: 1790
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class1.canvasHeight); // L: 1791
				class91.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1792
				class91.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1793
				Rasterizer2D.Rasterizer2D_setClipArray(var22); // L: 1794
			}

			class428.title_muteSprite[class105.clientPreferences.method2602() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1796
			if (Client.gameState > 5 && BuddyRankComparator.clientLanguage == Language.Language_EN) { // L: 1797
				if (Messages.field1449 != null) { // L: 1798
					var24 = Login.xPadding + 5; // L: 1799
					var25 = 463; // L: 1800
					byte var32 = 100; // L: 1801
					byte var31 = 35; // L: 1802
					Messages.field1449.drawAt(var24, var25); // L: 1803
					var0.drawCentered("World" + " " + Client.worldId, var32 / 2 + var24, var31 / 2 + var25 - 2, 16777215, 0); // L: 1804
					if (class172.World_request != null) { // L: 1805
						var1.drawCentered("Loading...", var32 / 2 + var24, var31 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var32 / 2 + var24, var31 / 2 + var25 + 12, 16777215, 0); // L: 1806
					}
				} else {
					Messages.field1449 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(class7.field29, "sl_button", ""); // L: 1809
				}
			}

		}
	} // L: 1251 1812
}
