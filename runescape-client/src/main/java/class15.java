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

@ObfuscatedName("ah")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	public static class15 field83;
	@ObfuscatedName("af")
	SecureRandom field82;

	static {
		if (Security.getProvider("BC") == null) { // L: 40
			Security.addProvider(new BouncyCastleProvider());
		}

	} // L: 41

	public class15() {
		this.field82 = new SecureRandom(); // L: 43
	} // L: 46

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "-489123832"
	)
	SSLSocket method208(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1); // L: 91
	}

	public String[] getDefaultCipherSuites() {
		return null; // L: 62
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 67
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null; // L: 72
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null; // L: 77
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null; // L: 87
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null; // L: 82
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) { // L: 50
			var1 = new Socket(); // L: 51
		}

		if (!var1.isConnected()) { // L: 53
			var1.connect(new InetSocketAddress(var2, var3)); // L: 54
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field82); // L: 56
		return this.method208(var2, var5); // L: 57
	}
}
