import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public final class class304 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1185086541
	)
	int field3234;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 571921967
	)
	int field3243;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 632661417
	)
	int field3238;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 340723817
	)
	int field3236;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	public Renderable field3237;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2112751427
	)
	int field3239;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1877979663
	)
	int field3240;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -567760481
	)
	int field3241;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -763115457
	)
	int field3233;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1461270687
	)
	int field3242;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1339418813
	)
	int field3235;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 437260815
	)
	int field3244;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -1569410276734308073L
	)
	public long field3245;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1042137613
	)
	int field3246;

	class304() {
		this.field3245 = 0L; // L: 16
		this.field3246 = 0; // L: 17
	} // L: 19

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1956684786"
	)
	public static void method6032() {
		class539.DBRowType_cache.clear(); // L: 86
	} // L: 87

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILnl;ZI)V",
		garbageValue = "615784753"
	)
	static void method6031(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class16.getWorldMap().getMapArea(var0); // L: 5376
		int var4 = SoundCache.localPlayer.plane; // L: 5377
		int var5 = (SoundCache.localPlayer.x >> 7) + class511.field5137.field1321; // L: 5378
		int var6 = (SoundCache.localPlayer.field1191 >> 7) + class511.field5137.field1323; // L: 5379
		Coord var7 = new Coord(var4, var5, var6); // L: 5380
		class16.getWorldMap().method9017(var3, var7, var1, var2); // L: 5381
	} // L: 5382

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lde;Lug;B)V",
		garbageValue = "-76"
	)
	static void method6030(class101 var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9252
		if (var2 < var0.field1322) { // L: 9253
			throw new RuntimeException("dang");
		} else if (var2 > var0.field1322) { // L: 9254
			throw new RuntimeException("dang!");
		} else {
			var0.field1322 = 0; // L: 9255

			int var3;
			int var4;
			for (var3 = 0; var3 < var2; ++var3) { // L: 9256
				var4 = var0.field1333[var3]; // L: 9257
				class476 var12 = var0.field1331[var4]; // L: 9258
				boolean var6 = var1.readUnsignedByte() == 1; // L: 9259
				if (!var6) { // L: 9260
					var0.field1331[var4] = null; // L: 9261
				} else {
					var0.field1333[++var0.field1322 - 1] = var4; // L: 9264
					byte var7 = var1.readByte(); // L: 9265
					byte var13 = var1.readByte(); // L: 9266
					var12.field4964 = var1.readUnsignedShort(); // L: 9267
					class238 var14 = class213.method4167((byte)var1.readUnsignedByte()); // L: 9268
					class234 var15 = class150.method3284(var12.field4964, var12.field4970); // L: 9269
					int var11 = Math.min(var15.method4447(), 128); // L: 9270
					var12.field4963 = var11 / Client.field732; // L: 9271
					var12.field4968 = var11 % Client.field732; // L: 9272
					if (var7 != 0 || var13 != 0) { // L: 9273
						var12.method8684(var7 + var12.field4974[0], var13 + var12.field4965[0], var14); // L: 9274
					}
				}
			}

			while (var1.method9510(Client.packetWriter.serverPacketLength) >= 10) { // L: 9278
				var3 = var1.readUnsignedShort(); // L: 9279
				var0.field1333[++var0.field1322 - 1] = var3; // L: 9280
				var4 = var1.readUnsignedByte(); // L: 9281
				int var5 = var1.readUnsignedByte(); // L: 9282
				int var16 = var4 * 8; // L: 9283
				int var17 = var5 * 8; // L: 9284
				class476 var8 = new class476(var3, var16, var17, class105.clientPreferences.method2569()); // L: 9285
				var0.field1331[var3] = var8; // L: 9286
				int var9 = var1.readUnsignedByte(); // L: 9287
				int var10 = var1.readUnsignedByte(); // L: 9288
				var8.method8679(var9, var10); // L: 9289
				var8.field4970 = var1.readUnsignedShort(); // L: 9290
				var1.readUnsignedShort(); // L: 9291
			}

		}
	} // L: 9293
}
