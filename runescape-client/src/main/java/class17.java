import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
class class17 implements SSLSession {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lah;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 142
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 240
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 155
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 160
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 165
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 175
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 180
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 185
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 195
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 205
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 210
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 215
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 220
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 225
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field62; // L: 190
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 235
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 245
	}

	public int getApplicationBufferSize() {
		return 0; // L: 145
	}

	public int getPeerPort() {
		return 0; // L: 200
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 150
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 170
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 230
	}
}
