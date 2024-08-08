import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public abstract class class290 {
	class290() {
	} // L: 4

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lkt;IIIIJ)V"
	)
	abstract void vmethod5737(Renderable var1, int var2, int var3, int var4, int var5, long var6);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llt;IIII)V",
		garbageValue = "1938115394"
	)
	abstract void vmethod5725(class282 var1, SceneTilePaint var2, int var3, int var4, int var5);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llw;IIB)V",
		garbageValue = "112"
	)
	abstract void vmethod5739(class282 var1, SceneTileModel var2, int var3, int var4);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llt;IIIIIIIIIIIIIIB)V",
		garbageValue = "18"
	)
	void method5727(class282 var1, SceneTilePaint var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		int var17 = Rasterizer3D.method5251() + var5 * Rasterizer3D.method5257() / var13; // L: 10
		int var18 = Rasterizer3D.method5246() + var9 * Rasterizer3D.method5257() / var13; // L: 11
		int var19 = Rasterizer3D.method5251() + var6 * Rasterizer3D.method5257() / var14; // L: 12
		int var20 = Rasterizer3D.method5246() + var10 * Rasterizer3D.method5257() / var14; // L: 13
		int var21 = Rasterizer3D.method5251() + var7 * Rasterizer3D.method5257() / var15; // L: 14
		int var22 = Rasterizer3D.method5246() + var11 * Rasterizer3D.method5257() / var15; // L: 15
		int var23 = Rasterizer3D.method5251() + var8 * Rasterizer3D.method5257() / var16; // L: 16
		int var24 = Rasterizer3D.method5246() + var12 * Rasterizer3D.method5257() / var16; // L: 17
		float var25 = class386.method7177(var13); // L: 18
		float var26 = class386.method7177(var14); // L: 19
		float var27 = class386.method7177(var15); // L: 20
		float var28 = class386.method7177(var16);
		Rasterizer3D.field2876.field3186 = 0;
		int var29;
		int var30;
		if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0) {
			Rasterizer3D.field2876.field3192 = false;
			var29 = Rasterizer3D.method5258(); // L: 25
			if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) { // L: 26
				Rasterizer3D.field2876.field3192 = true;
			}

			if (var1.field2948 && class282.containsBounds(var1.field2950, var1.field2986, var22, var24, var20, var21, var23, var19)) {
				var1.field2934 = var3;
				var1.field2967 = var4;
			}

			if (var2.texture == -1) {
				if (var2.neColor != 12345678) { // L: 32
					Rasterizer3D.method5265(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor);
				}
			} else if (!class282.Scene_isLowDetail) { // L: 34
				if (var2.isFlat) { // L: 35
					Rasterizer3D.method5268(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.texture);
				} else {
					Rasterizer3D.method5268(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.texture); // L: 36
				}
			} else {
				var30 = Rasterizer3D.field2876.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture); // L: 39
				Rasterizer3D.method5265(var22, var24, var20, var21, var23, var19, var27, var28, var26, class282.method5643(var30, var2.neColor), class282.method5643(var30, var2.nwColor), class282.method5643(var30, var2.seColor)); // L: 40
			}
		}

		if ((var24 - var20) * (var17 - var19) - (var23 - var19) * (var18 - var20) > 0) { // L: 43
			Rasterizer3D.field2876.field3192 = false; // L: 44
			var29 = Rasterizer3D.method5258(); // L: 45
			if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var29 || var19 > var29 || var23 > var29) { // L: 46
				Rasterizer3D.field2876.field3192 = true;
			}

			if (var1.field2948 && class282.containsBounds(var1.field2950, var1.field2986, var18, var20, var24, var17, var19, var23)) { // L: 47
				var1.field2934 = var3; // L: 48
				var1.field2967 = var4; // L: 49
			}

			if (var2.texture == -1) { // L: 51
				if (var2.swColor != 12345678) { // L: 52
					Rasterizer3D.method5265(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor);
				}
			} else if (!class282.Scene_isLowDetail) { // L: 54
				Rasterizer3D.method5268(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.texture); // L: 55
			} else {
				var30 = Rasterizer3D.field2876.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture); // L: 58
				Rasterizer3D.method5265(var18, var20, var24, var17, var19, var23, var25, var26, var28, class282.method5643(var30, var2.swColor), class282.method5643(var30, var2.seColor), class282.method5643(var30, var2.nwColor)); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llw;III)V",
		garbageValue = "-632574121"
	)
	void method5738(class282 var1, SceneTileModel var2, int var3, int var4) {
		Rasterizer3D.field2876.field3186 = 0; // L: 65
		int var5 = var2.faceX.length; // L: 66

		for (int var6 = 0; var6 < var5; ++var6) { // L: 67
			int var7 = var2.faceX[var6]; // L: 68
			int var8 = var2.faceY[var6]; // L: 69
			int var9 = var2.faceZ[var6]; // L: 70
			int var10 = SceneTileModel.field3065[var7]; // L: 71
			int var11 = SceneTileModel.field3065[var8]; // L: 72
			int var12 = SceneTileModel.field3065[var9]; // L: 73
			int var13 = SceneTileModel.field3073[var7]; // L: 74
			int var14 = SceneTileModel.field3073[var8]; // L: 75
			int var15 = SceneTileModel.field3073[var9]; // L: 76
			float var16 = SceneTileModel.field3072[var7]; // L: 77
			float var17 = SceneTileModel.field3072[var8]; // L: 78
			float var18 = SceneTileModel.field3072[var9]; // L: 79
			if ((var10 - var11) * (var15 - var14) - (var13 - var14) * (var12 - var11) > 0) { // L: 80
				Rasterizer3D.field2876.field3192 = false; // L: 81
				int var19 = Rasterizer3D.method5258(); // L: 82
				if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) { // L: 83
					Rasterizer3D.field2876.field3192 = true;
				}

				if (var1.field2948 && class282.containsBounds(var1.field2950, var1.field2986, var13, var14, var15, var10, var11, var12)) { // L: 84
					var1.field2934 = var3; // L: 85
					var1.field2967 = var4; // L: 86
				}

				if (var2.triangleTextureId != null && var2.triangleTextureId[var6] != -1) { // L: 88
					if (!class282.Scene_isLowDetail) { // L: 92
						if (var2.field3066) { // L: 93
							Rasterizer3D.method5268(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.field3063[0], SceneTileModel.field3063[1], SceneTileModel.field3063[3], SceneTileModel.field3075[0], SceneTileModel.field3075[1], SceneTileModel.field3075[3], SceneTileModel.field3076[0], SceneTileModel.field3076[1], SceneTileModel.field3076[3], var2.triangleTextureId[var6]);
						} else {
							Rasterizer3D.method5268(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.field3063[var7], SceneTileModel.field3063[var8], SceneTileModel.field3063[var9], SceneTileModel.field3075[var7], SceneTileModel.field3075[var8], SceneTileModel.field3075[var9], SceneTileModel.field3076[var7], SceneTileModel.field3076[var8], SceneTileModel.field3076[var9], var2.triangleTextureId[var6]); // L: 94
						}
					} else {
						int var20 = Rasterizer3D.field2876.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.triangleTextureId[var6]); // L: 97
						Rasterizer3D.method5265(var13, var14, var15, var10, var11, var12, var16, var17, var18, class282.method5643(var20, var2.triangleColorA[var6]), class282.method5643(var20, var2.triangleColorB[var6]), class282.method5643(var20, var2.triangleColorC[var6])); // L: 98
					}
				} else if (var2.triangleColorA[var6] != 12345678) { // L: 89
					Rasterizer3D.method5265(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6]);
				}
			}
		}

	} // L: 103

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "-80"
	)
	public static byte[] method5745(Object var0, boolean var1) {
		if (var0 == null) { // L: 21
			return null;
		} else if (var0 instanceof byte[]) { // L: 22
			byte[] var3 = (byte[])((byte[])var0); // L: 23
			return var1 ? class172.method3539(var3) : var3; // L: 24
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 27
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 28
			return var2.get(); // L: 29
		} else {
			throw new IllegalArgumentException(); // L: 31
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	static void method5744(int var0, int var1, int var2, int var3) {
		Widget var4 = ModeWhere.field4649.method6513(var0, var1); // L: 10740
		if (var4 != null && var4.onTargetEnter != null) { // L: 10741
			ScriptEvent var5 = new ScriptEvent(); // L: 10742
			var5.widget = var4; // L: 10743
			var5.args = var4.onTargetEnter; // L: 10744
			Projectile.runScriptEvent(var5); // L: 10745
		}

		Client.field587 = var3; // L: 10747
		Client.isSpellSelected = true; // L: 10748
		Message.field457 = var0; // L: 10749
		Client.field801 = var1; // L: 10750
		class92.field1114 = var2; // L: 10751
		TriBool.invalidateWidget(var4); // L: 10752
	} // L: 10753

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1618135967"
	)
	static final void method5746(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 13309
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3501()) { // L: 13310
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 13311
				if (var2.rank == -1) {
					PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.field3286, Client.packetWriter.isaacCipher); // L: 13313
					var3.packetBuffer.writeByte(3 + Actor.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 13314
					var3.packetBuffer.writeByte(var0); // L: 13315
					var3.packetBuffer.writeShort(var1); // L: 13316
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 13317
					Client.packetWriter.addNode(var3); // L: 13318
				}
			}
		}
	} // L: 13312 13319
}
