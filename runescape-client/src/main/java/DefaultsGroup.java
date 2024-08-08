import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final DefaultsGroup field5010;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final DefaultsGroup field5011;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1592901653
	)
	@Export("group")
	final int group;

	static {
		field5010 = new DefaultsGroup(1); // L: 4
		field5011 = new DefaultsGroup(3); // L: 5
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 9
	} // L: 10

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1696739276"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 215
		var1.offset = var0.length - 2; // L: 216
		class561.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 217
		UserComparator4.SpriteBuffer_xOffsets = new int[class561.SpriteBuffer_spriteCount]; // L: 218
		class145.SpriteBuffer_yOffsets = new int[class561.SpriteBuffer_spriteCount]; // L: 219
		class561.SpriteBuffer_spriteWidths = new int[class561.SpriteBuffer_spriteCount]; // L: 220
		class315.SpriteBuffer_spriteHeights = new int[class561.SpriteBuffer_spriteCount]; // L: 221
		class561.SpriteBuffer_pixels = new byte[class561.SpriteBuffer_spriteCount][]; // L: 222
		var1.offset = var0.length - 7 - class561.SpriteBuffer_spriteCount * 8; // L: 223
		class561.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 224
		class561.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 225
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 226

		int var3;
		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) { // L: 227
			UserComparator4.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) { // L: 228
			class145.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) { // L: 229
			class561.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) { // L: 230
			class315.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class561.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 231
		class561.SpriteBuffer_spritePalette = new int[var2]; // L: 232

		for (var3 = 1; var3 < var2; ++var3) { // L: 233
			class561.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 234
			if (class561.SpriteBuffer_spritePalette[var3] == 0) { // L: 235
				class561.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 237

		for (var3 = 0; var3 < class561.SpriteBuffer_spriteCount; ++var3) { // L: 238
			int var4 = class561.SpriteBuffer_spriteWidths[var3]; // L: 239
			int var5 = class315.SpriteBuffer_spriteHeights[var3]; // L: 240
			int var6 = var4 * var5; // L: 241
			byte[] var7 = new byte[var6]; // L: 242
			class561.SpriteBuffer_pixels[var3] = var7; // L: 243
			int var8 = var1.readUnsignedByte(); // L: 244
			int var9;
			if (var8 == 0) { // L: 245
				for (var9 = 0; var9 < var6; ++var9) { // L: 246
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 248
				for (var9 = 0; var9 < var4; ++var9) { // L: 249
					for (int var10 = 0; var10 < var5; ++var10) { // L: 250
						var7[var9 + var10 * var4] = var1.readByte(); // L: 251
					}
				}
			}
		}

	} // L: 256
}
