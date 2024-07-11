import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("bs")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1606866427
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 7888700868123221241L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ap")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -346913947
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1301322249
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -843017577
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ah")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 952788633
	)
	static int field168;
	@ObfuscatedName("ax")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bm")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1670919295
	)
	static int field192;
	@ObfuscatedName("bb")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	static class25 field198;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = -6613666108012219409L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = 5693631408863609669L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("an")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -484823375
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 373494117
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 804948849
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 964979307
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1732148147
	)
	int field183;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1556082277
	)
	int field174;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 131784241
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1466302067
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bj")
	protected boolean field187;
	@ObfuscatedName("bo")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bi")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ba")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bp")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bx")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = 3441533685991574943L
	)
	volatile long field195;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bc")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bv")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20; // L: 48
		fiveOrOne = 1; // L: 49
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field192 = 500;
		volatileFocus = true;
		field198 = new class25(); // L: 89
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L; // L: 92
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0;
		this.canvasY = 0;
		this.field187 = false; // L: 71
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false; // L: 80
		this.field195 = 0L; // L: 81
		EventQueue var1 = null; // L: 95

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 97
		} catch (Throwable var3) {
		}

		this.eventQueue = var1; // L: 100
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		MenuAction.pcmPlayerProvider = var2; // L: 103
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "202277740"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method508();
		}

		this.maxCanvasWidth = var1; // L: 109
		this.maxCanvasHeight = var2; // L: 110
	} // L: 111

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-111"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 114
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 115
				class188.method3688(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 116
			}

		}
	} // L: 117

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Liv;",
		garbageValue = "1"
	)
	@Export("mouseWheel")
	protected class218 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 120
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 121
			this.mouseWheelHandler.addTo(this.canvas); // L: 122
		}

		return this.mouseWheelHandler; // L: 124
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 128
	} // L: 129

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1132305210"
	)
	protected void method556(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 132
	} // L: 133

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "49"
	)
	public Clipboard method490() {
		return this.clipboard; // L: 136
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1953437785"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 141
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 142
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 143
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 144
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 145
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 146
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 147
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 148
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 149
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 150
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 151
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 152
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 153
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 156
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 157
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 158
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 159
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 160
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 161
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 162
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 163
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 164
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 165
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 166
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 167
		}

		field198.method377(this.canvas); // L: 170
	} // L: 171

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1186708796"
	)
	protected final void method492() {
		field198.method387(); // L: 178
	} // L: 179

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbm;II)V",
		garbageValue = "-1066967820"
	)
	protected void method493(class29 var1, int var2) {
		field198.method353(var1, var2); // L: 182
	} // L: 183

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	protected final void method494() {
		class430.method7909(this.canvas); // L: 186
	} // L: 187

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 190
		if (var1 != null) { // L: 191
			Bounds var2 = this.getFrameContentBounds(); // L: 192
			this.contentWidth = Math.max(var2.highX, this.field183); // L: 193
			this.contentHeight = Math.max(var2.highY, this.field174); // L: 194
			if (this.contentWidth <= 0) { // L: 195
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 196
				this.contentHeight = 1;
			}

			class74.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 197
			class1.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 198
			this.canvasX = (this.contentWidth - class74.canvasWidth) / 2; // L: 199
			this.canvasY = 0; // L: 200
			this.canvas.setSize(class74.canvasWidth, class1.canvasHeight); // L: 201
			class434.rasterProvider = new RasterProvider(class74.canvasWidth, class1.canvasHeight, this.canvas, this.field187); // L: 202
			if (var1 == this.frame) { // L: 203
				Insets var3 = this.frame.getInsets(); // L: 204
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top); // L: 205
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 207
			}

			this.fullRedraw = true; // L: 208
			this.resizeGame(); // L: 209
		}
	} // L: 210

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "643678777"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2071720493"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 215
		int var2 = this.canvasY; // L: 216
		int var3 = this.contentWidth - class74.canvasWidth - var1; // L: 217
		int var4 = this.contentHeight - class1.canvasHeight - var2; // L: 218
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 219
			try {
				Container var5 = this.container(); // L: 221
				int var6 = 0; // L: 222
				int var7 = 0; // L: 223
				if (var5 == this.frame) { // L: 224
					Insets var8 = this.frame.getInsets(); // L: 225
					var6 = var8.left; // L: 226
					var7 = var8.top; // L: 227
				}

				Graphics var10 = var5.getGraphics(); // L: 229
				var10.setColor(Color.black); // L: 230
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 231
				}

				if (var2 > 0) { // L: 232
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 233
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 234
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 236
			}
		}

	} // L: 238

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1122838543"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field198.method356(this.canvas); // L: 241
		class47.method899(this.canvas); // L: 242
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method303(this.canvas); // L: 243
		}

		this.addCanvas(); // L: 244
		field198.method377(this.canvas); // L: 245
		class430.method7909(this.canvas); // L: 246
		if (this.mouseWheelHandler != null) { // L: 247
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method508(); // L: 248
	} // L: 249

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-38"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 253
				++GameEngine_redundantStartThreadCount; // L: 254
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 255
					this.error("alreadyloaded"); // L: 256
					return; // L: 257
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 259
				return; // L: 260
			}

			gameEngine = this; // L: 262
			class74.canvasWidth = var1; // L: 263
			class1.canvasHeight = var2; // L: 264
			class18.RunException_revision = var3; // L: 265
			RunException.field5517 = var4; // L: 266
			class427.RunException_applet = this; // L: 267
			if (taskHandler == null) { // L: 268
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 269
		} catch (Exception var6) { // L: 271
			FriendsChatManager.RunException_sendStackTrace((String)null, var6); // L: 272
			this.error("crash"); // L: 273
		}

	} // L: 275

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 278
		if (this.canvas != null) { // L: 279
			this.canvas.removeFocusListener(this); // L: 280
			var1.remove(this.canvas); // L: 281
		}

		class74.canvasWidth = Math.max(var1.getWidth(), this.field183); // L: 283
		class1.canvasHeight = Math.max(var1.getHeight(), this.field174); // L: 284
		Insets var2;
		if (this.frame != null) { // L: 285
			var2 = this.frame.getInsets(); // L: 286
			class74.canvasWidth -= var2.left + var2.right; // L: 287
			class1.canvasHeight -= var2.bottom + var2.top; // L: 288
		}

		this.canvas = new Canvas(this); // L: 290
		var1.setBackground(Color.BLACK); // L: 291
		var1.setLayout((LayoutManager)null); // L: 292
		var1.add(this.canvas); // L: 293
		this.canvas.setSize(class74.canvasWidth, class1.canvasHeight); // L: 294
		this.canvas.setVisible(true); // L: 295
		this.canvas.setBackground(Color.BLACK); // L: 296
		if (var1 == this.frame) { // L: 297
			var2 = this.frame.getInsets(); // L: 298
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY); // L: 299
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 301
		}

		this.canvas.addFocusListener(this); // L: 302
		this.canvas.requestFocus(); // L: 303
		this.fullRedraw = true; // L: 304
		if (class434.rasterProvider != null && class74.canvasWidth == class434.rasterProvider.width && class1.canvasHeight == class434.rasterProvider.height) { // L: 305
			((RasterProvider)class434.rasterProvider).setComponent(this.canvas); // L: 306
			class434.rasterProvider.drawFull(0, 0); // L: 307
		} else {
			class434.rasterProvider = new RasterProvider(class74.canvasWidth, class1.canvasHeight, this.canvas, this.field187); // L: 310
		}

		this.isCanvasInvalid = false; // L: 312
		this.field195 = WorldMapData_1.method4861(); // L: 313
	} // L: 314

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "298982067"
	)
	protected void method501(boolean var1) {
		if (this.field187 != var1) { // L: 317
			this.field187 = var1; // L: 318
			class434.rasterProvider.method9963(var1); // L: 319
			class434.rasterProvider.apply(); // L: 320
		}

	} // L: 322

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "112"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 325
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 326
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 327
				if (var1.endsWith("127.0.0.1")) { // L: 328
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 329
					}

					if (var1.endsWith("192.168.1.")) { // L: 330
						return true;
					} else {
						this.error("invalidhost"); // L: 331
						return false; // L: 332
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-514909241"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = WorldMapData_1.method4861(); // L: 380
		long var3 = clientTickTimes[class333.field3643]; // L: 381
		clientTickTimes[class333.field3643] = var1; // L: 382
		class333.field3643 = class333.field3643 + 1 & 31; // L: 383
		if (0L != var3 && var1 > var3) { // L: 384
		}

		synchronized(this) { // L: 385
			class498.hasFocus = volatileFocus; // L: 386
		} // L: 387

		this.doCycle(); // L: 388
	} // L: 389

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1743954661"
	)
	protected final void method505() {
		this.fullRedraw = true; // L: 392
	} // L: 393

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1635671306"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 396
		long var2 = WorldMapData_1.method4861(); // L: 397
		long var4 = graphicsTickTimes[field168]; // L: 398
		graphicsTickTimes[field168] = var2; // L: 399
		field168 = field168 + 1 & 31; // L: 400
		if (0L != var4 && var2 > var4) { // L: 401
			int var6 = (int)(var2 - var4); // L: 402
			fps = ((var6 >> 1) + 32000) / var6; // L: 403
		}

		if (++field192 - 1 > 50) { // L: 405
			field192 -= 50; // L: 406
			this.fullRedraw = true; // L: 407
			this.canvas.setSize(class74.canvasWidth, class1.canvasHeight); // L: 408
			this.canvas.setVisible(true); // L: 409
			if (var1 == this.frame) { // L: 410
				Insets var7 = this.frame.getInsets(); // L: 411
				this.canvas.setLocation(var7.left + this.canvasX, var7.top + this.canvasY); // L: 412
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 414
			}
		}

		if (this.isCanvasInvalid) { // L: 416
			this.replaceCanvas();
		}

		this.method507(); // L: 417
		this.draw(this.fullRedraw); // L: 418
		if (this.fullRedraw) { // L: 419
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 420
	} // L: 421

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-133672907"
	)
	final void method507() {
		Bounds var1 = this.getFrameContentBounds(); // L: 424
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 425
			this.resizeCanvas(); // L: 426
			this.resizeCanvasNextFrame = false; // L: 427
		}

	} // L: 429

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	final void method508() {
		this.resizeCanvasNextFrame = true; // L: 432
	} // L: 433

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-54"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 436
			isKilled = true; // L: 437

			try {
				this.canvas.removeFocusListener(this); // L: 439
			} catch (Exception var5) { // L: 441
			}

			try {
				this.kill0(); // L: 443
			} catch (Exception var4) { // L: 445
			}

			if (this.frame != null) { // L: 446
				try {
					System.exit(0); // L: 448
				} catch (Throwable var3) { // L: 450
				}
			}

			if (taskHandler != null) { // L: 452
				try {
					taskHandler.close(); // L: 454
				} catch (Exception var2) { // L: 456
				}
			}

			this.vmethod1251(); // L: 458
		}
	} // L: 459

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1663834683"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1954908195"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2038512898"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "-1214201888"
	)
	protected final void method546(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics(); // L: 545
			if (class96.fontHelvetica13 == null) { // L: 546
				class96.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 547
				loginScreenFontMetrics = this.canvas.getFontMetrics(class96.fontHelvetica13); // L: 548
			}

			if (var3 && !var4) { // L: 550 551
				var5.setColor(Color.black); // L: 552
				var5.fillRect(0, 0, class74.canvasWidth, class1.canvasHeight); // L: 553
			}

			Color var6 = new Color(140, 17, 17); // L: 556

			try {
				if (VarpDefinition.field1875 == null) { // L: 558
					VarpDefinition.field1875 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = VarpDefinition.field1875.getGraphics(); // L: 559
				var7.setColor(var6); // L: 560
				var7.drawRect(0, 0, 303, 33); // L: 561
				var7.fillRect(2, 2, var1 * 3, 30); // L: 562
				var7.setColor(Color.black); // L: 563
				var7.drawRect(1, 1, 301, 31); // L: 564
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 565
				var7.setFont(class96.fontHelvetica13); // L: 566
				var7.setColor(Color.white); // L: 567
				var7.drawString(var2, (304 - loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 568
				var5.drawImage(VarpDefinition.field1875, class74.canvasWidth / 2 - 152, class1.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null); // L: 569
			} catch (Exception var10) { // L: 571
				int var8 = class74.canvasWidth / 2 - 152; // L: 572
				int var9 = class1.canvasHeight / 2 - 18; // L: 573
				var5.setColor(var6); // L: 574
				var5.drawRect(var8, var9, 303, 33); // L: 575
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30); // L: 576
				var5.setColor(Color.black); // L: 577
				var5.drawRect(var8 + 1, var9 + 1, 301, 31); // L: 578
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30); // L: 579
				var5.setFont(class96.fontHelvetica13); // L: 580
				var5.setColor(Color.white); // L: 581
				var5.drawString(var2, var8 + (304 - loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22); // L: 582
			}
		} catch (Exception var11) { // L: 585
			this.canvas.repaint(); // L: 586
		}

	} // L: 588

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2062404968"
	)
	protected final void method595() {
		VarpDefinition.field1875 = null; // L: 591
		class96.fontHelvetica13 = null; // L: 592
		loginScreenFontMetrics = null; // L: 593
	} // L: 594

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-13"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 597
			this.hasErrored = true; // L: 598
			System.out.println("error_game_" + var1); // L: 599

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 601
			} catch (Exception var3) { // L: 603
			}

		}
	} // L: 604

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "189125753"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 607
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lqa;",
		garbageValue = "2061208262"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 612
		int var2 = Math.max(var1.getWidth(), this.field183); // L: 613
		int var3 = Math.max(var1.getHeight(), this.field174); // L: 614
		if (this.frame != null) { // L: 615
			Insets var4 = this.frame.getInsets(); // L: 616
			var2 -= var4.left + var4.right; // L: 617
			var3 -= var4.bottom + var4.top; // L: 618
		}

		return new Bounds(var2, var3); // L: 620
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "23192789"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 624
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1067293593"
	)
	protected abstract void vmethod1251();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 482
			stopTimeMs = WorldMapData_1.method4861(); // L: 483
			class188.method3688(5000L); // L: 484
			this.kill(); // L: 485
		}
	} // L: 486

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 495
			this.fullRedraw = true; // L: 496
			if (WorldMapData_1.method4861() - this.field195 > 1000L) { // L: 497
				Rectangle var2 = var1.getClipBounds(); // L: 498
				if (var2 == null || var2.width >= class74.canvasWidth && var2.height >= class1.canvasHeight) {
					this.isCanvasInvalid = true; // L: 499
				}
			}

		}
	} // L: 501

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 470
			stopTimeMs = 0L; // L: 471
		}
	} // L: 472

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 476
			stopTimeMs = WorldMapData_1.method4861() + 4000L; // L: 477
		}
	} // L: 478

	public final void update(Graphics var1) {
		this.paint(var1); // L: 490
	} // L: 491

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 505
		this.fullRedraw = true; // L: 506
	} // L: 507

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 511
	} // L: 512

	public final void windowActivated(WindowEvent var1) {
	} // L: 515

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 522
	} // L: 523

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 526

	public final void windowIconified(WindowEvent var1) {
	} // L: 532

	public final void windowOpened(WindowEvent var1) {
	} // L: 535

	@ObfuscatedName("init")
	@Export("kill0")
	public abstract void kill0();

	public final void windowClosed(WindowEvent var1) {
	} // L: 518

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 529

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 337
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 338
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 339
					String var2 = TaskHandler.javaVersion; // L: 340
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 341
						this.error("wrongjava"); // L: 342
						return; // L: 343
					}

					if (var2.startsWith("1.6.0_")) { // L: 345
						int var3;
						for (var3 = 6; var3 < var2.length() && WorldMapID.isDigit(var2.charAt(var3)); ++var3) { // L: 346 347
						}

						String var4 = var2.substring(6, var3); // L: 348
						if (HealthBarUpdate.isNumber(var4) && GrandExchangeEvent.method7351(var4) < 10) { // L: 349
							this.error("wrongjava"); // L: 350
							return; // L: 351
						}
					}

					fiveOrOne = 5; // L: 354
				}
			}

			this.setFocusCycleRoot(true); // L: 357
			this.addCanvas(); // L: 359
			this.setUp(); // L: 361
			class146.clock = class399.method7401(); // L: 362

			while (stopTimeMs == 0L || WorldMapData_1.method4861() < stopTimeMs) { // L: 363
				class156.gameCyclesToDo = class146.clock.wait(cycleDurationMillis, fiveOrOne); // L: 364

				for (int var5 = 0; var5 < class156.gameCyclesToDo; ++var5) { // L: 365
					this.clientTick();
				}

				this.graphicsTick(); // L: 367
				this.post(this.canvas); // L: 369
			}
		} catch (Exception var6) { // L: 372
			FriendsChatManager.RunException_sendStackTrace((String)null, var6); // L: 373
			this.error("crash"); // L: 374
		}

		this.kill(); // L: 376
	} // L: 377

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "1504122559"
	)
	static boolean method655(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 58
			try {
				if (!class31.field150.startsWith("win")) { // L: 60
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 61
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 62

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 63
						if (var11.indexOf(var0.charAt(var4)) == -1) { // L: 64
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 66
					return true; // L: 67
				}
			} catch (Throwable var5) { // L: 69
				return false; // L: 70
			}
		} else if (var1 == 1) { // L: 73
			try {
				Object var10 = class26.method389(class31.field154, var2, new Object[]{(new URL(class31.field154.getCodeBase(), var0)).toString()}); // L: 75
				return var10 != null; // L: 76
			} catch (Throwable var6) { // L: 78
				return false; // L: 79
			}
		} else if (var1 == 2) { // L: 82
			try {
				class31.field154.getAppletContext().showDocument(new URL(class31.field154.getCodeBase(), var0), "_blank"); // L: 84
				return true; // L: 85
			} catch (Exception var7) { // L: 87
				return false; // L: 88
			}
		} else if (var1 == 3) { // L: 91
			try {
				Applet var3 = class31.field154; // L: 93
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 96
			} catch (Throwable var9) { // L: 99
			}

			try {
				class31.field154.getAppletContext().showDocument(new URL(class31.field154.getCodeBase(), var0), "_top"); // L: 101
				return true; // L: 102
			} catch (Exception var8) { // L: 104
				return false; // L: 105
			}
		} else {
			throw new IllegalArgumentException(); // L: 108
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnx;II)V",
		garbageValue = "879741099"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3907 == null) { // L: 1272
			throw new RuntimeException(); // L: 1273
		} else {
			if (var0.field3977 == null) { // L: 1275
				var0.field3977 = new int[var0.field3907.length]; // L: 1276
			}

			var0.field3977[var1] = Integer.MAX_VALUE; // L: 1278
		}
	} // L: 1279

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1484686825"
	)
	static int method645(int var0, Script var1, boolean var2) {
		return 2; // L: 3289
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-885355978"
	)
	static boolean method656(int var0) {
		for (int var1 = 0; var1 < Client.field741; ++var1) { // L: 12596
			if (Client.field592[var1] == var0) { // L: 12597
				return true;
			}
		}

		return false; // L: 12599
	}
}
