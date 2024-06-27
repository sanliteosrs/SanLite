import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	static Font field468;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	static Widget field466;
	@ObfuscatedName("aq")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 13678

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;I)I",
		garbageValue = "-1263083412"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 13681
			return 0;
		} else {
			if (this.filterWorlds) { // L: 13682
				if (Client.worldId == var1.world) { // L: 13683
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 13684
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 13686
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 13694
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 13690
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-2098483687"
	)
	static long method1234() {
		try {
			URL var0 = new URL(class68.method1248("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "18890283"
	)
	static void method1227() {
		if (VertexNormal.worldMap != null) { // L: 4852
			VertexNormal.worldMap.method9011(class511.field5137.field1318, (StudioGame.field4084.vmethod8670() >> 7) + class511.field5137.field1321, (StudioGame.field4084.vmethod8671() >> 7) + class511.field5137.field1323, false); // L: 4853
			VertexNormal.worldMap.loadCache(); // L: 4854
		}

	} // L: 4856

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4882
	}
}
