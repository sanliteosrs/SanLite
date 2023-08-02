import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("LoginPacket")
public class LoginPacket implements class294 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	public static final LoginPacket field3341;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final LoginPacket field3340;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	public static final LoginPacket field3342;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	public static final LoginPacket field3343;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	public static final LoginPacket field3345;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final LoginPacket field3344;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Llx;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 702740567
	)
	@Export("id")
	public final int id;

	static {
		field3341 = new LoginPacket(14, 0); // L: 5
		field3340 = new LoginPacket(15, 4); // L: 6
		field3342 = new LoginPacket(16, -2); // L: 7
		field3343 = new LoginPacket(18, -2); // L: 8
		field3345 = new LoginPacket(19, -2); // L: 9
		field3344 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = class138.method3096(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	} // L: 19

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27
}
