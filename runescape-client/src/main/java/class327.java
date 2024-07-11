import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class327 {
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 2065572541
	)
	static int field3558;

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	static final void method6128() {
		int var1;
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) { // L: 4015
			int var10002 = Client.queuedSoundEffectDelays[var0]--; // L: 4016
			if (Client.queuedSoundEffectDelays[var0] >= -10) { // L: 4017
				SoundEffect var12 = Client.soundEffects[var0]; // L: 4030
				if (var12 == null) { // L: 4031
					Object var10000 = null; // L: 4032
					var12 = SoundEffect.readSoundEffect(class424.archive4, Client.soundEffectIds[var0], 0);
					if (var12 == null) { // L: 4033
						continue;
					}

					int[] var18 = Client.queuedSoundEffectDelays; // L: 4034
					var18[var0] += var12.calculateDelay();
					Client.soundEffects[var0] = var12; // L: 4035
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) { // L: 4041
					int var13;
					if (Client.soundLocations[var0] != 0) { // L: 4043
						int var14 = (Client.soundLocations[var0] & 255) * 128; // L: 4044
						int var15 = Client.soundLocations[var0] >> 16 & 255; // L: 4045
						int var5 = Math.abs(class376.method7084(var15) - SoundCache.localPlayer.x); // L: 4046
						int var6 = Client.soundLocations[var0] >> 8 & 255; // L: 4047
						int var7 = Math.abs(class376.method7084(var6) - SoundCache.localPlayer.field1191); // L: 4048
						int var8 = Math.max(var5 + var7 - 128, 0); // L: 4049
						int var9 = Math.max(((Client.field668[var0] & 31) - 1) * 128, 0); // L: 4050
						if (var8 >= var14) { // L: 4051
							Client.queuedSoundEffectDelays[var0] = -100; // L: 4052
							continue; // L: 4053
						}

						float var10 = var9 < var14 ? Math.min(Math.max((float)(var14 - var8) / (float)(var14 - var9), 0.0F), 1.0F) : 1.0F; // L: 4055
						var13 = (int)(var10 * (float)class105.clientPreferences.method2618()); // L: 4056
					} else {
						var13 = class105.clientPreferences.method2588(); // L: 4058
					}

					if (var13 > 0) { // L: 4059
						RawSound var3 = var12.toRawSound().resample(class177.decimator); // L: 4060
						RawPcmStream var4 = RawPcmStream.createRawPcmStream(var3, 100, var13); // L: 4061
						var4.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1); // L: 4062
						class238.pcmStreamMixer.addSubStream(var4); // L: 4063
					}

					Client.queuedSoundEffectDelays[var0] = -100; // L: 4065
				}
			} else {
				--Client.soundEffectCount; // L: 4018

				for (var1 = var0; var1 < Client.soundEffectCount; ++var1) { // L: 4019
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1]; // L: 4020
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1]; // L: 4021
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1]; // L: 4022
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1]; // L: 4023
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1]; // L: 4024
					Client.field668[var1] = Client.field668[var1 + 1]; // L: 4025
				}

				--var0; // L: 4027
			}
		}

		if (Client.playingJingle && !ClanChannel.method3506()) { // L: 4068
			if (class105.clientPreferences.method2654() != 0 && class243.method4563()) { // L: 4069
				Archive var11 = class199.field2100; // L: 4070
				var1 = class105.clientPreferences.method2654(); // L: 4071
				if (!class330.field3585.isEmpty()) { // L: 4073
					ArrayList var2 = new ArrayList(); // L: 4076
					Iterator var16 = class330.field3585.iterator(); // L: 4077

					while (var16.hasNext()) {
						class342 var17 = (class342)var16.next(); // L: 4078
						var17.field3710 = false; // L: 4080
						var17.field3709 = false; // L: 4081
						var17.field3715 = false; // L: 4082
						var17.field3712 = false; // L: 4083
						var17.field3708 = var11; // L: 4084
						var17.field3706 = var1; // L: 4085
						var17.field3704 = 0.0F; // L: 4086
						var2.add(var17); // L: 4087
					}

					FontName.method9220(var2, class330.field3580, class330.field3589, class330.field3590, class330.field3586, false); // L: 4090
				}
			}

			Client.playingJingle = false; // L: 4093
		}

	} // L: 4095
}
