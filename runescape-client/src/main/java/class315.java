import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class315 {
	@ObfuscatedName("aj")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "696205402"
	)
	static final void method6088(int var0, int var1, int var2, int var3) {
		Client.field625 = 0; // L: 6015
		int var4 = (SoundCache.localPlayer.x >> 7) + class511.field5137.field1321; // L: 6016
		int var5 = (SoundCache.localPlayer.field1191 >> 7) + class511.field5137.field1323; // L: 6017
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 6018
			Client.field625 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) { // L: 6019
			Client.field625 = 1;
		}

		if (Client.field625 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 6020
			Client.field625 = 0;
		}

	} // L: 6022
}
