import java.security.SecureRandom;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class150 {
	@ObfuscatedName("hf")
	static SecureRandom field1711;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -7654640470494452803L
	)
	long field1709;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -356524575
	)
	public int field1707;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	IterableNodeDeque field1708;

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public class150(Buffer var1) {
		this.field1707 = -1; // L: 9
		this.field1708 = new IterableNodeDeque(); // L: 10
		this.method3283(var1); // L: 28
	} // L: 29

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-2002945409"
	)
	void method3283(Buffer var1) {
		this.field1709 = var1.readLong(); // L: 32
		this.field1707 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class169(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class145(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class162(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class154(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class161(this);
			} else if (var2 == 5) {
				var3 = new class146(this); // L: 42
			} else if (var2 == 2) { // L: 43
				var3 = new class151(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class144(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class148(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class165(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class171(this);
			} else if (var2 == 10) { // L: 48
				var3 = new class157(this);
			} else if (var2 == 11) { // L: 49
				var3 = new class152(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class156(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class166(this);
			}

			((class147)var3).vmethod3528(var1); // L: 53
			this.field1708.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "34"
	)
	public void method3286(ClanSettings var1) {
		if (this.field1709 == var1.field1761 && this.field1707 == var1.field1762) { // L: 60
			for (class147 var2 = (class147)this.field1708.last(); var2 != null; var2 = (class147)this.field1708.previous()) { // L: 61
				var2.vmethod3530(var1); // L: 62
			}

			++var1.field1762; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmp;",
		garbageValue = "735390197"
	)
	public static ServerPacket[] method3287() {
		return new ServerPacket[]{ServerPacket.field3501, ServerPacket.field3533, ServerPacket.field3441, ServerPacket.field3516, ServerPacket.field3460, ServerPacket.field3405, ServerPacket.field3406, ServerPacket.field3484, ServerPacket.field3408, ServerPacket.field3409, ServerPacket.field3410, ServerPacket.field3411, ServerPacket.field3412, ServerPacket.field3413, ServerPacket.field3523, ServerPacket.field3415, ServerPacket.field3416, ServerPacket.field3417, ServerPacket.field3418, ServerPacket.field3419, ServerPacket.field3520, ServerPacket.field3421, ServerPacket.field3422, ServerPacket.field3465, ServerPacket.field3464, ServerPacket.field3425, ServerPacket.field3426, ServerPacket.field3468, ServerPacket.field3428, ServerPacket.field3429, ServerPacket.field3430, ServerPacket.field3427, ServerPacket.field3432, ServerPacket.field3433, ServerPacket.field3490, ServerPacket.field3435, ServerPacket.field3436, ServerPacket.field3437, ServerPacket.field3438, ServerPacket.field3439, ServerPacket.field3440, ServerPacket.field3472, ServerPacket.field3404, ServerPacket.field3443, ServerPacket.field3498, ServerPacket.field3445, ServerPacket.field3446, ServerPacket.field3447, ServerPacket.field3448, ServerPacket.field3449, ServerPacket.field3450, ServerPacket.field3451, ServerPacket.field3495, ServerPacket.field3453, ServerPacket.field3454, ServerPacket.field3455, ServerPacket.field3456, ServerPacket.field3457, ServerPacket.field3458, ServerPacket.field3459, ServerPacket.field3431, ServerPacket.field3461, ServerPacket.field3424, ServerPacket.field3504, ServerPacket.field3414, ServerPacket.field3478, ServerPacket.field3463, ServerPacket.field3442, ServerPacket.field3400, ServerPacket.field3469, ServerPacket.field3470, ServerPacket.field3471, ServerPacket.field3515, ServerPacket.field3434, ServerPacket.field3508, ServerPacket.field3500, ServerPacket.field3476, ServerPacket.field3477, ServerPacket.field3519, ServerPacket.field3462, ServerPacket.field3480, ServerPacket.field3481, ServerPacket.field3482, ServerPacket.field3420, ServerPacket.field3510, ServerPacket.field3517, ServerPacket.field3486, ServerPacket.field3487, ServerPacket.field3488, ServerPacket.field3489, ServerPacket.field3452, ServerPacket.field3491, ServerPacket.field3407, ServerPacket.field3493, ServerPacket.field3494, ServerPacket.field3479, ServerPacket.field3496, ServerPacket.field3497, ServerPacket.field3467, ServerPacket.field3499, ServerPacket.field3513, ServerPacket.field3522, ServerPacket.field3502, ServerPacket.field3503, ServerPacket.field3529, ServerPacket.field3505, ServerPacket.field3506, ServerPacket.field3507, ServerPacket.field3485, ServerPacket.field3509, ServerPacket.field3402, ServerPacket.field3401, ServerPacket.field3512, ServerPacket.field3483, ServerPacket.field3514, ServerPacket.field3403, ServerPacket.field3474, ServerPacket.field3492, ServerPacket.field3518, ServerPacket.field3475, ServerPacket.field3466, ServerPacket.field3521, ServerPacket.field3511, ServerPacket.field3444, ServerPacket.field3524, ServerPacket.field3525, ServerPacket.field3526, ServerPacket.field3527, ServerPacket.field3528, ServerPacket.field3535, ServerPacket.field3530, ServerPacket.field3531, ServerPacket.field3532, ServerPacket.field3423}; // L: 143
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Ljp;",
		garbageValue = "-1428513345"
	)
	public static class234 method3284(int var0, int var1) {
		int var2 = var0 - var1 & 2047; // L: 11
		class239 var3 = class239.field2522; // L: 12
		if (var2 > 1024) { // L: 13
			var2 = 2048 - var2; // L: 14
			var3 = class239.field2521; // L: 15
		}

		return new class234(var3, var2); // L: 17
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	static void method3288() {
		Client.packetWriter.addNode(class170.getPacketBufferNode(ClientPacket.field3352, Client.packetWriter.isaacCipher)); // L: 13493
		Client.oculusOrbState = 0; // L: 13494
	} // L: 13495
}
