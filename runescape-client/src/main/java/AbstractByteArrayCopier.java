import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-7"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1806958833"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)I",
		garbageValue = "1352728934"
	)
	static int method7026(Widget var0) {
		if (var0.type != 11) { // L: 1597
			Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize - 1] = ""; // L: 1598
			return 1; // L: 1599
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1601
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var0.method6942(var1); // L: 1602
			return 1; // L: 1603
		}
	}
}
