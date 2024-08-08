import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class class9 implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	public static final class9 field41;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	public static final class9 field49;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	static final class9 field35;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	static final class9 field36;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	static final class9 field37;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1613497083
	)
	int field33;
	@ObfuscatedName("aj")
	String field39;
	@ObfuscatedName("av")
	boolean field34;
	@ObfuscatedName("ab")
	boolean field42;

	static {
		field41 = new class9(0, "POST", true, true); // L: 6
		field49 = new class9(1, "GET", true, false); // L: 7
		field35 = new class9(2, "PUT", false, true); // L: 8
		field36 = new class9(3, "PATCH", false, true); // L: 9
		field37 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field33 = var1; // L: 17
		this.field39 = var2; // L: 18
		this.field34 = var3; // L: 19
		this.field42 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field33; // L: 37
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1679958433"
	)
	boolean method66() {
		return this.field34; // L: 24
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "22"
	)
	public String method70() {
		return this.field39; // L: 28
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1923575133"
	)
	boolean method68() {
		return this.field42; // L: 32
	}
}
