import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ax")
public class class14 {
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1413857097
	)
	final int field65;
	@ObfuscatedName("ad")
	final String field64;
	@ObfuscatedName("ag")
	final ThreadFactory field66;
	@ObfuscatedName("ak")
	final ThreadPoolExecutor field63;

	public class14(String var1, int var2, int var3) {
		this.field64 = var1; // L: 15
		this.field65 = var2; // L: 16
		this.field66 = new class16(this); // L: 17
		this.field63 = this.method164(var3); // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "2022111954"
	)
	final ThreadPoolExecutor method164(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field65), this.field66); // L: 22
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lae;I)Lao;",
		garbageValue = "-683865458"
	)
	public class18 method171(class10 var1) {
		if (this.field63.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field63.getCorePoolSize() + " Queue capacity " + this.field65); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field63.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1604195917"
	)
	public final void method166() {
		try {
			this.field63.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-2136859535"
	)
	static int method174(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1110
		Widget var4;
		if (var0 >= 2000) { // L: 1112
			var0 -= 1000; // L: 1113
			var4 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 1114
			var3 = false; // L: 1115
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1117
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1118
			var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] - 1; // L: 1119
			if (var11 >= 0 && var11 <= 9) { // L: 1120
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]); // L: 1124
				return 1; // L: 1125
			} else {
				--class337.Interpreter_stringStackSize; // L: 1121
				return 1; // L: 1122
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1127
				class130.Interpreter_intStackSize -= 2; // L: 1128
				var11 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 1129
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 1130
				var4.parent = ModeWhere.field4649.method6513(var11, var6); // L: 1131
				return 1; // L: 1132
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1134
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 1135
				return 1; // L: 1136
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1138
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1139
				return 1; // L: 1140
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1142
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1143
				return 1; // L: 1144
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1146
				var4.dataText = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1147
				return 1; // L: 1148
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1150
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1151
				return 1; // L: 1152
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1154
				var4.actions = null; // L: 1155
				return 1; // L: 1156
			} else if (var0 == 1308) { // L: 1158
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 1159
				return 1; // L: 1160
			} else if (var0 == 1309) { // L: 1162
				--class130.Interpreter_intStackSize; // L: 1163
				return 1; // L: 1164
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1166
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1196
						class130.Interpreter_intStackSize -= 2; // L: 1197
						var5 = 10; // L: 1198
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]}; // L: 1199
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]}; // L: 1200
						class263.Widget_setKey(var4, var5, var8, var9); // L: 1201
						return 1; // L: 1202
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1204
						class130.Interpreter_intStackSize -= 3; // L: 1205
						var11 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] - 1; // L: 1206
						var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 1207
						var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 1208
						if (var11 >= 0 && var11 <= 9) { // L: 1209
							class320.Widget_setKeyRate(var4, var11, var6, var7); // L: 1212
							return 1; // L: 1213
						} else {
							throw new RuntimeException(); // L: 1210
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1215
						var5 = 10; // L: 1216
						var6 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1217
						var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1218
						class320.Widget_setKeyRate(var4, var5, var6, var7); // L: 1219
						return 1; // L: 1220
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1222
						--class130.Interpreter_intStackSize; // L: 1223
						var11 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] - 1; // L: 1224
						if (var11 >= 0 && var11 <= 9) { // L: 1225
							GameEngine.Widget_setKeyIgnoreHeld(var4, var11); // L: 1228
							return 1; // L: 1229
						} else {
							throw new RuntimeException(); // L: 1226
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1231
						var5 = 10; // L: 1232
						GameEngine.Widget_setKeyIgnoreHeld(var4, var5); // L: 1233
						return 1; // L: 1234
					} else {
						return 2; // L: 1236
					}
				} else {
					byte[] var10 = null; // L: 1167
					var8 = null; // L: 1168
					if (var3) { // L: 1169
						class130.Interpreter_intStackSize -= 10; // L: 1170

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class130.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1172 1173
						}

						if (var7 > 0) { // L: 1175
							var10 = new byte[var7 / 2]; // L: 1176
							var8 = new byte[var7 / 2]; // L: 1177

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1178
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class130.Interpreter_intStackSize]; // L: 1179
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class130.Interpreter_intStackSize + 1]; // L: 1180
							}
						}
					} else {
						class130.Interpreter_intStackSize -= 2; // L: 1185
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]}; // L: 1186
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]}; // L: 1187
					}

					var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] - 1; // L: 1189
					if (var7 >= 0 && var7 <= 9) { // L: 1190
						class263.Widget_setKey(var4, var7, var10, var8); // L: 1193
						return 1; // L: 1194
					} else {
						throw new RuntimeException(); // L: 1191
					}
				}
			}
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(IIIILvg;Lnw;I)V",
		garbageValue = "296381346"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 13194
		if (var6 > 4225 && var6 < 90000) { // L: 13195
			int var7 = Client.camAngleY & 2047; // L: 13196
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 13197
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 13198
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 13199
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 13200
			double var12 = Math.atan2((double)var10, (double)var11); // L: 13201
			int var14 = var5.width / 2 - 25; // L: 13202
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 13203
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 13204
			byte var17 = 20; // L: 13205
			class74.redHintArrowSprite.method10026(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 13206
		} else {
			Archive.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 13208
		}

	} // L: 13209
}
