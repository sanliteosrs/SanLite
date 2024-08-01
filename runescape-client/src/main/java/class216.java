import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class216 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "122"
	)
	public static void method4191(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			var0 = var0 + "-" + var1; // L: 41
		}

		class16.idxCount = var4;
		JagexCache.cacheGamebuild = var3;

		try {
			JagexCache.field2355 = System.getProperty("os.name");
		} catch (Exception var17) {
			JagexCache.field2355 = "Unknown";
		}

		HealthBarUpdate.field1270 = JagexCache.field2355.toLowerCase();
		class74.userHomeDirectory = null;

		try {
			class74.userHomeDirectory = System.getProperty("jagex.userhome"); // L: 54
		} catch (Exception var16) { // L: 56
		}

		if (class74.userHomeDirectory == null) { // L: 57
			try {
				class74.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var15) { // L: 60
			}
		}

		if (class74.userHomeDirectory != null) { // L: 61
			class74.userHomeDirectory = class74.userHomeDirectory + "/";
		}

		try {
			if (HealthBarUpdate.field1270.startsWith("win")) { // L: 63
				if (class74.userHomeDirectory == null) { // L: 64
					class74.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class74.userHomeDirectory == null) { // L: 67
				class74.userHomeDirectory = System.getenv("HOME");
			}

			if (class74.userHomeDirectory != null) { // L: 69
				class74.userHomeDirectory = class74.userHomeDirectory + "/";
			}
		} catch (Exception var14) { // L: 71
		}

		if (class74.userHomeDirectory == null) { // L: 72
			class74.userHomeDirectory = "~/";
		}

		class147.field1695 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class74.userHomeDirectory, "/tmp/", ""}; // L: 73
		class87.field1073 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild}; // L: 74
		int var10 = 0;

		label147:
		while (var10 < 4) {
			class214.cacheDir = SoundSystem.method875(var0, var2, var10); // L: 76
			if (!class214.cacheDir.exists()) { // L: 77
				class214.cacheDir.mkdirs();
			}

			File[] var6 = class214.cacheDir.listFiles(); // L: 78
			if (var6 == null) { // L: 79
				break;
			}

			File[] var7 = var6; // L: 81
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label147;
				}

				File var9 = var7[var8]; // L: 83
				if (!class159.method3418(var9, false)) { // L: 85
					++var10; // L: 75
					break;
				}

				++var8; // L: 82
			}
		}

		class104.method2770(class214.cacheDir); // L: 92

		try {
			File var5 = new File(class74.userHomeDirectory, "random.dat"); // L: 95
			int var12;
			if (var5.exists()) { // L: 96
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0); // L: 97
			} else {
				label129:
				for (int var11 = 0; var11 < class87.field1073.length; ++var11) { // L: 100
					for (var12 = 0; var12 < class147.field1695.length; ++var12) { // L: 101
						File var13 = new File(class147.field1695[var12] + class87.field1073[var11] + File.separatorChar + "random.dat"); // L: 102
						if (var13.exists()) { // L: 103
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var13, "rw", 25L), 24, 0); // L: 104
							break label129; // L: 105
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 110
				RandomAccessFile var19 = new RandomAccessFile(var5, "rw"); // L: 111
				var12 = var19.read(); // L: 112
				var19.seek(0L); // L: 113
				var19.write(var12); // L: 114
				var19.seek(0L); // L: 115
				var19.close(); // L: 116
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0); // L: 117
			}
		} catch (IOException var18) { // L: 120
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class251.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 122
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class251.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 123
		class163.JagexCache_idxFiles = new BufferedFile[class16.idxCount]; // L: 124

		for (var10 = 0; var10 < class16.idxCount; ++var10) { // L: 125
			class163.JagexCache_idxFiles[var10] = new BufferedFile(new AccessFile(class251.getFile("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0); // L: 126
		}

	} // L: 128

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILvp;B)Lgz;",
		garbageValue = "16"
	)
	public static class172 method4192(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class172 var5 = new class172(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1845 != null && var7.length == var5.field1845.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1845[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1846 != null && var7.length == var5.field1846.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1846[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "56"
	)
	public static int method4190(int var0) {
		if (var0 > 0) { // L: 230
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 231 232
		}
	}
}
