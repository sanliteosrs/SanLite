import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
class class383 implements Comparator {
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -457974623
	)
	@Export("Client_plane")
	static int Client_plane;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	final class384 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	class383(class384 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnz;Lnz;B)I",
		garbageValue = "0"
	)
	int method7362(class385 var1, class385 var2) {
		if (var1.field4496 > var2.field4496) {
			return 1; // L: 9
		} else {
			return var1.field4496 < var2.field4496 ? -1 : 0; // L: 10 11
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	public int compare(Object var1, Object var2) {
		return this.method7362((class385)var1, (class385)var2); // L: 15
	}
}
