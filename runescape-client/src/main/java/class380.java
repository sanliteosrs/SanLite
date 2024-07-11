import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ox")
public enum class380 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4435(0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4436(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4437(2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4438(3);

	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2138893877
	)
	public final int field4439;

	class380(int var3) {
		this.field4439 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4439; // L: 20
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	public static void method7094() {
		synchronized(ArchiveDiskActionHandler.field4472) { // L: 120
			if (ArchiveDiskActionHandler.field4468 != 0) { // L: 121
				ArchiveDiskActionHandler.field4468 = 1; // L: 122
				ArchiveDiskActionHandler.field4470 = true; // L: 123

				try {
					ArchiveDiskActionHandler.field4472.wait(); // L: 125
				} catch (InterruptedException var3) { // L: 127
				}
			}

		}
	} // L: 130

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(BB)C",
		garbageValue = "1"
	)
	public static char method7096(byte var0) {
		int var1 = var0 & 255; // L: 84
		if (var1 == 0) { // L: 85
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 86
				char var2 = class413.cp1252AsciiExtension[var1 - 128]; // L: 87
				if (var2 == 0) { // L: 88
					var2 = '?';
				}

				var1 = var2; // L: 89
			}

			return (char)var1; // L: 91
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "2123126465"
	)
	static int method7097(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2932
			if (class135.friendSystem.field835 == 0) { // L: 2933
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -2;
			} else if (class135.friendSystem.field835 == 1) { // L: 2934
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class135.friendSystem.friendsList.getSize(); // L: 2935
			}

			return 1; // L: 2936
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2939
				if (class135.friendSystem.method1911() && var3 >= 0 && var3 < class135.friendSystem.friendsList.getSize()) { // L: 2940
					Friend var8 = (Friend)class135.friendSystem.friendsList.get(var3); // L: 2941
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2942
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2943
				} else {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2946
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2947
				}

				return 1; // L: 2949
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2952
				if (class135.friendSystem.method1911() && var3 >= 0 && var3 < class135.friendSystem.friendsList.getSize()) { // L: 2953
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((Buddy)class135.friendSystem.friendsList.get(var3)).world; // L: 2954
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2956
				}

				return 1; // L: 2957
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2960
				if (class135.friendSystem.method1911() && var3 >= 0 && var3 < class135.friendSystem.friendsList.getSize()) { // L: 2961
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((Buddy)class135.friendSystem.friendsList.get(var3)).rank; // L: 2962
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2964
				}

				return 1; // L: 2965
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 2968
					int var9 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2969
					class231.method4409(var5, var9); // L: 2970
					return 1; // L: 2971
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 2974
					class135.friendSystem.addFriend(var5); // L: 2975
					return 1; // L: 2976
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 2979
					class135.friendSystem.removeFriend(var5); // L: 2980
					return 1; // L: 2981
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 2984
					class135.friendSystem.addIgnore(var5); // L: 2985
					return 1; // L: 2986
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 2989
					boolean var6 = true; // L: 2990
					class135.friendSystem.method1917(var5, var6); // L: 2991
					return 1; // L: 2992
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 2995
					var5 = FontName.method9219(var5); // L: 2996
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class135.friendSystem.isFriended(new Username(var5, Projectile.loginType), false) ? 1 : 0; // L: 2997
					return 1; // L: 2998
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Decimator.friendsChatManager != null) { // L: 3001
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Decimator.friendsChatManager.name; // L: 3002
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 3004
					}

					return 1; // L: 3005
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Decimator.friendsChatManager != null) { // L: 3008
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Decimator.friendsChatManager.getSize(); // L: 3009
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3011
					}

					return 1; // L: 3012
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3015
					if (Decimator.friendsChatManager != null && var3 < Decimator.friendsChatManager.getSize()) { // L: 3016
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Decimator.friendsChatManager.get(var3).getUsername().getName(); // L: 3017
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 3019
					}

					return 1; // L: 3020
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3023
					if (Decimator.friendsChatManager != null && var3 < Decimator.friendsChatManager.getSize()) { // L: 3024
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((Buddy)Decimator.friendsChatManager.get(var3)).getWorld(); // L: 3025
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3027
					}

					return 1; // L: 3028
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3031
					if (Decimator.friendsChatManager != null && var3 < Decimator.friendsChatManager.getSize()) { // L: 3032
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = ((Buddy)Decimator.friendsChatManager.get(var3)).rank; // L: 3033
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3035
					}

					return 1; // L: 3036
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Decimator.friendsChatManager != null ? Decimator.friendsChatManager.minKick : 0; // L: 3039
					return 1; // L: 3040
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3043
					Messages.clanKickUser(var5); // L: 3044
					return 1; // L: 3045
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Decimator.friendsChatManager != null ? Decimator.friendsChatManager.rank : 0; // L: 3048
					return 1; // L: 3049
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3052
					class441.Clan_joinChat(var5); // L: 3053
					return 1; // L: 3054
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Messages.Clan_leaveChat(); // L: 3057
					return 1; // L: 3058
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class135.friendSystem.method1911()) { // L: 3061
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class135.friendSystem.ignoreList.getSize(); // L: 3062
					}

					return 1; // L: 3063
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3066
					if (class135.friendSystem.method1911() && var3 >= 0 && var3 < class135.friendSystem.ignoreList.getSize()) { // L: 3067
						Ignored var4 = (Ignored)class135.friendSystem.ignoreList.get(var3); // L: 3068
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.getName(); // L: 3069
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 3070
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 3073
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 3074
					}

					return 1; // L: 3076
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3079
					var5 = FontName.method9219(var5); // L: 3080
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class135.friendSystem.isIgnored(new Username(var5, Projectile.loginType)) ? 1 : 0; // L: 3081
					return 1; // L: 3082
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3085
					if (Decimator.friendsChatManager != null && var3 < Decimator.friendsChatManager.getSize() && Decimator.friendsChatManager.get(var3).getUsername().equals(SoundCache.localPlayer.username)) { // L: 3086
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 3087
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3089
					}

					return 1; // L: 3090
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Decimator.friendsChatManager != null && Decimator.friendsChatManager.owner != null) { // L: 3093
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Decimator.friendsChatManager.owner; // L: 3094
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 3096
					}

					return 1; // L: 3097
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3100
					if (Decimator.friendsChatManager != null && var3 < Decimator.friendsChatManager.getSize() && ((FriendsChatMember)Decimator.friendsChatManager.get(var3)).isFriend()) { // L: 3101
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 3102
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3104
					}

					return 1; // L: 3105
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class135.friendSystem.friendsList.removeComparator(); // L: 3116
						return 1; // L: 3117
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3120
							class135.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 3121
							return 1; // L: 3122
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3125
							class135.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 3126
							return 1; // L: 3127
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3130
							class135.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 3131
							return 1; // L: 3132
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3135
							class135.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 3136
							return 1; // L: 3137
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3140
							class135.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 3141
							return 1; // L: 3142
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3145
							class135.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 3146
							return 1; // L: 3147
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3150
							class135.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 3151
							return 1; // L: 3152
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3155
							class135.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 3156
							return 1; // L: 3157
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3160
							class135.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 3161
							return 1; // L: 3162
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3165
							class135.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 3166
							return 1; // L: 3167
						} else if (var0 == 3639) {
							class135.friendSystem.friendsList.sort(); // L: 3170
							return 1; // L: 3171
						} else if (var0 == 3640) {
							class135.friendSystem.ignoreList.removeComparator(); // L: 3174
							return 1; // L: 3175
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3178
							class135.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 3179
							return 1; // L: 3180
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3183
							class135.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 3184
							return 1; // L: 3185
						} else if (var0 == 3643) {
							class135.friendSystem.ignoreList.sort(); // L: 3188
							return 1; // L: 3189
						} else if (var0 == 3644) {
							if (Decimator.friendsChatManager != null) { // L: 3192
								Decimator.friendsChatManager.removeComparator(); // L: 3193
							}

							return 1; // L: 3195
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3198
							if (Decimator.friendsChatManager != null) { // L: 3199
								Decimator.friendsChatManager.addComparator(new UserComparator1(var7)); // L: 3200
							}

							return 1; // L: 3202
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3205
							if (Decimator.friendsChatManager != null) { // L: 3206
								Decimator.friendsChatManager.addComparator(new UserComparator2(var7)); // L: 3207
							}

							return 1; // L: 3209
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3212
							if (Decimator.friendsChatManager != null) { // L: 3213
								Decimator.friendsChatManager.addComparator(new UserComparator3(var7)); // L: 3214
							}

							return 1; // L: 3216
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3219
							if (Decimator.friendsChatManager != null) { // L: 3220
								Decimator.friendsChatManager.addComparator(new UserComparator4(var7)); // L: 3221
							}

							return 1; // L: 3223
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3226
							if (Decimator.friendsChatManager != null) { // L: 3227
								Decimator.friendsChatManager.addComparator(new UserComparator5(var7)); // L: 3228
							}

							return 1; // L: 3230
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3233
							if (Decimator.friendsChatManager != null) { // L: 3234
								Decimator.friendsChatManager.addComparator(new UserComparator6(var7)); // L: 3235
							}

							return 1; // L: 3237
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3240
							if (Decimator.friendsChatManager != null) { // L: 3241
								Decimator.friendsChatManager.addComparator(new UserComparator7(var7)); // L: 3242
							}

							return 1; // L: 3244
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3247
							if (Decimator.friendsChatManager != null) { // L: 3248
								Decimator.friendsChatManager.addComparator(new UserComparator8(var7)); // L: 3249
							}

							return 1; // L: 3251
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3254
							if (Decimator.friendsChatManager != null) { // L: 3255
								Decimator.friendsChatManager.addComparator(new UserComparator9(var7)); // L: 3256
							}

							return 1; // L: 3258
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3261
							if (Decimator.friendsChatManager != null) { // L: 3262
								Decimator.friendsChatManager.addComparator(new UserComparator10(var7)); // L: 3263
							}

							return 1; // L: 3265
						} else if (var0 == 3655) {
							if (Decimator.friendsChatManager != null) { // L: 3268
								Decimator.friendsChatManager.sort(); // L: 3269
							}

							return 1; // L: 3271
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3274
							class135.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 3275
							return 1; // L: 3276
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 3279
							if (Decimator.friendsChatManager != null) { // L: 3280
								Decimator.friendsChatManager.addComparator(new BuddyRankComparator(var7)); // L: 3281
							}

							return 1; // L: 3283
						} else {
							return 2; // L: 3285
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3108
					if (Decimator.friendsChatManager != null && var3 < Decimator.friendsChatManager.getSize() && ((FriendsChatMember)Decimator.friendsChatManager.get(var3)).isIgnored()) { // L: 3109
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 3110
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3112
					}

					return 1; // L: 3113
				}
			}
		}
	}
}
