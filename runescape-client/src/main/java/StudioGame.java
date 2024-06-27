import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("StudioGame")
public enum StudioGame implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	static class67 field4084;
	@ObfuscatedName("aj")
	@Export("name")
	public final String name;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1132351427
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdb;I)V",
		garbageValue = "-1758462952"
	)
	static void method7081(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = class10.getObjectDefinition(var6); // L: 8889
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) { // L: 8892
			var15 = var14.sizeX; // L: 8897
			var16 = var14.sizeY; // L: 8898
		} else {
			var15 = var14.sizeY; // L: 8893
			var16 = var14.sizeX; // L: 8894
		}

		int var17 = (var15 >> 1) + var1; // L: 8900
		int var18 = (var15 + 1 >> 1) + var1; // L: 8901
		int var19 = (var16 >> 1) + var2; // L: 8902
		int var20 = var2 + (var16 + 1 >> 1); // L: 8903
		int[][] var21 = class20.field91.field1327[var0]; // L: 8904
		int var22 = var21[var18][var20] + var21[var17][var20] + var21[var18][var19] + var21[var17][var19] >> 2; // L: 8905
		int var23 = (var1 << 7) + (var15 << 6); // L: 8906
		int var24 = (var2 << 7) + (var16 << 6); // L: 8907
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24); // L: 8908
		if (var25 != null) { // L: 8909
			KeyHandler.method433(class20.field91, var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1); // L: 8910
			var13.field1119 = var7 + Client.cycle; // L: 8911
			var13.field1118 = var8 + Client.cycle; // L: 8912
			var13.field1131 = var25; // L: 8913
			var13.field1128 = var1 * 128 + var15 * 64; // L: 8914
			var13.field1130 = var2 * 128 + var16 * 64; // L: 8915
			var13.field1129 = var22; // L: 8916
			int var26;
			if (var9 > var11) { // L: 8917
				var26 = var9; // L: 8918
				var9 = var11; // L: 8919
				var11 = var26; // L: 8920
			}

			if (var10 > var12) { // L: 8922
				var26 = var10; // L: 8923
				var10 = var12; // L: 8924
				var12 = var26; // L: 8925
			}

			var13.field1132 = var9 + var1; // L: 8927
			var13.field1134 = var11 + var1; // L: 8928
			var13.field1126 = var10 + var2; // L: 8929
			var13.field1139 = var2 + var12; // L: 8930
		}

	} // L: 8932
}
