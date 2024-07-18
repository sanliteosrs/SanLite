import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class16 implements ThreadFactory {
	@ObfuscatedName("ap")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 37968869
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("aq")
	final ThreadGroup field75;
	@ObfuscatedName("ad")
	final AtomicInteger field72;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field72 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field75 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field75, var1, this.this$0.field64 + "-rest-request-" + this.field72.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "1588228445"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return VertexNormal.worldMap; // L: 785
	}
}
