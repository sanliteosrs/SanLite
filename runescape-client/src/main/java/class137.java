import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class137 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1622;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1621;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1614;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1634;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1616;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1617;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1618;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1619;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1613;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1631;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1615;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1623;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1624;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1625;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1626;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1627;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1628;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 459245751
	)
	static int field1630;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1514933645
	)
	final int field1629;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2043571075
	)
	final int field1633;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 270551211
	)
	final int field1620;

	static {
		field1622 = new class137(0, 0, (String)null, -1, -1); // L: 52
		field1621 = new class137(1, 1, (String)null, 0, 2); // L: 53
		field1614 = new class137(2, 2, (String)null, 1, 2); // L: 54
		field1634 = new class137(3, 3, (String)null, 2, 2); // L: 55
		field1616 = new class137(4, 4, (String)null, 3, 1); // L: 56
		field1617 = new class137(5, 5, (String)null, 4, 1); // L: 57
		field1618 = new class137(6, 6, (String)null, 5, 1); // L: 58
		field1619 = new class137(7, 7, (String)null, 6, 3); // L: 59
		field1613 = new class137(8, 8, (String)null, 7, 3); // L: 60
		field1631 = new class137(9, 9, (String)null, 8, 3); // L: 61
		field1615 = new class137(10, 10, (String)null, 0, 7); // L: 62
		field1623 = new class137(11, 11, (String)null, 1, 7); // L: 63
		field1624 = new class137(12, 12, (String)null, 2, 7); // L: 64
		field1625 = new class137(13, 13, (String)null, 3, 7); // L: 65
		field1626 = new class137(14, 14, (String)null, 4, 7); // L: 66
		field1627 = new class137(15, 15, (String)null, 5, 7); // L: 67
		field1628 = new class137(16, 16, (String)null, 0, 5); // L: 68
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class137(int var1, int var2, String var3, int var4, int var5) {
		this.field1629 = var1; // L: 74
		this.field1633 = var2; // L: 75
		this.field1620 = var4; // L: 76
	} // L: 77

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1633; // L: 80
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "632601697"
	)
	int method3178() {
		return this.field1620; // L: 84
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "479463461"
	)
	public static void method3187(int var0, int var1) {
		class33.method476(var0, var1, 0, 0); // L: 141
		class330.field3585.clear(); // L: 142
		class330.field3581.clear(); // L: 143
		if (!class330.field3584.isEmpty() && (var0 != 0 || var1 != 0)) { // L: 144
			class330.field3581.add(new class440((class444)null, class330.field3580)); // L: 145
			class330.field3581.add(new class442((class444)null, 0, false, class330.field3589)); // L: 146
			ArrayList var10 = new ArrayList(); // L: 149
			Iterator var4 = class330.field3584.iterator(); // L: 150

			while (var4.hasNext()) {
				class342 var5 = (class342)var4.next(); // L: 151
				var10.add(var5); // L: 153
			}

			class330.field3581.add(new class439((class444)null, var10)); // L: 159
		} else {
			Iterator var2 = class330.field3584.iterator(); // L: 163

			while (true) {
				class342 var3;
				do {
					if (!var2.hasNext()) {
						class330.field3584.clear(); // L: 185
						return; // L: 188
					}

					var3 = (class342)var2.next(); // L: 164
				} while(var3 == null); // L: 166

				var3.field3713.clear(); // L: 169
				var3.field3713.method6190(); // L: 170
				var3.field3713.setPcmStreamVolume(0); // L: 171
				var3.field3713.field3627 = 0; // L: 172
				int var8 = var3.field3716; // L: 173
				int var9 = var3.field3705; // L: 174
				Iterator var6 = class330.field3588.iterator(); // L: 176

				while (var6.hasNext()) { // L: 181
					class336 var7 = (class336)var6.next(); // L: 177
					var7.vmethod6382(var8, var9); // L: 179
				}
			}
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldy;I)V",
		garbageValue = "361069908"
	)
	static final void method3189(class101 var0, class96 var1) {
		class282 var2 = var0.field1316; // L: 9088
		long var3 = 0L; // L: 9089
		int var5 = -1; // L: 9090
		int var6 = 0; // L: 9091
		int var7 = 0; // L: 9092
		if (var1.field1172 == 0) { // L: 9093
			var3 = var2.method5440(var1.field1174, var1.field1178, var1.field1177);
		}

		if (var1.field1172 == 1) { // L: 9094
			var3 = var2.method5441(var1.field1174, var1.field1178, var1.field1177);
		}

		if (var1.field1172 == 2) { // L: 9095
			var3 = var2.method5442(var1.field1174, var1.field1178, var1.field1177);
		}

		if (var1.field1172 == 3) { // L: 9096
			var3 = var2.method5546(var1.field1174, var1.field1178, var1.field1177);
		}

		if (var3 != 0L) { // L: 9097
			int var8 = var2.method5444(var1.field1174, var1.field1178, var1.field1177, var3); // L: 9098
			var5 = class229.Entity_unpackID(var3); // L: 9099
			var6 = var8 & 31; // L: 9100
			var7 = var8 >> 6 & 3; // L: 9101
		}

		var1.field1180 = var5; // L: 9103
		var1.field1185 = var6; // L: 9104
		var1.field1176 = var7; // L: 9105
	} // L: 9106

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1432699417"
	)
	static final void method3188(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9855
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9856
				Client.field721[var4] = true;
			}
		}

	} // L: 9858

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1957525906"
	)
	static final void method3176(int var0) {
		if (ModeWhere.field4649.method6514(var0)) { // L: 12794
			Widget[] var1 = ModeWhere.field4649.field3740[var0]; // L: 12795

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12796
				Widget var3 = var1[var2]; // L: 12797
				if (var3 != null) { // L: 12798
					var3.modelFrame = 0; // L: 12799
					var3.modelFrameCycle = 0; // L: 12800
				}
			}

		}
	} // L: 12802
}
