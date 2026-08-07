package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.utils.ExamItem;
import java.util.Locale;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Le implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f14182o;
    public final /* synthetic */ State p;
    public final /* synthetic */ ExamItem q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f14183r;

    public Le(boolean z3, State state, ExamItem examItem, long j5) {
        this.f14182o = z3;
        this.p = state;
        this.q = examItem;
        this.f14183r = j5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer;
        Composer composer2 = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(940559790, iIntValue, -1, "com.notescrafter.ui.screens.ExamCardItem.<anonymous> (ToDoScreen.kt:529)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean z3 = this.f14182o;
            Modifier modifierM701heightInVpY3zN4$default = SizeKt.m701heightInVpY3zN4$default(modifierFillMaxWidth$default, Dp.m6403constructorimpl(z3 ? 90 : 60), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM701heightInVpY3zN4$default);
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
            if (z3) {
                composer2.startReplaceGroup(-902967529);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Brush.Companion companion4 = Brush.Companion;
                long jColor = ColorKt.Color(4289222135L);
                State state = this.p;
                Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.m3878linearGradientmHitzGk$default(companion4, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(jColor, ((Number) state.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(ColorKt.Color(4284704497L), ((Number) state.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null))), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6403constructorimpl(16));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
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
                TextKt.m2432Text4IGK_g("All the best completely! Stay calm, stay confident. You’ve prepared well - now go shine! ❤️", (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), TextUnitKt.getSp(20), 0, false, 0, 0, (c) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 196998, 6, 63962);
                composer2.endNode();
                composer2.endReplaceGroup();
                composer = composer2;
            } else {
                composer2.startReplaceGroup(-901738038);
                float f5 = 16;
                float f6 = 8;
                Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(f5), Dp.m6403constructorimpl(f6));
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composer2, 48);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN4);
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
                e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                BoxKt.Box(BackgroundKt.background$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(4)), Dp.m6403constructorimpl(36)), 2), Brush.Companion.m3884verticalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4289222135L)), Color.m3917boximpl(ColorKt.Color(4284704497L))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                SpacerKt.Spacer(SizeKt.m718width3ABfNKs(companion, Dp.m6403constructorimpl(f5)), composer2, 6);
                String upperCase = this.q.getName().toUpperCase(Locale.ROOT);
                o.e(upperCase, "toUpperCase(...)");
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i5 = MaterialTheme.$stable;
                TextStyle titleMedium = materialTheme.getTypography(composer2, i5).getTitleMedium();
                long jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                FontWeight.Companion companion5 = FontWeight.Companion;
                FontWeight bold = companion5.getBold();
                long sp = TextUnitKt.getSp(1);
                TextOverflow.Companion companion6 = TextOverflow.Companion;
                TextKt.m2432Text4IGK_g(upperCase, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), jM3964getWhite0d7_KjU, 0L, (FontStyle) null, bold, (FontFamily) null, sp, (TextDecoration) null, (TextAlign) null, 0L, companion6.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, titleMedium, composer2, 12779904, 3120, 55128);
                float f7 = 12;
                androidx.compose.foundation.text.modifiers.a.q(f7, companion, composer2, 6);
                long j5 = this.f14183r;
                long jColor2 = j5 <= 3 ? ColorKt.Color(4294472049L) : ColorKt.Color(4289222135L);
                Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.e(f6, BackgroundKt.m207backgroundbw27NRU$default(b.d(f6, companion), j5 <= 3 ? Color.m3926copywmQWz5c$default(ColorKt.Color(4294472049L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m3926copywmQWz5c$default(ColorKt.Color(4289222135L), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(jColor2, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f7), Dp.m6403constructorimpl(6));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM669paddingVpY3zN5);
                a constructor4 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer2);
                e eVarG4 = p035i0.a.g(companion3, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                composer = composer2;
                TextKt.m2432Text4IGK_g(j5 + " " + (j5 == 1 ? "Day" : "Days") + " Left", (Modifier) null, jColor2, 0L, (FontStyle) null, companion5.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion6.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, materialTheme.getTypography(composer2, i5).getLabelMedium(), composer, 196608, 3120, 55258);
                composer.endNode();
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
