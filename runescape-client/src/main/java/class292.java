import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lr")
public class class292 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "0"
	)
	static int method5753(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1628
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1645
				var7 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1646
				var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1647
				if (var4 >= 1 && var4 <= 10) { // L: 1648
					class105 var8 = new class105(var4, var7.id, var7.childIndex, var7.itemId); // L: 1651
					Interpreter.field860.add(var8); // L: 1652
					return 1; // L: 1653
				} else {
					throw new RuntimeException(); // L: 1649
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1655
				class130.Interpreter_intStackSize -= 3; // L: 1656
				int var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 1657
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 1658
				int var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 1659
				if (var5 >= 1 && var5 <= 10) { // L: 1660
					class105 var6 = new class105(var5, var3, var4, ModeWhere.field4649.method6519(var3).itemId); // L: 1663
					Interpreter.field860.add(var6); // L: 1664
					return 1; // L: 1665
				} else {
					throw new RuntimeException(); // L: 1661
				}
			} else {
				return 2; // L: 1667
			}
		} else if (Interpreter.field872 >= 10) { // L: 1629
			throw new RuntimeException(); // L: 1630
		} else {
			if (var0 >= 2000) { // L: 1633
				var7 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 1634
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1636
			}

			if (var7.onResize == null) { // L: 1637
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1638
				var9.widget = var7; // L: 1639
				var9.args = var7.onResize; // L: 1640
				var9.field1090 = Interpreter.field872 + 1; // L: 1641
				Client.scriptEvents.addFirst(var9); // L: 1642
				return 1; // L: 1643
			}
		}
	}
}
