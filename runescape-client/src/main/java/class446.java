import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
public class class446 extends class444 {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field4821;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field4818;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field4819;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field4820;

	@ObfuscatedSignature(
		descriptor = "(Lro;Lok;Lok;Lok;)V"
	)
	public class446(class444 var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1); // L: 16
		this.field4818 = var2; // L: 17
		this.field4819 = var3; // L: 18
		this.field4820 = var4; // L: 19
		super.field4814 = "LoadSongTask"; // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		int var1 = 0; // L: 25
		Iterator var2 = class330.field3584.iterator(); // L: 26

		while (true) {
			while (var2.hasNext()) {
				class342 var3 = (class342)var2.next(); // L: 27
				if (var3 != null && var3.field3713.field3627 > 1 && var3.field3713.method6194()) { // L: 29
					this.method8253("Attempted to load patches of already loading midiplayer!"); // L: 30
					return true; // L: 31
				}

				if (var3 != null && !var3.field3709) { // L: 33
					try {
						if (var3.field3708 != null && var3.field3716 != -1 && var3.field3705 != -1) { // L: 38
							if (var3.field3703 == null) { // L: 42
								var3.field3703 = MusicTrack.readTrack(var3.field3708, var3.field3716, var3.field3705); // L: 43
								if (var3.field3703 == null) { // L: 44
									continue;
								}
							}

							if (var3.field3714 == null) { // L: 48
								var3.field3714 = new SoundCache(this.field4820, this.field4819); // L: 49
							}

							if (var3.field3713.method6188(var3.field3703, this.field4818, var3.field3714)) { // L: 51
								++var1; // L: 52
								var3.field3709 = true; // L: 53
								var3.field3713.method6189(); // L: 54
							}
						} else {
							++var1; // L: 39
						}
					} catch (Exception var5) { // L: 57
						FriendsChatManager.RunException_sendStackTrace((String)null, var5); // L: 58
						this.method8253(var5.getMessage()); // L: 59
						return true; // L: 60
					}
				} else {
					++var1; // L: 34
				}
			}

			if (var1 == class330.field3584.size()) { // L: 64
				return true; // L: 65
			}

			return false; // L: 67
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(B)Ltr;",
		garbageValue = "27"
	)
	static class506 method8275() {
		return KeyHandler.field140; // L: 781
	}
}
