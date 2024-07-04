import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("aq")
	@Export("text")
	String text;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 265924559
	)
	@Export("width")
	int width;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2136908715
	)
	@Export("height")
	int height;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjx;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "784704657"
	)
	static float method5003(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var3 * var2 + var0[var4]; // L: 110
		}

		return var3; // L: 112
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-14417832"
	)
	static int method5004(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2913
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2914
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field728.method4384(var3) ? 1 : 0; // L: 2915
			return 1; // L: 2916
		} else if (var0 == 3501) { // L: 2918
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2919
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field728.method4383(var3) ? 1 : 0; // L: 2920
			return 1; // L: 2921
		} else if (var0 == 3502) { // L: 2923
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2924
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field728.method4385(var3) ? 1 : 0; // L: 2925
			return 1; // L: 2926
		} else {
			return 2; // L: 2928
		}
	}
}
