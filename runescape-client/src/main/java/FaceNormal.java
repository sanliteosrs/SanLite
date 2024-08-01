import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field3019;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 278122099
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1988862967
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1153683831
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-822815307"
	)
	static void method5685(int var0) {
		class424.field4705 = var0; // L: 21
		class424.field4704 = new class424[var0]; // L: 22
		class424.field4706 = 0; // L: 23
	} // L: 24

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbs;Lqh;Lqh;B)V",
		garbageValue = "-59"
	)
	static void method5687(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) { // L: 275
			WorldMapAreaData.method5107(var0); // L: 276
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 279
				class105.clientPreferences.method2576(!class105.clientPreferences.method2602()); // L: 280
				class47.method900(); // L: 281
				WorldMapIcon_1.method4578(); // L: 282
			}

			if (Client.gameState != 5) { // L: 284
				if (Login.field953 == -1L) { // L: 285
					Login.field953 = WorldMapData_1.method4861() + 1000L; // L: 286
				}

				long var3 = WorldMapData_1.method4861(); // L: 288
				if (TileItem.method2805() && -1L == Login.field954) { // L: 289 290
					Login.field954 = var3; // L: 291
					if (Login.field954 > Login.field953) { // L: 292
						Login.field953 = Login.field954; // L: 293
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 297
					int var5;
					if (Language.Language_EN == BuddyRankComparator.clientLanguage) { // L: 298
						if (MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 299
							var5 = Login.xPadding + 5; // L: 300
							short var6 = 463; // L: 301
							byte var7 = 100; // L: 302
							byte var8 = 35; // L: 303
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var8) { // L: 304
								Language.method7421(); // L: 305
								return; // L: 306
							}
						}

						if (class172.World_request != null) { // L: 309
							Language.method7421();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton; // L: 311
					int var40 = MouseHandler.MouseHandler_lastPressedX; // L: 312
					int var41 = MouseHandler.MouseHandler_lastPressedY; // L: 313
					if (var5 == 0) { // L: 314
						var40 = MouseHandler.MouseHandler_x; // L: 315
						var41 = MouseHandler.MouseHandler_y; // L: 316
					}

					if (!World.mouseCam && var5 == 4) { // L: 318
						var5 = 1;
					}

					class231 var23 = class134.method3133(); // L: 319
					short var43;
					int var44;
					if (Login.loginIndex == 0) { // L: 320
						boolean var50 = false; // L: 321

						while (var23.method4382()) { // L: 322
							if (var23.field2460 == 84) { // L: 323
								var50 = true; // L: 324
							}
						}

						var44 = Login.loginBoxCenter - 80; // L: 327
						var43 = 291; // L: 328
						if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) { // L: 329
							class421.openURL(class68.method1248("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 330
						}

						var44 = Login.loginBoxCenter + 80; // L: 332
						if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20 || var50) { // L: 333
							ArchiveLoader.method2359(); // L: 334
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) { // L: 337
							while (true) {
								if (!var23.method4382()) { // L: 338
									var9 = Login.loginBoxCenter - 80; // L: 346
									var10 = 321; // L: 347
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 348
										class155.Login_promptCredentials(false); // L: 349
									}

									var9 = Login.loginBoxCenter + 80; // L: 351
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 352
										class163.method3447(0); // L: 353
									}
									break;
								}

								if (var23.field2460 == 84) { // L: 339
									class155.Login_promptCredentials(false); // L: 340
								} else if (var23.field2460 == 13) { // L: 342
									class163.method3447(0); // L: 343
								}
							}
						} else {
							int var13;
							int var14;
							short var42;
							if (Login.loginIndex == 2) { // L: 356
								var42 = 201; // L: 357
								var9 = var42 + 52; // L: 358
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) { // L: 359
									Login.currentLoginField = 0;
								}

								var9 += 15; // L: 360
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) { // L: 361
									Login.currentLoginField = 1;
								}

								var9 += 15; // L: 362
								var42 = 361; // L: 363
								if (class193.field2035 != null) { // L: 364
									var44 = class193.field2035.highX / 2; // L: 365
									if (var5 == 1 && var40 >= class193.field2035.lowX - var44 && var40 <= var44 + class193.field2035.lowX && var41 >= var42 - 15 && var41 < var42) { // L: 366
										switch(Login.field932) { // L: 367
										case 1:
											class421.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 375
											return; // L: 376
										case 2:
											class421.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 370
										}
									}
								}

								var44 = Login.loginBoxCenter - 80; // L: 381
								var43 = 321; // L: 382
								if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) { // L: 383
									KeyHandler.method432(); // L: 384
									return; // L: 385
								}

								var44 = Login.loginBoxX + 180 + 80; // L: 387
								if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) { // L: 388
									class163.method3447(0); // L: 389
									Login.Login_username = ""; // L: 390
									Login.Login_password = ""; // L: 391
									class6.field20 = 0; // L: 392
									class146.otp = ""; // L: 393
									Login.field924 = true; // L: 394
								}

								var44 = Login.loginBoxCenter + -117; // L: 396
								var43 = 277; // L: 397
								Login.field943 = var40 >= var44 && var40 < var44 + class522.field5244 && var41 >= var43 && var41 < var43 + class10.field58; // L: 398
								if (var5 == 1 && Login.field943) { // L: 399
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 400
									if (!Client.Login_isUsernameRemembered && class105.clientPreferences.method2592() != null) { // L: 401
										class105.clientPreferences.method2591((String)null); // L: 402
									}
								}

								var44 = Login.loginBoxCenter + 24; // L: 405
								var43 = 277; // L: 406
								Login.field959 = var40 >= var44 && var40 < var44 + class522.field5244 && var41 >= var43 && var41 < var43 + class10.field58; // L: 407
								if (var5 == 1 && Login.field959) { // L: 408
									class105.clientPreferences.method2630(!class105.clientPreferences.method2672()); // L: 409
									if (!class105.clientPreferences.method2672()) { // L: 410
										Login.Login_username = ""; // L: 411
										class105.clientPreferences.method2591((String)null); // L: 412
										UserComparator4.method2995(); // L: 413
									}
								}

								while (true) {
									Transferable var54;
									do {
										while (true) {
											label1252:
											do {
												while (true) {
													while (var23.method4382()) { // L: 416
														if (var23.field2460 != 13) { // L: 417
															if (Login.currentLoginField != 0) { // L: 426
																continue label1252;
															}

															char var46 = var23.field2459; // L: 427

															for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var46 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13); ++var13) { // L: 429 430
															}

															if (var23.field2460 == 85 && Login.Login_username.length() > 0) { // L: 433
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var23.field2460 == 84 || var23.field2460 == 80) { // L: 434
																Login.currentLoginField = 1;
															}

															if (class25.method386(var23.field2459) && Login.Login_username.length() < 320) { // L: 435
																Login.Login_username = Login.Login_username + var23.field2459;
															}
														} else {
															class163.method3447(0); // L: 418
															Login.Login_username = ""; // L: 419
															Login.Login_password = ""; // L: 420
															class6.field20 = 0; // L: 421
															class146.otp = ""; // L: 422
															Login.field924 = true; // L: 423
														}
													}

													return; // L: 971
												}
											} while(Login.currentLoginField != 1); // L: 437

											if (var23.field2460 == 85 && Login.Login_password.length() > 0) { // L: 438
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 439
											} else if (var23.field2460 == 84 || var23.field2460 == 80) { // L: 441
												Login.currentLoginField = 0; // L: 442
												if (var23.field2460 == 84) { // L: 443
													KeyHandler.method432(); // L: 444
													return; // L: 445
												}
											}

											if ((var23.method4384(82) || var23.method4384(87)) && var23.field2460 == 67) { // L: 448
												Clipboard var53 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 449
												var54 = var53.getContents(class415.client); // L: 450
												var14 = 20 - Login.Login_password.length(); // L: 451
												break;
											}

											if (class212.method4116(var23.field2459) && class25.method386(var23.field2459) && Login.Login_password.length() < 20) { // L: 468
												Login.Login_password = Login.Login_password + var23.field2459; // L: 469
											}
										}
									} while(var14 <= 0); // L: 452

									try {
										String var15 = (String)var54.getTransferData(DataFlavor.stringFlavor); // L: 454
										int var16 = Math.min(var14, var15.length()); // L: 455

										for (int var48 = 0; var48 < var16; ++var48) { // L: 456
											if (!class212.method4116(var15.charAt(var48)) || !class25.method386(var15.charAt(var48))) { // L: 457
												class163.method3447(3); // L: 458
												return; // L: 459
											}
										}

										Login.Login_password = Login.Login_password + var15.substring(0, var16); // L: 462
									} catch (UnsupportedFlavorException var38) { // L: 464
									} catch (IOException var39) { // L: 465
									}
								}
							} else {
								Bounds var26;
								if (Login.loginIndex == 3) { // L: 475
									var9 = Login.loginBoxX + 180; // L: 476
									var10 = 241; // L: 477
									var26 = var1.method8086(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10); // L: 478
									if (var5 == 1 && var26.method7678(var40, var41)) { // L: 479
										class421.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 480
									}

									var9 = Login.loginBoxX + 180; // L: 482
									var10 = 276; // L: 483
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 484
										UserComparator8.method2998(false); // L: 485
									}

									var9 = Login.loginBoxX + 180; // L: 487
									var10 = 326; // L: 488
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 489
										class421.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 490
										return; // L: 491
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) { // L: 494
										var9 = Login.loginBoxX + 180 - 80; // L: 495
										var10 = 321; // L: 496
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 497
											WorldMapLabelSize.method4567(); // L: 498
											return; // L: 499
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 9 && var40 <= Login.loginBoxX + 180 + 130 && var41 >= 263 && var41 <= 296) { // L: 501
											Login.field924 = !Login.field924; // L: 502
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 34 && var40 <= Login.loginBoxX + 34 + 180 && var41 >= 351 && var41 <= 363) { // L: 504
											class421.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 505
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 507
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 508
											class163.method3447(0); // L: 509
											Login.Login_username = ""; // L: 510
											Login.Login_password = ""; // L: 511
											class6.field20 = 0; // L: 512
											class146.otp = ""; // L: 513
										}

										while (var23.method4382()) { // L: 515
											boolean var11 = false; // L: 516

											for (var12 = 0; var12 < "1234567890".length(); ++var12) { // L: 517
												if (var23.field2459 == "1234567890".charAt(var12)) { // L: 518
													var11 = true; // L: 519
													break; // L: 520
												}
											}

											if (var23.field2460 == 13) { // L: 523
												class163.method3447(0); // L: 524
												Login.Login_username = ""; // L: 525
												Login.Login_password = ""; // L: 526
												class6.field20 = 0; // L: 527
												class146.otp = ""; // L: 528
											} else {
												if (var23.field2460 == 85 && class146.otp.length() > 0) { // L: 531
													class146.otp = class146.otp.substring(0, class146.otp.length() - 1);
												}

												if (var23.field2460 == 84) { // L: 532
													WorldMapLabelSize.method4567(); // L: 533
													return; // L: 534
												}

												if (var11 && class146.otp.length() < 6) { // L: 536
													class146.otp = class146.otp + var23.field2459;
												}
											}
										}
									} else if (Login.loginIndex == 5) { // L: 540
										var9 = Login.loginBoxX + 180 - 80; // L: 541
										var10 = 321; // L: 542
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 543
											class6.method36(); // L: 544
											return; // L: 545
										}

										var9 = Login.loginBoxX + 180 + 80; // L: 547
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 548
											class155.Login_promptCredentials(true); // L: 549
										}

										var43 = 361; // L: 551
										if (WorldMapSection0.field2657 != null) { // L: 552
											var12 = WorldMapSection0.field2657.highX / 2; // L: 553
											if (var5 == 1 && var40 >= WorldMapSection0.field2657.lowX - var12 && var40 <= var12 + WorldMapSection0.field2657.lowX && var41 >= var43 - 15 && var41 < var43) { // L: 554
												class421.openURL(class68.method1248("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 555
											}
										}

										while (var23.method4382()) { // L: 558
											boolean var45 = false; // L: 559

											for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) { // L: 560
												if (var23.field2459 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) { // L: 561
													var45 = true; // L: 562
													break; // L: 563
												}
											}

											if (var23.field2460 == 13) { // L: 566
												class155.Login_promptCredentials(true); // L: 567
											} else {
												if (var23.field2460 == 85 && Login.Login_username.length() > 0) { // L: 570
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var23.field2460 == 84) { // L: 571
													class6.method36(); // L: 572
													return; // L: 573
												}

												if (var45 && Login.Login_username.length() < 320) { // L: 575
													Login.Login_username = Login.Login_username + var23.field2459;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 579
										if (Login.loginIndex == 7) { // L: 590
											if (UserComparator3.field1501 && !Client.onMobile) { // L: 591
												var9 = Login.loginBoxCenter - 150; // L: 592
												var44 = var9 + 40 + 240 + 25; // L: 593
												var43 = 231; // L: 594
												var12 = var43 + 40; // L: 595
												if (var5 == 1 && var40 >= var9 && var40 <= var44 && var41 >= var43 && var41 <= var12) { // L: 596
													var14 = var9; // L: 598
													int var27 = 0;

													while (true) {
														if (var27 >= 8) {
															var13 = 0; // L: 608
															break;
														}

														if (var40 <= var14 + 30) { // L: 601
															var13 = var27; // L: 602
															break; // L: 603
														}

														var14 += 30; // L: 605
														var14 += var27 != 1 && var27 != 3 ? 5 : 20; // L: 606
														++var27; // L: 600
													}

													Login.field950 = var13; // L: 610
												}

												var13 = Login.loginBoxX + 180 - 80; // L: 612
												short var47 = 321; // L: 613
												boolean var17;
												SimpleDateFormat var18;
												StringBuilder var19;
												String[] var20;
												int var21;
												String var22;
												Date var28;
												Date var29;
												java.util.Calendar var31;
												boolean var32;
												java.util.Calendar var49;
												Date var51;
												Date var52;
												boolean var55;
												if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var47 - 20 && var41 <= var47 + 20) { // L: 614
													label1123: {
														try {
															var18 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 621
															var18.setLenient(false); // L: 622
															var19 = new StringBuilder(); // L: 623
															var20 = Login.field941; // L: 625
															var21 = 0;

															while (true) {
																if (var21 < var20.length) {
																	var22 = var20[var21]; // L: 627
																	if (var22 != null) { // L: 629
																		var19.append(var22); // L: 637
																		++var21; // L: 626
																		continue;
																	}

																	class163.method3447(7); // L: 631
																	VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 632
																	var28 = null; // L: 634
																} else {
																	var19.append("12"); // L: 641
																	var28 = var18.parse(var19.toString()); // L: 642
																}

																var29 = var28; // L: 644
																break;
															}
														} catch (ParseException var37) { // L: 646
															class163.method3447(7); // L: 648
															VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 649
															var55 = false; // L: 651
															break label1123; // L: 652
														}

														if (var29 == null) { // L: 654
															var55 = false; // L: 655
														} else {
															var49 = java.util.Calendar.getInstance(); // L: 660
															var49.set(1, var49.get(1) - 13); // L: 661
															var49.set(5, var49.get(5) + 1); // L: 662
															var49.set(11, 0); // L: 663
															var49.set(12, 0); // L: 664
															var49.set(13, 0); // L: 665
															var49.set(14, 0); // L: 666
															var51 = var49.getTime(); // L: 667
															var17 = var29.before(var51); // L: 668
															var31 = java.util.Calendar.getInstance(); // L: 675
															var31.set(2, 0); // L: 676
															var31.set(5, 1); // L: 677
															var31.set(1, 1900); // L: 678
															var52 = var31.getTime(); // L: 679
															var32 = var29.after(var52); // L: 682
															if (!var32) { // L: 685
																class163.method3447(7); // L: 687
																VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 688
																var55 = false; // L: 690
															} else {
																if (!var17) { // L: 693
																	class164.field1812 = 8388607; // L: 694
																} else {
																	class164.field1812 = (int)(var29.getTime() / 86400000L - 11745L); // L: 697
																}

																var55 = true; // L: 699
															}
														}
													}

													if (var55) { // L: 702
														ClanChannelMember.method3282(50); // L: 703
														return; // L: 704
													}
												}

												var13 = Login.loginBoxX + 180 + 80; // L: 707
												if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var47 - 20 && var41 <= var47 + 20) { // L: 708
													Login.field941 = new String[8]; // L: 709
													class155.Login_promptCredentials(true); // L: 710
												}

												while (var23.method4382()) { // L: 712
													if (var23.field2460 == 101) { // L: 713
														Login.field941[Login.field950] = null; // L: 714
													}

													if (var23.field2460 == 85) { // L: 716
														if (Login.field941[Login.field950] == null && Login.field950 > 0) { // L: 717
															--Login.field950; // L: 718
														}

														Login.field941[Login.field950] = null; // L: 720
													}

													if (var23.field2459 >= '0' && var23.field2459 <= '9') { // L: 722
														Login.field941[Login.field950] = "" + var23.field2459; // L: 723
														if (Login.field950 < 7) { // L: 724
															++Login.field950; // L: 725
														}
													}

													if (var23.field2460 == 84) { // L: 728
														label1052: {
															try {
																var18 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 735
																var18.setLenient(false); // L: 736
																var19 = new StringBuilder(); // L: 737
																var20 = Login.field941; // L: 739
																var21 = 0;

																while (true) {
																	if (var21 < var20.length) {
																		var22 = var20[var21]; // L: 741
																		if (var22 != null) { // L: 743
																			var19.append(var22); // L: 751
																			++var21; // L: 740
																			continue;
																		}

																		class163.method3447(7); // L: 745
																		VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", ""); // L: 746
																		var28 = null; // L: 748
																	} else {
																		var19.append("12"); // L: 755
																		var28 = var18.parse(var19.toString()); // L: 756
																	}

																	var29 = var28; // L: 758
																	break;
																}
															} catch (ParseException var36) { // L: 760
																class163.method3447(7); // L: 762
																VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 763
																var55 = false; // L: 765
																break label1052; // L: 766
															}

															if (var29 == null) { // L: 768
																var55 = false; // L: 769
															} else {
																var49 = java.util.Calendar.getInstance(); // L: 774
																var49.set(1, var49.get(1) - 13); // L: 775
																var49.set(5, var49.get(5) + 1); // L: 776
																var49.set(11, 0); // L: 777
																var49.set(12, 0); // L: 778
																var49.set(13, 0); // L: 779
																var49.set(14, 0); // L: 780
																var51 = var49.getTime(); // L: 781
																var17 = var29.before(var51); // L: 782
																var31 = java.util.Calendar.getInstance(); // L: 789
																var31.set(2, 0); // L: 790
																var31.set(5, 1); // L: 791
																var31.set(1, 1900); // L: 792
																var52 = var31.getTime(); // L: 793
																var32 = var29.after(var52); // L: 796
																if (!var32) { // L: 799
																	class163.method3447(7); // L: 801
																	VerticalAlignment.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 802
																	var55 = false; // L: 804
																} else {
																	if (!var17) { // L: 807
																		class164.field1812 = 8388607; // L: 808
																	} else {
																		class164.field1812 = (int)(var29.getTime() / 86400000L - 11745L); // L: 811
																	}

																	var55 = true; // L: 813
																}
															}
														}

														if (var55) { // L: 816
															ClanChannelMember.method3282(50); // L: 817
														}

														return; // L: 819
													}
												}
											} else {
												var9 = Login.loginBoxX + 180 - 80; // L: 824
												var10 = 321; // L: 825
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 826
													class421.openURL(class68.method1248("secure", true) + "m=dob/set_dob.ws", true, false); // L: 827
													VerticalAlignment.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 828
													class163.method3447(6); // L: 829
													return; // L: 830
												}

												var9 = Login.loginBoxX + 180 + 80; // L: 832
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 833
													class155.Login_promptCredentials(true); // L: 834
												}
											}
										} else if (Login.loginIndex == 8) { // L: 838
											var9 = Login.loginBoxX + 180 - 80; // L: 839
											var10 = 321; // L: 840
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 841
												class421.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 842
												VerticalAlignment.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 843
												class163.method3447(6); // L: 844
												return; // L: 845
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 847
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 848
												class155.Login_promptCredentials(true); // L: 849
											}
										} else if (Login.loginIndex == 9) { // L: 852
											var9 = Login.loginBoxX + 180; // L: 853
											var10 = 311; // L: 854
											if (var23.field2460 == 84 || var23.field2460 == 13 || var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 855
												UserComparator8.method2998(false); // L: 856
											}
										} else if (Login.loginIndex == 10) { // L: 859
											var9 = Login.loginBoxX + 180; // L: 860
											var10 = 209; // L: 861
											if (var23.field2460 == 84 || var5 == 1 && var40 >= var9 - 109 && var40 <= var9 + 109 && var41 >= var10 && var41 <= var10 + 68) { // L: 862
												VerticalAlignment.setLoginResponseString("", "Connecting to server...", ""); // L: 863
												Client.field676 = class551.field5417; // L: 864
												class213.method4134(false); // L: 865
												ClanChannelMember.method3282(20); // L: 866
											}
										} else if (Login.loginIndex == 12) { // L: 869
											var9 = Login.loginBoxCenter; // L: 870
											var10 = 233; // L: 871
											var26 = var2.method8086(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 872
											Bounds var24 = var2.method8086(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 873
											Bounds var25 = var2.method8086(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10); // L: 874
											var44 = var10 + 17; // L: 875
											Bounds var34 = var2.method8086(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var44); // L: 876
											if (var5 == 1) { // L: 877
												if (var26.method7678(var40, var41)) { // L: 878
													class421.openURL("https://www.jagex.com/terms", true, false); // L: 879
												} else if (var24.method7678(var40, var41)) { // L: 881
													class421.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 882
												} else if (var25.method7678(var40, var41) || var34.method7678(var40, var41)) { // L: 884
													class421.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 885
												}
											}

											var9 = Login.loginBoxCenter - 80; // L: 888
											var10 = 311; // L: 889
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 890
												class105.clientPreferences.method2593(Client.field637); // L: 892
												UserComparator8.method2998(true); // L: 894
											}

											var9 = Login.loginBoxCenter + 80; // L: 896
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 897
												Login.loginIndex = 13; // L: 898
											}
										} else if (Login.loginIndex == 13) { // L: 901
											var9 = Login.loginBoxCenter; // L: 902
											var10 = 321; // L: 903
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 904
												UserComparator8.method2998(true); // L: 905
											}
										} else if (Login.loginIndex == 14) { // L: 908
											String var35 = ""; // L: 909
											switch(Login.field931) { // L: 910
											case 0:
												var35 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 915
												break; // L: 916
											case 1:
												var35 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 912
												break; // L: 913
											case 2:
												var35 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 918
												break; // L: 919
											default:
												class155.Login_promptCredentials(false); // L: 921
											}

											var44 = Login.loginBoxX + 180; // L: 924
											var43 = 276; // L: 925
											if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) { // L: 926
												class421.openURL(var35, true, false); // L: 927
												VerticalAlignment.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 928
												class163.method3447(6); // L: 929
												return; // L: 930
											}

											var44 = Login.loginBoxX + 180; // L: 932
											var43 = 326; // L: 933
											if (var5 == 1 && var40 >= var44 - 75 && var40 <= var44 + 75 && var41 >= var43 - 20 && var41 <= var43 + 20) { // L: 934
												class155.Login_promptCredentials(false); // L: 935
											}
										} else if (Login.loginIndex == 24) { // L: 938
											var9 = Login.loginBoxX + 180; // L: 939
											var10 = 301; // L: 940
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 941
												UserComparator8.method2998(false); // L: 942
											}
										} else if (Login.loginIndex == 32) { // L: 945
											var9 = Login.loginBoxX + 180 - 80; // L: 946
											var10 = 321; // L: 947
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 948
												class421.openURL(class68.method1248("secure", true) + "m=dob/set_dob.ws", true, false); // L: 949
												VerticalAlignment.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 950
												class163.method3447(6); // L: 951
												return; // L: 952
											}

											var9 = Login.loginBoxX + 180 + 80; // L: 954
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 955
												class155.Login_promptCredentials(true); // L: 956
											}
										} else if (Login.loginIndex == 33) { // L: 959
											var9 = Login.loginBoxX + 180; // L: 960
											var10 = 276; // L: 961
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 962
												class421.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 963
											}

											var9 = Login.loginBoxX + 180; // L: 965
											var10 = 326; // L: 966
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) { // L: 967
												class155.Login_promptCredentials(true); // L: 968
											}
										}
									} else {
										while (true) {
											do {
												if (!var23.method4382()) { // L: 580
													var42 = 321; // L: 585
													if (var5 == 1 && var41 >= var42 - 20 && var41 <= var42 + 20) { // L: 586
														class155.Login_promptCredentials(true); // L: 587
													}

													return;
												}
											} while(var23.field2460 != 84 && var23.field2460 != 13); // L: 581

											class155.Login_promptCredentials(true); // L: 582
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 277

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "1"
	)
	static void method5686(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class20.field91.field1334[var0][var1][var2]; // L: 8860
		if (var5 != null) { // L: 8861
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) { // L: 8862 8863 8868
				if ((var3 & 32767) == var6.id) { // L: 8864
					var6.method2794(var4); // L: 8865
					break;
				}
			}
		}

	} // L: 8871
}
