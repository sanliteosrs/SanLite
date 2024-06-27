import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class343 extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -650466251
	)
	int field3719;
	@ObfuscatedName("ad")
	BitSet field3721;

	class343(int var1) {
		this.field3719 = var1; // L: 11
		this.field3721 = new BitSet(128); // L: 12
	} // L: 13

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILsq;Loz;S)V",
		garbageValue = "-26919"
	)
	static void method6442(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null; // L: 44
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 45
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 46
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) { // L: 47
					var3 = var5.data; // L: 48
					break; // L: 49
				}
			}
		}

		if (var3 != null) { // L: 53
			var2.load(var1, var0, var3, true); // L: 54
		} else {
			byte[] var4 = var1.read(var0); // L: 57
			var2.load(var1, var0, var4, true); // L: 58
		}
	} // L: 55 59
}
