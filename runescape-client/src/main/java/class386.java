import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
public class class386 extends DualNode {
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static AbstractSocket field4521;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	Archive field4523;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2065166421
	)
	int field4524;
	@ObfuscatedName("ag")
	byte field4522;

	class386() {
	} // L: 10

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-704186007"
	)
	static final float method7177(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 17
		return (var1 * 1.0075567F - 75.56675F) / var1; // L: 18
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ldw;B)V",
		garbageValue = "111"
	)
	static final void method7176(Actor var0) {
		var0.field1193 = false; // L: 4694
		if (var0.field1198 != -1) { // L: 4695
			SequenceDefinition var1 = class353.SequenceDefinition_get(var0.field1198); // L: 4696
			if (var1 != null) { // L: 4697
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4698
					++var0.field1233; // L: 4699
					if (var0.field1232 < var1.frameIds.length && var0.field1233 > var1.frameLengths[var0.field1232]) { // L: 4700
						var0.field1233 = 1; // L: 4701
						++var0.field1232; // L: 4702
						class188.method3684(var1, var0.field1232, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4703
					}

					if (var0.field1232 >= var1.frameIds.length) { // L: 4705
						if (var1.frameCount > 0) { // L: 4706
							var0.field1232 -= var1.frameCount; // L: 4707
							if (var1.field2304) { // L: 4708
								++var0.field1234;
							}

							if (var0.field1232 < 0 || var0.field1232 >= var1.frameIds.length || var1.field2304 && var0.field1234 >= var1.field2280) { // L: 4709
								var0.field1233 = 0; // L: 4710
								var0.field1232 = 0; // L: 4711
								var0.field1234 = 0; // L: 4712
							}
						} else {
							var0.field1233 = 0; // L: 4716
							var0.field1232 = 0; // L: 4717
						}

						class188.method3684(var1, var0.field1232, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4719
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4722
					++var0.field1232; // L: 4723
					int var2 = var1.method4059(); // L: 4724
					if (var0.field1232 < var2) { // L: 4725
						WorldMapLabelSize.method4571(var1, var0.field1232, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4726
					} else {
						if (var1.frameCount > 0) { // L: 4729
							var0.field1232 -= var1.frameCount; // L: 4730
							if (var1.field2304) { // L: 4731
								++var0.field1234;
							}

							if (var0.field1232 < 0 || var0.field1232 >= var2 || var1.field2304 && var0.field1234 >= var1.field2280) { // L: 4732
								var0.field1232 = 0; // L: 4733
								var0.field1233 = 0; // L: 4734
								var0.field1234 = 0; // L: 4735
							}
						} else {
							var0.field1233 = 0; // L: 4739
							var0.field1232 = 0; // L: 4740
						}

						WorldMapLabelSize.method4571(var1, var0.field1232, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4742
					}
				} else {
					var0.field1198 = -1; // L: 4745
				}
			} else {
				var0.field1198 = -1; // L: 4747
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2482()); // L: 4749

		int var3;
		for (class477 var6 = (class477)var7.method9230(); var6 != null; var6 = (class477)var7.next()) { // L: 4750
			if (var6.field4979 != -1 && Client.cycle >= var6.field4981) { // L: 4751
				var3 = class178.SpotAnimationDefinition_get(var6.field4979).sequence; // L: 4754
				if (var3 == -1) { // L: 4755
					var6.remove(); // L: 4756
					--var0.field1241; // L: 4757
				} else {
					var6.field4983 = Math.max(var6.field4983, 0); // L: 4760
					SequenceDefinition var4 = class353.SequenceDefinition_get(var3); // L: 4761
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) { // L: 4762
						++var6.field4980; // L: 4763
						if (var6.field4983 < var4.frameIds.length && var6.field4980 > var4.frameLengths[var6.field4983]) { // L: 4764
							var6.field4980 = 1; // L: 4765
							++var6.field4983; // L: 4766
							class188.method3684(var4, var6.field4983, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4767
						}

						if (var6.field4983 >= var4.frameIds.length) { // L: 4769
							var6.remove(); // L: 4770
							--var0.field1241; // L: 4771
						}
					} else if (var4.isCachedModelIdSet()) { // L: 4774
						++var6.field4983; // L: 4775
						int var5 = var4.method4059(); // L: 4776
						if (var6.field4983 < var5) { // L: 4777
							WorldMapLabelSize.method4571(var4, var6.field4983, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4778
						} else {
							var6.remove(); // L: 4781
							--var0.field1241; // L: 4782
						}
					} else {
						var6.remove(); // L: 4786
						--var0.field1241; // L: 4787
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.field1235 != -1 && var0.field1238 <= 1) { // L: 4790
			var8 = class353.SequenceDefinition_get(var0.field1235); // L: 4791
			if (var8.field2303 == 1 && var0.field1265 > 0 && var0.field1253 <= Client.cycle && var0.field1260 < Client.cycle) { // L: 4792 4793
				var0.field1238 = 1; // L: 4794
				return; // L: 4795
			}
		}

		if (var0.field1235 != -1 && var0.field1238 == 0) { // L: 4799
			var8 = class353.SequenceDefinition_get(var0.field1235); // L: 4800
			if (var8 != null) { // L: 4801
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) { // L: 4802
					++var0.field1237; // L: 4803
					if (var0.field1236 < var8.frameIds.length && var0.field1237 > var8.frameLengths[var0.field1236]) { // L: 4804
						var0.field1237 = 1; // L: 4805
						++var0.field1236; // L: 4806
						class188.method3684(var8, var0.field1236, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4807
					}

					if (var0.field1236 >= var8.frameIds.length) { // L: 4809
						var0.field1236 -= var8.frameCount; // L: 4810
						++var0.field1214; // L: 4811
						if (var0.field1214 >= var8.field2280) { // L: 4812
							var0.field1235 = -1; // L: 4813
						} else if (var0.field1236 >= 0 && var0.field1236 < var8.frameIds.length) { // L: 4815
							class188.method3684(var8, var0.field1236, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4819
						} else {
							var0.field1235 = -1; // L: 4816
						}
					}

					var0.field1193 = var8.field2297; // L: 4822
				} else if (var8.isCachedModelIdSet()) { // L: 4824
					++var0.field1236; // L: 4825
					var3 = var8.method4059(); // L: 4826
					if (var0.field1236 < var3) { // L: 4827
						WorldMapLabelSize.method4571(var8, var0.field1236, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4828
					} else {
						var0.field1236 -= var8.frameCount; // L: 4831
						++var0.field1214; // L: 4832
						if (var0.field1214 >= var8.field2280) { // L: 4833
							var0.field1235 = -1; // L: 4834
						} else if (var0.field1236 >= 0 && var0.field1236 < var3) { // L: 4836
							WorldMapLabelSize.method4571(var8, var0.field1236, var0.x, var0.field1191, SoundCache.localPlayer == var0); // L: 4840
						} else {
							var0.field1235 = -1; // L: 4837
						}
					}
				} else {
					var0.field1235 = -1; // L: 4844
				}
			} else {
				var0.field1235 = -1; // L: 4846
			}
		}

		if (var0.field1238 > 0) { // L: 4848
			--var0.field1238;
		}

	} // L: 4849
}
