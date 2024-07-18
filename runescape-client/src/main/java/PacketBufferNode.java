import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1616725987
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 1010826727
	)
	static int field3398;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1846608577
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -95056223
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-85425751"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 50
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 51
		}
	} // L: 52

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldu;Ldg;III)V",
		garbageValue = "-1950945045"
	)
	static void method6102(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args; // L: 122
		class130.Interpreter_intStackSize = 0; // L: 123
		class337.Interpreter_stringStackSize = 0; // L: 124
		int var5 = -1; // L: 125
		int[] var6 = var1.opcodes; // L: 126
		int[] var7 = var1.intOperands; // L: 127
		byte var8 = -1; // L: 128
		Interpreter.Interpreter_frameDepth = 0; // L: 129
		Interpreter.field863 = false; // L: 130
		boolean var9 = false; // L: 131
		int var10 = 0; // L: 132
		boolean var29 = false;

		label933: {
			label934: {
				try {
					int var13;
					try {
						var29 = true; // L: 134
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount]; // L: 135
						int var11 = 0; // L: 136
						class16.Interpreter_stringLocals = new String[var1.localStringCount]; // L: 137
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) { // L: 138
							if (var4[var13] instanceof Integer) { // L: 139
								var14 = (Integer)var4[var13]; // L: 140
								if (var14 == -2147483647) { // L: 141
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) { // L: 142
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) { // L: 143
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) { // L: 144
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) { // L: 145
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) { // L: 146
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) { // L: 147
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) { // L: 148
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) { // L: 149
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14; // L: 150
							} else if (var4[var13] instanceof String) { // L: 152
								var20 = (String)var4[var13]; // L: 153
								if (var20.equals("event_opbase")) { // L: 154
									var20 = var0.targetName;
								}

								class16.Interpreter_stringLocals[var12++] = var20; // L: 155
							}
						}

						Interpreter.field872 = var0.field1090; // L: 159

						while (true) {
							++var10; // L: 161
							if (var10 > var2) { // L: 162
								throw new RuntimeException();
							}

							++var5; // L: 163
							int var32 = var6[var5];
							if (var32 >= 100) { // L: 164
								boolean var34;
								if (var1.intOperands[var5] == 1) { // L: 382
									var34 = true;
								} else {
									var34 = false; // L: 383
								}

								var14 = StructComposition.method3871(var32, var1, var34); // L: 384
								switch(var14) { // L: 385
								case 0:
									var29 = false;
									break label933;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException(); // L: 388
								}
							} else if (var32 == 0) { // L: 165
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7[var5]; // L: 166
							} else if (var32 == 1) { // L: 169
								var13 = var7[var5]; // L: 170
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Varps.Varps_main[var13]; // L: 171
							} else if (var32 == 2) { // L: 174
								var13 = var7[var5]; // L: 175
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 176
								SecureRandomFuture.changeGameOptions(var13); // L: 177
							} else if (var32 == 3) { // L: 180
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var1.stringOperands[var5]; // L: 181
							} else if (var32 == 6) { // L: 184
								var5 += var7[var5]; // L: 185
							} else if (var32 == 7) { // L: 188
								class130.Interpreter_intStackSize -= 2; // L: 189
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) { // L: 190
									var5 += var7[var5];
								}
							} else if (var32 == 8) { // L: 193
								class130.Interpreter_intStackSize -= 2; // L: 194
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) { // L: 195
									var5 += var7[var5];
								}
							} else if (var32 == 9) { // L: 198
								class130.Interpreter_intStackSize -= 2; // L: 199
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) { // L: 200
									var5 += var7[var5];
								}
							} else if (var32 == 10) { // L: 203
								class130.Interpreter_intStackSize -= 2; // L: 204
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) { // L: 205
									var5 += var7[var5];
								}
							} else if (var32 == 21) { // L: 208
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth]; // L: 210
								var1 = var39.script; // L: 211
								var6 = var1.opcodes; // L: 212
								var7 = var1.intOperands; // L: 213
								var5 = var39.pc; // L: 214
								Interpreter.Interpreter_intLocals = var39.intLocals; // L: 215
								class16.Interpreter_stringLocals = var39.stringLocals; // L: 216
							} else if (var32 == 25) { // L: 219
								var13 = var7[var5]; // L: 220
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class162.getVarbit(var13); // L: 221
							} else if (var32 == 27) { // L: 224
								var13 = var7[var5]; // L: 225
								class225.method4304(var13, Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 226
							} else if (var32 == 31) { // L: 229
								class130.Interpreter_intStackSize -= 2; // L: 230
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) { // L: 231
									var5 += var7[var5];
								}
							} else if (var32 == 32) { // L: 234
								class130.Interpreter_intStackSize -= 2; // L: 235
								if (Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]) { // L: 236
									var5 += var7[var5];
								}
							} else if (var32 == 33) { // L: 239
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]]; // L: 240
							} else if (var32 == 34) { // L: 243
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 244
							} else if (var32 == 35) { // L: 247
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class16.Interpreter_stringLocals[var7[var5]]; // L: 248
							} else if (var32 == 36) { // L: 251
								class16.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 252
							} else if (var32 == 37) { // L: 255
								var13 = var7[var5]; // L: 256
								class337.Interpreter_stringStackSize -= var13; // L: 257
								var20 = class6.method41(Interpreter.Interpreter_stringStack, class337.Interpreter_stringStackSize, var13); // L: 258
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var20; // L: 259
							} else if (var32 == 38) { // L: 262
								--class130.Interpreter_intStackSize; // L: 263
							} else if (var32 == 39) { // L: 266
								--class337.Interpreter_stringStackSize; // L: 267
							} else {
								int var17;
								if (var32 != 40) { // L: 270
									if (var32 == 42) { // L: 293
										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Archive.varcs.getInt(var7[var5]); // L: 294
									} else if (var32 == 43) { // L: 297
										Archive.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 298
									} else if (var32 == 44) { // L: 301
										var13 = var7[var5] >> 16; // L: 302
										var14 = var7[var5] & 65535; // L: 303
										int var23 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 304
										if (var23 < 0 || var23 > 5000) { // L: 305
											throw new RuntimeException(); // L: 306
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23; // L: 308
										byte var24 = -1; // L: 309
										if (var14 == 105) { // L: 310
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) { // L: 311
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) { // L: 314
										var13 = var7[var5]; // L: 315
										var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 316
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 317
											throw new RuntimeException(); // L: 318
										}

										Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14]; // L: 320
									} else if (var32 == 46) { // L: 323
										var13 = var7[var5]; // L: 324
										class130.Interpreter_intStackSize -= 2; // L: 325
										var14 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 326
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) { // L: 327
											throw new RuntimeException(); // L: 328
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 330
									} else {
										String var21;
										if (var32 == 47) { // L: 333
											var21 = Archive.varcs.getStringOld(var7[var5]); // L: 334
											if (var21 == null) { // L: 335
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var21; // L: 336
										} else if (var32 == 48) { // L: 339
											Archive.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]); // L: 340
										} else if (var32 == 49) { // L: 343
											var21 = Archive.varcs.getString(var7[var5]); // L: 344
											Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var21; // L: 345
										} else if (var32 == 50) { // L: 348
											Archive.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]); // L: 349
										} else if (var32 == 60) { // L: 352
											IterableNodeHashTable var37 = var1.switches[var7[var5]]; // L: 353
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 354
											if (var36 != null) { // L: 355
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) { // L: 358
												var38 = class562.field5476.getTitleGroupValue(var7[var5]); // L: 359
												if (var38 == null) { // L: 360
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 361
												} else {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var38; // L: 364
												}
											} else {
												if (var32 != 76) { // L: 368
													throw new IllegalStateException(); // L: 378
												}

												var38 = class96.field1171.method8796(var7[var5]); // L: 369
												if (var38 == null) { // L: 370
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 371
												} else {
													Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var38; // L: 374
												}
											}
										}
									}
								} else {
									var13 = var7[var5]; // L: 271
									Script var35 = class195.getScript(var13); // L: 272
									int[] var15 = new int[var35.localIntCount]; // L: 273
									String[] var16 = new String[var35.localStringCount]; // L: 274

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) { // L: 275
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (class130.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) { // L: 276
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class337.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									class130.Interpreter_intStackSize -= var35.intArgumentCount; // L: 277
									class337.Interpreter_stringStackSize -= var35.stringArgumentCount; // L: 278
									ScriptFrame var22 = new ScriptFrame(); // L: 279
									var22.script = var1; // L: 280
									var22.pc = var5; // L: 281
									var22.intLocals = Interpreter.Interpreter_intLocals; // L: 282
									var22.stringLocals = class16.Interpreter_stringLocals; // L: 283
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22; // L: 284
									var1 = var35; // L: 285
									var6 = var35.opcodes; // L: 286
									var7 = var35.intOperands; // L: 287
									var5 = -1; // L: 288
									Interpreter.Interpreter_intLocals = var15; // L: 289
									class16.Interpreter_stringLocals = var16; // L: 290
								}
							}
						}
					} catch (Exception var30) { // L: 398
						var9 = true; // L: 399
						StringBuilder var26 = new StringBuilder(30); // L: 401
						var26.append("").append(var1.key).append(" "); // L: 402

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) { // L: 403
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8); // L: 404
						FriendsChatManager.RunException_sendStackTrace(var26.toString(), var30); // L: 405
						var29 = false;
						break label934;
					}
				} finally {
					if (var29) {
						while (Interpreter.field860.size() > 0) {
							class105 var19 = (class105)Interpreter.field860.remove(0); // L: 410
							class444.widgetDefaultMenuAction(var19.method2772(), var19.method2777(), var19.method2779(), var19.method2776(), "");
						}

						if (Interpreter.field863) { // L: 413
							Interpreter.field863 = false; // L: 414
							class109.method2818(); // L: 415
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							FriendsChatManager.RunException_sendStackTrace("Warning: Script " + var1.field1011 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field860.size() > 0) {
					class105 var40 = (class105)Interpreter.field860.remove(0);
					class444.widgetDefaultMenuAction(var40.method2772(), var40.method2777(), var40.method2779(), var40.method2776(), "");
				}

				if (Interpreter.field863) {
					Interpreter.field863 = false;
					class109.method2818();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					FriendsChatManager.RunException_sendStackTrace("Warning: Script " + var1.field1011 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return; // L: 209
			}

			while (Interpreter.field860.size() > 0) { // L: 409
				class105 var25 = (class105)Interpreter.field860.remove(0);
				class444.widgetDefaultMenuAction(var25.method2772(), var25.method2777(), var25.method2779(), var25.method2776(), "");
			}

			if (Interpreter.field863) {
				Interpreter.field863 = false;
				class109.method2818();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				FriendsChatManager.RunException_sendStackTrace("Warning: Script " + var1.field1011 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return; // L: 421
		}

		while (Interpreter.field860.size() > 0) {
			class105 var33 = (class105)Interpreter.field860.remove(0);
			class444.widgetDefaultMenuAction(var33.method2772(), var33.method2777(), var33.method2779(), var33.method2776(), ""); // L: 411
		}

		if (Interpreter.field863) {
			Interpreter.field863 = false;
			class109.method2818();
		}

		if (!var9 && var3 > 0 && var10 >= var3) { // L: 417
			FriendsChatManager.RunException_sendStackTrace("Warning: Script " + var1.field1011 + " finished at op count " + var10 + " of max " + var2, (Throwable)null); // L: 418
		}

	} // L: 391
}
