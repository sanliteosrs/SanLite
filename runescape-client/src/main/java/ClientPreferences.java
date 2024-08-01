import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ap")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("an")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("aj")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("av")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2129688829
	)
	int field1308;
	@ObfuscatedName("ai")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1571776205
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 35823685
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -966473101
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2063082351
	)
	int field1304;
	@ObfuscatedName("ax")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -21294833
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -302803323
	)
	int field1313;
	@ObfuscatedName("ay")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1304 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.field1313 = 25;
		this.parameters = new LinkedHashMap();
		this.method2570(true); // L: 34
	} // L: 35

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1304 = -1; // L: 27
		this.rememberedUsername = null; // L: 28
		this.windowMode = 1; // L: 29
		this.field1313 = 25; // L: 30
		this.parameters = new LinkedHashMap(); // L: 31
		if (var1 != null && var1.array != null) { // L: 38
			int var2 = var1.readUnsignedByte(); // L: 42
			if (var2 >= 0 && var2 <= 11) { // L: 43
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) { // L: 64
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 65
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 73
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) { // L: 76
					this.field1304 = var1.readUnsignedByte(); // L: 77
				}

				if (var2 > 8) { // L: 79
					this.displayFps = var1.readUnsignedByte() == 1; // L: 80
				}

				if (var2 > 9) { // L: 82
					this.field1308 = var1.readInt(); // L: 83
				}

				if (var2 > 10) { // L: 85
					this.field1313 = var1.readUnsignedByte(); // L: 86
				}
			} else {
				this.method2570(true); // L: 44
			}
		} else {
			this.method2570(true); // L: 39
		}

	} // L: 90

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1781534199"
	)
	void method2570(boolean var1) {
	} // L: 92

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lvp;",
		garbageValue = "-1490151941"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(418, true); // L: 95
		var1.writeByte(11); // L: 96
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 97
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 98
		var1.writeByte(this.windowMode); // L: 99
		var1.writeByte(this.parameters.size()); // L: 100
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 101

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 102
			var1.writeInt((Integer)var3.getKey()); // L: 104
			var1.writeInt((Integer)var3.getValue()); // L: 105
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 108
		var1.writeBoolean(this.hideUsername); // L: 109
		var1.writeByte((int)(this.brightness * 100.0D)); // L: 110
		var1.writeByte(this.musicVolume); // L: 111
		var1.writeByte(this.soundEffectsVolume); // L: 112
		var1.writeByte(this.areaSoundEffectsVolume); // L: 113
		var1.writeByte(this.field1304); // L: 114
		var1.writeByte(this.displayFps ? 1 : 0); // L: 115
		var1.writeInt(this.field1308); // L: 116
		var1.writeByte(this.field1313); // L: 117
		return var1; // L: 118
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1002772130"
	)
	void method2572(boolean var1) {
		this.roofsHidden = var1; // L: 138
		class133.savePreferences(); // L: 139
	} // L: 140

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "5108"
	)
	boolean method2664() {
		return this.roofsHidden; // L: 143
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1481400295"
	)
	void method2630(boolean var1) {
		this.hideUsername = var1; // L: 147
		class133.savePreferences(); // L: 148
	} // L: 149

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "583089813"
	)
	boolean method2672() {
		return this.hideUsername; // L: 152
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "44"
	)
	void method2576(boolean var1) {
		this.titleMusicDisabled = var1; // L: 156
		class133.savePreferences(); // L: 157
	} // L: 158

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-33"
	)
	boolean method2602() {
		return this.titleMusicDisabled; // L: 161
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1501958614"
	)
	void method2642(boolean var1) {
		this.displayFps = var1; // L: 165
		class133.savePreferences(); // L: 166
	} // L: 167

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1888445289"
	)
	void method2579() {
		this.method2642(!this.displayFps); // L: 170
	} // L: 171

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1285799567"
	)
	boolean method2580() {
		return this.displayFps; // L: 174
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1510132892"
	)
	void method2657(int var1) {
		this.field1308 = var1; // L: 178
		class133.savePreferences(); // L: 179
	} // L: 180

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "14927"
	)
	int method2581() {
		return this.field1308; // L: 183
	}

	@ObfuscatedName("ax")
	void method2638(double var1) {
		this.brightness = var1; // L: 187
		class133.savePreferences(); // L: 188
	} // L: 189

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)D",
		garbageValue = "30058"
	)
	double method2578() {
		return this.brightness; // L: 192
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-104"
	)
	void method2590(int var1) {
		this.musicVolume = var1; // L: 196
		class133.savePreferences(); // L: 197
	} // L: 198

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16708"
	)
	int method2654() {
		return this.musicVolume; // L: 201
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1392527593"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 205
		class133.savePreferences(); // L: 206
	} // L: 207

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1379856607"
	)
	int method2588() {
		return this.soundEffectsVolume; // L: 210
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method2589(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 214
		class133.savePreferences(); // L: 215
	} // L: 216

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-764746946"
	)
	int method2618() {
		return this.areaSoundEffectsVolume; // L: 219
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "8"
	)
	void method2591(String var1) {
		this.rememberedUsername = var1; // L: 223
		class133.savePreferences(); // L: 224
	} // L: 225

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "116600886"
	)
	String method2592() {
		return this.rememberedUsername; // L: 228
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1663331385"
	)
	void method2593(int var1) {
		this.field1304 = var1; // L: 232
		class133.savePreferences(); // L: 233
	} // L: 234

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2067078598"
	)
	int method2594() {
		return this.field1304; // L: 237
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "152492609"
	)
	void method2595(int var1) {
		this.windowMode = var1; // L: 241
		class133.savePreferences(); // L: 242
	} // L: 243

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1926292063"
	)
	int method2623() {
		return this.windowMode; // L: 246
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "49"
	)
	void method2597(String var1, int var2) {
		int var3 = this.method2600(var1); // L: 250
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 251
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 252
			var4.next(); // L: 253
			var4.remove(); // L: 254
		}

		this.parameters.put(var3, var2); // L: 256
		class133.savePreferences(); // L: 257
	} // L: 258

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1515420889"
	)
	boolean method2598(String var1) {
		int var2 = this.method2600(var1); // L: 261
		return this.parameters.containsKey(var2); // L: 262
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1840611241"
	)
	int method2599(String var1) {
		int var2 = this.method2600(var1); // L: 266
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 267 268 270
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1923893280"
	)
	int method2600(String var1) {
		return ViewportMouse.method5905(var1.toLowerCase()); // L: 274
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-68376821"
	)
	void method2601(int var1) {
		this.field1313 = var1; // L: 278
		WorldMapArea.method4700(); // L: 279
		class133.savePreferences(); // L: 280
	} // L: 281

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-973938080"
	)
	int method2569() {
		return this.field1313; // L: 284
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "-830757872"
	)
	static void method2674(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 47
			int var4 = (var3 + var2) / 2; // L: 48
			int var5 = var2; // L: 49
			String var6 = var0[var4]; // L: 50
			var0[var4] = var0[var3]; // L: 51
			var0[var3] = var6; // L: 52
			int var7 = var1[var4]; // L: 53
			var1[var4] = var1[var3]; // L: 54
			var1[var3] = var7; // L: 55

			for (int var8 = var2; var8 < var3; ++var8) { // L: 56
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 57
					String var9 = var0[var8]; // L: 58
					var0[var8] = var0[var5]; // L: 59
					var0[var5] = var9; // L: 60
					int var10 = var1[var8]; // L: 61
					var1[var8] = var1[var5]; // L: 62
					var1[var5++] = var10; // L: 63
				}
			}

			var0[var3] = var0[var5]; // L: 67
			var0[var5] = var6; // L: 68
			var1[var3] = var1[var5]; // L: 69
			var1[var5] = var7; // L: 70
			method2674(var0, var1, var2, var5 - 1); // L: 71
			method2674(var0, var1, var5 + 1, var3); // L: 72
		}

	} // L: 74
}
