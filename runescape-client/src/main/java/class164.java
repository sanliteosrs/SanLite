import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class164 {
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -592304533
	)
	static int field1812;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -2954807226888514321L
	)
	long field1811;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 7504978253578014429L
	)
	public long field1808;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	IterableNodeDeque field1809;

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public class164(Buffer var1) {
		this.field1808 = -1L; // L: 10
		this.field1809 = new IterableNodeDeque(); // L: 11
		this.method3452(var1); // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "2078305167"
	)
	void method3452(Buffer var1) {
		this.field1811 = var1.readLong(); // L: 23
		this.field1808 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class159(this);
			} else if (var2 == 4) {
				var3 = new class170(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class155(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class153(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class160(this);
			}

			((class163)var3).vmethod3524(var1); // L: 34
			this.field1809.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "1710439935"
	)
	public void method3453(ClanChannel var1) {
		if (var1.key == this.field1811 && var1.field1821 == this.field1808) { // L: 41
			for (class163 var2 = (class163)this.field1809.last(); var2 != null; var2 = (class163)this.field1809.previous()) { // L: 44
				var2.vmethod3523(var1); // L: 45
			}

			++var1.field1821; // L: 47
		} else {
			throw new RuntimeException(""); // L: 42
		}
	} // L: 48

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "371239413"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 99
		if (var1 != null) { // L: 100
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemComposition_archive.takeFile(10, var0); // L: 101
			var1 = new ItemComposition(); // L: 102
			var1.id = var0; // L: 103
			if (var2 != null) { // L: 104
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 105
			if (var1.noteTemplate != -1) { // L: 106
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 107
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 108
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!ItemComposition.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 109
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) { // L: 110
					var1.name = var1.name + " (Members)"; // L: 111
				}

				var1.field2216 = "Login to a members' server to use this object."; // L: 113
				var1.isTradable = false; // L: 114

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 115
					var1.groundActions[var3] = null; // L: 116
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 118
					if (var3 != 4) { // L: 119
						var1.inventoryActions[var3] = null; // L: 120
					}
				}

				var1.shiftClickIndex = -2; // L: 123
				var1.field2257 = 0; // L: 124
				if (var1.params != null) { // L: 125
					boolean var6 = false; // L: 126

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 127
						ParamComposition var5 = ApproximateRouteStrategy.getParamDefinition((int)var4.key); // L: 128
						if (var5.autoDisable) { // L: 129
							var4.remove();
						} else {
							var6 = true; // L: 130
						}
					}

					if (!var6) { // L: 132
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 135
			return var1; // L: 136
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-693831415"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 4305
			class105.clientPreferences.method2572(!class105.clientPreferences.method2664()); // L: 4306
			if (class105.clientPreferences.method2664()) { // L: 4307
				VarbitComposition.addGameMessage(99, "", "Roofs are now all hidden"); // L: 4308
			} else {
				VarbitComposition.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 4311
			}
		}

		if (var0.startsWith("zbuf")) { // L: 4314
			boolean var1 = GrandExchangeEvent.method7351(var0.substring(5).trim()) == 1; // L: 4315
			class415.client.method501(var1); // L: 4316
			Rasterizer3D.method5325(var1); // L: 4317
		}

		if (var0.equalsIgnoreCase("z")) { // L: 4319
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 4320
			class105.clientPreferences.method2579();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 4321
			Client.field551 = !Client.field551;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 4322
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (var0.startsWith("setdrawdistance")) { // L: 4323
			String[] var3 = var0.split(" "); // L: 4324

			try {
				int var2 = Integer.parseInt(var3[1]); // L: 4326
				class105.clientPreferences.method2601(var2); // L: 4327
			} catch (NumberFormatException var5) { // L: 4329
				VarbitComposition.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1])); // L: 4330
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) { // L: 4333
			VarbitComposition.addGameMessage(99, "", String.format("%d", class105.clientPreferences.method2569())); // L: 4334
		}

		if (Client.staffModLevel >= 2) { // L: 4336
			if (var0.equalsIgnoreCase("errortest")) { // L: 4337
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 4338
				VertexNormal.worldMap.field5187 = !VertexNormal.worldMap.field5187;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 4339
				class105.clientPreferences.method2642(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 4340
				class105.clientPreferences.method2642(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 4341
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 4342
				class131.method3068();
			}
		}

		PacketBufferNode var6 = class170.getPacketBufferNode(ClientPacket.field3285, Client.packetWriter.isaacCipher); // L: 4345
		var6.packetBuffer.writeByte(var0.length() + 1); // L: 4346
		var6.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4347
		Client.packetWriter.addNode(var6); // L: 4348
	} // L: 4349
}
