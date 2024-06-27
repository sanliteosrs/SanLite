import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static ArchiveDisk field224;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1541374105
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1872761615
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -578754821
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -784218957
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 3306884089864589761L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 896400541
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 480166059
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -167698723
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -8141281389356617939L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -787839099
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1568545757
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 318864607
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 6035223071582812827L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 265354951
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1073372179
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1849530853
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 1298699014946310789L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "116"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 76
		if (!var1.isAltDown() && var2 != 2) { // L: 77
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 78 79
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 124
			MouseHandler_idleCycles = 0; // L: 125
			MouseHandler_xVolatile = var1.getX(); // L: 126
			MouseHandler_yVolatile = var1.getY(); // L: 127
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 128
		}

	} // L: 130

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 95
			MouseHandler_idleCycles = 0; // L: 96
			MouseHandler_currentButtonVolatile = 0; // L: 97
		}

		if (var1.isPopupTrigger()) { // L: 99
			var1.consume();
		}

	} // L: 100

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 111
			MouseHandler_idleCycles = 0; // L: 112
			MouseHandler_xVolatile = -1; // L: 113
			MouseHandler_yVolatile = -1; // L: 114
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 115
		}

	} // L: 117

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 120
	} // L: 121

	public final void focusGained(FocusEvent var1) {
	} // L: 132

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 135
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 136

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 107
	} // L: 108

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 83
			MouseHandler_idleCycles = 0; // L: 84
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 85
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 86
			MouseHandler_lastPressedTimeMillisVolatile = WorldMapData_1.method4861(); // L: 87
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 88
			if (MouseHandler_lastButtonVolatile != 0) { // L: 89
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 91
			var1.consume();
		}

	} // L: 92

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 103
			var1.consume();
		}

	} // L: 104

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Llf;",
		garbageValue = "1379732656"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 439
		if (var1 != null) { // L: 440
			return var1;
		} else {
			var1 = World.method1909(class177.SequenceDefinition_animationsArchive, WorldMapLabelSize.SequenceDefinition_skeletonsArchive, var0, false); // L: 441
			if (var1 != null) { // L: 442
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 443
		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Lnx;III)V",
		garbageValue = "-1454606441"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 12638
			if (var0 != null) { // L: 12640
				Widget var4 = ObjectSound.method1976(var0); // L: 12643
				if (var4 == null) { // L: 12644
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 12647
					Client.clickedWidget = var0; // L: 12651
					var4 = ObjectSound.method1976(var0); // L: 12654
					if (var4 == null) { // L: 12655
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 12658
					Client.widgetClickX = var1; // L: 12659
					Client.widgetClickY = var2; // L: 12660
					class494.widgetDragDuration = 0; // L: 12661
					Client.isDraggingWidget = false; // L: 12662
					int var6 = Client.menuOptionsCount - 1; // L: 12665
					if (var6 != -1) { // L: 12668
						class175.method3559(var6);
					}

					return; // L: 12669
				}
			}

		}
	} // L: 12649
}
