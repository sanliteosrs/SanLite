import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("IterableNodeHashTableIterator")
public class IterableNodeHashTableIterator implements Iterator {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("hashTable")
	IterableNodeHashTable hashTable;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("head")
	Node head;
	@ObfuscatedName("ar")
	@Export("index")
	int index;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("last")
	Node last;

	@ObfuscatedSignature(
		descriptor = "(Lsa;)V"
	)
	public IterableNodeHashTableIterator(IterableNodeHashTable var1) {
		this.last = null; // L: 10
		this.hashTable = var1; // L: 13
		this.start(); // L: 14
	} // L: 15

	@ObfuscatedName("aw")
	@Export("start")
	void start() {
		this.head = this.hashTable.buckets[0].previous; // L: 18
		this.index = 1; // L: 19
		this.last = null; // L: 20
	} // L: 21

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lsb;"
	)
	public Node method8761() {
		this.start(); // L: 24
		return (Node)this.next(); // L: 25
	}

	public Object next() {
		Node var1;
		if (this.hashTable.buckets[this.index - 1] != this.head) { // L: 30
			var1 = this.head; // L: 31
			this.head = var1.previous; // L: 32
			this.last = var1; // L: 33
			return var1; // L: 34
		} else {
			do {
				if (this.index >= this.hashTable.size) { // L: 36
					return null; // L: 44
				}

				var1 = this.hashTable.buckets[this.index++].previous; // L: 37
			} while(var1 == this.hashTable.buckets[this.index - 1]); // L: 38

			this.head = var1.previous; // L: 39
			this.last = var1; // L: 40
			return var1; // L: 41
		}
	}

	public boolean hasNext() {
		if (this.hashTable.buckets[this.index - 1] != this.head) { // L: 48
			return true;
		} else {
			while (this.index < this.hashTable.size) { // L: 49
				if (this.hashTable.buckets[this.index++].previous != this.hashTable.buckets[this.index - 1]) { // L: 50
					this.head = this.hashTable.buckets[this.index - 1].previous; // L: 51
					return true; // L: 52
				}

				this.head = this.hashTable.buckets[this.index - 1]; // L: 55
			}

			return false; // L: 58
		}
	}

	public void remove() {
		this.last.remove(); // L: 63
		this.last = null; // L: 64
	} // L: 65
}
