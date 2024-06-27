import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("av")
public class class7 {
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field29;
	@ObfuscatedName("aq")
	ExecutorService field22;
	@ObfuscatedName("ad")
	Future field28;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	final Buffer field23;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class3 field27;

	@ObfuscatedSignature(
		descriptor = "(Lvp;Lak;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field22 = Executors.newSingleThreadExecutor(); // L: 10
		this.field23 = var1; // L: 16
		this.field27 = var2; // L: 17
		this.method45(); // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1439503173"
	)
	public boolean method42() {
		return this.field28.isDone(); // L: 22
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1847280549"
	)
	public void method43() {
		this.field22.shutdown(); // L: 26
		this.field22 = null; // L: 27
	} // L: 28

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lvp;",
		garbageValue = "5"
	)
	public Buffer method44() {
		try {
			return (Buffer)this.field28.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-49"
	)
	void method45() {
		this.field28 = this.field22.submit(new class1(this, this.field23, this.field27)); // L: 40
	} // L: 41

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "55"
	)
	static int method59(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1283
			var0 -= 1000; // L: 1284
			var3 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 1285
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1287
		}

		String var4 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1288
		int[] var5 = null; // L: 1289
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1290
			int var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1291
			if (var6 > 0) { // L: 1292
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]) { // L: 1293 1294
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1296
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1298

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1299
			if (var4.charAt(var7 - 1) == 's') { // L: 1300
				var9[var7] = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 1301
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1303
		if (var7 != -1) { // L: 1304
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1305
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1306
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1307
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1308
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1309
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1310
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1311
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1312
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1313
			var3.onVarTransmit = var9; // L: 1314
			var3.varTransmitTriggers = var5; // L: 1315
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1317
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1318
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1319
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1320
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1321
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1322
			var3.onInvTransmit = var9; // L: 1323
			var3.invTransmitTriggers = var5; // L: 1324
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1326
			var3.onStatTransmit = var9; // L: 1327
			var3.statTransmitTriggers = var5; // L: 1328
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1330
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1331
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1332
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1333
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1334
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1335
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1336
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1337
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1338
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1339
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1340
			var3.field3954 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1341
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1342
			var3.field3947 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1343
			var3.field3865 = var9;
		} else if (var0 == 1430) { // L: 1344
			var3.field3840 = var9;
		} else if (var0 == 1431) { // L: 1345
			var3.field3829 = var9;
		} else if (var0 == 1434) { // L: 1346
			var3.field3955 = var9;
		} else if (var0 == 1435) { // L: 1347
			var3.field3939 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1348
				return 2; // L: 1358
			}

			class354 var8 = var3.method6892(); // L: 1349
			if (var8 != null) { // L: 1350
				if (var0 == 1436) { // L: 1351
					var8.field3768 = var9;
				} else if (var0 == 1437) { // L: 1352
					var8.field3763 = var9;
				} else if (var0 == 1438) { // L: 1353
					var8.field3769 = var9;
				} else if (var0 == 1439) { // L: 1354
					var8.field3766 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1360
		return 1; // L: 1361
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqh;B)V",
		garbageValue = "1"
	)
	static void method58(Font var0, Font var1) {
		int var4;
		int var5;
		if (class562.worldSelectBackSprites == null) { // L: 1821
			Archive var3 = field29; // L: 1823
			SpritePixels[] var2;
			if (!var3.isValidFileName("sl_back", "")) { // L: 1825
				var2 = null; // L: 1826
			} else {
				var4 = var3.getGroupId("sl_back"); // L: 1829
				var5 = var3.getFileId(var4, ""); // L: 1830
				var2 = FriendsChatMember.method8542(var3, var4, var5); // L: 1831
			}

			class562.worldSelectBackSprites = var2; // L: 1833
		}

		if (class105.worldSelectFlagSprites == null) { // L: 1835
			class105.worldSelectFlagSprites = WorldMapArchiveLoader.method8998(field29, "sl_flags", "");
		}

		if (class76.worldSelectArrows == null) { // L: 1836
			class76.worldSelectArrows = WorldMapArchiveLoader.method8998(field29, "sl_arrows", "");
		}

		if (GrandExchangeOfferUnitPriceComparator.worldSelectStars == null) { // L: 1837
			GrandExchangeOfferUnitPriceComparator.worldSelectStars = WorldMapArchiveLoader.method8998(field29, "sl_stars", "");
		}

		if (class31.worldSelectLeftSprite == null) { // L: 1838
			class31.worldSelectLeftSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(field29, "leftarrow", "");
		}

		if (Calendar.worldSelectRightSprite == null) { // L: 1839
			Calendar.worldSelectRightSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(field29, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1840
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1841
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1842
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1843
		if (GrandExchangeOfferUnitPriceComparator.worldSelectStars != null) { // L: 1844
			GrandExchangeOfferUnitPriceComparator.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1845
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1846
			GrandExchangeOfferUnitPriceComparator.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1847
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1848
		}

		if (class76.worldSelectArrows != null) { // L: 1850
			int var22 = Login.xPadding + 280; // L: 1851
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1852
				class76.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				class76.worldSelectArrows[0].drawAt(var22, 4); // L: 1853
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1854
				class76.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				class76.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1855
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1856
			int var23 = Login.xPadding + 390; // L: 1857
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1858
				class76.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				class76.worldSelectArrows[0].drawAt(var23, 4); // L: 1859
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1860
				class76.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				class76.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1861
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1862
			var4 = Login.xPadding + 500; // L: 1863
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1864
				class76.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class76.worldSelectArrows[0].drawAt(var4, 4); // L: 1865
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1866
				class76.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class76.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1867
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1868
			var5 = Login.xPadding + 610; // L: 1869
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1870
				class76.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class76.worldSelectArrows[0].drawAt(var5, 4); // L: 1871
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1872
				class76.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class76.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1873
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1874
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1876
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1877
		Login.hoveredWorldIndex = -1; // L: 1878
		if (class562.worldSelectBackSprites != null) { // L: 1879
			byte var26 = 88; // L: 1880
			byte var27 = 19; // L: 1881
			var4 = 765 / (var26 + 1) - 1; // L: 1882
			var5 = 480 / (var27 + 1); // L: 1883

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1885
				var7 = var4; // L: 1886
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1887
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1888
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1889
					--var5;
				}
			} while(var6 != var5 || var4 != var7); // L: 1890

			var6 = (765 - var4 * var26) / (var4 + 1); // L: 1892
			if (var6 > 5) { // L: 1893
				var6 = 5;
			}

			var7 = (480 - var5 * var27) / (var5 + 1); // L: 1894
			if (var7 > 5) { // L: 1895
				var7 = 5;
			}

			int var8 = (765 - var26 * var4 - var6 * (var4 - 1)) / 2; // L: 1896
			int var9 = (480 - var27 * var5 - var7 * (var5 - 1)) / 2; // L: 1897
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1898
			Login.worldSelectPagesCount = var10 - var4; // L: 1899
			if (class31.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1900
				class31.worldSelectLeftSprite.drawAt(8, class1.canvasHeight / 2 - class31.worldSelectLeftSprite.subHeight * 912646400 / 2); // L: 1901
			}

			if (Calendar.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1903
				Calendar.worldSelectRightSprite.drawAt(class74.canvasWidth - Calendar.worldSelectRightSprite.subWidth - 8, class1.canvasHeight / 2 - Calendar.worldSelectRightSprite.subHeight * 912646400 / 2); // L: 1904
			}

			int var11 = var9 + 23; // L: 1906
			int var12 = var8 + Login.xPadding; // L: 1907
			int var13 = 0; // L: 1908
			boolean var14 = false; // L: 1909
			int var15 = Login.worldSelectPage; // L: 1910

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1911 1912
				World var17 = class357.World_worlds[var16]; // L: 1915
				boolean var18 = true; // L: 1916
				String var19 = Integer.toString(var17.population); // L: 1917
				if (var17.population == -1) { // L: 1918
					var19 = "OFF"; // L: 1919
					var18 = false; // L: 1920
				} else if (var17.population > 1980) { // L: 1922
					var19 = "FULL"; // L: 1923
					var18 = false; // L: 1924
				}

				class111 var20 = null; // L: 1926
				int var21 = 0; // L: 1927
				if (var17.isBeta()) { // L: 1928
					var20 = var17.isMembersOnly() ? class111.field1427 : class111.field1432; // L: 1929
				} else if (var17.isDeadman()) { // L: 1931
					var20 = var17.isMembersOnly() ? class111.field1435 : class111.field1434; // L: 1932
				} else if (var17.method1850()) { // L: 1934
					var21 = 16711680; // L: 1935
					var20 = var17.isMembersOnly() ? class111.field1420 : class111.field1426; // L: 1936
				} else if (var17.method1852()) { // L: 1938
					var20 = var17.isMembersOnly() ? class111.field1424 : class111.field1428; // L: 1939
				} else if (var17.isPvp()) { // L: 1941
					var20 = var17.isMembersOnly() ? class111.field1423 : class111.field1422; // L: 1942
				} else if (var17.method1881()) { // L: 1944
					var20 = var17.isMembersOnly() ? class111.field1429 : class111.field1430; // L: 1945
				} else if (var17.method1854()) { // L: 1947
					var20 = var17.isMembersOnly() ? class111.field1433 : class111.field1437; // L: 1948
				}

				if (var20 == null || var20.field1436 >= class562.worldSelectBackSprites.length) { // L: 1950
					var20 = var17.isMembersOnly() ? class111.field1421 : class111.field1431; // L: 1951
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var26 && MouseHandler.MouseHandler_y < var27 + var11 && var18) { // L: 1953
					Login.hoveredWorldIndex = var16; // L: 1954
					class562.worldSelectBackSprites[var20.field1436].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1955
					var14 = true; // L: 1956
				} else {
					class562.worldSelectBackSprites[var20.field1436].drawAt(var12, var11); // L: 1958
				}

				if (class105.worldSelectFlagSprites != null) { // L: 1959
					class105.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1); // L: 1960
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1); // L: 1961
				var11 = var11 + var27 + var7; // L: 1962
				++var13; // L: 1963
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1964
					var12 = var12 + var26 + var6; // L: 1965
					var13 = 0; // L: 1966
					++var15; // L: 1967
				}
			}

			if (var14) { // L: 1970
				var16 = var1.stringWidth(class357.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1971
				int var24 = var1.ascent + 8; // L: 1972
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1973
				if (var25 + var24 > 480) { // L: 1974
					var25 = MouseHandler.MouseHandler_y - 25 - var24; // L: 1975
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120); // L: 1977
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0); // L: 1978
				var1.drawCentered(class357.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1979
			}
		}

	} // L: 1982

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1485745339"
	)
	static void method56(int var0) {
		if (var0 != -1) { // L: 5361
			if (ModeWhere.field4649.method6514(var0)) { // L: 5362
				Widget[] var1 = ModeWhere.field4649.field3740[var0]; // L: 5363

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5364
					Widget var3 = var1[var2]; // L: 5365
					if (var3.onLoad != null) { // L: 5366
						ScriptEvent var4 = new ScriptEvent(); // L: 5367
						var4.widget = var3; // L: 5368
						var4.args = var3.onLoad; // L: 5369
						Varps.runScript(var4, 5000000, 0); // L: 5370
					}
				}

			}
		}
	} // L: 5373

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-25"
	)
	static final void method55(boolean var0) {
		class157.method3347(); // L: 6314
		++Client.packetWriter.pendingWrites; // L: 6315
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 6316
			Client.packetWriter.pendingWrites = 0; // L: 6317
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 6318
				PacketBufferNode var1 = class170.getPacketBufferNode(ClientPacket.field3367, Client.packetWriter.isaacCipher); // L: 6320
				Client.packetWriter.addNode(var1); // L: 6321

				try {
					Client.packetWriter.flush(); // L: 6323
				} catch (IOException var3) { // L: 6325
					Client.hadNetworkError = true; // L: 6326
				}
			}

		}
	} // L: 6329
}
