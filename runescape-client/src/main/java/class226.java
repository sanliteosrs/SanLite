import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("il")
public class class226 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class226 field2423;
	@ObfuscatedName("ad")
	Map field2426;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1357104911
	)
	int field2424;

	static {
		field2423 = new class226(); // L: 14
	}

	class226() {
		this.field2426 = new HashMap(); // L: 12
		this.field2424 = 0; // L: 13
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILea;I)V",
		garbageValue = "-665193983"
	)
	void method4317(JSONObject var1, int var2, UrlRequester var3) {
		this.field2426.clear(); // L: 19

		JSONObject var4;
		try {
			var4 = var1; // L: 22
			this.field2424 = var2; // L: 23
			var1.getLong("lastfullsyncat"); // L: 24
			var1.getLong("lastcardupdatedat"); // L: 25
		} catch (Exception var7) { // L: 27
			return; // L: 28
		}

		try {
			this.method4313(var4.getJSONArray("crmcomponents"), this.field2424, var3); // L: 31
		} catch (Exception var6) { // L: 33
		}
	} // L: 34 36

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILea;B)V",
		garbageValue = "-2"
	)
	void method4313(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) { // L: 39
			for (int var4 = 0; var4 < var1.length(); ++var4) { // L: 40
				JSONObject var5 = var1.getJSONObject(var4); // L: 41
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) { // L: 42 45
					String var6 = var5.getString("platform"); // L: 48
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) { // L: 49
						class224 var7 = new class224(); // L: 52

						try {
							var7.method4277(var5, var2, var3); // L: 54
						} catch (Exception var9) { // L: 56
						}

						if (!var7.field2403.isEmpty()) { // L: 57
							String var8 = var5.getString("location"); // L: 58
							this.field2426.put(var8, var7); // L: 59
						}
					}
				}
			}

			this.field2426 = this.method4309(); // L: 62
			WorldMapData_1.method4861(); // L: 63
		}
	} // L: 64

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "0"
	)
	Map method4309() {
		HashMap var1 = new HashMap(); // L: 67
		ArrayList var2 = new ArrayList(); // L: 68
		var2.addAll(this.field2426.entrySet()); // L: 69
		boolean var3 = false; // L: 70

		while (!var3) { // L: 72
			var3 = true; // L: 73

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) { // L: 74
				if (((class224)((Entry)var2.get(var7)).getValue()).method4289() > ((class224)((Entry)var2.get(var7 + 1)).getValue()).method4289()) { // L: 75
					Entry var4 = (Entry)var2.get(var7); // L: 76
					var2.set(var7, var2.get(var7 + 1)); // L: 77
					var2.set(var7 + 1, var4); // L: 78
					var3 = false; // L: 79
				}
			}
		}

		Iterator var5 = var2.iterator(); // L: 83

		while (var5.hasNext()) {
			Entry var6 = (Entry)var5.next(); // L: 84
			var1.put(var6.getKey(), var6.getValue()); // L: 86
		}

		return var1; // L: 89
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Lif;",
		garbageValue = "8221"
	)
	class224 method4310(String var1) {
		return (class224)this.field2426.get(var1); // L: 93
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "([BS)[B",
		garbageValue = "4008"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 383
		int var2 = var1.readUnsignedByte(); // L: 384
		int var3 = var1.readInt(); // L: 385
		if (var3 < 0 || AbstractArchive.field4542 != 0 && var3 > AbstractArchive.field4542) { // L: 386
			throw new RuntimeException(); // L: 387
		} else if (var2 == 0) { // L: 389
			byte[] var6 = new byte[var3]; // L: 390
			var1.readBytes(var6, 0, var3); // L: 391
			return var6; // L: 392
		} else {
			int var4 = var1.readInt(); // L: 395
			if (var4 >= 0 && (AbstractArchive.field4542 == 0 || var4 <= AbstractArchive.field4542)) { // L: 396
				byte[] var5 = new byte[var4]; // L: 399
				if (var2 == 1) { // L: 400
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 401
				}

				return var5; // L: 402
			} else {
				throw new RuntimeException(); // L: 397
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "-1758350391"
	)
	static void method4318(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64; // L: 8935
		var2 = var2 * 128 + 64; // L: 8936
		var3 = var3 * 128 + 64; // L: 8937
		var4 = var4 * 128 + 64; // L: 8938
		Projectile var14 = new Projectile(var6, var0, var1, var2, class169.method3519(class20.field91, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8); // L: 8939
		var14.setDestination(var3, var4, class169.method3519(class20.field91, var3, var4, var0) - var8, var9 + Client.cycle); // L: 8940
		class20.field91.field1324.addFirst(var14); // L: 8941
	} // L: 8942
}
