import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
public class class422 {
	@ObfuscatedName("gp")
	static String field4694;
	@ObfuscatedName("aq")
	float field4695;
	@ObfuscatedName("ad")
	float field4692;
	@ObfuscatedName("ag")
	float field4693;

	static {
		new class422(0.0F, 0.0F, 0.0F); // L: 5
		new class422(1.0F, 1.0F, 1.0F); // L: 9
		new class422(1.0F, 0.0F, 0.0F); // L: 13
		new class422(0.0F, 1.0F, 0.0F); // L: 17
		new class422(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	public class422(float var1, float var2, float var3) {
		this.field4695 = var1; // L: 35
		this.field4692 = var2; // L: 36
		this.field4693 = var3; // L: 37
	} // L: 38

	class422() {
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqo;I)Z",
		garbageValue = "-581172975"
	)
	boolean method7724(class422 var1) {
		return this.field4695 == var1.field4695 && this.field4692 == var1.field4692 && var1.field4693 == this.field4693; // L: 41
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1694682556"
	)
	final float method7723() {
		return (float)Math.sqrt((double)(this.field4693 * this.field4693 + this.field4695 * this.field4695 + this.field4692 * this.field4692)); // L: 46
	}

	public String toString() {
		return this.field4695 + ", " + this.field4692 + ", " + this.field4693; // L: 51
	}
}
