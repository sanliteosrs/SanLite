import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ae")
public class class10 {
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1828915477
	)
	static int field58;
	@ObfuscatedName("aq")
	final HttpsURLConnection field51;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	final class457 field54;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class9 field53;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class493 field56;
	@ObfuscatedName("ap")
	boolean field52;
	@ObfuscatedName("an")
	boolean field55;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 347953321
	)
	int field50;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lai;Lrw;Z)V"
	)
	public class10(URL var1, class9 var2, class457 var3, boolean var4) throws IOException {
		this.field52 = false; // L: 17
		this.field55 = false; // L: 18
		this.field50 = 300000; // L: 19
		if (!var2.method66()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method70());
		} else {
			this.field51 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.field51.setSSLSocketFactory(class15.method197());
			}

			this.field53 = var2; // L: 33
			this.field54 = var3 != null ? var3 : new class457(); // L: 34
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lai;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class457(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lrw;",
		garbageValue = "1"
	)
	public class457 method81() {
		return this.field54;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I)V",
		garbageValue = "-713727113"
	)
	public void method82(class493 var1) {
		if (!this.field52) {
			if (var1 == null) {
				this.field54.method8396("Content-Type");
				this.field56 = null;
			} else {
				this.field56 = var1;
				if (this.field56.vmethod8875() != null) {
					this.field54.method8361(this.field56.vmethod8875());
				} else {
					this.field54.method8394();
				}

			}
		}
	} // L: 46

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "653231409"
	)
	void method90() throws ProtocolException {
		if (!this.field52) {
			this.field51.setRequestMethod(this.field53.method70());
			this.field54.method8362(this.field51); // L: 60
			if (this.field53.method68() && this.field56 != null) {
				this.field51.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.field56.vmethod8869());
					var1.writeTo(this.field51.getOutputStream()); // L: 66
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.field51.setConnectTimeout(this.field50);
			this.field51.setInstanceFollowRedirects(this.field55);
			this.field52 = true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-202873158"
	)
	boolean method84() throws IOException {
		if (!this.field52) {
			this.method90();
		}

		this.field51.connect();
		return this.field51.getResponseCode() == -1; // L: 88
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Las;",
		garbageValue = "-1"
	)
	class20 method85() {
		try {
			if (!this.field52 || this.field51.getResponseCode() == -1) {
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field51.disconnect();
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 97
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field51);
			return var1; // L: 109
		} catch (IOException var8) { // L: 103
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field51.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "2071485688"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition(); // L: 78
			var1.id = var0; // L: 79
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) { // L: 82
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lug;I)V",
		garbageValue = "-1281612379"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 25
		if (var1 != null) { // L: 26
			int var2 = var0.offset; // L: 27
			var0.writeInt(var1.id); // L: 28

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 29
				if (var1.creationErrors[var3] != 0) { // L: 30
					var0.writeByte(var1.creationErrors[var3]); // L: 31
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 35
						Field var5;
						int var6;
						if (var4 == 0) { // L: 36
							var5 = var1.fields[var3]; // L: 37
							var6 = Reflection.getInt(var5, (Object)null); // L: 38
							var0.writeByte(0); // L: 39
							var0.writeInt(var6); // L: 40
						} else if (var4 == 1) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 44
							var0.writeByte(0); // L: 45
						} else if (var4 == 2) { // L: 47
							var5 = var1.fields[var3]; // L: 48
							var6 = var5.getModifiers(); // L: 49
							var0.writeByte(0); // L: 50
							var0.writeInt(var6); // L: 51
						}

						Method var25;
						if (var4 != 3) { // L: 53
							if (var4 == 4) { // L: 73
								var25 = var1.methods[var3]; // L: 74
								var6 = var25.getModifiers(); // L: 75
								var0.writeByte(0); // L: 76
								var0.writeInt(var6); // L: 77
							}
						} else {
							var25 = var1.methods[var3]; // L: 54
							byte[][] var10 = var1.arguments[var3]; // L: 55
							Object[] var7 = new Object[var10.length]; // L: 56

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 57
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 58
								var7[var8] = var9.readObject(); // L: 59
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 61
							if (var11 == null) { // L: 62
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 63
								var0.writeByte(1); // L: 64
								var0.writeLong(((Number)var11).longValue()); // L: 65
							} else if (var11 instanceof String) { // L: 67
								var0.writeByte(2); // L: 68
								var0.writeStringCp1252NullTerminated((String)var11); // L: 69
							} else {
								var0.writeByte(4); // L: 71
							}
						}
					} catch (ClassNotFoundException var13) { // L: 80
						var0.writeByte(-10); // L: 81
					} catch (InvalidClassException var14) { // L: 83
						var0.writeByte(-11); // L: 84
					} catch (StreamCorruptedException var15) { // L: 86
						var0.writeByte(-12); // L: 87
					} catch (OptionalDataException var16) { // L: 89
						var0.writeByte(-13); // L: 90
					} catch (IllegalAccessException var17) { // L: 92
						var0.writeByte(-14); // L: 93
					} catch (IllegalArgumentException var18) { // L: 95
						var0.writeByte(-15); // L: 96
					} catch (InvocationTargetException var19) { // L: 98
						var0.writeByte(-16); // L: 99
					} catch (SecurityException var20) { // L: 101
						var0.writeByte(-17); // L: 102
					} catch (IOException var21) { // L: 104
						var0.writeByte(-18); // L: 105
					} catch (NullPointerException var22) { // L: 107
						var0.writeByte(-19); // L: 108
					} catch (Exception var23) { // L: 110
						var0.writeByte(-20); // L: 111
					} catch (Throwable var24) { // L: 113
						var0.writeByte(-21); // L: 114
					}
				}
			}

			var0.writeCrc(var2); // L: 117
			var1.remove(); // L: 118
		}
	} // L: 119

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1862488722"
	)
	static int method98(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4193
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4194
			return 1; // L: 4195
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4197
			class130.Interpreter_intStackSize -= 3; // L: 4198
			Client.publicChatMode = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4199
			class522.privateChatMode = class6.method40(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]); // L: 4200
			if (class522.privateChatMode == null) { // L: 4201
				class522.privateChatMode = PrivateChatMode.field5501;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]; // L: 4202
			PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.field3332, Client.packetWriter.isaacCipher); // L: 4204
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4205
			var13.packetBuffer.writeByte(class522.privateChatMode.field5503); // L: 4206
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4207
			Client.packetWriter.addNode(var13); // L: 4208
			return 1; // L: 4209
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4211
				var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4212
				class130.Interpreter_intStackSize -= 2; // L: 4213
				var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4214
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4215
				var6 = class170.getPacketBufferNode(ClientPacket.field3349, Client.packetWriter.isaacCipher); // L: 4217
				var6.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4218
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4219
				var6.packetBuffer.writeByte(var7 - 1); // L: 4220
				var6.packetBuffer.writeByte(var9); // L: 4221
				Client.packetWriter.addNode(var6); // L: 4222
				return 1; // L: 4223
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4225
					class130.Interpreter_intStackSize -= 2; // L: 4226
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4227
					var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4228
					var5 = class91.Messages_getByChannelAndID(var3, var7); // L: 4229
					if (var5 != null) { // L: 4230
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.count; // L: 4231
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.cycle; // L: 4232
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4233
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4234
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4235
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4236
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4239
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4240
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4241
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4242
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4243
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4244
					}

					return 1; // L: 4246
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4248
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4249
						var4 = Frames.Messages_getMessage(var3); // L: 4250
						if (var4 != null) { // L: 4251
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.type; // L: 4252
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.cycle; // L: 4253
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4254
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4255
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4256
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4257
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4260
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4261
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4262
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4263
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4264
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4265
						}

						return 1; // L: 4267
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4269
						if (class522.privateChatMode == null) { // L: 4270
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class522.privateChatMode.field5503; // L: 4271
						}

						return 1; // L: 4272
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4274
							var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4275
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4276
							var12 = class476.method8675(var7, var8, BuddyRankComparator.clientLanguage, -1); // L: 4277
							Client.packetWriter.addNode(var12); // L: 4278
							return 1; // L: 4279
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4281
							class337.Interpreter_stringStackSize -= 2; // L: 4282
							var8 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize]; // L: 4283
							String var11 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1]; // L: 4284
							var12 = class170.getPacketBufferNode(ClientPacket.field3321, Client.packetWriter.isaacCipher); // L: 4286
							var12.packetBuffer.writeShort(0); // L: 4287
							int var10 = var12.packetBuffer.offset; // L: 4288
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4289
							class225.method4305(var12.packetBuffer, var11); // L: 4290
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4291
							Client.packetWriter.addNode(var12); // L: 4292
							return 1; // L: 4293
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4295
							var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4296
							class130.Interpreter_intStackSize -= 2; // L: 4297
							var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4298
							var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4299
							var6 = class476.method8675(var7, var8, BuddyRankComparator.clientLanguage, var9); // L: 4300
							Client.packetWriter.addNode(var6); // L: 4301
							return 1; // L: 4302
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4304
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4311
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4312
								return 1; // L: 4313
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4315
								var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4316
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class53.Messages_getHistorySize(var3); // L: 4317
								return 1; // L: 4318
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4320
								var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4321
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class36.Messages_getLastChatID(var3); // L: 4322
								return 1; // L: 4323
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4325
								var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4326
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class74.method2159(var3); // L: 4327
								return 1; // L: 4328
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4330
								var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4331
								class164.doCheat(var8); // L: 4332
								return 1; // L: 4333
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4335
								Client.field736 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4336
								return 1; // L: 4337
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4339
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Client.field736; // L: 4340
								return 1; // L: 4341
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4343
								var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize]; // L: 4344
								System.out.println(var8); // L: 4345
								return 1; // L: 4346
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4348
								class130.Interpreter_intStackSize -= 2; // L: 4349
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]; // L: 4350
								var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]; // L: 4351
								var5 = class91.Messages_getByChannelAndID(var3, var7); // L: 4352
								if (var5 != null) { // L: 4353
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.count; // L: 4354
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.cycle; // L: 4355
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4356
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4357
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4358
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4359
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4360
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4361
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4364
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4365
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4366
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4367
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4368
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4369
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4370
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4371
								}

								return 1; // L: 4373
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4375
								var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]; // L: 4376
								var4 = Frames.Messages_getMessage(var3); // L: 4377
								if (var4 != null) { // L: 4378
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.type; // L: 4379
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.cycle; // L: 4380
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4381
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4382
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4383
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4384
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4385
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4386
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1; // L: 4389
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4390
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4391
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4392
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4393
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4394
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = ""; // L: 4395
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 4396
								}

								return 1; // L: 4398
							} else {
								return 2; // L: 4400
							}
						} else {
							if (SoundCache.localPlayer != null && SoundCache.localPlayer.username != null) { // L: 4306
								var8 = SoundCache.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4307
							}

							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var8; // L: 4308
							return 1; // L: 4309
						}
					}
				}
			}
		}
	}
}
