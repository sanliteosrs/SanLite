import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("IterableDualNodeQueueIterator")
public class IterableDualNodeQueueIterator implements Iterator {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("queue")
	IterableDualNodeQueue queue;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("head")
	DualNode head;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("last")
	DualNode last;

	@ObfuscatedSignature(
		descriptor = "(Lov;)V"
	)
	IterableDualNodeQueueIterator(IterableDualNodeQueue var1) {
		this.last = null; // L: 9
		this.queue = var1; // L: 12
		this.head = this.queue.sentinel.previousDual; // L: 13
		this.last = null; // L: 14
	} // L: 15

	public Object next() {
		DualNode var1 = this.head; // L: 19
		if (var1 == this.queue.sentinel) { // L: 20
			var1 = null; // L: 21
			this.head = null; // L: 22
		} else {
			this.head = var1.previousDual; // L: 24
		}

		this.last = var1; // L: 25
		return var1; // L: 26
	}

	public boolean hasNext() {
		return this.queue.sentinel != this.head; // L: 30
	}

	public void remove() {
		if (this.last == null) { // L: 34
			throw new IllegalStateException();
		} else {
			this.last.removeDual(); // L: 35
			this.last = null; // L: 36
		}
	} // L: 37
}
