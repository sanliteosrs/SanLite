import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class298 {
	@ObfuscatedName("aq")
	boolean field3192;
	@ObfuscatedName("ad")
	public boolean field3185;
	@ObfuscatedName("ag")
	int field3186;
	@ObfuscatedName("an")
	public int field3184;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Rasterizer3D_textureLoader")
	public TextureLoader Rasterizer3D_textureLoader;
	@ObfuscatedName("ah")
	int field3196;
	@ObfuscatedName("az")
	int field3197;
	@ObfuscatedName("ax")
	int field3198;
	@ObfuscatedName("ac")
	int field3199;
	@ObfuscatedName("al")
	int field3188;
	@ObfuscatedName("ay")
	int field3201;
	@ObfuscatedName("ao")
	int field3189;
	@ObfuscatedName("aa")
	int field3190;
	@ObfuscatedName("as")
	@Export("Rasterizer3D_rowOffsets")
	int[] Rasterizer3D_rowOffsets;

	class298() {
		this.field3192 = false; // L: 6
		this.field3185 = true; // L: 7
		this.field3186 = 0; // L: 8
		this.field3184 = 512; // L: 11
		this.Rasterizer3D_rowOffsets = new int[1024]; // L: 26
	} // L: 28

	@ObfuscatedName("aq")
	void method5946() {
		this.field3196 = this.field3198 / 2; // L: 31
		this.field3197 = this.field3199 / 2; // L: 32
		this.field3188 = -this.field3196; // L: 33
		this.field3201 = this.field3198 - this.field3196; // L: 34
		this.field3189 = -this.field3197; // L: 35
		this.field3190 = this.field3199 - this.field3197; // L: 36
	} // L: 37

	@ObfuscatedName("ad")
	void method5947(int var1, int var2, int var3, int var4) {
		this.field3196 = var1 - var2; // L: 40
		this.field3197 = var3 - var4; // L: 41
		this.field3188 = -this.field3196; // L: 42
		this.field3201 = this.field3198 - this.field3196; // L: 43
		this.field3189 = -this.field3197; // L: 44
		this.field3190 = this.field3199 - this.field3197; // L: 45
	} // L: 46

	@ObfuscatedName("ag")
	void method5948(int var1, int var2, int var3) {
		this.field3192 = var1 < 0 || var1 > this.field3198 || var2 < 0 || var2 > this.field3198 || var3 < 0 || var3 > this.field3198; // L: 49
	} // L: 50
}
