import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public enum class138 implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1618(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1616(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1622(2, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1615(3, 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1619(4, 4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1617(5, 5),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1621(6, 6),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1620(7, 7),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	field1623(8, 8);

	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1823179125
	)
	final int field1624;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1944390957
	)
	final int field1625;

	class138(int var3, int var4) {
		this.field1624 = var3; // L: 101
		this.field1625 = var4; // L: 102
	} // L: 103

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1625; // L: 106
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lrm;",
		garbageValue = "16"
	)
	public static class451 method3097() {
		synchronized(class451.field4744) { // L: 25
			if (class451.field4742 == 0) { // L: 26
				return new class451();
			} else {
				class451.field4744[--class451.field4742].method8249(); // L: 28
				return class451.field4744[class451.field4742]; // L: 29
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Llx;",
		garbageValue = "1787686386"
	)
	static LoginPacket[] method3096() {
		return new LoginPacket[]{LoginPacket.field3344, LoginPacket.field3345, LoginPacket.field3340, LoginPacket.field3341, LoginPacket.field3343, LoginPacket.field3342}; // L: 22
	}
}
