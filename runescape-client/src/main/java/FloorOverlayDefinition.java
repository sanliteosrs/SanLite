import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("wa")
	static List field2278;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2130195297
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1868876849
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ap")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 398762743
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 899009769
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 940491185
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 992973643
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 641939819
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 893402431
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1211510327
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	} // L: 23

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2009375911"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 37
			this.setHsl(this.secondaryRgb); // L: 38
			this.secondaryHue = this.hue; // L: 39
			this.secondarySaturation = this.saturation; // L: 40
			this.secondaryLightness = this.lightness; // L: 41
		}

		this.setHsl(this.primaryRgb); // L: 43
	} // L: 44

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "-2060202740"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 48
			if (var3 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var3, var2); // L: 50
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;III)V",
		garbageValue = "2006578058"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 55
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 56
		} else if (var2 == 5) { // L: 57
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 58
		} else if (var2 == 8) { // L: 59
		}

	} // L: 61

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2059953925"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 64
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 65
		double var6 = (double)(var1 & 255) / 256.0D; // L: 66
		double var8 = var2; // L: 67
		if (var4 < var2) { // L: 68
			var8 = var4;
		}

		if (var6 < var8) { // L: 69
			var8 = var6;
		}

		double var10 = var2; // L: 70
		if (var4 > var2) { // L: 71
			var10 = var4;
		}

		if (var6 > var10) { // L: 72
			var10 = var6;
		}

		double var12 = 0.0D; // L: 73
		double var14 = 0.0D; // L: 74
		double var16 = (var8 + var10) / 2.0D; // L: 75
		if (var8 != var10) { // L: 76
			if (var16 < 0.5D) { // L: 77
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 78
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 79
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 80
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 81
			}
		}

		var12 /= 6.0D; // L: 83
		this.hue = (int)(256.0D * var12); // L: 84
		this.saturation = (int)(256.0D * var14); // L: 85
		this.lightness = (int)(var16 * 256.0D); // L: 86
		if (this.saturation < 0) { // L: 87
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 88
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 89
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 90
			this.lightness = 255;
		}

	} // L: 91

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "396253425"
	)
	public static int method4035(int var0) {
		return class496.field5052[var0 & 16383]; // L: 28
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "134068715"
	)
	static void method4034() {
		World.field810 = null; // L: 1346
		class74.redHintArrowSprite = null; // L: 1347
		class418.field4683 = null; // L: 1348
		FaceNormal.field3019 = null; // L: 1349
		ArchiveDiskActionHandler.field4476 = null; // L: 1350
		class337.field3665 = null; // L: 1351
		class25.field118 = null; // L: 1352
		class110.field1408 = null; // L: 1353
		class446.field4821 = null; // L: 1354
		UrlRequest.scrollBarSprites = null; // L: 1355
		class240.field2526 = null; // L: 1356
	} // L: 1357
}
