import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("an")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("ItemComposition_modelArchive")
	static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("aq")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ad")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-847803201"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-390046423"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/security/SecureRandom;",
		garbageValue = "128"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var2) { // L: 30
			return class401.method7407(); // L: 31
		}
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-66"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class31.method462(); // L: 12937
		class237.method4496(); // L: 12938
		int var1 = MilliClock.VarpDefinition_get(var0).type; // L: 12939
		if (var1 != 0) { // L: 12940
			int var2 = Varps.Varps_main[var0]; // L: 12941
			if (var1 == 1) { // L: 12942
				if (var2 == 1) { // L: 12943
					InvDefinition.method3555(0.9D);
				}

				if (var2 == 2) { // L: 12944
					InvDefinition.method3555(0.8D);
				}

				if (var2 == 3) { // L: 12945
					InvDefinition.method3555(0.7D);
				}

				if (var2 == 4) { // L: 12946
					InvDefinition.method3555(0.6D);
				}
			}

			if (var1 == 3) { // L: 12948
				if (var2 == 0) { // L: 12949
					Script.method2265(255);
				}

				if (var2 == 1) { // L: 12950
					Script.method2265(192);
				}

				if (var2 == 2) { // L: 12951
					Script.method2265(128);
				}

				if (var2 == 3) { // L: 12952
					Script.method2265(64);
				}

				if (var2 == 4) { // L: 12953
					Script.method2265(0);
				}
			}

			if (var1 == 4) { // L: 12955
				if (var2 == 0) { // L: 12956
					class105.method2785(127);
				}

				if (var2 == 1) { // L: 12957
					class105.method2785(96);
				}

				if (var2 == 2) { // L: 12958
					class105.method2785(64);
				}

				if (var2 == 3) { // L: 12959
					class105.method2785(32);
				}

				if (var2 == 4) { // L: 12960
					class105.method2785(0);
				}
			}

			if (var1 == 5) { // L: 12962
				Client.field780 = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2; // L: 12963
			}

			if (var1 == 9) { // L: 12964
			}

			if (var1 == 10) { // L: 12965
				if (var2 == 0) { // L: 12966
					class148.method3278(127);
				}

				if (var2 == 1) { // L: 12967
					class148.method3278(96);
				}

				if (var2 == 2) { // L: 12968
					class148.method3278(64);
				}

				if (var2 == 3) { // L: 12969
					class148.method3278(32);
				}

				if (var2 == 4) { // L: 12970
					class148.method3278(0);
				}
			}

			if (var1 == 17) { // L: 12972
				Client.followerIndex = var2 & 65535; // L: 12973
			}

			if (var1 == 18) { // L: 12975
				AttackOption[] var3 = new AttackOption[]{AttackOption.field1381, AttackOption.field1384, AttackOption.field1385, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1382}; // L: 12978
				Client.playerAttackOption = (AttackOption)class210.findEnumerated(var3, var2); // L: 12980
				if (Client.playerAttackOption == null) { // L: 12981
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12983
				if (var2 == -1) { // L: 12984
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12985
				}
			}

			if (var1 == 22) { // L: 12987
				Client.npcAttackOption = (AttackOption)class210.findEnumerated(class142.method3233(), var2); // L: 12988
				if (Client.npcAttackOption == null) { // L: 12989
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12991
}
