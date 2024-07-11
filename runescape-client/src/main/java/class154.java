import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class154 extends class147 {
	@ObfuscatedName("aq")
	boolean field1735;
	@ObfuscatedName("ad")
	byte field1734;
	@ObfuscatedName("ag")
	byte field1737;
	@ObfuscatedName("ak")
	byte field1736;
	@ObfuscatedName("ap")
	byte field1738;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class154(class150 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1735 = var1.readUnsignedByte() == 1; // L: 251
		this.field1734 = var1.readByte(); // L: 252
		this.field1737 = var1.readByte(); // L: 253
		this.field1736 = var1.readByte(); // L: 254
		this.field1738 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.allowGuests = this.field1735; // L: 259
		var1.field1766 = this.field1734; // L: 260
		var1.field1767 = this.field1737; // L: 261
		var1.field1768 = this.field1736; // L: 262
		var1.field1769 = this.field1738; // L: 263
	} // L: 264

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldg;",
		garbageValue = "-22186846"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 85
		Buffer var2 = new Buffer(var0); // L: 86
		var2.offset = var2.array.length - 2; // L: 87
		int var3 = var2.readUnsignedShort(); // L: 88
		int var4 = var2.array.length - 2 - var3 - 12; // L: 89
		var2.offset = var4; // L: 90
		int var5 = var2.readInt(); // L: 91
		var1.localIntCount = var2.readUnsignedShort(); // L: 92
		var1.localStringCount = var2.readUnsignedShort(); // L: 93
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 94
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 95
		int var6 = var2.readUnsignedByte(); // L: 96
		int var7;
		int var8;
		if (var6 > 0) { // L: 97
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 98

			for (var7 = 0; var7 < var6; ++var7) { // L: 99
				var8 = var2.readUnsignedShort(); // L: 100
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? ModeWhere.method7432(var8) : 1); // L: 101
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt(); // L: 104
					int var11 = var2.readInt(); // L: 105
					var9.put(new IntegerNode(var11), (long)var10); // L: 106
				}
			}
		}

		var2.offset = 0; // L: 110
		var1.field1011 = var2.readStringCp1252NullTerminatedOrNull(); // L: 111
		var1.opcodes = new int[var5]; // L: 112
		var1.intOperands = new int[var5]; // L: 113
		var1.stringOperands = new String[var5]; // L: 114

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 115 116 121
			var8 = var2.readUnsignedShort(); // L: 117
			if (var8 == 3) { // L: 118
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 119
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 120
			}
		}

		return var1; // L: 123
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "747669371"
	)
	public static int method3321(int var0, int var1, int var2) {
		if (var1 < var0) { // L: 102
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1)); // L: 103
		}
	}
}
