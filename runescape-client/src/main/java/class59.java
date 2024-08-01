import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class59 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	VorbisFloor field403;
	@ObfuscatedName("ad")
	boolean field408;
	@ObfuscatedName("ag")
	int[] field404;
	@ObfuscatedName("ak")
	int[] field402;
	@ObfuscatedName("ap")
	boolean[] field405;

	@ObfuscatedSignature(
		descriptor = "(Lbc;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field403 = var1; // L: 11
		this.field408 = var2; // L: 12
		this.field404 = var3; // L: 13
		this.field402 = var4; // L: 14
		this.field405 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "1967927782"
	)
	void method1158(float[] var1, int var2) {
		int var3 = this.field403.field254.length; // L: 19
		VorbisFloor var10000 = this.field403; // L: 20
		int var4 = VorbisFloor.field256[this.field403.multiplier - 1];
		boolean[] var5 = this.field405; // L: 21
		this.field405[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field403.method793(this.field404, var6); // L: 25
			var8 = this.field403.method775(this.field404, var6); // L: 26
			var9 = this.field403.method777(this.field404[var7], this.field402[var7], this.field404[var8], this.field402[var8], this.field404[var6]); // L: 27
			var10 = this.field402[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field405; // L: 33
				this.field405[var8] = true; // L: 35
				var14[var7] = true; // L: 36
				this.field405[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field402[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field402[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field405[var6] = false; // L: 46
				this.field402[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field403.multiplier * this.field402[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field405[var8]) { // L: 54
				var9 = this.field404[var8]; // L: 55
				var10 = this.field403.multiplier * this.field402[var8]; // L: 56
				this.field403.method778(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field403; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "6578"
	)
	boolean method1161() {
		return this.field408; // L: 68
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-20"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1; // L: 73
			int var4 = this.field404[var1]; // L: 74
			int var5 = this.field402[var1]; // L: 75
			boolean var6 = this.field405[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field404[var7]; // L: 78
				if (var8 < var4) { // L: 79
					this.field404[var3] = var8; // L: 80
					this.field402[var3] = this.field402[var7]; // L: 81
					this.field405[var3] = this.field405[var7]; // L: 82
					++var3; // L: 83
					this.field404[var7] = this.field404[var3]; // L: 84
					this.field402[var7] = this.field402[var3]; // L: 85
					this.field405[var7] = this.field405[var3]; // L: 86
				}
			}

			this.field404[var3] = var4; // L: 89
			this.field402[var3] = var5; // L: 90
			this.field405[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "101"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4970
			byte var2 = 4; // L: 4971
			int var3 = var2 + 6; // L: 4972
			int var4 = var2 + 6; // L: 4973
			int var5 = FloorUnderlayDefinition.fontPlain12.lineWidth(var0, 250); // L: 4974
			int var6 = FloorUnderlayDefinition.fontPlain12.lineCount(var0, 250) * 13; // L: 4975
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0); // L: 4976
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 16777215); // L: 4977
			FloorUnderlayDefinition.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4978
			class137.method3188(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2); // L: 4979
			if (var1) { // L: 4980
				class434.rasterProvider.drawFull(0, 0); // L: 4981
			} else {
				class101.method2684(var3, var4, var5, var6); // L: 4984
			}

		}
	} // L: 4986
}
