package p102x3;

import B3.m;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import W3.j;
import W3.q;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.ArrowBackKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.outlined.AutoAwesomeKt;
import androidx.compose.material.icons.outlined.BoltKt;
import androidx.compose.material.icons.outlined.ShieldKt;
import androidx.compose.material.icons.outlined.StarKt;
import androidx.compose.material.icons.outlined.SwipeRightKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import o4.l;
import p076s.b;
import p083t3.C2292j;
import p083t3.O;
import p092v3.h;

/* JADX INFO: renamed from: x3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2583n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f15342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f15343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f15344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f15345d;

    static {
        Icons.Outlined outlined = Icons.Outlined.INSTANCE;
        ImageVector shield = ShieldKt.getShield(outlined);
        long jColor = ColorKt.Color(4287931320L);
        Color.Companion companion = Color.Companion;
        f15342a = v.S(new G6("monthly", "Silver Pass", "1 Month", "30 Days", "₹0.6 / DAY", "₹19", "Essential", false, false, shield, jColor, Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), false, false, 24960), new G6("half_yearly", "Gold Pass", "6 Months", "180 Days", "₹0.5 / DAY", "₹99", "Most Popular", true, false, StarKt.getStar(outlined), ColorKt.Color(4294286859L), Color.m3926copywmQWz5c$default(ColorKt.Color(4294286859L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4291463684L), 0.07f, 0.0f, 0.0f, 0.0f, 14, null), true, false, 16640), new G6("annual", "Platinum Pass", "1 Year", "365 Days", "₹0.5 / DAY", "₹179", "Best Value", false, false, BoltKt.getBolt(outlined), ColorKt.Color(4286680312L), Color.m3926copywmQWz5c$default(ColorKt.Color(4284704497L), 0.22f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4283385573L), 0.07f, 0.0f, 0.0f, 0.0f, 14, null), false, false, 24960), new G6("lifetime", "Diamond Pass", "Lifetime", "Forever Access", "PERPETUAL", "₹499", "One-time", false, true, AutoAwesomeKt.getAutoAwesome(outlined), ColorKt.Color(4280472558L), Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4278751666L), 0.09f, 0.0f, 0.0f, 0.0f, 14, null), false, true, 8320));
        f15343b = v.S(new C2662s("FLOW", ColorKt.Color(4289222135L), "Standard speed\nUp to 5 MB limit", "Fast speed\nNo size limits", "Priority queue\nNo size limits", "Priority queue\nBatch uploads", "Ultra-priority\nBatch uploads\nVIP Beta Access"), new C2662s("PRINTS", ColorKt.Color(4286680312L), "B&W: ₹1.25\nColor: ₹3.35", "Save 8%\nB&W: ₹1.15\nColor: ₹3.00", "Save 17%\nB&W: ₹1.05\nColor: ₹2.75", "Save 25%\nB&W: ₹0.99\nColor: ₹2.35", "Save 35%\nB&W: ₹0.89\nColor: ₹1.99"), new C2662s("TOOLS", ColorKt.Color(4279548070L), "Free\nNo restrictions", "Free\nNo restrictions", "Free\nNo restrictions", "Free\nNo restrictions", "Free\nNo restrictions"), new C2662s("ANDROID APP", ColorKt.Color(4279286145L), "Free access\nStandard speed", "Pass synced\nAd-free", "Pass synced\nAd-free", "Pass synced\nAd-free", "Pass synced\nAd-free"));
        f15344c = Dp.m6403constructorimpl(110);
        f15345d = Dp.m6403constructorimpl(MenuKt.InTransitionDuration);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:101:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x048f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0491  */
    /* JADX WARN: Code duplicated, block: B:119:0x0498  */
    /* JADX WARN: Code duplicated, block: B:121:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:124:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:127:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:128:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:131:0x050b  */
    /* JADX WARN: Code duplicated, block: B:134:0x051c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0584  */
    /* JADX WARN: Code duplicated, block: B:141:0x0590  */
    /* JADX WARN: Code duplicated, block: B:142:0x0594  */
    /* JADX WARN: Code duplicated, block: B:145:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:147:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:153:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0613  */
    /* JADX WARN: Code duplicated, block: B:156:0x064e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0688  */
    /* JADX WARN: Code duplicated, block: B:162:0x0694  */
    /* JADX WARN: Code duplicated, block: B:163:0x0698  */
    /* JADX WARN: Code duplicated, block: B:166:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:169:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:176:0x0778  */
    /* JADX WARN: Code duplicated, block: B:179:0x0785  */
    /* JADX WARN: Code duplicated, block: B:185:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:187:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:190:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:191:0x0801  */
    /* JADX WARN: Code duplicated, block: B:194:0x0854  */
    /* JADX WARN: Code duplicated, block: B:197:0x0860  */
    /* JADX WARN: Code duplicated, block: B:198:0x0864  */
    /* JADX WARN: Code duplicated, block: B:201:0x0875  */
    /* JADX WARN: Code duplicated, block: B:204:0x0886  */
    /* JADX WARN: Code duplicated, block: B:208:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:209:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:212:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:215:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:216:0x0903  */
    /* JADX WARN: Code duplicated, block: B:219:0x0914  */
    /* JADX WARN: Code duplicated, block: B:221:0x0922  */
    /* JADX WARN: Code duplicated, block: B:224:0x093a  */
    /* JADX WARN: Code duplicated, block: B:226:0x093e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0981  */
    /* JADX WARN: Code duplicated, block: B:232:0x098d  */
    /* JADX WARN: Code duplicated, block: B:233:0x0991  */
    /* JADX WARN: Code duplicated, block: B:236:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:239:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:245:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:252:0x0a52 A[Catch: all -> 0x0a83, TryCatch #0 {all -> 0x0a83, blocks: (B:250:0x0a44, B:252:0x0a52, B:256:0x0a87), top: B:339:0x0a44 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:263:0x0b4b  */
    /* JADX WARN: Code duplicated, block: B:266:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:270:0x0b9b  */
    /* JADX WARN: Code duplicated, block: B:273:0x0bac  */
    /* JADX WARN: Code duplicated, block: B:275:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:279:0x0bd8 A[LOOP:2: B:277:0x0bd2->B:279:0x0bd8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x0d59  */
    /* JADX WARN: Code duplicated, block: B:289:0x0d65  */
    /* JADX WARN: Code duplicated, block: B:290:0x0d69  */
    /* JADX WARN: Code duplicated, block: B:293:0x0d7a  */
    /* JADX WARN: Code duplicated, block: B:295:0x0d88  */
    /* JADX WARN: Code duplicated, block: B:298:0x0e4f  */
    /* JADX WARN: Code duplicated, block: B:301:0x0e5b  */
    /* JADX WARN: Code duplicated, block: B:302:0x0e5f  */
    /* JADX WARN: Code duplicated, block: B:305:0x0e70  */
    /* JADX WARN: Code duplicated, block: B:307:0x0e7e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0ed0  */
    /* JADX WARN: Code duplicated, block: B:313:0x0edc  */
    /* JADX WARN: Code duplicated, block: B:314:0x0ee0  */
    /* JADX WARN: Code duplicated, block: B:317:0x0ef1  */
    /* JADX WARN: Code duplicated, block: B:319:0x0eff  */
    /* JADX WARN: Code duplicated, block: B:322:0x0f59  */
    /* JADX WARN: Code duplicated, block: B:339:0x0a44 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0751 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x06bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0797 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x02b4  */
    public static final void a(String str, Integer num, h authManager, a onBack, Modifier modifier, Composer composer, int i5) {
        int i6;
        float f5;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        Composer composer2;
        Modifier.Companion companion;
        int i7;
        AnnotatedString.Builder builder;
        int iPushStyle;
        int iPushStyle2;
        float f6;
        float f7;
        boolean z3;
        Composer composer3;
        boolean z4;
        Object objRememberedValue;
        float f8;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        float f9;
        float f10;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG;
        Iterator it;
        int i8;
        Modifier modifier2;
        List<G6> list;
        int i9;
        String str2;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG2;
        AnnotatedString.Builder builder2;
        int iPushStyle3;
        int iPushStyle4;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG3;
        int currentCompositeKeyHash6;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG4;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        e eVarG5;
        Iterator it2;
        Object next;
        G6 g6;
        long jM3926copywmQWz5c$default;
        long jM3926copywmQWz5c$default2;
        int currentCompositeKeyHash8;
        a constructor8;
        Composer composerM3407constructorimpl8;
        long jM3926copywmQWz5c$default3;
        int currentCompositeKeyHash9;
        a constructor9;
        Composer composerM3407constructorimpl9;
        e eVarG6;
        long jD;
        int currentCompositeKeyHash10;
        a constructor10;
        Composer composerM3407constructorimpl10;
        AnnotatedString.Builder builder3;
        int iPushStyle5;
        long jD2;
        String strW;
        Object next2;
        int i10;
        int currentCompositeKeyHash11;
        a constructor11;
        Composer composerM3407constructorimpl11;
        float f11;
        o.f(authManager, "authManager");
        o.f(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-539643368);
        int i11 = (i5 & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(authManager) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i5 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onBack) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer3 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion2 = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-539643368, i12, -1, "com.notescrafter.ui.screens.CommunityPassScreen (CommunityPassScreen.kt:149)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(authManager.f13538x, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(-1008084274);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new C2551l(stateCollectAsState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1008079761);
            boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new C2551l(stateCollectAsState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z5 = str == null || j.m0(str);
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(Dp.m6403constructorimpl(80) + WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo618calculateBottomPaddingD9Ej5fM()), 7, null);
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor12 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor12);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl12 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl12, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl12, currentCompositionLocalMap);
            if (composerM3407constructorimpl12.getInserting() || !o.b(composerM3407constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                p035i0.a.t(currentCompositeKeyHash12, composerM3407constructorimpl12, currentCompositeKeyHash12, eVarG7);
            }
            Updater.m3414setimpl(composerM3407constructorimpl12, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f12 = 20;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM670paddingVpY3zN4$default);
            a constructor13 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor13);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl13 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG8 = p035i0.a.g(companion4, composerM3407constructorimpl13, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl13, currentCompositionLocalMap2);
            if (composerM3407constructorimpl13.getInserting() || !o.b(composerM3407constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                p035i0.a.t(currentCompositeKeyHash13, composerM3407constructorimpl13, currentCompositeKeyHash13, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl13, modifierMaterializeModifier2, companion4.getSetModifier());
            float f13 = 24;
            b.m(f13, companion2, composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getTop(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            a constructor14 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor14);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl14 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG9 = p035i0.a.g(companion4, composerM3407constructorimpl14, measurePolicyRowMeasurePolicy, composerM3407constructorimpl14, currentCompositionLocalMap3);
            try {
                try {
                    try {
                        try {
                            if (composerM3407constructorimpl14.getInserting()) {
                                i6 = i12;
                            } else {
                                i6 = i12;
                                if (!o.b(composerM3407constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl14, modifierMaterializeModifier3, companion4.getSetModifier());
                                f5 = 12;
                                Modifier modifierM672paddingqDBjuR0$default2 = PaddingKt.m672paddingqDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 0.0f, 11, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default2);
                                constructor = companion4.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                                e eVarG10 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap4);
                                if (composerM3407constructorimpl.getInserting()) {
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion4.getSetModifier());
                                    long jD3 = p107y3.a.d();
                                    FontWeight.Companion companion5 = FontWeight.Companion;
                                    companion = companion2;
                                    i7 = i6;
                                    Composer composer4 = composer2;
                                    TextKt.m2432Text4IGK_g("COMMUNITY PASS", (Modifier) null, jD3, TextUnitKt.getSp(10), (FontStyle) null, companion5.getBlack(), (FontFamily) null, TextUnitKt.getSp(2.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 12782982, 0, 130898);
                                    float f14 = 6;
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f14)), composer4, 6);
                                    builder = new AnnotatedString.Builder(0, 1, null);
                                    FontWeight light = companion5.getLight();
                                    Color.Companion companion6 = Color.Companion;
                                    iPushStyle = builder.pushStyle(new SpanStyle(companion6.m3964getWhite0d7_KjU(), 0L, light, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder.append("Choose your ");
                                    builder.pop(iPushStyle);
                                    iPushStyle2 = builder.pushStyle(new SpanStyle(companion6.m3964getWhite0d7_KjU(), 0L, companion5.getExtraBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder.append("Pass");
                                    builder.pop(iPushStyle2);
                                    TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, TextUnitKt.getSp(26), null, null, null, 0L, null, null, TextUnitKt.getSp(32), 0, false, 0, 0, null, null, null, composer4, 3072, 6, 261110);
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f14)), composer4, 6);
                                    TextKt.m2432Text4IGK_g("Support NotesCrafter and unlock unlimited processing power.", (Modifier) null, p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 3462, 6, 130034);
                                    composer4.endNode();
                                    f6 = 14;
                                    f7 = 1;
                                    z3 = z5;
                                    Modifier modifierE = b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.d(f6, companion), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                                    composer3 = composer4;
                                    composer3.startReplaceGroup(1700439523);
                                    if ((i7 & 7168) == 2048) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    objRememberedValue = composer3.rememberedValue();
                                    if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
                                        objRememberedValue = new O(1, onBack);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceGroup();
                                    f8 = 10;
                                    Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE, false, null, null, (a) objRememberedValue, 7, null), Dp.m6403constructorimpl(f8));
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs);
                                    constructor2 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                                    e eVarG11 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap5);
                                    if (composerM3407constructorimpl2.getInserting()) {
                                        f9 = f6;
                                    } else {
                                        f9 = f6;
                                        if (!o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier5, companion4.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        f10 = f9;
                                        IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), companion6.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                                        b.r(composer3, f12, companion, composer3, 6);
                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer3, 54);
                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                                        constructor3 = companion4.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                                        eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap6);
                                        if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                        }
                                        p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier6, composer3, 1700472312);
                                        Icons.Outlined outlined = Icons.Outlined.INSTANCE;
                                        it = v.S(l.t(AutoAwesomeKt.getAutoAwesome(outlined), "Premium"), l.t(ShieldKt.getShield(outlined), "Secure"), l.t(BoltKt.getBolt(outlined), "Instant")).iterator();
                                        i8 = 0;
                                        while (it.hasNext()) {
                                            next2 = it.next();
                                            i10 = i8 + 1;
                                            if (i8 >= 0) {
                                                v.X();
                                                throw null;
                                            }
                                            B3.h hVar = (B3.h) next2;
                                            ImageVector imageVector = (ImageVector) hVar.a();
                                            String str3 = (String) hVar.b();
                                            composer3.startReplaceGroup(1700473219);
                                            if (i8 > 0) {
                                                BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(3)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                                            }
                                            composer3.endReplaceGroup();
                                            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(5));
                                            Modifier.Companion companion7 = Modifier.Companion;
                                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, centerVertically, composer3, 54);
                                            currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, companion7);
                                            ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                                            Modifier.Companion companion9 = companion;
                                            constructor11 = companion8.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor11);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer3);
                                            e eVarG12 = p035i0.a.g(companion8, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl11, currentCompositionLocalMap7);
                                            if (composerM3407constructorimpl11.getInserting()) {
                                                f11 = f5;
                                            } else {
                                                f11 = f5;
                                                if (!o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                                }
                                                Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier7, companion8.getSetModifier());
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                IconKt.m1877Iconww6aTOc(imageVector, (String) null, SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                                String upperCase = str3.toUpperCase(Locale.ROOT);
                                                o.e(upperCase, "toUpperCase(...)");
                                                TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                                composer3.endNode();
                                                i8 = i10;
                                                it = it;
                                                companion = companion9;
                                                f5 = f11;
                                            }
                                            p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG12);
                                            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier7, companion8.getSetModifier());
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            IconKt.m1877Iconww6aTOc(imageVector, (String) null, SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                            String upperCase2 = str3.toUpperCase(Locale.ROOT);
                                            o.e(upperCase2, "toUpperCase(...)");
                                            TextKt.m2432Text4IGK_g(upperCase2, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                            composer3.endNode();
                                            i8 = i10;
                                            it = it;
                                            companion = companion9;
                                            f5 = f11;
                                        }
                                        modifier2 = companion;
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        composer3.startReplaceGroup(-1720467969);
                                        list = f15342a;
                                        if (z3) {
                                            i9 = i7;
                                            str2 = str;
                                        } else {
                                            it2 = list.iterator();
                                            do {
                                                if (it2.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it2.next();
                                            } while (!o.b(((G6) next).f13984a, str));
                                            g6 = (G6) next;
                                            Modifier.Companion companion10 = Modifier.Companion;
                                            Modifier modifierG = b.g(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), f10);
                                            if (g6 != null) {
                                                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(g6.f13992k, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                            } else {
                                                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                            }
                                            Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierG, jM3926copywmQWz5c$default, null, 2, null);
                                            float fM6403constructorimpl = Dp.m6403constructorimpl(f7);
                                            if (g6 != null) {
                                                jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                            } else {
                                                jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                            }
                                            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f10, modifierM207backgroundbw27NRU$default, fM6403constructorimpl, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f10));
                                            Alignment.Companion companion11 = Alignment.Companion;
                                            Alignment.Vertical centerVertically2 = companion11.getCenterVertically();
                                            Arrangement arrangement2 = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement2, centerVertically2, composer3, 54);
                                            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN4);
                                            ComposeUiNode.Companion companion12 = ComposeUiNode.Companion;
                                            constructor8 = companion12.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor8);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                                            e eVarG13 = p035i0.a.g(companion12, composerM3407constructorimpl8, measurePolicyI, composerM3407constructorimpl8, currentCompositionLocalMap8);
                                            try {
                                                if (composerM3407constructorimpl8.getInserting()) {
                                                    i9 = i7;
                                                } else {
                                                    i9 = i7;
                                                    if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                                    }
                                                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion12.getSetModifier());
                                                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                                    Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion10, Dp.m6403constructorimpl(28));
                                                    if (g6 != null) {
                                                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                                    } else {
                                                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                                    }
                                                    Modifier modifierM206backgroundbw27NRU = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion11.getCenter(), false);
                                                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU);
                                                    constructor9 = companion12.getConstructor();
                                                    if (composer3.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor9);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                                    eVarG6 = p035i0.a.g(companion12, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl9, currentCompositionLocalMap9);
                                                    if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                                    }
                                                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion12.getSetModifier());
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                    ImageVector check = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                                    if (g6 != null) {
                                                        jD = g6.f13992k;
                                                    } else {
                                                        jD = p107y3.a.d();
                                                    }
                                                    str2 = str;
                                                    IconKt.m1877Iconww6aTOc(check, (String) null, SizeKt.m713size3ABfNKs(companion10, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                                    composer3.endNode();
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion11.getStart(), composer3, 0);
                                                    currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, companion10);
                                                    constructor10 = companion12.getConstructor();
                                                    if (composer3.getApplier() == null) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor10);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                                    e eVarG14 = p035i0.a.g(companion12, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl10, currentCompositionLocalMap10);
                                                    if (composerM3407constructorimpl10.getInserting()) {
                                                        f10 = f10;
                                                    } else {
                                                        if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                                        }
                                                        f10 = f10;
                                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion12.getSetModifier());
                                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                                        long jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                                                        FontWeight.Companion companion13 = FontWeight.Companion;
                                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU, 0L, companion13.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                        builder3.append("Active: ");
                                                        builder3.pop(iPushStyle5);
                                                        if (g6 != null) {
                                                            jD2 = g6.f13992k;
                                                        } else {
                                                            jD2 = p107y3.a.d();
                                                        }
                                                        int iPushStyle6 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion13.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                        if (str2 != null) {
                                                            try {
                                                                strW = q.W(str2, "_", " ");
                                                                if (strW.length() > 0) {
                                                                    StringBuilder sb = new StringBuilder();
                                                                    String strValueOf = String.valueOf(strW.charAt(0));
                                                                    o.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
                                                                    String upperCase3 = strValueOf.toUpperCase(Locale.ROOT);
                                                                    o.e(upperCase3, "toUpperCase(...)");
                                                                    sb.append((Object) upperCase3);
                                                                    String strSubstring = strW.substring(1);
                                                                    o.e(strSubstring, "substring(...)");
                                                                    sb.append(strSubstring);
                                                                    strW = sb.toString();
                                                                }
                                                            } catch (Throwable th) {
                                                                builder3.pop(iPushStyle6);
                                                                throw th;
                                                            }
                                                        } else {
                                                            strW = null;
                                                        }
                                                        builder3.append(strW + " Pass");
                                                        builder3.pop(iPushStyle6);
                                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                                        composer3.startReplaceGroup(25500645);
                                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion10, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                                        composer3.endReplaceGroup();
                                                        composer3.endNode();
                                                        composer3.endNode();
                                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f13)), composer3, 6);
                                                    }
                                                    f10 = f10;
                                                    p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG14);
                                                    f10 = f10;
                                                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion12.getSetModifier());
                                                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                                    builder3 = new AnnotatedString.Builder(0, 1, null);
                                                    long jM3964getWhite0d7_KjU2 = Color.Companion.m3964getWhite0d7_KjU();
                                                    FontWeight.Companion companion14 = FontWeight.Companion;
                                                    iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU2, 0L, companion14.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                    builder3.append("Active: ");
                                                    builder3.pop(iPushStyle5);
                                                    if (g6 != null) {
                                                        jD2 = g6.f13992k;
                                                    } else {
                                                        jD2 = p107y3.a.d();
                                                    }
                                                    int iPushStyle7 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion14.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                    if (str2 != null) {
                                                        strW = q.W(str2, "_", " ");
                                                        if (strW.length() > 0) {
                                                            StringBuilder sb2 = new StringBuilder();
                                                            String strValueOf2 = String.valueOf(strW.charAt(0));
                                                            o.d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                                                            String upperCase4 = strValueOf2.toUpperCase(Locale.ROOT);
                                                            o.e(upperCase4, "toUpperCase(...)");
                                                            sb2.append((Object) upperCase4);
                                                            String strSubstring2 = strW.substring(1);
                                                            o.e(strSubstring2, "substring(...)");
                                                            sb2.append(strSubstring2);
                                                            strW = sb2.toString();
                                                        }
                                                    } else {
                                                        strW = null;
                                                    }
                                                    builder3.append(strW + " Pass");
                                                    builder3.pop(iPushStyle7);
                                                    TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                                    composer3.startReplaceGroup(25500645);
                                                    TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion10, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                                    composer3.endReplaceGroup();
                                                    composer3.endNode();
                                                    composer3.endNode();
                                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f13)), composer3, 6);
                                                }
                                                if (composerM3407constructorimpl10.getInserting()) {
                                                    if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                                    }
                                                    f10 = f10;
                                                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion12.getSetModifier());
                                                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                                    builder3 = new AnnotatedString.Builder(0, 1, null);
                                                    long jM3964getWhite0d7_KjU3 = Color.Companion.m3964getWhite0d7_KjU();
                                                    FontWeight.Companion companion15 = FontWeight.Companion;
                                                    iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU3, 0L, companion15.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                    builder3.append("Active: ");
                                                    builder3.pop(iPushStyle5);
                                                    if (g6 != null) {
                                                        jD2 = g6.f13992k;
                                                    } else {
                                                        jD2 = p107y3.a.d();
                                                    }
                                                    int iPushStyle8 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion15.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                    if (str2 != null) {
                                                        strW = q.W(str2, "_", " ");
                                                        if (strW.length() > 0) {
                                                            StringBuilder sb3 = new StringBuilder();
                                                            String strValueOf3 = String.valueOf(strW.charAt(0));
                                                            o.d(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                                                            String upperCase5 = strValueOf3.toUpperCase(Locale.ROOT);
                                                            o.e(upperCase5, "toUpperCase(...)");
                                                            sb3.append((Object) upperCase5);
                                                            String strSubstring3 = strW.substring(1);
                                                            o.e(strSubstring3, "substring(...)");
                                                            sb3.append(strSubstring3);
                                                            strW = sb3.toString();
                                                        }
                                                    } else {
                                                        strW = null;
                                                    }
                                                    builder3.append(strW + " Pass");
                                                    builder3.pop(iPushStyle8);
                                                    TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                                    composer3.startReplaceGroup(25500645);
                                                    TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion10, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                                    composer3.endReplaceGroup();
                                                    composer3.endNode();
                                                    composer3.endNode();
                                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f13)), composer3, 6);
                                                } else {
                                                    f10 = f10;
                                                }
                                                builder3.append("Active: ");
                                                builder3.pop(iPushStyle5);
                                                if (g6 != null) {
                                                    jD2 = g6.f13992k;
                                                } else {
                                                    jD2 = p107y3.a.d();
                                                }
                                                int iPushStyle9 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion15.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                if (str2 != null) {
                                                    strW = q.W(str2, "_", " ");
                                                    if (strW.length() > 0) {
                                                        StringBuilder sb4 = new StringBuilder();
                                                        String strValueOf4 = String.valueOf(strW.charAt(0));
                                                        o.d(strValueOf4, "null cannot be cast to non-null type java.lang.String");
                                                        String upperCase6 = strValueOf4.toUpperCase(Locale.ROOT);
                                                        o.e(upperCase6, "toUpperCase(...)");
                                                        sb4.append((Object) upperCase6);
                                                        String strSubstring4 = strW.substring(1);
                                                        o.e(strSubstring4, "substring(...)");
                                                        sb4.append(strSubstring4);
                                                        strW = sb4.toString();
                                                    }
                                                } else {
                                                    strW = null;
                                                }
                                                builder3.append(strW + " Pass");
                                                builder3.pop(iPushStyle9);
                                                TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                                composer3.startReplaceGroup(25500645);
                                                TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion10, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                                composer3.endReplaceGroup();
                                                composer3.endNode();
                                                composer3.endNode();
                                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion10, Dp.m6403constructorimpl(f13)), composer3, 6);
                                            } catch (Throwable th2) {
                                                builder3.pop(iPushStyle5);
                                                throw th2;
                                            }
                                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG13);
                                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion12.getSetModifier());
                                            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                                            Modifier modifierM713size3ABfNKs2 = SizeKt.m713size3ABfNKs(companion10, Dp.m6403constructorimpl(28));
                                            if (g6 != null) {
                                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                            } else {
                                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                            }
                                            Modifier modifierM206backgroundbw27NRU2 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs2, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion11.getCenter(), false);
                                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU2);
                                            constructor9 = companion12.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor9);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                            eVarG6 = p035i0.a.g(companion12, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl9, currentCompositionLocalMap11);
                                            if (composerM3407constructorimpl9.getInserting()) {
                                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                            } else {
                                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11, companion12.getSetModifier());
                                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                            ImageVector check2 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                            if (g6 != null) {
                                                jD = g6.f13992k;
                                            } else {
                                                jD = p107y3.a.d();
                                            }
                                            str2 = str;
                                            IconKt.m1877Iconww6aTOc(check2, (String) null, SizeKt.m713size3ABfNKs(companion10, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                            composer3.endNode();
                                            MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion11.getStart(), composer3, 0);
                                            currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap12 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer3, companion10);
                                            constructor10 = companion12.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor10);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                            e eVarG15 = p035i0.a.g(companion12, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl10, currentCompositionLocalMap12);
                                            f10 = f10;
                                            p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG15);
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier12, companion12.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU4 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion16 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU4, 0L, companion16.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        }
                                        composer3.endReplaceGroup();
                                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), Alignment.Companion.getStart(), composer3, 6);
                                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap13 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default3);
                                        ComposeUiNode.Companion companion17 = ComposeUiNode.Companion;
                                        constructor4 = companion17.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor4);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                                        eVarG2 = p035i0.a.g(companion17, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap13);
                                        if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier13, companion17.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                                        composer3.startReplaceGroup(1700618047);
                                        for (G6 g7 : list) {
                                            c(g7, o.b(str2, g7.f13984a), composer3, 0);
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        Modifier.Companion companion18 = Modifier.Companion;
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion18, Dp.m6403constructorimpl(48)), composer3, 6);
                                        builder2 = new AnnotatedString.Builder(0, 1, null);
                                        FontWeight.Companion companion19 = FontWeight.Companion;
                                        FontWeight light2 = companion19.getLight();
                                        Color.Companion companion20 = Color.Companion;
                                        iPushStyle3 = builder2.pushStyle(new SpanStyle(companion20.m3964getWhite0d7_KjU(), 0L, light2, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder2.append("Pass & Benefits ");
                                        builder2.pop(iPushStyle3);
                                        iPushStyle4 = builder2.pushStyle(new SpanStyle(companion20.m3964getWhite0d7_KjU(), 0L, companion19.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder2.append("Comparison");
                                        builder2.pop(iPushStyle4);
                                        AnnotatedString annotatedString = builder2.toAnnotatedString();
                                        long sp = TextUnitKt.getSp(22);
                                        TextAlign.Companion companion21 = TextAlign.Companion;
                                        TextKt.m2433TextIbK3jfQ(annotatedString, SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null), 0L, sp, null, null, null, 0L, null, TextAlign.m6285boximpl(companion21.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer3, 3120, 0, 261620);
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion18, Dp.m6403constructorimpl(f14)), composer3, 6);
                                        float f15 = 16;
                                        TextKt.m2432Text4IGK_g("Compare each Community Pass tier and see what you unlock.", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null), Dp.m6403constructorimpl(f15), 0.0f, 2, null), p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion21.m6292getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 6, 129520);
                                        float f16 = 8;
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion18, Dp.m6403constructorimpl(f16)), composer3, 6);
                                        composer3.endNode();
                                        Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f16));
                                        Arrangement arrangement3 = Arrangement.INSTANCE;
                                        Arrangement.Horizontal end = arrangement3.getEnd();
                                        Alignment.Companion companion22 = Alignment.Companion;
                                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(end, companion22.getCenterVertically(), composer3, 54);
                                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap14 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN5);
                                        ComposeUiNode.Companion companion23 = ComposeUiNode.Companion;
                                        constructor5 = companion23.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor5);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                                        eVarG3 = p035i0.a.g(companion23, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl5, currentCompositionLocalMap14);
                                        if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier14, companion23.getSetModifier());
                                        RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                                        IconKt.m1877Iconww6aTOc(SwipeRightKt.getSwipeRight(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion18, Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                        SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion18, Dp.m6403constructorimpl(4)), composer3, 6);
                                        TextKt.m2432Text4IGK_g("Scroll to compare", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, companion19.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782982, 0, 130898);
                                        composer3.endNode();
                                        Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap15 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default);
                                        constructor6 = companion23.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor6);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                                        eVarG4 = p035i0.a.g(companion23, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl6, currentCompositionLocalMap15);
                                        if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier15, companion23.getSetModifier());
                                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                        b(str2, authManager, composer3, (i9 & 14) | ((i9 >> 3) & 112));
                                        composer3.endNode();
                                        Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion22.getCenterHorizontally(), composer3, 48);
                                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap16 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default2);
                                        constructor7 = companion23.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor7);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                                        eVarG5 = p035i0.a.g(companion23, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl7, currentCompositionLocalMap16);
                                        if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier16, companion23.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                                        b.m(36, companion18, composer3, 6);
                                        p097w3.j.a(SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.a(), composer3, 196614, 30);
                                        b.m(f15, companion18, composer3, 6);
                                        p097w3.j.a(SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.b(), composer3, 196614, 30);
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion18, Dp.m6403constructorimpl(f15)), composer3, 6);
                                        composer3.endNode();
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG11);
                                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier5, companion4.getSetModifier());
                                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                                    f10 = f9;
                                    IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), companion6.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                                    b.r(composer3, f12, companion, composer3, 6);
                                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer3, 54);
                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap17 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default4);
                                    constructor3 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy5, composerM3407constructorimpl3, currentCompositionLocalMap17);
                                    if (composerM3407constructorimpl3.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                    }
                                    p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier17, composer3, 1700472312);
                                    Icons.Outlined outlined2 = Icons.Outlined.INSTANCE;
                                    it = v.S(l.t(AutoAwesomeKt.getAutoAwesome(outlined2), "Premium"), l.t(ShieldKt.getShield(outlined2), "Secure"), l.t(BoltKt.getBolt(outlined2), "Instant")).iterator();
                                    i8 = 0;
                                    while (it.hasNext()) {
                                        next2 = it.next();
                                        i10 = i8 + 1;
                                        if (i8 >= 0) {
                                            v.X();
                                            throw null;
                                        }
                                        B3.h hVar2 = (B3.h) next2;
                                        ImageVector imageVector2 = (ImageVector) hVar2.a();
                                        String str4 = (String) hVar2.b();
                                        composer3.startReplaceGroup(1700473219);
                                        if (i8 > 0) {
                                            BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(3)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                                        }
                                        composer3.endReplaceGroup();
                                        Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(5));
                                        Modifier.Companion companion24 = Modifier.Companion;
                                        MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_5, centerVertically3, composer3, 54);
                                        currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap18 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer3, companion24);
                                        ComposeUiNode.Companion companion25 = ComposeUiNode.Companion;
                                        Modifier.Companion companion26 = companion;
                                        constructor11 = companion25.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor11);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer3);
                                        e eVarG16 = p035i0.a.g(companion25, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy6, composerM3407constructorimpl11, currentCompositionLocalMap18);
                                        if (composerM3407constructorimpl11.getInserting()) {
                                            f11 = f5;
                                            if (!o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier18, companion25.getSetModifier());
                                            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                                            IconKt.m1877Iconww6aTOc(imageVector2, (String) null, SizeKt.m713size3ABfNKs(companion24, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                            String upperCase7 = str4.toUpperCase(Locale.ROOT);
                                            o.e(upperCase7, "toUpperCase(...)");
                                            TextKt.m2432Text4IGK_g(upperCase7, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                            composer3.endNode();
                                            i8 = i10;
                                            it = it;
                                            companion = companion26;
                                            f5 = f11;
                                        } else {
                                            f11 = f5;
                                        }
                                        p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG16);
                                        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier18, companion25.getSetModifier());
                                        RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                                        IconKt.m1877Iconww6aTOc(imageVector2, (String) null, SizeKt.m713size3ABfNKs(companion24, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                        String upperCase8 = str4.toUpperCase(Locale.ROOT);
                                        o.e(upperCase8, "toUpperCase(...)");
                                        TextKt.m2432Text4IGK_g(upperCase8, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                        composer3.endNode();
                                        i8 = i10;
                                        it = it;
                                        companion = companion26;
                                        f5 = f11;
                                    }
                                    modifier2 = companion;
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    composer3.startReplaceGroup(-1720467969);
                                    list = f15342a;
                                    if (z3) {
                                        it2 = list.iterator();
                                        do {
                                            if (it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                        } while (!o.b(((G6) next).f13984a, str));
                                        g6 = (G6) next;
                                        Modifier.Companion companion110 = Modifier.Companion;
                                        Modifier modifierG2 = b.g(SizeKt.fillMaxWidth$default(companion110, 0.0f, 1, null), f10);
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(g6.f13992k, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(modifierG2, jM3926copywmQWz5c$default, null, 2, null);
                                        float fM6403constructorimpl2 = Dp.m6403constructorimpl(f7);
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(b.e(f10, modifierM207backgroundbw27NRU$default2, fM6403constructorimpl2, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f10));
                                        Alignment.Companion companion111 = Alignment.Companion;
                                        Alignment.Vertical centerVertically4 = companion111.getCenterVertically();
                                        Arrangement arrangement4 = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyI2 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement4, centerVertically4, composer3, 54);
                                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap19 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN6);
                                        ComposeUiNode.Companion companion112 = ComposeUiNode.Companion;
                                        constructor8 = companion112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor8);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                                        e eVarG17 = p035i0.a.g(companion112, composerM3407constructorimpl8, measurePolicyI2, composerM3407constructorimpl8, currentCompositionLocalMap19);
                                        if (composerM3407constructorimpl8.getInserting()) {
                                            i9 = i7;
                                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier19, companion112.getSetModifier());
                                            RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                                            Modifier modifierM713size3ABfNKs3 = SizeKt.m713size3ABfNKs(companion110, Dp.m6403constructorimpl(28));
                                            if (g6 != null) {
                                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                            } else {
                                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                            }
                                            Modifier modifierM206backgroundbw27NRU3 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs3, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion111.getCenter(), false);
                                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap110 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU3);
                                            constructor9 = companion112.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor9);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                            eVarG6 = p035i0.a.g(companion112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl9, currentCompositionLocalMap110);
                                            if (composerM3407constructorimpl9.getInserting()) {
                                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                            } else {
                                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier110, companion112.getSetModifier());
                                            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                                            ImageVector check3 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                            if (g6 != null) {
                                                jD = g6.f13992k;
                                            } else {
                                                jD = p107y3.a.d();
                                            }
                                            str2 = str;
                                            IconKt.m1877Iconww6aTOc(check3, (String) null, SizeKt.m713size3ABfNKs(companion110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                            composer3.endNode();
                                            MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion111.getStart(), composer3, 0);
                                            currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap111 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer3, companion110);
                                            constructor10 = companion112.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor10);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                            e eVarG18 = p035i0.a.g(companion112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl10, currentCompositionLocalMap111);
                                            if (composerM3407constructorimpl10.getInserting()) {
                                                if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                                }
                                                f10 = f10;
                                                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111, companion112.getSetModifier());
                                                ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                                                builder3 = new AnnotatedString.Builder(0, 1, null);
                                                long jM3964getWhite0d7_KjU5 = Color.Companion.m3964getWhite0d7_KjU();
                                                FontWeight.Companion companion113 = FontWeight.Companion;
                                                iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU5, 0L, companion113.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                builder3.append("Active: ");
                                                builder3.pop(iPushStyle5);
                                                if (g6 != null) {
                                                    jD2 = g6.f13992k;
                                                } else {
                                                    jD2 = p107y3.a.d();
                                                }
                                                int iPushStyle10 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion113.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                if (str2 != null) {
                                                    strW = q.W(str2, "_", " ");
                                                    if (strW.length() > 0) {
                                                        StringBuilder sb5 = new StringBuilder();
                                                        String strValueOf5 = String.valueOf(strW.charAt(0));
                                                        o.d(strValueOf5, "null cannot be cast to non-null type java.lang.String");
                                                        String upperCase9 = strValueOf5.toUpperCase(Locale.ROOT);
                                                        o.e(upperCase9, "toUpperCase(...)");
                                                        sb5.append((Object) upperCase9);
                                                        String strSubstring5 = strW.substring(1);
                                                        o.e(strSubstring5, "substring(...)");
                                                        sb5.append(strSubstring5);
                                                        strW = sb5.toString();
                                                    }
                                                } else {
                                                    strW = null;
                                                }
                                                builder3.append(strW + " Pass");
                                                builder3.pop(iPushStyle10);
                                                TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                                composer3.startReplaceGroup(25500645);
                                                TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                                composer3.endReplaceGroup();
                                                composer3.endNode();
                                                composer3.endNode();
                                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                            } else {
                                                f10 = f10;
                                            }
                                            f10 = f10;
                                            p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG18);
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111, companion112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU6 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion114 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU6, 0L, companion114.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle11 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion114.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb6 = new StringBuilder();
                                                    String strValueOf6 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf6, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase10 = strValueOf6.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase10, "toUpperCase(...)");
                                                    sb6.append((Object) upperCase10);
                                                    String strSubstring6 = strW.substring(1);
                                                    o.e(strSubstring6, "substring(...)");
                                                    sb6.append(strSubstring6);
                                                    strW = sb6.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle11);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            i9 = i7;
                                        }
                                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG17);
                                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier19, companion112.getSetModifier());
                                        RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                                        Modifier modifierM713size3ABfNKs4 = SizeKt.m713size3ABfNKs(companion110, Dp.m6403constructorimpl(28));
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM206backgroundbw27NRU4 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs4, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion111.getCenter(), false);
                                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap112 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier112 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU4);
                                        constructor9 = companion112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor9);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                        eVarG6 = p035i0.a.g(companion112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl9, currentCompositionLocalMap112);
                                        if (composerM3407constructorimpl9.getInserting()) {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        } else {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier112, companion112.getSetModifier());
                                        BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                                        ImageVector check4 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                        if (g6 != null) {
                                            jD = g6.f13992k;
                                        } else {
                                            jD = p107y3.a.d();
                                        }
                                        str2 = str;
                                        IconKt.m1877Iconww6aTOc(check4, (String) null, SizeKt.m713size3ABfNKs(companion110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                        composer3.endNode();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), companion111.getStart(), composer3, 0);
                                        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap113 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier113 = ComposedModifierKt.materializeModifier(composer3, companion110);
                                        constructor10 = companion112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor10);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                        e eVarG19 = p035i0.a.g(companion112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl10, currentCompositionLocalMap113);
                                        if (composerM3407constructorimpl10.getInserting()) {
                                            if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                            }
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier113, companion112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU7 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion115 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU7, 0L, companion115.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle12 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion115.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb7 = new StringBuilder();
                                                    String strValueOf7 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf7, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase11 = strValueOf7.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase11, "toUpperCase(...)");
                                                    sb7.append((Object) upperCase11);
                                                    String strSubstring7 = strW.substring(1);
                                                    o.e(strSubstring7, "substring(...)");
                                                    sb7.append(strSubstring7);
                                                    strW = sb7.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle12);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            f10 = f10;
                                        }
                                        f10 = f10;
                                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG19);
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier113, companion112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU8 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion116 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU8, 0L, companion116.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle13 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion116.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb8 = new StringBuilder();
                                                String strValueOf8 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf8, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase12 = strValueOf8.toUpperCase(Locale.ROOT);
                                                o.e(upperCase12, "toUpperCase(...)");
                                                sb8.append((Object) upperCase12);
                                                String strSubstring8 = strW.substring(1);
                                                o.e(strSubstring8, "substring(...)");
                                                sb8.append(strSubstring8);
                                                strW = sb8.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle13);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        i9 = i7;
                                        str2 = str;
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), Alignment.Companion.getStart(), composer3, 6);
                                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap114 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier114 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default5);
                                    ComposeUiNode.Companion companion117 = ComposeUiNode.Companion;
                                    constructor4 = companion117.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                                    eVarG2 = p035i0.a.g(companion117, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy10, composerM3407constructorimpl4, currentCompositionLocalMap114);
                                    if (composerM3407constructorimpl4.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier114, companion117.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                                    composer3.startReplaceGroup(1700618047);
                                    while (r0.hasNext()) {
                                        c(g7, o.b(str2, g7.f13984a), composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    Modifier.Companion companion118 = Modifier.Companion;
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion118, Dp.m6403constructorimpl(48)), composer3, 6);
                                    builder2 = new AnnotatedString.Builder(0, 1, null);
                                    FontWeight.Companion companion119 = FontWeight.Companion;
                                    FontWeight light3 = companion119.getLight();
                                    Color.Companion companion27 = Color.Companion;
                                    iPushStyle3 = builder2.pushStyle(new SpanStyle(companion27.m3964getWhite0d7_KjU(), 0L, light3, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder2.append("Pass & Benefits ");
                                    builder2.pop(iPushStyle3);
                                    iPushStyle4 = builder2.pushStyle(new SpanStyle(companion27.m3964getWhite0d7_KjU(), 0L, companion119.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder2.append("Comparison");
                                    builder2.pop(iPushStyle4);
                                    AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                                    long sp2 = TextUnitKt.getSp(22);
                                    TextAlign.Companion companion28 = TextAlign.Companion;
                                    TextKt.m2433TextIbK3jfQ(annotatedString2, SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null), 0L, sp2, null, null, null, 0L, null, TextAlign.m6285boximpl(companion28.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer3, 3120, 0, 261620);
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion118, Dp.m6403constructorimpl(f14)), composer3, 6);
                                    float f17 = 16;
                                    TextKt.m2432Text4IGK_g("Compare each Community Pass tier and see what you unlock.", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null), Dp.m6403constructorimpl(f17), 0.0f, 2, null), p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion28.m6292getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 6, 129520);
                                    float f18 = 8;
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion118, Dp.m6403constructorimpl(f18)), composer3, 6);
                                    composer3.endNode();
                                    Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f18));
                                    Arrangement arrangement5 = Arrangement.INSTANCE;
                                    Arrangement.Horizontal end2 = arrangement5.getEnd();
                                    Alignment.Companion companion29 = Alignment.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(end2, companion29.getCenterVertically(), composer3, 54);
                                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap115 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier115 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN7);
                                    ComposeUiNode.Companion companion210 = ComposeUiNode.Companion;
                                    constructor5 = companion210.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                                    eVarG3 = p035i0.a.g(companion210, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy7, composerM3407constructorimpl5, currentCompositionLocalMap115);
                                    if (composerM3407constructorimpl5.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier115, companion210.getSetModifier());
                                    RowScopeInstance rowScopeInstance10 = RowScopeInstance.INSTANCE;
                                    IconKt.m1877Iconww6aTOc(SwipeRightKt.getSwipeRight(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion118, Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion118, Dp.m6403constructorimpl(4)), composer3, 6);
                                    TextKt.m2432Text4IGK_g("Scroll to compare", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, companion119.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782982, 0, 130898);
                                    composer3.endNode();
                                    Modifier modifierHorizontalScroll$default2 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion29.getTopStart(), false);
                                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap116 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier116 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default2);
                                    constructor6 = companion210.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor6);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                                    eVarG4 = p035i0.a.g(companion210, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl6, currentCompositionLocalMap116);
                                    if (composerM3407constructorimpl6.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier116, companion210.getSetModifier());
                                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                                    b(str2, authManager, composer3, (i9 & 14) | ((i9 >> 3) & 112));
                                    composer3.endNode();
                                    Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion29.getCenterHorizontally(), composer3, 48);
                                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap117 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier117 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default3);
                                    constructor7 = companion210.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor7);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                                    eVarG5 = p035i0.a.g(companion210, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy11, composerM3407constructorimpl7, currentCompositionLocalMap117);
                                    if (composerM3407constructorimpl7.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier117, companion210.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                                    b.m(36, companion118, composer3, 6);
                                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.a(), composer3, 196614, 30);
                                    b.m(f17, companion118, composer3, 6);
                                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.b(), composer3, 196614, 30);
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion118, Dp.m6403constructorimpl(f17)), composer3, 6);
                                    composer3.endNode();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG10);
                                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion4.getSetModifier());
                                long jD4 = p107y3.a.d();
                                FontWeight.Companion companion30 = FontWeight.Companion;
                                companion = companion2;
                                i7 = i6;
                                Composer composer5 = composer2;
                                TextKt.m2432Text4IGK_g("COMMUNITY PASS", (Modifier) null, jD4, TextUnitKt.getSp(10), (FontStyle) null, companion30.getBlack(), (FontFamily) null, TextUnitKt.getSp(2.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 12782982, 0, 130898);
                                float f19 = 6;
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f19)), composer5, 6);
                                builder = new AnnotatedString.Builder(0, 1, null);
                                FontWeight light4 = companion30.getLight();
                                Color.Companion companion31 = Color.Companion;
                                iPushStyle = builder.pushStyle(new SpanStyle(companion31.m3964getWhite0d7_KjU(), 0L, light4, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder.append("Choose your ");
                                builder.pop(iPushStyle);
                                iPushStyle2 = builder.pushStyle(new SpanStyle(companion31.m3964getWhite0d7_KjU(), 0L, companion30.getExtraBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder.append("Pass");
                                builder.pop(iPushStyle2);
                                TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, TextUnitKt.getSp(26), null, null, null, 0L, null, null, TextUnitKt.getSp(32), 0, false, 0, 0, null, null, null, composer5, 3072, 6, 261110);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f19)), composer5, 6);
                                TextKt.m2432Text4IGK_g("Support NotesCrafter and unlock unlimited processing power.", (Modifier) null, p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 3462, 6, 130034);
                                composer5.endNode();
                                f6 = 14;
                                f7 = 1;
                                z3 = z5;
                                Modifier modifierE2 = b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.d(f6, companion), Color.m3926copywmQWz5c$default(companion31.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion31.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                                composer3 = composer5;
                                composer3.startReplaceGroup(1700439523);
                                if ((i7 & 7168) == 2048) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objRememberedValue = composer3.rememberedValue();
                                if (z4) {
                                    objRememberedValue = new O(1, onBack);
                                    composer3.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new O(1, onBack);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                f8 = 10;
                                Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE2, false, null, null, (a) objRememberedValue, 7, null), Dp.m6403constructorimpl(f8));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap20 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier20 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs2);
                                constructor2 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                                e eVarG110 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl2, currentCompositionLocalMap20);
                                if (composerM3407constructorimpl2.getInserting()) {
                                    f9 = f6;
                                    if (!o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier20, companion4.getSetModifier());
                                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                                    f10 = f9;
                                    IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), companion31.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                                    b.r(composer3, f12, companion, composer3, 6);
                                    Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer3, 54);
                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap118 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier118 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default6);
                                    constructor3 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy8, composerM3407constructorimpl3, currentCompositionLocalMap118);
                                    if (composerM3407constructorimpl3.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                    }
                                    p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier118, composer3, 1700472312);
                                    Icons.Outlined outlined3 = Icons.Outlined.INSTANCE;
                                    it = v.S(l.t(AutoAwesomeKt.getAutoAwesome(outlined3), "Premium"), l.t(ShieldKt.getShield(outlined3), "Secure"), l.t(BoltKt.getBolt(outlined3), "Instant")).iterator();
                                    i8 = 0;
                                    while (it.hasNext()) {
                                        next2 = it.next();
                                        i10 = i8 + 1;
                                        if (i8 >= 0) {
                                            v.X();
                                            throw null;
                                        }
                                        B3.h hVar3 = (B3.h) next2;
                                        ImageVector imageVector3 = (ImageVector) hVar3.a();
                                        String str5 = (String) hVar3.b();
                                        composer3.startReplaceGroup(1700473219);
                                        if (i8 > 0) {
                                            BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(3)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                                        }
                                        composer3.endReplaceGroup();
                                        Alignment.Vertical centerVertically5 = Alignment.Companion.getCenterVertically();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_6 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(5));
                                        Modifier.Companion companion211 = Modifier.Companion;
                                        MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_6, centerVertically5, composer3, 54);
                                        currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap119 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier119 = ComposedModifierKt.materializeModifier(composer3, companion211);
                                        ComposeUiNode.Companion companion212 = ComposeUiNode.Companion;
                                        Modifier.Companion companion213 = companion;
                                        constructor11 = companion212.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor11);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer3);
                                        e eVarG111 = p035i0.a.g(companion212, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy9, composerM3407constructorimpl11, currentCompositionLocalMap119);
                                        if (composerM3407constructorimpl11.getInserting()) {
                                            f11 = f5;
                                            if (!o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier119, companion212.getSetModifier());
                                            RowScopeInstance rowScopeInstance11 = RowScopeInstance.INSTANCE;
                                            IconKt.m1877Iconww6aTOc(imageVector3, (String) null, SizeKt.m713size3ABfNKs(companion211, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                            String upperCase13 = str5.toUpperCase(Locale.ROOT);
                                            o.e(upperCase13, "toUpperCase(...)");
                                            TextKt.m2432Text4IGK_g(upperCase13, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                            composer3.endNode();
                                            i8 = i10;
                                            it = it;
                                            companion = companion213;
                                            f5 = f11;
                                        } else {
                                            f11 = f5;
                                        }
                                        p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG111);
                                        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier119, companion212.getSetModifier());
                                        RowScopeInstance rowScopeInstance12 = RowScopeInstance.INSTANCE;
                                        IconKt.m1877Iconww6aTOc(imageVector3, (String) null, SizeKt.m713size3ABfNKs(companion211, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                        String upperCase14 = str5.toUpperCase(Locale.ROOT);
                                        o.e(upperCase14, "toUpperCase(...)");
                                        TextKt.m2432Text4IGK_g(upperCase14, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                        composer3.endNode();
                                        i8 = i10;
                                        it = it;
                                        companion = companion213;
                                        f5 = f11;
                                    }
                                    modifier2 = companion;
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    composer3.startReplaceGroup(-1720467969);
                                    list = f15342a;
                                    if (z3) {
                                        it2 = list.iterator();
                                        do {
                                            if (it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                        } while (!o.b(((G6) next).f13984a, str));
                                        g6 = (G6) next;
                                        Modifier.Companion companion1110 = Modifier.Companion;
                                        Modifier modifierG3 = b.g(SizeKt.fillMaxWidth$default(companion1110, 0.0f, 1, null), f10);
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(g6.f13992k, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(modifierG3, jM3926copywmQWz5c$default, null, 2, null);
                                        float fM6403constructorimpl3 = Dp.m6403constructorimpl(f7);
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM669paddingVpY3zN8 = PaddingKt.m669paddingVpY3zN4(b.e(f10, modifierM207backgroundbw27NRU$default3, fM6403constructorimpl3, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f10));
                                        Alignment.Companion companion1111 = Alignment.Companion;
                                        Alignment.Vertical centerVertically6 = companion1111.getCenterVertically();
                                        Arrangement arrangement6 = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyI3 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement6, centerVertically6, composer3, 54);
                                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap120 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier120 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN8);
                                        ComposeUiNode.Companion companion1112 = ComposeUiNode.Companion;
                                        constructor8 = companion1112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor8);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                                        e eVarG112 = p035i0.a.g(companion1112, composerM3407constructorimpl8, measurePolicyI3, composerM3407constructorimpl8, currentCompositionLocalMap120);
                                        if (composerM3407constructorimpl8.getInserting()) {
                                            i9 = i7;
                                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier120, companion1112.getSetModifier());
                                            RowScopeInstance rowScopeInstance13 = RowScopeInstance.INSTANCE;
                                            Modifier modifierM713size3ABfNKs5 = SizeKt.m713size3ABfNKs(companion1110, Dp.m6403constructorimpl(28));
                                            if (g6 != null) {
                                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                            } else {
                                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                            }
                                            Modifier modifierM206backgroundbw27NRU5 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs5, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion1111.getCenter(), false);
                                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap1110 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier1110 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU5);
                                            constructor9 = companion1112.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor9);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                            eVarG6 = p035i0.a.g(companion1112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl9, currentCompositionLocalMap1110);
                                            if (composerM3407constructorimpl9.getInserting()) {
                                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                            } else {
                                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1110, companion1112.getSetModifier());
                                            BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                                            ImageVector check5 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                            if (g6 != null) {
                                                jD = g6.f13992k;
                                            } else {
                                                jD = p107y3.a.d();
                                            }
                                            str2 = str;
                                            IconKt.m1877Iconww6aTOc(check5, (String) null, SizeKt.m713size3ABfNKs(companion1110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                            composer3.endNode();
                                            MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion1111.getStart(), composer3, 0);
                                            currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap1111 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier1111 = ComposedModifierKt.materializeModifier(composer3, companion1110);
                                            constructor10 = companion1112.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor10);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                            e eVarG113 = p035i0.a.g(companion1112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy12, composerM3407constructorimpl10, currentCompositionLocalMap1111);
                                            if (composerM3407constructorimpl10.getInserting()) {
                                                if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                                }
                                                f10 = f10;
                                                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier1111, companion1112.getSetModifier());
                                                ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
                                                builder3 = new AnnotatedString.Builder(0, 1, null);
                                                long jM3964getWhite0d7_KjU9 = Color.Companion.m3964getWhite0d7_KjU();
                                                FontWeight.Companion companion1113 = FontWeight.Companion;
                                                iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU9, 0L, companion1113.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                builder3.append("Active: ");
                                                builder3.pop(iPushStyle5);
                                                if (g6 != null) {
                                                    jD2 = g6.f13992k;
                                                } else {
                                                    jD2 = p107y3.a.d();
                                                }
                                                int iPushStyle14 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion1113.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                if (str2 != null) {
                                                    strW = q.W(str2, "_", " ");
                                                    if (strW.length() > 0) {
                                                        StringBuilder sb9 = new StringBuilder();
                                                        String strValueOf9 = String.valueOf(strW.charAt(0));
                                                        o.d(strValueOf9, "null cannot be cast to non-null type java.lang.String");
                                                        String upperCase15 = strValueOf9.toUpperCase(Locale.ROOT);
                                                        o.e(upperCase15, "toUpperCase(...)");
                                                        sb9.append((Object) upperCase15);
                                                        String strSubstring9 = strW.substring(1);
                                                        o.e(strSubstring9, "substring(...)");
                                                        sb9.append(strSubstring9);
                                                        strW = sb9.toString();
                                                    }
                                                } else {
                                                    strW = null;
                                                }
                                                builder3.append(strW + " Pass");
                                                builder3.pop(iPushStyle14);
                                                TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                                composer3.startReplaceGroup(25500645);
                                                TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion1110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                                composer3.endReplaceGroup();
                                                composer3.endNode();
                                                composer3.endNode();
                                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                            } else {
                                                f10 = f10;
                                            }
                                            f10 = f10;
                                            p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG113);
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier1111, companion1112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU10 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion1114 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU10, 0L, companion1114.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle15 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion1114.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb10 = new StringBuilder();
                                                    String strValueOf10 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf10, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase16 = strValueOf10.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase16, "toUpperCase(...)");
                                                    sb10.append((Object) upperCase16);
                                                    String strSubstring10 = strW.substring(1);
                                                    o.e(strSubstring10, "substring(...)");
                                                    sb10.append(strSubstring10);
                                                    strW = sb10.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle15);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion1110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            i9 = i7;
                                        }
                                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG112);
                                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier120, companion1112.getSetModifier());
                                        RowScopeInstance rowScopeInstance14 = RowScopeInstance.INSTANCE;
                                        Modifier modifierM713size3ABfNKs6 = SizeKt.m713size3ABfNKs(companion1110, Dp.m6403constructorimpl(28));
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM206backgroundbw27NRU6 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs6, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion1111.getCenter(), false);
                                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap1112 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier1112 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU6);
                                        constructor9 = companion1112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor9);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                        eVarG6 = p035i0.a.g(companion1112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl9, currentCompositionLocalMap1112);
                                        if (composerM3407constructorimpl9.getInserting()) {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        } else {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1112, companion1112.getSetModifier());
                                        BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                                        ImageVector check6 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                        if (g6 != null) {
                                            jD = g6.f13992k;
                                        } else {
                                            jD = p107y3.a.d();
                                        }
                                        str2 = str;
                                        IconKt.m1877Iconww6aTOc(check6, (String) null, SizeKt.m713size3ABfNKs(companion1110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                        composer3.endNode();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion1111.getStart(), composer3, 0);
                                        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap1113 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier1113 = ComposedModifierKt.materializeModifier(composer3, companion1110);
                                        constructor10 = companion1112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor10);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                        e eVarG114 = p035i0.a.g(companion1112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy13, composerM3407constructorimpl10, currentCompositionLocalMap1113);
                                        if (composerM3407constructorimpl10.getInserting()) {
                                            if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                            }
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier1113, companion1112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance16 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU11 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion1115 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU11, 0L, companion1115.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle16 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion1115.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb11 = new StringBuilder();
                                                    String strValueOf11 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf11, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase17 = strValueOf11.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase17, "toUpperCase(...)");
                                                    sb11.append((Object) upperCase17);
                                                    String strSubstring11 = strW.substring(1);
                                                    o.e(strSubstring11, "substring(...)");
                                                    sb11.append(strSubstring11);
                                                    strW = sb11.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle16);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion1110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            f10 = f10;
                                        }
                                        f10 = f10;
                                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG114);
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier1113, companion1112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance17 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU12 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion1116 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU12, 0L, companion1116.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle17 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion1116.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb12 = new StringBuilder();
                                                String strValueOf12 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf12, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase18 = strValueOf12.toUpperCase(Locale.ROOT);
                                                o.e(upperCase18, "toUpperCase(...)");
                                                sb12.append((Object) upperCase18);
                                                String strSubstring12 = strW.substring(1);
                                                o.e(strSubstring12, "substring(...)");
                                                sb12.append(strSubstring12);
                                                strW = sb12.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle17);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion1110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        i9 = i7;
                                        str2 = str;
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), Alignment.Companion.getStart(), composer3, 6);
                                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap1114 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier1114 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default7);
                                    ComposeUiNode.Companion companion1117 = ComposeUiNode.Companion;
                                    constructor4 = companion1117.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                                    eVarG2 = p035i0.a.g(companion1117, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy14, composerM3407constructorimpl4, currentCompositionLocalMap1114);
                                    if (composerM3407constructorimpl4.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1114, companion1117.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance18 = ColumnScopeInstance.INSTANCE;
                                    composer3.startReplaceGroup(1700618047);
                                    while (r0.hasNext()) {
                                        c(g7, o.b(str2, g7.f13984a), composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    Modifier.Companion companion1118 = Modifier.Companion;
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1118, Dp.m6403constructorimpl(48)), composer3, 6);
                                    builder2 = new AnnotatedString.Builder(0, 1, null);
                                    FontWeight.Companion companion1119 = FontWeight.Companion;
                                    FontWeight light5 = companion1119.getLight();
                                    Color.Companion companion214 = Color.Companion;
                                    iPushStyle3 = builder2.pushStyle(new SpanStyle(companion214.m3964getWhite0d7_KjU(), 0L, light5, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder2.append("Pass & Benefits ");
                                    builder2.pop(iPushStyle3);
                                    iPushStyle4 = builder2.pushStyle(new SpanStyle(companion214.m3964getWhite0d7_KjU(), 0L, companion1119.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder2.append("Comparison");
                                    builder2.pop(iPushStyle4);
                                    AnnotatedString annotatedString3 = builder2.toAnnotatedString();
                                    long sp3 = TextUnitKt.getSp(22);
                                    TextAlign.Companion companion215 = TextAlign.Companion;
                                    TextKt.m2433TextIbK3jfQ(annotatedString3, SizeKt.fillMaxWidth$default(companion1118, 0.0f, 1, null), 0L, sp3, null, null, null, 0L, null, TextAlign.m6285boximpl(companion215.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer3, 3120, 0, 261620);
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1118, Dp.m6403constructorimpl(f19)), composer3, 6);
                                    float f110 = 16;
                                    TextKt.m2432Text4IGK_g("Compare each Community Pass tier and see what you unlock.", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion1118, 0.0f, 1, null), Dp.m6403constructorimpl(f110), 0.0f, 2, null), p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion215.m6292getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 6, 129520);
                                    float f111 = 8;
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1118, Dp.m6403constructorimpl(f111)), composer3, 6);
                                    composer3.endNode();
                                    Modifier modifierM669paddingVpY3zN9 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion1118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f111));
                                    Arrangement arrangement7 = Arrangement.INSTANCE;
                                    Arrangement.Horizontal end3 = arrangement7.getEnd();
                                    Alignment.Companion companion216 = Alignment.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(end3, companion216.getCenterVertically(), composer3, 54);
                                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap1115 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier1115 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN9);
                                    ComposeUiNode.Companion companion217 = ComposeUiNode.Companion;
                                    constructor5 = companion217.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                                    eVarG3 = p035i0.a.g(companion217, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy10, composerM3407constructorimpl5, currentCompositionLocalMap1115);
                                    if (composerM3407constructorimpl5.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1115, companion217.getSetModifier());
                                    RowScopeInstance rowScopeInstance15 = RowScopeInstance.INSTANCE;
                                    IconKt.m1877Iconww6aTOc(SwipeRightKt.getSwipeRight(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion1118, Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion1118, Dp.m6403constructorimpl(4)), composer3, 6);
                                    TextKt.m2432Text4IGK_g("Scroll to compare", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, companion1119.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782982, 0, 130898);
                                    composer3.endNode();
                                    Modifier modifierHorizontalScroll$default3 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion1118, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy11 = BoxKt.maybeCachedBoxMeasurePolicy(companion216.getTopStart(), false);
                                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap1116 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier1116 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default3);
                                    constructor6 = companion217.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor6);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                                    eVarG4 = p035i0.a.g(companion217, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy11, composerM3407constructorimpl6, currentCompositionLocalMap1116);
                                    if (composerM3407constructorimpl6.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1116, companion217.getSetModifier());
                                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                                    b(str2, authManager, composer3, (i9 & 14) | ((i9 >> 3) & 112));
                                    composer3.endNode();
                                    Modifier modifierM670paddingVpY3zN4$default4 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion1118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), companion216.getCenterHorizontally(), composer3, 48);
                                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap1117 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier1117 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default4);
                                    constructor7 = companion217.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor7);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                                    eVarG5 = p035i0.a.g(companion217, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy15, composerM3407constructorimpl7, currentCompositionLocalMap1117);
                                    if (composerM3407constructorimpl7.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1117, companion217.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance19 = ColumnScopeInstance.INSTANCE;
                                    b.m(36, companion1118, composer3, 6);
                                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion1118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.a(), composer3, 196614, 30);
                                    b.m(f110, companion1118, composer3, 6);
                                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion1118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.b(), composer3, 196614, 30);
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1118, Dp.m6403constructorimpl(f110)), composer3, 6);
                                    composer3.endNode();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    f9 = f6;
                                }
                                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG110);
                                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier20, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                                f10 = f9;
                                IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), companion31.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                                b.r(composer3, f12, companion, composer3, 6);
                                Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer3, 54);
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap1118 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1118 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default8);
                                constructor3 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy11, composerM3407constructorimpl3, currentCompositionLocalMap1118);
                                if (composerM3407constructorimpl3.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                }
                                p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier1118, composer3, 1700472312);
                                Icons.Outlined outlined4 = Icons.Outlined.INSTANCE;
                                it = v.S(l.t(AutoAwesomeKt.getAutoAwesome(outlined4), "Premium"), l.t(ShieldKt.getShield(outlined4), "Secure"), l.t(BoltKt.getBolt(outlined4), "Instant")).iterator();
                                i8 = 0;
                                while (it.hasNext()) {
                                    next2 = it.next();
                                    i10 = i8 + 1;
                                    if (i8 >= 0) {
                                        v.X();
                                        throw null;
                                    }
                                    B3.h hVar4 = (B3.h) next2;
                                    ImageVector imageVector4 = (ImageVector) hVar4.a();
                                    String str6 = (String) hVar4.b();
                                    composer3.startReplaceGroup(1700473219);
                                    if (i8 > 0) {
                                        BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(3)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    Alignment.Vertical centerVertically7 = Alignment.Companion.getCenterVertically();
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_7 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(5));
                                    Modifier.Companion companion218 = Modifier.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_7, centerVertically7, composer3, 54);
                                    currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap1119 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier1119 = ComposedModifierKt.materializeModifier(composer3, companion218);
                                    ComposeUiNode.Companion companion219 = ComposeUiNode.Companion;
                                    Modifier.Companion companion2110 = companion;
                                    constructor11 = companion219.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor11);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer3);
                                    e eVarG115 = p035i0.a.g(companion219, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy12, composerM3407constructorimpl11, currentCompositionLocalMap1119);
                                    if (composerM3407constructorimpl11.getInserting()) {
                                        f11 = f5;
                                        if (!o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier1119, companion219.getSetModifier());
                                        RowScopeInstance rowScopeInstance16 = RowScopeInstance.INSTANCE;
                                        IconKt.m1877Iconww6aTOc(imageVector4, (String) null, SizeKt.m713size3ABfNKs(companion218, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                        String upperCase19 = str6.toUpperCase(Locale.ROOT);
                                        o.e(upperCase19, "toUpperCase(...)");
                                        TextKt.m2432Text4IGK_g(upperCase19, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                        composer3.endNode();
                                        i8 = i10;
                                        it = it;
                                        companion = companion2110;
                                        f5 = f11;
                                    } else {
                                        f11 = f5;
                                    }
                                    p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG115);
                                    Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier1119, companion219.getSetModifier());
                                    RowScopeInstance rowScopeInstance17 = RowScopeInstance.INSTANCE;
                                    IconKt.m1877Iconww6aTOc(imageVector4, (String) null, SizeKt.m713size3ABfNKs(companion218, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                    String upperCase110 = str6.toUpperCase(Locale.ROOT);
                                    o.e(upperCase110, "toUpperCase(...)");
                                    TextKt.m2432Text4IGK_g(upperCase110, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                    composer3.endNode();
                                    i8 = i10;
                                    it = it;
                                    companion = companion2110;
                                    f5 = f11;
                                }
                                modifier2 = companion;
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(f13)), composer3, 6);
                                composer3.startReplaceGroup(-1720467969);
                                list = f15342a;
                                if (z3) {
                                    it2 = list.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (!o.b(((G6) next).f13984a, str));
                                    g6 = (G6) next;
                                    Modifier.Companion companion11110 = Modifier.Companion;
                                    Modifier modifierG4 = b.g(SizeKt.fillMaxWidth$default(companion11110, 0.0f, 1, null), f10);
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(g6.f13992k, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(modifierG4, jM3926copywmQWz5c$default, null, 2, null);
                                    float fM6403constructorimpl4 = Dp.m6403constructorimpl(f7);
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM669paddingVpY3zN10 = PaddingKt.m669paddingVpY3zN4(b.e(f10, modifierM207backgroundbw27NRU$default4, fM6403constructorimpl4, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f10));
                                    Alignment.Companion companion11111 = Alignment.Companion;
                                    Alignment.Vertical centerVertically8 = companion11111.getCenterVertically();
                                    Arrangement arrangement8 = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyI4 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement8, centerVertically8, composer3, 54);
                                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap121 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier121 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN10);
                                    ComposeUiNode.Companion companion11112 = ComposeUiNode.Companion;
                                    constructor8 = companion11112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor8);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                                    e eVarG116 = p035i0.a.g(companion11112, composerM3407constructorimpl8, measurePolicyI4, composerM3407constructorimpl8, currentCompositionLocalMap121);
                                    if (composerM3407constructorimpl8.getInserting()) {
                                        i9 = i7;
                                        if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier121, companion11112.getSetModifier());
                                        RowScopeInstance rowScopeInstance18 = RowScopeInstance.INSTANCE;
                                        Modifier modifierM713size3ABfNKs7 = SizeKt.m713size3ABfNKs(companion11110, Dp.m6403constructorimpl(28));
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM206backgroundbw27NRU7 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs7, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy12 = BoxKt.maybeCachedBoxMeasurePolicy(companion11111.getCenter(), false);
                                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap11110 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier11110 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU7);
                                        constructor9 = companion11112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor9);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                        eVarG6 = p035i0.a.g(companion11112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy12, composerM3407constructorimpl9, currentCompositionLocalMap11110);
                                        if (composerM3407constructorimpl9.getInserting()) {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        } else {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11110, companion11112.getSetModifier());
                                        BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                                        ImageVector check7 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                        if (g6 != null) {
                                            jD = g6.f13992k;
                                        } else {
                                            jD = p107y3.a.d();
                                        }
                                        str2 = str;
                                        IconKt.m1877Iconww6aTOc(check7, (String) null, SizeKt.m713size3ABfNKs(companion11110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                        composer3.endNode();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy16 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion11111.getStart(), composer3, 0);
                                        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap11111 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier11111 = ComposedModifierKt.materializeModifier(composer3, companion11110);
                                        constructor10 = companion11112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor10);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                        e eVarG117 = p035i0.a.g(companion11112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy16, composerM3407constructorimpl10, currentCompositionLocalMap11111);
                                        if (composerM3407constructorimpl10.getInserting()) {
                                            if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                            }
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier11111, companion11112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance110 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU13 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion11113 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU13, 0L, companion11113.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle18 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion11113.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb13 = new StringBuilder();
                                                    String strValueOf13 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf13, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase111 = strValueOf13.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase111, "toUpperCase(...)");
                                                    sb13.append((Object) upperCase111);
                                                    String strSubstring13 = strW.substring(1);
                                                    o.e(strSubstring13, "substring(...)");
                                                    sb13.append(strSubstring13);
                                                    strW = sb13.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle18);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion11110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            f10 = f10;
                                        }
                                        f10 = f10;
                                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG117);
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier11111, companion11112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance111 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU14 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion11114 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU14, 0L, companion11114.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle19 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion11114.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb14 = new StringBuilder();
                                                String strValueOf14 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf14, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase112 = strValueOf14.toUpperCase(Locale.ROOT);
                                                o.e(upperCase112, "toUpperCase(...)");
                                                sb14.append((Object) upperCase112);
                                                String strSubstring14 = strW.substring(1);
                                                o.e(strSubstring14, "substring(...)");
                                                sb14.append(strSubstring14);
                                                strW = sb14.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle19);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion11110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        i9 = i7;
                                    }
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG116);
                                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier121, companion11112.getSetModifier());
                                    RowScopeInstance rowScopeInstance19 = RowScopeInstance.INSTANCE;
                                    Modifier modifierM713size3ABfNKs8 = SizeKt.m713size3ABfNKs(companion11110, Dp.m6403constructorimpl(28));
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM206backgroundbw27NRU8 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs8, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy13 = BoxKt.maybeCachedBoxMeasurePolicy(companion11111.getCenter(), false);
                                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap11112 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier11112 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU8);
                                    constructor9 = companion11112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor9);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                    eVarG6 = p035i0.a.g(companion11112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy13, composerM3407constructorimpl9, currentCompositionLocalMap11112);
                                    if (composerM3407constructorimpl9.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11112, companion11112.getSetModifier());
                                    BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                                    ImageVector check8 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                    if (g6 != null) {
                                        jD = g6.f13992k;
                                    } else {
                                        jD = p107y3.a.d();
                                    }
                                    str2 = str;
                                    IconKt.m1877Iconww6aTOc(check8, (String) null, SizeKt.m713size3ABfNKs(companion11110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                    composer3.endNode();
                                    MeasurePolicy measurePolicyColumnMeasurePolicy17 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion11111.getStart(), composer3, 0);
                                    currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap11113 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier11113 = ComposedModifierKt.materializeModifier(composer3, companion11110);
                                    constructor10 = companion11112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor10);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                    e eVarG118 = p035i0.a.g(companion11112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy17, composerM3407constructorimpl10, currentCompositionLocalMap11113);
                                    if (composerM3407constructorimpl10.getInserting()) {
                                        if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                        }
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier11113, companion11112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance112 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU15 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion11115 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU15, 0L, companion11115.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle110 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion11115.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb15 = new StringBuilder();
                                                String strValueOf15 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf15, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase113 = strValueOf15.toUpperCase(Locale.ROOT);
                                                o.e(upperCase113, "toUpperCase(...)");
                                                sb15.append((Object) upperCase113);
                                                String strSubstring15 = strW.substring(1);
                                                o.e(strSubstring15, "substring(...)");
                                                sb15.append(strSubstring15);
                                                strW = sb15.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle110);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion11110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        f10 = f10;
                                    }
                                    f10 = f10;
                                    p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG118);
                                    f10 = f10;
                                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier11113, companion11112.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance113 = ColumnScopeInstance.INSTANCE;
                                    builder3 = new AnnotatedString.Builder(0, 1, null);
                                    long jM3964getWhite0d7_KjU16 = Color.Companion.m3964getWhite0d7_KjU();
                                    FontWeight.Companion companion11116 = FontWeight.Companion;
                                    iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU16, 0L, companion11116.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder3.append("Active: ");
                                    builder3.pop(iPushStyle5);
                                    if (g6 != null) {
                                        jD2 = g6.f13992k;
                                    } else {
                                        jD2 = p107y3.a.d();
                                    }
                                    int iPushStyle111 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion11116.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    if (str2 != null) {
                                        strW = q.W(str2, "_", " ");
                                        if (strW.length() > 0) {
                                            StringBuilder sb16 = new StringBuilder();
                                            String strValueOf16 = String.valueOf(strW.charAt(0));
                                            o.d(strValueOf16, "null cannot be cast to non-null type java.lang.String");
                                            String upperCase114 = strValueOf16.toUpperCase(Locale.ROOT);
                                            o.e(upperCase114, "toUpperCase(...)");
                                            sb16.append((Object) upperCase114);
                                            String strSubstring16 = strW.substring(1);
                                            o.e(strSubstring16, "substring(...)");
                                            sb16.append(strSubstring16);
                                            strW = sb16.toString();
                                        }
                                    } else {
                                        strW = null;
                                    }
                                    builder3.append(strW + " Pass");
                                    builder3.pop(iPushStyle111);
                                    TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                    composer3.startReplaceGroup(25500645);
                                    TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion11110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    composer3.endNode();
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                } else {
                                    i9 = i7;
                                    str2 = str;
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy18 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), Alignment.Companion.getStart(), composer3, 6);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap11114 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11114 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default9);
                                ComposeUiNode.Companion companion11117 = ComposeUiNode.Companion;
                                constructor4 = companion11117.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                                eVarG2 = p035i0.a.g(companion11117, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy18, composerM3407constructorimpl4, currentCompositionLocalMap11114);
                                if (composerM3407constructorimpl4.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11114, companion11117.getSetModifier());
                                ColumnScopeInstance columnScopeInstance114 = ColumnScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(1700618047);
                                while (r0.hasNext()) {
                                    c(g7, o.b(str2, g7.f13984a), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                Modifier.Companion companion11118 = Modifier.Companion;
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11118, Dp.m6403constructorimpl(48)), composer3, 6);
                                builder2 = new AnnotatedString.Builder(0, 1, null);
                                FontWeight.Companion companion11119 = FontWeight.Companion;
                                FontWeight light6 = companion11119.getLight();
                                Color.Companion companion2111 = Color.Companion;
                                iPushStyle3 = builder2.pushStyle(new SpanStyle(companion2111.m3964getWhite0d7_KjU(), 0L, light6, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder2.append("Pass & Benefits ");
                                builder2.pop(iPushStyle3);
                                iPushStyle4 = builder2.pushStyle(new SpanStyle(companion2111.m3964getWhite0d7_KjU(), 0L, companion11119.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder2.append("Comparison");
                                builder2.pop(iPushStyle4);
                                AnnotatedString annotatedString4 = builder2.toAnnotatedString();
                                long sp4 = TextUnitKt.getSp(22);
                                TextAlign.Companion companion2112 = TextAlign.Companion;
                                TextKt.m2433TextIbK3jfQ(annotatedString4, SizeKt.fillMaxWidth$default(companion11118, 0.0f, 1, null), 0L, sp4, null, null, null, 0L, null, TextAlign.m6285boximpl(companion2112.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer3, 3120, 0, 261620);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11118, Dp.m6403constructorimpl(f19)), composer3, 6);
                                float f112 = 16;
                                TextKt.m2432Text4IGK_g("Compare each Community Pass tier and see what you unlock.", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion11118, 0.0f, 1, null), Dp.m6403constructorimpl(f112), 0.0f, 2, null), p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion2112.m6292getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 6, 129520);
                                float f113 = 8;
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11118, Dp.m6403constructorimpl(f113)), composer3, 6);
                                composer3.endNode();
                                Modifier modifierM669paddingVpY3zN11 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion11118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f113));
                                Arrangement arrangement9 = Arrangement.INSTANCE;
                                Arrangement.Horizontal end4 = arrangement9.getEnd();
                                Alignment.Companion companion2113 = Alignment.Companion;
                                MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(end4, companion2113.getCenterVertically(), composer3, 54);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap11115 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11115 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN11);
                                ComposeUiNode.Companion companion2114 = ComposeUiNode.Companion;
                                constructor5 = companion2114.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                                eVarG3 = p035i0.a.g(companion2114, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy13, composerM3407constructorimpl5, currentCompositionLocalMap11115);
                                if (composerM3407constructorimpl5.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11115, companion2114.getSetModifier());
                                RowScopeInstance rowScopeInstance110 = RowScopeInstance.INSTANCE;
                                IconKt.m1877Iconww6aTOc(SwipeRightKt.getSwipeRight(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion11118, Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion11118, Dp.m6403constructorimpl(4)), composer3, 6);
                                TextKt.m2432Text4IGK_g("Scroll to compare", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, companion11119.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782982, 0, 130898);
                                composer3.endNode();
                                Modifier modifierHorizontalScroll$default4 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion11118, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy14 = BoxKt.maybeCachedBoxMeasurePolicy(companion2113.getTopStart(), false);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap11116 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11116 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default4);
                                constructor6 = companion2114.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor6);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                                eVarG4 = p035i0.a.g(companion2114, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy14, composerM3407constructorimpl6, currentCompositionLocalMap11116);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11116, companion2114.getSetModifier());
                                BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                                b(str2, authManager, composer3, (i9 & 14) | ((i9 >> 3) & 112));
                                composer3.endNode();
                                Modifier modifierM670paddingVpY3zN4$default5 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion11118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy19 = ColumnKt.columnMeasurePolicy(arrangement9.getTop(), companion2113.getCenterHorizontally(), composer3, 48);
                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap11117 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11117 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default5);
                                constructor7 = companion2114.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor7);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                                eVarG5 = p035i0.a.g(companion2114, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy19, composerM3407constructorimpl7, currentCompositionLocalMap11117);
                                if (composerM3407constructorimpl7.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11117, companion2114.getSetModifier());
                                ColumnScopeInstance columnScopeInstance115 = ColumnScopeInstance.INSTANCE;
                                b.m(36, companion11118, composer3, 6);
                                p097w3.j.a(SizeKt.fillMaxWidth$default(companion11118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.a(), composer3, 196614, 30);
                                b.m(f112, companion11118, composer3, 6);
                                p097w3.j.a(SizeKt.fillMaxWidth$default(companion11118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.b(), composer3, 196614, 30);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11118, Dp.m6403constructorimpl(f112)), composer3, 6);
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                            if (composerM3407constructorimpl.getInserting()) {
                                composer2 = composerStartRestartGroup;
                                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier4, companion4.getSetModifier());
                                long jD5 = p107y3.a.d();
                                FontWeight.Companion companion32 = FontWeight.Companion;
                                companion = companion2;
                                i7 = i6;
                                Composer composer6 = composer2;
                                TextKt.m2432Text4IGK_g("COMMUNITY PASS", (Modifier) null, jD5, TextUnitKt.getSp(10), (FontStyle) null, companion32.getBlack(), (FontFamily) null, TextUnitKt.getSp(2.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 12782982, 0, 130898);
                                float f114 = 6;
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f114)), composer6, 6);
                                builder = new AnnotatedString.Builder(0, 1, null);
                                FontWeight light7 = companion32.getLight();
                                Color.Companion companion33 = Color.Companion;
                                iPushStyle = builder.pushStyle(new SpanStyle(companion33.m3964getWhite0d7_KjU(), 0L, light7, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder.append("Choose your ");
                                builder.pop(iPushStyle);
                                iPushStyle2 = builder.pushStyle(new SpanStyle(companion33.m3964getWhite0d7_KjU(), 0L, companion32.getExtraBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder.append("Pass");
                                builder.pop(iPushStyle2);
                                TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, TextUnitKt.getSp(26), null, null, null, 0L, null, null, TextUnitKt.getSp(32), 0, false, 0, 0, null, null, null, composer6, 3072, 6, 261110);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f114)), composer6, 6);
                                TextKt.m2432Text4IGK_g("Support NotesCrafter and unlock unlimited processing power.", (Modifier) null, p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 3462, 6, 130034);
                                composer6.endNode();
                                f6 = 14;
                                f7 = 1;
                                z3 = z5;
                                Modifier modifierE3 = b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.d(f6, companion), Color.m3926copywmQWz5c$default(companion33.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion33.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                                composer3 = composer6;
                                composer3.startReplaceGroup(1700439523);
                                if ((i7 & 7168) == 2048) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                objRememberedValue = composer3.rememberedValue();
                                if (z4) {
                                    objRememberedValue = new O(1, onBack);
                                    composer3.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new O(1, onBack);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                f8 = 10;
                                Modifier modifierM668padding3ABfNKs3 = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE3, false, null, null, (a) objRememberedValue, 7, null), Dp.m6403constructorimpl(f8));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy15 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap21 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier21 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs3);
                                constructor2 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                                e eVarG119 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy15, composerM3407constructorimpl2, currentCompositionLocalMap21);
                                if (composerM3407constructorimpl2.getInserting()) {
                                    f9 = f6;
                                    if (!o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier21, companion4.getSetModifier());
                                    BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                                    f10 = f9;
                                    IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), companion33.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                                    b.r(composer3, f12, companion, composer3, 6);
                                    Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer3, 54);
                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap11118 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier11118 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default10);
                                    constructor3 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy14, composerM3407constructorimpl3, currentCompositionLocalMap11118);
                                    if (composerM3407constructorimpl3.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                    }
                                    p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier11118, composer3, 1700472312);
                                    Icons.Outlined outlined5 = Icons.Outlined.INSTANCE;
                                    it = v.S(l.t(AutoAwesomeKt.getAutoAwesome(outlined5), "Premium"), l.t(ShieldKt.getShield(outlined5), "Secure"), l.t(BoltKt.getBolt(outlined5), "Instant")).iterator();
                                    i8 = 0;
                                    while (it.hasNext()) {
                                        next2 = it.next();
                                        i10 = i8 + 1;
                                        if (i8 >= 0) {
                                            v.X();
                                            throw null;
                                        }
                                        B3.h hVar5 = (B3.h) next2;
                                        ImageVector imageVector5 = (ImageVector) hVar5.a();
                                        String str7 = (String) hVar5.b();
                                        composer3.startReplaceGroup(1700473219);
                                        if (i8 > 0) {
                                            BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(3)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                                        }
                                        composer3.endReplaceGroup();
                                        Alignment.Vertical centerVertically9 = Alignment.Companion.getCenterVertically();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_8 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(5));
                                        Modifier.Companion companion2115 = Modifier.Companion;
                                        MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_8, centerVertically9, composer3, 54);
                                        currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap11119 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier11119 = ComposedModifierKt.materializeModifier(composer3, companion2115);
                                        ComposeUiNode.Companion companion2116 = ComposeUiNode.Companion;
                                        Modifier.Companion companion2117 = companion;
                                        constructor11 = companion2116.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor11);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer3);
                                        e eVarG1110 = p035i0.a.g(companion2116, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy15, composerM3407constructorimpl11, currentCompositionLocalMap11119);
                                        if (composerM3407constructorimpl11.getInserting()) {
                                            f11 = f5;
                                            if (!o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier11119, companion2116.getSetModifier());
                                            RowScopeInstance rowScopeInstance111 = RowScopeInstance.INSTANCE;
                                            IconKt.m1877Iconww6aTOc(imageVector5, (String) null, SizeKt.m713size3ABfNKs(companion2115, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                            String upperCase115 = str7.toUpperCase(Locale.ROOT);
                                            o.e(upperCase115, "toUpperCase(...)");
                                            TextKt.m2432Text4IGK_g(upperCase115, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                            composer3.endNode();
                                            i8 = i10;
                                            it = it;
                                            companion = companion2117;
                                            f5 = f11;
                                        } else {
                                            f11 = f5;
                                        }
                                        p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG1110);
                                        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier11119, companion2116.getSetModifier());
                                        RowScopeInstance rowScopeInstance112 = RowScopeInstance.INSTANCE;
                                        IconKt.m1877Iconww6aTOc(imageVector5, (String) null, SizeKt.m713size3ABfNKs(companion2115, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                        String upperCase116 = str7.toUpperCase(Locale.ROOT);
                                        o.e(upperCase116, "toUpperCase(...)");
                                        TextKt.m2432Text4IGK_g(upperCase116, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                        composer3.endNode();
                                        i8 = i10;
                                        it = it;
                                        companion = companion2117;
                                        f5 = f11;
                                    }
                                    modifier2 = companion;
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    composer3.startReplaceGroup(-1720467969);
                                    list = f15342a;
                                    if (z3) {
                                        it2 = list.iterator();
                                        do {
                                            if (it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                        } while (!o.b(((G6) next).f13984a, str));
                                        g6 = (G6) next;
                                        Modifier.Companion companion111110 = Modifier.Companion;
                                        Modifier modifierG5 = b.g(SizeKt.fillMaxWidth$default(companion111110, 0.0f, 1, null), f10);
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(g6.f13992k, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM207backgroundbw27NRU$default5 = BackgroundKt.m207backgroundbw27NRU$default(modifierG5, jM3926copywmQWz5c$default, null, 2, null);
                                        float fM6403constructorimpl5 = Dp.m6403constructorimpl(f7);
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM669paddingVpY3zN12 = PaddingKt.m669paddingVpY3zN4(b.e(f10, modifierM207backgroundbw27NRU$default5, fM6403constructorimpl5, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f10));
                                        Alignment.Companion companion111111 = Alignment.Companion;
                                        Alignment.Vertical centerVertically10 = companion111111.getCenterVertically();
                                        Arrangement arrangement10 = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyI5 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement10, centerVertically10, composer3, 54);
                                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap122 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier122 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN12);
                                        ComposeUiNode.Companion companion111112 = ComposeUiNode.Companion;
                                        constructor8 = companion111112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor8);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                                        e eVarG1111 = p035i0.a.g(companion111112, composerM3407constructorimpl8, measurePolicyI5, composerM3407constructorimpl8, currentCompositionLocalMap122);
                                        if (composerM3407constructorimpl8.getInserting()) {
                                            i9 = i7;
                                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier122, companion111112.getSetModifier());
                                            RowScopeInstance rowScopeInstance113 = RowScopeInstance.INSTANCE;
                                            Modifier modifierM713size3ABfNKs9 = SizeKt.m713size3ABfNKs(companion111110, Dp.m6403constructorimpl(28));
                                            if (g6 != null) {
                                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                            } else {
                                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                            }
                                            Modifier modifierM206backgroundbw27NRU9 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs9, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy16 = BoxKt.maybeCachedBoxMeasurePolicy(companion111111.getCenter(), false);
                                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap111110 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier111110 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU9);
                                            constructor9 = companion111112.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor9);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                            eVarG6 = p035i0.a.g(companion111112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy16, composerM3407constructorimpl9, currentCompositionLocalMap111110);
                                            if (composerM3407constructorimpl9.getInserting()) {
                                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                            } else {
                                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                            }
                                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111110, companion111112.getSetModifier());
                                            BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                                            ImageVector check9 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                            if (g6 != null) {
                                                jD = g6.f13992k;
                                            } else {
                                                jD = p107y3.a.d();
                                            }
                                            str2 = str;
                                            IconKt.m1877Iconww6aTOc(check9, (String) null, SizeKt.m713size3ABfNKs(companion111110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                            composer3.endNode();
                                            MeasurePolicy measurePolicyColumnMeasurePolicy110 = ColumnKt.columnMeasurePolicy(arrangement10.getTop(), companion111111.getStart(), composer3, 0);
                                            currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap111111 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier111111 = ComposedModifierKt.materializeModifier(composer3, companion111110);
                                            constructor10 = companion111112.getConstructor();
                                            if (composer3.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor10);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                            e eVarG1112 = p035i0.a.g(companion111112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy110, composerM3407constructorimpl10, currentCompositionLocalMap111111);
                                            if (composerM3407constructorimpl10.getInserting()) {
                                                if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                                }
                                                f10 = f10;
                                                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111111, companion111112.getSetModifier());
                                                ColumnScopeInstance columnScopeInstance116 = ColumnScopeInstance.INSTANCE;
                                                builder3 = new AnnotatedString.Builder(0, 1, null);
                                                long jM3964getWhite0d7_KjU17 = Color.Companion.m3964getWhite0d7_KjU();
                                                FontWeight.Companion companion111113 = FontWeight.Companion;
                                                iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU17, 0L, companion111113.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                builder3.append("Active: ");
                                                builder3.pop(iPushStyle5);
                                                if (g6 != null) {
                                                    jD2 = g6.f13992k;
                                                } else {
                                                    jD2 = p107y3.a.d();
                                                }
                                                int iPushStyle112 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion111113.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                                if (str2 != null) {
                                                    strW = q.W(str2, "_", " ");
                                                    if (strW.length() > 0) {
                                                        StringBuilder sb17 = new StringBuilder();
                                                        String strValueOf17 = String.valueOf(strW.charAt(0));
                                                        o.d(strValueOf17, "null cannot be cast to non-null type java.lang.String");
                                                        String upperCase117 = strValueOf17.toUpperCase(Locale.ROOT);
                                                        o.e(upperCase117, "toUpperCase(...)");
                                                        sb17.append((Object) upperCase117);
                                                        String strSubstring17 = strW.substring(1);
                                                        o.e(strSubstring17, "substring(...)");
                                                        sb17.append(strSubstring17);
                                                        strW = sb17.toString();
                                                    }
                                                } else {
                                                    strW = null;
                                                }
                                                builder3.append(strW + " Pass");
                                                builder3.pop(iPushStyle112);
                                                TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                                composer3.startReplaceGroup(25500645);
                                                TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                                composer3.endReplaceGroup();
                                                composer3.endNode();
                                                composer3.endNode();
                                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                            } else {
                                                f10 = f10;
                                            }
                                            f10 = f10;
                                            p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG1112);
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111111, companion111112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance117 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU18 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion111114 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU18, 0L, companion111114.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle113 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion111114.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb18 = new StringBuilder();
                                                    String strValueOf18 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf18, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase118 = strValueOf18.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase118, "toUpperCase(...)");
                                                    sb18.append((Object) upperCase118);
                                                    String strSubstring18 = strW.substring(1);
                                                    o.e(strSubstring18, "substring(...)");
                                                    sb18.append(strSubstring18);
                                                    strW = sb18.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle113);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            i9 = i7;
                                        }
                                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG1111);
                                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier122, companion111112.getSetModifier());
                                        RowScopeInstance rowScopeInstance114 = RowScopeInstance.INSTANCE;
                                        Modifier modifierM713size3ABfNKs10 = SizeKt.m713size3ABfNKs(companion111110, Dp.m6403constructorimpl(28));
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM206backgroundbw27NRU10 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs10, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy17 = BoxKt.maybeCachedBoxMeasurePolicy(companion111111.getCenter(), false);
                                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap111112 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier111112 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU10);
                                        constructor9 = companion111112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor9);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                        eVarG6 = p035i0.a.g(companion111112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy17, composerM3407constructorimpl9, currentCompositionLocalMap111112);
                                        if (composerM3407constructorimpl9.getInserting()) {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        } else {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111112, companion111112.getSetModifier());
                                        BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                                        ImageVector check10 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                        if (g6 != null) {
                                            jD = g6.f13992k;
                                        } else {
                                            jD = p107y3.a.d();
                                        }
                                        str2 = str;
                                        IconKt.m1877Iconww6aTOc(check10, (String) null, SizeKt.m713size3ABfNKs(companion111110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                        composer3.endNode();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy111 = ColumnKt.columnMeasurePolicy(arrangement10.getTop(), companion111111.getStart(), composer3, 0);
                                        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap111113 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier111113 = ComposedModifierKt.materializeModifier(composer3, companion111110);
                                        constructor10 = companion111112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor10);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                        e eVarG1113 = p035i0.a.g(companion111112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy111, composerM3407constructorimpl10, currentCompositionLocalMap111113);
                                        if (composerM3407constructorimpl10.getInserting()) {
                                            if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                            }
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111113, companion111112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance118 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU19 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion111115 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU19, 0L, companion111115.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle114 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion111115.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb19 = new StringBuilder();
                                                    String strValueOf19 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf19, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase119 = strValueOf19.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase119, "toUpperCase(...)");
                                                    sb19.append((Object) upperCase119);
                                                    String strSubstring19 = strW.substring(1);
                                                    o.e(strSubstring19, "substring(...)");
                                                    sb19.append(strSubstring19);
                                                    strW = sb19.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle114);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            f10 = f10;
                                        }
                                        f10 = f10;
                                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG1113);
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111113, companion111112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance119 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU110 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion111116 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU110, 0L, companion111116.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle115 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion111116.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb110 = new StringBuilder();
                                                String strValueOf110 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf110, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase1110 = strValueOf110.toUpperCase(Locale.ROOT);
                                                o.e(upperCase1110, "toUpperCase(...)");
                                                sb110.append((Object) upperCase1110);
                                                String strSubstring110 = strW.substring(1);
                                                o.e(strSubstring110, "substring(...)");
                                                sb110.append(strSubstring110);
                                                strW = sb110.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle115);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        i9 = i7;
                                        str2 = str;
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy112 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), Alignment.Companion.getStart(), composer3, 6);
                                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap111114 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier111114 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default11);
                                    ComposeUiNode.Companion companion111117 = ComposeUiNode.Companion;
                                    constructor4 = companion111117.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                                    eVarG2 = p035i0.a.g(companion111117, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy112, composerM3407constructorimpl4, currentCompositionLocalMap111114);
                                    if (composerM3407constructorimpl4.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111114, companion111117.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance1110 = ColumnScopeInstance.INSTANCE;
                                    composer3.startReplaceGroup(1700618047);
                                    while (r0.hasNext()) {
                                        c(g7, o.b(str2, g7.f13984a), composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    Modifier.Companion companion111118 = Modifier.Companion;
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111118, Dp.m6403constructorimpl(48)), composer3, 6);
                                    builder2 = new AnnotatedString.Builder(0, 1, null);
                                    FontWeight.Companion companion111119 = FontWeight.Companion;
                                    FontWeight light8 = companion111119.getLight();
                                    Color.Companion companion2118 = Color.Companion;
                                    iPushStyle3 = builder2.pushStyle(new SpanStyle(companion2118.m3964getWhite0d7_KjU(), 0L, light8, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder2.append("Pass & Benefits ");
                                    builder2.pop(iPushStyle3);
                                    iPushStyle4 = builder2.pushStyle(new SpanStyle(companion2118.m3964getWhite0d7_KjU(), 0L, companion111119.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder2.append("Comparison");
                                    builder2.pop(iPushStyle4);
                                    AnnotatedString annotatedString5 = builder2.toAnnotatedString();
                                    long sp5 = TextUnitKt.getSp(22);
                                    TextAlign.Companion companion2119 = TextAlign.Companion;
                                    TextKt.m2433TextIbK3jfQ(annotatedString5, SizeKt.fillMaxWidth$default(companion111118, 0.0f, 1, null), 0L, sp5, null, null, null, 0L, null, TextAlign.m6285boximpl(companion2119.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer3, 3120, 0, 261620);
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111118, Dp.m6403constructorimpl(f114)), composer3, 6);
                                    float f115 = 16;
                                    TextKt.m2432Text4IGK_g("Compare each Community Pass tier and see what you unlock.", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion111118, 0.0f, 1, null), Dp.m6403constructorimpl(f115), 0.0f, 2, null), p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion2119.m6292getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 6, 129520);
                                    float f116 = 8;
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111118, Dp.m6403constructorimpl(f116)), composer3, 6);
                                    composer3.endNode();
                                    Modifier modifierM669paddingVpY3zN13 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion111118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f116));
                                    Arrangement arrangement11 = Arrangement.INSTANCE;
                                    Arrangement.Horizontal end5 = arrangement11.getEnd();
                                    Alignment.Companion companion21110 = Alignment.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy16 = RowKt.rowMeasurePolicy(end5, companion21110.getCenterVertically(), composer3, 54);
                                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap111115 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier111115 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN13);
                                    ComposeUiNode.Companion companion21111 = ComposeUiNode.Companion;
                                    constructor5 = companion21111.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                                    eVarG3 = p035i0.a.g(companion21111, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy16, composerM3407constructorimpl5, currentCompositionLocalMap111115);
                                    if (composerM3407constructorimpl5.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111115, companion21111.getSetModifier());
                                    RowScopeInstance rowScopeInstance115 = RowScopeInstance.INSTANCE;
                                    IconKt.m1877Iconww6aTOc(SwipeRightKt.getSwipeRight(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion111118, Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                    SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion111118, Dp.m6403constructorimpl(4)), composer3, 6);
                                    TextKt.m2432Text4IGK_g("Scroll to compare", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, companion111119.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782982, 0, 130898);
                                    composer3.endNode();
                                    Modifier modifierHorizontalScroll$default5 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion111118, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy18 = BoxKt.maybeCachedBoxMeasurePolicy(companion21110.getTopStart(), false);
                                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap111116 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier111116 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default5);
                                    constructor6 = companion21111.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor6);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                                    eVarG4 = p035i0.a.g(companion21111, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy18, composerM3407constructorimpl6, currentCompositionLocalMap111116);
                                    if (composerM3407constructorimpl6.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier111116, companion21111.getSetModifier());
                                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                                    b(str2, authManager, composer3, (i9 & 14) | ((i9 >> 3) & 112));
                                    composer3.endNode();
                                    Modifier modifierM670paddingVpY3zN4$default6 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion111118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy113 = ColumnKt.columnMeasurePolicy(arrangement11.getTop(), companion21110.getCenterHorizontally(), composer3, 48);
                                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap111117 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier111117 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default6);
                                    constructor7 = companion21111.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor7);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                                    eVarG5 = p035i0.a.g(companion21111, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy113, composerM3407constructorimpl7, currentCompositionLocalMap111117);
                                    if (composerM3407constructorimpl7.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111117, companion21111.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance1111 = ColumnScopeInstance.INSTANCE;
                                    b.m(36, companion111118, composer3, 6);
                                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion111118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.a(), composer3, 196614, 30);
                                    b.m(f115, companion111118, composer3, 6);
                                    p097w3.j.a(SizeKt.fillMaxWidth$default(companion111118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.b(), composer3, 196614, 30);
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111118, Dp.m6403constructorimpl(f115)), composer3, 6);
                                    composer3.endNode();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    f9 = f6;
                                }
                                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG119);
                                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier21, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                                f10 = f9;
                                IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), companion33.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                                b.r(composer3, f12, companion, composer3, 6);
                                Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy17 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer3, 54);
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap111118 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier111118 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default12);
                                constructor3 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy17, composerM3407constructorimpl3, currentCompositionLocalMap111118);
                                if (composerM3407constructorimpl3.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                }
                                p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier111118, composer3, 1700472312);
                                Icons.Outlined outlined6 = Icons.Outlined.INSTANCE;
                                it = v.S(l.t(AutoAwesomeKt.getAutoAwesome(outlined6), "Premium"), l.t(ShieldKt.getShield(outlined6), "Secure"), l.t(BoltKt.getBolt(outlined6), "Instant")).iterator();
                                i8 = 0;
                                while (it.hasNext()) {
                                    next2 = it.next();
                                    i10 = i8 + 1;
                                    if (i8 >= 0) {
                                        v.X();
                                        throw null;
                                    }
                                    B3.h hVar6 = (B3.h) next2;
                                    ImageVector imageVector6 = (ImageVector) hVar6.a();
                                    String str8 = (String) hVar6.b();
                                    composer3.startReplaceGroup(1700473219);
                                    if (i8 > 0) {
                                        BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(3)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    Alignment.Vertical centerVertically11 = Alignment.Companion.getCenterVertically();
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_9 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(5));
                                    Modifier.Companion companion21112 = Modifier.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy18 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_9, centerVertically11, composer3, 54);
                                    currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap111119 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier111119 = ComposedModifierKt.materializeModifier(composer3, companion21112);
                                    ComposeUiNode.Companion companion21113 = ComposeUiNode.Companion;
                                    Modifier.Companion companion21114 = companion;
                                    constructor11 = companion21113.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor11);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer3);
                                    e eVarG1114 = p035i0.a.g(companion21113, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy18, composerM3407constructorimpl11, currentCompositionLocalMap111119);
                                    if (composerM3407constructorimpl11.getInserting()) {
                                        f11 = f5;
                                        if (!o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier111119, companion21113.getSetModifier());
                                        RowScopeInstance rowScopeInstance116 = RowScopeInstance.INSTANCE;
                                        IconKt.m1877Iconww6aTOc(imageVector6, (String) null, SizeKt.m713size3ABfNKs(companion21112, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                        String upperCase1111 = str8.toUpperCase(Locale.ROOT);
                                        o.e(upperCase1111, "toUpperCase(...)");
                                        TextKt.m2432Text4IGK_g(upperCase1111, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                        composer3.endNode();
                                        i8 = i10;
                                        it = it;
                                        companion = companion21114;
                                        f5 = f11;
                                    } else {
                                        f11 = f5;
                                    }
                                    p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG1114);
                                    Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier111119, companion21113.getSetModifier());
                                    RowScopeInstance rowScopeInstance117 = RowScopeInstance.INSTANCE;
                                    IconKt.m1877Iconww6aTOc(imageVector6, (String) null, SizeKt.m713size3ABfNKs(companion21112, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                    String upperCase1112 = str8.toUpperCase(Locale.ROOT);
                                    o.e(upperCase1112, "toUpperCase(...)");
                                    TextKt.m2432Text4IGK_g(upperCase1112, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                    composer3.endNode();
                                    i8 = i10;
                                    it = it;
                                    companion = companion21114;
                                    f5 = f11;
                                }
                                modifier2 = companion;
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(f13)), composer3, 6);
                                composer3.startReplaceGroup(-1720467969);
                                list = f15342a;
                                if (z3) {
                                    it2 = list.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (!o.b(((G6) next).f13984a, str));
                                    g6 = (G6) next;
                                    Modifier.Companion companion1111110 = Modifier.Companion;
                                    Modifier modifierG6 = b.g(SizeKt.fillMaxWidth$default(companion1111110, 0.0f, 1, null), f10);
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(g6.f13992k, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM207backgroundbw27NRU$default6 = BackgroundKt.m207backgroundbw27NRU$default(modifierG6, jM3926copywmQWz5c$default, null, 2, null);
                                    float fM6403constructorimpl6 = Dp.m6403constructorimpl(f7);
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM669paddingVpY3zN14 = PaddingKt.m669paddingVpY3zN4(b.e(f10, modifierM207backgroundbw27NRU$default6, fM6403constructorimpl6, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f10));
                                    Alignment.Companion companion1111111 = Alignment.Companion;
                                    Alignment.Vertical centerVertically12 = companion1111111.getCenterVertically();
                                    Arrangement arrangement12 = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyI6 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement12, centerVertically12, composer3, 54);
                                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap123 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier123 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN14);
                                    ComposeUiNode.Companion companion1111112 = ComposeUiNode.Companion;
                                    constructor8 = companion1111112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor8);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                                    e eVarG1115 = p035i0.a.g(companion1111112, composerM3407constructorimpl8, measurePolicyI6, composerM3407constructorimpl8, currentCompositionLocalMap123);
                                    if (composerM3407constructorimpl8.getInserting()) {
                                        i9 = i7;
                                        if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier123, companion1111112.getSetModifier());
                                        RowScopeInstance rowScopeInstance118 = RowScopeInstance.INSTANCE;
                                        Modifier modifierM713size3ABfNKs11 = SizeKt.m713size3ABfNKs(companion1111110, Dp.m6403constructorimpl(28));
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM206backgroundbw27NRU11 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs11, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy19 = BoxKt.maybeCachedBoxMeasurePolicy(companion1111111.getCenter(), false);
                                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap1111110 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier1111110 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU11);
                                        constructor9 = companion1111112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor9);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                        eVarG6 = p035i0.a.g(companion1111112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy19, composerM3407constructorimpl9, currentCompositionLocalMap1111110);
                                        if (composerM3407constructorimpl9.getInserting()) {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        } else {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1111110, companion1111112.getSetModifier());
                                        BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                                        ImageVector check11 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                        if (g6 != null) {
                                            jD = g6.f13992k;
                                        } else {
                                            jD = p107y3.a.d();
                                        }
                                        str2 = str;
                                        IconKt.m1877Iconww6aTOc(check11, (String) null, SizeKt.m713size3ABfNKs(companion1111110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                        composer3.endNode();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy114 = ColumnKt.columnMeasurePolicy(arrangement12.getTop(), companion1111111.getStart(), composer3, 0);
                                        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap1111111 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier1111111 = ComposedModifierKt.materializeModifier(composer3, companion1111110);
                                        constructor10 = companion1111112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor10);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                        e eVarG1116 = p035i0.a.g(companion1111112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy114, composerM3407constructorimpl10, currentCompositionLocalMap1111111);
                                        if (composerM3407constructorimpl10.getInserting()) {
                                            if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                            }
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier1111111, companion1111112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance1112 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU111 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion1111113 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU111, 0L, companion1111113.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle116 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion1111113.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb111 = new StringBuilder();
                                                    String strValueOf111 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf111, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase1113 = strValueOf111.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase1113, "toUpperCase(...)");
                                                    sb111.append((Object) upperCase1113);
                                                    String strSubstring111 = strW.substring(1);
                                                    o.e(strSubstring111, "substring(...)");
                                                    sb111.append(strSubstring111);
                                                    strW = sb111.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle116);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion1111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            f10 = f10;
                                        }
                                        f10 = f10;
                                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG1116);
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier1111111, companion1111112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance1113 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU112 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion1111114 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU112, 0L, companion1111114.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle117 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion1111114.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb112 = new StringBuilder();
                                                String strValueOf112 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf112, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase1114 = strValueOf112.toUpperCase(Locale.ROOT);
                                                o.e(upperCase1114, "toUpperCase(...)");
                                                sb112.append((Object) upperCase1114);
                                                String strSubstring112 = strW.substring(1);
                                                o.e(strSubstring112, "substring(...)");
                                                sb112.append(strSubstring112);
                                                strW = sb112.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle117);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion1111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        i9 = i7;
                                    }
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG1115);
                                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier123, companion1111112.getSetModifier());
                                    RowScopeInstance rowScopeInstance119 = RowScopeInstance.INSTANCE;
                                    Modifier modifierM713size3ABfNKs12 = SizeKt.m713size3ABfNKs(companion1111110, Dp.m6403constructorimpl(28));
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM206backgroundbw27NRU12 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs12, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy110 = BoxKt.maybeCachedBoxMeasurePolicy(companion1111111.getCenter(), false);
                                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap1111112 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier1111112 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU12);
                                    constructor9 = companion1111112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor9);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                    eVarG6 = p035i0.a.g(companion1111112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy110, composerM3407constructorimpl9, currentCompositionLocalMap1111112);
                                    if (composerM3407constructorimpl9.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier1111112, companion1111112.getSetModifier());
                                    BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                                    ImageVector check12 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                    if (g6 != null) {
                                        jD = g6.f13992k;
                                    } else {
                                        jD = p107y3.a.d();
                                    }
                                    str2 = str;
                                    IconKt.m1877Iconww6aTOc(check12, (String) null, SizeKt.m713size3ABfNKs(companion1111110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                    composer3.endNode();
                                    MeasurePolicy measurePolicyColumnMeasurePolicy115 = ColumnKt.columnMeasurePolicy(arrangement12.getTop(), companion1111111.getStart(), composer3, 0);
                                    currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap1111113 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier1111113 = ComposedModifierKt.materializeModifier(composer3, companion1111110);
                                    constructor10 = companion1111112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor10);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                    e eVarG1117 = p035i0.a.g(companion1111112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy115, composerM3407constructorimpl10, currentCompositionLocalMap1111113);
                                    if (composerM3407constructorimpl10.getInserting()) {
                                        if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                        }
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier1111113, companion1111112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance1114 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU113 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion1111115 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU113, 0L, companion1111115.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle118 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion1111115.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb113 = new StringBuilder();
                                                String strValueOf113 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf113, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase1115 = strValueOf113.toUpperCase(Locale.ROOT);
                                                o.e(upperCase1115, "toUpperCase(...)");
                                                sb113.append((Object) upperCase1115);
                                                String strSubstring113 = strW.substring(1);
                                                o.e(strSubstring113, "substring(...)");
                                                sb113.append(strSubstring113);
                                                strW = sb113.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle118);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion1111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        f10 = f10;
                                    }
                                    f10 = f10;
                                    p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG1117);
                                    f10 = f10;
                                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier1111113, companion1111112.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance1115 = ColumnScopeInstance.INSTANCE;
                                    builder3 = new AnnotatedString.Builder(0, 1, null);
                                    long jM3964getWhite0d7_KjU114 = Color.Companion.m3964getWhite0d7_KjU();
                                    FontWeight.Companion companion1111116 = FontWeight.Companion;
                                    iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU114, 0L, companion1111116.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder3.append("Active: ");
                                    builder3.pop(iPushStyle5);
                                    if (g6 != null) {
                                        jD2 = g6.f13992k;
                                    } else {
                                        jD2 = p107y3.a.d();
                                    }
                                    int iPushStyle119 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion1111116.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    if (str2 != null) {
                                        strW = q.W(str2, "_", " ");
                                        if (strW.length() > 0) {
                                            StringBuilder sb114 = new StringBuilder();
                                            String strValueOf114 = String.valueOf(strW.charAt(0));
                                            o.d(strValueOf114, "null cannot be cast to non-null type java.lang.String");
                                            String upperCase1116 = strValueOf114.toUpperCase(Locale.ROOT);
                                            o.e(upperCase1116, "toUpperCase(...)");
                                            sb114.append((Object) upperCase1116);
                                            String strSubstring114 = strW.substring(1);
                                            o.e(strSubstring114, "substring(...)");
                                            sb114.append(strSubstring114);
                                            strW = sb114.toString();
                                        }
                                    } else {
                                        strW = null;
                                    }
                                    builder3.append(strW + " Pass");
                                    builder3.pop(iPushStyle119);
                                    TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                    composer3.startReplaceGroup(25500645);
                                    TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion1111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    composer3.endNode();
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                } else {
                                    i9 = i7;
                                    str2 = str;
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy116 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), Alignment.Companion.getStart(), composer3, 6);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap1111114 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111114 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default13);
                                ComposeUiNode.Companion companion1111117 = ComposeUiNode.Companion;
                                constructor4 = companion1111117.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                                eVarG2 = p035i0.a.g(companion1111117, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy116, composerM3407constructorimpl4, currentCompositionLocalMap1111114);
                                if (composerM3407constructorimpl4.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier1111114, companion1111117.getSetModifier());
                                ColumnScopeInstance columnScopeInstance1116 = ColumnScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(1700618047);
                                while (r0.hasNext()) {
                                    c(g7, o.b(str2, g7.f13984a), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                Modifier.Companion companion1111118 = Modifier.Companion;
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1111118, Dp.m6403constructorimpl(48)), composer3, 6);
                                builder2 = new AnnotatedString.Builder(0, 1, null);
                                FontWeight.Companion companion1111119 = FontWeight.Companion;
                                FontWeight light9 = companion1111119.getLight();
                                Color.Companion companion21115 = Color.Companion;
                                iPushStyle3 = builder2.pushStyle(new SpanStyle(companion21115.m3964getWhite0d7_KjU(), 0L, light9, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder2.append("Pass & Benefits ");
                                builder2.pop(iPushStyle3);
                                iPushStyle4 = builder2.pushStyle(new SpanStyle(companion21115.m3964getWhite0d7_KjU(), 0L, companion1111119.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder2.append("Comparison");
                                builder2.pop(iPushStyle4);
                                AnnotatedString annotatedString6 = builder2.toAnnotatedString();
                                long sp6 = TextUnitKt.getSp(22);
                                TextAlign.Companion companion21116 = TextAlign.Companion;
                                TextKt.m2433TextIbK3jfQ(annotatedString6, SizeKt.fillMaxWidth$default(companion1111118, 0.0f, 1, null), 0L, sp6, null, null, null, 0L, null, TextAlign.m6285boximpl(companion21116.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer3, 3120, 0, 261620);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1111118, Dp.m6403constructorimpl(f114)), composer3, 6);
                                float f117 = 16;
                                TextKt.m2432Text4IGK_g("Compare each Community Pass tier and see what you unlock.", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion1111118, 0.0f, 1, null), Dp.m6403constructorimpl(f117), 0.0f, 2, null), p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion21116.m6292getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 6, 129520);
                                float f118 = 8;
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1111118, Dp.m6403constructorimpl(f118)), composer3, 6);
                                composer3.endNode();
                                Modifier modifierM669paddingVpY3zN15 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion1111118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f118));
                                Arrangement arrangement13 = Arrangement.INSTANCE;
                                Arrangement.Horizontal end6 = arrangement13.getEnd();
                                Alignment.Companion companion21117 = Alignment.Companion;
                                MeasurePolicy measurePolicyRowMeasurePolicy19 = RowKt.rowMeasurePolicy(end6, companion21117.getCenterVertically(), composer3, 54);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap1111115 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111115 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN15);
                                ComposeUiNode.Companion companion21118 = ComposeUiNode.Companion;
                                constructor5 = companion21118.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                                eVarG3 = p035i0.a.g(companion21118, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy19, composerM3407constructorimpl5, currentCompositionLocalMap1111115);
                                if (composerM3407constructorimpl5.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier1111115, companion21118.getSetModifier());
                                RowScopeInstance rowScopeInstance1110 = RowScopeInstance.INSTANCE;
                                IconKt.m1877Iconww6aTOc(SwipeRightKt.getSwipeRight(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion1111118, Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion1111118, Dp.m6403constructorimpl(4)), composer3, 6);
                                TextKt.m2432Text4IGK_g("Scroll to compare", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, companion1111119.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782982, 0, 130898);
                                composer3.endNode();
                                Modifier modifierHorizontalScroll$default6 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion1111118, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy111 = BoxKt.maybeCachedBoxMeasurePolicy(companion21117.getTopStart(), false);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap1111116 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111116 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default6);
                                constructor6 = companion21118.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor6);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                                eVarG4 = p035i0.a.g(companion21118, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy111, composerM3407constructorimpl6, currentCompositionLocalMap1111116);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier1111116, companion21118.getSetModifier());
                                BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                                b(str2, authManager, composer3, (i9 & 14) | ((i9 >> 3) & 112));
                                composer3.endNode();
                                Modifier modifierM670paddingVpY3zN4$default7 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion1111118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy117 = ColumnKt.columnMeasurePolicy(arrangement13.getTop(), companion21117.getCenterHorizontally(), composer3, 48);
                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap1111117 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111117 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default7);
                                constructor7 = companion21118.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor7);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                                eVarG5 = p035i0.a.g(companion21118, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy117, composerM3407constructorimpl7, currentCompositionLocalMap1111117);
                                if (composerM3407constructorimpl7.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier1111117, companion21118.getSetModifier());
                                ColumnScopeInstance columnScopeInstance1117 = ColumnScopeInstance.INSTANCE;
                                b.m(36, companion1111118, composer3, 6);
                                p097w3.j.a(SizeKt.fillMaxWidth$default(companion1111118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.a(), composer3, 196614, 30);
                                b.m(f117, companion1111118, composer3, 6);
                                p097w3.j.a(SizeKt.fillMaxWidth$default(companion1111118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.b(), composer3, 196614, 30);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion1111118, Dp.m6403constructorimpl(f117)), composer3, 6);
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2 = composerStartRestartGroup;
                            }
                            if (composerM3407constructorimpl2.getInserting()) {
                                f9 = f6;
                                if (!o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier21, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                                f10 = f9;
                                IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), companion33.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                                b.r(composer3, f12, companion, composer3, 6);
                                Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy110 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer3, 54);
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap1111118 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier1111118 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default14);
                                constructor3 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                                eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy110, composerM3407constructorimpl3, currentCompositionLocalMap1111118);
                                if (composerM3407constructorimpl3.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                                }
                                p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier1111118, composer3, 1700472312);
                                Icons.Outlined outlined7 = Icons.Outlined.INSTANCE;
                                it = v.S(l.t(AutoAwesomeKt.getAutoAwesome(outlined7), "Premium"), l.t(ShieldKt.getShield(outlined7), "Secure"), l.t(BoltKt.getBolt(outlined7), "Instant")).iterator();
                                i8 = 0;
                                while (it.hasNext()) {
                                    next2 = it.next();
                                    i10 = i8 + 1;
                                    if (i8 >= 0) {
                                        v.X();
                                        throw null;
                                    }
                                    B3.h hVar7 = (B3.h) next2;
                                    ImageVector imageVector7 = (ImageVector) hVar7.a();
                                    String str9 = (String) hVar7.b();
                                    composer3.startReplaceGroup(1700473219);
                                    if (i8 > 0) {
                                        BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(3)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    Alignment.Vertical centerVertically13 = Alignment.Companion.getCenterVertically();
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_10 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(5));
                                    Modifier.Companion companion21119 = Modifier.Companion;
                                    MeasurePolicy measurePolicyRowMeasurePolicy111 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_10, centerVertically13, composer3, 54);
                                    currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap1111119 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier1111119 = ComposedModifierKt.materializeModifier(composer3, companion21119);
                                    ComposeUiNode.Companion companion211110 = ComposeUiNode.Companion;
                                    Modifier.Companion companion211111 = companion;
                                    constructor11 = companion211110.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor11);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer3);
                                    e eVarG1118 = p035i0.a.g(companion211110, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy111, composerM3407constructorimpl11, currentCompositionLocalMap1111119);
                                    if (composerM3407constructorimpl11.getInserting()) {
                                        f11 = f5;
                                        if (!o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier1111119, companion211110.getSetModifier());
                                        RowScopeInstance rowScopeInstance1111 = RowScopeInstance.INSTANCE;
                                        IconKt.m1877Iconww6aTOc(imageVector7, (String) null, SizeKt.m713size3ABfNKs(companion21119, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                        String upperCase1117 = str9.toUpperCase(Locale.ROOT);
                                        o.e(upperCase1117, "toUpperCase(...)");
                                        TextKt.m2432Text4IGK_g(upperCase1117, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                        composer3.endNode();
                                        i8 = i10;
                                        it = it;
                                        companion = companion211111;
                                        f5 = f11;
                                    } else {
                                        f11 = f5;
                                    }
                                    p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG1118);
                                    Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier1111119, companion211110.getSetModifier());
                                    RowScopeInstance rowScopeInstance1112 = RowScopeInstance.INSTANCE;
                                    IconKt.m1877Iconww6aTOc(imageVector7, (String) null, SizeKt.m713size3ABfNKs(companion21119, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                    String upperCase1118 = str9.toUpperCase(Locale.ROOT);
                                    o.e(upperCase1118, "toUpperCase(...)");
                                    TextKt.m2432Text4IGK_g(upperCase1118, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                                    composer3.endNode();
                                    i8 = i10;
                                    it = it;
                                    companion = companion211111;
                                    f5 = f11;
                                }
                                modifier2 = companion;
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(f13)), composer3, 6);
                                composer3.startReplaceGroup(-1720467969);
                                list = f15342a;
                                if (z3) {
                                    it2 = list.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (!o.b(((G6) next).f13984a, str));
                                    g6 = (G6) next;
                                    Modifier.Companion companion11111110 = Modifier.Companion;
                                    Modifier modifierG7 = b.g(SizeKt.fillMaxWidth$default(companion11111110, 0.0f, 1, null), f10);
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(g6.f13992k, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM207backgroundbw27NRU$default7 = BackgroundKt.m207backgroundbw27NRU$default(modifierG7, jM3926copywmQWz5c$default, null, 2, null);
                                    float fM6403constructorimpl7 = Dp.m6403constructorimpl(f7);
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM669paddingVpY3zN16 = PaddingKt.m669paddingVpY3zN4(b.e(f10, modifierM207backgroundbw27NRU$default7, fM6403constructorimpl7, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f10));
                                    Alignment.Companion companion11111111 = Alignment.Companion;
                                    Alignment.Vertical centerVertically14 = companion11111111.getCenterVertically();
                                    Arrangement arrangement14 = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyI7 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement14, centerVertically14, composer3, 54);
                                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap124 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier124 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN16);
                                    ComposeUiNode.Companion companion11111112 = ComposeUiNode.Companion;
                                    constructor8 = companion11111112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor8);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                                    e eVarG1119 = p035i0.a.g(companion11111112, composerM3407constructorimpl8, measurePolicyI7, composerM3407constructorimpl8, currentCompositionLocalMap124);
                                    if (composerM3407constructorimpl8.getInserting()) {
                                        i9 = i7;
                                        if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier124, companion11111112.getSetModifier());
                                        RowScopeInstance rowScopeInstance1113 = RowScopeInstance.INSTANCE;
                                        Modifier modifierM713size3ABfNKs13 = SizeKt.m713size3ABfNKs(companion11111110, Dp.m6403constructorimpl(28));
                                        if (g6 != null) {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        } else {
                                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                        }
                                        Modifier modifierM206backgroundbw27NRU13 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs13, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy112 = BoxKt.maybeCachedBoxMeasurePolicy(companion11111111.getCenter(), false);
                                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap11111110 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier11111110 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU13);
                                        constructor9 = companion11111112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor9);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                        eVarG6 = p035i0.a.g(companion11111112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy112, composerM3407constructorimpl9, currentCompositionLocalMap11111110);
                                        if (composerM3407constructorimpl9.getInserting()) {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        } else {
                                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                        }
                                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11111110, companion11111112.getSetModifier());
                                        BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                                        ImageVector check13 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                        if (g6 != null) {
                                            jD = g6.f13992k;
                                        } else {
                                            jD = p107y3.a.d();
                                        }
                                        str2 = str;
                                        IconKt.m1877Iconww6aTOc(check13, (String) null, SizeKt.m713size3ABfNKs(companion11111110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                        composer3.endNode();
                                        MeasurePolicy measurePolicyColumnMeasurePolicy118 = ColumnKt.columnMeasurePolicy(arrangement14.getTop(), companion11111111.getStart(), composer3, 0);
                                        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap11111111 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier11111111 = ComposedModifierKt.materializeModifier(composer3, companion11111110);
                                        constructor10 = companion11111112.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor10);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                        e eVarG11110 = p035i0.a.g(companion11111112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy118, composerM3407constructorimpl10, currentCompositionLocalMap11111111);
                                        if (composerM3407constructorimpl10.getInserting()) {
                                            if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                            }
                                            f10 = f10;
                                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier11111111, companion11111112.getSetModifier());
                                            ColumnScopeInstance columnScopeInstance1118 = ColumnScopeInstance.INSTANCE;
                                            builder3 = new AnnotatedString.Builder(0, 1, null);
                                            long jM3964getWhite0d7_KjU115 = Color.Companion.m3964getWhite0d7_KjU();
                                            FontWeight.Companion companion11111113 = FontWeight.Companion;
                                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU115, 0L, companion11111113.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            builder3.append("Active: ");
                                            builder3.pop(iPushStyle5);
                                            if (g6 != null) {
                                                jD2 = g6.f13992k;
                                            } else {
                                                jD2 = p107y3.a.d();
                                            }
                                            int iPushStyle1110 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion11111113.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                            if (str2 != null) {
                                                strW = q.W(str2, "_", " ");
                                                if (strW.length() > 0) {
                                                    StringBuilder sb115 = new StringBuilder();
                                                    String strValueOf115 = String.valueOf(strW.charAt(0));
                                                    o.d(strValueOf115, "null cannot be cast to non-null type java.lang.String");
                                                    String upperCase1119 = strValueOf115.toUpperCase(Locale.ROOT);
                                                    o.e(upperCase1119, "toUpperCase(...)");
                                                    sb115.append((Object) upperCase1119);
                                                    String strSubstring115 = strW.substring(1);
                                                    o.e(strSubstring115, "substring(...)");
                                                    sb115.append(strSubstring115);
                                                    strW = sb115.toString();
                                                }
                                            } else {
                                                strW = null;
                                            }
                                            builder3.append(strW + " Pass");
                                            builder3.pop(iPushStyle1110);
                                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                            composer3.startReplaceGroup(25500645);
                                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion11111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            composer3.endNode();
                                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                        } else {
                                            f10 = f10;
                                        }
                                        f10 = f10;
                                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG11110);
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier11111111, companion11111112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance1119 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU116 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion11111114 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU116, 0L, companion11111114.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle1111 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion11111114.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb116 = new StringBuilder();
                                                String strValueOf116 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf116, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase11110 = strValueOf116.toUpperCase(Locale.ROOT);
                                                o.e(upperCase11110, "toUpperCase(...)");
                                                sb116.append((Object) upperCase11110);
                                                String strSubstring116 = strW.substring(1);
                                                o.e(strSubstring116, "substring(...)");
                                                sb116.append(strSubstring116);
                                                strW = sb116.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle1111);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion11111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        i9 = i7;
                                    }
                                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG1119);
                                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier124, companion11111112.getSetModifier());
                                    RowScopeInstance rowScopeInstance1114 = RowScopeInstance.INSTANCE;
                                    Modifier modifierM713size3ABfNKs14 = SizeKt.m713size3ABfNKs(companion11111110, Dp.m6403constructorimpl(28));
                                    if (g6 != null) {
                                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                                    }
                                    Modifier modifierM206backgroundbw27NRU14 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs14, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy113 = BoxKt.maybeCachedBoxMeasurePolicy(companion11111111.getCenter(), false);
                                    currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap11111112 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier11111112 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU14);
                                    constructor9 = companion11111112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor9);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                                    eVarG6 = p035i0.a.g(companion11111112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy113, composerM3407constructorimpl9, currentCompositionLocalMap11111112);
                                    if (composerM3407constructorimpl9.getInserting()) {
                                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                    } else {
                                        p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                                    }
                                    Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier11111112, companion11111112.getSetModifier());
                                    BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                                    ImageVector check14 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                                    if (g6 != null) {
                                        jD = g6.f13992k;
                                    } else {
                                        jD = p107y3.a.d();
                                    }
                                    str2 = str;
                                    IconKt.m1877Iconww6aTOc(check14, (String) null, SizeKt.m713size3ABfNKs(companion11111110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                                    composer3.endNode();
                                    MeasurePolicy measurePolicyColumnMeasurePolicy119 = ColumnKt.columnMeasurePolicy(arrangement14.getTop(), companion11111111.getStart(), composer3, 0);
                                    currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap11111113 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier11111113 = ComposedModifierKt.materializeModifier(composer3, companion11111110);
                                    constructor10 = companion11111112.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor10);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                                    e eVarG11111 = p035i0.a.g(companion11111112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy119, composerM3407constructorimpl10, currentCompositionLocalMap11111113);
                                    if (composerM3407constructorimpl10.getInserting()) {
                                        if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                        }
                                        f10 = f10;
                                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier11111113, companion11111112.getSetModifier());
                                        ColumnScopeInstance columnScopeInstance11110 = ColumnScopeInstance.INSTANCE;
                                        builder3 = new AnnotatedString.Builder(0, 1, null);
                                        long jM3964getWhite0d7_KjU117 = Color.Companion.m3964getWhite0d7_KjU();
                                        FontWeight.Companion companion11111115 = FontWeight.Companion;
                                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU117, 0L, companion11111115.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        builder3.append("Active: ");
                                        builder3.pop(iPushStyle5);
                                        if (g6 != null) {
                                            jD2 = g6.f13992k;
                                        } else {
                                            jD2 = p107y3.a.d();
                                        }
                                        int iPushStyle1112 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion11111115.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                        if (str2 != null) {
                                            strW = q.W(str2, "_", " ");
                                            if (strW.length() > 0) {
                                                StringBuilder sb117 = new StringBuilder();
                                                String strValueOf117 = String.valueOf(strW.charAt(0));
                                                o.d(strValueOf117, "null cannot be cast to non-null type java.lang.String");
                                                String upperCase11111 = strValueOf117.toUpperCase(Locale.ROOT);
                                                o.e(upperCase11111, "toUpperCase(...)");
                                                sb117.append((Object) upperCase11111);
                                                String strSubstring117 = strW.substring(1);
                                                o.e(strSubstring117, "substring(...)");
                                                sb117.append(strSubstring117);
                                                strW = sb117.toString();
                                            }
                                        } else {
                                            strW = null;
                                        }
                                        builder3.append(strW + " Pass");
                                        builder3.pop(iPushStyle1112);
                                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                        composer3.startReplaceGroup(25500645);
                                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion11111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        composer3.endNode();
                                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                    } else {
                                        f10 = f10;
                                    }
                                    f10 = f10;
                                    p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG11111);
                                    f10 = f10;
                                    Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier11111113, companion11111112.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance11111 = ColumnScopeInstance.INSTANCE;
                                    builder3 = new AnnotatedString.Builder(0, 1, null);
                                    long jM3964getWhite0d7_KjU118 = Color.Companion.m3964getWhite0d7_KjU();
                                    FontWeight.Companion companion11111116 = FontWeight.Companion;
                                    iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU118, 0L, companion11111116.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    builder3.append("Active: ");
                                    builder3.pop(iPushStyle5);
                                    if (g6 != null) {
                                        jD2 = g6.f13992k;
                                    } else {
                                        jD2 = p107y3.a.d();
                                    }
                                    int iPushStyle1113 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion11111116.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                    if (str2 != null) {
                                        strW = q.W(str2, "_", " ");
                                        if (strW.length() > 0) {
                                            StringBuilder sb118 = new StringBuilder();
                                            String strValueOf118 = String.valueOf(strW.charAt(0));
                                            o.d(strValueOf118, "null cannot be cast to non-null type java.lang.String");
                                            String upperCase11112 = strValueOf118.toUpperCase(Locale.ROOT);
                                            o.e(upperCase11112, "toUpperCase(...)");
                                            sb118.append((Object) upperCase11112);
                                            String strSubstring118 = strW.substring(1);
                                            o.e(strSubstring118, "substring(...)");
                                            sb118.append(strSubstring118);
                                            strW = sb118.toString();
                                        }
                                    } else {
                                        strW = null;
                                    }
                                    builder3.append(strW + " Pass");
                                    builder3.pop(iPushStyle1113);
                                    TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                    composer3.startReplaceGroup(25500645);
                                    TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion11111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    composer3.endNode();
                                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                                } else {
                                    i9 = i7;
                                    str2 = str;
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy1110 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), Alignment.Companion.getStart(), composer3, 6);
                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap11111114 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11111114 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default15);
                                ComposeUiNode.Companion companion11111117 = ComposeUiNode.Companion;
                                constructor4 = companion11111117.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                                eVarG2 = p035i0.a.g(companion11111117, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy1110, composerM3407constructorimpl4, currentCompositionLocalMap11111114);
                                if (composerM3407constructorimpl4.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier11111114, companion11111117.getSetModifier());
                                ColumnScopeInstance columnScopeInstance11112 = ColumnScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(1700618047);
                                while (r0.hasNext()) {
                                    c(g7, o.b(str2, g7.f13984a), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                Modifier.Companion companion11111118 = Modifier.Companion;
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111118, Dp.m6403constructorimpl(48)), composer3, 6);
                                builder2 = new AnnotatedString.Builder(0, 1, null);
                                FontWeight.Companion companion11111119 = FontWeight.Companion;
                                FontWeight light10 = companion11111119.getLight();
                                Color.Companion companion211112 = Color.Companion;
                                iPushStyle3 = builder2.pushStyle(new SpanStyle(companion211112.m3964getWhite0d7_KjU(), 0L, light10, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder2.append("Pass & Benefits ");
                                builder2.pop(iPushStyle3);
                                iPushStyle4 = builder2.pushStyle(new SpanStyle(companion211112.m3964getWhite0d7_KjU(), 0L, companion11111119.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder2.append("Comparison");
                                builder2.pop(iPushStyle4);
                                AnnotatedString annotatedString7 = builder2.toAnnotatedString();
                                long sp7 = TextUnitKt.getSp(22);
                                TextAlign.Companion companion211113 = TextAlign.Companion;
                                TextKt.m2433TextIbK3jfQ(annotatedString7, SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), 0L, sp7, null, null, null, 0L, null, TextAlign.m6285boximpl(companion211113.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer3, 3120, 0, 261620);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111118, Dp.m6403constructorimpl(f114)), composer3, 6);
                                float f119 = 16;
                                TextKt.m2432Text4IGK_g("Compare each Community Pass tier and see what you unlock.", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), Dp.m6403constructorimpl(f119), 0.0f, 2, null), p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion211113.m6292getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 6, 129520);
                                float f1110 = 8;
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111118, Dp.m6403constructorimpl(f1110)), composer3, 6);
                                composer3.endNode();
                                Modifier modifierM669paddingVpY3zN17 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f1110));
                                Arrangement arrangement15 = Arrangement.INSTANCE;
                                Arrangement.Horizontal end7 = arrangement15.getEnd();
                                Alignment.Companion companion211114 = Alignment.Companion;
                                MeasurePolicy measurePolicyRowMeasurePolicy112 = RowKt.rowMeasurePolicy(end7, companion211114.getCenterVertically(), composer3, 54);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap11111115 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11111115 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN17);
                                ComposeUiNode.Companion companion211115 = ComposeUiNode.Companion;
                                constructor5 = companion211115.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                                eVarG3 = p035i0.a.g(companion211115, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy112, composerM3407constructorimpl5, currentCompositionLocalMap11111115);
                                if (composerM3407constructorimpl5.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111115, companion211115.getSetModifier());
                                RowScopeInstance rowScopeInstance1115 = RowScopeInstance.INSTANCE;
                                IconKt.m1877Iconww6aTOc(SwipeRightKt.getSwipeRight(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion11111118, Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion11111118, Dp.m6403constructorimpl(4)), composer3, 6);
                                TextKt.m2432Text4IGK_g("Scroll to compare", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, companion11111119.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782982, 0, 130898);
                                composer3.endNode();
                                Modifier modifierHorizontalScroll$default7 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy114 = BoxKt.maybeCachedBoxMeasurePolicy(companion211114.getTopStart(), false);
                                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap11111116 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11111116 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default7);
                                constructor6 = companion211115.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor6);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                                eVarG4 = p035i0.a.g(companion211115, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy114, composerM3407constructorimpl6, currentCompositionLocalMap11111116);
                                if (composerM3407constructorimpl6.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111116, companion211115.getSetModifier());
                                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                                b(str2, authManager, composer3, (i9 & 14) | ((i9 >> 3) & 112));
                                composer3.endNode();
                                Modifier modifierM670paddingVpY3zN4$default8 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy1111 = ColumnKt.columnMeasurePolicy(arrangement15.getTop(), companion211114.getCenterHorizontally(), composer3, 48);
                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap11111117 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier11111117 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default8);
                                constructor7 = companion211115.getConstructor();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor7);
                                } else {
                                    composer3.useNode();
                                }
                                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                                eVarG5 = p035i0.a.g(companion211115, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy1111, composerM3407constructorimpl7, currentCompositionLocalMap11111117);
                                if (composerM3407constructorimpl7.getInserting()) {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                } else {
                                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier11111117, companion211115.getSetModifier());
                                ColumnScopeInstance columnScopeInstance11113 = ColumnScopeInstance.INSTANCE;
                                b.m(36, companion11111118, composer3, 6);
                                p097w3.j.a(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.a(), composer3, 196614, 30);
                                b.m(f119, companion11111118, composer3, 6);
                                p097w3.j.a(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.b(), composer3, 196614, 30);
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111118, Dp.m6403constructorimpl(f119)), composer3, 6);
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                f9 = f6;
                            }
                            builder2.append("Comparison");
                            builder2.pop(iPushStyle4);
                            AnnotatedString annotatedString8 = builder2.toAnnotatedString();
                            long sp8 = TextUnitKt.getSp(22);
                            TextAlign.Companion companion211116 = TextAlign.Companion;
                            TextKt.m2433TextIbK3jfQ(annotatedString8, SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), 0L, sp8, null, null, null, 0L, null, TextAlign.m6285boximpl(companion211116.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer3, 3120, 0, 261620);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111118, Dp.m6403constructorimpl(f114)), composer3, 6);
                            float f1111 = 16;
                            TextKt.m2432Text4IGK_g("Compare each Community Pass tier and see what you unlock.", PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), Dp.m6403constructorimpl(f1111), 0.0f, 2, null), p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion211116.m6292getCentere0LSkKk()), TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3510, 6, 129520);
                            float f1112 = 8;
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111118, Dp.m6403constructorimpl(f1112)), composer3, 6);
                            composer3.endNode();
                            Modifier modifierM669paddingVpY3zN18 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), Dp.m6403constructorimpl(f1112));
                            Arrangement arrangement16 = Arrangement.INSTANCE;
                            Arrangement.Horizontal end8 = arrangement16.getEnd();
                            Alignment.Companion companion211117 = Alignment.Companion;
                            MeasurePolicy measurePolicyRowMeasurePolicy113 = RowKt.rowMeasurePolicy(end8, companion211117.getCenterVertically(), composer3, 54);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap11111118 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111118 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN18);
                            ComposeUiNode.Companion companion211118 = ComposeUiNode.Companion;
                            constructor5 = companion211118.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor5);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                            eVarG3 = p035i0.a.g(companion211118, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy113, composerM3407constructorimpl5, currentCompositionLocalMap11111118);
                            if (composerM3407constructorimpl5.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG3);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11111118, companion211118.getSetModifier());
                            RowScopeInstance rowScopeInstance1116 = RowScopeInstance.INSTANCE;
                            IconKt.m1877Iconww6aTOc(SwipeRightKt.getSwipeRight(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion11111118, Dp.m6403constructorimpl(f10)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                            SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion11111118, Dp.m6403constructorimpl(4)), composer3, 6);
                            TextKt.m2432Text4IGK_g("Scroll to compare", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(10), (FontStyle) null, companion11111119.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782982, 0, 130898);
                            composer3.endNode();
                            Modifier modifierHorizontalScroll$default8 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy115 = BoxKt.maybeCachedBoxMeasurePolicy(companion211117.getTopStart(), false);
                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap11111119 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11111119 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default8);
                            constructor6 = companion211118.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor6);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer3);
                            eVarG4 = p035i0.a.g(companion211118, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy115, composerM3407constructorimpl6, currentCompositionLocalMap11111119);
                            if (composerM3407constructorimpl6.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier11111119, companion211118.getSetModifier());
                            BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                            b(str2, authManager, composer3, (i9 & 14) | ((i9 >> 3) & 112));
                            composer3.endNode();
                            Modifier modifierM670paddingVpY3zN4$default9 = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), Dp.m6403constructorimpl(f12), 0.0f, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy1112 = ColumnKt.columnMeasurePolicy(arrangement16.getTop(), companion211117.getCenterHorizontally(), composer3, 48);
                            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap111111110 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111111110 = ComposedModifierKt.materializeModifier(composer3, modifierM670paddingVpY3zN4$default9);
                            constructor7 = companion211118.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor7);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer3);
                            eVarG5 = p035i0.a.g(companion211118, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy1112, composerM3407constructorimpl7, currentCompositionLocalMap111111110);
                            if (composerM3407constructorimpl7.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG5);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier111111110, companion211118.getSetModifier());
                            ColumnScopeInstance columnScopeInstance11114 = ColumnScopeInstance.INSTANCE;
                            b.m(36, companion11111118, composer3, 6);
                            p097w3.j.a(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.a(), composer3, 196614, 30);
                            b.m(f1111, companion11111118, composer3, 6);
                            p097w3.j.a(SizeKt.fillMaxWidth$default(companion11111118, 0.0f, 1, null), 0L, 0L, 0.0f, null, AbstractC2758y.b(), composer3, 196614, 30);
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion11111118, Dp.m6403constructorimpl(f1111)), composer3, 6);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } catch (Throwable th3) {
                            builder2.pop(iPushStyle4);
                            throw th3;
                        }
                        builder2.append("Pass & Benefits ");
                        builder2.pop(iPushStyle3);
                        iPushStyle4 = builder2.pushStyle(new SpanStyle(companion211112.m3964getWhite0d7_KjU(), 0L, companion11111119.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                    } catch (Throwable th4) {
                        builder2.pop(iPushStyle3);
                        throw th4;
                    }
                    builder.append("Pass");
                    builder.pop(iPushStyle2);
                    TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, TextUnitKt.getSp(26), null, null, null, 0L, null, null, TextUnitKt.getSp(32), 0, false, 0, 0, null, null, null, composer6, 3072, 6, 261110);
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f114)), composer6, 6);
                    TextKt.m2432Text4IGK_g("Support NotesCrafter and unlock unlimited processing power.", (Modifier) null, p107y3.a.g(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 3462, 6, 130034);
                    composer6.endNode();
                    f6 = 14;
                    f7 = 1;
                    z3 = z5;
                    Modifier modifierE4 = b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.d(f6, companion), Color.m3926copywmQWz5c$default(companion33.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f7), Color.m3926copywmQWz5c$default(companion33.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null));
                    composer3 = composer6;
                    composer3.startReplaceGroup(1700439523);
                    if ((i7 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objRememberedValue = composer3.rememberedValue();
                    if (z4) {
                        objRememberedValue = new O(1, onBack);
                        composer3.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new O(1, onBack);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    f8 = 10;
                    Modifier modifierM668padding3ABfNKs4 = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierE4, false, null, null, (a) objRememberedValue, 7, null), Dp.m6403constructorimpl(f8));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy116 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composer3, modifierM668padding3ABfNKs4);
                    constructor2 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                    e eVarG1120 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy116, composerM3407constructorimpl2, currentCompositionLocalMap22);
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG1120);
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier22, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
                    f10 = f9;
                    IconKt.m1877Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Outlined.INSTANCE), "Back", SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f12)), companion33.m3964getWhite0d7_KjU(), composer3, 3504, 0);
                    b.r(composer3, f12, companion, composer3, 6);
                    Modifier modifierFillMaxWidth$default16 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy114 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion3.getCenterVertically(), composer3, 54);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap11111120 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11111120 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default16);
                    constructor3 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                    eVarG = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy114, composerM3407constructorimpl3, currentCompositionLocalMap11111120);
                    if (composerM3407constructorimpl3.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG);
                    }
                    p035i0.a.w(companion4, composerM3407constructorimpl3, modifierMaterializeModifier11111120, composer3, 1700472312);
                    Icons.Outlined outlined8 = Icons.Outlined.INSTANCE;
                    it = v.S(l.t(AutoAwesomeKt.getAutoAwesome(outlined8), "Premium"), l.t(ShieldKt.getShield(outlined8), "Secure"), l.t(BoltKt.getBolt(outlined8), "Instant")).iterator();
                    i8 = 0;
                    while (it.hasNext()) {
                        next2 = it.next();
                        i10 = i8 + 1;
                        if (i8 >= 0) {
                            v.X();
                            throw null;
                        }
                        B3.h hVar8 = (B3.h) next2;
                        ImageVector imageVector8 = (ImageVector) hVar8.a();
                        String str10 = (String) hVar8.b();
                        composer3.startReplaceGroup(1700473219);
                        if (i8 > 0) {
                            BoxKt.Box(BackgroundKt.m206backgroundbw27NRU(SizeKt.m713size3ABfNKs(PaddingKt.m670paddingVpY3zN4$default(Modifier.Companion, Dp.m6403constructorimpl(f5), 0.0f, 2, null), Dp.m6403constructorimpl(3)), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        Alignment.Vertical centerVertically15 = Alignment.Companion.getCenterVertically();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_11 = Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(5));
                        Modifier.Companion companion211119 = Modifier.Companion;
                        MeasurePolicy measurePolicyRowMeasurePolicy115 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_11, centerVertically15, composer3, 54);
                        currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap11111121 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11111121 = ComposedModifierKt.materializeModifier(composer3, companion211119);
                        ComposeUiNode.Companion companion2111110 = ComposeUiNode.Companion;
                        Modifier.Companion companion2111111 = companion;
                        constructor11 = companion2111110.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor11);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer3);
                        e eVarG11112 = p035i0.a.g(companion2111110, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy115, composerM3407constructorimpl11, currentCompositionLocalMap11111121);
                        if (composerM3407constructorimpl11.getInserting()) {
                            f11 = f5;
                            if (!o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier11111121, companion2111110.getSetModifier());
                            RowScopeInstance rowScopeInstance1117 = RowScopeInstance.INSTANCE;
                            IconKt.m1877Iconww6aTOc(imageVector8, (String) null, SizeKt.m713size3ABfNKs(companion211119, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                            String upperCase11113 = str10.toUpperCase(Locale.ROOT);
                            o.e(upperCase11113, "toUpperCase(...)");
                            TextKt.m2432Text4IGK_g(upperCase11113, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                            composer3.endNode();
                            i8 = i10;
                            it = it;
                            companion = companion2111111;
                            f5 = f11;
                        } else {
                            f11 = f5;
                        }
                        p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11112);
                        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier11111121, companion2111110.getSetModifier());
                        RowScopeInstance rowScopeInstance1118 = RowScopeInstance.INSTANCE;
                        IconKt.m1877Iconww6aTOc(imageVector8, (String) null, SizeKt.m713size3ABfNKs(companion211119, Dp.m6403constructorimpl(13)), Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3504, 0);
                        String upperCase11114 = str10.toUpperCase(Locale.ROOT);
                        o.e(upperCase11114, "toUpperCase(...)");
                        TextKt.m2432Text4IGK_g(upperCase11114, (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.g(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782976, 0, 130898);
                        composer3.endNode();
                        i8 = i10;
                        it = it;
                        companion = companion2111111;
                        f5 = f11;
                    }
                    modifier2 = companion;
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(Modifier.Companion, Dp.m6403constructorimpl(f13)), composer3, 6);
                    composer3.startReplaceGroup(-1720467969);
                    list = f15342a;
                    if (z3) {
                        it2 = list.iterator();
                        do {
                            if (it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!o.b(((G6) next).f13984a, str));
                        g6 = (G6) next;
                        Modifier.Companion companion111111110 = Modifier.Companion;
                        Modifier modifierG8 = b.g(SizeKt.fillMaxWidth$default(companion111111110, 0.0f, 1, null), f10);
                        if (g6 != null) {
                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(g6.f13992k, 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        Modifier modifierM207backgroundbw27NRU$default8 = BackgroundKt.m207backgroundbw27NRU$default(modifierG8, jM3926copywmQWz5c$default, null, 2, null);
                        float fM6403constructorimpl8 = Dp.m6403constructorimpl(f7);
                        if (g6 != null) {
                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        Modifier modifierM669paddingVpY3zN19 = PaddingKt.m669paddingVpY3zN4(b.e(f10, modifierM207backgroundbw27NRU$default8, fM6403constructorimpl8, jM3926copywmQWz5c$default2), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f10));
                        Alignment.Companion companion111111111 = Alignment.Companion;
                        Alignment.Vertical centerVertically16 = companion111111111.getCenterVertically();
                        Arrangement arrangement17 = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyI8 = androidx.compose.foundation.text.modifiers.a.i(f8, arrangement17, centerVertically16, composer3, 54);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap125 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier125 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN19);
                        ComposeUiNode.Companion companion111111112 = ComposeUiNode.Companion;
                        constructor8 = companion111111112.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor8);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer3);
                        e eVarG11113 = p035i0.a.g(companion111111112, composerM3407constructorimpl8, measurePolicyI8, composerM3407constructorimpl8, currentCompositionLocalMap125);
                        if (composerM3407constructorimpl8.getInserting()) {
                            i9 = i7;
                            if (!o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier125, companion111111112.getSetModifier());
                            RowScopeInstance rowScopeInstance1119 = RowScopeInstance.INSTANCE;
                            Modifier modifierM713size3ABfNKs15 = SizeKt.m713size3ABfNKs(companion111111110, Dp.m6403constructorimpl(28));
                            if (g6 != null) {
                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            Modifier modifierM206backgroundbw27NRU15 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs15, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy117 = BoxKt.maybeCachedBoxMeasurePolicy(companion111111111.getCenter(), false);
                            currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap111111111 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111111111 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU15);
                            constructor9 = companion111111112.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor9);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                            eVarG6 = p035i0.a.g(companion111111112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy117, composerM3407constructorimpl9, currentCompositionLocalMap111111111);
                            if (composerM3407constructorimpl9.getInserting()) {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                            } else {
                                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111111111, companion111111112.getSetModifier());
                            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
                            ImageVector check15 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                            if (g6 != null) {
                                jD = g6.f13992k;
                            } else {
                                jD = p107y3.a.d();
                            }
                            str2 = str;
                            IconKt.m1877Iconww6aTOc(check15, (String) null, SizeKt.m713size3ABfNKs(companion111111110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                            composer3.endNode();
                            MeasurePolicy measurePolicyColumnMeasurePolicy1113 = ColumnKt.columnMeasurePolicy(arrangement17.getTop(), companion111111111.getStart(), composer3, 0);
                            currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap111111112 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier111111112 = ComposedModifierKt.materializeModifier(composer3, companion111111110);
                            constructor10 = companion111111112.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor10);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                            e eVarG11114 = p035i0.a.g(companion111111112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy1113, composerM3407constructorimpl10, currentCompositionLocalMap111111112);
                            if (composerM3407constructorimpl10.getInserting()) {
                                if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                }
                                f10 = f10;
                                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111111112, companion111111112.getSetModifier());
                                ColumnScopeInstance columnScopeInstance11115 = ColumnScopeInstance.INSTANCE;
                                builder3 = new AnnotatedString.Builder(0, 1, null);
                                long jM3964getWhite0d7_KjU119 = Color.Companion.m3964getWhite0d7_KjU();
                                FontWeight.Companion companion111111113 = FontWeight.Companion;
                                iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU119, 0L, companion111111113.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                builder3.append("Active: ");
                                builder3.pop(iPushStyle5);
                                if (g6 != null) {
                                    jD2 = g6.f13992k;
                                } else {
                                    jD2 = p107y3.a.d();
                                }
                                int iPushStyle1114 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion111111113.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                                if (str2 != null) {
                                    strW = q.W(str2, "_", " ");
                                    if (strW.length() > 0) {
                                        StringBuilder sb119 = new StringBuilder();
                                        String strValueOf119 = String.valueOf(strW.charAt(0));
                                        o.d(strValueOf119, "null cannot be cast to non-null type java.lang.String");
                                        String upperCase11115 = strValueOf119.toUpperCase(Locale.ROOT);
                                        o.e(upperCase11115, "toUpperCase(...)");
                                        sb119.append((Object) upperCase11115);
                                        String strSubstring119 = strW.substring(1);
                                        o.e(strSubstring119, "substring(...)");
                                        sb119.append(strSubstring119);
                                        strW = sb119.toString();
                                    }
                                } else {
                                    strW = null;
                                }
                                builder3.append(strW + " Pass");
                                builder3.pop(iPushStyle1114);
                                TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                                composer3.startReplaceGroup(25500645);
                                TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion111111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                composer3.endNode();
                                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                            } else {
                                f10 = f10;
                            }
                            f10 = f10;
                            p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG11114);
                            f10 = f10;
                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111111112, companion111111112.getSetModifier());
                            ColumnScopeInstance columnScopeInstance11116 = ColumnScopeInstance.INSTANCE;
                            builder3 = new AnnotatedString.Builder(0, 1, null);
                            long jM3964getWhite0d7_KjU1110 = Color.Companion.m3964getWhite0d7_KjU();
                            FontWeight.Companion companion111111114 = FontWeight.Companion;
                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU1110, 0L, companion111111114.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                            builder3.append("Active: ");
                            builder3.pop(iPushStyle5);
                            if (g6 != null) {
                                jD2 = g6.f13992k;
                            } else {
                                jD2 = p107y3.a.d();
                            }
                            int iPushStyle1115 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion111111114.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                            if (str2 != null) {
                                strW = q.W(str2, "_", " ");
                                if (strW.length() > 0) {
                                    StringBuilder sb1110 = new StringBuilder();
                                    String strValueOf1110 = String.valueOf(strW.charAt(0));
                                    o.d(strValueOf1110, "null cannot be cast to non-null type java.lang.String");
                                    String upperCase11116 = strValueOf1110.toUpperCase(Locale.ROOT);
                                    o.e(upperCase11116, "toUpperCase(...)");
                                    sb1110.append((Object) upperCase11116);
                                    String strSubstring1110 = strW.substring(1);
                                    o.e(strSubstring1110, "substring(...)");
                                    sb1110.append(strSubstring1110);
                                    strW = sb1110.toString();
                                }
                            } else {
                                strW = null;
                            }
                            builder3.append(strW + " Pass");
                            builder3.pop(iPushStyle1115);
                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                            composer3.startReplaceGroup(25500645);
                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion111111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            composer3.endNode();
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                        } else {
                            i9 = i7;
                        }
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG11113);
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier125, companion111111112.getSetModifier());
                        RowScopeInstance rowScopeInstance11110 = RowScopeInstance.INSTANCE;
                        Modifier modifierM713size3ABfNKs16 = SizeKt.m713size3ABfNKs(companion111111110, Dp.m6403constructorimpl(28));
                        if (g6 != null) {
                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(g6.f13992k, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        Modifier modifierM206backgroundbw27NRU16 = BackgroundKt.m206backgroundbw27NRU(modifierM713size3ABfNKs16, jM3926copywmQWz5c$default3, RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy118 = BoxKt.maybeCachedBoxMeasurePolicy(companion111111111.getCenter(), false);
                        currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap111111113 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111113 = ComposedModifierKt.materializeModifier(composer3, modifierM206backgroundbw27NRU16);
                        constructor9 = companion111111112.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor9);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer3);
                        eVarG6 = p035i0.a.g(companion111111112, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy118, composerM3407constructorimpl9, currentCompositionLocalMap111111113);
                        if (composerM3407constructorimpl9.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG6);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier111111113, companion111111112.getSetModifier());
                        BoxScopeInstance boxScopeInstance1112 = BoxScopeInstance.INSTANCE;
                        ImageVector check16 = CheckKt.getCheck(Icons.INSTANCE.getDefault());
                        if (g6 != null) {
                            jD = g6.f13992k;
                        } else {
                            jD = p107y3.a.d();
                        }
                        str2 = str;
                        IconKt.m1877Iconww6aTOc(check16, (String) null, SizeKt.m713size3ABfNKs(companion111111110, Dp.m6403constructorimpl(f10)), jD, composer3, 432, 0);
                        composer3.endNode();
                        MeasurePolicy measurePolicyColumnMeasurePolicy1114 = ColumnKt.columnMeasurePolicy(arrangement17.getTop(), companion111111111.getStart(), composer3, 0);
                        currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap111111114 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier111111114 = ComposedModifierKt.materializeModifier(composer3, companion111111110);
                        constructor10 = companion111111112.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor10);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer3);
                        e eVarG11115 = p035i0.a.g(companion111111112, composerM3407constructorimpl10, measurePolicyColumnMeasurePolicy1114, composerM3407constructorimpl10, currentCompositionLocalMap111111114);
                        if (composerM3407constructorimpl10.getInserting()) {
                            if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                            }
                            f10 = f10;
                            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111111114, companion111111112.getSetModifier());
                            ColumnScopeInstance columnScopeInstance11117 = ColumnScopeInstance.INSTANCE;
                            builder3 = new AnnotatedString.Builder(0, 1, null);
                            long jM3964getWhite0d7_KjU1111 = Color.Companion.m3964getWhite0d7_KjU();
                            FontWeight.Companion companion111111115 = FontWeight.Companion;
                            iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU1111, 0L, companion111111115.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                            builder3.append("Active: ");
                            builder3.pop(iPushStyle5);
                            if (g6 != null) {
                                jD2 = g6.f13992k;
                            } else {
                                jD2 = p107y3.a.d();
                            }
                            int iPushStyle1116 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion111111115.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                            if (str2 != null) {
                                strW = q.W(str2, "_", " ");
                                if (strW.length() > 0) {
                                    StringBuilder sb1111 = new StringBuilder();
                                    String strValueOf1111 = String.valueOf(strW.charAt(0));
                                    o.d(strValueOf1111, "null cannot be cast to non-null type java.lang.String");
                                    String upperCase11117 = strValueOf1111.toUpperCase(Locale.ROOT);
                                    o.e(upperCase11117, "toUpperCase(...)");
                                    sb1111.append((Object) upperCase11117);
                                    String strSubstring1111 = strW.substring(1);
                                    o.e(strSubstring1111, "substring(...)");
                                    sb1111.append(strSubstring1111);
                                    strW = sb1111.toString();
                                }
                            } else {
                                strW = null;
                            }
                            builder3.append(strW + " Pass");
                            builder3.pop(iPushStyle1116);
                            TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                            composer3.startReplaceGroup(25500645);
                            TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion111111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            composer3.endNode();
                            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                        } else {
                            f10 = f10;
                        }
                        f10 = f10;
                        p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG11115);
                        f10 = f10;
                        Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier111111114, companion111111112.getSetModifier());
                        ColumnScopeInstance columnScopeInstance11118 = ColumnScopeInstance.INSTANCE;
                        builder3 = new AnnotatedString.Builder(0, 1, null);
                        long jM3964getWhite0d7_KjU1112 = Color.Companion.m3964getWhite0d7_KjU();
                        FontWeight.Companion companion111111116 = FontWeight.Companion;
                        iPushStyle5 = builder3.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU1112, 0L, companion111111116.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                        builder3.append("Active: ");
                        builder3.pop(iPushStyle5);
                        if (g6 != null) {
                            jD2 = g6.f13992k;
                        } else {
                            jD2 = p107y3.a.d();
                        }
                        int iPushStyle1117 = builder3.pushStyle(new SpanStyle(jD2, 0L, companion111111116.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                        if (str2 != null) {
                            strW = q.W(str2, "_", " ");
                            if (strW.length() > 0) {
                                StringBuilder sb1112 = new StringBuilder();
                                String strValueOf1112 = String.valueOf(strW.charAt(0));
                                o.d(strValueOf1112, "null cannot be cast to non-null type java.lang.String");
                                String upperCase11118 = strValueOf1112.toUpperCase(Locale.ROOT);
                                o.e(upperCase11118, "toUpperCase(...)");
                                sb1112.append((Object) upperCase11118);
                                String strSubstring1112 = strW.substring(1);
                                o.e(strSubstring1112, "substring(...)");
                                sb1112.append(strSubstring1112);
                                strW = sb1112.toString();
                            }
                        } else {
                            strW = null;
                        }
                        builder3.append(strW + " Pass");
                        builder3.pop(iPushStyle1117);
                        TextKt.m2433TextIbK3jfQ(builder3.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 3072, 0, 262134);
                        composer3.startReplaceGroup(25500645);
                        TextKt.m2432Text4IGK_g(num + " days remaining", PaddingKt.m672paddingqDBjuR0$default(companion111111110, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), p107y3.a.g(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endNode();
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111111110, Dp.m6403constructorimpl(f13)), composer3, 6);
                    } else {
                        i9 = i7;
                        str2 = str;
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default17 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy1115 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f12)), Alignment.Companion.getStart(), composer3, 6);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap111111115 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111111115 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default17);
                    ComposeUiNode.Companion companion111111117 = ComposeUiNode.Companion;
                    constructor4 = companion111111117.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                    eVarG2 = p035i0.a.g(companion111111117, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy1115, composerM3407constructorimpl4, currentCompositionLocalMap111111115);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier111111115, companion111111117.getSetModifier());
                    ColumnScopeInstance columnScopeInstance11119 = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(1700618047);
                    while (r0.hasNext()) {
                        c(g7, o.b(str2, g7.f13984a), composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    Modifier.Companion companion111111118 = Modifier.Companion;
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion111111118, Dp.m6403constructorimpl(48)), composer3, 6);
                    builder2 = new AnnotatedString.Builder(0, 1, null);
                    FontWeight.Companion companion111111119 = FontWeight.Companion;
                    FontWeight light11 = companion111111119.getLight();
                    Color.Companion companion2111112 = Color.Companion;
                    iPushStyle3 = builder2.pushStyle(new SpanStyle(companion2111112.m3964getWhite0d7_KjU(), 0L, light11, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                } catch (Throwable th5) {
                    builder.pop(iPushStyle2);
                    throw th5;
                }
                builder.append("Choose your ");
                builder.pop(iPushStyle);
                iPushStyle2 = builder.pushStyle(new SpanStyle(companion33.m3964getWhite0d7_KjU(), 0L, companion32.getExtraBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
            } catch (Throwable th6) {
                builder.pop(iPushStyle);
                throw th6;
            }
            p035i0.a.t(currentCompositeKeyHash14, composerM3407constructorimpl14, currentCompositeKeyHash14, eVarG9);
            Updater.m3414setimpl(composerM3407constructorimpl14, modifierMaterializeModifier3, companion4.getSetModifier());
            f5 = 12;
            Modifier modifierM672paddingqDBjuR0$default3 = PaddingKt.m672paddingqDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m6403constructorimpl(f5), 0.0f, 11, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy20 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap23 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier23 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default3);
            constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG120 = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy20, composerM3407constructorimpl, currentCompositionLocalMap23);
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG120);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier23, companion4.getSetModifier());
            long jD6 = p107y3.a.d();
            FontWeight.Companion companion34 = FontWeight.Companion;
            companion = companion2;
            i7 = i6;
            Composer composer7 = composer2;
            TextKt.m2432Text4IGK_g("COMMUNITY PASS", (Modifier) null, jD6, TextUnitKt.getSp(10), (FontStyle) null, companion34.getBlack(), (FontFamily) null, TextUnitKt.getSp(2.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer7, 12782982, 0, 130898);
            float f1113 = 6;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f1113)), composer7, 6);
            builder = new AnnotatedString.Builder(0, 1, null);
            FontWeight light12 = companion34.getLight();
            Color.Companion companion35 = Color.Companion;
            iPushStyle = builder.pushStyle(new SpanStyle(companion35.m3964getWhite0d7_KjU(), 0L, light12, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2567m(str, num, authManager, onBack, modifier2, i5, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0500  */
    /* JADX WARN: Code duplicated, block: B:104:0x050c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0510  */
    /* JADX WARN: Code duplicated, block: B:110:0x052f  */
    /* JADX WARN: Code duplicated, block: B:113:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:115:0x061f  */
    /* JADX WARN: Code duplicated, block: B:118:0x062b  */
    /* JADX WARN: Code duplicated, block: B:119:0x062f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0650  */
    /* JADX WARN: Code duplicated, block: B:126:0x0693  */
    /* JADX WARN: Code duplicated, block: B:133:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:135:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:137:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x073f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0745  */
    /* JADX WARN: Code duplicated, block: B:145:0x078c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0798  */
    /* JADX WARN: Code duplicated, block: B:149:0x079c  */
    /* JADX WARN: Code duplicated, block: B:152:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:155:0x07be  */
    /* JADX WARN: Code duplicated, block: B:159:0x0804  */
    /* JADX WARN: Code duplicated, block: B:162:0x0810  */
    /* JADX WARN: Code duplicated, block: B:163:0x0814  */
    /* JADX WARN: Code duplicated, block: B:166:0x0825  */
    /* JADX WARN: Code duplicated, block: B:168:0x0833  */
    /* JADX WARN: Code duplicated, block: B:171:0x08db  */
    /* JADX WARN: Code duplicated, block: B:172:0x092e  */
    /* JADX WARN: Code duplicated, block: B:175:0x093a  */
    /* JADX WARN: Code duplicated, block: B:176:0x098b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0997  */
    /* JADX WARN: Code duplicated, block: B:180:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:183:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:184:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:187:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0aa0  */
    /* JADX WARN: Code duplicated, block: B:192:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:194:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:200:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:201:0x0b7a  */
    /* JADX WARN: Code duplicated, block: B:204:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:207:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:208:0x0bc2  */
    /* JADX WARN: Code duplicated, block: B:211:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:213:0x0be1  */
    /* JADX WARN: Code duplicated, block: B:216:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:218:0x0bf5  */
    /* JADX WARN: Code duplicated, block: B:221:0x0c0b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:231:0x0c92  */
    /* JADX WARN: Code duplicated, block: B:237:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0c88 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0c60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0325  */
    /* JADX WARN: Code duplicated, block: B:71:0x0331  */
    /* JADX WARN: Code duplicated, block: B:72:0x0335  */
    /* JADX WARN: Code duplicated, block: B:77:0x0354  */
    /* JADX WARN: Code duplicated, block: B:81:0x03df  */
    /* JADX WARN: Code duplicated, block: B:83:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0425  */
    /* JADX WARN: Code duplicated, block: B:86:0x0460  */
    /* JADX WARN: Code duplicated, block: B:89:0x049e  */
    /* JADX WARN: Code duplicated, block: B:92:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:93:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:98:0x04cd  */
    public static final void b(String str, h hVar, Composer composer, int i5) {
        Object obj;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        float f5;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        float f6;
        float f7;
        float f8;
        List list;
        e eVar;
        Object obj2;
        Composer composer2;
        Iterator it;
        int i6;
        List list2;
        Composer composer3;
        int i7;
        int i8;
        int i9;
        C2662s c2662s;
        float f9;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        C2662s c2662s2;
        float f10;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG3;
        C2662s c2662s3;
        String str2;
        e eVar2;
        String strL;
        Object obj3;
        String strL2;
        String strL3;
        String strL4;
        Object obj4;
        String strL5;
        int i10;
        int i11;
        boolean z3;
        Modifier modifierM220borderxT4_qwU;
        int currentCompositeKeyHash5;
        a constructor5;
        Composer composerM3407constructorimpl5;
        e eVarG4;
        float f11;
        FontWeight.Companion companion;
        FontWeight light;
        Object next;
        int i12;
        boolean zBooleanValue;
        long jM3937unboximpl;
        Modifier.Companion companion2;
        Modifier modifierM220borderxT4_qwU2;
        Alignment.Companion companion3;
        int currentCompositeKeyHash6;
        ComposeUiNode.Companion companion4;
        a constructor6;
        Composer composerM3407constructorimpl6;
        e eVarG5;
        int currentCompositeKeyHash7;
        a constructor7;
        Composer composerM3407constructorimpl7;
        e eVarG6;
        FontWeight.Companion companion5;
        Composer composer4;
        float f12;
        Composer composer5;
        int currentCompositeKeyHash8;
        a constructor8;
        Composer composerM3407constructorimpl8;
        e eVarG7;
        Composer composerStartRestartGroup = composer.startRestartGroup(1647956119);
        int i13 = (i5 & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(hVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1647956119, i13, -1, "com.notescrafter.ui.screens.ComparisonTable (CommunityPassScreen.kt:728)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(hVar.f13538x, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(475335053);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new C2551l(stateCollectAsState, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            e eVar3 = (e) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(475339566);
            boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new C2551l(stateCollectAsState, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            e eVar4 = (e) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            String str3 = "half_yearly";
            List listS = v.S(new B3.h(new m("GUEST", "Free", Color.m3917boximpl(ColorKt.Color(4287931320L))), Boolean.valueOf(str == null)), new B3.h(new m("SILVER", "₹19", Color.m3917boximpl(ColorKt.Color(4287931320L))), Boolean.valueOf(o.b(str, "monthly"))), new B3.h(new m("GOLD", "₹99", Color.m3917boximpl(ColorKt.Color(4294286859L))), Boolean.valueOf(o.b(str, "half_yearly"))), new B3.h(new m("PLATINUM", "₹179", Color.m3917boximpl(ColorKt.Color(4286680312L))), Boolean.valueOf(o.b(str, "annual"))), new B3.h(new m("DIAMOND", "₹499", Color.m3917boximpl(ColorKt.Color(4280472558L))), Boolean.valueOf(o.b(str, "lifetime"))));
            List listS2 = v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4287931320L), 0.03f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4287931320L), 0.04f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4294286859L), 0.04f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4284704497L), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4278630100L), 0.06f, 0.0f, 0.0f, 0.0f, 14, null)));
            float f13 = f15345d;
            float fM6403constructorimpl = Dp.m6403constructorimpl(5 * f13);
            float f14 = f15344c;
            float fM6403constructorimpl2 = Dp.m6403constructorimpl(fM6403constructorimpl + f14);
            Modifier.Companion companion6 = Modifier.Companion;
            float f15 = 20;
            Modifier modifierG = b.g(SizeKt.m718width3ABfNKs(companion6, fM6403constructorimpl2), f15);
            float f16 = 1;
            float fM6403constructorimpl3 = Dp.m6403constructorimpl(f16);
            Color.Companion companion7 = Color.Companion;
            Modifier modifierE = b.e(f15, modifierG, fM6403constructorimpl3, Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion8 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion8.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
            ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
            a constructor9 = companion9.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor9);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG8 = p035i0.a.g(companion9, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl9, currentCompositionLocalMap);
            if (composerM3407constructorimpl9.getInserting()) {
                obj = "lifetime";
            } else {
                obj = "lifetime";
                if (!o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier, companion9.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m718width3ABfNKs(companion6, fM6403constructorimpl2), Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.015f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion8.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default);
                constructor = companion9.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap2);
                if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier2, companion9.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                f5 = 14;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.m718width3ABfNKs(companion6, f14), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(18));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getTopStart(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
                constructor2 = companion9.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap3);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier3, companion9.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                f6 = fM6403constructorimpl2;
                f7 = f14;
                f8 = f13;
                list = listS2;
                eVar = eVar3;
                obj2 = "monthly";
                TextKt.m2432Text4IGK_g("PRODUCT", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(8), (FontStyle) null, FontWeight.Companion.getBlack(), (FontFamily) null, TextUnitKt.getSp(2), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130898);
                composerStartRestartGroup.endNode();
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1166438334);
                it = listS.iterator();
                i6 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i12 = i6 + 1;
                    if (i6 >= 0) {
                        v.X();
                        throw null;
                    }
                    B3.h hVar2 = (B3.h) next;
                    m mVar = (m) hVar2.f148o;
                    zBooleanValue = ((Boolean) hVar2.p).booleanValue();
                    String str4 = (String) mVar.f152o;
                    String str5 = (String) mVar.p;
                    jM3937unboximpl = ((Color) mVar.q).m3937unboximpl();
                    companion2 = Modifier.Companion;
                    Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m718width3ABfNKs(companion2, f8), ((Color) list.get(i6)).m3937unboximpl(), null, 2, null);
                    if (i6 == 4) {
                        float f17 = 0;
                        modifierM220borderxT4_qwU2 = BorderKt.m220borderxT4_qwU(companion2, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(ColorKt.Color(4280472558L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m956RoundedCornerShapea9UjIt4(Dp.m6403constructorimpl(f17), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f17), Dp.m6403constructorimpl(f17)));
                    } else {
                        modifierM220borderxT4_qwU2 = companion2;
                    }
                    Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(modifierM207backgroundbw27NRU$default2.then(modifierM220borderxT4_qwU2), Dp.m6403constructorimpl(8), Dp.m6403constructorimpl(16));
                    companion3 = Alignment.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN5);
                    companion4 = ComposeUiNode.Companion;
                    constructor6 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                    eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier4, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion2);
                    constructor7 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer2);
                    eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier5, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    companion5 = FontWeight.Companion;
                    FontWeight black = companion5.getBlack();
                    long sp = TextUnitKt.getSp(9);
                    long sp2 = TextUnitKt.getSp(1);
                    TextAlign.Companion companion10 = TextAlign.Companion;
                    composer4 = composer2;
                    TextKt.m2432Text4IGK_g(str4, (Modifier) null, jM3937unboximpl, sp, (FontStyle) null, black, (FontFamily) null, sp2, (TextDecoration) null, TextAlign.m6285boximpl(companion10.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 12782592, 0, 130386);
                    f12 = 3;
                    b.m(f12, companion2, composer4, 6);
                    TextKt.m2432Text4IGK_g(str5, (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion10.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200064, 0, 130514);
                    composer4.startReplaceGroup(-916850775);
                    if (zBooleanValue) {
                        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f12)), composer4, 6);
                        Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion2, RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(jM3937unboximpl, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(6), Dp.m6403constructorimpl(2));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, modifierM669paddingVpY3zN6);
                        constructor8 = companion4.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor8);
                        } else {
                            composer4.useNode();
                        }
                        composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer4);
                        eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl8, currentCompositionLocalMap6);
                        if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier6, companion4.getSetModifier());
                        FontWeight bold = companion5.getBold();
                        composer5 = composer4;
                        TextKt.m2432Text4IGK_g("✓ Active", (Modifier) null, jM3937unboximpl, TextUnitKt.getSp(8), (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 199686, 0, 131026);
                        composer5.endNode();
                    } else {
                        composer5 = composer4;
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    composer5.endNode();
                    it = it;
                    composer2 = composer5;
                    i6 = i12;
                    list = list;
                }
                list2 = list;
                composer3 = composer2;
                i7 = 2;
                composer3.endReplaceGroup();
                composer3.endNode();
                DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 432, 1);
                composer3.startReplaceGroup(510555163);
                i8 = 0;
                for (Object obj5 : f15343b) {
                    i9 = i8 + 1;
                    if (i8 >= 0) {
                        v.X();
                        throw null;
                    }
                    c2662s = (C2662s) obj5;
                    composer3.startReplaceGroup(510551988);
                    if (i8 > 0) {
                        DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 432, 1);
                    }
                    composer3.endReplaceGroup();
                    Modifier.Companion companion11 = Modifier.Companion;
                    Modifier modifierM718width3ABfNKs = SizeKt.m718width3ABfNKs(companion11, Dp.m6403constructorimpl(f6 - Dp.m6403constructorimpl(40)));
                    Color.Companion companion12 = Color.Companion;
                    long jM3964getWhite0d7_KjU = companion12.m3964getWhite0d7_KjU();
                    if (i8 % i7 == 0) {
                        f9 = 0.006f;
                    } else {
                        f9 = 0.0f;
                    }
                    Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(modifierM718width3ABfNKs, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f9, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion13 = Alignment.Companion;
                    Alignment.Vertical top2 = companion13.getTop();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), top2, composer3, 48);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierM207backgroundbw27NRU$default3);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.Companion;
                    float f18 = f6;
                    constructor3 = companion14.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                    e eVarG9 = p035i0.a.g(companion14, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl3.getInserting()) {
                        c2662s2 = c2662s;
                    } else {
                        c2662s2 = c2662s;
                        if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier7, companion14.getSetModifier());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        float f19 = f7;
                        f10 = 16;
                        Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(SizeKt.m718width3ABfNKs(companion11, f19), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion13.getStart(), composer3, 0);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN7);
                        constructor4 = companion14.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                        eVarG3 = p035i0.a.g(companion14, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap8);
                        if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier8, companion14.getSetModifier());
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        long jM3964getWhite0d7_KjU2 = companion12.m3964getWhite0d7_KjU();
                        FontWeight.Companion companion15 = FontWeight.Companion;
                        c2662s3 = c2662s2;
                        TextKt.m2432Text4IGK_g("NotesCrafter", (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(11), (FontStyle) null, companion15.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                        b.m(3, companion11, composer3, 6);
                        TextKt.m2432Text4IGK_g(c2662s3.f15509a, (Modifier) null, c2662s3.f15510b, TextUnitKt.getSp(9), (FontStyle) null, companion15.getBlack(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782592, 0, 130898);
                        composer3.endNode();
                        str2 = c2662s3.f15509a;
                        if (str2.equals("PRINTS")) {
                            eVar2 = eVar;
                            double dDoubleValue = ((Number) eVar2.invoke("guest", Double.valueOf(1.25d))).doubleValue();
                            double dDoubleValue2 = ((Number) eVar4.invoke("guest", Double.valueOf(3.35d))).doubleValue();
                            Locale locale = Locale.US;
                            strL = b.l("B&W: ₹", String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1)), "\nColor: ₹", String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue2)}, 1)));
                        } else {
                            eVar2 = eVar;
                            strL = c2662s3.f15511c;
                        }
                        if (str2.equals("PRINTS")) {
                            obj3 = obj2;
                            double dDoubleValue3 = ((Number) eVar2.invoke(obj3, Double.valueOf(1.15d))).doubleValue();
                            double dDoubleValue4 = ((Number) eVar4.invoke(obj3, Double.valueOf(3.0d))).doubleValue();
                            Locale locale2 = Locale.US;
                            strL2 = b.l("Save 8%\nB&W: ₹", String.format(locale2, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue3)}, 1)), "\nColor: ₹", String.format(locale2, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue4)}, 1)));
                        } else {
                            obj3 = obj2;
                            strL2 = c2662s3.f15512d;
                        }
                        if (str2.equals("PRINTS")) {
                            double dDoubleValue5 = ((Number) eVar2.invoke(str3, Double.valueOf(1.05d))).doubleValue();
                            double dDoubleValue6 = ((Number) eVar4.invoke(str3, Double.valueOf(2.75d))).doubleValue();
                            Locale locale3 = Locale.US;
                            strL3 = b.l("Save 17%\nB&W: ₹", String.format(locale3, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue5)}, 1)), "\nColor: ₹", String.format(locale3, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue6)}, 1)));
                        } else {
                            strL3 = c2662s3.e;
                        }
                        if (str2.equals("PRINTS")) {
                            double dDoubleValue7 = ((Number) eVar2.invoke("annual", Double.valueOf(0.99d))).doubleValue();
                            double dDoubleValue8 = ((Number) eVar4.invoke("annual", Double.valueOf(2.35d))).doubleValue();
                            Locale locale4 = Locale.US;
                            strL4 = b.l("Save 25%\nB&W: ₹", String.format(locale4, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue7)}, 1)), "\nColor: ₹", String.format(locale4, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue8)}, 1)));
                        } else {
                            strL4 = c2662s3.f15513f;
                        }
                        if (str2.equals("PRINTS")) {
                            obj4 = obj;
                            double dDoubleValue9 = ((Number) eVar2.invoke(obj4, Double.valueOf(0.89d))).doubleValue();
                            double dDoubleValue10 = ((Number) eVar4.invoke(obj4, Double.valueOf(1.99d))).doubleValue();
                            Locale locale5 = Locale.US;
                            strL5 = b.l("Save 35%\nB&W: ₹", String.format(locale5, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue9)}, 1)), "\nColor: ₹", String.format(locale5, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue10)}, 1)));
                        } else {
                            obj4 = obj;
                            strL5 = c2662s3.g;
                        }
                        composer3.startReplaceGroup(-1936020665);
                        i10 = 0;
                        for (Object obj6 : v.S(new B3.h(strL, Color.m3917boximpl(ColorKt.Color(4291548641L))), new B3.h(strL2, Color.m3917boximpl(ColorKt.Color(4291548641L))), new B3.h(strL3, Color.m3917boximpl(ColorKt.Color(4294829706L))), new B3.h(strL4, Color.m3917boximpl(ColorKt.Color(4291285758L))), new B3.h(strL5, Color.m3917boximpl(ColorKt.Color(4289065980L))))) {
                            i11 = i10 + 1;
                            if (i10 >= 0) {
                                v.X();
                                throw null;
                            }
                            B3.h hVar3 = (B3.h) obj6;
                            String str6 = (String) hVar3.f148o;
                            long jM3937unboximpl2 = ((Color) hVar3.p).m3937unboximpl();
                            if (i10 == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            modifierM220borderxT4_qwU = Modifier.Companion;
                            List list3 = list2;
                            Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m718width3ABfNKs(modifierM220borderxT4_qwU, f8), ((Color) list3.get(i10)).m3937unboximpl(), null, 2, null);
                            if (z3) {
                                modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM220borderxT4_qwU, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(ColorKt.Color(4280472558L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(0)));
                            }
                            Modifier modifierM669paddingVpY3zN8 = PaddingKt.m669paddingVpY3zN4(modifierM207backgroundbw27NRU$default4.then(modifierM220borderxT4_qwU), Dp.m6403constructorimpl(8), Dp.m6403constructorimpl(f10));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
                            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN8);
                            ComposeUiNode.Companion companion16 = ComposeUiNode.Companion;
                            constructor5 = companion16.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor5);
                            } else {
                                composer3.useNode();
                            }
                            composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                            eVarG4 = p035i0.a.g(companion16, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl5, currentCompositionLocalMap9);
                            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                            }
                            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier9, companion16.getSetModifier());
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            if (z3) {
                                f11 = 0.9f;
                            } else {
                                f11 = 0.72f;
                            }
                            long jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(jM3937unboximpl2, f11, 0.0f, 0.0f, 0.0f, 14, null);
                            companion = FontWeight.Companion;
                            if (z3) {
                                light = companion.getMedium();
                            } else {
                                light = companion.getLight();
                            }
                            TextKt.m2432Text4IGK_g(str6, (Modifier) null, jM3926copywmQWz5c$default, TextUnitKt.getSp(11), (FontStyle) null, light, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), TextUnitKt.getSp(15), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3072, 6, 129490);
                            composer3.endNode();
                            eVar2 = eVar2;
                            obj3 = obj3;
                            i10 = i11;
                            f8 = f8;
                            obj4 = obj4;
                            list2 = list3;
                        }
                        e eVar5 = eVar2;
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        i8 = i9;
                        f5 = f5;
                        f7 = f19;
                        obj = obj4;
                        i7 = 2;
                        eVar = eVar5;
                        obj2 = obj3;
                        str3 = str3;
                        list2 = list2;
                        f6 = f18;
                    }
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG9);
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier7, companion14.getSetModifier());
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    float f110 = f7;
                    f10 = 16;
                    Modifier modifierM669paddingVpY3zN9 = PaddingKt.m669paddingVpY3zN4(SizeKt.m718width3ABfNKs(companion11, f110), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f10));
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion13.getStart(), composer3, 0);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN9);
                    constructor4 = companion14.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                    eVarG3 = p035i0.a.g(companion14, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl4, currentCompositionLocalMap10);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier10, companion14.getSetModifier());
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    long jM3964getWhite0d7_KjU3 = companion12.m3964getWhite0d7_KjU();
                    FontWeight.Companion companion17 = FontWeight.Companion;
                    c2662s3 = c2662s2;
                    TextKt.m2432Text4IGK_g("NotesCrafter", (Modifier) null, jM3964getWhite0d7_KjU3, TextUnitKt.getSp(11), (FontStyle) null, companion17.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                    b.m(3, companion11, composer3, 6);
                    TextKt.m2432Text4IGK_g(c2662s3.f15509a, (Modifier) null, c2662s3.f15510b, TextUnitKt.getSp(9), (FontStyle) null, companion17.getBlack(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782592, 0, 130898);
                    composer3.endNode();
                    str2 = c2662s3.f15509a;
                    if (str2.equals("PRINTS")) {
                        eVar2 = eVar;
                        double dDoubleValue11 = ((Number) eVar2.invoke("guest", Double.valueOf(1.25d))).doubleValue();
                        double dDoubleValue12 = ((Number) eVar4.invoke("guest", Double.valueOf(3.35d))).doubleValue();
                        Locale locale6 = Locale.US;
                        strL = b.l("B&W: ₹", String.format(locale6, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue11)}, 1)), "\nColor: ₹", String.format(locale6, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue12)}, 1)));
                    } else {
                        eVar2 = eVar;
                        strL = c2662s3.f15511c;
                    }
                    if (str2.equals("PRINTS")) {
                        obj3 = obj2;
                        double dDoubleValue13 = ((Number) eVar2.invoke(obj3, Double.valueOf(1.15d))).doubleValue();
                        double dDoubleValue14 = ((Number) eVar4.invoke(obj3, Double.valueOf(3.0d))).doubleValue();
                        Locale locale7 = Locale.US;
                        strL2 = b.l("Save 8%\nB&W: ₹", String.format(locale7, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue13)}, 1)), "\nColor: ₹", String.format(locale7, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue14)}, 1)));
                    } else {
                        obj3 = obj2;
                        strL2 = c2662s3.f15512d;
                    }
                    if (str2.equals("PRINTS")) {
                        double dDoubleValue15 = ((Number) eVar2.invoke(str3, Double.valueOf(1.05d))).doubleValue();
                        double dDoubleValue16 = ((Number) eVar4.invoke(str3, Double.valueOf(2.75d))).doubleValue();
                        Locale locale8 = Locale.US;
                        strL3 = b.l("Save 17%\nB&W: ₹", String.format(locale8, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue15)}, 1)), "\nColor: ₹", String.format(locale8, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue16)}, 1)));
                    } else {
                        strL3 = c2662s3.e;
                    }
                    if (str2.equals("PRINTS")) {
                        double dDoubleValue17 = ((Number) eVar2.invoke("annual", Double.valueOf(0.99d))).doubleValue();
                        double dDoubleValue18 = ((Number) eVar4.invoke("annual", Double.valueOf(2.35d))).doubleValue();
                        Locale locale9 = Locale.US;
                        strL4 = b.l("Save 25%\nB&W: ₹", String.format(locale9, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue17)}, 1)), "\nColor: ₹", String.format(locale9, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue18)}, 1)));
                    } else {
                        strL4 = c2662s3.f15513f;
                    }
                    if (str2.equals("PRINTS")) {
                        obj4 = obj;
                        double dDoubleValue19 = ((Number) eVar2.invoke(obj4, Double.valueOf(0.89d))).doubleValue();
                        double dDoubleValue110 = ((Number) eVar4.invoke(obj4, Double.valueOf(1.99d))).doubleValue();
                        Locale locale10 = Locale.US;
                        strL5 = b.l("Save 35%\nB&W: ₹", String.format(locale10, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue19)}, 1)), "\nColor: ₹", String.format(locale10, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue110)}, 1)));
                    } else {
                        obj4 = obj;
                        strL5 = c2662s3.g;
                    }
                    composer3.startReplaceGroup(-1936020665);
                    i10 = 0;
                    while (r1.hasNext()) {
                        i11 = i10 + 1;
                        if (i10 >= 0) {
                            v.X();
                            throw null;
                        }
                        B3.h hVar4 = (B3.h) obj6;
                        String str7 = (String) hVar4.f148o;
                        long jM3937unboximpl3 = ((Color) hVar4.p).m3937unboximpl();
                        if (i10 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        modifierM220borderxT4_qwU = Modifier.Companion;
                        List list4 = list2;
                        Modifier modifierM207backgroundbw27NRU$default5 = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m718width3ABfNKs(modifierM220borderxT4_qwU, f8), ((Color) list4.get(i10)).m3937unboximpl(), null, 2, null);
                        if (z3) {
                            modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM220borderxT4_qwU, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(ColorKt.Color(4280472558L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(0)));
                        }
                        Modifier modifierM669paddingVpY3zN10 = PaddingKt.m669paddingVpY3zN4(modifierM207backgroundbw27NRU$default5.then(modifierM220borderxT4_qwU), Dp.m6403constructorimpl(8), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN10);
                        ComposeUiNode.Companion companion18 = ComposeUiNode.Companion;
                        constructor5 = companion18.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                        eVarG4 = p035i0.a.g(companion18, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl5, currentCompositionLocalMap11);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier11, companion18.getSetModifier());
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        if (z3) {
                            f11 = 0.9f;
                        } else {
                            f11 = 0.72f;
                        }
                        long jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(jM3937unboximpl3, f11, 0.0f, 0.0f, 0.0f, 14, null);
                        companion = FontWeight.Companion;
                        if (z3) {
                            light = companion.getMedium();
                        } else {
                            light = companion.getLight();
                        }
                        TextKt.m2432Text4IGK_g(str7, (Modifier) null, jM3926copywmQWz5c$default2, TextUnitKt.getSp(11), (FontStyle) null, light, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), TextUnitKt.getSp(15), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3072, 6, 129490);
                        composer3.endNode();
                        eVar2 = eVar2;
                        obj3 = obj3;
                        i10 = i11;
                        f8 = f8;
                        obj4 = obj4;
                        list2 = list4;
                    }
                    e eVar6 = eVar2;
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    i8 = i9;
                    f5 = f5;
                    f7 = f110;
                    obj = obj4;
                    i7 = 2;
                    eVar = eVar6;
                    obj2 = obj3;
                    str3 = str3;
                    list2 = list2;
                    f6 = f18;
                }
                if (p035i0.a.z(composer3)) {
                    ComposerKt.traceEventEnd();
                }
            }
            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG8);
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier, companion9.getSetModifier());
            ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
            Modifier modifierM207backgroundbw27NRU$default6 = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m718width3ABfNKs(companion6, fM6403constructorimpl2), Color.m3926copywmQWz5c$default(companion7.m3964getWhite0d7_KjU(), 0.015f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion8.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM207backgroundbw27NRU$default6);
            constructor = companion9.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl, currentCompositionLocalMap12);
            if (composerM3407constructorimpl.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier12, companion9.getSetModifier());
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            f5 = 14;
            Modifier modifierM669paddingVpY3zN11 = PaddingKt.m669paddingVpY3zN4(SizeKt.m718width3ABfNKs(companion6, f14), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(18));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getTopStart(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN11);
            constructor2 = companion9.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composerStartRestartGroup);
            eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl2, currentCompositionLocalMap13);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier13, companion9.getSetModifier());
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            f6 = fM6403constructorimpl2;
            f7 = f14;
            f8 = f13;
            list = listS2;
            eVar = eVar3;
            obj2 = "monthly";
            TextKt.m2432Text4IGK_g("PRODUCT", (Modifier) null, Color.m3926copywmQWz5c$default(p107y3.a.p, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(8), (FontStyle) null, FontWeight.Companion.getBlack(), (FontFamily) null, TextUnitKt.getSp(2), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782982, 0, 130898);
            composerStartRestartGroup.endNode();
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(1166438334);
            it = listS.iterator();
            i6 = 0;
            while (it.hasNext()) {
                next = it.next();
                i12 = i6 + 1;
                if (i6 >= 0) {
                    v.X();
                    throw null;
                }
                B3.h hVar5 = (B3.h) next;
                m mVar2 = (m) hVar5.f148o;
                zBooleanValue = ((Boolean) hVar5.p).booleanValue();
                String str8 = (String) mVar2.f152o;
                String str9 = (String) mVar2.p;
                jM3937unboximpl = ((Color) mVar2.q).m3937unboximpl();
                companion2 = Modifier.Companion;
                Modifier modifierM207backgroundbw27NRU$default7 = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m718width3ABfNKs(companion2, f8), ((Color) list.get(i6)).m3937unboximpl(), null, 2, null);
                if (i6 == 4) {
                    float f111 = 0;
                    modifierM220borderxT4_qwU2 = BorderKt.m220borderxT4_qwU(companion2, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(ColorKt.Color(4280472558L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m956RoundedCornerShapea9UjIt4(Dp.m6403constructorimpl(f111), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(f111), Dp.m6403constructorimpl(f111)));
                } else {
                    modifierM220borderxT4_qwU2 = companion2;
                }
                Modifier modifierM669paddingVpY3zN12 = PaddingKt.m669paddingVpY3zN4(modifierM207backgroundbw27NRU$default7.then(modifierM220borderxT4_qwU2), Dp.m6403constructorimpl(8), Dp.m6403constructorimpl(16));
                companion3 = Alignment.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN12);
                companion4 = ComposeUiNode.Companion;
                constructor6 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer2);
                eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl6, currentCompositionLocalMap14);
                if (composerM3407constructorimpl6.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                } else {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier14, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer2, companion2);
                constructor7 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor7);
                } else {
                    composer2.useNode();
                }
                composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer2);
                eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl7, currentCompositionLocalMap15);
                if (composerM3407constructorimpl7.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                } else {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier15, companion4.getSetModifier());
                ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                companion5 = FontWeight.Companion;
                FontWeight black2 = companion5.getBlack();
                long sp3 = TextUnitKt.getSp(9);
                long sp4 = TextUnitKt.getSp(1);
                TextAlign.Companion companion19 = TextAlign.Companion;
                composer4 = composer2;
                TextKt.m2432Text4IGK_g(str8, (Modifier) null, jM3937unboximpl, sp3, (FontStyle) null, black2, (FontFamily) null, sp4, (TextDecoration) null, TextAlign.m6285boximpl(companion19.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 12782592, 0, 130386);
                f12 = 3;
                b.m(f12, companion2, composer4, 6);
                TextKt.m2432Text4IGK_g(str9, (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(15), (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion19.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200064, 0, 130514);
                composer4.startReplaceGroup(-916850775);
                if (zBooleanValue) {
                    SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion2, Dp.m6403constructorimpl(f12)), composer4, 6);
                    Modifier modifierM669paddingVpY3zN13 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(companion2, RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(jM3937unboximpl, 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(6), Dp.m6403constructorimpl(2));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap16 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer4, modifierM669paddingVpY3zN13);
                    constructor8 = companion4.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor8);
                    } else {
                        composer4.useNode();
                    }
                    composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer4);
                    eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl8, currentCompositionLocalMap16);
                    if (composerM3407constructorimpl8.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier16, companion4.getSetModifier());
                    FontWeight bold2 = companion5.getBold();
                    composer5 = composer4;
                    TextKt.m2432Text4IGK_g("✓ Active", (Modifier) null, jM3937unboximpl, TextUnitKt.getSp(8), (FontStyle) null, bold2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 199686, 0, 131026);
                    composer5.endNode();
                } else {
                    composer5 = composer4;
                }
                composer5.endReplaceGroup();
                composer5.endNode();
                composer5.endNode();
                it = it;
                composer2 = composer5;
                i6 = i12;
                list = list;
            }
            list2 = list;
            composer3 = composer2;
            i7 = 2;
            composer3.endReplaceGroup();
            composer3.endNode();
            DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 432, 1);
            composer3.startReplaceGroup(510555163);
            i8 = 0;
            while (r45.hasNext()) {
                i9 = i8 + 1;
                if (i8 >= 0) {
                    v.X();
                    throw null;
                }
                c2662s = (C2662s) obj5;
                composer3.startReplaceGroup(510551988);
                if (i8 > 0) {
                    DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 432, 1);
                }
                composer3.endReplaceGroup();
                Modifier.Companion companion110 = Modifier.Companion;
                Modifier modifierM718width3ABfNKs2 = SizeKt.m718width3ABfNKs(companion110, Dp.m6403constructorimpl(f6 - Dp.m6403constructorimpl(40)));
                Color.Companion companion111 = Color.Companion;
                long jM3964getWhite0d7_KjU4 = companion111.m3964getWhite0d7_KjU();
                if (i8 % i7 == 0) {
                    f9 = 0.006f;
                } else {
                    f9 = 0.0f;
                }
                Modifier modifierM207backgroundbw27NRU$default8 = BackgroundKt.m207backgroundbw27NRU$default(modifierM718width3ABfNKs2, Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU4, f9, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                Alignment.Companion companion112 = Alignment.Companion;
                Alignment.Vertical top3 = companion112.getTop();
                Arrangement arrangement3 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement3.getStart(), top3, composer3, 48);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap17 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer3, modifierM207backgroundbw27NRU$default8);
                ComposeUiNode.Companion companion113 = ComposeUiNode.Companion;
                float f112 = f6;
                constructor3 = companion113.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer3);
                e eVarG10 = p035i0.a.g(companion113, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy4, composerM3407constructorimpl3, currentCompositionLocalMap17);
                if (composerM3407constructorimpl3.getInserting()) {
                    c2662s2 = c2662s;
                    if (!o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier17, companion113.getSetModifier());
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    float f113 = f7;
                    f10 = 16;
                    Modifier modifierM669paddingVpY3zN14 = PaddingKt.m669paddingVpY3zN4(SizeKt.m718width3ABfNKs(companion110, f113), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f10));
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion112.getStart(), composer3, 0);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN14);
                    constructor4 = companion113.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                    eVarG3 = p035i0.a.g(companion113, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl4, currentCompositionLocalMap18);
                    if (composerM3407constructorimpl4.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier18, companion113.getSetModifier());
                    ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                    long jM3964getWhite0d7_KjU5 = companion111.m3964getWhite0d7_KjU();
                    FontWeight.Companion companion114 = FontWeight.Companion;
                    c2662s3 = c2662s2;
                    TextKt.m2432Text4IGK_g("NotesCrafter", (Modifier) null, jM3964getWhite0d7_KjU5, TextUnitKt.getSp(11), (FontStyle) null, companion114.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                    b.m(3, companion110, composer3, 6);
                    TextKt.m2432Text4IGK_g(c2662s3.f15509a, (Modifier) null, c2662s3.f15510b, TextUnitKt.getSp(9), (FontStyle) null, companion114.getBlack(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782592, 0, 130898);
                    composer3.endNode();
                    str2 = c2662s3.f15509a;
                    if (str2.equals("PRINTS")) {
                        eVar2 = eVar;
                        double dDoubleValue111 = ((Number) eVar2.invoke("guest", Double.valueOf(1.25d))).doubleValue();
                        double dDoubleValue112 = ((Number) eVar4.invoke("guest", Double.valueOf(3.35d))).doubleValue();
                        Locale locale11 = Locale.US;
                        strL = b.l("B&W: ₹", String.format(locale11, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue111)}, 1)), "\nColor: ₹", String.format(locale11, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue112)}, 1)));
                    } else {
                        eVar2 = eVar;
                        strL = c2662s3.f15511c;
                    }
                    if (str2.equals("PRINTS")) {
                        obj3 = obj2;
                        double dDoubleValue113 = ((Number) eVar2.invoke(obj3, Double.valueOf(1.15d))).doubleValue();
                        double dDoubleValue114 = ((Number) eVar4.invoke(obj3, Double.valueOf(3.0d))).doubleValue();
                        Locale locale12 = Locale.US;
                        strL2 = b.l("Save 8%\nB&W: ₹", String.format(locale12, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue113)}, 1)), "\nColor: ₹", String.format(locale12, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue114)}, 1)));
                    } else {
                        obj3 = obj2;
                        strL2 = c2662s3.f15512d;
                    }
                    if (str2.equals("PRINTS")) {
                        double dDoubleValue115 = ((Number) eVar2.invoke(str3, Double.valueOf(1.05d))).doubleValue();
                        double dDoubleValue116 = ((Number) eVar4.invoke(str3, Double.valueOf(2.75d))).doubleValue();
                        Locale locale13 = Locale.US;
                        strL3 = b.l("Save 17%\nB&W: ₹", String.format(locale13, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue115)}, 1)), "\nColor: ₹", String.format(locale13, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue116)}, 1)));
                    } else {
                        strL3 = c2662s3.e;
                    }
                    if (str2.equals("PRINTS")) {
                        double dDoubleValue117 = ((Number) eVar2.invoke("annual", Double.valueOf(0.99d))).doubleValue();
                        double dDoubleValue118 = ((Number) eVar4.invoke("annual", Double.valueOf(2.35d))).doubleValue();
                        Locale locale14 = Locale.US;
                        strL4 = b.l("Save 25%\nB&W: ₹", String.format(locale14, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue117)}, 1)), "\nColor: ₹", String.format(locale14, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue118)}, 1)));
                    } else {
                        strL4 = c2662s3.f15513f;
                    }
                    if (str2.equals("PRINTS")) {
                        obj4 = obj;
                        double dDoubleValue119 = ((Number) eVar2.invoke(obj4, Double.valueOf(0.89d))).doubleValue();
                        double dDoubleValue1110 = ((Number) eVar4.invoke(obj4, Double.valueOf(1.99d))).doubleValue();
                        Locale locale15 = Locale.US;
                        strL5 = b.l("Save 35%\nB&W: ₹", String.format(locale15, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue119)}, 1)), "\nColor: ₹", String.format(locale15, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1110)}, 1)));
                    } else {
                        obj4 = obj;
                        strL5 = c2662s3.g;
                    }
                    composer3.startReplaceGroup(-1936020665);
                    i10 = 0;
                    while (r1.hasNext()) {
                        i11 = i10 + 1;
                        if (i10 >= 0) {
                            v.X();
                            throw null;
                        }
                        B3.h hVar6 = (B3.h) obj6;
                        String str10 = (String) hVar6.f148o;
                        long jM3937unboximpl4 = ((Color) hVar6.p).m3937unboximpl();
                        if (i10 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        modifierM220borderxT4_qwU = Modifier.Companion;
                        List list5 = list2;
                        Modifier modifierM207backgroundbw27NRU$default9 = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m718width3ABfNKs(modifierM220borderxT4_qwU, f8), ((Color) list5.get(i10)).m3937unboximpl(), null, 2, null);
                        if (z3) {
                            modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM220borderxT4_qwU, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(ColorKt.Color(4280472558L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(0)));
                        }
                        Modifier modifierM669paddingVpY3zN15 = PaddingKt.m669paddingVpY3zN4(modifierM207backgroundbw27NRU$default9.then(modifierM220borderxT4_qwU), Dp.m6403constructorimpl(8), Dp.m6403constructorimpl(f10));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap19 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN15);
                        ComposeUiNode.Companion companion115 = ComposeUiNode.Companion;
                        constructor5 = companion115.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                        eVarG4 = p035i0.a.g(companion115, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3407constructorimpl5, currentCompositionLocalMap19);
                        if (composerM3407constructorimpl5.getInserting()) {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        } else {
                            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier19, companion115.getSetModifier());
                        BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                        if (z3) {
                            f11 = 0.9f;
                        } else {
                            f11 = 0.72f;
                        }
                        long jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(jM3937unboximpl4, f11, 0.0f, 0.0f, 0.0f, 14, null);
                        companion = FontWeight.Companion;
                        if (z3) {
                            light = companion.getMedium();
                        } else {
                            light = companion.getLight();
                        }
                        TextKt.m2432Text4IGK_g(str10, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(11), (FontStyle) null, light, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), TextUnitKt.getSp(15), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3072, 6, 129490);
                        composer3.endNode();
                        eVar2 = eVar2;
                        obj3 = obj3;
                        i10 = i11;
                        f8 = f8;
                        obj4 = obj4;
                        list2 = list5;
                    }
                    e eVar7 = eVar2;
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    i8 = i9;
                    f5 = f5;
                    f7 = f113;
                    obj = obj4;
                    i7 = 2;
                    eVar = eVar7;
                    obj2 = obj3;
                    str3 = str3;
                    list2 = list2;
                    f6 = f112;
                } else {
                    c2662s2 = c2662s;
                }
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG10);
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier17, companion113.getSetModifier());
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                float f114 = f7;
                f10 = 16;
                Modifier modifierM669paddingVpY3zN16 = PaddingKt.m669paddingVpY3zN4(SizeKt.m718width3ABfNKs(companion110, f114), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f10));
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion112.getStart(), composer3, 0);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap110 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN16);
                constructor4 = companion113.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer3);
                eVarG3 = p035i0.a.g(companion113, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl4, currentCompositionLocalMap110);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier110, companion113.getSetModifier());
                ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                long jM3964getWhite0d7_KjU6 = companion111.m3964getWhite0d7_KjU();
                FontWeight.Companion companion116 = FontWeight.Companion;
                c2662s3 = c2662s2;
                TextKt.m2432Text4IGK_g("NotesCrafter", (Modifier) null, jM3964getWhite0d7_KjU6, TextUnitKt.getSp(11), (FontStyle) null, companion116.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 200070, 0, 131026);
                b.m(3, companion110, composer3, 6);
                TextKt.m2432Text4IGK_g(c2662s3.f15509a, (Modifier) null, c2662s3.f15510b, TextUnitKt.getSp(9), (FontStyle) null, companion116.getBlack(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 12782592, 0, 130898);
                composer3.endNode();
                str2 = c2662s3.f15509a;
                if (str2.equals("PRINTS")) {
                    eVar2 = eVar;
                    double dDoubleValue1111 = ((Number) eVar2.invoke("guest", Double.valueOf(1.25d))).doubleValue();
                    double dDoubleValue1112 = ((Number) eVar4.invoke("guest", Double.valueOf(3.35d))).doubleValue();
                    Locale locale16 = Locale.US;
                    strL = b.l("B&W: ₹", String.format(locale16, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1111)}, 1)), "\nColor: ₹", String.format(locale16, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1112)}, 1)));
                } else {
                    eVar2 = eVar;
                    strL = c2662s3.f15511c;
                }
                if (str2.equals("PRINTS")) {
                    obj3 = obj2;
                    double dDoubleValue1113 = ((Number) eVar2.invoke(obj3, Double.valueOf(1.15d))).doubleValue();
                    double dDoubleValue1114 = ((Number) eVar4.invoke(obj3, Double.valueOf(3.0d))).doubleValue();
                    Locale locale17 = Locale.US;
                    strL2 = b.l("Save 8%\nB&W: ₹", String.format(locale17, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1113)}, 1)), "\nColor: ₹", String.format(locale17, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1114)}, 1)));
                } else {
                    obj3 = obj2;
                    strL2 = c2662s3.f15512d;
                }
                if (str2.equals("PRINTS")) {
                    double dDoubleValue1115 = ((Number) eVar2.invoke(str3, Double.valueOf(1.05d))).doubleValue();
                    double dDoubleValue1116 = ((Number) eVar4.invoke(str3, Double.valueOf(2.75d))).doubleValue();
                    Locale locale18 = Locale.US;
                    strL3 = b.l("Save 17%\nB&W: ₹", String.format(locale18, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1115)}, 1)), "\nColor: ₹", String.format(locale18, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1116)}, 1)));
                } else {
                    strL3 = c2662s3.e;
                }
                if (str2.equals("PRINTS")) {
                    double dDoubleValue1117 = ((Number) eVar2.invoke("annual", Double.valueOf(0.99d))).doubleValue();
                    double dDoubleValue1118 = ((Number) eVar4.invoke("annual", Double.valueOf(2.35d))).doubleValue();
                    Locale locale19 = Locale.US;
                    strL4 = b.l("Save 25%\nB&W: ₹", String.format(locale19, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1117)}, 1)), "\nColor: ₹", String.format(locale19, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1118)}, 1)));
                } else {
                    strL4 = c2662s3.f15513f;
                }
                if (str2.equals("PRINTS")) {
                    obj4 = obj;
                    double dDoubleValue1119 = ((Number) eVar2.invoke(obj4, Double.valueOf(0.89d))).doubleValue();
                    double dDoubleValue11110 = ((Number) eVar4.invoke(obj4, Double.valueOf(1.99d))).doubleValue();
                    Locale locale110 = Locale.US;
                    strL5 = b.l("Save 35%\nB&W: ₹", String.format(locale110, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue1119)}, 1)), "\nColor: ₹", String.format(locale110, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue11110)}, 1)));
                } else {
                    obj4 = obj;
                    strL5 = c2662s3.g;
                }
                composer3.startReplaceGroup(-1936020665);
                i10 = 0;
                while (r1.hasNext()) {
                    i11 = i10 + 1;
                    if (i10 >= 0) {
                        v.X();
                        throw null;
                    }
                    B3.h hVar7 = (B3.h) obj6;
                    String str11 = (String) hVar7.f148o;
                    long jM3937unboximpl5 = ((Color) hVar7.p).m3937unboximpl();
                    if (i10 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    modifierM220borderxT4_qwU = Modifier.Companion;
                    List list6 = list2;
                    Modifier modifierM207backgroundbw27NRU$default10 = BackgroundKt.m207backgroundbw27NRU$default(SizeKt.m718width3ABfNKs(modifierM220borderxT4_qwU, f8), ((Color) list6.get(i10)).m3937unboximpl(), null, 2, null);
                    if (z3) {
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM220borderxT4_qwU, Dp.m6403constructorimpl(f16), Color.m3926copywmQWz5c$default(ColorKt.Color(4280472558L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(0)));
                    }
                    Modifier modifierM669paddingVpY3zN17 = PaddingKt.m669paddingVpY3zN4(modifierM207backgroundbw27NRU$default10.then(modifierM220borderxT4_qwU), Dp.m6403constructorimpl(8), Dp.m6403constructorimpl(f10));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier111 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN17);
                    ComposeUiNode.Companion companion117 = ComposeUiNode.Companion;
                    constructor5 = companion117.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer3);
                    eVarG4 = p035i0.a.g(companion117, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3407constructorimpl5, currentCompositionLocalMap111);
                    if (composerM3407constructorimpl5.getInserting()) {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    } else {
                        p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier111, companion117.getSetModifier());
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    if (z3) {
                        f11 = 0.9f;
                    } else {
                        f11 = 0.72f;
                    }
                    long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(jM3937unboximpl5, f11, 0.0f, 0.0f, 0.0f, 14, null);
                    companion = FontWeight.Companion;
                    if (z3) {
                        light = companion.getMedium();
                    } else {
                        light = companion.getLight();
                    }
                    TextKt.m2432Text4IGK_g(str11, (Modifier) null, jM3926copywmQWz5c$default4, TextUnitKt.getSp(11), (FontStyle) null, light, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), TextUnitKt.getSp(15), 0, false, 0, 0, (c) null, (TextStyle) null, composer3, 3072, 6, 129490);
                    composer3.endNode();
                    eVar2 = eVar2;
                    obj3 = obj3;
                    i10 = i11;
                    f8 = f8;
                    obj4 = obj4;
                    list2 = list6;
                }
                e eVar8 = eVar2;
                composer3.endReplaceGroup();
                composer3.endNode();
                i8 = i9;
                f5 = f5;
                f7 = f114;
                obj = obj4;
                i7 = 2;
                eVar = eVar8;
                obj2 = obj3;
                str3 = str3;
                list2 = list2;
                f6 = f112;
            }
            if (p035i0.a.z(composer3)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2292j(i5, 2, str, hVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0607  */
    /* JADX WARN: Code duplicated, block: B:103:0x0613  */
    /* JADX WARN: Code duplicated, block: B:104:0x0617  */
    /* JADX WARN: Code duplicated, block: B:109:0x0638  */
    /* JADX WARN: Code duplicated, block: B:113:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:115:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:116:0x0708 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x070a  */
    /* JADX WARN: Code duplicated, block: B:118:0x071b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0783  */
    /* JADX WARN: Code duplicated, block: B:124:0x078f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0793  */
    /* JADX WARN: Code duplicated, block: B:130:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:136:0x080a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0811  */
    /* JADX WARN: Code duplicated, block: B:73:0x040c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0485  */
    /* JADX WARN: Code duplicated, block: B:78:0x0491  */
    /* JADX WARN: Code duplicated, block: B:79:0x0495  */
    /* JADX WARN: Code duplicated, block: B:84:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:87:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x051c  */
    /* JADX WARN: Code duplicated, block: B:98:0x058b  */
    public static final void c(G6 g6, boolean z3, Composer composer, int i5) {
        int i6;
        float f5;
        float f6;
        FontWeight.Companion companion;
        Locale locale;
        long j5;
        float f7;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        e eVarG;
        ComposeUiNode.Companion companion2;
        Composer composer2;
        Composer composer3;
        String str;
        Composer composer4;
        boolean z4;
        boolean z5;
        Modifier modifierM220borderxT4_qwU;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG2;
        long jM3964getWhite0d7_KjU;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG3;
        int currentCompositeKeyHash4;
        a constructor4;
        Composer composerM3407constructorimpl4;
        e eVarG4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1673590710);
        if ((i5 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(g6) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        }
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer4 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673590710, i6, -1, "com.notescrafter.ui.screens.PassCard (CommunityPassScreen.kt:561)");
            }
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            a constructor5 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG5 = p035i0.a.g(companion5, composerM3407constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f8 = 24;
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(PaddingKt.m670paddingVpY3zN4$default(b.e(f8, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), f8), g6.f13994m, null, 2, null), g6.f13990i ? Dp.m6403constructorimpl((float) 1.5d) : Dp.m6403constructorimpl(1), z3 ? Color.m3926copywmQWz5c$default(g6.f13992k, 0.55f, 0.0f, 0.0f, 0.0f, 14, null) : g6.f13993l), Dp.m6403constructorimpl(f8), 0.0f, 2, null), 0.0f, Dp.m6403constructorimpl(36), 0.0f, Dp.m6403constructorimpl(28), 5, null);
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM672paddingqDBjuR0$default);
            a constructor6 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG6 = p035i0.a.g(companion5, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap2);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier2, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f9 = 14;
            Modifier modifierG = b.g(SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(52)), f9);
            Color.Companion companion6 = Color.Companion;
            float f10 = 1;
            Modifier modifierE = b.e(f9, BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f10), Color.m3926copywmQWz5c$default(g6.f13992k, 0.18f, 0.0f, 0.0f, 0.0f, 14, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierE);
            a constructor7 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor7);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composerStartRestartGroup);
            e eVarG7 = p035i0.a.g(companion5, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl7, currentCompositionLocalMap3);
            if (composerM3407constructorimpl7.getInserting()) {
                f5 = f10;
            } else {
                f5 = f10;
                if (!o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier3, companion5.getSetModifier());
                f6 = f5;
                IconKt.m1877Iconww6aTOc(g6.f13991j, (String) null, SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(26)), g6.f13992k, composerStartRestartGroup, 432, 0);
                composerStartRestartGroup.endNode();
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(18)), composerStartRestartGroup, 6);
                long jM3964getWhite0d7_KjU2 = companion6.m3964getWhite0d7_KjU();
                companion = FontWeight.Companion;
                FontWeight medium = companion.getMedium();
                long sp = TextUnitKt.getSp(20);
                TextAlign.Companion companion7 = TextAlign.Companion;
                TextKt.m2432Text4IGK_g(g6.f13985b, (Modifier) null, jM3964getWhite0d7_KjU2, sp, (FontStyle) null, medium, (FontFamily) null, TextUnitKt.getSp(0.3d), (TextDecoration) null, TextAlign.m6285boximpl(companion7.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782976, 0, 130386);
                String strConcat = g6.f13986c.concat(" Access");
                locale = Locale.ROOT;
                String upperCase = strConcat.toUpperCase(locale);
                o.e(upperCase, "toUpperCase(...)");
                j5 = p107y3.a.p;
                f7 = 5;
                TextKt.m2432Text4IGK_g(upperCase, PaddingKt.m672paddingqDBjuR0$default(companion3, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), Color.m3926copywmQWz5c$default(j5, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, companion.getBold(), (FontFamily) null, TextUnitKt.getSp(2), (TextDecoration) null, TextAlign.m6285boximpl(companion7.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12783024, 0, 130384);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f8)), composerStartRestartGroup, 6);
                long jM3964getWhite0d7_KjU3 = companion6.m3964getWhite0d7_KjU();
                FontWeight light = companion.getLight();
                TextKt.m2432Text4IGK_g(g6.f13988f, (Modifier) null, jM3964getWhite0d7_KjU3, TextUnitKt.getSp(56), (FontStyle) null, light, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion7.m6292getCentere0LSkKk()), TextUnitKt.getSp(60), TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200064, 3126, 119250);
                TextKt.m2432Text4IGK_g(g6.e, PaddingKt.m672paddingqDBjuR0$default(companion3, 0.0f, Dp.m6403constructorimpl(6), 0.0f, 0.0f, 13, null), Color.m3926copywmQWz5c$default(g6.f13992k, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, companion.getBold(), (FontFamily) null, TextUnitKt.getSp(2), (TextDecoration) null, TextAlign.m6285boximpl(companion7.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782640, 0, 130384);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(22)), composerStartRestartGroup, 6);
                if (z3) {
                    composerStartRestartGroup.startReplaceGroup(-1271272377);
                    float f11 = 12;
                    Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f11, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth(companion3, 0.75f), f11), Color.m3926copywmQWz5c$default(g6.f13992k, 0.12f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(g6.f13992k, 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(11));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN4);
                    constructor3 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl3, currentCompositionLocalMap4);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier4, companion5.getSetModifier());
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(7)), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
                    constructor4 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG4 = p035i0.a.g(companion5, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap5);
                    if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier5, companion5.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(f9)), g6.f13992k, composerStartRestartGroup, 432, 0);
                    companion2 = companion5;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2432Text4IGK_g("ACTIVE PLAN", (Modifier) null, g6.f13992k, TextUnitKt.getSp(10), (FontStyle) null, companion.getBlack(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782598, 0, 130898);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1270118495);
                    float f12 = 12;
                    Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.e(f12, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth(companion3, 0.75f), f12), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(11));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN5);
                    constructor = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                    eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl, currentCompositionLocalMap6);
                    if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier6, companion5.getSetModifier());
                    companion2 = companion5;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2432Text4IGK_g(g6.f13987d, (Modifier) null, Color.m3926copywmQWz5c$default(j5, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, companion.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782976, 0, 130898);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer3 = composer2;
                composer3.startReplaceGroup(46311865);
                str = g6.g;
                if (j.m0(str)) {
                    composer4 = composer3;
                } else {
                    Modifier modifierClip = ClipKt.clip(OffsetKt.m629offsetVpY3zN4$default(boxScopeInstance.align(companion3, companion4.getTopCenter()), 0.0f, Dp.m6403constructorimpl(-13), 1, null), RoundedCornerShapeKt.getCircleShape());
                    z4 = g6.f13996o;
                    z5 = g6.f13995n;
                    if (z4) {
                        modifierM220borderxT4_qwU = BackgroundKt.background$default(companion3, Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4278630100L)), Color.m3917boximpl(ColorKt.Color(4282090230L))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    } else if (z5) {
                        modifierM220borderxT4_qwU = BackgroundKt.m207backgroundbw27NRU$default(companion3, companion6.m3964getWhite0d7_KjU(), null, 2, null);
                    } else {
                        modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(companion3, Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    }
                    Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(modifierClip.then(modifierM220borderxT4_qwU), Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(f7));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN6);
                    constructor2 = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                    ComposeUiNode.Companion companion8 = companion2;
                    eVarG2 = p035i0.a.g(companion8, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap7);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier7, companion8.getSetModifier());
                    String upperCase2 = str.toUpperCase(locale);
                    o.e(upperCase2, "toUpperCase(...)");
                    if (z5) {
                        jM3964getWhite0d7_KjU = companion6.m3953getBlack0d7_KjU();
                    } else {
                        jM3964getWhite0d7_KjU = companion6.m3964getWhite0d7_KjU();
                    }
                    composer4 = composer3;
                    TextKt.m2432Text4IGK_g(upperCase2, (Modifier) null, jM3964getWhite0d7_KjU, TextUnitKt.getSp(8), (FontStyle) null, companion.getBlack(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 12782592, 0, 130898);
                    composer4.endNode();
                }
                if (p035i0.a.z(composer4)) {
                    ComposerKt.traceEventEnd();
                }
            }
            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
            Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier3, companion5.getSetModifier());
            f6 = f5;
            IconKt.m1877Iconww6aTOc(g6.f13991j, (String) null, SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(26)), g6.f13992k, composerStartRestartGroup, 432, 0);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(18)), composerStartRestartGroup, 6);
            long jM3964getWhite0d7_KjU4 = companion6.m3964getWhite0d7_KjU();
            companion = FontWeight.Companion;
            FontWeight medium2 = companion.getMedium();
            long sp2 = TextUnitKt.getSp(20);
            TextAlign.Companion companion9 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g(g6.f13985b, (Modifier) null, jM3964getWhite0d7_KjU4, sp2, (FontStyle) null, medium2, (FontFamily) null, TextUnitKt.getSp(0.3d), (TextDecoration) null, TextAlign.m6285boximpl(companion9.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782976, 0, 130386);
            String strConcat2 = g6.f13986c.concat(" Access");
            locale = Locale.ROOT;
            String upperCase3 = strConcat2.toUpperCase(locale);
            o.e(upperCase3, "toUpperCase(...)");
            j5 = p107y3.a.p;
            f7 = 5;
            TextKt.m2432Text4IGK_g(upperCase3, PaddingKt.m672paddingqDBjuR0$default(companion3, 0.0f, Dp.m6403constructorimpl(f7), 0.0f, 0.0f, 13, null), Color.m3926copywmQWz5c$default(j5, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, companion.getBold(), (FontFamily) null, TextUnitKt.getSp(2), (TextDecoration) null, TextAlign.m6285boximpl(companion9.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12783024, 0, 130384);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f8)), composerStartRestartGroup, 6);
            long jM3964getWhite0d7_KjU5 = companion6.m3964getWhite0d7_KjU();
            FontWeight light2 = companion.getLight();
            TextKt.m2432Text4IGK_g(g6.f13988f, (Modifier) null, jM3964getWhite0d7_KjU5, TextUnitKt.getSp(56), (FontStyle) null, light2, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion9.m6292getCentere0LSkKk()), TextUnitKt.getSp(60), TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 200064, 3126, 119250);
            TextKt.m2432Text4IGK_g(g6.e, PaddingKt.m672paddingqDBjuR0$default(companion3, 0.0f, Dp.m6403constructorimpl(6), 0.0f, 0.0f, 13, null), Color.m3926copywmQWz5c$default(g6.f13992k, 0.5f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, companion.getBold(), (FontFamily) null, TextUnitKt.getSp(2), (TextDecoration) null, TextAlign.m6285boximpl(companion9.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composerStartRestartGroup, 12782640, 0, 130384);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(22)), composerStartRestartGroup, 6);
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(-1271272377);
                float f13 = 12;
                Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(b.e(f13, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth(companion3, 0.75f), f13), Color.m3926copywmQWz5c$default(g6.f13992k, 0.12f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(g6.f13992k, 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(11));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN7);
                constructor3 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3407constructorimpl3, currentCompositionLocalMap8);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier8, companion5.getSetModifier());
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(7)), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
                constructor4 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl4 = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG4 = p035i0.a.g(companion5, composerM3407constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap9);
                if (composerM3407constructorimpl4.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                } else {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier9, companion5.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                IconKt.m1877Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion3, Dp.m6403constructorimpl(f9)), g6.f13992k, composerStartRestartGroup, 432, 0);
                companion2 = companion5;
                composer2 = composerStartRestartGroup;
                TextKt.m2432Text4IGK_g("ACTIVE PLAN", (Modifier) null, g6.f13992k, TextUnitKt.getSp(10), (FontStyle) null, companion.getBlack(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782598, 0, 130898);
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1270118495);
                float f14 = 12;
                Modifier modifierM669paddingVpY3zN8 = PaddingKt.m669paddingVpY3zN4(b.e(f14, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth(companion3, 0.75f), f14), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(16), Dp.m6403constructorimpl(11));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM669paddingVpY3zN8);
                constructor = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composerStartRestartGroup);
                eVarG = p035i0.a.g(companion5, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3407constructorimpl, currentCompositionLocalMap10);
                if (composerM3407constructorimpl.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier10, companion5.getSetModifier());
                companion2 = companion5;
                composer2 = composerStartRestartGroup;
                TextKt.m2432Text4IGK_g(g6.f13987d, (Modifier) null, Color.m3926copywmQWz5c$default(j5, 0.55f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, companion.getMedium(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer2, 12782976, 0, 130898);
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer3 = composer2;
            composer3.startReplaceGroup(46311865);
            str = g6.g;
            if (j.m0(str)) {
                Modifier modifierClip2 = ClipKt.clip(OffsetKt.m629offsetVpY3zN4$default(boxScopeInstance.align(companion3, companion4.getTopCenter()), 0.0f, Dp.m6403constructorimpl(-13), 1, null), RoundedCornerShapeKt.getCircleShape());
                z4 = g6.f13996o;
                z5 = g6.f13995n;
                if (z4) {
                    modifierM220borderxT4_qwU = BackgroundKt.background$default(companion3, Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4278630100L)), Color.m3917boximpl(ColorKt.Color(4282090230L))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                } else if (z5) {
                    modifierM220borderxT4_qwU = BackgroundKt.m207backgroundbw27NRU$default(companion3, companion6.m3964getWhite0d7_KjU(), null, 2, null);
                } else {
                    modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(companion3, Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f6), Color.m3926copywmQWz5c$default(companion6.m3964getWhite0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                }
                Modifier modifierM669paddingVpY3zN9 = PaddingKt.m669paddingVpY3zN4(modifierClip2.then(modifierM220borderxT4_qwU), Dp.m6403constructorimpl(f9), Dp.m6403constructorimpl(f7));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN9);
                constructor2 = companion2.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                ComposeUiNode.Companion companion10 = companion2;
                eVarG2 = p035i0.a.g(companion10, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3407constructorimpl2, currentCompositionLocalMap11);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier11, companion10.getSetModifier());
                String upperCase4 = str.toUpperCase(locale);
                o.e(upperCase4, "toUpperCase(...)");
                if (z5) {
                    jM3964getWhite0d7_KjU = companion6.m3953getBlack0d7_KjU();
                } else {
                    jM3964getWhite0d7_KjU = companion6.m3964getWhite0d7_KjU();
                }
                composer4 = composer3;
                TextKt.m2432Text4IGK_g(upperCase4, (Modifier) null, jM3964getWhite0d7_KjU, TextUnitKt.getSp(8), (FontStyle) null, companion.getBlack(), (FontFamily) null, TextUnitKt.getSp(1.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 12782592, 0, 130898);
                composer4.endNode();
            } else {
                composer4 = composer3;
            }
            if (p035i0.a.z(composer4)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new J5(i5, z3, 9, g6));
        }
    }
}
