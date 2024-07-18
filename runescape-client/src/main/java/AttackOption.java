import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("AttackOption")
public enum AttackOption implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1381(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1385(2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1382(3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	field1384(4);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1126248633
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 13630
	} // L: 13631

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 13635
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;Lth;I)Lth;",
		garbageValue = "1072922823"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = ModeWhere.method7432(var2); // L: 18
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lue;",
		garbageValue = "-646650341"
	)
	public static class534 method2792(int var0) {
		int var1 = class532.field5282[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class534.field5290; // L: 21
		} else if (var1 == 2) { // L: 23
			return class534.field5286; // L: 24
		} else {
			return var1 == 3 ? class534.field5284 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "73"
	)
	static final boolean method2786() {
		return Client.isMenuOpen; // L: 9851
	}
}
