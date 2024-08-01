import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gh")
public class class168 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "692637456"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 62
		if (var0 < 0 || var0 >= 65536) { // L: 63
			var0 >>>= 16; // L: 64
			var1 += 16; // L: 65
		}

		if (var0 >= 256) { // L: 67
			var0 >>>= 8; // L: 68
			var1 += 8; // L: 69
		}

		if (var0 >= 16) { // L: 71
			var0 >>>= 4; // L: 72
			var1 += 4; // L: 73
		}

		if (var0 >= 4) { // L: 75
			var0 >>>= 2; // L: 76
			var1 += 2; // L: 77
		}

		if (var0 >= 1) { // L: 79
			var0 >>>= 1; // L: 80
			++var1; // L: 81
		}

		return var0 + var1; // L: 83
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "677617915"
	)
	static int method3511(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3293
			if (class142.guestClanSettings != null) { // L: 3294
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 3295
				class562.field5476 = class142.guestClanSettings; // L: 3296
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3298
			}

			return 1; // L: 3299
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3301
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3302
				if (Client.currentClanSettings[var3] != null) { // L: 3303
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 3304
					class562.field5476 = Client.currentClanSettings[var3]; // L: 3305
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3307
				}

				return 1; // L: 3308
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3310
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class562.field5476.name; // L: 3311
				return 1; // L: 3312
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3314
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.allowGuests ? 1 : 0; // L: 3315
				return 1; // L: 3316
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3318
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1766; // L: 3319
				return 1; // L: 3320
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3322
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1767; // L: 3323
				return 1; // L: 3324
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3326
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1768; // L: 3327
				return 1; // L: 3328
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3330
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1769; // L: 3331
				return 1; // L: 3332
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3334
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.memberCount; // L: 3335
				return 1; // L: 3336
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3338
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3339
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class562.field5476.memberNames[var3]; // L: 3340
				return 1; // L: 3341
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3343
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3344
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.memberRanks[var3]; // L: 3345
				return 1; // L: 3346
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3348
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.bannedMemberCount; // L: 3349
				return 1; // L: 3350
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3352
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3353
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class562.field5476.bannedMemberNames[var3]; // L: 3354
				return 1; // L: 3355
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3357
					class130.Interpreter_intStackSize -= 3; // L: 3358
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3359
					var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3360
					var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 3361
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.method3352(var3, var6, var5); // L: 3362
					return 1; // L: 3363
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3365
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.currentOwner; // L: 3366
					return 1; // L: 3367
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3369
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1784; // L: 3370
					return 1; // L: 3371
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3373
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.method3409(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]); // L: 3374
					return 1; // L: 3375
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3377
					Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = class562.field5476.getSortedMembers()[Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]]; // L: 3378
					return 1; // L: 3379
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3381
					class130.Interpreter_intStackSize -= 2; // L: 3382
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3383
					var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3384
					class290.method5746(var6, var3); // L: 3385
					return 1; // L: 3386
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3388
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3389
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1774[var3]; // L: 3390
					return 1; // L: 3391
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3393
						class130.Interpreter_intStackSize -= 3; // L: 3394
						var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3395
						boolean var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1; // L: 3396
						var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 3397
						UrlRequest.method2985(var5, var3, var4); // L: 3398
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3400
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3401
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class562.field5476.field1776[var3] ? 1 : 0; // L: 3402
						return 1; // L: 3403
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3405
						if (class276.guestClanChannel != null) { // L: 3406
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 3407
							HorizontalAlignment.field1973 = class276.guestClanChannel; // L: 3408
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3410
						}

						return 1; // L: 3411
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3413
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3414
						if (Client.currentClanChannels[var3] != null) { // L: 3415
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 3416
							HorizontalAlignment.field1973 = Client.currentClanChannels[var3]; // L: 3417
							class534.field5285 = var3; // L: 3418
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3420
						}

						return 1; // L: 3421
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3423
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = HorizontalAlignment.field1973.name; // L: 3424
						return 1; // L: 3425
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3427
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.field1817; // L: 3428
						return 1; // L: 3429
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3431
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.field1823; // L: 3432
						return 1; // L: 3433
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3435
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.method3501(); // L: 3436
						return 1; // L: 3437
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3439
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3440
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ((ClanChannelMember)HorizontalAlignment.field1973.members.get(var3)).username.getName(); // L: 3441
						return 1; // L: 3442
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3444
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3445
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((ClanChannelMember)HorizontalAlignment.field1973.members.get(var3)).rank; // L: 3446
						return 1; // L: 3447
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3449
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3450
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((ClanChannelMember)HorizontalAlignment.field1973.members.get(var3)).world; // L: 3451
						return 1; // L: 3452
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3454
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3455
						class108.method2811(class534.field5285, var3); // L: 3456
						return 1; // L: 3457
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3459
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.method3484(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]); // L: 3460
						return 1; // L: 3461
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3463
						Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = HorizontalAlignment.field1973.getSortedMembers()[Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]]; // L: 3464
						return 1; // L: 3465
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3467
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class96.field1171 != null ? 1 : 0; // L: 3468
						return 1; // L: 3469
					} else {
						return 2; // L: 3471
					}
				}
			}
		}
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "27920"
	)
	static void method3509(boolean var0) {
		Client.field780 = var0; // L: 13539
	} // L: 13540
}
