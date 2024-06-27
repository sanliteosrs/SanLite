import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
public class class539 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public static AbstractArchive field5305;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("DBRowType_cache")
	static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("ag")
	Object[][] field5307;
	@ObfuscatedName("ak")
	int[][] field5306;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -258897133
	)
	public int field5304;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class539() {
		this.field5304 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-779652439"
	)
	void method9460(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method9462(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[Ljava/lang/Object;",
		garbageValue = "251055664"
	)
	public Object[] method9461(int var1) {
		return this.field5307 == null ? null : this.field5307[var1]; // L: 39 40
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "-63"
	)
	void method9462(Buffer var1, int var2) {
		if (var2 == 3) { // L: 44
			int var3 = var1.readUnsignedByte(); // L: 45
			if (this.field5307 == null) { // L: 46
				this.field5307 = new Object[var3][]; // L: 47
				this.field5306 = new int[var3][]; // L: 48
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 50 51 74
				int var5 = var1.readUnsignedByte(); // L: 52
				int[] var6 = new int[var5]; // L: 53

				for (int var7 = 0; var7 < var5; ++var7) { // L: 54
					var6[var7] = var1.readUShortSmart(); // L: 55
				}

				Object[][] var16 = this.field5307; // L: 57
				int var10 = var1.readUShortSmart(); // L: 61
				Object[] var11 = new Object[var6.length * var10]; // L: 62

				for (int var12 = 0; var12 < var10; ++var12) { // L: 63
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 64
						int var14 = var13 + var6.length * var12; // L: 65
						class534 var15 = AttackOption.method2792(var6[var13]); // L: 66
						var11[var14] = var15.method9409(var1); // L: 67
					}
				}

				var16[var4] = var11; // L: 72
				this.field5306[var4] = var6; // L: 73
			}
		} else if (var2 == 4) { // L: 77
			this.field5304 = var1.method9579(); // L: 78
		}

	} // L: 81

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "320165233"
	)
	void method9459() {
	} // L: 83
}
