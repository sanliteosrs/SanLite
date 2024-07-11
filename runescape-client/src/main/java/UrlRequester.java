import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("aq")
	final Thread field1473;
	@ObfuscatedName("ad")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ag")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1686353651
	)
	int field1471;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1473 = new Thread(this); // L: 21
		this.field1473.setPriority(1); // L: 22
		this.field1473.start(); // L: 23
		this.field1471 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1132577463"
	)
	abstract void vmethod2967(UrlRequest var1) throws IOException;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "8"
	)
	int method2948(URLConnection var1) {
		int var2 = UrlRequest.field1485; // L: 53
		if (var1 != null) { // L: 54
			try {
				if (var1 instanceof HttpURLConnection) { // L: 56
					var2 = ((HttpURLConnection)var1).getResponseCode(); // L: 57
				}
			} catch (IOException var4) { // L: 60
			}
		}

		return var2; // L: 62
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "2"
	)
	void method2941(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1471); // L: 70
	} // L: 71

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lez;B)V",
		garbageValue = "-7"
	)
	void method2943(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 74

		try {
			int var5 = var1.getContentLength(); // L: 77
			var3 = new DataInputStream(var1.getInputStream()); // L: 78
			byte[] var4;
			if (var5 >= 0) { // L: 79
				var4 = new byte[var5]; // L: 80
				var3.readFully(var4); // L: 81
			} else {
				var4 = new byte[0]; // L: 84
				byte[] var6 = WorldMapEvent.ByteArrayPool_getArrayBool(5000, false); // L: 87
				byte[] var7 = var6; // L: 89

				for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) { // L: 90 91 96
					byte[] var9 = new byte[var4.length + var8]; // L: 92
					System.arraycopy(var4, 0, var9, 0, var4.length); // L: 93
					System.arraycopy(var7, 0, var9, var4.length, var8); // L: 94
					var4 = var9; // L: 95
				}

				Player.ByteArrayPool_release(var7); // L: 98
			}

			var2.response0 = var4; // L: 100
		} catch (IOException var15) { // L: 102
			var2.response0 = null; // L: 103
		} finally {
			var2.field1482 = this.method2948(var1); // L: 106
		}

		if (var3 != null) { // L: 108
			try {
				var3.close(); // L: 110
			} catch (IOException var14) { // L: 112
			}
		}

	} // L: 114

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lez;",
		garbageValue = "728263238"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 117
		synchronized(this) { // L: 118
			this.requests.add(var2); // L: 119
			this.notify(); // L: 120
			return var2; // L: 122
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-575124742"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 126

		try {
			synchronized(this) { // L: 128
				this.notify(); // L: 129
			} // L: 130

			this.field1473.join(); // L: 131
		} catch (InterruptedException var4) { // L: 133
		}

	} // L: 134

	public void run() {
		while (!this.isClosed) { // L: 29
			try {
				UrlRequest var1;
				synchronized(this) { // L: 32
					var1 = (UrlRequest)this.requests.poll(); // L: 33
					if (var1 == null) { // L: 34
						try {
							this.wait(); // L: 36
						} catch (InterruptedException var5) { // L: 38
						}
						continue;
					}
				}

				this.vmethod2967(var1); // L: 42
			} catch (Exception var7) { // L: 44
				FriendsChatManager.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "1129295286"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		WorldMapArea.method4699(var0, var1, var2, var3, var4, var5, -1, false, -1); // L: 10877
	} // L: 10878
}
