import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class214 {
	@ObfuscatedName("ap")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public UrlRequest field2340;
	@ObfuscatedName("ad")
	public float[] field2338;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	final class224 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lif;)V"
	)
	class214(class224 var1) {
		this.this$0 = var1;
		this.field2338 = new float[4]; // L: 250
	} // L: 252

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "([Lnx;IB)V",
		garbageValue = "-4"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12608
			Widget var3 = var0[var2]; // L: 12609
			if (var3 != null) { // L: 12610
				if (var3.type == 0) { // L: 12611
					if (var3.children != null) { // L: 12612
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12613
					if (var4 != null) { // L: 12614
						BuddyRankComparator.method3037(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 12616
					var5 = new ScriptEvent(); // L: 12617
					var5.widget = var3; // L: 12618
					var5.args = var3.onDialogAbort; // L: 12619
					Projectile.runScriptEvent(var5); // L: 12620
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 12622
					if (var3.childIndex >= 0) { // L: 12623
						Widget var6 = ModeWhere.field4649.method6519(var3.id); // L: 12624
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 12625
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 12629
					var5.widget = var3; // L: 12630
					var5.args = var3.onSubChange; // L: 12631
					Projectile.runScriptEvent(var5); // L: 12632
				}
			}
		}

	} // L: 12635
}
