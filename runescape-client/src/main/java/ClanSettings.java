import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("ad")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("ag")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -3246048372211759241L
	)
	long field1761;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -484263669
	)
	public int field1762;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1385578651
	)
	int field1780;
	@ObfuscatedName("av")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("ab")
	public byte field1766;
	@ObfuscatedName("ai")
	public byte field1767;
	@ObfuscatedName("ae")
	public byte field1768;
	@ObfuscatedName("au")
	public byte field1769;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1500532859
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("az")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("ax")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("ac")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("al")
	int[] field1783;
	@ObfuscatedName("ay")
	public int[] field1774;
	@ObfuscatedName("ao")
	public boolean[] field1776;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -481044237
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 196306029
	)
	public int field1784;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -53757351
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("at")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("af")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("am")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1762 = 0; // L: 14
		this.name = null; // L: 15
		this.field1780 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1784 = -1; // L: 30
		this.method3368(var1); // L: 43
	} // L: 44

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3349(int var1) {
		if (this.useHashes) { // L: 47
			if (this.memberHashes != null) { // L: 48
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1]; // L: 49
			}
		}

		if (this.useNames) { // L: 51
			if (this.memberNames != null) { // L: 52
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1]; // L: 53
			}
		}

		if (this.memberRanks != null) { // L: 55
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1]; // L: 56
		}

		if (this.field1783 != null) { // L: 57
			System.arraycopy(this.field1783, 0, this.field1783 = new int[var1], 0, this.memberCount);
		} else {
			this.field1783 = new int[var1]; // L: 58
		}

		if (this.field1774 != null) { // L: 59
			System.arraycopy(this.field1774, 0, this.field1774 = new int[var1], 0, this.memberCount);
		} else {
			this.field1774 = new int[var1]; // L: 60
		}

		if (this.field1776 != null) { // L: 61
			System.arraycopy(this.field1776, 0, this.field1776 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1776 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "912447472"
	)
	void method3400(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) { // L: 67
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) { // L: 70
			if (this.bannedMemberNames != null) { // L: 71
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1]; // L: 72
			}
		}

	} // L: 74

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1466774188"
	)
	public int method3409(String var1) {
		if (var1 != null && var1.length() != 0) { // L: 77
			for (int var2 = 0; var2 < this.memberCount; ++var2) { // L: 78
				if (this.memberNames[var2].equals(var1)) { // L: 79
					return var2;
				}
			}

			return -1; // L: 81
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "984884395"
	)
	public int method3352(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1783[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Integer;",
		garbageValue = "124"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) { // L: 90
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1); // L: 91
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null; // L: 92 93
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-600541897"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 97
			String[] var1 = new String[this.memberCount]; // L: 98
			this.sortedMembers = new int[this.memberCount]; // L: 99

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 100 103
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			VarcInt.method3622(var1, this.sortedMembers); // L: 105
		}

		return this.sortedMembers; // L: 107
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "-1425776835"
	)
	void method3378(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 111
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 112
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 113
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 114
				this.method3349(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 115
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 116
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 117
				this.currentOwner = this.memberCount; // L: 118
				this.memberRanks[this.memberCount] = 126; // L: 119
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 122
			}

			this.field1783[this.memberCount] = 0; // L: 124
			this.field1774[this.memberCount] = var4; // L: 125
			this.field1776[this.memberCount] = false; // L: 126
			++this.memberCount; // L: 127
			this.sortedMembers = null; // L: 128
		}
	} // L: 129

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1767433643"
	)
	void method3390(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 132
			--this.memberCount; // L: 133
			this.sortedMembers = null; // L: 134
			if (this.memberCount == 0) { // L: 135
				this.memberHashes = null; // L: 136
				this.memberNames = null; // L: 137
				this.memberRanks = null; // L: 138
				this.field1783 = null; // L: 139
				this.field1774 = null; // L: 140
				this.field1776 = null; // L: 141
				this.currentOwner = -1; // L: 142
				this.field1784 = -1; // L: 143
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 146
				System.arraycopy(this.field1783, var1 + 1, this.field1783, var1, this.memberCount - var1); // L: 147
				System.arraycopy(this.field1774, var1 + 1, this.field1774, var1, this.memberCount - var1); // L: 148
				System.arraycopy(this.field1776, var1 + 1, this.field1776, var1, this.memberCount - var1); // L: 149
				if (this.memberHashes != null) { // L: 150
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 151
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner(); // L: 152
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 154

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1508663532"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 157
			this.currentOwner = -1; // L: 158
			this.field1784 = -1; // L: 159
		} else {
			this.currentOwner = -1; // L: 162
			this.field1784 = -1; // L: 163
			int var1 = 0; // L: 164
			byte var2 = this.memberRanks[0]; // L: 165

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 166
				if (this.memberRanks[var3] > var2) { // L: 167
					if (var2 == 125) { // L: 168
						this.field1784 = var1;
					}

					var1 = var3; // L: 169
					var2 = this.memberRanks[var3]; // L: 170
				} else if (this.field1784 == -1 && this.memberRanks[var3] == 125) { // L: 172
					this.field1784 = var3; // L: 173
				}
			}

			this.currentOwner = var1; // L: 176
			if (this.currentOwner != -1) { // L: 177
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 160 178

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "-775605005"
	)
	void method3358(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 181
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 182
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 183
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 184
				this.method3400(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 185
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 186
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 187
		}
	} // L: 188

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1361843074"
	)
	void method3359(int var1) {
		--this.bannedMemberCount; // L: 191
		if (this.bannedMemberCount == 0) { // L: 192
			this.bannedMemberHashes = null; // L: 193
			this.bannedMemberNames = null; // L: 194
		} else {
			if (this.bannedMemberHashes != null) { // L: 197
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 198
			}
		}

	} // L: 200

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IBB)I",
		garbageValue = "0"
	)
	int method3360(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 203
			if (this.currentOwner == var1 && (this.field1784 == -1 || this.memberRanks[this.field1784] < 125)) { // L: 204
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1; // L: 205
			} else {
				this.memberRanks[var1] = var2; // L: 206
				this.updateOwner(); // L: 207
				return var1; // L: 208
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1754060365"
	)
	boolean method3369(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 212
			this.memberRanks[this.currentOwner] = 125; // L: 213
			this.field1784 = this.currentOwner; // L: 214
			this.memberRanks[var1] = 126; // L: 215
			this.currentOwner = var1; // L: 216
			return true; // L: 217
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1337873398"
	)
	int method3348(int var1, boolean var2) {
		if (this.field1776[var1] == var2) { // L: 221
			return -1;
		} else {
			this.field1776[var1] = var2; // L: 222
			return var1; // L: 223
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1838665076"
	)
	int method3363(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 227
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 228
		int var7 = var6 ^ var5; // L: 229
		var2 <<= var3; // L: 230
		var2 &= var7; // L: 231
		int var8 = this.field1783[var1]; // L: 232
		if ((var8 & var7) == var2) {
			return -1; // L: 233
		} else {
			var8 &= ~var7; // L: 234
			this.field1783[var1] = var8 | var2; // L: 235
			return var1; // L: 236
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "6"
	)
	boolean method3364(int var1, int var2) {
		if (this.parameters != null) { // L: 240
			Node var3 = this.parameters.get((long)var1); // L: 241
			if (var3 != null) { // L: 242
				if (var3 instanceof IntegerNode) { // L: 243
					IntegerNode var4 = (IntegerNode)var3; // L: 244
					if (var2 == var4.integer) { // L: 245
						return false;
					}

					var4.integer = var2; // L: 246
					return true; // L: 247
				}

				var3.remove(); // L: 249
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 252
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 253
		return true; // L: 254
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1315727361"
	)
	boolean method3365(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 258
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 259
		int var7 = var6 ^ var5; // L: 260
		var2 <<= var3; // L: 261
		var2 &= var7; // L: 262
		if (this.parameters != null) { // L: 263
			Node var8 = this.parameters.get((long)var1); // L: 264
			if (var8 != null) { // L: 265
				if (var8 instanceof IntegerNode) { // L: 266
					IntegerNode var9 = (IntegerNode)var8; // L: 267
					if ((var9.integer & var7) == var2) { // L: 268
						return false;
					}

					var9.integer &= ~var7; // L: 269
					var9.integer |= var2; // L: 270
					return true; // L: 271
				}

				var8.remove(); // L: 273
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 276
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 277
		return true; // L: 278
	}

	@ObfuscatedName("ay")
	boolean method3366(int var1, long var2) {
		if (this.parameters != null) { // L: 282
			Node var4 = this.parameters.get((long)var1); // L: 283
			if (var4 != null) { // L: 284
				if (var4 instanceof class502) { // L: 285
					class502 var5 = (class502)var4; // L: 286
					if (var5.field5078 == var2) { // L: 287
						return false;
					}

					var5.field5078 = var2; // L: 288
					return true; // L: 289
				}

				var4.remove(); // L: 291
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 294
		}

		this.parameters.put(new class502(var2), (long)var1); // L: 295
		return true; // L: 296
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Z",
		garbageValue = "32"
	)
	boolean method3367(int var1, String var2) {
		if (var2 == null) { // L: 300
			var2 = "";
		} else if (var2.length() > 80) { // L: 301
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 302
			Node var3 = this.parameters.get((long)var1); // L: 303
			if (var3 != null) { // L: 304
				if (var3 instanceof ObjectNode) { // L: 305
					ObjectNode var4 = (ObjectNode)var3; // L: 306
					if (var4.obj instanceof String) { // L: 307
						if (var2.equals(var4.obj)) { // L: 308
							return false;
						}

						var4.remove(); // L: 309
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 310
						return true; // L: 311
					}
				}

				var3.remove(); // L: 314
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 317
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 318
		return true; // L: 319
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1738111883"
	)
	void method3368(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 323
		if (var2 >= 1 && var2 <= 6) { // L: 324
			int var3 = var1.readUnsignedByte(); // L: 325
			if ((var3 & 1) != 0) { // L: 326
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 327
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 328
				this.memberHashes = null; // L: 329
				this.bannedMemberHashes = null; // L: 330
			}

			if (!this.useNames) { // L: 332
				this.memberNames = null; // L: 333
				this.bannedMemberNames = null; // L: 334
			}

			this.field1762 = var1.readInt(); // L: 336
			this.field1780 = var1.readInt(); // L: 337
			if (var2 <= 3 && this.field1780 != 0) { // L: 338
				this.field1780 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 339
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 340
			this.name = var1.readStringCp1252NullTerminated(); // L: 341
			if (var2 >= 4) { // L: 342
				var1.readInt(); // L: 343
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 345
			this.field1766 = var1.readByte(); // L: 346
			this.field1767 = var1.readByte(); // L: 347
			this.field1768 = var1.readByte(); // L: 348
			this.field1769 = var1.readByte(); // L: 349
			int var4;
			if (this.memberCount > 0) { // L: 350
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 351
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 352
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 353
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1783 == null || this.field1783.length < this.memberCount) { // L: 354
					this.field1783 = new int[this.memberCount];
				}

				if (this.field1774 == null || this.field1774.length < this.memberCount) { // L: 355
					this.field1774 = new int[this.memberCount];
				}

				if (this.field1776 == null || this.field1776.length < this.memberCount) { // L: 356
					this.field1776 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 357
					if (this.useHashes) { // L: 358
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 359
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 360
					if (var2 >= 2) { // L: 361
						this.field1783[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 362
						this.field1774[var4] = var1.readUnsignedShort();
					} else {
						this.field1774[var4] = 0; // L: 363
					}

					if (var2 >= 6) { // L: 364
						this.field1776[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1776[var4] = false; // L: 365
					}
				}

				this.updateOwner(); // L: 367
			}

			if (this.bannedMemberCount > 0) { // L: 369
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 370
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 371
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 372
					if (this.useHashes) { // L: 373
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 374
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 377
				var4 = var1.readUnsignedShort(); // L: 378
				if (var4 > 0) { // L: 379
					this.parameters = new IterableNodeHashTable(var4 < 16 ? ModeWhere.method7432(var4) : 16); // L: 380

					while (var4-- > 0) { // L: 381
						int var5 = var1.readInt(); // L: 382
						int var6 = var5 & 1073741823; // L: 383
						int var7 = var5 >>> 30; // L: 384
						if (var7 == 0) { // L: 385
							int var12 = var1.readInt(); // L: 386
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 387
						} else if (var7 == 1) { // L: 389
							long var10 = var1.readLong(); // L: 390
							this.parameters.put(new class502(var10), (long)var6); // L: 391
						} else if (var7 == 2) { // L: 393
							String var8 = var1.readStringCp1252NullTerminated(); // L: 394
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 395
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 400

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1362825433"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class170.getPacketBufferNode(ClientPacket.field3294, Client.packetWriter.isaacCipher); // L: 10771
		var2.packetBuffer.writeIntME(var0); // L: 10772
		var2.packetBuffer.method9597(var1); // L: 10773
		Client.packetWriter.addNode(var2); // L: 10774
	} // L: 10775
}
