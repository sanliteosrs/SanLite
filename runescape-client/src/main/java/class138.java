import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fp")
public class class138 implements class129 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "74722071"
	)
	public static void method3192() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 64
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 65
			} // L: 66

			if (var0 == null) {
				return; // L: 67
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 68
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lft;",
		garbageValue = "1133821230"
	)
	public static class142 method3190(int var0) {
		class142 var1 = (class142)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 482
		if (var1 != null) { // L: 483
			return var1;
		} else {
			AbstractArchive var3 = class177.SequenceDefinition_animationsArchive; // L: 485
			AbstractArchive var4 = WorldMapLabelSize.SequenceDefinition_skeletonsArchive; // L: 486
			boolean var5 = true; // L: 488
			byte[] var6 = var3.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 489
			class142 var2;
			if (var6 == null) { // L: 490
				var5 = false; // L: 491
				var2 = null; // L: 492
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255; // L: 495
				byte[] var8 = var4.getFile(var7, 0); // L: 498
				if (var8 == null) { // L: 499
					var5 = false;
				}

				if (!var5) { // L: 500
					var2 = null; // L: 501
				} else {
					if (class142.field1655 == null) { // L: 504
						class142.field1649 = Runtime.getRuntime().availableProcessors(); // L: 505
						class142.field1655 = new ThreadPoolExecutor(0, class142.field1649, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class142.field1649 * 100 + 100), new class173()); // L: 506
					}

					try {
						var2 = new class142(var3, var4, var0, false); // L: 514
					} catch (Exception var10) { // L: 516
						var2 = null; // L: 517
					}
				}
			}

			if (var2 != null) { // L: 521
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2; // L: 522
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "854971823"
	)
	static int method3191(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2708
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.cycle; // L: 2709
			return 1; // L: 2710
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2712
				class130.Interpreter_intStackSize -= 2; // L: 2713
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2714
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2715
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class188.method3687(var3, var4); // L: 2716
				return 1; // L: 2717
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2719
				class130.Interpreter_intStackSize -= 2; // L: 2720
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2721
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2722
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class31.ItemContainer_getCount(var3, var4); // L: 2723
				return 1; // L: 2724
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2726
				class130.Interpreter_intStackSize -= 2; // L: 2727
				var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2728
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2729
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class165.method3467(var3, var4); // L: 2730
				return 1; // L: 2731
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2733
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2734
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = WorldMapCacheName.getInvDefinition(var3).size; // L: 2735
				return 1; // L: 2736
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2738
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2739
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2740
				return 1; // L: 2741
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2743
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2744
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2745
				return 1; // L: 2746
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2748
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2749
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2750
				return 1; // L: 2751
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2753
					var3 = class511.field5137.field1318; // L: 2754
					var4 = (SoundCache.localPlayer.x >> 7) + class511.field5137.field1321; // L: 2755
					var5 = (SoundCache.localPlayer.field1191 >> 7) + class511.field5137.field1323; // L: 2756
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Coord.method6460(var3, var4, var5); // L: 2757
					return 1; // L: 2758
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2760
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2761
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Coord.method6468(var3); // L: 2762
					return 1; // L: 2763
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2765
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2766
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Coord.method6469(var3); // L: 2767
					return 1; // L: 2768
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2770
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2771
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Coord.method6474(var3); // L: 2772
					return 1; // L: 2773
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2775
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2776
					return 1; // L: 2777
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2779
					class130.Interpreter_intStackSize -= 2; // L: 2780
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] + 32768; // L: 2781
					var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2782
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class188.method3687(var3, var4); // L: 2783
					return 1; // L: 2784
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2786
					class130.Interpreter_intStackSize -= 2; // L: 2787
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] + 32768; // L: 2788
					var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2789
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class31.ItemContainer_getCount(var3, var4); // L: 2790
					return 1; // L: 2791
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2793
					class130.Interpreter_intStackSize -= 2; // L: 2794
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize] + 32768; // L: 2795
					var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2796
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class165.method3467(var3, var4); // L: 2797
					return 1; // L: 2798
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2800
					if (Client.staffModLevel >= 2) { // L: 2801
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2802
					}

					return 1; // L: 2803
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2805
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2806
					return 1; // L: 2807
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2809
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.worldId; // L: 2810
					return 1; // L: 2811
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2813
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field677 / 100; // L: 2814
					return 1; // L: 2815
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2817
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.weight; // L: 2818
					return 1; // L: 2819
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2821
					if (Client.playerMod) { // L: 2822
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2823
					}

					return 1; // L: 2824
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2826
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2827
					return 1; // L: 2828
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2830
					class130.Interpreter_intStackSize -= 4; // L: 2831
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2832
					var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2833
					var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 2834
					int var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 2835
					int var7 = Coord.method6460(var5, var4, var6); // L: 2836
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 + var3; // L: 2837
					return 1; // L: 2838
				} else if (var0 == 3326) { // L: 2840
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field519; // L: 2841
					return 1; // L: 2842
				} else if (var0 == 3327) { // L: 2844
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field807; // L: 2845
					return 1; // L: 2846
				} else if (var0 == 3331) { // L: 2848
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field677; // L: 2849
					return 1; // L: 2850
				} else if (var0 == 3332) { // L: 2852
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2853
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field775[var3]; // L: 2854
					return 1; // L: 2855
				} else {
					return 2; // L: 2857
				}
			}
		}
	}
}
