import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("au")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ch")
	static String field4493;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2143589993
	)
	@Export("index")
	int index;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1659451215
	)
	volatile int field4483;
	@ObfuscatedName("ai")
	boolean field4484;
	@ObfuscatedName("ae")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 979037821
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1545053861
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1527771595
	)
	int field4489;
	@ObfuscatedName("ac")
	boolean field4490;
	@ObfuscatedName("al")
	boolean field4488;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	class388 field4492;

	static {
		Archive_crc = new CRC32(); // L: 21
	}

	@ObfuscatedSignature(
		descriptor = "(Lsq;Lsq;Loe;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, class388 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6); // L: 30
		this.field4483 = 0; // L: 18
		this.field4484 = false; // L: 19
		this.field4489 = -1; // L: 24
		this.field4490 = false; // L: 25
		this.field4488 = false; // L: 26
		this.archiveDisk = var1; // L: 31
		this.masterDisk = var2; // L: 32
		this.index = var4; // L: 33
		this.field4484 = var7; // L: 34
		this.field4490 = var8; // L: 35
		this.field4488 = var9; // L: 36
		this.field4492 = var3; // L: 37
		this.field4492.method7273(this, this.index); // L: 38
	} // L: 39

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1673749871"
	)
	public boolean method7128() {
		return this.field4483 == 1; // L: 42
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1800800765"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4483 == 1 || this.field4490 && this.field4483 == 2) { // L: 46
			return 100;
		} else if (super.groups != null) { // L: 47
			return 99;
		} else {
			int var1 = this.field4492.method7285(class385.field4513.field4518, this.index); // L: 48
			if (var1 >= 100) {
				var1 = 99; // L: 49
			}

			return var1; // L: 50
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4492.method7279(this.index, var1); // L: 54
	} // L: 55

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1323657806"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class343.method6442(var1, this.archiveDisk, this); // L: 58
		} else {
			this.field4492.method7275(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 59
		}

	} // L: 60

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "749652693"
	)
	void method7132() {
		this.field4483 = 2; // L: 63
		super.groupIds = new int[0]; // L: 64
		super.groupCrcs = new int[0]; // L: 65
		super.groupVersions = new int[0]; // L: 66
		super.fileCounts = new int[0]; // L: 67
		super.fileIds = new int[0][]; // L: 68
		super.groups = new Object[0]; // L: 69
		super.files = new Object[0][]; // L: 70
	} // L: 71

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-127643900"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 74
		this.indexVersion = var2; // L: 75
		if (this.masterDisk != null) { // L: 76
			class343.method6442(this.index, this.masterDisk, this);
		} else {
			this.field4492.method7275(this, class385.field4513.field4518, this.index, this.indexCrc, (byte)0, true); // L: 77
		}

	} // L: 78

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1903422880"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 81
			if (this.field4483 == 1) { // L: 82
				throw new RuntimeException(); // L: 83
			}

			if (this.masterDisk != null) { // L: 85
				int var5 = this.index; // L: 86
				ArchiveDisk var6 = this.masterDisk; // L: 87
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 89
				var7.type = 0; // L: 90
				var7.key = (long)var5; // L: 91
				var7.data = var2; // L: 92
				var7.archiveDisk = var6; // L: 93
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 94
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 95
				} // L: 96

				synchronized(ArchiveDiskActionHandler.field4472) { // L: 98
					if (ArchiveDiskActionHandler.field4468 == 0) { // L: 99
						class261.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 100
						class261.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 101
						class261.ArchiveDiskActionHandler_thread.start(); // L: 102
						class261.ArchiveDiskActionHandler_thread.setPriority(5); // L: 103
					}

					ArchiveDiskActionHandler.field4468 = 600; // L: 105
					ArchiveDiskActionHandler.field4470 = false; // L: 106
				}
			}

			this.decodeIndex(var2); // L: 111
			this.loadAllLocal(); // L: 112
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 115
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 116
			if (this.archiveDisk != null) { // L: 117
				ArchiveDisk var13 = this.archiveDisk; // L: 118
				ArchiveDiskAction var18 = new ArchiveDiskAction(); // L: 120
				var18.type = 0; // L: 121
				var18.key = (long)var1; // L: 122
				var18.data = var2; // L: 123
				var18.archiveDisk = var13; // L: 124
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 125
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var18); // L: 126
				} // L: 127

				synchronized(ArchiveDiskActionHandler.field4472) { // L: 129
					if (ArchiveDiskActionHandler.field4468 == 0) { // L: 130
						class261.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 131
						class261.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 132
						class261.ArchiveDiskActionHandler_thread.start(); // L: 133
						class261.ArchiveDiskActionHandler_thread.setPriority(5); // L: 134
					}

					ArchiveDiskActionHandler.field4468 = 600; // L: 136
					ArchiveDiskActionHandler.field4470 = false; // L: 137
				}

				this.validGroups[var1] = true; // L: 141
			}

			if (var4) { // L: 143
				super.groups[var1] = class324.method6114(var2, false);
			}
		}

	} // L: 145

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I[BZS)V",
		garbageValue = "27798"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 148
			if (this.field4483 == 1) { // L: 149
				throw new RuntimeException(); // L: 150
			}

			if (var3 == null) { // L: 152
				this.field4492.method7275(this, class385.field4513.field4518, this.index, this.indexCrc, (byte)0, true); // L: 153
				return; // L: 154
			}

			Archive_crc.reset(); // L: 156
			Archive_crc.update(var3, 0, var3.length); // L: 157
			var5 = (int)Archive_crc.getValue(); // L: 158
			if (var5 != this.indexCrc) { // L: 159
				this.field4492.method7275(this, class385.field4513.field4518, this.index, this.indexCrc, (byte)0, true); // L: 160
				return; // L: 161
			}

			Buffer var9 = new Buffer(class226.decompressBytes(var3)); // L: 163
			int var7 = var9.readUnsignedByte(); // L: 164
			if (var7 != 5 && var7 != 6) { // L: 165
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 166
			if (var7 >= 6) { // L: 167
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 168
				this.field4492.method7275(this, class385.field4513.field4518, this.index, this.indexCrc, (byte)0, true); // L: 169
				return; // L: 170
			}

			this.decodeIndex(var3); // L: 172
			this.loadAllLocal(); // L: 173
		} else {
			if (!var4 && var2 == this.field4489) { // L: 176
				this.field4483 = 1; // L: 177
			}

			if (var3 == null || var3.length <= 2) { // L: 179
				this.validGroups[var2] = false; // L: 180
				if (this.field4484 || var4) { // L: 181
					this.field4492.method7275(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 182
			}

			Archive_crc.reset(); // L: 184
			Archive_crc.update(var3, 0, var3.length - 2); // L: 185
			var5 = (int)Archive_crc.getValue(); // L: 186
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 187
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 188
				this.validGroups[var2] = false; // L: 189
				if (this.field4484 || var4) { // L: 190
					this.field4492.method7275(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 191
			}

			this.validGroups[var2] = true; // L: 193
			if (var4) { // L: 194
				super.groups[var2] = class324.method6114(var3, false);
			}
		}

	} // L: 196

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 199

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 200
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 201
			this.field4483 = 1; // L: 202
		} else {
			this.field4489 = -1; // L: 205

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 206
				if (super.fileCounts[var1] > 0) { // L: 207
					WorldMapData_1.method4885(var1, this.archiveDisk, this); // L: 208
					this.field4489 = var1; // L: 209
				}
			}

			if (this.field4489 == -1) { // L: 212
				this.field4483 = 1;
			}

		}
	} // L: 203 213

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-591085154"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 216
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4492.method7285(this.index, var1); // L: 217 218
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1252560989"
	)
	public boolean method7138(int var1) {
		return this.validGroups[var1]; // L: 222
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1177366355"
	)
	public boolean method7148(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 226
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1169612876"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 230
		int var2 = 0; // L: 231

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 232
			if (super.fileCounts[var3] > 0) { // L: 233
				var1 += 100; // L: 234
				var2 += this.groupLoadPercent(var3); // L: 235
			}
		}

		if (var1 == 0) { // L: 238
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 239
			return var3; // L: 240
		}
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(IIIILvg;Lnw;I)V",
		garbageValue = "348135043"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 13212
			int var6 = Client.camAngleY & 2047; // L: 13213
			int var7 = var3 * var3 + var2 * var2; // L: 13214
			if (var7 <= 6400) { // L: 13215
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 13216
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 13217
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 13218
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 13219
				if (var7 > 2500) {
					var4.method10078(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 13220
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 13221
				}

			}
		}
	} // L: 13222
}
