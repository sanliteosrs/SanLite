import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public abstract class class512 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1131756953
	)
	int field5138;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -932997329
	)
	int field5140;
	@ObfuscatedName("ai")
	double field5139;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -386333095
	)
	int field5141;

	class512(int var1, int var2) {
		this.field5138 = 0; // L: 4
		this.field5140 = 0; // L: 5
		this.field5139 = 0.0D; // L: 6
		this.field5141 = 0; // L: 7
		this.field5138 = var1; // L: 11
		this.field5140 = 0; // L: 12
		this.field5141 = var2 >= 0 && var2 <= 27 ? var2 : 0; // L: 13
		this.field5139 = class457.method8363(this.field5140, this.field5138, this.field5141); // L: 14
	} // L: 15

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2145790593"
	)
	public void method8974() {
		if (this.field5140 < this.field5138) { // L: 18
			++this.field5140; // L: 19
			this.field5139 = class457.method8363(this.field5140, this.field5138, this.field5141); // L: 20
		}

	} // L: 22

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1207550874"
	)
	double method8971() {
		return this.field5139; // L: 25
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	static void method8981(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 13335
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 13336
				var1.remove(); // L: 13337
			}
		}

	} // L: 13340
}
