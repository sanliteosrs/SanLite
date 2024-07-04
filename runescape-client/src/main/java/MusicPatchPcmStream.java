import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 570349149
	)
	static int field3672;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmc;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lna;[IIIII)V",
		garbageValue = "-1315319686"
	)
	void method6401(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3608[var1.field3685] & 4) != 0 && var1.field3680 < 0) { // L: 73
			int var6 = this.superStream.field3613[var1.field3685] / PcmPlayer.field263; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3695) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3695 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3695 += var7 * var6 - 1048576; // L: 81
				int var8 = PcmPlayer.field263 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3611[var1.field3685] == 0) { // L: 86
					var1.stream = RawPcmStream.method908(var1.rawSound, var10.method923(), var10.method914(), var10.method1010()); // L: 87
				} else {
					var1.stream = RawPcmStream.method908(var1.rawSound, var10.method923(), 0, var10.method1010()); // L: 90
					this.superStream.method6205(var1, var1.table.field3654[var1.field3675] < 0); // L: 91
					var1.stream.method919(var8, var10.method914()); // L: 92
				}

				if (var1.table.field3654[var1.field3675] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method921(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method916()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lna;II)V",
		garbageValue = "454354783"
	)
	void method6393(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3608[var1.field3685] & 4) != 0 && var1.field3680 < 0) { // L: 105
			int var3 = this.superStream.field3613[var1.field3685] / PcmPlayer.field263; // L: 106
			int var4 = (var3 + 1048575 - var1.field3695) / var3; // L: 107
			var1.field3695 = var3 * var2 + var1.field3695 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3611[var1.field3685] == 0) { // L: 110
					var1.stream = RawPcmStream.method908(var1.rawSound, var1.stream.method923(), var1.stream.method914(), var1.stream.method1010()); // L: 111
				} else {
					var1.stream = RawPcmStream.method908(var1.rawSound, var1.stream.method923(), 0, var1.stream.method1010()); // L: 114
					this.superStream.method6205(var1, var1.table.field3654[var1.field3675] < 0); // L: 115
				}

				if (var1.table.field3654[var1.field3675] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3695 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) {
				return null; // L: 28
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("av")
	protected int vmethod6390() {
		return 0; // L: 34
	}

	@ObfuscatedName("ab")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method6256(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3691) { // L: 45
						this.method6401(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field3691 -= var5; // L: 52
						break;
					}

					this.method6401(var6, var1, var4, var6.field3691, var5 + var4); // L: 46
					var4 += var6.field3691; // L: 47
					var5 -= var6.field3691; // L: 48
				} while(!this.superStream.method6278(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("ae")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method6256(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3691) { // L: 62
						this.method6393(var3, var2); // L: 67
						var3.field3691 -= var2; // L: 68
						break;
					}

					this.method6393(var3, var3.field3691); // L: 63
					var2 -= var3.field3691; // L: 64
				} while(!this.superStream.method6278(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-215069565"
	)
	public static int method6418(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnx;Lne;ZI)V",
		garbageValue = "1239073100"
	)
	public static void method6417(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 963
		var0.field3838 = new PlayerComposition(var1); // L: 964
		if (!var2) { // L: 965
			var0.field3838.equipment = Arrays.copyOf(var0.field3838.field3771, var0.field3838.field3771.length); // L: 966
			var0.field3838.method6538(); // L: 967
		}

	} // L: 969

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static final void method6392() {
		class7.method55(false); // L: 6333
		Client.field778 = 0; // L: 6334
		boolean var0 = true; // L: 6335

		int var1;
		for (var1 = 0; var1 < class279.field2894.length; ++var1) { // L: 6336
			if (UrlRequest.field1484[var1] != -1 && class279.field2894[var1] == null) { // L: 6337 6338
				class279.field2894[var1] = class157.field1756.takeFile(UrlRequest.field1484[var1], 0); // L: 6339
				if (class279.field2894[var1] == null) { // L: 6340
					var0 = false; // L: 6341
					++Client.field778; // L: 6342
				}
			}

			if (class131.field1538[var1] != -1 && ModeWhere.field4638[var1] == null) { // L: 6346 6347
				ModeWhere.field4638[var1] = class157.field1756.takeFileEncrypted(class131.field1538[var1], 0, UserComparator10.field1509[var1]); // L: 6348
				if (ModeWhere.field4638[var1] == null) { // L: 6349
					var0 = false; // L: 6350
					++Client.field778; // L: 6351
				}
			}
		}

		if (!var0) { // L: 6356
			Client.field575 = 1; // L: 6357
		} else {
			Client.field573 = 0; // L: 6360
			var0 = true; // L: 6361

			int var3;
			int var4;
			for (var1 = 0; var1 < class279.field2894.length; ++var1) { // L: 6362
				byte[] var17 = ModeWhere.field4638[var1]; // L: 6363
				if (var17 != null) { // L: 6364
					var3 = (class76.field915[var1] >> 8) * 64 - class511.field5137.field1321; // L: 6365
					var4 = (class76.field915[var1] & 255) * 64 - class511.field5137.field1323; // L: 6366
					if (Client.isInInstance) { // L: 6367
						var3 = 10; // L: 6368
						var4 = 10; // L: 6369
					}

					var0 &= class4.method16(var17, var3, var4); // L: 6371
				}
			}

			if (!var0) { // L: 6374
				Client.field575 = 2; // L: 6375
			} else {
				if (Client.field575 != 0) { // L: 6378
					class59.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class157.method3347(); // L: 6379
				class511.field5137.field1316.method5414(); // L: 6380

				for (var1 = 0; var1 < 4; ++var1) { // L: 6381
					class511.field5137.field1317[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6382
					for (var2 = 0; var2 < 104; ++var2) { // L: 6383
						for (var3 = 0; var3 < 104; ++var3) { // L: 6384
							class511.field5137.field1325[var1][var2][var3] = 0; // L: 6385
						}
					}
				}

				class157.method3347(); // L: 6389
				class224.method4301(); // L: 6390
				var1 = class279.field2894.length; // L: 6391
				class60.method1172(); // L: 6392
				class7.method55(true); // L: 6393
				int var5;
				if (!Client.isInInstance) { // L: 6394
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6395
						var3 = (class76.field915[var2] >> 8) * 64 - class511.field5137.field1321; // L: 6396
						var4 = (class76.field915[var2] & 255) * 64 - class511.field5137.field1323; // L: 6397
						var16 = class279.field2894[var2]; // L: 6398
						if (var16 != null) { // L: 6399
							class157.method3347(); // L: 6400
							Login.method2220(class511.field5137, var16, var3, var4, Skeleton.field2915 * 8 - 48, class110.field1418 * 8 - 48); // L: 6401
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6404
						var3 = (class76.field915[var2] >> 8) * 64 - class511.field5137.field1321; // L: 6405
						var4 = (class76.field915[var2] & 255) * 64 - class511.field5137.field1323; // L: 6406
						var16 = class279.field2894[var2]; // L: 6407
						if (var16 == null && class110.field1418 < 800) { // L: 6408
							class157.method3347(); // L: 6409
							TextureProvider.method5720(class511.field5137, var3, var4, 64, 64); // L: 6410
						}
					}

					class7.method55(true); // L: 6413

					for (var2 = 0; var2 < var1; ++var2) { // L: 6414
						byte[] var15 = ModeWhere.field4638[var2]; // L: 6415
						if (var15 != null) { // L: 6416
							var4 = (class76.field915[var2] >> 8) * 64 - class511.field5137.field1321; // L: 6417
							var5 = (class76.field915[var2] & 255) * 64 - class511.field5137.field1323; // L: 6418
							class157.method3347(); // L: 6419
							class235.method4451(class511.field5137, var15, var4, var5); // L: 6420
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6424
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6425
						class157.method3347(); // L: 6426

						for (var3 = 0; var3 < 13; ++var3) { // L: 6427
							for (var4 = 0; var4 < 13; ++var4) { // L: 6428
								boolean var18 = false; // L: 6429
								var6 = Client.field578[var2][var3][var4]; // L: 6430
								if (var6 != -1) { // L: 6431
									var7 = var6 >> 24 & 3; // L: 6432
									var8 = var6 >> 1 & 3; // L: 6433
									var9 = var6 >> 14 & 1023; // L: 6434
									var10 = var6 >> 3 & 2047; // L: 6435
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6436

									for (int var12 = 0; var12 < class76.field915.length; ++var12) { // L: 6437
										if (class76.field915[var12] == var11 && class279.field2894[var12] != null) { // L: 6438
											int var13 = (var9 - var3) * 8; // L: 6439
											int var14 = (var10 - var4) * 8; // L: 6440
											FileSystem.method4224(class511.field5137, class279.field2894[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14); // L: 6441
											var18 = true; // L: 6442
											break;
										}
									}
								}

								if (!var18) { // L: 6447
									ScriptFrame.method1193(class511.field5137.field1327, var2, var3 * 8, var4 * 8); // L: 6448
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6453
						for (var3 = 0; var3 < 13; ++var3) { // L: 6454
							var4 = Client.field578[0][var2][var3]; // L: 6455
							if (var4 == -1) { // L: 6456
								TextureProvider.method5720(class511.field5137, var2 * 8, var3 * 8, 8, 8); // L: 6457
							}
						}
					}

					class7.method55(true); // L: 6461

					for (var2 = 0; var2 < 4; ++var2) { // L: 6462
						class157.method3347(); // L: 6463

						for (var3 = 0; var3 < 13; ++var3) { // L: 6464
							for (var4 = 0; var4 < 13; ++var4) { // L: 6465
								var5 = Client.field578[var2][var3][var4]; // L: 6466
								if (var5 != -1) { // L: 6467
									var6 = var5 >> 24 & 3; // L: 6468
									var7 = var5 >> 1 & 3; // L: 6469
									var8 = var5 >> 14 & 1023; // L: 6470
									var9 = var5 >> 3 & 2047; // L: 6471
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6472

									for (var11 = 0; var11 < class76.field915.length; ++var11) { // L: 6473
										if (class76.field915[var11] == var10 && ModeWhere.field4638[var11] != null) { // L: 6474
											class83.method2287(class511.field5137, ModeWhere.field4638[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7); // L: 6475
											break; // L: 6476
										}
									}
								}
							}
						}
					}
				}

				class7.method55(true); // L: 6484
				class157.method3347(); // L: 6485
				class36.method709(class511.field5137); // L: 6486
				class7.method55(true); // L: 6487
				var2 = class83.field1044; // L: 6488
				if (var2 > class511.field5137.field1318) { // L: 6489
					var2 = class511.field5137.field1318;
				}

				if (var2 < class511.field5137.field1318 - 1) { // L: 6490
					var2 = class511.field5137.field1318 - 1;
				}

				if (Client.isLowDetail) { // L: 6491
					class511.field5137.field1316.method5653(class83.field1044);
				} else {
					class511.field5137.field1316.method5653(0); // L: 6492
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6493
					for (var4 = 0; var4 < 104; ++var4) { // L: 6494
						class237.method4498(class511.field5137, var3, var4); // L: 6495
					}
				}

				class157.method3347(); // L: 6498
				class498.method8901(); // L: 6499
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6500
				PacketBufferNode var19;
				if (class415.client.hasFrame()) { // L: 6501
					var19 = class170.getPacketBufferNode(ClientPacket.field3303, Client.packetWriter.isaacCipher); // L: 6503
					var19.packetBuffer.writeInt(1057001181); // L: 6504
					Client.packetWriter.addNode(var19); // L: 6505
				}

				if (!Client.isInInstance) { // L: 6507
					var3 = (Skeleton.field2915 - 6) / 8; // L: 6508
					var4 = (Skeleton.field2915 + 6) / 8; // L: 6509
					var5 = (class110.field1418 - 6) / 8; // L: 6510
					var6 = (class110.field1418 + 6) / 8; // L: 6511

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6512
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6513
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6514
								class157.field1756.loadRegionFromName("m" + var7 + "_" + var8); // L: 6515
								class157.field1756.loadRegionFromName("l" + var7 + "_" + var8); // L: 6516
							}
						}
					}
				}

				class157.method3347(); // L: 6520
				class328.method6151(); // L: 6521
				var19 = class170.getPacketBufferNode(ClientPacket.field3317, Client.packetWriter.isaacCipher); // L: 6522
				Client.packetWriter.addNode(var19); // L: 6523
				FriendLoginUpdate.method8525(); // L: 6524
				Client.isLoading = false; // L: 6525
			}
		}
	} // L: 6358 6376 6526
}
