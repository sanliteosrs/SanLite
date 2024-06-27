import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("az")
class class13 extends DefaultTlsClient {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lah;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 293
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 296
		if (var1 == null) { // L: 297
			var1 = new Hashtable(); // L: 298
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 300
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 301
		DataOutputStream var4 = new DataOutputStream(var3); // L: 302
		var4.writeShort(var2.length + 3); // L: 303
		var4.writeByte(0); // L: 304
		var4.writeShort(var2.length); // L: 305
		var4.write(var2); // L: 306
		var4.close(); // L: 307
		var1.put(0, var3.toByteArray()); // L: 308
		return var1; // L: 309
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 314
	}
}
