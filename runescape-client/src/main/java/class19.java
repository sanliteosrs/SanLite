import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aa")
public class class19 implements Callable {
	@ObfuscatedName("aa")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 653926627
	)
	static int field86;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	final class10 field87;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;Lae;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field87 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field87.method84()) { // L: 53
				class188.method3688(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field87.method85(); // L: 60
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1336305230"
	)
	public static void method285() {
		WorldMapElement.Ignored_cached.clear(); // L: 159
	} // L: 160

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1284359329"
	)
	static int method281(int var0, Script var1, boolean var2) {
		Widget var3 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 1671
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1672
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.x; // L: 1673
			return 1; // L: 1674
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1676
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.y; // L: 1677
			return 1; // L: 1678
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1680
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.width; // L: 1681
			return 1; // L: 1682
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1684
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.height; // L: 1685
			return 1; // L: 1686
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1688
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1689
			return 1; // L: 1690
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1692
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.parentId; // L: 1693
			return 1; // L: 1694
		} else {
			return 2; // L: 1696
		}
	}
}
