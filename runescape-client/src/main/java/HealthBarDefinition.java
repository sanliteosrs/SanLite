import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public static AbstractArchive field1929;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public static EvictingDualNodeHashTable field1931;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2084950425
	)
	public int field1941;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -134381729
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -559303949
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 624950315
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1729883099
	)
	public int field1936;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 945531
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1320982237
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 463739565
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1492678773
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -83055385
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(64); // L: 14
		field1931 = new EvictingDualNodeHashTable(64); // L: 15
	}

	public HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1936 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1933973926"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "35"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			var1.readUnsignedShort(); // L: 39
		} else if (var2 == 2) { // L: 41
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 42
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 43
			this.int3 = 0;
		} else if (var2 == 5) { // L: 44
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 45
			var1.readUnsignedByte(); // L: 46
		} else if (var2 == 7) { // L: 48
			this.frontSpriteID = var1.method9602();
		} else if (var2 == 8) { // L: 49
			this.backSpriteID = var1.method9602();
		} else if (var2 == 11) { // L: 50
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 51
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 52
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 54

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lvg;",
		garbageValue = "-819667087"
	)
	public SpritePixels method3652() {
		if (this.frontSpriteID < 0) { // L: 57
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field1931.get((long)this.frontSpriteID); // L: 58
			if (var1 != null) {
				return var1; // L: 59
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field1929, this.frontSpriteID, 0); // L: 60
				if (var1 != null) {
					field1931.put(var1, (long)this.frontSpriteID); // L: 61
				}

				return var1; // L: 63
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "72"
	)
	public SpritePixels method3653() {
		if (this.backSpriteID < 0) { // L: 67
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)field1931.get((long)this.backSpriteID); // L: 68
			if (var1 != null) {
				return var1; // L: 69
			} else {
				var1 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(field1929, this.backSpriteID, 0); // L: 70
				if (var1 != null) { // L: 71
					field1931.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 73
			}
		}
	}
}
