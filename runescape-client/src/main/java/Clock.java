import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1222008534"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1655799397"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lgj;",
		garbageValue = "-451490097"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqq;",
		garbageValue = "-25"
	)
	static class457 method3395(int var0) {
		class457 var1 = (class457)Client.Widget_cachedFonts.get((long)var0); // L: 12831
		if (var1 == null) { // L: 12832
			var1 = new class457(class250.field2930, var0); // L: 12833
		}

		return var1; // L: 12835
	}
}
