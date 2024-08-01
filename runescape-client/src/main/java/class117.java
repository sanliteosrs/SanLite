import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class117 extends UrlRequester {
	@ObfuscatedName("ap")
	final boolean field1476;

	public class117(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1476 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1132577463"
	)
	void vmethod2967(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label134: {
			label126: {
				try {
					label129: {
						var9 = true; // L: 21
						String var3 = var1.field1483.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2969(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1482 = UrlRequest.field1485; // L: 29
								var9 = false;
								break label129;
							}

							var2 = this.method2966(var1); // L: 26
						}

						this.method2943(var2, var1); // L: 32
						var9 = false;
						break label134;
					}
				} catch (IOException var10) { // L: 34
					var1.field1482 = UrlRequest.field1485; // L: 35
					var9 = false;
					break label126;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) { // L: 38
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) { // L: 39
					HttpURLConnection var4 = (HttpURLConnection)var2; // L: 40
					var4.disconnect(); // L: 41
				}

				return; // L: 30
			}

			if (var2 != null && var2 instanceof HttpURLConnection) {
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return; // L: 45
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lez;B)Ljava/net/URLConnection;",
		garbageValue = "-64"
	)
	URLConnection method2969(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1483.openConnection(); // L: 48
		this.method2941(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lez;B)Ljava/net/URLConnection;",
		garbageValue = "-122"
	)
	URLConnection method2966(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1483.openConnection(); // L: 54
		if (!this.field1476) { // L: 55
			var2.setSSLSocketFactory(class15.method197()); // L: 56
		}

		this.method2941(var2); // L: 58
		return var2; // L: 59
	}
}
