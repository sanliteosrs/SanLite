import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("az")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("ax")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("ac")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lvp;Lvp;IZI)V",
		garbageValue = "-580518776"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lvp;ZI)V",
		garbageValue = "-242900480"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method9602(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbs;I)V",
		garbageValue = "2079882661"
	)
	static void method5107(GameEngine var0) {
		class231 var1 = Client.field728; // L: 1987
		class231 var2 = var1; // L: 1989

		while (var2.method4382()) { // L: 1990
			if (var2.field2460 == 13) { // L: 1991
				Login.worldSelectOpen = false; // L: 1993
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1994
				class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1995
				ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18); // L: 1996
				return; // L: 1998
			}

			if (var2.field2460 == 96) { // L: 2000
				if (Login.worldSelectPage > 0 && class31.worldSelectLeftSprite != null) { // L: 2001
					--Login.worldSelectPage; // L: 2002
				}
			} else if (var2.field2460 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Calendar.worldSelectRightSprite != null) { // L: 2005 2006
				++Login.worldSelectPage; // L: 2007
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 2011
			int var3 = Login.xPadding + 280; // L: 2012
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2013
				HealthBar.changeWorldSelectSorting(0, 0); // L: 2014
				return; // L: 2015
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2017
				HealthBar.changeWorldSelectSorting(0, 1); // L: 2018
				return; // L: 2019
			}

			int var4 = Login.xPadding + 390; // L: 2021
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2022
				HealthBar.changeWorldSelectSorting(1, 0); // L: 2023
				return; // L: 2024
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2026
				HealthBar.changeWorldSelectSorting(1, 1); // L: 2027
				return; // L: 2028
			}

			int var5 = Login.xPadding + 500; // L: 2030
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2031
				HealthBar.changeWorldSelectSorting(2, 0); // L: 2032
				return; // L: 2033
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2035
				HealthBar.changeWorldSelectSorting(2, 1); // L: 2036
				return; // L: 2037
			}

			int var6 = Login.xPadding + 610; // L: 2039
			if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2040
				HealthBar.changeWorldSelectSorting(3, 0); // L: 2041
				return; // L: 2042
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 2044
				HealthBar.changeWorldSelectSorting(3, 1); // L: 2045
				return; // L: 2046
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 2048
				Login.worldSelectOpen = false; // L: 2050
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2051
				class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2052
				ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18); // L: 2053
				return; // L: 2055
			}

			if (Login.hoveredWorldIndex != -1) { // L: 2057
				World var7 = class357.World_worlds[Login.hoveredWorldIndex]; // L: 2058
				boolean var8 = class191.method3699(Client.worldProperties, class542.field5331); // L: 2059
				boolean var9 = var7.isDeadman(); // L: 2060
				class4.field9 = var9; // L: 2061
				var7.field819 = var9 ? "beta" : var7.field819; // L: 2062
				ScriptEvent.changeWorld(var7); // L: 2063
				Login.worldSelectOpen = false; // L: 2065
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2066
				class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2067
				ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18); // L: 2068
				if (var9 != var8) { // L: 2070
					class36.method708(); // L: 2071
				}

				return; // L: 2073
			}

			if (Login.worldSelectPage > 0 && class31.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class31.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class1.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class1.canvasHeight / 2 + 50) { // L: 2075
				--Login.worldSelectPage; // L: 2076
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && Calendar.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class74.canvasWidth - Calendar.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class74.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class1.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class1.canvasHeight / 2 + 50) { // L: 2078
				++Login.worldSelectPage; // L: 2079
			}
		}

	} // L: 2082
}
