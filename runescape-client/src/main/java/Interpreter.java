import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ak")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("an")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("aj")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("av")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("ai")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1780967395
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lcd;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("ao")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("aa")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("aw")
	static boolean field863;
	@ObfuscatedName("at")
	static boolean field870;
	@ObfuscatedName("af")
	static ArrayList field860;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -597753149
	)
	static int field872;
	@ObfuscatedName("be")
	static final double field869;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 68
		Interpreter_arrays = new int[5][5000]; // L: 69
		Interpreter_intStack = new int[1000]; // L: 70
		Interpreter_stringStack = new String[1000]; // L: 72
		Interpreter_frameDepth = 0; // L: 74
		Interpreter_frames = new ScriptFrame[50]; // L: 75
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 81
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 84
		field863 = false; // L: 87
		field870 = false; // L: 88
		field860 = new ArrayList(); // L: 89
		field872 = 0; // L: 90
		field869 = Math.log(2.0D); // L: 94
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldt;",
		garbageValue = "-1356064497"
	)
	static class91[] method2144() {
		return new class91[]{class91.field1101, class91.field1099, class91.field1102, class91.field1103, class91.field1100}; // L: 16
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "33"
	)
	public static String method2025(String var0) {
		int var1 = var0.length(); // L: 204
		char[] var2 = new char[var1]; // L: 205
		byte var3 = 2; // L: 206

		for (int var4 = 0; var4 < var1; ++var4) { // L: 207
			char var5 = var0.charAt(var4); // L: 208
			if (var3 == 0) { // L: 209
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 210
				var5 = class186.method3667(var5);
			}

			if (Character.isLetter(var5)) { // L: 211
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 212
				if (Character.isSpaceChar(var5)) { // L: 213
					if (var3 != 2) { // L: 214
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 216
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 217
		}

		return new String(var2); // L: 219
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-66"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class135.method3167(); // L: 3105
		switch(var0) { // L: 3106
		case 1:
			class47.method901(); // L: 3109
			break;
		case 2:
			class163.method3447(24); // L: 3115
			VerticalAlignment.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 3116
		}

	} // L: 3121
}
