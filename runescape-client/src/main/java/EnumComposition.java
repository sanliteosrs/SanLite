import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("fe")
	static String field2006;
	@ObfuscatedName("v")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("x")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("m")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1478484323
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1015031679
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("r")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("u")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("b")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "-2074495591"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IS)V",
		garbageValue = "8918"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-585138184"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljf;",
		garbageValue = "-1969198767"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3218, ServerPacket.field3217, ServerPacket.field3294, ServerPacket.field3186, ServerPacket.field3197, ServerPacket.field3188, ServerPacket.field3185, ServerPacket.field3190, ServerPacket.field3191, ServerPacket.field3208, ServerPacket.field3193, ServerPacket.field3194, ServerPacket.field3195, ServerPacket.field3262, ServerPacket.field3271, ServerPacket.field3198, ServerPacket.field3199, ServerPacket.field3200, ServerPacket.field3201, ServerPacket.field3230, ServerPacket.field3196, ServerPacket.field3204, ServerPacket.field3274, ServerPacket.field3206, ServerPacket.field3272, ServerPacket.field3183, ServerPacket.field3209, ServerPacket.field3210, ServerPacket.field3211, ServerPacket.field3212, ServerPacket.field3205, ServerPacket.field3214, ServerPacket.field3202, ServerPacket.field3270, ServerPacket.field3187, ServerPacket.field3280, ServerPacket.field3219, ServerPacket.field3213, ServerPacket.field3221, ServerPacket.field3222, ServerPacket.field3223, ServerPacket.field3224, ServerPacket.field3251, ServerPacket.field3226, ServerPacket.field3227, ServerPacket.field3184, ServerPacket.field3229, ServerPacket.field3242, ServerPacket.field3231, ServerPacket.field3232, ServerPacket.field3192, ServerPacket.field3257, ServerPacket.field3235, ServerPacket.field3236, ServerPacket.field3237, ServerPacket.field3256, ServerPacket.field3216, ServerPacket.field3240, ServerPacket.field3241, ServerPacket.field3239, ServerPacket.field3243, ServerPacket.field3244, ServerPacket.field3245, ServerPacket.field3246, ServerPacket.field3247, ServerPacket.field3266, ServerPacket.field3285, ServerPacket.field3234, ServerPacket.field3249, ServerPacket.field3225, ServerPacket.field3253, ServerPacket.field3254, ServerPacket.field3255, ServerPacket.field3207, ServerPacket.field3248, ServerPacket.field3258, ServerPacket.field3264, ServerPacket.field3260, ServerPacket.field3261, ServerPacket.field3299, ServerPacket.field3263, ServerPacket.field3238, ServerPacket.field3265, ServerPacket.field3259, ServerPacket.field3267, ServerPacket.field3268, ServerPacket.field3269, ServerPacket.field3286, ServerPacket.field3203, ServerPacket.field3215, ServerPacket.field3287, ServerPacket.field3228, ServerPacket.field3275, ServerPacket.field3276, ServerPacket.field3277, ServerPacket.field3278, ServerPacket.field3279, ServerPacket.field3273, ServerPacket.field3281, ServerPacket.field3282, ServerPacket.field3283, ServerPacket.field3284, ServerPacket.field3252, ServerPacket.field3233, ServerPacket.field3250, ServerPacket.field3288, ServerPacket.field3289, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.field3292, ServerPacket.field3293, ServerPacket.field3189, ServerPacket.field3295, ServerPacket.field3296, ServerPacket.field3297}; // L: 124
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-850113409"
	)
	public static String method3650(byte[] var0) {
		int var2 = var0.length; // L: 59
		StringBuilder var3 = new StringBuilder(); // L: 61

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) { // L: 62
			int var5 = var0[var4] & 255; // L: 63
			var3.append(class359.field4350[var5 >>> 2]); // L: 64
			if (var4 < var2 - 1) { // L: 65
				int var6 = var0[var4 + 1] & 255; // L: 66
				var3.append(class359.field4350[(var5 & 3) << 4 | var6 >>> 4]); // L: 67
				if (var4 < var2 - 2) { // L: 68
					int var7 = var0[var4 + 2] & 255; // L: 69
					var3.append(class359.field4350[(var6 & 15) << 2 | var7 >>> 6]).append(class359.field4350[var7 & 63]); // L: 70
				} else {
					var3.append(class359.field4350[(var6 & 15) << 2]).append("="); // L: 72
				}
			} else {
				var3.append(class359.field4350[(var5 & 3) << 4]).append("=="); // L: 74
			}
		}

		String var1 = var3.toString(); // L: 76
		return var1; // L: 78
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrw;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 100
			var2 = (RunException)var0; // L: 101
			var2.message = var2.message + ' ' + var1; // L: 102
		} else {
			var2 = new RunException(var0, var1); // L: 104
		}

		return var2; // L: 105
	}
}
