import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("aq")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ad")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 512687671
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ak")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 725690807
	)
	@Export("position")
	int position;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1931419243
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("aj")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0; // L: 66
		this.limit = 0; // L: 67
		this.inputStream = var1; // L: 71
		this.capacity = var2 + 1; // L: 72
		this.buffer = new byte[this.capacity]; // L: 73
		this.thread = new Thread(this); // L: 74
		this.thread.setDaemon(true); // L: 75
		this.thread.start(); // L: 76
	} // L: 77

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "436261401"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) { // L: 113
			return true;
		} else if (var1 > 0 && var1 < this.capacity) { // L: 114
			synchronized(this) { // L: 115
				int var3;
				if (this.position <= this.limit) { // L: 117
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit; // L: 118
				}

				if (var3 < var1) { // L: 119
					if (this.exception != null) { // L: 120
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll(); // L: 121
						return false; // L: 122
					}
				} else {
					return true; // L: 124
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) { // L: 129
			int var2;
			if (this.position <= this.limit) { // L: 131
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit; // L: 132
			}

			if (var2 <= 0 && this.exception != null) { // L: 133
				throw new IOException(this.exception.toString()); // L: 134
			} else {
				this.notifyAll(); // L: 136
				return var2; // L: 137
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1875502007"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) { // L: 142
			if (this.position == this.limit) { // L: 143
				if (this.exception != null) { // L: 144
					throw new IOException(this.exception.toString());
				} else {
					return -1; // L: 145
				}
			} else {
				int var2 = this.buffer[this.position] & 255; // L: 147
				this.position = (this.position + 1) % this.capacity; // L: 148
				this.notifyAll(); // L: 149
				return var2; // L: 150
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-316841250"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 155
			synchronized(this) { // L: 156
				int var5;
				if (this.position <= this.limit) { // L: 158
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit; // L: 159
				}

				if (var3 > var5) { // L: 160
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) { // L: 161
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) { // L: 162
						System.arraycopy(this.buffer, this.position, var1, var2, var3); // L: 163
					} else {
						int var6 = this.capacity - this.position; // L: 166
						System.arraycopy(this.buffer, this.position, var1, var2, var6); // L: 167
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6); // L: 168
					}

					this.position = (var3 + this.position) % this.capacity; // L: 170
					this.notifyAll(); // L: 171
					return var3; // L: 172
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-748039453"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 177
			if (this.exception == null) {
				this.exception = new IOException(""); // L: 178
			}

			this.notifyAll(); // L: 179
		}

		try {
			this.thread.join(); // L: 182
		} catch (InterruptedException var3) { // L: 184
		}

	} // L: 185

	public void run() {
		while (true) {
			int var1;
			synchronized(this) { // L: 82
				while (true) {
					if (this.exception != null) { // L: 84
						return;
					}

					if (this.position == 0) { // L: 85
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) { // L: 86
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1; // L: 87
					}

					if (var1 > 0) { // L: 88
						break;
					}

					try {
						this.wait(); // L: 90
					} catch (InterruptedException var10) { // L: 92
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1); // L: 97
				if (var7 == -1) {
					throw new EOFException(); // L: 98
				}
			} catch (IOException var11) { // L: 100
				IOException var3 = var11;
				synchronized(this) { // L: 101
					this.exception = var3; // L: 102
					return; // L: 103
				}
			}

			synchronized(this) { // L: 106
				this.limit = (var7 + this.limit) % this.capacity; // L: 107
			} // L: 108
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1252528992"
	)
	static int method8745(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5119
			int var5 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 5120
			NPCComposition var6 = class76.getNpcDefinition(var5); // L: 5121
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5122
			return 1; // L: 5123
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5125
				class130.Interpreter_intStackSize -= 2; // L: 5126
				var3 = class76.getNpcDefinition(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]); // L: 5127
				int var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 5128
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.method3702(var4); // L: 5129
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.method3716(var4); // L: 5130
				return 1; // L: 5131
			} else if (var0 == 6765) { // L: 5133
				var3 = class76.getNpcDefinition(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 5134
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3 != null ? var3.headIconPrayer : 0; // L: 5135
				return 1; // L: 5136
			} else {
				return 2; // L: 5138
			}
		}
	}
}
