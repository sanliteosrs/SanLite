import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "[Liv;"
	)
	static Widget[] field3859;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -121727977
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llo;I)I",
		garbageValue = "-2048641211"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llm;B)I",
		garbageValue = "88"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
