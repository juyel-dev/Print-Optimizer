package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import W3.j;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material.icons.outlined.ArchiveKt;
import androidx.compose.material.icons.outlined.CachedKt;
import androidx.compose.material.icons.outlined.CheckCircleKt;
import androidx.compose.material.icons.outlined.CreditCardKt;
import androidx.compose.material.icons.outlined.LocalShippingKt;
import androidx.compose.material.icons.outlined.PlaceKt;
import androidx.compose.material.icons.outlined.PrintKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.O;
import p087u3.l;
import p087u3.n;
import p087u3.p;
import p087u3.s;

/* JADX INFO: loaded from: classes2.dex */
public final class Ub implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f14498o;
    public final /* synthetic */ n p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f14499r;

    public Ub(l lVar, n nVar, boolean z3, a aVar) {
        this.f14498o = lVar;
        this.p = nVar;
        this.q = z3;
        this.f14499r = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:172:0x0654  */
    /* JADX WARN: Code duplicated, block: B:194:0x0715  */
    /* JADX WARN: Code duplicated, block: B:197:0x0721  */
    /* JADX WARN: Code duplicated, block: B:198:0x0725  */
    /* JADX WARN: Code duplicated, block: B:201:0x0736  */
    /* JADX WARN: Code duplicated, block: B:204:0x0747  */
    /* JADX WARN: Code duplicated, block: B:208:0x0767  */
    /* JADX WARN: Code duplicated, block: B:210:0x077f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x0781  */
    /* JADX WARN: Code duplicated, block: B:212:0x0796  */
    /* JADX WARN: Code duplicated, block: B:215:0x07be  */
    /* JADX WARN: Code duplicated, block: B:216:0x07d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:218:0x07db  */
    /* JADX WARN: Code duplicated, block: B:221:0x0819  */
    /* JADX WARN: Code duplicated, block: B:224:0x0825  */
    /* JADX WARN: Code duplicated, block: B:225:0x0829  */
    /* JADX WARN: Code duplicated, block: B:228:0x083a  */
    /* JADX WARN: Code duplicated, block: B:230:0x0848  */
    /* JADX WARN: Code duplicated, block: B:233:0x0856 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x0872  */
    /* JADX WARN: Code duplicated, block: B:240:0x089f  */
    /* JADX WARN: Code duplicated, block: B:242:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:244:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:248:0x0994  */
    /* JADX WARN: Code duplicated, block: B:251:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:252:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:255:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:257:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:260:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:263:0x09e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:265:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:268:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:270:0x0a44 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:272:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:276:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:279:0x0a9e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:334:0x0d7b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3;
        int i5;
        float f5;
        int i6;
        Composer composer;
        float f6;
        Arrangement arrangement;
        int i7;
        ?? r4;
        int i8;
        int i9;
        String status;
        ImageVector cached;
        Iterator it;
        int currentCompositeKeyHash;
        a constructor;
        Composer composerM3407constructorimpl;
        Arrangement arrangement2;
        long jM3926copywmQWz5c$default;
        long jM3926copywmQWz5c$default2;
        int currentCompositeKeyHash2;
        a constructor2;
        Composer composerM3407constructorimpl2;
        e eVarG;
        long jD;
        int currentCompositeKeyHash3;
        a constructor3;
        Composer composerM3407constructorimpl3;
        e eVarG2;
        Color.Companion companion;
        long jM3964getWhite0d7_KjU;
        float f7;
        float f8;
        float f9;
        long jM3964getWhite0d7_KjU2;
        String str4;
        long jM3926copywmQWz5c$default3;
        Composer composer2;
        int i10;
        Composer composer3;
        float f10;
        Brush brushM3884verticalGradient8A3gB4$default;
        Composer composer4;
        boolean z3;
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer5 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1072567155, iIntValue, -1, "com.notescrafter.ui.screens.OrderCardItem.<anonymous>.<anonymous>.<anonymous> (PrintMyOrdersScreen.kt:809)");
        }
        Modifier.Companion companion2 = Modifier.Companion;
        float f11 = 16;
        Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m6403constructorimpl(f11), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f11), 7, null);
        Arrangement arrangement3 = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement3.getTop();
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer5, 0);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierM672paddingqDBjuR0$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        a constructor4 = companion4.getConstructor();
        if (composer5.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer5.startReusableNode();
        if (composer5.getInserting()) {
            composer5.createNode(constructor4);
        } else {
            composer5.useNode();
        }
        Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer5);
        e eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap);
        if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG3);
        }
        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier, companion4.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Color.Companion companion5 = Color.Companion;
        float f12 = 1;
        DividerKt.m1794HorizontalDivider9IZ8Weo(null, Dp.m6403constructorimpl(f12), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), composer5, 432, 1);
        float f13 = 12;
        b.m(f13, companion2, composer5, 6);
        n nVar = this.p;
        l lVar = this.f14498o;
        if (lVar == null || (awb = lVar.getAwb()) == null) {
            p tracking = nVar.getTracking();
            if (tracking != null) {
                String awb = tracking.getAwb();
                str = awb;
            } else {
                str = null;
            }
        } else {
            str = awb;
        }
        if (lVar == null || (courier = lVar.getCourier()) == null) {
            p tracking2 = nVar.getTracking();
            if (tracking2 != null) {
                String courier = tracking2.getCourier();
                str2 = courier;
            } else {
                str2 = null;
            }
        } else {
            str2 = courier;
        }
        if (lVar == null || (estimatedDelivery = lVar.getLastTrackedAt()) == null) {
            p tracking3 = nVar.getTracking();
            if (tracking3 != null) {
                String estimatedDelivery = tracking3.getEstimatedDelivery();
                str3 = estimatedDelivery;
            } else {
                str3 = null;
            }
        } else {
            str3 = estimatedDelivery;
        }
        composer5.startReplaceGroup(376528639);
        if (str == null || j.m0(str)) {
            i5 = 6;
            f5 = f13;
            i6 = 8;
            composer = composer5;
            f6 = f11;
            arrangement = arrangement3;
            i7 = 10;
            r4 = 0;
            i8 = 14;
            i9 = 12;
        } else {
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(b.e(f13, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f13), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f12), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(10));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f13)), companion3.getCenterVertically(), composer5, 54);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM668padding3ABfNKs);
            a constructor5 = companion4.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor5);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer5);
            e eVarG4 = p035i0.a.g(companion4, composerM3407constructorimpl5, measurePolicyRowMeasurePolicy, composerM3407constructorimpl5, currentCompositionLocalMap2);
            if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG4);
            }
            Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier2, companion4.getSetModifier());
            Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion3.getStart(), composer5, 0);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierWeight$default);
            a constructor6 = companion4.getConstructor();
            if (composer5.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer5.startReusableNode();
            if (composer5.getInserting()) {
                composer5.createNode(constructor6);
            } else {
                composer5.useNode();
            }
            Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer5);
            e eVarG5 = p035i0.a.g(companion4, composerM3407constructorimpl6, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap3);
            if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG5);
            }
            Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier3, companion4.getSetModifier());
            long jM3926copywmQWz5c$default4 = Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            FontWeight.Companion companion6 = FontWeight.Companion;
            arrangement = arrangement3;
            f6 = f11;
            f5 = f13;
            i6 = 8;
            i7 = 10;
            i9 = 12;
            TextKt.m2432Text4IGK_g("AWB / TRACKING #", (Modifier) null, jM3926copywmQWz5c$default4, TextUnitKt.getSp(8), (FontStyle) null, companion6.getBlack(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 12782982, 0, 130898);
            TextKt.m2432Text4IGK_g(str, (Modifier) null, companion5.m3964getWhite0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 200064, 0, 131026);
            TextKt.m2432Text4IGK_g(str2 == null ? "Courier Service" : str2, (Modifier) null, p107y3.a.d(), TextUnitKt.getSp(11), (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 200064, 0, 131026);
            composer5.endNode();
            composer5.startReplaceGroup(-258905342);
            if (str3 == null || j.m0(str3)) {
                composer4 = composer5;
                z3 = false;
            } else {
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getEnd(), composer5, 48);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, companion2);
                a constructor7 = companion4.getConstructor();
                if (composer5.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor7);
                } else {
                    composer5.useNode();
                }
                Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer5);
                e eVarG6 = p035i0.a.g(companion4, composerM3407constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap4);
                if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier4, companion4.getSetModifier());
                z3 = false;
                composer4 = composer5;
                TextKt.m2432Text4IGK_g("EST. DELIVERY", (Modifier) null, Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(8), (FontStyle) null, companion6.getBlack(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 12782982, 0, 130898);
                TextKt.m2432Text4IGK_g(AbstractC2452ec.f(str3), (Modifier) null, companion5.m3964getWhite0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200064, 0, 131026);
                composer4.endNode();
            }
            composer4.endReplaceGroup();
            if (this.q) {
                composer = composer4;
                composer.startReplaceGroup(564822769);
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(f6)), p107y3.a.d(), Dp.m6403constructorimpl(2), 0L, 0, composer, 438, 24);
                composer.endReplaceGroup();
                i5 = 6;
                i8 = 14;
            } else {
                composer = composer4;
                composer.startReplaceGroup(565149633);
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(companion5.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                composer.startReplaceGroup(-258853932);
                a aVar = this.f14499r;
                boolean zChanged = composer.changed(aVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new O(9, aVar);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), z3);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, z3 ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM242clickableXHw0xAI$default);
                a constructor8 = companion4.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor8);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer);
                e eVarG7 = p035i0.a.g(companion4, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl8, currentCompositionLocalMap5);
                if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG7);
                }
                Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier5, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                i8 = 14;
                IconKt.m1877Iconww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), "Refresh", SizeKt.m713size3ABfNKs(companion2, Dp.m6403constructorimpl(14)), companion5.m3964getWhite0d7_KjU(), composer, 3504, 0);
                composer.endNode();
                composer.endReplaceGroup();
                i5 = 6;
            }
            b.n(composer, f6, companion2, composer, i5);
            r4 = z3;
        }
        composer.endReplaceGroup();
        if (lVar == 0 || (status = lVar.getStatus()) == null) {
            status = nVar.getStatus();
        }
        String strH = AbstractC2452ec.h(status);
        List list = AbstractC2452ec.f14975a;
        int iIndexOf = list.indexOf(strH);
        float f14 = 0.0f;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl((float) r4)), companion3.getStart(), composer, i5);
        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, r4);
        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
        a constructor9 = companion4.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor9);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer);
        e eVarG8 = p035i0.a.g(companion4, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl9, currentCompositionLocalMap6);
        if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG8);
        }
        p035i0.a.w(companion4, composerM3407constructorimpl9, modifierMaterializeModifier6, composer, -258807995);
        Iterator it2 = list.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.X();
                throw null;
            }
            String str5 = (String) next;
            boolean z4 = i11 < iIndexOf;
            boolean z5 = i11 == iIndexOf;
            switch (str5) {
                case "Packed":
                    cached = ArchiveKt.getArchive(Icons.Outlined.INSTANCE);
                    break;
                case "Payment Verified":
                    cached = CreditCardKt.getCreditCard(Icons.Outlined.INSTANCE);
                    break;
                case "Printing":
                    cached = PrintKt.getPrint(Icons.Outlined.INSTANCE);
                    break;
                case "Shipped":
                    cached = LocalShippingKt.getLocalShipping(Icons.Outlined.INSTANCE);
                    break;
                case "Out for Delivery":
                    cached = PlaceKt.getPlace(Icons.Outlined.INSTANCE);
                    break;
                case "Delivered":
                    cached = CheckCircleKt.getCheckCircle(Icons.Outlined.INSTANCE);
                    break;
                default:
                    cached = CachedKt.getCached(Icons.Outlined.INSTANCE);
                    break;
            }
            boolean z6 = i11 == AbstractC2452ec.f14975a.size() - 1;
            Modifier.Companion companion7 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion7, f14, 1, null);
            Arrangement arrangement4 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement4.m548spacedBy0680j_4(Dp.m6403constructorimpl(i8));
            Alignment.Companion companion8 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion8.getTop(), composer, i5);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
            a constructor10 = companion9.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor10);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer);
            e eVarG9 = p035i0.a.g(companion9, composerM3407constructorimpl10, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl10, currentCompositionLocalMap7);
            if (composerM3407constructorimpl10.getInserting()) {
                it = it2;
            } else {
                it = it2;
                if (!o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier7, companion9.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion8.getCenterHorizontally();
                float f15 = 36;
                Modifier modifierM718width3ABfNKs = SizeKt.m718width3ABfNKs(companion7, Dp.m6403constructorimpl(f15));
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), centerHorizontally, composer, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierM718width3ABfNKs);
                constructor = companion9.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
                e eVarG10 = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy5, composerM3407constructorimpl, currentCompositionLocalMap8);
                if (composerM3407constructorimpl.getInserting()) {
                    arrangement2 = arrangement4;
                } else {
                    arrangement2 = arrangement4;
                    if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion9.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(f15)), RoundedCornerShapeKt.getCircleShape());
                    if (z4) {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else if (z5) {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip, jM3926copywmQWz5c$default, null, 2, null);
                    float fM6403constructorimpl = Dp.m6403constructorimpl(f12);
                    if (z4) {
                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else if (z5) {
                        jM3926copywmQWz5c$default2 = p107y3.a.d();
                    } else {
                        jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default2, fM6403constructorimpl, jM3926copywmQWz5c$default2, RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getCenter(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierM220borderxT4_qwU);
                    constructor2 = companion9.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                    eVarG = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap9);
                    if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier9, companion9.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (!z4 || z5) {
                        jD = p107y3.a.d();
                    } else {
                        jD = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    Arrangement arrangement5 = arrangement2;
                    float f16 = f6;
                    int i13 = iIndexOf;
                    IconKt.m1877Iconww6aTOc(cached, (String) null, SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(f6)), jD, composer, 432, 0);
                    composer.endNode();
                    composer.startReplaceGroup(-810413299);
                    if (!z6) {
                        Modifier modifierM699height3ABfNKs = SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion7, Dp.m6403constructorimpl(2)), Dp.m6403constructorimpl(56));
                        if (z4) {
                            brushM3884verticalGradient8A3gB4$default = Brush.Companion.m3884verticalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                        } else {
                            Brush.Companion companion10 = Brush.Companion;
                            Color.Companion companion11 = Color.Companion;
                            brushM3884verticalGradient8A3gB4$default = Brush.Companion.m3884verticalGradient8A3gB4$default(companion10, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion11.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion11.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                        }
                        BoxKt.Box(BackgroundKt.background$default(modifierM699height3ABfNKs, brushM3884verticalGradient8A3gB4$default, null, 0.0f, 6, null), composer, 0);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion7, 1.0f, false, 2, null);
                    int i14 = i6;
                    float f17 = i14;
                    Modifier modifierM672paddingqDBjuR0$default2 = PaddingKt.m672paddingqDBjuR0$default(modifierWeight$default2, 0.0f, Dp.m6403constructorimpl(f17), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement5.getTop(), companion8.getStart(), composer, 0);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default2);
                    constructor3 = companion9.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                    eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy6, composerM3407constructorimpl3, currentCompositionLocalMap10);
                    if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier10, companion9.getSetModifier());
                    companion = Color.Companion;
                    if (z4) {
                        jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
                        f7 = 0.0f;
                        f8 = 0.0f;
                        f9 = 0.8f;
                    } else {
                        if (z5) {
                            jM3964getWhite0d7_KjU2 = companion.m3964getWhite0d7_KjU();
                        } else {
                            jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
                            f7 = 0.0f;
                            f8 = 0.0f;
                            f9 = 0.25f;
                        }
                        Composer composer6 = composer;
                        TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 199680, 0, 131026);
                        if (z4) {
                            str4 = "Completed";
                        } else if (z5) {
                            str4 = "In progress";
                        } else {
                            str4 = "Pending";
                        }
                        String str6 = str4;
                        if (z5) {
                            jM3926copywmQWz5c$default3 = p107y3.a.d();
                        } else {
                            jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        TextKt.m2432Text4IGK_g(str6, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(i7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 3072, 0, 131058);
                        composer2 = composer6;
                        composer2.startReplaceGroup(-810334000);
                        if (o.b(str5, "Shipped") || lVar == 0 || lVar.getActivities().isEmpty()) {
                            i10 = i7;
                            composer3 = composer2;
                            f10 = f5;
                        } else {
                            b.m(f17, companion7, composer2, 6);
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                            float fM6403constructorimpl2 = Dp.m6403constructorimpl(f12);
                            Color.Companion companion12 = Color.Companion;
                            float f18 = f5;
                            int i15 = i7;
                            Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.f(f18, b.e(f18, modifierFillMaxWidth$default3, fM6403constructorimpl2, Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3926copywmQWz5c$default(companion12.m3964getWhite0d7_KjU(), 0.01f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(i15));
                            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement5.m548spacedBy0680j_4(Dp.m6403constructorimpl(f17)), companion8.getStart(), composer2, 6);
                            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs2);
                            a constructor11 = companion9.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor11);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer2);
                            e eVarG11 = p035i0.a.g(companion9, composerM3407constructorimpl11, measurePolicyColumnMeasurePolicy7, composerM3407constructorimpl11, currentCompositionLocalMap11);
                            if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
                            }
                            p035i0.a.w(companion9, composerM3407constructorimpl11, modifierMaterializeModifier11, composer2, 784748261);
                            for (s sVar : lVar.getActivities()) {
                                Arrangement arrangement6 = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_5 = arrangement6.m548spacedBy0680j_4(Dp.m6403constructorimpl(6));
                                Alignment.Companion companion13 = Alignment.Companion;
                                Alignment.Vertical top2 = companion13.getTop();
                                Modifier.Companion companion14 = Modifier.Companion;
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_5, top2, composer2, 54);
                                int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer2, companion14);
                                ComposeUiNode.Companion companion15 = ComposeUiNode.Companion;
                                a constructor12 = companion15.getConstructor();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor12);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3407constructorimpl12 = Updater.m3407constructorimpl(composer2);
                                e eVarG12 = p035i0.a.g(companion15, composerM3407constructorimpl12, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl12, currentCompositionLocalMap12);
                                if (composerM3407constructorimpl12.getInserting() || !o.b(composerM3407constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                                    p035i0.a.t(currentCompositeKeyHash12, composerM3407constructorimpl12, currentCompositeKeyHash12, eVarG12);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl12, modifierMaterializeModifier12, companion15.getSetModifier());
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(PaddingKt.m672paddingqDBjuR0$default(companion14, 0.0f, Dp.m6403constructorimpl(4), 0.0f, 0.0f, 13, null), Dp.m6403constructorimpl(5)), RoundedCornerShapeKt.getCircleShape()), p107y3.a.d(), null, 2, null), composer2, 0);
                                MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement6.getTop(), companion13.getStart(), composer2, 0);
                                int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer2, companion14);
                                a constructor13 = companion15.getConstructor();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor13);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3407constructorimpl13 = Updater.m3407constructorimpl(composer2);
                                e eVarG13 = p035i0.a.g(companion15, composerM3407constructorimpl13, measurePolicyColumnMeasurePolicy8, composerM3407constructorimpl13, currentCompositionLocalMap13);
                                if (composerM3407constructorimpl13.getInserting() || !o.b(composerM3407constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                                    p035i0.a.t(currentCompositeKeyHash13, composerM3407constructorimpl13, currentCompositeKeyHash13, eVarG13);
                                }
                                Updater.m3414setimpl(composerM3407constructorimpl13, modifierMaterializeModifier13, companion15.getSetModifier());
                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                String activity = sVar.getActivity();
                                Color.Companion companion16 = Color.Companion;
                                float f19 = f18;
                                Composer composer7 = composer2;
                                TextKt.m2432Text4IGK_g(activity, (Modifier) null, Color.m3926copywmQWz5c$default(companion16.m3964getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer7, 200064, 0, 131026);
                                StringBuilder sb = new StringBuilder();
                                String location = sVar.getLocation();
                                if (location != null && !j.m0(location)) {
                                    sb.append(sVar.getLocation());
                                    sb.append(" • ");
                                }
                                String date = sVar.getDate();
                                try {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
                                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                                    Date date2 = simpleDateFormat.parse(date);
                                    if (date2 == null) {
                                        date2 = new Date();
                                    }
                                    date = new SimpleDateFormat("MMM dd, HH:mm", Locale.getDefault()).format(date2);
                                } catch (Exception unused) {
                                }
                                sb.append(date);
                                String string = sb.toString();
                                o.e(string, "toString(...)");
                                TextKt.m2432Text4IGK_g(string, (Modifier) null, Color.m3926copywmQWz5c$default(companion16.m3964getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(9), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer7, 3456, 0, 131058);
                                composer7.endNode();
                                composer7.endNode();
                                i15 = 10;
                                f18 = f19;
                                composer2 = composer7;
                            }
                            i10 = i15;
                            f10 = f18;
                            composer3 = composer2;
                            composer3.endReplaceGroup();
                            composer3.endNode();
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endNode();
                        it2 = it;
                        i5 = 6;
                        i11 = i12;
                        i7 = i10;
                        iIndexOf = i13;
                        f5 = f10;
                        i8 = 14;
                        composer = composer3;
                        i6 = i14;
                        f6 = f16;
                        f14 = 0.0f;
                    }
                    jM3964getWhite0d7_KjU2 = Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f9, 0.0f, f7, f8, 14, null);
                    Composer composer8 = composer;
                    TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer8, 199680, 0, 131026);
                    if (z4) {
                        str4 = "Completed";
                    } else if (z5) {
                        str4 = "In progress";
                    } else {
                        str4 = "Pending";
                    }
                    String str7 = str4;
                    if (z5) {
                        jM3926copywmQWz5c$default3 = p107y3.a.d();
                    } else {
                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    TextKt.m2432Text4IGK_g(str7, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(i7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer8, 3072, 0, 131058);
                    composer2 = composer8;
                    composer2.startReplaceGroup(-810334000);
                    if (o.b(str5, "Shipped")) {
                        i10 = i7;
                        composer3 = composer2;
                        f10 = f5;
                    } else {
                        i10 = i7;
                        composer3 = composer2;
                        f10 = f5;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.endNode();
                    it2 = it;
                    i5 = 6;
                    i11 = i12;
                    i7 = i10;
                    iIndexOf = i13;
                    f5 = f10;
                    i8 = 14;
                    composer = composer3;
                    i6 = i14;
                    f6 = f16;
                    f14 = 0.0f;
                }
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG10);
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier8, companion9.getSetModifier());
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                Modifier modifierClip2 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(f15)), RoundedCornerShapeKt.getCircleShape());
                if (z4) {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                } else if (z5) {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM207backgroundbw27NRU$default3 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip2, jM3926copywmQWz5c$default, null, 2, null);
                float fM6403constructorimpl3 = Dp.m6403constructorimpl(f12);
                if (z4) {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                } else if (z5) {
                    jM3926copywmQWz5c$default2 = p107y3.a.d();
                } else {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM220borderxT4_qwU2 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default3, fM6403constructorimpl3, jM3926copywmQWz5c$default2, RoundedCornerShapeKt.getCircleShape());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getCenter(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer, modifierM220borderxT4_qwU2);
                constructor2 = companion9.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                eVarG = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl2, currentCompositionLocalMap14);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier14, companion9.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                if (z4) {
                    jD = p107y3.a.d();
                } else {
                    jD = p107y3.a.d();
                }
                Arrangement arrangement7 = arrangement2;
                float f110 = f6;
                int i16 = iIndexOf;
                IconKt.m1877Iconww6aTOc(cached, (String) null, SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(f6)), jD, composer, 432, 0);
                composer.endNode();
                composer.startReplaceGroup(-810413299);
                if (!z6) {
                    Modifier modifierM699height3ABfNKs2 = SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion7, Dp.m6403constructorimpl(2)), Dp.m6403constructorimpl(56));
                    if (z4) {
                        brushM3884verticalGradient8A3gB4$default = Brush.Companion.m3884verticalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                    } else {
                        Brush.Companion companion17 = Brush.Companion;
                        Color.Companion companion18 = Color.Companion;
                        brushM3884verticalGradient8A3gB4$default = Brush.Companion.m3884verticalGradient8A3gB4$default(companion17, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion18.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                    }
                    BoxKt.Box(BackgroundKt.background$default(modifierM699height3ABfNKs2, brushM3884verticalGradient8A3gB4$default, null, 0.0f, 6, null), composer, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance, companion7, 1.0f, false, 2, null);
                int i17 = i6;
                float f111 = i17;
                Modifier modifierM672paddingqDBjuR0$default3 = PaddingKt.m672paddingqDBjuR0$default(modifierWeight$default3, 0.0f, Dp.m6403constructorimpl(f111), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement7.getTop(), companion8.getStart(), composer, 0);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default3);
                constructor3 = companion9.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy9, composerM3407constructorimpl3, currentCompositionLocalMap15);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier15, companion9.getSetModifier());
                companion = Color.Companion;
                if (z4) {
                    jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
                    f7 = 0.0f;
                    f8 = 0.0f;
                    f9 = 0.8f;
                } else {
                    if (z5) {
                        jM3964getWhite0d7_KjU2 = companion.m3964getWhite0d7_KjU();
                    } else {
                        jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
                        f7 = 0.0f;
                        f8 = 0.0f;
                        f9 = 0.25f;
                    }
                    Composer composer9 = composer;
                    TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer9, 199680, 0, 131026);
                    if (z4) {
                        str4 = "Completed";
                    } else if (z5) {
                        str4 = "In progress";
                    } else {
                        str4 = "Pending";
                    }
                    String str8 = str4;
                    if (z5) {
                        jM3926copywmQWz5c$default3 = p107y3.a.d();
                    } else {
                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    TextKt.m2432Text4IGK_g(str8, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(i7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer9, 3072, 0, 131058);
                    composer2 = composer9;
                    composer2.startReplaceGroup(-810334000);
                    if (o.b(str5, "Shipped")) {
                        i10 = i7;
                        composer3 = composer2;
                        f10 = f5;
                    } else {
                        i10 = i7;
                        composer3 = composer2;
                        f10 = f5;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.endNode();
                    it2 = it;
                    i5 = 6;
                    i11 = i12;
                    i7 = i10;
                    iIndexOf = i16;
                    f5 = f10;
                    i8 = 14;
                    composer = composer3;
                    i6 = i17;
                    f6 = f110;
                    f14 = 0.0f;
                }
                jM3964getWhite0d7_KjU2 = Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f9, 0.0f, f7, f8, 14, null);
                Composer composer10 = composer;
                TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer10, 199680, 0, 131026);
                if (z4) {
                    str4 = "Completed";
                } else if (z5) {
                    str4 = "In progress";
                } else {
                    str4 = "Pending";
                }
                String str9 = str4;
                if (z5) {
                    jM3926copywmQWz5c$default3 = p107y3.a.d();
                } else {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                TextKt.m2432Text4IGK_g(str9, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(i7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer10, 3072, 0, 131058);
                composer2 = composer10;
                composer2.startReplaceGroup(-810334000);
                if (o.b(str5, "Shipped")) {
                    i10 = i7;
                    composer3 = composer2;
                    f10 = f5;
                } else {
                    i10 = i7;
                    composer3 = composer2;
                    f10 = f5;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.endNode();
                it2 = it;
                i5 = 6;
                i11 = i12;
                i7 = i10;
                iIndexOf = i16;
                f5 = f10;
                i8 = 14;
                composer = composer3;
                i6 = i17;
                f6 = f110;
                f14 = 0.0f;
            }
            p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG9);
            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier7, companion9.getSetModifier());
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion8.getCenterHorizontally();
            float f112 = 36;
            Modifier modifierM718width3ABfNKs2 = SizeKt.m718width3ABfNKs(companion7, Dp.m6403constructorimpl(f112));
            MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(arrangement4.getTop(), centerHorizontally2, composer, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap16 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer, modifierM718width3ABfNKs2);
            constructor = companion9.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
            e eVarG14 = p035i0.a.g(companion9, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy10, composerM3407constructorimpl, currentCompositionLocalMap16);
            if (composerM3407constructorimpl.getInserting()) {
                arrangement2 = arrangement4;
                if (!o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier16, companion9.getSetModifier());
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                Modifier modifierClip3 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(f112)), RoundedCornerShapeKt.getCircleShape());
                if (z4) {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
                } else if (z5) {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM207backgroundbw27NRU$default4 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip3, jM3926copywmQWz5c$default, null, 2, null);
                float fM6403constructorimpl4 = Dp.m6403constructorimpl(f12);
                if (z4) {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                } else if (z5) {
                    jM3926copywmQWz5c$default2 = p107y3.a.d();
                } else {
                    jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                Modifier modifierM220borderxT4_qwU3 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default4, fM6403constructorimpl4, jM3926copywmQWz5c$default2, RoundedCornerShapeKt.getCircleShape());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getCenter(), false);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap17 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer, modifierM220borderxT4_qwU3);
                constructor2 = companion9.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
                eVarG = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl2, currentCompositionLocalMap17);
                if (composerM3407constructorimpl2.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                } else {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier17, companion9.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                if (z4) {
                    jD = p107y3.a.d();
                } else {
                    jD = p107y3.a.d();
                }
                Arrangement arrangement8 = arrangement2;
                float f113 = f6;
                int i18 = iIndexOf;
                IconKt.m1877Iconww6aTOc(cached, (String) null, SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(f6)), jD, composer, 432, 0);
                composer.endNode();
                composer.startReplaceGroup(-810413299);
                if (!z6) {
                    Modifier modifierM699height3ABfNKs3 = SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion7, Dp.m6403constructorimpl(2)), Dp.m6403constructorimpl(56));
                    if (z4) {
                        brushM3884verticalGradient8A3gB4$default = Brush.Companion.m3884verticalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                    } else {
                        Brush.Companion companion19 = Brush.Companion;
                        Color.Companion companion110 = Color.Companion;
                        brushM3884verticalGradient8A3gB4$default = Brush.Companion.m3884verticalGradient8A3gB4$default(companion19, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion110.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion110.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                    }
                    BoxKt.Box(BackgroundKt.background$default(modifierM699height3ABfNKs3, brushM3884verticalGradient8A3gB4$default, null, 0.0f, 6, null), composer, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                Modifier modifierWeight$default4 = RowScope.weight$default(rowScopeInstance3, companion7, 1.0f, false, 2, null);
                int i19 = i6;
                float f114 = i19;
                Modifier modifierM672paddingqDBjuR0$default4 = PaddingKt.m672paddingqDBjuR0$default(modifierWeight$default4, 0.0f, Dp.m6403constructorimpl(f114), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(arrangement8.getTop(), companion8.getStart(), composer, 0);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap18 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default4);
                constructor3 = companion9.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy11, composerM3407constructorimpl3, currentCompositionLocalMap18);
                if (composerM3407constructorimpl3.getInserting()) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                } else {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier18, companion9.getSetModifier());
                companion = Color.Companion;
                if (z4) {
                    jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
                    f7 = 0.0f;
                    f8 = 0.0f;
                    f9 = 0.8f;
                } else {
                    if (z5) {
                        jM3964getWhite0d7_KjU2 = companion.m3964getWhite0d7_KjU();
                    } else {
                        jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
                        f7 = 0.0f;
                        f8 = 0.0f;
                        f9 = 0.25f;
                    }
                    Composer composer11 = composer;
                    TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer11, 199680, 0, 131026);
                    if (z4) {
                        str4 = "Completed";
                    } else if (z5) {
                        str4 = "In progress";
                    } else {
                        str4 = "Pending";
                    }
                    String str10 = str4;
                    if (z5) {
                        jM3926copywmQWz5c$default3 = p107y3.a.d();
                    } else {
                        jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    TextKt.m2432Text4IGK_g(str10, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(i7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer11, 3072, 0, 131058);
                    composer2 = composer11;
                    composer2.startReplaceGroup(-810334000);
                    if (o.b(str5, "Shipped")) {
                        i10 = i7;
                        composer3 = composer2;
                        f10 = f5;
                    } else {
                        i10 = i7;
                        composer3 = composer2;
                        f10 = f5;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.endNode();
                    it2 = it;
                    i5 = 6;
                    i11 = i12;
                    i7 = i10;
                    iIndexOf = i18;
                    f5 = f10;
                    i8 = 14;
                    composer = composer3;
                    i6 = i19;
                    f6 = f113;
                    f14 = 0.0f;
                }
                jM3964getWhite0d7_KjU2 = Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f9, 0.0f, f7, f8, 14, null);
                Composer composer12 = composer;
                TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer12, 199680, 0, 131026);
                if (z4) {
                    str4 = "Completed";
                } else if (z5) {
                    str4 = "In progress";
                } else {
                    str4 = "Pending";
                }
                String str11 = str4;
                if (z5) {
                    jM3926copywmQWz5c$default3 = p107y3.a.d();
                } else {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                TextKt.m2432Text4IGK_g(str11, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(i7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer12, 3072, 0, 131058);
                composer2 = composer12;
                composer2.startReplaceGroup(-810334000);
                if (o.b(str5, "Shipped")) {
                    i10 = i7;
                    composer3 = composer2;
                    f10 = f5;
                } else {
                    i10 = i7;
                    composer3 = composer2;
                    f10 = f5;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.endNode();
                it2 = it;
                i5 = 6;
                i11 = i12;
                i7 = i10;
                iIndexOf = i18;
                f5 = f10;
                i8 = 14;
                composer = composer3;
                i6 = i19;
                f6 = f113;
                f14 = 0.0f;
            } else {
                arrangement2 = arrangement4;
            }
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG14);
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier16, companion9.getSetModifier());
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            Modifier modifierClip4 = ClipKt.clip(SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(f112)), RoundedCornerShapeKt.getCircleShape());
            if (z4) {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
            } else if (z5) {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                jM3926copywmQWz5c$default = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            Modifier modifierM207backgroundbw27NRU$default5 = BackgroundKt.m207backgroundbw27NRU$default(modifierClip4, jM3926copywmQWz5c$default, null, 2, null);
            float fM6403constructorimpl5 = Dp.m6403constructorimpl(f12);
            if (z4) {
                jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
            } else if (z5) {
                jM3926copywmQWz5c$default2 = p107y3.a.d();
            } else {
                jM3926copywmQWz5c$default2 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            Modifier modifierM220borderxT4_qwU4 = BorderKt.m220borderxT4_qwU(modifierM207backgroundbw27NRU$default5, fM6403constructorimpl5, jM3926copywmQWz5c$default2, RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getCenter(), false);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap19 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier19 = ComposedModifierKt.materializeModifier(composer, modifierM220borderxT4_qwU4);
            constructor2 = companion9.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
            eVarG = p035i0.a.g(companion9, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3407constructorimpl2, currentCompositionLocalMap19);
            if (composerM3407constructorimpl2.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            } else {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier19, companion9.getSetModifier());
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            if (z4) {
                jD = p107y3.a.d();
            } else {
                jD = p107y3.a.d();
            }
            Arrangement arrangement9 = arrangement2;
            float f115 = f6;
            int i110 = iIndexOf;
            IconKt.m1877Iconww6aTOc(cached, (String) null, SizeKt.m713size3ABfNKs(companion7, Dp.m6403constructorimpl(f6)), jD, composer, 432, 0);
            composer.endNode();
            composer.startReplaceGroup(-810413299);
            if (!z6) {
                Modifier modifierM699height3ABfNKs4 = SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion7, Dp.m6403constructorimpl(2)), Dp.m6403constructorimpl(56));
                if (z4) {
                    brushM3884verticalGradient8A3gB4$default = Brush.Companion.m3884verticalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                } else {
                    Brush.Companion companion111 = Brush.Companion;
                    Color.Companion companion112 = Color.Companion;
                    brushM3884verticalGradient8A3gB4$default = Brush.Companion.m3884verticalGradient8A3gB4$default(companion111, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion112.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(companion112.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null);
                }
                BoxKt.Box(BackgroundKt.background$default(modifierM699height3ABfNKs4, brushM3884verticalGradient8A3gB4$default, null, 0.0f, 6, null), composer, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            Modifier modifierWeight$default5 = RowScope.weight$default(rowScopeInstance3, companion7, 1.0f, false, 2, null);
            int i111 = i6;
            float f116 = i111;
            Modifier modifierM672paddingqDBjuR0$default5 = PaddingKt.m672paddingqDBjuR0$default(modifierWeight$default5, 0.0f, Dp.m6403constructorimpl(f116), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(arrangement9.getTop(), companion8.getStart(), composer, 0);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap110 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier110 = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default5);
            constructor3 = companion9.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
            eVarG2 = p035i0.a.g(companion9, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy12, composerM3407constructorimpl3, currentCompositionLocalMap110);
            if (composerM3407constructorimpl3.getInserting()) {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            } else {
                p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier110, companion9.getSetModifier());
            companion = Color.Companion;
            if (z4) {
                jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
                f7 = 0.0f;
                f8 = 0.0f;
                f9 = 0.8f;
            } else {
                if (z5) {
                    jM3964getWhite0d7_KjU2 = companion.m3964getWhite0d7_KjU();
                } else {
                    jM3964getWhite0d7_KjU = companion.m3964getWhite0d7_KjU();
                    f7 = 0.0f;
                    f8 = 0.0f;
                    f9 = 0.25f;
                }
                Composer composer13 = composer;
                TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer13, 199680, 0, 131026);
                if (z4) {
                    str4 = "Completed";
                } else if (z5) {
                    str4 = "In progress";
                } else {
                    str4 = "Pending";
                }
                String str12 = str4;
                if (z5) {
                    jM3926copywmQWz5c$default3 = p107y3.a.d();
                } else {
                    jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                TextKt.m2432Text4IGK_g(str12, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(i7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer13, 3072, 0, 131058);
                composer2 = composer13;
                composer2.startReplaceGroup(-810334000);
                if (o.b(str5, "Shipped")) {
                    i10 = i7;
                    composer3 = composer2;
                    f10 = f5;
                } else {
                    i10 = i7;
                    composer3 = composer2;
                    f10 = f5;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.endNode();
                it2 = it;
                i5 = 6;
                i11 = i12;
                i7 = i10;
                iIndexOf = i110;
                f5 = f10;
                i8 = 14;
                composer = composer3;
                i6 = i111;
                f6 = f115;
                f14 = 0.0f;
            }
            jM3964getWhite0d7_KjU2 = Color.m3926copywmQWz5c$default(jM3964getWhite0d7_KjU, f9, 0.0f, f7, f8, 14, null);
            Composer composer14 = composer;
            TextKt.m2432Text4IGK_g(str5, (Modifier) null, jM3964getWhite0d7_KjU2, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer14, 199680, 0, 131026);
            if (z4) {
                str4 = "Completed";
            } else if (z5) {
                str4 = "In progress";
            } else {
                str4 = "Pending";
            }
            String str13 = str4;
            if (z5) {
                jM3926copywmQWz5c$default3 = p107y3.a.d();
            } else {
                jM3926copywmQWz5c$default3 = Color.m3926copywmQWz5c$default(Color.Companion.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            TextKt.m2432Text4IGK_g(str13, (Modifier) null, jM3926copywmQWz5c$default3, TextUnitKt.getSp(i7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer14, 3072, 0, 131058);
            composer2 = composer14;
            composer2.startReplaceGroup(-810334000);
            if (o.b(str5, "Shipped")) {
                i10 = i7;
                composer3 = composer2;
                f10 = f5;
            } else {
                i10 = i7;
                composer3 = composer2;
                f10 = f5;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            composer3.endNode();
            it2 = it;
            i5 = 6;
            i11 = i12;
            i7 = i10;
            iIndexOf = i110;
            f5 = f10;
            i8 = 14;
            composer = composer3;
            i6 = i111;
            f6 = f115;
            f14 = 0.0f;
        }
        int i20 = i6;
        int i21 = i5;
        Composer composer15 = composer;
        composer15.endReplaceGroup();
        composer15.endNode();
        Modifier.Companion companion20 = Modifier.Companion;
        b.m(f6, companion20, composer15, i21);
        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion20, 0.0f, 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer15, 0);
        int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer15, 0);
        CompositionLocalMap currentCompositionLocalMap20 = composer15.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier20 = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxWidth$default4);
        ComposeUiNode.Companion companion21 = ComposeUiNode.Companion;
        a constructor14 = companion21.getConstructor();
        if (composer15.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer15.startReusableNode();
        if (composer15.getInserting()) {
            composer15.createNode(constructor14);
        } else {
            composer15.useNode();
        }
        Composer composerM3407constructorimpl14 = Updater.m3407constructorimpl(composer15);
        e eVarG15 = p035i0.a.g(companion21, composerM3407constructorimpl14, measurePolicyColumnMeasurePolicy13, composerM3407constructorimpl14, currentCompositionLocalMap20);
        if (composerM3407constructorimpl14.getInserting() || !o.b(composerM3407constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
            p035i0.a.t(currentCompositeKeyHash14, composerM3407constructorimpl14, currentCompositeKeyHash14, eVarG15);
        }
        Updater.m3414setimpl(composerM3407constructorimpl14, modifierMaterializeModifier20, companion21.getSetModifier());
        ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
        Color.Companion companion22 = Color.Companion;
        TextKt.m2432Text4IGK_g("DELIVERING TO", (Modifier) null, Color.m3926copywmQWz5c$default(companion22.m3964getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(i20), (FontStyle) null, FontWeight.Companion.getBlack(), (FontFamily) null, TextUnitKt.getSp(1), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer15, 12782982, 0, 130898);
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion20, Dp.m6403constructorimpl(2)), composer15, i21);
        String address = nVar.getAddress();
        if (address == null) {
            address = "Address information unavailable";
        }
        TextKt.m2432Text4IGK_g(address, (Modifier) null, Color.m3926copywmQWz5c$default(companion22.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(i9), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (c) null, (TextStyle) null, composer15, 3456, 6, 130034);
        if (androidx.compose.foundation.text.modifiers.a.w(composer15)) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
