import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class330 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field3583;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field3579;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field3591;
	@ObfuscatedName("ak")
	public static ArrayList field3582;
	@ObfuscatedName("ap")
	public static LinkedList field3587;
	@ObfuscatedName("an")
	public static ArrayList field3584;
	@ObfuscatedName("aj")
	public static ArrayList field3585;
	@ObfuscatedName("av")
	public static ArrayList field3581;
	@ObfuscatedName("ab")
	public static final List field3588;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 554380341
	)
	public static int field3580;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 664447525
	)
	public static int field3589;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1265911605
	)
	public static int field3590;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -950072303
	)
	public static int field3586;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -311136091
	)
	@Export("menuWidth")
	static int menuWidth;

	static {
		field3582 = null; // L: 13
		field3587 = new LinkedList(); // L: 14
		field3584 = new ArrayList(3); // L: 15
		field3585 = new ArrayList(3); // L: 16
		field3581 = new ArrayList(); // L: 17
		field3588 = new ArrayList(); // L: 18
		field3580 = 0; // L: 19
		field3589 = 0; // L: 20
		field3590 = 0; // L: 21
		field3586 = 0; // L: 22
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIB)[Lvv;",
		garbageValue = "0"
	)
	public static IndexedSprite[] method6173(AbstractArchive var0, int var1, int var2) {
		if (!class146.method3260(var0, var1, var2)) { // L: 23
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class561.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class561.SpriteBuffer_spriteCount; ++var5) { // L: 27
				IndexedSprite var6 = var4[var5] = new IndexedSprite(); // L: 28
				var6.width = class561.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class561.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = UserComparator4.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = class145.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = class561.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = class315.SpriteBuffer_spriteHeights[var5] * -897865968; // L: 34
				var6.palette = class561.SpriteBuffer_spritePalette; // L: 35
				var6.pixels = class561.SpriteBuffer_pixels[var5]; // L: 36
			}

			Calendar.method7029(); // L: 38
			return var4; // L: 41
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1234876312"
	)
	static final boolean method6183(int var0) {
		if (var0 < 0) { // L: 10015
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 10016
			if (var1 >= 2000) { // L: 10017
				var1 -= 2000;
			}

			return var1 == 1007; // L: 10018
		}
	}
}
