import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("is")
public class class213 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	class222 field2335;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	class224 field2331;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1575492419
	)
	int field2332;
	@ObfuscatedName("ah")
	String field2330;
	@ObfuscatedName("az")
	String field2334;
	@ObfuscatedName("ax")
	String field2325;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	UrlRequest field2336;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 407404605
	)
	int field2333;

	public class213() {
		this.field2332 = -1; // L: 28
		this.field2333 = 0; // L: 33
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lin;",
		garbageValue = "-1443092087"
	)
	public class222 method4120() {
		return this.field2335; // L: 36
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lea;I)Z",
		garbageValue = "1277915291"
	)
	public boolean method4121(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) { // L: 43
				return false;
			} else {
				this.method4143(); // L: 46

				try {
					this.field2330 = var1; // L: 48
					this.field2336 = var3.request(new URL(this.field2330)); // L: 49
					this.field2332 = 0;
				} catch (MalformedURLException var5) { // L: 52
					this.method4143(); // L: 53
					this.field2332 = 4; // L: 54
					return false; // L: 55
				}

				if (!var2.isEmpty()) { // L: 57
					this.field2325 = var2; // L: 58
				}

				return true; // L: 60
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-41"
	)
	public void method4122(String var1, String var2, String var3) {
		this.field2335 = class433.method8077(); // L: 64
		this.field2334 = var1; // L: 65
		this.field2335.method4265(this.field2334, var2, var3); // L: 66
	} // L: 67

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-266925953"
	)
	public void method4123(UrlRequester var1) {
		switch(this.field2332) { // L: 70
		case 0:
			this.method4138(var1); // L: 72
			break;
		case 1:
			this.method4135();
			break; // L: 77
		default:
			return; // L: 75
		}

	} // L: 80

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "102"
	)
	public int method4124() {
		return this.field2332; // L: 83
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1302658772"
	)
	public int method4125(String var1) {
		return this.field2331.field2412.containsKey(var1) ? (Integer)this.field2331.field2412.get(var1) : -1; // L: 87
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-599672689"
	)
	public String method4126(String var1) {
		return (String)((String)(this.field2331.field2408.containsKey(var1) ? this.field2331.field2408.get(var1) : null)); // L: 91
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "4"
	)
	public ArrayList method4127() {
		return this.field2331.field2407; // L: 95
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "30"
	)
	public ArrayList method4128() {
		return this.field2331.field2406; // L: 99
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1151021088"
	)
	public ArrayList method4129() {
		return this.field2331.field2409; // L: 103
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1013855235"
	)
	public String method4130() {
		return this.field2331.field2403; // L: 107
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1294460518"
	)
	public float[] method4131() {
		return this.field2331.field2410; // L: 111
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-19"
	)
	public String method4132() {
		return this.field2331.method4282(); // L: 115
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "876176854"
	)
	void method4143() {
		this.field2336 = null; // L: 119
	} // L: 120

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1355714398"
	)
	void method4138(UrlRequester var1) {
		if (this.field2336 != null && this.field2336.isDone()) { // L: 123
			byte[] var2 = this.field2336.getResponse(); // L: 126
			if (var2 == null) { // L: 127
				this.method4143(); // L: 128
				this.field2332 = 4; // L: 129
			} else {
				try {
					class494 var3 = new class494(var2); // L: 133
					JSONObject var4 = var3.method8849(); // L: 134
					if (var4 == null) { // L: 135
						return;
					}

					try {
						this.field2333 = var4.getInt("version"); // L: 137
					} catch (Exception var7) { // L: 139
						this.method4143(); // L: 140
						this.field2332 = 6; // L: 141
						return; // L: 142
					}

					if (this.field2333 < 2) { // L: 144
						if (!this.field2331.method4277(var4, this.field2333, var1)) { // L: 145
							this.field2332 = 6; // L: 146
						}
					} else if (this.field2333 == 2) { // L: 149
						class226 var5 = class226.field2423; // L: 152
						var5.method4317(var4, this.field2333, var1); // L: 155
						this.field2331 = var5.method4310(this.field2325); // L: 156
						if (this.field2331 != null) { // L: 157
							this.method4135(); // L: 158
							this.field2332 = 1; // L: 159
						} else {
							this.field2332 = 7; // L: 162
						}
					}
				} catch (UnsupportedEncodingException var8) { // L: 166
					this.method4143(); // L: 167
					this.field2332 = 6; // L: 168
					return; // L: 169
				}

				if (this.field2331 != null) { // L: 171
					this.field2332 = this.field2331.field2407.size() > 0 ? 1 : 2; // L: 172
				}

				this.field2336 = null; // L: 174
			}
		}
	} // L: 124 130 175

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1081327423"
	)
	void method4135() {
		Iterator var1 = this.field2331.field2407.iterator(); // L: 178

		class214 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2331.field2407.iterator(); // L: 186

				while (var1.hasNext()) {
					var2 = (class214)var1.next(); // L: 187
					if (var2.field2340 != null) { // L: 189
						byte[] var3 = var2.field2340.getResponse(); // L: 190
						if (var3 != null && var3.length > 0) { // L: 191
							this.field2332 = 2; // L: 192
							return; // L: 193
						}
					}
				}

				this.method4143(); // L: 198
				this.field2332 = 5; // L: 199
				return; // L: 200
			}

			var2 = (class214)var1.next(); // L: 179
		} while(var2.field2340 == null || var2.field2340.isDone()); // L: 181

	} // L: 182

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;S)Z",
		garbageValue = "-31567"
	)
	public boolean method4136(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new class494(var1.getBytes())).method8849(); // L: 204

			try {
				this.field2333 = var3.getInt("version"); // L: 206
			} catch (Exception var5) { // L: 208
				this.method4143(); // L: 209
				this.field2332 = 6; // L: 210
				return false; // L: 211
			}

			if (!this.field2331.method4277(var3, this.field2333, var2)) { // L: 213
				this.field2332 = 6; // L: 214
			}

			this.field2332 = this.field2331.field2407.size() > 0 ? 1 : 2; // L: 216
		} catch (UnsupportedEncodingException var6) { // L: 218
			this.field2332 = 6; // L: 219
		}

		return this.field2332 < 3; // L: 221
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(BI)Ljb;",
		garbageValue = "-1669252935"
	)
	public static class238 method4167(byte var0) {
		class238[] var1 = class238.field2508; // L: 40

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 41
			class238 var3 = var1[var2]; // L: 42
			if (var0 == var3.field2515) { // L: 44
				return var3; // L: 45
			}
		}

		throw new RuntimeException("Could not find MoveSpeed with ID " + var0); // L: 50
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "3284"
	)
	static final void method4134(boolean var0) {
		if (var0) { // L: 3267
			Client.field542 = Login.field924 ? class128.field1520 : class128.field1525; // L: 3268
		} else {
			Client.field542 = class105.clientPreferences.method2598(Login.Login_username) ? class128.field1524 : class128.field1519; // L: 3271
		}

	} // L: 3273
}
