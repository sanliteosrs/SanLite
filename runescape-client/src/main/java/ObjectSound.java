import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field856;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = -1235649789
	)
	static int field853;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1547628377
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1753203631
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -460372864
	)
	@Export("y")
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1813911287
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 749652693
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 835963461
	)
	int field845;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1143258933
	)
	int field846;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 591656919
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -502571839
	)
	int field849;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -139704035
	)
	int field850;
	@ObfuscatedName("ah")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -839235315
	)
	int field840;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 28

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1109055507"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 51
		ObjectComposition var2 = this.obj.transform(); // L: 52
		if (var2 != null) { // L: 53
			this.soundEffectId = var2.ambientSoundId; // L: 54
			this.field845 = var2.int7 * 16384; // L: 55
			this.field846 = var2.field2198 * 16384; // L: 56
			this.field849 = var2.int6; // L: 57
			this.field850 = var2.field2200; // L: 58
			this.soundEffectIds = var2.soundEffectIds; // L: 59
		} else {
			this.soundEffectId = -1; // L: 62
			this.field845 = 0; // L: 63
			this.field846 = 0; // L: 64
			this.field849 = 0; // L: 65
			this.field850 = 0; // L: 66
			this.soundEffectIds = null; // L: 67
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 69
			class238.pcmStreamMixer.removeSubStream(this.stream1); // L: 70
			this.stream1 = null; // L: 71
		}

	} // L: 73

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Lnx;",
		garbageValue = "-397184281"
	)
	static Widget method1976(Widget var0) {
		int var2 = ClanChannel.getWidgetFlags(var0); // L: 13350
		int var1 = var2 >> 17 & 7; // L: 13352
		int var3 = var1; // L: 13354
		if (var1 == 0) { // L: 13355
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 13356
				var0 = ModeWhere.field4649.method6519(var0.parentId); // L: 13357
				if (var0 == null) { // L: 13358
					return null;
				}
			}

			return var0; // L: 13360
		}
	}
}
