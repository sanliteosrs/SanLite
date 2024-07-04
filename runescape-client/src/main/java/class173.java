import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("go")
final class class173 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 509
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1475945311"
	)
	static int method3540(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1365
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1366
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.x; // L: 1367
			return 1; // L: 1368
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1370
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.y; // L: 1371
			return 1; // L: 1372
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1374
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.width; // L: 1375
			return 1; // L: 1376
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1378
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.height; // L: 1379
			return 1; // L: 1380
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1382
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1383
			return 1; // L: 1384
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1386
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.parentId; // L: 1387
			return 1; // L: 1388
		} else {
			return 2; // L: 1390
		}
	}
}
