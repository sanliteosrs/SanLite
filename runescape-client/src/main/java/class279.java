import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class279 {
	@ObfuscatedName("ju")
	static byte[][] field2894;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lfv;"
	)
	class132[] field2893;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1044726639
	)
	int field2896;

	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V"
	)
	class279(Buffer var1, int var2) {
		this.field2893 = new class132[var2]; // L: 13
		this.field2896 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2893.length; ++var3) { // L: 15
			class132 var4 = new class132(this.field2896, var1, false); // L: 16
			this.field2893[var3] = var4;
		}

		this.method5344(); // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1610691806"
	)
	void method5344() {
		class132[] var1 = this.field2893; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class132 var3 = var1[var2]; // L: 26
			if (var3.field1546 >= 0) { // L: 28
				var3.field1554 = this.field2893[var3.field1546]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "630666373"
	)
	public int method5356() {
		return this.field2893.length; // L: 37
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "-733880039"
	)
	class132 method5343(int var1) {
		return var1 >= this.method5356() ? null : this.field2893[var1]; // L: 41 42 44
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfv;",
		garbageValue = "-68"
	)
	class132[] method5342() {
		return this.field2893; // L: 48
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lft;IB)V",
		garbageValue = "99"
	)
	void method5345(class142 var1, int var2) {
		this.method5346(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lft;I[ZZI)V",
		garbageValue = "-297669474"
	)
	void method5346(class142 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3205(); // L: 56
		int var6 = 0; // L: 57
		class132[] var7 = this.method5342(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class132 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method3211(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)[Lof;",
		garbageValue = "19113"
	)
	public static StudioGame[] method5358() {
		return new StudioGame[]{StudioGame.runescape, StudioGame.stellardawn, StudioGame.game4, StudioGame.game5, StudioGame.oldscape, StudioGame.game3}; // L: 17
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "69"
	)
	static void method5357(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class20.field91.field1334[var0][var1][var2]; // L: 8945
		if (var5 != null) { // L: 8946
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) { // L: 8947 8948 8953
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) { // L: 8949
					var6.remove(); // L: 8950
					break;
				}
			}

			if (var5.last() == null) { // L: 8955
				class20.field91.field1334[var0][var1][var2] = null;
			}

			WorldMapManager.method4845(var0, var1, var2); // L: 8956
		}

	} // L: 8958
}
