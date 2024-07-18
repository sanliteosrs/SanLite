import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("aq")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ad")
	boolean field1083;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -776132997
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1323625187
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1437104327
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1018815261
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1997341365
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ai")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 487300869
	)
	int field1090;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1628898499
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "18"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "398551351"
	)
	public void method2378(Widget var1) {
		this.widget = var1; // L: 30
	} // L: 31

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lcw;I)V",
		garbageValue = "-1681573882"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2085
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2086
			boolean var1 = var0.isMembersOnly(); // L: 2087
			if (var1 != ItemComposition.ItemComposition_inMembersWorld) { // L: 2089
				ItemComposition.ItemComposition_cached.clear(); // L: 2091
				ItemComposition.ItemComposition_cachedModels.clear(); // L: 2092
				ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2093
				ItemComposition.ItemComposition_inMembersWorld = var1; // L: 2095
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 2099
			Archive var3 = class7.field29; // L: 2100
			int var2 = var0.properties; // L: 2101
			if ((var2 & class542.field5320.rsOrdinal()) != 0) { // L: 2103
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", ""); // L: 2104
			} else if ((var2 & class542.field5347.rsOrdinal()) != 0) { // L: 2106
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", ""); // L: 2107
			} else if ((var2 & class542.field5325.rsOrdinal()) != 0) { // L: 2109
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", ""); // L: 2110
			} else {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var3, "logo", ""); // L: 2113
			}
		}

		class20.worldHost = var0.host; // L: 2117
		Client.worldId = var0.id; // L: 2118
		Client.worldProperties = var0.properties; // L: 2119
		class401.field4618 = var0.field819; // L: 2120
		NPCComposition.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2121
		class33.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2122
		class169.currentPort = NPCComposition.worldPort; // L: 2123
	} // L: 2124

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "414622425"
	)
	static final void method2384(int var0, int var1, boolean var2) {
		if (!var2 || var0 != Skeleton.field2915 || class110.field1418 != var1) { // L: 6215
			Skeleton.field2915 = var0; // L: 6218
			class110.field1418 = var1; // L: 6219
			ClanChannelMember.method3282(25); // L: 6220
			Client.isLoading = true; // L: 6221
			class59.drawLoadingMessage("Loading - please wait.", true); // L: 6222
			int var3 = class511.field5137.field1321; // L: 6223
			int var4 = class511.field5137.field1323; // L: 6224
			class511.field5137.field1321 = (var0 - 6) * 8; // L: 6225
			class511.field5137.field1323 = (var1 - 6) * 8; // L: 6226
			int var5 = class511.field5137.field1321 - var3; // L: 6227
			int var6 = class511.field5137.field1323 - var4; // L: 6228
			var3 = class511.field5137.field1321; // L: 6229
			var4 = class511.field5137.field1323; // L: 6230

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 6231
				class103 var19 = class511.field5137.field1315[var7]; // L: 6232
				if (var19 != null) { // L: 6233
					for (var9 = 0; var9 < 10; ++var9) { // L: 6234
						var10000 = var19.field1204; // L: 6235
						var10000[var9] -= var5;
						var10000 = var19.field1246; // L: 6236
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 6238
					var19.field1191 -= var6 * 128; // L: 6239
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 6242
				Player var22 = class511.field5137.field1326[var7]; // L: 6243
				if (var22 != null) { // L: 6244
					for (var9 = 0; var9 < 10; ++var9) { // L: 6245
						var10000 = var22.field1204; // L: 6246
						var10000[var9] -= var5;
						var10000 = var22.field1246; // L: 6247
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 6249
					var22.field1191 -= var6 * 128; // L: 6250
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 6253
				class476 var23 = class511.field5137.field1331[var7]; // L: 6254
				if (var23 != null) { // L: 6255
					for (var9 = 0; var9 < 10; ++var9) { // L: 6256
						var10000 = var23.field4974; // L: 6257
						var10000[var9] -= var5;
						var10000 = var23.field4965; // L: 6258
						var10000[var9] -= var6;
					}

					var23.field4967 -= var5 * 128; // L: 6260
					var23.field4969 -= var6 * 128; // L: 6261
				}
			}

			byte var20 = 0; // L: 6264
			byte var8 = 104; // L: 6265
			byte var21 = 1; // L: 6266
			if (var5 < 0) { // L: 6267
				var20 = 103; // L: 6268
				var8 = -1; // L: 6269
				var21 = -1; // L: 6270
			}

			byte var10 = 0; // L: 6272
			byte var11 = 104; // L: 6273
			byte var12 = 1; // L: 6274
			if (var6 < 0) { // L: 6275
				var10 = 103; // L: 6276
				var11 = -1; // L: 6277
				var12 = -1; // L: 6278
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 6280
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 6281
					int var15 = var13 + var5; // L: 6282
					int var16 = var6 + var14; // L: 6283

					for (int var17 = 0; var17 < 4; ++var17) { // L: 6284
						if (0 <= var15 && var15 < 104 && 0 <= var16 && var16 < 104) { // L: 6285
							class511.field5137.field1334[var17][var13][var14] = class511.field5137.field1334[var17][var15][var16];
						} else {
							class511.field5137.field1334[var17][var13][var14] = null; // L: 6286
						}
					}
				}
			}

			for (class96 var18 = (class96)class511.field5137.field1335.last(); var18 != null; var18 = (class96)class511.field5137.field1335.previous()) { // L: 6290 6291 6295
				var18.field1178 -= var5; // L: 6292
				var18.field1177 -= var6; // L: 6293
				if (var18.field1178 < 0 || 104 <= var18.field1178 || var18.field1177 < 0 || 104 <= var18.field1177) { // L: 6294
					var18.remove();
				}
			}

			if (Client.field752 != 0) { // L: 6297
				Client.field752 -= var5; // L: 6298
				Client.field753 -= var6; // L: 6299
			}

			Client.soundEffectCount = 0; // L: 6301
			Client.isCameraLocked = false; // L: 6302
			class47.cameraX -= var5 << 7; // L: 6303
			class60.cameraZ -= var6 << 7; // L: 6304
			class371.field4064 -= var5 << 7; // L: 6305
			PacketBufferNode.field3398 -= var6 << 7; // L: 6306
			Client.field632 = -1; // L: 6307
			class511.field5137.field1337.clear(); // L: 6308
			class511.field5137.field1324.clear(); // L: 6309

			for (var14 = 0; var14 < 4; ++var14) { // L: 6310
				class511.field5137.field1317[var14].clear();
			}

		}
	} // L: 6216 6311
}
