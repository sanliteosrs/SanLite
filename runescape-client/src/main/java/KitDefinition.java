import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public static AbstractArchive field1918;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 413166461
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("an")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("aj")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("av")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ab")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ai")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ae")
	@Export("models")
	int[] models;
	@ObfuscatedName("au")
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "463832260"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 41
			if (var2 == 0) { // L: 42
				return; // L: 45
			}

			this.decodeNext(var1, var2); // L: 43
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 48
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 49
				var3 = var1.readUnsignedByte(); // L: 50
				this.models2 = new int[var3]; // L: 51

				for (var4 = 0; var4 < var3; ++var4) { // L: 52
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 54
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 55
				var3 = var1.readUnsignedByte(); // L: 56
				this.recolorFrom = new short[var3]; // L: 57
				this.recolorTo = new short[var3]; // L: 58

				for (var4 = 0; var4 < var3; ++var4) { // L: 59
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 60
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 61
				}
			} else if (var2 == 41) { // L: 64
				var3 = var1.readUnsignedByte(); // L: 65
				this.retextureFrom = new short[var3]; // L: 66
				this.retextureTo = new short[var3]; // L: 67

				for (var4 = 0; var4 < var3; ++var4) { // L: 68
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 69
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 70
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 73
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 75

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2042180474"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 78
			return true;
		} else {
			boolean var1 = true; // L: 79

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 80
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 81
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lkr;",
		garbageValue = "-1455217912"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 85
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 86

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 87
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 89
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 90
			}

			int var3;
			if (this.recolorFrom != null) { // L: 91
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 92
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 93
				}
			}

			if (this.retextureFrom != null) { // L: 96
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 97
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 98
				}
			}

			return var4; // L: 101
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-44"
	)
	public boolean method3625() {
		boolean var1 = true; // L: 105

		for (int var2 = 0; var2 < 5; ++var2) { // L: 106
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 107
				var1 = false;
			}
		}

		return var1; // L: 109
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lkr;",
		garbageValue = "948604691"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 113
		int var2 = 0; // L: 114

		for (int var3 = 0; var3 < 5; ++var3) { // L: 115
			if (this.models[var3] != -1) { // L: 116
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 118
		int var4;
		if (this.recolorFrom != null) { // L: 119
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 120
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 121
			}
		}

		if (this.retextureFrom != null) { // L: 124
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 125
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 126
			}
		}

		return var5; // L: 129
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V",
		garbageValue = "53"
	)
	static final void method3632(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		WorldMapArea.method4699(var0, var1, var2, var3, var4, var5, var6, false, -1); // L: 10881
	} // L: 10882
}
