import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lbv;",
		garbageValue = "52118827"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("aq")
	static double method313(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}
}
