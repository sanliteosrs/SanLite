import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class148 extends class147 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1339989631
	)
	int field1697;
	@ObfuscatedName("ad")
	boolean field1698;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class148(class150 var1) {
		this.this$0 = var1;
		this.field1697 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1697 = var1.readUnsignedShort(); // L: 184
		this.field1698 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3348(this.field1697, this.field1698); // L: 189
	} // L: 190

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;III)Lqh;",
		garbageValue = "-445912438"
	)
	public static Font method3275(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!class146.method3260(var0, var2, var3)) { // L: 71
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3); // L: 73
			Font var4;
			if (var5 == null) { // L: 75
				var4 = null; // L: 76
			} else {
				Font var6 = new Font(var5, UserComparator4.SpriteBuffer_xOffsets, class145.SpriteBuffer_yOffsets, class561.SpriteBuffer_spriteWidths, class315.SpriteBuffer_spriteHeights, class561.SpriteBuffer_spritePalette, class561.SpriteBuffer_pixels); // L: 79
				Calendar.method7029(); // L: 80
				var4 = var6; // L: 81
			}

			return var4; // L: 83
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1361501766"
	)
	static final void method3277() {
		AbstractWorldMapIcon.method5076("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 160
	} // L: 161

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1475352185"
	)
	static final void method3278(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12932
		class105.clientPreferences.method2589(var0); // L: 12933
	} // L: 12934
}
