import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class408 {
	@ObfuscatedName("h")
	float field4598;
	@ObfuscatedName("e")
	float field4599;
	@ObfuscatedName("v")
	float field4597;

	static {
		new class408(0.0F, 0.0F, 0.0F); // L: 5
		new class408(1.0F, 1.0F, 1.0F); // L: 9
		new class408(1.0F, 0.0F, 0.0F); // L: 13
		new class408(0.0F, 1.0F, 0.0F); // L: 17
		new class408(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class408(float var1, float var2, float var3) {
		this.field4598 = var1; // L: 33
		this.field4599 = var2; // L: 34
		this.field4597 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "83"
	)
	final float method7751() {
		return (float)Math.sqrt((double)(this.field4598 * this.field4598 + this.field4599 * this.field4599 + this.field4597 * this.field4597)); // L: 39
	}

	public String toString() {
		return this.field4598 + ", " + this.field4599 + ", " + this.field4597; // L: 44
	}
}
