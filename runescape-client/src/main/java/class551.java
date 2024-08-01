import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
public class class551 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	public static final class551 field5419;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	public static final class551 field5417;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class551 field5422;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class551 field5421;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class551 field5420;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class551 field5418;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -270693175
	)
	final int field5423;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1804310925
	)
	final int field5416;

	static {
		field5419 = new class551(5, 0); // L: 8
		field5417 = new class551(4, 2); // L: 9
		field5422 = new class551(0, 5); // L: 10
		field5421 = new class551(1, 6); // L: 11
		field5420 = new class551(2, 7); // L: 12
		field5418 = new class551(3, 8); // L: 13
	}

	class551(int var1, int var2) {
		this.field5423 = var1; // L: 18
		this.field5416 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5416; // L: 24
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-7636"
	)
	public boolean method9855() {
		return this == field5417; // L: 28
	}
}
