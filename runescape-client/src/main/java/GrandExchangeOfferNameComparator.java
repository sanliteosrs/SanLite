import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;I)I",
		garbageValue = "-1760951308"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1502544286"
	)
	public static String method7325(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length()); // L: 172
		int var2 = 0; // L: 173
		int var3 = -1; // L: 174

		for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 175
			char var5 = var0.charAt(var4); // L: 176
			if (var5 == '<') { // L: 177
				var1.append(var0.substring(var2, var4)); // L: 178
				var3 = var4; // L: 179
			} else if (var5 == '>' && var3 != -1) { // L: 182
				String var6 = var0.substring(var3 + 1, var4); // L: 183
				var3 = -1; // L: 184
				if (var6.equals("lt")) { // L: 185
					var1.append("<"); // L: 186
				} else if (var6.equals("gt")) { // L: 188
					var1.append(">"); // L: 189
				} else if (var6.equals("br")) { // L: 191
					var1.append("\n"); // L: 192
				}

				var2 = var4 + 1; // L: 194
			}
		}

		if (var2 < var0.length()) { // L: 197
			var1.append(var0.substring(var2, var0.length())); // L: 198
		}

		return var1.toString(); // L: 200
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldw;IB)V",
		garbageValue = "98"
	)
	static void method7320(class101 var0, Actor var1, int var2) {
		Coord var3 = var1.method2488(var0); // L: 6025
		class426.drawActor2d(var0, var3.x, var3.y, var1.x, var1.field1191, var2); // L: 6026
	} // L: 6027
}
