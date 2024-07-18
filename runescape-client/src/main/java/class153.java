import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class153 extends class163 {
	@ObfuscatedName("ay")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -298078541
	)
	int field1728;
	@ObfuscatedName("ad")
	byte field1727;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -8381223
	)
	int field1730;
	@ObfuscatedName("ak")
	String field1729;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class153(class164 var1) {
		this.this$0 = var1;
		this.field1728 = -1; // L: 103
	} // L: 108

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	void vmethod3524(Buffer var1) {
		this.field1728 = var1.readUnsignedShort(); // L: 111
		this.field1727 = var1.readByte(); // L: 112
		this.field1730 = var1.readUnsignedShort(); // L: 113
		var1.readLong(); // L: 114
		this.field1729 = var1.readStringCp1252NullTerminated(); // L: 115
	} // L: 116

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	void vmethod3523(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1728); // L: 119
		var2.rank = this.field1727; // L: 120
		var2.world = this.field1730; // L: 121
		var2.username = new Username(this.field1729); // L: 122
	} // L: 123

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-622322140"
	)
	public static void method3305() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 50
			synchronized(MouseHandler.MouseHandler_instance) { // L: 51
				MouseHandler.MouseHandler_instance = null; // L: 52
			} // L: 53
		}

	} // L: 55

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lmd;S)V",
		garbageValue = "-8990"
	)
	static final void method3312(class320 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8640
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var10;
		int var19;
		int var20;
		if (class320.field3379 == var0) { // L: 8641
			var2 = var1.method9590(); // L: 8642
			var3 = var1.method9592() & 31; // L: 8643
			var4 = var1.method9592(); // L: 8644
			var5 = var1.method9590(); // L: 8645
			var6 = (var5 >> 4 & 7) + class145.field1682; // L: 8646
			var7 = (var5 & 7) + class103.field1350; // L: 8647
			var20 = var1.method9590(); // L: 8648
			var19 = var1.method9599(); // L: 8649
			if (var6 >= 0 && var7 >= 0 && var6 < class20.field91.field1332 && var7 < class20.field91.field1320) { // L: 8650
				var10 = var3 + 1; // L: 8651
				if (SoundCache.localPlayer.field1204[0] >= var6 - var10 && SoundCache.localPlayer.field1204[0] <= var10 + var6 && SoundCache.localPlayer.field1246[0] >= var7 - var10 && SoundCache.localPlayer.field1246[0] <= var10 + var7 && class105.clientPreferences.method2618() != 0 && var2 > 0 && Client.soundEffectCount < 50) { // L: 8652 8653
					Client.soundEffectIds[Client.soundEffectCount] = var19; // L: 8654
					Client.soundEffects[Client.soundEffectCount] = null; // L: 8655
					Client.soundLocations[Client.soundEffectCount] = var3 + (var7 << 8) + (var6 << 16); // L: 8656
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var2; // L: 8657
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var4; // L: 8658
					Client.field668[Client.soundEffectCount] = var20; // L: 8659
					++Client.soundEffectCount; // L: 8660
				}
			}

		} else {
			if (class320.field3382 == var0) { // L: 8666
				var2 = var1.method9591(); // L: 8667
				var3 = var1.method9591(); // L: 8668
				var4 = (var3 >> 4 & 7) + class145.field1682; // L: 8669
				var5 = (var3 & 7) + class103.field1350; // L: 8670
				var6 = var1.readUnsignedShort(); // L: 8671
				var7 = class20.field91.field1318; // L: 8672
				if (var4 >= 0 && var5 >= 0 && var4 < class20.field91.field1332 && var5 < class20.field91.field1320) { // L: 8673
					NodeDeque var8 = class20.field91.field1334[var7][var4][var5]; // L: 8674
					if (var8 != null) { // L: 8675
						for (TileItem var30 = (TileItem)var8.last(); var30 != null; var30 = (TileItem)var8.previous()) { // L: 8676 8677 8682
							if ((var6 & 32767) == var30.id) { // L: 8678
								var30.method2794(var2); // L: 8679
								break;
							}
						}
					}

					if (var4 >= 0 && var5 >= 0 && var4 < class20.field91.field1332 && var5 < class20.field91.field1320) { // L: 8685
						var19 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8686
						FaceNormal.method5686(var19, var4, var5, var6, var2); // L: 8687
					}

					return; // L: 8689
				}
			}

			if (class320.field3378 == var0) { // L: 8692
				var2 = var1.readUnsignedByte(); // L: 8693
				var3 = (var2 >> 4 & 7) + class145.field1682; // L: 8694
				var4 = (var2 & 7) + class103.field1350; // L: 8695
				var5 = var1.method9591(); // L: 8696
				var6 = var5 >> 2; // L: 8697
				var7 = var5 & 3; // L: 8698
				var20 = Client.field579[var6]; // L: 8699
				if (var3 >= 0 && var4 >= 0 && var3 < class20.field91.field1332 && var4 < class20.field91.field1320) { // L: 8700
					var19 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8701
					KeyHandler.method433(class20.field91, var19, var3, var4, var20, -1, var6, var7, 31, 0, -1); // L: 8702
				}

			} else if (class320.field3385 == var0) { // L: 8706
				var2 = var1.method9590(); // L: 8707
				var3 = (var2 >> 4 & 7) + class145.field1682; // L: 8708
				var4 = (var2 & 7) + class103.field1350; // L: 8709
				var5 = var1.method9591(); // L: 8710
				var6 = var1.method9600(); // L: 8711
				var7 = var1.method9599(); // L: 8712
				if (var3 >= 0 && var4 >= 0 && var3 < class20.field91.field1332 && var4 < class20.field91.field1320) { // L: 8713
					var3 = class376.method7084(var3); // L: 8714
					var4 = class376.method7084(var4); // L: 8715
					var20 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8716
					GraphicsObject var9 = new GraphicsObject(var7, var20, var3, var4, class169.method3519(class20.field91, var3, var4, var20) - var5, var6, Client.cycle); // L: 8717
					class20.field91.field1337.addFirst(var9); // L: 8718
				}

			} else if (class320.field3383 == var0) { // L: 8722
				var2 = var1.method9614(); // L: 8723
				var3 = var1.readUnsignedShort(); // L: 8724
				var4 = var1.readInt(); // L: 8725
				var5 = var1.method9591(); // L: 8726
				var6 = (var5 >> 4 & 7) + class145.field1682; // L: 8727
				var7 = (var5 & 7) + class103.field1350; // L: 8728
				if (var6 >= 0 && var7 >= 0 && var6 < class20.field91.field1332 && var7 < class20.field91.field1320) { // L: 8729
					var20 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8730
					class30.method446(var20, var6, var7, var3, var4, var2); // L: 8731
				}

			} else {
				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				if (class320.field3387 == var0) { // L: 8735
					byte var25 = var1.readByte(); // L: 8736
					var3 = var1.method9599(); // L: 8737
					byte var27 = var1.method9594(); // L: 8738
					var5 = var1.method9562(); // L: 8739
					var6 = var1.readUnsignedByte(); // L: 8740
					var7 = var1.method9592(); // L: 8741
					var20 = (var7 >> 4 & 7) + class145.field1682; // L: 8742
					var19 = (var7 & 7) + class103.field1350; // L: 8743
					var10 = var1.readUnsignedByte() * 4; // L: 8744
					var11 = var1.method9712(); // L: 8745
					var12 = var1.method9600(); // L: 8746
					var13 = var1.readUnsignedShort(); // L: 8747
					var14 = var1.method9591() * 4; // L: 8748
					var15 = var1.method9607(); // L: 8749
					var2 = var25 + var20; // L: 8750
					var4 = var27 + var19; // L: 8751
					if (var20 >= 0 && var19 >= 0 && var20 < class20.field91.field1332 && var19 < class20.field91.field1320 && var2 >= 0 && var4 >= 0 && var2 < class20.field91.field1332 && var4 < class20.field91.field1320 && var11 != 65535) { // L: 8752
						var16 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8753
						class226.method4318(var16, var20, var19, var2, var4, var5, var11, var10, var14, var12, var3, var6, var13, var15); // L: 8754
					}

				} else if (class320.field3381 == var0) { // L: 8758
					var2 = var1.method9591(); // L: 8759
					var3 = var2 >> 2; // L: 8760
					var4 = var2 & 3; // L: 8761
					var5 = Client.field579[var3]; // L: 8762
					var6 = var1.method9592(); // L: 8763
					var7 = var1.method9592(); // L: 8764
					var20 = (var7 >> 4 & 7) + class145.field1682; // L: 8765
					var19 = (var7 & 7) + class103.field1350; // L: 8766
					var10 = var1.method9600(); // L: 8767
					if (var20 >= 0 && var19 >= 0 && var20 < class20.field91.field1332 && var19 < class20.field91.field1320) { // L: 8768
						var11 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8769
						KeyHandler.method433(class20.field91, var11, var20, var19, var5, var10, var3, var4, var6, 0, -1); // L: 8770
					}

				} else if (class320.field3388 == var0) { // L: 8774
					var2 = var1.method9591(); // L: 8775
					var3 = (var2 >> 4 & 7) + class145.field1682; // L: 8776
					var4 = (var2 & 7) + class103.field1350; // L: 8777
					var5 = var1.method9586(); // L: 8778
					var6 = var1.method9712(); // L: 8779
					var7 = class20.field91.field1318; // L: 8780
					if (0 <= var3 && var3 < 104 && 0 <= var4 && var4 < 104) { // L: 8781
						var20 = Client.field580 == -1 ? var7 : Client.field580; // L: 8782
						class279.method5357(var20, var3, var4, var6, var5); // L: 8783
					}

				} else {
					if (class320.field3386 == var0) { // L: 8787
						var2 = var1.readUnsignedShort(); // L: 8788
						byte var23 = var1.method9595(); // L: 8789
						var4 = var1.readUnsignedShort(); // L: 8790
						byte var26 = var1.method9594(); // L: 8791
						byte var28 = var1.method9749(); // L: 8792
						byte var29 = var1.method9594(); // L: 8793
						var20 = var1.method9592(); // L: 8794
						var19 = (var20 >> 4 & 7) + class145.field1682; // L: 8795
						var10 = (var20 & 7) + class103.field1350; // L: 8796
						var11 = var1.method9592(); // L: 8797
						var12 = var11 >> 2; // L: 8798
						var13 = var11 & 3; // L: 8799
						var14 = Client.field579[var12]; // L: 8800
						var15 = var1.method9712(); // L: 8801
						var16 = var1.method9600(); // L: 8802
						Player var17;
						if (var16 == Client.field706) { // L: 8804
							var17 = SoundCache.localPlayer;
						} else {
							var17 = class20.field91.field1326[var16]; // L: 8805
						}

						if (var17 != null) { // L: 8806
							int var18 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8807
							StudioGame.method7081(var18, var19, var10, var12, var13, var14, var2, var15, var4, var26, var29, var23, var28, var17); // L: 8808
						}
					}

					if (class320.field3384 == var0) { // L: 8811
						var2 = var1.method9591(); // L: 8812
						var3 = var2 >> 2; // L: 8813
						var4 = var2 & 3; // L: 8814
						var5 = Client.field579[var3]; // L: 8815
						var6 = var1.method9591(); // L: 8816
						var7 = (var6 >> 4 & 7) + class145.field1682; // L: 8817
						var20 = (var6 & 7) + class103.field1350; // L: 8818
						var19 = var1.method9599(); // L: 8819
						if (0 <= var7 && var7 < 103 && 0 <= var20 && var20 < 103) { // L: 8820
							var10 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8821
							class96 var21 = class453.method8355(class20.field91, var10, var7, var20, var5); // L: 8822
							if (var21 != null) { // L: 8823
								ObjectComposition var22 = class10.getObjectDefinition(var21.field1175); // L: 8824
								if (var22.field2203) { // L: 8825
									var21.field1181 = var19; // L: 8826
									return; // L: 8827
								}
							}

							boolean var31 = class111.method2849(var10, var7, var20, var3, var4, var5, var19); // L: 8830
							if (var31) { // L: 8831
								return; // L: 8832
							}

							if (var21 != null) { // L: 8834
								var21.field1181 = var19; // L: 8835
							}
						}

					} else if (class320.field3380 == var0) { // L: 8840
						var2 = var1.method9599(); // L: 8841
						boolean var24 = var1.method9592() == 1; // L: 8842
						var4 = var1.method9600(); // L: 8843
						var5 = var1.method9590(); // L: 8844
						var6 = var1.method9590(); // L: 8845
						var7 = var1.readUnsignedShort(); // L: 8846
						var20 = var1.method9614(); // L: 8847
						var19 = var1.readUnsignedByte(); // L: 8848
						var10 = (var19 >> 4 & 7) + class145.field1682; // L: 8849
						var11 = (var19 & 7) + class103.field1350; // L: 8850
						if (var10 >= 0 && var11 >= 0 && var10 < class20.field91.field1332 && var11 < class20.field91.field1320) { // L: 8851
							var12 = Client.field580 == -1 ? class20.field91.field1318 : Client.field580; // L: 8852
							PcmPlayer.method794(var12, var10, var11, var4, var20, var5, var7, var2, var6, var24); // L: 8853
						}

					}
				}
			}
		}
	} // L: 8664 8704 8720 8733 8756 8772 8785 8838 8855 8857

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "40981914"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 13244

		while (var0.hasNext()) { // L: 13249
			Message var1 = (Message)var0.next(); // L: 13245
			var1.clearIsFromIgnored(); // L: 13247
		}

		if (Decimator.friendsChatManager != null) { // L: 13251
			Decimator.friendsChatManager.invalidateIgnoreds(); // L: 13252
		}

	} // L: 13254
}
