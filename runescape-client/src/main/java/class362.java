import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public class class362 implements class361 {
	@ObfuscatedName("k")
	static byte[][][] field4079;
	@ObfuscatedName("f")
	Map field4080;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lnz;"
	)
	final class388 field4082;

	@ObfuscatedSignature(
		signature = "(Lnz;)V"
	)
	public class362(class388 var1) {
		this.field4082 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "768076376"
	)
	public int vmethod6335(int var1) {
		if (this.field4080 != null) {
			class389 var2 = (class389)this.field4080.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4216;
			}
		}

		return (Integer)this.field4082.vmethod6841(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/Object;B)V",
		garbageValue = "-65"
	)
	public void vmethod6336(int var1, Object var2) {
		if (this.field4080 == null) {
			this.field4080 = new HashMap();
			this.field4080.put(var1, new class389(var1, var2));
		} else {
			class389 var3 = (class389)this.field4080.get(var1);
			if (var3 == null) {
				this.field4080.put(var1, new class389(var1, var2));
			} else {
				var3.field4216 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4080 == null ? Collections.emptyList().iterator() : this.field4080.values().iterator();
	}
}
