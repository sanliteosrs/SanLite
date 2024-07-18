import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2122551751
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -870602463
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ab")
	boolean field1461;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1278220435
	)
	int field1457;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1102504087
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	ServerPacket field1462;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	ServerPacket field1459;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	ServerPacket field1464;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1461 = true; // L: 22
		this.field1457 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "981239932"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release();
			}
		}

	} // L: 52

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "36"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsp;S)V",
		garbageValue = "-10366"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1942660628"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "505606497"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lsp;",
		garbageValue = "1302914773"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("aq")
	public static int method2920(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 47
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "2066687441"
	)
	static int method2940(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4432
			class130.Interpreter_intStackSize -= 2; // L: 4433
			var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4434
			int var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4435
			if (!Client.isCameraLocked) { // L: 4436
				Client.camAngleX = var3; // L: 4437
				Client.camAngleY = var4; // L: 4438
			}

			return 1; // L: 4440
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4442
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4443
			return 1; // L: 4444
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4446
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4447
			return 1; // L: 4448
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4450
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4451
			if (var3 < 0) { // L: 4452
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4453
			return 1; // L: 4454
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4456
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4457
			return 1; // L: 4458
		} else {
			return 2; // L: 4460
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1529308622"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 5283
			var2 = 1;
		}

		if (var3 < 1) { // L: 5284
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 5285
		int var6;
		if (var5 < 0) { // L: 5287
			var6 = Client.field776;
		} else if (var5 >= 100) { // L: 5288
			var6 = Client.field777;
		} else {
			var6 = (Client.field777 - Client.field776) * var5 / 100 + Client.field776; // L: 5289
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 5290
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field782) { // L: 5291
			var10 = Client.field782; // L: 5292
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 5293
			if (var6 > Client.field781) { // L: 5294
				var6 = Client.field781; // L: 5295
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 5296
				var9 = (var2 - var8) / 2; // L: 5297
				if (var4) { // L: 5298
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5299
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 5300
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 5301
				}

				var0 += var9; // L: 5303
				var2 -= var9 * 2; // L: 5304
			}
		} else if (var7 > Client.field783) { // L: 5307
			var10 = Client.field783; // L: 5308
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 5309
			if (var6 < Client.field751) { // L: 5310
				var6 = Client.field751; // L: 5311
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 5312
				var9 = (var3 - var8) / 2; // L: 5313
				if (var4) { // L: 5314
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5315
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5316
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5317
				}

				var1 += var9; // L: 5319
				var3 -= var9 * 2; // L: 5320
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5323
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5324
			class193.method3758(var2, var3); // L: 5325
		}

		Client.viewportOffsetX = var0; // L: 5327
		Client.viewportOffsetY = var1; // L: 5328
		Client.viewportWidth = var2; // L: 5329
		Client.viewportHeight = var3; // L: 5330
	} // L: 5331
}
