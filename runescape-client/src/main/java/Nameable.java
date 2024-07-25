import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	} // L: 9

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lsk;B)I",
		garbageValue = "-93"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lvo;",
		garbageValue = "-867367932"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "694892981"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-137668868"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lvo;Lvo;I)V",
		garbageValue = "-1960527477"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) { // L: 26
			throw new NullPointerException();
		} else {
			this.username = var1; // L: 27
			this.previousUsername = var2; // L: 28
		}
	} // L: 29

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1); // L: 36
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIII)V",
		garbageValue = "-383980827"
	)
	static final void method8567(class101 var0, int var1, int var2, int var3, int var4) {
		Client.field606 = 0; // L: 5903
		boolean var5 = false; // L: 5904
		int var6 = -1; // L: 5905
		int var7 = -1; // L: 5906
		int var8 = var0.field1319.field1404; // L: 5907
		int[] var9 = var0.field1319.field1409; // L: 5908

		int var10;
		for (var10 = 0; var10 < var8 + var0.field1329; ++var10) { // L: 5909
			Object var23;
			if (var10 < var8) { // L: 5911
				var23 = var0.field1326[var9[var10]]; // L: 5912
				if (var9[var10] == Client.combatTargetPlayerIndex) { // L: 5913
					var5 = true; // L: 5914
					var6 = var10; // L: 5915
					continue;
				}

				if (var23 == SoundCache.localPlayer) { // L: 5918
					var7 = var10; // L: 5919
					continue; // L: 5920
				}
			} else {
				var23 = var0.field1315[var0.field1330[var10 - var8]]; // L: 5923
			}

			UserComparator10.method3026(var0, (Actor)var23, var10, var1, var2, var3, var4); // L: 5924
		}

		if (Client.field551 && var7 != -1) { // L: 5926
			UserComparator10.method3026(var0, SoundCache.localPlayer, var7, var1, var2, var3, var4); // L: 5927
		}

		if (var5) { // L: 5929
			UserComparator10.method3026(var0, var0.field1326[Client.combatTargetPlayerIndex], var6, var1, var2, var3, var4); // L: 5930
		}

		for (var10 = 0; var10 < Client.field606; ++var10) { // L: 5932
			int var11 = Client.field608[var10]; // L: 5933
			int var12 = Client.field609[var10]; // L: 5934
			int var13 = Client.field667[var10]; // L: 5935
			int var14 = Client.field610[var10]; // L: 5936
			boolean var15 = true; // L: 5937

			while (var15) {
				var15 = false; // L: 5939

				for (int var22 = 0; var22 < var10; ++var22) { // L: 5940
					if (var12 + 2 > Client.field609[var22] - Client.field610[var22] && var12 - var14 < Client.field609[var22] + 2 && var11 - var13 < Client.field608[var22] + Client.field667[var22] && var13 + var11 > Client.field608[var22] - Client.field667[var22] && Client.field609[var22] - Client.field610[var22] < var12) { // L: 5941 5942
						var12 = Client.field609[var22] - Client.field610[var22]; // L: 5943
						var15 = true; // L: 5944
					}
				}
			}

			Client.field618 = Client.field608[var10]; // L: 5949
			Client.field585 = Client.field609[var10] = var12; // L: 5950
			String var16 = Client.field616[var10]; // L: 5951
			if (Client.chatEffects == 0) { // L: 5952
				int var17 = 16776960; // L: 5953
				if (Client.field612[var10] < 6) { // L: 5954
					var17 = Client.field733[Client.field612[var10]];
				}

				if (Client.field612[var10] == 6) { // L: 5955
					var17 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field612[var10] == 7) { // L: 5956
					var17 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field612[var10] == 8) { // L: 5957
					var17 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var18;
				if (Client.field612[var10] == 9) { // L: 5958
					var18 = 150 - Client.field615[var10]; // L: 5959
					if (var18 < 50) { // L: 5960
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) { // L: 5961
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) { // L: 5962
						var17 = (var18 - 100) * 5 + 65280;
					}
				}

				if (Client.field612[var10] == 10) { // L: 5964
					var18 = 150 - Client.field615[var10]; // L: 5965
					if (var18 < 50) { // L: 5966
						var17 = var18 * 5 + 16711680;
					} else if (var18 < 100) { // L: 5967
						var17 = 16711935 - (var18 - 50) * 327680;
					} else if (var18 < 150) { // L: 5968
						var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
					}
				}

				if (Client.field612[var10] == 11) { // L: 5970
					var18 = 150 - Client.field615[var10]; // L: 5971
					if (var18 < 50) { // L: 5972
						var17 = 16777215 - var18 * 327685;
					} else if (var18 < 100) { // L: 5973
						var17 = (var18 - 50) * 327685 + 65280;
					} else if (var18 < 150) { // L: 5974
						var17 = 16777215 - (var18 - 100) * 327680;
					}
				}

				int var19;
				if (Client.field612[var10] == 12 && Client.field540[var10] == null) { // L: 5976 5977
					var18 = var16.length(); // L: 5978
					Client.field540[var10] = new int[var18]; // L: 5979

					for (var19 = 0; var19 < var18; ++var19) { // L: 5980
						int var20 = (int)((float)var19 / (float)var18 * 64.0F); // L: 5981
						int var21 = var20 << 10 | 896 | 64; // L: 5982
						Client.field540[var10][var19] = class498.field5064[var21]; // L: 5983
					}
				}

				if (Client.field613[var10] == 0) { // L: 5987
					ParamComposition.fontBold12.method8081(var16, Client.field618 + var1, var2 + Client.field585, var17, 0, Client.field540[var10]);
				}

				if (Client.field613[var10] == 1) { // L: 5988
					ParamComposition.fontBold12.method8094(var16, Client.field618 + var1, var2 + Client.field585, var17, 0, Client.viewportDrawCount, Client.field540[var10]);
				}

				if (Client.field613[var10] == 2) { // L: 5989
					ParamComposition.fontBold12.method8095(var16, Client.field618 + var1, var2 + Client.field585, var17, 0, Client.viewportDrawCount, Client.field540[var10]);
				}

				if (Client.field613[var10] == 3) { // L: 5990
					ParamComposition.fontBold12.method8096(var16, Client.field618 + var1, var2 + Client.field585, var17, 0, Client.viewportDrawCount, 150 - Client.field615[var10], Client.field540[var10]);
				}

				if (Client.field613[var10] == 4) { // L: 5991
					var18 = (150 - Client.field615[var10]) * (ParamComposition.fontBold12.stringWidth(var16) + 100) / 150; // L: 5992
					Rasterizer2D.Rasterizer2D_expandClip(Client.field618 + var1 - 50, var2, Client.field618 + var1 + 50, var2 + var4); // L: 5993
					ParamComposition.fontBold12.method8098(var16, Client.field618 + var1 + 50 - var18, var2 + Client.field585, var17, 0, Client.field540[var10]); // L: 5994
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 5995
				}

				if (Client.field613[var10] == 5) { // L: 5997
					var18 = 150 - Client.field615[var10]; // L: 5998
					var19 = 0; // L: 5999
					if (var18 < 25) { // L: 6000
						var19 = var18 - 25;
					} else if (var18 > 125) { // L: 6001
						var19 = var18 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.field585 - ParamComposition.fontBold12.ascent - 1, var3 + var1, var2 + Client.field585 + 5); // L: 6002
					ParamComposition.fontBold12.method8081(var16, Client.field618 + var1, var19 + var2 + Client.field585, var17, 0, Client.field540[var10]); // L: 6003
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 6004
				}
			} else {
				ParamComposition.fontBold12.drawCentered(var16, Client.field618 + var1, var2 + Client.field585, 16776960, 0); // L: 6008
			}
		}

	} // L: 6011
}
