import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2063081713
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 762836177
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2146983277
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -999030493
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1294352083"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-616069916"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "395722178"
	)
	public boolean method7678(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;B)V",
		garbageValue = "112"
	)
	public void method7674(Bounds var1, Bounds var2) {
		this.method7679(var1, var2); // L: 37
		this.method7680(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)V",
		garbageValue = "2083293993"
	)
	void method7679(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method7681() > var1.method7681()) { // L: 48
			var2.highX -= var2.method7681() - var1.method7681(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)V",
		garbageValue = "1337809760"
	)
	void method7680(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method7707() > var1.method7707()) { // L: 61
			var2.highY -= var2.method7707() - var1.method7707(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	int method7681() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "75"
	)
	int method7707() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhw;",
		garbageValue = "-935592626"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIIIII)V",
		garbageValue = "-1453069211"
	)
	static final void method7705(class101 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		class282 var9 = var0.field1316; // L: 9158
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.field1332 - 1 && var4 <= var0.field1320 - 1) { // L: 9159
			if (Client.isLowDetail && var0.field1318 != var1) { // L: 9160
				return;
			}

			long var10 = 0L; // L: 9161
			boolean var12 = true; // L: 9162
			boolean var13 = false; // L: 9163
			boolean var14 = false; // L: 9164
			if (var2 == 0) { // L: 9165
				var10 = var9.method5440(var1, var3, var4);
			}

			if (var2 == 1) { // L: 9166
				var10 = var9.method5441(var1, var3, var4);
			}

			if (var2 == 2) { // L: 9167
				var10 = var9.method5442(var1, var3, var4);
			}

			if (var2 == 3) { // L: 9168
				var10 = var9.method5546(var1, var3, var4);
			}

			int var15;
			ObjectComposition var16;
			if (var10 != 0L) { // L: 9169
				var15 = var9.method5444(var1, var3, var4, var10); // L: 9170
				int var17 = class229.Entity_unpackID(var10); // L: 9171
				int var18 = var15 & 31; // L: 9172
				int var19 = var15 >> 6 & 3; // L: 9173
				var16 = class10.getObjectDefinition(var17); // L: 9174
				SoundCache.method894(var1, var3, var4, var16, var19); // L: 9175
				if (var2 == 0) { // L: 9176
					var9.method5551(var1, var3, var4); // L: 9177
					if (var16.interactType != 0) {
						var0.field1317[var1].method4440(var3, var4, var18, var19, var16.boolean1); // L: 9178
					}
				}

				if (var2 == 1) { // L: 9180
					var9.method5432(var1, var3, var4);
				}

				if (var2 == 2) { // L: 9181
					var9.method5662(var1, var3, var4); // L: 9182
					if (var3 + var16.sizeX > var0.field1332 - 1 || var4 + var16.sizeX > var0.field1320 - 1 || var3 + var16.sizeY > var0.field1332 - 1 || var4 + var16.sizeY > var0.field1320 - 1) { // L: 9183
						return;
					}

					if (var16.interactType != 0) { // L: 9184
						var0.field1317[var1].setFlagOffNonSquare(var3, var4, var16.sizeX, var16.sizeY, var19, var16.boolean1);
					}
				}

				if (var2 == 3) { // L: 9186
					var9.method5434(var1, var3, var4); // L: 9187
					if (var16.interactType == 1) { // L: 9188
						var0.field1317[var1].method4419(var3, var4);
					}
				}
			}

			if (var5 >= 0) { // L: 9191
				var15 = var1; // L: 9192
				if (var1 < 3 && (var0.field1325[1][var3][var4] & 2) == 2) { // L: 9193
					var15 = var1 + 1;
				}

				Login.method2206(var0, var1, var15, var3, var4, var5, var6, var7, var8, var0.field1317[var1]); // L: 9194
				var16 = class10.getObjectDefinition(var5); // L: 9195
				if (var16 != null && var16.hasSound()) { // L: 9196
					class134.method3130(var15, var3, var4, var16, var6); // L: 9197
				}
			}
		}

	} // L: 9201
}
