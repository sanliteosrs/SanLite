import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 4967844252508248949L
	)
	long field4854;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -7702364636721094597L
	)
	long field4852;
	@ObfuscatedName("ag")
	public boolean field4859;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 3838602930801498373L
	)
	long field4857;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 3868601707168331443L
	)
	long field4855;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 8299523440899943207L
	)
	long field4856;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1130866977
	)
	int field4853;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 121779419
	)
	int field4858;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1169960417
	)
	int field4851;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 366870427
	)
	int field4860;

	public Timer() {
		this.field4854 = -1L; // L: 7
		this.field4852 = -1L; // L: 8
		this.field4859 = false; // L: 9
		this.field4857 = 0L; // L: 10
		this.field4855 = 0L; // L: 11
		this.field4856 = 0L; // L: 12
		this.field4853 = 0; // L: 13
		this.field4858 = 0; // L: 14
		this.field4851 = 0; // L: 15
		this.field4860 = 0; // L: 16
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "33555427"
	)
	public void method8328() {
		this.field4854 = WorldMapData_1.method4861(); // L: 19
	} // L: 20

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-489815838"
	)
	public void method8338() {
		if (-1L != this.field4854) { // L: 23
			this.field4855 = WorldMapData_1.method4861() - this.field4854; // L: 24
			this.field4854 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2134692845"
	)
	public void method8334(int var1) {
		this.field4852 = WorldMapData_1.method4861(); // L: 30
		this.field4853 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-389245349"
	)
	public void method8331() {
		if (this.field4852 != -1L) { // L: 35
			this.field4857 = WorldMapData_1.method4861() - this.field4852; // L: 36
			this.field4852 = -1L; // L: 37
		}

		++this.field4851; // L: 39
		this.field4859 = true; // L: 40
	} // L: 41

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1134261599"
	)
	public void method8332() {
		this.field4859 = false; // L: 44
		this.field4858 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-100"
	)
	public void method8333() {
		this.method8331(); // L: 49
	} // L: 50

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "-87"
	)
	@Export("write")
	public void write(Buffer var1) {
		class432.method8013(var1, this.field4855); // L: 53
		class432.method8013(var1, this.field4857); // L: 54
		class432.method8013(var1, this.field4856); // L: 55
		var1.writeShort(this.field4853); // L: 56
		var1.writeShort(this.field4858); // L: 57
		var1.writeShort(this.field4851); // L: 58
		var1.writeShort(this.field4860); // L: 59
	} // L: 60

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(III)Ljv;",
		garbageValue = "807271628"
	)
	static RouteStrategy method8348(int var0, int var1) {
		Client.field645.approxDestinationX = var0; // L: 9793
		Client.field645.approxDestinationY = var1; // L: 9794
		Client.field645.approxDestinationSizeX = 1; // L: 9795
		Client.field645.approxDestinationSizeY = 1; // L: 9796
		return Client.field645; // L: 9797
	}
}
