import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -34813589
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1220267967
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 143019549
	)
	@Export("z")
	int z;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 214699869
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Llm;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "860894148"
	)
	static void method5914(PacketBufferNode var0) {
		var0.packetBuffer.method9609(WorldMapSectionType.field2665.hash); // L: 2843
		var0.packetBuffer.method9609(class388.field4545.hash); // L: 2844
		var0.packetBuffer.writeIntME(class195.field2052.hash); // L: 2845
		var0.packetBuffer.writeInt(ApproximateRouteStrategy.archive2.hash); // L: 2846
		var0.packetBuffer.method9611(class145.field1684.hash); // L: 2847
		var0.packetBuffer.method9609(VarpDefinition.field1881.hash); // L: 2848
		var0.packetBuffer.writeIntME(PlayerComposition.field3785.hash); // L: 2849
		var0.packetBuffer.writeIntME(class157.field1756.hash); // L: 2850
		var0.packetBuffer.writeIntME(class476.archive12.hash); // L: 2851
		var0.packetBuffer.writeInt(0); // L: 2852
		var0.packetBuffer.method9611(class151.field1715.hash); // L: 2853
		var0.packetBuffer.writeInt(class498.field5069.hash); // L: 2854
		var0.packetBuffer.method9611(LoginScreenAnimation.field1296.hash); // L: 2855
		var0.packetBuffer.writeIntME(class68.field497.hash); // L: 2856
	} // L: 2857
}
