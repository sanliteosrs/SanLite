import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lgg;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -731625705
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Ignored_cached")
	static EvictingDualNodeHashTable Ignored_cached;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -640773699
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -419355367
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1313100289
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("av")
	@Export("name")
	public String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1782190655
	)
	public int field1891;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2142550135
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("au")
	public boolean field1896;
	@ObfuscatedName("ah")
	public boolean field1900;
	@ObfuscatedName("az")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ax")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ac")
	int[] field1895;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1897252869
	)
	int field1894;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1911514097
	)
	int field1902;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2063216183
	)
	int field1903;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 367877827
	)
	int field1901;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("at")
	int[] field1907;
	@ObfuscatedName("af")
	byte[] field1908;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1450163917
	)
	@Export("category")
	public int category;

	static {
		Ignored_cached = new EvictingDualNodeHashTable(256); // L: 16
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1; // L: 18
		this.sprite2 = -1; // L: 19
		this.textSize = 0; // L: 22
		this.field1896 = true; // L: 24
		this.field1900 = false; // L: 25
		this.menuActions = new String[5]; // L: 26
		this.field1894 = Integer.MAX_VALUE; // L: 29
		this.field1902 = Integer.MAX_VALUE; // L: 30
		this.field1903 = Integer.MIN_VALUE; // L: 31
		this.field1901 = Integer.MIN_VALUE; // L: 32
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered; // L: 33
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered; // L: 34
		this.category = -1; // L: 37
		this.objectId = var1; // L: 40
	} // L: 41

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "891006214"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 52
			if (var2 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var2); // L: 54
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "1390831493"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 59
			this.sprite1 = var1.method9602();
		} else if (var2 == 2) { // L: 60
			this.sprite2 = var1.method9602();
		} else if (var2 == 3) { // L: 61
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 62
			this.field1891 = var1.readMedium();
		} else if (var2 == 5) { // L: 63
			var1.readMedium(); // L: 64
		} else if (var2 == 6) { // L: 66
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) { // L: 67
				var6 = var1.readUnsignedByte(); // L: 68
				if ((var6 & 1) == 0) { // L: 69
					this.field1896 = false;
				}

				if ((var6 & 2) == 2) { // L: 70
					this.field1900 = true;
				}
			} else if (var2 == 8) { // L: 72
				var1.readUnsignedByte(); // L: 73
			} else if (var2 >= 10 && var2 <= 14) { // L: 75
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) { // L: 76
				var6 = var1.readUnsignedByte(); // L: 77
				this.field1895 = new int[var6 * 2]; // L: 78

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) { // L: 79
					this.field1895[var4] = var1.readShort();
				}

				var1.readInt(); // L: 80
				var4 = var1.readUnsignedByte(); // L: 81
				this.field1907 = new int[var4]; // L: 82

				int var5;
				for (var5 = 0; var5 < this.field1907.length; ++var5) { // L: 83
					this.field1907[var5] = var1.readInt();
				}

				this.field1908 = new byte[var6]; // L: 84

				for (var5 = 0; var5 < var6; ++var5) { // L: 85
					this.field1908[var5] = var1.readByte();
				}
			} else if (var2 != 16) { // L: 87
				if (var2 == 17) { // L: 88
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) { // L: 89
					var1.method9602(); // L: 90
				} else if (var2 == 19) { // L: 92
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) { // L: 93
					var1.readInt(); // L: 94
				} else if (var2 == 22) { // L: 96
					var1.readInt(); // L: 97
				} else if (var2 == 23) { // L: 99
					var1.readUnsignedByte(); // L: 100
					var1.readUnsignedByte(); // L: 101
					var1.readUnsignedByte(); // L: 102
				} else if (var2 == 24) { // L: 104
					var1.readShort(); // L: 105
					var1.readShort(); // L: 106
				} else if (var2 == 25) { // L: 108
					var1.method9602(); // L: 109
				} else if (var2 == 28) { // L: 111
					var1.readUnsignedByte(); // L: 112
				} else if (var2 == 29) { // L: 114
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1970, HorizontalAlignment.field1976}; // L: 117
					this.horizontalAlignment = (HorizontalAlignment)class210.findEnumerated(var3, var1.readUnsignedByte()); // L: 119
				} else if (var2 == 30) { // L: 121
					this.verticalAlignment = (VerticalAlignment)class210.findEnumerated(AbstractWorldMapIcon.method5050(), var1.readUnsignedByte()); // L: 122
				}
			}
		}

	} // L: 125

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1010949943"
	)
	public void method3584() {
		if (this.field1895 != null) { // L: 128
			for (int var1 = 0; var1 < this.field1895.length; var1 += 2) { // L: 129
				if (this.field1895[var1] < this.field1894) { // L: 130
					this.field1894 = this.field1895[var1];
				} else if (this.field1895[var1] > this.field1903) { // L: 131
					this.field1903 = this.field1895[var1];
				}

				if (this.field1895[var1 + 1] < this.field1902) { // L: 132
					this.field1902 = this.field1895[var1 + 1];
				} else if (this.field1895[var1 + 1] > this.field1901) {
					this.field1901 = this.field1895[var1 + 1]; // L: 133
				}
			}
		}

	} // L: 136

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvg;",
		garbageValue = "-1473839283"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1; // L: 139
		return this.getSprite(var2); // L: 140
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lvg;",
		garbageValue = "457669942"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) { // L: 144
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)Ignored_cached.get((long)var1); // L: 145
			if (var2 != null) { // L: 146
				return var2;
			} else {
				var2 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0); // L: 147
				if (var2 != null) { // L: 148
					Ignored_cached.put(var2, (long)var1); // L: 149
				}

				return var2; // L: 151
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8888"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId; // L: 155
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1023089861"
	)
	static void method3595() {
		Client.mouseLastLastPressedTimeMillis = 1L; // L: 2861
		if (Client.mouseRecorder != null) { // L: 2862
			Client.mouseRecorder.index = 0; // L: 2863
		}

		class498.hasFocus = true; // L: 2865
		Client.field522 = true; // L: 2866
		Client.field744 = -1L; // L: 2867
		class36.reflectionChecks = new IterableNodeDeque(); // L: 2869
		Client.packetWriter.clearBuffer(); // L: 2871
		Client.packetWriter.packetBuffer.offset = 0; // L: 2872
		Client.packetWriter.serverPacket = null; // L: 2873
		Client.packetWriter.field1462 = null; // L: 2874
		Client.packetWriter.field1459 = null; // L: 2875
		Client.packetWriter.field1464 = null; // L: 2876
		Client.packetWriter.serverPacketLength = 0; // L: 2877
		Client.packetWriter.field1457 = 0; // L: 2878
		Client.rebootTimer = 0; // L: 2879
		Client.logoutTimer = 0; // L: 2880
		Client.field524 = 0; // L: 2881
		Client.menuOptionsCount = 0; // L: 2883
		Client.isMenuOpen = false; // L: 2884
		MouseHandler.MouseHandler_idleCycles = 0; // L: 2887
		HealthBarUpdate.method2528(); // L: 2889
		Client.isItemSelected = 0; // L: 2890
		Client.isSpellSelected = false; // L: 2891
		Client.soundEffectCount = 0; // L: 2892
		Client.camAngleY = 0; // L: 2893
		Client.oculusOrbState = 0; // L: 2894
		class485.field5030 = null; // L: 2895
		Client.minimapState = 0; // L: 2896
		Client.field632 = -1; // L: 2897
		Client.field752 = 0; // L: 2898
		Client.field753 = 0; // L: 2899
		Client.playerAttackOption = AttackOption.field1382; // L: 2900
		Client.npcAttackOption = AttackOption.field1382; // L: 2901
		class511.field5137.method2677(); // L: 2902
		class135.friendSystem.clear(); // L: 2903
		if (VarpDefinition.field1874 > 5000) { // L: 2904
		}

		int var0;
		if (Client.field739) { // L: 2905
			Arrays.fill(Varps.Varps_temp, 0); // L: 2907
			Arrays.fill(Varps.Varps_main, 0); // L: 2908
		} else {
			for (var0 = 0; var0 < VarpDefinition.field1874; ++var0) { // L: 2912
				VarpDefinition var1 = MilliClock.VarpDefinition_get(var0); // L: 2913
				if (var1 != null) { // L: 2914
					Varps.Varps_temp[var0] = 0; // L: 2915
					Varps.Varps_main[var0] = 0; // L: 2916
				}
			}
		}

		if (Archive.varcs != null) { // L: 2920
			Archive.varcs.clearTransient();
		}

		Client.followerIndex = -1; // L: 2921
		if (Client.rootInterface != -1) { // L: 2922
			ModeWhere.field4649.method6512(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2923
			ArchiveDiskActionHandler.closeInterface(var2, true); // L: 2924
		}

		Client.rootInterface = -1; // L: 2926
		Client.interfaceParents = new NodeHashTable(8); // L: 2927
		Client.meslayerContinueWidget = null; // L: 2928
		Client.menuOptionsCount = 0; // L: 2930
		Client.isMenuOpen = false; // L: 2931
		Client.playerAppearance.method6541((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1); // L: 2933

		for (var0 = 0; var0 < 8; ++var0) { // L: 2934
			Client.field686[var0] = null; // L: 2935
			Client.field638[var0] = false; // L: 2936
		}

		ItemContainer.itemContainers = new NodeHashTable(32); // L: 2939
		Client.field514 = true; // L: 2941

		for (var0 = 0; var0 < 100; ++var0) { // L: 2942
			Client.field721[var0] = true;
		}

		class333.method6367(); // L: 2943
		Decimator.friendsChatManager = null; // L: 2944
		class142.guestClanSettings = null; // L: 2945
		Arrays.fill(Client.currentClanSettings, (Object)null); // L: 2946
		class276.guestClanChannel = null; // L: 2947
		Arrays.fill(Client.currentClanChannels, (Object)null); // L: 2948

		for (var0 = 0; var0 < 8; ++var0) { // L: 2949
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class252.grandExchangeEvents = null; // L: 2950
	} // L: 2951
}
