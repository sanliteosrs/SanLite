import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("aq")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("ag")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ak")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 7
		int var0 = 2; // L: 10

		for (int var1 = 0; var1 < 32; ++var1) { // L: 11
			Varps_masks[var1] = var0 - 1; // L: 12
			var0 += var0; // L: 13
		}

		Varps_temp = new int[5000]; // L: 18
		Varps_main = new int[5000]; // L: 19
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "50"
	)
	public static boolean method6452(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 9
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldu;III)V",
		garbageValue = "2102354700"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 105
		Script var4;
		if (class186.isWorldMapEvent(var0.type)) { // L: 107
			class283.worldMapEvent = (WorldMapEvent)var3[0]; // L: 108
			WorldMapElement var6 = class165.WorldMapElement_get(class283.worldMapEvent.mapElement); // L: 109
			var4 = Clock.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 110
		} else {
			int var5 = (Integer)var3[0]; // L: 113
			var4 = class195.getScript(var5); // L: 114
		}

		if (var4 != null) { // L: 116
			PacketBufferNode.method6102(var0, var4, var1, var2); // L: 117
		}

	} // L: 119

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1341635037"
	)
	static void method6456() {
		if (Client.field535 == class94.field1157) { // L: 1598
			class424.archive4 = class221.newArchive(class385.field4516.field4518, false, true, true, false); // L: 1599
			class199.field2100 = class221.newArchive(class385.field4519.field4518, true, true, true, false); // L: 1600
			class7.field29 = class221.newArchive(class385.field4500.field4518, false, true, true, false); // L: 1601
			WorldMapSection1.field2728 = class221.newArchive(class385.field4506.field4518, false, true, true, false); // L: 1602
			ChatChannel.archive13 = class221.newArchive(class385.field4512.field4518, true, false, true, false); // L: 1603
			class239.field2524 = class221.newArchive(class385.field4509.field4518, false, true, true, false); // L: 1604
			class276.field2872 = class221.newArchive(class385.field4502.field4518, false, true, true, false); // L: 1605
			Login.method2185(20, "Connecting to update server"); // L: 1606
			UserComparator7.method3008(class94.field1151); // L: 1607
		} else {
			int var0;
			byte var39;
			if (class94.field1151 == Client.field535) { // L: 1610
				var39 = 0; // L: 1611
				var0 = var39 + class424.archive4.percentage() * 53 / 100; // L: 1612
				var0 += class199.field2100.percentage() * 5 / 100; // L: 1613
				var0 += class7.field29.percentage() * 36 / 100; // L: 1614
				var0 += WorldMapSection1.field2728.percentage() / 100; // L: 1615
				var0 += ChatChannel.archive13.percentage() / 100; // L: 1616
				var0 += class239.field2524.percentage() * 3 / 100; // L: 1617
				var0 += class276.field2872.percentage() / 100; // L: 1618
				if (var0 != 100) { // L: 1619
					if (var0 != 0) { // L: 1620
						Login.method2185(30, "Checking for updates - " + var0 + "%");
					}

				} else {
					UserComparator10.method3025(class424.archive4, "Sound FX"); // L: 1623
					UserComparator10.method3025(class199.field2100, "Music Tracks"); // L: 1624
					UserComparator10.method3025(class7.field29, "Sprites"); // L: 1625
					UserComparator10.method3025(class239.field2524, "Music Samples"); // L: 1626
					UserComparator10.method3025(class276.field2872, "Music Patches"); // L: 1627
					Login.method2185(40, "Loaded update list"); // L: 1628
					UserComparator7.method3008(class94.field1153); // L: 1629
				}
			} else {
				int var33;
				if (Client.field535 == class94.field1153) { // L: 1632
					HorizontalAlignment.method3698(22050, !Client.isLowDetail, 2); // L: 1633
					ArrayList var42 = new ArrayList(3); // L: 1634
					TaskHandler var29 = GameEngine.taskHandler; // L: 1636
					short var32 = 2048; // L: 1637
					if (PcmPlayer.field263 == 0) { // L: 1639
						throw new IllegalStateException();
					} else {
						if (var32 < 256) { // L: 1641
							var32 = 256;
						}

						PcmPlayer var30;
						try {
							PcmPlayer var34 = MenuAction.pcmPlayerProvider.player(); // L: 1643
							var34.samples = new int[256 * (SecureRandomFuture.PcmPlayer_stereo ? 2 : 1)]; // L: 1644
							var34.field270 = var32; // L: 1645
							var34.init(); // L: 1646
							var34.capacity = (var32 & -1024) + 1024; // L: 1647
							if (var34.capacity > 16384) { // L: 1648
								var34.capacity = 16384;
							}

							var34.open(var34.capacity); // L: 1649
							if (class379.field4434 > 0 && PcmPlayer.soundSystem == null) { // L: 1650
								PcmPlayer.soundSystem = new SoundSystem(); // L: 1651
								PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 1652
								PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 1653
							}

							if (PcmPlayer.soundSystem != null) { // L: 1655
								if (PcmPlayer.soundSystem.players[0] != null) { // L: 1656
									throw new IllegalArgumentException();
								}

								PcmPlayer.soundSystem.players[0] = var34; // L: 1657
							}

							var30 = var34; // L: 1659
						} catch (Throwable var27) { // L: 1662
							var30 = new PcmPlayer(); // L: 1663
						}

						Projectile.pcmPlayer1 = var30; // L: 1665
						class238.pcmStreamMixer = new PcmStreamMixer(); // L: 1666
						PcmStreamMixer var35 = new PcmStreamMixer(); // L: 1667
						var35.addSubStream(class238.pcmStreamMixer); // L: 1668

						for (var33 = 0; var33 < 3; ++var33) { // L: 1669
							MidiPcmStream var37 = new MidiPcmStream(Projectile.pcmPlayer1); // L: 1670
							var37.method6195(9, 128); // L: 1671
							var35.addSubStream(var37); // L: 1672
							var42.add(var37); // L: 1673
						}

						Projectile.pcmPlayer1.setStream(var35); // L: 1675
						ArchiveDiskActionHandler.method7122(class276.field2872, class239.field2524, class424.archive4, var42); // L: 1676
						class177.decimator = new Decimator(22050, PcmPlayer.field263); // L: 1677
						Login.method2185(60, "Prepared sound engine"); // L: 1678
						UserComparator7.method3008(class94.field1154); // L: 1679
					}
				} else if (class94.field1154 == Client.field535) { // L: 1682
					if (ReflectionCheck.field236 == null) { // L: 1683
						ReflectionCheck.field236 = new Fonts(class7.field29, ChatChannel.archive13);
					}

					var0 = FontName.method9217().length; // L: 1684
					Client.field570 = ReflectionCheck.field236.createMap(FontName.method9217()); // L: 1685
					if (Client.field570.size() < var0) { // L: 1686
						Login.method2185(80, "Loading fonts - " + Client.field570.size() * 100 / var0 + "%"); // L: 1687
					} else {
						GrandExchangeOfferOwnWorldComparator.field468 = (Font)Client.field570.get(FontName.FontName_plain11); // L: 1690
						FloorUnderlayDefinition.fontPlain12 = (Font)Client.field570.get(FontName.FontName_plain12); // L: 1691
						ParamComposition.fontBold12 = (Font)Client.field570.get(FontName.FontName_bold12); // L: 1692
						KeyHandler.field140 = Client.field656.get(); // L: 1693
						Login.method2185(80, "Loaded fonts"); // L: 1694
						UserComparator7.method3008(class94.field1160); // L: 1695
					}
				} else {
					Archive var2;
					int var3;
					int var21;
					Archive var28;
					if (class94.field1160 == Client.field535) { // L: 1698
						var28 = WorldMapSection1.field2728; // L: 1700
						var2 = class7.field29; // L: 1701
						var3 = 0; // L: 1703
						String[] var31 = Login.field955; // L: 1705

						String var36;
						for (var33 = 0; var33 < var31.length; ++var33) { // L: 1706
							var36 = var31[var33]; // L: 1707
							if (var28.tryLoadFileByNames(var36, "")) { // L: 1709
								++var3; // L: 1710
							}
						}

						var31 = Login.field940; // L: 1716

						for (var33 = 0; var33 < var31.length; ++var33) { // L: 1717
							var36 = var31[var33]; // L: 1718
							if (var2.tryLoadFileByNames(var36, "")) { // L: 1720
								++var3; // L: 1721
							}
						}

						var31 = Login.field942; // L: 1727

						for (var33 = 0; var33 < var31.length; ++var33) { // L: 1728
							var36 = var31[var33]; // L: 1729
							if (var2.getGroupId(var36) != -1 && var2.tryLoadFileByNames(var36, "")) { // L: 1731
								++var3; // L: 1732
							}
						}

						var21 = class243.method4565(class7.field29); // L: 1740
						if (var3 < var21) { // L: 1741
							Login.method2185(90, "Loading title screen - " + var3 * 100 / var21 + "%"); // L: 1742
						} else {
							Login.method2185(100, "Loaded title screen"); // L: 1745
							if (class4.field9) { // L: 1746
								ClanChannelMember.method3282(5); // L: 1747
								UserComparator7.method3008(class94.field1164); // L: 1748
							} else {
								UserComparator7.method3008(class94.field1148); // L: 1751
							}

						}
					} else if (class94.field1164 == Client.field535) { // L: 1755
						ClanChannelMember.method3282(10); // L: 1756
					} else if (class94.field1148 == Client.field535) { // L: 1759
						class68.field497 = class221.newArchive(class385.field4496.field4518, false, true, true, false); // L: 1760
						class498.field5069 = class221.newArchive(class385.field4497.field4518, false, true, true, false); // L: 1761
						ApproximateRouteStrategy.archive2 = class221.newArchive(class385.field4498.field4518, true, false, true, false); // L: 1762
						LoginScreenAnimation.field1296 = class221.newArchive(class385.field4499.field4518, false, true, true, false); // L: 1763
						class157.field1756 = class221.newArchive(class385.field4511.field4518, true, true, true, false); // L: 1764
						WorldMapSectionType.field2665 = class221.newArchive(class385.field4503.field4518, false, true, true, false); // L: 1765
						class195.field2052 = class221.newArchive(class385.field4505.field4518, false, true, true, false); // L: 1766
						class388.field4545 = class221.newArchive(class385.field4507.field4518, false, true, true, false); // L: 1767
						class476.archive12 = class221.newArchive(class385.field4508.field4518, false, true, true, false); // L: 1768
						VarpDefinition.field1881 = class221.newArchive(class385.field4504.field4518, true, true, true, false); // L: 1769
						class151.field1715 = class221.newArchive(class385.field4510.field4518, false, true, true, false); // L: 1770
						class145.field1684 = class221.newArchive(class385.field4514.field4518, false, true, true, false); // L: 1771
						PlayerComposition.field3785 = class221.newArchive(class385.field4515.field4518, false, true, true, false); // L: 1772
						AbstractWorldMapData.field2675 = class221.newArchive(class385.field4495.field4518, false, true, true, false); // L: 1773
						ObjectSound.field856 = class212.method4118(class385.field4517.field4518, false, true, true, true, true); // L: 1774
						Login.method2185(20, "Connecting to update server"); // L: 1775
						UserComparator7.method3008(class94.field1155); // L: 1776
					} else if (class94.field1155 == Client.field535) { // L: 1779
						var39 = 0; // L: 1780
						var0 = var39 + class68.field497.percentage() * 5 / 100; // L: 1781
						var0 += class498.field5069.percentage() * 2 / 100; // L: 1782
						var0 += ApproximateRouteStrategy.archive2.percentage() / 100; // L: 1783
						var0 += LoginScreenAnimation.field1296.percentage() / 100; // L: 1784
						var0 += class157.field1756.percentage() * 10 / 100; // L: 1785
						var0 += WorldMapSectionType.field2665.percentage() * 65 / 100; // L: 1786
						var0 += class195.field2052.percentage() / 100; // L: 1787
						var0 += class388.field4545.percentage() / 100; // L: 1788
						var0 += class476.archive12.percentage() * 6 / 100; // L: 1789
						var0 += class145.field1684.percentage() / 100; // L: 1790
						var0 += class151.field1715.percentage() * 2 / 100; // L: 1791
						var0 += PlayerComposition.field3785.percentage() * 2 / 100; // L: 1792
						var0 += AbstractWorldMapData.field2675.percentage() / 100; // L: 1793
						var0 += ObjectSound.field856.percentage() / 100; // L: 1794
						var0 += VarpDefinition.field1881.method7128() && VarpDefinition.field1881.isFullyLoaded() ? 1 : 0; // L: 1795
						if (var0 != 100) { // L: 1796
							if (var0 != 0) { // L: 1797
								Login.method2185(30, "Checking for updates - " + var0 + "%");
							}

						} else {
							UserComparator10.method3025(class68.field497, "Animations"); // L: 1800
							UserComparator10.method3025(class498.field5069, "Skeletons"); // L: 1801
							UserComparator10.method3025(class157.field1756, "Maps"); // L: 1802
							UserComparator10.method3025(WorldMapSectionType.field2665, "Models"); // L: 1803
							UserComparator10.method3025(class388.field4545, "Music Jingles"); // L: 1804
							UserComparator10.method3025(class145.field1684, "World Map"); // L: 1805
							UserComparator10.method3025(class151.field1715, "World Map Geography"); // L: 1806
							UserComparator10.method3025(PlayerComposition.field3785, "World Map Ground"); // L: 1807
							RouteStrategy.field2497 = new GraphicsDefaults(); // L: 1808
							RouteStrategy.field2497.decode(VarpDefinition.field1881); // L: 1809
							Login.method2185(30, "Loaded update list"); // L: 1810
							UserComparator7.method3008(class94.field1159); // L: 1811
						}
					} else if (class94.field1159 == Client.field535) { // L: 1814
						class511.field5137 = new class101(-1, 104, 104, class105.clientPreferences.method2569()); // L: 1815
						class20.field91 = class511.field5137; // L: 1816
						class196.field2057 = new SpritePixels(512, 512); // L: 1817
						Login.method2185(30, "Starting game engine..."); // L: 1818
						UserComparator7.method3008(class94.field1156); // L: 1819
					} else if (Client.field535 == class94.field1156) { // L: 1822
						if (!ApproximateRouteStrategy.archive2.isFullyLoaded()) { // L: 1823
							Login.method2185(40, "Loading config - " + ApproximateRouteStrategy.archive2.loadPercent() + "%"); // L: 1824
						} else if (!AbstractWorldMapData.field2675.isFullyLoaded()) { // L: 1827
							Login.method2185(40, "Loading config - " + (80 + class476.archive12.loadPercent() / 6) + "%"); // L: 1828
						} else {
							Archive var41 = ApproximateRouteStrategy.archive2; // L: 1831
							FloorOverlayDefinition.FloorOverlayDefinition_archive = var41; // L: 1833
							class160.method3426(ApproximateRouteStrategy.archive2); // L: 1835
							var28 = ApproximateRouteStrategy.archive2; // L: 1836
							var2 = WorldMapSectionType.field2665; // L: 1837
							KitDefinition.field1918 = var28; // L: 1839
							KitDefinition.KitDefinition_modelsArchive = var2; // L: 1840
							class333.field3646 = KitDefinition.field1918.getGroupFileCount(3); // L: 1841
							Archive var22 = ApproximateRouteStrategy.archive2; // L: 1843
							Archive var4 = WorldMapSectionType.field2665; // L: 1844
							boolean var5 = Client.isLowDetail; // L: 1845
							ObjectComposition.ObjectDefinition_archive = var22; // L: 1847
							ObjectComposition.ObjectDefinition_modelsArchive = var4; // L: 1848
							ObjectComposition.ObjectDefinition_isLowDetail = var5; // L: 1849
							Archive var6 = ApproximateRouteStrategy.archive2; // L: 1851
							Archive var38 = WorldMapSectionType.field2665; // L: 1852
							class416.NpcDefinition_archive = var6; // L: 1854
							NPCComposition.field1985 = var38; // L: 1855
							Archive var8 = ApproximateRouteStrategy.archive2; // L: 1857
							StructComposition.StructDefinition_archive = var8; // L: 1859
							BuddyRankComparator.method3031(ApproximateRouteStrategy.archive2, WorldMapSectionType.field2665, Client.isMembersWorld, GrandExchangeOfferOwnWorldComparator.field468); // L: 1861
							ArchiveLoader.method2357(ApproximateRouteStrategy.archive2, class68.field497, class498.field5069); // L: 1862
							Language.method7424(ApproximateRouteStrategy.archive2, WorldMapSectionType.field2665); // L: 1863
							Archive var9 = ApproximateRouteStrategy.archive2; // L: 1864
							VarbitComposition.VarbitDefinition_archive = var9; // L: 1866
							Archive var10 = ApproximateRouteStrategy.archive2; // L: 1868
							VarpDefinition.VarpDefinition_archive = var10; // L: 1870
							VarpDefinition.field1874 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1871
							ModeWhere.field4649 = new class349(LoginScreenAnimation.field1296, WorldMapSectionType.field2665, class7.field29, ChatChannel.archive13, ObjectSound.field856); // L: 1873
							class141.method3201(ApproximateRouteStrategy.archive2); // L: 1874
							Archive var11 = ApproximateRouteStrategy.archive2; // L: 1875
							EnumComposition.EnumDefinition_archive = var11; // L: 1877
							Archive var12 = ApproximateRouteStrategy.archive2; // L: 1879
							class333.VarcInt_archive = var12; // L: 1881
							class74.method2158(ApproximateRouteStrategy.archive2); // L: 1883
							PcmPlayer.method855(ApproximateRouteStrategy.archive2); // L: 1884
							class87.method2374(ApproximateRouteStrategy.archive2); // L: 1885
							Archive var13 = ApproximateRouteStrategy.archive2; // L: 1886
							class539.field5305 = var13; // L: 1888
							class176.field1863 = new class529(class109.field1400, 54, BuddyRankComparator.clientLanguage, ApproximateRouteStrategy.archive2); // L: 1890
							PlayerType.field4444 = new class529(class109.field1400, 47, BuddyRankComparator.clientLanguage, ApproximateRouteStrategy.archive2); // L: 1891
							Archive.varcs = new Varcs(); // L: 1892
							ArchiveDiskAction.method7104(ApproximateRouteStrategy.archive2, class7.field29, ChatChannel.archive13); // L: 1893
							Archive var14 = ApproximateRouteStrategy.archive2; // L: 1894
							Archive var15 = class7.field29; // L: 1895
							HealthBarDefinition.HealthBarDefinition_archive = var14; // L: 1897
							HealthBarDefinition.field1929 = var15; // L: 1898
							Archive var16 = ApproximateRouteStrategy.archive2; // L: 1900
							Archive var17 = class7.field29; // L: 1901
							WorldMapElement.WorldMapElement_archive = var17; // L: 1903
							if (var16.isFullyLoaded()) { // L: 1904
								WorldMapElement.WorldMapElement_count = var16.getGroupFileCount(35); // L: 1907
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1908

								for (int var18 = 0; var18 < WorldMapElement.WorldMapElement_count; ++var18) { // L: 1909
									byte[] var19 = var16.takeFile(35, var18); // L: 1910
									WorldMapElement.WorldMapElement_cached[var18] = new WorldMapElement(var18); // L: 1911
									if (var19 != null) { // L: 1912
										WorldMapElement.WorldMapElement_cached[var18].decode(new Buffer(var19)); // L: 1913
										WorldMapElement.WorldMapElement_cached[var18].method3584(); // L: 1914
									}
								}
							}

							Login.method2185(50, "Loaded config"); // L: 1918
							UserComparator7.method3008(class94.field1149); // L: 1919
						}
					} else if (class94.field1149 == Client.field535) { // L: 1922
						var0 = 0; // L: 1923
						if (World.field810 == null) { // L: 1924
							World.field810 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(class7.field29, RouteStrategy.field2497.field5022, 0);
						} else {
							++var0; // L: 1925
						}

						if (class74.redHintArrowSprite == null) { // L: 1926
							class74.redHintArrowSprite = ArchiveDiskActionHandler.SpriteBuffer_getSprite(class7.field29, RouteStrategy.field2497.field5014, 0);
						} else {
							++var0; // L: 1927
						}

						IndexedSprite[] var1;
						IndexedSprite var7;
						IndexedSprite[] var23;
						int var24;
						if (class418.field4683 == null) { // L: 1928
							var2 = class7.field29; // L: 1930
							var3 = RouteStrategy.field2497.field5015; // L: 1931
							if (!class146.method3260(var2, var3, 0)) { // L: 1933
								var1 = null; // L: 1934
							} else {
								var23 = new IndexedSprite[class561.SpriteBuffer_spriteCount]; // L: 1939

								for (var24 = 0; var24 < class561.SpriteBuffer_spriteCount; ++var24) { // L: 1940
									var7 = var23[var24] = new IndexedSprite(); // L: 1941
									var7.width = class561.SpriteBuffer_spriteWidth; // L: 1942
									var7.height = class561.SpriteBuffer_spriteHeight; // L: 1943
									var7.xOffset = UserComparator4.SpriteBuffer_xOffsets[var24]; // L: 1944
									var7.yOffset = class145.SpriteBuffer_yOffsets[var24]; // L: 1945
									var7.subWidth = class561.SpriteBuffer_spriteWidths[var24]; // L: 1946
									var7.subHeight = class315.SpriteBuffer_spriteHeights[var24] * -897865968; // L: 1947
									var7.palette = class561.SpriteBuffer_spritePalette; // L: 1948
									var7.pixels = class561.SpriteBuffer_pixels[var24]; // L: 1949
								}

								Calendar.method7029(); // L: 1951
								var1 = var23; // L: 1954
							}

							class418.field4683 = var1; // L: 1956
						} else {
							++var0; // L: 1958
						}

						if (FaceNormal.field3019 == null) { // L: 1959
							FaceNormal.field3019 = FriendsChatMember.method8542(class7.field29, RouteStrategy.field2497.field5016, 0);
						} else {
							++var0; // L: 1960
						}

						if (ArchiveDiskActionHandler.field4476 == null) { // L: 1961
							ArchiveDiskActionHandler.field4476 = FriendsChatMember.method8542(class7.field29, RouteStrategy.field2497.field5013, 0);
						} else {
							++var0; // L: 1962
						}

						if (class337.field3665 == null) { // L: 1963
							class337.field3665 = FriendsChatMember.method8542(class7.field29, RouteStrategy.field2497.field5018, 0);
						} else {
							++var0; // L: 1964
						}

						if (class25.field118 == null) { // L: 1965
							class25.field118 = FriendsChatMember.method8542(class7.field29, RouteStrategy.field2497.field5019, 0);
						} else {
							++var0; // L: 1966
						}

						if (class110.field1408 == null) { // L: 1967
							class110.field1408 = FriendsChatMember.method8542(class7.field29, RouteStrategy.field2497.field5020, 0);
						} else {
							++var0; // L: 1968
						}

						if (class446.field4821 == null) { // L: 1969
							class446.field4821 = FriendsChatMember.method8542(class7.field29, RouteStrategy.field2497.field5017, 0);
						} else {
							++var0; // L: 1970
						}

						if (UrlRequest.scrollBarSprites == null) { // L: 1971
							var2 = class7.field29; // L: 1973
							var3 = RouteStrategy.field2497.field5021; // L: 1974
							if (!class146.method3260(var2, var3, 0)) { // L: 1976
								var1 = null; // L: 1977
							} else {
								var23 = new IndexedSprite[class561.SpriteBuffer_spriteCount]; // L: 1982

								for (var24 = 0; var24 < class561.SpriteBuffer_spriteCount; ++var24) { // L: 1983
									var7 = var23[var24] = new IndexedSprite(); // L: 1984
									var7.width = class561.SpriteBuffer_spriteWidth; // L: 1985
									var7.height = class561.SpriteBuffer_spriteHeight; // L: 1986
									var7.xOffset = UserComparator4.SpriteBuffer_xOffsets[var24]; // L: 1987
									var7.yOffset = class145.SpriteBuffer_yOffsets[var24]; // L: 1988
									var7.subWidth = class561.SpriteBuffer_spriteWidths[var24]; // L: 1989
									var7.subHeight = class315.SpriteBuffer_spriteHeights[var24] * -897865968; // L: 1990
									var7.palette = class561.SpriteBuffer_spritePalette; // L: 1991
									var7.pixels = class561.SpriteBuffer_pixels[var24]; // L: 1992
								}

								Calendar.method7029(); // L: 1994
								var1 = var23; // L: 1997
							}

							UrlRequest.scrollBarSprites = var1; // L: 1999
						} else {
							++var0; // L: 2001
						}

						if (class240.field2526 == null) { // L: 2002
							class240.field2526 = class330.method6173(class7.field29, RouteStrategy.field2497.field5023, 0);
						} else {
							++var0; // L: 2003
						}

						if (var0 < 11) { // L: 2004
							Login.method2185(70, "Loading sprites - " + var0 * 100 / 12 + "%"); // L: 2005
						} else {
							AbstractFont.AbstractFont_modIconSprites = class240.field2526; // L: 2008
							class74.redHintArrowSprite.normalize(); // L: 2009
							int var25 = (int)(Math.random() * 21.0D) - 10; // L: 2010
							int var26 = (int)(Math.random() * 21.0D) - 10; // L: 2011
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 2012
							var21 = (int)(Math.random() * 41.0D) - 20; // L: 2013
							class418.field4683[0].shiftColors(var25 + var21, var21 + var26, var21 + var3); // L: 2014
							Login.method2185(60, "Loaded sprites"); // L: 2015
							UserComparator7.method3008(class94.field1158); // L: 2016
						}
					} else if (class94.field1158 == Client.field535) { // L: 2019
						if (!class195.field2052.isFullyLoaded()) { // L: 2020
							Login.method2185(70, "Loading textures - " + "0%"); // L: 2021
						} else {
							class105.field1379 = new TextureProvider(class195.field2052, class7.field29, 20, class105.clientPreferences.method2578(), Client.isLowDetail ? 64 : 128); // L: 2024
							Rasterizer3D.method5309(class105.field1379); // L: 2025
							Rasterizer3D.method5248(class105.clientPreferences.method2578()); // L: 2026
							UserComparator7.method3008(class94.field1150); // L: 2027
						}
					} else if (Client.field535 == class94.field1150) { // L: 2030
						var0 = class105.field1379.getLoadedPercentage(); // L: 2031
						if (var0 < 100) { // L: 2032
							Login.method2185(80, "Loading textures - " + var0 + "%"); // L: 2033
						} else {
							Login.method2185(90, "Loaded textures"); // L: 2036
							UserComparator7.method3008(class94.field1152); // L: 2037
						}
					} else if (class94.field1152 == Client.field535) { // L: 2040
						Client.mouseRecorder = new MouseRecorder(); // L: 2041
						GameEngine.taskHandler.newThreadTask(Client.mouseRecorder, 10); // L: 2042
						Login.method2185(92, "Loaded input handler"); // L: 2043
						UserComparator7.method3008(class94.field1161); // L: 2044
					} else if (class94.field1161 == Client.field535) { // L: 2047
						if (!WorldMapSection1.field2728.tryLoadFileByNames("huffman", "")) { // L: 2048
							Login.method2185(94, "Loading wordpack - " + 0 + "%"); // L: 2049
						} else {
							Huffman var40 = new Huffman(WorldMapSection1.field2728.takeFileByNames("huffman", "")); // L: 2052
							class365.huffman = var40; // L: 2054
							Login.method2185(94, "Loaded wordpack"); // L: 2056
							UserComparator7.method3008(class94.field1162); // L: 2057
						}
					} else if (class94.field1162 == Client.field535) { // L: 2060
						if (!LoginScreenAnimation.field1296.isFullyLoaded()) { // L: 2061
							Login.method2185(96, "Loading interfaces - " + LoginScreenAnimation.field1296.loadPercent() * 4 / 5 + "%"); // L: 2062
						} else if (!ObjectSound.field856.isFullyLoaded()) { // L: 2065
							Login.method2185(96, "Loading interfaces - " + ObjectSound.field856.loadPercent() * 4 / 5 + "%"); // L: 2066
						} else if (!class476.archive12.isFullyLoaded()) { // L: 2069
							Login.method2185(96, "Loading interfaces - " + (80 + class476.archive12.loadPercent() / 6) + "%"); // L: 2070
						} else if (!ChatChannel.archive13.isFullyLoaded()) { // L: 2073
							Login.method2185(96, "Loading interfaces - " + (96 + ChatChannel.archive13.loadPercent() / 50) + "%"); // L: 2074
						} else {
							Login.method2185(98, "Loaded interfaces"); // L: 2077
							if (class476.archive12.isValidFileName("version.dat", "")) { // L: 2078
								Buffer var20 = new Buffer(class476.archive12.takeFileByNames("version.dat", "")); // L: 2079
								var20.readUnsignedShort(); // L: 2080
							}

							UserComparator7.method3008(class94.field1163); // L: 2082
						}
					} else if (Client.field535 == class94.field1163) { // L: 2085
						if (class145.field1684.getGroupCount() > 0 && !class145.field1684.tryLoadGroupByName(WorldMapCacheName.field2740.name)) { // L: 2086
							Login.method2185(100, "Loading world map - " + class145.field1684.groupLoadPercentByName(WorldMapCacheName.field2740.name) / 10 + "%"); // L: 2087
						} else {
							if (VertexNormal.worldMap == null) { // L: 2090
								VertexNormal.worldMap = new WorldMap(); // L: 2091
								VertexNormal.worldMap.init(class145.field1684, class151.field1715, PlayerComposition.field3785, ParamComposition.fontBold12, Client.field570, class418.field4683); // L: 2092
							}

							Login.method2185(100, "Loaded world map"); // L: 2094
							if (class4.field9) { // L: 2095
								UserComparator7.method3008(class94.field1165); // L: 2096
							} else {
								UserComparator7.method3008(class94.field1164); // L: 2099
							}

							Client.field739 = false; // L: 2101
						}
					} else {
						if (class94.field1165 == Client.field535) { // L: 2104
							FloorUnderlayDefinition.field2095 = false; // L: 2105
							ClanChannelMember.method3282(20); // L: 2106
							KeyHandler.method434(class68.field493); // L: 2107
						}

					}
				}
			}
		}
	} // L: 1608 1621 1630 1680 1688 1696 1743 1753 1757 1777 1798 1812 1820 1825 1829 1920 2006 2017 2022 2028 2034 2038 2045 2050 2058 2063 2067 2071 2075 2083 2088 2102 2109

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(I)Lpr;",
		garbageValue = "115971243"
	)
	public static NodeDeque method6447() {
		return Client.scriptEvents; // L: 5433
	}
}
