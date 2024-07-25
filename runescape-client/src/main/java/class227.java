import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public abstract class class227 {
	@ObfuscatedName("ak")
	String field2432;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	final class224 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lif;Ljava/lang/String;)V"
	)
	class227(class224 var1, String var2) {
		this.this$0 = var1; // L: 273
		this.field2432 = var2; // L: 274
	} // L: 275

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public abstract int vmethod4325();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311136091"
	)
	public int vmethod4324() {
		return -1; // L: 288
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-22"
	)
	public String vmethod4323() {
		return null; // L: 284
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-82230177"
	)
	public String method4322() {
		return this.field2432; // L: 278
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-63"
	)
	static void method4321(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 104
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 105
				int var5 = 0; // L: 106
				if (var1 > var4.maxX * 16384) { // L: 107
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 16384) { // L: 108
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 109
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 128) { // L: 110
					var5 += var4.y * 128 - var2;
				}

				var5 = Math.max(var5 - 64, 0); // L: 111
				if (var5 < var4.field845 && class105.clientPreferences.method2618() != 0 && var0 == var4.plane) { // L: 112
					float var6 = var4.field846 < var4.field845 ? Math.min(Math.max((float)(var4.field845 - var5) / (float)(var4.field845 - var4.field846), 0.0F), 1.0F) : 1.0F; // L: 123
					int var7 = (int)(var6 * (float)class105.clientPreferences.method2618()); // L: 124
					if (var4.stream1 == null) { // L: 125
						if (var4.soundEffectId >= 0) { // L: 126
							SoundEffect var8 = SoundEffect.readSoundEffect(class424.archive4, var4.soundEffectId, 0); // L: 127
							if (var8 != null) { // L: 128
								RawSound var9 = var8.toRawSound().resample(class177.decimator); // L: 129
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7); // L: 130
								var10.setNumLoops(-1); // L: 131
								class238.pcmStreamMixer.addSubStream(var10); // L: 132
								var4.stream1 = var10; // L: 133
							}
						}
					} else {
						var4.stream1.method911(var7); // L: 137
					}

					if (var4.stream2 == null) { // L: 138
						if (var4.soundEffectIds != null && (var4.field840 -= var3) <= 0) { // L: 139
							int var12 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 140
							SoundEffect var13 = SoundEffect.readSoundEffect(class424.archive4, var4.soundEffectIds[var12], 0); // L: 141
							if (var13 != null) { // L: 142
								RawSound var14 = var13.toRawSound().resample(class177.decimator); // L: 143
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7); // L: 144
								var11.setNumLoops(0); // L: 145
								class238.pcmStreamMixer.addSubStream(var11); // L: 146
								var4.stream2 = var11; // L: 147
								var4.field840 = var4.field849 + (int)(Math.random() * (double)(var4.field850 - var4.field849)); // L: 148
							}
						}
					} else {
						var4.stream2.method911(var7); // L: 153
						if (!var4.stream2.hasNext()) { // L: 154
							var4.stream2 = null; // L: 155
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 113
						class238.pcmStreamMixer.removeSubStream(var4.stream1); // L: 114
						var4.stream1 = null; // L: 115
					}

					if (var4.stream2 != null) { // L: 117
						class238.pcmStreamMixer.removeSubStream(var4.stream2); // L: 118
						var4.stream2 = null; // L: 119
					}
				}
			}
		}

	} // L: 159
}
