import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("aq")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1991639177
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	public static void method3280() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 58
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 59
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 60
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 61
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 62
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 63
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 64
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 65
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 66
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 67
		}
	} // L: 69

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "113"
	)
	static void method3282(int var0) {
		if (var0 != Client.gameState) { // L: 1360
			if (Client.gameState == 30) { // L: 1361
				Client.field740.method4349(); // L: 1362
			}

			if (Client.gameState == 0) { // L: 1364
				class415.client.method595();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1365
				KeyHandler.method434(class68.field480); // L: 1366
				Client.field539 = 0; // L: 1367
				Client.field560 = 0; // L: 1368
				Client.timer.method8334(var0); // L: 1369
				if (var0 != 20) { // L: 1370
					class213.method4134(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class386.field4521 != null) { // L: 1372 1373
				class386.field4521.close(); // L: 1374
				class386.field4521 = null; // L: 1375
			}

			if (Client.gameState == 25) { // L: 1378
				Client.field575 = 0; // L: 1379
				Client.field778 = 0; // L: 1380
				Client.field755 = 1; // L: 1381
				Client.field573 = 0; // L: 1382
				Client.field534 = 1; // L: 1383
			}

			if (var0 != 5 && var0 != 10) { // L: 1385
				if (var0 == 20) { // L: 1393
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1394
					LoginScreenAnimation.method2563(WorldMapSection1.field2728, class7.field29, false, var3); // L: 1395
				} else if (var0 == 11) { // L: 1397
					LoginScreenAnimation.method2563(WorldMapSection1.field2728, class7.field29, false, 4); // L: 1398
				} else if (var0 == 50) { // L: 1400
					VerticalAlignment.setLoginResponseString("", "Updating date of birth...", ""); // L: 1401
					LoginScreenAnimation.method2563(WorldMapSection1.field2728, class7.field29, false, 7); // L: 1402
				} else if (var0 != 0 && Login.clearLoginScreen) { // L: 1404 1406
					class486.titleboxSprite = null; // L: 1407
					Fonts.field5213 = null; // L: 1408
					class261.field2707 = null; // L: 1409
					Login.leftTitleSprite = null; // L: 1410
					class189.rightTitleSprite = null; // L: 1411
					ArchiveDiskActionHandler.logoSprite = null; // L: 1412
					class428.title_muteSprite = null; // L: 1413
					class141.field1647 = null; // L: 1414
					Login.field925 = null; // L: 1415
					class562.worldSelectBackSprites = null; // L: 1416
					class105.worldSelectFlagSprites = null; // L: 1417
					class76.worldSelectArrows = null; // L: 1418
					GrandExchangeOfferUnitPriceComparator.worldSelectStars = null; // L: 1419
					Messages.field1449 = null; // L: 1420
					class91.loginScreenRunesAnimation.method2566(); // L: 1421
					class137.method3187(0, 100); // L: 1422
					class147.method3269().method7271(true); // L: 1423
					Login.clearLoginScreen = false; // L: 1424
				}
			} else {
				boolean var1 = class105.clientPreferences.method2594() >= Client.field637; // L: 1388
				int var2 = var1 ? 0 : 12; // L: 1390
				LoginScreenAnimation.method2563(WorldMapSection1.field2728, class7.field29, true, var2); // L: 1391
			}

			Client.gameState = var0; // L: 1427
		}
	} // L: 1428

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	static void method3281() {
		for (class230 var0 = (class230)Client.field717.last(); var0 != null; var0 = (class230)Client.field717.previous()) { // L: 5437
			var0.remove(); // L: 5438
		}

	} // L: 5440
}
