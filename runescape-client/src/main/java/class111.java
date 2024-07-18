import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class111 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1431;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1421;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1422;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1423;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1426;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1420;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1432;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1427;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1428;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1424;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1430;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1429;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1437;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1433;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1434;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	static final class111 field1435;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -262339015
	)
	int field1436;

	static {
		field1431 = new class111(0); // L: 2163
		field1421 = new class111(1); // L: 2164
		field1422 = new class111(2); // L: 2165
		field1423 = new class111(3); // L: 2166
		field1426 = new class111(4); // L: 2167
		field1420 = new class111(5); // L: 2168
		field1432 = new class111(6); // L: 2169
		field1427 = new class111(7); // L: 2170
		field1428 = new class111(8); // L: 2171
		field1424 = new class111(9); // L: 2172
		field1430 = new class111(10); // L: 2173
		field1429 = new class111(11); // L: 2174
		field1437 = new class111(12); // L: 2175
		field1433 = new class111(13); // L: 2176
		field1434 = new class111(14); // L: 2177
		field1435 = new class111(15); // L: 2178
	}

	class111(int var1) {
		this.field1436 = var1; // L: 2182
	} // L: 2183

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1146245297"
	)
	public static void method2848() {
		class189.HitSplatDefinition_cached.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "0"
	)
	static boolean method2849(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		class282 var7 = class20.field91.field1316; // L: 8982
		int var9;
		if (var5 == class380.field4435.field4439) { // L: 8983
			class301 var8 = var7.method5528(var0, var1, var2); // L: 8984
			if (var8 != null) { // L: 8985
				var9 = class229.Entity_unpackID(var8.field3214); // L: 8986
				if (var3 == WorldMapDecorationType.field4027.id) { // L: 8987
					var8.field3213 = new class81(class20.field91, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.field3213); // L: 8988
					var8.field3208 = new class81(class20.field91, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.field3208); // L: 8989
				} else {
					var8.field3213 = new class81(class20.field91, var9, var3, var4, var0, var1, var2, var6, false, var8.field3213); // L: 8992
				}

				return true; // L: 8994
			}
		} else if (var5 == class380.field4436.field4439) { // L: 8997
			class303 var10 = var7.method5437(var0, var1, var2); // L: 8998
			if (var10 != null) { // L: 8999
				var9 = class229.Entity_unpackID(var10.field3221); // L: 9000
				if (var3 != WorldMapDecorationType.field4014.id && var3 != WorldMapDecorationType.field4026.id) { // L: 9001
					if (var3 == WorldMapDecorationType.field4016.id) { // L: 9004
						var10.field3220 = new class81(class20.field91, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.field3220); // L: 9005
					} else if (var3 == WorldMapDecorationType.field4017.id) { // L: 9007
						var10.field3220 = new class81(class20.field91, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.field3220); // L: 9008
					} else if (var3 == WorldMapDecorationType.field4018.id) { // L: 9010
						var10.field3220 = new class81(class20.field91, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.field3220); // L: 9011
						var10.field3228 = new class81(class20.field91, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.field3228); // L: 9012
					}
				} else {
					var10.field3220 = new class81(class20.field91, var9, 4, var4, var0, var1, var2, var6, false, var10.field3220); // L: 9002
				}

				return true; // L: 9014
			}
		} else if (var5 == class380.field4437.field4439) { // L: 9017
			class304 var11 = var7.method5438(var0, var1, var2); // L: 9018
			if (var3 == WorldMapDecorationType.field4030.id) { // L: 9019
				var3 = WorldMapDecorationType.field4029.id;
			}

			if (var11 != null) { // L: 9020
				var11.field3237 = new class81(class20.field91, class229.Entity_unpackID(var11.field3245), var3, var4, var0, var1, var2, var6, false, var11.field3237); // L: 9021
				return true; // L: 9022
			}
		} else if (var5 == class380.field4438.field4439) { // L: 9025
			class273 var12 = var7.method5549(var0, var1, var2); // L: 9026
			if (var12 != null) { // L: 9027
				var12.field2817 = new class81(class20.field91, class229.Entity_unpackID(var12.field2816), 22, var4, var0, var1, var2, var6, false, var12.field2817); // L: 9028
				return true; // L: 9029
			}
		}

		return false; // L: 9032
	}
}
