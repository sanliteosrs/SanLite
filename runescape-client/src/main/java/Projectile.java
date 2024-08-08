import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -504466887
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1766816905
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1772430645
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1782025733
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1045611613
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1690959867
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -935780375
	)
	int field968;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1926569083
	)
	int field985;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 429044921
	)
	int field970;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -135221413
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1039953437
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 563603713
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 864895171
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1613876837
	)
	int field975;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1863287717
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ac")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("al")
	@Export("x")
	double x;
	@ObfuscatedName("ay")
	@Export("y")
	double y;
	@ObfuscatedName("ao")
	@Export("z")
	double z;
	@ObfuscatedName("aa")
	double field981;
	@ObfuscatedName("as")
	double field982;
	@ObfuscatedName("aw")
	double field984;
	@ObfuscatedName("at")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("af")
	double field963;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -418607101
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1052283447
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1315368611
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -232988127
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 24
		this.frame = 0; // L: 36
		this.frameCycle = 0; // L: 37
		this.id = var1; // L: 40
		this.plane = var2; // L: 41
		this.sourceX = var3; // L: 42
		this.sourceY = var4; // L: 43
		this.sourceZ = var5; // L: 44
		this.cycleStart = var6; // L: 45
		this.cycleEnd = var7; // L: 46
		this.slope = var8; // L: 47
		this.startHeight = var9; // L: 48
		this.targetIndex = var10; // L: 49
		this.endHeight = var11; // L: 50
		this.isMoving = false; // L: 51
		int var12 = class178.SpotAnimationDefinition_get(this.id).sequence; // L: 52
		if (var12 != -1) { // L: 53
			this.sequenceDefinition = class353.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 54
		}

	} // L: 55

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12); // L: 58
		this.field975 = var10; // L: 59
	} // L: 60

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1354303074"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field968 = var1; // L: 63
		this.field985 = var2; // L: 64
		this.field970 = var3; // L: 65
		double var5;
		if (!this.isMoving) { // L: 66
			var5 = (double)(this.field968 - this.sourceX); // L: 67
			double var7 = (double)(this.field985 - this.sourceY); // L: 68
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 69
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 70
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY; // L: 71
			this.z = (double)this.sourceZ; // L: 72
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 74
		this.field981 = ((double)this.field968 - this.x) / var5; // L: 75
		this.field982 = ((double)this.field985 - this.y) / var5; // L: 76
		this.field984 = Math.sqrt(this.field982 * this.field982 + this.field981 * this.field981); // L: 77
		if (!this.isMoving) { // L: 78
			this.speedZ = -this.field984 * Math.tan((double)this.slope * 0.02454369D);
		}

		this.field963 = 2.0D * ((double)this.field970 - this.z - this.speedZ * var5) / (var5 * var5); // L: 79
	} // L: 80

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2141951542"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 83
		this.x += this.field981 * (double)var1; // L: 84
		this.y += (double)var1 * this.field982; // L: 85
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.field963 * (double)var1; // L: 86
		this.speedZ += (double)var1 * this.field963; // L: 87
		this.yaw = (int)(Math.atan2(this.field981, this.field982) * 325.949D) + 1024 & 2047; // L: 88
		this.pitch = (int)(Math.atan2(this.speedZ, this.field984) * 325.949D) & 2047; // L: 89
		if (this.sequenceDefinition != null) { // L: 90
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 91
				this.frameCycle += var1; // L: 92

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 93
								return; // L: 110
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 94
							++this.frame; // L: 95
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 96

						this.frame -= this.sequenceDefinition.frameCount; // L: 97
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 98

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 103
				int var2 = this.sequenceDefinition.method4059(); // L: 104
				if (this.frame >= var2) { // L: 105
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 106
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class178.SpotAnimationDefinition_get(this.id); // L: 113
		Model var2 = var1.getModel(this.frame); // L: 114
		if (var2 == null) { // L: 115
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 116
			return var2; // L: 117
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I)V",
		garbageValue = "-300330513"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		Varps.runScript(var0, 500000, 475000); // L: 101
	} // L: 102
}
