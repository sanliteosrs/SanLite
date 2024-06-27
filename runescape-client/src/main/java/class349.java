import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public class class349 {
	@ObfuscatedName("aj")
	static boolean[] field3741;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field3744;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field3736;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field3743;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field3748;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field3738;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Lnx;"
	)
	public Widget[][] field3740;
	@ObfuscatedName("av")
	Map field3742;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	EvictingDualNodeHashTable field3739;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	EvictingDualNodeHashTable field3735;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	EvictingDualNodeHashTable field3737;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	EvictingDualNodeHashTable field3746;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	class461 field3747;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	class461 field3745;

	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Lok;Lok;Lok;)V"
	)
	public class349(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3742 = new HashMap(); // L: 20
		this.field3739 = new EvictingDualNodeHashTable(200); // L: 21
		this.field3735 = new EvictingDualNodeHashTable(50); // L: 22
		this.field3737 = new EvictingDualNodeHashTable(20); // L: 23
		this.field3746 = new EvictingDualNodeHashTable(8);
		this.field3747 = new class461(10, class459.field4897); // L: 25
		this.field3745 = new class461(10, class459.field4897); // L: 26
		int var6 = 0; // L: 29
		if (var1 != null) { // L: 30
			this.field3744 = var1; // L: 31
			this.field3743 = var2; // L: 32
			this.field3748 = var3; // L: 33
			this.field3738 = var4; // L: 34
			this.field3736 = var5; // L: 35
			var6 = this.field3744.getGroupCount(); // L: 36
		}

		this.field3740 = new Widget[var6][]; // L: 38
		field3741 = new boolean[var6]; // L: 39
	} // L: 40

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lnx;",
		garbageValue = "2107009714"
	)
	public Widget method6519(int var1) {
		int var2 = var1 >> 16; // L: 43
		int var3 = var1 & 65535; // L: 44
		if (this.field3740[var2] == null || this.field3740[var2][var3] == null) { // L: 45
			boolean var4 = this.method6514(var2); // L: 46
			if (!var4) { // L: 47
				return null;
			}
		}

		return this.field3740[var2][var3]; // L: 49
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lnx;",
		garbageValue = "12"
	)
	public Widget method6513(int var1, int var2) {
		Widget var3 = this.method6519(var1); // L: 53
		if (var2 == -1) { // L: 54
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null; // L: 55 56
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "548444335"
	)
	public boolean method6514(int var1) {
		if (field3741[var1]) { // L: 60
			return true;
		} else if (!this.field3744.tryLoadGroup(var1)) { // L: 61
			return false;
		} else {
			int var2 = this.field3744.getGroupFileCount(var1); // L: 62
			if (var2 == 0) { // L: 63
				field3741[var1] = true; // L: 64
				return true; // L: 65
			} else {
				if (this.field3740[var1] == null) { // L: 67
					this.field3740[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) { // L: 68
					if (this.field3740[var1][var3] == null) { // L: 69
						byte[] var4 = this.field3744.takeFile(var1, var3); // L: 70
						if (var4 != null) { // L: 71
							this.field3740[var1][var3] = new Widget(); // L: 72
							this.field3740[var1][var3].id = var3 + (var1 << 16); // L: 73
							if (var4[0] == -1) { // L: 74
								this.field3740[var1][var3].decode(new Buffer(var4));
							} else {
								this.field3740[var1][var3].decodeLegacy(new Buffer(var4)); // L: 75
							}

							if (this.field3736 != null) { // L: 76
								byte[] var5 = this.field3736.takeFile(var1, var3); // L: 77
								if (var5 != null && var5.length > 0) { // L: 78
									this.field3740[var1][var3].method6858(new Buffer(var5)); // L: 79
									this.field3742.put(this.field3740[var1][var3].field3832, var1); // L: 80
								}
							}
						}
					}
				}

				field3741[var1] = true; // L: 86
				return true; // L: 87
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-70"
	)
	public void method6512(int var1) {
		if (var1 != -1) { // L: 91
			if (field3741[var1]) { // L: 92
				this.field3744.clearFilesGroup(var1); // L: 93
				if (this.field3740[var1] != null) { // L: 94
					for (int var2 = 0; var2 < this.field3740[var1].length; ++var2) { // L: 95
						if (this.field3740[var1][var2] != null) { // L: 96
							this.field3740[var1][var2] = null; // L: 97
						}
					}

					this.field3740[var1] = null; // L: 100
					field3741[var1] = false; // L: 101
				}
			}
		}
	} // L: 102

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8377"
	)
	public void method6516() {
		this.field3739.clear(); // L: 105
		this.field3735.clear(); // L: 106
		this.field3737.clear(); // L: 107
		this.field3746.clear(); // L: 108
	} // L: 109

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1624931069"
	)
	public static int method6511(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 24
	}
}
