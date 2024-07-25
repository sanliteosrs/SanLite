import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bx")
	static AtomicBoolean field3625;
	@ObfuscatedName("bu")
	static ThreadPoolExecutor field3598;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -35329085
	)
	int field3596;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 909887491
	)
	int field3617;
	@ObfuscatedName("ak")
	int[] field3615;
	@ObfuscatedName("ap")
	int[] field3599;
	@ObfuscatedName("an")
	int[] field3600;
	@ObfuscatedName("aj")
	int[] field3601;
	@ObfuscatedName("av")
	int[] field3602;
	@ObfuscatedName("ab")
	int[] field3603;
	@ObfuscatedName("ai")
	int[] field3604;
	@ObfuscatedName("ae")
	int[] field3621;
	@ObfuscatedName("au")
	int[] field3606;
	@ObfuscatedName("aa")
	int[] field3608;
	@ObfuscatedName("as")
	int[] field3609;
	@ObfuscatedName("aw")
	int[] field3620;
	@ObfuscatedName("at")
	int[] field3611;
	@ObfuscatedName("af")
	int[] field3597;
	@ObfuscatedName("am")
	int[] field3613;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Lna;"
	)
	MusicPatchNode[][] field3614;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[[Lna;"
	)
	MusicPatchNode[][] field3595;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("be")
	boolean field3616;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2047528875
	)
	@Export("track")
	int track;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 992038787
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = 7642554548963887643L
	)
	long field3605;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -7456478925563174147L
	)
	long field3610;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	PcmPlayer field3623;
	@ObfuscatedName("bp")
	PriorityQueue field3624;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1411363415
	)
	public int field3627;

	static {
		field3625 = null; // L: 53
		field3598 = null; // L: 54
	}

	@ObfuscatedSignature(
		descriptor = "(Lbv;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3596 = 256; // L: 22
		this.field3617 = 1000000; // L: 23
		this.field3615 = new int[16]; // L: 24
		this.field3599 = new int[16]; // L: 25
		this.field3600 = new int[16]; // L: 26
		this.field3601 = new int[16]; // L: 27
		this.field3602 = new int[16]; // L: 28
		this.field3603 = new int[16]; // L: 29
		this.field3604 = new int[16]; // L: 30
		this.field3621 = new int[16]; // L: 31
		this.field3606 = new int[16]; // L: 32
		this.field3608 = new int[16]; // L: 36
		this.field3609 = new int[16]; // L: 37
		this.field3620 = new int[16]; // L: 38
		this.field3611 = new int[16]; // L: 39
		this.field3597 = new int[16]; // L: 40
		this.field3613 = new int[16]; // L: 41
		this.field3614 = new MusicPatchNode[16][128]; // L: 42
		this.field3595 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this); // L: 50
		this.field3623 = null; // L: 51
		this.field3624 = new PriorityQueue(5, new class341()); // L: 52
		this.field3627 = 0; // L: 55
		this.field3623 = var1; // L: 58
		this.musicPatches = new NodeHashTable(128); // L: 59
		this.method6207(); // L: 60
	} // L: 61

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-24"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3623) { // L: 64
			this.field3596 = var1; // L: 65
		}
	} // L: 67

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "379610889"
	)
	public int method6187() {
		return this.field3596; // L: 70
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnz;Lok;Lbh;B)Z",
		garbageValue = "126"
	)
	public boolean method6188(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3623) { // L: 74
			boolean var5 = true; // L: 75
			synchronized(this.field3624) { // L: 76
				this.field3624.clear(); // L: 77
			} // L: 78

			for (class343 var6 = (class343)var1.field3673.first(); var6 != null; var6 = (class343)var1.field3673.next()) { // L: 79
				int var14 = (int)var6.key; // L: 80
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14); // L: 81
				if (var8 == null) { // L: 82
					var8 = class33.method482(var2, var14); // L: 83
					if (var8 == null) { // L: 84
						var5 = false; // L: 85
						continue; // L: 86
					}

					this.musicPatches.put(var8, (long)var14); // L: 88
				}

				if (!var8.method6373(var3, var6.field3721)) { // L: 90
					var5 = false;
				} else if (this.field3624 != null) { // L: 91
					synchronized(this.field3624) { // L: 92
						Iterator var10 = var8.field3659.iterator(); // L: 93

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next(); // L: 94
							this.field3624.add(new class334(var6.field3719, var11)); // L: 96
						}
					}
				}
			}

			return var5; // L: 102
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "389177170"
	)
	public void method6189() {
		if (this.field3624 != null) { // L: 107
			if (field3625 != null) { // L: 110
				field3625.set(true); // L: 111
			}

			field3625 = new AtomicBoolean(false); // L: 113
			AtomicBoolean var1 = field3625; // L: 114
			if (field3598 == null) { // L: 115
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 116
				field3598 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class333(this)); // L: 117
			}

			field3598.submit(new class337(this, var1)); // L: 124
		}
	} // L: 108 140

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("removeAll")
	public void removeAll() {
		synchronized(this.field3623) { // L: 143
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) { // L: 144
				var2.clear();
			}

		}
	} // L: 146

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream; // L: 542
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null; // L: 546
	}

	@ObfuscatedName("av")
	protected int vmethod6390() {
		return 0; // L: 550
	}

	@ObfuscatedName("ab")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 554
			int var4 = this.midiFile.division * this.field3617 * -727379968 / PcmPlayer.field263; // L: 555

			do {
				long var5 = this.field3605 + (long)var3 * (long)var4; // L: 557
				if (this.field3610 - var5 >= 0L) { // L: 558
					this.field3605 = var5; // L: 559
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3610 - this.field3605) - 1L) / (long)var4); // L: 562
				this.field3605 += (long)var4 * (long)var7; // L: 563
				this.patchStream.fill(var1, var2, var7); // L: 564
				var2 += var7; // L: 565
				var3 -= var7; // L: 566
				this.method6275(); // L: 567
			} while(this.midiFile.isReady()); // L: 568
		}

		this.patchStream.fill(var1, var2, var3); // L: 571
	} // L: 572

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	public void method6190() {
		synchronized(this.field3623) { // L: 149
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) { // L: 150
				var2.remove();
			}

		}
	} // L: 152

	@ObfuscatedName("ae")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 575
			int var2 = this.midiFile.division * this.field3617 * -727379968 / PcmPlayer.field263; // L: 576

			do {
				long var3 = this.field3605 + (long)var1 * (long)var2; // L: 578
				if (this.field3610 - var3 >= 0L) { // L: 579
					this.field3605 = var3; // L: 580
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3610 - this.field3605) - 1L) / (long)var2); // L: 583
				this.field3605 += (long)var2 * (long)var5; // L: 584
				this.patchStream.skip(var5); // L: 585
				var1 -= var5; // L: 586
				this.method6275(); // L: 587
			} while(this.midiFile.isReady()); // L: 588
		}

		this.patchStream.skip(var1); // L: 591
	} // L: 592

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnz;ZI)V",
		garbageValue = "1799040723"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3623) { // L: 155
			this.clear(); // L: 156
			this.midiFile.parse(var1.midi); // L: 157
			this.field3616 = var2; // L: 158
			this.field3605 = 0L; // L: 159
			int var4 = this.midiFile.trackCount(); // L: 160

			for (int var5 = 0; var5 < var4; ++var5) { // L: 161
				this.midiFile.gotoTrack(var5); // L: 162
				this.midiFile.readTrackLength(var5); // L: 163
				this.midiFile.markTrackPosition(var5); // L: 164
			}

			this.track = this.midiFile.getPrioritizedTrack(); // L: 166
			this.trackLength = this.midiFile.trackLengths[this.track]; // L: 167
			this.field3610 = this.midiFile.method6330(this.trackLength); // L: 168
		}
	} // L: 170

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3623) { // L: 173
			this.midiFile.clear(); // L: 174
			this.method6207(); // L: 175
		}
	} // L: 177

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "100"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3623) { // L: 180
			return this.midiFile.isReady(); // L: 181
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1453820669"
	)
	public boolean method6194() {
		synchronized(this.field3623) { // L: 186
			return this.musicPatches.method9265() > 0; // L: 187
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1098221381"
	)
	public void method6195(int var1, int var2) {
		synchronized(this.field3623) { // L: 192
			this.method6217(var1, var2); // L: 193
		}
	} // L: 195

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2146758050"
	)
	void method6217(int var1, int var2) {
		this.field3601[var1] = var2; // L: 198
		this.field3603[var1] = var2 & -128; // L: 199
		this.method6277(var1, var2); // L: 200
	} // L: 201

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-1"
	)
	void method6277(int var1, int var2) {
		if (var2 != this.field3602[var1]) { // L: 204
			this.field3602[var1] = var2; // L: 205

			for (int var3 = 0; var3 < 128; ++var3) { // L: 206
				this.field3595[var1][var3] = null;
			}
		}

	} // L: 208

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-22915"
	)
	void method6198(int var1, int var2, int var3) {
		this.method6249(var1, var2, 64); // L: 211
		if ((this.field3608[var1] & 2) != 0) { // L: 212
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 213
				if (var4.field3685 == var1 && var4.field3680 < 0) { // L: 214
					this.field3614[var1][var4.field3675] = null; // L: 215
					this.field3614[var1][var2] = var4; // L: 216
					int var8 = (var4.field3678 * var4.field3684 >> 12) + var4.field3683; // L: 217
					var4.field3683 += var2 - var4.field3675 << 8; // L: 218
					var4.field3684 = var8 - var4.field3683; // L: 219
					var4.field3678 = 4096; // L: 220
					var4.field3675 = var2; // L: 221
					return; // L: 222
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3602[var1]); // L: 226
		if (var9 != null) { // L: 227
			if (var9.rawSounds[var2] != null) { // L: 228
				RawSound var5 = var9.rawSounds[var2].method1100(); // L: 229
				if (var5 != null) { // L: 230
					MusicPatchNode var6 = new MusicPatchNode(); // L: 231
					var6.field3685 = var1; // L: 232
					var6.table = var9; // L: 233
					var6.rawSound = var5; // L: 234
					var6.field3690 = var9.field3651[var2]; // L: 235
					var6.field3679 = var9.field3657[var2]; // L: 236
					var6.field3675 = var2; // L: 237
					var6.field3681 = var3 * var3 * var9.field3655[var2] * var9.field3656 + 1024 >> 11; // L: 238
					var6.field3682 = var9.field3652[var2] & 255; // L: 239
					var6.field3683 = (var2 << 8) - (var9.field3654[var2] & 32767); // L: 240
					var6.field3689 = 0; // L: 241
					var6.field3686 = 0; // L: 242
					var6.field3694 = 0; // L: 243
					var6.field3680 = -1; // L: 244
					var6.field3688 = 0; // L: 245
					if (this.field3611[var1] == 0) { // L: 246
						var6.stream = RawPcmStream.method908(var5, this.method6212(var6), this.method6221(var6), this.method6206(var6)); // L: 247
					} else {
						var6.stream = RawPcmStream.method908(var5, this.method6212(var6), 0, this.method6206(var6)); // L: 250
						this.method6205(var6, var9.field3654[var2] < 0); // L: 251
					}

					if (var9.field3654[var2] < 0) { // L: 253
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3679 >= 0) { // L: 254
						MusicPatchNode var7 = this.field3595[var1][var6.field3679]; // L: 255
						if (var7 != null && var7.field3680 < 0) { // L: 256
							this.field3614[var1][var7.field3675] = null; // L: 257
							var7.field3680 = 0; // L: 258
						}

						this.field3595[var1][var6.field3679] = var6; // L: 260
					}

					this.patchStream.queue.addFirst(var6); // L: 262
					this.field3614[var1][var2] = var6; // L: 263
				}
			}
		}
	} // L: 264

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lna;ZS)V",
		garbageValue = "-19359"
	)
	void method6205(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 267
		int var4;
		if (var2 && var1.rawSound.field251) { // L: 269
			int var5 = var3 + var3 - var1.rawSound.start; // L: 270
			var4 = (int)((long)var5 * (long)this.field3611[var1.field3685] >> 6); // L: 271
			var3 <<= 8; // L: 272
			if (var4 >= var3) { // L: 273
				var4 = var3 + var3 - 1 - var4; // L: 274
				var1.stream.method983(); // L: 275
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3611[var1.field3685] >> 6); // L: 279
		}

		var1.stream.method1007(var4); // L: 281
	} // L: 282

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-530165942"
	)
	void method6249(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3614[var1][var2]; // L: 285
		if (var4 != null) { // L: 286
			this.field3614[var1][var2] = null; // L: 287
			if ((this.field3608[var1] & 2) != 0) { // L: 288
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
					if (var5.field3685 == var4.field3685 && var5.field3680 < 0 && var4 != var5) { // L: 290
						var4.field3680 = 0; // L: 291
						break; // L: 292
					}
				}
			} else {
				var4.field3680 = 0; // L: 297
			}

		}
	} // L: 299

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-105"
	)
	void method6306(int var1, int var2, int var3) {
	} // L: 301

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "694149840"
	)
	void method6202(int var1, int var2) {
	} // L: 302

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-92"
	)
	void method6313(int var1, int var2) {
		this.field3604[var1] = var2; // L: 305
	} // L: 306

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-843635039"
	)
	void method6204(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 309
			if (var1 < 0 || var2.field3685 == var1) { // L: 310
				if (var2.stream != null) { // L: 311
					var2.stream.method921(PcmPlayer.field263 / 100); // L: 312
					if (var2.stream.method916()) { // L: 313
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6423(); // L: 314
				}

				if (var2.field3680 < 0) { // L: 316
					this.field3614[var2.field3685][var2.field3675] = null;
				}

				var2.remove(); // L: 317
			}
		}

	} // L: 320

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-113"
	)
	void method6283(int var1) {
		if (var1 >= 0) { // L: 323
			this.field3615[var1] = 12800; // L: 327
			this.field3599[var1] = 8192; // L: 328
			this.field3600[var1] = 16383; // L: 329
			this.field3604[var1] = 8192; // L: 330
			this.field3621[var1] = 0; // L: 331
			this.field3606[var1] = 8192; // L: 332
			this.method6252(var1); // L: 333
			this.method6209(var1); // L: 334
			this.field3608[var1] = 0; // L: 335
			this.field3609[var1] = 32767; // L: 336
			this.field3620[var1] = 256; // L: 337
			this.field3611[var1] = 0; // L: 338
			this.method6211(var1, 8192); // L: 339
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 324
				this.method6283(var1);
			}

		}
	} // L: 325 340

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method6287(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 343
			if ((var1 < 0 || var2.field3685 == var1) && var2.field3680 < 0) { // L: 344 345
				this.field3614[var2.field3685][var2.field3675] = null; // L: 346
				var2.field3680 = 0; // L: 347
			}
		}

	} // L: 351

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "355111668"
	)
	void method6207() {
		this.method6204(-1); // L: 354
		this.method6283(-1); // L: 355

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 356
			this.field3602[var1] = this.field3601[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 357
			this.field3603[var1] = this.field3601[var1] & -128;
		}

	} // L: 358

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "18994"
	)
	void method6252(int var1) {
		if ((this.field3608[var1] & 2) != 0) { // L: 361
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 362
				if (var2.field3685 == var1 && this.field3614[var1][var2.field3675] == null && var2.field3680 < 0) { // L: 363 364
					var2.field3680 = 0;
				}
			}
		}

	} // L: 368

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	void method6209(int var1) {
		if ((this.field3608[var1] & 4) != 0) { // L: 371
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 372
				if (var2.field3685 == var1) { // L: 373
					var2.field3695 = 0;
				}
			}
		}

	} // L: 376

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-50"
	)
	void method6297(int var1) {
		int var2 = var1 & 240; // L: 379
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 380
			var3 = var1 & 15; // L: 381
			var4 = var1 >> 8 & 127; // L: 382
			var5 = var1 >> 16 & 127; // L: 383
			this.method6249(var3, var4, var5); // L: 384
		} else if (var2 == 144) { // L: 387
			var3 = var1 & 15; // L: 388
			var4 = var1 >> 8 & 127; // L: 389
			var5 = var1 >> 16 & 127; // L: 390
			if (var5 > 0) { // L: 391
				this.method6198(var3, var4, var5);
			} else {
				this.method6249(var3, var4, 64); // L: 392
			}

		} else if (var2 == 160) { // L: 395
			var3 = var1 & 15; // L: 396
			var4 = var1 >> 8 & 127; // L: 397
			var5 = var1 >> 16 & 127; // L: 398
			this.method6306(var3, var4, var5); // L: 399
		} else if (var2 == 176) { // L: 402
			var3 = var1 & 15; // L: 403
			var4 = var1 >> 8 & 127; // L: 404
			var5 = var1 >> 16 & 127; // L: 405
			if (var4 == 0) { // L: 406
				this.field3603[var3] = (var5 << 14) + (this.field3603[var3] & -2080769);
			}

			if (var4 == 32) { // L: 407
				this.field3603[var3] = (var5 << 7) + (this.field3603[var3] & -16257);
			}

			if (var4 == 1) { // L: 408
				this.field3621[var3] = (var5 << 7) + (this.field3621[var3] & -16257);
			}

			if (var4 == 33) { // L: 409
				this.field3621[var3] = var5 + (this.field3621[var3] & -128);
			}

			if (var4 == 5) { // L: 410
				this.field3606[var3] = (var5 << 7) + (this.field3606[var3] & -16257);
			}

			if (var4 == 37) { // L: 411
				this.field3606[var3] = var5 + (this.field3606[var3] & -128);
			}

			if (var4 == 7) { // L: 412
				this.field3615[var3] = (var5 << 7) + (this.field3615[var3] & -16257);
			}

			if (var4 == 39) { // L: 413
				this.field3615[var3] = var5 + (this.field3615[var3] & -128);
			}

			if (var4 == 10) { // L: 414
				this.field3599[var3] = (var5 << 7) + (this.field3599[var3] & -16257);
			}

			if (var4 == 42) { // L: 415
				this.field3599[var3] = var5 + (this.field3599[var3] & -128);
			}

			if (var4 == 11) { // L: 416
				this.field3600[var3] = (var5 << 7) + (this.field3600[var3] & -16257);
			}

			if (var4 == 43) { // L: 417
				this.field3600[var3] = var5 + (this.field3600[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 418
				if (var5 >= 64) { // L: 419
					var10000 = this.field3608;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3608; // L: 420
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 422
				if (var5 >= 64) { // L: 423
					var10000 = this.field3608;
					var10000[var3] |= 2;
				} else {
					this.method6252(var3); // L: 425
					var10000 = this.field3608; // L: 426
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 429
				this.field3609[var3] = (var5 << 7) + (this.field3609[var3] & 127);
			}

			if (var4 == 98) { // L: 430
				this.field3609[var3] = (this.field3609[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 431
				this.field3609[var3] = (var5 << 7) + (this.field3609[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 432
				this.field3609[var3] = (this.field3609[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 433
				this.method6204(var3);
			}

			if (var4 == 121) { // L: 434
				this.method6283(var3);
			}

			if (var4 == 123) { // L: 435
				this.method6287(var3);
			}

			int var6;
			if (var4 == 6) { // L: 436
				var6 = this.field3609[var3]; // L: 437
				if (var6 == 16384) { // L: 438
					this.field3620[var3] = (var5 << 7) + (this.field3620[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 440
				var6 = this.field3609[var3]; // L: 441
				if (var6 == 16384) { // L: 442
					this.field3620[var3] = var5 + (this.field3620[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 444
				this.field3611[var3] = (var5 << 7) + (this.field3611[var3] & -16257);
			}

			if (var4 == 48) { // L: 445
				this.field3611[var3] = var5 + (this.field3611[var3] & -128);
			}

			if (var4 == 81) { // L: 446
				if (var5 >= 64) { // L: 447
					var10000 = this.field3608;
					var10000[var3] |= 4;
				} else {
					this.method6209(var3); // L: 449
					var10000 = this.field3608; // L: 450
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6211(var3, (var5 << 7) + (this.field3597[var3] & -16257)); // L: 453
			}

			if (var4 == 49) { // L: 454
				this.method6211(var3, var5 + (this.field3597[var3] & -128));
			}

		} else if (var2 == 192) { // L: 457
			var3 = var1 & 15; // L: 458
			var4 = var1 >> 8 & 127; // L: 459
			this.method6277(var3, var4 + this.field3603[var3]); // L: 460
		} else if (var2 == 208) { // L: 463
			var3 = var1 & 15; // L: 464
			var4 = var1 >> 8 & 127; // L: 465
			this.method6202(var3, var4); // L: 466
		} else if (var2 == 224) { // L: 469
			var3 = var1 & 15; // L: 470
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 471
			this.method6313(var3, var4); // L: 472
		} else {
			var2 = var1 & 255; // L: 475
			if (var2 == 255) { // L: 476
				this.method6207(); // L: 477
			}
		}
	} // L: 385 393 400 455 461 467 473 478 480

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1042536639"
	)
	void method6211(int var1, int var2) {
		this.field3597[var1] = var2; // L: 483
		this.field3613[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 484
	} // L: 485

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)I",
		garbageValue = "-315105632"
	)
	int method6212(MusicPatchNode var1) {
		int var2 = (var1.field3678 * var1.field3684 >> 12) + var1.field3683; // L: 488
		var2 += (this.field3604[var1.field3685] - 8192) * this.field3620[var1.field3685] >> 12; // L: 489
		MusicPatchNode2 var3 = var1.field3690; // L: 490
		int var4;
		if (var3.field3573 > 0 && (var3.field3567 > 0 || this.field3621[var1.field3685] > 0)) { // L: 491
			var4 = var3.field3567 << 2; // L: 492
			int var5 = var3.field3569 << 1; // L: 493
			if (var1.field3687 < var5) { // L: 494
				var4 = var4 * var1.field3687 / var5;
			}

			var4 += this.field3621[var1.field3685] >> 7; // L: 495
			double var6 = Math.sin((double)(var1.field3692 & 511) * 0.01227184630308513D); // L: 496
			var2 += (int)(var6 * (double)var4); // L: 497
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field263 + 0.5D); // L: 499
		return var4 < 1 ? 1 : var4; // L: 500
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)I",
		garbageValue = "-1878764550"
	)
	int method6221(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3690; // L: 504
		int var3 = this.field3615[var1.field3685] * this.field3600[var1.field3685] + 4096 >> 13; // L: 505
		var3 = var3 * var3 + 16384 >> 15; // L: 506
		var3 = var3 * var1.field3681 + 16384 >> 15; // L: 507
		var3 = var3 * this.field3596 + 128 >> 8; // L: 508
		if (var2.field3568 > 0) { // L: 509
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3568 * 1.953125E-5D * (double)var1.field3689) + 0.5D); // L: 510
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3578 != null) { // L: 512
			var4 = var1.field3686; // L: 513
			var5 = var2.field3578[var1.field3694 * 4 + 1]; // L: 514
			if (var1.field3694 * 4 < var2.field3578.length - 2) { // L: 515
				var6 = (var2.field3578[var1.field3694 * 4] & 255) << 8; // L: 516
				var7 = (var2.field3578[var1.field3694 * 4 + 2] & 255) << 8; // L: 517
				var5 += (var4 - var6) * (var2.field3578[var1.field3694 * 4 + 3] - var5) / (var7 - var6); // L: 518
			}

			var3 = var5 * var3 + 32 >> 6; // L: 520
		}

		if (var1.field3680 > 0 && var2.field3574 != null) { // L: 522
			var4 = var1.field3680; // L: 523
			var5 = var2.field3574[var1.field3688 * 4 + 1]; // L: 524
			if (var1.field3688 * 4 < var2.field3574.length - 2) { // L: 525
				var6 = (var2.field3574[var1.field3688 * 4] & 255) << 8; // L: 526
				var7 = (var2.field3574[var1.field3688 * 4 + 2] & 255) << 8; // L: 527
				var5 += (var2.field3574[var1.field3688 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 528
			}

			var3 = var3 * var5 + 32 >> 6; // L: 530
		}

		return var3; // L: 532
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)I",
		garbageValue = "-435630989"
	)
	int method6206(MusicPatchNode var1) {
		int var2 = this.field3599[var1.field3685]; // L: 536
		return var2 < 8192 ? var2 * var1.field3682 + 32 >> 6 : 16384 - ((128 - var1.field3682) * (16384 - var2) + 32 >> 6); // L: 537 538
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1794319935"
	)
	void method6275() {
		int var1 = this.track; // L: 595
		int var2 = this.trackLength; // L: 596

		long var3;
		for (var3 = this.field3610; var2 == this.trackLength; var3 = this.midiFile.method6330(var2)) { // L: 597 598 620
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 599
				this.midiFile.gotoTrack(var1); // L: 600
				int var5 = this.midiFile.readMessage(var1); // L: 601
				if (var5 == 1) { // L: 602
					this.midiFile.setTrackDone(); // L: 603
					this.midiFile.markTrackPosition(var1); // L: 604
					if (this.midiFile.isDone()) { // L: 605
						if (!this.field3616 || var2 == 0) { // L: 606
							this.method6207(); // L: 610
							this.midiFile.clear(); // L: 611
							return; // L: 612
						}

						this.midiFile.reset(var3); // L: 607
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 614
					this.method6297(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 615
				this.midiFile.markTrackPosition(var1); // L: 616
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 618
			var2 = this.midiFile.trackLengths[var1]; // L: 619
		}

		this.track = var1; // L: 622
		this.trackLength = var2; // L: 623
		this.field3610 = var3; // L: 624
	} // L: 625

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lna;B)Z",
		garbageValue = "40"
	)
	boolean method6256(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 628
			if (var1.field3680 >= 0) { // L: 629
				var1.remove(); // L: 630
				if (var1.field3679 > 0 && var1 == this.field3595[var1.field3685][var1.field3679]) { // L: 631
					this.field3595[var1.field3685][var1.field3679] = null; // L: 632
				}
			}

			return true; // L: 635
		} else {
			return false; // L: 637
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lna;[IIII)Z",
		garbageValue = "-2144292768"
	)
	boolean method6278(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3691 = PcmPlayer.field263 / 100; // L: 641
		if (var1.field3680 < 0 || var1.stream != null && !var1.stream.method924()) { // L: 642
			int var5 = var1.field3678; // L: 650
			if (var5 > 0) { // L: 651
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3606[var1.field3685] * 4.921259842519685E-4D) + 0.5D); // L: 652
				if (var5 < 0) { // L: 653
					var5 = 0;
				}

				var1.field3678 = var5; // L: 654
			}

			var1.stream.method922(this.method6212(var1)); // L: 656
			MusicPatchNode2 var6 = var1.field3690; // L: 657
			boolean var7 = false; // L: 658
			++var1.field3687; // L: 659
			var1.field3692 += var6.field3573; // L: 660
			double var8 = 5.086263020833333E-6D * (double)((var1.field3675 - 60 << 8) + (var1.field3678 * var1.field3684 >> 12)); // L: 661
			if (var6.field3568 > 0) { // L: 662
				if (var6.field3571 > 0) { // L: 663
					var1.field3689 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3571) + 0.5D);
				} else {
					var1.field3689 += 128; // L: 664
				}
			}

			if (var6.field3578 != null) { // L: 666
				if (var6.field3572 > 0) { // L: 667
					var1.field3686 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3572 * var8) + 0.5D);
				} else {
					var1.field3686 += 128; // L: 668
				}

				while (var1.field3694 * 4 < var6.field3578.length - 2 && var1.field3686 > (var6.field3578[var1.field3694 * 4 + 2] & 255) << 8) { // L: 669
					var1.field3694 = var1.field3694 * 4 + 2;
				}

				if (var1.field3694 * 4 == var6.field3578.length - 2 && var6.field3578[var1.field3694 * 4 + 1] == 0) { // L: 670
					var7 = true;
				}
			}

			if (var1.field3680 >= 0 && var6.field3574 != null && (this.field3608[var1.field3685] & 1) == 0 && (var1.field3679 < 0 || var1 != this.field3595[var1.field3685][var1.field3679])) { // L: 672 673
				if (var6.field3570 > 0) { // L: 674
					var1.field3680 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3570 * var8) + 0.5D);
				} else {
					var1.field3680 += 128; // L: 675
				}

				while (var1.field3688 * 4 < var6.field3574.length - 2 && var1.field3680 > (var6.field3574[var1.field3688 * 4 + 2] & 255) << 8) { // L: 676
					var1.field3688 = var1.field3688 * 4 + 2;
				}

				if (var1.field3688 * 4 == var6.field3574.length - 2) { // L: 677
					var7 = true;
				}
			}

			if (var7) { // L: 680
				var1.stream.method921(var1.field3691); // L: 681
				if (var2 != null) { // L: 682
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 683
				}

				if (var1.stream.method916()) { // L: 684
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6423(); // L: 685
				if (var1.field3680 >= 0) { // L: 686
					var1.remove(); // L: 687
					if (var1.field3679 > 0 && var1 == this.field3595[var1.field3685][var1.field3679]) { // L: 688
						this.field3595[var1.field3685][var1.field3679] = null; // L: 689
					}
				}

				return true; // L: 692
			} else {
				var1.stream.method920(var1.field3691, this.method6221(var1), this.method6206(var1)); // L: 694
				return false; // L: 695
			}
		} else {
			var1.method6423(); // L: 643
			var1.remove(); // L: 644
			if (var1.field3679 > 0 && var1 == this.field3595[var1.field3685][var1.field3679]) { // L: 645
				this.field3595[var1.field3685][var1.field3679] = null; // L: 646
			}

			return true; // L: 648
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-556387055"
	)
	static final void method6317() {
		for (int var0 = 0; var0 < class511.field5137.field1319.field1404; ++var0) { // L: 13225
			Player var1 = class511.field5137.field1326[class511.field5137.field1319.field1409[var0]]; // L: 13226
			var1.method2406(); // L: 13227
		}

		Iterator var2 = Messages.Messages_hashTable.iterator(); // L: 13230

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next(); // L: 13231
			var3.clearIsFromFriend(); // L: 13233
		}

		if (Decimator.friendsChatManager != null) { // L: 13237
			Decimator.friendsChatManager.method8485(); // L: 13238
		}

	} // L: 13240
}
