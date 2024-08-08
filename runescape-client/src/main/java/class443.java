import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class443 extends class444 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	class342 field4810;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1023172221
	)
	int field4809;

	@ObfuscatedSignature(
		descriptor = "(Lro;IZI)V"
	)
	public class443(class444 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4810 = null; // L: 7
		this.field4809 = 0; // L: 8
		super.field4814 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class330.field3587.size()) { // L: 16
				this.field4810 = (class342)class330.field3587.get(var2); // L: 17
			} else if (!var3 && var2 < class330.field3584.size()) { // L: 19
				this.field4810 = (class342)class330.field3584.get(var2); // L: 20
			}

			this.field4809 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		if (this.field4810 != null && this.field4810.field3713 != null) { // L: 27
			this.field4810.field3715 = true; // L: 30

			try {
				if (this.field4810.field3704 < (float)this.field4810.field3706 && this.field4810.field3713.isReady()) { // L: 32
					float var1 = this.field4809 == 0 ? (float)this.field4809 : (float)this.field4810.field3706 / (float)this.field4809; // L: 33
					class342 var10000 = this.field4810;
					var10000.field3704 += 0.0F == var1 ? (float)this.field4810.field3706 : var1; // L: 34
					if (this.field4810.field3704 > (float)this.field4810.field3706) { // L: 35
						this.field4810.field3704 = (float)this.field4810.field3706; // L: 36
					}

					this.field4810.field3713.setPcmStreamVolume((int)this.field4810.field3704); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method8253(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4810.field3715 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}
}
