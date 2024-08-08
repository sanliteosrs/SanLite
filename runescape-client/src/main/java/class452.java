import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class452 {
	@ObfuscatedName("ae")
	public static short[] field4862;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Ljava/lang/String;Ljava/lang/String;I)Lqh;",
		garbageValue = "-456035171"
	)
	public static Font method8351(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) { // L: 134
			return null;
		} else {
			int var4 = var0.getGroupId(var2); // L: 135
			int var5 = var0.getFileId(var4, var3); // L: 136
			Font var6;
			if (!class146.method3260(var0, var4, var5)) { // L: 139
				var6 = null; // L: 140
			} else {
				byte[] var8 = var1.takeFile(var4, var5); // L: 144
				Font var7;
				if (var8 == null) { // L: 146
					var7 = null; // L: 147
				} else {
					Font var9 = new Font(var8, UserComparator4.SpriteBuffer_xOffsets, class145.SpriteBuffer_yOffsets, class561.SpriteBuffer_spriteWidths, class315.SpriteBuffer_spriteHeights, class561.SpriteBuffer_spritePalette, class561.SpriteBuffer_pixels); // L: 150
					Calendar.method7029(); // L: 151
					var7 = var9; // L: 152
				}

				var6 = var7; // L: 154
			}

			return var6; // L: 156
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "33"
	)
	static long method8353() {
		return Client.field629; // L: 3124
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IIZI)V",
		garbageValue = "1086932800"
	)
	static void method8354(class205 var0, int var1, int var2, boolean var3) {
		if (var0 != null) { // L: 4116
			if (var0.field2148 == 0) { // L: 4117
				if (!var3) { // L: 4118
					return; // L: 4119
				}

				Client.soundLocations[Client.soundEffectCount] = 0; // L: 4121
			} else {
				int var4 = (var1 - 64) / 128; // L: 4124
				int var5 = (var2 - 64) / 128; // L: 4125
				Client.soundLocations[Client.soundEffectCount] = (var5 << 8) + var0.field2148 + (var4 << 16); // L: 4126
			}

			Client.soundEffectIds[Client.soundEffectCount] = var0.field2150; // L: 4128
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var0.field2147; // L: 4129
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 4130
			Client.soundEffects[Client.soundEffectCount] = null; // L: 4131
			Client.field668[Client.soundEffectCount] = var0.field2149; // L: 4132
			++Client.soundEffectCount; // L: 4133
		}
	} // L: 4134

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIB)V",
		garbageValue = "45"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 4246
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 4247
				SpriteMask var3 = var0.method6943(ModeWhere.field4649, true); // L: 4248
				if (var3 == null) { // L: 4249
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 4250
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 4251
				if (var3.contains(var4, var5)) { // L: 4252
					var4 -= var3.width / 2; // L: 4253
					var5 -= var3.height / 2; // L: 4254
					int var6 = Client.camAngleY & 2047; // L: 4255
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 4256
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 4257
					int var9 = var7 * var5 + var4 * var8 >> 11; // L: 4258
					int var10 = var8 * var5 - var7 * var4 >> 11; // L: 4259
					int var11 = StudioGame.field4084.vmethod8670() + var9 >> 7; // L: 4260
					int var12 = StudioGame.field4084.vmethod8671() - var10 >> 7; // L: 4261
					PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.field3340, Client.packetWriter.isaacCipher); // L: 4263
					var13.packetBuffer.writeByte(18); // L: 4264
					var13.packetBuffer.method9741(var12 + class511.field5137.field1323); // L: 4265
					var13.packetBuffer.writeByte(Client.field728.method4384(82) ? (Client.field728.method4384(81) ? 2 : 1) : 0); // L: 4266
					var13.packetBuffer.method9597(var11 + class511.field5137.field1321); // L: 4267
					var13.packetBuffer.writeByte(var4); // L: 4268
					var13.packetBuffer.writeByte(var5); // L: 4269
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 4270
					var13.packetBuffer.writeByte(57); // L: 4271
					var13.packetBuffer.writeByte(0); // L: 4272
					var13.packetBuffer.writeByte(0); // L: 4273
					var13.packetBuffer.writeByte(89); // L: 4274
					var13.packetBuffer.writeShort(SoundCache.localPlayer.x); // L: 4275
					var13.packetBuffer.writeShort(SoundCache.localPlayer.field1191); // L: 4276
					var13.packetBuffer.writeByte(63); // L: 4277
					Client.packetWriter.addNode(var13); // L: 4278
					Client.field752 = var11; // L: 4279
					Client.field753 = var12; // L: 4280
				}
			}

		}
	} // L: 4283
}
