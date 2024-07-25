import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class356 {
	@ObfuscatedName("ap")
	static byte[][][] field3810;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class432 field3792;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class432 field3793;
	@ObfuscatedName("aa")
	boolean field3802;
	@ObfuscatedName("as")
	boolean field3805;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -750548211
	)
	int field3796;
	@ObfuscatedName("at")
	boolean field3789;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 980897855
	)
	int field3798;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 854950137
	)
	int field3803;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 535951409
	)
	int field3800;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1896169033
	)
	int field3799;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1513845077
	)
	int field3809;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 502615579
	)
	int field3794;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2065933361
	)
	int field3804;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1593022913
	)
	int field3813;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1092874469
	)
	int field3806;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -670226323
	)
	int field3807;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1971877053
	)
	int field3808;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1273574081
	)
	int field3786;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1349805081
	)
	int field3812;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	class348 field3811;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	class348 field3797;

	class356() {
		this.field3792 = new class432(); // L: 32
		this.field3793 = new class432(); // L: 33
		this.field3802 = false; // L: 34
		this.field3805 = true; // L: 35
		this.field3796 = 0; // L: 36
		this.field3789 = false; // L: 37
		this.field3798 = 0; // L: 38
		this.field3803 = 0; // L: 39
		this.field3800 = 0; // L: 40
		this.field3799 = 0; // L: 41
		this.field3809 = 0; // L: 42
		this.field3794 = 0; // L: 43
		this.field3804 = 0; // L: 44
		this.field3813 = Integer.MAX_VALUE; // L: 45
		this.field3806 = Integer.MAX_VALUE; // L: 46
		this.field3807 = 0; // L: 47
		this.field3808 = 0; // L: 48
		this.field3786 = 0; // L: 49
		this.field3812 = 0; // L: 50
		this.field3792.method7929(1); // L: 55
		this.field3793.method7929(1); // L: 56
	} // L: 57

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6832() {
		this.field3796 = (this.field3796 + 1) % 60; // L: 60
		if (this.field3804 > 0) { // L: 61
			--this.field3804; // L: 62
		}

	} // L: 64

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-47"
	)
	public boolean method6763(boolean var1) {
		var1 = var1 && this.field3805; // L: 67
		boolean var2 = this.field3802 != var1; // L: 68
		this.field3802 = var1; // L: 69
		if (!this.field3802) { // L: 70
			this.method6608(this.field3799, this.field3799); // L: 71
		}

		return var2; // L: 73
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-376651850"
	)
	public void method6585(boolean var1) {
		this.field3805 = var1; // L: 77
		this.field3802 = var1 && this.field3802; // L: 78
	} // L: 79

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1134998565"
	)
	public boolean method6658(String var1) {
		String var2 = this.field3792.method7924(); // L: 82
		if (!var2.equals(var1)) { // L: 83
			var1 = this.method6652(var1); // L: 84
			this.field3792.method8040(var1); // L: 85
			this.method6608(this.field3809, this.field3799); // L: 86
			this.method6730(this.field3786, this.field3812); // L: 87
			this.method6656(); // L: 88
			this.method6661(); // L: 89
			return true; // L: 90
		} else {
			return false; // L: 92
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-259359510"
	)
	boolean method6587(String var1) {
		this.field3793.method8040(var1); // L: 96
		return true; // L: 97
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqz;B)Z",
		garbageValue = "-114"
	)
	boolean method6795(AbstractFont var1) {
		boolean var2 = !this.field3789; // L: 101
		this.field3792.method7974(var1); // L: 102
		this.field3793.method7974(var1); // L: 103
		this.field3789 = true; // L: 104
		var2 |= this.method6730(this.field3786, this.field3812); // L: 105
		var2 |= this.method6608(this.field3809, this.field3799); // L: 106
		if (this.method6656()) { // L: 107
			this.method6661(); // L: 108
			var2 = true; // L: 109
		}

		return var2; // L: 111
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-382329429"
	)
	public boolean method6637(int var1, int var2) {
		boolean var3 = this.field3807 != var1 || var2 != this.field3808; // L: 115
		this.field3807 = var1; // L: 116
		this.field3808 = var2; // L: 117
		var3 |= this.method6730(this.field3786, this.field3812); // L: 118
		return var3; // L: 119
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "80"
	)
	public boolean method6716(int var1) {
		if (var1 < 0) { // L: 123
			var1 = Integer.MAX_VALUE; // L: 124
		}

		boolean var2 = var1 == this.field3792.method7944(); // L: 126
		this.field3792.method8009(var1); // L: 127
		this.field3793.method8009(var1); // L: 128
		if (this.method6656()) { // L: 129
			this.method6661(); // L: 130
			var2 = true; // L: 131
		}

		return var2; // L: 133
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "22395"
	)
	public boolean method6591(int var1) {
		this.field3792.method8030(var1); // L: 137
		if (this.method6656()) { // L: 138
			this.method6661(); // L: 139
			return true; // L: 140
		} else {
			return false; // L: 142
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1478386211"
	)
	public boolean method6592(int var1) {
		this.field3806 = var1; // L: 146
		if (this.method6656()) { // L: 147
			this.method6661(); // L: 148
			return true; // L: 149
		} else {
			return false; // L: 151
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "46"
	)
	public boolean method6730(int var1, int var2) {
		if (!this.method6640()) { // L: 155
			this.field3786 = var1; // L: 156
			this.field3812 = var2; // L: 157
			return false; // L: 158
		} else {
			int var3 = this.field3786; // L: 160
			int var4 = this.field3812; // L: 161
			int var5 = Math.max(0, this.field3792.method7941() - this.field3807 + 2); // L: 162
			int var6 = Math.max(0, this.field3792.method7942() - this.field3808 + 1); // L: 163
			this.field3786 = Math.max(0, Math.min(var5, var1)); // L: 164
			this.field3812 = Math.max(0, Math.min(var6, var2)); // L: 165
			return var3 != this.field3786 || var4 != this.field3812; // L: 166
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1478814835"
	)
	public boolean method6649(int var1, int var2) {
		boolean var3 = true; // L: 170
		if (var1 < 0 || var1 > 2) { // L: 171
			var3 = false; // L: 172
		}

		if (var2 < 0 || var2 > 2) { // L: 174
			var3 = false; // L: 175
		}

		return var3 ? this.field3792.method8029(var1, var2) : false; // L: 177 178 180
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1993281382"
	)
	public void method6620(int var1) {
		this.field3792.method7931(var1); // L: 184
	} // L: 185

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-74"
	)
	public void method6749(int var1) {
		this.field3798 = var1; // L: 188
	} // L: 189

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "100"
	)
	public void method6597(int var1) {
		this.field3792.method7929(var1); // L: 192
	} // L: 193

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-47"
	)
	public void method6613(int var1) {
		this.field3792.method7927(var1); // L: 196
	} // L: 197

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1009932172"
	)
	public boolean method6599(int var1) {
		this.field3800 = var1; // L: 200
		String var2 = this.field3792.method7924(); // L: 201
		int var3 = var2.length(); // L: 202
		var2 = this.method6652(var2); // L: 203
		if (var2.length() != var3) { // L: 204
			this.field3792.method8040(var2); // L: 205
			this.method6730(this.field3786, this.field3812); // L: 206
			this.method6656(); // L: 207
			this.method6661(); // L: 208
			return true; // L: 209
		} else {
			return false; // L: 211
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1486801004"
	)
	public void method6600() {
		this.field3789 = false; // L: 215
	} // L: 216

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "238863288"
	)
	public boolean method6601(int var1) {
		if (this.method6662(var1)) { // L: 219
			this.method6606(); // L: 220
			class433 var2 = this.field3792.method8019((char)var1, this.field3799, this.field3813); // L: 221
			this.method6608(var2.method8075(), var2.method8075()); // L: 222
			this.method6656(); // L: 223
			this.method6661(); // L: 224
		}

		return true; // L: 226
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	public void method6786() {
		if (!this.method6606() && this.field3799 > 0) { // L: 230
			int var1 = this.field3792.method7981(this.field3799 - 1); // L: 231
			this.method6661(); // L: 232
			this.method6608(var1, var1); // L: 233
		}

	} // L: 235

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "675803200"
	)
	public void method6603() {
		if (!this.method6606() && this.field3799 < this.field3792.method7984()) { // L: 238
			int var1 = this.field3792.method7981(this.field3799); // L: 239
			this.method6661(); // L: 240
			this.method6608(var1, var1); // L: 241
		}

	} // L: 243

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1470814709"
	)
	public void method6604() {
		if (!this.method6606() && this.field3799 > 0) { // L: 246
			class517 var1 = this.method6746(this.field3799 - 1); // L: 247
			int var2 = this.field3792.method7938((Integer)var1.field5225, this.field3799); // L: 248
			this.method6661(); // L: 249
			this.method6608(var2, var2); // L: 250
		}

	} // L: 252

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	public void method6582() {
		if (!this.method6606() && this.field3799 < this.field3792.method7984()) { // L: 255
			class517 var1 = this.method6746(this.field3799); // L: 256
			int var2 = this.field3792.method7938(this.field3799, (Integer)var1.field5222); // L: 257
			this.method6661(); // L: 258
			this.method6608(var2, var2); // L: 259
		}

	} // L: 261

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "128"
	)
	boolean method6606() {
		if (!this.method6651()) { // L: 264
			return false;
		} else {
			int var1 = this.field3792.method7938(this.field3809, this.field3799); // L: 265
			this.method6661(); // L: 266
			this.method6608(var1, var1); // L: 267
			return true; // L: 268
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-658610274"
	)
	public void method6654() {
		this.method6608(0, this.field3792.method7984()); // L: 272
	} // L: 273

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "614125994"
	)
	public boolean method6608(int var1, int var2) {
		if (!this.method6640()) { // L: 276
			this.field3809 = var1; // L: 277
			this.field3799 = var2; // L: 278
			return false; // L: 279
		} else {
			if (var1 > this.field3792.method7984()) { // L: 281
				var1 = this.field3792.method7984(); // L: 282
			}

			if (var2 > this.field3792.method7984()) { // L: 284
				var2 = this.field3792.method7984(); // L: 285
			}

			boolean var3 = this.field3809 != var1 || var2 != this.field3799; // L: 287
			this.field3809 = var1; // L: 288
			if (var2 != this.field3799) { // L: 289
				this.field3799 = var2; // L: 290
				this.field3796 = 0; // L: 291
				this.method6852(); // L: 292
			}

			if (var3 && this.field3797 != null) { // L: 294 295
				this.field3797.vmethod6510(); // L: 296
			}

			return var3; // L: 299
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1244855518"
	)
	public void method6609(boolean var1) {
		class517 var2 = this.method6655(this.field3799); // L: 303
		this.method6628((Integer)var2.field5225, var1); // L: 304
	} // L: 305

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method6610(boolean var1) {
		class517 var2 = this.method6655(this.field3799); // L: 308
		this.method6628((Integer)var2.field5222, var1); // L: 309
	} // L: 310

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "13"
	)
	public void method6793(boolean var1) {
		this.method6628(0, var1); // L: 313
	} // L: 314

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-44"
	)
	public void method6612(boolean var1) {
		this.method6628(this.field3792.method7984(), var1); // L: 317
	} // L: 318

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-94"
	)
	public void method6765(boolean var1) {
		if (this.method6651() && !var1) { // L: 321
			this.method6628(Math.min(this.field3809, this.field3799), var1); // L: 322
		} else if (this.field3799 > 0) { // L: 324
			this.method6628(this.field3799 - 1, var1); // L: 325
		}

	} // L: 327

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-759400096"
	)
	public void method6614(boolean var1) {
		if (this.method6651() && !var1) { // L: 330
			this.method6628(Math.max(this.field3809, this.field3799), var1); // L: 331
		} else if (this.field3799 < this.field3792.method7984()) { // L: 333
			this.method6628(this.field3799 + 1, var1); // L: 334
		}

	} // L: 336

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "102"
	)
	public void method6615(boolean var1) {
		if (this.field3799 > 0) { // L: 339
			class517 var2 = this.method6746(this.field3799 - 1); // L: 340
			this.method6628((Integer)var2.field5225, var1); // L: 341
		}

	} // L: 343

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "52"
	)
	public void method6602(boolean var1) {
		if (this.field3799 < this.field3792.method7984()) { // L: 346
			class517 var2 = this.method6746(this.field3799 + 1); // L: 347
			this.method6628((Integer)var2.field5222, var1); // L: 348
		}

	} // L: 350

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "83"
	)
	public void method6794(boolean var1) {
		if (this.field3799 > 0) { // L: 353
			this.method6628(this.field3792.method7940(this.field3799, -1), var1); // L: 354
		}

	} // L: 356

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2061880298"
	)
	public void method6618(boolean var1) {
		if (this.field3799 < this.field3792.method7984()) { // L: 359
			this.method6628(this.field3792.method7940(this.field3799, 1), var1); // L: 360
		}

	} // L: 362

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-26477"
	)
	public void method6619(boolean var1) {
		if (this.field3799 > 0) { // L: 365
			int var2 = this.method6770(); // L: 366
			this.method6628(this.field3792.method7940(this.field3799, -var2), var1); // L: 367
		}

	} // L: 369

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1922994733"
	)
	public void method6742(boolean var1) {
		if (this.field3799 < this.field3792.method7984()) { // L: 372
			int var2 = this.method6770(); // L: 373
			this.method6628(this.field3792.method7940(this.field3799, var2), var1); // L: 374
		}

	} // L: 376

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "47"
	)
	public void method6607(boolean var1) {
		class436 var2 = this.field3792.method7932(0, this.field3799); // L: 379
		class517 var3 = var2.method8201(); // L: 380
		this.method6628(this.field3792.method7926((Integer)var3.field5225, this.field3812), var1); // L: 381
	} // L: 382

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "95"
	)
	public void method6622(boolean var1) {
		class436 var2 = this.field3792.method7932(0, this.field3799); // L: 385
		class517 var3 = var2.method8201(); // L: 386
		this.method6628(this.field3792.method7926((Integer)var3.field5225, this.field3812 + this.field3808), var1); // L: 387
	} // L: 388

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "69"
	)
	public void method6623(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false; // L: 391
		class517 var6;
		int var8;
		if (!this.field3789) { // L: 392
			var8 = 0; // L: 393
		} else {
			var1 += this.field3786; // L: 396
			var2 += this.field3812; // L: 397
			var6 = this.method6663(); // L: 398
			var8 = this.field3792.method7926(var1 - (Integer)var6.field5225, var2 - (Integer)var6.field5222); // L: 399
		}

		if (var3 && var4) { // L: 401
			this.field3803 = 1; // L: 402
			var6 = this.method6746(var8); // L: 403
			class517 var7 = this.method6746(this.field3794); // L: 404
			this.method6653(var7, var6); // L: 405
		} else if (var3) { // L: 407
			this.field3803 = 1; // L: 408
			var6 = this.method6746(var8); // L: 409
			this.method6608((Integer)var6.field5225, (Integer)var6.field5222); // L: 410
			this.field3794 = (Integer)var6.field5225; // L: 411
		} else if (var4) { // L: 413
			this.method6608(this.field3794, var8); // L: 414
		} else {
			if (this.field3804 > 0 && var8 == this.field3794) { // L: 417
				if (this.field3799 == this.field3809) { // L: 418
					this.field3803 = 1; // L: 419
					var6 = this.method6746(var8); // L: 420
					this.method6608((Integer)var6.field5225, (Integer)var6.field5222); // L: 421
				} else {
					this.field3803 = 2; // L: 424
					var6 = this.method6655(var8); // L: 425
					this.method6608((Integer)var6.field5225, (Integer)var6.field5222); // L: 426
				}
			} else {
				this.field3803 = 0; // L: 430
				this.method6608(var8, var8); // L: 431
				this.field3794 = var8; // L: 432
			}

			this.field3804 = 25; // L: 434
		}

	} // L: 436

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	public void method6624(int var1, int var2) {
		if (this.field3789 && this.method6635()) { // L: 439
			var1 += this.field3786; // L: 440
			var2 += this.field3812; // L: 441
			class517 var3 = this.method6663(); // L: 442
			int var4 = this.field3792.method7926(var1 - (Integer)var3.field5225, var2 - (Integer)var3.field5222); // L: 443
			class517 var5;
			class517 var6;
			switch(this.field3803) { // L: 444
			case 0:
				this.method6608(this.field3809, var4); // L: 447
				break;
			case 1:
				var5 = this.method6746(this.field3794); // L: 459
				var6 = this.method6746(var4); // L: 460
				this.method6653(var5, var6); // L: 461
				break; // L: 462
			case 2:
				var5 = this.method6655(this.field3794); // L: 452
				var6 = this.method6655(var4); // L: 453
				this.method6653(var5, var6); // L: 454
			}
		}

	} // L: 466

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1500532859"
	)
	public void method6625(Clipboard var1) {
		class436 var2 = this.field3792.method7932(this.field3809, this.field3799); // L: 469
		if (!var2.method8197()) { // L: 470
			String var3 = var2.method8195(); // L: 471
			if (!var3.isEmpty()) { // L: 472
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null); // L: 473
			}
		}

	} // L: 476

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1336177437"
	)
	public void method6626(Clipboard var1) {
		if (this.method6651()) { // L: 479
			this.method6625(var1); // L: 480
			this.method6606(); // L: 481
		}

	} // L: 483

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "2146143551"
	)
	public void method6748(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null); // L: 486
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) { // L: 487
			try {
				String var3 = this.method6652((String)var2.getTransferData(DataFlavor.stringFlavor)); // L: 489
				this.method6606(); // L: 490
				class433 var4 = this.field3792.method8045(var3, this.field3799, this.field3813); // L: 491
				this.method6608(var4.method8075(), var4.method8075()); // L: 492
				this.method6656(); // L: 493
				this.method6661(); // L: 494
			} catch (Exception var5) { // L: 496
			}
		}

	} // L: 498

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1583213346"
	)
	public void method6634() {
		this.field3812 = Math.max(0, this.field3812 - this.field3792.method7943()); // L: 501
	} // L: 502

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1667126411"
	)
	public void method6629() {
		int var1 = Math.max(0, this.field3792.method7942() - this.field3808); // L: 505
		this.field3812 = Math.min(var1, this.field3812 + this.field3792.method7943()); // L: 506
	} // L: 507

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnj;I)V",
		garbageValue = "757007438"
	)
	public void method6630(class348 var1) {
		this.field3811 = var1; // L: 510
	} // L: 511

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lnj;I)V",
		garbageValue = "-347826455"
	)
	public void method6631(class348 var1) {
		this.field3797 = var1; // L: 514
	} // L: 515

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "1641601454"
	)
	public class432 method6632() {
		return this.field3792; // L: 518
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)Lql;",
		garbageValue = "2"
	)
	public class432 method6675() {
		return this.field3793; // L: 522
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Lqw;",
		garbageValue = "0"
	)
	public class436 method6797() {
		return this.field3792.method7932(this.field3809, this.field3799); // L: 526
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1139117686"
	)
	public boolean method6635() {
		return this.field3802; // L: 530
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2063549797"
	)
	public boolean method6636() {
		return this.field3805; // L: 534
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	public boolean method6838() {
		return this.method6635() && this.field3796 % 60 < 30; // L: 538
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	public int method6779() {
		return this.field3799; // L: 542
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1005765087"
	)
	public int method6639() {
		return this.field3809; // L: 546
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "125"
	)
	public boolean method6640() {
		return this.field3789; // L: 550
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-110388572"
	)
	public int method6641() {
		return this.field3786; // L: 554
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1779232418"
	)
	public int method6642() {
		return this.field3812; // L: 558
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-971102710"
	)
	public int method6643() {
		return this.field3792.method7944(); // L: 562
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "525578185"
	)
	public int method6644() {
		return this.field3792.method7993(); // L: 566
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1925639631"
	)
	public int method6645() {
		return this.field3806; // L: 570
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "116"
	)
	public int method6784() {
		return this.field3798; // L: 574
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-99"
	)
	public int method6647() {
		return this.field3792.method7948(); // L: 578
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1596302393"
	)
	public int method6648() {
		return this.field3800; // L: 582
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	public int method6830() {
		return this.field3792.method7949(); // L: 586
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1438811815"
	)
	public boolean method6650() {
		return this.method6644() > 1; // L: 590
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-444458900"
	)
	boolean method6651() {
		return this.field3809 != this.field3799; // L: 594
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2144438361"
	)
	String method6652(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length()); // L: 598

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 599
			char var4 = var1.charAt(var3); // L: 600
			if (this.method6662(var4)) { // L: 601
				var2.append(var4); // L: 602
			}
		}

		return var2.toString(); // L: 605
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;I)V",
		garbageValue = "200764013"
	)
	void method6653(class517 var1, class517 var2) {
		if ((Integer)var2.field5225 < (Integer)var1.field5225) { // L: 609
			this.method6608((Integer)var1.field5222, (Integer)var2.field5225); // L: 610
		} else {
			this.method6608((Integer)var1.field5225, (Integer)var2.field5222); // L: 613
		}

	} // L: 615

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltu;",
		garbageValue = "8"
	)
	class517 method6746(int var1) {
		int var2 = this.field3792.method7984(); // L: 618
		int var3 = 0; // L: 619
		int var4 = var2; // L: 620

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 621
			if (this.method6660(this.field3792.method7919(var5 - 1).field4763)) { // L: 622
				var3 = var5; // L: 623
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 627
			if (this.method6660(this.field3792.method7919(var5).field4763)) { // L: 628
				var4 = var5; // L: 629
				break;
			}
		}

		return new class517(var3, var4); // L: 633
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltu;",
		garbageValue = "23"
	)
	class517 method6655(int var1) {
		int var2 = this.field3792.method7984(); // L: 637
		int var3 = 0; // L: 638
		int var4 = var2; // L: 639

		int var5;
		for (var5 = var1; var5 > 0; --var5) { // L: 640
			if (this.field3792.method7919(var5 - 1).field4763 == '\n') { // L: 641
				var3 = var5; // L: 642
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) { // L: 646
			if (this.field3792.method7919(var5).field4763 == '\n') { // L: 647
				var4 = var5; // L: 648
				break;
			}
		}

		return new class517(var3, var4); // L: 652
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "75"
	)
	boolean method6656() {
		if (!this.method6640()) { // L: 656
			return false;
		} else {
			boolean var1 = false; // L: 657
			if (this.field3792.method7984() > this.field3806) { // L: 658
				this.field3792.method7938(this.field3806, this.field3792.method7984()); // L: 659
				var1 = true; // L: 660
			}

			int var2 = this.method6644(); // L: 662
			int var3;
			if (this.field3792.method8035() > var2) { // L: 663
				var3 = this.field3792.method7940(0, var2) - 1; // L: 664
				this.field3792.method7938(var3, this.field3792.method7984()); // L: 665
				var1 = true; // L: 666
			}

			if (var1) { // L: 668
				var3 = this.field3799; // L: 669
				int var4 = this.field3809; // L: 670
				int var5 = this.field3792.method7984(); // L: 671
				if (this.field3799 > var5) { // L: 672
					var3 = var5; // L: 673
				}

				if (this.field3809 > var5) { // L: 675
					var4 = var5; // L: 676
				}

				this.method6608(var4, var3); // L: 678
			}

			return var1; // L: 680
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-739799736"
	)
	void method6628(int var1, boolean var2) {
		if (var2) { // L: 684
			this.method6608(this.field3809, var1);
		} else {
			this.method6608(var1, var1); // L: 685
		}

	} // L: 686

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1099233004"
	)
	int method6770() {
		return this.field3808 / this.field3792.method7943(); // L: 689
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "110733004"
	)
	void method6852() {
		class436 var1 = this.field3792.method7932(0, this.field3799); // L: 693
		class517 var2 = var1.method8201(); // L: 694
		int var3 = this.field3792.method7943(); // L: 695
		int var4 = (Integer)var2.field5225 - 10; // L: 696
		int var5 = var4 + 20; // L: 697
		int var6 = (Integer)var2.field5222 - 3; // L: 698
		int var7 = var6 + var3 + 6; // L: 699
		int var8 = this.field3786; // L: 700
		int var9 = var8 + this.field3807; // L: 701
		int var10 = this.field3812; // L: 702
		int var11 = var10 + this.field3808; // L: 703
		int var12 = this.field3786; // L: 704
		int var13 = this.field3812; // L: 705
		if (var4 < var8) { // L: 706
			var12 = var4; // L: 707
		} else if (var5 > var9) { // L: 709
			var12 = var5 - this.field3807; // L: 710
		}

		if (var6 < var10) { // L: 712
			var13 = var6; // L: 713
		} else if (var7 > var11) { // L: 715
			var13 = var7 - this.field3808; // L: 716
		}

		this.method6730(var12, var13); // L: 718
	} // L: 719

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1787897975"
	)
	boolean method6660(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9; // L: 722
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	void method6661() {
		if (this.field3811 != null) { // L: 726
			this.field3811.vmethod6510(); // L: 727
		}

	} // L: 729

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-5"
	)
	boolean method6662(int var1) {
		switch(this.field3800) { // L: 732
		case 1:
			return VarpDefinition.isAlphaNumeric((char)var1); // L: 738
		case 2:
			return class333.isCharAlphabetic((char)var1); // L: 749
		case 3:
			return WorldMapID.isDigit((char)var1); // L: 734
		case 4:
			char var2 = (char)var1; // L: 740
			if (WorldMapID.isDigit(var2)) { // L: 741
				return true; // L: 742
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') { // L: 744
					return false; // L: 747
				}

				return true; // L: 745
			}
		default:
			return true; // L: 736
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)Ltu;",
		garbageValue = "55"
	)
	class517 method6663() {
		int var1 = this.field3792.method8059(this.field3807); // L: 754
		int var2 = this.field3792.method7928(this.field3808); // L: 755
		return new class517(var1, var2); // L: 756
	}
}
