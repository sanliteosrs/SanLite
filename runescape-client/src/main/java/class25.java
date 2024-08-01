import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("ah")
	static int[][][] field110;
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field118;
	@ObfuscatedName("ad")
	Collection field111;
	@ObfuscatedName("ag")
	Collection field112;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lbm;"
	)
	class29[] field113;
	@ObfuscatedName("ap")
	boolean[] field117;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 331983769
	)
	volatile int field115;

	class25() {
		this.field113 = new class29[3]; // L: 16
		this.field117 = new boolean[112]; // L: 17
		this.field115 = 0; // L: 18
		this.field111 = new ArrayList(100); // L: 21
		this.field112 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbm;II)V",
		garbageValue = "-311750255"
	)
	void method353(class29 var1, int var2) {
		this.field113[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1104407303"
	)
	int method354() {
		return this.field115; // L: 30
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-15"
	)
	void method377(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1264196004"
	)
	synchronized void method356(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field111.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1145197415"
	)
	void method387() {
		++this.field115; // L: 48
		this.method358(); // L: 49
		Iterator var1 = this.field112.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field113.length && !var2.method477(this.field113[var3]); ++var3) { // L: 53 54
			}
		}

		this.field112.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2008329622"
	)
	synchronized void method358() {
		Collection var1 = this.field112; // L: 134
		this.field112 = this.field111; // L: 135
		this.field111 = var1; // L: 136
	} // L: 137

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label28: {
			var2 = var1.getKeyCode(); // L: 64
			if (var2 >= 0) { // L: 66
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) { // L: 72
					int var5 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 75
					var2 = var5; // L: 77
					boolean var6 = (var5 & 128) != 0; // L: 80
					if (var6) { // L: 82
						var2 = -1;
					}
					break label28;
				}
			}

			var2 = -1; // L: 86
		}

		if (var2 >= 0) { // L: 88
			if (!this.field117[var2]) { // L: 89
				this.field115 = 0; // L: 90
			}

			this.field117[var2] = true; // L: 92
			this.field111.add(new class33(1, var2)); // L: 93
		}

		var1.consume(); // L: 95
	} // L: 96

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 99
			if (var2 >= 0) { // L: 101
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 105
				if (var2 < var4) { // L: 107
					int var5 = KeyHandler.KeyHandler_keyCodes[var2]; // L: 110
					var2 = var5 & -129; // L: 112
					break label17;
				}
			}

			var2 = -1; // L: 116
		}

		if (var2 >= 0) { // L: 118
			this.field117[var2] = false; // L: 119
			this.field111.add(new class33(2, var2)); // L: 120
		}

		var1.consume(); // L: 122
	} // L: 123

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 126
		if (var2 != 0 && var2 != '\uffff' && class354.method6537(var2)) { // L: 127
			this.field111.add(new class33(3, var2)); // L: 128
		}

		var1.consume(); // L: 130
	} // L: 131

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 144
			if (this.field117[var2]) { // L: 145
				this.field117[var2] = false; // L: 146
				this.field111.add(new class33(2, var2)); // L: 147
			}
		}

		this.field111.add(new class33(4, 0)); // L: 150
	} // L: 151

	public final synchronized void focusGained(FocusEvent var1) {
		this.field111.add(new class33(4, 1)); // L: 140
	} // L: 141

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-95"
	)
	static boolean method386(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 1039
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIILip;I)V",
		garbageValue = "1271298547"
	)
	static final void method371(class101 var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
		if (!Client.isLowDetail || (var0.field1325[0][var2][var3] & 2) != 0 || (var0.field1325[var1][var2][var3] & 16) == 0) { // L: 356 357 358
			if (var1 < class83.field1044) { // L: 361
				class83.field1044 = var1;
			}

			ObjectComposition var8 = class10.getObjectDefinition(var4); // L: 362
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) { // L: 365
				var9 = var8.sizeX; // L: 370
				var10 = var8.sizeY; // L: 371
			} else {
				var9 = var8.sizeY; // L: 366
				var10 = var8.sizeX; // L: 367
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.field1332) { // L: 377
				var11 = (var9 >> 1) + var2; // L: 378
				var12 = var2 + (var9 + 1 >> 1); // L: 379
			} else {
				var11 = var2; // L: 382
				var12 = var2 + 1; // L: 383
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.field1320) { // L: 385
				var13 = var3 + (var10 >> 1); // L: 386
				var14 = var3 + (var10 + 1 >> 1); // L: 387
			} else {
				var13 = var3; // L: 390
				var14 = var3 + 1; // L: 391
			}

			int[][] var15 = var0.field1327[var1]; // L: 393
			int var16 = var15[var12][var14] + var15[var11][var13] + var15[var12][var13] + var15[var11][var14] >> 2; // L: 394
			int var17 = (var2 << 7) + (var9 << 6); // L: 395
			int var18 = (var3 << 7) + (var10 << 6); // L: 396
			long var19 = FileSystem.method4223(var2, var3, 2, var8.int1 == 0, var4, var0.field1328); // L: 397
			int var21 = (var5 << 6) + var6; // L: 398
			if (var8.int3 == 1) { // L: 399
				var21 += 256;
			}

			if (var8.hasSound()) { // L: 400
				class134.method3130(var1, var2, var3, var8, var5);
			}

			class282 var22 = var0.field1316; // L: 401
			Object var30;
			if (var6 == 22) { // L: 402
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) { // L: 403
					if (var8.animationId == -1 && var8.transforms == null) { // L: 405
						var30 = var8.getEntity(22, var5, var15, var17, var16, var18);
					} else {
						var30 = new class81(var0, var4, 22, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 406
					}

					var22.method5420(var1, var2, var3, var16, (Renderable)var30, var19, var21); // L: 407
					if (var8.interactType == 1 && var7 != null) { // L: 408
						var7.method4415(var2, var3);
					}

				}
			} else {
				int var29;
				if (var6 != 10 && var6 != 11) { // L: 411
					int[] var10000;
					if (var6 >= 12) { // L: 432
						if (var8.animationId == -1 && var8.transforms == null) { // L: 434
							var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
						} else {
							var30 = new class81(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 435
						}

						var22.method5424(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21); // L: 436
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) { // L: 437
							var10000 = field110[var1][var2];
							var10000[var3] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) { // L: 438
							var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
						}

					} else if (var6 == 0) { // L: 441
						if (var8.animationId == -1 && var8.transforms == null) { // L: 443
							var30 = var8.getEntity(0, var5, var15, var17, var16, var18);
						} else {
							var30 = new class81(var0, var4, 0, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 444
						}

						var22.method5422(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, class83.field1040[var5], 0, var19, var21); // L: 445
						if (var5 == 0) { // L: 446
							if (var8.clipped) { // L: 447
								WorldMapScaleHandler.field2749[var1][var2][var3] = 50; // L: 448
								WorldMapScaleHandler.field2749[var1][var2][var3 + 1] = 50; // L: 449
							}

							if (var8.modelClipped) { // L: 451
								var10000 = field110[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) { // L: 453
							if (var8.clipped) { // L: 454
								WorldMapScaleHandler.field2749[var1][var2][var3 + 1] = 50; // L: 455
								WorldMapScaleHandler.field2749[var1][var2 + 1][var3 + 1] = 50; // L: 456
							}

							if (var8.modelClipped) { // L: 458
								var10000 = field110[var1][var2];
								var10000[var3 + 1] |= 1170;
							}
						} else if (var5 == 2) { // L: 460
							if (var8.clipped) { // L: 461
								WorldMapScaleHandler.field2749[var1][var2 + 1][var3] = 50; // L: 462
								WorldMapScaleHandler.field2749[var1][var2 + 1][var3 + 1] = 50; // L: 463
							}

							if (var8.modelClipped) { // L: 465
								var10000 = field110[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) { // L: 467
							if (var8.clipped) { // L: 468
								WorldMapScaleHandler.field2749[var1][var2][var3] = 50; // L: 469
								WorldMapScaleHandler.field2749[var1][var2 + 1][var3] = 50; // L: 470
							}

							if (var8.modelClipped) { // L: 472
								var10000 = field110[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 474
							var7.method4412(var2, var3, var6, var5, var8.boolean1);
						}

						if (var8.int2 != 16) { // L: 475
							var22.method5515(var1, var2, var3, var8.int2);
						}

					} else if (var6 == 1) { // L: 478
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(1, var5, var15, var17, var16, var18); // L: 480
						} else {
							var30 = new class81(var0, var4, 1, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 481
						}

						var22.method5422(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, class83.field1041[var5], 0, var19, var21); // L: 482
						if (var8.clipped) { // L: 483
							if (var5 == 0) { // L: 484
								WorldMapScaleHandler.field2749[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) { // L: 485
								WorldMapScaleHandler.field2749[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) { // L: 486
								WorldMapScaleHandler.field2749[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) { // L: 487
								WorldMapScaleHandler.field2749[var1][var2][var3] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) { // L: 489
							var7.method4412(var2, var3, var6, var5, var8.boolean1);
						}

					} else {
						int var23;
						if (var6 == 2) { // L: 492
							var23 = var5 + 1 & 3; // L: 493
							Object var25;
							Object var31;
							if (var8.animationId == -1 && var8.transforms == null) { // L: 496
								var31 = var8.getEntity(2, var5 + 4, var15, var17, var16, var18); // L: 497
								var25 = var8.getEntity(2, var23, var15, var17, var16, var18); // L: 498
							} else {
								var31 = new class81(var0, var4, 2, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 501
								var25 = new class81(var0, var4, 2, var23, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 502
							}

							var22.method5422(var1, var2, var3, var16, (Renderable)var31, (Renderable)var25, class83.field1040[var5], class83.field1040[var23], var19, var21); // L: 504
							if (var8.modelClipped) { // L: 505
								if (var5 == 0) { // L: 506
									var10000 = field110[var1][var2]; // L: 507
									var10000[var3] |= 585;
									var10000 = field110[var1][var2]; // L: 508
									var10000[1 + var3] |= 1170;
								} else if (var5 == 1) { // L: 510
									var10000 = field110[var1][var2]; // L: 511
									var10000[var3 + 1] |= 1170;
									var10000 = field110[var1][var2 + 1]; // L: 512
									var10000[var3] |= 585;
								} else if (var5 == 2) { // L: 514
									var10000 = field110[var1][var2 + 1]; // L: 515
									var10000[var3] |= 585;
									var10000 = field110[var1][var2]; // L: 516
									var10000[var3] |= 1170;
								} else if (var5 == 3) { // L: 518
									var10000 = field110[var1][var2]; // L: 519
									var10000[var3] |= 1170;
									var10000 = field110[var1][var2]; // L: 520
									var10000[var3] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 523
								var7.method4412(var2, var3, var6, var5, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 524
								var22.method5515(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 3) { // L: 527
							if (var8.animationId == -1 && var8.transforms == null) { // L: 529
								var30 = var8.getEntity(3, var5, var15, var17, var16, var18);
							} else {
								var30 = new class81(var0, var4, 3, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 530
							}

							var22.method5422(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, class83.field1041[var5], 0, var19, var21); // L: 531
							if (var8.clipped) { // L: 532
								if (var5 == 0) { // L: 533
									WorldMapScaleHandler.field2749[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) { // L: 534
									WorldMapScaleHandler.field2749[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) { // L: 535
									WorldMapScaleHandler.field2749[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) { // L: 536
									WorldMapScaleHandler.field2749[var1][var2][var3] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) { // L: 538
								var7.method4412(var2, var3, var6, var5, var8.boolean1);
							}

						} else if (var6 == 9) { // L: 541
							if (var8.animationId == -1 && var8.transforms == null) { // L: 543
								var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
							} else {
								var30 = new class81(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 544
							}

							var22.method5424(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21); // L: 545
							if (var8.interactType != 0 && var7 != null) { // L: 546
								var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) { // L: 547
								var22.method5515(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 4) { // L: 550
							if (var8.animationId == -1 && var8.transforms == null) { // L: 552
								var30 = var8.getEntity(4, var5, var15, var17, var16, var18);
							} else {
								var30 = new class81(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 553
							}

							var22.method5512(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, class83.field1040[var5], 0, 0, 0, var19, var21); // L: 554
						} else {
							long var24;
							Object var26;
							if (var6 == 5) { // L: 557
								var23 = 16; // L: 558
								var24 = var22.method5440(var1, var2, var3); // L: 559
								if (var24 != 0L) { // L: 560
									var23 = class10.getObjectDefinition(class229.Entity_unpackID(var24)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 562
									var26 = var8.getEntity(4, var5, var15, var17, var16, var18);
								} else {
									var26 = new class81(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 563
								}

								var22.method5512(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, class83.field1040[var5], 0, var23 * class83.field1042[var5], var23 * class83.field1043[var5], var19, var21); // L: 564
							} else if (var6 == 6) { // L: 567
								var23 = 8; // L: 568
								var24 = var22.method5440(var1, var2, var3); // L: 569
								if (var24 != 0L) { // L: 570
									var23 = class10.getObjectDefinition(class229.Entity_unpackID(var24)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) { // L: 572
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
								} else {
									var26 = new class81(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 573
								}

								var22.method5512(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, 256, var5, var23 * class83.field1032[var5], var23 * class83.field1045[var5], var19, var21); // L: 574
							} else if (var6 == 7) { // L: 577
								var29 = var5 + 2 & 3; // L: 579
								if (var8.animationId == -1 && var8.transforms == null) { // L: 580
									var30 = var8.getEntity(4, var29 + 4, var15, var17, var16, var18);
								} else {
									var30 = new class81(var0, var4, 4, var29 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 581
								}

								var22.method5512(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var19, var21); // L: 582
							} else if (var6 == 8) { // L: 585
								var23 = 8; // L: 586
								var24 = var22.method5440(var1, var2, var3); // L: 587
								if (var24 != 0L) { // L: 588
									var23 = class10.getObjectDefinition(class229.Entity_unpackID(var24)).int2 / 2;
								}

								int var28 = var5 + 2 & 3; // L: 591
								Object var27;
								if (var8.animationId == -1 && var8.transforms == null) { // L: 592
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18); // L: 593
									var27 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18); // L: 594
								} else {
									var26 = new class81(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 597
									var27 = new class81(var0, var4, 4, var28 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 598
								}

								var22.method5512(var1, var2, var3, var16, (Renderable)var26, (Renderable)var27, 256, var5, var23 * class83.field1032[var5], var23 * class83.field1045[var5], var19, var21); // L: 600
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) { // L: 413
						var30 = var8.getEntity(10, var5, var15, var17, var16, var18);
					} else {
						var30 = new class81(var0, var4, 10, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null); // L: 414
					}

					if (var30 != null && var22.method5424(var1, var2, var3, var16, var9, var10, (Renderable)var30, var6 == 11 ? 256 : 0, var19, var21) && var8.clipped) { // L: 415 416
						var29 = 15; // L: 417
						if (var30 instanceof Model) { // L: 418
							var29 = ((Model)var30).method5767() / 4; // L: 419
							if (var29 > 30) { // L: 420
								var29 = 30;
							}
						}

						for (int var32 = 0; var32 <= var9; ++var32) { // L: 422
							for (int var33 = 0; var33 <= var10; ++var33) { // L: 423
								if (var29 > WorldMapScaleHandler.field2749[var1][var32 + var2][var3 + var33]) { // L: 424
									WorldMapScaleHandler.field2749[var1][var32 + var2][var3 + var33] = (byte)var29;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) { // L: 429
						var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
					}

				}
			}
		}
	} // L: 409 430 439 476 490 525 539 548 555 565 575 583 601 603
}
