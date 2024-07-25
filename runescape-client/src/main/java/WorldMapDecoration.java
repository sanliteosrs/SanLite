import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1849692139
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -606265631
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 334735629
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "([Lnx;IIIIIIIIB)V",
		garbageValue = "44"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11259
		Rasterizer3D.method5302(); // L: 11260

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 11261
			Widget var10 = var0[var9]; // L: 11262
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 11263 11264
				int var11;
				if (var8 == -1) { // L: 11266
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 11267
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 11268
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 11269
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 11270
					var11 = ++Client.rootWidgetCount - 1; // L: 11271
				} else {
					var11 = var8; // L: 11273
				}

				var10.rootIndex = var11; // L: 11274
				var10.cycle = Client.cycle; // L: 11275
				if (!var10.isIf3 || !class175.isComponentHidden(var10)) { // L: 11276
					if (var10.contentType > 0) { // L: 11277
						class30.method451(var10);
					}

					int var12 = var10.x + var6; // L: 11278
					int var13 = var7 + var10.y; // L: 11279
					int var14 = var10.transparencyTop; // L: 11280
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 11281
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 11282
							class433.field4761 = var0; // L: 11283
							class273.field2819 = var6; // L: 11284
							class143.field1673 = var7; // L: 11285
							continue; // L: 11286
						}

						if (Client.isDraggingWidget && Client.field688) { // L: 11288
							var15 = MouseHandler.MouseHandler_x; // L: 11289
							var16 = MouseHandler.MouseHandler_y; // L: 11290
							var15 -= Client.widgetClickX; // L: 11291
							var16 -= Client.widgetClickY; // L: 11292
							if (var15 < Client.field689) { // L: 11293
								var15 = Client.field689;
							}

							if (var15 + var10.width > Client.field689 + Client.clickedWidgetParent.width) { // L: 11294
								var15 = Client.field689 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field505) { // L: 11295
								var16 = Client.field505;
							}

							if (var16 + var10.height > Client.field505 + Client.clickedWidgetParent.height) { // L: 11296
								var16 = Client.field505 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 11297
							var13 = var16; // L: 11298
						}

						if (!var10.isScrollBar) { // L: 11300
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 11306
						var19 = var12; // L: 11307
						var20 = var13; // L: 11308
						var21 = var12 + var10.width; // L: 11309
						var22 = var13 + var10.height; // L: 11310
						if (var21 < var12) { // L: 11311
							var19 = var21; // L: 11313
							var21 = var12; // L: 11314
						}

						if (var22 < var13) { // L: 11316
							var20 = var22; // L: 11318
							var22 = var13; // L: 11319
						}

						++var21; // L: 11321
						++var22; // L: 11322
						var15 = var19 > var2 ? var19 : var2; // L: 11323
						var16 = var20 > var3 ? var20 : var3; // L: 11324
						var17 = var21 < var4 ? var21 : var4; // L: 11325
						var18 = var22 < var5 ? var22 : var5; // L: 11326
					} else {
						var19 = var12 + var10.width; // L: 11329
						var20 = var13 + var10.height; // L: 11330
						var15 = var12 > var2 ? var12 : var2; // L: 11331
						var16 = var13 > var3 ? var13 : var3; // L: 11332
						var17 = var19 < var4 ? var19 : var4; // L: 11333
						var18 = var20 < var5 ? var20 : var5; // L: 11334
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 11336
						if (var10.contentType != 0) { // L: 11337
							if (var10.contentType == 1336) { // L: 11338
								if (class105.clientPreferences.method2580()) { // L: 11339
									var13 += 15; // L: 11340
									FloorUnderlayDefinition.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 11341
									var13 += 15; // L: 11342
									Runtime var40 = Runtime.getRuntime(); // L: 11343
									var20 = (int)((var40.totalMemory() - var40.freeMemory()) / 1024L); // L: 11344
									var21 = 16776960; // L: 11345
									if (var20 > 327680 && !Client.isLowDetail) { // L: 11346
										var21 = 16711680;
									}

									FloorUnderlayDefinition.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 11347
									var13 += 15; // L: 11348
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 11352
								Client.viewportX = var12; // L: 11353
								Client.viewportY = var13; // L: 11354
								class169.drawEntities(var12, var13, var10.width, var10.height); // L: 11355
								Client.field721[var10.rootIndex] = true; // L: 11356
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11357
								continue; // L: 11358
							}

							if (var10.contentType == 1338) { // L: 11360
								class454.drawMinimap(var10, var12, var13, var11); // L: 11361
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11362
								continue; // L: 11363
							}

							if (var10.contentType == 1339) { // L: 11365
								TaskHandler.method4179(var10, var12, var13, var11); // L: 11366
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11367
								continue; // L: 11368
							}

							if (var10.contentType == 1400) { // L: 11370
								VertexNormal.worldMap.method9116(var12, var13, var10.width, var10.height, Client.cycle, class105.clientPreferences.method2578()); // L: 11371
							}

							if (var10.contentType == 1401) { // L: 11373
								VertexNormal.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 11374
							}

							if (var10.contentType == 1402) { // L: 11376
								class91.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 11377
							}
						}

						if (var10.type == 0) { // L: 11380
							if (!var10.isIf3 && class175.isComponentHidden(var10) && var10 != class180.mousedOverWidgetIf1) { // L: 11381
								continue;
							}

							if (!var10.isIf3) { // L: 11382
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 11383
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 11384
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 11386
							if (var10.children != null) { // L: 11387
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 11388
							if (var28 != null) { // L: 11389
								class96.method2468(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 11390
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11392
							Rasterizer3D.method5302(); // L: 11393
						} else if (var10.type == 11) { // L: 11395
							if (class175.isComponentHidden(var10) && var10 != class180.mousedOverWidgetIf1) { // L: 11396
								continue;
							}

							if (var10.children != null) { // L: 11397
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11398
							Rasterizer3D.method5302(); // L: 11399
						}

						if (Client.isResizable || Client.field723[var11] || Client.field582 > 1) { // L: 11401
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 11402 11403
								class30.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 11405
								if (var10.type == 3) { // L: 11408
									if (class534.runCs1(var10)) { // L: 11410
										var19 = var10.color2; // L: 11411
										if (var10 == class180.mousedOverWidgetIf1 && var10.field3859 != 0) { // L: 11412
											var19 = var10.field3859;
										}
									} else {
										var19 = var10.color; // L: 11415
										if (var10 == class180.mousedOverWidgetIf1 && var10.field3858 != 0) { // L: 11416
											var19 = var10.field3858;
										}
									}

									if (var10.fill) { // L: 11418
										switch(var10.fillMode.field5443) { // L: 11419
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 11425
											break; // L: 11426
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 11428
											break; // L: 11429
										default:
											if (var14 == 0) { // L: 11421
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 11422
											}
										}
									} else if (var14 == 0) { // L: 11433
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 11434
									}
								} else if (var10.type == 4) { // L: 11438
									Font var39 = var10.method6866(ModeWhere.field4649); // L: 11439
									if (var39 == null) { // L: 11440
										if (Widget.field3828) { // L: 11441
											TriBool.invalidateWidget(var10);
										}
									} else {
										String var41 = var10.text; // L: 11445
										if (class534.runCs1(var10)) { // L: 11446
											var20 = var10.color2; // L: 11447
											if (var10 == class180.mousedOverWidgetIf1 && var10.field3859 != 0) { // L: 11448
												var20 = var10.field3859;
											}

											if (var10.field3895.length() > 0) { // L: 11449
												var41 = var10.field3895;
											}
										} else {
											var20 = var10.color; // L: 11452
											if (var10 == class180.mousedOverWidgetIf1 && var10.field3858 != 0) { // L: 11453
												var20 = var10.field3858;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 11455
											ItemComposition var42 = class164.ItemComposition_get(var10.itemId); // L: 11456
											var41 = var42.name; // L: 11457
											if (var41 == null) { // L: 11458
												var41 = "null";
											}

											if ((var42.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 11459
												var41 = class191.colorStartTag(16748608) + var41 + "</col>" + " " + 'x' + class238.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 11461
											var41 = "Please wait..."; // L: 11462
											var20 = var10.color; // L: 11463
										}

										if (!var10.isIf3) { // L: 11465
											var41 = Widget.method7006(var41, var10);
										}

										var39.method8092(var41, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class498.method8893(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 11466
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 11469
										SpritePixels var37;
										if (!var10.isIf3) { // L: 11470
											var37 = var10.method6861(ModeWhere.field4649, class534.runCs1(var10), ByteArrayPool.urlRequester); // L: 11471
											if (var37 != null) { // L: 11472
												var37.drawTransBgAt(var12, var13);
											} else if (Widget.field3828) { // L: 11473
												TriBool.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 11477
												var37 = HitSplatDefinition.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var37 = var10.method6861(ModeWhere.field4649, false, ByteArrayPool.urlRequester); // L: 11478
											}

											if (var37 == null) { // L: 11479
												if (Widget.field3828) { // L: 11503
													TriBool.invalidateWidget(var10);
												}
											} else {
												var20 = var37.width; // L: 11480
												var21 = var37.height; // L: 11481
												if (!var10.spriteTiling) { // L: 11482
													var22 = var10.width * 4096 / var20; // L: 11496
													if (var10.spriteAngle != 0) { // L: 11497
														var37.method10024(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 11498
														var37.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 11499
														var37.drawTransBgAt(var12, var13); // L: 11500
													} else {
														var37.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 11483
													var22 = (var20 - 1 + var10.width) / var20; // L: 11484
													var23 = (var21 - 1 + var10.height) / var21; // L: 11485

													for (var24 = 0; var24 < var22; ++var24) { // L: 11486
														for (var25 = 0; var25 < var23; ++var25) { // L: 11487
															if (var10.spriteAngle != 0) { // L: 11488
																var37.method10024(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 11489
																var37.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var37.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21); // L: 11490
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11493
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 11507
											boolean var35 = class534.runCs1(var10); // L: 11508
											if (var35) { // L: 11510
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 11511
											}

											Model var38 = null; // L: 11512
											var22 = 0; // L: 11513
											if (var10.itemId != -1) { // L: 11514
												ItemComposition var43 = class164.ItemComposition_get(var10.itemId); // L: 11515
												if (var43 != null) { // L: 11516
													var43 = var43.getCountObj(var10.itemQuantity); // L: 11517
													var38 = var43.getModel(1); // L: 11518
													if (var38 != null) { // L: 11519
														var38.calculateBoundsCylinder(); // L: 11520
														var22 = var38.height / 2; // L: 11521
													} else {
														TriBool.invalidateWidget(var10); // L: 11523
													}
												}
											} else if (var10.modelType == 5) { // L: 11526
												if (var10.modelId == 0) { // L: 11527
													var38 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var38 = SoundCache.localPlayer.getModel(); // L: 11528
												}
											} else if (var10.modelType == 7) { // L: 11530
												var38 = var10.field3838.getModel((SequenceDefinition)null, -1, class353.SequenceDefinition_get(SoundCache.localPlayer.field1196), SoundCache.localPlayer.field1232); // L: 11531
											} else {
												class191 var44 = null; // L: 11534
												if (var10.modelType == 6) { // L: 11535
													var24 = var10.modelId; // L: 11536
													if (var24 >= 0 && var24 < class511.field5137.field1315.length) { // L: 11537
														class103 var33 = class511.field5137.field1315[var24]; // L: 11538
														if (var33 != null && var33.field1347 != null) { // L: 11539
															var26 = var33.field1347.method3731(); // L: 11540
															if (var26 != -1) { // L: 11541
																var10.modelId = var26;
															}

															var44 = var33.method2762(); // L: 11542
														}
													}
												} else if (var10.modelType == 2) { // L: 11546
													var24 = var10.modelId; // L: 11547
													var25 = class76.getNpcDefinition(var24).method3731(); // L: 11548
													if (var25 != -1) { // L: 11549
														var10.modelId = var25;
													}
												}

												SequenceDefinition var34 = null; // L: 11551
												var25 = -1; // L: 11552
												if (var20 != -1) { // L: 11553
													var34 = class353.SequenceDefinition_get(var20); // L: 11554
													var25 = var10.modelFrame; // L: 11555
												}

												var38 = var10.method6877(ModeWhere.field4649, var34, var25, var35, SoundCache.localPlayer.appearance, var44); // L: 11557
												if (var38 == null && Widget.field3828) { // L: 11558
													TriBool.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method5307(var10.width / 2 + var12, var10.height / 2 + var13); // L: 11560
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 11561
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 11562
											if (var38 != null) { // L: 11563
												if (!var10.isIf3) { // L: 11564
													var38.method5783(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var38.calculateBoundsCylinder(); // L: 11566
													if (var10.modelOrthog) { // L: 11567
														var38.method5784(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var38.method5783(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 11568
													}
												}
											}

											Rasterizer3D.method5262(); // L: 11571
										} else {
											Font var29;
											if (var10.type == 8 && var10 == GrandExchangeOfferOwnWorldComparator.field466 && Client.field500 == Client.field662) { // L: 11574 11575
												var19 = 0; // L: 11576
												var20 = 0; // L: 11577
												var29 = FloorUnderlayDefinition.fontPlain12; // L: 11578
												String var30 = var10.text; // L: 11579

												String var31;
												for (var30 = Widget.method7006(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 11581 11582 11594
													var24 = var30.indexOf("<br>"); // L: 11583
													if (var24 != -1) { // L: 11584
														var31 = var30.substring(0, var24); // L: 11585
														var30 = var30.substring(var24 + 4); // L: 11586
													} else {
														var31 = var30; // L: 11589
														var30 = ""; // L: 11590
													}

													var25 = var29.stringWidth(var31); // L: 11592
													if (var25 > var19) { // L: 11593
														var19 = var25;
													}
												}

												var19 += 6; // L: 11596
												var20 += 7; // L: 11597
												var24 = var12 + var10.width - 5 - var19; // L: 11598
												var25 = var13 + var10.height + 5; // L: 11599
												if (var24 < var12 + 5) { // L: 11600
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 11601
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 11602
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 11603
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 11604
												var30 = var10.text; // L: 11605
												var26 = var25 + var29.ascent + 2; // L: 11606

												for (var30 = Widget.method7006(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 11607 11608 11619
													int var27 = var30.indexOf("<br>"); // L: 11609
													if (var27 != -1) { // L: 11610
														var31 = var30.substring(0, var27); // L: 11611
														var30 = var30.substring(var27 + 4); // L: 11612
													} else {
														var31 = var30; // L: 11615
														var30 = ""; // L: 11616
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 11618
												}
											}

											if (var10.type == 9) { // L: 11623
												if (var10.field3880) { // L: 11628
													var19 = var12; // L: 11629
													var20 = var13 + var10.height; // L: 11630
													var21 = var12 + var10.width; // L: 11631
													var22 = var13; // L: 11632
												} else {
													var19 = var12; // L: 11635
													var20 = var13; // L: 11636
													var21 = var12 + var10.width; // L: 11637
													var22 = var13 + var10.height; // L: 11638
												}

												if (var10.lineWid == 1) { // L: 11640
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 11641
												} else {
													class241.method4542(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 11644
												}
											} else if (var10.type == 12) { // L: 11648
												class356 var36 = var10.method6991(); // L: 11649
												class350 var32 = var10.method6890(); // L: 11650
												if (var36 != null && var32 != null && var36.method6640()) { // L: 11651
													var29 = var10.method6866(ModeWhere.field4649); // L: 11652
													if (var29 != null) { // L: 11653
														Client.field713.method10163(var12, var13, var10.width, var10.height, var36.method6641(), var36.method6642(), var36.method6779(), var36.method6639(), var36.method6838()); // L: 11654
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 11655
														if (!var36.method6635() && var36.method6632().method7936()) { // L: 11656
															Client.field713.method10174(var32.field3750, var22, var32.field3752, var32.field3751); // L: 11657
															Client.field713.method10165(var36.method6675(), var29); // L: 11658
														} else {
															Client.field713.method10174(var10.color, var22, var32.field3752, var32.field3751); // L: 11661
															Client.field713.method10165(var36.method6632(), var29); // L: 11662
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 11664
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 11669
}
