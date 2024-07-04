import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class191 {
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -724193621
	)
	static int field1983;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 270217235349849859L
	)
	public long field1981;
	@ObfuscatedName("ad")
	int[] field1978;
	@ObfuscatedName("ag")
	short[] field1979;
	@ObfuscatedName("ak")
	short[] field1982;
	@ObfuscatedName("ap")
	public boolean field1980;

	public class191(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field1980 = false; // L: 8
		this.field1981 = var1;
		this.field1978 = var3; // L: 12
		this.field1979 = var4; // L: 13
		this.field1982 = var5; // L: 14
		this.field1980 = var6; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILuy;I)Z",
		garbageValue = "1547081377"
	)
	public static boolean method3699(int var0, class542 var1) {
		return (var0 & var1.rsOrdinal()) != 0; // L: 11
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1184142435"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}
}
