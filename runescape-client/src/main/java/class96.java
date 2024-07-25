import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public final class class96 extends Node {
	@ObfuscatedName("be")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("rq")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	static class486 field1171;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -197255023
	)
	static int field1188;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1826390675
	)
	int field1174;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1583811915
	)
	int field1172;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1220919723
	)
	int field1178;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 868871769
	)
	int field1177;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -617367559
	)
	int field1180;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1138524769
	)
	int field1176;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -541310443
	)
	int field1185;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2086259071
	)
	int field1175;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 336431343
	)
	int field1179;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -544154603
	)
	int field1186;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 555173951
	)
	int field1181;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2057818687
	)
	int field1183;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 434863111
	)
	int field1184;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1480623259
	)
	int field1173;

	class96() {
		this.field1183 = 31; // L: 18
		this.field1184 = 0; // L: 19
		this.field1173 = -1; // L: 20
	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1778936841"
	)
	void method2474(int var1) {
		this.field1183 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-60"
	)
	boolean method2469(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1183 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1013652934"
	)
	static final void method2471() {
		class186.field1948.clear(); // L: 3133
		EnumComposition.method3678(); // L: 3135
		Messages.method2916(); // L: 3136
		class304.method6032(); // L: 3137
		class537.DBTableType_cache.clear(); // L: 3139
		EnumComposition.EnumDefinition_cached.clear(); // L: 3142
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 3145
		FloorUnderlayDefinition.field2086.clear(); // L: 3148
		HealthBarDefinition.NpcDefinition_cachedModels.clear(); // L: 3151
		HealthBarDefinition.field1931.clear(); // L: 3152
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 3155
		HitSplatDefinition.field2126.clear(); // L: 3156
		HitSplatDefinition.field2127.clear(); // L: 3157
		class176.field1865.clear(); // L: 3160
		KitDefinition.KitDefinition_cached.clear(); // L: 3163
		class354.method6536(); // L: 3165
		class488.method8816(); // L: 3166
		class19.method285(); // L: 3167
		class111.method2848(); // L: 3168
		NPCComposition.NpcDefinition_cached.clear(); // L: 3170
		NPCComposition.HitSplatDefinition_cachedFonts.clear(); // L: 3171
		ItemComposition.ItemComposition_cached.clear(); // L: 3174
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 3175
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 3176
		ParamComposition.ParamComposition_cached.clear(); // L: 3179
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 3182
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 3183
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 3184
		WorldMapManager.method4829(); // L: 3186
		StructComposition.StructDefinition_cached.clear(); // L: 3188
		class144.method3244(); // L: 3190
		if (class176.field1863 != null) { // L: 3191
			class176.field1863.method9369();
		}

		if (PlayerType.field4444 != null) { // L: 3192
			PlayerType.field4444.method9369();
		}

		class193.field2036.clear(); // L: 3194
		class195.field2051.clear(); // L: 3197
		class18.method279(); // L: 3199
		class180.field1882.clear(); // L: 3201
		AbstractSocket.method8716(); // L: 3203
		class178.field1872.clear(); // L: 3205
		class201.field2110.clear(); // L: 3208
		class91.method2394(); // L: 3210
		class199.field2099.clear(); // L: 3212
		Client.Widget_cachedModels.clear(); // L: 3214
		Client.field797.clear(); // L: 3215
		GraphicsObject.method2154(); // L: 3216
		if (ModeWhere.field4649 != null) { // L: 3217
			ModeWhere.field4649.method6516();
		}

		if (Rasterizer3D.field2876.Rasterizer3D_textureLoader != null) { // L: 3218
			((TextureProvider)Rasterizer3D.field2876.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear(); // L: 3220
		Client.field795.method8421(); // L: 3222
		if (class68.field497 != null) { // L: 3223
			class68.field497.clearFiles();
		}

		if (class498.field5069 != null) { // L: 3224
			class498.field5069.clearFiles();
		}

		if (WorldMapSection1.field2728 != null) { // L: 3225
			WorldMapSection1.field2728.clearFiles();
		}

		if (class476.archive12 != null) { // L: 3226
			class476.archive12.clearFiles();
		}

		if (ApproximateRouteStrategy.archive2 != null) { // L: 3227
			ApproximateRouteStrategy.archive2.clearFiles();
		}

		if (AbstractWorldMapData.field2675 != null) { // L: 3228
			AbstractWorldMapData.field2675.clearFiles();
		}

		if (VarpDefinition.field1881 != null) { // L: 3229
			VarpDefinition.field1881.clearFiles();
		}

		if (ChatChannel.archive13 != null) { // L: 3230
			ChatChannel.archive13.clearFiles();
		}

		if (LoginScreenAnimation.field1296 != null) { // L: 3231
			LoginScreenAnimation.field1296.clearFiles();
		}

		if (ObjectSound.field856 != null) { // L: 3232
			ObjectSound.field856.clearFiles();
		}

		if (class424.archive4 != null) { // L: 3233
			class424.archive4.clearFiles();
		}

		if (class388.field4545 != null) { // L: 3234
			class388.field4545.clearFiles();
		}

		if (class157.field1756 != null) { // L: 3235
			class157.field1756.clearFiles();
		}

		if (class199.field2100 != null) { // L: 3236
			class199.field2100.clearFiles();
		}

		if (WorldMapSectionType.field2665 != null) { // L: 3237
			WorldMapSectionType.field2665.clearFiles();
		}

		if (class276.field2872 != null) { // L: 3238
			class276.field2872.clearFiles();
		}

		if (class7.field29 != null) { // L: 3239
			class7.field29.clearFiles();
		}

		if (class195.field2052 != null) { // L: 3240
			class195.field2052.clearFiles();
		}

		if (class239.field2524 != null) { // L: 3241
			class239.field2524.clearFiles();
		}

		if (PlayerComposition.field3785 != null) { // L: 3242
			PlayerComposition.field3785.clearFiles();
		}

		if (class151.field1715 != null) { // L: 3243
			class151.field1715.clearFiles();
		}

		if (class145.field1684 != null) { // L: 3244
			class145.field1684.clearFiles();
		}

	} // L: 3245

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "2068160193"
	)
	static final void method2468(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ModeWhere.field4649.method6514(var0)) { // L: 11242
			class433.field4761 = null; // L: 11249
			WorldMapDecoration.drawInterface(ModeWhere.field4649.field3740[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 11250
			if (class433.field4761 != null) { // L: 11251
				WorldMapDecoration.drawInterface(class433.field4761, -1412584499, var1, var2, var3, var4, class273.field2819, class143.field1673, var7); // L: 11252
				class433.field4761 = null; // L: 11253
			}

		} else {
			if (var7 != -1) { // L: 11243
				Client.field721[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 11245
					Client.field721[var8] = true;
				}
			}

		}
	} // L: 11247 11255
}
