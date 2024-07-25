import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 228258009
	)
	public static int field263;
	@ObfuscatedName("av")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("az")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1310725203
	)
	int field267;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -6736315824041076637L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1554328633
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1832230557
	)
	public int field270;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -945699819
	)
	int field271;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 4914575348622821863L
	)
	long field281;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1128975809
	)
	int field273;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -31211881
	)
	int field274;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -613062825
	)
	int field275;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -4744642679061521139L
	)
	long field264;
	@ObfuscatedName("ar")
	boolean field282;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 494305069
	)
	int field279;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field272;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field277;

	public PcmPlayer() {
		this.field267 = 32;
		this.timeMs = WorldMapData_1.method4861(); // L: 23
		this.field281 = 0L; // L: 27
		this.field273 = 0; // L: 28
		this.field274 = 0;
		this.field275 = 0;
		this.field264 = 0L;
		this.field282 = true;
		this.field279 = 0; // L: 38
		this.field272 = new PcmStream[8]; // L: 39
		this.field277 = new PcmStream[8]; // L: 40
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1354681235"
	)
	@Export("init")
	public void init() throws Exception {
	} // L: 251

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-44"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	} // L: 252

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 255
	}

	@ObfuscatedName("ak")
	@Export("write")
	protected void write() throws Exception {
	} // L: 258

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-761877080"
	)
	@Export("close")
	protected void close() {
	} // L: 259

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 260

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "-1119313536"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 50
	} // L: 51

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1613233697"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 54
			long var1 = WorldMapData_1.method4861(); // L: 55

			try {
				if (0L != this.field281) { // L: 57
					if (var1 < this.field281) { // L: 58
						return;
					}

					this.open(this.capacity); // L: 59
					this.field281 = 0L; // L: 60
					this.field282 = true; // L: 61
				}

				int var3 = this.position(); // L: 63
				if (this.field275 - var3 > this.field273) { // L: 64
					this.field273 = this.field275 - var3;
				}

				int var4 = this.field270 + this.field271; // L: 65
				if (var4 + 256 > 16384) { // L: 66
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 67
					this.capacity += 1024; // L: 68
					if (this.capacity > 16384) { // L: 69
						this.capacity = 16384;
					}

					this.close(); // L: 70
					this.open(this.capacity); // L: 71
					var3 = 0; // L: 72
					this.field282 = true; // L: 73
					if (var4 + 256 > this.capacity) { // L: 74
						var4 = this.capacity - 256; // L: 75
						this.field271 = var4 - this.field270; // L: 76
					}
				}

				while (var3 < var4) { // L: 79
					this.fill(this.samples, 256); // L: 80
					this.write(); // L: 81
					var3 += 256; // L: 82
				}

				if (var1 > this.field264) { // L: 84
					if (!this.field282) { // L: 85
						if (this.field273 == 0 && this.field274 == 0) { // L: 86
							this.close(); // L: 87
							this.field281 = 2000L + var1; // L: 88
							return; // L: 89
						}

						this.field271 = Math.min(this.field274, this.field273); // L: 91
						this.field274 = this.field273; // L: 92
					} else {
						this.field282 = false; // L: 94
					}

					this.field273 = 0; // L: 95
					this.field264 = var1 + 2000L; // L: 96
				}

				this.field275 = var3; // L: 98
			} catch (Exception var7) { // L: 100
				this.close(); // L: 101
				this.field281 = 2000L + var1; // L: 102
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 105
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 106
					this.skip(256); // L: 107
					this.timeMs += (long)(256000 / field263); // L: 108
				}
			} catch (Exception var6) { // L: 111
				this.timeMs = var1; // L: 112
			}

		}
	} // L: 114

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1775154545"
	)
	public final void method841() {
		this.field282 = true; // L: 117
	} // L: 118

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1317614118"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field282 = true; // L: 121

		try {
			this.discard(); // L: 123
		} catch (Exception var2) { // L: 125
			this.close(); // L: 126
			this.field281 = WorldMapData_1.method4861() + 2000L; // L: 127
		}

	} // L: 129

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-198329887"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 132
			boolean var1 = true; // L: 133

			for (int var2 = 0; var2 < 2; ++var2) { // L: 134
				if (this == soundSystem.players[var2]) {
					soundSystem.players[var2] = null; // L: 135
				}

				if (soundSystem.players[var2] != null) { // L: 136
					var1 = false;
				}
			}

			if (var1) { // L: 138
				soundSystemExecutor.shutdownNow(); // L: 139
				soundSystemExecutor = null; // L: 140
				soundSystem = null; // L: 141
			}
		}

		this.close(); // L: 144
		this.samples = null; // L: 145
	} // L: 146

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "138550330"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field279 -= var1; // L: 149
		if (this.field279 < 0) {
			this.field279 = 0; // L: 150
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 151
		}

	} // L: 152

	@ObfuscatedName("bg")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 156
		if (SecureRandomFuture.PcmPlayer_stereo) { // L: 157
			var3 = var2 << 1;
		}

		class447.clearIntArray(var1, 0, var3); // L: 158
		this.field279 -= var2; // L: 159
		if (this.stream != null && this.field279 <= 0) { // L: 160
			this.field279 += field263 >> 4; // L: 161
			class30.PcmStream_disable(this.stream); // L: 162
			this.method802(this.stream, this.stream.vmethod1052()); // L: 163
			int var4 = 0; // L: 164
			int var5 = 255; // L: 165

			int var6;
			PcmStream var10;
			label109:
			for (var6 = 7; var5 != 0; --var6) { // L: 166
				int var7;
				int var8;
				if (var6 < 0) { // L: 169
					var7 = var6 & 3; // L: 170
					var8 = -(var6 >> 2); // L: 171
				} else {
					var7 = var6; // L: 174
					var8 = 0; // L: 175
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 177 179
					if ((var9 & 1) != 0) { // L: 182
						var5 &= ~(1 << var7); // L: 185
						var10 = null; // L: 186
						PcmStream var11 = this.field272[var7]; // L: 187

						label103:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 188
									break label103;
								}

								AbstractSound var12 = var11.sound; // L: 189
								if (var12 != null && var12.position > var8) { // L: 190
									var5 |= 1 << var7; // L: 191
									var10 = var11; // L: 192
									var11 = var11.after; // L: 193
								} else {
									var11.active = true; // L: 196
									int var13 = var11.vmethod6390(); // L: 197
									var4 += var13; // L: 198
									if (var12 != null) {
										var12.position += var13; // L: 199
									}

									if (var4 >= this.field267) { // L: 200
										break label109;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 201
									if (var14 != null) { // L: 202
										for (int var15 = var11.field331; var14 != null; var14 = var11.nextSubStream()) { // L: 203 204 206
											this.method802(var14, var15 * var14.vmethod1052() >> 8); // L: 205
										}
									}

									PcmStream var18 = var11.after; // L: 209
									var11.after = null; // L: 210
									if (var10 == null) { // L: 211
										this.field272[var7] = var18;
									} else {
										var10.after = var18; // L: 212
									}

									if (var18 == null) { // L: 213
										this.field277[var7] = var10;
									}

									var11 = var18; // L: 214
								}
							}
						}
					}

					var7 += 4; // L: 178
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 218
				PcmStream var16 = this.field272[var6]; // L: 219
				PcmStream[] var17 = this.field272; // L: 220
				this.field277[var6] = null; // L: 222

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 223 224 227
					var10 = var16.after; // L: 225
					var16.after = null; // L: 226
				}
			}
		}

		if (this.field279 < 0) { // L: 231
			this.field279 = 0;
		}

		if (this.stream != null) { // L: 232
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = WorldMapData_1.method4861(); // L: 233
	} // L: 234

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lbk;II)V",
		garbageValue = "-1031606940"
	)
	final void method802(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 243
		PcmStream var4 = this.field277[var3]; // L: 244
		if (var4 == null) { // L: 245
			this.field272[var3] = var1;
		} else {
			var4.after = var1; // L: 246
		}

		this.field277[var3] = var1; // L: 247
		var1.field331 = var2; // L: 248
	} // L: 249

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhq;",
		garbageValue = "88"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else if (KitDefinition.field1918 == null) { // L: 31
			return null;
		} else {
			byte[] var2 = KitDefinition.field1918.takeFile(3, var0); // L: 32
			var1 = new KitDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 35
			return var1; // L: 36
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)V",
		garbageValue = "1"
	)
	public static void method855(AbstractArchive var0) {
		class421.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "1398931861"
	)
	static void method794(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem(); // L: 8962
		var10.id = var3; // L: 8963
		var10.quantity = var4; // L: 8964
		var10.method2794(var5); // L: 8965
		var10.field1389 = Client.field516 + var6; // L: 8966
		var10.field1390 = var7 + Client.field516; // L: 8967
		var10.field1388 = var8; // L: 8968
		var10.field1392 = var9; // L: 8969
		if (class20.field91.field1334[var0][var1][var2] == null) { // L: 8970
			class20.field91.field1334[var0][var1][var2] = new NodeDeque(); // L: 8971
		}

		class20.field91.field1334[var0][var1][var2].addFirst(var10); // L: 8973
		WorldMapManager.method4845(var0, var1, var2); // L: 8974
	} // L: 8975
}
