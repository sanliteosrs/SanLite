import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1624647145
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ag")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1572976237
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -361968561
	)
	int field2583;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -426935707
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -903805205
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1871336757
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1361976443
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 380817895
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("au")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("ah")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.field2583 = -16777216;
		this.zoom = -1; // L: 14
		this.origin = null; // L: 15
		this.regionLowX = Integer.MAX_VALUE; // L: 16
		this.regionHighX = 0; // L: 17
		this.regionLowY = Integer.MAX_VALUE; // L: 18
		this.regionHighY = 0; // L: 19
		this.isMain = false; // L: 20
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IS)V",
		garbageValue = "192"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 24
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 26
		this.origin = new Coord(var1.readInt()); // L: 27
		this.backGroundColor = var1.readInt(); // L: 28
		this.field2583 = var1.readInt(); // L: 29
		var1.readUnsignedByte(); // L: 30
		this.isMain = var1.readUnsignedByte() == 1; // L: 31
		this.zoom = var1.readUnsignedByte(); // L: 32
		int var3 = var1.readUnsignedByte(); // L: 33
		this.sections = new LinkedList(); // L: 34

		for (int var4 = 0; var4 < var3; ++var4) { // L: 35
			this.sections.add(this.readWorldMapSection(var1)); // L: 36
		}

		this.setBounds(); // L: 38
	} // L: 39

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)Lkd;",
		garbageValue = "-194688966"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 42
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE3}; // L: 45
		WorldMapSectionType var4 = (WorldMapSectionType)class210.findEnumerated(var3, var2); // L: 47
		Object var5 = null; // L: 48
		switch(var4.type) { // L: 49
		case 0:
			var5 = new class251(); // L: 54
			break; // L: 55
		case 1:
			var5 = new WorldMapSection1(); // L: 62
			break;
		case 2:
			var5 = new WorldMapSection2(); // L: 59
			break; // L: 60
		case 3:
			var5 = new WorldMapSection0(); // L: 51
			break;
		default:
			throw new IllegalStateException(""); // L: 57
		}

		((WorldMapSection)var5).read(var1); // L: 65
		return (WorldMapSection)var5; // L: 66
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "13"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 70

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 77
				return false; // L: 78
			}

			var5 = (WorldMapSection)var4.next(); // L: 71
		} while(!var5.containsCoord(var1, var2, var3)); // L: 73

		return true; // L: 74
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1869476820"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 82
		int var4 = var2 / 64; // L: 83
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 84
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 85
				Iterator var5 = this.sections.iterator(); // L: 86

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 94
					}

					var6 = (WorldMapSection)var5.next(); // L: 87
				} while(!var6.containsPosition(var1, var2)); // L: 89

				return true; // L: 90
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "304606071"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 98

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 105
				return null; // L: 106
			}

			var5 = (WorldMapSection)var4.next(); // L: 99
		} while(!var5.containsCoord(var1, var2, var3)); // L: 101

		return var5.getBorderTileLengths(var1, var2, var3); // L: 102
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lnl;",
		garbageValue = "-1586067659"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 110

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 118
			}

			var4 = (WorldMapSection)var3.next(); // L: 111
		} while(!var4.containsPosition(var1, var2)); // L: 113

		return var4.coord(var1, var2); // L: 114
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1283844709"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 122

		while (var1.hasNext()) { // L: 127
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 123
			var2.expandBounds(this); // L: 125
		}

	} // L: 128

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-337614921"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 131
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "208292224"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 135
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "32"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 139
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "22"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 143
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-752420167"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 147
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "611772049"
	)
	int method4693() {
		return this.field2583; // L: 151
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "79"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 155
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1949011067"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 159
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1968118485"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 163
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-201388180"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 167
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "23683"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 171
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1335921585"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 175
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2083894596"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 179
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-93"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 183
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lnl;",
		garbageValue = "32"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 187
	}

	@ObfuscatedName("ad")
	static double method4698(double var0, double var2, double var4) {
		return DevicePcmPlayerProvider.method313((var0 - var2) / var4) / var4; // L: 13
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	static void method4700() {
		if (class511.field5137 != null) { // L: 2112
			class511.field5137.field1316.method5451(class105.clientPreferences.method2569()); // L: 2113
		}

	} // L: 2115

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)V",
		garbageValue = "-480638389"
	)
	static final void method4699(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (!Client.isMenuOpen) { // L: 10885
			int var10 = var2; // L: 10887
			if (var2 >= 2000) { // L: 10889
				var10 = var2 - 2000;
			}

			boolean var11 = var10 == 16 || var10 == 17 || var10 >= 18 && var10 <= 22; // L: 10892
			boolean var12 = var11 || class221.method4235(var10); // L: 10894
			if (!var12) { // L: 10895
				boolean var13 = var10 == 1002 || var10 == 1003 || var10 == 1004; // L: 10898
				var12 = var13; // L: 10900
			}

			boolean var9 = var12 || var8 == -1 || SoundCache.localPlayer.field1147.field1328 == var8; // L: 10902
			if (var9) { // L: 10904
				if (Client.menuOptionsCount < 500) { // L: 10905
					Client.menuActions[Client.menuOptionsCount] = var0; // L: 10906
					Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10907
					Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10908
					Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10909
					Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10910
					Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10911
					Client.field763[Client.menuOptionsCount] = var6; // L: 10912
					Client.field653[Client.menuOptionsCount] = var8; // L: 10913
					Client.field528[Client.menuOptionsCount] = var7; // L: 10914
					++Client.menuOptionsCount; // L: 10915
				}

			}
		}
	} // L: 10917

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2024394882"
	)
	static final int method4653() {
		float var0 = 200.0F * ((float)class105.clientPreferences.method2578() - 0.5F); // L: 12874
		return 100 - Math.round(var0); // L: 12875
	}
}
