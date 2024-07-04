import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class101 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2142034745
	)
	int field1328;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public class282 field1316;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	CollisionMap[] field1317;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1735177445
	)
	public int field1318;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1019381583
	)
	int field1332;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1628317125
	)
	int field1320;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 998139683
	)
	int field1321;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1484949025
	)
	int field1323;
	@ObfuscatedName("ab")
	int[][] field1338;
	@ObfuscatedName("ai")
	int[][][] field1327;
	@ObfuscatedName("ae")
	byte[][][] field1325;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Ldb;"
	)
	Player[] field1326;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	class110 field1319;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	class103[] field1315;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -959579827
	)
	int field1329;
	@ObfuscatedName("ac")
	int[] field1330;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lso;"
	)
	class476[] field1331;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1124408595
	)
	int field1322;
	@ObfuscatedName("ao")
	int[] field1333;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[[Lpr;"
	)
	NodeDeque[][][] field1334;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	NodeDeque field1335;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	NodeDeque field1324;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	NodeDeque field1337;

	public class101(int var1, int var2, int var3, int var4) {
		this.field1317 = new CollisionMap[4]; // L: 12
		this.field1326 = new Player[2048]; // L: 21
		this.field1319 = new class110(this); // L: 22
		this.field1315 = new class103[65536]; // L: 23
		this.field1330 = new int[65536]; // L: 25
		this.field1331 = new class476[2048]; // L: 26
		this.field1333 = new int[2048]; // L: 28
		this.field1335 = new NodeDeque(); // L: 30
		this.field1324 = new NodeDeque(); // L: 31
		this.field1337 = new NodeDeque(); // L: 32
		this.field1328 = var1; // L: 35
		this.field1332 = var2; // L: 36
		this.field1320 = var3; // L: 37
		this.field1334 = new NodeDeque[4][var2][var3]; // L: 38
		this.field1327 = new int[4][var2 + 1][var3 + 1]; // L: 39
		this.field1325 = new byte[4][var2][var3]; // L: 40
		this.field1338 = new int[var2][var3]; // L: 41

		for (int var5 = 0; var5 < 4; ++var5) { // L: 42
			this.field1317[var5] = new CollisionMap(var2, var3); // L: 43
		}

		this.field1316 = new class282(var1, 4, var2, var3, var4, this.field1327); // L: 45
	} // L: 46

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "74"
	)
	boolean method2676() {
		return this.field1328 == -1; // L: 49
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-843666588"
	)
	void method2677() {
		this.field1329 = 0; // L: 53
		this.field1322 = 0; // L: 54

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) { // L: 55
			this.field1326[var1] = null;
		}

		for (var1 = 0; var1 < 65536; ++var1) { // L: 56
			this.field1315[var1] = null;
		}

		for (var1 = 0; var1 < 2048; ++var1) { // L: 57
			this.field1331[var1] = null;
		}

		this.field1324.clear(); // L: 58
		this.field1337.clear(); // L: 59
		this.field1335 = new NodeDeque(); // L: 60

		for (var1 = 0; var1 < 4; ++var1) { // L: 61
			for (int var2 = 0; var2 < this.field1332; ++var2) { // L: 62
				for (int var3 = 0; var3 < this.field1320; ++var3) { // L: 63
					this.field1334[var1][var2][var3] = null; // L: 64
				}
			}
		}

		this.field1316.method5414(); // L: 68

		for (var1 = 0; var1 < 4; ++var1) { // L: 69
			this.field1317[var1].clear(); // L: 70
		}

	} // L: 72

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-370890653"
	)
	void method2680() {
		int var1;
		for (var1 = 0; var1 < 2048; ++var1) { // L: 75
			this.field1326[var1] = null;
		}

		for (var1 = 0; var1 < this.field1315.length; ++var1) { // L: 76
			class103 var2 = this.field1315[var1]; // L: 77
			if (var2 != null) { // L: 78
				var2.field1190 = -1; // L: 79
				var2.field1209 = false; // L: 80
			}
		}

	} // L: 83

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1942851204"
	)
	static final void method2684(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9861
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9862
				Client.field722[var4] = true;
			}
		}

	} // L: 9864
}
