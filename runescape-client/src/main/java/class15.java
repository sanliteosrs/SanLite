import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfuscatedName("ac")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	static class15 field70;
	@ObfuscatedName("aq")
	SecureRandom field69;

	static {
		if (Security.getProvider("BC") == null) { // L: 41
			Security.addProvider(new BouncyCastleProvider());
		}

	} // L: 42

	class15() {
		this.field69 = new SecureRandom(); // L: 44
	} // L: 54

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "1661367691"
	)
	SSLSocket method179(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1); // L: 99
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null; // L: 80
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) { // L: 58
			var1 = new Socket(); // L: 59
		}

		if (!var1.isConnected()) { // L: 61
			var1.connect(new InetSocketAddress(var2, var3)); // L: 62
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field69); // L: 64
		return this.method179(var2, var5); // L: 65
	}

	public String[] getDefaultCipherSuites() {
		return null; // L: 70
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 75
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null; // L: 95
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null; // L: 90
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null; // L: 85
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lac;",
		garbageValue = "2"
	)
	public static class15 method197() {
		if (field70 == null) { // L: 48
			field70 = new class15(); // L: 49
		}

		return field70; // L: 51
	}
}
