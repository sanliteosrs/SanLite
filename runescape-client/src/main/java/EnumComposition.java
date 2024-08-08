import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("EnumDefinition_cached")
	public static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("ag")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ak")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ap")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1142953375
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1660847733
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("av")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("ab")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("ai")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-369750776"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.decodeNext(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "722630389"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 44
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 45
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 46
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 47
				this.outputCount = var1.readUnsignedShort(); // L: 48
				this.keys = new int[this.outputCount]; // L: 49
				this.strVals = new String[this.outputCount]; // L: 50

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 51
					this.keys[var3] = var1.readInt(); // L: 52
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 53
				}
			} else if (var2 == 6) { // L: 56
				this.outputCount = var1.readUnsignedShort(); // L: 57
				this.keys = new int[this.outputCount]; // L: 58
				this.intVals = new int[this.outputCount]; // L: 59

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 60
					this.keys[var3] = var1.readInt(); // L: 61
					this.intVals[var3] = var1.readInt(); // L: 62
				}
			}
		}

	} // L: 66

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2014550387"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 69
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	public static void method3678() {
		class188.FloorUnderlayDefinition_cached.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILnx;IIIII[FI)Lnx;",
		garbageValue = "1937006233"
	)
	static Widget method3679(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 792
		var8.type = var0; // L: 793
		var8.parentId = var1.id; // L: 794
		var8.childIndex = var2; // L: 795
		var8.isIf3 = true; // L: 796
		var8.xAlignment = var3; // L: 797
		var8.yAlignment = var4; // L: 798
		var8.widthAlignment = var5; // L: 799
		var8.heightAlignment = var6; // L: 800
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 801
		var8.rawY = (int)(var7[1] * (float)var1.height); // L: 802
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 803
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 804
		return var8; // L: 805
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1971455703"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 628
		if (class541.garbageCollector == null || !class541.garbageCollector.isValid()) { // L: 629
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 631

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 632
					if (var2.isValid()) { // L: 634
						class541.garbageCollector = var2; // L: 635
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 636
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 637
					}
				}
			} catch (Throwable var11) { // L: 642
			}
		}

		if (class541.garbageCollector != null) { // L: 644
			long var9 = WorldMapData_1.method4861(); // L: 645
			long var3 = class541.garbageCollector.getCollectionTime(); // L: 646
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 647
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 648
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 649
				if (0L != var7) { // L: 650
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 652
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 653
		}

		return var0; // L: 655
	}
}
