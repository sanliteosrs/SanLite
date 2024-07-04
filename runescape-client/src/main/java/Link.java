import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
@Implements("Link")
public class Link {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("aq")
	@Export("remove")
	public void remove() {
		if (this.next != null) { // L: 8
			this.next.previous = this.previous; // L: 9
			this.previous.next = this.next; // L: 10
			this.previous = null; // L: 11
			this.next = null; // L: 12
		}
	} // L: 13
}
