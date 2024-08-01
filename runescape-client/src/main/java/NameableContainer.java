import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
@Implements("NameableContainer")
public abstract class NameableContainer {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1875806315
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -855604593
	)
	@Export("size")
	int size;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lsk;"
	)
	@Export("array")
	Nameable[] array;
	@ObfuscatedName("au")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("ah")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("az")
	@Export("comparator")
	Comparator comparator;

	NameableContainer(int var1) {
		this.size = 0; // L: 10
		this.comparator = null; // L: 14
		this.capacity = var1; // L: 17
		this.array = this.newTypedArray(var1); // L: 18
		this.usernamesMap = new HashMap(var1 / 8); // L: 19
		this.previousUsernamesMap = new HashMap(var1 / 8); // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsk;",
		garbageValue = "99"
	)
	@Export("newInstance")
	abstract Nameable newInstance();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsk;",
		garbageValue = "-2040243144"
	)
	@Export("newTypedArray")
	abstract Nameable[] newTypedArray(int var1);

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "567107698"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 24
		Arrays.fill(this.array, (Object)null); // L: 25
		this.usernamesMap.clear(); // L: 26
		this.previousUsernamesMap.clear(); // L: 27
	} // L: 28

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "28522"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1035493324"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity; // L: 35
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lvo;B)Z",
		garbageValue = "1"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lvo;B)Lsk;",
		garbageValue = "-39"
	)
	@Export("getByUsername")
	public Nameable getByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lvo;B)Lsk;",
		garbageValue = "-61"
	)
	@Export("getByCurrentUsername")
	Nameable getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.usernamesMap.get(var1); // L: 51 52
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Lsk;",
		garbageValue = "837458464"
	)
	@Export("getByPreviousUsername")
	Nameable getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (Nameable)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Z",
		garbageValue = "-634012871"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		Nameable var2 = this.getByCurrentUsername(var1); // L: 61
		if (var2 == null) { // L: 62
			return false;
		} else {
			this.remove(var2); // L: 63
			return true; // L: 64
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lsk;S)V",
		garbageValue = "-3463"
	)
	@Export("remove")
	final void remove(Nameable var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Lsk;",
		garbageValue = "295946346"
	)
	@Export("addLastNoPreviousUsername")
	Nameable addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lvo;Lvo;I)Lsk;",
		garbageValue = "1991162674"
	)
	@Export("addLast")
	Nameable addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) { // L: 79
			throw new IllegalStateException();
		} else {
			Nameable var3 = this.newInstance(); // L: 80
			var3.set(var1, var2); // L: 81
			this.arrayAddLast(var3); // L: 82
			this.mapPut(var3); // L: 83
			return var3; // L: 84
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)Lsk;",
		garbageValue = "-1890256480"
	)
	@Export("get")
	public final Nameable get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lsk;Lvo;Lvo;I)V",
		garbageValue = "1881769358"
	)
	@Export("changeName")
	final void changeName(Nameable var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)I",
		garbageValue = "707997239"
	)
	@Export("indexOf")
	final int indexOf(Nameable var1) {
		for (int var2 = 0; var2 < this.size; ++var2) { // L: 108
			if (this.array[var2] == var1) { // L: 109
				return var2;
			}
		}

		return -1; // L: 111
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)V",
		garbageValue = "-2013396087"
	)
	@Export("mapRemove")
	final void mapRemove(Nameable var1) {
		if (this.usernamesMap.remove(var1.username) == null) { // L: 115
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername); // L: 116
			}

		}
	} // L: 117

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)V",
		garbageValue = "303602913"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(Nameable var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)V",
		garbageValue = "799526432"
	)
	@Export("mapPut")
	final void mapPut(Nameable var1) {
		this.usernamesMap.put(var1.username, var1); // L: 124
		if (var1.previousUsername != null) { // L: 125
			Nameable var2 = (Nameable)this.previousUsernamesMap.put(var1.previousUsername, var1); // L: 126
			if (var2 != null && var2 != var1) { // L: 127
				var2.previousUsername = null; // L: 128
			}
		}

	} // L: 131

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1750562623"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-408274121"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "3"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "-1596011288"
	)
	static final void method8578(Widget var0) {
		if (var0.buttonType == 1) { // L: 11974
			KitDefinition.method3632(var0.field3970, "", 24, 0, 0, var0.id, var0.itemId); // L: 11975
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11978
			var1 = class142.Widget_getSpellActionName(var0); // L: 11979
			if (var1 != null) { // L: 11980
				KitDefinition.method3632(var1, class191.colorStartTag(65280) + var0.field3960, 25, 0, -1, var0.id, var0.itemId); // L: 11981
			}
		}

		if (var0.buttonType == 3) { // L: 11985
			UrlRequester.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11986
		}

		if (var0.buttonType == 4) { // L: 11989
			UrlRequester.insertMenuItemNoShift(var0.field3970, "", 28, 0, 0, var0.id); // L: 11990
		}

		if (var0.buttonType == 5) { // L: 11993
			UrlRequester.insertMenuItemNoShift(var0.field3970, "", 29, 0, 0, var0.id); // L: 11994
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11997
			UrlRequester.insertMenuItemNoShift(var0.field3970, "", 30, 0, -1, var0.id); // L: 11998
		}

		if (var0.isIf3) { // L: 12001
			int var2;
			if (Client.isSpellSelected) { // L: 12002
				var2 = ClanChannel.getWidgetFlags(var0); // L: 12004
				boolean var5 = (var2 >> 21 & 1) != 0; // L: 12006
				if (var5 && (class92.field1114 & 32) == 32) { // L: 12008
					KitDefinition.method3632(Client.field669, Client.field670 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 12009
				}
			} else {
				for (int var9 = 9; var9 >= 5; --var9) { // L: 12014
					String var7;
					if (!Varps.method6452(ClanChannel.getWidgetFlags(var0), var9) && var0.onOp == null) { // L: 12017
						var7 = null; // L: 12018
					} else if (var0.actions != null && var0.actions.length > var9 && var0.actions[var9] != null && var0.actions[var9].trim().length() != 0) { // L: 12021
						var7 = var0.actions[var9]; // L: 12025
					} else {
						var7 = null; // L: 12022
					}

					if (var7 != null) { // L: 12028
						KitDefinition.method3632(var7, var0.dataText, 1007, var9 + 1, var0.childIndex, var0.id, var0.itemId); // L: 12029
					}
				}

				var1 = class142.Widget_getSpellActionName(var0); // L: 12033
				if (var1 != null) { // L: 12034
					KitDefinition.method3632(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 12035
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 12038
					String var6;
					if (!Varps.method6452(ClanChannel.getWidgetFlags(var0), var2) && var0.onOp == null) { // L: 12041
						var6 = null; // L: 12042
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 12045
						var6 = var0.actions[var2]; // L: 12049
					} else {
						var6 = null; // L: 12046
					}

					if (var6 != null) { // L: 12052
						WorldMapArea.method4699(var6, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1); // L: 12053
					}
				}

				int var3 = ClanChannel.getWidgetFlags(var0); // L: 12058
				boolean var8 = (var3 & 1) != 0; // L: 12060
				if (var8) { // L: 12062
					UrlRequester.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 12063
				}
			}
		}

	} // L: 12068
}
