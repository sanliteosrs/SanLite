import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ur")
public class class529 extends class487 implements class308 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	final AbstractArchive field5279;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	final DemotingHashTable field5278;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -575168409
	)
	final int field5280;

	@ObfuscatedSignature(
		descriptor = "(Lof;ILpe;Lok;)V"
	)
	public class529(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field5278 = new DemotingHashTable(64); // L: 15
		this.field5279 = var4; // L: 20
		this.field5280 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lsm;",
		garbageValue = "-114111951"
	)
	protected class489 vmethod9367(int var1) {
		synchronized(this.field5278) { // L: 26
			class488 var2 = (class488)this.field5278.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method9368(var1); // L: 29
				this.field5278.method6040(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsi;",
		garbageValue = "0"
	)
	class488 method9368(int var1) {
		byte[] var2 = this.field5279.takeFile(this.field5280, var1); // L: 37
		class488 var3 = new class488(var1); // L: 38
		if (var2 != null) {
			var3.method8818(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "156"
	)
	public void method9369() {
		synchronized(this.field5278) { // L: 44
			this.field5278.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class528(this); // L: 51
	}
}
