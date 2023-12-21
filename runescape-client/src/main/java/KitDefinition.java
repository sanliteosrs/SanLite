import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("je")
	static int[] field1864;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2062657371
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("au")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("aa")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ac")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("al")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("az")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ap")
	@Export("models")
	int[] models;
	@ObfuscatedName("av")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 26

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-1802859477"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 46
			if (var2 == 0) { // L: 47
				return; // L: 50
			}

			this.decodeNext(var1, var2); // L: 48
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "-601182989"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 53
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 54
				var3 = var1.readUnsignedByte(); // L: 55
				this.models2 = new int[var3]; // L: 56

				for (var4 = 0; var4 < var3; ++var4) { // L: 57
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 59
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 60
				var3 = var1.readUnsignedByte(); // L: 61
				this.recolorFrom = new short[var3]; // L: 62
				this.recolorTo = new short[var3]; // L: 63

				for (var4 = 0; var4 < var3; ++var4) { // L: 64
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 65
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 66
				}
			} else if (var2 == 41) { // L: 69
				var3 = var1.readUnsignedByte(); // L: 70
				this.retextureFrom = new short[var3]; // L: 71
				this.retextureTo = new short[var3]; // L: 72

				for (var4 = 0; var4 < var3; ++var4) { // L: 73
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 74
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 75
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 78
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 80

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1847787627"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 83
			return true;
		} else {
			boolean var1 = true; // L: 84

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 85
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lkq;",
		garbageValue = "6"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 90
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 91

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 92
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 94
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 95
			}

			int var3;
			if (this.recolorFrom != null) { // L: 96
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 97
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 98
				}
			}

			if (this.retextureFrom != null) { // L: 101
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 102
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 103
				}
			}

			return var4; // L: 106
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-62"
	)
	public boolean method3607() {
		boolean var1 = true; // L: 110

		for (int var2 = 0; var2 < 5; ++var2) { // L: 111
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 112
				var1 = false;
			}
		}

		return var1; // L: 114
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "1386054697"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 118
		int var2 = 0; // L: 119

		for (int var3 = 0; var3 < 5; ++var3) { // L: 120
			if (this.models[var3] != -1) { // L: 121
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 123
		int var4;
		if (this.recolorFrom != null) { // L: 124
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 125
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 126
			}
		}

		if (this.retextureFrom != null) { // L: 129
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 130
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 131
			}
		}

		return var5; // L: 134
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1051367383"
	)
	public static void method3631() {
		class519.DBRowType_cache.clear(); // L: 86
	} // L: 87
}
