import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("bl")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -412257943
	)
	@Export("x")
	int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1715582301
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 152811235
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1243101715
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16
}
