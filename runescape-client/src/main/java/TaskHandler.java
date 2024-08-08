import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("aq")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("ad")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ap")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("an")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null; // L: 11
		this.task = null; // L: 12
		this.isClosed = false; // L: 14
		javaVendor = "Unknown"; // L: 20
		javaVersion = "1.6"; // L: 21

		try {
			javaVendor = System.getProperty("java.vendor"); // L: 23
			javaVersion = System.getProperty("java.version"); // L: 24
		} catch (Exception var2) { // L: 26
		}

		this.isClosed = false; // L: 27
		this.thread = new Thread(this); // L: 28
		this.thread.setPriority(10); // L: 29
		this.thread.setDaemon(true); // L: 30
		this.thread.start(); // L: 31
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "996855504"
	)
	@Export("close")
	public final void close() {
		synchronized(this) { // L: 35
			this.isClosed = true; // L: 36
			this.notifyAll(); // L: 37
		} // L: 38

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	} // L: 43

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lig;",
		garbageValue = "-232109491"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task(); // L: 90
		var5.type = var1; // L: 91
		var5.intArgument = var2; // L: 92
		var5.objectArgument = var4; // L: 93
		synchronized(this) { // L: 94
			if (this.task != null) { // L: 95
				this.task.next = var5; // L: 96
				this.task = var5; // L: 97
			} else {
				this.task = this.current = var5; // L: 100
			}

			this.notify(); // L: 102
			return var5; // L: 104
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lig;",
		garbageValue = "-2017313228"
	)
	public final Task method4173(String var1, int var2) {
		return this.newTask(1, var2, 0, var1); // L: 108
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lig;",
		garbageValue = "991114056"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1); // L: 112
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) { // L: 50
						return;
					}

					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) { // L: 54
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type; // L: 64
				if (var5 == 1) { // L: 65
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument); // L: 66
				} else if (var5 == 2) { // L: 68
					Thread var3 = new Thread((Runnable)var1.objectArgument); // L: 69
					var3.setDaemon(true); // L: 70
					var3.start(); // L: 71
					var3.setPriority(var1.intArgument); // L: 72
					var1.result = var3; // L: 73
				} else if (var5 == 4) { // L: 75
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream()); // L: 76
				}

				var1.status = 1; // L: 78
			} catch (ThreadDeath var6) { // L: 80
				throw var6; // L: 81
			} catch (Throwable var7) { // L: 83
				var1.status = 2; // L: 84
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1792326283"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1403501364"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex; // L: 2956
		if (var0 == -3) { // L: 2959
			VerticalAlignment.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2960
			VerticalAlignment.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2961
			VerticalAlignment.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2962
			class163.method3447(3); // L: 2963
			Login.field932 = 1; // L: 2964
		} else if (var0 == 4) { // L: 2966
			class163.method3447(14); // L: 2968
			Login.field931 = 0; // L: 2969
		} else if (var0 == 5) { // L: 2972
			Login.field932 = 2; // L: 2973
			VerticalAlignment.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2974
		} else if (var0 == 68) { // L: 2976
			if (!Client.field675) { // L: 2977
				Client.field675 = true; // L: 2978
				class36.method708(); // L: 2979
				return; // L: 2980
			}

			VerticalAlignment.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2983
		} else if (!Client.onMobile && var0 == 6) { // L: 2986
			VerticalAlignment.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2987
		} else if (var0 == 7) { // L: 2989
			VerticalAlignment.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) { // L: 2990
			VerticalAlignment.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) { // L: 2991
			VerticalAlignment.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) { // L: 2992
			VerticalAlignment.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) { // L: 2993
			VerticalAlignment.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) { // L: 2994
			VerticalAlignment.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) { // L: 2995
			VerticalAlignment.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) { // L: 2996
			VerticalAlignment.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) { // L: 2997
			VerticalAlignment.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now."); // L: 2998
			class163.method3447(33); // L: 2999
		} else if (var0 == 17) { // L: 3001
			VerticalAlignment.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) { // L: 3002
			class163.method3447(14); // L: 3004
			Login.field931 = 1; // L: 3005
		} else if (var0 == 19) { // L: 3008
			VerticalAlignment.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) { // L: 3009
			VerticalAlignment.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) { // L: 3010
			VerticalAlignment.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) { // L: 3011
			VerticalAlignment.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) { // L: 3012
			VerticalAlignment.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) { // L: 3013
			VerticalAlignment.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) { // L: 3014
			VerticalAlignment.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) { // L: 3015
			VerticalAlignment.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			VerticalAlignment.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game."); // L: 3016
		} else if (var0 == 32) { // L: 3017
			class163.method3447(14); // L: 3019
			Login.field931 = 2; // L: 3020
		} else if (var0 == 37) { // L: 3023
			VerticalAlignment.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) { // L: 3024
			VerticalAlignment.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) { // L: 3025
			VerticalAlignment.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) { // L: 3026
			class163.method3447(8); // L: 3027
		} else {
			if (var0 == 56) { // L: 3029
				VerticalAlignment.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 3030
				ClanChannelMember.method3282(11); // L: 3031
				return; // L: 3032
			}

			if (var0 == 57) { // L: 3034
				VerticalAlignment.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 3035
				ClanChannelMember.method3282(11); // L: 3036
				return; // L: 3037
			}

			if (var0 == 61) { // L: 3039
				VerticalAlignment.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 3040
				class163.method3447(7); // L: 3041
			} else {
				if (var0 == 62) { // L: 3043
					ClanChannelMember.method3282(10); // L: 3044
					class163.method3447(9); // L: 3045
					VerticalAlignment.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 3046
					return; // L: 3047
				}

				if (var0 == 63) { // L: 3049
					ClanChannelMember.method3282(10); // L: 3050
					class163.method3447(9); // L: 3051
					VerticalAlignment.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 3052
					return; // L: 3053
				}

				if (var0 == 65 || var0 == 67) { // L: 3055
					ClanChannelMember.method3282(10); // L: 3056
					class163.method3447(9); // L: 3057
					VerticalAlignment.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 3058
					return; // L: 3059
				}

				if (var0 == 71) { // L: 3061
					ClanChannelMember.method3282(10); // L: 3062
					class163.method3447(7); // L: 3063
					VerticalAlignment.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 3064
				} else if (var0 == 73) { // L: 3066
					ClanChannelMember.method3282(10); // L: 3067
					class163.method3447(6); // L: 3068
					VerticalAlignment.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 3069
				} else if (var0 == 72) { // L: 3071
					ClanChannelMember.method3282(10); // L: 3072
					class163.method3447(32); // L: 3073
				} else {
					VerticalAlignment.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 3075
				}
			}
		}

		ClanChannelMember.method3282(10); // L: 3076
		int var4 = Login.loginIndex; // L: 3080
		boolean var5 = var4 != var1; // L: 3082
		if (!var5 && Client.field676.method9855()) { // L: 3083
			class163.method3447(9); // L: 3084
		}

	} // L: 3086

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIII)V",
		garbageValue = "269553664"
	)
	static final void method4179(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6943(ModeWhere.field4649, false); // L: 13187
		if (var4 != null) { // L: 13188
			if (Client.minimapState < 3) { // L: 13189
				World.field810.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 13190
			}

		}
	} // L: 13191
}
