package p102x3;

import B3.h;
import C3.v;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.SecurityKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2742x implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2742x f15701o = new C2742x();

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(729571193, iIntValue, -1, "com.notescrafter.ui.screens.ComposableSingletons$CommunityPassScreenKt.lambda-2.<anonymous> (CommunityPassScreen.kt:500)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(24));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer);
            e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            float f5 = 10;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(20), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, centerVertically, composer, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default);
            a constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer);
            e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
            if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
            }
            Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m1877Iconww6aTOc(SecurityKt.getSecurity(Icons.Outlined.INSTANCE), (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(22)), p107y3.a.f15980c, composer, 3504, 0);
            TextKt.m2432Text4IGK_g("Important Information", (Modifier) null, Color.Companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200070, 0, 131026);
            composer.endNode();
            composer.startReplaceGroup(1729374038);
            int i5 = 0;
            for (Object obj4 : v.S(new h("No Refund Policy:", "All Community Pass purchases are final and non-refundable."), new h("Automatic Expiry:", "Your pass expires at the end of your chosen duration."), new h("Privacy First:", "All PDF processing happens in your browser — your documents never touch our servers."), new h("Lifetime Access:", "The Lifetime plan means you never worry about renewals or price increases again."))) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.X();
                    throw null;
                }
                h hVar = (h) obj4;
                String str = (String) hVar.f148o;
                String str2 = (String) hVar.p;
                composer.startReplaceGroup(1729374709);
                if (i5 > 0) {
                    b.m(12, Modifier.Companion, composer, 6);
                }
                composer.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 48);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                a constructor3 = companion5.getConstructor();
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
                e eVarG3 = p035i0.a.g(companion5, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                long j5 = p107y3.a.f15980c;
                FontWeight.Companion companion6 = FontWeight.Companion;
                TextKt.m2432Text4IGK_g("•", PaddingKt.m672paddingqDBjuR0$default(companion4, 0.0f, Dp.m6403constructorimpl(1), Dp.m6403constructorimpl(f5), 0.0f, 9, null), j5, TextUnitKt.getSp(14), (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 200118, 0, 131024);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iPushStyle = builder.pushStyle(new SpanStyle(Color.Companion.m3964getWhite0d7_KjU(), TextUnitKt.getSp(13), companion6.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (AbstractC2168g) null));
                try {
                    builder.append(str);
                    builder.pop(iPushStyle);
                    int iPushStyle2 = builder.pushStyle(new SpanStyle(p107y3.a.p, TextUnitKt.getSp(13), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (AbstractC2168g) null));
                    try {
                        builder.append(" " + str2);
                        builder.pop(iPushStyle2);
                        TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, 0L, null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, null, composer, 0, 6, 261118);
                        composer.endNode();
                        i5 = i6;
                    } catch (Throwable th) {
                        builder.pop(iPushStyle2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    builder.pop(iPushStyle);
                    throw th2;
                }
            }
            if (p035i0.a.z(composer)) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
