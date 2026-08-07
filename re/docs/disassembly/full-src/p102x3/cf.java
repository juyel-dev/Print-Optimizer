package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
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
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
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
import java.util.List;
import kotlin.jvm.internal.o;
import p015d.l;
import p076s.b;
import p097w3.q;

/* JADX INFO: loaded from: classes2.dex */
public final class cf implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f14897o;
    public final /* synthetic */ l p;
    public final /* synthetic */ boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f14898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f14899s;

    public cf(List list, l lVar, boolean z3, a aVar, a aVar2) {
        this.f14897o = list;
        this.p = lVar;
        this.q = z3;
        this.f14898r = aVar;
        this.f14899s = aVar2;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        int i5;
        MaterialTheme materialTheme;
        Composer composer;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1534415224, iIntValue, -1, "com.notescrafter.ui.screens.UploadScreen.<anonymous>.<anonymous> (UploadScreen.kt:111)");
            }
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment center = companion2.getCenter();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion3, Dp.m6403constructorimpl(40));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            a constructor = companion4.getConstructor();
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
            e eVarG = p035i0.a.g(companion4, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion3);
            a constructor2 = companion4.getConstructor();
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
            e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f5 = 4;
            BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.m699height3ABfNKs(SizeKt.m718width3ABfNKs(companion3, Dp.m6403constructorimpl(64)), Dp.m6403constructorimpl(f5)), RoundedCornerShapeKt.RoundedCornerShape(50)), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
            float f6 = 24;
            b.m(f6, companion3, composer2, 6);
            List list = this.f14897o;
            String str = list.isEmpty() ? "You can select multiple pdfs to process" : "Add more files";
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i6 = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme2.getTypography(composer2, i6).getTitleMedium();
            long j5 = p107y3.a.f15990o;
            FontWeight.Companion companion5 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g(str, (Modifier) null, j5, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, titleMedium, composer2, 196992, 0, 64986);
            b.m(8, companion3, composer2, 6);
            TextStyle bodySmall = materialTheme2.getTypography(composer2, i6).getBodySmall();
            long j6 = p107y3.a.p;
            TextKt.m2432Text4IGK_g("Tap button below to browse", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodySmall, composer2, 390, 3120, 55290);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f6)), composer2, 6);
            composer2.startReplaceGroup(587455943);
            l lVar = this.p;
            boolean zChangedInstance = composer2.changedInstance(lVar);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new P5(lVar, 22);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            q.a("Select PDF(s)", (a) objRememberedValue, PaddingKt.m670paddingVpY3zN4$default(companion3, Dp.m6403constructorimpl(f6), 0.0f, 2, null), null, false, false, composer2, 390, 56);
            composer2.startReplaceGroup(587463155);
            if (list.isEmpty()) {
                companion = companion3;
                i5 = i6;
                materialTheme = materialTheme2;
                composer = composer2;
            } else {
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion3, Dp.m6403constructorimpl(f6)), composer2, 6);
                materialTheme = materialTheme2;
                i5 = i6;
                TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.k(list.size(), " file(s) selected"), (Modifier) null, j5, 0L, (FontStyle) null, companion5.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme2.getTypography(composer2, i6).getTitleMedium(), composer2, 196992, 0, 65498);
                float f7 = 16;
                composer = composer2;
                b.m(f7, companion3, composer, 6);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(12));
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion2.getTop(), composer, 6);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                a constructor3 = companion4.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer);
                e eVarG3 = p035i0.a.g(companion4, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                companion = companion3;
                ButtonKt.OutlinedButton(this.f14898r, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion3, 0.25f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f7)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j6, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), PaddingKt.m663PaddingValuesYgX7TsA$default(Dp.m6403constructorimpl(f5), 0.0f, 2, null), null, AbstractC2762y3.f15747a, composer, 819462144, 292);
                q.a("Continue", this.f14899s, RowScope.weight$default(rowScopeInstance, companion, 0.75f, false, 2, null), null, false, false, composer, 6, 56);
                composer.endNode();
            }
            composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f6)), composer, 6);
            String str2 = this.q ? "Upload • Process • Download" : "Upload • Process • Watch Ad • Download";
            MaterialTheme materialTheme3 = materialTheme;
            int i7 = i5;
            TextStyle bodyMedium = materialTheme3.getTypography(composer, i7).getBodyMedium();
            Composer composer3 = composer;
            TextKt.m2432Text4IGK_g(str2, (Modifier) null, materialTheme3.getColorScheme(composer, i7).m1619getOnSurfaceVariant0d7_KjU(), 0L, (FontStyle) null, companion5.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (c) null, bodyMedium, composer3, 196608, 3456, 53210);
            if (androidx.compose.foundation.text.modifiers.a.w(composer3)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
