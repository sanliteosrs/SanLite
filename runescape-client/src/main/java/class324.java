import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("mn")
public class class324 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "94"
	)
	public static Object method6114(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 16
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-41"
	)
	public static boolean method6117(int var0) {
		return var0 >= WorldMapDecorationType.field4029.id && var0 <= WorldMapDecorationType.field4030.id; // L: 47
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "-125"
	)
	static float[] method6116(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 221

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 223
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 224
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 225
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 226
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 227
		} catch (JSONException var4) { // L: 229
			var2[0] = 0.0F; // L: 230
			var2[1] = 0.0F; // L: 231
			var2[2] = 1.0F; // L: 232
			var2[3] = 1.0F; // L: 233
		}

		return var2; // L: 235
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnx;B)I",
		garbageValue = "-1"
	)
	static int method6115(Widget var0) {
		if (var0.type != 11) { // L: 1586
			--class337.Interpreter_stringStackSize; // L: 1587
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 1588
			return 1; // L: 1589
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 1591
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var0.method6879(var1); // L: 1592
			return 1; // L: 1593
		}
	}
}
