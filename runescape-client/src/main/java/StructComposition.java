import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2058093555"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "132251974"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 == 0) { // L: 34
				return; // L: 37
			}

			this.decodeNext(var1, var2); // L: 35
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "1593179292"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = AttackOption.readStringIntParameters(var1, this.params); // L: 40
		}

	} // L: 42

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-38"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return WorldMapRectangle.method4997(this.params, var1, var2); // L: 45
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2031831973"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class109.method2817(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Lum;",
		garbageValue = "30"
	)
	public static class537 method3873(int var0) {
		class537 var1 = (class537)class537.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class537.field5294.takeFile(39, var0); // L: 25
			var1 = new class537(); // L: 26
			if (var2 != null) { // L: 27
				var1.method9435(new Buffer(var2));
			}

			var1.method9436(); // L: 28
			class537.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1899627573"
	)
	static int method3871(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 424
			return class537.method9448(var0, var1, var2);
		} else if (var0 < 1100) { // L: 425
			return class128.method3049(var0, var1, var2);
		} else if (var0 < 1200) { // L: 426
			return class388.method7305(var0, var1, var2);
		} else if (var0 < 1300) { // L: 427
			return class317.method6089(var0, var1, var2);
		} else if (var0 < 1400) { // L: 428
			return class14.method174(var0, var1, var2);
		} else if (var0 < 1500) { // L: 429
			return class7.method59(var0, var1, var2);
		} else if (var0 < 1600) { // L: 430
			return class173.method3540(var0, var1, var2);
		} else if (var0 < 1700) { // L: 431
			return MusicPatchNode2.method6152(var0, var1, var2);
		} else if (var0 < 1800) { // L: 432
			return class95.method2466(var0, var1, var2);
		} else if (var0 < 1900) { // L: 433
			return RouteStrategy.method4456(var0, var1, var2);
		} else if (var0 < 2000) { // L: 434
			return class292.method5753(var0, var1, var2);
		} else if (var0 < 2100) { // L: 435
			return class128.method3049(var0, var1, var2);
		} else if (var0 < 2200) { // L: 436
			return class388.method7305(var0, var1, var2);
		} else if (var0 < 2300) { // L: 437
			return class317.method6089(var0, var1, var2);
		} else if (var0 < 2400) { // L: 438
			return class14.method174(var0, var1, var2);
		} else if (var0 < 2500) { // L: 439
			return class7.method59(var0, var1, var2);
		} else if (var0 < 2600) { // L: 440
			return class19.method281(var0, var1, var2);
		} else if (var0 < 2700) { // L: 441
			return class95.method2465(var0, var1, var2);
		} else if (var0 < 2800) { // L: 442
			return ClientPacket.method6090(var0, var1, var2);
		} else if (var0 < 2900) { // L: 443
			return class351.method6525(var0, var1, var2);
		} else if (var0 < 3000) { // L: 444
			return class292.method5753(var0, var1, var2);
		} else if (var0 < 3200) { // L: 445
			return class371.method7066(var0, var1, var2);
		} else if (var0 < 3300) { // L: 446
			return ApproximateRouteStrategy.method1223(var0, var1, var2);
		} else if (var0 < 3400) { // L: 447
			return class138.method3191(var0, var1, var2);
		} else if (var0 < 3500) { // L: 448
			return WorldMapDecorationType.method7053(var0, var1, var2);
		} else if (var0 < 3600) { // L: 449
			return WorldMapLabel.method5004(var0, var1, var2);
		} else if (var0 < 3700) { // L: 450
			return class380.method7097(var0, var1, var2);
		} else if (var0 < 3800) { // L: 451
			return GameEngine.method645(var0, var1, var2);
		} else if (var0 < 3900) { // L: 452
			return class168.method3511(var0, var1, var2);
		} else if (var0 < 4000) { // L: 453
			return class176.method3564(var0, var1, var2);
		} else if (var0 < 4100) {
			return SoundSystem.method874(var0, var1, var2); // L: 454
		} else if (var0 < 4200) { // L: 455
			return class20.method298(var0, var1, var2);
		} else if (var0 < 4300) { // L: 456
			return class68.method1247(var0, var1, var2);
		} else if (var0 < 5100) { // L: 457
			return class10.method98(var0, var1, var2);
		} else if (var0 < 5400) { // L: 458
			return class1.method7(var0, var1, var2);
		} else if (var0 < 5600) { // L: 459
			return PacketWriter.method2940(var0, var1, var2);
		} else if (var0 < 5700) { // L: 460
			return UserComparator6.method3045(var0, var1, var2);
		} else if (var0 < 6300) { // L: 461
			return class337.method6384(var0, var1, var2);
		} else if (var0 < 6600) { // L: 462
			return ReflectionCheck.method713(var0, var1, var2);
		} else if (var0 < 6700) { // L: 463
			return class240.method4536(var0, var1, var2);
		} else if (var0 < 6800) { // L: 464
			return BufferedSource.method8745(var0, var1, var2);
		} else if (var0 < 6900) { // L: 465
			return Decimator.method1136(var0, var1, var2);
		} else if (var0 < 7000) { // L: 466
			return class20.method297(var0, var1, var2);
		} else if (var0 < 7100) { // L: 467
			return class33.method483(var0, var1, var2);
		} else if (var0 < 7200) { // L: 468
			return class341.method6427(var0, var1, var2);
		} else if (var0 < 7500) { // L: 469
			return class357.method6854(var0, var1, var2);
		} else if (var0 < 7600) { // L: 470
			return class261.method5006(var0, var1, var2);
		} else if (var0 < 7700) { // L: 471
			return class461.method8438(var0, var1, var2);
		} else {
			return var0 < 8100 ? class1.method10(var0, var1, var2) : 2; // L: 472 473
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	static void method3870(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
