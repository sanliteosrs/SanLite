import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public class class237 {
	@ObfuscatedName("aq")
	final int[][] field2504;
	@ObfuscatedName("ad")
	final int[][] field2505;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1097173409
	)
	int field2499;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2089582897
	)
	int field2501;
	@ObfuscatedName("ap")
	final int[] field2502;
	@ObfuscatedName("an")
	final int[] field2503;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1089320565
	)
	final int field2498;

	class237(int var1, int var2) {
		this.field2504 = new int[var1][var2]; // L: 15
		this.field2505 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = ModeWhere.method7432(var3 / 4);
		this.field2502 = new int[var4];
		this.field2503 = new int[var4];
		this.field2498 = var4 - 1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	void method4458() {
		for (int var1 = 0; var1 < this.field2504.length; ++var1) {
			for (int var2 = 0; var2 < this.field2504[var1].length; ++var2) {
				this.field2504[var1][var2] = 0;
				this.field2505[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-236310622"
	)
	void method4483(int var1, int var2) {
		this.field2499 = var1;
		this.field2501 = var2; // L: 35
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1995967385"
	)
	int method4494() {
		return this.field2499; // L: 39
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1237974561"
	)
	int method4461() {
		return this.field2501; // L: 43
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-811041119"
	)
	int method4462() {
		return this.field2504.length; // L: 47
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "8791890"
	)
	int method4463() {
		return this.field2504[0].length; // L: 51
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1979278840"
	)
	int[][] method4464() {
		return this.field2504; // L: 55
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-825886672"
	)
	int[][] method4465() {
		return this.field2505; // L: 59
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-85"
	)
	int[] method4466() {
		return this.field2502; // L: 63
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "0"
	)
	int[] method4467() {
		return this.field2503; // L: 67
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "3147131"
	)
	int method4468() {
		return this.field2498; // L: 71
	}

	@ObfuscatedName("aq")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 24 25 34
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var8 = class417.base37Table[(int)(var6 - 37L * var0)]; // L: 28
					if (var8 == '_') { // L: 29
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "114"
	)
	static void method4496() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 45
			if (var0.obj != null) { // L: 46
				var0.set();
			}
		}

	} // L: 48

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "892273350"
	)
	public static boolean method4469(int var0) {
		if (class330.field3585.isEmpty()) { // L: 217
			return false; // L: 221
		} else {
			class342 var1 = (class342)class330.field3585.get(0); // L: 218
			return var1 != null && var0 == var1.field3716; // L: 219
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lde;III)V",
		garbageValue = "512988626"
	)
	static final void method4498(class101 var0, int var1, int var2) {
		SceneTilePaint.method5915(var0, var0.field1318, var1, var2); // L: 9204
	} // L: 9205

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method4482() {
		if (class485.field5030 != null) { // L: 13522
			Client.field799 = Client.cycle; // L: 13523
			class485.field5030.method7379(); // L: 13524

			for (int var0 = 0; var0 < class511.field5137.field1326.length; ++var0) { // L: 13525
				if (class511.field5137.field1326[var0] != null) { // L: 13526
					class485.field5030.method7382((class511.field5137.field1326[var0].x >> 7) + class511.field5137.field1321, (class511.field5137.field1326[var0].field1191 >> 7) + class511.field5137.field1323); // L: 13527
				}
			}
		}

	} // L: 13531
}
