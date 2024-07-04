import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class432 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -21565275
	)
	int field4747;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -59088811
	)
	int field4748;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -746841467
	)
	int field4751;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1599545561
	)
	int field4753;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 199041437
	)
	int field4756;
	@ObfuscatedName("as")
	boolean field4752;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	AbstractFont field4740;
	@ObfuscatedName("at")
	ArrayList field4754;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1840112385
	)
	int field4755;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1391544929
	)
	int field4744;

	public class432() {
		this.field4747 = Integer.MAX_VALUE; // L: 22
		this.field4748 = Integer.MAX_VALUE; // L: 23
		this.field4751 = 0; // L: 24
		this.field4753 = 0; // L: 25
		this.field4756 = 0; // L: 26
		this.field4752 = true; // L: 27
		this.field4754 = new ArrayList(); // L: 29
		this.field4755 = 0; // L: 30
		this.field4744 = 0; // L: 31
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqf;",
		garbageValue = "28"
	)
	public class434 method7919(int var1) {
		return (class434)this.field4754.get(var1); // L: 34
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Lqf;",
		garbageValue = "-648"
	)
	class434 method7999() {
		return this.field4754.size() == 0 ? null : (class434)this.field4754.get(this.field4754.size() - 1); // L: 38 39
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method7936() {
		return this.field4754.size() == 0; // L: 43
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2009455501"
	)
	boolean method7922() {
		return this.field4748 > 1; // L: 47
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "113"
	)
	public int method7984() {
		return this.field4754.size(); // L: 51
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-98"
	)
	public String method7924() {
		if (this.method7936()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7984()); // L: 56

			for (int var2 = 0; var2 < this.method7984(); ++var2) { // L: 57
				class434 var3 = this.method7919(var2); // L: 58
				var1.append(var3.field4763); // L: 59
			}

			return var1.toString(); // L: 61
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method8009(int var1) {
		if (this.field4740 != null && var1 < this.field4740.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4747 != var1) { // L: 70
			this.field4747 = var1; // L: 71
			this.method7952(); // L: 72
		}

	} // L: 74

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-51"
	)
	public void method8030(int var1) {
		if (this.field4748 != var1) { // L: 77
			this.field4748 = var1; // L: 78
			this.method7952(); // L: 79
		}

	} // L: 81

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-23776401"
	)
	public void method7927(int var1) {
		if (this.field4744 != var1) { // L: 84
			this.field4744 = var1; // L: 85
			this.method7952(); // L: 86
		}

	} // L: 88

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqz;B)V",
		garbageValue = "-51"
	)
	public void method7974(AbstractFont var1) {
		if (var1 != this.field4740) { // L: 91
			this.field4740 = var1; // L: 92
			if (this.field4740 != null) { // L: 93
				if (this.field4756 == 0) { // L: 94
					this.field4756 = this.field4740.ascent; // L: 95
				}

				if (!this.method7936()) { // L: 97
					this.method7952(); // L: 98
				}
			}
		}

	} // L: 102

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	public void method7929(int var1) {
		if (this.field4755 != var1) { // L: 105
			this.field4755 = var1; // L: 106
			this.method7952(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1099939946"
	)
	public boolean method8029(int var1, int var2) {
		if (this.field4751 != var1 || var2 != this.field4753) { // L: 112
			this.field4751 = var1; // L: 113
			this.field4753 = var2; // L: 114
			this.method7952(); // L: 115
		}

		return true; // L: 117
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	public void method7931(int var1) {
		if (this.field4756 != var1) { // L: 121
			this.field4756 = var1; // L: 122
			this.method7952(); // L: 123
		}

	} // L: 125

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqw;",
		garbageValue = "-39"
	)
	public class436 method7932(int var1, int var2) {
		if (var2 == var1) { // L: 128
			return new class436(this, 0, 0);
		} else if (var1 <= this.field4754.size() && var2 <= this.field4754.size()) { // L: 129
			return var2 < var1 ? new class436(this, var2, var1) : new class436(this, var1, var2); // L: 130
		} else {
			return new class436(this, 0, 0); // L: 131
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CIIS)Lqk;",
		garbageValue = "2731"
	)
	public class433 method8019(char var1, int var2, int var3) {
		return this.method8045(Character.toString(var1), var2, var3); // L: 135
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lqk;",
		garbageValue = "-2128379129"
	)
	public class433 method8045(String var1, int var2, int var3) {
		if (var3 == 0) { // L: 139
			var3 = Integer.MAX_VALUE; // L: 140
		}

		int var4 = var2; // L: 142
		if (this.field4754.size() >= var3) { // L: 143
			this.method7953(var2, var2); // L: 144
			return new class433(var2, true); // L: 145
		} else {
			this.field4754.ensureCapacity(this.field4754.size() + var1.length()); // L: 147

			for (int var5 = 0; var5 < var1.length() && this.field4754.size() < var3; ++var5) { // L: 148
				class434 var6 = new class434(); // L: 149
				var6.field4763 = var1.charAt(var5); // L: 150
				this.field4754.add(var4, var6); // L: 151
				++var4; // L: 152
			}

			this.method7953(var2, var4); // L: 154
			if (this.field4748 != 0 && this.method8035() > this.field4748) { // L: 155
				while (var4 != var2) { // L: 157
					--var4; // L: 160
					this.method7981(var4); // L: 161
					if (this.method8035() <= this.field4748) { // L: 162
						break;
					}
				}

				return new class433(var4, true); // L: 163
			} else {
				return new class433(var4, false); // L: 166
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lqk;",
		garbageValue = "1"
	)
	class433 method7935(String var1, int var2) {
		return this.method8045(var1, this.field4754.size(), var2); // L: 171
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lqk;",
		garbageValue = "3"
	)
	public class433 method8040(String var1) {
		this.method8070(); // L: 175
		return this.method7935(var1, 0); // L: 176
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1394688149"
	)
	void method8070() {
		this.field4754.clear(); // L: 180
	} // L: 181

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-110"
	)
	public int method7981(int var1) {
		return this.method7938(var1, var1 + 1); // L: 184
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "26"
	)
	public int method7938(int var1, int var2) {
		int var3;
		if (var2 < var1) { // L: 188
			var3 = var2; // L: 189
			var2 = var1; // L: 190
			var1 = var3; // L: 191
		}

		this.field4754.subList(var1, var2).clear(); // L: 193
		var3 = var1; // L: 194
		if (this.method7922() && this.field4755 == 1) { // L: 195
			while (var3 > 0) { // L: 196
				--var3; // L: 197
				char var4 = ((class434)this.field4754.get(var3)).field4763; // L: 198
				if (var4 == ' ' || var4 == '\t') { // L: 199
					break;
				}
			}
		}

		this.method7953(var3, var2); // L: 204
		return var1; // L: 205
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1082082870"
	)
	public int method7926(int var1, int var2) {
		if (this.field4740 == null) { // L: 209
			return 0;
		} else if (this.method7922() && var1 > this.field4747) { // L: 210
			return this.field4754.size();
		} else {
			if (!this.field4754.isEmpty()) { // L: 211
				for (int var3 = 0; var3 < this.field4754.size(); ++var3) { // L: 212
					class434 var4 = (class434)this.field4754.get(var3); // L: 213
					if (var2 <= var4.field4764 + this.method7943()) { // L: 214
						if (var2 < var4.field4764) { // L: 215
							break;
						}

						if (var1 < var4.field4766) { // L: 216
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4754.size() && ((class434)this.field4754.get(var3 + 1)).field4764 != var4.field4764) { // L: 217
							int var5 = this.method7955((class434)this.field4754.get(var3), false); // L: 218
							if (var1 < var5 + var4.field4766) { // L: 219
								return var3; // L: 220
							}

							if (var2 <= var4.field4764 + this.method7943()) { // L: 222
								return var3 + 1; // L: 223
							}
						}
					}
				}

				class434 var6 = (class434)this.field4754.get(this.field4754.size() - 1); // L: 228
				if (var1 >= var6.field4766 && var1 <= var6.field4766 + this.method7994() && var2 >= var6.field4764 && var2 <= var6.field4764 + this.method7943()) { // L: 229
					return this.field4754.size() - 1; // L: 230
				}
			}

			return this.field4754.size(); // L: 233
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "42"
	)
	public int method7940(int var1, int var2) {
		if (this.field4740 != null && !this.method7936() && var1 <= this.field4754.size()) { // L: 237
			byte var3;
			if (var2 > 0) { // L: 239
				var3 = 1; // L: 240
			} else {
				var3 = -1; // L: 243
				var2 = -var2; // L: 244
			}

			int var4 = 0; // L: 246
			int var5 = 0; // L: 247
			if (var1 > 0) { // L: 248
				class434 var6 = (class434)this.field4754.get(var1 - 1); // L: 249
				var4 = var6.field4766 + this.method8043(var1 - 1); // L: 250
				var5 = var6.field4764; // L: 251
			} else if (var3 == -1 && var1 == 0) { // L: 253
				return 0; // L: 254
			}

			int var14 = 16777215; // L: 256
			int var7 = 0; // L: 257
			int var8 = var1; // L: 258
			int var9 = 16777215; // L: 259
			int var10 = var3 == 1 ? this.field4754.size() + 1 : 0; // L: 260

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) { // L: 261
				class434 var12 = (class434)this.field4754.get(var11 - 1); // L: 262
				if (var5 != var12.field4764) { // L: 263
					++var7; // L: 264
					var5 = var12.field4764; // L: 265
					if (var7 > var2) { // L: 266
						return var8; // L: 267
					}
				}

				if (var7 == var2) { // L: 270
					int var13 = Math.abs(var12.field4766 + this.method8043(var11 - 1) - var4); // L: 271
					if (var13 >= var9) { // L: 272
						return var8; // L: 277
					}

					var8 = var11; // L: 273
					var9 = var13; // L: 274
				}
			}

			if (var3 == 1) { // L: 281
				return this.field4754.size(); // L: 282
			} else {
				if (var5 != 0) { // L: 285
					++var7; // L: 286
				}

				return var9 == 16777215 || var7 == var2 && var4 < var9 ? 0 : var8; // L: 288 289
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-266636187"
	)
	public int method7941() {
		if (!this.field4754.isEmpty() && this.method8035() == 1) { // L: 298
			return this.field4754.isEmpty() ? 0 : ((class434)this.field4754.get(this.field4754.size() - 1)).field4766 + this.method7994(); // L: 299
		} else {
			int var1 = -1; // L: 302
			int var2 = 0; // L: 303

			for (int var3 = this.field4754.size() - 1; var3 >= 0; --var3) { // L: 304
				class434 var4 = (class434)this.field4754.get(var3); // L: 305
				if (var1 != var4.field4764) { // L: 306
					int var5 = this.method7955(var4, false) + var4.field4766; // L: 307
					var2 = Math.max(var5, var2); // L: 308
					var1 = var4.field4764; // L: 309
				}
			}

			return var2; // L: 312
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1720822945"
	)
	public int method7942() {
		return this.method7936() ? 0 : this.field4740.ascent + ((class434)this.field4754.get(this.field4754.size() - 1)).field4764; // L: 317
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	public int method7943() {
		return this.field4756; // L: 321
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	public int method8035() {
		return this.method7942() / this.field4740.ascent; // L: 325
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1587256532"
	)
	int method7994() {
		return this.method7936() ? 0 : this.method7955((class434)this.field4754.get(this.field4754.size() - 1), false); // L: 329
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-448656674"
	)
	public int method7944() {
		return this.field4747; // L: 333
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	public int method7993() {
		return this.field4748; // L: 337
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "25354"
	)
	public int method7948() {
		return this.field4755; // L: 341
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "873450139"
	)
	public int method7949() {
		return this.field4744; // L: 345
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-73"
	)
	public int method8059(int var1) {
		switch(this.field4751) { // L: 349
		case 0:
			return 0; // L: 351
		case 1:
			return var1 / 2; // L: 353
		case 2:
			return var1; // L: 355
		default:
			return 0; // L: 357
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2086051673"
	)
	public int method7928(int var1) {
		switch(this.field4753) { // L: 361
		case 0:
			return 0; // L: 363
		case 1:
			return var1 / 2; // L: 365
		case 2:
			return var1; // L: 367
		default:
			return 0; // L: 369
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1780781047"
	)
	void method7952() {
		this.method7953(0, this.field4754.size()); // L: 373
	} // L: 374

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-656423559"
	)
	void method7953(int var1, int var2) {
		if (!this.method7936() && this.field4740 != null) { // L: 377
			class517 var3 = this.method7956(var1, var2); // L: 378
			boolean var4 = (Integer)var3.field5225 == 0 && (Integer)var3.field5222 == this.field4754.size(); // L: 379
			int var5 = (Integer)var3.field5225; // L: 380
			int var6 = 0; // L: 381
			int var7 = var4 ? 0 : ((class434)this.field4754.get((Integer)var3.field5225)).field4764; // L: 382
			int var8 = 0; // L: 383

			int var9;
			for (var9 = (Integer)var3.field5225; var9 <= (Integer)var3.field5222; ++var9) { // L: 384
				boolean var10 = var9 >= this.field4754.size(); // L: 385
				class434 var21 = (class434)this.field4754.get(!var10 ? var9 : this.field4754.size() - 1); // L: 386
				int var22 = !var10 ? this.method7955(var21, false) : 0; // L: 387
				boolean var13 = !var10 && var21.field4763 == '\n'; // L: 388
				boolean var14 = !var10 && this.method7922() && var6 + var22 > this.field4747; // L: 389
				if (var13 || var14 || var10) { // L: 390
					int var15 = var9; // L: 391
					int var16 = 0; // L: 392
					int var17;
					int var18;
					class434 var19;
					if (var14) { // L: 393
						var17 = 0; // L: 394
						if (this.field4755 == 1) { // L: 395
							for (var18 = var9; var18 > var5; --var18) { // L: 396
								var19 = (class434)this.field4754.get(var18); // L: 397
								var17 += var18 < var15 ? this.method7955(var19, false) : 0; // L: 398
								if (var19.field4763 == ' ' || var19.field4763 == '\n') { // L: 399
									var15 = var18; // L: 400
									var6 -= var17; // L: 401
									var16 = var17; // L: 402
									break;
								}
							}
						}
					}

					var17 = -this.method8059(var6); // L: 408

					for (var18 = var5; var18 < var15; ++var18) { // L: 409
						var19 = (class434)this.field4754.get(var18); // L: 410
						int var20 = this.method7955(var19, false); // L: 411
						var19.field4766 = var17; // L: 412
						var19.field4764 = var7; // L: 413
						var17 += var20; // L: 414
					}

					var5 = var15; // L: 416
					var6 = var16; // L: 417
					var7 += this.method7943(); // L: 418
					++var8; // L: 419
				}

				var6 += !var10 ? var22 : 0; // L: 421
			}

			if (this.field4753 != 0 && var4) { // L: 423
				var9 = var8 * this.method7943(); // L: 424
				int var23 = this.method7928(var9); // L: 425

				for (int var11 = 0; var11 < this.field4754.size(); ++var11) { // L: 426
					class434 var12 = (class434)this.field4754.get(var11); // L: 427
					var12.field4764 -= var23; // L: 428
				}
			}

		}
	} // L: 431

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-816906531"
	)
	int method8043(int var1) {
		return var1 < this.field4754.size() ? this.method7955((class434)this.field4754.get(var1), false) : 0; // L: 434
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lqf;ZB)I",
		garbageValue = "27"
	)
	int method7955(class434 var1, boolean var2) {
		if (var1.field4763 == '\n') { // L: 438
			return 0;
		} else if (this.field4744 == 0) { // L: 439
			int var3 = this.field4740.advances[var1.field4763]; // L: 440
			if (var3 == 0) { // L: 441
				return var1.field4763 == '\t' ? this.field4740.advances[32] * 3 : this.field4740.advances[32]; // L: 442 443 446
			} else {
				return var3; // L: 450
			}
		} else {
			return this.field4740.advances[42]; // L: 454
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)Ltu;",
		garbageValue = "2141372027"
	)
	class517 method7956(int var1, int var2) {
		int var3 = Math.min(var1, var2); // L: 459
		int var4 = Math.max(var1, var2); // L: 460
		int var5 = this.field4754.size(); // L: 461
		if (var3 == 0 && var4 == var5) { // L: 462
			return new class517(0, var5); // L: 463
		} else {
			int var6 = this.method7957(var3, false); // L: 465
			int var7 = this.method7958(var4, false); // L: 466
			int var8;
			switch(this.field4753) { // L: 467
			case 0:
				if (this.field4751 == 0) { // L: 470
					return new class517(var6, var5); // L: 471
				}

				var8 = this.method7957(var3, true); // L: 473
				return new class517(var8, var5); // L: 474
			case 1:
				return new class517(0, var5); // L: 477
			case 2:
				if (this.field4751 == 2) { // L: 480
					return new class517(0, var7); // L: 481
				}

				var8 = this.method7958(var4, true); // L: 483
				return new class517(0, var8); // L: 484
			default:
				return new class517(0, var5); // L: 487
			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "2020988141"
	)
	int method7957(int var1, boolean var2) {
		if (var1 < this.field4754.size()) { // L: 491
			int var3 = ((class434)this.field4754.get(var1)).field4764; // L: 492

			for (int var4 = var1; var4 > 0; --var4) { // L: 493
				if (((class434)this.field4754.get(var4 - 1)).field4764 < var3) { // L: 494
					if (!var2) { // L: 495
						return var4; // L: 496
					}

					var2 = false; // L: 498
					var3 = ((class434)this.field4754.get(var4 - 1)).field4764; // L: 499
				}
			}
		}

		return 0; // L: 503
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-330254717"
	)
	int method7958(int var1, boolean var2) {
		if (var1 < this.field4754.size()) { // L: 507
			int var3 = ((class434)this.field4754.get(var1)).field4764; // L: 508

			for (int var4 = var1; var4 < this.field4754.size() - 1; ++var4) { // L: 509
				if (((class434)this.field4754.get(var4 + 1)).field4764 > var3) { // L: 510
					if (!var2) { // L: 511
						return var4; // L: 512
					}

					var2 = false; // L: 514
					var3 = ((class434)this.field4754.get(var4 + 1)).field4764; // L: 515
				}
			}
		}

		return this.field4754.size(); // L: 519
	}

	@ObfuscatedName("ag")
	static int method8071(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 55
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvp;J)V"
	)
	static void method8013(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67
}
