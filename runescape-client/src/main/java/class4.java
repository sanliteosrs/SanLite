import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public final class class4 {
	@ObfuscatedName("dm")
	static boolean field9;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2107420782"
	)
	static void method17(int var0) {
		class423.field4697 = var0; // L: 22
		class423.field4701 = new class423[var0]; // L: 23
		class423.field4698 = 0; // L: 24
	} // L: 25

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1016993723"
	)
	static boolean method15(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-961108480"
	)
	static final boolean method16(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 222
		Buffer var4 = new Buffer(var0); // L: 223
		int var5 = -1; // L: 224

		label69:
		while (true) {
			int var6 = var4.method9575(); // L: 226
			if (var6 == 0) { // L: 227
				return var3; // L: 258
			}

			var5 += var6; // L: 228
			int var7 = 0; // L: 229
			boolean var8 = false; // L: 230

			while (true) {
				int var9;
				while (!var8) { // L: 232
					var9 = var4.readUShortSmart(); // L: 238
					if (var9 == 0) { // L: 239
						continue label69;
					}

					var7 += var9 - 1; // L: 240
					int var10 = var7 & 63; // L: 241
					int var11 = var7 >> 6 & 63; // L: 242
					int var12 = var4.readUnsignedByte() >> 2; // L: 243
					int var13 = var11 + var1; // L: 244
					int var14 = var10 + var2; // L: 245
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 246
						ObjectComposition var15 = class10.getObjectDefinition(var5); // L: 247
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 248
							if (!var15.needsModelFiles()) { // L: 249
								++Client.field573; // L: 250
								var3 = false; // L: 251
							}

							var8 = true; // L: 253
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 233
				if (var9 == 0) { // L: 234
					break;
				}

				var4.readUnsignedByte(); // L: 235
			}
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lde;Lug;I)V",
		garbageValue = "1857324243"
	)
	static void method18(class101 var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 9296
		class476 var3 = var0.field1331[var2]; // L: 9297
		class101 var4 = var3.field4971; // L: 9298
		var4.field1321 = var1.readUnsignedShort(); // L: 9299
		var4.field1323 = var1.readUnsignedShort(); // L: 9300
		var4.field1319.method2820(var1, false); // L: 9301
		int var5 = var4.field1332 / 8; // L: 9302
		int var6 = var4.field1320 / 8; // L: 9303
		int var7 = var1.readUnsignedShort(); // L: 9304
		var1.importIndex(); // L: 9305

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) { // L: 9306
			for (var9 = 0; var9 < var5; ++var9) { // L: 9307
				for (var10 = 0; var10 < var6; ++var10) { // L: 9308
					var11 = var1.readBits(1); // L: 9309
					if (var11 == 1) { // L: 9310
						Client.field683[var8][var9][var10] = var1.readBits(26); // L: 9311
					} else {
						Client.field683[var8][var9][var10] = -1; // L: 9313
					}
				}
			}
		}

		var1.exportIndex(); // L: 9317
		ApproximateRouteStrategy.field460 = new int[var7][4]; // L: 9318

		for (var8 = 0; var8 < var7; ++var8) { // L: 9319
			for (var9 = 0; var9 < 4; ++var9) { // L: 9320
				ApproximateRouteStrategy.field460[var8][var9] = var1.readInt(); // L: 9321
			}
		}

		class284.field3014 = new int[var7]; // L: 9324
		class30.field147 = new int[var7]; // L: 9325
		class147.field1696 = new int[var7]; // L: 9326
		class492.field5041 = new byte[var7][]; // L: 9327
		class366.field4005 = new byte[var7][]; // L: 9328
		var7 = 0; // L: 9329

		for (var8 = 0; var8 < 4; ++var8) { // L: 9330
			for (var9 = 0; var9 < var5; ++var9) { // L: 9331
				for (var10 = 0; var10 < var6; ++var10) { // L: 9332
					var11 = Client.field683[var8][var9][var10]; // L: 9333
					if (var11 != -1) { // L: 9334
						int var12 = var11 >> 14 & 1023; // L: 9335
						int var13 = var11 >> 3 & 2047; // L: 9336
						int var14 = (var12 / 8 << 8) + var13 / 8; // L: 9337

						int var15;
						for (var15 = 0; var15 < var7; ++var15) { // L: 9338
							if (class284.field3014[var15] == var14) {
								var14 = -1; // L: 9339
								break; // L: 9340
							}
						}

						if (var14 != -1) { // L: 9342
							class284.field3014[var7] = var14; // L: 9343
							var15 = var14 >> 8 & 255; // L: 9344
							int var16 = var14 & 255; // L: 9345
							class30.field147[var7] = class157.field1756.getGroupId("m" + var15 + "_" + var16); // L: 9346
							class147.field1696[var7] = class157.field1756.getGroupId("l" + var15 + "_" + var16); // L: 9347
							++var7; // L: 9348
						}
					}
				}
			}
		}

		ClanChannelMember.method3282(25); // L: 9354
		Client.field510 = true; // L: 9355
		class170.field1839 = var4; // L: 9356
		class201.method3827(var4); // L: 9357
	} // L: 9358
}
