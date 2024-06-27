import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 706012301
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 304812967
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 634985527
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1095618859
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1488767803
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 807455785
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2121716295
	)
	int field2564;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1895852113
	)
	int field2565;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -763316353
	)
	int field2563;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1912317275
	)
	int field2567;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "1568670940"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2564) { // L: 22
			var1.regionLowX = this.field2564;
		}

		if (var1.regionHighX < this.field2563) {
			var1.regionHighX = this.field2563; // L: 23
		}

		if (var1.regionLowY > this.field2565) { // L: 24
			var1.regionLowY = this.field2565;
		}

		if (var1.regionHighY < this.field2567) { // L: 25
			var1.regionHighY = this.field2567;
		}

	} // L: 26

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "115"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-898385408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2564 && var1 >> 6 <= this.field2563 && var2 >> 6 >= this.field2565 && var2 >> 6 <= this.field2567; // L: 38
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-35"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2564 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2565 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lnl;",
		garbageValue = "-55064754"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2564 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2565 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "301668137"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2564 = var1.readUnsignedShort(); // L: 70
		this.field2565 = var1.readUnsignedShort(); // L: 71
		this.field2563 = var1.readUnsignedShort(); // L: 72
		this.field2567 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-993463164"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77
}
