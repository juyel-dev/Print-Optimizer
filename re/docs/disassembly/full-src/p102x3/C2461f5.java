package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2461f5 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2429d5 f14990o;

    public C2461f5(C2429d5 c2429d5) {
        this.f14990o = c2429d5;
    }

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
                ComposerKt.traceEventStart(2127599435, iIntValue, -1, "com.notescrafter.ui.screens.FeatureCard.<anonymous> (FeaturesScreen.kt:87)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f5 = 16;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m668padding3ABfNKs(companion, Dp.m6403constructorimpl(f5)), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            C2429d5 c2429d5 = this.f14990o;
            IconKt.m1877Iconww6aTOc(c2429d5.f14910c, (String) null, SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(32)), p107y3.a.f15978a, composer, 3504, 0);
            b.m(f5, companion, composer, 6);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            TextStyle titleMedium = materialTheme.getTypography(composer, i5).getTitleMedium();
            FontWeight bold = FontWeight.Companion.getBold();
            long j5 = p107y3.a.f15990o;
            TextAlign.Companion companion3 = TextAlign.Companion;
            TextKt.m2432Text4IGK_g(c2429d5.f14908a, (Modifier) null, j5, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion3.m6292getCentere0LSkKk()), 0L, 0, false, 0, 0, (c) null, titleMedium, composer, 196992, 0, 64986);
            b.m(8, companion, composer, 6);
            TextKt.m2432Text4IGK_g(c2429d5.f14909b, (Modifier) null, p107y3.a.p, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion3.m6292getCentere0LSkKk()), 0L, 0, false, 3, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 384, 3072, 56826);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
