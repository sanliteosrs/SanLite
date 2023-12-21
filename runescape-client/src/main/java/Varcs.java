import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("jw")
	static int[][] field1394;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -1204156157
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("ar")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ao")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ab")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("au")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -1753585760681832167L
	)
	long field1393;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class344.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var3 = class140.method3195(var2); // L: 33
			this.intsPersistence[var2] = var3.persist; // L: 34
		}

		var2 = 0; // L: 36
		if (class344.archive2.method6909(15)) { // L: 37
			var2 = class344.archive2.getGroupFileCount(15); // L: 38
		}

		this.strings = new String[var2]; // L: 40
		this.read(); // L: 41
	} // L: 42

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1897497270"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 45
		if (this.intsPersistence[var1]) { // L: 46
			this.unwrittenChanges = true;
		}

	} // L: 47

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1991515717"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 50
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 51 52 54
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-59"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 58
	} // L: 59

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "32"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 62
		return var2 instanceof String ? (String)var2 : ""; // L: 63 64 66
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1603974039"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 71
	} // L: 72

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 76
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "19136992"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 80
			if (!this.intsPersistence[var1]) { // L: 81
				this.map.remove(var1); // L: 82
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 85
			this.strings[var1] = null; // L: 86
		}

	} // L: 88

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lto;",
		garbageValue = "-1859436086"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class131.getPreferencesFile("2", Messages.field1401.name, var1); // L: 91
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2104867526"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 95

		try {
			int var2 = 3; // L: 97
			int var3 = 0; // L: 98
			Iterator var4 = this.map.entrySet().iterator(); // L: 99

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 100
				int var6 = (Integer)var5.getKey(); // L: 102
				if (this.intsPersistence[var6]) { // L: 103
					Object var7 = var5.getValue(); // L: 104
					var2 += 3; // L: 105
					if (var7 instanceof Integer) { // L: 106
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += ClanChannel.stringCp1252NullTerminatedByteSize((String)var7); // L: 107
					}

					++var3; // L: 108
				}
			}

			Buffer var26 = new Buffer(var2); // L: 112
			var26.writeByte(2); // L: 113
			var26.writeShort(var3); // L: 114
			Iterator var27 = this.map.entrySet().iterator(); // L: 115

			while (var27.hasNext()) {
				Entry var15 = (Entry)var27.next(); // L: 116
				int var16 = (Integer)var15.getKey(); // L: 118
				if (this.intsPersistence[var16]) { // L: 119
					var26.writeShort(var16); // L: 120
					Object var8 = var15.getValue(); // L: 121
					class514 var9 = class514.method9124(var8.getClass()); // L: 122
					var26.writeByte(var9.field5063); // L: 123
					Class var11 = var8.getClass(); // L: 126
					class514 var12 = class514.method9124(var11); // L: 128
					if (var12 == null) { // L: 129
						throw new IllegalArgumentException();
					}

					class510 var10 = var12.field5062; // L: 130
					var10.vmethod9135(var8, var26); // L: 133
				}
			}

			var1.write(var26.array, 0, var26.offset); // L: 138
		} catch (Exception var24) { // L: 140
		} finally {
			try {
				var1.close(); // L: 143
			} catch (Exception var23) { // L: 145
			}

		}

		this.unwrittenChanges = false; // L: 147
		this.field1393 = SpotAnimationDefinition.method3775(); // L: 148
	} // L: 149

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 152

		label232: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 154

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 155 156 159
					var4 = var1.read(var2, var3, var2.length - var3); // L: 157
					if (var4 == -1) { // L: 158
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 161
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte(); // L: 163
					if (var15 < 0 || var15 > 2) {
						return; // L: 164
					}

					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 165
						var16 = var14.readUnsignedShort(); // L: 166
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label232;
							}

							var8 = var14.readUnsignedShort(); // L: 168
							var9 = var14.readUnsignedByte(); // L: 169
							class514 var10 = (class514)class12.findEnumerated(class514.method9122(), var9); // L: 170
							Object var11 = var10.method9120(var14); // L: 171
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 172
								this.map.put(var8, var11); // L: 173
							}

							++var7; // L: 167
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 178

						for (var7 = 0; var7 < var16; ++var7) { // L: 179
							var8 = var14.readUnsignedShort(); // L: 180
							var9 = var14.readInt(); // L: 181
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 182
								this.map.put(var8, var9); // L: 183
							}
						}

						var7 = var14.readUnsignedShort(); // L: 186
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label232;
							}

							var14.readUnsignedShort(); // L: 188
							var14.readStringCp1252NullTerminated(); // L: 189
							++var8; // L: 187
						}
					}
				}
			} catch (Exception var25) { // L: 193
				break label232;
			} finally {
				try {
					var1.close(); // L: 196
				} catch (Exception var24) { // L: 198
				}

			}

			return; // L: 162
		}

		this.unwrittenChanges = false; // L: 200
	} // L: 201

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1055402619"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1393 < SpotAnimationDefinition.method3775() - 60000L) { // L: 204
			this.write(); // L: 205
		}

	} // L: 207

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 210
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "2070284698"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class31.scrollBarSprites[0].drawAt(var0, var1); // L: 11285
		class31.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11286
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field565); // L: 11287
		int var5 = var3 * (var3 - 32) / var4; // L: 11288
		if (var5 < 8) { // L: 11289
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11290
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field670); // L: 11291
		Rasterizer2D.method9693(var0, var6 + var1 + 16, var5, Client.field568); // L: 11292
		Rasterizer2D.method9693(var0 + 1, var6 + var1 + 16, var5, Client.field568); // L: 11293
		Rasterizer2D.method9623(var0, var6 + var1 + 16, 16, Client.field568); // L: 11294
		Rasterizer2D.method9623(var0, var6 + var1 + 17, 16, Client.field568); // L: 11295
		Rasterizer2D.method9693(var0 + 15, var6 + var1 + 16, var5, Client.field567); // L: 11296
		Rasterizer2D.method9693(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field567); // L: 11297
		Rasterizer2D.method9623(var0, var5 + var6 + var1 + 15, 16, Client.field567); // L: 11298
		Rasterizer2D.method9623(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field567); // L: 11299
	} // L: 11300
}
