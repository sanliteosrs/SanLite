import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class373 extends AbstractQueue {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lob;"
	)
	class371[] field4360;
	@ObfuscatedName("al")
	Map field4358;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 706349751
	)
	int field4359;
	@ObfuscatedName("ab")
	final Comparator field4361;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -305399775
	)
	int field4362;

	public class373(int var1, Comparator var2) {
		this.field4362 = 0; // L: 10
		this.field4360 = new class371[var1]; // L: 17
		this.field4358 = new HashMap(); // L: 18
		this.field4361 = var2; // L: 19
	} // L: 20

	public class373(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1216129727"
	)
	void method6957() {
		int var1 = (this.field4360.length << 1) + 1; // L: 23
		this.field4360 = (class371[])((class371[])Arrays.copyOf(this.field4360, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1481495660"
	)
	void method6960(int var1) {
		class371 var2;
		int var3;
		for (var2 = this.field4360[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class371 var4 = this.field4360[var3]; // L: 99
			if (this.field4361 != null) { // L: 100
				if (this.field4361.compare(var2.field4353, var4.field4353) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4353).compareTo(var4.field4353) >= 0) { // L: 104
				break;
			}

			this.field4360[var1] = var4; // L: 106
			this.field4360[var1].field4351 = var1; // L: 107
		}

		this.field4360[var1] = var2; // L: 110
		this.field4360[var1].field4351 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1540192029"
	)
	void method6961(int var1) {
		class371 var2 = this.field4360[var1]; // L: 116

		int var8;
		for (int var3 = this.field4359 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class371 var5 = this.field4360[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class371 var7 = this.field4360[var6]; // L: 122
			if (this.field4361 != null) { // L: 124
				if (var6 < this.field4359 && this.field4361.compare(var5.field4353, var7.field4353) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4359 && ((Comparable)var5.field4353).compareTo(var7.field4353) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4361 != null) { // L: 132
				if (this.field4361.compare(var2.field4353, this.field4360[var8].field4353) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4353).compareTo(this.field4360[var8].field4353) <= 0) { // L: 136
				break;
			}

			this.field4360[var1] = this.field4360[var8]; // L: 138
			this.field4360[var1].field4351 = var1; // L: 139
		}

		this.field4360[var1] = var2; // L: 142
		this.field4360[var1].field4351 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class371 var2 = (class371)this.field4358.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4362; // L: 79
			--this.field4359; // L: 80
			if (this.field4359 == var2.field4351) { // L: 81
				this.field4360[this.field4359] = null; // L: 82
				return true; // L: 83
			} else {
				class371 var3 = this.field4360[this.field4359]; // L: 85
				this.field4360[this.field4359] = null; // L: 86
				this.field4360[var2.field4351] = var3; // L: 87
				this.field4360[var2.field4351].field4351 = var2.field4351; // L: 88
				this.method6961(var2.field4351); // L: 89
				if (var3 == this.field4360[var2.field4351]) { // L: 90
					this.method6960(var2.field4351);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4359 == 0 ? null : this.field4360[0].field4353; // L: 54 55
	}

	public Object poll() {
		if (this.field4359 == 0) { // L: 61
			return null;
		} else {
			++this.field4362; // L: 62
			Object var1 = this.field4360[0].field4353; // L: 63
			this.field4358.remove(var1); // L: 64
			--this.field4359; // L: 65
			if (this.field4359 == 0) {
				this.field4360[this.field4359] = null; // L: 66
			} else {
				this.field4360[0] = this.field4360[this.field4359]; // L: 68
				this.field4360[0].field4351 = 0; // L: 69
				this.field4360[this.field4359] = null; // L: 70
				this.method6961(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean contains(Object var1) {
		return this.field4358.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4361 != null) {
			Arrays.sort(var1, this.field4361); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class372(this); // L: 162
	}

	public boolean offer(Object var1) {
		if (this.field4358.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4362; // L: 35
			int var2 = this.field4359; // L: 36
			if (var2 >= this.field4360.length) { // L: 37
				this.method6957();
			}

			++this.field4359; // L: 38
			if (var2 == 0) { // L: 39
				this.field4360[0] = new class371(var1, 0); // L: 40
				this.field4358.put(var1, this.field4360[0]); // L: 41
			} else {
				this.field4360[var2] = new class371(var1, var2); // L: 44
				this.field4358.put(var1, this.field4360[var2]); // L: 45
				this.method6960(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public int size() {
		return this.field4359; // L: 29
	}
}
