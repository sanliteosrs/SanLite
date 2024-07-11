import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public static AbstractArchive field1985;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -1562550201
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2009531171
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1973900023
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ab")
	@Export("models")
	int[] models;
	@ObfuscatedName("ai")
	int[] field1992;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 478583057
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1539012287
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -206631735
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1926993693
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -545327657
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 798328077
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -70046247
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 608377993
	)
	public int field2000;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 37745465
	)
	public int field2006;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1117893463
	)
	public int field2002;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1500665669
	)
	public int field2029;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1300492197
	)
	public int field2004;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1571755443
	)
	public int field2005;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1490450937
	)
	public int field2011;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1165099135
	)
	public int field2007;
	@ObfuscatedName("ar")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bt")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bj")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("be")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bm")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bo")
	public boolean field2024;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1316122047
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1126463291
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 204475581
	)
	int field2034;
	@ObfuscatedName("bs")
	public boolean field2017;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 966241915
	)
	int field2018;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2012644261
	)
	int field2008;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2046397449
	)
	public int field2020;
	@ObfuscatedName("by")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1985607835
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -814500775
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bc")
	public boolean field2021;
	@ObfuscatedName("bv")
	public boolean field2025;
	@ObfuscatedName("bb")
	public boolean field2026;
	@ObfuscatedName("bn")
	public boolean field2027;
	@ObfuscatedName("bh")
	int[] field2028;
	@ObfuscatedName("bq")
	short[] field2009;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -720142033
	)
	public int field2030;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bk")
	int[] field2032;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1; // L: 30
		this.walkLeftSequence = -1; // L: 31
		this.walkRightSequence = -1; // L: 32
		this.field2000 = -1;
		this.field2006 = -1;
		this.field2002 = -1;
		this.field2029 = -1;
		this.field2004 = -1;
		this.field2005 = -1;
		this.field2011 = -1; // L: 39
		this.field2007 = -1;
		this.actions = new String[5]; // L: 45
		this.field2024 = true; // L: 46
		this.headIconPrayer = -1; // L: 47
		this.rotation = 128; // L: 48
		this.field2034 = 128; // L: 49
		this.field2017 = false; // L: 50
		this.field2018 = 0; // L: 51
		this.field2008 = 0; // L: 52
		this.field2020 = 32; // L: 53
		this.transformVarbit = -1; // L: 55
		this.transformVarp = -1; // L: 56
		this.field2021 = true; // L: 57
		this.field2025 = true; // L: 58
		this.field2026 = false; // L: 59
		this.field2027 = false; // L: 60
		this.field2028 = null; // L: 61
		this.field2009 = null; // L: 62
		this.field2030 = -1; // L: 63
		this.field2032 = new int[]{1, 1, 1, 1, 1, 1}; // L: 65
	} // L: 67

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1954284404"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 81

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1048876932"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 85
			if (var2 == 0) { // L: 86
				return; // L: 89
			}

			this.decodeNext(var1, var2); // L: 87
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IS)V",
		garbageValue = "-13603"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 92
			var3 = var1.readUnsignedByte(); // L: 93
			this.models = new int[var3]; // L: 94

			for (var4 = 0; var4 < var3; ++var4) { // L: 95
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 97
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 98
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 99
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 100
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 101
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 102
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 103
			this.walkSequence = var1.readUnsignedShort(); // L: 104
			this.walkBackSequence = var1.readUnsignedShort(); // L: 105
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 106
			this.walkRightSequence = var1.readUnsignedShort(); // L: 107
		} else if (var2 == 18) { // L: 109
			var1.readUnsignedShort(); // L: 110
		} else if (var2 >= 30 && var2 < 35) { // L: 112
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 113
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 114
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 116
			var3 = var1.readUnsignedByte(); // L: 117
			this.recolorFrom = new short[var3]; // L: 118
			this.recolorTo = new short[var3]; // L: 119

			for (var4 = 0; var4 < var3; ++var4) { // L: 120
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 121
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 122
			}
		} else if (var2 == 41) { // L: 125
			var3 = var1.readUnsignedByte(); // L: 126
			this.retextureFrom = new short[var3]; // L: 127
			this.retextureTo = new short[var3]; // L: 128

			for (var4 = 0; var4 < var3; ++var4) { // L: 129
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 130
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 131
			}
		} else if (var2 == 60) { // L: 134
			var3 = var1.readUnsignedByte(); // L: 135
			this.field1992 = new int[var3]; // L: 136

			for (var4 = 0; var4 < var3; ++var4) { // L: 137
				this.field1992[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) { // L: 139
			this.field2032[0] = var1.readUnsignedShort();
		} else if (var2 == 75) { // L: 140
			this.field2032[1] = var1.readUnsignedShort();
		} else if (var2 == 76) { // L: 141
			this.field2032[2] = var1.readUnsignedShort();
		} else if (var2 == 77) { // L: 142
			this.field2032[3] = var1.readUnsignedShort();
		} else if (var2 == 78) { // L: 143
			this.field2032[4] = var1.readUnsignedShort();
		} else if (var2 == 79) { // L: 144
			this.field2032[5] = var1.readUnsignedShort();
		} else if (var2 == 93) { // L: 145
			this.field2024 = false;
		} else if (var2 == 95) { // L: 146
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 147
			this.rotation = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 148
			this.field2034 = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 149
			this.field2017 = true;
		} else if (var2 == 100) { // L: 150
			this.field2018 = var1.readByte();
		} else if (var2 == 101) { // L: 151
			this.field2008 = var1.readByte();
		} else {
			int var5;
			if (var2 == 102) { // L: 152
				var3 = var1.readUnsignedByte(); // L: 153
				var4 = 0; // L: 154

				for (var5 = var3; var5 != 0; var5 >>= 1) { // L: 155 156 158
					++var4; // L: 157
				}

				this.field2028 = new int[var4]; // L: 160
				this.field2009 = new short[var4]; // L: 161

				for (int var6 = 0; var6 < var4; ++var6) { // L: 162
					if ((var3 & 1 << var6) == 0) { // L: 163
						this.field2028[var6] = -1; // L: 164
						this.field2009[var6] = -1; // L: 165
					} else {
						this.field2028[var6] = var1.method9602(); // L: 168
						this.field2009[var6] = (short)var1.method9574(); // L: 169
					}
				}
			} else if (var2 == 103) { // L: 173
				this.field2020 = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) { // L: 174
				if (var2 == 107) { // L: 192
					this.field2021 = false;
				} else if (var2 == 109) { // L: 193
					this.field2025 = false;
				} else if (var2 == 114) { // L: 194
					this.field2000 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 195
					this.field2000 = var1.readUnsignedShort(); // L: 196
					this.field2006 = var1.readUnsignedShort(); // L: 197
					this.field2002 = var1.readUnsignedShort(); // L: 198
					this.field2029 = var1.readUnsignedShort(); // L: 199
				} else if (var2 == 116) { // L: 201
					this.field2004 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 202
					this.field2004 = var1.readUnsignedShort(); // L: 203
					this.field2005 = var1.readUnsignedShort(); // L: 204
					this.field2011 = var1.readUnsignedShort(); // L: 205
					this.field2007 = var1.readUnsignedShort(); // L: 206
				} else if (var2 == 122) { // L: 208
					this.field2026 = true;
				} else if (var2 == 123) { // L: 209
					this.field2027 = true;
				} else if (var2 == 124) { // L: 210
					this.field2030 = var1.readUnsignedShort();
				} else if (var2 == 249) { // L: 211
					this.params = AttackOption.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort(); // L: 175
				if (this.transformVarbit == 65535) { // L: 176
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort(); // L: 177
				if (this.transformVarp == 65535) { // L: 178
					this.transformVarp = -1;
				}

				var3 = -1; // L: 179
				if (var2 == 118) { // L: 180
					var3 = var1.readUnsignedShort(); // L: 181
					if (var3 == 65535) { // L: 182
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte(); // L: 184
				this.transforms = new int[var4 + 2]; // L: 185

				for (var5 = 0; var5 <= var4; ++var5) { // L: 186
					this.transforms[var5] = var1.readUnsignedShort(); // L: 187
					if (this.transforms[var5] == 65535) { // L: 188
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3; // L: 190
			}
		}

	} // L: 213

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lii;ILii;ILhh;I)Llv;",
		garbageValue = "1852669233"
	)
	public final Model method3750(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class191 var5) {
		if (this.transforms != null) { // L: 216
			NPCComposition var10 = this.transform(); // L: 217
			return var10 == null ? null : var10.method3750(var1, var2, var3, var4, var5); // L: 218 219 221
		} else {
			long var6 = (long)this.id; // L: 223
			if (var5 != null) { // L: 224
				var6 |= var5.field1981 << 16; // L: 225
			}

			Model var8 = (Model)HitSplatDefinition_cachedFonts.get(var6); // L: 227
			if (var8 == null) { // L: 228
				ModelData var9 = this.method3707(this.models, var5); // L: 229
				if (var9 == null) { // L: 230
					return null; // L: 231
				}

				var8 = var9.toModel(this.field2018 + 64, this.field2008 * 5 + 850, -30, -50, -30); // L: 233
				HitSplatDefinition_cachedFonts.put(var8, var6); // L: 234
			}

			Model var11;
			if (var1 != null && var3 != null) { // L: 237
				var11 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) { // L: 238
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) { // L: 239
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true); // L: 240
			}

			if (this.rotation != 128 || this.field2034 != 128) { // L: 241
				var11.scale(this.rotation, this.field2034, this.rotation);
			}

			return var11; // L: 242
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)Lkr;",
		garbageValue = "-998465275"
	)
	public final ModelData method3706(class191 var1) {
		if (this.transforms != null) { // L: 246
			NPCComposition var2 = this.transform(); // L: 247
			return var2 == null ? null : var2.method3706(var1); // L: 248 249 251
		} else {
			return this.method3707(this.field1992, var1); // L: 253
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([ILhh;I)Lkr;",
		garbageValue = "630131586"
	)
	ModelData method3707(int[] var1, class191 var2) {
		int[] var3 = var1; // L: 257
		if (var2 != null && var2.field1978 != null) { // L: 258
			var3 = var2.field1978; // L: 259
		}

		if (var3 == null) { // L: 261
			return null; // L: 262
		} else {
			boolean var4 = false; // L: 264

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 265
				if (var3[var5] != -1 && !field1985.tryLoadFile(var3[var5], 0)) { // L: 266
					var4 = true; // L: 267
				}
			}

			if (var4) { // L: 270
				return null; // L: 271
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 273

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 274
					var9[var6] = ModelData.ModelData_get(field1985, var3[var6], 0); // L: 275
				}

				ModelData var10;
				if (var9.length == 1) { // L: 278
					var10 = var9[0]; // L: 279
					if (var10 == null) { // L: 280
						var10 = new ModelData(var9, var9.length); // L: 281
					}
				} else {
					var10 = new ModelData(var9, var9.length); // L: 285
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) { // L: 287
					var7 = this.recolorTo; // L: 288
					if (var2 != null && var2.field1979 != null) { // L: 289
						var7 = var2.field1979; // L: 290
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 292
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 293
					}
				}

				if (this.retextureFrom != null) { // L: 296
					var7 = this.retextureTo; // L: 297
					if (var2 != null && var2.field1982 != null) { // L: 298
						var7 = var2.field1982; // L: 299
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 301
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 302
					}
				}

				return var10; // L: 305
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lhb;",
		garbageValue = "765503065"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 309
		if (this.transformVarbit != -1) { // L: 310
			var1 = class162.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 311
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 313
			var2 = this.transforms[var1]; // L: 314
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class76.getNpcDefinition(var2) : null; // L: 315 316
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2016243441"
	)
	public final int method3731() {
		if (this.transforms != null) { // L: 320
			NPCComposition var1 = this.transform(); // L: 321
			if (var1 != null) { // L: 322
				return var1.id; // L: 323
			}
		}

		return -1; // L: 326
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1222906230"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 330
			return true;
		} else {
			int var1 = -1; // L: 331
			if (this.transformVarbit != -1) { // L: 332
				var1 = class162.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 333
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 334
				return this.transforms[var1] != -1; // L: 335
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "6810"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return WorldMapRectangle.method4997(this.params, var1, var2); // L: 339
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-21641"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class109.method2817(this.params, var1, var2); // L: 343
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1793189942"
	)
	public boolean method3712() {
		return this.field2028 != null && this.field2009 != null; // L: 347
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-481979218"
	)
	public int[] method3713() {
		return this.field2028; // L: 351
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1764901866"
	)
	public int method3702(int var1) {
		return this.field2028 != null && var1 < this.field2028.length ? this.field2028[var1] : -1; // L: 355 356 358
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "30"
	)
	public short[] method3715() {
		return this.field2009; // L: 362
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "2053251793"
	)
	public short method3716(int var1) {
		return this.field2009 != null && var1 < this.field2009.length ? this.field2009[var1] : -1; // L: 366 367 369
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "1467803250"
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

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "123"
	)
	static final void method3756(class101 var0) {
		for (class96 var1 = (class96)var0.field1335.last(); var1 != null; var1 = (class96)var0.field1335.previous()) { // L: 9109 9110 9153
			if (var1.field1173 > 0) { // L: 9111
				--var1.field1173;
			}

			boolean var2;
			int var3;
			int var4;
			ObjectComposition var5;
			if (var1.field1173 == 0) { // L: 9112
				if (var1.field1180 >= 0) { // L: 9114
					var3 = var1.field1180; // L: 9116
					var4 = var1.field1185; // L: 9117
					var5 = class10.getObjectDefinition(var3); // L: 9119
					if (var4 == 11) { // L: 9120
						var4 = 10;
					}

					if (var4 >= 5 && var4 <= 8) { // L: 9121
						var4 = 4;
					}

					var2 = var5.method3913(var4); // L: 9122
					if (!var2) { // L: 9124
						continue;
					}
				}

				Bounds.method7705(var0, var1.field1174, var1.field1172, var1.field1178, var1.field1177, var1.field1180, var1.field1176, var1.field1185, var1.field1181); // L: 9126
				var1.remove(); // L: 9127
			} else {
				if (var1.field1184 > 0) { // L: 9131
					--var1.field1184;
				}

				if (var1.field1184 == 0 && var1.field1178 >= 1 && var1.field1177 >= 1 && var1.field1178 <= 102 && var1.field1177 <= 102) { // L: 9132
					if (var1.field1175 >= 0) { // L: 9134
						var3 = var1.field1175; // L: 9136
						var4 = var1.field1186; // L: 9137
						var5 = class10.getObjectDefinition(var3); // L: 9139
						if (var4 == 11) { // L: 9140
							var4 = 10;
						}

						if (var4 >= 5 && var4 <= 8) { // L: 9141
							var4 = 4;
						}

						var2 = var5.method3913(var4); // L: 9142
						if (!var2) { // L: 9144
							continue;
						}
					}

					Bounds.method7705(var0, var1.field1174, var1.field1172, var1.field1178, var1.field1177, var1.field1175, var1.field1179, var1.field1186, var1.field1181); // L: 9146
					var1.field1184 = -1; // L: 9147
					if (var1.field1175 == var1.field1180 && var1.field1180 == -1) { // L: 9148
						var1.remove();
					} else if (var1.field1175 == var1.field1180 && var1.field1176 == var1.field1179 && var1.field1185 == var1.field1186) { // L: 9149
						var1.remove();
					}
				}
			}
		}

	} // L: 9155
}
