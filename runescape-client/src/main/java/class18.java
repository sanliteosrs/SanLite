import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class18 {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -528146361
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ct")
	static String field81;
	@ObfuscatedName("aq")
	Future field80;
	@ObfuscatedName("ad")
	String field78;

	class18(Future var1) {
		this.field80 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method264(var1); // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-122"
	)
	void method264(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field78 = var1; // L: 19
		if (this.field80 != null) { // L: 20
			this.field80.cancel(true); // L: 21
			this.field80 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-8109"
	)
	public final String method267() {
		return this.field78; // L: 27
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "882919522"
	)
	public boolean method262() {
		return this.field78 != null || this.field80 == null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-52541686"
	)
	public final boolean method278() {
		return this.method262() ? true : this.field80.isDone(); // L: 35 36
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Las;",
		garbageValue = "-1602966960"
	)
	public final class20 method269() {
		if (this.method262()) {
			return new class20(this.field78);
		} else if (!this.method278()) {
			return null;
		} else {
			try {
				return (class20)this.field80.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method264(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1871392353"
	)
	public static int method280(int var0, int var1, int var2) {
		int var3 = GraphicsObject.method2153(var2 - var1 + 1); // L: 39
		var3 <<= var1; // L: 40
		return var0 & ~var3; // L: 41
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	public static void method279() {
		VarcInt.VarcInt_cached.clear(); // L: 30
	} // L: 31

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "5927"
	)
	public static int method272() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 72
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "([Lnx;IIIIIIIB)V",
		garbageValue = "16"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 12085
			Widget var9 = var0[var8]; // L: 12086
			if (var9 != null && var9.parentId == var1 && (var9.method6870() || ClanChannel.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 12087 12088 12089
				if (var9.isIf3) { // L: 12090
					if (class175.isComponentHidden(var9)) { // L: 12091
						continue;
					}
				} else if (var9.type == 0 && var9 != class180.mousedOverWidgetIf1 && class175.isComponentHidden(var9)) { // L: 12094
					continue;
				}

				if (var9.type == 11) { // L: 12096
					if (var9.method6995(ModeWhere.field4649, ByteArrayPool.urlRequester)) { // L: 12097
						if (var9.method6949()) { // L: 12098
							TriBool.invalidateWidget(var9); // L: 12099
							class238.revalidateWidgetScroll(var9.children, var9, true); // L: 12100
							var9.method6920().method4120().method4244(3, var9.method6920().method4132()); // L: 12101
						}

						if (var9.field3955 != null) { // L: 12103
							ScriptEvent var10 = new ScriptEvent(); // L: 12104
							var10.widget = var9; // L: 12105
							var10.args = var9.field3955; // L: 12106
							Client.scriptEvents.addFirst(var10); // L: 12107
						}
					}
				} else if (var9.type == 12 && var9.method6894(ModeWhere.field4649)) { // L: 12111 12112
					TriBool.invalidateWidget(var9); // L: 12113
				}

				int var26 = var9.x + var6; // L: 12116
				int var11 = var7 + var9.y; // L: 12117
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) { // L: 12122
					var16 = var26; // L: 12123
					var17 = var11; // L: 12124
					var18 = var26 + var9.width; // L: 12125
					int var19 = var11 + var9.height; // L: 12126
					if (var18 < var26) { // L: 12127
						var16 = var18; // L: 12129
						var18 = var26; // L: 12130
					}

					if (var19 < var11) { // L: 12132
						var17 = var19; // L: 12134
						var19 = var11; // L: 12135
					}

					++var18; // L: 12137
					++var19; // L: 12138
					var12 = var16 > var2 ? var16 : var2; // L: 12139
					var13 = var17 > var3 ? var17 : var3; // L: 12140
					var14 = var18 < var4 ? var18 : var4; // L: 12141
					var15 = var19 < var5 ? var19 : var5; // L: 12142
				} else {
					var16 = var26 + var9.width; // L: 12145
					var17 = var11 + var9.height; // L: 12146
					var12 = var26 > var2 ? var26 : var2; // L: 12147
					var13 = var11 > var3 ? var11 : var3; // L: 12148
					var14 = var16 < var4 ? var16 : var4; // L: 12149
					var15 = var17 < var5 ? var17 : var5; // L: 12150
				}

				if (var9 == Client.clickedWidget) { // L: 12152
					Client.field691 = true; // L: 12153
					Client.field692 = var26; // L: 12154
					Client.field663 = var11; // L: 12155
				}

				boolean var34 = false; // L: 12157
				if (var9.field3915) { // L: 12158
					switch(Client.field673) { // L: 12159
					case 0:
						var34 = true; // L: 12161
					case 1:
					default:
						break;
					case 2:
						if (Client.field504 == var9.id >>> 16) { // L: 12164
							var34 = true; // L: 12165
						}
						break;
					case 3:
						if (var9.id == Client.field504) { // L: 12169
							var34 = true; // L: 12170
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 12175
					if (var9.isIf3) { // L: 12176
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 12177
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12178
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 12179
									if (var27.field1083) { // L: 12180
										var27.remove(); // L: 12181
										var27.widget.field3969 = false; // L: 12182
									}
								}

								ClanChannelMember.method3281(); // L: 12185
								if (class494.widgetDragDuration == 0) { // L: 12186
									Client.clickedWidget = null; // L: 12187
									Client.clickedWidgetParent = null; // L: 12188
								}

								if (!Client.isMenuOpen) { // L: 12190
									SoundSystem.method869(); // L: 12191
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12195 12196
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 12197
								if (var27.field1083 && var27.widget.onScroll == var27.args) { // L: 12198
									var27.remove(); // L: 12199
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 12205
					var18 = MouseHandler.MouseHandler_y; // L: 12206
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 12207
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 12208
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 12209
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 12211
					if (var9.contentType == 1337) { // L: 12212
						if (!Client.field514 && !Client.isMenuOpen && var35) { // L: 12213
							GrandExchangeOfferAgeComparator.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 12216
						class452.checkIfMinimapClicked(var9, var26, var11); // L: 12217
					} else {
						if (var9.contentType == 1400) { // L: 12220
							VertexNormal.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 12221
						}

						if (!Client.isMenuOpen && var35) { // L: 12223
							if (var9.contentType == 1400) { // L: 12224
								VertexNormal.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 12225
							} else {
								NameableContainer.method8578(var9); // L: 12228
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 12231
							for (int var20 = 0; var20 < var9.field3907.length; ++var20) { // L: 12232
								var21 = false; // L: 12233
								boolean var28 = false; // L: 12234
								if (!var21 && var9.field3907[var20] != null) { // L: 12235
									for (var23 = 0; var23 < var9.field3907[var20].length; ++var23) { // L: 12236
										boolean var24 = false; // L: 12237
										if (var9.field3977 != null) { // L: 12238
											var24 = Client.field728.method4384(var9.field3907[var20][var23]); // L: 12239
										}

										if (GameEngine.method656(var9.field3907[var20][var23]) || var24) { // L: 12241
											var21 = true; // L: 12242
											if (var9.field3977 != null && var9.field3977[var20] > Client.cycle) { // L: 12243
												break;
											}

											byte var33 = var9.field3980[var20][var23]; // L: 12244
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field728.method4384(86) && !Client.field728.method4384(82) && !Client.field728.method4384(81)) && ((var33 & 2) == 0 || Client.field728.method4384(86)) && ((var33 & 1) == 0 || Client.field728.method4384(82)) && ((var33 & 4) == 0 || Client.field728.method4384(81))) { // L: 12245 12246 12247 12248 12249
												var28 = true; // L: 12251
												break;
											}
										}
									}
								}

								if (var28) { // L: 12257
									if (var20 < 10) { // L: 12258
										class444.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 12259
										Canvas.method322(); // L: 12260
										class290.method5744(var9.id, var9.childIndex, class301.Widget_unpackTargetMask(ClanChannel.getWidgetFlags(var9)), var9.itemId); // L: 12261
										Client.field669 = class142.Widget_getSpellActionName(var9); // L: 12262
										if (Client.field669 == null) { // L: 12263
											Client.field669 = "null";
										}

										Client.field670 = var9.dataText + class191.colorStartTag(16777215); // L: 12264
									}

									var23 = var9.field3966[var20]; // L: 12266
									if (var9.field3977 == null) { // L: 12267
										var9.field3977 = new int[var9.field3907.length];
									}

									if (var9.field3910 == null) { // L: 12268
										var9.field3910 = new int[var9.field3907.length];
									}

									if (var23 != 0) { // L: 12269
										if (var9.field3977[var20] == 0) { // L: 12270
											var9.field3977[var20] = var23 + Client.cycle + var9.field3910[var20];
										} else {
											var9.field3977[var20] = var23 + Client.cycle; // L: 12271
										}
									} else {
										var9.field3977[var20] = Integer.MAX_VALUE; // L: 12273
									}
								}

								if (!var21 && var9.field3977 != null) { // L: 12275 12276
									var9.field3977[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 12280
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12281
								var35 = true;
							} else {
								var35 = false; // L: 12282
							}

							boolean var36 = false; // L: 12283
							if ((MouseHandler.MouseHandler_currentButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 12284
								var36 = true;
							}

							var21 = false; // L: 12285
							if ((MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 12286
								var21 = true;
							}

							if (var21) { // L: 12287
								MouseHandler.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 12288
							}

							if (var9.method6871()) { // L: 12290
								if (var21) { // L: 12291
									Client.field717.addFirst(new class230(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 12292
								}

								if (var36) { // L: 12294
									Client.field717.addFirst(new class230(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 12295
								}
							}

							if (var9.contentType == 1400) { // L: 12298
								VertexNormal.worldMap.method9003(var17, var18, var35 & var36, var35 & var21); // L: 12299
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && UserComparator10.method3027(ClanChannel.getWidgetFlags(var9))) { // L: 12301
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 12302
								Client.field688 = true; // L: 12303
								Client.field689 = var26; // L: 12304
								Client.field505 = var11; // L: 12305
							}

							if (var9.hasListener) { // L: 12307
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 12308
									var22 = new ScriptEvent(); // L: 12309
									var22.field1083 = true; // L: 12310
									var22.widget = var9; // L: 12311
									var22.mouseY = Client.mouseWheelRotation; // L: 12312
									var22.args = var9.onScroll; // L: 12313
									Client.scriptEvents.addFirst(var22); // L: 12314
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 12316
									var21 = false; // L: 12317
									var36 = false; // L: 12318
									var35 = false; // L: 12319
								}

								if (!var9.field3842 && var21) { // L: 12321
									var9.field3842 = true; // L: 12322
									if (var9.onClick != null) { // L: 12323
										var22 = new ScriptEvent(); // L: 12324
										var22.field1083 = true; // L: 12325
										var22.widget = var9; // L: 12326
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 12327
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 12328
										var22.args = var9.onClick; // L: 12329
										Client.scriptEvents.addFirst(var22); // L: 12330
									}
								}

								if (var9.field3842 && var36 && var9.onClickRepeat != null) { // L: 12333 12334
									var22 = new ScriptEvent(); // L: 12335
									var22.field1083 = true; // L: 12336
									var22.widget = var9; // L: 12337
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12338
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12339
									var22.args = var9.onClickRepeat; // L: 12340
									Client.scriptEvents.addFirst(var22); // L: 12341
								}

								if (var9.field3842 && !var36) { // L: 12344
									var9.field3842 = false; // L: 12345
									if (var9.onRelease != null) { // L: 12346
										var22 = new ScriptEvent(); // L: 12347
										var22.field1083 = true; // L: 12348
										var22.widget = var9; // L: 12349
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12350
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12351
										var22.args = var9.onRelease; // L: 12352
										Client.field716.addFirst(var22); // L: 12353
									}
								}

								if (var36 && var9.onHold != null) { // L: 12356 12357
									var22 = new ScriptEvent(); // L: 12358
									var22.field1083 = true; // L: 12359
									var22.widget = var9; // L: 12360
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12361
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12362
									var22.args = var9.onHold; // L: 12363
									Client.scriptEvents.addFirst(var22); // L: 12364
								}

								if (!var9.field3969 && var35) { // L: 12367
									var9.field3969 = true; // L: 12368
									if (var9.onMouseOver != null) { // L: 12369
										var22 = new ScriptEvent(); // L: 12370
										var22.field1083 = true; // L: 12371
										var22.widget = var9; // L: 12372
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12373
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12374
										var22.args = var9.onMouseOver; // L: 12375
										Client.scriptEvents.addFirst(var22); // L: 12376
									}
								}

								if (var9.field3969 && var35 && var9.onMouseRepeat != null) { // L: 12379 12380
									var22 = new ScriptEvent(); // L: 12381
									var22.field1083 = true; // L: 12382
									var22.widget = var9; // L: 12383
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12384
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12385
									var22.args = var9.onMouseRepeat; // L: 12386
									Client.scriptEvents.addFirst(var22); // L: 12387
								}

								if (var9.field3969 && !var35) { // L: 12390
									var9.field3969 = false; // L: 12391
									if (var9.onMouseLeave != null) { // L: 12392
										var22 = new ScriptEvent(); // L: 12393
										var22.field1083 = true; // L: 12394
										var22.widget = var9; // L: 12395
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 12396
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 12397
										var22.args = var9.onMouseLeave; // L: 12398
										Client.field716.addFirst(var22); // L: 12399
									}
								}

								if (var9.onTimer != null) { // L: 12402
									var22 = new ScriptEvent(); // L: 12403
									var22.widget = var9; // L: 12404
									var22.args = var9.onTimer; // L: 12405
									Client.field715.addFirst(var22); // L: 12406
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field697 > var9.field3899) { // L: 12408
									if (var9.varTransmitTriggers != null && Client.field697 - var9.field3899 <= 32) { // L: 12409
										label829:
										for (var39 = var9.field3899; var39 < Client.field697; ++var39) { // L: 12416
											var23 = Client.field696[var39 & 31]; // L: 12417

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 12418
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 12419
													var25 = new ScriptEvent(); // L: 12420
													var25.widget = var9; // L: 12421
													var25.args = var9.onVarTransmit; // L: 12422
													Client.scriptEvents.addFirst(var25); // L: 12423
													break label829; // L: 12424
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 12410
										var22.widget = var9; // L: 12411
										var22.args = var9.onVarTransmit; // L: 12412
										Client.scriptEvents.addFirst(var22); // L: 12413
									}

									var9.field3899 = Client.field697; // L: 12429
								}

								if (var9.onInvTransmit != null && Client.field620 > var9.field3911) { // L: 12431
									if (var9.invTransmitTriggers != null && Client.field620 - var9.field3911 <= 32) { // L: 12432
										label805:
										for (var39 = var9.field3911; var39 < Client.field620; ++var39) { // L: 12439
											var23 = Client.field698[var39 & 31]; // L: 12440

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 12441
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 12442
													var25 = new ScriptEvent(); // L: 12443
													var25.widget = var9; // L: 12444
													var25.args = var9.onInvTransmit; // L: 12445
													Client.scriptEvents.addFirst(var25); // L: 12446
													break label805; // L: 12447
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 12433
										var22.widget = var9; // L: 12434
										var22.args = var9.onInvTransmit; // L: 12435
										Client.scriptEvents.addFirst(var22); // L: 12436
									}

									var9.field3911 = Client.field620; // L: 12452
								}

								if (var9.onStatTransmit != null && Client.field701 > var9.field3974) { // L: 12454
									if (var9.statTransmitTriggers != null && Client.field701 - var9.field3974 <= 32) { // L: 12455
										label781:
										for (var39 = var9.field3974; var39 < Client.field701; ++var39) { // L: 12462
											var23 = Client.field687[var39 & 31]; // L: 12463

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 12464
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 12465
													var25 = new ScriptEvent(); // L: 12466
													var25.widget = var9; // L: 12467
													var25.args = var9.onStatTransmit; // L: 12468
													Client.scriptEvents.addFirst(var25); // L: 12469
													break label781; // L: 12470
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 12456
										var22.widget = var9; // L: 12457
										var22.args = var9.onStatTransmit; // L: 12458
										Client.scriptEvents.addFirst(var22); // L: 12459
									}

									var9.field3974 = Client.field701; // L: 12475
								}

								if (Client.chatCycle > var9.field3971 && var9.onChatTransmit != null) { // L: 12477
									var22 = new ScriptEvent(); // L: 12478
									var22.widget = var9; // L: 12479
									var22.args = var9.onChatTransmit; // L: 12480
									Client.scriptEvents.addFirst(var22); // L: 12481
								}

								if (Client.field705 > var9.field3971 && var9.onFriendTransmit != null) { // L: 12483
									var22 = new ScriptEvent(); // L: 12484
									var22.widget = var9; // L: 12485
									var22.args = var9.onFriendTransmit; // L: 12486
									Client.scriptEvents.addFirst(var22); // L: 12487
								}

								if (Client.field803 > var9.field3971 && var9.onClanTransmit != null) { // L: 12489
									var22 = new ScriptEvent(); // L: 12490
									var22.widget = var9; // L: 12491
									var22.args = var9.onClanTransmit; // L: 12492
									Client.scriptEvents.addFirst(var22); // L: 12493
								}

								if (Client.field707 > var9.field3971 && var9.field3947 != null) { // L: 12495
									var22 = new ScriptEvent(); // L: 12496
									var22.widget = var9; // L: 12497
									var22.args = var9.field3947; // L: 12498
									Client.scriptEvents.addFirst(var22); // L: 12499
								}

								if (Client.field659 > var9.field3971 && var9.field3865 != null) { // L: 12501
									var22 = new ScriptEvent(); // L: 12502
									var22.widget = var9; // L: 12503
									var22.args = var9.field3865; // L: 12504
									Client.scriptEvents.addFirst(var22); // L: 12505
								}

								if (Client.field709 > var9.field3971 && var9.onStockTransmit != null) { // L: 12507
									var22 = new ScriptEvent(); // L: 12508
									var22.widget = var9; // L: 12509
									var22.args = var9.onStockTransmit; // L: 12510
									Client.scriptEvents.addFirst(var22); // L: 12511
								}

								if (Client.field727 > var9.field3971 && var9.field3954 != null) { // L: 12513
									var22 = new ScriptEvent(); // L: 12514
									var22.widget = var9; // L: 12515
									var22.args = var9.field3954; // L: 12516
									Client.scriptEvents.addFirst(var22); // L: 12517
								}

								if (Client.field711 > var9.field3971 && var9.onMiscTransmit != null) { // L: 12519
									var22 = new ScriptEvent(); // L: 12520
									var22.widget = var9; // L: 12521
									var22.args = var9.onMiscTransmit; // L: 12522
									Client.scriptEvents.addFirst(var22); // L: 12523
								}

								var9.field3971 = Client.cycleCntr; // L: 12525
								if (var9.onKey != null) { // L: 12526
									for (var39 = 0; var39 < Client.field741; ++var39) { // L: 12527
										ScriptEvent var32 = new ScriptEvent(); // L: 12528
										var32.widget = var9; // L: 12529
										var32.keyTyped = Client.field592[var39]; // L: 12530
										var32.keyPressed = Client.field742[var39]; // L: 12531
										var32.args = var9.onKey; // L: 12532
										Client.scriptEvents.addFirst(var32); // L: 12533
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3840 != null) { // L: 12536
									var38 = Client.field728.method4386(); // L: 12537

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 12538
										var31 = new ScriptEvent(); // L: 12539
										var31.widget = var9; // L: 12540
										var31.keyTyped = var38[var23]; // L: 12541
										var31.args = var9.field3840; // L: 12542
										Client.scriptEvents.addFirst(var31); // L: 12543
									}
								}

								if (var9.field3829 != null) { // L: 12546
									var38 = Client.field728.method4387(); // L: 12547

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 12548
										var31 = new ScriptEvent(); // L: 12549
										var31.widget = var9; // L: 12550
										var31.keyTyped = var38[var23]; // L: 12551
										var31.args = var9.field3829; // L: 12552
										Client.scriptEvents.addFirst(var31); // L: 12553
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 12558
							if (Client.clickedWidget != null || Client.isMenuOpen) { // L: 12559
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.field3858 != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12560
								if (var9.mouseOverRedirect >= 0) { // L: 12561
									class180.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class180.mousedOverWidgetIf1 = var9; // L: 12562
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 12564
								GrandExchangeOfferOwnWorldComparator.field466 = var9; // L: 12565
							}

							if (var9.scrollHeight > var9.height) { // L: 12567
								ModeWhere.method7428(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 12569
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 12570
							if (var9.children != null) { // L: 12571
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 12572
							if (var29 != null) { // L: 12573
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 12574
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 12575
										if (var30.field1083) { // L: 12576
											var30.remove(); // L: 12577
											var30.widget.field3969 = false; // L: 12578
										}
									}

									if (class494.widgetDragDuration == 0) { // L: 12581
										Client.clickedWidget = null; // L: 12582
										Client.clickedWidgetParent = null; // L: 12583
									}

									if (!Client.isMenuOpen) { // L: 12585
										SoundSystem.method869(); // L: 12586
									}
								}

								class60.method1180(var29.group, var12, var13, var14, var15, var26, var11); // L: 12589
							}
						}
					}
				}
			}
		}

	} // L: 12593
}
