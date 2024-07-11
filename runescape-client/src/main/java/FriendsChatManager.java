import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ak")
	@Export("name")
	public String name;
	@ObfuscatedName("ap")
	@Export("owner")
	public String owner;
	@ObfuscatedName("an")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2048302067
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 380981587
	)
	int field4930;

	@ObfuscatedSignature(
		descriptor = "(Luu;Lrv;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4930 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsk;",
		garbageValue = "99"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsk;",
		garbageValue = "-2040243144"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "8"
	)
	final void method8480(String var1) {
		this.name = class189.method3693(var1);
	} // L: 36

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "59"
	)
	final void method8481(String var1) {
		this.owner = class189.method3693(var1); // L: 39
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvp;IB)V",
		garbageValue = "1"
	)
	public final void method8483(Buffer var1, int var2) {
		this.method8481(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong(); // L: 44
		long var6 = var3;
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) {
			if (0L == var3 % 37L) {
				var5 = null; // L: 53
			} else {
				var8 = 0;

				for (long var9 = var3; var9 != 0L; var9 /= 37L) {
					++var8;
				}

				StringBuilder var11 = new StringBuilder(var8);

				while (0L != var6) {
					long var12 = var6;
					var6 /= 37L; // L: 65
					var11.append(class417.base37Table[(int)(var12 - var6 * 37L)]);
				}

				var5 = var11.reverse().toString();
			}
		} else {
			var5 = null;
		}

		this.method8480(var5);
		this.minKick = var1.readByte();
		short var14;
		if (var2 == 1) { // L: 74
			var8 = var1.readUnsignedByte(); // L: 75
			var14 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var8 = var1.method9574();
			var14 = -1;
		}

		if (var8 != var14) {
			int var10 = var8;
			this.clear();

			for (int var15 = 0; var15 < var10; ++var15) {
				FriendsChatMember var16 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var13 = var1.readUnsignedShort(); // L: 92
				var16.set(var13, ++this.field4930 - 1);
				var16.rank = var1.readByte();
				var1.readStringCp1252NullTerminated(); // L: 95
				this.isLocalPlayer(var16); // L: 96
			}

		}
	} // L: 98

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1534482955"
	)
	public final void method8484(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 101
		int var3 = var1.readUnsignedShort(); // L: 102
		byte var4 = var1.readByte(); // L: 103
		boolean var5 = false; // L: 104
		if (var4 == -128) { // L: 105
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 106
			if (this.getSize() == 0) { // L: 107
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 108
			if (var6 != null && var6.getWorld() == var3) { // L: 109
				this.remove(var6); // L: 110
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 114
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 115
			if (var6 == null) { // L: 116
				if (this.getSize() > super.capacity) { // L: 117
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2); // L: 118
			}

			var6.set(var3, ++this.field4930 - 1); // L: 120
			var6.rank = var4; // L: 121
			this.isLocalPlayer(var6); // L: 122
		}

	} // L: 124

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	public final void method8485() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 127
			((FriendsChatMember)this.get(var1)).method8530(); // L: 128
		}

	} // L: 130

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "114"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 133
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 134
		}

	} // L: 136

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsd;I)V",
		garbageValue = "-826874512"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 139
			this.rank = var1.rank;
		}

	} // L: 140

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "2001939372"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					Throwable var4 = var1; // L: 37
					String var5;
					if (var1 instanceof RunException) { // L: 40
						RunException var6 = (RunException)var1; // L: 41
						var5 = var6.message + " | "; // L: 42
						var4 = var6.throwable; // L: 43
					} else {
						var5 = ""; // L: 45
					}

					StringWriter var18 = new StringWriter(); // L: 46
					PrintWriter var7 = new PrintWriter(var18); // L: 47
					var4.printStackTrace(var7); // L: 48
					var7.close(); // L: 49
					String var8 = var18.toString(); // L: 50
					BufferedReader var9 = new BufferedReader(new StringReader(var8)); // L: 51
					String var10 = var9.readLine(); // L: 52

					label64:
					while (true) {
						while (true) {
							String var11 = var9.readLine(); // L: 54
							if (var11 == null) { // L: 55
								var5 = var5 + "| " + var10; // L: 73
								var2 = var5; // L: 76
								break label64;
							}

							int var12 = var11.indexOf(40); // L: 56
							int var13 = var11.indexOf(41, var12 + 1); // L: 57
							if (var12 >= 0 && var13 >= 0) { // L: 58
								String var14 = var11.substring(var12 + 1, var13); // L: 59
								int var15 = var14.indexOf(".java:"); // L: 60
								if (var15 >= 0) { // L: 61
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5); // L: 62
									var5 = var5 + var14 + ' '; // L: 63
									continue; // L: 64
								}

								var11 = var11.substring(0, var12); // L: 66
							}

							var11 = var11.trim(); // L: 68
							var11 = var11.substring(var11.lastIndexOf(32) + 1); // L: 69
							var11 = var11.substring(var11.lastIndexOf(9) + 1); // L: 70
							var5 = var5 + var11 + ' '; // L: 71
						}
					}
				}

				if (var0 != null) { // L: 78
					if (var1 != null) { // L: 79
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 80
				}

				System.out.println("Error: " + var2); // L: 82
				var2 = var2.replace(':', '.'); // L: 83
				var2 = var2.replace('@', '_'); // L: 84
				var2 = var2.replace('&', '_'); // L: 85
				var2 = var2.replace('#', '_'); // L: 86
				if (class427.RunException_applet == null) { // L: 87
					return;
				}

				URL var3 = new URL(class427.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + class18.RunException_revision + "&cs=" + RunException.field5517 + "&u=" + RunException.field5518 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class453.field4867 + "&e=" + var2); // L: 88
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 89
				var17.read(); // L: 90
				var17.close(); // L: 91
			} catch (Exception var16) { // L: 93
			}

		}
	} // L: 94
}
