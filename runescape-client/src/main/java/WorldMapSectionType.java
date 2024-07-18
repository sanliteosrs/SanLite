import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2665;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = 561283007
	)
	static int field2666;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 754386531
	)
	@Export("type")
	final int type;
	@ObfuscatedName("an")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lut;",
		garbageValue = "-408274121"
	)
	public static class539 method4963(int var0) {
		class539 var1 = (class539)class539.DBRowType_cache.get((long)var0); // L: 20
		if (var1 != null) { // L: 21
			return var1;
		} else {
			byte[] var2 = class539.field5305.takeFile(38, var0); // L: 22
			var1 = new class539(); // L: 23
			if (var2 != null) { // L: 24
				var1.method9460(new Buffer(var2));
			}

			var1.method9459(); // L: 25
			class539.DBRowType_cache.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "1966297166"
	)
	public static HitSplatDefinition method4961(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.field2125.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.field2125.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	static final void method4962() {
		if (GrandExchangeEvents.field4576) { // L: 4234
			for (int var0 = 0; var0 < class511.field5137.field1319.field1404; ++var0) { // L: 4236
				Player var1 = class511.field5137.field1326[class511.field5137.field1319.field1409[var0]]; // L: 4237
				var1.method2412(); // L: 4238
			}

			GrandExchangeEvents.field4576 = false; // L: 4241
		}

	} // L: 4243
}
