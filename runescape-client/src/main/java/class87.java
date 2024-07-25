import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public class class87 {
	@ObfuscatedName("ay")
	static String[] field1073;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)V",
		garbageValue = "3"
	)
	public static void method2374(AbstractArchive var0) {
		class537.field5294 = var0; // L: 19
	} // L: 20

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-17000"
	)
	static int method2373(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field869 - 7.0D) * 256.0D); // L: 4476
	}
}
