import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -907537521
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1059334553
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lji;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "256"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method4842(var1) || this.archive.method4831(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}
}
