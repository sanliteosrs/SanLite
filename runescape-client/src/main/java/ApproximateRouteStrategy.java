import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("jx")
	static int[][] field460;

	ApproximateRouteStrategy() {
	} // L: 13699

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILip;I)Z",
		garbageValue = "950007468"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 13703
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "331513751"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = class421.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "122"
	)
	static int method1223(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2333
			class130.Interpreter_intStackSize -= 3; // L: 2334
			SoundCache.queueSoundEffect(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]); // L: 2335
			return 1; // L: 2336
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2338
				class130.Interpreter_intStackSize -= 5; // L: 2339
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2340
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2341
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 2342
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 2343
				var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 4]; // L: 2344
				ArrayList var15 = new ArrayList(); // L: 2345
				var15.add(var3); // L: 2346
				class498.method8899(var15, var4, var5, var6, var7); // L: 2347
				return 1; // L: 2348
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2350
				class130.Interpreter_intStackSize -= 2; // L: 2351
				LoginScreenAnimation.method2551(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 2352
				return 1; // L: 2353
			} else {
				class92 var10;
				class91 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2355
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2467
						if (var0 == 3211) { // L: 2576
							return 1; // L: 2577
						} else if (var0 == 3216) { // L: 2579
							var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2580
							var4 = 0; // L: 2581
							class92 var19 = (class92)class210.findEnumerated(class6.method37(), var3); // L: 2582
							if (var19 != null) { // L: 2583
								var4 = var19 != class92.field1116 ? 1 : 0; // L: 2584
							}

							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4; // L: 2586
							return 1; // L: 2587
						} else if (var0 == 3218) { // L: 2589
							var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2590
							var4 = 0; // L: 2591
							class91 var13 = (class91)class210.findEnumerated(Interpreter.method2144(), var3); // L: 2592
							if (var13 != null) { // L: 2593
								var4 = var13 != class91.field1102 ? 1 : 0; // L: 2594
							}

							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4; // L: 2596
							return 1; // L: 2597
						} else if (var0 != 3217 && var0 != 3219) { // L: 2599
							if (var0 == 3220) { // L: 2674
								class130.Interpreter_intStackSize -= 2; // L: 2675
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2676
								var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2677
								class137.method3187(var3, var4); // L: 2678
								return 1; // L: 2679
							} else if (var0 == 3221) { // L: 2681
								class130.Interpreter_intStackSize -= 6; // L: 2682
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2683
								var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2684
								var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 2685
								var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 2686
								var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 4]; // L: 2687
								int var8 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 5]; // L: 2688
								ArrayList var9 = new ArrayList(); // L: 2689
								var9.add(var3); // L: 2690
								var9.add(var4); // L: 2691
								class498.method8899(var9, var5, var6, var7, var8); // L: 2692
								return 1; // L: 2693
							} else if (var0 == 3222) { // L: 2695
								class130.Interpreter_intStackSize -= 4; // L: 2696
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2697
								var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2698
								var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 2699
								var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 2700
								class108.method2812(var3, var4, var5, var6); // L: 2701
								return 1; // L: 2702
							} else {
								return 2; // L: 2704
							}
						} else {
							var10 = class92.field1116; // L: 2600
							var11 = class91.field1102; // L: 2601
							var16 = true; // L: 2602
							boolean var17 = true; // L: 2603
							if (var0 == 3217) { // L: 2604
								var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2605
								var10 = (class92)class210.findEnumerated(class6.method37(), var7); // L: 2606
								if (var10 == null) { // L: 2607
									throw new RuntimeException(String.format("Unrecognized device option %d", var7)); // L: 2608
								}
							}

							if (var0 == 3219) { // L: 2611
								var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2612
								var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var7); // L: 2613
								if (var11 == null) { // L: 2614
									throw new RuntimeException(String.format("Unrecognized game option %d", var7)); // L: 2615
								}
							}

							String var12;
							byte var18;
							if (var11 == class91.field1102) { // L: 2618
								switch(var10.field1108) { // L: 2619
								case 1:
								case 2:
								case 3:
									var18 = 0; // L: 2635
									var6 = 1; // L: 2636
									break; // L: 2637
								case 4:
									var18 = 0; // L: 2622
									var6 = Integer.MAX_VALUE; // L: 2623
									break;
								case 5:
									var18 = 0; // L: 2641
									var6 = 100; // L: 2642
									break; // L: 2643
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString()); // L: 2628
									throw new RuntimeException(var12); // L: 2629
								}
							} else {
								switch(var11.field1104) { // L: 2648
								case 1:
									var18 = 0; // L: 2659
									var6 = 1; // L: 2660
									break; // L: 2661
								case 2:
								case 3:
								case 4:
									var18 = 0; // L: 2653
									var6 = 100; // L: 2654
									break; // L: 2655
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString()); // L: 2665
									throw new RuntimeException(var12); // L: 2666
								}
							}

							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var18; // L: 2670
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6; // L: 2671
							return 1; // L: 2672
						}
					} else {
						var10 = class92.field1116; // L: 2468
						var11 = class91.field1102; // L: 2469
						var16 = false; // L: 2470
						if (var0 == 3214) { // L: 2471
							var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2472
							var10 = (class92)class210.findEnumerated(class6.method37(), var6); // L: 2473
							if (var10 == null) { // L: 2474
								throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2475
							}
						}

						if (var0 == 3215) { // L: 2478
							var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2479
							var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var6); // L: 2480
							if (var11 == null) { // L: 2481
								throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2482
							}
						}

						if (var0 == 3210) { // L: 2485
							var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2486
							var10 = (class92)class210.findEnumerated(class6.method37(), var6); // L: 2487
							if (var10 == null) { // L: 2488
								var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var6); // L: 2489
								if (var11 == null) { // L: 2490
									throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2491
								}
							}
						} else if (var0 == 3182) { // L: 2495
							var10 = class92.field1113; // L: 2496
						} else if (var0 == 3204) { // L: 2498
							var11 = class91.field1101; // L: 2499
						} else if (var0 == 3206) { // L: 2501
							var11 = class91.field1099; // L: 2502
						} else if (var0 == 3208) { // L: 2504
							var11 = class91.field1103; // L: 2505
						}

						if (var11 == class91.field1102) { // L: 2507
							switch(var10.field1108) { // L: 2508
							case 1:
								var5 = class105.clientPreferences.method2672() ? 1 : 0; // L: 2521
								break; // L: 2522
							case 2:
								var5 = class105.clientPreferences.method2602() ? 1 : 0; // L: 2516
								break;
							case 3:
								var5 = class105.clientPreferences.method2580() ? 1 : 0; // L: 2536
								break; // L: 2537
							case 4:
								var5 = class105.clientPreferences.method2581(); // L: 2526
								break; // L: 2527
							case 5:
								var5 = WorldMapArea.method4653(); // L: 2531
								break; // L: 2532
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2511
								throw new RuntimeException(var14); // L: 2512
							}
						} else {
							switch(var11.field1104) { // L: 2542
							case 1:
								var5 = class105.clientPreferences.method2664() ? 1 : 0; // L: 2556
								break; // L: 2557
							case 2:
								var6 = class105.clientPreferences.method2654(); // L: 2550
								var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2551
								break; // L: 2552
							case 3:
								var6 = class105.clientPreferences.method2588(); // L: 2567
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2568
								break; // L: 2569
							case 4:
								var6 = class105.clientPreferences.method2618(); // L: 2561
								var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2562
								break; // L: 2563
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2545
								throw new RuntimeException(var14); // L: 2546
							}
						}

						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5; // L: 2573
						return 1; // L: 2574
					}
				} else {
					var10 = class92.field1116; // L: 2356
					var11 = class91.field1102; // L: 2357
					var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2358
					if (var0 == 3212) { // L: 2359
						var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2360
						var10 = (class92)class210.findEnumerated(class6.method37(), var6); // L: 2361
						if (var10 == null) { // L: 2362
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2363
						}
					}

					if (var0 == 3213) { // L: 2366
						var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2367
						var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var6); // L: 2368
						if (var11 == null) { // L: 2369
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2370
						}
					}

					if (var0 == 3209) { // L: 2373
						var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2374
						var10 = (class92)class210.findEnumerated(class6.method37(), var6); // L: 2375
						if (var10 == null) { // L: 2376
							var11 = (class91)class210.findEnumerated(Interpreter.method2144(), var6); // L: 2377
							if (var11 == null) { // L: 2378
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2379
							}
						}
					} else if (var0 == 3181) { // L: 2383
						var10 = class92.field1113; // L: 2384
					} else if (var0 == 3203) { // L: 2386
						var11 = class91.field1101; // L: 2387
					} else if (var0 == 3205) { // L: 2389
						var11 = class91.field1099; // L: 2390
					} else if (var0 == 3207) { // L: 2392
						var11 = class91.field1103; // L: 2393
					}

					if (var11 == class91.field1102) { // L: 2395
						switch(var10.field1108) { // L: 2396
						case 1:
							class105.clientPreferences.method2630(var5 == 1); // L: 2420
							break; // L: 2421
						case 2:
							class105.clientPreferences.method2576(var5 == 1); // L: 2415
							break; // L: 2416
						case 3:
							class105.clientPreferences.method2642(var5 == 1); // L: 2399
							break;
						case 4:
							if (var5 < 0) { // L: 2409
								var5 = 0;
							}

							class105.clientPreferences.method2657(var5); // L: 2410
							break; // L: 2411
						case 5:
							class166.method3476(var5); // L: 2425
							break; // L: 2426
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString()); // L: 2404
							throw new RuntimeException(var14); // L: 2405
						}
					} else {
						switch(var11.field1104) { // L: 2431
						case 1:
							class105.clientPreferences.method2572(var5 == 1); // L: 2460
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2446
							var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2447
							Script.method2265(var6); // L: 2448
							break; // L: 2449
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2453
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2454
							class105.method2785(var6); // L: 2455
							break; // L: 2456
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100); // L: 2439
							var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2440
							class148.method3278(var6); // L: 2441
							break; // L: 2442
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString()); // L: 2434
							throw new RuntimeException(var14); // L: 2435
						}
					}

					return 1; // L: 2465
				}
			}
		}
	}
}
