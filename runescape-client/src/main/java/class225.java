import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class225 {
	@ObfuscatedName("ak")
	public String field2417;
	@ObfuscatedName("ap")
	public float[] field2415;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1255674463
	)
	public int field2418;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1383873547
	)
	public int field2420;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2014108559
	)
	public int field2421;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	final class224 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lif;)V"
	)
	class225(class224 var1) {
		this.this$0 = var1;
		this.field2415 = new float[4]; // L: 260
		this.field2418 = 1; // L: 261
		this.field2420 = 1; // L: 262
		this.field2421 = 0; // L: 263
	} // L: 265

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;Ljava/lang/String;I)I",
		garbageValue = "696085709"
	)
	public static int method4305(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		byte[] var3 = class189.method3694(var1); // L: 15
		var0.writeSmartByteShort(var3.length); // L: 16
		var0.offset += class365.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 17
		return var0.offset - var2; // L: 18
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1962200947"
	)
	public static void method4304(int var0, int var1) {
		VarbitComposition var2 = ItemContainer.method2361(var0); // L: 35
		int var3 = var2.baseVar; // L: 36
		int var4 = var2.startBit; // L: 37
		int var5 = var2.endBit; // L: 38
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 39
		if (var1 < 0 || var1 > var6) { // L: 40
			var1 = 0;
		}

		var6 <<= var4; // L: 41
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 42
	} // L: 43

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-23"
	)
	static final int method4306() {
		return ViewportMouse.ViewportMouse_y; // L: 87
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIB)V",
		garbageValue = "15"
	)
	public static void method4302(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3838; // L: 906
		boolean var4 = var2 != var3.field3775; // L: 907
		var3.field3775 = var2; // L: 908
		if (var4) { // L: 909
			int var5;
			int var7;
			if (var3.field3775 == var1) { // L: 910
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 911
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 912
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 913
						var3.equipment[var7] = var3.field3771[var7]; // L: 914
					}
				}
			} else {
				label72: {
					if (var3.equipment[0] >= 512) { // L: 920
						boolean var8;
						if (var3.equipment[0] < 512) { // L: 923
							var8 = false; // L: 928
						} else {
							ItemComposition var6 = class164.ItemComposition_get(var3.equipment[0] - 512); // L: 924
							var8 = var6.field2223 != class210.field2307.field2311 && var6.field2231 != class210.field2307.field2311; // L: 925
						}

						if (!var8) { // L: 930
							break label72;
						}
					}

					var3.equipment[class210.field2307.field2311] = 1; // L: 932
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 934
					var7 = PlayerComposition.equipmentIndices[var5]; // L: 935
					if (var3.equipment[var7] > 0 && var3.equipment[var7] < 512) { // L: 936
						class325.method6121(var2, var3.equipment, var5); // L: 937
					}
				}
			}
		}

		var3.method6538(); // L: 942
	} // L: 943

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1261016918"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field729 = 0L; // L: 4886
		if (var0 >= 2) { // L: 4887
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4888
		}

		if (GrandExchangeOfferOwnWorldComparator.getWindowedMode() == 1) { // L: 4889
			class415.client.setMaxCanvasSize(765, 503); // L: 4890
		} else {
			class415.client.setMaxCanvasSize(7680, 2160); // L: 4893
		}

		if (Client.gameState >= 25) { // L: 4895
			class333.method6367();
		}

	} // L: 4896
}
