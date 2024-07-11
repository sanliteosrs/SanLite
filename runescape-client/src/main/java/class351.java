import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nh")
public class class351 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 879717905
	)
	static int field3753;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1875344852"
	)
	static int method6525(int var0, Script var1, boolean var2) {
		Widget var3 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 1896
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1897
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class301.Widget_unpackTargetMask(ClanChannel.getWidgetFlags(var3)); // L: 1898
			return 1; // L: 1899
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1901
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1908
				if (var3.dataText == null) { // L: 1909
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1910
				}

				return 1; // L: 1911
			} else {
				return 2; // L: 1913
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1902
			--var4; // L: 1903
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1904
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1905
			} else {
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1906
		}
	}
}
