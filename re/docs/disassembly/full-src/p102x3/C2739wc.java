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
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.ColorKt;
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

/* JADX INFO: renamed from: x3.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2739wc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f15697o;

    public C2739wc(String str) {
        this.f15697o = str;
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
                ComposerKt.traceEventStart(-969715824, iIntValue, -1, "com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:1920)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(12));
            String str = this.f15697o;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
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
            long jColor = ColorKt.Color(4290807036L);
            long sp = TextUnitKt.getSp(8);
            FontWeight.Companion companion3 = FontWeight.Companion;
            TextKt.m2432Text4IGK_g("COMMUNITY PASS BENEFIT", (Modifier) null, jColor, sp, (FontStyle) null, companion3.getBold(), (FontFamily) null, TextUnitKt.getSp(0.8d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 12782982, 0, 130898);
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(4)), composer, 6);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("Save ");
            Color.Companion companion4 = Color.Companion;
            int iPushStyle = builder.pushStyle(new SpanStyle(companion4.m3964getWhite0d7_KjU(), 0L, companion3.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
            try {
                builder.append(str);
                builder.pop(iPushStyle);
                builder.append(" on this notebook with Diamond Pass!");
                TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), null, Color.m3926copywmQWz5c$default(companion4.m3964getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(11), null, null, null, 0L, null, null, TextUnitKt.getSp(15), 0, false, 0, 0, null, null, null, composer, 3456, 6, 261106);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        return B3.o.f154a;
    }
}
