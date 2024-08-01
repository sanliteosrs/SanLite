import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class230 extends Node {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 175701861
	)
	public int field2445;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1937087623
	)
	public int field2443;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1374695771
	)
	public int field2440;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	public Widget field2444;

	@ObfuscatedSignature(
		descriptor = "(IIILnx;)V"
	)
	public class230(int var1, int var2, int var3, Widget var4) {
		this.field2440 = var1; // L: 15
		this.field2445 = var2; // L: 16
		this.field2443 = var3; // L: 17
		this.field2444 = var4; // L: 18
	} // L: 19

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldw;IB)V",
		garbageValue = "-13"
	)
	static final void method4373(class101 var0, Actor var1, int var2) {
		if (var1.field1253 >= Client.cycle) { // L: 4448
			WorldMapScaleHandler.method5152(var1);
		} else {
			int var4;
			int var5;
			int var6;
			int var8;
			int var9;
			if (var1.field1260 >= Client.cycle) { // L: 4449
				boolean var12 = Client.cycle == var1.field1260 || var1.field1235 == -1 || var1.field1238 != 0; // L: 4450
				if (!var12) { // L: 4451
					SequenceDefinition var13 = class353.SequenceDefinition_get(var1.field1235); // L: 4452
					if (var13 != null && !var13.isCachedModelIdSet()) { // L: 4453
						var12 = var1.field1237 + 1 > var13.frameLengths[var1.field1236]; // L: 4457
					} else {
						var12 = true; // L: 4454
					}
				}

				if (var12) { // L: 4460
					var4 = var1.field1260 - var1.field1253; // L: 4461
					var5 = Client.cycle - var1.field1253; // L: 4462
					var6 = var1.field1194 * 64 + var1.field1242 * 128; // L: 4463
					int var14 = var1.field1194 * 64 + var1.field1244 * 128; // L: 4464
					var8 = var1.field1194 * 64 + var1.field1243 * 128; // L: 4465
					var9 = var1.field1194 * 64 + var1.field1245 * 128; // L: 4466
					var1.x = (var5 * var8 + var6 * (var4 - var5)) / var4; // L: 4467
					var1.field1191 = (var9 * var5 + var14 * (var4 - var5)) / var4; // L: 4468
				}

				var1.field1264 = 0; // L: 4470
				var1.field1257 = var1.field1248; // L: 4471
				var1.field1192 = var1.field1257; // L: 4472
			} else {
				var1.field1198 = var1.field1196; // L: 4475
				if (var1.field1229 == 0) { // L: 4476
					var1.field1264 = 0; // L: 4477
				} else {
					label375: {
						if (var1.field1235 != -1 && var1.field1238 == 0) { // L: 4480
							SequenceDefinition var3 = class353.SequenceDefinition_get(var1.field1235); // L: 4481
							if (var1.field1265 > 0 && var3.field2303 == 0) { // L: 4482
								++var1.field1264; // L: 4483
								break label375; // L: 4484
							}

							if (var1.field1265 <= 0 && var3.field2283 == 0) { // L: 4486
								++var1.field1264; // L: 4487
								break label375; // L: 4488
							}
						}

						int var15 = var1.x; // L: 4491
						var4 = var1.field1191; // L: 4492
						var5 = var1.field1194 * 64 + var1.field1204[var1.field1229 - 1] * 128; // L: 4493
						var6 = var1.field1246[var1.field1229 - 1] * 128 + var1.field1194 * 64; // L: 4494
						if (var15 < var5) { // L: 4495
							if (var4 < var6) { // L: 4496
								var1.field1257 = 1280;
							} else if (var4 > var6) { // L: 4497
								var1.field1257 = 1792;
							} else {
								var1.field1257 = 1536; // L: 4498
							}
						} else if (var15 > var5) { // L: 4500
							if (var4 < var6) { // L: 4501
								var1.field1257 = 768;
							} else if (var4 > var6) { // L: 4502
								var1.field1257 = 256;
							} else {
								var1.field1257 = 512; // L: 4503
							}
						} else if (var4 < var6) { // L: 4505
							var1.field1257 = 1024;
						} else if (var4 > var6) { // L: 4506
							var1.field1257 = 0;
						}

						class238 var7 = var1.field1263[var1.field1229 - 1]; // L: 4507
						if (var5 - var15 <= 256 && var5 - var15 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) { // L: 4508
							var8 = var1.field1257 - var1.field1192 & 2047; // L: 4515
							if (var8 > 1024) { // L: 4516
								var8 -= 2048;
							}

							var9 = var1.field1200; // L: 4517
							if (var8 >= -256 && var8 <= 256) { // L: 4518
								var9 = var1.field1199;
							} else if (var8 >= 256 && var8 < 768) { // L: 4519
								var9 = var1.field1222;
							} else if (var8 >= -768 && var8 <= -256) { // L: 4520
								var9 = var1.field1201;
							}

							if (var9 == -1) { // L: 4521
								var9 = var1.field1199;
							}

							var1.field1198 = var9; // L: 4522
							int var10 = 4; // L: 4523
							boolean var11 = true; // L: 4524
							if (var1 instanceof class103) { // L: 4525
								var11 = ((class103)var1).field1347.field2025;
							}

							if (var11) { // L: 4526
								if (var1.field1192 != var1.field1257 && var1.field1190 == -1 && var1.field1259 != 0) { // L: 4527
									var10 = 2;
								}

								if (var1.field1229 > 2) { // L: 4528
									var10 = 6;
								}

								if (var1.field1229 > 3) { // L: 4529
									var10 = 8;
								}

								if (var1.field1264 > 0 && var1.field1229 > 1) { // L: 4530
									var10 = 8; // L: 4531
									--var1.field1264; // L: 4532
								}
							} else {
								if (var1.field1229 > 1) { // L: 4536
									var10 = 6;
								}

								if (var1.field1229 > 2) { // L: 4537
									var10 = 8;
								}

								if (var1.field1264 > 0 && var1.field1229 > 1) { // L: 4538
									var10 = 8; // L: 4539
									--var1.field1264; // L: 4540
								}
							}

							if (var7 == class238.field2509) { // L: 4543
								var10 <<= 1;
							} else if (var7 == class238.field2520) { // L: 4544
								var10 >>= 1;
							}

							if (var10 >= 8) { // L: 4545
								if (var1.field1199 == var1.field1198 && var1.field1203 != -1) { // L: 4546
									var1.field1198 = var1.field1203;
								} else if (var1.field1200 == var1.field1198 && var1.field1262 != -1) { // L: 4547
									var1.field1198 = var1.field1262;
								} else if (var1.field1198 == var1.field1201 && var1.field1219 != -1) { // L: 4548
									var1.field1198 = var1.field1219;
								} else if (var1.field1222 == var1.field1198 && var1.field1202 != -1) { // L: 4549
									var1.field1198 = var1.field1202;
								}
							} else if (var10 <= 2) { // L: 4551
								if (var1.field1198 == var1.field1199 && var1.field1205 != -1) { // L: 4552
									var1.field1198 = var1.field1205;
								} else if (var1.field1200 == var1.field1198 && var1.field1208 != -1) { // L: 4553
									var1.field1198 = var1.field1208;
								} else if (var1.field1201 == var1.field1198 && var1.field1249 != -1) { // L: 4554
									var1.field1198 = var1.field1249;
								} else if (var1.field1198 == var1.field1222 && var1.field1210 != -1) { // L: 4555
									var1.field1198 = var1.field1210;
								}
							}

							if (var5 != var15 || var4 != var6) { // L: 4557
								if (var15 < var5) { // L: 4558
									var1.x += var10; // L: 4559
									if (var1.x > var5) { // L: 4560
										var1.x = var5;
									}
								} else if (var15 > var5) { // L: 4562
									var1.x -= var10; // L: 4563
									if (var1.x < var5) { // L: 4564
										var1.x = var5;
									}
								}

								if (var4 < var6) { // L: 4566
									var1.field1191 += var10; // L: 4567
									if (var1.field1191 > var6) { // L: 4568
										var1.field1191 = var6;
									}
								} else if (var4 > var6) { // L: 4570
									var1.field1191 -= var10; // L: 4571
									if (var1.field1191 < var6) { // L: 4572
										var1.field1191 = var6;
									}
								}
							}

							if (var5 == var1.x && var6 == var1.field1191) { // L: 4575
								--var1.field1229; // L: 4576
								if (var1.field1265 > 0) { // L: 4577
									--var1.field1265;
								}
							}
						} else {
							var1.x = var5; // L: 4509
							var1.field1191 = var6; // L: 4510
							--var1.field1229; // L: 4511
							if (var1.field1265 > 0) { // L: 4512
								--var1.field1265;
							}
						}
					}
				}
			}
		}

		if (var1.x < 128 || 13184 <= var1.x || var1.field1191 < 128 || 13184 <= var1.field1191) { // L: 4580
			var1.field1235 = -1; // L: 4581
			var1.field1253 = 0; // L: 4582
			var1.field1260 = 0; // L: 4583
			var1.method2526(); // L: 4584
			var1.x = var1.field1204[0] * 128 + var1.field1194 * 64; // L: 4585
			var1.field1191 = var1.field1246[0] * 128 + var1.field1194 * 64; // L: 4586
			var1.method2483(); // L: 4587
		}

		if (var1 == SoundCache.localPlayer && (var1.x < 1536 || 11776 <= var1.x || var1.field1191 < 1536 || 11776 <= var1.field1191)) { // L: 4589 4590
			var1.field1235 = -1; // L: 4591
			var1.field1253 = 0; // L: 4592
			var1.field1260 = 0; // L: 4593
			var1.method2526(); // L: 4594
			var1.x = var1.field1204[0] * 128 + var1.field1194 * 64; // L: 4595
			var1.field1191 = var1.field1194 * 64 + var1.field1246[0] * 128; // L: 4596
			var1.method2483(); // L: 4597
		}

		class161.method3429(var0, var1); // L: 4600
		class386.method7176(var1); // L: 4601
	} // L: 4602

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	static void method4374() {
		if (Client.oculusOrbState == 1) { // L: 13498
			Client.field712 = true; // L: 13499
		}

	} // L: 13501
}
