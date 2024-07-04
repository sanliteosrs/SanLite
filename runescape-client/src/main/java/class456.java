import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public class class456 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	static final class456 field4889;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	static final class456 field4886;
	@ObfuscatedName("ag")
	final String field4888;

	static {
		field4889 = new class456("Basic"); // L: 4
		field4886 = new class456("Bearer"); // L: 5
	}

	class456(String var1) {
		this.field4888 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "193474009"
	)
	String method8360() {
		return this.field4888; // L: 13
	}
}
