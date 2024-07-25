import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public abstract class class487 extends class306 implements class554 {
	@ObfuscatedSignature(
		descriptor = "(Lof;Lpe;I)V"
	)
	protected class487(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lsm;",
		garbageValue = "-114111951"
	)
	protected abstract class489 vmethod9367(int var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1524861563"
	)
	public int method8799() {
		return super.field3247; // L: 19
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-2090068814"
	)
	public Object vmethod9874(int var1) {
		class489 var2 = this.vmethod9367(var1); // L: 24
		return var2 != null && var2.method8820() ? var2.method8821() : null; // L: 25 26
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)Lvt;",
		garbageValue = "-683314488"
	)
	public class555 method8802(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class489 var3 = this.vmethod9367(var2); // L: 31
		class555 var4 = new class555(var2); // L: 32
		Class var5 = var3.field5037.field5291; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5429 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5429 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5429 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class550.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class550 var6 = (class550)var5.newInstance(); // L: 39
				var6.method9850(var1); // L: 40
				var4.field5429 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-22"
	)
	static int method8812() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1565
			int var0 = 0; // L: 1566

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1567
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1568
			}

			return var0 * 10000 / Client.field574; // L: 1570
		} else {
			return 10000;
		}
	}
}
