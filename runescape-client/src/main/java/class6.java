import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public enum class6 implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	field8(0, 0);

	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1652758699
	)
	public final int field9;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1203425959
	)
	final int field7;

	class6(int var3, int var4) {
		this.field9 = var3; // L: 16
		this.field7 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field7; // L: 22
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lhc;",
		garbageValue = "993535951"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamComposition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)I",
		garbageValue = "-10898"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 137
		int var2 = 0; // L: 138

		for (int var3 = 0; var3 < var1; ++var3) { // L: 139
			var2 = (var2 << 5) - var2 + class147.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 140
	}
}
