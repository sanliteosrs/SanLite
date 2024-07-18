import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class455 {
	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "([Lnx;II)V",
		garbageValue = "-1883916637"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12810
			Widget var3 = var0[var2]; // L: 12811
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class175.isComponentHidden(var3))) { // L: 12812 12813 12814
				if (var3.type == 0) { // L: 12815
					if (!var3.isIf3 && class175.isComponentHidden(var3) && var3 != class180.mousedOverWidgetIf1) { // L: 12816
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12817
					if (var3.children != null) { // L: 12818
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12819
					if (var4 != null) { // L: 12820
						class212.method4108(var4.group);
					}
				}

				if (var3.type == 6) { // L: 12822
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12823
						boolean var8 = class534.runCs1(var3); // L: 12824
						if (var8) { // L: 12826
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12827
						}

						if (var5 != -1) { // L: 12828
							SequenceDefinition var6 = class353.SequenceDefinition_get(var5); // L: 12829
							if (!var6.isCachedModelIdSet()) { // L: 12830
								for (var3.modelFrameCycle += Client.field805; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; TriBool.invalidateWidget(var3)) { // L: 12831 12832 12839
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12833
									++var3.modelFrame; // L: 12834
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12835
										var3.modelFrame -= var6.frameCount; // L: 12836
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12837
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field805; // L: 12843
								int var7 = var6.method4059(); // L: 12844
								if (var3.modelFrame >= var7) { // L: 12845
									var3.modelFrame -= var6.frameCount; // L: 12846
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12847
										var3.modelFrame = 0;
									}
								}

								TriBool.invalidateWidget(var3); // L: 12849
							}
						}
					}

					if (var3.field3943 != 0 && !var3.isIf3) { // L: 12853
						int var9 = var3.field3943 >> 16; // L: 12854
						var5 = var3.field3943 << 16 >> 16; // L: 12855
						var9 *= Client.field805; // L: 12856
						var5 *= Client.field805; // L: 12857
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12858
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12859
						TriBool.invalidateWidget(var3); // L: 12860
					}
				}
			}
		}

	} // L: 12864
}
