import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("if")
public class class224 {
	@ObfuscatedName("ad")
	String field2404;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1097199299
	)
	int field2405;
	@ObfuscatedName("ak")
	ArrayList field2409;
	@ObfuscatedName("ap")
	ArrayList field2407;
	@ObfuscatedName("an")
	ArrayList field2406;
	@ObfuscatedName("aj")
	String field2403;
	@ObfuscatedName("av")
	float[] field2410;
	@ObfuscatedName("ab")
	Map field2412;
	@ObfuscatedName("ai")
	Map field2408;

	class224() {
		this.field2405 = 0; // L: 17
		this.field2409 = new ArrayList(); // L: 18
		this.field2407 = new ArrayList(); // L: 19
		this.field2406 = new ArrayList(); // L: 20
		this.field2403 = null; // L: 21
		this.field2410 = new float[4]; // L: 22
		this.field2412 = new HashMap(); // L: 23
		this.field2408 = new HashMap(); // L: 24
	} // L: 26

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-942660188"
	)
	String method4282() {
		return this.field2404; // L: 29
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665855192"
	)
	int method4289() {
		return this.field2405; // L: 33
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	void method4285() {
		this.field2403 = null; // L: 37
		this.field2410[0] = 0.0F; // L: 38
		this.field2410[1] = 0.0F; // L: 39
		this.field2410[2] = 1.0F; // L: 40
		this.field2410[3] = 1.0F; // L: 41
		this.field2409.clear(); // L: 42
		this.field2407.clear();
		this.field2406.clear();
		this.field2412.clear();
		this.field2408.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILea;I)Z",
		garbageValue = "18197983"
	)
	boolean method4277(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4285();
				return false; // L: 57
			}

			try {
				this.method4278(var4.getJSONArray("images"), var3); // L: 60
			} catch (Exception var12) { // L: 62
				this.field2407.clear(); // L: 63
			}

			try {
				this.method4280(var4.getJSONArray("labels")); // L: 66
			} catch (Exception var11) { // L: 68
				this.field2406.clear(); // L: 69
			}
		} else {
			try {
				this.method4279(var4.getJSONObject("image"), var3); // L: 74
			} catch (Exception var10) { // L: 76
				this.field2407.clear(); // L: 77
			}

			try {
				this.method4281(var4.getJSONObject("label")); // L: 80
			} catch (Exception var9) { // L: 82
				this.field2406.clear(); // L: 83
			}
		}

		try {
			this.method4300(var4.getJSONObject("behaviour")); // L: 87
		} catch (Exception var8) { // L: 89
			this.field2403 = null; // L: 90
			this.field2410[0] = 0.0F; // L: 91
			this.field2410[1] = 0.0F; // L: 92
			this.field2410[2] = 1.0F; // L: 93
			this.field2410[3] = 1.0F; // L: 94
			this.field2409.clear(); // L: 95
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta"); // L: 98
			if (var5 != null) { // L: 99
				this.method4283(var4.getJSONObject("meta")); // L: 100
			}
		} catch (Exception var7) { // L: 103
			this.field2412.clear(); // L: 104
			this.field2408.clear(); // L: 105
		}

		if (var2 == 2) { // L: 107
			try {
				this.field2404 = var4.getString("id"); // L: 109
				this.field2405 = Integer.parseInt(var4.getString("priority")); // L: 110
			} catch (Exception var6) { // L: 112
			}
		}

		return true; // L: 114
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lea;I)V",
		garbageValue = "803825893"
	)
	void method4278(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 118
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 119
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 121
					class214 var5 = new class214(this); // L: 122
					var5.field2340 = var2.request(new URL(var4.getString("src"))); // L: 123
					var5.field2338 = class324.method6116(var4, "placement"); // L: 124
					this.field2407.add(var5); // L: 125
				} catch (MalformedURLException var6) { // L: 127
				}
			}

		}
	} // L: 129

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lea;I)V",
		garbageValue = "1619081491"
	)
	void method4279(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class214 var3 = new class214(this); // L: 133
			var3.field2340 = var2.request(new URL(var1.getString("src"))); // L: 134
			var3.field2338 = class324.method6116(var1, "placement"); // L: 135
			this.field2407.add(var3); // L: 136
		} catch (MalformedURLException var4) { // L: 138
		}

	} // L: 139

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "731614484"
	)
	void method4280(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 142
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 143
				JSONObject var3 = var1.getJSONObject(var2); // L: 144
				class225 var4 = new class225(this); // L: 145
				var4.field2417 = var3.getString("text"); // L: 146
				var4.field2418 = class221.method4240(var3.getString("align_x")); // L: 147
				var4.field2420 = class221.method4240(var3.getString("align_y")); // L: 148
				var4.field2421 = var3.getInt("font"); // L: 149
				var4.field2415 = class324.method6116(var3, "placement"); // L: 150
				this.field2406.add(var4); // L: 151
			}

		}
	} // L: 153

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "36137201"
	)
	void method4281(JSONObject var1) throws JSONException {
		class225 var2 = new class225(this); // L: 156
		var2.field2417 = var1.optString("text"); // L: 157
		var2.field2418 = class221.method4240(var1.optString("align_x")); // L: 158
		var2.field2420 = class221.method4240(var1.optString("align_y")); // L: 159
		var2.field2421 = var1.optInt("font"); // L: 160
		var2.field2415 = class324.method6116(var1, "placement"); // L: 161
		this.field2406.add(var2); // L: 162
	} // L: 163

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1778264859"
	)
	void method4300(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 166
			this.field2410 = class324.method6116(var1, "clickbounds"); // L: 167
			this.field2403 = var1.getString("endpoint"); // L: 168
			String[] var2 = JSONObject.getNames(var1); // L: 169

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 170
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 171
					try {
						int var4 = var1.getInt(var2[var3]); // L: 173
						this.field2409.add(new class212(this, var2[var3], var4)); // L: 174
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 178
							if (var5.equals("true")) { // L: 179
								this.field2409.add(new class212(this, var2[var3], 1)); // L: 180
							} else if (var5.equals("false")) { // L: 182
								this.field2409.add(new class212(this, var2[var3], 0)); // L: 183
							} else {
								this.field2409.add(new class221(this, var2[var3], var5)); // L: 186
							}
						} catch (Exception var7) { // L: 189
						}
					}
				}
			}

		}
	} // L: 193

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1661873825"
	)
	void method4283(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 196

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
			try {
				int var4 = var1.optInt(var2[var3]); // L: 199
				this.field2412.put(var2[var3], var4); // L: 200
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]); // L: 204
					if (var5.equals("true")) { // L: 205
						this.field2412.put(var2[var3], 1); // L: 206
					} else if (var5.equals("false")) { // L: 208
						this.field2412.put(var2[var3], 0); // L: 209
					} else {
						this.field2408.put(var2[var3], var5); // L: 212
					}
				} catch (Exception var7) { // L: 215
				}
			}
		}

	} // L: 218

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1137574238"
	)
	static void method4301() {
		class83.field1044 = 99; // L: 43
		class83.field1033 = new short[4][104][104]; // L: 44
		class83.field1034 = new short[4][104][104]; // L: 45
		class83.field1035 = new byte[4][104][104]; // L: 46
		class356.field3810 = new byte[4][104][104]; // L: 47
		class25.field110 = new int[4][105][105]; // L: 48
		WorldMapScaleHandler.field2749 = new byte[4][105][105]; // L: 49
		class83.field1039 = new int[105][105]; // L: 50
		class83.field1037 = new int[104]; // L: 51
		class83.field1038 = new int[104]; // L: 52
		Canvas.field105 = new int[104]; // L: 53
		class83.field1036 = new int[104]; // L: 54
		class534.field5292 = new int[104]; // L: 55
	} // L: 56
}
