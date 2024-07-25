import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field2068;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -354932627
	)
	static int field2083;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -2012746525
	)
	static int field2084;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 614834317
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1284875027
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1664339371
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("av")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ab")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ai")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ae")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1294875951
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1858899611
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 352886693
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 136469009
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1006190975
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		Widget_cachedFonts = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "-11"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 49
			if (var2 == 0) { // L: 50
				return; // L: 53
			}

			this.decodeNext(var1, var2); // L: 51
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "-1989651831"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 56
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 57
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 58
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 59
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 60
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 61
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) { // L: 62
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.recolorFrom = new short[var3]; // L: 65
				this.recolorTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 == 41) { // L: 72
				var3 = var1.readUnsignedByte(); // L: 73
				this.retextureFrom = new short[var3]; // L: 74
				this.retextureTo = new short[var3]; // L: 75

				for (var4 = 0; var4 < var3; ++var4) { // L: 76
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 77
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 78
				}
			}
		}

	} // L: 82

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Llv;",
		garbageValue = "-1769947000"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3770(); // L: 85
		if (var2 == null) { // L: 86
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) { // L: 88
				var3 = class353.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
			} else {
				var3 = var2.toSharedSpotAnimationModel(true); // L: 89
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 90
				var3.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			if (this.orientation != 0) { // L: 91
				if (this.orientation == 90) { // L: 92
					var3.rotateY90Ccw();
				}

				if (this.orientation == 180) { // L: 93
					var3.rotateY90Ccw(); // L: 94
					var3.rotateY90Ccw(); // L: 95
				}

				if (this.orientation == 270) { // L: 97
					var3.rotateY90Ccw(); // L: 98
					var3.rotateY90Ccw(); // L: 99
					var3.rotateY90Ccw(); // L: 100
				}
			}

			return var3; // L: 103
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Llv;",
		garbageValue = "-40"
	)
	public final Model method3770() {
		Model var1 = (Model)Widget_cachedFonts.get((long)this.id); // L: 107
		if (var1 == null) { // L: 108
			ModelData var2 = ModelData.ModelData_get(field2068, this.archive, 0); // L: 109
			if (var2 == null) { // L: 110
				return null;
			}

			int var3;
			if (this.recolorFrom != null) { // L: 111
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 112
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 113
				}
			}

			if (this.retextureFrom != null) { // L: 116
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 117
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 118
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 121
			Widget_cachedFonts.put(var1, (long)this.id); // L: 122
		}

		return var1; // L: 124
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)Ljava/lang/String;",
		garbageValue = "-560192572"
	)
	public static String method3789(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 25
			if (var2 > 32767) { // L: 26
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 27
			var0.offset += class365.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 28
			String var4 = Renderable.decodeStringCp1252(var3, 0, var2); // L: 29
			var1 = var4; // L: 30
		} catch (Exception var6) { // L: 32
			var1 = "Cabbage"; // L: 33
		}

		return var1; // L: 36
	}
}
