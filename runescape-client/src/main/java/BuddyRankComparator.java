import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;I)I",
		garbageValue = "2133335692"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;ZLqh;I)V",
		garbageValue = "-1850652416"
	)
	public static void method3031(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemComposition_archive = var0; // L: 91
		SecureRandomFuture.ItemComposition_modelArchive = var1; // L: 92
		ItemComposition.ItemComposition_inMembersWorld = var2; // L: 93
		class76.ItemComposition_fileCount = ItemComposition.ItemComposition_archive.getGroupFileCount(10); // L: 94
		class136.ItemComposition_fontPlain11 = var3; // L: 95
	} // L: 96

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-443491666"
	)
	static void method3029(float[] var0) {
		if (class131.field1544 + var0[0] < 1.3333334F) { // L: 318
			float var1 = var0[0] - 2.0F; // L: 319
			float var2 = var0[0] - 1.0F; // L: 320
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * var2 * 4.0F)); // L: 321
			float var4 = 0.5F * (var3 + -var1); // L: 322
			if (var0[1] + class131.field1544 > var4) { // L: 323
				var0[1] = var4 - class131.field1544; // L: 324
			} else {
				var4 = (-var1 - var3) * 0.5F; // L: 327
				if (var0[1] < class131.field1544 + var4) { // L: 328
					var0[1] = class131.field1544 + var4; // L: 329
				}
			}
		} else {
			var0[0] = 1.3333334F - class131.field1544; // L: 334
			var0[1] = 0.33333334F - class131.field1544; // L: 335
		}

	} // L: 337

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-88833176"
	)
	static final void method3037(int var0, int var1) {
		if (ModeWhere.field4649.method6514(var0)) { // L: 12603
			class214.runComponentCloseListeners(ModeWhere.field4649.field3740[var0], var1); // L: 12604
		}
	} // L: 12605

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1078593888"
	)
	public static boolean method3038() {
		return Client.staffModLevel >= 2; // L: 13485
	}
}
