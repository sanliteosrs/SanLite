import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ab")
	static int[] field302;
	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field301;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field297;

	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field297 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field301 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lbl;",
		garbageValue = "-116"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method882(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field297.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1100();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field297.put(new class53(var8), var4); // L: 29
				if (var3 != null) { // L: 30
					var3[0] -= var8.samples.length;
				}

				return var8; // L: 31
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Lcv;",
		garbageValue = "2138675976"
	)
	class53 method878(int var1, int var2) {
		long var3 = this.method882(var1, var2, true); // L: 35
		class53 var5 = (class53)this.field297.get(var3); // L: 36
		if (var5 != null) { // L: 37
			return var5; // L: 38
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field301, var1, var2); // L: 40
			if (var6 == null) { // L: 41
				return new class53(); // L: 42
			} else {
				class53 var7 = new class53(var6); // L: 44
				this.field297.put(var7, var3); // L: 45
				return var7; // L: 46
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbl;",
		garbageValue = "-37192180"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 50
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 51
		} else {
			throw new RuntimeException(); // L: 52
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcv;",
		garbageValue = "17"
	)
	public class53 method880(int var1) {
		if (this.field301.getGroupCount() == 1) { // L: 56
			return this.method878(0, var1); // L: 57
		} else if (this.field301.getGroupFileCount(var1) == 1) { // L: 59
			return this.method878(var1, 0); // L: 60
		} else {
			throw new RuntimeException(); // L: 63
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbl;",
		garbageValue = "1"
	)
	public RawSound method876(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 68
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "-12"
	)
	long method882(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 72
		var4 |= var1 << 16; // L: 73
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 74 75 78
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "1671204860"
	)
	static class133 method887(int var0) {
		class133 var1 = (class133)class210.findEnumerated(FloorUnderlayDefinition.method3808(), var0); // L: 156
		if (var1 == null) {
			var1 = class133.field1565; // L: 157
		}

		return var1; // L: 158
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILho;IB)V",
		garbageValue = "-77"
	)
	static void method894(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		if (var3 != null && var3.hasSound()) { // L: 162
			int var5 = var3.sizeX; // L: 163
			int var6 = var3.sizeY; // L: 164
			if (var4 == 1 || var4 == 3) { // L: 165
				var5 = var3.sizeY; // L: 166
				var6 = var3.sizeX; // L: 167
			}

			int var7 = (var5 + var1) * 128; // L: 169
			int var8 = (var6 + var2) * 128; // L: 170
			var1 *= 128; // L: 171
			var2 *= 128; // L: 172
			int var9 = var3.ambientSoundId; // L: 173
			int var10 = var3.int7 * 16384; // L: 174
			int var11 = var3.field2198 * 16384; // L: 175
			if (var3.transforms != null) { // L: 176
				ObjectComposition var12 = var3.transform(); // L: 177
				if (var12 != null) { // L: 178
					var9 = var12.ambientSoundId; // L: 179
					var10 = var12.int7 * 16384; // L: 180
					var11 = var12.field2198 * 16384; // L: 181
				}
			}

			for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 184
				if (var0 == var13.plane && var13.x * 16384 == var1 && var2 == var13.y * 128 && var7 == var13.maxX * 16384 && var8 == var13.maxY * 16384 && var9 == var13.soundEffectId && var10 == var13.field845 && var11 == var13.field846) { // L: 185
					if (var13.stream1 != null) { // L: 186
						class238.pcmStreamMixer.removeSubStream(var13.stream1); // L: 187
						var13.stream1 = null; // L: 188
					}

					if (var13.stream2 != null) { // L: 190
						class238.pcmStreamMixer.removeSubStream(var13.stream2); // L: 191
						var13.stream2 = null; // L: 192
					}

					var13.remove(); // L: 194
					break; // L: 195
				}
			}
		}

	} // L: 199

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "7460317"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class105.clientPreferences.method2588() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 4137
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 4138
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 4139
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 4140
			Client.soundEffects[Client.soundEffectCount] = null; // L: 4141
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 4142
			Client.field668[Client.soundEffectCount] = 0; // L: 4143
			++Client.soundEffectCount; // L: 4144
		}

	} // L: 4146

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "1218672038"
	)
	static final void method895(class101 var0) {
		int var1 = var0.field1319.field1404; // L: 4437
		int[] var2 = var0.field1319.field1409; // L: 4438

		for (int var3 = 0; var3 < var1; ++var3) { // L: 4439
			Player var4 = var0.field1326[var2[var3]]; // L: 4440
			if (var4 != null) { // L: 4441
				class230.method4373(var0, var4, 1); // L: 4442
			}
		}

	} // L: 4445
}
