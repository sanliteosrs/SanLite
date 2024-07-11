import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("ah")
class class12 extends SSLSocket {
	@ObfuscatedName("aq")
	Certificate[] field62;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lac;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 99
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public String[] getEnabledProtocols() {
		return null; // L: 132
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 104
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 109
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 114
	} // L: 115

	public boolean getUseClientMode() {
		return false; // L: 262
	}

	public boolean getEnableSessionCreation() {
		return false; // L: 122
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 271

	public boolean getNeedClientAuth() {
		return false; // L: 137
	}

	public SSLSession getSession() {
		return new class17(this); // L: 142
	}

	public boolean getWantClientAuth() {
		return false; // L: 267
	}

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 277

	public void setEnabledProtocols(String[] var1) {
	} // L: 280

	public void setNeedClientAuth(boolean var1) {
	} // L: 283

	public void setUseClientMode(boolean var1) {
	} // L: 286

	public void setWantClientAuth(boolean var1) {
	} // L: 289

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 293
	} // L: 343

	public void setEnableSessionCreation(boolean var1) {
	} // L: 274

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 118

	public String[] getSupportedProtocols() {
		return null; // L: 252
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 127
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 257
	}
}
