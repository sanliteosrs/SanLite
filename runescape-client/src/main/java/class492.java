import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public class class492 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	public static final class492 field5042;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static final class492 field5039;
	@ObfuscatedName("jh")
	static byte[][] field5041;
	@ObfuscatedName("ag")
	String field5040;

	static {
		field5042 = new class492("application/json"); // L: 4
		field5039 = new class492("text/plain"); // L: 5
	}

	class492(String var1) {
		this.field5040 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "493235791"
	)
	public String method8834() {
		return this.field5040; // L: 13
	}
}
