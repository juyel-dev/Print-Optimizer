package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Sc implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ State f14421A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ double f14422B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ State f14423C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f14424D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f14425E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ State f14426F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ MutableState f14427G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f14428o;
    public final /* synthetic */ State p;
    public final /* synthetic */ PrintOrderViewModel q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f14429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f14430s;
    public final /* synthetic */ State t;
    public final /* synthetic */ double u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ State f14431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ State f14432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ State f14433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ double f14434y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ double f14435z;

    public Sc(a aVar, State state, PrintOrderViewModel printOrderViewModel, String str, String str2, State state2, double d4, State state3, State state4, State state5, double d5, double d6, State state6, double d7, State state7, MutableState mutableState, MutableState mutableState2, State state8, MutableState mutableState3) {
        this.f14428o = aVar;
        this.p = state;
        this.q = printOrderViewModel;
        this.f14429r = str;
        this.f14430s = str2;
        this.t = state2;
        this.u = d4;
        this.f14431v = state3;
        this.f14432w = state4;
        this.f14433x = state5;
        this.f14434y = d5;
        this.f14435z = d6;
        this.f14421A = state6;
        this.f14422B = d7;
        this.f14423C = state7;
        this.f14424D = mutableState;
        this.f14425E = mutableState2;
        this.f14426F = state8;
        this.f14427G = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(paddingValues, "paddingValues");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer2.changed(paddingValues) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1203225989, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderCheckoutScreen.<anonymous>.<anonymous> (PrintOrderScreens.kt:3606)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer2);
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f5 = 20;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues), Dp.m6403constructorimpl(f5), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            composer2.startReplaceGroup(1252386225);
            final a aVar = this.f14428o;
            boolean zChanged = composer2.changed(aVar);
            final State state = this.p;
            boolean zChanged2 = zChanged | composer2.changed(state);
            final PrintOrderViewModel printOrderViewModel = this.q;
            boolean zChangedInstance = zChanged2 | composer2.changedInstance(printOrderViewModel);
            final String str = this.f14429r;
            boolean zChanged3 = zChangedInstance | composer2.changed(str);
            final String str2 = this.f14430s;
            boolean zChanged4 = zChanged3 | composer2.changed(str2);
            final State state2 = this.t;
            boolean zChanged5 = zChanged4 | composer2.changed(state2);
            final double d4 = this.u;
            boolean zChanged6 = zChanged5 | composer2.changed(d4);
            final State state3 = this.f14431v;
            boolean zChanged7 = zChanged6 | composer2.changed(state3);
            final State state4 = this.f14432w;
            boolean zChanged8 = zChanged7 | composer2.changed(state4);
            final State state5 = this.f14433x;
            boolean zChanged9 = zChanged8 | composer2.changed(state5);
            final double d5 = this.f14434y;
            boolean zChanged10 = zChanged9 | composer2.changed(d5);
            final double d6 = this.f14435z;
            boolean zChanged11 = zChanged10 | composer2.changed(d6);
            final State state6 = this.f14421A;
            boolean zChanged12 = zChanged11 | composer2.changed(state6);
            final double d7 = this.f14422B;
            boolean zChanged13 = zChanged12 | composer2.changed(d7);
            final State state7 = this.f14423C;
            boolean zChanged14 = zChanged13 | composer2.changed(state7);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged14 || objRememberedValue == Composer.Companion.getEmpty()) {
                final MutableState mutableState = this.f14424D;
                objRememberedValue = new c() { // from class: x3.Hc
                    @Override // O3.c
                    public final Object invoke(Object obj4) {
                        LazyListScope LazyColumn = (LazyListScope) obj4;
                        o.f(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1588767327, true, new Ic(aVar)), 3, null);
                        String str3 = str;
                        State state8 = state;
                        PrintOrderViewModel printOrderViewModel2 = printOrderViewModel;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1907025610, true, new Lc(state8, printOrderViewModel2, str3)), 3, null);
                        String str4 = str2;
                        if (str4.length() > 0) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1088328922, true, new Mc(str4, state2)), 3, null);
                        }
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(875564393, true, new Rc(printOrderViewModel2, d4, state3, state4, state5, d5, d6, d7, mutableState, state6, state7)), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, X2.u, 3, null);
                        return B3.o.f154a;
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM670paddingVpY3zN4$default, null, null, false, horizontalOrVerticalM548spacedBy0680j_4, null, null, false, (c) objRememberedValue, composer2, 24576, 238);
            composer2.startReplaceGroup(1253942995);
            if (((Boolean) this.f14425E.getValue()).booleanValue()) {
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Color.Companion companion4 = Color.Companion;
                Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(modifierFillMaxSize$default2, Color.m3926copywmQWz5c$default(companion4.m3953getBlack0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM207backgroundbw27NRU$default);
                a constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer2);
                e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
                a constructor3 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer2);
                e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                BoxKt.Box(BorderKt.m222borderziNgDLE(RotateKt.rotate(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(64)), ((Number) this.f14426F.getValue()).floatValue()), Dp.m6403constructorimpl(3), Brush.Companion.m3882sweepGradientUv8p0NA$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b), Color.m3917boximpl(companion4.m3962getTransparent0d7_KjU())), 0L, 2, (Object) null), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
                b.m(24, companion, composer2, 6);
                composer = composer2;
                TextKt.m2432Text4IGK_g(((Number) this.f14427G.getValue()).intValue() == 1 ? "Contacting Razorpay Secure Gateway..." : "Confirming Order Payment Signature...", (Modifier) null, companion4.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer, 196992, 0, 65498);
                composer.endNode();
                composer.endNode();
            } else {
                composer = composer2;
            }
            if (p035i0.a.z(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
