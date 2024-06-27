import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class class251 implements WorldMapSection {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1210346411
	)
	int field2625;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1445981505
	)
	int field2622;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 205314157
	)
	int field2623;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1625304123
	)
	int field2627;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1224971547
	)
	int field2629;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1113536653
	)
	int field2626;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1438919263
	)
	int field2621;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1179156949
	)
	int field2628;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 566969525
	)
	int field2624;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1756336939
	)
	int field2630;

	class251() {
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "1568670940"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2629) {
			var1.regionLowX = this.field2629;
		}

		if (var1.regionHighX < this.field2629) {
			var1.regionHighX = this.field2629;
		}

		if (var1.regionLowY > this.field2626) {
			var1.regionLowY = this.field2626;
		}

		if (var1.regionHighY < this.field2626) {
			var1.regionHighY = this.field2626;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "115"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2625 && var1 < this.field2622 + this.field2625) {
			return var2 >= (this.field2623 << 6) + (this.field2621 << 3) && var2 <= (this.field2623 << 6) + (this.field2621 << 3) + 7 && var3 >= (this.field2627 << 6) + (this.field2628 << 3) && var3 <= (this.field2627 << 6) + (this.field2628 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-898385408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2629 << 6) + (this.field2624 << 3) && var1 <= (this.field2629 << 6) + (this.field2624 << 3) + 7 && var2 >= (this.field2626 << 6) + (this.field2630 << 3) && var2 <= (this.field2626 << 6) + (this.field2630 << 3) + 7; // L: 38
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-35"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2629 * 64 - this.field2623 * 64 + var2 + (this.field2624 * 8 - this.field2621 * 8), var3 + (this.field2626 * 64 - this.field2627 * 64) + (this.field2630 * 8 - this.field2628 * 8)}; // L: 47
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
			int var3 = this.field2623 * 64 - this.field2629 * 64 + (this.field2621 * 8 - this.field2624 * 8) + var1; // L: 57
			int var4 = this.field2627 * 64 - this.field2626 * 64 + var2 + (this.field2628 * 8 - this.field2630 * 8); // L: 58
			return new Coord(this.field2625, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "301668137"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2625 = var1.readUnsignedByte(); // L: 64
		this.field2622 = var1.readUnsignedByte(); // L: 65
		this.field2623 = var1.readUnsignedShort(); // L: 66
		this.field2621 = var1.readUnsignedByte(); // L: 67
		this.field2627 = var1.readUnsignedShort(); // L: 68
		this.field2628 = var1.readUnsignedByte(); // L: 69
		this.field2629 = var1.readUnsignedShort(); // L: 70
		this.field2624 = var1.readUnsignedByte(); // L: 71
		this.field2626 = var1.readUnsignedShort(); // L: 72
		this.field2630 = var1.readUnsignedByte(); // L: 73
		this.method4910(); // L: 74
	} // L: 75

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1191601603"
	)
	void method4910() {
	} // L: 77

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
		garbageValue = "4"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 22
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 23
			if (var1 != null) { // L: 24
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 25
				RandomAccessFile var3 = null; // L: 26

				try {
					File var4 = new File(var2.getParent()); // L: 28
					if (!var4.exists()) { // L: 29
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 30
						int var5 = var3.read(); // L: 31
						var3.seek(0L); // L: 32
						var3.write(var5); // L: 33
						var3.seek(0L); // L: 34
						var3.close(); // L: 35
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 36
						return var2; // L: 37
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 41
							var3.close(); // L: 42
							var3 = null; // L: 43
						}
					} catch (Exception var7) { // L: 46
					}

					throw new RuntimeException(); // L: 48
				}
			}
		}
	}
}
