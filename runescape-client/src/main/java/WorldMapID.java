import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static final WorldMapID field2715;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static final WorldMapID field2714;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1916320005
	)
	@Export("value")
	final int value;

	static {
		field2715 = new WorldMapID(0); // L: 4
		field2714 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1445791075"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 164
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Lde;ZLug;I)V",
		garbageValue = "527582669"
	)
	static final void method5008(class101 var0, boolean var1, PacketBuffer var2) {
		Client.field639 = 0; // L: 9361
		Client.field564 = 0; // L: 9362
		var2.importIndex(); // L: 9364
		int var3 = var2.readBits(8); // L: 9365
		int var4;
		if (var3 < var0.field1329) { // L: 9366
			for (var4 = var3; var4 < var0.field1329; ++var4) { // L: 9367
				Client.field644[++Client.field639 - 1] = var0.field1330[var4];
			}
		}

		if (var3 > var0.field1329) { // L: 9369
			throw new RuntimeException(""); // L: 9370
		} else {
			var0.field1329 = 0; // L: 9372

			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) { // L: 9373
				int var20 = var0.field1330[var4]; // L: 9374
				class103 var21 = var0.field1315[var20]; // L: 9375
				var7 = var2.readBits(1); // L: 9376
				if (var7 == 0) { // L: 9377
					var0.field1330[++var0.field1329 - 1] = var20; // L: 9378
					var21.field1240 = Client.cycle; // L: 9379
				} else {
					var8 = var2.readBits(2); // L: 9382
					if (var8 == 0) { // L: 9383
						var0.field1330[++var0.field1329 - 1] = var20; // L: 9384
						var21.field1240 = Client.cycle; // L: 9385
						Client.field565[++Client.field564 - 1] = var20; // L: 9386
					} else if (var8 == 1) { // L: 9389
						var0.field1330[++var0.field1329 - 1] = var20; // L: 9390
						var21.field1240 = Client.cycle; // L: 9391
						var9 = var2.readBits(3); // L: 9392
						var21.method2703(var9, class238.field2519); // L: 9393
						var10 = var2.readBits(1); // L: 9394
						if (var10 == 1) { // L: 9395
							Client.field565[++Client.field564 - 1] = var20;
						}
					} else if (var8 == 2) { // L: 9398
						var0.field1330[++var0.field1329 - 1] = var20; // L: 9399
						var21.field1240 = Client.cycle; // L: 9400
						if (var2.readBits(1) == 1) { // L: 9401
							var9 = var2.readBits(3); // L: 9402
							var21.method2703(var9, class238.field2509); // L: 9403
							var10 = var2.readBits(3); // L: 9404
							var21.method2703(var10, class238.field2509); // L: 9405
						} else {
							var9 = var2.readBits(3); // L: 9408
							var21.method2703(var9, class238.field2520); // L: 9409
						}

						var9 = var2.readBits(1); // L: 9411
						if (var9 == 1) { // L: 9412
							Client.field565[++Client.field564 - 1] = var20;
						}
					} else if (var8 == 3) { // L: 9415
						Client.field644[++Client.field639 - 1] = var20; // L: 9416
					}
				}
			}

			class27.method430(var0, var1, var2); // L: 9421

			for (var3 = 0; var3 < Client.field564; ++var3) { // L: 9423
				var4 = Client.field565[var3]; // L: 9424
				class103 var5 = var0.field1315[var4]; // L: 9425
				int var6 = var2.readUnsignedByte(); // L: 9426
				if ((var6 & 128) != 0) { // L: 9427
					var7 = var2.readUnsignedByte(); // L: 9428
					var6 += var7 << 8; // L: 9429
				}

				if ((var6 & 512) != 0) { // L: 9431
					var7 = var2.readUnsignedByte(); // L: 9432
					var6 += var7 << 16; // L: 9433
				}

				if ((var6 & 65536) != 0) { // L: 9435
					var7 = var2.method9613(); // L: 9436
					var5.field1197 = (var7 & 1) != 0 ? var2.readUnsignedShort() : var5.field1347.turnLeftSequence; // L: 9437
					var5.field1207 = (var7 & 2) != 0 ? var2.method9712() : var5.field1347.turnRightSequence; // L: 9438
					var5.field1199 = (var7 & 4) != 0 ? var2.method9599() : var5.field1347.walkSequence; // L: 9439
					var5.field1200 = (var7 & 8) != 0 ? var2.method9600() : var5.field1347.walkBackSequence; // L: 9440
					var5.field1201 = (var7 & 16) != 0 ? var2.method9599() : var5.field1347.walkLeftSequence; // L: 9441
					var5.field1222 = (var7 & 32) != 0 ? var2.method9600() : var5.field1347.walkRightSequence; // L: 9442
					var5.field1203 = (var7 & 64) != 0 ? var2.method9599() : var5.field1347.field2000; // L: 9443
					var5.field1262 = (var7 & 128) != 0 ? var2.method9600() : var5.field1347.field2006; // L: 9444
					var5.field1219 = (var7 & 256) != 0 ? var2.method9599() : var5.field1347.field2002; // L: 9445
					var5.field1202 = (var7 & 512) != 0 ? var2.method9712() : var5.field1347.field2029; // L: 9446
					var5.field1205 = (var7 & 1024) != 0 ? var2.method9712() : var5.field1347.field2004; // L: 9447
					var5.field1208 = (var7 & 2048) != 0 ? var2.readUnsignedShort() : var5.field1347.field2005; // L: 9448
					var5.field1249 = (var7 & 4096) != 0 ? var2.method9600() : var5.field1347.field2011; // L: 9449
					var5.field1210 = (var7 & 8192) != 0 ? var2.readUnsignedShort() : var5.field1347.field2007; // L: 9450
					var5.field1196 = (var7 & 16384) != 0 ? var2.method9712() : var5.field1347.idleSequence; // L: 9451
				}

				int var11;
				int var12;
				if ((var6 & 1) != 0) { // L: 9453
					var7 = var2.readUnsignedByte(); // L: 9454
					int var13;
					if (var7 > 0) { // L: 9455
						for (var8 = 0; var8 < var7; ++var8) { // L: 9456
							var10 = -1; // L: 9458
							var11 = -1; // L: 9459
							var12 = -1; // L: 9460
							var9 = var2.readUShortSmart(); // L: 9461
							if (var9 == 32767) { // L: 9462
								var9 = var2.readUShortSmart(); // L: 9463
								var11 = var2.readUShortSmart(); // L: 9464
								var10 = var2.readUShortSmart(); // L: 9465
								var12 = var2.readUShortSmart(); // L: 9466
							} else if (var9 != 32766) { // L: 9468
								var11 = var2.readUShortSmart(); // L: 9469
							} else {
								var9 = -1; // L: 9471
							}

							var13 = var2.readUShortSmart(); // L: 9472
							var5.addHitSplat(var9, var11, var10, var12, Client.cycle, var13); // L: 9473
						}
					}

					var8 = var2.method9591(); // L: 9476
					if (var8 > 0) { // L: 9477
						for (var9 = 0; var9 < var8; ++var9) { // L: 9478
							var10 = var2.readUShortSmart(); // L: 9479
							var11 = var2.readUShortSmart(); // L: 9480
							if (var11 != 32767) { // L: 9481
								var12 = var2.readUShortSmart(); // L: 9482
								var13 = var2.method9591(); // L: 9483
								int var14 = var11 > 0 ? var2.method9590() : var13; // L: 9484
								var5.addHealthBar(var10, Client.cycle, var11, var12, var13, var14); // L: 9485
							} else {
								var5.removeHealthBar(var10); // L: 9487
							}
						}
					}
				}

				if ((var6 & 262144) != 0) { // L: 9491
					var7 = var2.readUnsignedByte(); // L: 9492

					for (var8 = 0; var8 < var7; ++var8) { // L: 9493
						var9 = var2.readUnsignedByte(); // L: 9494
						var10 = var2.method9599(); // L: 9495
						var11 = var2.method9613(); // L: 9496
						var5.method2481(var9, var10, var11 >> 16, var11 & 65535); // L: 9497
					}
				}

				if ((var6 & 8) != 0) { // L: 9500
					var7 = var2.method9600(); // L: 9501
					if (var7 == 65535) { // L: 9502
						var7 = -1; // L: 9503
					}

					var8 = var2.method9592(); // L: 9505
					if (var7 == var5.field1235 && var7 != -1) { // L: 9506
						var9 = class353.SequenceDefinition_get(var7).field2305; // L: 9507
						if (var9 == 1) { // L: 9508
							var5.field1236 = 0; // L: 9509
							var5.field1237 = 0; // L: 9510
							var5.field1238 = var8; // L: 9511
							var5.field1214 = 0; // L: 9512
						}

						if (var9 == 2) { // L: 9514
							var5.field1214 = 0; // L: 9515
						}
					} else if (var7 == -1 || var5.field1235 == -1 || class353.SequenceDefinition_get(var7).field2298 >= class353.SequenceDefinition_get(var5.field1235).field2298) { // L: 9518
						var5.field1235 = var7; // L: 9519
						var5.field1236 = 0; // L: 9520
						var5.field1237 = 0; // L: 9521
						var5.field1238 = var8; // L: 9522
						var5.field1214 = 0; // L: 9523
						var5.field1265 = var5.field1229; // L: 9524
					}
				}

				if ((var6 & 8192) != 0) { // L: 9528
					var5.field1266 = var2.readInt(); // L: 9529
				}

				if ((var6 & 2048) != 0) { // L: 9531
					var5.field1251 = Client.cycle + var2.readUnsignedShort(); // L: 9532
					var5.field1215 = Client.cycle + var2.method9712(); // L: 9533
					var5.field1223 = var2.method9595(); // L: 9534
					var5.field1254 = var2.method9749(); // L: 9535
					var5.field1255 = var2.method9749(); // L: 9536
					var5.field1239 = (byte)var2.method9592(); // L: 9537
				}

				if ((var6 & 16) != 0) { // L: 9539
					var5.field1347 = class76.getNpcDefinition(var2.method9599()); // L: 9540
					class489.method8833(var5); // L: 9541
					var5.method2723(); // L: 9542
				}

				if ((var6 & 4096) != 0) { // L: 9544
					var5.method2700(var2.method9592()); // L: 9545
				}

				if ((var6 & 32) != 0) { // L: 9547
					var5.field1190 = var2.readUnsignedShort(); // L: 9549
					var5.field1190 += var2.readUnsignedByte() << 16; // L: 9550
					var7 = 16777215; // L: 9551
					if (var7 == var5.field1190) { // L: 9552
						var5.field1190 = -1; // L: 9553
					}
				}

				int[] var15;
				short[] var16;
				short[] var17;
				long var18;
				boolean var22;
				if ((var6 & 32768) != 0) { // L: 9556
					var7 = var2.method9592(); // L: 9557
					if ((var7 & 1) == 1) { // L: 9558
						var5.method2729(); // L: 9559
					} else {
						var15 = null; // L: 9562
						if ((var7 & 2) == 2) { // L: 9563
							var9 = var2.readUnsignedByte(); // L: 9564
							var15 = new int[var9]; // L: 9565

							for (var10 = 0; var10 < var9; ++var10) { // L: 9566
								var11 = var2.method9712(); // L: 9567
								var11 = var11 == 65535 ? -1 : var11; // L: 9568
								var15[var10] = var11; // L: 9569
							}
						}

						var16 = null; // L: 9572
						if ((var7 & 4) == 4) { // L: 9573
							var10 = 0; // L: 9574
							if (var5.field1347.recolorTo != null) { // L: 9575
								var10 = var5.field1347.recolorTo.length; // L: 9576
							}

							var16 = new short[var10]; // L: 9578

							for (var11 = 0; var11 < var10; ++var11) { // L: 9579
								var16[var11] = (short)var2.method9712(); // L: 9580
							}
						}

						var17 = null; // L: 9583
						if ((var7 & 8) == 8) { // L: 9584
							var11 = 0; // L: 9585
							if (var5.field1347.retextureTo != null) { // L: 9586
								var11 = var5.field1347.retextureTo.length; // L: 9587
							}

							var17 = new short[var11]; // L: 9589

							for (var12 = 0; var12 < var11; ++var12) { // L: 9590
								var17[var12] = (short)var2.method9599(); // L: 9591
							}
						}

						var22 = false; // L: 9594
						if ((var7 & 16) != 0) { // L: 9595
							var22 = var2.readUnsignedByte() == 1; // L: 9596
						}

						var18 = (long)(++class103.field1349 - 1); // L: 9598
						var5.method2714(new class191(var18, var15, var16, var17, var22)); // L: 9599
					}
				}

				if ((var6 & 16384) != 0) { // L: 9602
					var7 = var2.method9591(); // L: 9603
					if ((var7 & 1) == 1) { // L: 9604
						var5.method2715(); // L: 9605
					} else {
						var15 = null; // L: 9608
						if ((var7 & 2) == 2) { // L: 9609
							var9 = var2.method9590(); // L: 9610
							var15 = new int[var9]; // L: 9611

							for (var10 = 0; var10 < var9; ++var10) { // L: 9612
								var11 = var2.readUnsignedShort(); // L: 9613
								var11 = var11 == 65535 ? -1 : var11; // L: 9614
								var15[var10] = var11; // L: 9615
							}
						}

						var16 = null; // L: 9618
						if ((var7 & 4) == 4) { // L: 9619
							var10 = 0; // L: 9620
							if (var5.field1347.recolorTo != null) { // L: 9621
								var10 = var5.field1347.recolorTo.length; // L: 9622
							}

							var16 = new short[var10]; // L: 9624

							for (var11 = 0; var11 < var10; ++var11) { // L: 9625
								var16[var11] = (short)var2.method9599(); // L: 9626
							}
						}

						var17 = null; // L: 9629
						if ((var7 & 8) == 8) { // L: 9630
							var11 = 0; // L: 9631
							if (var5.field1347.retextureTo != null) { // L: 9632
								var11 = var5.field1347.retextureTo.length; // L: 9633
							}

							var17 = new short[var11]; // L: 9635

							for (var12 = 0; var12 < var11; ++var12) { // L: 9636
								var17[var12] = (short)var2.readUnsignedShort(); // L: 9637
							}
						}

						var22 = false; // L: 9640
						if ((var7 & 16) != 0) { // L: 9641
							var22 = var2.method9590() == 1; // L: 9642
						}

						var18 = (long)(++class103.field1351 - 1); // L: 9644
						var5.method2712(new class191(var18, var15, var16, var17, var22)); // L: 9645
					}
				}

				if ((var6 & 4) != 0) { // L: 9648
					var5.field1211 = var2.readStringCp1252NullTerminated(); // L: 9649
					var5.field1206 = 100; // L: 9650
				}

				if ((var6 & 1024) != 0) { // L: 9652
					var5.field1242 = var2.method9594(); // L: 9653
					var5.field1244 = var2.method9749(); // L: 9654
					var5.field1243 = var2.method9594(); // L: 9655
					var5.field1245 = var2.method9594(); // L: 9656
					var5.field1253 = var2.readUnsignedShort() + Client.cycle; // L: 9657
					var5.field1260 = var2.readUnsignedShort() + Client.cycle; // L: 9658
					var5.field1248 = var2.method9599(); // L: 9659
					var5.field1229 = 1; // L: 9660
					var5.field1265 = 0; // L: 9661
					var5.field1242 += var5.field1204[0]; // L: 9662
					var5.field1244 += var5.field1246[0]; // L: 9663
					var5.field1243 += var5.field1204[0]; // L: 9664
					var5.field1245 += var5.field1246[0]; // L: 9665
				}

				if ((var6 & 256) != 0) { // L: 9667
					var5.method2698(var2.readStringCp1252NullTerminated()); // L: 9668
				}

				if ((var6 & 2) != 0) { // L: 9670
					var2.method9600(); // L: 9671
					var2.method9586(); // L: 9672
				}

				if ((var6 & 131072) != 0) { // L: 9674
					var7 = var2.method9590(); // L: 9675
					var15 = new int[8]; // L: 9676
					var16 = new short[8]; // L: 9677

					for (var10 = 0; var10 < 8; ++var10) { // L: 9678
						if ((var7 & 1 << var10) != 0) { // L: 9679
							var15[var10] = var2.method9602(); // L: 9680
							var16[var10] = (short)var2.method9574(); // L: 9681
						} else {
							var15[var10] = -1; // L: 9684
							var16[var10] = -1; // L: 9685
						}
					}

					var5.method2710(var15, var16); // L: 9688
				}

				if ((var6 & 64) != 0) { // L: 9690
					var7 = var2.method9712(); // L: 9691
					var8 = var2.readUnsignedShort(); // L: 9692
					var5.field1230 = var2.method9590() == 1; // L: 9693
					var5.field1252 = var7; // L: 9694
					var5.field1225 = var8; // L: 9695
				}
			}

			for (var3 = 0; var3 < Client.field639; ++var3) { // L: 9699
				var4 = Client.field644[var3]; // L: 9700
				if (var0.field1315[var4].field1240 != Client.cycle) { // L: 9701
					var0.field1315[var4].field1347 = null; // L: 9702
					var0.field1315[var4] = null; // L: 9703
				}
			}

			if (var2.offset != Client.packetWriter.serverPacketLength) { // L: 9706
				throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength); // L: 9707
			} else {
				for (var3 = 0; var3 < var0.field1329; ++var3) { // L: 9709
					if (var0.field1315[var0.field1330[var3]] == null) { // L: 9710
						throw new RuntimeException(var3 + "," + var0.field1329); // L: 9711
					}
				}

			}
		}
	} // L: 9714
}
