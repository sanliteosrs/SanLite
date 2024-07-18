import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ar")
	public static boolean field3828;
	@ObfuscatedName("bt")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 765201367
	)
	@Export("id")
	public int id;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1114547637
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bm")
	String field3832;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 505032615
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -845014677
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 650299475
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -700936881
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1081332403
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -817282947
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -74447201
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1060131217
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1553952287
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 313524553
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1100508457
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2062618881
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1102193885
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -616855855
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1888969631
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1306856855
	)
	public int field3848;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -331675015
	)
	public int field3849;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 222435761
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bz")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1141305685
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 257051461
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1289302289
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -117409281
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 989679041
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -2140916845
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 331773959
	)
	public int field3858;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 374155529
	)
	public int field3859;
	@ObfuscatedName("cu")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("fillMode")
	public class558 fillMode;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1049665797
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1803990569
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1594570601
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("ct")
	public boolean field3880;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -969610781
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 2039865883
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cq")
	public String field3868;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 428367569
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cp")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1483878917
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1600044683
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("ci")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cc")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1599213851
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -200792735
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1218710441
	)
	int field3877;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1696450891
	)
	int field3878;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -102888283
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 46722313
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1340193501
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1097487619
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1574425945
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1277206625
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 797774769
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -235408515
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1016527051
	)
	public int field3887;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1736947013
	)
	public int field3943;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public PlayerComposition field3838;
	@ObfuscatedName("dp")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dv")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1462515793
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -700546895
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dt")
	@Export("text")
	public String text;
	@ObfuscatedName("da")
	public String field3895;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -831075649
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1161106127
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1734965623
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dy")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	class213 field3900;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1544517309
	)
	int field3901;
	@ObfuscatedName("dj")
	HashMap field3973;
	@ObfuscatedName("dq")
	HashMap field3925;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	class354 field3904;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 286263045
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("eg")
	public boolean field3915;
	@ObfuscatedName("es")
	public byte[][] field3907;
	@ObfuscatedName("ei")
	public byte[][] field3980;
	@ObfuscatedName("eo")
	public int[] field3966;
	@ObfuscatedName("ex")
	public int[] field3910;
	@ObfuscatedName("ek")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ev")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -2091171195
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -655581333
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ez")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("eq")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("er")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("et")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ec")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ep")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ed")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ee")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ey")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ef")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("el")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ff")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fw")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fv")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fh")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fg")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fd")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fi")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fp")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fe")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fl")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fz")
	public Object[] field3939;
	@ObfuscatedName("ft")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fr")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fk")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fc")
	public Object[] field3840;
	@ObfuscatedName("fu")
	public Object[] field3829;
	@ObfuscatedName("fs")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fm")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fa")
	public Object[] field3947;
	@ObfuscatedName("fn")
	public Object[] field3865;
	@ObfuscatedName("fq")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("fo")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("fy")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("fx")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("fj")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gs")
	public Object[] field3954;
	@ObfuscatedName("gq")
	public Object[] field3955;
	@ObfuscatedName("gk")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ge")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gr")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 735025779
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gc")
	public String field3960;
	@ObfuscatedName("ga")
	public String field3970;
	@ObfuscatedName("gi")
	public int[] field3962;
	@ObfuscatedName("gn")
	public int[] field3963;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1740363595
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -1807299683
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 936512001
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 515760285
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "[Lnx;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gf")
	public boolean field3969;
	@ObfuscatedName("gz")
	public boolean field3842;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -1221296269
	)
	public int field3971;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1878600795
	)
	public int field3899;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1468682019
	)
	public int field3911;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -124626521
	)
	public int field3974;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 188073995
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -1645523529
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("gt")
	public int[] field3977;
	@ObfuscatedName("gy")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("gg")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hr")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3828 = false; // L: 51
	}

	public Widget() {
		this.isIf3 = false; // L: 52
		this.id = -1; // L: 53
		this.childIndex = -1; // L: 54
		this.buttonType = 0; // L: 57
		this.contentType = 0; // L: 58
		this.xAlignment = 0; // L: 59
		this.yAlignment = 0; // L: 60
		this.widthAlignment = 0; // L: 61
		this.heightAlignment = 0; // L: 62
		this.rawX = 0; // L: 63
		this.rawY = 0; // L: 64
		this.rawWidth = 0; // L: 65
		this.rawHeight = 0; // L: 66
		this.x = 0; // L: 67
		this.y = 0; // L: 68
		this.width = 0; // L: 69
		this.height = 0; // L: 70
		this.field3848 = 1; // L: 71
		this.field3849 = 1; // L: 72
		this.parentId = -1; // L: 73
		this.isHidden = false; // L: 74
		this.scrollX = 0; // L: 75
		this.scrollY = 0; // L: 76
		this.scrollWidth = 0; // L: 77
		this.scrollHeight = 0; // L: 78
		this.color = 0; // L: 79
		this.color2 = 0; // L: 80
		this.field3858 = 0; // L: 81
		this.field3859 = 0; // L: 82
		this.fill = false; // L: 83
		this.fillMode = class558.SOLID; // L: 84
		this.transparencyTop = 0; // L: 85
		this.transparencyBot = 0; // L: 86
		this.lineWid = 1; // L: 87
		this.field3880 = false; // L: 88
		this.spriteId2 = -1; // L: 89
		this.spriteId = -1; // L: 90
		this.spriteAngle = 0; // L: 92
		this.spriteTiling = false; // L: 93
		this.outline = 0; // L: 94
		this.spriteShadow = 0; // L: 95
		this.modelType = 1; // L: 98
		this.modelId = -1; // L: 99
		this.field3877 = 1; // L: 100
		this.field3878 = -1; // L: 101
		this.sequenceId = -1; // L: 102
		this.sequenceId2 = -1; // L: 103
		this.modelOffsetX = 0; // L: 104
		this.modelOffsetY = 0; // L: 105
		this.modelAngleX = 0; // L: 106
		this.modelAngleY = 0; // L: 107
		this.modelAngleZ = 0; // L: 108
		this.modelZoom = 100; // L: 109
		this.field3887 = 0; // L: 110
		this.field3943 = 0; // L: 111
		this.modelOrthog = false; // L: 113
		this.modelTransparency = false; // L: 114
		this.itemQuantityMode = 2; // L: 115
		this.fontId = -1; // L: 116
		this.text = ""; // L: 117
		this.field3895 = ""; // L: 118
		this.textLineHeight = 0; // L: 119
		this.textXAlignment = 0; // L: 120
		this.textYAlignment = 0; // L: 121
		this.textShadowed = false; // L: 122
		this.field3901 = -1; // L: 124
		this.flags = 0; // L: 129
		this.field3915 = false; // L: 130
		this.dataText = ""; // L: 139
		this.parent = null; // L: 141
		this.dragZoneSize = 0; // L: 142
		this.dragThreshold = 0; // L: 143
		this.isScrollBar = false; // L: 144
		this.spellActionName = ""; // L: 145
		this.hasListener = false; // L: 146
		this.mouseOverRedirect = -1; // L: 187
		this.field3960 = ""; // L: 188
		this.field3970 = "Ok"; // L: 189
		this.itemId = -1; // L: 192
		this.itemQuantity = 0; // L: 193
		this.modelFrame = 0; // L: 194
		this.modelFrameCycle = 0; // L: 195
		this.field3969 = false; // L: 197
		this.field3842 = false; // L: 198
		this.field3971 = -1; // L: 199
		this.field3899 = 0; // L: 200
		this.field3911 = 0; // L: 201
		this.field3974 = 0; // L: 202
		this.rootIndex = -1; // L: 203
		this.cycle = -1; // L: 204
		this.noClickThrough = false; // L: 206
		this.noScrollThrough = false; // L: 207
		this.prioritizeMenuEntry = false; // L: 208
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1473192041"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 211
		this.type = var1.readUnsignedByte(); // L: 212
		this.buttonType = var1.readUnsignedByte(); // L: 213
		this.contentType = var1.readUnsignedShort(); // L: 214
		this.rawX = var1.readShort(); // L: 215
		this.rawY = var1.readShort(); // L: 216
		this.rawWidth = var1.readUnsignedShort(); // L: 217
		this.rawHeight = var1.readUnsignedShort(); // L: 218
		this.transparencyTop = var1.readUnsignedByte(); // L: 219
		this.parentId = var1.readUnsignedShort(); // L: 220
		if (this.parentId == 65535) { // L: 221
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 222
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 223
		if (this.mouseOverRedirect == 65535) { // L: 224
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 225
		int var3;
		if (var2 > 0) { // L: 226
			this.cs1Comparisons = new int[var2]; // L: 227
			this.cs1ComparisonValues = new int[var2]; // L: 228

			for (var3 = 0; var3 < var2; ++var3) { // L: 229
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 230
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 231
			}
		}

		var3 = var1.readUnsignedByte(); // L: 234
		int var4;
		if (var3 > 0) { // L: 235
			this.cs1Instructions = new int[var3][]; // L: 236

			for (var4 = 0; var4 < var3; ++var4) { // L: 237
				int var5 = var1.readUnsignedShort(); // L: 238
				this.cs1Instructions[var4] = new int[var5]; // L: 239

				for (int var6 = 0; var6 < var5; ++var6) { // L: 240
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 241
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 242
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 246
			this.scrollHeight = var1.readUnsignedShort(); // L: 247
			this.isHidden = var1.readUnsignedByte() == 1; // L: 248
		}

		if (this.type == 1) { // L: 250
			var1.readUnsignedShort(); // L: 251
			var1.readUnsignedByte(); // L: 252
		}

		if (this.type == 3) { // L: 254
			this.fill = var1.readUnsignedByte() == 1; // L: 255
		}

		if (this.type == 4 || this.type == 1) { // L: 257
			this.textXAlignment = var1.readUnsignedByte(); // L: 258
			this.textYAlignment = var1.readUnsignedByte(); // L: 259
			this.textLineHeight = var1.readUnsignedByte(); // L: 260
			this.fontId = var1.readUnsignedShort(); // L: 261
			if (this.fontId == 65535) { // L: 262
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 263
		}

		if (this.type == 4) { // L: 265
			this.text = var1.readStringCp1252NullTerminated(); // L: 266
			this.field3895 = var1.readStringCp1252NullTerminated(); // L: 267
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 269
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 270
			this.color2 = var1.readInt(); // L: 271
			this.field3858 = var1.readInt(); // L: 272
			this.field3859 = var1.readInt(); // L: 273
		}

		if (this.type == 5) { // L: 275
			this.spriteId2 = var1.readInt(); // L: 276
			this.spriteId = var1.readInt(); // L: 277
		}

		if (this.type == 6) { // L: 279
			this.modelType = 1; // L: 280
			this.modelId = var1.readUnsignedShort(); // L: 281
			if (this.modelId == 65535) { // L: 282
				this.modelId = -1;
			}

			this.field3877 = 1; // L: 283
			this.field3878 = var1.readUnsignedShort(); // L: 284
			if (this.field3878 == 65535) { // L: 285
				this.field3878 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 286
			if (this.sequenceId == 65535) { // L: 287
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 288
			if (this.sequenceId2 == 65535) { // L: 289
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 290
			this.modelAngleX = var1.readUnsignedShort(); // L: 291
			this.modelAngleY = var1.readUnsignedShort(); // L: 292
		}

		if (this.type == 8) { // L: 294
			this.text = var1.readStringCp1252NullTerminated(); // L: 295
		}

		if (this.buttonType == 2) { // L: 297
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 298
			this.field3960 = var1.readStringCp1252NullTerminated(); // L: 299
			var4 = var1.readUnsignedShort() & 63; // L: 300
			this.flags |= var4 << 11; // L: 301
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 303
			this.field3970 = var1.readStringCp1252NullTerminated(); // L: 304
			if (this.field3970.length() == 0) { // L: 305
				if (this.buttonType == 1) { // L: 306
					this.field3970 = "Ok";
				}

				if (this.buttonType == 4) { // L: 307
					this.field3970 = "Select";
				}

				if (this.buttonType == 5) { // L: 308
					this.field3970 = "Select";
				}

				if (this.buttonType == 6) { // L: 309
					this.field3970 = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 312
			this.flags |= 4194304; // L: 313
		}

		if (this.buttonType == 6) { // L: 315
			this.flags |= 1; // L: 316
		}

	} // L: 318

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1148470664"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 321
		this.isIf3 = true; // L: 322
		this.type = var1.readUnsignedByte(); // L: 323
		this.contentType = var1.readUnsignedShort(); // L: 324
		this.rawX = var1.readShort(); // L: 325
		this.rawY = var1.readShort(); // L: 326
		this.rawWidth = var1.readUnsignedShort(); // L: 327
		if (this.type == 9) { // L: 328
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 329
		}

		this.widthAlignment = var1.readByte(); // L: 330
		this.heightAlignment = var1.readByte(); // L: 331
		this.xAlignment = var1.readByte(); // L: 332
		this.yAlignment = var1.readByte(); // L: 333
		this.parentId = var1.readUnsignedShort(); // L: 334
		if (this.parentId == 65535) { // L: 335
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 336
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 337
		if (this.type == 0) { // L: 338
			this.scrollWidth = var1.readUnsignedShort(); // L: 339
			this.scrollHeight = var1.readUnsignedShort(); // L: 340
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 341
		}

		if (this.type == 5) { // L: 343
			this.spriteId2 = var1.readInt(); // L: 344
			this.spriteAngle = var1.readUnsignedShort(); // L: 345
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 346
			this.transparencyTop = var1.readUnsignedByte(); // L: 347
			this.outline = var1.readUnsignedByte(); // L: 348
			this.spriteShadow = var1.readInt(); // L: 349
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 350
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 351
		}

		if (this.type == 6) { // L: 353
			this.modelType = 1; // L: 354
			this.modelId = var1.readUnsignedShort(); // L: 355
			if (this.modelId == 65535) { // L: 356
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 357
			this.modelOffsetY = var1.readShort(); // L: 358
			this.modelAngleX = var1.readUnsignedShort(); // L: 359
			this.modelAngleY = var1.readUnsignedShort(); // L: 360
			this.modelAngleZ = var1.readUnsignedShort(); // L: 361
			this.modelZoom = var1.readUnsignedShort(); // L: 362
			this.sequenceId = var1.readUnsignedShort(); // L: 363
			if (this.sequenceId == 65535) { // L: 364
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 365
			var1.readUnsignedShort(); // L: 366
			if (this.widthAlignment != 0) { // L: 367
				this.field3887 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 368
				var1.readUnsignedShort(); // L: 369
			}
		}

		if (this.type == 4) { // L: 372
			this.fontId = var1.readUnsignedShort(); // L: 373
			if (this.fontId == 65535) { // L: 374
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 375
			this.textLineHeight = var1.readUnsignedByte(); // L: 376
			this.textXAlignment = var1.readUnsignedByte(); // L: 377
			this.textYAlignment = var1.readUnsignedByte(); // L: 378
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 379
			this.color = var1.readInt(); // L: 380
		}

		if (this.type == 3) { // L: 382
			this.color = var1.readInt(); // L: 383
			this.fill = var1.readUnsignedByte() == 1; // L: 384
			this.transparencyTop = var1.readUnsignedByte(); // L: 385
		}

		if (this.type == 9) { // L: 387
			this.lineWid = var1.readUnsignedByte(); // L: 388
			this.color = var1.readInt(); // L: 389
			this.field3880 = var1.readUnsignedByte() == 1; // L: 390
		}

		this.flags = var1.readMedium(); // L: 392
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 393
		int var2 = var1.readUnsignedByte(); // L: 394
		if (var2 > 0) { // L: 395
			this.actions = new String[var2]; // L: 396

			for (int var3 = 0; var3 < var2; ++var3) { // L: 397
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 399
		this.dragThreshold = var1.readUnsignedByte(); // L: 400
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 401
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 402
		this.onLoad = this.readListener(var1); // L: 403
		this.onMouseOver = this.readListener(var1); // L: 404
		this.onMouseLeave = this.readListener(var1); // L: 405
		this.onTargetLeave = this.readListener(var1); // L: 406
		this.onTargetEnter = this.readListener(var1); // L: 407
		this.onVarTransmit = this.readListener(var1); // L: 408
		this.onInvTransmit = this.readListener(var1); // L: 409
		this.onStatTransmit = this.readListener(var1); // L: 410
		this.onTimer = this.readListener(var1); // L: 411
		this.onOp = this.readListener(var1); // L: 412
		this.onMouseRepeat = this.readListener(var1); // L: 413
		this.onClick = this.readListener(var1); // L: 414
		this.onClickRepeat = this.readListener(var1); // L: 415
		this.onRelease = this.readListener(var1); // L: 416
		this.onHold = this.readListener(var1); // L: 417
		this.onDrag = this.readListener(var1); // L: 418
		this.onDragComplete = this.readListener(var1); // L: 419
		this.onScroll = this.readListener(var1); // L: 420
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 421
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 422
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 423
	} // L: 424

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1311162477"
	)
	void method6858(Buffer var1) {
		this.field3832 = var1.readStringCp1252NullTerminated(); // L: 427
	} // L: 428

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)[Ljava/lang/Object;",
		garbageValue = "-44"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 431
		if (var2 == 0) { // L: 432
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 433

			for (int var4 = 0; var4 < var2; ++var4) { // L: 434
				int var5 = var1.readUnsignedByte(); // L: 435
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 436
				} else if (var5 == 1) { // L: 437
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 439
			return var3; // L: 440
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)[I",
		garbageValue = "765201367"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 444
		if (var2 == 0) { // L: 445
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 446

			for (int var4 = 0; var4 < var2; ++var4) { // L: 447
				var3[var4] = var1.readInt(); // L: 448
			}

			return var3; // L: 450
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnc;ZLea;I)Lvg;",
		garbageValue = "1975017005"
	)
	public SpritePixels method6861(class349 var1, boolean var2, UrlRequester var3) {
		field3828 = false; // L: 454
		if (this.field3868 != null) { // L: 455
			SpritePixels var4 = this.method6862(var1, var3); // L: 456
			if (var4 != null) { // L: 457
				return var4; // L: 458
			}
		}

		int var8;
		if (var2) { // L: 462
			var8 = this.spriteId;
		} else {
			var8 = this.spriteId2; // L: 463
		}

		if (var8 == -1) { // L: 464
			return null;
		} else {
			long var5 = ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var8 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40); // L: 465
			SpritePixels var7 = (SpritePixels)var1.field3739.get(var5); // L: 466
			if (var7 != null) { // L: 467
				return var7;
			} else {
				var7 = ArchiveDiskActionHandler.SpriteBuffer_getSprite(var1.field3748, var8, 0); // L: 468
				if (var7 == null) { // L: 469
					field3828 = true; // L: 470
					return null; // L: 471
				} else {
					this.method6865(var7); // L: 473
					var1.field3739.put(var7, var5); // L: 474
					return var7; // L: 475
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lea;B)Lvg;",
		garbageValue = "4"
	)
	SpritePixels method6862(class349 var1, UrlRequester var2) {
		if (!this.method6864()) { // L: 479
			return this.method6887(var1, var2); // L: 480
		} else {
			String var3 = this.field3868 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 482
			SpritePixels var4 = (SpritePixels)var1.field3745.method8418(var3); // L: 483
			if (var4 == null) { // L: 484
				SpritePixels var5 = this.method6887(var1, var2); // L: 485
				if (var5 != null) { // L: 486
					var4 = var5.method9997(); // L: 487
					this.method6865(var4); // L: 488
					var1.field3745.method8419(var3, var4); // L: 489
				}
			}

			return var4; // L: 492
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lea;I)Lvg;",
		garbageValue = "1974922267"
	)
	SpritePixels method6887(class349 var1, UrlRequester var2) {
		if (this.field3868 != null && var2 != null) { // L: 496
			class353 var3 = (class353)var1.field3747.method8418(this.field3868); // L: 497
			if (var3 == null) { // L: 498
				var3 = new class353(this.field3868, var2); // L: 499
				var1.field3747.method8419(this.field3868, var3); // L: 500
			}

			return var3.method6530(); // L: 502
		} else {
			return null; // L: 504
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-11"
	)
	boolean method6864() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 508
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-13"
	)
	void method6865(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 512
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 513
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 514
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 515
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 516
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 517
			var1.shadow(this.spriteShadow);
		}

	} // L: 518

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnc;B)Lqh;",
		garbageValue = "-125"
	)
	public Font method6866(class349 var1) {
		field3828 = false; // L: 521
		if (this.fontId == -1) { // L: 522
			return null;
		} else {
			Font var2 = (Font)var1.field3737.get((long)this.fontId); // L: 523
			if (var2 != null) { // L: 524
				return var2;
			} else {
				var2 = class148.method3275(var1.field3748, var1.field3738, this.fontId, 0); // L: 525
				if (var2 != null) {
					var1.field3737.put(var2, (long)this.fontId); // L: 526
				} else {
					field3828 = true; // L: 527
				}

				return var2; // L: 528
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lii;IZLne;Lhh;I)Llv;",
		garbageValue = "1051555386"
	)
	public Model method6877(class349 var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, class191 var6) {
		field3828 = false; // L: 532
		int var7;
		int var8;
		if (var4) { // L: 535
			var7 = this.field3877; // L: 536
			var8 = this.field3878; // L: 537
		} else {
			var7 = this.modelType; // L: 540
			var8 = this.modelId; // L: 541
		}

		if (var7 == 0) { // L: 543
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 544
			return null;
		} else {
			if (var6 != null && var6.field1980 && var7 == 6) { // L: 545
				var7 = 3; // L: 546
			}

			long var9 = (long)(var8 + (var7 << 16)); // L: 548
			if (var6 != null) {
				var9 |= var6.field1981 << 20; // L: 549
			}

			Model var11 = (Model)var1.field3735.get(var9); // L: 550
			if (var11 == null) { // L: 551
				ModelData var12 = null; // L: 552
				int var13 = 64; // L: 553
				int var14 = 768; // L: 554
				switch(var7) { // L: 555
				case 1:
					var12 = ModelData.ModelData_get(var1.field3743, var8, 0); // L: 563
					break; // L: 564
				case 2:
					var12 = class76.getNpcDefinition(var8).method3706((class191)null); // L: 557
					break;
				case 3:
					var12 = var5 != null ? var5.getModelData() : null; // L: 560
					break; // L: 561
				case 4:
					ItemComposition var15 = class164.ItemComposition_get(var8); // L: 566
					var12 = var15.getModelData(10); // L: 567
					var13 += var15.field2255; // L: 568
					var14 += var15.field2210; // L: 569
				case 5:
				default:
					break;
				case 6:
					var12 = class76.getNpcDefinition(var8).method3706(var6); // L: 572
				}

				if (var12 == null) { // L: 575
					field3828 = true; // L: 576
					return null; // L: 577
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 579
				var1.field3735.put(var11, var9); // L: 580
			}

			if (var2 != null) { // L: 582
				var11 = var2.transformWidgetModel(var11, var3); // L: 583
			}

			return var11; // L: 585
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnc;ZI)Lnw;",
		garbageValue = "768776562"
	)
	public SpriteMask method6943(class349 var1, boolean var2) {
		if (this.spriteId == -1) { // L: 589
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2; // L: 590
		if (var3 == -1) { // L: 591
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var3 + ((long)this.spriteShadow << 40); // L: 592
			SpriteMask var6 = (SpriteMask)var1.field3746.get(var4); // L: 593
			if (var6 != null) { // L: 594
				return var6;
			} else {
				SpritePixels var7 = this.method6861(var1, var2, (UrlRequester)null); // L: 595
				if (var7 == null) { // L: 596
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized(); // L: 597
					int[] var9 = new int[var8.subHeight]; // L: 598
					int[] var10 = new int[var8.subHeight]; // L: 599

					for (int var11 = 0; var11 < var8.subHeight; ++var11) { // L: 600
						int var12 = 0; // L: 601
						int var13 = var8.subWidth; // L: 602

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) { // L: 603
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 604
								var12 = var14; // L: 605
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) { // L: 609
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) { // L: 610
								var13 = var14 + 1; // L: 611
								break;
							}
						}

						var9[var11] = var12; // L: 615
						var10[var11] = var13 - var12; // L: 616
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3); // L: 618
					var1.field3746.put(var6, var4); // L: 619
					return var6; // L: 620
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-17"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 624
			String[] var3 = new String[var1 + 1]; // L: 625
			if (this.actions != null) { // L: 626
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 627
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 629
		}

		this.actions[var1] = var2; // L: 631
	} // L: 632

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1430637540"
	)
	public boolean method6870() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 635
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1203881795"
	)
	public boolean method6871() {
		return this.type == 11 || this.type == 12; // L: 639
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lea;J)V"
	)
	public void method6872(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) { // L: 643
			var1 = var1.replaceAll("%userid%", Long.toString(var4)); // L: 644
			this.field3900 = new class213(); // L: 645
			if (!this.field3900.method4121(var1, var2, var3)) { // L: 646
				this.field3900 = null; // L: 647
			} else {
				if (this.field3973 == null || this.field3925 == null) { // L: 650
					this.method6875(); // L: 651
				}

			}
		}
	} // L: 648 653

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lea;I)V",
		garbageValue = "-2004899217"
	)
	public void method6869(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3900 = new class213(); // L: 656
		if (!this.field3900.method4121(var1, var3, var6)) { // L: 657
			this.field3900 = null; // L: 658
		} else {
			if (this.field3973 == null || this.field3925 == null) { // L: 661
				this.method6875(); // L: 662
			}

			this.field3900.method4122(var2, var4, var5); // L: 664
		}
	} // L: 659 665

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;B)V",
		garbageValue = "5"
	)
	public void method6874(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 668
			this.field3900 = new class213(); // L: 669
			this.field3900.method4136(var1, var2); // L: 670
		}
	} // L: 671

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1157881439"
	)
	void method6875() {
		this.field3973 = new HashMap(); // L: 674
		this.field3925 = new HashMap(); // L: 675
	} // L: 676

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-413435181"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 679
			if (this.field3973 == null) {
				this.method6875(); // L: 680
			}

			this.field3973.put(var1, var2); // L: 681
		}
	} // L: 682

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1751243979"
	)
	public void method6981(String var1, int var2) {
		if (this.type == 11) { // L: 685
			if (this.field3925 == null) {
				this.method6875(); // L: 686
			}

			this.field3925.put(var1, var2); // L: 687
		}
	} // L: 688

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "1862989512"
	)
	public boolean method6878(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3900 != null && this.method6949()) { // L: 691
			var1 -= var3; // L: 692
			var2 -= var4; // L: 693
			int var5 = (int)(this.field3900.method4131()[0] * (float)this.width); // L: 694
			int var6 = (int)(this.field3900.method4131()[1] * (float)this.height); // L: 695
			int var7 = var5 + (int)(this.field3900.method4131()[2] * (float)this.width); // L: 696
			int var8 = var6 + (int)(this.field3900.method4131()[3] * (float)this.height); // L: 697
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 698
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1318138569"
	)
	public boolean method6949() {
		return this.field3901 == 2; // L: 702
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-568135728"
	)
	public int method6879(String var1) {
		return this.type == 11 && this.field3900 != null && this.method6949() ? this.field3900.method4125(var1) : -1; // L: 706 707 709
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1352084425"
	)
	public String method6942(String var1) {
		return this.type == 11 && this.field3900 != null && this.method6949() ? this.field3900.method4126(var1) : null; // L: 713 714
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1889991427"
	)
	public int method6881() {
		return this.field3925 != null && this.field3925.size() > 0 ? 1 : 0; // L: 718
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1941163667"
	)
	public int method6882() {
		if (this.type == 11 && this.field3900 != null && this.field3925 != null && !this.field3925.isEmpty()) { // L: 722
			String var1 = this.field3900.method4130(); // L: 723
			return var1 != null && this.field3925.containsKey(this.field3900.method4130()) ? (Integer)this.field3925.get(var1) : -1; // L: 724 725 727
		} else {
			return -1;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "55"
	)
	public String method6867() {
		if (this.type == 11 && this.field3900 != null) { // L: 731
			String var1 = this.field3900.method4130(); // L: 732
			Iterator var2 = this.field3900.method4129().iterator(); // L: 733

			while (var2.hasNext()) { // L: 744
				class227 var3 = (class227)var2.next(); // L: 734
				String var4 = String.format("%%%S%%", var3.method4322()); // L: 736
				if (var3.vmethod4325() == 0) { // L: 737
					var1.replaceAll(var4, Integer.toString(var3.vmethod4324())); // L: 738
				} else {
					var1.replaceAll(var4, var3.vmethod4323()); // L: 741
				}
			}

			return var1; // L: 745
		} else {
			return null;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1838237565"
	)
	public int[] method6863() {
		if (this.type == 11 && this.field3900 != null) { // L: 749
			int[] var1 = new int[3]; // L: 750
			int var2 = 0; // L: 751
			Iterator var3 = this.field3900.method4129().iterator(); // L: 752

			while (var3.hasNext()) {
				class227 var4 = (class227)var3.next(); // L: 753
				if (!var4.method4322().equals("user_id")) { // L: 755
					if (var4.vmethod4325() != 0) { // L: 756
						return null; // L: 763
					}

					var1[var2++] = var4.vmethod4324(); // L: 757
					if (var2 > 3) { // L: 758
						return null; // L: 759
					}
				}
			}

			return var1; // L: 768
		} else {
			return null;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Lis;",
		garbageValue = "-86720175"
	)
	public class213 method6920() {
		return this.field3900; // L: 772
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lea;B)Z",
		garbageValue = "-107"
	)
	public boolean method6995(class349 var1, UrlRequester var2) {
		if (this.type == 11 && this.field3900 != null) { // L: 776
			this.field3900.method4123(var2); // L: 777
			if (this.field3900.method4124() != this.field3901) { // L: 778
				this.field3901 = this.field3900.method4124(); // L: 779
				if (this.field3901 >= 3) { // L: 780
					return true; // L: 781
				}

				if (this.field3901 == 2) { // L: 783
					this.method6988(var1); // L: 784
					return true; // L: 785
				}
			}

			return false; // L: 788
		} else {
			return false;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lnc;B)V",
		garbageValue = "-12"
	)
	void method6988(class349 var1) {
		this.noClickThrough = true; // L: 809
		ArrayList var2 = this.field3900.method4127(); // L: 810
		ArrayList var3 = this.field3900.method4128(); // L: 811
		int var4 = var2.size() + var3.size(); // L: 812
		this.children = new Widget[var4]; // L: 813
		int var5 = 0; // L: 814

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 815 822
			class214 var7 = (class214)var6.next(); // L: 816
			var8 = EnumComposition.method3679(5, this, var5, 0, 0, 0, 0, var7.field2338); // L: 818
			var8.field3868 = var7.field2340.method2978(); // L: 819
			class353 var9 = new class353(var7.field2340); // L: 820
			var1.field3747.method8419(var8.field3868, var9); // L: 821
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) { // L: 825 833
			class225 var10 = (class225)var6.next(); // L: 826
			var8 = EnumComposition.method3679(4, this, var5, 0, 0, 0, 0, var10.field2415); // L: 828
			var8.text = var10.field2417; // L: 829
			var8.fontId = (Integer)this.field3973.get(var10.field2421); // L: 830
			var8.textXAlignment = var10.field2418; // L: 831
			var8.textYAlignment = var10.field2420; // L: 832
		}

	} // L: 836

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1624337550"
	)
	public void method6888() {
		this.field3904 = new class354(); // L: 839

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 840
			this.field3904.field3765.method392(var1, 0); // L: 841
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 843
			this.field3904.field3765.method393(var2, 0); // L: 844
		}

		this.field3904.field3765.method393('\u0080', 0); // L: 846
		this.field3904.field3765.method392(82, 2); // L: 847
		this.field3904.field3765.method392(81, 2); // L: 848
		this.field3904.field3765.method392(86, 2); // L: 849
	} // L: 850

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Lny;",
		garbageValue = "-5"
	)
	public class356 method6991() {
		return this.field3904 != null ? this.field3904.field3767 : null; // L: 853
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lnu;",
		garbageValue = "-1337216813"
	)
	public class350 method6890() {
		return this.field3904 != null ? this.field3904.field3764 : null; // L: 857
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lbj;",
		garbageValue = "-32445093"
	)
	public class27 method6940() {
		return this.field3904 != null ? this.field3904.field3765 : null; // L: 861
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lnd;",
		garbageValue = "49982108"
	)
	public class354 method6892() {
		return this.field3904; // L: 865
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)Z",
		garbageValue = "1964712087"
	)
	boolean method6868(class356 var1) {
		boolean var2 = false; // L: 869
		if (this.text != null && !this.text.isEmpty()) { // L: 870
			var2 |= var1.method6658(GrandExchangeOfferNameComparator.method7325(this.text)); // L: 871
			this.text = ""; // L: 872
		}

		if (this.field3895 != null && !this.field3895.isEmpty()) { // L: 874
			var2 |= var1.method6587(GrandExchangeOfferNameComparator.method7325(this.field3895)); // L: 875
			this.field3895 = ""; // L: 876
		}

		return var2; // L: 878
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)Z",
		garbageValue = "-2098200626"
	)
	public boolean method6894(class349 var1) {
		class356 var2 = this.method6991(); // L: 882
		if (var2 == null) { // L: 883
			return false;
		} else {
			boolean var3 = false; // L: 884
			if (!var2.method6640() && this.fontId != -1) { // L: 885
				int var4 = var2.method6641(); // L: 886
				int var5 = var2.method6642(); // L: 887
				int var6 = var2.method6639(); // L: 888
				int var7 = var2.method6779(); // L: 889
				Font var8 = this.method6866(var1); // L: 890
				if (var8 != null) { // L: 891
					var3 |= var2.method6795(var8); // L: 892
					var3 |= this.method6868(var2); // L: 893
					var3 |= var2.method6730(var4, var5); // L: 894
					var3 |= var2.method6608(var6, var7); // L: 895
				}
			} else if (var2.method6640()) { // L: 898
				var3 |= this.method6868(var2); // L: 899
			}

			var2.method6832(); // L: 901
			return var3; // L: 902
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnx;B)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method7006(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 11704
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 11705
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 11707
					if (var3 == -1) { // L: 11708
						break;
					}

					String var4 = var0.substring(0, var3); // L: 11709
					int var6 = Canvas.method325(var1, var2 - 1); // L: 11711
					String var5;
					if (var6 < 999999999) { // L: 11713
						var5 = Integer.toString(var6); // L: 11714
					} else {
						var5 = "*"; // L: 11717
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 11719
				}
			}
		}

		return var0; // L: 11723
	}
}
