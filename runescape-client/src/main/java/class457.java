import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class457 {
	@ObfuscatedName("ak")
	final Map field4892;
	@ObfuscatedName("ap")
	final Map field4893;
	@ObfuscatedName("an")
	final DecimalFormat field4895;

	public class457() {
		this.field4892 = new HashMap(); // L: 12
		this.field4893 = new HashMap(); // L: 13
		this.field4895 = new DecimalFormat(); // L: 14
		this.field4895.setMaximumFractionDigits(2); // L: 17
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "-408274121"
	)
	public void method8362(HttpsURLConnection var1) {
		Iterator var2 = this.field4892.entrySet().iterator(); // L: 21

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue()); // L: 24
		}

	} // L: 27

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "553620104"
	)
	public Map method8379() {
		return this.field4892;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1560630979"
	)
	public void method8382(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 34
			this.field4892.put(var1, var2 != null ? var2 : ""); // L: 35
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2011341456"
	)
	public void method8396(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.field4892.remove(var1); // L: 41
		}

	} // L: 43

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrr;Ljava/lang/String;I)V",
		garbageValue = "-1981766213"
	)
	void method8393(class456 var1, String var2) {
		String var3 = String.format("%s %s", var1.method8360(), var2);
		this.method8382("Authorization", var3); // L: 47
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "395295339"
	)
	public void method8399(String var1) {
		this.method8393(class456.field4889, var1); // L: 51
	} // L: 52

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "921281263"
	)
	public void method8387(String var1) {
		this.method8393(class456.field4886, var1);
	} // L: 56

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsb;B)V",
		garbageValue = "-106"
	)
	public void method8361(class492 var1) {
		this.field4892.put("Content-Type", var1.method8834()); // L: 59
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1971575789"
	)
	public void method8394() {
		this.field4892.remove("Content-Type"); // L: 63
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lsb;I)V",
		garbageValue = "2139215001"
	)
	public void method8371(class492 var1) {
		this.method8395(var1, 1.0F); // L: 67
	} // L: 68

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsb;FI)V",
		garbageValue = "608660319"
	)
	void method8395(class492 var1, float var2) {
		this.field4893.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method8372(); // L: 72
	} // L: 73

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7823"
	)
	void method8372() {
		this.field4892.remove("Accept");
		if (!this.field4893.isEmpty()) { // L: 77
			this.field4892.put("Accept", this.method8366());
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	String method8366() {
		ArrayList var1 = new ArrayList(this.field4893.entrySet()); // L: 83
		Collections.sort(var1, new class458(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 99
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class492)var4.getKey()).method8834()); // L: 102
			float var5 = (Float)var4.getValue(); // L: 103
			if (var5 < 1.0F) {
				String var6 = this.field4895.format((double)var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString(); // L: 110
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)D",
		garbageValue = "-92"
	)
	static double method8363(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 66
			case 1:
				return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D); // L: 62
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 40
			case 3:
				return -(Math.cos(3.141592653589793D * var3) - 1.0D) / 2.0D; // L: 60
			case 4:
				return var3 * var3; // L: 101
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 42
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D) / 2.0D; // L: 93
			case 7:
				return var3 * var3 * var3; // L: 46
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 58
			case 9:
				return var3 < 0.5D ? var3 * 4.0D * var3 * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 3.0D) / 2.0D; // L: 84
			case 10:
				return var3 * var3 * var3 * var3; // L: 109
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 44
			case 12:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 4.0D) / 2.0D; // L: 111
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 74
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 64
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 5.0D) / 2.0D; // L: 48
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 80
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3); // L: 50
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, var3 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * var3 + 10.0D)) / 2.0D; // L: 82
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 78
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 91
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D)) + 1.0D) / 2.0D; // L: 76
			case 22:
				var5 = 1.70158D; // L: 53
				var7 = 2.70158D; // L: 54
				return var3 * var3 * 2.70158D * var3 - var3 * 1.70158D * var3; // L: 55
			case 23:
				var5 = 1.70158D; // L: 69
				var7 = 2.70158D; // L: 70
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 71
			case 24:
				var5 = 1.70158D; // L: 96
				var7 = 2.5949095D; // L: 97
				return var3 < 0.5D ? Math.pow(2.0D * var3, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * (3.5949095D * (var3 * 2.0D - 2.0D) + 2.5949095D) + 2.0D) / 2.0D; // L: 98
			case 25:
				var5 = 2.0943951023931953D; // L: 36
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((10.0D * var3 - 10.75D) * 2.0943951023931953D); // L: 37
			case 26:
				var5 = 2.0943951023931953D; // L: 87
				return Math.pow(2.0D, -10.0D * var3) * Math.sin(2.0943951023931953D * (var3 * 10.0D - 0.75D)) + 1.0D; // L: 88
			case 27:
				var5 = 1.3962634015954636D; // L: 104
				var7 = Math.sin((var3 * 20.0D - 11.125D) * 1.3962634015954636D); // L: 105
				return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + -20.0D * var3) * var7 / 2.0D + 1.0D; // L: 106
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-752827931"
	)
	static final void method8401() {
		Client.field803 = Client.cycleCntr; // L: 13261
		class171.FriendsChatManager_inFriendsChat = true; // L: 13262
	} // L: 13263
}
