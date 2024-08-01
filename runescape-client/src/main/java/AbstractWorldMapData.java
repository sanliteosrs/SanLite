import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2675;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1639370752
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 583454720
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 16710153
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1713331065
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -46933731
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2070049431
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -799210067
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -578244271
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ah")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("az")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ax")
	byte[][][] field2677;
	@ObfuscatedName("ac")
	byte[][][] field2678;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[[[Ljy;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ay")
	boolean field2680;
	@ObfuscatedName("ao")
	boolean field2668;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2680 = false; // L: 26
		this.field2668 = false; // L: 27
	} // L: 29

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "-32"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "47"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2680 && this.field2668; // L: 32
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "211106613"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2680 = true; // L: 40
				this.field2668 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "937977994"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2677 = null; // L: 48
		this.field2678 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2680 = false; // L: 51
		this.field2668 = false; // L: 52
	} // L: 53

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IILvp;B)V",
		garbageValue = "1"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method4968(var1, var2, var3, var4); // L: 61
			} else {
				this.method4969(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILvp;II)V",
		garbageValue = "-1428709278"
	)
	void method4968(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 73
	} // L: 74

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IILvp;IB)V",
		garbageValue = "-3"
	)
	void method4969(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field2677[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2678[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method9602();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-408274121"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Lcw;II[I[II)V",
		garbageValue = "17341470"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 82
			int var5 = var1 - 1; // L: 83
			int var6 = var2 + 1; // L: 84
			int var7 = (var2 + var1) / 2; // L: 85
			World var8 = var0[var7]; // L: 86
			var0[var7] = var0[var1]; // L: 87
			var0[var1] = var8; // L: 88

			while (var5 < var6) { // L: 89
				boolean var9 = true; // L: 90

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 92

					for (var10 = 0; var10 < 4; ++var10) { // L: 93
						if (var3[var10] == 2) { // L: 96
							var11 = var0[var6].index; // L: 97
							var12 = var8.index; // L: 98
						} else if (var3[var10] == 1) { // L: 100
							var11 = var0[var6].population; // L: 101
							var12 = var8.population; // L: 102
							if (var11 == -1 && var4[var10] == 1) { // L: 103
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 104
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 106
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 107
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 108
						} else {
							var11 = var0[var6].id; // L: 111
							var12 = var8.id; // L: 112
						}

						if (var12 != var11) { // L: 114
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 117 118
								var9 = false; // L: 120
							}
							break;
						}

						if (var10 == 3) { // L: 115
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 125

				do {
					++var5; // L: 127

					for (var10 = 0; var10 < 4; ++var10) { // L: 128
						if (var3[var10] == 2) { // L: 131
							var11 = var0[var5].index; // L: 132
							var12 = var8.index; // L: 133
						} else if (var3[var10] == 1) { // L: 135
							var11 = var0[var5].population; // L: 136
							var12 = var8.population; // L: 137
							if (var11 == -1 && var4[var10] == 1) { // L: 138
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001; // L: 139
							}
						} else if (var3[var10] == 3) { // L: 141
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 142
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 143
						} else {
							var11 = var0[var5].id; // L: 146
							var12 = var8.id; // L: 147
						}

						if (var12 != var11) { // L: 149
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 152 153
								var9 = false; // L: 155
							}
							break;
						}

						if (var10 == 3) { // L: 150
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 160
					World var13 = var0[var5]; // L: 161
					var0[var5] = var0[var6]; // L: 162
					var0[var6] = var13; // L: 163
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 166
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 167
		}

	} // L: 169

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-151842938"
	)
	static final void method4994(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 9814
			if (Client.showMouseOverText) { // L: 9815
				int var2 = Client.menuOptionsCount - 1; // L: 9818
				String var4;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 9822
					var4 = "Use" + " " + Client.field642 + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 9823
					var4 = Client.field669 + " " + Client.field670 + " " + "->";
				} else {
					var4 = WorldMapIcon_1.method4580(var2); // L: 9824
				}

				if (Client.menuOptionsCount > 2) { // L: 9825
					var4 = var4 + class191.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				ParamComposition.fontBold12.drawRandomAlphaAndSpacing(var4, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 9826
			}
		}
	} // L: 9827

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIZI)V",
		garbageValue = "-174458071"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11787
		int var5 = var0.height; // L: 11788
		if (var0.widthAlignment == 0) { // L: 11789
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11790
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11791
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11792
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11793
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 11794
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 11795
			var0.width = var0.field3848 * var0.height / var0.field3849;
		}

		if (var0.heightAlignment == 4) { // L: 11796
			var0.height = var0.width * var0.field3849 / var0.field3848;
		}

		if (var0.contentType == 1337) { // L: 11797
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11798
			var0.method6991().method6637(var0.width, var0.height); // L: 11799
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11801
			ScriptEvent var6 = new ScriptEvent(); // L: 11802
			var6.widget = var0; // L: 11803
			var6.args = var0.onResize; // L: 11804
			Client.scriptEvents.addFirst(var6); // L: 11805
		}

	} // L: 11807
}
