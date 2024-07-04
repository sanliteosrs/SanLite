import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class161 extends class147 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1872253511
	)
	int field1796;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class161(class150 var1) {
		this.this$0 = var1;
		this.field1796 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1796 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3359(this.field1796); // L: 222
	} // L: 223

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldw;I)V",
		garbageValue = "1321297831"
	)
	static final void method3429(class101 var0, Actor var1) {
		int var3;
		int var4;
		int var5;
		if (var1.field1190 != -1) { // L: 4615
			Object var2 = null; // L: 4616
			var3 = 65536; // L: 4617
			if (var1.field1190 < var3) { // L: 4618
				var2 = var0.field1315[var1.field1190]; // L: 4619
			} else {
				var2 = var0.field1326[var1.field1190 - var3]; // L: 4622
			}

			if (var2 != null) { // L: 4624
				var4 = var1.x - ((Actor)var2).x; // L: 4625
				var5 = var1.field1191 - ((Actor)var2).field1191; // L: 4626
				if (var4 != 0 || var5 != 0) { // L: 4627
					var1.field1257 = class418.method7673(var4, var5); // L: 4628
				}
			} else if (var1.field1209) { // L: 4631
				var1.field1190 = -1; // L: 4632
				var1.field1209 = false; // L: 4633
			}
		}

		int var8;
		if (var1.field1229 == 0 || var1.field1264 > 0) { // L: 4636
			var8 = -1; // L: 4637
			if (var1.field1252 != -1 && var1.field1225 != -1) { // L: 4638
				var3 = class376.method7084(var1.field1252 - class511.field5137.field1321); // L: 4639
				var4 = class376.method7084(var1.field1225 - class511.field5137.field1323); // L: 4640
				var5 = var1.x - var3; // L: 4641
				int var6 = var1.field1191 - var4; // L: 4642
				if (var5 != 0 || var6 != 0) { // L: 4643
					var8 = class418.method7673(var5, var6); // L: 4644
				}
			} else if (var1.field1227 != -1) { // L: 4647
				var8 = var1.field1227; // L: 4648
			}

			if (var8 != -1) { // L: 4650
				var1.field1257 = var8; // L: 4651
				if (var1.field1230) { // L: 4652
					var1.field1192 = var1.field1257; // L: 4653
				}
			}

			var1.method2485(); // L: 4656
		}

		var8 = var1.field1257 - var1.field1192 & 2047; // L: 4658
		if (var8 != 0) { // L: 4659
			boolean var9 = true; // L: 4660
			boolean var10 = true; // L: 4661
			++var1.field1258; // L: 4662
			var5 = var8 > 1024 ? -1 : 1; // L: 4663
			var1.field1192 += var1.field1259 * var5; // L: 4664
			boolean var11 = true; // L: 4665
			if (var8 < var1.field1259 || var8 > 2048 - var1.field1259) { // L: 4666
				var1.field1192 = var1.field1257; // L: 4667
				var11 = false; // L: 4668
			}

			if (var1.field1259 > 0 && var1.field1196 == var1.field1198 && (var1.field1258 > 25 || var11)) { // L: 4670
				if (var5 == -1 && var1.field1197 != -1) { // L: 4671
					var1.field1198 = var1.field1197; // L: 4672
				} else if (var5 == 1 && var1.field1207 != -1) { // L: 4674
					var1.field1198 = var1.field1207; // L: 4675
				} else {
					var1.field1198 = var1.field1199; // L: 4678
				}
			}

			var1.field1192 &= 2047; // L: 4682
		} else {
			if (var1.field1209) { // L: 4685
				var1.field1190 = -1; // L: 4686
				var1.field1209 = false; // L: 4687
			}

			var1.field1258 = 0; // L: 4689
		}

	} // L: 4691
}
