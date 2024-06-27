import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -104959579
	)
	static int field2915;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 303187343
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 360049709
	)
	@Export("count")
	int count;
	@ObfuscatedName("av")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ab")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	class279 field2914;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2914 = new class279(var3, var4); // L: 32
			}
		}

	} // L: 35

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	public int method5406() {
		return this.count; // L: 38
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lkj;",
		garbageValue = "1927354495"
	)
	public class279 method5407() {
		return this.field2914; // L: 42
	}
}
