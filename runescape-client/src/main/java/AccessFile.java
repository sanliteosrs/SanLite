import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("AccessFile")
public final class AccessFile {
	@ObfuscatedName("y")
	static byte[][][] field4098;
	@ObfuscatedName("f")
	@Export("file")
	RandomAccessFile file;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 3438090752021469399L
	)
	@Export("maxSize")
	final long maxSize;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 5591435214435484409L
	)
	@Export("offset")
	long offset;

	public AccessFile(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = Long.MAX_VALUE;
		}

		if (var1.length() > var3) {
			var1.delete();
		}

		this.file = new RandomAccessFile(var1, var2);
		this.maxSize = var3;
		this.offset = 0L;
		int var5 = this.file.read();
		if (var5 != -1 && !var2.equals("r")) {
			this.file.seek(0L);
			this.file.write(var5);
		}

		this.file.seek(0L);
	}

	@ObfuscatedName("f")
	@Export("seek")
	final void seek(long var1) throws IOException {
		this.file.seek(var1);
		this.offset = var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "53562428"
	)
	@Export("write")
	public final void write(byte[] var1, int var2, int var3) throws IOException {
		if ((long)var3 + this.offset > this.maxSize) {
			this.file.seek(this.maxSize);
			this.file.write(1);
			throw new EOFException();
		} else {
			this.file.write(var1, var2, var3);
			this.offset += (long)var3;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532680077"
	)
	@Export("close")
	public final void close() throws IOException {
		this.closeSync(false);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "31"
	)
	@Export("closeSync")
	public final void closeSync(boolean var1) throws IOException {
		if (this.file != null) {
			if (var1) {
				try {
					this.file.getFD().sync();
				} catch (SyncFailedException var3) {
				}
			}

			this.file.close();
			this.file = null;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-419220313"
	)
	@Export("length")
	public final long length() throws IOException {
		return this.file.length();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-803541857"
	)
	@Export("read")
	public final int read(byte[] var1, int var2, int var3) throws IOException {
		int var4 = this.file.read(var1, var2, var3);
		if (var4 > 0) {
			this.offset += (long)var4;
		}

		return var4;
	}

	protected void finalize() throws Throwable {
		if (this.file != null) {
			System.out.println("");
			this.close();
		}

	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "715885494"
	)
	static final void method6437(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field831[var4] = true;
			}
		}

	}
}
