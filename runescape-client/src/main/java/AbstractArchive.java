import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1129530753
	)
	static int field4542;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1762784667
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("as")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("aw")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("af")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("am")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("ar")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bt")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bj")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[Lvm;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bm")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bo")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 318408017
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bg")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bs")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4542 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1323657806"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-591085154"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1100647188"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = class240.method4537(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(class226.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte(); // L: 50
			if (var5 >= 7) { // L: 51
				this.groupCount = var4.method9576();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0; // L: 53
			int var8 = -1; // L: 54
			this.groupIds = new int[this.groupCount]; // L: 55
			int var9;
			if (var5 >= 7) { // L: 56
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 57
					this.groupIds[var9] = var7 += var4.method9576(); // L: 58
					if (this.groupIds[var9] > var8) { // L: 59
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 63
					this.groupIds[var9] = var7 += var4.readUnsignedShort(); // L: 64
					if (this.groupIds[var9] > var8) { // L: 65
						var8 = this.groupIds[var9];
					}
				}
			}

			this.groupCrcs = new int[var8 + 1]; // L: 68
			this.groupVersions = new int[var8 + 1]; // L: 69
			this.fileCounts = new int[var8 + 1]; // L: 70
			this.fileIds = new int[var8 + 1][]; // L: 71
			this.groups = new Object[var8 + 1]; // L: 72
			this.files = new Object[var8 + 1][]; // L: 73
			if (var6 != 0) { // L: 74
				this.groupNameHashes = new int[var8 + 1]; // L: 75

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 76
					this.groupNameHashes[this.groupIds[var9]] = var4.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes); // L: 77
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 79
				this.groupCrcs[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 80
				this.groupVersions[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 81
				this.fileCounts[this.groupIds[var9]] = var4.readUnsignedShort();
			}

			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			if (var5 >= 7) { // L: 82
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 83
					var10 = this.groupIds[var9]; // L: 84
					var11 = this.fileCounts[var10]; // L: 85
					var7 = 0; // L: 86
					var12 = -1; // L: 87
					this.fileIds[var10] = new int[var11]; // L: 88

					for (var13 = 0; var13 < var11; ++var13) { // L: 89
						var14 = this.fileIds[var10][var13] = var7 += var4.method9576(); // L: 90
						if (var14 > var12) { // L: 91
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 93
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 97
					var10 = this.groupIds[var9]; // L: 98
					var11 = this.fileCounts[var10]; // L: 99
					var7 = 0; // L: 100
					var12 = -1; // L: 101
					this.fileIds[var10] = new int[var11]; // L: 102

					for (var13 = 0; var13 < var11; ++var13) { // L: 103
						var14 = this.fileIds[var10][var13] = var7 += var4.readUnsignedShort(); // L: 104
						if (var14 > var12) { // L: 105
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 107
				}
			}

			if (var6 != 0) { // L: 110
				this.fileNameHashes = new int[var8 + 1][]; // L: 111
				this.fileNameHashTables = new IntHashTable[var8 + 1]; // L: 112

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 113
					var10 = this.groupIds[var9]; // L: 114
					var11 = this.fileCounts[var10]; // L: 115
					this.fileNameHashes[var10] = new int[this.files[var10].length]; // L: 116

					for (var12 = 0; var12 < var11; ++var12) { // L: 117
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var4.readInt();
					}

					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]); // L: 118
				}
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 121

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "605243768"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "708034421"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 130
			if (this.files[var1][var2] == null) { // L: 131
				boolean var4 = this.buildFiles(var1, var3); // L: 132
				if (!var4) { // L: 133
					this.loadGroup(var1); // L: 134
					var4 = this.buildFiles(var1, var3); // L: 135
					if (!var4) { // L: 136
						return null;
					}
				}
			}

			byte[] var5 = class290.method5745(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-431197290"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 145
			if (this.files[var1][var2] != null) { // L: 146
				return true;
			} else if (this.groups[var1] != null) { // L: 147
				return true;
			} else {
				this.loadGroup(var1); // L: 148
				return this.groups[var1] != null; // L: 149
			}
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2036855136"
	)
	public boolean method7184(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1395812212"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 160
			return true;
		} else {
			this.loadGroup(var1); // L: 161
			return this.groups[var1] != null; // L: 162
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2092899285"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true; // L: 167

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 168
			int var3 = this.groupIds[var2]; // L: 169
			if (this.groups[var3] == null) { // L: 170
				this.loadGroup(var3); // L: 171
				if (this.groups[var3] == null) { // L: 172
					var1 = false;
				}
			}
		}

		return var1; // L: 175
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "93"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 184
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 185
		} else {
			throw new RuntimeException(); // L: 186
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1870683326"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 190
			if (this.files[var1][var2] == null) { // L: 191
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 192
				if (!var3) { // L: 193
					this.loadGroup(var1); // L: 194
					var3 = this.buildFiles(var1, (int[])null); // L: 195
					if (!var3) { // L: 196
						return null;
					}
				}
			}

			byte[] var4 = class290.method5745(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1727954307"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 204
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 205
		} else {
			throw new RuntimeException(); // L: 206
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "125"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1610075391"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 219 220
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "470760679"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 224
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 228
			this.groups[var1] = null;
		}

	} // L: 229

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1415407539"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 232
			this.files[var1][var2] = null;
		}

	} // L: 233

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-68"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 236
			if (this.files[var1] != null) { // L: 237
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 238
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 241

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "-86"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 244
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 245
			int[] var4 = this.fileIds[var1]; // L: 246
			Object[] var5 = this.files[var1]; // L: 247
			boolean var6 = true; // L: 248

			for (int var7 = 0; var7 < var3; ++var7) { // L: 249
				if (var5[var4[var7]] == null) { // L: 250
					var6 = false; // L: 251
					break;
				}
			}

			if (var6) { // L: 255
				return true;
			} else {
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 257
					var18 = class290.method5745(this.groups[var1], false); // L: 262
				} else {
					var18 = class290.method5745(this.groups[var1], true); // L: 258
					Buffer var8 = new Buffer(var18); // L: 259
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 260
				}

				byte[] var20 = class226.decompressBytes(var18); // L: 265
				if (this.releaseGroups) { // L: 284
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 285
					int var9 = var20.length; // L: 286
					--var9;
					int var10 = var20[var9] & 255; // L: 287
					var9 -= var10 * var3 * 4; // L: 288
					Buffer var11 = new Buffer(var20); // L: 289
					int[] var12 = new int[var3]; // L: 290
					var11.offset = var9; // L: 291

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 292
						var14 = 0; // L: 293

						for (var15 = 0; var15 < var3; ++var15) { // L: 294
							var14 += var11.readInt(); // L: 295
							var12[var15] += var14; // L: 296
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 299

					for (var14 = 0; var14 < var3; ++var14) { // L: 300
						var19[var14] = new byte[var12[var14]]; // L: 301
						var12[var14] = 0; // L: 302
					}

					var11.offset = var9; // L: 304
					var14 = 0; // L: 305

					for (var15 = 0; var15 < var10; ++var15) { // L: 306
						int var16 = 0; // L: 307

						for (int var17 = 0; var17 < var3; ++var17) { // L: 308
							var16 += var11.readInt(); // L: 309
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 310
							var12[var17] += var16; // L: 311
							var14 += var16; // L: 312
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 315
						if (!this.shallowFiles) { // L: 316
							var5[var4[var15]] = class324.method6114(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 317
						}
					}
				} else if (!this.shallowFiles) { // L: 321
					var5[var4[0]] = class324.method6114(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 322
				}

				return true; // L: 324
			}
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "4"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 328
		return this.groupNameHashTable.get(class27.hashString(var1)); // L: 329
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "56"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 333
		return this.fileNameHashTables[var1].get(class27.hashString(var2)); // L: 334
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "1919198164"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 338
		var2 = var2.toLowerCase(); // L: 339
		int var3 = this.groupNameHashTable.get(class27.hashString(var1)); // L: 340
		if (var3 < 0) { // L: 341
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class27.hashString(var2)); // L: 342
			return var4 >= 0; // L: 343
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1566439854"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 348
		var2 = var2.toLowerCase(); // L: 349
		int var3 = this.groupNameHashTable.get(class27.hashString(var1)); // L: 350
		int var4 = this.fileNameHashTables[var3].get(class27.hashString(var2)); // L: 351
		return this.takeFile(var3, var4); // L: 352
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "109"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 356
		var2 = var2.toLowerCase(); // L: 357
		int var3 = this.groupNameHashTable.get(class27.hashString(var1)); // L: 358
		int var4 = this.fileNameHashTables[var3].get(class27.hashString(var2)); // L: 359
		return this.tryLoadFile(var3, var4); // L: 360
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "0"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 364
		int var2 = this.groupNameHashTable.get(class27.hashString(var1)); // L: 365
		return this.tryLoadGroup(var2); // L: 366
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-38"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 370
		int var2 = this.groupNameHashTable.get(class27.hashString(var1)); // L: 371
		if (var2 >= 0) { // L: 372
			this.loadRegionFromGroup(var2); // L: 373
		}
	} // L: 374

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1858448112"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 377
		int var2 = this.groupNameHashTable.get(class27.hashString(var1)); // L: 378
		return this.groupLoadPercent(var2); // L: 379
	}
}
