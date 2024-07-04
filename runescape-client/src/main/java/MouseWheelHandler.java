import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class218, MouseWheelListener {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 747311249
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0; // L: 8
	} // L: 10

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "54"
	)
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this); // L: 13
	} // L: 14

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1680970630"
	)
	void method303(Component var1) {
		var1.removeMouseWheelListener(this); // L: 17
	} // L: 18

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1808881319"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation; // L: 26
		this.rotation = 0; // L: 27
		return var1; // L: 28
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation(); // L: 22
	} // L: 23
}
