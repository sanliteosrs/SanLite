import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 713612875
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILnl;Lnl;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1233211553"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4830) { // L: 70
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) { // L: 71
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount]; // L: 72
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null; // L: 73
				return var3; // L: 74
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) { // L: 76
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount]; // L: 77
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null; // L: 78
				return var3; // L: 79
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) { // L: 81
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount]; // L: 82
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null; // L: 83
				return var3; // L: 84
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4835 > 0) { // L: 86
				var3 = ByteArrayPool.field4843[--ByteArrayPool.field4835]; // L: 87
				ByteArrayPool.field4843[ByteArrayPool.field4835] = null; // L: 88
				return var3; // L: 89
			}

			int var6;
			if (class19.ByteArrayPool_arrays != null) { // L: 91
				for (var6 = 0; var6 < class153.ByteArrayPool_alternativeSizes.length; ++var6) { // L: 92
					if ((class153.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class153.ByteArrayPool_alternativeSizes[var6] && var1) && class450.ByteArrayPool_altSizeArrayCounts[var6] > 0) { // L: 93
						byte[] var4 = class19.ByteArrayPool_arrays[var6][--class450.ByteArrayPool_altSizeArrayCounts[var6]]; // L: 94
						class19.ByteArrayPool_arrays[var6][class450.ByteArrayPool_altSizeArrayCounts[var6]] = null; // L: 95
						return var4; // L: 96
					}
				}
			}

			if (var1 && class153.ByteArrayPool_alternativeSizes != null) { // L: 100 101
				for (var6 = 0; var6 < class153.ByteArrayPool_alternativeSizes.length; ++var6) { // L: 102
					if (var0 <= class153.ByteArrayPool_alternativeSizes[var6] && class450.ByteArrayPool_altSizeArrayCounts[var6] < class19.ByteArrayPool_arrays[var6].length) { // L: 103
						return new byte[class153.ByteArrayPool_alternativeSizes[var6]]; // L: 104
					}
				}
			}
		}

		return new byte[var0]; // L: 110
	}
}
