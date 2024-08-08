import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class336 {
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = 1890787249
	)
	public static int field799;
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	static final class240 field520;
	@ObfuscatedName("xb")
	static int[] field641;
	@ObfuscatedName("xs")
	static int[] field671;
	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static final ApproximateRouteStrategy field645;
	@ObfuscatedName("wc")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = 1393048613
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = 266342933
	)
	static int field574;
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	static class507 field656;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "[Lps;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wr")
	static List field800;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static class461 field795;
	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static EvictingDualNodeHashTable field797;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("wt")
	@ObfuscatedGetter(
		intValue = 571114373
	)
	static int field798;
	@ObfuscatedName("bf")
	static boolean field602;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1545207573
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -420267913
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -939925291
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cn")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("ce")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1602400867
	)
	static int field637;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 483342745
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1264463859
	)
	static int field506;
	@ObfuscatedName("cp")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1081073917
	)
	static int field508;
	@ObfuscatedName("dg")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dr")
	static boolean field510;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 383910097
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ds")
	static boolean field675;
	@ObfuscatedName("do")
	static boolean field739;
	@ObfuscatedName("di")
	static boolean field514;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 271071563
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -2144931763
	)
	static int field516;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		longValue = -7092568847167099497L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1099081089
	)
	static int field519;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1934712737
	)
	static int field807;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		longValue = 4483791798509325765L
	)
	static long field521;
	@ObfuscatedName("dh")
	static boolean field522;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -792048985
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1949011067
	)
	static int field524;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 72526637
	)
	static int field794;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -2002022847
	)
	static int field526;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1793171387
	)
	static int field527;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 1114391019
	)
	static int field787;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 857147930
	)
	static int field543;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1228994625
	)
	static int field600;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1120647239
	)
	static int field531;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eb")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	static class94 field535;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 1967717801
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 289554243
	)
	static int field537;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = -1296877745
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -548733073
	)
	static int field539;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = -1552879491
	)
	static int field560;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -915603301
	)
	static int field708;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static class128 field542;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static class551 field676;
	@ObfuscatedName("gy")
	static final String field619;
	@ObfuscatedName("gg")
	static final String field555;
	@ObfuscatedName("hn")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static SecureRandomFuture field558;
	@ObfuscatedName("hi")
	static int[] field559;
	@ObfuscatedName("hd")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1148233249
	)
	static int field564;
	@ObfuscatedName("he")
	static int[] field565;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 1498709847
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ik")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("in")
	static HashMap field570;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1563699817
	)
	static int field778;
	@ObfuscatedName("it")
	static String field642;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 1599197695
	)
	static int field755;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 517985415
	)
	static int field573;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1263456409
	)
	static int field534;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1576916745
	)
	static int field575;
	@ObfuscatedName("jm")
	static int[][][] field683;
	@ObfuscatedName("jq")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jw")
	static int[][][] field578;
	@ObfuscatedName("ja")
	static final int[] field579;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 2061659125
	)
	static int field580;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 805610763
	)
	static int field805;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -877751007
	)
	static int field693;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 1732969453
	)
	static int field583;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 1145616963
	)
	static int field584;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -464481199
	)
	static int field747;
	@ObfuscatedName("kk")
	static boolean field586;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1310205335
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 575410377
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -781326059
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 2040069139
	)
	static int field590;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -811041119
	)
	static int field591;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 2122058543
	)
	static int field536;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -329091845
	)
	static int field593;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -1880847825
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -1684016557
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 1816031723
	)
	static int field596;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1496220751
	)
	static int field597;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1891084203
	)
	static int field598;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -834414311
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1539316607
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -1292359005
	)
	static int field601;
	@ObfuscatedName("lb")
	static boolean field712;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 1700159481
	)
	static int field650;
	@ObfuscatedName("lh")
	static boolean field604;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -676006897
	)
	static int field605;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -804657147
	)
	static int field606;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -460372189
	)
	static int field607;
	@ObfuscatedName("ls")
	static int[] field608;
	@ObfuscatedName("le")
	static int[] field609;
	@ObfuscatedName("ly")
	static int[] field610;
	@ObfuscatedName("lg")
	static int[] field667;
	@ObfuscatedName("lx")
	static int[] field612;
	@ObfuscatedName("lc")
	static int[] field613;
	@ObfuscatedName("mo")
	static int[][] field540;
	@ObfuscatedName("mr")
	static int[] field615;
	@ObfuscatedName("mz")
	static String[] field616;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 2005252973
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1922466759
	)
	static int field618;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -2146996983
	)
	static int field585;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1694544311
	)
	static int field525;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 2147270251
	)
	static int field621;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -224401479
	)
	static int field622;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -889216765
	)
	static int field674;
	@ObfuscatedName("mp")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 1760374075
	)
	static int field625;
	@ObfuscatedName("mh")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 1043322835
	)
	static int field706;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 1106664327
	)
	static int field628;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		longValue = -1069174027776292633L
	)
	static long field629;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		longValue = 5654752889437794873L
	)
	static long field630;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 686350733
	)
	static int field503;
	@ObfuscatedName("mu")
	static boolean field551;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -44084715
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 605542881
	)
	static int field639;
	@ObfuscatedName("ni")
	static int[] field644;
	@ObfuscatedName("nw")
	static final int[] field636;
	@ObfuscatedName("no")
	static String[] field686;
	@ObfuscatedName("nl")
	static boolean[] field638;
	@ObfuscatedName("nj")
	static int[] field703;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 1913368221
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nu")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nh")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nq")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nf")
	static int[] field775;
	@ObfuscatedName("nd")
	static boolean field780;
	@ObfuscatedName("ne")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -1361024685
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nb")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nk")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("on")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("oq")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("ov")
	static int[] field763;
	@ObfuscatedName("od")
	static int[] field653;
	@ObfuscatedName("op")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ob")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("or")
	static boolean[] field528;
	@ObfuscatedName("ot")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oi")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("of")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 1682068127
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -17675013
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 1814579321
	)
	static int field662;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -690678063
	)
	static int field500;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -583841881
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("oz")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 531417221
	)
	static int field801;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 307705673
	)
	static int field587;
	@ObfuscatedName("oj")
	static String field669;
	@ObfuscatedName("pj")
	static String field670;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = 17753643
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 292950689
	)
	static int field673;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 2114293145
	)
	static int field504;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -1109325709
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 964069107
	)
	static int field677;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1047853455
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -1441000797
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 958782045
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pz")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1867510069
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 85940377
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pq")
	static boolean field688;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = -979253241
	)
	static int field689;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 857685933
	)
	static int field505;
	@ObfuscatedName("pw")
	static boolean field691;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 1196179167
	)
	static int field692;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 1246106715
	)
	static int field663;
	@ObfuscatedName("qe")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 206872803
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qu")
	static int[] field696;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -239936169
	)
	static int field697;
	@ObfuscatedName("qn")
	static int[] field698;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = -1480906373
	)
	static int field620;
	@ObfuscatedName("qq")
	static int[] field687;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1410318385
	)
	static int field701;
	@ObfuscatedName("ql")
	static int[] field571;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -579475639
	)
	static int field719;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 831135969
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -1457616349
	)
	static int field705;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -971069201
	)
	static int field803;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1432015157
	)
	static int field707;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -1526215277
	)
	static int field659;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -1248782159
	)
	static int field709;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 401730143
	)
	static int field727;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 1233496723
	)
	static int field711;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = -101179887
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	static class564 field713;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field715;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field716;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field717;
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -1895328209
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -800310153
	)
	static int field720;
	@ObfuscatedName("rw")
	static boolean[] field721;
	@ObfuscatedName("ra")
	static boolean[] field722;
	@ObfuscatedName("rd")
	static boolean[] field723;
	@ObfuscatedName("rf")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("re")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rl")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 552032687
	)
	static int field582;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		longValue = 7837883151600069321L
	)
	static long field729;
	@ObfuscatedName("rm")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -1592891773
	)
	static int field731;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -747562771
	)
	static int field732;
	@ObfuscatedName("sv")
	static int[] field733;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 1055182343
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -814861539
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sf")
	static String field736;
	@ObfuscatedName("sa")
	static long[] field737;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 668387317
	)
	static int field738;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static class231 field728;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	static class229 field740;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = 1939911287
	)
	static int field741;
	@ObfuscatedName("ss")
	static int[] field742;
	@ObfuscatedName("si")
	static int[] field592;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		longValue = -6366518147636730365L
	)
	static long field744;
	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1888012179
	)
	static int field632;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1261127601
	)
	static int field512;
	@ObfuscatedName("tf")
	static int[] field749;
	@ObfuscatedName("tv")
	static int[] field750;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field554;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = 2100059549
	)
	static int field752;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -1879112413
	)
	static int field753;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 419900219
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tm")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = 395295339
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tu")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("to")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("th")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("up")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uz")
	static int[] field668;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uu")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uc")
	static boolean field764;
	@ObfuscatedName("uv")
	static boolean field553;
	@ObfuscatedName("ub")
	static boolean field804;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	static class511 field767;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static class510 field768;
	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static class510 field769;
	@ObfuscatedName("ua")
	static boolean field567;
	@ObfuscatedName("vb")
	static boolean[] field771;
	@ObfuscatedName("vk")
	static int[] field772;
	@ObfuscatedName("vj")
	static int[] field664;
	@ObfuscatedName("vy")
	static int[] field774;
	@ObfuscatedName("vr")
	static int[] field498;
	@ObfuscatedName("vu")
	static short field776;
	@ObfuscatedName("vt")
	static short field777;
	@ObfuscatedName("vw")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vx")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vq")
	static short field751;
	@ObfuscatedName("vv")
	static short field781;
	@ObfuscatedName("vg")
	static short field782;
	@ObfuscatedName("vh")
	static short field783;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -1428310161
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = 1351329335
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -769669001
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 1941814151
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -736483307
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = 1197048315
	)
	static int field790;
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = 1026081245
	)
	static int field665;
	@ObfuscatedName("gl")
	String field544;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class14 field545;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	class18 field546;
	@ObfuscatedName("go")
	OtlTokenRequester field547;
	@ObfuscatedName("gx")
	Future field710;
	@ObfuscatedName("gd")
	boolean field549;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1672003813
	)
	int field532;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	class18 field614;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field552;
	@ObfuscatedName("gt")
	Future field541;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field533;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	class7 field561;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		longValue = -7067965715940361021L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field602 = true; // L: 151
		worldId = 1; // L: 152
		worldProperties = 0; // L: 153
		gameBuild = 0; // L: 155
		isMembersWorld = false; // L: 158
		isLowDetail = false; // L: 159
		field637 = -1; // L: 164
		clientType = -1; // L: 165
		field506 = -1; // L: 166
		onMobile = false; // L: 167
		field508 = 223; // L: 168
		isLoading = false; // L: 180
		field510 = false; // L: 181
		gameState = 0; // L: 182
		field675 = false; // L: 183
		field739 = false; // L: 184
		field514 = true; // L: 190
		cycle = 0; // L: 191
		field516 = 0; // L: 192
		mouseLastLastPressedTimeMillis = 1L; // L: 193
		field519 = -1; // L: 195
		field807 = -1; // L: 196
		field521 = -1L; // L: 197
		field522 = true; // L: 198
		rebootTimer = 0; // L: 199
		field524 = 0; // L: 200
		field794 = 0; // L: 201
		field526 = 0; // L: 202
		field527 = 0; // L: 203
		field787 = 0; // L: 204
		field543 = 0; // L: 205
		field600 = 0; // L: 206
		field531 = 0; // L: 207
		playerAttackOption = AttackOption.field1382; // L: 209
		npcAttackOption = AttackOption.field1382; // L: 210
		renderSelf = false; // L: 212
		field535 = class94.field1157; // L: 221
		js5ConnectState = 0; // L: 224
		field537 = 0; // L: 225
		js5Errors = 0; // L: 249
		field539 = 0; // L: 253
		field560 = 0; // L: 254
		field708 = 0; // L: 255
		field542 = class128.field1519; // L: 256
		field676 = class551.field5419; // L: 257
		byte[] var1 = class165.method3465("com_jagex_auth_desktop_osrs:public"); // L: 284
		int var3 = var1.length; // L: 287
		StringBuilder var4 = new StringBuilder(); // L: 289

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < var3 + 0; var5 += 3) { // L: 290
			var6 = var1[var5] & 255; // L: 291
			var4.append(class414.field4669[var6 >>> 2]); // L: 292
			if (var5 < var3 - 1) { // L: 293
				var7 = var1[var5 + 1] & 255; // L: 294
				var4.append(class414.field4669[(var6 & 3) << 4 | var7 >>> 4]); // L: 295
				if (var5 < var3 - 2) { // L: 296
					var8 = var1[var5 + 2] & 255; // L: 297
					var4.append(class414.field4669[(var7 & 15) << 2 | var8 >>> 6]).append(class414.field4669[var8 & 63]); // L: 298
				} else {
					var4.append(class414.field4669[(var7 & 15) << 2]).append("="); // L: 300
				}
			} else {
				var4.append(class414.field4669[(var6 & 3) << 4]).append("=="); // L: 302
			}
		}

		String var2 = var4.toString(); // L: 304
		field619 = var2; // L: 308
		int var10 = "com_jagex_auth_desktop_runelite:public".length(); // L: 317
		byte[] var11 = new byte[var10]; // L: 318

		int var12;
		for (var12 = 0; var12 < var10; ++var12) { // L: 319
			char var15 = "com_jagex_auth_desktop_runelite:public".charAt(var12); // L: 320
			if (var15 > 127) { // L: 321
				var11[var12] = 63;
			} else {
				var11[var12] = (byte)var15; // L: 322
			}
		}

		byte[] var14 = var11; // L: 326
		var12 = var11.length; // L: 329
		StringBuilder var13 = new StringBuilder(); // L: 331

		for (var6 = 0; var6 < var12 + 0; var6 += 3) { // L: 332
			var7 = var14[var6] & 255; // L: 333
			var13.append(class414.field4669[var7 >>> 2]); // L: 334
			if (var6 < var12 - 1) { // L: 335
				var8 = var14[var6 + 1] & 255; // L: 336
				var13.append(class414.field4669[(var7 & 3) << 4 | var8 >>> 4]); // L: 337
				if (var6 < var12 - 2) { // L: 338
					int var9 = var14[var6 + 2] & 255; // L: 339
					var13.append(class414.field4669[(var8 & 15) << 2 | var9 >>> 6]).append(class414.field4669[var9 & 63]); // L: 340
				} else {
					var13.append(class414.field4669[(var8 & 15) << 2]).append("="); // L: 342
				}
			} else {
				var13.append(class414.field4669[(var7 & 3) << 4]).append("=="); // L: 344
			}
		}

		String var16 = var13.toString(); // L: 346
		field555 = var16; // L: 350
		Login_isUsernameRemembered = false; // L: 366
		field558 = new SecureRandomFuture(); // L: 367
		field559 = new int[4]; // L: 369
		randomDatData = null; // L: 373
		field564 = 0; // L: 377
		field565 = new int[250]; // L: 378
		packetWriter = new PacketWriter(); // L: 383
		logoutTimer = 0; // L: 385
		hadNetworkError = false; // L: 386
		timer = new Timer(); // L: 387
		field570 = new HashMap(); // L: 393
		field778 = 0; // L: 398
		field755 = 1; // L: 399
		field573 = 0; // L: 400
		field534 = 1; // L: 401
		field575 = 0; // L: 402
		field683 = new int[4][13][13]; // L: 415
		isInInstance = false; // L: 417
		field578 = new int[4][13][13]; // L: 418
		field579 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 419
		field580 = -1; // L: 424
		field805 = 0; // L: 425
		field693 = 2301979; // L: 437
		field583 = 5063219; // L: 438
		field584 = 3353893; // L: 439
		field747 = 7759444; // L: 440
		field586 = false; // L: 441
		alternativeScrollbarWidth = 0; // L: 442
		camAngleX = 128; // L: 450
		camAngleY = 0; // L: 451
		field590 = 0; // L: 452
		field591 = 0; // L: 453
		field536 = 0; // L: 454
		field593 = 0; // L: 455
		oculusOrbState = 0; // L: 456
		camFollowHeight = 50; // L: 457
		field596 = 0; // L: 461
		field597 = 0; // L: 462
		field598 = 0; // L: 463
		oculusOrbNormalSpeed = 12; // L: 465
		oculusOrbSlowedSpeed = 6; // L: 466
		field601 = 0; // L: 467
		field712 = false; // L: 468
		field650 = 0; // L: 469
		field604 = false; // L: 470
		field605 = 0; // L: 471
		field606 = 0; // L: 472
		field607 = 50; // L: 473
		field608 = new int[field607]; // L: 474
		field609 = new int[field607]; // L: 475
		field610 = new int[field607]; // L: 476
		field667 = new int[field607]; // L: 477
		field612 = new int[field607]; // L: 478
		field613 = new int[field607]; // L: 479
		field540 = new int[field607][]; // L: 480
		field615 = new int[field607]; // L: 481
		field616 = new String[field607]; // L: 482
		viewportDrawCount = 0; // L: 483
		field618 = -1; // L: 484
		field585 = -1; // L: 485
		field525 = 0; // L: 486
		field621 = 0; // L: 487
		field622 = 0; // L: 488
		field674 = 0; // L: 489
		showMouseCross = true; // L: 490
		field625 = 0; // L: 491
		showLoadingMessages = true; // L: 493
		field706 = -1; // L: 495
		field628 = 0; // L: 496
		field629 = -1L; // L: 497
		field630 = -1L; // L: 498
		field503 = -1; // L: 501
		field551 = true; // L: 504
		drawPlayerNames = 0; // L: 509
		field639 = 0; // L: 510
		field644 = new int[1000]; // L: 511
		field636 = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 513
		field686 = new String[8]; // L: 514
		field638 = new boolean[8]; // L: 515
		field703 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 516
		combatTargetPlayerIndex = -1; // L: 517
		currentLevels = new int[25]; // L: 518
		levels = new int[25]; // L: 519
		experience = new int[25]; // L: 520
		field775 = new int[25]; // L: 521
		field780 = false; // L: 522
		isMenuOpen = false; // L: 523
		menuOptionsCount = 0; // L: 529
		menuArguments1 = new int[500]; // L: 530
		menuArguments2 = new int[500]; // L: 531
		menuOpcodes = new int[500]; // L: 532
		menuIdentifiers = new int[500]; // L: 533
		field763 = new int[500]; // L: 534
		field653 = new int[500]; // L: 535
		menuActions = new String[500]; // L: 536
		menuTargets = new String[500]; // L: 537
		field528 = new boolean[500]; // L: 538
		followerOpsLowPriority = false; // L: 539
		tapToDrop = false; // L: 541
		showMouseOverText = true; // L: 542
		viewportX = -1; // L: 543
		viewportY = -1; // L: 544
		field662 = 0; // L: 548
		field500 = 50; // L: 549
		isItemSelected = 0; // L: 550
		field642 = null; // L: 554
		isSpellSelected = false; // L: 555
		field801 = -1; // L: 557
		field587 = -1; // L: 558
		field669 = null; // L: 560
		field670 = null; // L: 561
		rootInterface = -1; // L: 562
		interfaceParents = new NodeHashTable(8); // L: 563
		field673 = 0; // L: 568
		field504 = -1; // L: 569
		chatEffects = 0; // L: 570
		meslayerContinueWidget = null; // L: 571
		field677 = 0; // L: 572
		weight = 0; // L: 573
		staffModLevel = 0; // L: 574
		followerIndex = -1; // L: 575
		playerMod = false; // L: 576
		viewportWidget = null; // L: 577
		clickedWidget = null; // L: 578
		clickedWidgetParent = null; // L: 579
		widgetClickX = 0; // L: 580
		widgetClickY = 0; // L: 581
		draggedOnWidget = null; // L: 582
		field688 = false; // L: 583
		field689 = -1; // L: 584
		field505 = -1; // L: 585
		field691 = false; // L: 586
		field692 = -1; // L: 587
		field663 = -1; // L: 588
		isDraggingWidget = false; // L: 589
		cycleCntr = 1; // L: 594
		field696 = new int[32]; // L: 597
		field697 = 0; // L: 598
		field698 = new int[32]; // L: 599
		field620 = 0; // L: 600
		field687 = new int[32]; // L: 601
		field701 = 0; // L: 602
		field571 = new int[32]; // L: 603
		field719 = 0; // L: 604
		chatCycle = 0; // L: 605
		field705 = 0; // L: 606
		field803 = 0; // L: 607
		field707 = 0; // L: 608
		field659 = 0; // L: 609
		field709 = 0; // L: 610
		field727 = 0; // L: 611
		field711 = 0; // L: 612
		mouseWheelRotation = 0; // L: 618
		field713 = new class564(); // L: 619
		scriptEvents = new NodeDeque(); // L: 620
		field715 = new NodeDeque(); // L: 621
		field716 = new NodeDeque(); // L: 622
		field717 = new NodeDeque(); // L: 623
		widgetFlags = new NodeHashTable(512); // L: 624
		rootWidgetCount = 0; // L: 626
		field720 = -2; // L: 627
		field721 = new boolean[100]; // L: 628
		field722 = new boolean[100]; // L: 629
		field723 = new boolean[100]; // L: 630
		rootWidgetXs = new int[100]; // L: 631
		rootWidgetYs = new int[100]; // L: 632
		rootWidgetWidths = new int[100]; // L: 633
		rootWidgetHeights = new int[100]; // L: 634
		field582 = 0; // L: 635
		field729 = 0L; // L: 636
		isResizable = true; // L: 637
		field731 = 600; // L: 644
		field732 = field731 / GameEngine.cycleDurationMillis; // L: 645
		field733 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 646
		publicChatMode = 0; // L: 647
		tradeChatMode = 0; // L: 649
		field736 = ""; // L: 650
		field737 = new long[100]; // L: 652
		field738 = 0; // L: 653
		field728 = new class231(); // L: 654
		field740 = new class229(); // L: 655
		field741 = 0; // L: 657
		field742 = new int[128]; // L: 658
		field592 = new int[128]; // L: 659
		field744 = -1L; // L: 660
		currentClanSettings = new ClanSettings[4]; // L: 664
		currentClanChannels = new ClanChannel[4]; // L: 666
		field632 = -1; // L: 668
		field512 = 0; // L: 669
		field749 = new int[1000]; // L: 670
		field750 = new int[1000]; // L: 671
		field554 = new SpritePixels[1000]; // L: 672
		field752 = 0; // L: 673
		field753 = 0; // L: 674
		minimapState = 0; // L: 681
		playingJingle = false; // L: 682
		soundEffectCount = 0; // L: 687
		soundEffectIds = new int[50]; // L: 688
		queuedSoundEffectLoops = new int[50]; // L: 689
		queuedSoundEffectDelays = new int[50]; // L: 690
		soundLocations = new int[50]; // L: 691
		field668 = new int[50]; // L: 692
		soundEffects = new SoundEffect[50]; // L: 693
		isCameraLocked = false; // L: 695
		field764 = false; // L: 701
		field553 = false; // L: 702
		field804 = false; // L: 703
		field767 = null; // L: 709
		field768 = null; // L: 710
		field769 = null; // L: 711
		field567 = false; // L: 712
		field771 = new boolean[5]; // L: 720
		field772 = new int[5]; // L: 721
		field664 = new int[5]; // L: 722
		field774 = new int[5]; // L: 723
		field498 = new int[5]; // L: 724
		field776 = 256; // L: 725
		field777 = 205; // L: 726
		zoomHeight = 256; // L: 727
		zoomWidth = 320; // L: 728
		field751 = 1; // L: 729
		field781 = 32767; // L: 730
		field782 = 1; // L: 731
		field783 = 32767; // L: 732
		viewportOffsetX = 0; // L: 733
		viewportOffsetY = 0; // L: 734
		viewportWidth = 0; // L: 735
		viewportHeight = 0; // L: 736
		viewportZoom = 0; // L: 737
		playerAppearance = new PlayerComposition(); // L: 739
		field790 = -1; // L: 740
		field665 = -1; // L: 741
		field656 = new DesktopPlatformInfoProvider(); // L: 743
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 745
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 748
		field795 = new class461(8, class459.field4897); // L: 750
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 752
		field797 = new EvictingDualNodeHashTable(64); // L: 753
		field798 = -1; // L: 756
		field799 = -1; // L: 762
		field800 = new ArrayList(); // L: 763
		field520 = new class240(); // L: 764
		archiveLoaders = new ArrayList(10); // L: 765
		archiveLoadersDone = 0; // L: 766
		field574 = 0; // L: 767
		field645 = new ApproximateRouteStrategy(); // L: 776
		field641 = new int[50]; // L: 777
		field671 = new int[50]; // L: 778
	}

	public Client() {
		this.field549 = false; // L: 275
		this.field532 = 0; // L: 276
		this.accountHash = -1L; // L: 372
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "643678777"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field729 = WorldMapData_1.method4861() + 500L; // L: 4910
		this.resizeJS(); // L: 4911
		if (rootInterface != -1) { // L: 4912
			this.resizeRoot(true);
		}

	} // L: 4913

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1663834683"
	)
	@Export("setUp")
	protected final void setUp() {
		class83.method2345(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 1049
		class4.field9 = class191.method3699(worldProperties, class542.field5331); // L: 1050
		NPCComposition.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1051
		class33.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1052
		class169.currentPort = NPCComposition.worldPort; // L: 1053
		class452.field4862 = class357.field3816; // L: 1054
		class105.field1371 = class357.field3817; // L: 1055
		FriendSystem.field829 = class357.field3818; // L: 1056
		MouseRecorder.field1098 = class357.field3814; // L: 1057
		ByteArrayPool.urlRequester = new class117(this.field549, 223); // L: 1058
		this.setUpKeyboard(); // L: 1060
		this.method494(); // L: 1061
		ChatChannel.field1031 = this.mouseWheel(); // L: 1062
		this.method493(field740, 0); // L: 1063
		this.method493(field728, 1); // L: 1064
		this.setUpClipboard(); // L: 1065
		MouseHandler.field224 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1067
		AccessFile var2 = null; // L: 1070
		ClientPreferences var3 = new ClientPreferences(); // L: 1071

		try {
			var2 = UserComparator10.getPreferencesFile("", class109.field1400.name, false); // L: 1073
			byte[] var4 = new byte[(int)var2.length()]; // L: 1074

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 1075 1076 1079
				var6 = var2.read(var4, var5, var4.length - var5); // L: 1077
				if (var6 == -1) { // L: 1078
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 1081
		} catch (Exception var8) { // L: 1083
		}

		try {
			if (var2 != null) { // L: 1085
				var2.close(); // L: 1086
			}
		} catch (Exception var7) { // L: 1089
		}

		class105.clientPreferences = var3; // L: 1092
		String var9 = WorldMapSprite.field2697; // L: 1094
		class31.field154 = this; // L: 1096
		if (var9 != null) { // L: 1097
			class31.field150 = var9;
		}

		class225.setWindowedMode(class105.clientPreferences.method2623()); // L: 1099
		class135.friendSystem = new FriendSystem(Projectile.loginType); // L: 1100
		this.field545 = new class14("tokenRequest", 1, 1); // L: 1101
		class91.method2390(this); // L: 1102
		field520.method4538(); // L: 1103
	} // L: 1104

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1112
		this.doCycleJs5(); // L: 1113
		class138.method3192(); // L: 1114
		boolean var2 = false; // L: 1117
		boolean var3 = false; // L: 1118
		if (!class330.field3581.isEmpty()) { // L: 1119
			class444 var4 = (class444)class330.field3581.get(0); // L: 1120
			if (var4 == null) { // L: 1121
				class330.field3581.remove(0); // L: 1122
			} else if (var4.vmethod8276()) { // L: 1124
				if (var4.method8249()) { // L: 1125
					System.out.println("Error in midimanager.service: " + var4.method8251()); // L: 1126
					var2 = true; // L: 1127
				} else {
					if (var4.method8254() != null) { // L: 1130
						class330.field3581.add(1, var4.method8254()); // L: 1131
					}

					var3 = var4.method8250(); // L: 1133
				}

				class330.field3581.remove(0); // L: 1135
			} else {
				var3 = var4.method8250(); // L: 1138
			}
		}

		if (var2) { // L: 1141
			class330.field3581.clear(); // L: 1142
			Iterator var10 = class330.field3584.iterator(); // L: 1144

			label127:
			while (true) {
				class342 var5;
				do {
					if (!var10.hasNext()) {
						class330.field3584.clear(); // L: 1166
						break label127;
					}

					var5 = (class342)var10.next(); // L: 1145
				} while(var5 == null); // L: 1147

				var5.field3713.clear(); // L: 1150
				var5.field3713.method6190(); // L: 1151
				var5.field3713.setPcmStreamVolume(0); // L: 1152
				var5.field3713.field3627 = 0; // L: 1153
				int var6 = var5.field3716; // L: 1154
				int var7 = var5.field3705; // L: 1155
				Iterator var8 = class330.field3588.iterator(); // L: 1157

				while (var8.hasNext()) {
					class336 var9 = (class336)var8.next(); // L: 1158
					var9.vmethod6382(var6, var7); // L: 1160
				}
			}
		}

		if (var3 && playingJingle && Projectile.pcmPlayer1 != null) { // L: 1172 1173
			Projectile.pcmPlayer1.tryDiscard();
		}

		class157.method3347(); // L: 1175
		field728.method4406(); // L: 1176
		this.method492(); // L: 1177
		ClanChannelMember.method3280(); // L: 1178
		if (ChatChannel.field1031 != null) { // L: 1179
			int var11 = ChatChannel.field1031.useRotation(); // L: 1180
			mouseWheelRotation = var11; // L: 1181
		}

		if (gameState == 0) { // L: 1183
			Varps.method6456(); // L: 1184
			FriendLoginUpdate.method8525(); // L: 1185
		} else if (gameState == 5) { // L: 1187
			FaceNormal.method5687(this, GrandExchangeOfferOwnWorldComparator.field468, FloorUnderlayDefinition.fontPlain12); // L: 1188
			Varps.method6456(); // L: 1189
			FriendLoginUpdate.method8525(); // L: 1190
		} else if (gameState != 10 && gameState != 11) { // L: 1192
			if (gameState == 20) { // L: 1195
				FaceNormal.method5687(this, GrandExchangeOfferOwnWorldComparator.field468, FloorUnderlayDefinition.fontPlain12); // L: 1196
				this.doCycleLoggedOut(); // L: 1197
			} else if (gameState == 50) { // L: 1199
				FaceNormal.method5687(this, GrandExchangeOfferOwnWorldComparator.field468, FloorUnderlayDefinition.fontPlain12); // L: 1200
				this.doCycleLoggedOut(); // L: 1201
			} else if (gameState == 25) { // L: 1203
				if (isLoading) { // L: 1204
					MusicPatchPcmStream.method6392(); // L: 1205
				}

				if (field510) { // L: 1207
					class201.method3827(class170.field1839); // L: 1208
				}

				if (!field510 && !isLoading) { // L: 1210
					ClanChannelMember.method3282(30); // L: 1211
				}
			}
		} else {
			FaceNormal.method5687(this, GrandExchangeOfferOwnWorldComparator.field468, FloorUnderlayDefinition.fontPlain12); // L: 1193
		}

		if (gameState == 30) { // L: 1214
			this.doCycleLoggedIn(); // L: 1215
		} else if (gameState == 40 || gameState == 45) { // L: 1217
			this.doCycleLoggedOut(); // L: 1218
		}

	} // L: 1220

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1954908195"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field729 != 0L && WorldMapData_1.method4861() > field729) { // L: 1224 1225
			class225.setWindowedMode(GrandExchangeOfferOwnWorldComparator.getWindowedMode()); // L: 1226
		}

		int var2;
		if (var1) { // L: 1229
			for (var2 = 0; var2 < 100; ++var2) { // L: 1230
				field721[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1232
			this.method546(Login.Login_loadingPercent, Login.Login_loadingText, var1, FloorUnderlayDefinition.field2095); // L: 1233
		} else if (gameState == 5) { // L: 1235
			class140.drawTitle(ParamComposition.fontBold12, GrandExchangeOfferOwnWorldComparator.field468, FloorUnderlayDefinition.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1236
			if (gameState == 20) { // L: 1237
				class140.drawTitle(ParamComposition.fontBold12, GrandExchangeOfferOwnWorldComparator.field468, FloorUnderlayDefinition.fontPlain12);
			} else if (gameState == 50) { // L: 1238
				class140.drawTitle(ParamComposition.fontBold12, GrandExchangeOfferOwnWorldComparator.field468, FloorUnderlayDefinition.fontPlain12);
			} else if (gameState == 25) { // L: 1239
				if (field575 == 1) { // L: 1240
					if (field778 > field755) { // L: 1241
						field755 = field778;
					}

					var2 = (field755 * 50 - field778 * 50) / field755; // L: 1242
					class59.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1243
				} else if (field575 == 2) { // L: 1245
					if (field573 > field534) { // L: 1246
						field534 = field573;
					}

					var2 = (field534 * 50 - field573 * 50) / field534 + 50; // L: 1247
					class59.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1248
				} else {
					class59.drawLoadingMessage("Loading - please wait.", false); // L: 1250
				}
			} else if (gameState == 30) { // L: 1252
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1253
				class59.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1254
				class59.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class140.drawTitle(ParamComposition.fontBold12, GrandExchangeOfferOwnWorldComparator.field468, FloorUnderlayDefinition.fontPlain12); // L: 1244
		}

		if (gameState == 30 && field582 == 0 && !var1 && !isResizable) { // L: 1255
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1256
				if (field722[var2]) { // L: 1257
					class434.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1258
					field722[var2] = false; // L: 1259
				}
			}
		} else if (gameState > 0) { // L: 1263
			class434.rasterProvider.drawFull(0, 0); // L: 1264

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1265
				field722[var2] = false;
			}
		}

	} // L: 1267

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2038512898"
	)
	@Export("kill0")
	protected final void kill0() {
		// $FF: Couldn't be decompiled
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1067293593"
	)
	protected final void vmethod1251() {
	} // L: 789

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1040171340"
	)
	boolean method1255() {
		return this.field532 == 1; // L: 946
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	boolean method1830() {
		return class422.field4694 != null && !class422.field4694.trim().isEmpty() && class36.field227 != null && !class36.field227.trim().isEmpty(); // L: 986
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "17982"
	)
	boolean method1259() {
		return Canvas.field103 != null && !Canvas.field103.trim().isEmpty() && class142.field1661 != null && !class142.field1661.trim().isEmpty(); // L: 990
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-190071007"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field547 != null; // L: 994
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "308555287"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 998
		var2.put("grant_type", "refresh_token"); // L: 999
		var2.put("scope", "gamesso.token.create"); // L: 1000
		var2.put("refresh_token", var1); // L: 1001
		URL var3 = new URL(class176.field1864 + "shield/oauth/token" + (new class495(var2)).method8873()); // L: 1002
		class457 var4 = new class457(); // L: 1003
		if (this.method1255()) { // L: 1004
			var4.method8399(field555); // L: 1005
		} else {
			var4.method8399(field619); // L: 1008
		}

		var4.method8382("Host", (new URL(class176.field1864)).getHost()); // L: 1010
		var4.method8371(class492.field5042); // L: 1011
		class9 var5 = class9.field41; // L: 1012
		RefreshAccessTokenRequester var6 = this.field552; // L: 1013
		if (var6 != null) { // L: 1014
			this.field541 = var6.request(var5.method70(), var3, var4.method8379(), ""); // L: 1015
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field549); // L: 1018
			this.field614 = this.field545.method171(var7); // L: 1019
		}
	} // L: 1016 1020

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1811960319"
	)
	void method1262(String var1) throws IOException {
		URL var2 = new URL(class176.field1864 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 1023
		class457 var3 = new class457(); // L: 1024
		var3.method8387(var1); // L: 1025
		class9 var4 = class9.field49; // L: 1026
		OtlTokenRequester var5 = this.field547; // L: 1027
		if (var5 != null) { // L: 1028
			this.field710 = var5.request(var4.method70(), var2, var3.method8379(), ""); // L: 1029
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field549); // L: 1032
			this.field546 = this.field545.method171(var6); // L: 1033
		}
	} // L: 1030 1034

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "30"
	)
	void method1263(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class316.field3269 + "game-session/v1/tokens"); // L: 1037
		class10 var4 = new class10(var3, class9.field41, this.field549); // L: 1038
		var4.method81().method8387(var1); // L: 1039
		var4.method81().method8371(class492.field5042); // L: 1040
		JSONObject var5 = new JSONObject(); // L: 1041
		var5.put("accountId", var2); // L: 1042
		var4.method82(new class494(var5)); // L: 1043
		this.field546 = this.field545.method171(var4); // L: 1044
	} // L: 1045

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1150371023"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1431
			boolean var1 = class233.field2486.method7270(); // L: 1432
			if (!var1) { // L: 1433
				this.method1269();
			}

		}
	} // L: 1434

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1378644789"
	)
	void method1269() {
		if (class233.field2486.field4569 >= 4) { // L: 1437
			this.error("js5crc"); // L: 1438
			ClanChannelMember.method3282(1000); // L: 1439
		} else {
			if (class233.field2486.field4570 >= 4) { // L: 1442
				if (gameState <= 5) { // L: 1443
					this.error("js5io"); // L: 1444
					ClanChannelMember.method3282(1000); // L: 1445
					return; // L: 1446
				}

				field537 = 3000; // L: 1449
				class233.field2486.field4570 = 3; // L: 1450
			}

			if (--field537 + 1 <= 0) { // L: 1453
				try {
					if (js5ConnectState == 0) { // L: 1455
						class27.js5SocketTask = GameEngine.taskHandler.method4173(class20.worldHost, class169.currentPort); // L: 1456
						++js5ConnectState; // L: 1457
					}

					if (js5ConnectState == 1) { // L: 1459
						if (class27.js5SocketTask.status == 2) { // L: 1460
							this.js5Error(-1); // L: 1461
							return; // L: 1462
						}

						if (class27.js5SocketTask.status == 1) { // L: 1464
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1466
						Socket var2 = (Socket)class27.js5SocketTask.result; // L: 1468
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1470
						class14.js5Socket = var1; // L: 1472
						Buffer var3;
						if (field508 >= 223) { // L: 1473
							var3 = new Buffer(class323.field3539.field3545 + 1); // L: 1474
							var3.writeByte(class323.field3539.field3536); // L: 1475
							var3.writeInt(223); // L: 1476
							var3.writeInt(field559[0]); // L: 1477
							var3.writeInt(field559[1]); // L: 1478
							var3.writeInt(field559[2]); // L: 1479
							var3.writeInt(field559[3]); // L: 1480
							class14.js5Socket.write(var3.array, 0, class323.field3539.field3545 + 1); // L: 1481
						} else {
							var3 = new Buffer(5); // L: 1484
							var3.writeByte(class323.field3539.field3536); // L: 1485
							var3.writeInt(223); // L: 1486
							class14.js5Socket.write(var3.array, 0, 5); // L: 1487
						}

						++js5ConnectState; // L: 1489
						class283.field3005 = WorldMapData_1.method4861(); // L: 1490
					}

					if (js5ConnectState == 3) { // L: 1492
						if (class14.js5Socket.vmethod8729() > 0) { // L: 1493
							int var4 = class14.js5Socket.vmethod8719(); // L: 1494
							if (var4 != 0) { // L: 1495
								this.js5Error(var4); // L: 1496
								return; // L: 1497
							}

							++js5ConnectState; // L: 1499
						} else if (WorldMapData_1.method4861() - class283.field3005 > 30000L) { // L: 1502
							this.js5Error(-2); // L: 1503
							return; // L: 1504
						}
					}

					if (js5ConnectState == 4) { // L: 1508
						class233.field2486.method7272(class14.js5Socket, gameState > 20); // L: 1509
						class27.js5SocketTask = null; // L: 1510
						class14.js5Socket = null; // L: 1511
						js5ConnectState = 0; // L: 1512
						js5Errors = 0; // L: 1513
					}
				} catch (IOException var5) { // L: 1516
					this.js5Error(-3); // L: 1517
				}

			}
		}
	} // L: 1440 1519

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2145273361"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class27.js5SocketTask = null; // L: 1522
		class14.js5Socket = null; // L: 1523
		js5ConnectState = 0; // L: 1524
		if (class169.currentPort == NPCComposition.worldPort) { // L: 1525
			class169.currentPort = class33.js5Port;
		} else {
			class169.currentPort = NPCComposition.worldPort; // L: 1526
		}

		++js5Errors; // L: 1527
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1528
			if (js5Errors >= 2 && var1 == 6) { // L: 1535
				this.error("js5connect_outofdate"); // L: 1536
				ClanChannelMember.method3282(1000); // L: 1537
			} else if (js5Errors >= 4) { // L: 1539
				if (gameState <= 5) { // L: 1540
					this.error("js5connect"); // L: 1541
					ClanChannelMember.method3282(1000); // L: 1542
				} else {
					field537 = 3000; // L: 1544
				}
			}
		} else if (gameState <= 5) { // L: 1529
			this.error("js5connect_full"); // L: 1530
			ClanChannelMember.method3282(1000); // L: 1531
		} else {
			field537 = 3000; // L: 1533
		}

	} // L: 1546

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 2139
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2140

		try {
			if (class68.field480 == class134.field1572) { // L: 2142
				if (class150.field1711 == null && (field558.isDone() || field539 > 250)) { // L: 2143
					class150.field1711 = field558.get(); // L: 2144
					field558.shutdown(); // L: 2145
					field558 = null; // L: 2146
				}

				if (class150.field1711 != null) { // L: 2148
					if (var1 != null) { // L: 2149
						((AbstractSocket)var1).close(); // L: 2150
						var1 = null; // L: 2151
					}

					class243.field2538 = null; // L: 2153
					hadNetworkError = false; // L: 2154
					field539 = 0; // L: 2155
					if (field676.method9855()) { // L: 2156
						if (this.method1830()) { // L: 2157
							try {
								this.requestOtlToken(class36.field227); // L: 2159
								KeyHandler.method434(class68.field491); // L: 2160
							} catch (Throwable var22) { // L: 2162
								FriendsChatManager.RunException_sendStackTrace((String)null, var22); // L: 2163
								TaskHandler.getLoginError(65); // L: 2164
								return; // L: 2165
							}
						} else {
							if (!this.method1259()) { // L: 2168
								TaskHandler.getLoginError(65); // L: 2180
								return; // L: 2181
							}

							try {
								this.method1263(Canvas.field103, class142.field1661); // L: 2170
								KeyHandler.method434(class68.field490); // L: 2171
							} catch (Exception var21) { // L: 2173
								FriendsChatManager.RunException_sendStackTrace((String)null, var21); // L: 2174
								TaskHandler.getLoginError(65); // L: 2175
								return; // L: 2176
							}
						}
					} else {
						KeyHandler.method434(class68.field469); // L: 2185
					}
				}
			}

			class20 var24;
			if (class134.field1572 == class68.field491) { // L: 2189
				if (this.field541 != null) { // L: 2190
					if (!this.field541.isDone()) { // L: 2191
						return; // L: 2192
					}

					if (this.field541.isCancelled()) { // L: 2194
						TaskHandler.getLoginError(65); // L: 2195
						this.field541 = null; // L: 2196
						return; // L: 2197
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field541.get(); // L: 2200
						if (!var3.isSuccess()) { // L: 2201
							TaskHandler.getLoginError(65); // L: 2202
							this.field541 = null; // L: 2203
							return; // L: 2204
						}

						class422.field4694 = var3.getAccessToken(); // L: 2206
						class36.field227 = var3.getRefreshToken(); // L: 2207
						this.field541 = null; // L: 2208
					} catch (Exception var20) { // L: 2210
						FriendsChatManager.RunException_sendStackTrace((String)null, var20); // L: 2211
						TaskHandler.getLoginError(65); // L: 2212
						this.field541 = null; // L: 2213
						return; // L: 2214
					}
				} else {
					if (this.field614 == null) { // L: 2217
						TaskHandler.getLoginError(65); // L: 2247
						return; // L: 2248
					}

					if (!this.field614.method278()) { // L: 2218
						return; // L: 2219
					}

					if (this.field614.method262()) { // L: 2221
						FriendsChatManager.RunException_sendStackTrace(this.field614.method267(), (Throwable)null); // L: 2222
						TaskHandler.getLoginError(65); // L: 2223
						this.field614 = null; // L: 2224
						return; // L: 2225
					}

					var24 = this.field614.method269(); // L: 2227
					if (var24.method288() != 200) { // L: 2228
						TaskHandler.getLoginError(65); // L: 2229
						this.field614 = null; // L: 2230
						return; // L: 2231
					}

					field539 = 0; // L: 2233
					class494 var4 = new class494(var24.method287()); // L: 2234

					try {
						class422.field4694 = var4.method8849().getString("access_token"); // L: 2236
						class36.field227 = var4.method8849().getString("refresh_token"); // L: 2237
					} catch (Exception var19) { // L: 2239
						FriendsChatManager.RunException_sendStackTrace("Error parsing tokens", var19); // L: 2240
						TaskHandler.getLoginError(65); // L: 2241
						this.field614 = null; // L: 2242
						return; // L: 2243
					}
				}

				this.method1262(class422.field4694); // L: 2250
				KeyHandler.method434(class68.field490); // L: 2251
			}

			if (class134.field1572 == class68.field490) { // L: 2253
				if (this.field710 != null) { // L: 2254
					if (!this.field710.isDone()) { // L: 2255
						return; // L: 2256
					}

					if (this.field710.isCancelled()) { // L: 2258
						TaskHandler.getLoginError(65); // L: 2259
						this.field710 = null; // L: 2260
						return; // L: 2261
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.field710.get(); // L: 2264
						if (!var25.isSuccess()) { // L: 2265
							TaskHandler.getLoginError(65); // L: 2266
							this.field710 = null; // L: 2267
							return; // L: 2268
						}

						this.field544 = var25.getToken(); // L: 2270
						this.field710 = null; // L: 2271
					} catch (Exception var18) { // L: 2273
						FriendsChatManager.RunException_sendStackTrace((String)null, var18); // L: 2274
						TaskHandler.getLoginError(65); // L: 2275
						this.field710 = null; // L: 2276
						return; // L: 2277
					}
				} else {
					if (this.field546 == null) { // L: 2280
						TaskHandler.getLoginError(65); // L: 2316
						return; // L: 2317
					}

					if (!this.field546.method278()) { // L: 2281
						return; // L: 2282
					}

					if (this.field546.method262()) { // L: 2284
						FriendsChatManager.RunException_sendStackTrace(this.field546.method267(), (Throwable)null); // L: 2285
						TaskHandler.getLoginError(65); // L: 2286
						this.field546 = null; // L: 2287
						return; // L: 2288
					}

					var24 = this.field546.method269(); // L: 2290
					if (var24.method288() != 200) { // L: 2291
						FriendsChatManager.RunException_sendStackTrace("Response code: " + var24.method288() + "Response body: " + var24.method287(), (Throwable)null); // L: 2292
						TaskHandler.getLoginError(65); // L: 2293
						this.field546 = null; // L: 2294
						return; // L: 2295
					}

					List var27 = (List)var24.method296().get("Content-Type"); // L: 2297
					if (var27 != null && var27.contains(class492.field5042.method8834())) { // L: 2298
						try {
							JSONObject var5 = new JSONObject(var24.method287()); // L: 2300
							this.field544 = var5.getString("token"); // L: 2301
						} catch (JSONException var17) { // L: 2303
							FriendsChatManager.RunException_sendStackTrace((String)null, var17); // L: 2304
							TaskHandler.getLoginError(65); // L: 2305
							this.field546 = null; // L: 2306
							return; // L: 2307
						}
					} else {
						this.field544 = var24.method287(); // L: 2311
					}

					this.field546 = null; // L: 2313
				}

				field539 = 0; // L: 2319
				KeyHandler.method434(class68.field469); // L: 2320
			}

			if (class134.field1572 == class68.field469) { // L: 2322
				if (class243.field2538 == null) { // L: 2323
					class243.field2538 = GameEngine.taskHandler.method4173(class20.worldHost, class169.currentPort); // L: 2324
				}

				if (class243.field2538.status == 2) { // L: 2326
					throw new IOException();
				}

				if (class243.field2538.status == 1) { // L: 2327
					Socket var29 = (Socket)class243.field2538.result; // L: 2329
					BufferedNetSocket var26 = new BufferedNetSocket(var29, 40000, 5000); // L: 2331
					var1 = var26; // L: 2333
					packetWriter.setSocket(var26); // L: 2334
					class243.field2538 = null; // L: 2335
					KeyHandler.method434(class68.field471); // L: 2336
				}
			}

			PacketBufferNode var28;
			if (class134.field1572 == class68.field471) { // L: 2339
				packetWriter.clearBuffer(); // L: 2340
				var28 = WorldMapRectangle.method4996(); // L: 2341
				var28.packetBuffer.writeByte(class323.field3544.field3536); // L: 2342
				packetWriter.addNode(var28); // L: 2343
				packetWriter.flush(); // L: 2344
				var2.offset = 0; // L: 2345
				KeyHandler.method434(class68.field472); // L: 2346
			}

			int var12;
			if (class68.field472 == class134.field1572) { // L: 2348
				if (Projectile.pcmPlayer1 != null) { // L: 2349
					Projectile.pcmPlayer1.method841();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2350
					var12 = ((AbstractSocket)var1).vmethod8719(); // L: 2351
					if (Projectile.pcmPlayer1 != null) { // L: 2352
						Projectile.pcmPlayer1.method841();
					}

					if (var12 != 0) { // L: 2353
						TaskHandler.getLoginError(var12); // L: 2354
						return; // L: 2355
					}

					var2.offset = 0; // L: 2357
					KeyHandler.method434(class68.field473); // L: 2358
				}
			}

			if (class68.field473 == class134.field1572) { // L: 2361
				if (var2.offset < 8) { // L: 2362
					var12 = ((AbstractSocket)var1).vmethod8729(); // L: 2363
					if (var12 > 8 - var2.offset) { // L: 2364
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) { // L: 2365
						((AbstractSocket)var1).read(var2.array, var2.offset, var12); // L: 2366
						var2.offset += var12; // L: 2367
					}
				}

				if (var2.offset == 8) { // L: 2370
					var2.offset = 0; // L: 2371
					class27.field127 = var2.readLong(); // L: 2372
					KeyHandler.method434(class68.field474); // L: 2373
				}
			}

			if (class68.field474 == class134.field1572) { // L: 2376
				packetWriter.packetBuffer.offset = 0; // L: 2377
				packetWriter.clearBuffer(); // L: 2378
				PacketBuffer var30 = new PacketBuffer(500); // L: 2379
				int[] var31 = new int[]{class150.field1711.nextInt(), class150.field1711.nextInt(), class150.field1711.nextInt(), class150.field1711.nextInt()}; // L: 2380 2381 2382 2383 2384
				var30.offset = 0; // L: 2385
				var30.writeByte(1); // L: 2386
				var30.writeInt(var31[0]); // L: 2387
				var30.writeInt(var31[1]); // L: 2388
				var30.writeInt(var31[2]); // L: 2389
				var30.writeInt(var31[3]); // L: 2390
				var30.writeLong(class27.field127); // L: 2391
				if (gameState == 40) { // L: 2392
					var30.writeInt(field559[0]); // L: 2393
					var30.writeInt(field559[1]); // L: 2394
					var30.writeInt(field559[2]); // L: 2395
					var30.writeInt(field559[3]); // L: 2396
				} else {
					if (gameState == 50) { // L: 2399
						var30.writeByte(class128.field1521.rsOrdinal()); // L: 2400
						var30.writeInt(class164.field1812); // L: 2401
					} else {
						var30.writeByte(field542.rsOrdinal()); // L: 2404
						switch(field542.field1522) { // L: 2405
						case 0:
							var30.writeInt(class105.clientPreferences.method2599(Login.Login_username)); // L: 2408
						case 1:
						default:
							break;
						case 2:
							var30.offset += 4; // L: 2413
							break; // L: 2414
						case 3:
						case 4:
							var30.method9542(class6.field20); // L: 2419
							++var30.offset; // L: 2420
						}
					}

					if (field676.method9855()) { // L: 2425
						var30.writeByte(class551.field5417.rsOrdinal()); // L: 2426
						var30.writeStringCp1252NullTerminated(this.field544); // L: 2427
					} else {
						var30.writeByte(class551.field5419.rsOrdinal()); // L: 2430
						var30.writeStringCp1252NullTerminated(Login.Login_password); // L: 2431
					}
				}

				var30.encryptRsa(class76.field913, class76.field912); // L: 2434
				field559 = var31; // L: 2435
				PacketBufferNode var32 = WorldMapRectangle.method4996(); // L: 2436
				var32.packetBuffer.offset = 0; // L: 2437
				if (gameState == 40) { // L: 2438
					var32.packetBuffer.writeByte(class323.field3537.field3536); // L: 2439
				} else {
					var32.packetBuffer.writeByte(class323.field3538.field3536); // L: 2442
				}

				var32.packetBuffer.writeShort(0); // L: 2444
				int var6 = var32.packetBuffer.offset; // L: 2445
				var32.packetBuffer.writeInt(223); // L: 2446
				var32.packetBuffer.writeInt(1); // L: 2447
				var32.packetBuffer.writeByte(clientType); // L: 2448
				var32.packetBuffer.writeByte(field506); // L: 2449
				byte var7 = 0; // L: 2450
				var32.packetBuffer.writeByte(var7); // L: 2451
				var32.packetBuffer.writeBytes(var30.array, 0, var30.offset); // L: 2452
				int var8 = var32.packetBuffer.offset; // L: 2453
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2454
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2455
				var32.packetBuffer.writeShort(class74.canvasWidth); // L: 2456
				var32.packetBuffer.writeShort(class1.canvasHeight); // L: 2457
				SoundSystem.method873(var32.packetBuffer); // L: 2458
				var32.packetBuffer.writeStringCp1252NullTerminated(class18.field81); // L: 2459
				var32.packetBuffer.writeInt(SpotAnimationDefinition.field2083); // L: 2460
				var32.packetBuffer.writeByte(0); // L: 2461
				Buffer var9 = new Buffer(KeyHandler.field140.method8934()); // L: 2462
				KeyHandler.field140.method8929(var9); // L: 2463
				var32.packetBuffer.writeBytes(var9.array, 0, var9.array.length); // L: 2464
				var32.packetBuffer.writeByte(clientType); // L: 2465
				var32.packetBuffer.writeInt(0); // L: 2466
				if (class4.field9) { // L: 2467
					var32.packetBuffer.writeInt(class199.field2100.hash); // L: 2469
					var32.packetBuffer.writeIntME(class239.field2524.hash); // L: 2470
					var32.packetBuffer.method9611(ChatChannel.archive13.hash); // L: 2471
					var32.packetBuffer.method9611(class7.field29.hash); // L: 2472
					var32.packetBuffer.method9611(WorldMapSection1.field2728.hash); // L: 2473
					var32.packetBuffer.method9609(class424.archive4.hash); // L: 2474
					var32.packetBuffer.method9609(class276.field2872.hash); // L: 2475
				} else {
					var32.packetBuffer.writeInt(class239.field2524.hash); // L: 2480
					var32.packetBuffer.method9609(ChatChannel.archive13.hash); // L: 2481
					var32.packetBuffer.method9609(class157.field1756.hash); // L: 2482
					var32.packetBuffer.writeIntME(class498.field5069.hash); // L: 2483
					var32.packetBuffer.writeInt(class424.archive4.hash); // L: 2484
					var32.packetBuffer.writeIntME(PlayerComposition.field3785.hash); // L: 2485
					var32.packetBuffer.writeIntME(class145.field1684.hash); // L: 2486
					var32.packetBuffer.method9609(0); // L: 2487
					var32.packetBuffer.writeInt(ApproximateRouteStrategy.archive2.hash); // L: 2488
					var32.packetBuffer.method9611(class476.archive12.hash); // L: 2489
					var32.packetBuffer.writeInt(class151.field1715.hash); // L: 2490
					var32.packetBuffer.writeInt(VarpDefinition.field1881.hash); // L: 2491
					var32.packetBuffer.writeInt(WorldMapSectionType.field2665.hash); // L: 2492
					var32.packetBuffer.writeInt(class199.field2100.hash); // L: 2493
					var32.packetBuffer.method9611(class276.field2872.hash); // L: 2494
					var32.packetBuffer.method9609(class388.field4545.hash); // L: 2495
					var32.packetBuffer.method9609(LoginScreenAnimation.field1296.hash); // L: 2496
					var32.packetBuffer.method9611(class68.field497.hash); // L: 2497
					var32.packetBuffer.writeIntME(class195.field2052.hash); // L: 2498
					var32.packetBuffer.writeIntME(WorldMapSection1.field2728.hash); // L: 2499
					var32.packetBuffer.method9609(class7.field29.hash); // L: 2500
				}

				var32.packetBuffer.xteaEncrypt(var31, var8, var32.packetBuffer.offset); // L: 2503
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset - var6); // L: 2504
				packetWriter.addNode(var32); // L: 2505
				packetWriter.flush(); // L: 2506
				packetWriter.isaacCipher = new IsaacCipher(var31); // L: 2507
				int[] var10 = new int[4]; // L: 2508

				for (int var11 = 0; var11 < 4; ++var11) { // L: 2509
					var10[var11] = var31[var11] + 50;
				}

				var2.newIsaacCipher(var10); // L: 2510
				KeyHandler.method434(class68.field496); // L: 2511
			}

			int var13;
			if (class134.field1572 == class68.field496 && ((AbstractSocket)var1).vmethod8729() > 0) { // L: 2513 2514
				var12 = ((AbstractSocket)var1).vmethod8719(); // L: 2515
				if (var12 == 61) { // L: 2516
					var13 = ((AbstractSocket)var1).vmethod8729(); // L: 2517
					UserComparator3.field1501 = var13 == 1 && ((AbstractSocket)var1).vmethod8719() == 1; // L: 2518
					KeyHandler.method434(class68.field474); // L: 2519
				}

				if (var12 == 21 && gameState == 20) { // L: 2521
					KeyHandler.method434(class68.field481); // L: 2522
				} else if (var12 == 2) { // L: 2524
					if (class4.field9) { // L: 2525
						KeyHandler.method434(class68.field492); // L: 2526
					} else {
						KeyHandler.method434(class68.field478); // L: 2529
					}
				} else if (var12 == 15 && gameState == 40) { // L: 2532
					packetWriter.serverPacketLength = -1; // L: 2533
					KeyHandler.method434(class68.field489); // L: 2534
				} else if (var12 == 64) { // L: 2536
					KeyHandler.method434(class68.field479); // L: 2537
				} else if (var12 == 23 && field560 < 1) { // L: 2539
					++field560; // L: 2540
					KeyHandler.method434(class68.field480); // L: 2541
				} else if (var12 == 29) { // L: 2543
					KeyHandler.method434(class68.field475); // L: 2544
				} else {
					if (var12 != 69) { // L: 2546
						TaskHandler.getLoginError(var12); // L: 2550
						return; // L: 2551
					}

					KeyHandler.method434(class68.field476); // L: 2547
				}
			}

			if (class68.field492 == class134.field1572) { // L: 2555
				FloorUnderlayDefinition.field2095 = true; // L: 2556
				UserComparator7.method3008(class94.field1148); // L: 2557
				ClanChannelMember.method3282(0); // L: 2558
			}

			if (class68.field476 == class134.field1572 && ((AbstractSocket)var1).vmethod8729() >= 2) { // L: 2560 2561
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2562
				var2.offset = 0; // L: 2563
				SpotAnimationDefinition.field2084 = var2.readUnsignedShort(); // L: 2564
				KeyHandler.method434(class68.field487); // L: 2565
			}

			if (class134.field1572 == class68.field487 && ((AbstractSocket)var1).vmethod8729() >= SpotAnimationDefinition.field2084) { // L: 2568 2569
				var2.offset = 0; // L: 2570
				((AbstractSocket)var1).read(var2.array, var2.offset, SpotAnimationDefinition.field2084); // L: 2571
				class6[] var33 = new class6[]{class6.field19}; // L: 2574
				class6 var34 = var33[var2.readUnsignedByte()]; // L: 2576

				try {
					switch(var34.field17) { // L: 2580
					case 0:
						class0 var35 = new class0(); // L: 2587
						this.field561 = new class7(var2, var35); // L: 2593
						KeyHandler.method434(class68.field470); // L: 2594
						break;
					default:
						throw new IllegalArgumentException(); // L: 2583
					}
				} catch (Exception var16) { // L: 2596
					TaskHandler.getLoginError(22); // L: 2597
					return; // L: 2598
				}
			}

			if (class134.field1572 == class68.field470 && this.field561.method42()) { // L: 2602 2603
				this.field533 = this.field561.method44(); // L: 2604
				this.field561.method43(); // L: 2605
				this.field561 = null; // L: 2606
				if (this.field533 == null) { // L: 2607
					TaskHandler.getLoginError(22); // L: 2608
					return; // L: 2609
				}

				packetWriter.clearBuffer(); // L: 2611
				var28 = WorldMapRectangle.method4996(); // L: 2612
				var28.packetBuffer.writeByte(class323.field3540.field3536); // L: 2613
				var28.packetBuffer.writeShort(this.field533.offset); // L: 2614
				var28.packetBuffer.method9787(this.field533); // L: 2615
				packetWriter.addNode(var28); // L: 2616
				packetWriter.flush(); // L: 2617
				this.field533 = null; // L: 2618
				KeyHandler.method434(class68.field496); // L: 2619
			}

			if (class134.field1572 == class68.field479 && ((AbstractSocket)var1).vmethod8729() > 0) { // L: 2622 2623
				class68.field477 = ((AbstractSocket)var1).vmethod8719(); // L: 2624
				KeyHandler.method434(class68.field488); // L: 2625
			}

			if (class134.field1572 == class68.field488 && ((AbstractSocket)var1).vmethod8729() >= class68.field477) { // L: 2628 2629
				((AbstractSocket)var1).read(var2.array, 0, class68.field477); // L: 2630
				var2.offset = 0; // L: 2631
				KeyHandler.method434(class68.field496); // L: 2632
			}

			if (class134.field1572 == class68.field481 && ((AbstractSocket)var1).vmethod8729() > 0) { // L: 2635 2636
				field708 = (((AbstractSocket)var1).vmethod8719() + 3) * 60; // L: 2637
				KeyHandler.method434(class68.field482); // L: 2638
			}

			if (class134.field1572 == class68.field482) { // L: 2641
				field539 = 0; // L: 2642
				VerticalAlignment.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field708 / 60 + " seconds."); // L: 2643
				if (--field708 <= 0) { // L: 2644
					KeyHandler.method434(class68.field480);
				}

			} else if (class134.field1572 == class68.field493) { // L: 2647
				var28 = WorldMapRectangle.method4996(); // L: 2648
				var28.packetBuffer.writeByte(class323.field3541.field3536); // L: 2649
				var28.packetBuffer.writeShort(class323.field3541.field3545); // L: 2650
				VertexNormal.method5914(var28); // L: 2651
				packetWriter.addNode(var28); // L: 2652
				packetWriter.flush(); // L: 2653
				KeyHandler.method434(class68.field478); // L: 2654
			} else {
				if (class68.field478 == class134.field1572 && ((AbstractSocket)var1).vmethod8729() >= 1) { // L: 2657 2658
					ModeWhere.field4640 = ((AbstractSocket)var1).vmethod8719(); // L: 2659
					if (ModeWhere.field4640 != class323.field3542.field3545) { // L: 2660
						TaskHandler.getLoginError(ModeWhere.field4640); // L: 2661
						return; // L: 2662
					}

					KeyHandler.method434(class68.field484); // L: 2664
				}

				if (class68.field484 == class134.field1572 && ((AbstractSocket)var1).vmethod8729() >= ModeWhere.field4640) { // L: 2667 2668
					boolean var42 = ((AbstractSocket)var1).vmethod8719() == 1; // L: 2669
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2670
					var2.offset = 0; // L: 2671
					boolean var41 = false; // L: 2672
					if (var42) { // L: 2673
						var13 = var2.readByteIsaac() << 24; // L: 2674
						var13 |= var2.readByteIsaac() << 16; // L: 2675
						var13 |= var2.readByteIsaac() << 8; // L: 2676
						var13 |= var2.readByteIsaac(); // L: 2677
						class105.clientPreferences.method2597(Login.Login_username, var13); // L: 2678
					}

					if (Login_isUsernameRemembered) { // L: 2680
						class105.clientPreferences.method2591(Login.Login_username); // L: 2681
					} else {
						class105.clientPreferences.method2591((String)null); // L: 2684
					}

					class133.savePreferences(); // L: 2686
					staffModLevel = ((AbstractSocket)var1).vmethod8719(); // L: 2687
					playerMod = ((AbstractSocket)var1).vmethod8719() == 1; // L: 2688
					field706 = ((AbstractSocket)var1).vmethod8719(); // L: 2689
					field706 <<= 8; // L: 2690
					field706 += ((AbstractSocket)var1).vmethod8719(); // L: 2691
					field628 = ((AbstractSocket)var1).vmethod8719(); // L: 2692
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2693
					var2.offset = 0; // L: 2694
					this.accountHash = var2.readLong(); // L: 2695
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2696
					var2.offset = 0; // L: 2697
					field629 = var2.readLong(); // L: 2698
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2699
					var2.offset = 0; // L: 2700
					field630 = var2.readLong(); // L: 2701
					class433.method8077().method4268(this.field549); // L: 2702
					KeyHandler.method434(class68.field485); // L: 2703
				}

				if (class68.field485 == class134.field1572 && ((AbstractSocket)var1).vmethod8729() >= packetWriter.serverPacketLength) { // L: 2706 2707
					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2708
					var2.offset = 0; // L: 2709
					if (var2.method9504()) { // L: 2710
						((AbstractSocket)var1).read(var2.array, 1, 1); // L: 2711
						var2.offset = 0; // L: 2712
					}

					ServerPacket[] var37 = class150.method3287(); // L: 2714
					var13 = var2.readSmartByteShortIsaac(); // L: 2715
					if (var13 < 0 || var13 >= var37.length) { // L: 2716
						throw new IOException("Invalid ServerProt: " + var13 + " at " + var2.offset); // L: 2717
					}

					packetWriter.serverPacket = var37[var13]; // L: 2719
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2720
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2721
					var2.offset = 0; // L: 2722
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2723

					try {
						Client var38 = class415.client; // L: 2725
						JSObject.getWindow(var38).call("zap", (Object[])null); // L: 2728
					} catch (Throwable var15) { // L: 2731
					}

					KeyHandler.method434(class68.field486); // L: 2732
				}

				if (class134.field1572 == class68.field486) { // L: 2735
					if (((AbstractSocket)var1).vmethod8729() >= packetWriter.serverPacketLength) { // L: 2736
						var2.offset = 0; // L: 2737
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2738
						timer.method8331(); // L: 2739
						WorldMapElement.method3595(); // L: 2740
						class511.field5137.field1319.method2820(var2, true); // L: 2741
						StudioGame.field4084 = SoundCache.localPlayer; // L: 2742
						Skeleton.field2915 = -1; // L: 2743
						class325.loadRegions(false, var2); // L: 2744
						packetWriter.serverPacket = null; // L: 2745
						field675 = false; // L: 2746
					}

				} else {
					if (class134.field1572 == class68.field475 && ((AbstractSocket)var1).vmethod8729() >= 2) { // L: 2750 2751
						var2.offset = 0; // L: 2752
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2753
						var2.offset = 0; // L: 2754
						class159.field1789 = var2.readUnsignedShort(); // L: 2755
						KeyHandler.method434(class68.field483); // L: 2756
					}

					if (class68.field483 == class134.field1572 && ((AbstractSocket)var1).vmethod8729() >= class159.field1789) { // L: 2759 2760
						var2.offset = 0; // L: 2761
						((AbstractSocket)var1).read(var2.array, 0, class159.field1789); // L: 2762
						var2.offset = 0; // L: 2763
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2764
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2765
						String var40 = var2.readStringCp1252NullTerminated(); // L: 2766
						VerticalAlignment.setLoginResponseString(var39, var36, var40); // L: 2767
						ClanChannelMember.method3282(10); // L: 2768
						if (field676.method9855()) { // L: 2769
							class163.method3447(9); // L: 2770
						}
					}

					if (class134.field1572 != class68.field489) { // L: 2774
						++field539; // L: 2816
						if (field539 > 2000) { // L: 2817
							if (field560 < 1) { // L: 2818
								if (NPCComposition.worldPort == class169.currentPort) { // L: 2819
									class169.currentPort = class33.js5Port;
								} else {
									class169.currentPort = NPCComposition.worldPort; // L: 2820
								}

								++field560; // L: 2821
								KeyHandler.method434(class68.field480); // L: 2822
							} else {
								TaskHandler.getLoginError(-3); // L: 2825
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) { // L: 2775
							if (((AbstractSocket)var1).vmethod8729() < 2) { // L: 2776
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2777
							var2.offset = 0; // L: 2778
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2779
						}

						if (((AbstractSocket)var1).vmethod8729() >= packetWriter.serverPacketLength) { // L: 2781
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2782
							var2.offset = 0; // L: 2783
							var12 = packetWriter.serverPacketLength; // L: 2784
							timer.method8333(); // L: 2785
							packetWriter.clearBuffer(); // L: 2787
							packetWriter.packetBuffer.offset = 0; // L: 2788
							packetWriter.serverPacket = null; // L: 2789
							packetWriter.field1462 = null; // L: 2790
							packetWriter.field1459 = null; // L: 2791
							packetWriter.field1464 = null; // L: 2792
							packetWriter.serverPacketLength = 0; // L: 2793
							packetWriter.field1457 = 0; // L: 2794
							rebootTimer = 0; // L: 2795
							menuOptionsCount = 0; // L: 2797
							isMenuOpen = false; // L: 2798
							minimapState = 0; // L: 2800
							field752 = 0; // L: 2801
							class511.field5137.method2680(); // L: 2802
							ItemContainer.itemContainers = new NodeHashTable(32); // L: 2804
							ClanChannelMember.method3282(30); // L: 2806

							for (var13 = 0; var13 < 100; ++var13) { // L: 2807
								field721[var13] = true;
							}

							class333.method6367(); // L: 2808
							class511.field5137.field1319.method2820(var2, true); // L: 2810
							if (var12 != var2.offset) { // L: 2811
								throw new RuntimeException(); // L: 2812
							}
						}
					}
				}
			}
		} catch (IOException var23) { // L: 2829
			if (field560 < 1) { // L: 2830
				if (class169.currentPort == NPCComposition.worldPort) { // L: 2831
					class169.currentPort = class33.js5Port;
				} else {
					class169.currentPort = NPCComposition.worldPort; // L: 2832
				}

				++field560; // L: 2833
				KeyHandler.method434(class68.field480); // L: 2834
			} else {
				TaskHandler.getLoginError(-2); // L: 2837
			}
		}
	} // L: 2645 2655 2748 2814 2823 2826 2835 2838 2840

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "657801425"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3276
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3277
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3278
			hadNetworkError = false; // L: 3279
			class131.method3068(); // L: 3280
		} else {
			if (!isMenuOpen) { // L: 3283
				SoundSystem.method869();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1279(packetWriter); ++var1) { // L: 3284 3285
			}

			if (gameState == 30) { // L: 3287
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 3291
					boolean var40;
					if (var2 == null) { // L: 3292
						var40 = false; // L: 3293
					} else {
						var40 = true; // L: 3296
					}

					int var3;
					PacketBufferNode var41;
					if (!var40) { // L: 3298
						PacketBufferNode var18;
						int var19;
						if (timer.field4859) { // L: 3306
							var18 = class170.getPacketBufferNode(ClientPacket.field3320, packetWriter.isaacCipher); // L: 3308
							var18.packetBuffer.writeByte(0); // L: 3309
							var19 = var18.packetBuffer.offset; // L: 3310
							timer.write(var18.packetBuffer); // L: 3311
							var18.packetBuffer.method9605(var18.packetBuffer.offset - var19); // L: 3312
							packetWriter.addNode(var18); // L: 3313
							timer.method8332(); // L: 3314
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						synchronized(mouseRecorder.lock) { // L: 3317
							if (!field602) { // L: 3318
								mouseRecorder.index = 0; // L: 3404
							} else if (MouseHandler.MouseHandler_lastButton != 0 || mouseRecorder.index >= 40) { // L: 3319
								var41 = null; // L: 3321
								var3 = 0; // L: 3322
								var4 = 0; // L: 3323
								var5 = 0; // L: 3324
								var6 = 0; // L: 3325

								for (var7 = 0; var7 < mouseRecorder.index && (var41 == null || var41.packetBuffer.offset - var3 < 246); ++var7) { // L: 3326 3327
									var4 = var7; // L: 3328
									var8 = mouseRecorder.ys[var7]; // L: 3329
									if (var8 < -1) { // L: 3330
										var8 = -1;
									} else if (var8 > 65534) { // L: 3331
										var8 = 65534;
									}

									var9 = mouseRecorder.xs[var7]; // L: 3332
									if (var9 < -1) { // L: 3333
										var9 = -1;
									} else if (var9 > 65534) { // L: 3334
										var9 = 65534;
									}

									if (var9 != field519 || var8 != field807) { // L: 3335
										if (var41 == null) { // L: 3338
											var41 = class170.getPacketBufferNode(ClientPacket.field3314, packetWriter.isaacCipher); // L: 3339
											var41.packetBuffer.writeByte(0); // L: 3340
											var3 = var41.packetBuffer.offset; // L: 3341
											PacketBuffer var10000 = var41.packetBuffer; // L: 3342
											var10000.offset += 2;
											var5 = 0; // L: 3343
											var6 = 0; // L: 3344
										}

										if (-1L != field521) { // L: 3349
											var10 = var9 - field519; // L: 3350
											var11 = var8 - field807; // L: 3351
											var12 = (int)((mouseRecorder.millis[var7] - field521) / 20L); // L: 3352
											var5 = (int)((long)var5 + (mouseRecorder.millis[var7] - field521) % 20L); // L: 3353
										} else {
											var10 = var9; // L: 3356
											var11 = var8; // L: 3357
											var12 = Integer.MAX_VALUE; // L: 3358
										}

										field519 = var9; // L: 3360
										field807 = var8; // L: 3361
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3362
											var10 += 32; // L: 3363
											var11 += 32; // L: 3364
											var41.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3365
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3367
											var10 += 128; // L: 3368
											var11 += 128; // L: 3369
											var41.packetBuffer.writeByte(var12 + 128); // L: 3370
											var41.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3371
										} else if (var12 < 32) { // L: 3373
											var41.packetBuffer.writeByte(var12 + 192); // L: 3374
											if (var9 != -1 && var8 != -1) { // L: 3375
												var41.packetBuffer.writeInt(var9 | var8 << 16); // L: 3376
											} else {
												var41.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var41.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3379
											if (var9 != -1 && var8 != -1) { // L: 3380
												var41.packetBuffer.writeInt(var9 | var8 << 16); // L: 3381
											} else {
												var41.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3383
										field521 = mouseRecorder.millis[var7]; // L: 3384
									}
								}

								if (var41 != null) { // L: 3386
									var41.packetBuffer.method9605(var41.packetBuffer.offset - var3); // L: 3387
									var7 = var41.packetBuffer.offset; // L: 3388
									var41.packetBuffer.offset = var3; // L: 3389
									var41.packetBuffer.writeByte(var5 / var6); // L: 3390
									var41.packetBuffer.writeByte(var5 % var6); // L: 3391
									var41.packetBuffer.offset = var7; // L: 3392
									packetWriter.addNode(var41); // L: 3393
								}

								if (var4 >= mouseRecorder.index) { // L: 3395
									mouseRecorder.index = 0;
								} else {
									MouseRecorder var64 = mouseRecorder; // L: 3397
									var64.index -= var4;
									System.arraycopy(mouseRecorder.xs, var4, mouseRecorder.xs, 0, mouseRecorder.index); // L: 3398
									System.arraycopy(mouseRecorder.ys, var4, mouseRecorder.ys, 0, mouseRecorder.index); // L: 3399
									System.arraycopy(mouseRecorder.millis, var4, mouseRecorder.millis, 0, mouseRecorder.index); // L: 3400
								}
							}
						}

						if (MouseHandler.MouseHandler_lastButton == 1 || !World.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3406
							long var20 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3407
							if (var20 > 32767L) { // L: 3408
								var20 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3409
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3410
							if (var3 < 0) { // L: 3411
								var3 = 0;
							} else if (var3 > class1.canvasHeight) { // L: 3412
								var3 = class1.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3413
							if (var4 < 0) { // L: 3414
								var4 = 0;
							} else if (var4 > class74.canvasWidth) { // L: 3415
								var4 = class74.canvasWidth;
							}

							var5 = (int)var20; // L: 3416
							PacketBufferNode var22 = class170.getPacketBufferNode(ClientPacket.field3296, packetWriter.isaacCipher); // L: 3417
							var22.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3418
							var22.packetBuffer.writeShort(var4); // L: 3419
							var22.packetBuffer.writeShort(var3); // L: 3420
							packetWriter.addNode(var22); // L: 3421
						}

						if (mouseWheelRotation != 0) { // L: 3423
							var18 = class170.getPacketBufferNode(ClientPacket.field3357, packetWriter.isaacCipher); // L: 3424
							var18.packetBuffer.writeShort(mouseWheelRotation); // L: 3425
							packetWriter.addNode(var18); // L: 3426
						}

						if (field728.field2450 > 0) { // L: 3428
							var18 = class170.getPacketBufferNode(ClientPacket.field3279, packetWriter.isaacCipher); // L: 3429
							var18.packetBuffer.writeShort(0); // L: 3430
							var19 = var18.packetBuffer.offset; // L: 3431
							long var23 = WorldMapData_1.method4861(); // L: 3432

							for (var5 = 0; var5 < field728.field2450; ++var5) { // L: 3433
								long var25 = var23 - field744; // L: 3434
								if (var25 > 16777215L) { // L: 3435
									var25 = 16777215L;
								}

								field744 = var23; // L: 3436
								var18.packetBuffer.method9756(field728.field2457[var5]); // L: 3437
								var18.packetBuffer.method9542((int)var25); // L: 3438
							}

							var18.packetBuffer.writeLengthShort(var18.packetBuffer.offset - var19); // L: 3440
							packetWriter.addNode(var18); // L: 3441
						}

						if (field650 > 0) { // L: 3443
							--field650;
						}

						if (field728.method4384(96) || field728.method4384(97) || field728.method4384(98) || field728.method4384(99)) { // L: 3444
							field604 = true; // L: 3445
						}

						if (field604 && field650 <= 0) { // L: 3447
							field650 = 20; // L: 3448
							field604 = false; // L: 3449
							var18 = class170.getPacketBufferNode(ClientPacket.field3364, packetWriter.isaacCipher); // L: 3451
							var18.packetBuffer.method9597(camAngleY); // L: 3452
							var18.packetBuffer.method9767(camAngleX); // L: 3453
							packetWriter.addNode(var18); // L: 3454
						}

						if (class498.hasFocus && !field522) { // L: 3456
							field522 = true; // L: 3457
							var18 = class170.getPacketBufferNode(ClientPacket.field3353, packetWriter.isaacCipher); // L: 3459
							var18.packetBuffer.writeByte(1); // L: 3460
							packetWriter.addNode(var18); // L: 3461
						}

						if (!class498.hasFocus && field522) { // L: 3463
							field522 = false; // L: 3464
							var18 = class170.getPacketBufferNode(ClientPacket.field3353, packetWriter.isaacCipher); // L: 3466
							var18.packetBuffer.writeByte(0); // L: 3467
							packetWriter.addNode(var18); // L: 3468
						}

						if (VertexNormal.worldMap != null) { // L: 3471
							VertexNormal.worldMap.method9001();
						}

						Language.method7420(); // L: 3472
						WorldMapSectionType.method4962(); // L: 3473
						if (field632 != class511.field5137.field1318) { // L: 3475
							field632 = class511.field5137.field1318; // L: 3476
							var1 = class511.field5137.field1318; // L: 3477
							int[] var42 = class196.field2057.pixels; // L: 3479
							var3 = var42.length; // L: 3480

							for (var4 = 0; var4 < var3; ++var4) { // L: 3481
								var42[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) { // L: 3482
								var5 = (103 - var4) * 2048 + 24628; // L: 3483

								for (var6 = 1; var6 < 103; ++var6) { // L: 3484
									if ((class511.field5137.field1325[var1][var6][var4] & 24) == 0) { // L: 3485
										class511.field5137.field1316.method5426(var42, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (class511.field5137.field1325[var1 + 1][var6][var4] & 8) != 0) { // L: 3486
										class511.field5137.field1316.method5426(var42, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4; // L: 3487
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3490
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3491
							class196.field2057.setRaster(); // L: 3492

							for (var6 = 1; var6 < 103; ++var6) { // L: 3493
								for (var7 = 1; var7 < 103; ++var7) { // L: 3494
									if ((class511.field5137.field1325[var1][var7][var6] & 24) == 0) { // L: 3495
										MusicPatchNode.method6426(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (class511.field5137.field1325[var1 + 1][var7][var6] & 8) != 0) { // L: 3496
										MusicPatchNode.method6426(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							field512 = 0; // L: 3499

							for (var6 = 0; var6 < 104; ++var6) { // L: 3500
								for (var7 = 0; var7 < 104; ++var7) { // L: 3501
									long var27 = class511.field5137.field1316.method5546(class511.field5137.field1318, var6, var7); // L: 3502
									if (0L != var27) { // L: 3503
										var10 = class229.Entity_unpackID(var27); // L: 3504
										var11 = class10.getObjectDefinition(var10).mapIconId; // L: 3505
										if (var11 >= 0 && class165.WorldMapElement_get(var11).field1900) { // L: 3506 3507
											field554[field512] = class165.WorldMapElement_get(var11).getSpriteBool(false); // L: 3510
											field749[field512] = var6; // L: 3511
											field750[field512] = var7; // L: 3512
											++field512; // L: 3513
										}
									}
								}
							}

							class434.rasterProvider.apply(); // L: 3519
						}

						if (gameState != 30) { // L: 3524
							return;
						}

						NPCComposition.method3756(class511.field5137); // L: 3525
						class327.method6128(); // L: 3526
						++packetWriter.field1457; // L: 3527
						if (packetWriter.field1457 > 750) { // L: 3528
							class131.method3068(); // L: 3529
							return; // L: 3530
						}

						SoundCache.method895(class511.field5137); // L: 3532
						class101 var49 = class511.field5137; // L: 3533

						for (var19 = 0; var19 < var49.field1329; ++var19) { // L: 3535
							var3 = var49.field1330[var19]; // L: 3536
							class103 var29 = var49.field1315[var3]; // L: 3537
							if (var29 != null) { // L: 3538
								class230.method4373(var49, var29, var29.field1347.size); // L: 3539
							}
						}

						class101 var43 = class511.field5137; // L: 3543

						for (var3 = 0; var3 < var43.field1322; ++var3) { // L: 3545
							var4 = var43.field1333[var3]; // L: 3546
							class476 var30 = var43.field1331[var4]; // L: 3547
							if (var30 != null) { // L: 3548
								var30.method8673(); // L: 3549
							}
						}

						class136.method3174(class511.field5137); // L: 3553

						for (var3 = 0; var3 < class511.field5137.field1322; ++var3) { // L: 3554
							class476 var52 = class511.field5137.field1331[class511.field5137.field1333[var3]]; // L: 3555
							if (var52 != null) { // L: 3556
								NPCComposition.method3756(var52.field4971); // L: 3557
								SoundCache.method895(var52.field4971); // L: 3558
								class101 var54 = var52.field4971; // L: 3559

								for (var6 = 0; var6 < var54.field1329; ++var6) { // L: 3561
									var7 = var54.field1330[var6]; // L: 3562
									class103 var31 = var54.field1315[var7]; // L: 3563
									if (var31 != null) { // L: 3564
										class230.method4373(var54, var31, var31.field1347.size); // L: 3565
									}
								}

								class136.method3174(var52.field4971); // L: 3569
							}
						}

						++field805; // L: 3571
						if (field674 != 0) { // L: 3572
							field622 = field622 * 400 + 20; // L: 3573
							if (field622 * 400 >= 400) { // L: 3574
								field674 = 0;
							}
						}

						Widget var32 = class180.mousedOverWidgetIf1; // L: 3576
						Widget var53 = GrandExchangeOfferOwnWorldComparator.field466; // L: 3577
						class180.mousedOverWidgetIf1 = null; // L: 3578
						GrandExchangeOfferOwnWorldComparator.field466 = null; // L: 3579
						draggedOnWidget = null; // L: 3580
						field691 = false; // L: 3581
						field688 = false; // L: 3582
						field741 = 0; // L: 3583

						while (field728.method4382() && field741 < 128) { // L: 3584
							if (staffModLevel >= 2 && field728.method4384(82) && field728.field2460 == 66) { // L: 3585
								String var55 = Messages.method2917(); // L: 3586
								class415.client.method556(var55); // L: 3587
							} else if (oculusOrbState != 1 || field728.field2459 <= 0) { // L: 3590
								field592[field741] = field728.field2460; // L: 3593
								field742[field741] = field728.field2459; // L: 3594
								++field741; // L: 3595
							}
						}

						if (BuddyRankComparator.method3038() && field728.method4384(82) && field728.method4384(81) && mouseWheelRotation != 0) { // L: 3597
							var5 = SoundCache.localPlayer.plane - mouseWheelRotation; // L: 3598
							if (var5 < 0) { // L: 3599
								var5 = 0;
							} else if (var5 > 3) { // L: 3600
								var5 = 3;
							}

							if (var5 != SoundCache.localPlayer.plane) { // L: 3601
								class103.method2713(SoundCache.localPlayer.field1204[0] + class511.field5137.field1321, SoundCache.localPlayer.field1246[0] + class511.field5137.field1323, var5, false); // L: 3602
							}

							mouseWheelRotation = 0; // L: 3604
						}

						if (rootInterface != -1) { // L: 3606
							class60.method1180(rootInterface, 0, 0, class74.canvasWidth, class1.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3607

						while (true) {
							Widget var33;
							Widget var50;
							ScriptEvent var56;
							do {
								var56 = (ScriptEvent)field715.removeLast(); // L: 3609
								if (var56 == null) { // L: 3610
									while (true) {
										do {
											var56 = (ScriptEvent)field716.removeLast(); // L: 3621
											if (var56 == null) { // L: 3622
												while (true) {
													do {
														var56 = (ScriptEvent)scriptEvents.removeLast(); // L: 3633
														if (var56 == null) { // L: 3634
															boolean var44 = false; // L: 3644

															while (true) {
																class230 var51 = (class230)field717.removeLast(); // L: 3646
																if (var51 == null) { // L: 3647
																	if (!var44 && MouseHandler.MouseHandler_lastButton == 1) { // L: 3704
																		field740.method4349(); // L: 3705
																	}

																	this.menu(); // L: 3707
																	GrandExchangeOfferOwnWorldComparator.method1227(); // L: 3708
																	if (clickedWidget != null) { // L: 3709
																		this.method1285();
																	}

																	boolean var46 = false; // L: 3710

																	for (var7 = 0; var7 < class511.field5137.field1322; ++var7) { // L: 3711
																		class476 var57 = class511.field5137.field1331[class511.field5137.field1333[var7]]; // L: 3712
																		class101 var58 = var57.field4971; // L: 3713
																		class282 var62 = var58.field1316; // L: 3714
																		if (var57 != null && var62.method5617()) { // L: 3715
																			if (!var46) { // L: 3716
																				var11 = var62.field2934; // L: 3717
																				var12 = var62.field2967; // L: 3718
																				PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.field3290, packetWriter.isaacCipher); // L: 3720
																				var13.packetBuffer.writeByte(5); // L: 3721
																				var13.packetBuffer.method9741(var12 + var58.field1323); // L: 3722
																				var13.packetBuffer.writeByte(field728.method4384(82) ? (field728.method4384(81) ? 2 : 1) : 0); // L: 3723
																				var13.packetBuffer.method9597(var11 + var58.field1321); // L: 3724
																				packetWriter.addNode(var13); // L: 3725
																				var46 = true; // L: 3726
																				field525 = MouseHandler.MouseHandler_lastPressedX; // L: 3727
																				field621 = MouseHandler.MouseHandler_lastPressedY; // L: 3728
																				field674 = 1; // L: 3729
																				field622 = 0; // L: 3730
																				field752 = var11; // L: 3731
																				field753 = var12; // L: 3732
																			}

																			var62.method5531(); // L: 3734
																		}
																	}

																	PacketBufferNode var60;
																	if (!var46 && class511.field5137.field1316.method5617()) { // L: 3736
																		var7 = class511.field5137.field1316.field2934; // L: 3737
																		var8 = class511.field5137.field1316.field2967; // L: 3738
																		var60 = class170.getPacketBufferNode(ClientPacket.field3290, packetWriter.isaacCipher); // L: 3740
																		var60.packetBuffer.writeByte(5); // L: 3741
																		var60.packetBuffer.method9741(var8 + class511.field5137.field1323); // L: 3742
																		var60.packetBuffer.writeByte(field728.method4384(82) ? (field728.method4384(81) ? 2 : 1) : 0); // L: 3743
																		var60.packetBuffer.method9597(var7 + class511.field5137.field1321); // L: 3744
																		packetWriter.addNode(var60); // L: 3745
																		class511.field5137.field1316.method5531(); // L: 3746
																		field525 = MouseHandler.MouseHandler_lastPressedX; // L: 3747
																		field621 = MouseHandler.MouseHandler_lastPressedY; // L: 3748
																		field674 = 1; // L: 3749
																		field622 = 0; // L: 3750
																		field752 = var7; // L: 3751
																		field753 = var8; // L: 3752
																	}

																	if (var46) { // L: 3754
																		class511.field5137.field1316.method5531(); // L: 3755
																	}

																	if (var32 != class180.mousedOverWidgetIf1) { // L: 3757
																		if (var32 != null) { // L: 3758
																			TriBool.invalidateWidget(var32);
																		}

																		if (class180.mousedOverWidgetIf1 != null) { // L: 3759
																			TriBool.invalidateWidget(class180.mousedOverWidgetIf1);
																		}
																	}

																	if (var53 != GrandExchangeOfferOwnWorldComparator.field466 && field662 == field500) { // L: 3761
																		if (var53 != null) { // L: 3762
																			TriBool.invalidateWidget(var53);
																		}

																		if (GrandExchangeOfferOwnWorldComparator.field466 != null) { // L: 3763
																			TriBool.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field466);
																		}
																	}

																	if (GrandExchangeOfferOwnWorldComparator.field466 != null) { // L: 3765
																		if (field662 < field500) { // L: 3766
																			++field662; // L: 3767
																			if (field500 == field662) { // L: 3768
																				TriBool.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field466);
																			}
																		}
																	} else if (field662 > 0) { // L: 3771
																		--field662;
																	}

																	int var14;
																	int var15;
																	int var36;
																	if (oculusOrbState == 0) { // L: 3773
																		var7 = StudioGame.field4084.vmethod8670(); // L: 3774
																		var8 = StudioGame.field4084.vmethod8671(); // L: 3775
																		if (field503 != -1) { // L: 3776
																			Player var61 = SoundCache.localPlayer.field1147.field1326[field503]; // L: 3777
																			if (var61 != null) { // L: 3778
																				Coord var63 = var61.method2488(SoundCache.localPlayer.field1147); // L: 3779
																				var7 = var63.x; // L: 3780
																				var8 = var63.y; // L: 3781
																			}
																		}

																		var9 = StudioGame.field4084.vmethod8672(); // L: 3784
																		if (class371.field4064 - var7 < -500 || class371.field4064 - var7 > 500 || PacketBufferNode.field3398 - var8 < -500 || PacketBufferNode.field3398 - var8 > 500) { // L: 3785
																			class371.field4064 = var7; // L: 3786
																			PacketBufferNode.field3398 = var8; // L: 3787
																		}

																		if (var7 != class371.field4064) { // L: 3789
																			class371.field4064 += (var7 - class371.field4064) / 16;
																		}

																		if (var8 != PacketBufferNode.field3398) { // L: 3790
																			PacketBufferNode.field3398 += (var8 - PacketBufferNode.field3398) / 16;
																		}

																		var10 = class371.field4064 >> 7; // L: 3791
																		var11 = PacketBufferNode.field3398 >> 7; // L: 3792
																		var12 = class169.method3519(class511.field5137, class371.field4064, PacketBufferNode.field3398, var9); // L: 3793
																		var36 = 0; // L: 3794
																		if (var10 > 3 && var11 > 3 && var10 < 100 && var11 < 100) { // L: 3795
																			for (var14 = var10 - 4; var14 <= var10 + 4; ++var14) { // L: 3796
																				for (var15 = var11 - 4; var15 <= var11 + 4; ++var15) { // L: 3797
																					int var16 = var9; // L: 3798
																					if (var9 < 3 && (class511.field5137.field1325[1][var14][var15] & 2) == 2) { // L: 3799
																						var16 = var9 + 1;
																					}

																					int var17 = var12 - class511.field5137.field1327[var16][var14][var15]; // L: 3800
																					if (var17 > var36) { // L: 3801
																						var36 = var17;
																					}
																				}
																			}
																		}

																		var14 = var36 * 192; // L: 3805
																		if (var14 > 98048) { // L: 3806
																			var14 = 98048;
																		}

																		if (var14 < 32768) { // L: 3807
																			var14 = 32768;
																		}

																		if (var14 > field605) { // L: 3808
																			field605 += (var14 - field605) / 24;
																		} else if (var14 < field605) { // L: 3809
																			field605 += (var14 - field605) / 80;
																		}

																		class301.field3215 = class169.method3519(class511.field5137, var7, var8, var9) - camFollowHeight; // L: 3810
																	} else if (oculusOrbState == 1) { // L: 3812
																		if (field712 && SoundCache.localPlayer != null) { // L: 3814
																			var7 = SoundCache.localPlayer.field1204[0]; // L: 3815
																			var8 = SoundCache.localPlayer.field1246[0]; // L: 3816
																			if (var7 >= 0 && 104 > var7 && var8 >= 0 && 104 > var8) { // L: 3817
																				class371.field4064 = SoundCache.localPlayer.x; // L: 3818
																				var9 = class169.method3519(class511.field5137, SoundCache.localPlayer.x, SoundCache.localPlayer.field1191, class511.field5137.field1318) - camFollowHeight; // L: 3819
																				if (var9 < class301.field3215) { // L: 3820
																					class301.field3215 = var9;
																				}

																				PacketBufferNode.field3398 = SoundCache.localPlayer.field1191; // L: 3821
																				field712 = false; // L: 3822
																			}
																		}

																		short var48 = -1; // L: 3825
																		if (field728.method4384(33)) { // L: 3826
																			var48 = 0;
																		} else if (field728.method4384(49)) { // L: 3827
																			var48 = 1024;
																		}

																		if (field728.method4384(48)) { // L: 3828
																			if (var48 == 0) { // L: 3829
																				var48 = 1792;
																			} else if (var48 == 1024) { // L: 3830
																				var48 = 1280;
																			} else {
																				var48 = 1536; // L: 3831
																			}
																		} else if (field728.method4384(50)) { // L: 3833
																			if (var48 == 0) { // L: 3834
																				var48 = 256;
																			} else if (var48 == 1024) { // L: 3835
																				var48 = 768;
																			} else {
																				var48 = 512; // L: 3836
																			}
																		}

																		byte var47 = 0; // L: 3838
																		if (field728.method4384(35)) { // L: 3839
																			var47 = -1;
																		} else if (field728.method4384(51)) { // L: 3840
																			var47 = 1;
																		}

																		var9 = 0; // L: 3841
																		if (var48 >= 0 || var47 != 0) { // L: 3842
																			var9 = field728.method4384(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3843
																			var9 *= 16; // L: 3844
																			field597 = var48; // L: 3845
																			field598 = var47; // L: 3846
																		}

																		if (field596 < var9) { // L: 3848
																			field596 += var9 / 8; // L: 3849
																			if (field596 > var9) { // L: 3850
																				field596 = var9;
																			}
																		} else if (field596 > var9) { // L: 3852
																			field596 = field596 * 9 / 10;
																		}

																		if (field596 > 0) { // L: 3853
																			var10 = field596 / 16; // L: 3854
																			if (field597 >= 0) { // L: 3855
																				var7 = field597 - class337.cameraYaw & 2047; // L: 3856
																				var11 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 3857
																				var12 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 3858
																				class371.field4064 += var10 * var11 / 65536; // L: 3859
																				PacketBufferNode.field3398 += var12 * var10 / 65536; // L: 3860
																			}

																			if (field598 != 0) { // L: 3862
																				class301.field3215 += var10 * field598; // L: 3863
																				if (class301.field3215 > 0) { // L: 3864
																					class301.field3215 = 0;
																				}
																			}
																		} else {
																			field597 = -1; // L: 3868
																			field598 = -1; // L: 3869
																		}

																		if (field728.method4384(13)) { // L: 3871
																			class150.method3288(); // L: 3872
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && World.mouseCam) { // L: 3875
																		var7 = MouseHandler.MouseHandler_y - field593; // L: 3876
																		field591 = var7 * 2; // L: 3877
																		field593 = var7 != -1 && var7 != 1 ? (field593 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3878
																		var8 = field536 - MouseHandler.MouseHandler_x; // L: 3879
																		field590 = var8 * 2; // L: 3880
																		field536 = var8 != -1 && var8 != 1 ? (field536 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3881
																	} else {
																		if (field728.method4384(96)) { // L: 3884
																			field590 += (-24 - field590) / 2;
																		} else if (field728.method4384(97)) { // L: 3885
																			field590 += (24 - field590) / 2;
																		} else {
																			field590 /= 2; // L: 3886
																		}

																		if (field728.method4384(98)) { // L: 3887
																			field591 += (12 - field591) / 2;
																		} else if (field728.method4384(99)) { // L: 3888
																			field591 += (-12 - field591) / 2;
																		} else {
																			field591 /= 2; // L: 3889
																		}

																		field593 = MouseHandler.MouseHandler_y; // L: 3890
																		field536 = MouseHandler.MouseHandler_x; // L: 3891
																	}

																	camAngleY = field590 / 2 + camAngleY & 2047; // L: 3893
																	camAngleX += field591 / 2; // L: 3894
																	if (camAngleX < 128) { // L: 3895
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) { // L: 3896
																		camAngleX = 383;
																	}

																	if (field567) { // L: 3898
																		WorldMapDecorationType.method7065(WorldMapSectionType.field2666, ObjectSound.field853, class137.field1630); // L: 3899
																		class252.method4911(class328.field3565, WorldMapLabelSize.field2551); // L: 3900
																		if (WorldMapSectionType.field2666 == class47.cameraX && class328.cameraY == ObjectSound.field853 && class137.field1630 == class60.cameraZ && Language.cameraPitch == class328.field3565 && class337.cameraYaw == WorldMapLabelSize.field2551) { // L: 3901
																			field567 = false; // L: 3902
																			isCameraLocked = false; // L: 3903
																			field764 = false; // L: 3904
																			field553 = false; // L: 3905
																			class327.field3558 = 0; // L: 3906
																			class96.field1188 = 0; // L: 3907
																			class6.field16 = 0; // L: 3908
																			class133.field1560 = 0; // L: 3909
																			class104.field1354 = 0; // L: 3910
																			class191.field1983 = 0; // L: 3911
																			VarpDefinition.field1879 = 0; // L: 3912
																			WorldMapLabelSize.field2541 = 0; // L: 3913
																			VarbitComposition.field2102 = 0; // L: 3914
																			GrandExchangeOfferAgeComparator.field4583 = 0; // L: 3915
																			field767 = null; // L: 3916
																			field769 = null; // L: 3917
																			field768 = null; // L: 3918
																		}
																	} else if (isCameraLocked) { // L: 3921
																		if (!field764) { // L: 3922
																			var7 = class376.method7084(WorldMapLabelSize.field2541); // L: 3923
																			var8 = class376.method7084(VarbitComposition.field2102); // L: 3924
																			var9 = class169.method3519(class511.field5137, var7, var8, class511.field5137.field1318) - GrandExchangeOfferAgeComparator.field4583; // L: 3925
																			WorldMapDecorationType.method7065(var7, var9, var8); // L: 3926
																		} else if (field767 != null) { // L: 3928
																			class47.cameraX = field767.vmethod8962(); // L: 3929
																			class60.cameraZ = field767.vmethod8963(); // L: 3930
																			if (field804) { // L: 3931
																				class328.cameraY = field767.vmethod8964(); // L: 3932
																			} else {
																				class328.cameraY = class169.method3519(class511.field5137, class47.cameraX, class60.cameraZ, class511.field5137.field1318) - field767.vmethod8964(); // L: 3935
																			}

																			field767.method8974(); // L: 3937
																		}

																		if (!field553) { // L: 3939
																			var7 = class376.method7084(class327.field3558); // L: 3940
																			var8 = class376.method7084(class96.field1188); // L: 3941
																			var9 = class169.method3519(class511.field5137, var7, var8, class511.field5137.field1318) - class6.field16; // L: 3942
																			var10 = var7 - class47.cameraX; // L: 3943
																			var11 = var9 - class328.cameraY; // L: 3944
																			var12 = var8 - class60.cameraZ; // L: 3945
																			var36 = (int)Math.sqrt((double)(var12 * var12 + var10 * var10)); // L: 3946
																			var14 = (int)(Math.atan2((double)var11, (double)var36) * 325.9490051269531D) & 2047; // L: 3947
																			var15 = (int)(Math.atan2((double)var10, (double)var12) * -325.9490051269531D) & 2047; // L: 3948
																			class252.method4911(var14, var15); // L: 3949
																		} else {
																			if (field769 != null) { // L: 3952
																				Language.cameraPitch = field769.method8959(); // L: 3953
																				Language.cameraPitch = Math.min(Math.max(Language.cameraPitch, 128), 383); // L: 3954
																				field769.method8974(); // L: 3955
																			}

																			if (field768 != null) { // L: 3957
																				class337.cameraYaw = field768.method8959() & 2047; // L: 3958
																				field768.method8974(); // L: 3959
																			}
																		}
																	}

																	for (var7 = 0; var7 < 5; ++var7) { // L: 3963
																		int var10002 = field498[var7]++;
																	}

																	Archive.varcs.tryWrite(); // L: 3964
																	var7 = class18.method272(); // L: 3965
																	var8 = class74.method2155(); // L: 3966
																	if (var7 > 15000 && var8 > 15000) { // L: 3967
																		logoutTimer = 250; // L: 3968
																		MouseHandler.MouseHandler_idleCycles = 14500; // L: 3970
																		var60 = class170.getPacketBufferNode(ClientPacket.field3311, packetWriter.isaacCipher); // L: 3973
																		packetWriter.addNode(var60); // L: 3974
																	}

																	class135.friendSystem.processFriendUpdates(); // L: 3976

																	for (var9 = 0; var9 < field800.size(); ++var9) { // L: 3978
																		var11 = (Integer)field800.get(var9); // L: 3980
																		class142 var37 = class138.method3190(var11); // L: 3982
																		if (var37 == null) { // L: 3983
																			var10 = 2; // L: 3984
																		} else {
																			var10 = var37.method3231() ? 0 : 1; // L: 3987
																		}

																		if (var10 != 2) { // L: 3989
																			field800.remove(var9); // L: 3990
																			--var9; // L: 3991
																		}
																	}

																	++packetWriter.pendingWrites; // L: 3995
																	if (packetWriter.pendingWrites > 50) { // L: 3996
																		var60 = class170.getPacketBufferNode(ClientPacket.field3367, packetWriter.isaacCipher); // L: 3998
																		packetWriter.addNode(var60); // L: 3999
																	}

																	try {
																		packetWriter.flush(); // L: 4002
																	} catch (IOException var38) { // L: 4004
																		class131.method3068(); // L: 4005
																	}

																	class433.method8077().method4261(); // L: 4007
																	return; // L: 4008
																}

																if (var51.field2444.type == 12) { // L: 3648
																	var44 = true;
																}

																if (var51 != null && var51.field2444 != null) { // L: 3650
																	if (var51.field2444.childIndex >= 0) { // L: 3651
																		var33 = ModeWhere.field4649.method6519(var51.field2444.parentId); // L: 3652
																		if (var33 == null || var33.children == null || var33.children.length == 0 || var51.field2444.childIndex >= var33.children.length || var51.field2444 != var33.children[var51.field2444.childIndex]) { // L: 3653
																			continue;
																		}
																	}

																	if (var51.field2444.type == 11 && var51.field2440 == 0) { // L: 3657
																		if (var51.field2444.method6878(var51.field2445, var51.field2443, 0, 0)) { // L: 3658
																			var51.field2444.method6920().method4120().method4244(1, var51.field2444.method6920().method4132()); // L: 3659
																			switch(var51.field2444.method6881()) { // L: 3660
																			case 0:
																				class421.openURL(var51.field2444.method6867(), true, false); // L: 3682
																				break;
																			case 1:
																				var8 = ClanChannel.getWidgetFlags(var51.field2444); // L: 3663
																				boolean var45 = (var8 >> 22 & 1) != 0; // L: 3665
																				if (var45) { // L: 3667
																					int[] var34 = var51.field2444.method6863(); // L: 3668
																					if (var34 != null) { // L: 3669
																						PacketBufferNode var35 = class170.getPacketBufferNode(ClientPacket.field3366, packetWriter.isaacCipher); // L: 3670
																						var35.packetBuffer.method9609(var51.field2444.id); // L: 3671
																						var35.packetBuffer.method9741(var51.field2444.childIndex); // L: 3672
																						var35.packetBuffer.method9611(var34[1]); // L: 3673
																						var35.packetBuffer.method9611(var51.field2444.method6882()); // L: 3674
																						var35.packetBuffer.method9609(var34[0]); // L: 3675
																						var35.packetBuffer.method9609(var34[2]); // L: 3676
																						packetWriter.addNode(var35); // L: 3677
																					}
																				}
																			}
																		}
																	} else if (var51.field2444.type == 12) { // L: 3687
																		class356 var59 = var51.field2444.method6991(); // L: 3688
																		if (var59 != null && var59.method6636()) { // L: 3689
																			switch(var51.field2440) { // L: 3690
																			case 0:
																				field740.method4347(var51.field2444); // L: 3692
																				var59.method6763(true); // L: 3693
																				var59.method6623(var51.field2445, var51.field2443, field728.method4384(82), field728.method4384(81)); // L: 3694
																				break; // L: 3695
																			case 1:
																				var59.method6624(var51.field2445, var51.field2443); // L: 3697
																			}
																		}
																	}
																}
															}
														}

														var50 = var56.widget; // L: 3635
														if (var50.childIndex < 0) { // L: 3636
															break;
														}

														var33 = ModeWhere.field4649.method6519(var50.parentId); // L: 3637
													} while(var33 == null || var33.children == null || var50.childIndex >= var33.children.length || var50 != var33.children[var50.childIndex]); // L: 3638

													Projectile.runScriptEvent(var56); // L: 3642
												}
											}

											var50 = var56.widget; // L: 3623
											if (var50.childIndex < 0) { // L: 3624
												break;
											}

											var33 = ModeWhere.field4649.method6519(var50.parentId); // L: 3625
										} while(var33 == null || var33.children == null || var50.childIndex >= var33.children.length || var50 != var33.children[var50.childIndex]); // L: 3626

										Projectile.runScriptEvent(var56); // L: 3630
									}
								}

								var50 = var56.widget; // L: 3611
								if (var50.childIndex < 0) { // L: 3612
									break;
								}

								var33 = ModeWhere.field4649.method6519(var50.parentId); // L: 3613
							} while(var33 == null || var33.children == null || var50.childIndex >= var33.children.length || var50 != var33.children[var50.childIndex]); // L: 3614

							Projectile.runScriptEvent(var56); // L: 3618
						}
					}

					var41 = class170.getPacketBufferNode(ClientPacket.field3341, packetWriter.isaacCipher); // L: 3299
					var41.packetBuffer.writeByte(0); // L: 3300
					var3 = var41.packetBuffer.offset; // L: 3301
					class10.performReflectionCheck(var41.packetBuffer); // L: 3302
					var41.packetBuffer.method9605(var41.packetBuffer.offset - var3); // L: 3303
					packetWriter.addNode(var41); // L: 3304
				}
			}
		}
	} // L: 3281

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-78"
	)
	public void vmethod6382(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 4210
			if (var1 > -1 && class105.clientPreferences.method2654() > 0 && !playingJingle) { // L: 4211
				PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.field3282, packetWriter.isaacCipher); // L: 4212
				var3.packetBuffer.writeInt(var1); // L: 4213
				packetWriter.addNode(var3); // L: 4214
			}

		}
	} // L: 4216

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "957518491"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class74.canvasWidth; // L: 4916
		int var2 = class1.canvasHeight; // L: 4917
		if (super.contentWidth < var1) { // L: 4918
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4919
		}

		if (class105.clientPreferences != null) { // L: 4920
			try {
				class26.method389(class415.client, "resize", new Object[]{GrandExchangeOfferOwnWorldComparator.getWindowedMode()}); // L: 4922
			} catch (Throwable var4) { // L: 4924
			}
		}

	} // L: 4926

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4929
			class212.method4108(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4930
			if (field721[var1]) { // L: 4931
				field722[var1] = true;
			}

			field723[var1] = field721[var1]; // L: 4932
			field721[var1] = false; // L: 4933
		}

		field720 = cycle; // L: 4935
		viewportX = -1; // L: 4936
		viewportY = -1; // L: 4937
		if (rootInterface != -1) { // L: 4938
			rootWidgetCount = 0; // L: 4939
			class96.method2468(rootInterface, 0, 0, class74.canvasWidth, class1.canvasHeight, 0, 0, -1); // L: 4940
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4942
		if (showMouseCross) { // L: 4943
			if (field674 == 1) { // L: 4944
				class110.field1408[field622 * 400 / 100].drawTransBgAt(field525 - 8, field621 - 8); // L: 4945
			}

			if (field674 == 2) { // L: 4947
				class110.field1408[field622 * 400 / 100 + 4].drawTransBgAt(field525 - 8, field621 - 8); // L: 4948
			}
		}

		if (!isMenuOpen) { // L: 4951
			if (viewportX != -1) { // L: 4952
				AbstractWorldMapData.method4994(viewportX, viewportY);
			}
		} else {
			UserComparator4.method2994(); // L: 4954
		}

		if (field582 == 3) { // L: 4955
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4956
				if (field723[var1]) { // L: 4957
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4958
				} else if (field722[var1]) { // L: 4960
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4961
				}
			}
		}

		class227.method4321(class511.field5137.field1318, SoundCache.localPlayer.x, SoundCache.localPlayer.field1191, field805); // L: 4965
		field805 = 0; // L: 4966
	} // L: 4967

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lev;II)Z",
		garbageValue = "496029700"
	)
	boolean method1277(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6797
			Decimator.friendsChatManager = null; // L: 6798
		} else {
			if (Decimator.friendsChatManager == null) { // L: 6801
				Decimator.friendsChatManager = new FriendsChatManager(Projectile.loginType, class415.client); // L: 6802
			}

			Decimator.friendsChatManager.method8483(var1.packetBuffer, var2); // L: 6804
		}

		class457.method8401(); // L: 6806
		var1.serverPacket = null; // L: 6807
		return true; // L: 6808
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)Z",
		garbageValue = "-1896066454"
	)
	boolean method1278(PacketWriter var1) {
		if (Decimator.friendsChatManager != null) { // L: 6812
			Decimator.friendsChatManager.method8484(var1.packetBuffer); // L: 6813
		}

		class457.method8401(); // L: 6815
		var1.serverPacket = null; // L: 6816
		return true; // L: 6817
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)Z",
		garbageValue = "-659118293"
	)
	final boolean method1279(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6822
		PacketBuffer var3 = var1.packetBuffer; // L: 6823
		if (var2 == null) { // L: 6824
			return false;
		} else {
			int var6;
			String var23;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6826
					if (var1.field1461) { // L: 6827
						if (!var2.isAvailable(1)) { // L: 6828
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6829
						var1.field1457 = 0; // L: 6830
						var1.field1461 = false; // L: 6831
					}

					var3.offset = 0; // L: 6833
					if (var3.method9504()) { // L: 6834
						if (!var2.isAvailable(1)) { // L: 6835
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6836
						var1.field1457 = 0; // L: 6837
					}

					var1.field1461 = true; // L: 6839
					ServerPacket[] var4 = class150.method3287(); // L: 6840
					var5 = var3.readSmartByteShortIsaac(); // L: 6841
					if (var5 < 0 || var5 >= var4.length) { // L: 6842
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6843
					var1.serverPacketLength = var1.serverPacket.length; // L: 6844
				}

				if (var1.serverPacketLength == -1) { // L: 6846
					if (!var2.isAvailable(1)) { // L: 6847
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6848
					var1.serverPacketLength = var3.array[0] & 255; // L: 6849
				}

				if (var1.serverPacketLength == -2) { // L: 6851
					if (!var2.isAvailable(2)) { // L: 6852
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6853
					var3.offset = 0; // L: 6854
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6855
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6857
					return false;
				}

				var3.offset = 0; // L: 6858
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6859
				var1.field1457 = 0; // L: 6860
				timer.method8328(); // L: 6861
				var1.field1464 = var1.field1459; // L: 6862
				var1.field1459 = var1.field1462; // L: 6863
				var1.field1462 = var1.serverPacket; // L: 6864
				if (ServerPacket.field3415 == var1.serverPacket) { // L: 6865
					class96.field1171 = null; // L: 6866
					var1.serverPacket = null; // L: 6867
					return true; // L: 6868
				}

				int var20;
				Widget var56;
				if (ServerPacket.field3405 == var1.serverPacket) { // L: 6870
					var20 = var3.method9613(); // L: 6871
					var5 = var3.method9591(); // L: 6872
					var6 = var3.method9591(); // L: 6873
					var56 = ModeWhere.field4649.method6519(var20); // L: 6874
					class95.method2467(var56, var5, var6); // L: 6875
					TriBool.invalidateWidget(var56); // L: 6876
					var1.serverPacket = null; // L: 6877
					return true; // L: 6878
				}

				if (ServerPacket.field3463 == var1.serverPacket) { // L: 6880
					class153.method3312(class320.field3387); // L: 6881
					var1.serverPacket = null; // L: 6882
					return true; // L: 6883
				}

				int var8;
				int var9;
				int var10;
				int var21;
				if (ServerPacket.field3499 == var1.serverPacket) { // L: 6885
					isCameraLocked = true; // L: 6886
					field567 = false; // L: 6887
					field553 = false; // L: 6888
					class327.field3558 = var3.readUnsignedByte(); // L: 6889
					class96.field1188 = var3.readUnsignedByte(); // L: 6890
					class6.field16 = var3.readUnsignedShort(); // L: 6891
					class133.field1560 = var3.readUnsignedByte(); // L: 6892
					class104.field1354 = var3.readUnsignedByte(); // L: 6893
					if (class104.field1354 >= 100) { // L: 6894
						var20 = class376.method7084(class327.field3558); // L: 6895
						var5 = class376.method7084(class96.field1188); // L: 6896
						var6 = class169.method3519(class511.field5137, var20, var5, class511.field5137.field1318) - class6.field16; // L: 6897
						var21 = var20 - class47.cameraX; // L: 6898
						var8 = var6 - class328.cameraY; // L: 6899
						var9 = var5 - class60.cameraZ; // L: 6900
						var10 = (int)Math.sqrt((double)(var9 * var9 + var21 * var21)); // L: 6901
						Language.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 6902
						class337.cameraYaw = (int)(Math.atan2((double)var21, (double)var9) * -325.9490051269531D) & 2047; // L: 6903
						if (Language.cameraPitch < 128) { // L: 6904
							Language.cameraPitch = 128;
						}

						if (Language.cameraPitch > 383) { // L: 6905
							Language.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6907
					return true; // L: 6908
				}

				if (ServerPacket.field3530 == var1.serverPacket) { // L: 6910
					var20 = var3.readUnsignedByte(); // L: 6911
					var5 = var3.readUnsignedShort(); // L: 6912
					var6 = var3.readUnsignedByte(); // L: 6913
					if (var20 == 0) { // L: 6914
						class511.field5137.field1318 = var6; // L: 6915
						class20.field91 = class511.field5137; // L: 6916
					} else {
						if (var20 != 1) { // L: 6918
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad"); // L: 6924
						}

						class476 var59 = class511.field5137.field1331[var5]; // L: 6919
						var59.field4971.field1318 = var6; // L: 6920
						class20.field91 = var59.field4971; // L: 6921
					}

					var1.serverPacket = null; // L: 6926
					return true; // L: 6927
				}

				if (ServerPacket.field3533 == var1.serverPacket) { // L: 6929
					class145.field1682 = var3.method9591(); // L: 6930
					field580 = var3.method9592(); // L: 6931
					class103.field1350 = var3.method9590(); // L: 6932

					for (var20 = class145.field1682; var20 < class145.field1682 + 8; ++var20) { // L: 6933
						for (var5 = class103.field1350; var5 < class103.field1350 + 8; ++var5) { // L: 6934
							if (class20.field91.field1334[field580][var20][var5] != null) { // L: 6935
								class20.field91.field1334[field580][var20][var5] = null; // L: 6936
								WorldMapManager.method4845(field580, var20, var5); // L: 6937
							}
						}
					}

					for (class96 var55 = (class96)class20.field91.field1335.last(); var55 != null; var55 = (class96)class20.field91.field1335.previous()) { // L: 6941 6942 6944
						if (var55.field1178 >= class145.field1682 && var55.field1178 < class145.field1682 + 8 && var55.field1177 >= class103.field1350 && var55.field1177 < class103.field1350 + 8 && var55.field1174 == field580) { // L: 6943
							var55.field1173 = 0;
						}
					}

					var1.serverPacket = null; // L: 6946
					return true; // L: 6947
				}

				if (ServerPacket.field3450 == var1.serverPacket) { // L: 6949
					var20 = var3.method9599(); // L: 6950
					var5 = var3.method9600(); // L: 6951
					var6 = var3.method9586(); // L: 6952
					var56 = ModeWhere.field4649.method6519(var6); // L: 6953
					var56.field3943 = var20 + (var5 << 16); // L: 6954
					var1.serverPacket = null; // L: 6955
					return true; // L: 6956
				}

				Widget var22;
				if (ServerPacket.field3500 == var1.serverPacket) { // L: 6958
					var20 = var3.method9614(); // L: 6959
					var5 = var3.method9592(); // L: 6960
					var22 = ModeWhere.field4649.method6519(var20); // L: 6961
					class225.method4302(var22, SoundCache.localPlayer.appearance.field3775, var5); // L: 6962
					TriBool.invalidateWidget(var22); // L: 6963
					var1.serverPacket = null; // L: 6964
					return true; // L: 6965
				}

				if (ServerPacket.field3442 == var1.serverPacket) { // L: 6967
					class153.method3312(class320.field3382); // L: 6968
					var1.serverPacket = null; // L: 6969
					return true; // L: 6970
				}

				boolean var83;
				if (ServerPacket.field3481 == var1.serverPacket) { // L: 6972
					var83 = var3.readUnsignedByte() == 1; // L: 6973
					if (var83) { // L: 6974
						BufferedNetSocket.field4988 = WorldMapData_1.method4861() - var3.readLong(); // L: 6975
						class252.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6976
					} else {
						class252.grandExchangeEvents = null; // L: 6978
					}

					field727 = cycleCntr; // L: 6979
					var1.serverPacket = null; // L: 6980
					return true; // L: 6981
				}

				if (ServerPacket.field3453 == var1.serverPacket) { // L: 6983
					var5 = var3.method9712(); // L: 6987
					var20 = var3.readUnsignedShort(); // L: 6988
					var6 = var3.method9592(); // L: 6989
					if (var5 == 65535) { // L: 6990
						var5 = -1; // L: 6991
					}

					class103 var58 = class20.field91.field1315[var20]; // L: 6993
					if (var58 != null) { // L: 6994
						if (var5 == var58.field1235 && var5 != -1) { // L: 6995
							var8 = class353.SequenceDefinition_get(var5).field2305; // L: 6996
							if (var8 == 1) { // L: 6997
								var58.field1236 = 0; // L: 6998
								var58.field1237 = 0; // L: 6999
								var58.field1238 = var6; // L: 7000
								var58.field1214 = 0; // L: 7001
							} else if (var8 == 2) { // L: 7003
								var58.field1214 = 0; // L: 7004
							}
						} else if (var5 == -1 || var58.field1235 == -1 || class353.SequenceDefinition_get(var5).field2298 >= class353.SequenceDefinition_get(var58.field1235).field2298) { // L: 7007
							var58.field1235 = var5; // L: 7008
							var58.field1236 = 0; // L: 7009
							var58.field1237 = 0; // L: 7010
							var58.field1238 = var6; // L: 7011
							var58.field1214 = 0; // L: 7012
							var58.field1265 = var58.field1229; // L: 7013
						}
					}

					var1.serverPacket = null; // L: 7017
					return true; // L: 7018
				}

				if (ServerPacket.field3457 == var1.serverPacket) { // L: 7020
					var20 = var3.method9700(); // L: 7021
					var5 = var3.method9586(); // L: 7022
					var6 = var3.method9603(); // L: 7023
					var56 = ModeWhere.field4649.method6519(var5); // L: 7024
					if (var6 != var56.rawX || var20 != var56.rawY || var56.xAlignment != 0 || var56.yAlignment != 0) { // L: 7025
						var56.rawX = var6; // L: 7026
						var56.rawY = var20; // L: 7027
						var56.xAlignment = 0; // L: 7028
						var56.yAlignment = 0; // L: 7029
						TriBool.invalidateWidget(var56); // L: 7030
						this.alignWidget(var56); // L: 7031
						if (var56.type == 0) { // L: 7032
							class238.revalidateWidgetScroll(ModeWhere.field4649.field3740[var5 >> 16], var56, false);
						}
					}

					var1.serverPacket = null; // L: 7034
					return true; // L: 7035
				}

				if (ServerPacket.field3496 == var1.serverPacket) { // L: 7037
					var20 = var3.readInt(); // L: 7038
					InterfaceParent var88 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7039
					if (var88 != null) { // L: 7040
						ArchiveDiskActionHandler.closeInterface(var88, true);
					}

					if (meslayerContinueWidget != null) { // L: 7041
						TriBool.invalidateWidget(meslayerContinueWidget); // L: 7042
						meslayerContinueWidget = null; // L: 7043
					}

					var1.serverPacket = null; // L: 7045
					return true; // L: 7046
				}

				if (ServerPacket.field3465 == var1.serverPacket) { // L: 7048
					class31.method462(); // L: 7049
					var20 = var3.method9592(); // L: 7050
					var5 = var3.readUnsignedByte(); // L: 7051
					var6 = var3.method9613(); // L: 7052
					var21 = var3.method9592(); // L: 7053
					experience[var20] = var6; // L: 7054
					currentLevels[var20] = var21; // L: 7055
					levels[var20] = 1; // L: 7056
					field775[var20] = var5; // L: 7057

					for (var8 = 0; var8 < 98; ++var8) { // L: 7058
						if (var6 >= Skills.Skills_experienceTable[var8]) {
							levels[var20] = var8 + 2;
						}
					}

					field687[++field701 - 1 & 31] = var20; // L: 7059
					var1.serverPacket = null; // L: 7060
					return true; // L: 7061
				}

				if (ServerPacket.field3525 == var1.serverPacket) { // L: 7063
					var20 = var3.readUnsignedByte(); // L: 7064
					var5 = var3.readUnsignedShort(); // L: 7065
					var6 = field508 >= 223 ? var3.readShort() : -1; // L: 7066
					this.method501(false); // L: 7067
					if (var20 == 0) { // L: 7068
						StudioGame.field4084 = class511.field5137.field1326[var5]; // L: 7069
						field503 = -1; // L: 7070
						SoundCache.localPlayer.field1147 = class511.field5137; // L: 7071
					} else if (var20 == 1) { // L: 7073
						field503 = -1; // L: 7074
						StudioGame.field4084 = class511.field5137.field1315[var5]; // L: 7075
					} else if (var20 == 2) { // L: 7077
						field503 = var6; // L: 7078
						StudioGame.field4084 = class511.field5137.field1331[var5]; // L: 7079
						this.method501(true); // L: 7080
						SoundCache.localPlayer.field1147 = class511.field5137.field1331[var5].field4971; // L: 7081
					}

					if (StudioGame.field4084 == null) { // L: 7083
						field503 = -1; // L: 7084
						StudioGame.field4084 = SoundCache.localPlayer; // L: 7085
					}

					var1.serverPacket = null; // L: 7087
					return true; // L: 7088
				}

				if (ServerPacket.field3411 == var1.serverPacket) { // L: 7090
					class103.field1350 = var3.readUnsignedByte(); // L: 7091
					field580 = var3.method9590(); // L: 7092
					class145.field1682 = var3.readUnsignedByte(); // L: 7093
					var1.serverPacket = null; // L: 7094
					return true; // L: 7095
				}

				if (ServerPacket.field3469 == var1.serverPacket) { // L: 7097
					var20 = var3.readUnsignedByte(); // L: 7098
					Interpreter.forceDisconnect(var20); // L: 7099
					var1.serverPacket = null; // L: 7100
					return false; // L: 7101
				}

				if (ServerPacket.field3523 == var1.serverPacket) { // L: 7103
					var20 = var3.method9599(); // L: 7104
					if (var20 == 65535) { // L: 7105
						var20 = -1;
					}

					rootInterface = var20; // L: 7106
					this.resizeRoot(false); // L: 7107
					class137.method3176(var20); // L: 7108
					class7.method56(rootInterface); // L: 7109

					for (var5 = 0; var5 < 100; ++var5) { // L: 7110
						field721[var5] = true;
					}

					var1.serverPacket = null; // L: 7111
					return true; // L: 7112
				}

				byte var70;
				if (ServerPacket.field3412 == var1.serverPacket) { // L: 7114
					field659 = cycleCntr; // L: 7115
					var70 = var3.readByte(); // L: 7116
					if (var1.serverPacketLength == 1) { // L: 7117
						if (var70 >= 0) { // L: 7118
							currentClanChannels[var70] = null;
						} else {
							class276.guestClanChannel = null; // L: 7119
						}

						var1.serverPacket = null; // L: 7120
						return true; // L: 7121
					}

					if (var70 >= 0) { // L: 7123
						currentClanChannels[var70] = new ClanChannel(var3); // L: 7124
					} else {
						class276.guestClanChannel = new ClanChannel(var3); // L: 7127
					}

					var1.serverPacket = null; // L: 7129
					return true; // L: 7130
				}

				if (ServerPacket.field3497 == var1.serverPacket) { // L: 7132
					for (var20 = 0; var20 < class20.field91.field1326.length; ++var20) { // L: 7133
						if (class20.field91.field1326[var20] != null) { // L: 7134
							class20.field91.field1326[var20].field1235 = -1;
						}
					}

					for (var20 = 0; var20 < class20.field91.field1315.length; ++var20) { // L: 7136
						if (class20.field91.field1315[var20] != null) { // L: 7137
							class20.field91.field1315[var20].field1235 = -1;
						}
					}

					var1.serverPacket = null; // L: 7139
					return true; // L: 7140
				}

				if (ServerPacket.field3516 == var1.serverPacket) { // L: 7142
					rebootTimer = var3.method9712() * 30; // L: 7143
					field711 = cycleCntr; // L: 7144
					var1.serverPacket = null; // L: 7145
					return true; // L: 7146
				}

				if (ServerPacket.field3400 == var1.serverPacket) { // L: 7148
					isCameraLocked = true; // L: 7149
					field567 = false; // L: 7150
					field764 = false; // L: 7151
					WorldMapLabelSize.field2541 = var3.readUnsignedByte(); // L: 7152
					VarbitComposition.field2102 = var3.readUnsignedByte(); // L: 7153
					GrandExchangeOfferAgeComparator.field4583 = var3.readUnsignedShort(); // L: 7154
					VarpDefinition.field1879 = var3.readUnsignedByte(); // L: 7155
					class191.field1983 = var3.readUnsignedByte(); // L: 7156
					if (class191.field1983 >= 100) { // L: 7157
						class47.cameraX = class376.method7084(WorldMapLabelSize.field2541); // L: 7158
						class60.cameraZ = class376.method7084(VarbitComposition.field2102); // L: 7159
						class328.cameraY = class169.method3519(class511.field5137, class47.cameraX, class60.cameraZ, class511.field5137.field1318) - GrandExchangeOfferAgeComparator.field4583; // L: 7160
					}

					var1.serverPacket = null; // L: 7162
					return true; // L: 7163
				}

				if (ServerPacket.field3494 == var1.serverPacket && isCameraLocked) { // L: 7165 7166
					field567 = true; // L: 7167
					field553 = false; // L: 7168
					field764 = false; // L: 7169

					for (var20 = 0; var20 < 5; ++var20) { // L: 7170
						field771[var20] = false; // L: 7171
					}

					var1.serverPacket = null; // L: 7173
					return true; // L: 7174
				}

				if (ServerPacket.field3532 == var1.serverPacket) { // L: 7177
					class414.field4670 = var3.readBoolean(); // L: 7178
					var1.serverPacket = null; // L: 7179
					return true; // L: 7180
				}

				String var51;
				if (ServerPacket.field3418 == var1.serverPacket) { // L: 7182
					var51 = var3.readStringCp1252NullTerminated(); // L: 7183
					var23 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(var3))); // L: 7184
					VarbitComposition.addGameMessage(6, var51, var23); // L: 7185
					var1.serverPacket = null; // L: 7186
					return true; // L: 7187
				}

				if (ServerPacket.field3439 == var1.serverPacket) { // L: 7189
					var20 = var3.readUnsignedByte(); // L: 7190
					var5 = var3.readUnsignedByte(); // L: 7191
					var6 = var3.readUnsignedByte(); // L: 7192
					var21 = var3.readUnsignedByte(); // L: 7193
					field771[var20] = true; // L: 7194
					field772[var20] = var5; // L: 7195
					field664[var20] = var6; // L: 7196
					field774[var20] = var21; // L: 7197
					field498[var20] = 0; // L: 7198
					var1.serverPacket = null; // L: 7199
					return true; // L: 7200
				}

				String var81;
				if (ServerPacket.field3475 == var1.serverPacket) { // L: 7202
					var20 = var3.method9590(); // L: 7203
					var5 = var3.method9592(); // L: 7204
					var81 = var3.readStringCp1252NullTerminated(); // L: 7205
					if (var20 >= 1 && var20 <= 8) { // L: 7206
						if (var81.equalsIgnoreCase("null")) { // L: 7207
							var81 = null;
						}

						field686[var20 - 1] = var81; // L: 7208
						field638[var20 - 1] = var5 == 0; // L: 7209
					}

					var1.serverPacket = null; // L: 7211
					return true; // L: 7212
				}

				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				byte var61;
				int var62;
				byte var63;
				int var64;
				int var66;
				int var67;
				if (ServerPacket.field3518 == var1.serverPacket) { // L: 7214
					var17 = var3.readUnsignedByte(); // L: 7230
					var62 = var3.method9593(); // L: 7231
					var61 = var3.method9749(); // L: 7232
					var16 = var3.method9599(); // L: 7233
					var67 = var3.method9591() * 4; // L: 7234
					var63 = var3.method9595(); // L: 7235
					var66 = var3.method9592() * 4; // L: 7236
					var64 = var3.method9599(); // L: 7237
					var18 = var3.method9712(); // L: 7238
					var15 = var3.method9600(); // L: 7239
					var6 = var3.readMedium(); // L: 7240
					var20 = var6 >> 16; // L: 7241
					var5 = var6 >> 8 & 255; // L: 7242
					var21 = var20 + (var6 >> 4 & 7); // L: 7243
					var8 = var5 + (var6 & 7); // L: 7244
					var9 = var63 + var21; // L: 7245
					var10 = var61 + var8; // L: 7246
					if (0 <= var21 && var21 < 104 && 0 <= var8 && var8 < 104 && 0 <= var9 && var9 < 104 && 0 <= var10 && var10 < 104 && var64 != 65535) { // L: 7247
						var21 = class376.method7084(var21); // L: 7248
						var8 = class376.method7084(var8); // L: 7249
						var9 = class376.method7084(var9); // L: 7250
						var10 = class376.method7084(var10); // L: 7251
						var19 = new Projectile(var64, class20.field91.field1318, var21, var8, class169.method3519(class20.field91, var21, var8, class20.field91.field1318) - var66, var15 + cycle, var16 + cycle, var17, var18, var62, var67); // L: 7252
						var19.setDestination(var9, var10, class169.method3519(class20.field91, var9, var10, class20.field91.field1318) - var67, var15 + cycle); // L: 7253
						class20.field91.field1324.addFirst(var19); // L: 7254
					}

					var1.serverPacket = null; // L: 7256
					return true; // L: 7257
				}

				if (ServerPacket.field3404 == var1.serverPacket) { // L: 7259
					class135.friendSystem.method1912(); // L: 7260
					field705 = cycleCntr; // L: 7261
					var1.serverPacket = null; // L: 7262
					return true; // L: 7263
				}

				if (ServerPacket.field3417 == var1.serverPacket) { // L: 7265
					class103.field1350 = var3.method9590(); // L: 7266
					class145.field1682 = var3.readUnsignedByte(); // L: 7267
					field580 = var3.method9591(); // L: 7268

					while (var3.offset < var1.serverPacketLength) { // L: 7269
						var20 = var3.readUnsignedByte(); // L: 7270
						class320 var84 = class20.method289()[var20]; // L: 7271
						class153.method3312(var84); // L: 7272
					}

					var1.serverPacket = null; // L: 7274
					return true; // L: 7275
				}

				Widget var73;
				if (ServerPacket.field3454 == var1.serverPacket) { // L: 7277
					var20 = var3.method9586(); // L: 7278
					var73 = ModeWhere.field4649.method6519(var20); // L: 7279

					for (var6 = 0; var6 < var73.field3962.length; ++var6) { // L: 7280
						var73.field3962[var6] = -1; // L: 7281
						var73.field3962[var6] = 0; // L: 7282
					}

					TriBool.invalidateWidget(var73); // L: 7284
					var1.serverPacket = null; // L: 7285
					return true; // L: 7286
				}

				if (ServerPacket.field3434 == var1.serverPacket) { // L: 7288
					var20 = var3.readInt(); // L: 7289
					if (var20 != field601) { // L: 7290
						field601 = var20; // L: 7291
						class230.method4374(); // L: 7292
					}

					var1.serverPacket = null; // L: 7294
					return true; // L: 7295
				}

				if (ServerPacket.field3452 == var1.serverPacket) { // L: 7297
					field567 = false; // L: 7298
					isCameraLocked = false; // L: 7299
					field764 = false; // L: 7300
					field553 = false; // L: 7301
					class327.field3558 = 0; // L: 7302
					class96.field1188 = 0; // L: 7303
					class6.field16 = 0; // L: 7304
					field804 = false; // L: 7305
					class133.field1560 = 0; // L: 7306
					class104.field1354 = 0; // L: 7307
					class191.field1983 = 0; // L: 7308
					VarpDefinition.field1879 = 0; // L: 7309
					WorldMapLabelSize.field2541 = 0; // L: 7310
					VarbitComposition.field2102 = 0; // L: 7311
					GrandExchangeOfferAgeComparator.field4583 = 0; // L: 7312
					field767 = null; // L: 7313
					field769 = null; // L: 7314
					field768 = null; // L: 7315

					for (var20 = 0; var20 < 5; ++var20) { // L: 7316
						field771[var20] = false; // L: 7317
					}

					var1.serverPacket = null; // L: 7319
					return true; // L: 7320
				}

				if (ServerPacket.field3501 == var1.serverPacket) { // L: 7322
					class160.readReflectionCheck(var3, var1.serverPacketLength); // L: 7323
					var1.serverPacket = null; // L: 7324
					return true; // L: 7325
				}

				if (ServerPacket.field3498 == var1.serverPacket) { // L: 7327
					var20 = var3.method9712(); // L: 7328
					var5 = var3.method9613(); // L: 7329
					Varps.Varps_temp[var20] = var5; // L: 7330
					if (Varps.Varps_main[var20] != var5) { // L: 7331
						Varps.Varps_main[var20] = var5; // L: 7332
					}

					SecureRandomFuture.changeGameOptions(var20); // L: 7334
					field696[++field697 - 1 & 31] = var20; // L: 7335
					var1.serverPacket = null; // L: 7336
					return true; // L: 7337
				}

				if (ServerPacket.field3474 == var1.serverPacket) { // L: 7339
					var21 = var3.method9592(); // L: 7345
					var5 = var3.readUnsignedShort(); // L: 7346
					var20 = var3.method9712(); // L: 7347
					Player var85;
					if (var20 == field706) { // L: 7348
						var85 = SoundCache.localPlayer; // L: 7349
					} else {
						var85 = class20.field91.field1326[var20]; // L: 7352
					}

					var6 = var3.method9586(); // L: 7354
					if (var85 != null) { // L: 7355
						var85.method2481(var21, var5, var6 >> 16, var6 & 65535); // L: 7356
					}

					var1.serverPacket = null; // L: 7358
					return true; // L: 7359
				}

				long var25;
				if (ServerPacket.field3409 == var1.serverPacket) { // L: 7361
					var20 = var3.method9600(); // L: 7362
					if (var20 == 65535) { // L: 7363
						var20 = -1;
					}

					var5 = var3.method9712(); // L: 7364
					if (var5 == 65535) { // L: 7365
						var5 = -1;
					}

					var6 = var3.method9586(); // L: 7366
					var21 = var3.method9586(); // L: 7367

					for (var8 = var5; var8 <= var20; ++var8) { // L: 7368
						var25 = ((long)var21 << 32) + (long)var8; // L: 7369
						Node var89 = widgetFlags.get(var25); // L: 7370
						if (var89 != null) { // L: 7371
							var89.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var25); // L: 7372
					}

					var1.serverPacket = null; // L: 7374
					return true; // L: 7375
				}

				if (ServerPacket.field3517 == var1.serverPacket) { // L: 7377
					var20 = var3.readUnsignedByte(); // L: 7378
					if (var3.readUnsignedByte() == 0) { // L: 7379
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 7380
						var3.offset += 18; // L: 7381
					} else {
						--var3.offset; // L: 7384
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 7385
					}

					field709 = cycleCntr; // L: 7387
					var1.serverPacket = null; // L: 7388
					return true; // L: 7389
				}

				if (ServerPacket.field3531 == var1.serverPacket) { // L: 7391
					class152.field1724 = var3.readBoolean(); // L: 7392
					var1.serverPacket = null; // L: 7393
					return true; // L: 7394
				}

				if (ServerPacket.field3509 == var1.serverPacket) { // L: 7396
					tradeChatMode = var3.method9592(); // L: 7397
					publicChatMode = var3.readUnsignedByte(); // L: 7398
					var1.serverPacket = null; // L: 7399
					return true; // L: 7400
				}

				Widget var24;
				if (ServerPacket.field3451 == var1.serverPacket) { // L: 7402
					var20 = var3.readInt(); // L: 7403
					var5 = var3.method9712(); // L: 7404
					var6 = var3.readUnsignedShort(); // L: 7405
					var21 = var3.readUnsignedShort(); // L: 7406
					var24 = ModeWhere.field4649.method6519(var20); // L: 7407
					if (var5 != var24.modelAngleX || var6 != var24.modelAngleY || var21 != var24.modelZoom) { // L: 7408
						var24.modelAngleX = var5; // L: 7409
						var24.modelAngleY = var6; // L: 7410
						var24.modelZoom = var21; // L: 7411
						TriBool.invalidateWidget(var24); // L: 7412
					}

					var1.serverPacket = null; // L: 7414
					return true; // L: 7415
				}

				if (ServerPacket.field3489 == var1.serverPacket) { // L: 7417
					var20 = var3.method9586(); // L: 7418
					var5 = var3.method9614(); // L: 7419
					var22 = ModeWhere.field4649.method6519(var20); // L: 7420
					class233.method4446(var22, var5); // L: 7421
					TriBool.invalidateWidget(var22); // L: 7422
					var1.serverPacket = null; // L: 7423
					return true; // L: 7424
				}

				if (ServerPacket.field3507 == var1.serverPacket) { // L: 7426
					class31.method462(); // L: 7427
					field677 = var3.readUnsignedShort(); // L: 7428
					field711 = cycleCntr; // L: 7429
					var1.serverPacket = null; // L: 7430
					return true; // L: 7431
				}

				if (ServerPacket.field3438 == var1.serverPacket) { // L: 7433
					class153.method3312(class320.field3380); // L: 7434
					var1.serverPacket = null; // L: 7435
					return true; // L: 7436
				}

				if (ServerPacket.field3441 == var1.serverPacket) { // L: 7438
					class135.method3167(); // L: 7439
					var1.serverPacket = null; // L: 7440
					return false; // L: 7441
				}

				if (ServerPacket.field3427 == var1.serverPacket) { // L: 7443
					ModeWhere.method7431(); // L: 7444
					var70 = var3.readByte(); // L: 7445
					if (var1.serverPacketLength == 1) { // L: 7446
						if (var70 >= 0) { // L: 7447
							currentClanSettings[var70] = null;
						} else {
							class142.guestClanSettings = null; // L: 7448
						}

						var1.serverPacket = null; // L: 7449
						return true; // L: 7450
					}

					if (var70 >= 0) { // L: 7452
						currentClanSettings[var70] = new ClanSettings(var3); // L: 7453
					} else {
						class142.guestClanSettings = new ClanSettings(var3); // L: 7456
					}

					var1.serverPacket = null; // L: 7458
					return true; // L: 7459
				}

				if (ServerPacket.field3466 == var1.serverPacket) { // L: 7461
					isCameraLocked = true; // L: 7462
					field567 = false; // L: 7463
					field764 = true; // L: 7464
					WorldMapLabelSize.field2541 = var3.readUnsignedByte(); // L: 7465
					VarbitComposition.field2102 = var3.readUnsignedByte(); // L: 7466
					var20 = var3.readUnsignedShort(); // L: 7467
					var5 = var3.readUnsignedShort(); // L: 7468
					field804 = var3.readBoolean(); // L: 7469
					var6 = var3.readUnsignedByte(); // L: 7470
					var21 = class376.method7084(WorldMapLabelSize.field2541); // L: 7471
					var8 = class376.method7084(VarbitComposition.field2102); // L: 7472
					boolean var68 = false; // L: 7473
					boolean var65 = false; // L: 7474
					if (field804) { // L: 7475
						var9 = class328.cameraY; // L: 7476
						var10 = class169.method3519(class511.field5137, var21, var8, class511.field5137.field1318) - var20; // L: 7477
					} else {
						var9 = class169.method3519(class511.field5137, class47.cameraX, class60.cameraZ, class511.field5137.field1318) - class328.cameraY; // L: 7480
						var10 = var20; // L: 7481
					}

					field767 = new class509(class47.cameraX, class60.cameraZ, var9, var21, var8, var10, var5, var6); // L: 7483
					var1.serverPacket = null; // L: 7484
					return true; // L: 7485
				}

				long var28;
				long var30;
				String var34;
				long var91;
				if (ServerPacket.field3416 == var1.serverPacket) { // L: 7487
					var51 = var3.readStringCp1252NullTerminated(); // L: 7488
					var28 = var3.readLong(); // L: 7489
					var30 = (long)var3.readUnsignedShort(); // L: 7490
					var25 = (long)var3.readMedium(); // L: 7491
					PlayerType var27 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var3.readUnsignedByte()); // L: 7492
					var91 = (var30 << 32) + var25; // L: 7493
					boolean var69 = false; // L: 7494

					for (var15 = 0; var15 < 100; ++var15) { // L: 7495
						if (field737[var15] == var91) { // L: 7496
							var69 = true; // L: 7497
							break; // L: 7498
						}
					}

					if (var27.isUser && class135.friendSystem.isIgnored(new Username(var51, Projectile.loginType))) { // L: 7501 7502
						var69 = true;
					}

					if (!var69 && field625 == 0) { // L: 7504
						field737[field738] = var91; // L: 7505
						field738 = (field738 + 1) % 100; // L: 7506
						var34 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(var3))); // L: 7507
						if (var27.modIcon != -1) { // L: 7508
							ArchiveDiskAction.addChatMessage(9, class385.method7175(var27.modIcon) + var51, var34, class237.base37DecodeLong(var28));
						} else {
							ArchiveDiskAction.addChatMessage(9, var51, var34, class237.base37DecodeLong(var28)); // L: 7509
						}
					}

					var1.serverPacket = null; // L: 7511
					return true; // L: 7512
				}

				class103 var78;
				if (ServerPacket.field3403 == var1.serverPacket) { // L: 7514
					var6 = var3.method9600(); // L: 7520
					var20 = var3.method9599(); // L: 7521
					var78 = class20.field91.field1315[var20]; // L: 7522
					var21 = var3.method9592(); // L: 7523
					var5 = var3.readInt(); // L: 7524
					if (var78 != null) { // L: 7525
						var78.method2481(var21, var6, var5 >> 16, var5 & 65535); // L: 7526
					}

					var1.serverPacket = null; // L: 7528
					return true; // L: 7529
				}

				InterfaceParent var7;
				if (ServerPacket.field3485 == var1.serverPacket) { // L: 7531
					var20 = var3.method9592(); // L: 7532
					var5 = var3.method9599(); // L: 7533
					var6 = var3.readInt(); // L: 7534
					var7 = (InterfaceParent)interfaceParents.get((long)var6); // L: 7535
					if (var7 != null) { // L: 7536
						ArchiveDiskActionHandler.closeInterface(var7, var5 != var7.group);
					}

					class393.method7338(var6, var5, var20); // L: 7537
					var1.serverPacket = null; // L: 7538
					return true; // L: 7539
				}

				if (ServerPacket.field3443 == var1.serverPacket) { // L: 7541
					class153.method3312(class320.field3386); // L: 7542
					var1.serverPacket = null; // L: 7543
					return true; // L: 7544
				}

				if (ServerPacket.field3492 == var1.serverPacket) { // L: 7546
					var20 = var3.method9590(); // L: 7547
					var5 = var3.readUnsignedShort(); // L: 7548
					if (var5 == 65535) { // L: 7549
						var5 = -1; // L: 7550
					}

					Canvas.method324(SoundCache.localPlayer, var5, var20); // L: 7552
					var1.serverPacket = null; // L: 7553
					return true; // L: 7554
				}

				if (ServerPacket.field3423 == var1.serverPacket) { // L: 7556
					class4.method18(class20.field91, var3); // L: 7557
					var1.serverPacket = null; // L: 7558
					return true; // L: 7559
				}

				if (ServerPacket.field3514 == var1.serverPacket) { // L: 7561
					return this.method1277(var1, 1); // L: 7562
				}

				if (ServerPacket.field3448 == var1.serverPacket) { // L: 7564
					var20 = var3.offset + var1.serverPacketLength; // L: 7565
					var5 = var3.readUnsignedShort(); // L: 7566
					if (var5 == 65535) { // L: 7567
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 7568
					if (var5 != rootInterface) { // L: 7569
						rootInterface = var5; // L: 7570
						this.resizeRoot(false); // L: 7571
						class137.method3176(rootInterface); // L: 7572
						class7.method56(rootInterface); // L: 7573

						for (var21 = 0; var21 < 100; ++var21) { // L: 7574
							field721[var21] = true;
						}
					}

					InterfaceParent var94;
					for (; var6-- > 0; var94.field1076 = true) { // L: 7576 7586
						var21 = var3.readInt(); // L: 7577
						var8 = var3.readUnsignedShort(); // L: 7578
						var9 = var3.readUnsignedByte(); // L: 7579
						var94 = (InterfaceParent)interfaceParents.get((long)var21); // L: 7580
						if (var94 != null && var8 != var94.group) { // L: 7581
							ArchiveDiskActionHandler.closeInterface(var94, true); // L: 7582
							var94 = null; // L: 7583
						}

						if (var94 == null) { // L: 7585
							var94 = class393.method7338(var21, var8, var9);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) { // L: 7588
						if (var7.field1076) { // L: 7589
							var7.field1076 = false;
						} else {
							ArchiveDiskActionHandler.closeInterface(var7, true); // L: 7591
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7594

					while (var3.offset < var20) { // L: 7595
						var21 = var3.readInt(); // L: 7596
						var8 = var3.readUnsignedShort(); // L: 7597
						var9 = var3.readUnsignedShort(); // L: 7598
						var10 = var3.readInt(); // L: 7599

						for (var62 = var8; var62 <= var9; ++var62) { // L: 7600
							var91 = ((long)var21 << 32) + (long)var62; // L: 7601
							widgetFlags.put(new IntegerNode(var10), var91); // L: 7602
						}
					}

					var1.serverPacket = null; // L: 7605
					return true; // L: 7606
				}

				if (ServerPacket.field3462 == var1.serverPacket) { // L: 7608
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 7609
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) { // L: 7610
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 7611
							SecureRandomFuture.changeGameOptions(var20); // L: 7612
							field696[++field697 - 1 & 31] = var20; // L: 7613
						}
					}

					var1.serverPacket = null; // L: 7616
					return true; // L: 7617
				}

				if (ServerPacket.field3512 == var1.serverPacket) { // L: 7619
					return this.method1277(var1, 2); // L: 7620
				}

				if (ServerPacket.field3436 == var1.serverPacket) { // L: 7622
					isCameraLocked = true; // L: 7623
					field567 = false; // L: 7624
					field553 = true; // L: 7625
					class327.field3558 = var3.readUnsignedByte(); // L: 7626
					class96.field1188 = var3.readUnsignedByte(); // L: 7627
					class6.field16 = var3.readUnsignedShort(); // L: 7628
					var20 = var3.readUnsignedShort(); // L: 7629
					var5 = var3.readUnsignedByte(); // L: 7630
					var6 = class376.method7084(class327.field3558); // L: 7631
					var21 = class376.method7084(class96.field1188); // L: 7632
					var8 = class169.method3519(class511.field5137, var6, var21, class511.field5137.field1318) - class6.field16; // L: 7633
					var9 = var6 - class47.cameraX; // L: 7634
					var10 = var8 - class328.cameraY; // L: 7635
					var62 = var21 - class60.cameraZ; // L: 7636
					double var32 = Math.sqrt((double)(var9 * var9 + var62 * var62)); // L: 7637
					var67 = class151.method3293((int)(Math.atan2((double)var10, var32) * 325.9490051269531D) & 2047); // L: 7638
					var15 = WorldMapLabelSize.method4572((int)(Math.atan2((double)var9, (double)var62) * -325.9490051269531D) & 2047); // L: 7639
					field769 = new class510(Language.cameraPitch, var67, var20, var5); // L: 7640
					field768 = new class510(class337.cameraYaw, var15, var20, var5); // L: 7641
					var1.serverPacket = null; // L: 7642
					return true; // L: 7643
				}

				if (ServerPacket.field3526 == var1.serverPacket) { // L: 7645
					field524 = var3.readUnsignedByte(); // L: 7646
					if (field524 == 1) { // L: 7647
						field794 = var3.readUnsignedShort();
					}

					if (field524 >= 2 && field524 <= 6) { // L: 7648
						if (field524 == 2) { // L: 7649
							field600 = 64; // L: 7650
							field531 = 64; // L: 7651
						}

						if (field524 == 3) { // L: 7653
							field600 = 0; // L: 7654
							field531 = 64; // L: 7655
						}

						if (field524 == 4) { // L: 7657
							field600 = 128; // L: 7658
							field531 = 64; // L: 7659
						}

						if (field524 == 5) { // L: 7661
							field600 = 64; // L: 7662
							field531 = 0; // L: 7663
						}

						if (field524 == 6) { // L: 7665
							field600 = 64; // L: 7666
							field531 = 128; // L: 7667
						}

						field524 = 2; // L: 7669
						field527 = var3.readUnsignedShort(); // L: 7670
						field787 = var3.readUnsignedShort(); // L: 7671
						field543 = var3.readUnsignedByte() * 2; // L: 7672
					}

					if (field524 == 10) { // L: 7674
						field526 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7675
					return true; // L: 7676
				}

				if (ServerPacket.field3419 == var1.serverPacket) { // L: 7678
					field752 = var3.readUnsignedByte(); // L: 7679
					if (field752 == 255) { // L: 7680
						field752 = 0;
					}

					field753 = var3.readUnsignedByte(); // L: 7681
					if (field753 == 255) { // L: 7682
						field753 = 0;
					}

					var1.serverPacket = null; // L: 7683
					return true; // L: 7684
				}

				if (ServerPacket.field3424 == var1.serverPacket) { // L: 7686
					var3.offset += 28; // L: 7687
					if (var3.checkCrc()) { // L: 7688
						FloorUnderlayDefinition.method3799(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7689
					return true; // L: 7690
				}

				if (ServerPacket.field3401 == var1.serverPacket) { // L: 7692
					for (var20 = 0; var20 < VarpDefinition.field1874; ++var20) { // L: 7693
						VarpDefinition var82 = MilliClock.VarpDefinition_get(var20); // L: 7694
						if (var82 != null) { // L: 7695
							Varps.Varps_temp[var20] = 0; // L: 7696
							Varps.Varps_main[var20] = 0; // L: 7697
						}
					}

					class31.method462(); // L: 7700
					field697 += 32; // L: 7701
					var1.serverPacket = null; // L: 7702
					return true; // L: 7703
				}

				if (ServerPacket.field3502 == var1.serverPacket) { // L: 7705
					var20 = var3.method9700(); // L: 7706
					var5 = var3.method9586(); // L: 7707
					var22 = ModeWhere.field4649.method6519(var5); // L: 7708
					if (var20 != var22.sequenceId || var20 == -1) { // L: 7709
						var22.sequenceId = var20; // L: 7710
						var22.modelFrame = 0; // L: 7711
						var22.modelFrameCycle = 0; // L: 7712
						TriBool.invalidateWidget(var22); // L: 7713
					}

					var1.serverPacket = null; // L: 7715
					return true; // L: 7716
				}

				if (ServerPacket.field3522 == var1.serverPacket) { // L: 7718
					var20 = var3.readInt(); // L: 7719
					var5 = var3.readUnsignedShort(); // L: 7720
					if (var20 < -70000) { // L: 7721
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7723
						var22 = ModeWhere.field4649.method6519(var20);
					} else {
						var22 = null; // L: 7724
					}

					for (; var3.offset < var1.serverPacketLength; TaskHandler.itemContainerSetItem(var5, var21, var8 - 1, var9)) { // L: 7725 7739
						var21 = var3.readUShortSmart(); // L: 7726
						var8 = var3.readUnsignedShort(); // L: 7727
						var9 = 0; // L: 7728
						if (var8 != 0) { // L: 7729
							var9 = var3.readUnsignedByte(); // L: 7730
							if (var9 == 255) { // L: 7731
								var9 = var3.readInt();
							}
						}

						if (var22 != null && var21 >= 0 && var21 < var22.field3962.length) { // L: 7733 7734
							var22.field3962[var21] = var8; // L: 7735
							var22.field3963[var21] = var9; // L: 7736
						}
					}

					if (var22 != null) { // L: 7741
						TriBool.invalidateWidget(var22);
					}

					class31.method462(); // L: 7742
					field698[++field620 - 1 & 31] = var5 & 32767; // L: 7743
					var1.serverPacket = null; // L: 7744
					return true; // L: 7745
				}

				boolean var54;
				if (ServerPacket.field3479 == var1.serverPacket) { // L: 7747
					var20 = var3.readUShortSmart(); // L: 7748
					var54 = var3.readUnsignedByte() == 1; // L: 7749
					var81 = ""; // L: 7750
					boolean var87 = false; // L: 7751
					if (var54) { // L: 7752
						var81 = var3.readStringCp1252NullTerminated(); // L: 7753
						if (class135.friendSystem.isIgnored(new Username(var81, Projectile.loginType))) { // L: 7754
							var87 = true;
						}
					}

					String var79 = var3.readStringCp1252NullTerminated(); // L: 7756
					if (!var87) { // L: 7757
						VarbitComposition.addGameMessage(var20, var81, var79);
					}

					var1.serverPacket = null; // L: 7758
					return true; // L: 7759
				}

				if (ServerPacket.field3513 == var1.serverPacket) { // L: 7761
					var20 = var3.method9599(); // L: 7762
					var5 = var3.method9586(); // L: 7763
					var22 = ModeWhere.field4649.method6519(var5); // L: 7764
					if (var22.modelType != 2 || var20 != var22.modelId) { // L: 7765
						var22.modelType = 2; // L: 7766
						var22.modelId = var20; // L: 7767
						TriBool.invalidateWidget(var22); // L: 7768
					}

					var1.serverPacket = null; // L: 7770
					return true; // L: 7771
				}

				if (ServerPacket.field3430 == var1.serverPacket) { // L: 7773
					var51 = var3.readStringCp1252NullTerminated(); // L: 7774
					Object[] var80 = new Object[var51.length() + 1]; // L: 7775

					for (var6 = var51.length() - 1; var6 >= 0; --var6) { // L: 7776
						if (var51.charAt(var6) == 's') { // L: 7777
							var80[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var80[var6 + 1] = new Integer(var3.readInt()); // L: 7778
						}
					}

					var80[0] = new Integer(var3.readInt()); // L: 7780
					ScriptEvent var90 = new ScriptEvent(); // L: 7781
					var90.args = var80; // L: 7782
					Projectile.runScriptEvent(var90); // L: 7783
					var1.serverPacket = null; // L: 7784
					return true; // L: 7785
				}

				if (ServerPacket.field3408 == var1.serverPacket) { // L: 7787
					class153.method3312(class320.field3383); // L: 7788
					var1.serverPacket = null; // L: 7789
					return true; // L: 7790
				}

				if (ServerPacket.field3472 == var1.serverPacket) { // L: 7792
					isCameraLocked = true; // L: 7793
					field567 = false; // L: 7794
					field553 = true; // L: 7795
					var20 = var3.readShort(); // L: 7796
					var5 = var3.readShort(); // L: 7797
					var6 = class151.method3293(var5 + Language.cameraPitch & 2027); // L: 7798
					var21 = var20 + class337.cameraYaw; // L: 7799
					var8 = var3.readUnsignedShort(); // L: 7800
					var9 = var3.readUnsignedByte(); // L: 7801
					field769 = new class510(Language.cameraPitch, var6, var8, var9); // L: 7802
					field768 = new class510(class337.cameraYaw, var21, var8, var9); // L: 7803
					var1.serverPacket = null; // L: 7804
					return true; // L: 7805
				}

				if (ServerPacket.field3460 == var1.serverPacket) { // L: 7807
					ModeWhere.method7431(); // L: 7808
					var70 = var3.readByte(); // L: 7809
					class150 var77 = new class150(var3); // L: 7810
					ClanSettings var86;
					if (var70 >= 0) { // L: 7812
						var86 = currentClanSettings[var70];
					} else {
						var86 = class142.guestClanSettings; // L: 7813
					}

					if (var86 == null) { // L: 7814
						this.method1404(var70); // L: 7815
						var1.serverPacket = null; // L: 7816
						return true; // L: 7817
					}

					if (var77.field1707 > var86.field1762) { // L: 7819
						this.method1404(var70); // L: 7820
						var1.serverPacket = null; // L: 7821
						return true; // L: 7822
					}

					if (var77.field1707 < var86.field1762) { // L: 7824
						var1.serverPacket = null; // L: 7825
						return true; // L: 7826
					}

					var77.method3286(var86); // L: 7828
					var1.serverPacket = null; // L: 7829
					return true; // L: 7830
				}

				if (ServerPacket.field3521 == var1.serverPacket) { // L: 7832
					class325.loadRegions(true, var1.packetBuffer); // L: 7833
					var1.serverPacket = null; // L: 7834
					return true; // L: 7835
				}

				if (ServerPacket.field3486 == var1.serverPacket) { // L: 7837
					var20 = var3.method9600(); // L: 7838
					var5 = var3.method9586(); // L: 7839
					var6 = var20 >> 10 & 31; // L: 7840
					var21 = var20 >> 5 & 31; // L: 7841
					var8 = var20 & 31; // L: 7842
					var9 = (var21 << 11) + (var6 << 19) + (var8 << 3); // L: 7843
					Widget var93 = ModeWhere.field4649.method6519(var5); // L: 7844
					if (var9 != var93.color) { // L: 7845
						var93.color = var9; // L: 7846
						TriBool.invalidateWidget(var93); // L: 7847
					}

					var1.serverPacket = null; // L: 7849
					return true; // L: 7850
				}

				if (ServerPacket.field3464 == var1.serverPacket) { // L: 7852
					var20 = var3.readUnsignedShort(); // L: 7853
					var5 = var3.method9613(); // L: 7854
					var22 = ModeWhere.field4649.method6519(var5); // L: 7855
					if (var22 != null && var22.type == 0) { // L: 7856
						if (var20 > var22.scrollHeight - var22.height) { // L: 7857
							var20 = var22.scrollHeight - var22.height;
						}

						if (var20 < 0) { // L: 7858
							var20 = 0;
						}

						if (var20 != var22.scrollY) { // L: 7859
							var22.scrollY = var20; // L: 7860
							TriBool.invalidateWidget(var22); // L: 7861
						}
					}

					var1.serverPacket = null; // L: 7864
					return true; // L: 7865
				}

				if (ServerPacket.field3477 == var1.serverPacket) { // L: 7867
					var5 = var3.method9712(); // L: 7870
					var20 = var3.method9599(); // L: 7871
					class137.method3187(var20, var5); // L: 7872
					var1.serverPacket = null; // L: 7873
					return true; // L: 7874
				}

				if (ServerPacket.field3456 == var1.serverPacket) { // L: 7876
					var64 = var3.method9712(); // L: 7892
					var67 = var3.method9591() * 4; // L: 7893
					var16 = var3.method9599(); // L: 7894
					var62 = var3.method9607(); // L: 7895
					var17 = var3.method9592(); // L: 7896
					var63 = var3.readByte(); // L: 7897
					var18 = var3.method9590(); // L: 7898
					var6 = var3.method9760(); // L: 7899
					var20 = var6 >> 16; // L: 7900
					var5 = var6 >> 8 & 255; // L: 7901
					var21 = var20 + (var6 >> 4 & 7); // L: 7902
					var8 = var5 + (var6 & 7); // L: 7903
					var61 = var3.method9595(); // L: 7904
					var66 = var3.method9592() * 4; // L: 7905
					var15 = var3.readUnsignedShort(); // L: 7906
					var9 = var63 + var21; // L: 7907
					var10 = var61 + var8; // L: 7908
					if (var21 >= 0 && var8 >= 0 && var21 < class20.field91.field1332 && var8 < class20.field91.field1320 && var9 >= 0 && var10 >= 0 && var9 < class20.field91.field1332 && var10 < class20.field91.field1320 && var64 != 65535) { // L: 7909
						var21 = class376.method7084(var21); // L: 7910
						var8 = class376.method7084(var8); // L: 7911
						var9 = class376.method7084(var9); // L: 7912
						var10 = class376.method7084(var10); // L: 7913
						var19 = new Projectile(var64, class20.field91.field1318, var21, var8, class169.method3519(class20.field91, var21, var8, class20.field91.field1318) - var66, var15 + cycle, var16 + cycle, var17, var18, var62, var67); // L: 7914
						var19.setDestination(var9, var10, class169.method3519(class20.field91, var9, var10, class20.field91.field1318) - var67, var15 + cycle); // L: 7915
						class20.field91.field1324.addFirst(var19); // L: 7916
					}

					var1.serverPacket = null; // L: 7918
					return true; // L: 7919
				}

				if (ServerPacket.field3402 == var1.serverPacket) { // L: 7921
					class304.method6030(class20.field91, var3); // L: 7922
					var1.serverPacket = null; // L: 7923
					return true; // L: 7924
				}

				if (ServerPacket.field3445 == var1.serverPacket) { // L: 7926
					class20.field91.field1319.method2826(var3, var1.serverPacketLength); // L: 7927
					class237.method4482(); // L: 7928
					var1.serverPacket = null; // L: 7929
					return true; // L: 7930
				}

				if (ServerPacket.field3482 == var1.serverPacket) { // L: 7932
					class522.privateChatMode = class6.method40(var3.readUnsignedByte()); // L: 7933
					var1.serverPacket = null; // L: 7934
					return true; // L: 7935
				}

				if (ServerPacket.field3449 == var1.serverPacket) { // L: 7937
					var20 = var3.method9712(); // L: 7938
					var5 = var3.method9614(); // L: 7939
					var22 = ModeWhere.field4649.method6519(var5); // L: 7940
					if (var22.modelType != 6 || var20 != var22.modelId) { // L: 7941
						var22.modelType = 6; // L: 7942
						var22.modelId = var20; // L: 7943
						TriBool.invalidateWidget(var22); // L: 7944
					}

					var1.serverPacket = null; // L: 7946
					return true; // L: 7947
				}

				if (ServerPacket.field3437 == var1.serverPacket) { // L: 7949
					var20 = var3.method9600(); // L: 7950
					var5 = var3.method9586(); // L: 7951
					short var60 = (short)var3.method9603(); // L: 7952
					var21 = var3.method9590(); // L: 7953
					var78 = class20.field91.field1315[var20]; // L: 7954
					if (var78 != null) { // L: 7955
						var78.method2709(var21, var5, var60); // L: 7956
					}

					var1.serverPacket = null; // L: 7958
					return true; // L: 7959
				}

				if (ServerPacket.field3490 == var1.serverPacket) { // L: 7961
					byte[] var53 = new byte[var1.serverPacketLength]; // L: 7962
					var3.method9505(var53, 0, var53.length); // L: 7963
					Buffer var76 = new Buffer(var53); // L: 7964
					var81 = var76.readStringCp1252NullTerminated(); // L: 7965
					class421.openURL(var81, true, false); // L: 7966
					var1.serverPacket = null; // L: 7967
					return true; // L: 7968
				}

				if (ServerPacket.field3487 == var1.serverPacket) { // L: 7970
					class153.method3312(class320.field3378); // L: 7971
					var1.serverPacket = null; // L: 7972
					return true; // L: 7973
				}

				if (ServerPacket.field3524 == var1.serverPacket) { // L: 7975
					class96.field1171 = new class486(PlayerType.field4444); // L: 7976
					var1.serverPacket = null; // L: 7977
					return true; // L: 7978
				}

				if (ServerPacket.field3480 == var1.serverPacket) { // L: 7980
					var6 = var3.readUnsignedShort(); // L: 7987
					var5 = var3.method9600(); // L: 7988
					if (var5 == 65535) { // L: 7989
						var5 = -1; // L: 7990
					}

					var21 = var3.method9712(); // L: 7992
					var9 = var3.readUnsignedShort(); // L: 7993
					var8 = var3.method9712(); // L: 7994
					var20 = var3.method9600(); // L: 7995
					if (var20 == 65535) { // L: 7996
						var20 = -1; // L: 7997
					}

					ArrayList var92 = new ArrayList(); // L: 7999
					var92.add(var20); // L: 8000
					var92.add(var5); // L: 8001
					class498.method8899(var92, var6, var21, var8, var9); // L: 8002
					var1.serverPacket = null; // L: 8003
					return true; // L: 8004
				}

				if (ServerPacket.field3413 == var1.serverPacket) { // L: 8006
					var20 = var3.method9614(); // L: 8007
					var23 = var3.readStringCp1252NullTerminated(); // L: 8008
					var22 = ModeWhere.field4649.method6519(var20); // L: 8009
					if (!var23.equals(var22.text)) { // L: 8010
						var22.text = var23; // L: 8011
						TriBool.invalidateWidget(var22); // L: 8012
					}

					var1.serverPacket = null; // L: 8014
					return true; // L: 8015
				}

				if (ServerPacket.field3504 == var1.serverPacket) { // L: 8017
					var20 = var3.method9614(); // L: 8018
					var5 = var3.method9600(); // L: 8019
					var22 = ModeWhere.field4649.method6519(var20); // L: 8020
					if (var22.modelType != 1 || var5 != var22.modelId) { // L: 8021
						var22.modelType = 1; // L: 8022
						var22.modelId = var5; // L: 8023
						TriBool.invalidateWidget(var22); // L: 8024
					}

					var1.serverPacket = null; // L: 8026
					return true; // L: 8027
				}

				if (ServerPacket.field3446 == var1.serverPacket) { // L: 8029
					var6 = var3.method9785(); // L: 8040
					var20 = var6 >> 16; // L: 8041
					var5 = var6 >> 8 & 255; // L: 8042
					var21 = var20 + (var6 >> 4 & 7); // L: 8043
					var8 = var5 + (var6 & 7); // L: 8044
					var9 = var3.method9591(); // L: 8045
					var10 = var9 >> 2; // L: 8046
					var62 = var9 & 3; // L: 8047
					var64 = field579[var10]; // L: 8048
					var66 = var3.method9712(); // L: 8049
					if (0 <= var21 && var21 < 103 && 0 <= var8 && var8 < 103) { // L: 8050
						class36.method702(var21, var8, var10, var62, var64, var66); // L: 8051
					}

					var1.serverPacket = null; // L: 8053
					return true; // L: 8054
				}

				if (ServerPacket.field3432 == var1.serverPacket) { // L: 8056
					WorldMapID.method5008(class20.field91, true, var3); // L: 8057
					var1.serverPacket = null; // L: 8058
					return true; // L: 8059
				}

				if (ServerPacket.field3503 == var1.serverPacket) { // L: 8061
					class153.method3312(class320.field3388); // L: 8062
					var1.serverPacket = null; // L: 8063
					return true; // L: 8064
				}

				if (ServerPacket.field3493 == var1.serverPacket) { // L: 8066
					field659 = cycleCntr; // L: 8067
					var70 = var3.readByte(); // L: 8068
					class164 var74 = new class164(var3); // L: 8069
					ClanChannel var72;
					if (var70 >= 0) { // L: 8071
						var72 = currentClanChannels[var70];
					} else {
						var72 = class276.guestClanChannel; // L: 8072
					}

					if (var72 == null) { // L: 8073
						this.method1287(var70); // L: 8074
						var1.serverPacket = null; // L: 8075
						return true; // L: 8076
					}

					if (var74.field1808 > var72.field1821) { // L: 8078
						this.method1287(var70); // L: 8079
						var1.serverPacket = null; // L: 8080
						return true; // L: 8081
					}

					if (var74.field1808 < var72.field1821) { // L: 8083
						var1.serverPacket = null; // L: 8084
						return true; // L: 8085
					}

					var74.method3453(var72); // L: 8087
					var1.serverPacket = null; // L: 8088
					return true; // L: 8089
				}

				if (ServerPacket.field3431 == var1.serverPacket) { // L: 8091
					class135.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 8092
					class153.FriendSystem_invalidateIgnoreds(); // L: 8093
					field705 = cycleCntr; // L: 8094
					var1.serverPacket = null; // L: 8095
					return true; // L: 8096
				}

				if (ServerPacket.field3520 == var1.serverPacket) { // L: 8098
					WorldMapID.method5008(class20.field91, false, var3); // L: 8099
					var1.serverPacket = null; // L: 8100
					return true; // L: 8101
				}

				if (ServerPacket.field3459 == var1.serverPacket) { // L: 8103
					class31.method462(); // L: 8104
					var20 = var3.readInt(); // L: 8105
					var5 = var3.method9592(); // L: 8106
					var6 = var3.method9592(); // L: 8107
					experience[var6] = var20; // L: 8108
					currentLevels[var6] = var5; // L: 8109
					levels[var6] = 1; // L: 8110
					field775[var6] = var5; // L: 8111

					for (var21 = 0; var21 < 98; ++var21) { // L: 8112
						if (var20 >= Skills.Skills_experienceTable[var21]) {
							levels[var6] = var21 + 2;
						}
					}

					field687[++field701 - 1 & 31] = var6; // L: 8113
					var1.serverPacket = null; // L: 8114
					return true; // L: 8115
				}

				if (ServerPacket.field3425 == var1.serverPacket) { // L: 8117
					var70 = var3.method9595(); // L: 8118
					var5 = var3.method9712(); // L: 8119
					Varps.Varps_temp[var5] = var70; // L: 8120
					if (Varps.Varps_main[var5] != var70) { // L: 8121
						Varps.Varps_main[var5] = var70; // L: 8122
					}

					SecureRandomFuture.changeGameOptions(var5); // L: 8124
					field696[++field697 - 1 & 31] = var5; // L: 8125
					var1.serverPacket = null; // L: 8126
					return true; // L: 8127
				}

				if (ServerPacket.field3535 == var1.serverPacket) { // L: 8129
					ChatChannel.field1030 = var3.readBoolean(); // L: 8130
					var1.serverPacket = null; // L: 8131
					return true; // L: 8132
				}

				if (ServerPacket.field3506 == var1.serverPacket) { // L: 8134
					++field516; // L: 8135
					var1.serverPacket = null; // L: 8136
					return true; // L: 8137
				}

				if (ServerPacket.field3476 == var1.serverPacket) { // L: 8139
					var9 = var3.method9712(); // L: 8148
					var62 = var3.method9599(); // L: 8149
					var6 = var3.method9785(); // L: 8150
					var20 = var6 >> 16; // L: 8151
					var5 = var6 >> 8 & 255; // L: 8152
					var21 = var20 + (var6 >> 4 & 7); // L: 8153
					var8 = var5 + (var6 & 7); // L: 8154
					var10 = var3.method9592(); // L: 8155
					if (var21 >= 0 && var8 >= 0 && var21 < class20.field91.field1332 && var8 < class20.field91.field1320) { // L: 8156
						var21 = class376.method7084(var21); // L: 8157
						var8 = class376.method7084(var8); // L: 8158
						GraphicsObject var95 = new GraphicsObject(var9, class20.field91.field1318, var21, var8, class169.method3519(class20.field91, var21, var8, class20.field91.field1318) - var10, var62, cycle); // L: 8159
						class20.field91.field1337.addFirst(var95); // L: 8160
					}

					var1.serverPacket = null; // L: 8162
					return true; // L: 8163
				}

				if (ServerPacket.field3458 == var1.serverPacket) { // L: 8165
					class135.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 8166
					field705 = cycleCntr; // L: 8167
					var1.serverPacket = null; // L: 8168
					return true; // L: 8169
				}

				if (ServerPacket.field3484 == var1.serverPacket) { // L: 8171
					var83 = var3.method9590() == 1; // L: 8172
					var5 = var3.readInt(); // L: 8173
					var22 = ModeWhere.field4649.method6519(var5); // L: 8174
					MusicPatchPcmStream.method6417(var22, SoundCache.localPlayer.appearance, var83); // L: 8175
					TriBool.invalidateWidget(var22); // L: 8176
					var1.serverPacket = null; // L: 8177
					return true; // L: 8178
				}

				boolean var11;
				String var37;
				if (ServerPacket.field3488 == var1.serverPacket) { // L: 8180
					var70 = var3.readByte(); // L: 8181
					var28 = (long)var3.readUnsignedShort(); // L: 8182
					var30 = (long)var3.readMedium(); // L: 8183
					var25 = var30 + (var28 << 32); // L: 8184
					var11 = false; // L: 8185
					ClanChannel var36 = var70 >= 0 ? currentClanChannels[var70] : class276.guestClanChannel; // L: 8186
					if (var36 == null) { // L: 8187
						var11 = true;
					} else {
						for (var66 = 0; var66 < 100; ++var66) { // L: 8189
							if (field737[var66] == var25) { // L: 8190
								var11 = true; // L: 8191
								break; // L: 8192
							}
						}
					}

					if (!var11) { // L: 8196
						field737[field738] = var25; // L: 8197
						field738 = (field738 + 1) % 100; // L: 8198
						var37 = SpotAnimationDefinition.method3789(var3); // L: 8199
						var67 = var70 >= 0 ? 43 : 46; // L: 8200
						ArchiveDiskAction.addChatMessage(var67, "", var37, var36.name); // L: 8201
					}

					var1.serverPacket = null; // L: 8203
					return true; // L: 8204
				}

				if (ServerPacket.field3447 == var1.serverPacket) { // L: 8206
					isCameraLocked = true; // L: 8207
					field567 = false; // L: 8208
					field553 = true; // L: 8209
					var20 = WorldMapLabelSize.method4572(var3.readShort() & 2027); // L: 8210
					var5 = class151.method3293(var3.readShort() & 2027); // L: 8211
					var6 = var3.readUnsignedShort(); // L: 8212
					var21 = var3.readUnsignedByte(); // L: 8213
					field769 = new class510(Language.cameraPitch, var5, var6, var21); // L: 8214
					field768 = new class510(class337.cameraYaw, var20, var6, var21); // L: 8215
					var1.serverPacket = null; // L: 8216
					return true; // L: 8217
				}

				if (ServerPacket.field3467 == var1.serverPacket) { // L: 8219
					class325.loadRegions(false, var1.packetBuffer); // L: 8220
					var1.serverPacket = null; // L: 8221
					return true; // L: 8222
				}

				if (ServerPacket.field3422 == var1.serverPacket) { // L: 8224
					class153.method3312(class320.field3384); // L: 8225
					var1.serverPacket = null; // L: 8226
					return true; // L: 8227
				}

				if (ServerPacket.field3470 == var1.serverPacket) { // L: 8229
					if (class96.field1171 == null) { // L: 8230
						class96.field1171 = new class486(PlayerType.field4444);
					}

					class555 var52 = PlayerType.field4444.method8802(var3); // L: 8231
					class96.field1171.field5032.vmethod9294(var52.field5428, var52.field5429); // L: 8232
					field571[++field719 - 1 & 31] = var52.field5428; // L: 8233
					var1.serverPacket = null; // L: 8234
					return true; // L: 8235
				}

				if (ServerPacket.field3471 == var1.serverPacket) { // L: 8237
					var20 = var3.readUnsignedByte(); // L: 8238
					class199.method3809(var20); // L: 8239
					var1.serverPacket = null; // L: 8240
					return true; // L: 8241
				}

				if (ServerPacket.field3455 == var1.serverPacket) { // L: 8243
					minimapState = var3.readUnsignedByte(); // L: 8244
					var1.serverPacket = null; // L: 8245
					return true; // L: 8246
				}

				if (ServerPacket.field3510 == var1.serverPacket) { // L: 8248
					var20 = var3.method9600(); // L: 8249
					if (var20 == 65535) { // L: 8250
						var20 = -1;
					}

					VarbitComposition.playSong(var20); // L: 8251
					var1.serverPacket = null; // L: 8252
					return true; // L: 8253
				}

				if (ServerPacket.field3407 == var1.serverPacket) { // L: 8255
					var20 = var3.method9712(); // L: 8256
					if (var20 == 65535) { // L: 8257
						var20 = -1;
					}

					var5 = var3.method9708(); // L: 8258
					LoginScreenAnimation.method2551(var20, var5); // L: 8259
					var1.serverPacket = null; // L: 8260
					return true; // L: 8261
				}

				if (ServerPacket.field3478 == var1.serverPacket) { // L: 8263
					UserComparator7.method3002(var3.readStringCp1252NullTerminated()); // L: 8264
					var1.serverPacket = null; // L: 8265
					return true; // L: 8266
				}

				if (ServerPacket.field3410 == var1.serverPacket) { // L: 8268
					var20 = var3.method9600(); // L: 8269
					StructComposition.method3870(var20); // L: 8270
					field698[++field620 - 1 & 31] = var20 & 32767; // L: 8271
					var1.serverPacket = null; // L: 8272
					return true; // L: 8273
				}

				if (ServerPacket.field3433 == var1.serverPacket) { // L: 8275
					var83 = var3.readBoolean(); // L: 8276
					if (var83) { // L: 8277
						if (class485.field5030 == null) { // L: 8278
							class485.field5030 = new class398();
						}
					} else {
						class485.field5030 = null; // L: 8280
					}

					var1.serverPacket = null; // L: 8281
					return true; // L: 8282
				}

				if (ServerPacket.field3508 == var1.serverPacket) { // L: 8284
					var20 = var3.readInt(); // L: 8285
					var5 = var3.readInt(); // L: 8286
					var6 = EnumComposition.getGcDuration(); // L: 8287
					PacketBufferNode var57 = class170.getPacketBufferNode(ClientPacket.field3360, packetWriter.isaacCipher); // L: 8289
					var57.packetBuffer.method9756(var6); // L: 8290
					var57.packetBuffer.method9609(var20); // L: 8291
					var57.packetBuffer.writeInt(var5); // L: 8292
					var57.packetBuffer.method9587(GameEngine.fps); // L: 8293
					packetWriter.addNode(var57); // L: 8294
					var1.serverPacket = null; // L: 8295
					return true; // L: 8296
				}

				if (ServerPacket.field3406 == var1.serverPacket) { // L: 8298
					var20 = var3.readUnsignedShort(); // L: 8299
					var5 = var3.readUnsignedByte(); // L: 8300
					var6 = var3.readUnsignedShort(); // L: 8301
					SoundCache.queueSoundEffect(var20, var5, var6); // L: 8302
					var1.serverPacket = null; // L: 8303
					return true; // L: 8304
				}

				if (ServerPacket.field3414 == var1.serverPacket) { // L: 8306
					var6 = var3.readUnsignedShort(); // L: 8311
					var21 = var3.method9600(); // L: 8312
					var5 = var3.readUnsignedShort(); // L: 8313
					var20 = var3.readUnsignedShort(); // L: 8314
					class108.method2812(var20, var5, var6, var21); // L: 8315
					var1.serverPacket = null; // L: 8316
					return true; // L: 8317
				}

				boolean var12;
				if (ServerPacket.field3420 == var1.serverPacket) { // L: 8319
					var51 = var3.readStringCp1252NullTerminated(); // L: 8320
					var28 = (long)var3.readUnsignedShort(); // L: 8321
					var30 = (long)var3.readMedium(); // L: 8322
					PlayerType var96 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var3.readUnsignedByte()); // L: 8323
					long var39 = var30 + (var28 << 32); // L: 8324
					var12 = false; // L: 8325

					for (var66 = 0; var66 < 100; ++var66) { // L: 8326
						if (field737[var66] == var39) { // L: 8327
							var12 = true; // L: 8328
							break; // L: 8329
						}
					}

					if (class135.friendSystem.isIgnored(new Username(var51, Projectile.loginType))) { // L: 8332
						var12 = true;
					}

					if (!var12 && field625 == 0) { // L: 8333
						field737[field738] = var39; // L: 8334
						field738 = (field738 + 1) % 100; // L: 8335
						var37 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(var3))); // L: 8336
						byte var14;
						if (var96.isPrivileged) { // L: 8338
							var14 = 7;
						} else {
							var14 = 3; // L: 8339
						}

						if (var96.modIcon != -1) { // L: 8340
							VarbitComposition.addGameMessage(var14, class385.method7175(var96.modIcon) + var51, var37);
						} else {
							VarbitComposition.addGameMessage(var14, var51, var37); // L: 8341
						}
					}

					var1.serverPacket = null; // L: 8343
					return true; // L: 8344
				}

				if (ServerPacket.field3505 == var1.serverPacket) { // L: 8346
					var20 = var3.readInt(); // L: 8347
					var5 = var3.method9712(); // L: 8348
					if (var5 == 65535) { // L: 8349
						var5 = -1;
					}

					var6 = var3.readInt(); // L: 8350
					var56 = ModeWhere.field4649.method6519(var6); // L: 8351
					ItemComposition var75;
					if (!var56.isIf3) { // L: 8352
						if (var5 == -1) { // L: 8353
							var56.modelType = 0; // L: 8354
							var1.serverPacket = null; // L: 8355
							return true; // L: 8356
						}

						var75 = class164.ItemComposition_get(var5).getCountObj(var20); // L: 8358
						var56.modelType = 4; // L: 8359
						var56.modelId = var5; // L: 8360
						var56.modelAngleX = var75.xan2d; // L: 8361
						var56.modelAngleY = var75.yan2d; // L: 8362
						var56.modelZoom = var75.zoom2d * 100 / var20; // L: 8363
						TriBool.invalidateWidget(var56); // L: 8364
					} else {
						var56.itemId = var5; // L: 8367
						var56.itemQuantity = var20; // L: 8368
						var75 = class164.ItemComposition_get(var5).getCountObj(var20); // L: 8369
						var56.modelAngleX = var75.xan2d; // L: 8370
						var56.modelAngleY = var75.yan2d; // L: 8371
						var56.modelAngleZ = var75.zan2d; // L: 8372
						var56.modelOffsetX = var75.offsetX2d; // L: 8373
						var56.modelOffsetY = var75.offsetY2d; // L: 8374
						var56.modelZoom = var75.zoom2d; // L: 8375
						if (var75.isStackable == 1) { // L: 8376
							var56.itemQuantityMode = 1;
						} else {
							var56.itemQuantityMode = 2; // L: 8377
						}

						if (var56.field3887 > 0) { // L: 8378
							var56.modelZoom = var56.modelZoom * 32 / var56.field3887;
						} else if (var56.rawWidth > 0) { // L: 8379
							var56.modelZoom = var56.modelZoom * 32 / var56.rawWidth;
						}

						TriBool.invalidateWidget(var56); // L: 8380
					}

					var1.serverPacket = null; // L: 8382
					return true; // L: 8383
				}

				if (ServerPacket.field3495 == var1.serverPacket) { // L: 8385
					return this.method1278(var1); // L: 8386
				}

				if (ServerPacket.field3461 == var1.serverPacket) { // L: 8388
					var20 = var3.readInt(); // L: 8389
					var73 = ModeWhere.field4649.method6519(var20); // L: 8390
					var73.modelType = 3; // L: 8391
					var73.modelId = SoundCache.localPlayer.appearance.getChatHeadId(); // L: 8392
					TriBool.invalidateWidget(var73); // L: 8393
					var1.serverPacket = null; // L: 8394
					return true; // L: 8395
				}

				if (ServerPacket.field3527 == var1.serverPacket) { // L: 8397
					var20 = var3.readUnsignedByte(); // L: 8398
					var5 = var3.readUnsignedShort(); // L: 8399
					this.method501(false); // L: 8400
					if (var20 == 0) { // L: 8401
						StudioGame.field4084 = class511.field5137.field1326[var5]; // L: 8402
					} else if (var20 == 1) { // L: 8404
						StudioGame.field4084 = class511.field5137.field1315[var5]; // L: 8405
					} else if (var20 == 2) { // L: 8407
						StudioGame.field4084 = class511.field5137.field1331[var5]; // L: 8408
						this.method501(true); // L: 8409
					}

					if (StudioGame.field4084 == null) { // L: 8411
						StudioGame.field4084 = SoundCache.localPlayer; // L: 8412
					}

					var1.serverPacket = null; // L: 8414
					return true; // L: 8415
				}

				if (ServerPacket.field3483 == var1.serverPacket) { // L: 8417
					World var50 = new World(); // L: 8418
					var50.host = var3.readStringCp1252NullTerminated(); // L: 8419
					var50.id = var3.readUnsignedShort(); // L: 8420
					var5 = var3.readInt(); // L: 8421
					var50.properties = var5; // L: 8422
					if (var50.isDeadman()) { // L: 8423
						var50.field819 = "beta"; // L: 8424
						class4.field9 = true; // L: 8425
					} else {
						class4.field9 = false; // L: 8428
					}

					ClanChannelMember.method3282(45); // L: 8430
					var2.close(); // L: 8431
					var2 = null; // L: 8432
					ScriptEvent.changeWorld(var50); // L: 8433
					var1.serverPacket = null; // L: 8434
					return false; // L: 8435
				}

				if (ServerPacket.field3435 == var1.serverPacket) { // L: 8437
					var20 = var3.method9586(); // L: 8438
					var5 = var3.method9586(); // L: 8439
					InterfaceParent var71 = (InterfaceParent)interfaceParents.get((long)var5); // L: 8440
					var7 = (InterfaceParent)interfaceParents.get((long)var20); // L: 8441
					if (var7 != null) { // L: 8442
						ArchiveDiskActionHandler.closeInterface(var7, var71 == null || var7.group != var71.group);
					}

					if (var71 != null) { // L: 8443
						var71.remove(); // L: 8444
						interfaceParents.put(var71, (long)var20); // L: 8445
					}

					var24 = ModeWhere.field4649.method6519(var5); // L: 8447
					if (var24 != null) { // L: 8448
						TriBool.invalidateWidget(var24);
					}

					var24 = ModeWhere.field4649.method6519(var20); // L: 8449
					if (var24 != null) { // L: 8450
						TriBool.invalidateWidget(var24); // L: 8451
						class238.revalidateWidgetScroll(ModeWhere.field4649.field3740[var24.id >>> 16], var24, true); // L: 8452
					}

					if (rootInterface != -1) { // L: 8454
						BuddyRankComparator.method3037(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 8455
					return true; // L: 8456
				}

				if (ServerPacket.field3444 == var1.serverPacket) { // L: 8458
					isCameraLocked = true; // L: 8459
					field567 = false; // L: 8460
					field764 = true; // L: 8461
					WorldMapLabelSize.field2541 = var3.readUnsignedByte(); // L: 8462
					VarbitComposition.field2102 = var3.readUnsignedByte(); // L: 8463
					var20 = var3.readUnsignedShort(); // L: 8464
					var5 = class376.method7084(var3.readUnsignedByte()); // L: 8465
					var6 = class376.method7084(var3.readUnsignedByte()); // L: 8466
					var21 = var3.readUnsignedShort(); // L: 8467
					field804 = var3.readBoolean(); // L: 8468
					var8 = var3.readUnsignedByte(); // L: 8469
					var9 = class376.method7084(WorldMapLabelSize.field2541); // L: 8470
					var10 = class376.method7084(VarbitComposition.field2102); // L: 8471
					var11 = false; // L: 8472
					var12 = false; // L: 8473
					if (field804) { // L: 8474
						var62 = class328.cameraY; // L: 8475
						var64 = class169.method3519(class511.field5137, var9, var10, class511.field5137.field1318) - var20; // L: 8476
					} else {
						var62 = class169.method3519(class511.field5137, class47.cameraX, class60.cameraZ, class511.field5137.field1318) - class328.cameraY; // L: 8479
						var64 = var20; // L: 8480
					}

					field767 = new class508(class47.cameraX, class60.cameraZ, var62, var9, var10, var64, var5, var6, var21, var8); // L: 8482
					var1.serverPacket = null; // L: 8483
					return true; // L: 8484
				}

				if (ServerPacket.field3428 == var1.serverPacket) { // L: 8486
					class47.field314 = var3.readUnsignedByte(); // L: 8487
					class19.field86 = var3.readUnsignedByte(); // L: 8488
					var1.serverPacket = null; // L: 8489
					return true; // L: 8490
				}

				if (ServerPacket.field3515 == var1.serverPacket) { // L: 8492
					if (rootInterface != -1) { // L: 8493
						BuddyRankComparator.method3037(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 8494
					return true; // L: 8495
				}

				if (ServerPacket.field3529 == var1.serverPacket) { // L: 8497
					class153.method3312(class320.field3381); // L: 8498
					var1.serverPacket = null; // L: 8499
					return true; // L: 8500
				}

				if (ServerPacket.field3528 == var1.serverPacket) { // L: 8502
					class20.field91.field1329 = 0; // L: 8503
					class20.field91.field1322 = 0; // L: 8504

					for (var20 = 0; var20 < 65536; ++var20) { // L: 8505
						class20.field91.field1315[var20] = null;
					}

					for (var20 = 0; var20 < 2048; ++var20) { // L: 8506
						class20.field91.field1331[var20] = null;
					}

					SoundCache.localPlayer.field1147 = class511.field5137; // L: 8507
					var1.serverPacket = null; // L: 8508
					return true; // L: 8509
				}

				if (ServerPacket.field3440 == var1.serverPacket) { // L: 8511
					var70 = var3.readByte(); // L: 8512
					var23 = var3.readStringCp1252NullTerminated(); // L: 8513
					long var41 = (long)var3.readUnsignedShort(); // L: 8514
					long var43 = (long)var3.readMedium(); // L: 8515
					PlayerType var35 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var3.readUnsignedByte()); // L: 8516
					long var45 = var43 + (var41 << 32); // L: 8517
					boolean var13 = false; // L: 8518
					ClanChannel var47 = null; // L: 8519
					var47 = var70 >= 0 ? currentClanChannels[var70] : class276.guestClanChannel; // L: 8521
					if (var47 == null) { // L: 8522
						var13 = true; // L: 8523
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var35.isUser && class135.friendSystem.isIgnored(new Username(var23, Projectile.loginType))) { // L: 8532 8533
									var13 = true;
								}
								break;
							}

							if (field737[var15] == var45) { // L: 8527
								var13 = true; // L: 8528
								break; // L: 8529
							}

							++var15; // L: 8526
						}
					}

					if (!var13) { // L: 8536
						field737[field738] = var45; // L: 8537
						field738 = (field738 + 1) % 100; // L: 8538
						var34 = AbstractFont.escapeBrackets(SpotAnimationDefinition.method3789(var3)); // L: 8539
						var16 = var70 >= 0 ? 41 : 44; // L: 8540
						if (var35.modIcon != -1) { // L: 8541
							ArchiveDiskAction.addChatMessage(var16, class385.method7175(var35.modIcon) + var23, var34, var47.name);
						} else {
							ArchiveDiskAction.addChatMessage(var16, var23, var34, var47.name); // L: 8542
						}
					}

					var1.serverPacket = null; // L: 8544
					return true; // L: 8545
				}

				if (ServerPacket.field3426 == var1.serverPacket) { // L: 8547
					var20 = var3.readInt(); // L: 8548
					var5 = var3.readUnsignedShort(); // L: 8549
					if (var20 < -70000) { // L: 8550
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 8552
						var22 = ModeWhere.field4649.method6519(var20);
					} else {
						var22 = null; // L: 8553
					}

					if (var22 != null) { // L: 8554
						for (var21 = 0; var21 < var22.field3962.length; ++var21) { // L: 8555
							var22.field3962[var21] = 0; // L: 8556
							var22.field3963[var21] = 0; // L: 8557
						}
					}

					class534.clearItemContainer(var5); // L: 8560
					var21 = var3.readUnsignedShort(); // L: 8561

					for (var8 = 0; var8 < var21; ++var8) { // L: 8562
						var9 = var3.method9591(); // L: 8563
						if (var9 == 255) { // L: 8564
							var9 = var3.method9614();
						}

						var10 = var3.readUnsignedShort(); // L: 8565
						if (var22 != null && var8 < var22.field3962.length) { // L: 8566 8567
							var22.field3962[var8] = var10; // L: 8568
							var22.field3963[var8] = var9; // L: 8569
						}

						TaskHandler.itemContainerSetItem(var5, var8, var10 - 1, var9); // L: 8572
					}

					if (var22 != null) { // L: 8574
						TriBool.invalidateWidget(var22);
					}

					class31.method462(); // L: 8575
					field698[++field620 - 1 & 31] = var5 & 32767; // L: 8576
					var1.serverPacket = null; // L: 8577
					return true; // L: 8578
				}

				if (ServerPacket.field3511 == var1.serverPacket) { // L: 8580
					var20 = var3.method9614(); // L: 8581
					var54 = var3.readUnsignedByte() == 1; // L: 8582
					var22 = ModeWhere.field4649.method6519(var20); // L: 8583
					if (var54 != var22.isHidden) { // L: 8584
						var22.isHidden = var54; // L: 8585
						TriBool.invalidateWidget(var22); // L: 8586
					}

					var1.serverPacket = null; // L: 8588
					return true; // L: 8589
				}

				if (ServerPacket.field3429 == var1.serverPacket) { // L: 8591
					var20 = var3.method9599(); // L: 8597
					var21 = var3.readUnsignedShort(); // L: 8598
					var5 = var3.method9599(); // L: 8599
					var6 = var3.method9712(); // L: 8600
					var8 = var3.method9712(); // L: 8601
					if (var20 == 65535) { // L: 8602
						var20 = -1; // L: 8603
					}

					ArrayList var38 = new ArrayList(); // L: 8605
					var38.add(var20); // L: 8606
					class498.method8899(var38, var5, var6, var21, var8); // L: 8607
					var1.serverPacket = null; // L: 8608
					return true; // L: 8609
				}

				if (ServerPacket.field3468 == var1.serverPacket) { // L: 8611
					class31.method462(); // L: 8612
					weight = var3.readShort(); // L: 8613
					field711 = cycleCntr; // L: 8614
					var1.serverPacket = null; // L: 8615
					return true; // L: 8616
				}

				if (ServerPacket.field3519 == var1.serverPacket) { // L: 8618
					class153.method3312(class320.field3385); // L: 8619
					var1.serverPacket = null; // L: 8620
					return true; // L: 8621
				}

				FriendsChatManager.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1459 != null ? var1.field1459.id : -1) + "," + (var1.field1464 != null ? var1.field1464.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 8623
				class135.method3167(); // L: 8624
			} catch (IOException var48) { // L: 8626
				class131.method3068(); // L: 8627
			} catch (Exception var49) {
				var23 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1459 != null ? var1.field1459.id : -1) + "," + (var1.field1464 != null ? var1.field1464.id : -1) + "," + var1.serverPacketLength + "," + (SoundCache.localPlayer.field1204[0] + class511.field5137.field1321) + "," + (SoundCache.localPlayer.field1246[0] + class511.field5137.field1323) + ","; // L: 8630

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 8631
					var23 = var23 + var3.array[var6] + ",";
				}

				FriendsChatManager.RunException_sendStackTrace(var23, var49); // L: 8632
				class135.method3167(); // L: 8633
			}

			return true; // L: 8635
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1081495480"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 9868

		int var2;
		int var5;
		while (!var1) { // L: 9869
			var1 = true; // L: 9870

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 9871
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 9872
					String var18 = menuTargets[var2]; // L: 9873
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 9874
					menuTargets[var2 + 1] = var18; // L: 9875
					String var19 = menuActions[var2]; // L: 9876
					menuActions[var2] = menuActions[var2 + 1]; // L: 9877
					menuActions[var2 + 1] = var19; // L: 9878
					var5 = menuOpcodes[var2]; // L: 9879
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 9880
					menuOpcodes[var2 + 1] = var5; // L: 9881
					var5 = menuArguments1[var2]; // L: 9882
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 9883
					menuArguments1[var2 + 1] = var5; // L: 9884
					var5 = menuArguments2[var2]; // L: 9885
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 9886
					menuArguments2[var2 + 1] = var5; // L: 9887
					var5 = menuIdentifiers[var2]; // L: 9888
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 9889
					menuIdentifiers[var2 + 1] = var5; // L: 9890
					var5 = field763[var2]; // L: 9891
					field763[var2] = field763[var2 + 1]; // L: 9892
					field763[var2 + 1] = var5; // L: 9893
					var5 = field653[var2]; // L: 9894
					field653[var2] = field653[var2 + 1]; // L: 9895
					field653[var2 + 1] = var5; // L: 9896
					boolean var6 = field528[var2]; // L: 9897
					field528[var2] = field528[var2 + 1]; // L: 9898
					field528[var2 + 1] = var6; // L: 9899
					var1 = false; // L: 9900
				}
			}
		}

		if (clickedWidget == null) { // L: 9905
			int var20 = MouseHandler.MouseHandler_lastButton; // L: 9906
			int var4;
			int var7;
			int var8;
			int var9;
			int var21;
			if (isMenuOpen) { // L: 9907
				int var3;
				if (var20 != 1 && (World.mouseCam || var20 != 4)) { // L: 9908
					var2 = MouseHandler.MouseHandler_x; // L: 9909
					var3 = MouseHandler.MouseHandler_y; // L: 9910
					if (var2 < class105.menuX - 10 || var2 > class330.menuWidth + class105.menuX + 10 || var3 < UserComparator9.menuY - 10 || var3 > class278.menuHeight + UserComparator9.menuY + 10) { // L: 9911
						isMenuOpen = false; // L: 9912
						class137.method3188(class105.menuX, UserComparator9.menuY, class330.menuWidth, class278.menuHeight); // L: 9913
					}
				}

				if (var20 == 1 || !World.mouseCam && var20 == 4) { // L: 9916
					var2 = class105.menuX; // L: 9917
					var3 = UserComparator9.menuY; // L: 9918
					var4 = class330.menuWidth; // L: 9919
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9920
					var21 = MouseHandler.MouseHandler_lastPressedY; // L: 9921
					var7 = -1; // L: 9922

					for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9923
						var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31; // L: 9924
						if (var5 > var2 && var5 < var2 + var4 && var21 > var9 - 13 && var21 < var9 + 3) { // L: 9925
							var7 = var8;
						}
					}

					if (var7 != -1 && var7 >= 0) { // L: 9927 9928
						var8 = menuArguments1[var7]; // L: 9929
						var9 = menuArguments2[var7]; // L: 9930
						int var16 = menuOpcodes[var7]; // L: 9931
						int var17 = menuIdentifiers[var7]; // L: 9932
						int var12 = field653[var7]; // L: 9933
						int var13 = field763[var7]; // L: 9934
						String var14 = menuActions[var7]; // L: 9935
						String var15 = menuTargets[var7]; // L: 9936
						MenuAction.method2160(var8, var9, var16, var17, var13, var12, var14, var15, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9937
					}

					isMenuOpen = false; // L: 9939
					class137.method3188(class105.menuX, UserComparator9.menuY, class330.menuWidth, class278.menuHeight); // L: 9940
				}
			} else {
				var2 = menuOptionsCount - 1; // L: 9946
				if ((var20 == 1 || !World.mouseCam && var20 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9949 9950
					var20 = 2; // L: 9951
				}

				if ((var20 == 1 || !World.mouseCam && var20 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 9954 9956
					var4 = menuArguments1[var2]; // L: 9957
					var5 = menuArguments2[var2]; // L: 9958
					var21 = menuOpcodes[var2]; // L: 9959
					var7 = menuIdentifiers[var2]; // L: 9960
					var8 = field653[var2]; // L: 9961
					var9 = field763[var2]; // L: 9962
					String var10 = menuActions[var2]; // L: 9963
					String var11 = menuTargets[var2]; // L: 9964
					MenuAction.method2160(var4, var5, var21, var7, var9, var8, var10, var11, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9965
				}

				if (var20 == 2 && menuOptionsCount > 0) { // L: 9968
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9970

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "892915202"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 9975
		return (field780 && menuOptionsCount > 2 || class330.method6183(var1)) && !field528[var1]; // L: 9978
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		ClientPacket.method6092(var1, var2); // L: 9982
		var1 -= viewportOffsetX; // L: 9983
		var2 -= viewportOffsetY; // L: 9984
		class511.field5137.field1316.method5469(class511.field5137.field1318, var1, var2, false); // L: 9985

		for (int var3 = 0; var3 < class511.field5137.field1322; ++var3) { // L: 9986
			class476 var4 = class511.field5137.field1331[class511.field5137.field1333[var3]]; // L: 9987
			if (var4 != null) { // L: 9988
				var4.field4971.field1316.method5469(var4.field4971.field1318, var1, var2, false); // L: 9989
			}
		}

		isMenuOpen = true; // L: 9991
	} // L: 9992

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "53"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		ClanChannel.method3488(rootInterface, class74.canvasWidth, class1.canvasHeight, var1); // L: 11737
	} // L: 11738

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "676512780"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : ModeWhere.field4649.method6519(var1.parentId); // L: 11741
		int var3;
		int var4;
		if (var2 == null) { // L: 11744
			var3 = class74.canvasWidth; // L: 11745
			var4 = class1.canvasHeight; // L: 11746
		} else {
			var3 = var2.width; // L: 11749
			var4 = var2.height; // L: 11750
		}

		AbstractWorldMapData.alignWidgetSize(var1, var3, var4, false); // L: 11752
		SecureRandomCallable.alignWidgetPosition(var1, var3, var4); // L: 11753
	} // L: 11754

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1133103527"
	)
	final void method1285() {
		TriBool.invalidateWidget(clickedWidget); // L: 12672
		++class494.widgetDragDuration; // L: 12673
		int var1;
		int var2;
		if (field691 && field688) { // L: 12674
			var1 = MouseHandler.MouseHandler_x; // L: 12688
			var2 = MouseHandler.MouseHandler_y; // L: 12689
			var1 -= widgetClickX; // L: 12690
			var2 -= widgetClickY; // L: 12691
			if (var1 < field689) { // L: 12692
				var1 = field689;
			}

			if (var1 + clickedWidget.width > field689 + clickedWidgetParent.width) { // L: 12693
				var1 = field689 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field505) { // L: 12694
				var2 = field505;
			}

			if (var2 + clickedWidget.height > field505 + clickedWidgetParent.height) { // L: 12695
				var2 = field505 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field692; // L: 12696
			int var4 = var2 - field663; // L: 12697
			int var5 = clickedWidget.dragZoneSize; // L: 12698
			if (class494.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12699 12700
				isDraggingWidget = true; // L: 12701
			}

			int var6 = var1 - field689 + clickedWidgetParent.scrollX; // L: 12704
			int var7 = var2 - field505 + clickedWidgetParent.scrollY; // L: 12705
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12706
				var8 = new ScriptEvent(); // L: 12707
				var8.widget = clickedWidget; // L: 12708
				var8.mouseX = var6; // L: 12709
				var8.mouseY = var7; // L: 12710
				var8.args = clickedWidget.onDrag; // L: 12711
				Projectile.runScriptEvent(var8); // L: 12712
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12714
				if (isDraggingWidget) { // L: 12715
					if (clickedWidget.onDragComplete != null) { // L: 12716
						var8 = new ScriptEvent(); // L: 12717
						var8.widget = clickedWidget; // L: 12718
						var8.mouseX = var6; // L: 12719
						var8.mouseY = var7; // L: 12720
						var8.dragTarget = draggedOnWidget; // L: 12721
						var8.args = clickedWidget.onDragComplete; // L: 12722
						Projectile.runScriptEvent(var8); // L: 12723
					}

					if (draggedOnWidget != null && ObjectSound.method1976(clickedWidget) != null) { // L: 12725
						PacketBufferNode var11 = class170.getPacketBufferNode(ClientPacket.field3361, packetWriter.isaacCipher); // L: 12727
						var11.packetBuffer.method9741(draggedOnWidget.childIndex); // L: 12728
						var11.packetBuffer.writeIntME(clickedWidget.id); // L: 12729
						var11.packetBuffer.method9767(clickedWidget.childIndex); // L: 12730
						var11.packetBuffer.method9597(draggedOnWidget.itemId); // L: 12731
						var11.packetBuffer.writeInt(draggedOnWidget.id); // L: 12732
						var11.packetBuffer.method9741(clickedWidget.itemId); // L: 12733
						packetWriter.addNode(var11); // L: 12734
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12738
					this.openMenu(field692 + widgetClickX, field663 + widgetClickY); // L: 12739
				} else if (menuOptionsCount > 0) { // L: 12741
					int var10 = field692 + widgetClickX; // L: 12742
					int var9 = field663 + widgetClickY; // L: 12743
					class243.method4564(class188.tempMenuAction, var10, var9); // L: 12745
					class188.tempMenuAction = null; // L: 12746
				}

				clickedWidget = null; // L: 12750
			}

		} else {
			if (class494.widgetDragDuration > 1) { // L: 12675
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 12676
					var1 = widgetClickX + field692; // L: 12677
					var2 = widgetClickY + field663; // L: 12678
					class243.method4564(class188.tempMenuAction, var1, var2); // L: 12680
					class188.tempMenuAction = null; // L: 12681
				}

				clickedWidget = null; // L: 12684
			}

		}
	} // L: 12686 12752

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(I)Lvo;",
		garbageValue = "-1036392094"
	)
	@Export("username")
	public Username username() {
		return SoundCache.localPlayer != null ? SoundCache.localPlayer.username : null; // L: 13471
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1648154800"
	)
	void method1287(int var1) {
		PacketBufferNode var2 = class170.getPacketBufferNode(ClientPacket.field3280, packetWriter.isaacCipher); // L: 13574
		var2.packetBuffer.writeByte(var1); // L: 13575
		packetWriter.addNode(var2); // L: 13576
	} // L: 13577

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-15315"
	)
	void method1404(int var1) {
		PacketBufferNode var2 = class170.getPacketBufferNode(ClientPacket.field3330, packetWriter.isaacCipher); // L: 13580
		var2.packetBuffer.writeByte(var1); // L: 13581
		packetWriter.addNode(var2); // L: 13582
	} // L: 13583

	public void setClient(int var1) {
		this.field532 = var1; // L: 952
	} // L: 953

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 968
			this.field552 = var1; // L: 971
		}
	} // L: 969 972

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 977
	}

	@Export("kill0")
	@ObfuscatedName("init")
	public final void kill0() {
		// $FF: Couldn't be decompiled
	}

	public long getAccountHash() {
		return this.accountHash; // L: 982
	}

	protected void finalize() throws Throwable {
		class330.field3588.remove(this); // L: 940
		super.finalize(); // L: 942
	} // L: 943

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 958
			this.field547 = var1; // L: 961
			class163.method3447(10); // L: 962
		}
	} // L: 959 963

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "2109920798"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 21
			var1 = new StructComposition(); // L: 22
			if (var2 != null) { // L: 23
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 24
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}
}
