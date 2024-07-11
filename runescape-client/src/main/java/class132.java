import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class132 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1437500881
	)
	public final int field1546;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	public class132 field1554;
	@ObfuscatedName("ag")
	float[][] field1547;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	final class424[] field1556;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	class424[] field1549;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	class424[] field1550;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	class424 field1551;
	@ObfuscatedName("av")
	boolean field1552;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	class424 field1555;
	@ObfuscatedName("ai")
	boolean field1559;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	class424 field1545;
	@ObfuscatedName("au")
	float[][] field1548;
	@ObfuscatedName("ah")
	float[][] field1557;
	@ObfuscatedName("az")
	float[][] field1558;

	@ObfuscatedSignature(
		descriptor = "(ILvp;Z)V"
	)
	public class132(int var1, Buffer var2, boolean var3) {
		this.field1551 = new class424(); // L: 13
		this.field1552 = true; // L: 14
		this.field1555 = new class424(); // L: 15
		this.field1559 = true; // L: 16
		this.field1545 = new class424(); // L: 17
		this.field1546 = var2.readShort(); // L: 23
		this.field1556 = new class424[var1]; // L: 24
		this.field1549 = new class424[this.field1556.length]; // L: 25
		this.field1550 = new class424[this.field1556.length]; // L: 26
		this.field1547 = new float[this.field1556.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1556.length; ++var4) { // L: 28
			this.field1556[var4] = new class424(var2, var3); // L: 29
			this.field1547[var4][0] = var2.method9565(); // L: 30
			this.field1547[var4][1] = var2.method9565(); // L: 31
			this.field1547[var4][2] = var2.method9565(); // L: 32
		}

		this.method3074(); // L: 34
	} // L: 35

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-375520590"
	)
	void method3074() {
		this.field1548 = new float[this.field1556.length][3]; // L: 38
		this.field1557 = new float[this.field1556.length][3]; // L: 39
		this.field1558 = new float[this.field1556.length][3]; // L: 40
		class424 var1;
		synchronized(class424.field4704) { // L: 43
			if (class424.field4706 == 0) { // L: 44
				var1 = new class424();
			} else {
				class424.field4704[--class424.field4706].method7789(); // L: 46
				var1 = class424.field4704[class424.field4706]; // L: 47
			}
		}

		class424 var2 = var1; // L: 51

		for (int var5 = 0; var5 < this.field1556.length; ++var5) { // L: 52
			class424 var4 = this.method3075(var5); // L: 53
			var2.method7809(var4); // L: 54
			var2.method7790(); // L: 55
			this.field1548[var5] = var2.method7779(); // L: 56
			this.field1557[var5][0] = var4.field4709[12]; // L: 57
			this.field1557[var5][1] = var4.field4709[13]; // L: 58
			this.field1557[var5][2] = var4.field4709[14]; // L: 59
			this.field1558[var5] = var4.method7798(); // L: 60
		}

		var2.method7801(); // L: 62
	} // L: 63

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqg;",
		garbageValue = "69"
	)
	class424 method3075(int var1) {
		return this.field1556[var1]; // L: 66
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lqg;",
		garbageValue = "829200770"
	)
	class424 method3116(int var1) {
		if (this.field1549[var1] == null) {
			this.field1549[var1] = new class424(this.method3075(var1)); // L: 71
			if (this.field1554 != null) {
				this.field1549[var1].method7785(this.field1554.method3116(var1)); // L: 73
			} else {
				this.field1549[var1].method7785(class424.field4707); // L: 76
			}
		}

		return this.field1549[var1]; // L: 79
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqg;",
		garbageValue = "0"
	)
	class424 method3079(int var1) {
		if (this.field1550[var1] == null) { // L: 83
			this.field1550[var1] = new class424(this.method3116(var1)); // L: 84
			this.field1550[var1].method7790(); // L: 85
		}

		return this.field1550[var1]; // L: 87
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqg;B)V",
		garbageValue = "54"
	)
	void method3078(class424 var1) {
		this.field1551.method7809(var1); // L: 91
		this.field1552 = true; // L: 92
		this.field1559 = true; // L: 93
	} // L: 94

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lqg;",
		garbageValue = "104"
	)
	class424 method3095() {
		return this.field1551; // L: 97
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lqg;",
		garbageValue = "1080468653"
	)
	class424 method3117() {
		if (this.field1552) { // L: 101
			this.field1555.method7809(this.method3095()); // L: 102
			if (this.field1554 != null) { // L: 103
				this.field1555.method7785(this.field1554.method3117()); // L: 104
			}

			this.field1552 = false; // L: 106
		}

		return this.field1555; // L: 108
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lqg;",
		garbageValue = "-2053259314"
	)
	public class424 method3093(int var1) {
		if (this.field1559) { // L: 112
			this.field1545.method7809(this.method3079(var1)); // L: 113
			this.field1545.method7785(this.method3117()); // L: 114
			this.field1559 = false; // L: 115
		}

		return this.field1545; // L: 117
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "396253425"
	)
	float[] method3082(int var1) {
		return this.field1548[var1]; // L: 121
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1697728094"
	)
	float[] method3080(int var1) {
		return this.field1557[var1]; // L: 125
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-36"
	)
	float[] method3120(int var1) {
		return this.field1558[var1]; // L: 129
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljg;",
		garbageValue = "382186703"
	)
	static WorldMapSprite method3118(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class199.method3813(var0).pixels); // L: 19 20
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2065475327"
	)
	public static int method3073(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 68
		int var1 = (int)(var2 >>> 49 & 2047L); // L: 70
		return var1; // L: 72
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-723149829"
	)
	static final void method3099() {
		KitDefinition.field1918 = null; // L: 3249
		KitDefinition.KitDefinition_modelsArchive = null; // L: 3250
		class333.field3646 = 0; // L: 3251
	} // L: 3253
}
