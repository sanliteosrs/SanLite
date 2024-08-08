import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ah")
	public static short[] field829;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1850775767
	)
	int field835;

	@ObfuscatedSignature(
		descriptor = "(Luu;)V"
	)
	FriendSystem(LoginType var1) {
		this.field835 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1624105511"
	)
	boolean method1911() {
		return this.field835 == 2; // L: 32
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1205650652"
	)
	final void method1912() {
		this.field835 = 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "-126"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field835 = 2; // L: 41
		MidiPcmStream.method6317(); // L: 42
	} // L: 43

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4936 < WorldMapData_1.method4861() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					VarbitComposition.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					VarbitComposition.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2051313334"
	)
	@Export("clear")
	final void clear() {
		this.field835 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvo;ZI)Z",
		garbageValue = "1902606376"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(SoundCache.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Z",
		garbageValue = "648592187"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-68"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					AbstractWorldMapIcon.method5076("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 80
				} else if (SoundCache.localPlayer.username.equals(var2)) { // L: 84
					AbstractWorldMapIcon.method5076("You can't add yourself to your own friend list"); // L: 86
				} else if (this.isFriended(var2, false)) { // L: 90
					SoundSystem.method870(var1); // L: 91
				} else if (this.isIgnored(var2)) { // L: 94
					class498.method8897(var1); // L: 95
				} else {
					PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.field3354, Client.packetWriter.isaacCipher); // L: 100
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1)); // L: 101
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 102
					Client.packetWriter.addNode(var3); // L: 103
				}
			}
		}
	} // L: 82 88 92 96 105

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field628 != 1; // L: 120
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "317572337"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 127
			Username var2 = new Username(var1, this.loginType); // L: 128
			if (var2.hasCleanName()) { // L: 129
				if (this.canAddIgnore()) { // L: 130
					class148.method3277(); // L: 131
				} else if (SoundCache.localPlayer.username.equals(var2)) { // L: 134
					class235.method4450(); // L: 135
				} else if (this.isIgnored(var2)) { // L: 138
					AbstractWorldMapIcon.method5076(var1 + " is already on your ignore list"); // L: 140
				} else if (this.isFriended(var2, false)) { // L: 144
					AbstractWorldMapIcon.method5076("Please remove " + var1 + " from your friend list first"); // L: 146
				} else {
					PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.field3298, Client.packetWriter.isaacCipher); // L: 152
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1)); // L: 153
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 154
					Client.packetWriter.addNode(var3); // L: 155
				}
			}
		}
	} // L: 132 136 142 148 157

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2113018311"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field628 != 1; // L: 168
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "9"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 175
			Username var2 = new Username(var1, this.loginType); // L: 176
			if (var2.hasCleanName()) { // L: 177
				if (this.friendsList.removeByUsername(var2)) { // L: 178
					class498.method8900(); // L: 179
					PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.field3291, Client.packetWriter.isaacCipher); // L: 181
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1)); // L: 182
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 183
					Client.packetWriter.addNode(var3); // L: 184
				}

				MidiPcmStream.method6317(); // L: 186
			}
		}
	} // L: 187

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "88"
	)
	public final void method1917(String var1, boolean var2) {
		if (var1 != null) { // L: 190
			Username var3 = new Username(var1, this.loginType); // L: 191
			if (var3.hasCleanName()) { // L: 192
				if (this.ignoreList.removeByUsername(var3)) { // L: 193
					class498.method8900(); // L: 194
					if (var2) { // L: 195
						PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.field3356, Client.packetWriter.isaacCipher); // L: 197
						var4.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1)); // L: 198
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 199
						Client.packetWriter.addNode(var4); // L: 200
					}
				}

				class153.FriendSystem_invalidateIgnoreds(); // L: 203
			}
		}
	} // L: 204

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)Z",
		garbageValue = "-1955548629"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 216
		return var2 != null && var2.hasWorld(); // L: 217
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfi;",
		garbageValue = "33"
	)
	static class136 method1975(int var0) {
		class136 var1 = (class136)class210.findEnumerated(class421.method7720(), var0); // L: 35
		if (var1 == null) {
			var1 = class136.field1609; // L: 36
		}

		return var1; // L: 37
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1235413797"
	)
	static final int method1931(int var0, int var1) {
		if (var0 == -2) { // L: 1025
			return 12345678;
		} else if (var0 == -1) { // L: 1026
			if (var1 < 2) { // L: 1027
				var1 = 2;
			} else if (var1 > 126) { // L: 1028
				var1 = 126;
			}

			return var1; // L: 1029
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1031
			if (var1 < 2) { // L: 1032
				var1 = 2;
			} else if (var1 > 126) { // L: 1033
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1034
		}
	}
}
