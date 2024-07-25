import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhy;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-91"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) { // L: 27
				var5 = var7;
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Ldh;",
		garbageValue = "-1106798823"
	)
	@Export("getInventorySprite")
	HealthBarUpdate getInventorySprite(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "97"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7494(); // L: 55
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1657967277"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 64
		int[] var3 = new int[4]; // L: 65
		var2[0] = var0; // L: 66
		var3[0] = var1; // L: 67
		int var4 = 1; // L: 68

		for (int var5 = 0; var5 < 4; ++var5) { // L: 69
			if (World.World_sortOption1[var5] != var0) { // L: 70
				var2[var4] = World.World_sortOption1[var5]; // L: 71
				var3[var4] = World.World_sortOption2[var5]; // L: 72
				++var4; // L: 73
			}
		}

		World.World_sortOption1 = var2; // L: 76
		World.World_sortOption2 = var3; // L: 77
		AbstractWorldMapData.sortWorlds(class357.World_worlds, 0, class357.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 78
	} // L: 79
}
