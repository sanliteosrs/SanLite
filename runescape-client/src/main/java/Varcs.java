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

@ObfuscatedName("eb")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ag")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ak")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ap")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("an")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 8608497769085740539L
	)
	long field1443;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = ApproximateRouteStrategy.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2); // L: 35
			VarcInt var3;
			if (var4 != null) { // L: 36
				var3 = var4; // L: 37
			} else {
				byte[] var5 = class333.VarcInt_archive.takeFile(19, var2); // L: 40
				var4 = new VarcInt(); // L: 41
				if (var5 != null) {
					var4.method3611(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (ApproximateRouteStrategy.archive2.method7148(15)) { // L: 50
			var2 = ApproximateRouteStrategy.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-54"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) { // L: 59
			this.unwrittenChanges = true;
		}

	} // L: 60

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "120"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "310302319"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1141305685"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "588752435"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-28"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "743867945"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 93
			if (!this.intsPersistence[var1]) { // L: 94
				this.map.remove(var1); // L: 95
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 98
			this.strings[var1] = null; // L: 99
		}

	} // L: 101

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lus;",
		garbageValue = "-1423377787"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return UserComparator10.getPreferencesFile("2", class109.field1400.name, var1); // L: 104
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1703158902"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 108

		try {
			int var2 = 3; // L: 110
			int var3 = 0; // L: 111
			Iterator var4 = this.map.entrySet().iterator(); // L: 112

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 113
				int var6 = (Integer)var5.getKey(); // L: 115
				if (this.intsPersistence[var6]) { // L: 116
					Object var7 = var5.getValue(); // L: 117
					var2 += 3; // L: 118
					if (var7 instanceof Integer) { // L: 119
						var2 += 4;
					} else if (var7 instanceof String) { // L: 120
						var2 += Actor.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 121
				}
			}

			Buffer var27 = new Buffer(var2); // L: 125
			var27.writeByte(2); // L: 126
			var27.writeShort(var3); // L: 127
			Iterator var28 = this.map.entrySet().iterator(); // L: 128

			label144:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset); // L: 158
						break label144;
					}

					var16 = (Entry)var28.next(); // L: 129
					var17 = (Integer)var16.getKey(); // L: 131
				} while(!this.intsPersistence[var17]); // L: 132

				var27.writeShort(var17); // L: 133
				Object var8 = var16.getValue(); // L: 134
				Class var10 = var8.getClass(); // L: 136
				class534[] var11 = class534.method9415(); // L: 139
				int var12 = 0;

				class534 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null; // L: 150
						break;
					}

					class534 var13 = var11[var12]; // L: 141
					if (var10 == var13.field5291) { // L: 143
						var9 = var13; // L: 144
						break; // L: 145
					}

					++var12; // L: 140
				}

				var27.writeByte(var9.field5288); // L: 153
				class534.method9407(var8, var27); // L: 154
			}
		} catch (Exception var25) { // L: 160
		} finally {
			try {
				var1.close(); // L: 163
			} catch (Exception var24) { // L: 165
			}

		}

		this.unwrittenChanges = false; // L: 167
		this.field1443 = WorldMapData_1.method4861(); // L: 168
	} // L: 169

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 172

		label246: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 174

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 175 176 179
					var4 = var1.read(var2, var3, var2.length - var3); // L: 177
					if (var4 == -1) { // L: 178
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 181
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte(); // L: 183
					if (var15 >= 0 && var15 <= 2) {
						int var7;
						int var8;
						int var9;
						int var16;
						if (var15 >= 2) { // L: 185
							var16 = var14.readUnsignedShort(); // L: 186
							var7 = 0;

							while (true) {
								if (var7 >= var16) {
									break label246;
								}

								var8 = var14.readUnsignedShort(); // L: 188
								var9 = var14.readUnsignedByte(); // L: 189
								class534 var10 = (class534)class210.findEnumerated(class534.method9415(), var9); // L: 190
								Object var11 = var10.method9409(var14); // L: 191
								if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 192
									this.map.put(var8, var11); // L: 193
								}

								++var7; // L: 187
							}
						} else {
							var16 = var14.readUnsignedShort(); // L: 198

							for (var7 = 0; var7 < var16; ++var7) { // L: 199
								var8 = var14.readUnsignedShort(); // L: 200
								var9 = var14.readInt(); // L: 201
								if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 202
									this.map.put(var8, var9); // L: 203
								}
							}

							var7 = var14.readUnsignedShort(); // L: 206
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label246;
								}

								var14.readUnsignedShort(); // L: 208
								var14.readStringCp1252NullTerminated(); // L: 209
								++var8; // L: 207
							}
						}
					}

					return; // L: 184
				}
			} catch (Exception var25) { // L: 213
				break label246;
			} finally {
				try {
					var1.close(); // L: 216
				} catch (Exception var24) { // L: 218
				}

			}

			return; // L: 182
		}

		this.unwrittenChanges = false; // L: 220
	} // L: 221

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1911988545"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1443 < WorldMapData_1.method4861() - 60000L) { // L: 224
			this.write(); // L: 225
		}

	} // L: 227

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "63"
	)
	boolean method2862() {
		return this.unwrittenChanges; // L: 230
	}
}
