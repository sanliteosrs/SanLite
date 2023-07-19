import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ai")
	@Export("text")
	String text;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1895422489
	)
	@Export("width")
	int width;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1296718231
	)
	@Export("height")
	int height;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjl;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14
}
