import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("aq")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ad")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ag")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lde;[BIIIIIIIIIB)V",
		garbageValue = "14"
	)
	static final void method4224(class101 var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.field1317; // L: 113
		int var13;
		if (var11 != null) { // L: 114
			for (int var12 = 0; var12 < 8; ++var12) { // L: 115
				for (var13 = 0; var13 < 8; ++var13) { // L: 116
					if (var3 + var12 > 0 && var3 + var12 < var11[var2].flags.length && var13 + var4 > 0 && var13 + var4 < var11[var2].flags[var3 + var12].length) { // L: 117
						int[] var10000 = var11[var2].flags[var3 + var12];
						var10000[var4 + var13] &= -1073741825;
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1); // L: 121

		for (var13 = 0; var13 < 4; ++var13) { // L: 122
			for (int var14 = 0; var14 < 64; ++var14) { // L: 123
				for (int var15 = 0; var15 < 64; ++var15) { // L: 124
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) { // L: 125
						int var16 = var3 + MusicPatchPcmStream.method6418(var14 & 7, var15 & 7, var8); // L: 126
						int var19 = var14 & 7; // L: 129
						int var20 = var15 & 7; // L: 130
						int var21 = var8 & 3; // L: 133
						int var18;
						if (var21 == 0) { // L: 134
							var18 = var20; // L: 135
						} else if (var21 == 1) { // L: 138
							var18 = 7 - var19; // L: 139
						} else if (var21 == 2) { // L: 142
							var18 = 7 - var20; // L: 143
						} else {
							var18 = var19; // L: 146
						}

						int var22 = var18 + var4; // L: 148
						int var23 = var3 + (var14 & 7) + var9; // L: 149
						int var24 = var10 + (var15 & 7) + var4; // L: 150
						WorldMapSection1.method5043(var0, var25, var2, var16, var22, var23, var24, var8); // L: 151
					} else {
						WorldMapSection1.method5043(var0, var25, 0, -1, -1, 0, 0, 0); // L: 153
					}
				}
			}
		}

	} // L: 157

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIZIII)J",
		garbageValue = "690823104"
	)
	public static long method4223(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49; // L: 76
		if (var3) { // L: 77
			var6 |= 65536L;
		}

		return var6; // L: 78
	}
}
