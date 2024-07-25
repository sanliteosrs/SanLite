import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("od")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4011(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4025(1, 0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4027(2, 0),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4032(3, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4013(9, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4014(4, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4026(5, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4016(6, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4017(7, 1),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4018(8, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4019(12, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4020(13, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4021(14, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4022(15, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4015(16, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4024(17, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4009(18, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4012(19, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4023(20, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4028(21, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4029(10, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4030(11, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	field4031(22, 3);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 857911705
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1685984504"
	)
	public static int method7062(int var0) {
		return class432.method8071(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 51
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1338980294"
	)
	static int method7053(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2861
			class130.Interpreter_intStackSize -= 2; // L: 2862
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2863
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2864
			EnumComposition var10 = Bounds.getEnum(var3); // L: 2865
			if (var10.outputType != 's') { // L: 2866
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2867
				if (var9 == var10.keys[var6]) { // L: 2868
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2869
					var10 = null; // L: 2870
					break;
				}
			}

			if (var10 != null) { // L: 2874
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2875
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2877
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2903
				var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 2904
				EnumComposition var4 = Bounds.getEnum(var3); // L: 2905
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.size(); // L: 2906
				return 1; // L: 2907
			} else {
				return 2; // L: 2909
			}
		} else {
			class130.Interpreter_intStackSize -= 4; // L: 2878
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 2879
			var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 2880
			int var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 2881
			var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 2882
			EnumComposition var7 = Bounds.getEnum(var5); // L: 2883
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2884
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2889
					if (var6 == var7.keys[var8]) { // L: 2890
						if (var9 == 115) { // L: 2891
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2892
						}

						var7 = null; // L: 2893
						break;
					}
				}

				if (var7 != null) { // L: 2897
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.defaultStr; // L: 2898
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2899
					}
				}

				return 1; // L: 2901
			} else {
				if (var9 == 115) { // L: 2885
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 2886
				}

				return 1; // L: 2887
			}
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1963335579"
	)
	static final void method7065(int var0, int var1, int var2) {
		if (class47.cameraX < var0) { // L: 4363
			class47.cameraX = (var0 - class47.cameraX) * class191.field1983 / 1000 + class47.cameraX + VarpDefinition.field1879; // L: 4364
			if (class47.cameraX > var0) { // L: 4365
				class47.cameraX = var0;
			}
		}

		if (class47.cameraX > var0) { // L: 4367
			class47.cameraX -= (class47.cameraX - var0) * class191.field1983 / 1000 + VarpDefinition.field1879; // L: 4368
			if (class47.cameraX < var0) { // L: 4369
				class47.cameraX = var0;
			}
		}

		if (class328.cameraY < var1) { // L: 4371
			class328.cameraY = (var1 - class328.cameraY) * class191.field1983 / 1000 + class328.cameraY + VarpDefinition.field1879; // L: 4372
			if (class328.cameraY > var1) { // L: 4373
				class328.cameraY = var1;
			}
		}

		if (class328.cameraY > var1) { // L: 4375
			class328.cameraY -= (class328.cameraY - var1) * class191.field1983 / 1000 + VarpDefinition.field1879; // L: 4376
			if (class328.cameraY < var1) { // L: 4377
				class328.cameraY = var1;
			}
		}

		if (class60.cameraZ < var2) { // L: 4379
			class60.cameraZ = (var2 - class60.cameraZ) * class191.field1983 / 1000 + class60.cameraZ + VarpDefinition.field1879; // L: 4380
			if (class60.cameraZ > var2) { // L: 4381
				class60.cameraZ = var2;
			}
		}

		if (class60.cameraZ > var2) { // L: 4383
			class60.cameraZ -= (class60.cameraZ - var2) * class191.field1983 / 1000 + VarpDefinition.field1879; // L: 4384
			if (class60.cameraZ < var2) { // L: 4385
				class60.cameraZ = var2;
			}
		}

	} // L: 4387

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldb;I)Z",
		garbageValue = "1562370845"
	)
	static boolean method7063(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5451
			return false;
		} else {
			boolean var1;
			if (SoundCache.localPlayer == var0) { // L: 5452
				var1 = (Client.drawPlayerNames & 8) != 0; // L: 5466
				return var1; // L: 5468
			} else {
				var1 = Canvas.method320() || class325.method6119() && var0.method2405(); // L: 5453
				if (!var1) { // L: 5454
					boolean var2 = (Client.drawPlayerNames & 2) != 0; // L: 5457
					var1 = var2 && var0.method2408(); // L: 5459
				}

				return var1; // L: 5461
			}
		}
	}
}
