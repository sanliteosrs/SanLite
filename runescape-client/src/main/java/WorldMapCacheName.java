import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	public static final WorldMapCacheName field2740;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	public static final WorldMapCacheName field2738;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	public static final WorldMapCacheName field2739;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static final WorldMapCacheName field2742;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	public static final WorldMapCacheName field2741;
	@ObfuscatedName("an")
	@Export("name")
	public final String name;

	static {
		field2740 = new WorldMapCacheName("details"); // L: 4
		field2738 = new WorldMapCacheName("compositemap"); // L: 5
		field2739 = new WorldMapCacheName("compositetexture"); // L: 6
		field2742 = new WorldMapCacheName("area"); // L: 7
		field2741 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lgx;",
		garbageValue = "-1032055852"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = class292.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}
}
