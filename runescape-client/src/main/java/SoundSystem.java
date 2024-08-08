import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bn")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 10
				PcmPlayer var2 = this.players[var1]; // L: 11
				if (var2 != null) { // L: 12
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 15
			FriendsChatManager.RunException_sendStackTrace((String)null, var4); // L: 16
		}

	} // L: 18

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "22"
	)
	static File method875(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 131
		JagexCache.JagexCache_locationFile = new File(class74.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 132
		String var4 = null; // L: 133
		String var5 = null; // L: 134
		boolean var6 = false; // L: 135
		File var22;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 136
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 139

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 140 141 144
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 142
					if (var9 == -1) { // L: 143
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 146
				var9 = var8.readUnsignedByte(); // L: 147
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9); // L: 148
				}

				int var10 = 0; // L: 149
				if (var9 > 1) { // L: 150
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 151
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 152
					if (var10 == 1) { // L: 153
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 156
					if (var10 == 1) { // L: 157
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 159
			} catch (IOException var20) { // L: 161
				var20.printStackTrace(); // L: 162
			}

			if (var4 != null) { // L: 164
				var22 = new File(var4); // L: 165
				if (!var22.exists()) { // L: 166
					var4 = null; // L: 167
				}
			}

			if (var4 != null) { // L: 170
				var22 = new File(var4, "test.dat"); // L: 171
				if (!class159.method3418(var22, true)) { // L: 172
					var4 = null; // L: 173
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 177
			label123:
			for (int var15 = 0; var15 < class87.field1073.length; ++var15) { // L: 178
				for (int var16 = 0; var16 < class147.field1695.length; ++var16) { // L: 179
					File var17 = new File(class147.field1695[var16] + class87.field1073[var15] + File.separatorChar + var0 + File.separatorChar); // L: 180
					if (var17.exists() && class159.method3418(new File(var17, "test.dat"), true)) { // L: 181 182
						var4 = var17.toString(); // L: 183
						var6 = true; // L: 184
						break label123; // L: 185
					}
				}
			}
		}

		if (var4 == null) { // L: 191
			var4 = class74.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 192
			var6 = true; // L: 193
		}

		if (var5 != null) { // L: 195
			File var21 = new File(var5); // L: 196
			var22 = new File(var4); // L: 197

			try {
				File[] var23 = var21.listFiles(); // L: 199
				File[] var18 = var23; // L: 201

				for (int var11 = 0; var11 < var18.length; ++var11) { // L: 202
					File var12 = var18[var11]; // L: 203
					File var13 = new File(var22, var12.getName()); // L: 205
					boolean var14 = var12.renameTo(var13); // L: 206
					if (!var14) { // L: 207
						throw new IOException();
					}
				}
			} catch (Exception var19) { // L: 212
				var19.printStackTrace(); // L: 213
			}

			var6 = true; // L: 215
		}

		if (var6) { // L: 217
			class229.method4371(new File(var4), (File)null);
		}

		return new File(var4); // L: 218
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-962795376"
	)
	static final void method870(String var0) {
		AbstractWorldMapIcon.method5076(var0 + " is already on your friend list"); // L: 112
	} // L: 113

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1898416425"
	)
	static int method874(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3627
			class130.Interpreter_intStackSize -= 2; // L: 3628
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3629
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3630
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 + var4; // L: 3631
			return 1; // L: 3632
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3634
			class130.Interpreter_intStackSize -= 2; // L: 3635
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3636
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3637
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 - var4; // L: 3638
			return 1; // L: 3639
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3641
			class130.Interpreter_intStackSize -= 2; // L: 3642
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3643
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3644
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 * var9; // L: 3645
			return 1; // L: 3646
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3648
			class130.Interpreter_intStackSize -= 2; // L: 3649
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3650
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3651
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 / var4; // L: 3652
			return 1; // L: 3653
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3655
			var9 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3656
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3657
			return 1; // L: 3658
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3660
			var9 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 3661
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3662
			return 1; // L: 3663
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3665
				class130.Interpreter_intStackSize -= 5; // L: 3666
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3667
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3668
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 3669
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 3670
				var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 4]; // L: 3671
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5); // L: 3672
				return 1; // L: 3673
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3675
				class130.Interpreter_intStackSize -= 2; // L: 3676
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3677
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3678
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 3679
				return 1; // L: 3680
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3682
				class130.Interpreter_intStackSize -= 2; // L: 3683
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3684
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3685
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3686
				return 1; // L: 3687
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3689
				class130.Interpreter_intStackSize -= 2; // L: 3690
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3691
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3692
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3693
				return 1; // L: 3694
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3696
				class130.Interpreter_intStackSize -= 2; // L: 3697
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3698
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3699
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3700
				return 1; // L: 3701
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3703
				class130.Interpreter_intStackSize -= 2; // L: 3704
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3705
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3706
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 % var4; // L: 3707
				return 1; // L: 3708
			} else if (var0 == ScriptOpcodes.POW) { // L: 3710
				class130.Interpreter_intStackSize -= 2; // L: 3711
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3712
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3713
				if (var9 == 0) { // L: 3714
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3715
				}

				return 1; // L: 3716
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3718
				class130.Interpreter_intStackSize -= 2; // L: 3719
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3720
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3721
				if (var9 == 0) { // L: 3722
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 3723
					return 1; // L: 3724
				} else {
					switch(var4) { // L: 3726
					case 0:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3744
						break; // L: 3745
					case 1:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9; // L: 3734
						break; // L: 3735
					case 2:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3739
						break; // L: 3740
					case 3:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3749
						break; // L: 3750
					case 4:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3729
						break;
					default:
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3754
					}

					return 1; // L: 3758
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3760
				class130.Interpreter_intStackSize -= 2; // L: 3761
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3762
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3763
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 & var4; // L: 3764
				return 1; // L: 3765
			} else if (var0 == ScriptOpcodes.OR) { // L: 3767
				class130.Interpreter_intStackSize -= 2; // L: 3768
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3769
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3770
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 | var4; // L: 3771
				return 1; // L: 3772
			} else if (var0 == 4016) { // L: 3774
				class130.Interpreter_intStackSize -= 2; // L: 3775
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3776
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3777
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3778
				return 1; // L: 3779
			} else if (var0 == 4017) { // L: 3781
				class130.Interpreter_intStackSize -= 2; // L: 3782
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3783
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3784
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3785
				return 1; // L: 3786
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3788
				class130.Interpreter_intStackSize -= 3; // L: 3789
				long var10 = (long)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3790
				long var12 = (long)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3791
				long var14 = (long)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 3792
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12); // L: 3793
				return 1; // L: 3794
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3796
				var9 = World.method1907(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 3797
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9; // L: 3798
				return 1; // L: 3799
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3801
				class130.Interpreter_intStackSize -= 2; // L: 3802
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3803
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3804
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3805
				return 1; // L: 3806
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3808
				class130.Interpreter_intStackSize -= 3; // L: 3809
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3810
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3811
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 3812
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class166.method3477(var9, var4, var5); // L: 3813
				return 1; // L: 3814
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3816
				class130.Interpreter_intStackSize -= 3; // L: 3817
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3818
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3819
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 3820
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class18.method280(var9, var4, var5); // L: 3821
				return 1; // L: 3822
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3824
				class130.Interpreter_intStackSize -= 3; // L: 3825
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3826
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3827
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 3828
				var6 = 31 - var5; // L: 3829
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3830
				return 1; // L: 3831
			} else if (var0 == 4030) { // L: 3833
				class130.Interpreter_intStackSize -= 4; // L: 3834
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3835
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3836
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 3837
				var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 3838
				var9 = class18.method280(var9, var5, var6); // L: 3839
				var7 = GraphicsObject.method2153(var6 - var5 + 1); // L: 3840
				if (var4 > var7) { // L: 3841
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3842
				return 1; // L: 3843
			} else if (var0 == 4032) { // L: 3845
				Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = FloorOverlayDefinition.method4035(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]); // L: 3846
				return 1; // L: 3847
			} else if (var0 == 4033) { // L: 3849
				Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = class6.method39(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]); // L: 3850
				return 1; // L: 3851
			} else if (var0 == 4034) { // L: 3853
				class130.Interpreter_intStackSize -= 2; // L: 3854
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 3855
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 3856
				var5 = class349.method6511(var9, var4); // L: 3857
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5; // L: 3858
				return 1; // L: 3859
			} else if (var0 == 4035) { // L: 3861
				Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]); // L: 3862
				return 1; // L: 3863
			} else if (var0 == 4036) { // L: 3865
				String var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 3866
				var4 = -1; // L: 3867
				if (HealthBarUpdate.isNumber(var3)) { // L: 3868
					var4 = GrandExchangeEvent.method7351(var3); // L: 3869
				}

				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4; // L: 3871
				return 1; // L: 3872
			} else {
				return 2; // L: 3874
			}
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method869() {
		Client.menuOptionsCount = 0; // L: 9802
		Client.isMenuOpen = false; // L: 9803
		Client.field653[0] = -1; // L: 9805
		Client.menuActions[0] = "Cancel"; // L: 9806
		Client.menuTargets[0] = ""; // L: 9807
		Client.menuOpcodes[0] = 1006; // L: 9808
		Client.field528[0] = false; // L: 9809
		Client.menuOptionsCount = 1; // L: 9810
	} // L: 9811

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-906642804"
	)
	static void method873(Buffer var0) {
		if (Client.randomDatData != null) { // L: 13445
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 13446
		} else {
			byte[] var2 = new byte[24]; // L: 13451

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 13453
				JagexCache.JagexCache_randomDat.readFully(var2); // L: 13454

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) { // L: 13455 13456 13457
				}

				if (var3 >= 24) { // L: 13459
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) { // L: 13462
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length); // L: 13467
		}
	} // L: 13447 13468
}
