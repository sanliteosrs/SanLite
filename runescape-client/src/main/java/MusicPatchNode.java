import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -729100137
	)
	int field3685;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	MusicPatchNode2 field3690;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1005303001
	)
	int field3679;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -868790673
	)
	int field3675;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -517826237
	)
	int field3681;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1043375921
	)
	int field3682;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 706498263
	)
	int field3683;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2119889119
	)
	int field3684;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1724018517
	)
	int field3678;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -348267781
	)
	int field3689;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1147391719
	)
	int field3686;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1168553427
	)
	int field3694;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -156080559
	)
	int field3680;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -271653801
	)
	int field3688;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1558729485
	)
	int field3687;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1991784073
	)
	int field3692;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1146890015
	)
	int field3691;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1037298513
	)
	int field3695;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-330147749"
	)
	void method6423() {
		this.table = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3690 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2143422785"
	)
	static final void method6426(int var0, int var1, int var2, int var3, int var4) {
		class282 var5 = class511.field5137.field1316; // L: 6642
		long var6 = var5.method5440(var0, var1, var2); // L: 6643
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var27;
		if (0L != var6) { // L: 6644
			var8 = var5.method5444(var0, var1, var2, var6); // L: 6645
			var9 = var8 >> 6 & 3; // L: 6646
			var10 = var8 & 31; // L: 6647
			var11 = var3; // L: 6648
			boolean var13 = 0L != var6; // L: 6651
			if (var13) { // L: 6652
				boolean var14 = (int)(var6 >>> 16 & 1L) == 1; // L: 6655
				var13 = !var14; // L: 6657
			}

			if (var13) { // L: 6661
				var11 = var4;
			}

			int[] var20 = class196.field2057.pixels; // L: 6662
			var27 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6663
			var15 = class229.Entity_unpackID(var6); // L: 6664
			ObjectComposition var16 = class10.getObjectDefinition(var15); // L: 6665
			if (var16.mapSceneId != -1) { // L: 6666
				IndexedSprite var17 = class418.field4683[var16.mapSceneId]; // L: 6667
				if (var17 != null) { // L: 6668
					int var18 = (var16.sizeX * 4 - var17.subWidth) / 2; // L: 6669
					int var19 = (var16.sizeY * 4 - var17.subHeight * 912646400) / 2; // L: 6670
					var17.drawAt(var1 * 4 + var18 + 48, (104 - var2 - var16.sizeY) * 4 + var19 + 48); // L: 6671
				}
			} else {
				if (var10 == 0 || var10 == 2) { // L: 6675
					if (var9 == 0) { // L: 6676
						var20[var27] = var11; // L: 6677
						var20[var27 + 512] = var11; // L: 6678
						var20[var27 + 1024] = var11; // L: 6679
						var20[var27 + 1536] = var11; // L: 6680
					} else if (var9 == 1) { // L: 6682
						var20[var27] = var11; // L: 6683
						var20[var27 + 1] = var11; // L: 6684
						var20[var27 + 2] = var11; // L: 6685
						var20[var27 + 3] = var11; // L: 6686
					} else if (var9 == 2) { // L: 6688
						var20[var27 + 3] = var11; // L: 6689
						var20[var27 + 512 + 3] = var11; // L: 6690
						var20[var27 + 1024 + 3] = var11; // L: 6691
						var20[var27 + 1536 + 3] = var11; // L: 6692
					} else if (var9 == 3) { // L: 6694
						var20[var27 + 1536] = var11; // L: 6695
						var20[var27 + 1536 + 1] = var11; // L: 6696
						var20[var27 + 1536 + 2] = var11; // L: 6697
						var20[var27 + 1536 + 3] = var11; // L: 6698
					}
				}

				if (var10 == 3) { // L: 6701
					if (var9 == 0) { // L: 6702
						var20[var27] = var11;
					} else if (var9 == 1) { // L: 6703
						var20[var27 + 3] = var11;
					} else if (var9 == 2) { // L: 6704
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) { // L: 6705
						var20[var27 + 1536] = var11;
					}
				}

				if (var10 == 2) { // L: 6707
					if (var9 == 3) { // L: 6708
						var20[var27] = var11; // L: 6709
						var20[var27 + 512] = var11; // L: 6710
						var20[var27 + 1024] = var11; // L: 6711
						var20[var27 + 1536] = var11; // L: 6712
					} else if (var9 == 0) { // L: 6714
						var20[var27] = var11; // L: 6715
						var20[var27 + 1] = var11; // L: 6716
						var20[var27 + 2] = var11; // L: 6717
						var20[var27 + 3] = var11; // L: 6718
					} else if (var9 == 1) { // L: 6720
						var20[var27 + 3] = var11; // L: 6721
						var20[var27 + 512 + 3] = var11; // L: 6722
						var20[var27 + 1024 + 3] = var11; // L: 6723
						var20[var27 + 1536 + 3] = var11; // L: 6724
					} else if (var9 == 2) { // L: 6726
						var20[var27 + 1536] = var11; // L: 6727
						var20[var27 + 1536 + 1] = var11; // L: 6728
						var20[var27 + 1536 + 2] = var11; // L: 6729
						var20[var27 + 1536 + 3] = var11; // L: 6730
					}
				}
			}
		}

		var6 = var5.method5442(var0, var1, var2); // L: 6735
		if (0L != var6) { // L: 6736
			var8 = var5.method5444(var0, var1, var2, var6); // L: 6737
			var9 = var8 >> 6 & 3; // L: 6738
			var10 = var8 & 31; // L: 6739
			var11 = class229.Entity_unpackID(var6); // L: 6740
			ObjectComposition var21 = class10.getObjectDefinition(var11); // L: 6741
			if (var21.mapSceneId != -1) { // L: 6742
				IndexedSprite var29 = class418.field4683[var21.mapSceneId]; // L: 6743
				if (var29 != null) { // L: 6744
					var27 = (var21.sizeX * 4 - var29.subWidth) / 2; // L: 6745
					var15 = (var21.sizeY * 4 - var29.subHeight * 912646400) / 2; // L: 6746
					var29.drawAt(var1 * 4 + var27 + 48, (104 - var2 - var21.sizeY) * 4 + var15 + 48); // L: 6747
				}
			} else if (var10 == 9) { // L: 6750
				int var26 = 15658734; // L: 6751
				boolean var28 = 0L != var6; // L: 6754
				if (var28) { // L: 6755
					boolean var22 = (int)(var6 >>> 16 & 1L) == 1; // L: 6758
					var28 = !var22; // L: 6760
				}

				if (var28) { // L: 6764
					var26 = 15597568;
				}

				int[] var23 = class196.field2057.pixels; // L: 6765
				int var30 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6766
				if (var9 != 0 && var9 != 2) { // L: 6767
					var23[var30] = var26; // L: 6774
					var23[var30 + 1 + 512] = var26; // L: 6775
					var23[var30 + 1024 + 2] = var26; // L: 6776
					var23[var30 + 1536 + 3] = var26; // L: 6777
				} else {
					var23[var30 + 1536] = var26; // L: 6768
					var23[var30 + 1 + 1024] = var26; // L: 6769
					var23[var30 + 512 + 2] = var26; // L: 6770
					var23[var30 + 3] = var26; // L: 6771
				}
			}
		}

		var6 = var5.method5546(var0, var1, var2); // L: 6781
		if (0L != var6) { // L: 6782
			var8 = class229.Entity_unpackID(var6); // L: 6783
			ObjectComposition var24 = class10.getObjectDefinition(var8); // L: 6784
			if (var24.mapSceneId != -1) { // L: 6785
				IndexedSprite var25 = class418.field4683[var24.mapSceneId]; // L: 6786
				if (var25 != null) { // L: 6787
					var11 = (var24.sizeX * 4 - var25.subWidth) / 2; // L: 6788
					int var12 = (var24.sizeY * 4 - var25.subHeight * 912646400) / 2; // L: 6789
					var25.drawAt(var11 + var1 * 4 + 48, var12 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6790
				}
			}
		}

	} // L: 6794
}
