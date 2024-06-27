import java.awt.Component;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public class class430 extends AbstractQueue {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	class428[] field4735;
	@ObfuscatedName("ad")
	Map field4736;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1209740451
	)
	int field4737;
	@ObfuscatedName("ak")
	final Comparator field4738;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -628628359
	)
	int field4739;

	public class430(int var1, Comparator var2) {
		this.field4739 = 0; // L: 10
		this.field4735 = new class428[var1]; // L: 17
		this.field4736 = new HashMap(); // L: 18
		this.field4738 = var2; // L: 19
	} // L: 20

	public class430(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-992745058"
	)
	void method7887() {
		int var1 = (this.field4735.length << 1) + 1; // L: 23
		this.field4735 = (class428[])((class428[])Arrays.copyOf(this.field4735, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "115"
	)
	void method7890(int var1) {
		class428 var2;
		int var3;
		for (var2 = this.field4735[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class428 var4 = this.field4735[var3]; // L: 99
			if (this.field4738 != null) { // L: 100
				if (this.field4738.compare(var2.field4730, var4.field4730) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4730).compareTo(var4.field4730) >= 0) { // L: 104
				break;
			}

			this.field4735[var1] = var4; // L: 106
			this.field4735[var1].field4727 = var1; // L: 107
		}

		this.field4735[var1] = var2; // L: 110
		this.field4735[var1].field4727 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-10"
	)
	void method7891(int var1) {
		class428 var2 = this.field4735[var1]; // L: 116

		int var8;
		for (int var3 = this.field4737 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class428 var5 = this.field4735[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class428 var7 = this.field4735[var6]; // L: 122
			if (this.field4738 != null) { // L: 124
				if (var6 < this.field4737 && this.field4738.compare(var5.field4730, var7.field4730) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4737 && ((Comparable)var5.field4730).compareTo(var7.field4730) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4738 != null) { // L: 132
				if (this.field4738.compare(var2.field4730, this.field4735[var8].field4730) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4730).compareTo(this.field4735[var8].field4730) <= 0) { // L: 136
				break;
			}

			this.field4735[var1] = this.field4735[var8]; // L: 138
			this.field4735[var1].field4727 = var1; // L: 139
		}

		this.field4735[var1] = var2; // L: 142
		this.field4735[var1].field4727 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class428 var2 = (class428)this.field4736.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4739; // L: 79
			--this.field4737; // L: 80
			if (this.field4737 == var2.field4727) { // L: 81
				this.field4735[this.field4737] = null; // L: 82
				return true; // L: 83
			} else {
				class428 var3 = this.field4735[this.field4737]; // L: 85
				this.field4735[this.field4737] = null; // L: 86
				this.field4735[var2.field4727] = var3; // L: 87
				this.field4735[var2.field4727].field4727 = var2.field4727; // L: 88
				this.method7891(var2.field4727); // L: 89
				if (var3 == this.field4735[var2.field4727]) { // L: 90
					this.method7890(var2.field4727);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4737 == 0 ? null : this.field4735[0].field4730; // L: 54 55
	}

	public boolean contains(Object var1) {
		return this.field4736.containsKey(var1); // L: 148
	}

	public boolean offer(Object var1) {
		if (this.field4736.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4739; // L: 35
			int var2 = this.field4737; // L: 36
			if (var2 >= this.field4735.length) {
				this.method7887();
			}

			++this.field4737;
			if (var2 == 0) {
				this.field4735[0] = new class428(var1, 0);
				this.field4736.put(var1, this.field4735[0]); // L: 41
			} else {
				this.field4735[var2] = new class428(var1, var2); // L: 44
				this.field4736.put(var1, this.field4735[var2]); // L: 45
				this.method7890(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4738 != null) {
			Arrays.sort(var1, this.field4738); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class429(this); // L: 162
	}

	public Object poll() {
		if (this.field4737 == 0) { // L: 61
			return null;
		} else {
			++this.field4739; // L: 62
			Object var1 = this.field4735[0].field4730; // L: 63
			this.field4736.remove(var1); // L: 64
			--this.field4737; // L: 65
			if (this.field4737 == 0) {
				this.field4735[this.field4737] = null; // L: 66
			} else {
				this.field4735[0] = this.field4735[this.field4737]; // L: 68
				this.field4735[0].field4727 = 0; // L: 69
				this.field4735[this.field4737] = null; // L: 70
				this.method7891(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public int size() {
		return this.field4737; // L: 29
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "2036764897"
	)
	static void method7909(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40
}
