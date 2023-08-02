import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("ha")
	static String field1477;
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)I",
		garbageValue = "1135205552"
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

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1016972354"
	)
	static void method2912(int var0) {
		if (var0 != Client.loginState) { // L: 12899
			Client.loginState = var0; // L: 12900
		}
	} // L: 12901
}
