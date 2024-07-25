import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jv")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static GraphicsDefaults field2497;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1910215425
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2088073837
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1036403129
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2053854627
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILip;I)Z",
		garbageValue = "950007468"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1393024656"
	)
	static int method4456(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1607
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1608
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class301.Widget_unpackTargetMask(ClanChannel.getWidgetFlags(var3)); // L: 1609
			return 1; // L: 1610
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1612
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1619
				if (var3.dataText == null) { // L: 1620
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1621
				}

				return 1; // L: 1622
			} else {
				return 2; // L: 1624
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1613
			--var4; // L: 1614
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1615
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1616
			} else {
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1617
		}
	}
}
