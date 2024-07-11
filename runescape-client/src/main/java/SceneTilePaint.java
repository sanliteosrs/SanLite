import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1673746339
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -860148807
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1168172891
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 716391559
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -233451403
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("an")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -448594561
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIII)V",
		garbageValue = "464797774"
	)
	static final void method5915(class101 var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.field1334[var1][var2][var3]; // L: 9212
		if (var4 == null) { // L: 9213
			var0.field1316.method5435(var1, var2, var3); // L: 9214
		} else {
			long var5 = -99999999L; // L: 9217
			TileItem var7 = null; // L: 9218

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) { // L: 9219 9220 9230
				ItemComposition var9 = class164.ItemComposition_get(var8.id); // L: 9221
				long var13 = (long)var9.price; // L: 9222
				if (var9.isStackable == 1) { // L: 9223
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity; // L: 9224
				}

				if (var13 > var5) { // L: 9226
					var5 = var13; // L: 9227
					var7 = var8; // L: 9228
				}
			}

			if (var7 == null) { // L: 9232
				var0.field1316.method5435(var1, var2, var3); // L: 9233
			} else {
				var4.addLast(var7); // L: 9236
				TileItem var15 = null; // L: 9237
				TileItem var10 = null; // L: 9238

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) { // L: 9239 9240 9245
					if (var7.id != var8.id) { // L: 9241
						if (var15 == null) { // L: 9242
							var15 = var8;
						}

						if (var8.id != var15.id && var10 == null) { // L: 9243
							var10 = var8;
						}
					}
				}

				long var11 = FileSystem.method4223(var2, var3, 3, false, 0, var0.field1328); // L: 9247
				var0.field1316.method5421(var1, var2, var3, class169.method3519(var0, class376.method7084(var2), class376.method7084(var3), var1), var7, var11, var15, var10); // L: 9248
			}
		}
	} // L: 9215 9234 9249
}
