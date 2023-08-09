import java.io.IOException;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class215 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class215 field2355;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class215 field2350;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public static final class215 field2349;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class215 field2352;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class215 field2353;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class215 field2354;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class215 field2351;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	static final class215[] field2359;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 536358973
	)
	final int field2356;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1985749061
	)
	public final int field2357;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1917948559
	)
	public final int field2358;

	static {
		field2355 = new class215(2, 8, 8); // L: 8
		field2350 = new class215(4, 16, 16); // L: 9
		field2349 = new class215(1, 32, 32); // L: 10
		field2352 = new class215(0, 48, 48); // L: 11
		field2353 = new class215(6, 64, 64); // L: 12
		field2354 = new class215(5, 96, 96);
		field2351 = new class215(3, 128, 128);
		field2359 = UserComparator9.method2896();
		Arrays.sort(field2359, new class220());
	}

	class215(int var1, int var2, int var3) {
		this.field2356 = var1;
		this.field2357 = var2; // L: 30
		this.field2358 = var3; // L: 31
	} // L: 32

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-9015084"
	)
	int method4222() {
		return this.field2357 * this.field2358;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-2129316412"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 13
			int var4 = (var3 + var2) / 2; // L: 14
			int var5 = var2; // L: 15
			String var6 = var0[var4]; // L: 16
			var0[var4] = var0[var3]; // L: 17
			var0[var3] = var6; // L: 18
			short var7 = var1[var4]; // L: 19
			var1[var4] = var1[var3]; // L: 20
			var1[var3] = var7; // L: 21

			for (int var8 = var2; var8 < var3; ++var8) { // L: 22
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 23
					String var9 = var0[var8]; // L: 24
					var0[var8] = var0[var5]; // L: 25
					var0[var5] = var9; // L: 26
					short var10 = var1[var8]; // L: 27
					var1[var8] = var1[var5]; // L: 28
					var1[var5++] = var10; // L: 29
				}
			}

			var0[var3] = var0[var5]; // L: 33
			var0[var5] = var6; // L: 34
			var1[var3] = var1[var5]; // L: 35
			var1[var5] = var7; // L: 36
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 37
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 38
		}

	} // L: 40

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1689417395"
	)
	public static byte[] method4223() {
		byte[] var0 = new byte[24]; // L: 325

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 327
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 328

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 329 330 331
			}

			if (var1 >= 24) { // L: 333
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 336
				var0[var2] = -1;
			}
		}

		return var0; // L: 338
	}
}
