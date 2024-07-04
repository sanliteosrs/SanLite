import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("em")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;I)I",
		garbageValue = "396253425"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Ldz;B)V",
		garbageValue = "57"
	)
	static void method3008(class94 var0) {
		if (Client.field535 != var0) { // L: 2118
			Client.field535 = var0; // L: 2119
		}
	} // L: 2120

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1428864638"
	)
	static void method3002(String var0) {
		class18.field81 = var0; // L: 13389

		try {
			String var1 = class415.client.getParameter(Integer.toString(18)); // L: 13391
			String var2 = class415.client.getParameter(Integer.toString(13)); // L: 13392
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 13393
			if (var0.length() == 0) { // L: 13394
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class152.method3299(WorldMapData_1.method4861() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 13395
			}

			Client var4 = class415.client; // L: 13396
			String var5 = "document.cookie=\"" + var3 + "\""; // L: 13397
			JSObject.getWindow(var4).eval(var5); // L: 13400
		} catch (Throwable var6) { // L: 13403
		}

	} // L: 13404
}
