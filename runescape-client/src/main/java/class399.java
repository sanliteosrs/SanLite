import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public class class399 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static final class399 field4616;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static final class399 field4613;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static final class399 field4615;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static final class399 field4614;

	static {
		field4616 = new class399(); // L: 4
		field4613 = new class399(); // L: 5
		field4615 = new class399(); // L: 6
		field4614 = new class399(); // L: 7
	}

	class399() {
	} // L: 9

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Lix;",
		garbageValue = "19468"
	)
	public static Clock method7401() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}
}
