import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class229 implements class29 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	Widget field2437;
	@ObfuscatedName("ad")
	boolean field2435;
	@ObfuscatedName("ag")
	boolean field2436;

	public class229() {
		this.field2437 = null; // L: 14
		this.field2435 = false; // L: 15
		this.field2436 = false; // L: 16
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1607404438"
	)
	public boolean vmethod4396(int var1) {
		if (this.field2437 == null) { // L: 60
			return false;
		} else {
			class27 var2 = this.field2437.method6940(); // L: 61
			if (var2 == null) { // L: 62
				return false;
			} else {
				if (var2.method398(var1)) {
					switch(var1) { // L: 64
					case 81:
						this.field2436 = true; // L: 66
						break;
					case 82:
						this.field2435 = true; // L: 69
						break; // L: 70
					default:
						if (this.method4354(var1)) { // L: 72
							TriBool.invalidateWidget(this.field2437); // L: 73
						}
					}
				}

				return var2.method396(var1); // L: 78
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "20"
	)
	public boolean vmethod4375(int var1) {
		switch(var1) { // L: 82
		case 81:
			this.field2436 = false; // L: 84
			return false; // L: 85
		case 82:
			this.field2435 = false; // L: 87
			return false; // L: 88
		default:
			return false; // L: 90
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-502375958"
	)
	public boolean vmethod4378(char var1) {
		if (this.field2437 == null) { // L: 94
			return false;
		} else if (!class212.method4116(var1)) { // L: 95
			return false;
		} else {
			class356 var2 = this.field2437.method6991(); // L: 96
			if (var2 != null && var2.method6640()) { // L: 97
				class27 var3 = this.field2437.method6940(); // L: 98
				if (var3 == null) {
					return false; // L: 99
				} else {
					if (var3.method399(var1) && var2.method6601(var1)) { // L: 100 101
						TriBool.invalidateWidget(this.field2437); // L: 102
					}

					return var3.method397(var1); // L: 105
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZS)Z",
		garbageValue = "13173"
	)
	public boolean vmethod4380(boolean var1) {
		return false; // L: 109
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "-1386535715"
	)
	public void method4347(Widget var1) {
		if (var1 != null) { // L: 19
			if (var1 != this.field2437) { // L: 20
				this.method4349(); // L: 21
				this.field2437 = var1; // L: 22
			}

			class354 var2 = var1.method6892(); // L: 24
			if (var2 != null) { // L: 25
				if (!var2.field3767.method6635() && var2.field3768 != null) { // L: 26
					ScriptEvent var3 = new ScriptEvent(); // L: 27
					var3.method2378(var1); // L: 28
					var3.setArgs(var2.field3768); // L: 29
					Varps.method6447().addFirst(var3); // L: 30
				}

				var2.field3767.method6763(true); // L: 32
			}
		} else {
			this.method4349(); // L: 36
		}

	} // L: 38

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lnx;",
		garbageValue = "-124"
	)
	public Widget method4348() {
		return this.field2437; // L: 41
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "721760752"
	)
	public void method4349() {
		if (this.field2437 != null) { // L: 45
			class354 var1 = this.field2437.method6892(); // L: 46
			Widget var2 = this.field2437; // L: 47
			this.field2437 = null; // L: 48
			if (var1 != null) { // L: 49
				if (var1.field3767.method6635() && var1.field3768 != null) { // L: 50
					ScriptEvent var3 = new ScriptEvent(); // L: 51
					var3.method2378(var2); // L: 52
					var3.setArgs(var1.field3768); // L: 53
					Varps.method6447().addFirst(var3); // L: 54
				}

				var1.field3767.method6763(false); // L: 56
			}
		}
	} // L: 57

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "6"
	)
	boolean method4354(int var1) {
		if (this.field2437 == null) { // L: 113
			return false;
		} else {
			class356 var2 = this.field2437.method6991(); // L: 114
			if (var2 != null && var2.method6640()) { // L: 115
				Clipboard var5;
				switch(var1) { // L: 116
				case 13:
					this.method4349(); // L: 202
					return true; // L: 203
				case 48:
					if (this.field2435) { // L: 249
						var2.method6654(); // L: 250
					}

					return true; // L: 252
				case 65:
					if (this.field2435) { // L: 205
						var5 = class415.client.method490(); // L: 209
						var2.method6626(var5); // L: 211
					}

					return true; // L: 213
				case 66:
					if (this.field2435) { // L: 184
						var5 = class415.client.method490(); // L: 188
						var2.method6625(var5); // L: 190
					}

					return true; // L: 192
				case 67:
					if (this.field2435) { // L: 166
						var5 = class415.client.method490(); // L: 170
						var2.method6748(var5); // L: 172
					}

					return true; // L: 174
				case 84:
					if (var2.method6784() == 0) { // L: 223
						var2.method6601(10);
					} else if (this.field2436 && var2.method6650()) {
						var2.method6601(10);
					} else {
						class354 var3 = this.field2437.method6892();
						ScriptEvent var4 = new ScriptEvent(); // L: 232
						var4.method2378(this.field2437);
						var4.setArgs(var3.field3769);
						Varps.method6447().addFirst(var4); // L: 235
						this.method4349();
					}

					return true; // L: 239
				case 85:
					if (this.field2435) { // L: 215
						var2.method6604(); // L: 216
					} else {
						var2.method6786(); // L: 219
					}

					return true; // L: 221
				case 96:
					if (this.field2435) { // L: 126
						var2.method6615(this.field2436); // L: 127
					} else {
						var2.method6765(this.field2436); // L: 130
					}

					return true; // L: 132
				case 97:
					if (this.field2435) { // L: 118
						var2.method6602(this.field2436); // L: 119
					} else {
						var2.method6614(this.field2436); // L: 122
					}

					return true; // L: 124
				case 98:
					if (this.field2435) { // L: 194
						var2.method6634(); // L: 195
					} else {
						var2.method6794(this.field2436); // L: 198
					}

					return true; // L: 200
				case 99:
					if (this.field2435) { // L: 158
						var2.method6629(); // L: 159
					} else {
						var2.method6618(this.field2436); // L: 162
					}

					return true; // L: 164
				case 101:
					if (this.field2435) { // L: 134
						var2.method6582(); // L: 135
					} else {
						var2.method6603(); // L: 138
					}

					return true; // L: 140
				case 102:
					if (this.field2435) { // L: 176
						var2.method6793(this.field2436); // L: 177
					} else {
						var2.method6609(this.field2436); // L: 180
					}

					return true; // L: 182
				case 103:
					if (this.field2435) { // L: 150
						var2.method6612(this.field2436); // L: 151
					} else {
						var2.method6610(this.field2436); // L: 154
					}

					return true; // L: 156
				case 104:
					if (this.field2435) { // L: 142
						var2.method6607(this.field2436); // L: 143
					} else {
						var2.method6619(this.field2436); // L: 146
					}

					return true; // L: 148
				case 105:
					if (this.field2435) { // L: 241
						var2.method6622(this.field2436); // L: 242
					} else {
						var2.method6742(this.field2436); // L: 245
					}

					return true; // L: 247
				default:
					return false; // L: 254
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "11316396"
	)
	static void method4371(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 224
			Buffer var3 = new Buffer(500); // L: 225
			var3.writeByte(3); // L: 226
			var3.writeByte(var1 != null ? 1 : 0); // L: 227
			var3.writeCESU8(var0.getPath()); // L: 228
			if (var1 != null) {
				var3.writeCESU8(""); // L: 229
			}

			var2.write(var3.array, 0, var3.offset); // L: 230
			var2.close(); // L: 231
		} catch (IOException var4) { // L: 233
			var4.printStackTrace(); // L: 234
		}

	} // L: 236

	@ObfuscatedName("ap")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 63
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1394811142"
	)
	static long method4372() {
		return Client.field630; // L: 3128
	}
}
