import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIIB)V",
		garbageValue = "-127"
	)
	void method6351(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3499[var1.field3576] & 4) != 0 && var1.field3578 < 0) { // L: 73
			int var6 = this.superStream.field3516[var1.field3576] / PcmPlayer.field295; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3584) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3584 += var4 * var6; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3584 += var7 * var6 - 1048576; // L: 81
				int var8 = PcmPlayer.field295 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3497[var1.field3576] == 0) { // L: 86
					var1.stream = RawPcmStream.method846(var1.rawSound, var10.method861(), var10.method852(), var10.method1009()); // L: 87
				} else {
					var1.stream = RawPcmStream.method846(var1.rawSound, var10.method861(), 0, var10.method1009()); // L: 90
					this.superStream.method6163(var1, var1.table.field3548[var1.field3569] < 0); // L: 91
					var1.stream.method857(var8, var10.method852()); // L: 92
				}

				if (var1.table.field3548[var1.field3569] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method951(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method849()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lmw;II)V",
		garbageValue = "977328612"
	)
	void method6352(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3499[var1.field3576] & 4) != 0 && var1.field3578 < 0) { // L: 105
			int var3 = this.superStream.field3516[var1.field3576] / PcmPlayer.field295; // L: 106
			int var4 = (var3 + 1048575 - var1.field3584) / var3; // L: 107
			var1.field3584 = var3 * var2 + var1.field3584 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3497[var1.field3576] == 0) { // L: 110
					var1.stream = RawPcmStream.method846(var1.rawSound, var1.stream.method861(), var1.stream.method852(), var1.stream.method1009()); // L: 111
				} else {
					var1.stream = RawPcmStream.method846(var1.rawSound, var1.stream.method861(), 0, var1.stream.method1009()); // L: 114
					this.superStream.method6163(var1, var1.table.field3548[var1.field3569] < 0); // L: 115
				}

				if (var1.table.field3548[var1.field3569] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3584 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) {
				return null; // L: 28
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("az")
	protected int vmethod6346() {
		return 0; // L: 34
	}

	@ObfuscatedName("ao")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method6180(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3583) { // L: 45
						this.method6351(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field3583 -= var5; // L: 52
						break;
					}

					this.method6351(var6, var1, var4, var6.field3583, var5 + var4); // L: 46
					var4 += var6.field3583; // L: 47
					var5 -= var6.field3583; // L: 48
				} while(!this.superStream.method6219(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("ak")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method6180(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3583) { // L: 62
						this.method6352(var3, var2); // L: 67
						var3.field3583 -= var2; // L: 68
						break;
					}

					this.method6352(var3, var3.field3583); // L: 63
					var2 -= var3.field3583; // L: 64
				} while(!this.superStream.method6219(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	public static void method6372() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 356
		NPCComposition.HitSplatDefinition_cachedFonts.clear(); // L: 357
	} // L: 358
}
