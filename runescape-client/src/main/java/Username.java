import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vo")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("aq")
	@Export("name")
	String name;
	@ObfuscatedName("ad")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Luu;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 210
		this.cleanName = class494.method8866(var1, var2); // L: 211
	} // L: 212

	public Username(String var1) {
		this.name = var1; // L: 11
		LoginType var4 = LoginType.oldscape; // L: 14
		String var3;
		if (var1 == null) { // L: 16
			var3 = null; // L: 17
		} else {
			label153: {
				int var5 = 0; // L: 20

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) { // L: 21 24 34
					var8 = var1.charAt(var5); // L: 26
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 28
					if (!var7) { // L: 30
						break;
					}
				}

				while (var6 > var5) { // L: 38
					var8 = var1.charAt(var6 - 1); // L: 40
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-'; // L: 42
					if (!var7) { // L: 44
						break;
					}

					--var6; // L: 48
				}

				int var17 = var6 - var5; // L: 50
				if (var17 >= 1) { // L: 52
					byte var9;
					if (var4 == null) { // L: 56
						var9 = 12; // L: 57
					} else {
						switch(var4.field5249) { // L: 60
						case 0:
							var9 = 20; // L: 65
							break;
						default:
							var9 = 12; // L: 62
						}
					}

					if (var17 <= var9) { // L: 69
						StringBuilder var15 = new StringBuilder(var17); // L: 74

						for (int var18 = var5; var18 < var6; ++var18) { // L: 75
							char var10 = var1.charAt(var18); // L: 76
							boolean var11;
							if (Character.isISOControl(var10)) { // L: 79
								var11 = false; // L: 80
							} else if (VarpDefinition.isAlphaNumeric(var10)) { // L: 83
								var11 = true; // L: 84
							} else {
								char[] var12 = class525.field5259; // L: 88
								int var13 = 0;

								label106:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class525.field5258; // L: 98

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 99
											var14 = var12[var13]; // L: 100
											if (var14 == var10) { // L: 101
												var11 = true; // L: 102
												break label106; // L: 103
											}
										}

										var11 = false; // L: 107
										break;
									}

									var14 = var12[var13]; // L: 90
									if (var10 == var14) { // L: 91
										var11 = true; // L: 92
										break; // L: 93
									}

									++var13; // L: 89
								}
							}

							if (var11) { // L: 109
								char var16;
								switch(var10) { // L: 112
								case ' ':
								case '-':
								case '_':
								case ' ':
									var16 = '_'; // L: 151
									break; // L: 152
								case '#':
								case '[':
								case ']':
									var16 = var10; // L: 135
									break; // L: 136
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
									var16 = 'a'; // L: 167
									break; // L: 168
								case 'Ç':
								case 'ç':
									var16 = 'c'; // L: 189
									break; // L: 190
								case 'È':
								case 'É':
								case 'Ê':
								case 'Ë':
								case 'è':
								case 'é':
								case 'ê':
								case 'ë':
									var16 = 'e'; // L: 185
									break; // L: 186
								case 'Í':
								case 'Î':
								case 'Ï':
								case 'í':
								case 'î':
								case 'ï':
									var16 = 'i'; // L: 175
									break; // L: 176
								case 'Ñ':
								case 'ñ':
									var16 = 'n'; // L: 130
									break; // L: 131
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
									var16 = 'o'; // L: 123
									break;
								case 'Ù':
								case 'Ú':
								case 'Û':
								case 'Ü':
								case 'ù':
								case 'ú':
								case 'û':
								case 'ü':
									var16 = 'u'; // L: 145
									break; // L: 146
								case 'ß':
									var16 = 'b'; // L: 192
									break;
								case 'ÿ':
								case 'Ÿ':
									var16 = 'y'; // L: 155
									break; // L: 156
								default:
									var16 = Character.toLowerCase(var10); // L: 126
								}

								if (var16 != 0) { // L: 197
									var15.append(var16); // L: 198
								}
							}
						}

						if (var15.length() == 0) { // L: 200
							var3 = null; // L: 201
						} else {
							var3 = var15.toString(); // L: 204
						}
						break label153;
					}
				}

				var3 = null; // L: 71
			}
		}

		this.cleanName = var3; // L: 206
	} // L: 207

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1020171946"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 215
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1373733707"
	)
	public String method10189() {
		return this.cleanName; // L: 219
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1935814220"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 223
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvo;I)I",
		garbageValue = "-1733965647"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 250
			return var1.cleanName == null ? 0 : 1; // L: 251 252
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 254 255
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 228
			Username var2 = (Username)var1; // L: 229
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 230
			} else if (var2.cleanName == null) { // L: 231
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 232 233
			}
		} else {
			return false; // L: 235
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 240 241
	}

	public String toString() {
		return this.getName(); // L: 246
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 259
	}
}
