import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ot")
public class class371 {
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -45085545
	)
	static int field4064;

	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1026072818"
	)
	static int method7066(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1917
			var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1918
			VarbitComposition.addGameMessage(0, "", var7); // L: 1919
			return 1; // L: 1920
		} else if (var0 == ScriptOpcodes.ANIM) {
			class130.Interpreter_intStackSize -= 2; // L: 1923
			Canvas.method324(SoundCache.localPlayer, Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 1924
			return 1; // L: 1925
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field870) { // L: 1928
				Interpreter.field863 = true; // L: 1929
			}

			return 1; // L: 1931
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1934
				var15 = 0; // L: 1935
				if (HealthBarUpdate.isNumber(var7)) { // L: 1936
					var15 = GrandExchangeEvent.method7351(var7);
				}

				PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.field3287, Client.packetWriter.isaacCipher); // L: 1938
				var13.packetBuffer.writeInt(var15); // L: 1939
				Client.packetWriter.addNode(var13); // L: 1940
				return 1; // L: 1941
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1944
					var11 = class170.getPacketBufferNode(ClientPacket.field3309, Client.packetWriter.isaacCipher); // L: 1946
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1947
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1948
					Client.packetWriter.addNode(var11); // L: 1949
					return 1; // L: 1950
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1953
					var11 = class170.getPacketBufferNode(ClientPacket.field3281, Client.packetWriter.isaacCipher); // L: 1955
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1956
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1957
					Client.packetWriter.addNode(var11); // L: 1958
					return 1; // L: 1959
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1962
						var4 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1963
						class47.method903(var3, var4); // L: 1964
						return 1; // L: 1965
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class130.Interpreter_intStackSize -= 3; // L: 1968
						var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 1969
						var15 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 1970
						int var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 1971
						Widget var14 = ModeWhere.field4649.method6519(var9); // L: 1972
						MouseHandler.clickWidget(var14, var3, var15); // L: 1973
						return 1; // L: 1974
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class130.Interpreter_intStackSize -= 2; // L: 1977
						var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 1978
						var15 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 1979
						Widget var12 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1980
						MouseHandler.clickWidget(var12, var3, var15); // L: 1981
						return 1; // L: 1982
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						World.mouseCam = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 1985
						return 1; // L: 1986
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class105.clientPreferences.method2664() ? 1 : 0; // L: 1989
						return 1; // L: 1990
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class105.clientPreferences.method2572(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1); // L: 1993
						return 1; // L: 1994
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1997
						boolean var8 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 1998
						class421.openURL(var7, var8, false); // L: 1999
						return 1; // L: 2000
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2003
						var11 = class170.getPacketBufferNode(ClientPacket.field3337, Client.packetWriter.isaacCipher); // L: 2005
						var11.packetBuffer.writeShort(var3); // L: 2006
						Client.packetWriter.addNode(var11); // L: 2007
						return 1; // L: 2008
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2011
						class337.Interpreter_stringStackSize -= 2; // L: 2012
						var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 2013
						String var5 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1]; // L: 2014
						if (var4.length() > 500) { // L: 2015
							return 1;
						} else if (var5.length() > 500) { // L: 2016
							return 1;
						} else {
							PacketBufferNode var6 = class170.getPacketBufferNode(ClientPacket.field3327, Client.packetWriter.isaacCipher); // L: 2017
							var6.packetBuffer.writeShort(1 + Actor.stringCp1252NullTerminatedByteSize(var4) + Actor.stringCp1252NullTerminatedByteSize(var5)); // L: 2018
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 2019
							var6.packetBuffer.writeByte(var3); // L: 2020
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 2021
							Client.packetWriter.addNode(var6); // L: 2022
							return 1; // L: 2023
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class130.Interpreter_intStackSize; // L: 2026
						return 1; // L: 2027
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 2030
						return 1; // L: 2031
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field551 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 2034
						return 1; // L: 2035
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) { // L: 2038
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2039
						}

						return 1; // L: 2040
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) { // L: 2043
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2044
						}

						return 1; // L: 2045
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) { // L: 2048
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2049
						}

						return 1; // L: 2050
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) { // L: 2053
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2054
						}

						return 1; // L: 2055
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2058
						return 1; // L: 2059
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 2062
						return 1; // L: 2063
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 2066
						return 1; // L: 2067
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						setTapToDrop(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1); // L: 2070
						return 1; // L: 2071
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class20.getTapToDrop() ? 1 : 0; // L: 2074
						return 1; // L: 2075
					} else if (var0 == 3129) {
						class130.Interpreter_intStackSize -= 2; // L: 2078
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2079
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2080
						return 1; // L: 2081
					} else if (var0 == 3130) {
						class130.Interpreter_intStackSize -= 2; // L: 2084
						return 1; // L: 2085
					} else if (var0 == 3131) {
						--class130.Interpreter_intStackSize; // L: 2088
						return 1; // L: 2089
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class74.canvasWidth; // L: 2092
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class1.canvasHeight; // L: 2093
						return 1; // L: 2094
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class130.Interpreter_intStackSize; // L: 2097
						return 1; // L: 2098
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2101
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class130.Interpreter_intStackSize -= 2; // L: 2104
						return 1; // L: 2105
					} else if (var0 == 3136) {
						Client.field673 = 3; // L: 2108
						Client.field504 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2109
						return 1; // L: 2110
					} else if (var0 == 3137) {
						Client.field673 = 2; // L: 2113
						Client.field504 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2114
						return 1; // L: 2115
					} else if (var0 == 3138) {
						Client.field673 = 0; // L: 2118
						return 1; // L: 2119
					} else if (var0 == 3139) {
						Client.field673 = 1; // L: 2122
						return 1; // L: 2123
					} else if (var0 == 3140) {
						Client.field673 = 3; // L: 2126
						Client.field504 = var2 ? Interpreter.scriptDotWidget.id : class30.field142.id; // L: 2127
						return 1; // L: 2128
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 2131
							class105.clientPreferences.method2630(var10); // L: 2132
							return 1; // L: 2133
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class105.clientPreferences.method2672() ? 1 : 0; // L: 2136
							return 1; // L: 2137
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 2140
							Client.Login_isUsernameRemembered = var10; // L: 2141
							if (!var10) { // L: 2142
								class105.clientPreferences.method2591(""); // L: 2143
							}

							return 1; // L: 2145
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2148
							return 1; // L: 2149
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2152
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 2155
							class105.clientPreferences.method2576(!var10); // L: 2156
							return 1; // L: 2157
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class105.clientPreferences.method2602() ? 0 : 1; // L: 2160
							return 1; // L: 2161
						} else if (var0 == 3148) {
							return 1; // L: 2164
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2167
							return 1; // L: 2168
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2171
							return 1; // L: 2172
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2175
							return 1; // L: 2176
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2179
							return 1; // L: 2180
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2183
							return 1; // L: 2184
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class487.method8812(); // L: 2187
							return 1; // L: 2188
						} else if (var0 == 3155) {
							--class337.Interpreter_stringStackSize; // L: 2191
							return 1; // L: 2192
						} else if (var0 == 3156) {
							return 1; // L: 2195
						} else if (var0 == 3157) {
							class130.Interpreter_intStackSize -= 2; // L: 2198
							return 1; // L: 2199
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2202
							return 1; // L: 2203
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2206
							return 1; // L: 2207
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2210
							return 1; // L: 2211
						} else if (var0 == 3161) {
							--class130.Interpreter_intStackSize; // L: 2214
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2215
							return 1; // L: 2216
						} else if (var0 == 3162) {
							--class130.Interpreter_intStackSize; // L: 2219
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2220
							return 1; // L: 2221
						} else if (var0 == 3163) {
							--class337.Interpreter_stringStackSize; // L: 2224
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2225
							return 1; // L: 2226
						} else if (var0 == 3164) {
							--class130.Interpreter_intStackSize; // L: 2229
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2230
							return 1; // L: 2231
						} else if (var0 == 3165) {
							--class130.Interpreter_intStackSize; // L: 2234
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2235
							return 1; // L: 2236
						} else if (var0 == 3166) {
							class130.Interpreter_intStackSize -= 2; // L: 2239
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2240
							return 1; // L: 2241
						} else if (var0 == 3167) {
							class130.Interpreter_intStackSize -= 2; // L: 2244
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2245
							return 1; // L: 2246
						} else if (var0 == 3168) {
							class130.Interpreter_intStackSize -= 2; // L: 2249
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2250
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2251
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2252
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2253
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2254
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2255
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2256
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2257
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 2258
							return 1; // L: 2259
						} else if (var0 == 3169) {
							return 1; // L: 2262
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2265
							return 1; // L: 2266
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2269
							return 1; // L: 2270
						} else if (var0 == 3172) {
							--class130.Interpreter_intStackSize; // L: 2273
							return 1; // L: 2274
						} else if (var0 == 3173) {
							--class130.Interpreter_intStackSize; // L: 2277
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2278
							return 1; // L: 2279
						} else if (var0 == 3174) {
							--class130.Interpreter_intStackSize; // L: 2282
							return 1; // L: 2283
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2286
							return 1; // L: 2287
						} else if (var0 == 3176) {
							return 1; // L: 2290
						} else if (var0 == 3177) {
							return 1; // L: 2293
						} else if (var0 == 3178) {
							--class337.Interpreter_stringStackSize; // L: 2296
							return 1; // L: 2297
						} else if (var0 == 3179) {
							return 1; // L: 2300
						} else if (var0 == 3180) {
							--class337.Interpreter_stringStackSize; // L: 2303
							return 1; // L: 2304
						} else if (var0 == 3181) {
							class166.method3476(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 2307
							return 1; // L: 2308
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = WorldMapArea.method4653(); // L: 2311
							return 1; // L: 2312
						} else if (var0 == 3185) {
							var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2315
							class105.clientPreferences.method2601(var3); // L: 2316
							return 1; // L: 2317
						} else if (var0 == 3186) {
							var3 = class105.clientPreferences.method2569(); // L: 2320
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3; // L: 2321
							return 1; // L: 2322
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2325
							class180.method3579(var3); // L: 2326
							return 1; // L: 2327
						} else {
							return 2; // L: 2329
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1628317125"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 12071
	} // L: 12072
}
