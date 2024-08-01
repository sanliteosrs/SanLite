import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class131 {
	@ObfuscatedName("ak")
	public static final float field1544;
	@ObfuscatedName("ap")
	public static final float field1539;
	@ObfuscatedName("an")
	static float[] field1540;
	@ObfuscatedName("aj")
	static float[] field1542;
	@ObfuscatedName("jf")
	static int[] field1538;

	static {
		field1544 = Math.ulp(1.0F); // L: 10
		field1539 = 2.0F * field1544; // L: 11
		field1540 = new float[4]; // L: 12
		field1542 = new float[5]; // L: 13
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-1728915559"
	)
	static void method3071(ArrayList var0, boolean var1) {
		if (!var1) { // L: 233
			class330.field3585.clear(); // L: 234
		}

		Iterator var2 = var0.iterator(); // L: 236

		while (var2.hasNext()) { // L: 247
			class342 var3 = (class342)var2.next(); // L: 237
			if (var3.field3716 != -1 && var3.field3705 != -1) { // L: 239
				if (!var1) { // L: 242
					class330.field3585.add(var3); // L: 243
				}

				class330.field3587.add(var3); // L: 245
			}
		}

	} // L: 248

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1947023152"
	)
	static final void method3068() {
		if (Client.logoutTimer > 0) { // L: 3256
			class135.method3167(); // L: 3257
		} else {
			Client.timer.method8338(); // L: 3260
			ClanChannelMember.method3282(40); // L: 3261
			class386.field4521 = Client.packetWriter.getSocket(); // L: 3262
			Client.packetWriter.removeSocket(); // L: 3263
		}
	} // L: 3258 3264
}
