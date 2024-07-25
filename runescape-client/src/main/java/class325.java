import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@nn
@ObfuscatedName("mh")
public final class class325 {
	@ObfuscatedName("ag")
	static final HashMap field3549;

	static {
		field3549 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3549) { // L: 16
			TimeZone var2 = (TimeZone)field3549.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3549.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0); // L: 25
	} // L: 26

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[III)V",
		garbageValue = "1967563830"
	)
	static void method6121(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < class333.field3646; ++var3) { // L: 80
			KitDefinition var4 = PcmPlayer.KitDefinition_get(var3); // L: 81
			if (var4 != null && !var4.nonSelectable && var4.bodypartID == (var0 == 1 ? 7 : 0) + var2) { // L: 82
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256; // L: 83
				break;
			}
		}

	} // L: 87

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "969724405"
	)
	static final int method6120(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 998
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 999
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1088804478"
	)
	static boolean method6119() {
		return (Client.drawPlayerNames & 1) != 0; // L: 5447
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(ZLug;B)V",
		garbageValue = "1"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 6126
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 6127
			var1.method9700(); // L: 6131
			int var2 = var1.method9600(); // L: 6132
			var3 = var1.method9599(); // L: 6133
			var4 = var1.readUnsignedShort(); // L: 6134
			UserComparator10.field1509 = new int[var4][4]; // L: 6135

			for (var5 = 0; var5 < var4; ++var5) { // L: 6136
				for (var6 = 0; var6 < 4; ++var6) { // L: 6137
					UserComparator10.field1509[var5][var6] = var1.readInt(); // L: 6138
				}
			}

			class76.field915 = new int[var4]; // L: 6141
			UrlRequest.field1484 = new int[var4]; // L: 6142
			class131.field1538 = new int[var4]; // L: 6143
			class279.field2894 = new byte[var4][]; // L: 6144
			ModeWhere.field4638 = new byte[var4][]; // L: 6145
			var4 = 0; // L: 6146

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) { // L: 6147
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 6148
					var7 = var6 + (var5 << 8); // L: 6149
					class76.field915[var4] = var7; // L: 6150
					UrlRequest.field1484[var4] = class157.field1756.getGroupId("m" + var5 + "_" + var6); // L: 6151
					class131.field1538[var4] = class157.field1756.getGroupId("l" + var5 + "_" + var6); // L: 6152
					++var4; // L: 6153
				}
			}

			ScriptEvent.method2384(var2, var3, true); // L: 6156
		} else {
			boolean var15 = var1.method9592() == 1; // L: 6159
			var3 = var1.method9712(); // L: 6160
			var4 = var1.readUnsignedShort(); // L: 6161
			var5 = var1.readUnsignedShort(); // L: 6162
			var1.importIndex(); // L: 6163

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 6164
				for (var7 = 0; var7 < 13; ++var7) { // L: 6165
					for (var8 = 0; var8 < 13; ++var8) { // L: 6166
						var9 = var1.readBits(1); // L: 6167
						if (var9 == 1) {
							Client.field578[var6][var7][var8] = var1.readBits(26); // L: 6168
						} else {
							Client.field578[var6][var7][var8] = -1; // L: 6169
						}
					}
				}
			}

			var1.exportIndex(); // L: 6173
			UserComparator10.field1509 = new int[var5][4]; // L: 6174

			for (var6 = 0; var6 < var5; ++var6) { // L: 6175
				for (var7 = 0; var7 < 4; ++var7) { // L: 6176
					UserComparator10.field1509[var6][var7] = var1.readInt(); // L: 6177
				}
			}

			class76.field915 = new int[var5]; // L: 6180
			UrlRequest.field1484 = new int[var5]; // L: 6181
			class131.field1538 = new int[var5]; // L: 6182
			class279.field2894 = new byte[var5][]; // L: 6183
			ModeWhere.field4638 = new byte[var5][]; // L: 6184
			var5 = 0; // L: 6185

			for (var6 = 0; var6 < 4; ++var6) { // L: 6186
				for (var7 = 0; var7 < 13; ++var7) { // L: 6187
					for (var8 = 0; var8 < 13; ++var8) { // L: 6188
						var9 = Client.field578[var6][var7][var8]; // L: 6189
						if (var9 != -1) { // L: 6190
							int var10 = var9 >> 14 & 1023; // L: 6191
							int var11 = var9 >> 3 & 2047; // L: 6192
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 6193

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 6194
								if (class76.field915[var13] == var12) {
									var12 = -1; // L: 6195
									break; // L: 6196
								}
							}

							if (var12 != -1) { // L: 6198
								class76.field915[var5] = var12; // L: 6199
								var13 = var12 >> 8 & 255; // L: 6200
								int var14 = var12 & 255; // L: 6201
								UrlRequest.field1484[var5] = class157.field1756.getGroupId("m" + var13 + "_" + var14); // L: 6202
								class131.field1538[var5] = class157.field1756.getGroupId("l" + var13 + "_" + var14); // L: 6203
								++var5; // L: 6204
							}
						}
					}
				}
			}

			ScriptEvent.method2384(var4, var3, !var15); // L: 6210
		}

	} // L: 6212
}
