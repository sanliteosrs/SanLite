import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ap")
public enum class34 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	field243(0, 0);

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static Widget field241;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -320311027
	)
	final int field238;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1825459299
	)
	final int field240;

	class34(int var3, int var4) {
		this.field238 = var3;
		this.field240 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field240;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "1269397645"
	)
	public static Object method388(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;Ljp;B)V",
		garbageValue = "-21"
	)
	public static void method391(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		GrandExchangeOffer.Widget_archive = var0;
		class245.Widget_modelsArchive = var1;
		Widget.Widget_spritesArchive = var2;
		FileSystem.Widget_fontsArchive = var3;
		Widget.Widget_interfaceComponents = new Widget[GrandExchangeOffer.Widget_archive.getGroupCount()][];
		class5.Widget_loadedInterfaces = new boolean[GrandExchangeOffer.Widget_archive.getGroupCount()];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-746687545"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "51313612"
	)
	static final void method393(String var0) {
		PacketBufferNode var1 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2567, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
