import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator implements Iterator {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("deque")
	IterableNodeDeque deque;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Node field4657;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	Node field4655;

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	IterableNodeDequeDescendingIterator(IterableNodeDeque var1) {
		this.field4655 = null; // L: 9
		this.setDeque(var1); // L: 12
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	@Export("setDeque")
	void setDeque(IterableNodeDeque var1) {
		this.deque = var1; // L: 16
		this.start(); // L: 17
	} // L: 18

	@ObfuscatedName("ad")
	@Export("start")
	void start() {
		this.field4657 = this.deque != null ? this.deque.sentinel.previous : null; // L: 21
		this.field4655 = null; // L: 22
	} // L: 23

	public void remove() {
		this.field4655.remove(); // L: 43
		this.field4655 = null; // L: 44
	} // L: 45

	public boolean hasNext() {
		return this.deque.sentinel != this.field4657 && this.field4657 != null; // L: 38
	}

	public Object next() {
		Node var1 = this.field4657; // L: 27
		if (var1 == this.deque.sentinel) { // L: 28
			var1 = null; // L: 29
			this.field4657 = null; // L: 30
		} else {
			this.field4657 = var1.previous; // L: 32
		}

		this.field4655 = var1; // L: 33
		return var1; // L: 34
	}
}
