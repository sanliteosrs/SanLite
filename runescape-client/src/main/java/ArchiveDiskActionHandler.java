import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 968623873
	)
	static int field4468;
	@ObfuscatedName("ak")
	static boolean field4470;
	@ObfuscatedName("ap")
	static Object field4472;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field4476;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4468 = 0; // L: 11
		field4470 = false; // L: 12
		field4472 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 76
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 77
				} // L: 78

				if (var1 != null) { // L: 79
					if (var1.type == 0) { // L: 80
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 81
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 82
							var1.remove(); // L: 83
						} // L: 84
					} else if (var1.type == 1) { // L: 86
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 87
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 88
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 89
						} // L: 90
					}

					synchronized(field4472) { // L: 92
						if ((field4470 || field4468 <= 1) && ArchiveDiskActionHandler_requestQueue.method7456()) { // L: 93
							field4468 = 0; // L: 94
							field4472.notifyAll(); // L: 95
							return; // L: 96
						}

						field4468 = 600; // L: 98
					}
				} else {
					class188.method3688(100L); // L: 102
					synchronized(field4472) { // L: 103
						if ((field4470 || field4468 <= 1) && ArchiveDiskActionHandler_requestQueue.method7456()) { // L: 104
							field4468 = 0; // L: 105
							field4472.notifyAll(); // L: 106
							return; // L: 107
						}

						--field4468; // L: 109
					}
				}
			}
		} catch (Exception var13) { // L: 114
			FriendsChatManager.RunException_sendStackTrace((String)null, var13); // L: 115
		}
	} // L: 117

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Lok;Ljava/util/ArrayList;B)Z",
		garbageValue = "-2"
	)
	public static boolean method7122(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class330.field3583 = var0; // L: 29
		class330.field3579 = var1; // L: 30
		class330.field3591 = var2; // L: 31
		class330.field3582 = var3; // L: 32
		return true; // L: 33
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lok;III)Lvg;",
		garbageValue = "-136072013"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class146.method3260(var0, var1, var2)) { // L: 50
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 53
			var4.width = class561.SpriteBuffer_spriteWidth; // L: 54
			var4.height = class561.SpriteBuffer_spriteHeight; // L: 55
			var4.xOffset = UserComparator4.SpriteBuffer_xOffsets[0]; // L: 56
			var4.yOffset = class145.SpriteBuffer_yOffsets[0]; // L: 57
			var4.subWidth = class561.SpriteBuffer_spriteWidths[0]; // L: 58
			var4.subHeight = class315.SpriteBuffer_spriteHeights[0]; // L: 59
			int var5 = var4.subHeight * var4.subWidth; // L: 60
			byte[] var6 = class561.SpriteBuffer_pixels[0]; // L: 61
			var4.pixels = new int[var5]; // L: 62

			for (int var7 = 0; var7 < var5; ++var7) { // L: 63
				var4.pixels[var7] = class561.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			Calendar.method7029(); // L: 64
			return var4; // L: 67
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Ldv;ZI)V",
		garbageValue = "-1980057961"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 13063
		int var3 = (int)var0.key; // L: 13064
		var0.remove(); // L: 13065
		if (var1) { // L: 13066
			ModeWhere.field4649.method6512(var2);
		}

		class512.method8981(var2); // L: 13067
		Widget var4 = ModeWhere.field4649.method6519(var3); // L: 13068
		if (var4 != null) { // L: 13069
			TriBool.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) { // L: 13070
			BuddyRankComparator.method3037(Client.rootInterface, 1);
		}

	} // L: 13071
}
