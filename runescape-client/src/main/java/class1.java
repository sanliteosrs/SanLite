import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
public class class1 implements Callable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -836714351
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	final Buffer field0;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class3 field2;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lav;Lvp;Lak;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field0 = var2; // L: 48
		this.field2 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field2.vmethod14(this.field0); // L: 54
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "80"
	)
	static int method7(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4404
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.getWindowedMode(); // L: 4405
			return 1; // L: 4406
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4408
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4409
				if (var3 == 1 || var3 == 2) { // L: 4410
					class225.setWindowedMode(var3);
				}

				return 1; // L: 4411
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4413
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class105.clientPreferences.method2623(); // L: 4414
				return 1; // L: 4415
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4417
				if (var0 == 5310) { // L: 4424
					--class130.Interpreter_intStackSize; // L: 4425
					return 1; // L: 4426
				} else {
					return 2; // L: 4428
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4418
				if (var3 == 1 || var3 == 2) { // L: 4419
					class105.clientPreferences.method2595(var3); // L: 4420
				}

				return 1; // L: 4422
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1745935264"
	)
	static int method10(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) { // L: 5340
			--class130.Interpreter_intStackSize; // L: 5341
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 5342
			var4 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5343
			class171.method3529(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1); // L: 5344
			return 1; // L: 5345
		} else if (var0 == 8001) { // L: 5347
			class130.Interpreter_intStackSize -= 3; // L: 5348
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 5349
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 5350
			int var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 5351
			int var6 = Interpreter.Interpreter_arrayLengths[var3]; // L: 5352
			if (var6 <= 1) { // L: 5353
				return 1;
			} else {
				class447.method8289(Interpreter.Interpreter_arrays[var3], var6, var4, var5); // L: 5354
				return 1; // L: 5355
			}
		} else {
			return 2; // L: 5357
		}
	}
}
