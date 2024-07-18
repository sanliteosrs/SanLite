import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("az")
	public static short[][] field1098;
	@ObfuscatedName("aq")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ad")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1670544525
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ap")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("an")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; class188.method3688(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1733985196"
	)
	public static void method2386() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 294

			for (int var0 = 0; var0 < class16.idxCount; ++var0) { // L: 295
				class163.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 296
			JagexCache.JagexCache_randomDat.close(); // L: 297
		} catch (Exception var2) { // L: 299
		}

	} // L: 300
}
