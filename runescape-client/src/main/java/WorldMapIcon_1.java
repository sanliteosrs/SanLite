import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1450931479
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -448614677
	)
	@Export("element")
	int element;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -229828633
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1283382419
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;ILjc;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232242674"
	)
	@Export("init")
	void init() {
		this.element = class10.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class165.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class165.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "45"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lkm;",
		garbageValue = "-1023557554"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2127260294"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1490832213"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "403847596"
	)
	public static void method4578() {
		class330.field3585.clear(); // L: 229
	} // L: 230

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1183965945"
	)
	static String method4580(int var0) {
		if (var0 < 0) { // L: 10920
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 10921 10922
		}
	}
}
