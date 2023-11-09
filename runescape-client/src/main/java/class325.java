import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class325 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "27"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 136
		int var4 = 0; // L: 137

		for (int var5 = 0; var5 < var2; ++var5) { // L: 138
			int var6 = var0[var5 + var1] & 255; // L: 139
			if (var6 != 0) { // L: 140
				if (var6 >= 128 && var6 < 160) { // L: 141
					char var7 = class384.cp1252AsciiExtension[var6 - 128]; // L: 142
					if (var7 == 0) { // L: 143
						var7 = '?';
					}

					var6 = var7; // L: 144
				}

				var3[var4++] = (char)var6; // L: 146
			}
		}

		return new String(var3, 0, var4); // L: 148
	}
}
