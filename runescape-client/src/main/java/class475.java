import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public abstract class class475 extends class297 implements class542 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	@ObfuscatedSignature(
		descriptor = "(Lon;Lpv;I)V"
	)
	protected class475(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsm;",
		garbageValue = "0"
	)
	protected abstract class477 vmethod9068(int var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-878802408"
	)
	public int method8504() {
		return super.field3177; // L: 19
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "16"
	)
	public Object vmethod9575(int var1) {
		class477 var2 = this.vmethod9068(var1); // L: 24
		return var2 != null && var2.method8525() ? var2.method8517() : null; // L: 25 26
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;S)Luz;",
		garbageValue = "28502"
	)
	public class543 method8501(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class477 var3 = this.vmethod9068(var2); // L: 31
		class543 var4 = new class543(var2); // L: 32
		Class var5 = var3.field4903.field5153; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field5300 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5300 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field5300 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class538.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class538 var6 = (class538)var5.newInstance(); // L: 39
				var6.method9553(var1); // L: 40
				var4.field5300 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
