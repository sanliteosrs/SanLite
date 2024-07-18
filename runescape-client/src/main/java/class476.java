import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public class class476 implements class67 {
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -718963057
	)
	int field4966;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1090116467
	)
	public int field4964;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 663953355
	)
	public int field4963;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 953925525
	)
	public int field4968;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -323233339
	)
	public int field4967;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 255992747
	)
	public int field4973;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1530400209
	)
	public int field4969;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -293479555
	)
	public int field4970;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	public class101 field4971;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 579113171
	)
	int field4972;
	@ObfuscatedName("ae")
	public int[] field4974;
	@ObfuscatedName("au")
	public int[] field4965;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Ljb;"
	)
	class238[] field4975;

	public class476(int var1, int var2, int var3, int var4) {
		this.field4966 = 0; // L: 11
		this.field4964 = 0; // L: 12
		this.field4963 = 2; // L: 13
		this.field4968 = 0; // L: 14
		this.field4967 = -1; // L: 15
		this.field4973 = -1; // L: 16
		this.field4969 = -1; // L: 17
		this.field4970 = 0; // L: 18
		this.field4972 = 0; // L: 20
		this.field4974 = new int[10]; // L: 21
		this.field4965 = new int[10]; // L: 22
		this.field4975 = new class238[10];
		this.field4971 = new class101(var1, var2, var3, var4);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1094315846"
	)
	public int vmethod8670() {
		return this.field4967;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1560683435"
	)
	public int vmethod8671() {
		return this.field4969;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1219894600"
	)
	public int vmethod8672() {
		return this.field4966; // L: 45
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-286093061"
	)
	public void method8669() {
		this.field4971.field1316.field2917 = this.field4971.field1318;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILjb;I)V",
		garbageValue = "2140785958"
	)
	public final void method8684(int var1, int var2, class238 var3) {
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 49
			if (this.field4974[0] >= 0 && this.field4974[0] < 104 && this.field4965[0] >= 0 && this.field4965[0] < 104) {
				this.method8674(var1, var2, var3);
			} else {
				this.method8679(var1, var2);
			}
		} else {
			this.method8679(var1, var2);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1231397915"
	)
	public void method8679(int var1, int var2) {
		this.field4972 = 0;
		this.field4974[0] = var1;
		this.field4965[0] = var2; // L: 61
		byte var3 = 1;
		this.field4967 = var3 * 64 + this.field4974[0] * 128;
		this.field4969 = var3 * 64 + this.field4965[0] * 128;
	} // L: 65

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjb;I)V",
		garbageValue = "1637705653"
	)
	final void method8674(int var1, int var2, class238 var3) {
		if (this.field4972 < 9) {
			++this.field4972;
		}

		for (int var4 = this.field4972; var4 > 0; --var4) { // L: 69
			this.field4974[var4] = this.field4974[var4 - 1];
			this.field4965[var4] = this.field4965[var4 - 1];
			this.field4975[var4] = this.field4975[var4 - 1];
		}

		this.field4974[0] = var1;
		this.field4965[0] = var2;
		this.field4975[0] = var3;
	} // L: 77

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "18238"
	)
	public final void method8673() {
		int var1 = this.field4964 - this.field4970 & 2047;
		if (var1 != 0) { // L: 81
			boolean var2 = true;
			boolean var3 = true; // L: 83
			int var4 = var1 > 1024 ? -1 : 1; // L: 84
			this.field4970 += var4 * (this.field4968 > 0 ? 1 + this.field4963 : this.field4963);
			--this.field4968;
			if (var1 < this.field4963 || var1 > 2048 - this.field4963) {
				this.field4970 = this.field4964;
			}

			this.field4970 &= 2047; // L: 90
		}

		if (this.field4972 == 0) {
			this.method8679(this.field4974[0], this.field4965[0]);
		} else {
			int var10 = this.field4967;
			int var11 = this.field4969;
			byte var12 = 1; // L: 98
			int var5 = this.field4974[this.field4972 - 1] * 128 + var12 * 128 / 2; // L: 99
			int var6 = this.field4965[this.field4972 - 1] * 128 + var12 * 128 / 2;
			class238 var7 = this.field4975[this.field4972 - 1];
			int var8 = (int)(Math.ceil((double)var7.field2517) * 128.0D);
			if (var5 - var10 <= var8 && var5 - var10 >= -var8 && var6 - var11 <= var8 && var6 - var11 >= -var8) { // L: 103
				byte var9 = 4; // L: 109
				if (this.field4972 > 2) { // L: 110
					var9 = 6;
				}

				if (this.field4972 > 3) {
					var9 = 8;
				}

				int var13 = (int)(var7.field2517 * (float)var9);
				if (var5 != var10 || var6 != var11) { // L: 113
					if (var10 < var5) {
						this.field4967 += var13; // L: 115
						if (this.field4967 > var5) {
							this.field4967 = var5;
						}
					} else if (var10 > var5) { // L: 118
						this.field4967 -= var13; // L: 119
						if (this.field4967 < var5) {
							this.field4967 = var5;
						}
					}

					if (var11 < var6) {
						this.field4969 += var13; // L: 123
						if (this.field4969 > var6) {
							this.field4969 = var6;
						}
					} else if (var11 > var6) {
						this.field4969 -= var13;
						if (this.field4969 < var6) { // L: 128
							this.field4969 = var6;
						}
					}
				}

				if (var5 == this.field4967 && var6 == this.field4969) {
					--this.field4972;
				}

			} else {
				this.field4967 = var5;
				this.field4969 = var6;
				--this.field4972; // L: 106
			}
		}
	} // L: 94

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lpe;IS)Lmb;",
		garbageValue = "-11325"
	)
	public static PacketBufferNode method8675(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.field3302, Client.packetWriter.isaacCipher); // L: 23
		var4.packetBuffer.writeByte(0); // L: 24
		int var5 = var4.packetBuffer.offset; // L: 25
		var4.packetBuffer.writeByte(var0); // L: 26
		String var6 = var1.toLowerCase(); // L: 27
		int var7 = 0; // L: 28
		byte[] var8 = null; // L: 29
		if (var6.startsWith("yellow:")) { // L: 30
			var7 = 0; // L: 31
			var1 = var1.substring("yellow:".length()); // L: 32
		} else if (var6.startsWith("red:")) { // L: 34
			var7 = 1; // L: 35
			var1 = var1.substring("red:".length()); // L: 36
		} else if (var6.startsWith("green:")) { // L: 38
			var7 = 2; // L: 39
			var1 = var1.substring("green:".length()); // L: 40
		} else if (var6.startsWith("cyan:")) { // L: 42
			var7 = 3; // L: 43
			var1 = var1.substring("cyan:".length()); // L: 44
		} else if (var6.startsWith("purple:")) { // L: 46
			var7 = 4; // L: 47
			var1 = var1.substring("purple:".length()); // L: 48
		} else if (var6.startsWith("white:")) { // L: 50
			var7 = 5; // L: 51
			var1 = var1.substring("white:".length()); // L: 52
		} else if (var6.startsWith("flash1:")) { // L: 54
			var7 = 6; // L: 55
			var1 = var1.substring("flash1:".length()); // L: 56
		} else if (var6.startsWith("flash2:")) { // L: 58
			var7 = 7; // L: 59
			var1 = var1.substring("flash2:".length()); // L: 60
		} else if (var6.startsWith("flash3:")) { // L: 62
			var7 = 8; // L: 63
			var1 = var1.substring("flash3:".length()); // L: 64
		} else if (var6.startsWith("glow1:")) { // L: 66
			var7 = 9; // L: 67
			var1 = var1.substring("glow1:".length()); // L: 68
		} else if (var6.startsWith("glow2:")) { // L: 70
			var7 = 10; // L: 71
			var1 = var1.substring("glow2:".length()); // L: 72
		} else if (var6.startsWith("glow3:")) { // L: 74
			var7 = 11; // L: 75
			var1 = var1.substring("glow3:".length()); // L: 76
		} else if (var6.startsWith("rainbow:")) { // L: 78
			var7 = 12; // L: 79
			var1 = var1.substring("rainbow:".length()); // L: 80
		} else if (var6.startsWith("pattern")) { // L: 82
			boolean var10 = true; // L: 85
			boolean var11 = true; // L: 86
			int var12 = "pattern".length(); // L: 87
			int var13 = 0; // L: 88
			byte[] var14 = new byte[8]; // L: 89

			byte[] var9;
			while (true) {
				int var15 = var13 + var12; // L: 91
				if (var15 >= var6.length()) { // L: 92
					var9 = null; // L: 93
					break;
				}

				char var16 = var6.charAt(var15); // L: 96
				if (var16 == ':') { // L: 97
					if (var13 == 0) { // L: 116
						var9 = null; // L: 117
					} else {
						byte[] var17 = new byte[var13]; // L: 120
						System.arraycopy(var14, 0, var17, 0, var13); // L: 121
						var9 = var17; // L: 122
					}
					break;
				}

				if (var14.length == var13) { // L: 100
					var9 = null; // L: 101
					break; // L: 102
				}

				if (var16 >= '0' && var16 <= '9') { // L: 104
					var16 = (char)(var16 - '0'); // L: 105
				} else {
					if (var16 < 'a' || var16 > 'z') { // L: 107
						var9 = null; // L: 111
						break; // L: 112
					}

					var16 = (char)(var16 - 'W'); // L: 108
				}

				var14[var13++] = (byte)var16; // L: 114
			}

			var8 = var9; // L: 124
			if (var9 != null) { // L: 125
				var7 = var9.length + 12; // L: 126
				var1 = var1.substring("pattern".length() + var9.length + 1); // L: 127
			}
		}

		var6 = var1.toLowerCase(); // L: 130
		byte var18 = 0; // L: 131
		if (var6.startsWith("wave:")) { // L: 132
			var18 = 1; // L: 133
			var1 = var1.substring("wave:".length()); // L: 134
		} else if (var6.startsWith("wave2:")) { // L: 136
			var18 = 2; // L: 137
			var1 = var1.substring("wave2:".length()); // L: 138
		} else if (var6.startsWith("shake:")) { // L: 140
			var18 = 3; // L: 141
			var1 = var1.substring("shake:".length()); // L: 142
		} else if (var6.startsWith("scroll:")) { // L: 144
			var18 = 4; // L: 145
			var1 = var1.substring("scroll:".length()); // L: 146
		} else if (var6.startsWith("slide:")) { // L: 148
			var18 = 5; // L: 149
			var1 = var1.substring("slide:".length()); // L: 150
		}

		var4.packetBuffer.writeByte(var7); // L: 152
		var4.packetBuffer.writeByte(var18); // L: 153
		if (var8 != null) { // L: 154
			for (int var19 = 0; var19 < var8.length; ++var19) { // L: 155
				var4.packetBuffer.writeByte(var8[var19]); // L: 156
			}
		}

		class225.method4305(var4.packetBuffer, var1); // L: 159
		if (var0 == class366.field4000.rsOrdinal()) { // L: 160
			var4.packetBuffer.writeByte(var3); // L: 161
		}

		var4.packetBuffer.method9605(var4.packetBuffer.offset - var5); // L: 163
		return var4; // L: 164
	}
}
