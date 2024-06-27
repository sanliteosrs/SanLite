import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public abstract class class489 implements class305 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	class534 field5037;

	class489(int var1) {
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "191575790"
	)
	abstract void vmethod8827(Buffer var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "799861739"
	)
	public void method8818(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 47
			}

			class485[] var3 = new class485[]{class485.field5028, class485.field5024, class485.field5026, class485.field5027}; // L: 21
			class485 var4 = (class485)class210.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field5025) { // L: 25
				case 0:
					class379[] var6 = new class379[]{class379.field4429, class379.field4432, class379.field4430, class379.field4431}; // L: 39
					class210.findEnumerated(var6, var1.readUnsignedByte()); // L: 41
					break;
				case 1:
					var1.readStringCp1252NullCircumfixed(); // L: 32
					break; // L: 33
				case 2:
					int var5 = var1.readUnsignedByte(); // L: 27
					this.field5037 = AttackOption.method2792(var5); // L: 28
					if (this.field5037 != null) { // L: 29
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 35
				}
			} else {
				this.vmethod8827(var1, var2); // L: 45
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1843509771"
	)
	boolean method8820() {
		return this.field5037 != null; // L: 52
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "-84"
	)
	Object method8821() {
		if (this.field5037 == class534.field5290) { // L: 56
			return 0; // L: 57
		} else if (this.field5037 == class534.field5284) { // L: 59
			return -1L; // L: 60
		} else {
			return this.field5037 == class534.field5286 ? "" : null; // L: 62 63 65
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "-921158618"
	)
	static void method8833(class103 var0) {
		var0.field1194 = var0.field1347.size; // L: 9773
		var0.field1259 = var0.field1347.field2020; // L: 9774
		var0.field1199 = var0.field1347.walkSequence; // L: 9775
		var0.field1200 = var0.field1347.walkBackSequence; // L: 9776
		var0.field1201 = var0.field1347.walkLeftSequence; // L: 9777
		var0.field1222 = var0.field1347.walkRightSequence; // L: 9778
		var0.field1196 = var0.field1347.idleSequence; // L: 9779
		var0.field1197 = var0.field1347.turnLeftSequence; // L: 9780
		var0.field1207 = var0.field1347.turnRightSequence; // L: 9781
		var0.field1203 = var0.field1347.field2000; // L: 9782
		var0.field1262 = var0.field1347.field2006; // L: 9783
		var0.field1219 = var0.field1347.field2002; // L: 9784
		var0.field1202 = var0.field1347.field2029; // L: 9785
		var0.field1205 = var0.field1347.field2004; // L: 9786
		var0.field1208 = var0.field1347.field2005; // L: 9787
		var0.field1249 = var0.field1347.field2011; // L: 9788
		var0.field1210 = var0.field1347.field2007; // L: 9789
	} // L: 9790
}
