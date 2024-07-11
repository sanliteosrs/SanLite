import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("ModeWhere")
public enum ModeWhere implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4633("", 0, new class399[]{class399.field4614, class399.field4616}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4636("", 1, new class399[]{class399.field4615, class399.field4614, class399.field4616}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4634("", 2, new class399[]{class399.field4615, class399.field4613, class399.field4614}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4635("", 3, new class399[]{class399.field4615}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4632("", 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4637("", 5, new class399[]{class399.field4615, class399.field4614}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4648("", 6, new class399[]{class399.field4614}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4647("", 8, new class399[]{class399.field4615, class399.field4614}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4639("", 9, new class399[]{class399.field4615, class399.field4613}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4641("", 10, new class399[]{class399.field4615}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4642("", 11, new class399[]{class399.field4615}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4643("", 12, new class399[]{class399.field4615, class399.field4614}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	field4644("", 13, new class399[]{class399.field4615});

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static class349 field4649;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 1699003429
	)
	static int field4640;
	@ObfuscatedName("jz")
	static byte[][] field4638;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -855908523
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ax")
	final Set field4646;

	static {
		method7427(); // L: 26
	} // L: 27

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lph;)V"
	)
	ModeWhere(String var3, int var4, class399[] var5) {
		this.field4646 = new HashSet();
		this.id = var4; // L: 41
		class399[] var6 = var5; // L: 43

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 44
			class399 var8 = var6[var7]; // L: 45
			this.field4646.add(var8); // L: 46
		}

	} // L: 49

	ModeWhere(String var3, int var4) {
		this.field4646 = new HashSet(); // L: 30
		this.id = var4; // L: 37
	} // L: 38

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpl;",
		garbageValue = "92"
	)
	static ModeWhere[] method7427() {
		return new ModeWhere[]{field4641, field4648, field4639, field4647, field4642, field4633, field4636, field4635, field4637, field4634, field4644, field4632, field4643}; // L: 33
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1073372179"
	)
	public static int method7432(int var0) {
		--var0; // L: 52
		var0 |= var0 >>> 1; // L: 53
		var0 |= var0 >>> 2; // L: 54
		var0 |= var0 >>> 4; // L: 55
		var0 |= var0 >>> 8; // L: 56
		var0 |= var0 >>> 16; // L: 57
		return var0 + 1; // L: 58
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;Ljava/lang/String;I)Lvv;",
		garbageValue = "1042951824"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 119
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 120
			int var4 = var0.getFileId(var3, var2); // L: 121
			IndexedSprite var5;
			if (!class146.method3260(var0, var3, var4)) { // L: 124
				var5 = null; // L: 125
			} else {
				var5 = class159.method3419(); // L: 128
			}

			return var5; // L: 130
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIIIIIB)V",
		garbageValue = "-16"
	)
	static final void method7428(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field586) { // L: 11825
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 11826
		}

		Client.field586 = false; // L: 11827
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 11828
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 11829
				var0.scrollY -= 4; // L: 11830
				TriBool.invalidateWidget(var0); // L: 11831
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 11833
				var0.scrollY += 4; // L: 11834
				TriBool.invalidateWidget(var0); // L: 11835
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11837
				var7 = var3 * (var3 - 32) / var4; // L: 11838
				if (var7 < 8) { // L: 11839
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11840
				int var9 = var3 - 32 - var7; // L: 11841
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11842
				TriBool.invalidateWidget(var0); // L: 11843
				Client.field586 = true; // L: 11844
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11847
			var7 = var0.width; // L: 11848
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11849
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11850
				TriBool.invalidateWidget(var0); // L: 11851
			}
		}

	} // L: 11854

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1288888161"
	)
	static final void method7431() {
		Client.field707 = Client.cycleCntr; // L: 13266
		GrandExchangeEvents.field4576 = true; // L: 13267
	} // L: 13268
}
