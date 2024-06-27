import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mf")
class class337 implements Callable {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1132619759
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field3665;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1819061313
	)
	@Export("cameraYaw")
	static int cameraYaw;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmc;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class337(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1; // L: 124
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.field3624; // L: 127

		while (true) {
			class334 var2 = null; // L: 129
			synchronized(var1) { // L: 130
				if (var1.isEmpty() || this.val$cancelled.get()) { // L: 131
					return null; // L: 132
				}

				var2 = (class334)var1.remove(); // L: 134
			}

			var2.field3648.method1103(); // L: 136
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1471667085"
	)
	static int method6384(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4480
			class130.Interpreter_intStackSize -= 2; // L: 4481
			Client.field776 = (short)class155.method3324(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]); // L: 4482
			if (Client.field776 <= 0) { // L: 4483
				Client.field776 = 256;
			}

			Client.field777 = (short)class155.method3324(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 4484
			if (Client.field777 <= 0) { // L: 4485
				Client.field777 = 256;
			}

			return 1; // L: 4486
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4488
			class130.Interpreter_intStackSize -= 2; // L: 4489
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4490
			if (Client.zoomHeight <= 0) { // L: 4491
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4492
			if (Client.zoomWidth <= 0) { // L: 4493
				Client.zoomWidth = 320;
			}

			return 1; // L: 4494
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4496
			class130.Interpreter_intStackSize -= 4; // L: 4497
			Client.field751 = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4498
			if (Client.field751 <= 0) { // L: 4499
				Client.field751 = 1;
			}

			Client.field781 = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4500
			if (Client.field781 <= 0) { // L: 4501
				Client.field781 = 32767;
			} else if (Client.field781 < Client.field751) { // L: 4502
				Client.field781 = Client.field751;
			}

			Client.field782 = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 4503
			if (Client.field782 <= 0) { // L: 4504
				Client.field782 = 1;
			}

			Client.field783 = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3]; // L: 4505
			if (Client.field783 <= 0) { // L: 4506
				Client.field783 = 32767;
			} else if (Client.field783 < Client.field782) { // L: 4507
				Client.field783 = Client.field782;
			}

			return 1; // L: 4508
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4510
			if (Client.viewportWidget != null) { // L: 4511
				PacketWriter.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4512
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4513
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4514
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4517
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4518
			}

			return 1; // L: 4520
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4522
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4523
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4524
			return 1; // L: 4525
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4527
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class87.method2373(Client.field776); // L: 4528
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class87.method2373(Client.field777); // L: 4529
			return 1; // L: 4530
		} else if (var0 == 6220) { // L: 4532
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4533
			return 1; // L: 4534
		} else if (var0 == 6221) { // L: 4536
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4537
			return 1; // L: 4538
		} else if (var0 == 6222) { // L: 4540
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class74.canvasWidth; // L: 4541
			return 1; // L: 4542
		} else if (var0 == 6223) { // L: 4544
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class1.canvasHeight; // L: 4545
			return 1; // L: 4546
		} else {
			return 2; // L: 4548
		}
	}
}
