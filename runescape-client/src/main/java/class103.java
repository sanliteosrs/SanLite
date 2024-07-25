import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public final class class103 extends Actor {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1582882849
	)
	static int field1349;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2050335803
	)
	static int field1351;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -982531667
	)
	static int field1350;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	NPCComposition field1347;
	@ObfuscatedName("ad")
	String field1344;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -782127427
	)
	int field1345;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	class547 field1352;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	class191 field1348;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	class191 field1343;

	static {
		field1349 = 1; // L: 17
		field1351 = 1; // L: 19
	}

	class103() {
		this.field1344 = ""; // L: 12
		this.field1345 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.field1347 == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.field1235 != -1 && super.field1238 == 0 ? class353.SequenceDefinition_get(super.field1235) : null; // L: 116
			SequenceDefinition var2 = super.field1198 != -1 && (super.field1196 != super.field1198 || var1 == null) ? class353.SequenceDefinition_get(super.field1198) : null; // L: 117
			Model var3 = null; // L: 118
			if (this.field1348 != null && this.field1348.field1980) { // L: 119
				var3 = SoundCache.localPlayer.appearance.getModel(var1, super.field1236, var2, super.field1232); // L: 120
			} else {
				var3 = this.field1347.method3750(var1, super.field1236, var2, super.field1232, this.field1348); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.field1250 = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2476(var3); // L: 129
				if (this.field1347.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1239 != 0 && Client.cycle >= super.field1251 && Client.cycle < super.field1215) { // L: 131
					var3.field3152 = super.field1223; // L: 132
					var3.field3106 = super.field1254; // L: 133
					var3.field3154 = super.field1255; // L: 134
					var3.overrideAmount = super.field1239; // L: 135
					var3.field3156 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "382991979"
	)
	void method2698(String var1) {
		this.field1344 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-13"
	)
	void method2700(int var1) {
		this.field1345 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "4"
	)
	boolean method2752(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1345 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1556267325"
	)
	final String method2702() {
		if (!this.field1344.isEmpty()) { // L: 39
			return this.field1344; // L: 40
		} else {
			NPCComposition var1 = this.field1347; // L: 42
			if (var1.transforms != null) { // L: 43
				var1 = var1.transform(); // L: 44
				if (var1 == null) { // L: 45
					var1 = this.field1347; // L: 46
				}
			}

			return var1.name; // L: 49
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjb;B)V",
		garbageValue = "31"
	)
	final void method2703(int var1, class238 var2) {
		int var3 = super.field1204[0]; // L: 53
		int var4 = super.field1246[0]; // L: 54
		if (var1 == 0) { // L: 55
			--var3; // L: 56
			++var4; // L: 57
		}

		if (var1 == 1) { // L: 59
			++var4;
		}

		if (var1 == 2) { // L: 60
			++var3; // L: 61
			++var4; // L: 62
		}

		if (var1 == 3) { // L: 64
			--var3;
		}

		if (var1 == 4) { // L: 65
			++var3;
		}

		if (var1 == 5) { // L: 66
			--var3; // L: 67
			--var4; // L: 68
		}

		if (var1 == 6) { // L: 70
			--var4;
		}

		if (var1 == 7) { // L: 71
			++var3; // L: 72
			--var4; // L: 73
		}

		if (super.field1235 != -1 && class353.SequenceDefinition_get(super.field1235).field2283 == 1) { // L: 75
			super.field1235 = -1;
		}

		if (super.field1229 < 9) { // L: 76
			++super.field1229;
		}

		for (int var5 = super.field1229; var5 > 0; --var5) { // L: 77
			super.field1204[var5] = super.field1204[var5 - 1]; // L: 78
			super.field1246[var5] = super.field1246[var5 - 1]; // L: 79
			super.field1263[var5] = super.field1263[var5 - 1]; // L: 80
		}

		super.field1204[0] = var3; // L: 82
		super.field1246[0] = var4; // L: 83
		super.field1263[0] = var2; // L: 84
	} // L: 85

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-122"
	)
	final void method2704(int var1, int var2, boolean var3) {
		if (super.field1235 != -1 && class353.SequenceDefinition_get(super.field1235).field2283 == 1) { // L: 88
			super.field1235 = -1;
		}

		if (!var3) { // L: 89
			int var4 = var1 - super.field1204[0]; // L: 90
			int var5 = var2 - super.field1246[0]; // L: 91
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 92
				if (super.field1229 < 9) { // L: 93
					++super.field1229;
				}

				for (int var6 = super.field1229; var6 > 0; --var6) { // L: 94
					super.field1204[var6] = super.field1204[var6 - 1]; // L: 95
					super.field1246[var6] = super.field1246[var6 - 1]; // L: 96
					super.field1263[var6] = super.field1263[var6 - 1]; // L: 97
				}

				super.field1204[0] = var1; // L: 99
				super.field1246[0] = var2; // L: 100
				super.field1263[0] = class238.field2519; // L: 101
				return; // L: 102
			}
		}

		super.field1229 = 0; // L: 105
		super.field1265 = 0; // L: 106
		super.field1264 = 0; // L: 107
		super.field1204[0] = var1; // L: 108
		super.field1246[0] = var2; // L: 109
		super.x = super.field1194 * 64 + super.field1204[0] * 128; // L: 110
		super.field1191 = super.field1194 * 64 + super.field1246[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-509525809"
	)
	int[] method2707() {
		return this.field1352 != null ? this.field1352.method9802() : this.field1347.method3713(); // L: 150 151 153
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)[S",
		garbageValue = "19445"
	)
	short[] method2720() {
		return this.field1352 != null ? this.field1352.method9811() : this.field1347.method3715(); // L: 157 158 160
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "16"
	)
	void method2709(int var1, int var2, short var3) {
		if (this.field1352 == null) { // L: 164
			this.field1352 = new class547(this.field1347); // L: 165
		}

		this.field1352.method9804(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "429368392"
	)
	void method2710(int[] var1, short[] var2) {
		if (this.field1352 == null) { // L: 171
			this.field1352 = new class547(this.field1347); // L: 172
		}

		this.field1352.method9805(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	void method2723() {
		this.field1352 = null; // L: 178
	} // L: 179

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V",
		garbageValue = "-740821724"
	)
	void method2712(class191 var1) {
		this.field1343 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Lhh;",
		garbageValue = "1"
	)
	class191 method2762() {
		return this.field1343; // L: 186
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V",
		garbageValue = "-549252376"
	)
	void method2714(class191 var1) {
		this.field1348 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1756478951"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.field1347 != null; // L: 145
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method2715() {
		this.field1343 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1090831740"
	)
	void method2729() {
		this.field1348 = null; // L: 198
	} // L: 199

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	int vmethod2708() {
		return this.field1347.field2030 == -1 ? super.field1250 : this.field1347.field2030; // L: 203
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1326777473"
	)
	public static void method2713(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.field3338, Client.packetWriter.isaacCipher); // L: 13476
		var4.packetBuffer.method9741(var0); // L: 13477
		var4.packetBuffer.method9767(var1); // L: 13478
		var4.packetBuffer.method9588(var2); // L: 13479
		var4.packetBuffer.method9609(var3 ? Client.field601 : 0); // L: 13480
		Client.packetWriter.addNode(var4); // L: 13481
	} // L: 13482
}
