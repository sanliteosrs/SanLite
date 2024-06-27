import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class354 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	public class356 field3767;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	class350 field3764;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	class27 field3765;
	@ObfuscatedName("ak")
	public Object[] field3766;
	@ObfuscatedName("ap")
	public Object[] field3768;
	@ObfuscatedName("an")
	public Object[] field3763;
	@ObfuscatedName("aj")
	public Object[] field3769;

	class354() {
		this.field3767 = new class356(); // L: 6
		this.field3764 = new class350(); // L: 7
		this.field3765 = new class27(); // L: 8
	} // L: 14

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2146996983"
	)
	public static boolean method6537(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) { // L: 46
				char[] var1 = class413.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-855787089"
	)
	public static void method6536() {
		InvDefinition.InvDefinition_cached.clear(); // L: 44
	} // L: 45
}
