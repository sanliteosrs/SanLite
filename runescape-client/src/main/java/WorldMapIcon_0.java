import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -946439351
	)
	@Export("element")
	final int element;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1276537903
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -903074913
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;ILkm;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class165.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "45"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lkm;",
		garbageValue = "-1023557554"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2127260294"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1490832213"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}
}
