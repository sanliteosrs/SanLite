import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public class class506 extends Node implements class115 {
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1443411709
	)
	public int field5095;
	@ObfuscatedName("bg")
	boolean field5096;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -848330753
	)
	int field5097;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 667260975
	)
	int field5115;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1469332107
	)
	int field5099;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -485504683
	)
	int field5100;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 880016047
	)
	int field5090;
	@ObfuscatedName("bw")
	boolean field5102;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1454507281
	)
	int field5108;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -439330597
	)
	int field5101;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1024146357
	)
	int field5105;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 839691755
	)
	int field5106;
	@ObfuscatedName("bh")
	String field5107;
	@ObfuscatedName("bq")
	String field5104;
	@ObfuscatedName("bd")
	String field5103;
	@ObfuscatedName("bz")
	String field5110;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1722479495
	)
	int field5113;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -2146477359
	)
	int field5112;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2145527819
	)
	int field5089;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1429426761
	)
	int field5114;
	@ObfuscatedName("cv")
	String field5091;
	@ObfuscatedName("cl")
	String field5116;
	@ObfuscatedName("cm")
	int[] field5118;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 722566405
	)
	int field5117;
	@ObfuscatedName("cu")
	String field5119;
	@ObfuscatedName("cn")
	String field5120;

	class506(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field5118 = new int[3]; // L: 66
		this.field5095 = var1; // L: 73
		this.field5096 = var2; // L: 74
		this.field5097 = var3; // L: 75
		this.field5115 = var4; // L: 76
		this.field5099 = var5; // L: 77
		this.field5100 = var6; // L: 78
		this.field5090 = var7; // L: 79
		this.field5102 = var8; // L: 80
		this.field5108 = var9; // L: 81
		this.field5101 = var10; // L: 82
		this.field5105 = var11; // L: 83
		this.field5106 = var12; // L: 84
		this.field5107 = var13; // L: 85
		this.field5104 = var14; // L: 86
		this.field5103 = var15; // L: 87
		this.field5110 = var16; // L: 88
		this.field5113 = var17; // L: 89
		this.field5112 = var18; // L: 90
		this.field5089 = var19; // L: 91
		this.field5114 = var20; // L: 92
		this.field5091 = var21; // L: 93
		this.field5116 = var22; // L: 94
		this.field5118 = var23; // L: 95
		this.field5117 = var24; // L: 96
		this.field5119 = var25; // L: 97
		this.field5120 = var26; // L: 98
	} // L: 99

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1687880854"
	)
	public void method8929(Buffer var1) {
		var1.writeByte(9); // L: 102
		var1.writeByte(this.field5095); // L: 103
		var1.writeByte(this.field5096 ? 1 : 0); // L: 104
		var1.writeShort(this.field5097); // L: 105
		var1.writeByte(this.field5115); // L: 106
		var1.writeByte(this.field5099); // L: 107
		var1.writeByte(this.field5100); // L: 108
		var1.writeByte(this.field5090); // L: 109
		var1.writeByte(this.field5102 ? 1 : 0); // L: 110
		var1.writeShort(this.field5108); // L: 111
		var1.writeByte(this.field5101); // L: 112
		var1.method9542(this.field5105); // L: 113
		var1.writeShort(this.field5106); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field5107); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field5104); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field5103); // L: 117
		var1.writeStringCp1252NullCircumfixed(this.field5110); // L: 118
		var1.writeByte(this.field5112); // L: 119
		var1.writeShort(this.field5113); // L: 120
		var1.writeStringCp1252NullCircumfixed(this.field5091); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field5116); // L: 122
		var1.writeByte(this.field5089); // L: 123
		var1.writeByte(this.field5114); // L: 124

		for (int var2 = 0; var2 < this.field5118.length; ++var2) { // L: 125
			var1.writeInt(this.field5118[var2]);
		}

		var1.writeInt(this.field5117); // L: 126
		var1.writeStringCp1252NullCircumfixed(this.field5119); // L: 127
		var1.writeStringCp1252NullCircumfixed(this.field5120); // L: 128
	} // L: 129

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method8934() {
		byte var1 = 39; // L: 132
		String var4 = this.field5107; // L: 135
		int var3 = var4.length() + 2; // L: 137
		int var26 = var3 + var1; // L: 139
		String var7 = this.field5104; // L: 142
		int var6 = var7.length() + 2; // L: 144
		var26 += var6; // L: 146
		String var10 = this.field5103; // L: 149
		int var9 = var10.length() + 2; // L: 151
		var26 += var9; // L: 153
		String var13 = this.field5110; // L: 156
		int var12 = var13.length() + 2; // L: 158
		var26 += var12; // L: 160
		String var16 = this.field5091; // L: 163
		int var15 = var16.length() + 2; // L: 165
		var26 += var15; // L: 167
		String var19 = this.field5116; // L: 170
		int var18 = var19.length() + 2; // L: 172
		var26 += var18; // L: 174
		String var22 = this.field5119; // L: 177
		int var21 = var22.length() + 2;
		var26 += var21;
		String var25 = this.field5120;
		int var24 = var25.length() + 2;
		var26 += var24;
		return var26; // L: 189
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1007469139"
	)
	public String method8931(int var1) {
		String var2 = "";
		String var3 = "12345678-0000-0000-0000-123456789012";
		switch(var1) {
		case 1:
			var2 = "wmic csproduct get UUID"; // L: 210
			break;
		case 2:
			var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'"; // L: 203
			break; // L: 204
		case 3:
			var2 = "cat /etc/machine-id"; // L: 198
			break; // L: 199
		default:
			return "Unknown"; // L: 207
		}

		try {
			Process var4 = Runtime.getRuntime().exec(var2); // L: 215
			BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream())); // L: 216
			StringBuilder var6 = new StringBuilder(); // L: 217

			String var7;
			while ((var7 = var5.readLine()) != null) { // L: 219
				var6.append(var7 + "\n"); // L: 220
			}

			if (var1 == 1) { // L: 222
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim(); // L: 223
			} else if (var1 == 2) { // L: 225
				int var8 = var6.indexOf("UUID: ") + 36; // L: 226
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", ""); // L: 227
			} else if (var1 == 3) { // L: 229
				if (var6.length() == 33) { // L: 230
					var6 = new StringBuilder(var6.substring(0, var6.length() - 1)); // L: 231
				}

				if (var6.length() == 32) { // L: 233
					var6.insert(20, "-"); // L: 234
					var6.insert(16, "-"); // L: 235
					var6.insert(12, "-"); // L: 236
					var6.insert(8, "-"); // L: 237
					var3 = var6.toString(); // L: 238
				} else {
					var3 = "12345678-0000-0000-0000-123456789012"; // L: 241
				}
			}
		} catch (IOException var9) { // L: 245
		}

		return var3; // L: 246
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZS)V",
		garbageValue = "9342"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 178
			int var6 = (var0 + var1) / 2; // L: 179
			int var7 = var0; // L: 180
			World var8 = class357.World_worlds[var6]; // L: 181
			class357.World_worlds[var6] = class357.World_worlds[var1]; // L: 182
			class357.World_worlds[var1] = var8; // L: 183

			for (int var9 = var0; var9 < var1; ++var9) { // L: 184
				if (class76.method2162(class357.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 185
					World var10 = class357.World_worlds[var9]; // L: 186
					class357.World_worlds[var9] = class357.World_worlds[var7]; // L: 187
					class357.World_worlds[var7++] = var10; // L: 188
				}
			}

			class357.World_worlds[var1] = class357.World_worlds[var7]; // L: 192
			class357.World_worlds[var7] = var8; // L: 193
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 194
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 195
		}

	} // L: 197
}
