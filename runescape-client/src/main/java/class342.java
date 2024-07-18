import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class342 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	public AbstractArchive field3708;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1234485003
	)
	public int field3716;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 821498491
	)
	public int field3705;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 562187867
	)
	public int field3706;
	@ObfuscatedName("ap")
	public float field3704;
	@ObfuscatedName("an")
	public boolean field3711;
	@ObfuscatedName("aj")
	public boolean field3709;
	@ObfuscatedName("av")
	public boolean field3710;
	@ObfuscatedName("ab")
	public boolean field3715;
	@ObfuscatedName("ai")
	public boolean field3712;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public MidiPcmStream field3713;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	public SoundCache field3714;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public MusicTrack field3703;

	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class342(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3716 = -1;
		this.field3705 = -1;
		this.field3706 = 0;
		this.field3704 = 0.0F;
		this.field3711 = false;
		this.field3715 = false;
		this.field3712 = false;
		this.field3716 = var1.getGroupId(var2); // L: 22
		this.field3705 = var1.getFileId(this.field3716, var3); // L: 23
		this.method6439(var1, this.field3716, this.field3705, var4, var5); // L: 24
	} // L: 25

	@ObfuscatedSignature(
		descriptor = "(Lok;IIIZ)V"
	)
	public class342(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3716 = -1; // L: 8
		this.field3705 = -1; // L: 9
		this.field3706 = 0; // L: 10
		this.field3704 = 0.0F; // L: 11
		this.field3711 = false; // L: 12
		this.field3715 = false; // L: 15
		this.field3712 = false; // L: 16
		this.method6439(var1, var2, var3, var4, var5); // L: 28
	} // L: 29

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIIZS)V",
		garbageValue = "7788"
	)
	void method6439(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3708 = var1; // L: 32
		this.field3716 = var2; // L: 33
		this.field3705 = var3; // L: 34
		this.field3706 = var4; // L: 35
		this.field3711 = var5; // L: 36
	} // L: 37
}
