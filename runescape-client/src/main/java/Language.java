import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@po
@nn
@ObfuscatedName("pe")
@Implements("Language")
public class Language implements class400 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lpe;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -1010949943
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("av")
	final String field4625;
	@ObfuscatedName("ab")
	@Export("language")
	final String language;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1567769779
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4633, 0, "GB"); // L: 12
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4633, 1, "DE"); // L: 13
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4633, 2, "FR"); // L: 14
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4633, 3, "BR"); // L: 15
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4635, 4, "NL"); // L: 16
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4635, 5, "ES"); // L: 17
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4633, 6, "MX"); // L: 18
		Language[] var0 = method7425(); // L: 25
		Language_valuesOrdered = new Language[var0.length]; // L: 26
		Language[] var1 = var0; // L: 28

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 29
			Language var3 = var1[var2]; // L: 30
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3; // L: 35
		}

	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4625 = var1; // L: 46
		this.language = var2; // L: 47
		this.id = var5; // L: 48
		if (var6 != null) { // L: 49
			new Locale(var2.substring(0, 2), var6); // L: 50
		} else {
			new Locale(var2.substring(0, 2)); // L: 53
		}

	} // L: 55

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 63
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2045870852"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language; // L: 58
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH); // L: 73
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;I)V",
		garbageValue = "1546153796"
	)
	public static void method7424(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.field2068 = var1; // L: 33
	} // L: 34

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpe;",
		garbageValue = "559601510"
	)
	static Language[] method7425() {
		return new Language[]{Language_FR, Language_ES, Language_DE, Language_PT, Language_NL, Language_ES_MX, Language_EN}; // L: 42
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lpe;",
		garbageValue = "2116073364"
	)
	public static Language method7414(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null; // L: 67 68
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-455981923"
	)
	static void method7421() {
		if (Strings.loadWorlds()) { // L: 2127
			Login.worldSelectOpen = true; // L: 2128
			Login.worldSelectPage = 0; // L: 2129
			Login.worldSelectPagesCount = 0; // L: 2130
		}

	} // L: 2132

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-742358029"
	)
	static final void method7420() {
		if (class171.FriendsChatManager_inFriendsChat) { // L: 4219
			if (Decimator.friendsChatManager != null) { // L: 4220
				Decimator.friendsChatManager.sort(); // L: 4221
			}

			for (int var0 = 0; var0 < class511.field5137.field1319.field1404; ++var0) { // L: 4224
				Player var1 = class511.field5137.field1326[class511.field5137.field1319.field1409[var0]]; // L: 4225
				var1.method2457(); // L: 4226
			}

			class171.FriendsChatManager_inFriendsChat = false; // L: 4229
		}

	} // L: 4231
}
