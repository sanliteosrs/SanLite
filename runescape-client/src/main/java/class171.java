import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class171 extends class147 {
	@ObfuscatedName("su")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1118752625
	)
	int field1840;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 2806569176464727727L
	)
	long field1841;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class171(class150 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1840 = var1.readInt(); // L: 310
		this.field1841 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3366(this.field1840, this.field1841); // L: 315
	} // L: 316

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "181214809"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class357.World_worlds != null) { // L: 172
			class506.doWorldSorting(0, class357.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([I[IIIB)V",
		garbageValue = "0"
	)
	public static void method3529(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 77
			int var4 = (var3 + var2) / 2; // L: 78
			int var5 = var2; // L: 79
			int var6 = var0[var4]; // L: 80
			var0[var4] = var0[var3]; // L: 81
			var0[var3] = var6; // L: 82
			int var7 = var1[var4]; // L: 83
			var1[var4] = var1[var3]; // L: 84
			var1[var3] = var7; // L: 85
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1; // L: 86

			for (int var9 = var2; var9 < var3; ++var9) { // L: 87
				if (var0[var9] < (var9 & var8) + var6) { // L: 88
					int var10 = var0[var9]; // L: 89
					var0[var9] = var0[var5]; // L: 90
					var0[var5] = var10; // L: 91
					int var11 = var1[var9]; // L: 92
					var1[var9] = var1[var5]; // L: 93
					var1[var5++] = var11; // L: 94
				}
			}

			var0[var3] = var0[var5]; // L: 98
			var0[var5] = var6; // L: 99
			var1[var3] = var1[var5]; // L: 100
			var1[var5] = var7; // L: 101
			method3529(var0, var1, var2, var5 - 1); // L: 102
			method3529(var0, var1, var5 + 1, var3); // L: 103
		}

	} // L: 105
}
