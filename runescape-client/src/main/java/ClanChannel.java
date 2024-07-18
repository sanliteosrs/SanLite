import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("aq")
	boolean field1826;
	@ObfuscatedName("ad")
	boolean field1818;
	@ObfuscatedName("ag")
	@Export("members")
	public List members;
	@ObfuscatedName("ak")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -2959055586149088951L
	)
	public long field1821;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	public byte field1823;
	@ObfuscatedName("av")
	public byte field1817;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1818 = true; // L: 13
		this.name = null; // L: 17
		this.method3485(var1); // L: 26
	} // L: 27

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-105"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10189(); // L: 34
			}

			VarcInt.method3622(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V",
		garbageValue = "780541394"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2055617677"
	)
	public int method3501() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-58662709"
	)
	public int method3484(String var1) {
		if (!this.field1818) { // L: 57
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 58
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 59
				}
			}

			return -1; // L: 61
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-15655574"
	)
	void method3485(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1826 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1818 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1821 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1817 = var1.readByte(); // L: 74
		this.field1823 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1826) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1818) { // L: 84
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 85
				var6.world = var1.readUnsignedShort(); // L: 86
				if (var3 >= 3) { // L: 87
					var1.readBoolean(); // L: 88
				}

				this.members.add(var5, var6); // L: 91
			}
		}

	} // L: 94

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public static boolean method3506() {
		if (!class330.field3581.isEmpty()) { // L: 191
			return true; // L: 192
		} else {
			return !class330.field3584.isEmpty() && class330.field3584.get(0) != null && ((class342)class330.field3584.get(0)).field3713 != null ? ((class342)class330.field3584.get(0)).field3713.isReady() : false; // L: 194 195 197
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "938117130"
	)
	static void method3505(class101 var0) {
		if (Client.field551) { // L: 5334
			class341.method6437(var0, Client.field706, false); // L: 5335
		}

	} // L: 5337

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "10"
	)
	static final void method3488(int var0, int var1, int var2, boolean var3) {
		if (ModeWhere.field4649.method6514(var0)) { // L: 11767
			ArchiveLoader.resizeInterface(ModeWhere.field4649.field3740[var0], -1, var1, var2, var3); // L: 11768
		}
	} // L: 11769

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)I",
		garbageValue = "-1815013130"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 13343
		return var1 != null ? var1.integer : var0.flags; // L: 13344 13345
	}
}
