import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class425 {
	@ObfuscatedName("aq")
	float field4711;
	@ObfuscatedName("ad")
	float field4710;
	@ObfuscatedName("ag")
	float field4712;
	@ObfuscatedName("ak")
	float field4713;
	@ObfuscatedName("ap")
	float field4714;
	@ObfuscatedName("an")
	float field4715;
	@ObfuscatedName("aj")
	float field4719;
	@ObfuscatedName("av")
	float field4717;
	@ObfuscatedName("ab")
	float field4716;
	@ObfuscatedName("ai")
	float field4720;
	@ObfuscatedName("ae")
	float field4718;
	@ObfuscatedName("au")
	float field4721;

	static {
		new class425();
	} // L: 6

	public class425() {
		this.method7862(); // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	void method7862() {
		this.field4721 = 0.0F; // L: 26
		this.field4718 = 0.0F; // L: 27
		this.field4720 = 0.0F; // L: 28
		this.field4717 = 0.0F; // L: 29
		this.field4719 = 0.0F; // L: 30
		this.field4715 = 0.0F; // L: 31
		this.field4713 = 0.0F; // L: 32
		this.field4712 = 0.0F; // L: 33
		this.field4710 = 0.0F; // L: 34
		this.field4716 = 1.0F; // L: 35
		this.field4714 = 1.0F; // L: 36
		this.field4711 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1557731"
	)
	public void method7861(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4710; // L: 43
		float var5 = this.field4714; // L: 44
		float var6 = this.field4717; // L: 45
		float var7 = this.field4718; // L: 46
		this.field4710 = var2 * var4 - var3 * this.field4712; // L: 47
		this.field4712 = var3 * var4 + this.field4712 * var2; // L: 48
		this.field4714 = var5 * var2 - var3 * this.field4715; // L: 49
		this.field4715 = var2 * this.field4715 + var5 * var3; // L: 50
		this.field4717 = var6 * var2 - var3 * this.field4716; // L: 51
		this.field4716 = var3 * var6 + this.field4716 * var2; // L: 52
		this.field4718 = var7 * var2 - var3 * this.field4721; // L: 53
		this.field4721 = var2 * this.field4721 + var7 * var3; // L: 54
	} // L: 55

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1500176816"
	)
	public void method7871(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4711; // L: 60
		float var5 = this.field4713; // L: 61
		float var6 = this.field4719; // L: 62
		float var7 = this.field4720; // L: 63
		this.field4711 = var3 * this.field4712 + var4 * var2; // L: 64
		this.field4712 = var2 * this.field4712 - var4 * var3; // L: 65
		this.field4713 = var2 * var5 + var3 * this.field4715; // L: 66
		this.field4715 = this.field4715 * var2 - var5 * var3; // L: 67
		this.field4719 = this.field4716 * var3 + var6 * var2; // L: 68
		this.field4716 = var2 * this.field4716 - var6 * var3; // L: 69
		this.field4720 = var7 * var2 + var3 * this.field4721; // L: 70
		this.field4721 = this.field4721 * var2 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-265108750"
	)
	void method7863(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4711; // L: 77
		float var5 = this.field4713; // L: 78
		float var6 = this.field4719; // L: 79
		float var7 = this.field4720; // L: 80
		this.field4711 = var2 * var4 - this.field4710 * var3; // L: 81
		this.field4710 = var3 * var4 + this.field4710 * var2; // L: 82
		this.field4713 = var2 * var5 - var3 * this.field4714; // L: 83
		this.field4714 = this.field4714 * var2 + var5 * var3; // L: 84
		this.field4719 = var6 * var2 - this.field4717 * var3; // L: 85
		this.field4717 = var6 * var3 + this.field4717 * var2; // L: 86
		this.field4720 = var2 * var7 - this.field4718 * var3; // L: 87
		this.field4718 = var7 * var3 + this.field4718 * var2; // L: 88
	} // L: 89

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "1"
	)
	public void method7864(float var1, float var2, float var3) {
		this.field4720 += var1; // L: 92
		this.field4718 += var2; // L: 93
		this.field4721 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4711 + "," + this.field4713 + "," + this.field4719 + "," + this.field4720 + "\n" + this.field4710 + "," + this.field4714 + "," + this.field4717 + "," + this.field4718 + "\n" + this.field4712 + "," + this.field4715 + "," + this.field4716 + "," + this.field4721; // L: 99
	}
}
