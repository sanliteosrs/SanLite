import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bu")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static Fonts field236;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 568504197
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2002955959
	)
	@Export("size")
	int size;
	@ObfuscatedName("ag")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ak")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ap")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("an")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("aj")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("av")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvf;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 100
			var2 = (RunException)var0; // L: 101
			var2.message = var2.message + ' ' + var1; // L: 102
		} else {
			var2 = new RunException(var0, var1); // L: 104
		}

		return var2; // L: 105
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "961864563"
	)
	static int method713(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4552
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Strings.loadWorlds() ? 1 : 0; // L: 4553
			return 1; // L: 4554
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4556
				var9 = TextureProvider.worldListStart(); // L: 4557
				if (var9 != null) { // L: 4558
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.id; // L: 4559
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.properties; // L: 4560
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var9.activity; // L: 4561
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.location; // L: 4562
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.population; // L: 4563
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var9.host; // L: 4564
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4567
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4568
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4569
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4570
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4571
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4572
				}

				return 1; // L: 4574
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4576
				var9 = World.getNextWorldListWorld(); // L: 4577
				if (var9 != null) { // L: 4578
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.id; // L: 4579
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.properties; // L: 4580
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var9.activity; // L: 4581
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.location; // L: 4582
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var9.population; // L: 4583
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var9.host; // L: 4584
				} else {
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4587
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4588
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4589
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4590
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4591
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4592
				}

				return 1; // L: 4594
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4596
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4597
					var7 = null; // L: 4598

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4599
						if (var3 == class357.World_worlds[var8].id) { // L: 4600
							var7 = class357.World_worlds[var8]; // L: 4601
							break;
						}
					}

					if (var7 != null) { // L: 4605
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.id; // L: 4606
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.properties; // L: 4607
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.activity; // L: 4608
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.location; // L: 4609
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.population; // L: 4610
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.host; // L: 4611
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4614
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4615
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4616
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4617
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4618
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4619
					}

					return 1; // L: 4621
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4623
					class130.Interpreter_intStackSize -= 4; // L: 4624
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4625
					boolean var10 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1] == 1; // L: 4626
					var8 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 4627
					boolean var6 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3] == 1; // L: 4628
					class171.sortWorldList(var3, var10, var8, var6); // L: 4629
					return 1; // L: 4630
				} else if (var0 != 6511) { // L: 4632
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4653
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1; // L: 4654
						return 1; // L: 4655
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4657
							class130.Interpreter_intStackSize -= 2; // L: 4658
							var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4659
							var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4660
							var5 = ApproximateRouteStrategy.getParamDefinition(var4); // L: 4661
							if (var5.isString()) { // L: 4662
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class76.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4663
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class76.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4666
							}

							return 1; // L: 4668
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4670
							class130.Interpreter_intStackSize -= 2; // L: 4671
							var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4672
							var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4673
							var5 = ApproximateRouteStrategy.getParamDefinition(var4); // L: 4674
							if (var5.isString()) { // L: 4675
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class10.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4676
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class10.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4679
							}

							return 1; // L: 4681
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4683
							class130.Interpreter_intStackSize -= 2; // L: 4684
							var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4685
							var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4686
							var5 = ApproximateRouteStrategy.getParamDefinition(var4); // L: 4687
							if (var5.isString()) { // L: 4688
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = class164.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4689
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class164.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4692
							}

							return 1; // L: 4694
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4696
							class130.Interpreter_intStackSize -= 2; // L: 4697
							var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4698
							var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4699
							var5 = ApproximateRouteStrategy.getParamDefinition(var4); // L: 4700
							if (var5.isString()) { // L: 4701
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Client.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4702
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4705
							}

							return 1; // L: 4707
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4709
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4710
							return 1; // L: 4711
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4713
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.clientType; // L: 4714
							return 1; // L: 4715
						} else if (var0 == 6520) { // L: 4717
							return 1; // L: 4718
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4720
							return 1; // L: 4721
						} else if (var0 == 6522) { // L: 4723
							--class337.Interpreter_stringStackSize; // L: 4724
							--class130.Interpreter_intStackSize; // L: 4725
							return 1; // L: 4726
						} else if (var0 == 6523) { // L: 4728
							--class337.Interpreter_stringStackSize; // L: 4729
							--class130.Interpreter_intStackSize; // L: 4730
							return 1; // L: 4731
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4733
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4734
							return 1; // L: 4735
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4737
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 4738
							return 1; // L: 4739
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4741
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 1; // L: 4742
							return 1; // L: 4743
						} else if (var0 == 6527) { // L: 4745
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.field506; // L: 4746
							return 1; // L: 4747
						} else {
							return 2; // L: 4749
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4633
					if (var3 >= 0 && var3 < World.World_count) { // L: 4634
						var7 = class357.World_worlds[var3]; // L: 4635
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.id; // L: 4636
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.properties; // L: 4637
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.activity; // L: 4638
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.location; // L: 4639
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7.population; // L: 4640
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.host; // L: 4641
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4644
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4645
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4646
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4647
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4648
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4649
					}

					return 1; // L: 4651
				}
			}
		}
	}
}
