import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gv")
public class class176 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field1865;
	@ObfuscatedName("hr")
	static String field1864;
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	static class529 field1863;

	static {
		field1865 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1605139032"
	)
	static final int method3563(int var0, int var1) {
		int var2 = var0 + var1 * 57; // L: 1010
		var2 ^= var2 << 13; // L: 1011
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 1012
		return var3 >> 19 & 255; // L: 1013
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "2064970127"
	)
	static int method3564(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3475
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3476
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3477
			return 1; // L: 3478
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3480
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3481
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3482
			return 1; // L: 3483
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3485
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3486
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3487
			return 1; // L: 3488
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3490
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3491
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3492
			return 1; // L: 3493
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3495
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3496
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3497
			return 1; // L: 3498
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3500
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3501
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3502
			return 1; // L: 3503
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3505
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3506
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3507
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3508
				return 1; // L: 3509
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3511
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3512
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3513
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3514
				return 1; // L: 3515
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3517
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3518
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3519
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3520
				return 1; // L: 3521
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3523
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3524
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3525
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3526
				return 1; // L: 3527
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3529
					var12 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3530
					if (class252.grandExchangeEvents != null) { // L: 3531
						class252.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3532
					}

					return 1; // L: 3534
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3536
					var12 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3537
					if (class252.grandExchangeEvents != null) { // L: 3538
						class252.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3539
					}

					return 1; // L: 3541
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3543
					class130.Interpreter_intStackSize -= 2; // L: 3544
					var12 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] == 1; // L: 3545
					boolean var11 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1; // L: 3546
					if (class252.grandExchangeEvents != null) { // L: 3547
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3548
						class252.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3549
					}

					return 1; // L: 3551
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3553
					var12 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3554
					if (class252.grandExchangeEvents != null) { // L: 3555
						class252.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3556
					}

					return 1; // L: 3558
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3560
					var12 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3561
					if (class252.grandExchangeEvents != null) { // L: 3562
						class252.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3563
					}

					return 1; // L: 3565
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3567
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class252.grandExchangeEvents == null ? 0 : class252.grandExchangeEvents.events.size(); // L: 3568
					return 1; // L: 3569
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3571
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3572
						var4 = (GrandExchangeEvent)class252.grandExchangeEvents.events.get(var3); // L: 3573
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.world; // L: 3574
						return 1; // L: 3575
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3577
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3578
						var4 = (GrandExchangeEvent)class252.grandExchangeEvents.events.get(var3); // L: 3579
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3580
						return 1; // L: 3581
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3583
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3584
						var4 = (GrandExchangeEvent)class252.grandExchangeEvents.events.get(var3); // L: 3585
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3586
						return 1; // L: 3587
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3589
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3590
						var4 = (GrandExchangeEvent)class252.grandExchangeEvents.events.get(var3); // L: 3591
						long var5 = WorldMapData_1.method4861() - BufferedNetSocket.field4988 - var4.age; // L: 3592
						int var7 = (int)(var5 / 3600000L); // L: 3593
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3594
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3595
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3596
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var10; // L: 3597
						return 1; // L: 3598
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3600
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3601
						var4 = (GrandExchangeEvent)class252.grandExchangeEvents.events.get(var3); // L: 3602
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3603
						return 1; // L: 3604
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3606
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3607
						var4 = (GrandExchangeEvent)class252.grandExchangeEvents.events.get(var3); // L: 3608
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3609
						return 1; // L: 3610
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3612
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3613
						var4 = (GrandExchangeEvent)class252.grandExchangeEvents.events.get(var3); // L: 3614
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3615
						return 1; // L: 3616
					} else if (var0 == 3939) { // L: 3618
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3619
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3620
						return 1; // L: 3621
					} else {
						return 2; // L: 3623
					}
				}
			}
		}
	}
}
