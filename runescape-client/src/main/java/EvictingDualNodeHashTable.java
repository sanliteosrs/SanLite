import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("EvictingDualNodeHashTable")
public final class EvictingDualNodeHashTable {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("dualNode")
	DualNode dualNode;
	@ObfuscatedName("aj")
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ac")
	@Export("remainingCapacity")
	int remainingCapacity;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("deque")
	IterableDualNodeQueue deque;

	public EvictingDualNodeHashTable(int var1) {
		this.dualNode = new DualNode(); // L: 8
		this.deque = new IterableDualNodeQueue(); // L: 12
		this.capacity = var1; // L: 15
		this.remainingCapacity = var1; // L: 16

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) { // L: 17 18
		}

		this.hashTable = new IterableNodeHashTable(var2); // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(J)Lsn;"
	)
	@Export("get")
	public DualNode get(long var1) {
		DualNode var3 = (DualNode)this.hashTable.get(var1); // L: 24
		if (var3 != null) { // L: 25
			this.deque.add(var3); // L: 26
		}

		return var3; // L: 29
	}

	@ObfuscatedName("aj")
	@Export("remove")
	public void remove(long var1) {
		DualNode var3 = (DualNode)this.hashTable.get(var1); // L: 33
		if (var3 != null) { // L: 34
			var3.remove(); // L: 35
			var3.removeDual(); // L: 36
			++this.remainingCapacity; // L: 37
		}

	} // L: 39

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsn;J)V"
	)
	@Export("put")
	public void put(DualNode var1, long var2) {
		if (this.remainingCapacity == 0) { // L: 42
			DualNode var4 = this.deque.removeLast(); // L: 43
			var4.remove(); // L: 44
			var4.removeDual(); // L: 45
			if (var4 == this.dualNode) { // L: 46
				var4 = this.deque.removeLast(); // L: 47
				var4.remove(); // L: 48
				var4.removeDual(); // L: 49
			}
		} else {
			--this.remainingCapacity; // L: 52
		}

		this.hashTable.put(var1, var2); // L: 53
		this.deque.add(var1); // L: 54
	} // L: 55

	@ObfuscatedName("aw")
	@Export("clear")
	public void clear() {
		this.deque.clear(); // L: 58
		this.hashTable.clear(); // L: 59
		this.dualNode = new DualNode(); // L: 60
		this.remainingCapacity = this.capacity; // L: 61
	} // L: 62
}
