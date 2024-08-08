import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class235 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lde;[BIII)V",
		garbageValue = "1525733208"
	)
	static final void method4451(class101 var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1); // L: 262
		int var5 = -1; // L: 263

		while (true) {
			int var6 = var4.method9575(); // L: 265
			if (var6 == 0) { // L: 266
				return; // L: 290
			}

			var5 += var6; // L: 267
			int var7 = 0; // L: 268

			while (true) {
				int var8 = var4.readUShortSmart(); // L: 270
				if (var8 == 0) { // L: 271
					break;
				}

				var7 += var8 - 1; // L: 272
				int var9 = var7 & 63; // L: 273
				int var10 = var7 >> 6 & 63; // L: 274
				int var11 = var7 >> 12; // L: 275
				int var12 = var4.readUnsignedByte(); // L: 276
				int var13 = var12 >> 2; // L: 277
				int var14 = var12 & 3; // L: 278
				int var15 = var10 + var2; // L: 279
				int var16 = var3 + var9; // L: 280
				if (var15 > 0 && var16 > 0 && var15 < var0.field1327[0].length - 2 && var16 < var0.field1327[0][0].length - 2) { // L: 281
					int var17 = var11; // L: 282
					if ((var0.field1325[1][var15][var16] & 2) == 2) { // L: 283
						var17 = var11 - 1;
					}

					CollisionMap var18 = null; // L: 284
					if (var17 >= 0 && var0.field1317 != null) { // L: 285
						var18 = var0.field1317[var17];
					}

					class25.method371(var0, var11, var15, var16, var5, var14, var13, var18); // L: 286
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1105010162"
	)
	static final void method4450() {
		AbstractWorldMapIcon.method5076("You can't add yourself to your own ignore list"); // L: 164
	} // L: 165
}
