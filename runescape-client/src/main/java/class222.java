import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("in")
public class class222 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class222 field2393;
	@ObfuscatedName("aq")
	String field2388;
	@ObfuscatedName("ad")
	String field2394;
	@ObfuscatedName("ag")
	String field2381;
	@ObfuscatedName("ak")
	String field2382;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 5566748389036813035L
	)
	long field2383;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class14 field2384;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	class18 field2385;
	@ObfuscatedName("av")
	final int field2386;
	@ObfuscatedName("ab")
	final int field2387;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1131252391
	)
	int field2391;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1825791855
	)
	int field2389;
	@ObfuscatedName("ac")
	String field2392;
	@ObfuscatedName("ay")
	boolean field2380;

	static {
		field2393 = new class222(); // L: 30
	}

	class222() {
		this.field2388 = ""; // L: 14
		this.field2394 = ""; // L: 15
		this.field2381 = ""; // L: 16
		this.field2382 = ""; // L: 17
		this.field2383 = -1L; // L: 18
		this.field2386 = 1; // L: 21
		this.field2387 = 2; // L: 22
		this.field2391 = 1; // L: 23
		this.field2389 = 0; // L: 28
	} // L: 33

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2051417236"
	)
	public void method4244(int var1, String var2) {
		this.field2389 = var1; // L: 40
		this.field2392 = var2; // L: 41
	} // L: 42

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1200789998"
	)
	public void method4268(boolean var1) {
		this.field2380 = var1; // L: 45
		this.field2384 = new class14("crmsession", 1, 1); // L: 46
	} // L: 47

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1863245478"
	)
	void method4265(String var1, String var2, String var3) {
		if (this.field2391 != 2) { // L: 50
			this.field2388 = var1; // L: 51
			this.field2394 = var2; // L: 52
			this.field2381 = var3; // L: 53
			if (!this.field2388.endsWith("/")) { // L: 54
				this.field2388 = this.field2388 + "/"; // L: 55
			}

			if (!this.field2394.equals("")) { // L: 57
				String var4 = this.field2388; // L: 60
				var4 = var4 + "session/open/" + this.field2394; // L: 61
				if (this.field2381.equals("")) { // L: 62
				}

				var4 = var4 + "?userHash=" + this.field2381; // L: 63

				try {
					this.field2385 = this.method4251(var4); // L: 65
					this.field2383 = WorldMapData_1.method4861(); // L: 66
				} catch (IOException var6) { // L: 68
					this.field2385 = null; // L: 69
					this.field2394 = ""; // L: 70
					this.field2381 = ""; // L: 71
				}

			}
		}
	} // L: 58 73

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	public void method4247() {
		if (this.field2385 == null) { // L: 76
			if (!this.field2382.isEmpty() && this.field2391 == 1) { // L: 79
				long var1 = WorldMapData_1.method4861(); // L: 80
				long var3 = var1 - this.field2383; // L: 81
				String var5 = this.field2388; // L: 82
				var5 = var5 + "session/close/" + this.field2394 + "/" + this.field2382; // L: 83
				if (this.field2381.isEmpty()) { // L: 84
					var5 = var5 + "?sessionDuration=" + var3; // L: 85
				} else {
					var5 = var5 + "?userHash=" + this.field2381 + "&sessionDuration=" + var3; // L: 88
				}

				try {
					this.field2385 = this.method4251(var5); // L: 91
				} catch (IOException var7) { // L: 93
					this.field2391 = 1; // L: 94
				}
			}

		}
	} // L: 77 97

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1098012235"
	)
	public void method4248() {
		if (this.field2384 != null) { // L: 100
			this.field2384.method166();
		}

	} // L: 101

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-81"
	)
	void method4266() {
		if (!this.field2382.isEmpty()) { // L: 104
			String var1 = ""; // L: 105
			switch(this.field2389) { // L: 106
			case 1:
				var1 = "events/click"; // L: 111
				break; // L: 112
			case 2:
				var1 = "events/dismissed"; // L: 114
				break;
			case 3:
				var1 = "events/impression"; // L: 108
			}

			if (!this.field2392.isEmpty()) { // L: 119
				String var2 = this.field2388; // L: 122
				var2 = var2 + var1 + "/" + this.field2394 + "/" + this.field2382 + "/" + this.field2392 + "?userHash=" + this.field2381; // L: 123

				try {
					this.field2385 = this.method4251(var2); // L: 125
				} catch (IOException var4) { // L: 127
					this.field2391 = 1; // L: 128
				}

				this.field2391 = 1; // L: 130
				this.field2389 = 0; // L: 131
			}
		}
	} // L: 120 132

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method4261() {
		if (this.field2385 != null && this.field2385.method278()) { // L: 135
			if (this.field2385.method278() && this.field2385.method269().method288() == 200 && this.field2382.isEmpty()) { // L: 138 139 140
				String var1 = this.field2385.method269().method287(); // L: 141
				if (var1.isEmpty()) { // L: 142
					return; // L: 143
				}

				this.field2382 = var1; // L: 145
			}

			if (this.field2389 != 0) { // L: 150
				this.method4266(); // L: 151
			}

		}
	} // L: 136 153

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1205574720"
	)
	public boolean method4250(String var1) {
		this.method4244(2, var1); // L: 156
		return true; // L: 157
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lao;",
		garbageValue = "-576200562"
	)
	class18 method4251(String var1) throws IOException {
		URL var2 = new URL(var1); // L: 161
		class10 var3 = new class10(var2, class9.field41, this.field2380); // L: 162

		try {
			JSONObject var4 = new JSONObject(); // L: 164
			var3.method82(new class494(var4)); // L: 165
		} catch (Exception var5) { // L: 167
		}

		return this.field2384.method171(var3); // L: 168
	}
}
