import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
class class458 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	final class457 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lrw;)V"
	)
	class458(class457 var1) {
		this.this$0 = var1; // L: 84
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "81"
	)
	int method8403(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 86
	}

	public int compare(Object var1, Object var2) {
		return this.method8403((Entry)var1, (Entry)var2); // L: 90
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 94
	}
}
