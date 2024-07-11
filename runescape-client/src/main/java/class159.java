import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class159 extends class163 {
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 957518491
	)
	static int field1789;
	@ObfuscatedName("aq")
	String field1787;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1439169443
	)
	int field1788;
	@ObfuscatedName("ag")
	byte field1786;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class159(class164 var1) {
		this.this$0 = var1;
		this.field1787 = null; // L: 57
	} // L: 61

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	void vmethod3524(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 64
			--var1.offset; // L: 65
			var1.readLong(); // L: 66
		}

		this.field1787 = var1.readStringCp1252NullTerminatedOrNull(); // L: 68
		this.field1788 = var1.readUnsignedShort(); // L: 69
		this.field1786 = var1.readByte(); // L: 70
		var1.readLong(); // L: 71
	} // L: 72

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	void vmethod3523(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 75
		var2.username = new Username(this.field1787); // L: 76
		var2.world = this.field1788; // L: 77
		var2.rank = this.field1786; // L: 78
		var1.addMember(var2); // L: 79
	} // L: 80

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-955766921"
	)
	static boolean method3418(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 240
			int var3 = var2.read(); // L: 241
			var2.seek(0L); // L: 242
			var2.write(var3); // L: 243
			var2.seek(0L); // L: 244
			var2.close(); // L: 245
			if (var1) { // L: 246
				var0.delete();
			}

			return true; // L: 247
		} catch (Exception var4) { // L: 249
			return false; // L: 250
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "-414202999"
	)
	static IndexedSprite method3419() {
		IndexedSprite var0 = new IndexedSprite(); // L: 175
		var0.width = class561.SpriteBuffer_spriteWidth; // L: 176
		var0.height = class561.SpriteBuffer_spriteHeight; // L: 177
		var0.xOffset = UserComparator4.SpriteBuffer_xOffsets[0]; // L: 178
		var0.yOffset = class145.SpriteBuffer_yOffsets[0]; // L: 179
		var0.subWidth = class561.SpriteBuffer_spriteWidths[0]; // L: 180
		var0.subHeight = class315.SpriteBuffer_spriteHeights[0] * -897865968; // L: 181
		var0.palette = class561.SpriteBuffer_spritePalette; // L: 182
		var0.pixels = class561.SpriteBuffer_pixels[0]; // L: 183
		Calendar.method7029(); // L: 184
		return var0; // L: 185
	}
}
