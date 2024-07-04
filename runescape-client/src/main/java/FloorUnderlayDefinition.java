import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public static AbstractArchive field2091;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field2086;
	@ObfuscatedName("fq")
	static boolean field2095;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1053245405
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1420791091
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1869653971
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -668914137
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 80434597
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		field2086 = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "752711410"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb); // L: 23
	} // L: 24

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "-926356188"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 28
			if (var3 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var3, var2); // L: 30
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;III)V",
		garbageValue = "-918995028"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 35
			this.rgb = var1.readMedium();
		}

	} // L: 37

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1286040524"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 40
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 41
		double var6 = (double)(var1 & 255) / 256.0D; // L: 42
		double var8 = var2; // L: 43
		if (var4 < var2) { // L: 44
			var8 = var4;
		}

		if (var6 < var8) { // L: 45
			var8 = var6;
		}

		double var10 = var2; // L: 46
		if (var4 > var2) { // L: 47
			var10 = var4;
		}

		if (var6 > var10) { // L: 48
			var10 = var6;
		}

		double var12 = 0.0D; // L: 49
		double var14 = 0.0D; // L: 50
		double var16 = (var8 + var10) / 2.0D; // L: 51
		if (var8 != var10) { // L: 52
			if (var16 < 0.5D) { // L: 53
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 54
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 55
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 56
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 57
			}
		}

		var12 /= 6.0D; // L: 59
		this.saturation = (int)(var14 * 256.0D); // L: 60
		this.lightness = (int)(256.0D * var16); // L: 61
		if (this.saturation < 0) { // L: 62
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 63
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 64
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 65
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 66
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(512.0D * var16 * var14); // L: 67
		}

		if (this.hueMultiplier < 1) { // L: 68
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 69
	} // L: 70

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfh;",
		garbageValue = "-2120703025"
	)
	static class133[] method3808() {
		return new class133[]{class133.field1565, class133.field1561, class133.field1562, class133.field1563, class133.field1564}; // L: 143
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "8"
	)
	static void method3799(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 13436
		if (Client.randomDatData == null) { // L: 13438
			Client.randomDatData = new byte[24];
		}

		class447.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 13439
		SequenceDefinition.method4093(var0, var1); // L: 13441
	} // L: 13442
}
