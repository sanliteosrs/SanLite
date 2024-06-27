import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mj")
public class class317 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "766976833"
	)
	static int method6089(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1039
			var0 -= 1000; // L: 1040
			var3 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 1041
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1043
		}

		TriBool.invalidateWidget(var3); // L: 1044
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1045
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1065
				var3.modelType = 2; // L: 1066
				var3.modelId = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1067
				return 1; // L: 1068
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1070
				var3.modelType = 3; // L: 1071
				var3.modelId = SoundCache.localPlayer.appearance.getChatHeadId(); // L: 1072
				return 1; // L: 1073
			} else if (var0 == 1207) { // L: 1075
				boolean var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 1076
				MusicPatchPcmStream.method6417(var3, SoundCache.localPlayer.appearance, var7); // L: 1077
				return 1; // L: 1078
			} else if (var0 == 1208) { // L: 1080
				var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1081
				if (var3.field3838 == null) { // L: 1082
					throw new RuntimeException(""); // L: 1083
				} else {
					class233.method4446(var3, var4); // L: 1085
					return 1; // L: 1086
				}
			} else if (var0 == 1209) { // L: 1088
				class130.Interpreter_intStackSize -= 2; // L: 1089
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 1090
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 1091
				if (var3.field3838 == null) { // L: 1092
					throw new RuntimeException(""); // L: 1093
				} else {
					class95.method2467(var3, var4, var5); // L: 1095
					return 1; // L: 1096
				}
			} else if (var0 == 1210) { // L: 1098
				var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 1099
				if (var3.field3838 == null) { // L: 1100
					throw new RuntimeException(""); // L: 1101
				} else {
					class225.method4302(var3, SoundCache.localPlayer.appearance.field3775, var4); // L: 1103
					return 1; // L: 1104
				}
			} else {
				return 2; // L: 1106
			}
		} else {
			class130.Interpreter_intStackSize -= 2; // L: 1046
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 1047
			var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 1048
			var3.itemId = var4; // L: 1049
			var3.itemQuantity = var5; // L: 1050
			ItemComposition var6 = class164.ItemComposition_get(var4); // L: 1051
			var3.modelAngleX = var6.xan2d; // L: 1052
			var3.modelAngleY = var6.yan2d; // L: 1053
			var3.modelAngleZ = var6.zan2d; // L: 1054
			var3.modelOffsetX = var6.offsetX2d; // L: 1055
			var3.modelOffsetY = var6.offsetY2d; // L: 1056
			var3.modelZoom = var6.zoom2d; // L: 1057
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1058
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 1059
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1060
			}

			if (var3.field3887 > 0) { // L: 1061
				var3.modelZoom = var3.modelZoom * 32 / var3.field3887;
			} else if (var3.rawWidth > 0) { // L: 1062
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1063
		}
	}
}
