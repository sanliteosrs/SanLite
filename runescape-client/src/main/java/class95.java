import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
public class class95 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "23"
	)
	static int method2466(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class30.field142; // L: 1558
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1559
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.itemId; // L: 1560
			return 1; // L: 1561
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1563
			if (var3.itemId != -1) { // L: 1564
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0; // L: 1565
			}

			return 1; // L: 1566
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1568
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1569
			return 1; // L: 1570
		} else if (var0 == 1707) { // L: 1572
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.method6949() ? 1 : 0; // L: 1573
			return 1; // L: 1574
		} else if (var0 == 1708) { // L: 1576
			return class324.method6115(var3); // L: 1577
		} else {
			return var0 == 1709 ? AbstractByteArrayCopier.method7026(var3) : 2; // L: 1579 1580 1582
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "0"
	)
	static int method2465(int var0, Script var1, boolean var2) {
		Widget var3 = ModeWhere.field4649.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]); // L: 1700
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1701
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1702
			return 1; // L: 1703
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1705
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1706
			return 1; // L: 1707
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1709
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.text; // L: 1710
			return 1; // L: 1711
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1713
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1714
			return 1; // L: 1715
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1717
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1718
			return 1; // L: 1719
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1721
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1722
			return 1; // L: 1723
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1725
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1726
			return 1; // L: 1727
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1729
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1730
			return 1; // L: 1731
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1733
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1734
			return 1; // L: 1735
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1737
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1738
			return 1; // L: 1739
		} else if (var0 == 2610) { // L: 1741
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1742
			return 1; // L: 1743
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1745
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.color; // L: 1746
			return 1; // L: 1747
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1749
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.color2; // L: 1750
			return 1; // L: 1751
		} else if (var0 == 2613) { // L: 1753
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1754
			return 1; // L: 1755
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1757
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1758
			return 1; // L: 1759
		} else {
			class350 var4;
			if (var0 == 2617) { // L: 1761
				var4 = var3.method6890(); // L: 1762
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3752 : 0; // L: 1763
			}

			if (var0 == 2618) { // L: 1765
				var4 = var3.method6890(); // L: 1766
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3751 : 0; // L: 1767
				return 1; // L: 1768
			} else {
				class356 var7;
				if (var0 == 2619) { // L: 1770
					var7 = var3.method6991(); // L: 1771
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6675().method7924() : ""; // L: 1772
					return 1; // L: 1773
				} else if (var0 == 2620) { // L: 1775
					var4 = var3.method6890(); // L: 1776
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3750 : 0; // L: 1777
					return 1; // L: 1778
				} else if (var0 == 2621) { // L: 1780
					var7 = var3.method6991(); // L: 1781
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6643() : 0; // L: 1782
					return 1; // L: 1783
				} else if (var0 == 2622) { // L: 1785
					var7 = var3.method6991(); // L: 1786
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6644() : 0; // L: 1787
					return 1; // L: 1788
				} else if (var0 == 2623) { // L: 1790
					var7 = var3.method6991(); // L: 1791
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6645() : 0; // L: 1792
					return 1; // L: 1793
				} else if (var0 == 2624) { // L: 1795
					var7 = var3.method6991(); // L: 1796
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null && var7.method6635() ? 1 : 0; // L: 1797
					return 1; // L: 1798
				} else if (var0 != 2625) { // L: 1800
					if (var0 == 2626) { // L: 1805
						var7 = var3.method6991(); // L: 1806
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6797().method8195() : ""; // L: 1807
						return 1; // L: 1808
					} else if (var0 == 2627) { // L: 1810
						var7 = var3.method6991(); // L: 1811
						int var5 = var7 != null ? var7.method6639() : 0; // L: 1812
						int var6 = var7 != null ? var7.method6779() : 0; // L: 1813
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1814
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1815
						return 1; // L: 1816
					} else if (var0 == 2628) { // L: 1818
						var7 = var3.method6991(); // L: 1819
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6779() : 0; // L: 1820
						return 1; // L: 1821
					} else if (var0 == 2629) { // L: 1823
						var7 = var3.method6991(); // L: 1824
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6647() : 0; // L: 1825
						return 1; // L: 1826
					} else if (var0 == 2630) { // L: 1828
						var7 = var3.method6991(); // L: 1829
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6784() : 0; // L: 1830
						return 1; // L: 1831
					} else if (var0 == 2631) { // L: 1833
						var7 = var3.method6991(); // L: 1834
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6648() : 0; // L: 1835
						return 1; // L: 1836
					} else if (var0 == 2632) { // L: 1838
						var7 = var3.method6991(); // L: 1839
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6830() : 0; // L: 1840
						return 1; // L: 1841
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1843
							var8 = var3.method6940(); // L: 1844
							Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = var8 != null ? var8.method404(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]) : 0; // L: 1845
							return 1; // L: 1846
						} else if (var0 == 2634) { // L: 1848
							var8 = var3.method6940(); // L: 1849
							Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]) : 0; // L: 1850
							return 1; // L: 1851
						} else {
							return 2; // L: 1853
						}
					}
				} else {
					var7 = var3.method6991(); // L: 1801
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null && var7.method6636() ? 1 : 0; // L: 1802
					return 1; // L: 1803
				}
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lnx;III)V",
		garbageValue = "1105580112"
	)
	public static void method2467(Widget var0, int var1, int var2) {
		var0.field3838.bodyColors[var1] = var2; // L: 946
		var0.field3838.method6538(); // L: 947
	} // L: 948
}
