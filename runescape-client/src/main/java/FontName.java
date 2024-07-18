import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("aj")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[Lty;",
		garbageValue = "93"
	)
	public static FontName[] method9217() {
		return new FontName[]{FontName_bold12, FontName_plain11, FontName_verdana13, FontName_verdana11, FontName_plain12, FontName_verdana15}; // L: 16
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1418695647"
	)
	public static void method9220(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) { // L: 43
			class330.field3587.clear(); // L: 46
			class330.field3581.clear(); // L: 47
			class342 var7;
			if (var5) { // L: 49
				Iterator var12 = class330.field3584.iterator(); // L: 51

				label65:
				while (true) {
					do {
						if (!var12.hasNext()) {
							class330.field3584.clear(); // L: 73
							break label65;
						}

						var7 = (class342)var12.next(); // L: 52
					} while(var7 == null); // L: 54

					var7.field3713.clear(); // L: 57
					var7.field3713.method6190(); // L: 58
					var7.field3713.setPcmStreamVolume(0); // L: 59
					var7.field3713.field3627 = 0; // L: 60
					int var13 = var7.field3716; // L: 61
					int var9 = var7.field3705; // L: 62
					Iterator var10 = class330.field3588.iterator(); // L: 64

					while (var10.hasNext()) {
						class336 var11 = (class336)var10.next(); // L: 65
						var11.vmethod6382(var13, var9); // L: 67
					}
				}
			} else {
				for (int var6 = 0; var6 < class330.field3584.size(); ++var6) { // L: 77
					var7 = (class342)class330.field3584.get(var6); // L: 78
					if (var7 == null) { // L: 79
						class330.field3584.remove(var6); // L: 80
						--var6; // L: 81
					} else if (var7.field3712) { // L: 83
						if (var7.field3713.field3627 > 0) { // L: 84
							--var7.field3713.field3627; // L: 85
						}

						var7.field3713.clear(); // L: 87
						var7.field3713.method6190(); // L: 88
						var7.field3713.setPcmStreamVolume(0); // L: 89
						class330.field3584.remove(var6); // L: 90
						--var6; // L: 91
					} else {
						var7.field3712 = true; // L: 94
					}
				}
			}

			class131.method3071(var0, var5); // L: 99
			if (!class330.field3587.isEmpty()) { // L: 100
				class33.method476(var1, var2, var3, var4); // L: 103
				class330.field3581.add(new class437((class444)null)); // L: 104
				class330.field3581.add(new class446((class444)null, class330.field3583, class330.field3579, class330.field3591)); // L: 105
				ArrayList var15 = new ArrayList(); // L: 106
				var15.add(new class441(new class443((class444)null, 0, true, class330.field3586))); // L: 107
				if (!class330.field3584.isEmpty()) { // L: 108
					ArrayList var14 = new ArrayList(); // L: 109
					var14.add(new class440(new class445((class444)null, var15), class330.field3590)); // L: 110
					ArrayList var8 = LoginScreenAnimation.method2564(); // L: 111
					var14.add(new class440(new class442(new class439((class444)null, var8), 0, false, class330.field3589), class330.field3580)); // L: 112
					class330.field3581.add(new class445((class444)null, var14)); // L: 113
				} else {
					class330.field3581.add(new class440((class444)null, class330.field3590)); // L: 116
					class330.field3581.add(new class445((class444)null, var15)); // L: 117
				}

			}
		}
	} // L: 44 101 119

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1361976443"
	)
	static String method9219(String var0) {
		PlayerType[] var1 = class136.PlayerType_values(); // L: 13505

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 13506
			PlayerType var3 = var1[var2]; // L: 13507
			if (var3.modIcon != -1 && var0.startsWith(class385.method7175(var3.modIcon))) { // L: 13509 13510
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 13511
				break;
			}
		}

		return var0; // L: 13518
	}
}
