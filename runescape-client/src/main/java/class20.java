import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("as")
public class class20 {
	@ObfuscatedName("gk")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1291198787
	)
	static int field94;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	static class101 field91;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1477351693
	)
	final int field88;
	@ObfuscatedName("ad")
	final Map field89;
	@ObfuscatedName("ag")
	final String field90;

	class20(String var1) {
		this.field88 = 400; // L: 35
		this.field89 = null; // L: 36
		this.field90 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field88 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage();
		this.field89 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field88 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field90 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2133369689"
	)
	public int method288() {
		return this.field88; // L: 41
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1535146674"
	)
	public Map method296() {
		return this.field89; // L: 45
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1290963156"
	)
	public String method287() {
		return this.field90; // L: 49
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmd;",
		garbageValue = "2"
	)
	public static class320[] method289() {
		return new class320[]{class320.field3378, class320.field3379, class320.field3380, class320.field3386, class320.field3382, class320.field3384, class320.field3381, class320.field3385, class320.field3383, class320.field3387, class320.field3388}; // L: 18
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "751839570"
	)
	public static void method300(int var0) {
		if (!class330.field3584.isEmpty()) { // L: 122
			Iterator var1 = class330.field3584.iterator(); // L: 123

			while (var1.hasNext()) {
				class342 var2 = (class342)var1.next(); // L: 124
				if (var2 != null) { // L: 126
					var2.field3706 = var0; // L: 129
				}
			}

			class342 var3 = (class342)class330.field3584.get(0); // L: 132
			if (var3 != null && var3.field3713 != null && var3.field3713.isReady() && !var3.field3715) { // L: 133
				var3.field3713.setPcmStreamVolume(var0); // L: 134
				var3.field3704 = (float)var0; // L: 135
			}
		}

	} // L: 138

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "1"
	)
	static int method298(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3878
			var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3879
			var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3880
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3881
			return 1; // L: 3882
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3884
				class337.Interpreter_stringStackSize -= 2; // L: 3885
				var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 3886
				var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1]; // L: 3887
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3888
				return 1; // L: 3889
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3891
				var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3892
				var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3893
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3 + class201.intToString(var10, true); // L: 3894
				return 1; // L: 3895
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3897
				var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3898
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3899
				return 1; // L: 3900
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3902
					var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3903
					long var14 = (11745L + (long)var11) * 86400000L; // L: 3904
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3905
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3906
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3907
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3908
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3909
					return 1; // L: 3910
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3912
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3924
						var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3925
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3926
						return 1; // L: 3927
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3929
						class337.Interpreter_stringStackSize -= 2; // L: 3930
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class216.method4190(class33.compareStrings(Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1], BuddyRankComparator.clientLanguage)); // L: 3931
						return 1; // L: 3932
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3934
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3935
							class130.Interpreter_intStackSize -= 2; // L: 3936
							var10 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3937
							var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3938
							var12 = ChatChannel.archive13.takeFile(var9, 0); // L: 3939
							var13 = new Font(var12); // L: 3940
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3941
							return 1; // L: 3942
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3944
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3945
							class130.Interpreter_intStackSize -= 2; // L: 3946
							var10 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3947
							var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3948
							var12 = ChatChannel.archive13.takeFile(var9, 0); // L: 3949
							var13 = new Font(var12); // L: 3950
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3951
							return 1; // L: 3952
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3954
							class337.Interpreter_stringStackSize -= 2; // L: 3955
							var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 3956
							var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1]; // L: 3957
							if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) { // L: 3958
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4; // L: 3959
							}

							return 1; // L: 3960
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3962
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3963
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3964
							return 1; // L: 3965
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3967
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3968
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3969
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3970
							return 1; // L: 3971
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3973
							var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3974
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = TextureProvider.isCharPrintable((char)var11) ? 1 : 0; // L: 3975
							return 1; // L: 3976
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3978
							var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3979
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = VarpDefinition.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3980
							return 1; // L: 3981
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3983
							var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3984
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class333.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3985
							return 1; // L: 3986
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3988
							var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3989
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = WorldMapID.isDigit((char)var11) ? 1 : 0; // L: 3990
							return 1; // L: 3991
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3993
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3994
							if (var3 != null) { // L: 3995
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3996
							}

							return 1; // L: 3997
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3999
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4000
							class130.Interpreter_intStackSize -= 2; // L: 4001
							var10 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4002
							var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4003
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 4004
							return 1; // L: 4005
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 4007
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4008
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 4009
							boolean var18 = false; // L: 4010

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 4011
								char var7 = var3.charAt(var6); // L: 4012
								if (var7 == '<') { // L: 4013
									var18 = true;
								} else if (var7 == '>') { // L: 4014
									var18 = false;
								} else if (!var18) { // L: 4015
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var16.toString(); // L: 4017
							return 1; // L: 4018
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 4020
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4021
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4022
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 4023
							return 1; // L: 4024
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 4026
							class337.Interpreter_stringStackSize -= 2; // L: 4027
							var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 4028
							var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1]; // L: 4029
							var9 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4030
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 4031
							return 1; // L: 4032
						} else if (var0 == 4122) { // L: 4034
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4035
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 4036
							return 1; // L: 4037
						} else if (var0 == 4123) { // L: 4039
							class337.Interpreter_stringStackSize -= 3; // L: 4040
							var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 4041
							var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1]; // L: 4042
							String var5 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 2]; // L: 4043
							if (SoundCache.localPlayer.appearance == null) { // L: 4044
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5; // L: 4045
								return 1; // L: 4046
							} else {
								switch(SoundCache.localPlayer.appearance.field3783) { // L: 4048
								case 0:
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3; // L: 4053
									break; // L: 4054
								case 1:
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4; // L: 4050
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5; // L: 4057
								}

								return 1; // L: 4060
							}
						} else if (var0 == 4124) { // L: 4062
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = SoundCache.localPlayer.appearance != null ? SoundCache.localPlayer.appearance.field3783 : -1; // L: 4063
							return 1; // L: 4064
						} else {
							return 2; // L: 4066
						}
					}
				} else {
					class337.Interpreter_stringStackSize -= 2; // L: 3913
					var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 3914
					var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1]; // L: 3915
					if (SoundCache.localPlayer.appearance != null && SoundCache.localPlayer.appearance.field3775 != 0) { // L: 3916
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4; // L: 3920
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3; // L: 3917
					}

					return 1; // L: 3922
				}
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1894674942"
	)
	static int method297(int var0, Script var1, boolean var2) {
		return 2; // L: 5152
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "874155014"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 12075
	}
}
