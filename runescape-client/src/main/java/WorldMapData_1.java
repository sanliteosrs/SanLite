import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1161199065
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -517178829
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 271183347
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1038170723
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1951787656"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2714.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096; // L: 20
			super.regionYLow = var1.readUnsignedShort() * 4096;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method9602();
			super.fileId = var1.method9602(); // L: 29
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "-32"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 36
		super.field2677 = new byte[super.planes][64][64];
		super.field2678 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 39
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class261.field2705.value) {
			throw new IllegalStateException(""); // L: 42
		} else {
			int var3 = var1.readUnsignedByte(); // L: 44
			int var4 = var1.readUnsignedByte(); // L: 45
			int var5 = var1.readUnsignedByte(); // L: 46
			int var6 = var1.readUnsignedByte(); // L: 47
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 48
				for (int var7 = 0; var7 < 8; ++var7) { // L: 51
					for (int var8 = 0; var8 < 8; ++var8) { // L: 52
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 53
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 49
			}
		}
	} // L: 56

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1728465445"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "576301002"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2123061810"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1851018903"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 88
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 60
			return false; // L: 61
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 63
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) { // L: 64
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY; // L: 67
			} else {
				return false; // L: 65
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1119672011"
	)
	public static final synchronized long method4861() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class326.field3556) { // L: 15
			class326.field3555 += class326.field3556 - var0; // L: 16
		}

		class326.field3556 = var0; // L: 18
		return var0 + class326.field3555; // L: 19
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILsq;Loz;B)V",
		garbageValue = "88"
	)
	static void method4885(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 21
		var3.type = 1; // L: 22
		var3.key = (long)var0; // L: 23
		var3.archiveDisk = var1; // L: 24
		var3.archive = var2; // L: 25
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 26
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 27
		} // L: 28

		synchronized(ArchiveDiskActionHandler.field4472) { // L: 30
			if (ArchiveDiskActionHandler.field4468 == 0) { // L: 31
				class261.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 32
				class261.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 33
				class261.ArchiveDiskActionHandler_thread.start(); // L: 34
				class261.ArchiveDiskActionHandler_thread.setPriority(5); // L: 35
			}

			ArchiveDiskActionHandler.field4468 = 600; // L: 37
			ArchiveDiskActionHandler.field4470 = false; // L: 38
		}
	} // L: 41
}
