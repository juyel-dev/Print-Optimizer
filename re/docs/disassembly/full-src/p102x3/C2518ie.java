package p102x3;

import C3.v;
import O3.c;
import O3.e;
import O3.f;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.AccountCircleKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
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
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.N;
import p092v3.h;
import p107y3.a;

/* JADX INFO: renamed from: x3.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2518ie implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f15199o;
    public final /* synthetic */ h p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ State f15200r;

    public C2518ie(InterfaceC0200y interfaceC0200y, h hVar, Context context, State state) {
        this.f15199o = interfaceC0200y;
        this.p = hVar;
        this.q = context;
        this.f15200r = state;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1740527202, iIntValue, -1, "com.notescrafter.ui.screens.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:259)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Brush.Companion companion2 = Brush.Companion;
            long j5 = a.f15978a;
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m3884verticalGradient8A3gB4$default(companion2, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(j5, 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(a.f15979b, 0.05f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            State state = this.f15200r;
            boolean z3 = !((Boolean) state.getValue()).booleanValue();
            composer2.startReplaceGroup(1674146656);
            InterfaceC0200y interfaceC0200y = this.f15199o;
            boolean zChangedInstance = composer2.changedInstance(interfaceC0200y);
            h hVar = this.p;
            boolean zChangedInstance2 = zChangedInstance | composer2.changedInstance(hVar);
            Context context = this.q;
            boolean zChangedInstance3 = zChangedInstance2 | composer2.changedInstance(context);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new N(interfaceC0200y, hVar, context, 1);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            float f5 = 24;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(ClickableKt.m242clickableXHw0xAI$default(modifierBackground$default, z3, null, null, (O3.a) objRememberedValue, 6, null), Dp.m6403constructorimpl(f5));
            Alignment.Companion companion3 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            O3.a constructor = companion4.getConstructor();
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM220borderxT4_qwU = BorderKt.m220borderxT4_qwU(BackgroundKt.m207backgroundbw27NRU$default(ClipKt.clip(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(60)), RoundedCornerShapeKt.getCircleShape()), Color.m3926copywmQWz5c$default(j5, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(j5, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM220borderxT4_qwU);
            O3.a constructor2 = companion4.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(AccountCircleKt.getAccountCircle(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(36)), j5, composer2, 3504, 0);
            composer2.endNode();
            float f6 = 16;
            b.m(f6, companion, composer2, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleLarge = materialTheme.getTypography(composer2, i5).getTitleLarge();
            long j6 = a.f15990o;
            FontWeight.Companion companion5 = FontWeight.Companion;
            FontWeight bold = companion5.getBold();
            TextAlign.Companion companion6 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g("Sync Your Account", (Modifier) null, j6, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, titleLarge, composer2, 196998, 0, 64986);
            b.m(6, companion, composer2, 6);
            TextStyle bodyMedium = materialTheme.getTypography(composer2, i5).getBodyMedium();
            TextKt.m2432Text4IGK_g("Sign in with Google to sync your Community Pass memberships, manage shipping addresses, and order prints.", (Modifier) null, a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion6.m6292getCentere0LSkKk()), TextUnitKt.getSp(20), 0, false, 0, 0, (c) null, bodyMedium, composer2, 390, 6, 63994);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(20)), composer2, 6);
            if (((Boolean) state.getValue()).booleanValue()) {
                composer2.startReplaceGroup(1716335749);
                ProgressIndicatorKt.m2100CircularProgressIndicatorLxG7B9w(SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(f5)), j5, Dp.m6403constructorimpl((float) 2.5d), 0L, 0, composer2, 438, 24);
                composer2.endReplaceGroup();
                composer = composer2;
            } else {
                composer2.startReplaceGroup(1716615710);
                Modifier modifierD = b.d(12, companion);
                Color.Companion companion7 = Color.Companion;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(BackgroundKt.m207backgroundbw27NRU$default(modifierD, companion7.m3964getWhite0d7_KjU(), null, 2, null), Dp.m6403constructorimpl(f6), Dp.m6403constructorimpl(10));
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
                O3.a constructor3 = companion4.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer = composer2;
                TextKt.m2432Text4IGK_g("Sign In with Google", (Modifier) null, companion7.m3953getBlack0d7_KjU(), 0L, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer2, i5).getBodyMedium(), composer, 196998, 0, 65498);
                composer.endNode();
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
