import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class27 {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		longValue = 7494969623625651721L
	)
	static long field127;
	@ObfuscatedName("aj")
	int[] field120;
	@ObfuscatedName("av")
	int[] field126;

	public class27() {
		this.field120 = new int[112]; // L: 12
		this.field126 = new int[192]; // L: 13
		Arrays.fill(this.field120, 3); // L: 16
		Arrays.fill(this.field126, 3); // L: 17
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-57596643"
	)
	public void method392(int var1, int var2) {
		if (this.method400(var1) && this.method402(var2)) { // L: 21
			this.field120[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-1566354354"
	)
	public void method393(char var1, int var2) {
		if (this.method401(var1) && this.method402(var2)) { // L: 27
			this.field126[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1534998510"
	)
	public int method404(int var1) {
		return this.method400(var1) ? this.field120[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "1201143155"
	)
	public int method395(char var1) {
		return this.method401(var1) ? this.field126[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "103"
	)
	public boolean method396(int var1) {
		return this.method400(var1) && (this.field120[var1] == 1 || this.field120[var1] == 3); // L: 47
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "895395220"
	)
	public boolean method397(char var1) {
		return this.method401(var1) && (this.field126[var1] == 1 || this.field126[var1] == 3); // L: 51
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1293375893"
	)
	public boolean method398(int var1) {
		return this.method400(var1) && (this.field120[var1] == 2 || this.field120[var1] == 3); // L: 55
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "382394431"
	)
	public boolean method399(char var1) {
		return this.method401(var1) && (this.field126[var1] == 2 || this.field126[var1] == 3); // L: 59
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "632051655"
	)
	boolean method400(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-105"
	)
	boolean method401(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2077512194"
	)
	boolean method402(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "1"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 146
		int var2 = 0; // L: 147

		for (int var3 = 0; var3 < var1; ++var3) { // L: 148
			var2 = (var2 << 5) - var2 + class276.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 149
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lde;ZLug;I)V",
		garbageValue = "2146406282"
	)
	static final void method430(class101 var0, boolean var1, PacketBuffer var2) {
		while (true) {
			byte var3 = 16; // L: 9718
			int var4 = 1 << var3; // L: 9719
			if (var2.method9502(Client.packetWriter.serverPacketLength) >= var3 + 12) { // L: 9720
				int var5 = var2.readBits(var3); // L: 9721
				if (var5 != var4 - 1) { // L: 9722
					boolean var6 = false; // L: 9723
					if (var0.field1315[var5] == null) { // L: 9724
						var0.field1315[var5] = new class103(); // L: 9725
						var6 = true; // L: 9726
					}

					class103 var7 = var0.field1315[var5]; // L: 9728
					var0.field1330[++var0.field1329 - 1] = var5; // L: 9729
					var7.field1240 = Client.cycle; // L: 9730
					boolean var11 = var2.readBits(1) == 1; // L: 9734
					if (var11) { // L: 9735
						var2.readBits(32); // L: 9736
					}

					int var9;
					if (var1) { // L: 9738
						var9 = var2.readBits(8); // L: 9739
						if (var9 > 127) { // L: 9740
							var9 -= 256;
						}
					} else {
						var9 = var2.readBits(5); // L: 9743
						if (var9 > 15) { // L: 9744
							var9 -= 32;
						}
					}

					int var10;
					if (var1) { // L: 9746
						var10 = var2.readBits(8); // L: 9747
						if (var10 > 127) { // L: 9748
							var10 -= 256;
						}
					} else {
						var10 = var2.readBits(5); // L: 9751
						if (var10 > 15) { // L: 9752
							var10 -= 32;
						}
					}

					int var12 = var2.readBits(1); // L: 9754
					if (var12 == 1) { // L: 9755
						Client.field565[++Client.field564 - 1] = var5;
					}

					int var13 = Client.field703[var2.readBits(3)]; // L: 9756
					if (var6) { // L: 9757
						var7.field1257 = var7.field1192 = var13;
					}

					int var8 = var2.readBits(1); // L: 9758
					var7.field1347 = class76.getNpcDefinition(var2.readBits(14)); // L: 9759
					class489.method8833(var7); // L: 9760
					if (var7.field1259 == 0) { // L: 9761
						var7.field1192 = 0;
					}

					if (Client.field508 >= 222) { // L: 9762
						var7.method2704(var9 + class47.field314, var10 + class19.field86, var8 == 1); // L: 9763
						continue;
					}

					var7.method2704(SoundCache.localPlayer.field1204[0] + var9, SoundCache.localPlayer.field1246[0] + var10, var8 == 1); // L: 9766
					continue;
				}
			}

			var2.exportIndex(); // L: 9769
			return; // L: 9770
		}
	}
}
