import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class136 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1609;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1601;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1599;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1602;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1600;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class136 field1611;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("ItemComposition_fontPlain11")
	static Font ItemComposition_fontPlain11;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 669295793
	)
	final int field1605;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1253664005
	)
	final int field1606;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 426669381
	)
	final int field1607;

	static {
		field1609 = new class136(0, 0, (String)null, 0); // L: 14
		field1601 = new class136(1, 1, (String)null, 9); // L: 15
		field1599 = new class136(2, 2, (String)null, 3); // L: 16
		field1602 = new class136(3, 3, (String)null, 6); // L: 17
		field1600 = new class136(4, 4, (String)null, 1); // L: 18
		field1611 = new class136(5, 5, (String)null, 3); // L: 19
	}

	class136(int var1, int var2, String var3, int var4) {
		this.field1605 = var1; // L: 29
		this.field1606 = var2;
		this.field1607 = var4; // L: 31
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1606; // L: 46
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-619182222"
	)
	int method3168() {
		return this.field1607; // L: 41
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Loa;",
		garbageValue = "-1507088397"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4462, PlayerType.field4449, PlayerType.field4453, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_normal, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ironman, PlayerType.field4451, PlayerType.field4457, PlayerType.field4450, PlayerType.PlayerType_playerModerator, PlayerType.field4456, PlayerType.field4441, PlayerType.field4455, PlayerType.field4454, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4448}; // L: 30
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "12"
	)
	static final void method3174(class101 var0) {
		int[] var1 = var0.field1319.field1409; // L: 4286

		int var2;
		for (var2 = 0; var2 < var0.field1319.field1404; ++var2) { // L: 4287
			Player var5 = var0.field1326[var1[var2]]; // L: 4288
			if (var5 != null && var5.field1206 > 0) { // L: 4289
				--var5.field1206; // L: 4290
				if (var5.field1206 == 0) { // L: 4291
					var5.field1211 = null;
				}
			}
		}

		for (var2 = 0; var2 < var0.field1329; ++var2) { // L: 4294
			int var3 = var0.field1330[var2]; // L: 4295
			class103 var4 = var0.field1315[var3]; // L: 4296
			if (var4 != null && var4.field1206 > 0) { // L: 4297
				--var4.field1206; // L: 4298
				if (var4.field1206 == 0) { // L: 4299
					var4.field1211 = null;
				}
			}
		}

	} // L: 4302
}
