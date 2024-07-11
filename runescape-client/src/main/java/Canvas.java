import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ai")
	static int[] field105;
	@ObfuscatedName("gh")
	static String field103;
	@ObfuscatedName("aq")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ldb;IIB)V",
		garbageValue = "0"
	)
	static void method324(Player var0, int var1, int var2) {
		if (var0.field1235 == var1 && var1 != -1) { // L: 4859
			int var3 = class353.SequenceDefinition_get(var1).field2305; // L: 4860
			if (var3 == 1) { // L: 4861
				var0.field1236 = 0; // L: 4862
				var0.field1237 = 0; // L: 4863
				var0.field1238 = var2; // L: 4864
				var0.field1214 = 0; // L: 4865
			}

			if (var3 == 2) { // L: 4867
				var0.field1214 = 0; // L: 4868
			}
		} else if (var1 == -1 || var0.field1235 == -1 || class353.SequenceDefinition_get(var1).field2298 >= class353.SequenceDefinition_get(var0.field1235).field2298) { // L: 4871
			var0.field1235 = var1; // L: 4872
			var0.field1236 = 0; // L: 4873
			var0.field1237 = 0; // L: 4874
			var0.field1238 = var2; // L: 4875
			var0.field1214 = 0; // L: 4876
			var0.field1265 = var0.field1229; // L: 4877
		}

	} // L: 4879

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329273571"
	)
	static boolean method320() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5443
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1210346411"
	)
	static final void method323(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334; // L: 6075
		if (var8 < 0) { // L: 6076
			var8 = 0;
		} else if (var8 > 100) { // L: 6077
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 6078
		int var7 = var5 * var9 / 256; // L: 6079
		var8 = 2048 - var3 & 2047; // L: 6082
		var9 = 2048 - var4 & 2047; // L: 6083
		int var10 = 0; // L: 6084
		int var11 = 0; // L: 6085
		int var12 = var7; // L: 6086
		int var13;
		int var14;
		int var15;
		if (var8 != 0) { // L: 6087
			var13 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 6088
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 6089
			var15 = var14 * var11 - var7 * var13 >> 16; // L: 6090
			var12 = var14 * var7 + var13 * var11 >> 16; // L: 6091
			var11 = var15; // L: 6092
		}

		if (var9 != 0) { // L: 6094
			var13 = Rasterizer3D.Rasterizer3D_sine[var9]; // L: 6095
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9]; // L: 6096
			var15 = var13 * var12 + var14 * var10 >> 16; // L: 6097
			var12 = var12 * var14 - var10 * var13 >> 16; // L: 6098
			var10 = var15; // L: 6099
		}

		if (Client.isCameraLocked) { // L: 6101
			WorldMapSectionType.field2666 = var0 - var10; // L: 6102
			ObjectSound.field853 = var1 - var11; // L: 6103
			class137.field1630 = var2 - var12; // L: 6104
			class328.field3565 = var3; // L: 6105
			WorldMapLabelSize.field2551 = var4; // L: 6106
		} else {
			class47.cameraX = var0 - var10; // L: 6109
			class328.cameraY = var1 - var11; // L: 6110
			class60.cameraZ = var2 - var12; // L: 6111
			Language.cameraPitch = var3; // L: 6112
			class337.cameraYaw = var4; // L: 6113
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class371.field4064 >> 7 != SoundCache.localPlayer.x >> 7 || PacketBufferNode.field3398 >> 7 != SoundCache.localPlayer.field1191 >> 7)) { // L: 6115 6116
			var13 = SoundCache.localPlayer.plane; // L: 6117
			var14 = (class371.field4064 >> 7) + class511.field5137.field1321; // L: 6118
			var15 = (PacketBufferNode.field3398 >> 7) + class511.field5137.field1323; // L: 6119
			class103.method2713(var14, var15, var13, true); // L: 6120
		}

	} // L: 6123

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2048510923"
	)
	static void method322() {
		if (Client.isSpellSelected) { // L: 10756
			Widget var0 = ModeWhere.field4649.method6513(Message.field457, Client.field801); // L: 10757
			if (var0 != null && var0.onTargetLeave != null) { // L: 10758
				ScriptEvent var1 = new ScriptEvent(); // L: 10759
				var1.widget = var0; // L: 10760
				var1.args = var0.onTargetLeave; // L: 10761
				Projectile.runScriptEvent(var1); // L: 10762
			}

			Client.field587 = -1; // L: 10764
			Client.isSpellSelected = false; // L: 10765
			TriBool.invalidateWidget(var0); // L: 10766
		}
	} // L: 10767

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lnx;II)I",
		garbageValue = "1946879633"
	)
	static final int method325(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11894
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11896
				int var3 = 0; // L: 11897
				int var4 = 0; // L: 11898
				byte var5 = 0; // L: 11899

				while (true) {
					int var6 = var2[var4++]; // L: 11901
					int var7 = 0; // L: 11902
					byte var8 = 0; // L: 11903
					if (var6 == 0) { // L: 11904
						return var3;
					}

					if (var6 == 1) { // L: 11905
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11906
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11907
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11908
						var9 = var2[var4++] << 16; // L: 11909
						var9 += var2[var4++]; // L: 11910
						var10 = ModeWhere.field4649.method6519(var9); // L: 11911
						var11 = var2[var4++]; // L: 11912
						if (var11 != -1 && (!class164.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11913
							for (var12 = 0; var12 < var10.field3962.length; ++var12) { // L: 11914
								if (var11 + 1 == var10.field3962[var12]) { // L: 11915
									var7 += var10.field3963[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11919
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11920
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11921
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11922
						var7 = SoundCache.localPlayer.field1121;
					}

					if (var6 == 9) { // L: 11923
						for (var9 = 0; var9 < 25; ++var9) { // L: 11924
							if (Skills.Skills_enabled[var9]) { // L: 11925
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11928
						var9 = var2[var4++] << 16; // L: 11929
						var9 += var2[var4++]; // L: 11930
						var10 = ModeWhere.field4649.method6519(var9); // L: 11931
						var11 = var2[var4++]; // L: 11932
						if (var11 != -1 && (!class164.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11933
							for (var12 = 0; var12 < var10.field3962.length; ++var12) { // L: 11934
								if (var11 + 1 == var10.field3962[var12]) { // L: 11935
									var7 = 999999999; // L: 11936
									break; // L: 11937
								}
							}
						}
					}

					if (var6 == 11) { // L: 11942
						var7 = Client.field677;
					}

					if (var6 == 12) { // L: 11943
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11944
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11945
						int var13 = var2[var4++]; // L: 11946
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11947
					}

					if (var6 == 14) { // L: 11949
						var9 = var2[var4++]; // L: 11950
						var7 = class162.getVarbit(var9); // L: 11951
					}

					if (var6 == 15) { // L: 11953
						var8 = 1;
					}

					if (var6 == 16) { // L: 11954
						var8 = 2;
					}

					if (var6 == 17) { // L: 11955
						var8 = 3;
					}

					if (var6 == 18) { // L: 11956
						var7 = (SoundCache.localPlayer.x >> 7) + class511.field5137.field1321;
					}

					if (var6 == 19) { // L: 11957
						var7 = (SoundCache.localPlayer.field1191 >> 7) + class511.field5137.field1323;
					}

					if (var6 == 20) { // L: 11958
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11959
						if (var5 == 0) { // L: 11960
							var3 += var7;
						}

						if (var5 == 1) { // L: 11961
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11962
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11963
							var3 *= var7;
						}

						var5 = 0; // L: 11964
					} else {
						var5 = var8; // L: 11966
					}
				}
			} catch (Exception var14) { // L: 11969
				return -1; // L: 11970
			}
		} else {
			return -2;
		}
	}
}
