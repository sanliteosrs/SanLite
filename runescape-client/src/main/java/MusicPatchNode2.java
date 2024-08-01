import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ml")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("aq")
	byte[] field3578;
	@ObfuscatedName("ad")
	byte[] field3574;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 566895777
	)
	int field3568;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 308977211
	)
	int field3572;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 49725013
	)
	int field3570;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 897378551
	)
	int field3571;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1492885785
	)
	int field3567;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -601731333
	)
	int field3573;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 705420839
	)
	int field3569;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "386952517"
	)
	static int method6152(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1394
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1395
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1396
			return 1; // L: 1397
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1399
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1400
			return 1; // L: 1401
		} else {
			class356 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1403
				if (var3.type == 12) { // L: 1404
					var7 = var3.method6991(); // L: 1405
					if (var7 != null) { // L: 1406
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.method6632().method7924(); // L: 1407
						return 1; // L: 1408
					}
				}

				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.text; // L: 1411
				return 1; // L: 1412
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1414
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1415
				return 1; // L: 1416
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1418
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1419
				return 1; // L: 1420
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1422
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1423
				return 1; // L: 1424
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1426
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1427
				return 1; // L: 1428
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1430
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1431
				return 1; // L: 1432
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1434
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1435
				return 1; // L: 1436
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1438
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1439
				return 1; // L: 1440
			} else if (var0 == 1610) { // L: 1442
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1443
				return 1; // L: 1444
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1446
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.color; // L: 1447
				return 1; // L: 1448
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1450
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.color2; // L: 1451
				return 1; // L: 1452
			} else if (var0 == 1613) { // L: 1454
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1455
				return 1; // L: 1456
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1458
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1459
				return 1; // L: 1460
			} else {
				class350 var4;
				if (var0 == 1617) { // L: 1462
					var4 = var3.method6890(); // L: 1463
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3752 : 0; // L: 1464
				}

				if (var0 == 1618) { // L: 1466
					var4 = var3.method6890(); // L: 1467
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3751 : 0; // L: 1468
					return 1; // L: 1469
				} else if (var0 == 1619) { // L: 1471
					var7 = var3.method6991(); // L: 1472
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6675().method7924() : ""; // L: 1473
					return 1; // L: 1474
				} else if (var0 == 1620) { // L: 1476
					var4 = var3.method6890(); // L: 1477
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3750 : 0; // L: 1478
					return 1; // L: 1479
				} else if (var0 == 1621) { // L: 1481
					var7 = var3.method6991(); // L: 1482
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6643() : 0; // L: 1483
					return 1; // L: 1484
				} else if (var0 == 1622) { // L: 1486
					var7 = var3.method6991(); // L: 1487
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6644() : 0; // L: 1488
					return 1; // L: 1489
				} else if (var0 == 1623) { // L: 1491
					var7 = var3.method6991(); // L: 1492
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6645() : 0; // L: 1493
					return 1; // L: 1494
				} else if (var0 == 1624) { // L: 1496
					var7 = var3.method6991(); // L: 1497
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null && var7.method6635() ? 1 : 0; // L: 1498
					return 1; // L: 1499
				} else if (var0 != 1625) { // L: 1501
					if (var0 == 1626) { // L: 1506
						var7 = var3.method6991(); // L: 1507
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6797().method8195() : ""; // L: 1508
						return 1; // L: 1509
					} else if (var0 == 1627) { // L: 1511
						var7 = var3.method6991(); // L: 1512
						int var5 = var7 != null ? var7.method6639() : 0; // L: 1513
						int var6 = var7 != null ? var7.method6779() : 0; // L: 1514
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1515
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1516
						return 1; // L: 1517
					} else if (var0 == 1628) { // L: 1519
						var7 = var3.method6991(); // L: 1520
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6779() : 0; // L: 1521
						return 1; // L: 1522
					} else if (var0 == 1629) { // L: 1524
						var7 = var3.method6991(); // L: 1525
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6647() : 0; // L: 1526
						return 1; // L: 1527
					} else if (var0 == 1630) { // L: 1529
						var7 = var3.method6991(); // L: 1530
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6784() : 0; // L: 1531
						return 1; // L: 1532
					} else if (var0 == 1631) { // L: 1534
						var7 = var3.method6991(); // L: 1535
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6648() : 0; // L: 1536
						return 1; // L: 1537
					} else if (var0 == 1632) { // L: 1539
						var7 = var3.method6991(); // L: 1540
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6830() : 0; // L: 1541
						return 1; // L: 1542
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1544
							var8 = var3.method6940(); // L: 1545
							Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = var8 != null ? var8.method404(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]) : 0; // L: 1546
							return 1; // L: 1547
						} else if (var0 == 1634) { // L: 1549
							var8 = var3.method6940(); // L: 1550
							Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]) : 0; // L: 1551
							return 1; // L: 1552
						} else {
							return 2; // L: 1554
						}
					}
				} else {
					var7 = var3.method6991(); // L: 1502
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null && var7.method6636() ? 1 : 0; // L: 1503
					return 1; // L: 1504
				}
			}
		}
	}
}
