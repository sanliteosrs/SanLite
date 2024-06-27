import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public final class class461 {
	@ObfuscatedName("aq")
	final Comparator field4903;
	@ObfuscatedName("ad")
	final Map field4900;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	final class430 field4901;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	final class430 field4902;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -5794576060614590681L
	)
	final long field4899;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	final class459 field4904;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2114201521
	)
	final int field4905;

	@ObfuscatedSignature(
		descriptor = "(JILrd;)V"
	)
	class461(long var1, int var3, class459 var4) {
		this.field4903 = new class460(this); // L: 7
		this.field4899 = var1; // L: 34
		this.field4905 = var3; // L: 35
		this.field4904 = var4; // L: 36
		if (this.field4905 == -1) { // L: 37
			this.field4900 = new HashMap(64); // L: 38
			this.field4901 = new class430(64, this.field4903); // L: 39
			this.field4902 = null; // L: 40
		} else {
			if (this.field4904 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4900 = new HashMap(this.field4905); // L: 44
			this.field4901 = new class430(this.field4905, this.field4903); // L: 45
			this.field4902 = new class430(this.field4905); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILrd;)V"
	)
	public class461(int var1, class459 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "794985736"
	)
	boolean method8429() {
		return this.field4905 != -1; // L: 51
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "6"
	)
	public Object method8418(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4899 != -1L) { // L: 56
				this.method8433();
			}

			class462 var3 = (class462)this.field4900.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method8420(var3, false); // L: 59
				return var3.field4910; // L: 60
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "1"
	)
	public Object method8419(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4899) { // L: 66
				this.method8433();
			}

			class462 var4 = (class462)this.field4900.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4910; // L: 69
				var4.field4910 = var2; // L: 70
				this.method8420(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class462 var5;
				if (this.method8429() && this.field4900.size() == this.field4905) { // L: 74
					var5 = (class462)this.field4902.remove(); // L: 75
					this.field4900.remove(var5.field4908); // L: 76
					this.field4901.remove(var5); // L: 77
				}

				var5 = new class462(var2, var1); // L: 79
				this.field4900.put(var1, var5); // L: 80
				this.method8420(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lre;ZI)V",
		garbageValue = "-724193621"
	)
	void method8420(class462 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4901.remove(var1); // L: 89
			if (this.method8429() && !this.field4902.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4907 = System.currentTimeMillis(); // L: 94
		if (this.method8429()) { // L: 95
			switch(this.field4904.field4896) { // L: 96
			case 0:
				var1.field4909 = var1.field4907; // L: 101
				break;
			case 1:
				++var1.field4909; // L: 98
			}

			this.field4902.add(var1); // L: 104
		}

		this.field4901.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method8433() {
		if (-1L == this.field4899) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4899; // L: 112

			while (!this.field4901.isEmpty()) { // L: 113
				class462 var3 = (class462)this.field4901.peek(); // L: 114
				if (var3.field4907 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4900.remove(var3.field4908); // L: 116
				this.field4901.remove(var3); // L: 117
				if (this.method8429()) { // L: 118
					this.field4902.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	public void method8421() {
		synchronized(this) { // L: 125
			this.field4900.clear(); // L: 126
			this.field4901.clear(); // L: 127
			if (this.method8429()) {
				this.field4902.clear(); // L: 128
			}

		}
	} // L: 130

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1950621406"
	)
	static int method8438(int var0, Script var1, boolean var2) {
		return 2; // L: 5336
	}
}
