import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class231 implements class29 {
	@ObfuscatedName("aq")
	char[] field2461;
	@ObfuscatedName("ad")
	int[] field2448;
	@ObfuscatedName("ag")
	public int[] field2457;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -625491541
	)
	public int field2450;
	@ObfuscatedName("ap")
	int[] field2451;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1718960357
	)
	int field2452;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -413767025
	)
	int field2453;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1980467025
	)
	int field2456;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1889891679
	)
	int field2455;
	@ObfuscatedName("ai")
	boolean[] field2449;
	@ObfuscatedName("ae")
	boolean[] field2454;
	@ObfuscatedName("au")
	boolean[] field2458;
	@ObfuscatedName("ah")
	public char field2459;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -243119895
	)
	public int field2460;

	public class231() {
		this.field2461 = new char[128]; // L: 8
		this.field2448 = new int[128]; // L: 9
		this.field2457 = new int[128]; // L: 10
		this.field2450 = 0; // L: 11
		this.field2451 = new int[128]; // L: 12
		this.field2452 = 0; // L: 13
		this.field2453 = 0; // L: 14
		this.field2456 = 0; // L: 15
		this.field2455 = 0; // L: 16
		this.field2449 = new boolean[112]; // L: 17
		this.field2454 = new boolean[112]; // L: 18
		this.field2458 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1607404438"
	)
	public boolean vmethod4396(int var1) {
		this.method4379(var1); // L: 24
		this.field2449[var1] = true; // L: 25
		this.field2454[var1] = true; // L: 26
		this.field2458[var1] = false; // L: 27
		this.field2457[++this.field2450 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "20"
	)
	public boolean vmethod4375(int var1) {
		this.field2449[var1] = false; // L: 33
		this.field2454[var1] = false; // L: 34
		this.field2458[var1] = true; // L: 35
		this.field2451[++this.field2452 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-502375958"
	)
	public boolean vmethod4378(char var1) {
		int var2 = this.field2456 + 1 & 127; // L: 41
		if (var2 != this.field2453) { // L: 42
			this.field2448[this.field2456] = -1; // L: 43
			this.field2461[this.field2456] = var1; // L: 44
			this.field2456 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZS)Z",
		garbageValue = "13173"
	)
	public boolean vmethod4380(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1195175196"
	)
	void method4379(int var1) {
		int var2 = this.field2456 + 1 & 127; // L: 51
		if (var2 != this.field2453) { // L: 52
			this.field2448[this.field2456] = var1; // L: 53
			this.field2461[this.field2456] = 0; // L: 54
			this.field2456 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	public void method4406() {
		this.field2453 = this.field2455; // L: 64
		this.field2455 = this.field2456; // L: 65
		this.field2450 = 0; // L: 66
		this.field2452 = 0; // L: 67
		Arrays.fill(this.field2454, false); // L: 68
		Arrays.fill(this.field2458, false); // L: 69
	} // L: 70

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	public final boolean method4382() {
		if (this.field2453 == this.field2455) { // L: 73
			return false;
		} else {
			this.field2460 = this.field2448[this.field2453]; // L: 74
			this.field2459 = this.field2461[this.field2453]; // L: 75
			this.field2453 = this.field2453 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2082579801"
	)
	public boolean method4383(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2454[var1] : false; // L: 81 82
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-95509134"
	)
	public boolean method4384(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2449[var1] : false; // L: 86 87
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1504943769"
	)
	public boolean method4385(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2458[var1] : false; // L: 91 92
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1345585805"
	)
	public int[] method4386() {
		int[] var1 = new int[this.field2450]; // L: 96

		for (int var2 = 0; var2 < this.field2450; ++var2) { // L: 97
			var1[var2] = this.field2457[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "3"
	)
	public int[] method4387() {
		int[] var1 = new int[this.field2452]; // L: 104

		for (int var2 = 0; var2 < this.field2452; ++var2) { // L: 105
			var1[var2] = this.field2451[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-633889102"
	)
	static final int method4392(int var0, int var1) {
		if (var0 == -1) { // L: 1017
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1018
			if (var1 < 2) { // L: 1019
				var1 = 2;
			} else if (var1 > 126) { // L: 1020
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1021
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "30"
	)
	static final void method4409(String var0, int var1) {
		PacketBufferNode var2 = class170.getPacketBufferNode(ClientPacket.field3342, Client.packetWriter.isaacCipher); // L: 208
		var2.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 209
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 210
		var2.packetBuffer.writeByte(var1); // L: 211
		Client.packetWriter.addNode(var2); // L: 212
	} // L: 213
}
