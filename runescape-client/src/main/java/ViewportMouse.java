import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("aq")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1815334145
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1893450617
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("ak")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1299904891
	)
	static int field3161;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 427658537
	)
	static int field3163;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -82596875
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ax")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1543076569"
	)
	public static int method5905(CharSequence var0) {
		int var1 = var0.length(); // L: 153
		int var2 = 0; // L: 154

		for (int var3 = 0; var3 < var1; ++var3) { // L: 155
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 156
	}
}
