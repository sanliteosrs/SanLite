import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class135 {
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("aq")
	boolean field1575;
	@ObfuscatedName("ad")
	boolean field1576;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class133 field1580;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class133 field1583;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lff;"
	)
	class130[] field1579;
	@ObfuscatedName("an")
	boolean field1594;
	@ObfuscatedName("aj")
	float field1592;
	@ObfuscatedName("av")
	float field1591;
	@ObfuscatedName("ab")
	float field1581;
	@ObfuscatedName("ai")
	float field1590;
	@ObfuscatedName("ae")
	float field1585;
	@ObfuscatedName("au")
	float field1586;
	@ObfuscatedName("ah")
	float field1587;
	@ObfuscatedName("az")
	float field1588;
	@ObfuscatedName("ax")
	float field1589;
	@ObfuscatedName("ac")
	float field1582;
	@ObfuscatedName("al")
	boolean field1578;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1309993249
	)
	int field1577;
	@ObfuscatedName("ao")
	float[] field1593;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1857339093
	)
	int field1584;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -988948789
	)
	int field1595;
	@ObfuscatedName("aw")
	float field1596;
	@ObfuscatedName("at")
	float field1597;

	class135() {
		this.field1578 = true; // L: 24
		this.field1577 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)I",
		garbageValue = "1218892832"
	)
	int method3135(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		class172.method3537(var1.readUnsignedByte()); // L: 36
		this.field1580 = SoundCache.method887(var1.readUnsignedByte()); // L: 37
		this.field1583 = SoundCache.method887(var1.readUnsignedByte()); // L: 38
		this.field1575 = var1.readUnsignedByte() != 0; // L: 39
		this.field1579 = new class130[var3]; // L: 40
		class130 var4 = null; // L: 41

		for (int var5 = 0; var5 < var3; ++var5) { // L: 42
			class130 var6 = new class130(); // L: 43
			var6.method3052(var1, var2); // L: 44
			this.field1579[var5] = var6; // L: 45
			if (var4 != null) { // L: 46
				var4.field1532 = var6; // L: 47
			}

			var4 = var6; // L: 49
		}

		return var3; // L: 51
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2096276357"
	)
	void method3139() {
		this.field1584 = this.field1579[0].field1526; // L: 55
		this.field1595 = this.field1579[this.method3150() - 1].field1526; // L: 56
		this.field1593 = new float[this.method3153() + 1]; // L: 58

		for (int var1 = this.method3138(); var1 <= this.method3134(); ++var1) { // L: 59
			this.field1593[var1 - this.method3138()] = class128.method3050(this, (float)var1); // L: 60
		}

		this.field1579 = null; // L: 62
		this.field1596 = class128.method3050(this, (float)(this.method3138() - 1)); // L: 64
		this.field1597 = class128.method3050(this, (float)(this.method3134() + 1)); // L: 65
	} // L: 66

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "239145230"
	)
	public float method3137(int var1) {
		if (var1 < this.method3138()) { // L: 70
			return this.field1596; // L: 71
		} else {
			return var1 > this.method3134() ? this.field1597 : this.field1593[var1 - this.method3138()]; // L: 73 74 76
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-587543936"
	)
	int method3138() {
		return this.field1584; // L: 81
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "960225045"
	)
	int method3134() {
		return this.field1595; // L: 85
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	int method3153() {
		return this.method3134() - this.method3138(); // L: 89
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1777719385"
	)
	int method3140(float var1) {
		if (this.field1577 < 0 || (float)this.field1579[this.field1577].field1526 > var1 || this.field1579[this.field1577].field1532 != null && (float)this.field1579[this.field1577].field1532.field1526 <= var1) { // L: 93
			if (var1 >= (float)this.method3138() && var1 <= (float)this.method3134()) { // L: 96
				int var2 = this.method3150(); // L: 99
				int var3 = this.field1577; // L: 100
				if (var2 > 0) { // L: 101
					int var4 = 0; // L: 102
					int var5 = var2 - 1; // L: 103

					do {
						int var6 = var5 + var4 >> 1; // L: 105
						if (var1 < (float)this.field1579[var6].field1526) { // L: 106
							if (var1 > (float)this.field1579[var6 - 1].field1526) { // L: 107
								var3 = var6 - 1; // L: 108
								break;
							}

							var5 = var6 - 1; // L: 112
						} else {
							if (var1 <= (float)this.field1579[var6].field1526) { // L: 115
								var3 = var6; // L: 125
								break; // L: 126
							}

							if (var1 < (float)this.field1579[var6 + 1].field1526) { // L: 116
								var3 = var6; // L: 117
								break; // L: 118
							}

							var4 = var6 + 1; // L: 121
						}
					} while(var4 <= var5); // L: 128
				}

				if (var3 != this.field1577) { // L: 130
					this.field1577 = var3; // L: 131
					this.field1578 = true; // L: 132
				}

				return this.field1577; // L: 134
			} else {
				return -1; // L: 97
			}
		} else {
			return this.field1577; // L: 94
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)Lff;",
		garbageValue = "-721484232"
	)
	class130 method3159(float var1) {
		int var2 = this.method3140(var1); // L: 138
		return var2 >= 0 && var2 < this.field1579.length ? this.field1579[var2] : null; // L: 139 140 143
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	int method3150() {
		return this.field1579 == null ? 0 : this.field1579.length; // L: 148 149
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	static final void method3167() {
		Client.packetWriter.close(); // L: 3089
		class96.method2471(); // L: 3090
		class511.field5137.method2677(); // L: 3091
		Client.field740.method4349(); // L: 3092
		System.gc(); // L: 3093
		class137.method3187(0, 0); // L: 3094
		WorldMapIcon_1.method4578(); // L: 3095
		Client.playingJingle = false; // L: 3096
		class60.method1172(); // L: 3097
		ClanChannelMember.method3282(10); // L: 3098
		Client.field516 = 0; // L: 3099
		class433.method8077().method4247(); // L: 3100
		class433.method8077().method4248(); // L: 3101
	} // L: 3102
}
