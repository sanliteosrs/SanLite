import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class283 extends class290 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	static GameBuild field3003;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		longValue = 8680667411493769319L
	)
	static long field3005;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	class424 field3001;
	@ObfuscatedName("ad")
	float[] field3002;

	@ObfuscatedSignature(
		descriptor = "(Lqg;)V"
	)
	class283(class424 var1) {
		this.field3002 = new float[3]; // L: 7
		this.field3001 = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lkt;IIIIJ)V"
	)
	void vmethod5737(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5787(var2, this.field3001, var3, var4, var5, var6); // L: 15
	} // L: 16

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llt;IIII)V",
		garbageValue = "1938115394"
	)
	void vmethod5725(class282 var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = var4 << 7; // L: 21
		int var8;
		int var9 = var8 = var5 << 7; // L: 23
		int var10;
		int var11 = var10 = var7 + 128; // L: 25
		int var12;
		int var13 = var12 = var9 + 128; // L: 27
		int var14 = var1.field2972[var3][var4][var5]; // L: 28
		int var15 = var1.field2972[var3][var4 + 1][var5]; // L: 29
		int var16 = var1.field2972[var3][var4 + 1][var5 + 1]; // L: 30
		int var17 = var1.field2972[var3][var4][var5 + 1]; // L: 31
		this.field3001.method7792((float)var7, (float)var14, (float)var9, this.field3002); // L: 32
		var7 = (int)this.field3002[0]; // L: 33
		var14 = (int)this.field3002[1]; // L: 34
		var9 = (int)this.field3002[2] | 1; // L: 35
		this.field3001.method7792((float)var11, (float)var15, (float)var8, this.field3002); // L: 36
		var11 = (int)this.field3002[0]; // L: 37
		var15 = (int)this.field3002[1]; // L: 38
		var8 = (int)this.field3002[2] | 1; // L: 39
		this.field3001.method7792((float)var10, (float)var16, (float)var13, this.field3002); // L: 40
		var10 = (int)this.field3002[0]; // L: 41
		var16 = (int)this.field3002[1]; // L: 42
		var13 = (int)this.field3002[2] | 1; // L: 43
		this.field3001.method7792((float)var6, (float)var17, (float)var12, this.field3002); // L: 44
		var6 = (int)this.field3002[0]; // L: 45
		var17 = (int)this.field3002[1]; // L: 46
		var12 = (int)this.field3002[2] | 1; // L: 47
		this.method5727(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12); // L: 48
	} // L: 49

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llw;IIB)V",
		garbageValue = "112"
	)
	void vmethod5739(class282 var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length; // L: 53

		for (int var6 = 0; var6 < var5; ++var6) { // L: 54
			int var7 = var2.vertexX[var6]; // L: 55
			int var8 = var2.vertexY[var6]; // L: 56
			int var9 = var2.vertexZ[var6]; // L: 57
			this.field3001.method7792((float)var7, (float)var8, (float)var9, this.field3002); // L: 58
			var7 = (int)this.field3002[0]; // L: 59
			var8 = (int)this.field3002[1]; // L: 60
			var9 = (int)this.field3002[2]; // L: 61
			if (var2.triangleTextureId != null) { // L: 62
				SceneTileModel.field3063[var6] = var7; // L: 63
				SceneTileModel.field3075[var6] = var8; // L: 64
				SceneTileModel.field3076[var6] = var9; // L: 65
			}

			var9 |= 1; // L: 67
			SceneTileModel.field3065[var6] = Rasterizer3D.method5251() + var7 * Rasterizer3D.method5257() / var9; // L: 68
			SceneTileModel.field3073[var6] = Rasterizer3D.method5246() + var8 * Rasterizer3D.method5257() / var9; // L: 69
			SceneTileModel.field3072[var6] = class386.method7177(var9); // L: 70
		}

		this.method5738(var1, var2, var3, var4); // L: 72
	} // L: 73
}
