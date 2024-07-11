import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
class class141 implements Callable {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field1647;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class142 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfg;"
	)
	final class134[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lft;II[Lfg;)V"
	)
	class141(class142 var1, int var2, int var3, class134[] var4) {
		this.this$0 = var1; // L: 97
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) { // L: 100
			this.val$curveLoadJobs[var1].call(); // L: 101
		}

		return null; // L: 103
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "-2004109183"
	)
	public static void method3201(AbstractArchive var0) {
		class292.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CLpe;I)C",
		garbageValue = "140825595"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 82
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0; // L: 91
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Ldg;",
		garbageValue = "1680118295"
	)
	static Script method3202(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 61
		if (var2 != null) { // L: 62
			return var2; // L: 63
		} else {
			String var3 = String.valueOf(var0); // L: 65
			int var4 = class476.archive12.getGroupId(var3); // L: 66
			if (var4 == -1) { // L: 67
				return null; // L: 68
			} else {
				byte[] var5 = class476.archive12.takeFileFlat(var4); // L: 70
				if (var5 != null) { // L: 71
					if (var5.length <= 1) { // L: 72
						return null; // L: 73
					}

					var2 = class154.newScript(var5); // L: 75
					if (var2 != null) { // L: 76
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 77
						return var2; // L: 78
					}
				}

				return null; // L: 81
			}
		}
	}
}
