import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class538 extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lue;"
	)
	class534[] field5298;
	@ObfuscatedName("ap")
	List field5302;

	@ObfuscatedSignature(
		descriptor = "(Lok;I)V"
	)
	public class538(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method9451(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Lok;II)V"
	)
	public class538(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method9451(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-2115905066"
	)
	void method9451(Buffer var1) {
		int var2 = var1.method9579(); // L: 31
		this.field5298 = new class534[var2]; // L: 32
		this.field5302 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field5298[var3] = (class534)class210.findEnumerated(class534.method9415(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method9579(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field5298[var3].method9409(var1); // L: 39
				int var7 = var1.method9579(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method9579(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field5302.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "-1439202890"
	)
	public List method9452(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field5302.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
