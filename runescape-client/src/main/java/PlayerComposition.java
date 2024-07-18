import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ax")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("PlayerComposition_cachedModels")
	static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static class461 field3781;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -317003185
	)
	static int field3784;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field3785;
	@ObfuscatedName("aq")
	int[] field3771;
	@ObfuscatedName("ad")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ag")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -140367159
	)
	public int field3783;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1570243249
	)
	public int field3775;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 984502449
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -3664344773530448641L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 7978463832893938461L
	)
	long field3778;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lgz;"
	)
	class172[] field3774;
	@ObfuscatedName("ai")
	boolean field3780;

	static {
		equipmentIndices = new int[]{class210.field2314.field2311, class210.field2307.field2311, class210.field2317.field2311, class210.field2312.field2311, class210.field2315.field2311, class210.field2320.field2311, class210.field2310.field2311}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		field3781 = new class461(16, class459.field4897); // L: 36
		field3784 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3783 = -1;
		this.field3775 = 0;
		this.field3780 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lne;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3783 = -1; // L: 21
		this.field3775 = 0; // L: 22
		this.field3780 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3771, var1.field3771.length); // L: 43
		class172[] var4 = (class172[])(var1.field3774 != null ? (class172[])Arrays.copyOf(var1.field3774, var1.field3774.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6572(var3, var2, var4, false, var5, var1.field3775, var1.npcTransformId, var1.field3783); // L: 46
	} // L: 47

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgz;Z[IIIIB)V",
		garbageValue = "0"
	)
	public void method6572(int[] var1, int[] var2, class172[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3774 = var3; // L: 50
		this.field3780 = var4; // L: 51
		this.field3783 = var8; // L: 52
		this.method6541(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "1635546182"
	)
	public void method6541(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6549(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6549(var4); // L: 61
		}

		this.field3771 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3775 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	} // L: 69

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "192662519"
	)
	int[] method6549(int var1) {
		int[] var2 = new int[12]; // L: 72

		for (int var3 = 0; var3 < 7; ++var3) { // L: 73
			class325.method6121(var1, var2, var3); // L: 74
		}

		return var2; // L: 76
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1685912193"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]]; // L: 90
		if (var3 != 0) { // L: 91
			var3 -= 256; // L: 92

			KitDefinition var4;
			do {
				if (!var2) { // L: 94
					--var3; // L: 95
					if (var3 < 0) {
						var3 = class333.field3646 - 1; // L: 96
					}
				} else {
					++var3; // L: 99
					if (var3 >= class333.field3646) { // L: 100
						var3 = 0;
					}
				}

				var4 = PcmPlayer.KitDefinition_get(var3); // L: 102
			} while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.field3775 == 1 ? 7 : 0)); // L: 103

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 105
			this.setHash(); // L: 106
		}
	} // L: 107

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1899201076"
	)
	public void method6558(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 110
		if (!var2) { // L: 111
			do {
				--var3; // L: 113
				if (var3 < 0) { // L: 114
					var3 = class105.field1371[var1].length - 1; // L: 115
				}
			} while(!class4.method15(var1, var3)); // L: 117
		} else {
			do {
				++var3; // L: 122
				if (var3 >= class105.field1371[var1].length) { // L: 123
					var3 = 0;
				}
			} while(!class4.method15(var1, var3)); // L: 124
		}

		this.bodyColors[var1] = var3; // L: 127
		this.setHash(); // L: 128
	} // L: 129

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-771169671"
	)
	public void method6544(int var1) {
		if (this.field3775 != var1) { // L: 132
			this.method6541((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 133
		}
	} // L: 134

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "942005621"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3775); // L: 137

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 138
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 139
			if (var3 == 0) {
				var1.writeByte(-1); // L: 140
			} else {
				var1.writeByte(var3 - 256); // L: 141
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 143
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 144

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1995277363"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 147
		int var3 = this.equipment[5]; // L: 148
		int var4 = this.equipment[9]; // L: 149
		this.equipment[5] = var4; // L: 150
		this.equipment[9] = var3; // L: 151
		this.hash = 0L; // L: 152

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 153
			this.hash <<= 4; // L: 154
			if (this.equipment[var5] >= 256) { // L: 155
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 157
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 158
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 159
			this.hash <<= 3; // L: 160
			this.hash += (long)this.bodyColors[var5]; // L: 161
		}

		this.hash <<= 1; // L: 163
		this.hash += (long)(this.field3775 * 1073281455) * -1570243249L; // L: 164
		this.equipment[5] = var3; // L: 165
		this.equipment[9] = var4; // L: 166
		if (0L != var1 && this.hash != var1 || this.field3780) { // L: 167
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 168

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lii;ILii;II)Llv;",
		garbageValue = "626505664"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 171
			return class76.getNpcDefinition(this.npcTransformId).method3750(var1, var2, var3, var4, (class191)null); // L: 172
		} else {
			long var5 = this.hash; // L: 174
			int[] var7 = this.equipment; // L: 175
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 176
				var7 = new int[12]; // L: 177

				for (int var8 = 0; var8 < 12; ++var8) { // L: 178
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 179
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 180
					var7[5] = var1.shield; // L: 181
				}

				if (var1.weapon >= 0) { // L: 183
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 184
					var7[3] = var1.weapon; // L: 185
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 188
			if (var18 == null) { // L: 189
				boolean var9 = false; // L: 190

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 191
					var11 = var7[var10]; // L: 192
					if (var11 >= 256 && var11 < 512) { // L: 193
						KitDefinition var20 = PcmPlayer.KitDefinition_get(var11 - 256); // L: 194
						if (var20 != null && !var20.ready()) { // L: 195
							var9 = true;
						}
					}

					if (var11 >= 512 && !class164.ItemComposition_get(var11 - 512).method3967(this.field3775)) { // L: 197 198
						var9 = true;
					}
				}

				if (var9) { // L: 201
					if (this.field3778 != -1L) { // L: 202
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3778);
					}

					if (var18 == null) { // L: 203
						return null;
					}
				}

				if (var18 == null) { // L: 205
					ModelData[] var19 = new ModelData[12]; // L: 206
					var11 = 0; // L: 207

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 208
						var13 = var7[var12]; // L: 209
						ModelData var15;
						if (var13 >= 256 && var13 < 512) { // L: 210
							KitDefinition var14 = PcmPlayer.KitDefinition_get(var13 - 256); // L: 211
							var15 = null; // L: 212
							if (var14 != null) { // L: 213
								var15 = var14.getModelData();
							}

							if (var15 != null) { // L: 214
								var19[var11++] = var15;
							}
						}

						if (var13 >= 512) { // L: 216
							ItemComposition var22 = class164.ItemComposition_get(var13 - 512); // L: 217
							var15 = var22.method3972(this.field3775); // L: 218
							if (var15 != null) { // L: 219
								if (this.field3774 != null) { // L: 220
									class172 var16 = this.field3774[var12]; // L: 221
									if (var16 != null) { // L: 222
										int var17;
										if (var16.field1845 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1845.length) { // L: 223
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 224
												var15.recolor(var22.recolorTo[var17], var16.field1845[var17]); // L: 225
											}
										}

										if (var16.field1846 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1846.length) { // L: 228
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 229
												var15.retexture(var22.retextureTo[var17], var16.field1846[var17]); // L: 230
											}
										}
									}
								}

								var19[var11++] = var15; // L: 235
							}
						}
					}

					ModelData var23 = new ModelData(var19, var11); // L: 239

					for (var13 = 0; var13 < 5; ++var13) { // L: 240
						if (this.bodyColors[var13] < class105.field1371[var13].length) { // L: 241
							var23.recolor(class452.field4862[var13], class105.field1371[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < MouseRecorder.field1098[var13].length) { // L: 242
							var23.recolor(FriendSystem.field829[var13], MouseRecorder.field1098[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var23.toModel(64, 850, -30, -50, -30); // L: 244
					PlayerComposition_cachedModels.put(var18, var5); // L: 245
					this.field3778 = var5; // L: 246
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 250
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 251
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 252
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 253
			}

			return var21; // L: 254
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lkr;",
		garbageValue = "98"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 258
			return class76.getNpcDefinition(this.npcTransformId).method3706((class191)null); // L: 259
		} else {
			boolean var1 = false; // L: 261

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 262
				var3 = this.equipment[var2]; // L: 263
				if (var3 >= 256 && var3 < 512) { // L: 264
					KitDefinition var9 = PcmPlayer.KitDefinition_get(var3 - 256); // L: 265
					if (var9 != null && !var9.method3625()) { // L: 266
						var1 = true;
					}
				}

				if (var3 >= 512 && !class164.ItemComposition_get(var3 - 512).method3983(this.field3775)) { // L: 268 269
					var1 = true;
				}
			}

			if (var1) { // L: 272
				return null;
			} else {
				ModelData[] var8 = new ModelData[12]; // L: 273
				var3 = 0; // L: 274

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 275
					var5 = this.equipment[var4]; // L: 276
					if (var5 >= 256 && var5 < 512) { // L: 277
						KitDefinition var6 = PcmPlayer.KitDefinition_get(var5 - 256); // L: 278
						ModelData var7 = null; // L: 279
						if (var6 != null) { // L: 280
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) { // L: 281
							var8[var3++] = var7;
						}
					}

					if (var5 >= 512) { // L: 283
						ModelData var10 = class164.ItemComposition_get(var5 - 512).method4014(this.field3775); // L: 284
						if (var10 != null) { // L: 285
							var8[var3++] = var10;
						}
					}
				}

				ModelData var11 = new ModelData(var8, var3); // L: 288

				for (var5 = 0; var5 < 5; ++var5) { // L: 289
					if (this.bodyColors[var5] < class105.field1371[var5].length) { // L: 290
						var11.recolor(class452.field4862[var5], class105.field1371[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < MouseRecorder.field1098[var5].length) { // L: 291
						var11.recolor(FriendSystem.field829[var5], MouseRecorder.field1098[var5][this.bodyColors[var5]]);
					}
				}

				return var11; // L: 293
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-106"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 297
		if (this.npcTransformId != -1) { // L: 298
			var1 = -65536L | (long)this.npcTransformId; // L: 299
		}

		Integer var3 = (Integer)field3781.method8418(var1); // L: 301
		if (var3 == null) { // L: 302
			var3 = ++field3784 - 1; // L: 303
			field3781.method8419(var1, var3); // L: 304
			field3784 %= 65535; // L: 305
		}

		return var3; // L: 307
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2106894088"
	)
	void method6538() {
		this.method6541(this.field3771, this.equipment, this.bodyColors, this.field3775, this.npcTransformId); // L: 311
	} // L: 312
}
