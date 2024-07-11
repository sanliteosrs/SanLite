import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("tj")
public class class494 implements class493 {
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1349223169
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ad")
	JSONObject field5045;

	public class494(byte[] var1) throws UnsupportedEncodingException {
		this.method8865(var1);
	} // L: 22

	public class494(JSONObject var1) {
		this.field5045 = var1; // L: 13
	} // L: 14

	public class494(String var1) throws UnsupportedEncodingException {
		this.method8848(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsb;",
		garbageValue = "12"
	)
	public class492 vmethod8875() {
		return class492.field5042; // L: 26
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "524737236"
	)
	public byte[] vmethod8869() throws UnsupportedEncodingException {
		return this.field5045 == null ? new byte[0] : this.field5045.toString().getBytes("UTF-8"); // L: 60
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "2040345982"
	)
	void method8865(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 30
		this.method8848(var2);
	} // L: 32

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1272300325"
	)
	void method8848(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 36
				this.field5045 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1); // L: 40
				this.field5045 = new JSONObject();
				this.field5045.put("arrayValues", var2); // L: 42
			}

		} catch (JSONException var3) { // L: 48
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	} // L: 51

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "89"
	)
	public JSONObject method8849() {
		return this.field5045;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Luu;I)Ljava/lang/String;",
		garbageValue = "-27269583"
	)
	public static String method8866(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 16
			return null;
		} else {
			int var2 = 0; // L: 17

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) { // L: 18 21 31
				var5 = var0.charAt(var2); // L: 23
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 25
				if (!var4) { // L: 27
					break;
				}
			}

			while (var3 > var2) { // L: 35
				var5 = var0.charAt(var3 - 1); // L: 37
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 39
				if (!var4) { // L: 41
					break;
				}

				--var3; // L: 45
			}

			int var14 = var3 - var2; // L: 47
			if (var14 >= 1) { // L: 49
				byte var6;
				if (var1 == null) { // L: 53
					var6 = 12; // L: 54
				} else {
					switch(var1.field5249) { // L: 57
					case 0:
						var6 = 20; // L: 62
						break;
					default:
						var6 = 12; // L: 59
					}
				}

				if (var14 <= var6) { // L: 66
					StringBuilder var12 = new StringBuilder(var14); // L: 70

					for (int var15 = var2; var15 < var3; ++var15) { // L: 71
						char var7 = var0.charAt(var15); // L: 72
						boolean var8;
						if (Character.isISOControl(var7)) { // L: 75
							var8 = false; // L: 76
						} else if (VarpDefinition.isAlphaNumeric(var7)) { // L: 79
							var8 = true; // L: 80
						} else {
							char[] var9 = class525.field5259; // L: 84
							int var10 = 0;

							label120:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class525.field5258; // L: 94

									for (var10 = 0; var10 < var9.length; ++var10) { // L: 95
										var11 = var9[var10]; // L: 96
										if (var11 == var7) { // L: 97
											var8 = true; // L: 98
											break label120; // L: 99
										}
									}

									var8 = false; // L: 103
									break;
								}

								var11 = var9[var10]; // L: 86
								if (var11 == var7) { // L: 87
									var8 = true; // L: 88
									break; // L: 89
								}

								++var10; // L: 85
							}
						}

						if (var8) { // L: 105
							char var13;
							switch(var7) { // L: 108
							case ' ':
							case '-':
							case '_':
							case ' ':
								var13 = '_'; // L: 125
								break; // L: 126
							case '#':
							case '[':
							case ']':
								var13 = var7; // L: 178
								break; // L: 179
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var13 = 'a'; // L: 119
								break;
							case 'Ç':
							case 'ç':
								var13 = 'c'; // L: 149
								break; // L: 150
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var13 = 'e'; // L: 135
								break; // L: 136
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var13 = 'i'; // L: 157
								break; // L: 158
							case 'Ñ':
							case 'ñ':
								var13 = 'n'; // L: 173
								break; // L: 174
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var13 = 'o'; // L: 169
								break; // L: 170
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var13 = 'u'; // L: 188
								break;
							case 'ß':
								var13 = 'b'; // L: 138
								break; // L: 139
							case 'ÿ':
							case 'Ÿ':
								var13 = 'y'; // L: 145
								break; // L: 146
							default:
								var13 = Character.toLowerCase(var7); // L: 141
							}

							if (var13 != 0) { // L: 193
								var12.append(var13); // L: 194
							}
						}
					}

					if (var12.length() == 0) { // L: 196
						return null;
					}

					return var12.toString(); // L: 197
				}
			}

			return null; // L: 68
		}
	}
}
