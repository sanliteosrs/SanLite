import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class142 extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1471749567
	)
	public static int field1649;
	@ObfuscatedName("av")
	public static ThreadPoolExecutor field1655;
	@ObfuscatedName("gm")
	static String field1661;
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1622909371
	)
	int field1657;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[[Lfd;"
	)
	public class135[][] field1654;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Lfd;"
	)
	class135[][] field1650;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	public Skeleton field1651;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -433832585
	)
	int field1652;
	@ObfuscatedName("an")
	boolean field1653;
	@ObfuscatedName("ab")
	Future field1656;
	@ObfuscatedName("ai")
	List field1658;

	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;IZ)V",
		garbageValue = "0"
	)
	public class142(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1654 = null; // L: 21
		this.field1650 = null; // L: 22
		this.field1652 = 0; // L: 24
		this.field1657 = var3; // L: 32
		byte[] var5 = var1.takeFile(this.field1657 >> 16 & 65535, this.field1657 & 65535); // L: 33
		Buffer var6 = new Buffer(var5); // L: 34
		int var7 = var6.readUnsignedByte(); // L: 35
		int var8 = var6.readUnsignedShort(); // L: 36
		byte[] var9 = var2.getFile(var8, 0); // L: 39
		this.field1651 = new Skeleton(var8, var9); // L: 40
		this.field1658 = new ArrayList(); // L: 41
		this.field1656 = field1655.submit(new class139(this, var6, var7)); // L: 42
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "1380157813"
	)
	void method3204(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 52
		var1.readUnsignedShort(); // L: 53
		this.field1652 = var1.readUnsignedByte(); // L: 54
		int var3 = var1.readUnsignedShort(); // L: 55
		this.field1650 = new class135[this.field1651.method5407().method5356()][]; // L: 56
		this.field1654 = new class135[this.field1651.method5406()][]; // L: 57
		class134[] var4 = new class134[var3]; // L: 58

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) { // L: 59
			class136 var12 = FriendSystem.method1975(var1.readUnsignedByte()); // L: 60
			var7 = var1.readShortSmart(); // L: 61
			class137 var13 = class498.method8898(var1.readUnsignedByte()); // L: 62
			class135 var14 = new class135(); // L: 63
			var14.method3135(var1, var2); // L: 64
			var4[var5] = new class134(this, var14, var12, var13, var7); // L: 65
			int var10 = var12.method3168(); // L: 66
			class135[][] var15;
			if (var12 == class136.field1601) { // L: 68
				var15 = this.field1650; // L: 69
			} else {
				var15 = this.field1654; // L: 72
			}

			if (var15[var7] == null) { // L: 74
				var15[var7] = new class135[var10]; // L: 75
			}

			if (var12 == class136.field1600) { // L: 77
				this.field1653 = true; // L: 78
			}
		}

		var5 = var3 / field1649; // L: 81
		int var6 = var3 % field1649; // L: 82
		int var8 = 0; // L: 84

		for (int var9 = 0; var9 < field1649; ++var9) { // L: 85
			var7 = var8; // L: 86
			var8 += var5; // L: 87
			if (var6 > 0) { // L: 88
				++var8; // L: 89
				--var6; // L: 90
			}

			if (var7 == var8) { // L: 92
				break;
			}

			this.field1658.add(field1655.submit(new class141(this, var7, var8, var4))); // L: 97
		}

	} // L: 107

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2011777715"
	)
	public boolean method3231() {
		if (this.field1656 == null && this.field1658 == null) { // L: 110
			return true; // L: 111
		} else {
			if (this.field1656 != null) { // L: 113
				if (!this.field1656.isDone()) { // L: 114
					return false; // L: 115
				}

				this.field1656 = null; // L: 117
			}

			boolean var1 = true; // L: 119

			for (int var2 = 0; var2 < this.field1658.size(); ++var2) { // L: 120
				if (!((Future)this.field1658.get(var2)).isDone()) { // L: 121
					var1 = false; // L: 122
				} else {
					this.field1658.remove(var2); // L: 125
					--var2; // L: 126
				}
			}

			if (!var1) { // L: 129
				return false; // L: 130
			} else {
				this.field1658 = null; // L: 132
				return true; // L: 133
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1590804157"
	)
	public int method3205() {
		return this.field1652; // L: 137
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1212098783"
	)
	public boolean method3206() {
		return this.field1653; // L: 141
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILfv;III)V",
		garbageValue = "776450665"
	)
	public void method3211(int var1, class132 var2, int var3, int var4) {
		class424 var5 = class175.method3560(); // L: 145
		this.method3208(var5, var3, var2, var1); // L: 146
		this.method3230(var5, var3, var2, var1); // L: 147
		this.method3209(var5, var3, var2, var1); // L: 148
		var2.method3078(var5); // L: 149
		var5.method7801(); // L: 150
	} // L: 151

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqg;ILfv;II)V",
		garbageValue = "1416708693"
	)
	void method3208(class424 var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3082(this.field1652); // L: 154
		float var6 = var5[0]; // L: 155
		float var7 = var5[1]; // L: 156
		float var8 = var5[2]; // L: 157
		if (this.field1650[var2] != null) { // L: 158
			class135 var9 = this.field1650[var2][0]; // L: 159
			class135 var10 = this.field1650[var2][1]; // L: 160
			class135 var11 = this.field1650[var2][2]; // L: 161
			if (var9 != null) { // L: 162
				var6 = var9.method3137(var4);
			}

			if (var10 != null) { // L: 163
				var7 = var10.method3137(var4);
			}

			if (var11 != null) { // L: 164
				var8 = var11.method3137(var4);
			}
		}

		class423 var17 = class81.method2270(); // L: 166
		var17.method7734(1.0F, 0.0F, 0.0F, var6); // L: 167
		class423 var18 = class81.method2270(); // L: 168
		var18.method7734(0.0F, 1.0F, 0.0F, var7); // L: 169
		class423 var19 = class81.method2270(); // L: 170
		var19.method7734(0.0F, 0.0F, 1.0F, var8); // L: 171
		class423 var12 = class81.method2270(); // L: 172
		var12.method7737(var19); // L: 173
		var12.method7737(var17); // L: 174
		var12.method7737(var18); // L: 175
		class424 var13;
		synchronized(class424.field4704) { // L: 178
			if (class424.field4706 == 0) { // L: 179
				var13 = new class424();
			} else {
				class424.field4704[--class424.field4706].method7789(); // L: 181
				var13 = class424.field4704[class424.field4706]; // L: 182
			}
		}

		var13.method7797(var12); // L: 187
		var1.method7785(var13); // L: 188
		var17.method7764(); // L: 189
		var18.method7764(); // L: 190
		var19.method7764(); // L: 191
		var12.method7764(); // L: 192
		var13.method7801(); // L: 193
	} // L: 194

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqg;ILfv;II)V",
		garbageValue = "800913854"
	)
	void method3209(class424 var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3080(this.field1652); // L: 197
		float var6 = var5[0]; // L: 198
		float var7 = var5[1]; // L: 199
		float var8 = var5[2]; // L: 200
		if (this.field1650[var2] != null) { // L: 201
			class135 var9 = this.field1650[var2][3]; // L: 202
			class135 var10 = this.field1650[var2][4]; // L: 203
			class135 var11 = this.field1650[var2][5]; // L: 204
			if (var9 != null) { // L: 205
				var6 = var9.method3137(var4);
			}

			if (var10 != null) { // L: 206
				var7 = var10.method3137(var4);
			}

			if (var11 != null) { // L: 207
				var8 = var11.method3137(var4);
			}
		}

		var1.field4709[12] = var6; // L: 209
		var1.field4709[13] = var7; // L: 210
		var1.field4709[14] = var8; // L: 211
	} // L: 212

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqg;ILfv;II)V",
		garbageValue = "603613831"
	)
	void method3230(class424 var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3120(this.field1652); // L: 215
		float var6 = var5[0]; // L: 216
		float var7 = var5[1]; // L: 217
		float var8 = var5[2]; // L: 218
		if (this.field1650[var2] != null) { // L: 219
			class135 var9 = this.field1650[var2][6]; // L: 220
			class135 var10 = this.field1650[var2][7]; // L: 221
			class135 var11 = this.field1650[var2][8]; // L: 222
			if (var9 != null) { // L: 223
				var6 = var9.method3137(var4);
			}

			if (var10 != null) { // L: 224
				var7 = var10.method3137(var4);
			}

			if (var11 != null) { // L: 225
				var8 = var11.method3137(var4);
			}
		}

		class424 var14;
		synchronized(class424.field4704) { // L: 229
			if (class424.field4706 == 0) { // L: 230
				var14 = new class424();
			} else {
				class424.field4704[--class424.field4706].method7789(); // L: 232
				var14 = class424.field4704[class424.field4706]; // L: 233
			}
		}

		var14.method7804(var6, var7, var8); // L: 238
		var1.method7785(var14); // L: 239
		var14.method7801(); // L: 240
	} // L: 241

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Lei;",
		garbageValue = "12"
	)
	static AttackOption[] method3233() {
		return new AttackOption[]{AttackOption.field1381, AttackOption.field1384, AttackOption.field1385, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1382}; // L: 13626
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvq;",
		garbageValue = "-2047102417"
	)
	@Export("FillMode_values")
	public static class558[] FillMode_values() {
		return new class558[]{class558.SOLID, class558.field5446, class558.field5444}; // L: 15
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Ljava/lang/String;",
		garbageValue = "-85173996"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class301.Widget_unpackTargetMask(ClanChannel.getWidgetFlags(var0)) == 0) { // L: 13368
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 13369 13370 13372
		}
	}
}
