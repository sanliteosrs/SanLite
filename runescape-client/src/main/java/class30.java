import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class30 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	static Widget field142;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1323524365
	)
	static int field143;
	@ObfuscatedName("jn")
	static int[] field147;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "1908706038"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 237
		if (var0.sound != null) { // L: 238
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 239
		}

	} // L: 240

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "249019892"
	)
	static void method446(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = class20.field91.field1334[var0][var1][var2]; // L: 8874
		if (var6 != null) { // L: 8875
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) { // L: 8876 8877 8882
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) { // L: 8878
					var7.quantity = var5; // L: 8879
					break;
				}
			}

			WorldMapManager.method4845(var0, var1, var2); // L: 8884
		}

	} // L: 8886

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1948030057"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		UrlRequest.scrollBarSprites[0].drawAt(var0, var1); // L: 11857
		UrlRequest.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11858
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field693); // L: 11859
		int var5 = var3 * (var3 - 32) / var4; // L: 11860
		if (var5 < 8) { // L: 11861
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11862
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field583); // L: 11863
		Rasterizer2D.method9938(var0, var6 + var1 + 16, var5, Client.field747); // L: 11864
		Rasterizer2D.method9938(var0 + 1, var6 + var1 + 16, var5, Client.field747); // L: 11865
		Rasterizer2D.method9884(var0, var6 + var1 + 16, 16, Client.field747); // L: 11866
		Rasterizer2D.method9884(var0, var6 + var1 + 17, 16, Client.field747); // L: 11867
		Rasterizer2D.method9938(var0 + 15, var6 + var1 + 16, var5, Client.field584); // L: 11868
		Rasterizer2D.method9938(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field584); // L: 11869
		Rasterizer2D.method9884(var0, var5 + var6 + var1 + 15, 16, Client.field584); // L: 11870
		Rasterizer2D.method9884(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field584); // L: 11871
	} // L: 11872

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "-1265045225"
	)
	static final void method451(Widget var0) {
		int var1 = var0.contentType; // L: 12994
		if (var1 == 324) { // L: 12995
			if (Client.field790 == -1) { // L: 12996
				Client.field790 = var0.spriteId2; // L: 12997
				Client.field665 = var0.spriteId; // L: 12998
			}

			if (Client.playerAppearance.field3775 == 1) { // L: 13000
				var0.spriteId2 = Client.field790;
			} else {
				var0.spriteId2 = Client.field665; // L: 13001
			}

		} else if (var1 == 325) { // L: 13004
			if (Client.field790 == -1) { // L: 13005
				Client.field790 = var0.spriteId2; // L: 13006
				Client.field665 = var0.spriteId; // L: 13007
			}

			if (Client.playerAppearance.field3775 == 1) { // L: 13009
				var0.spriteId2 = Client.field665;
			} else {
				var0.spriteId2 = Client.field790; // L: 13010
			}

		} else if (var1 == 327) { // L: 13013
			var0.modelAngleX = 150; // L: 13014
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 13015
			var0.modelType = 5; // L: 13016
			var0.modelId = 0; // L: 13017
		} else if (var1 == 328) { // L: 13020
			var0.modelAngleX = 150; // L: 13021
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 13022
			var0.modelType = 5; // L: 13023
			var0.modelId = 1; // L: 13024
		}
	} // L: 13002 13011 13018 13025 13027
}
