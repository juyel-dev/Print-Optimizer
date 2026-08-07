package p102x3;

import C3.v;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowForwardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;
import p076s.b;
import p087u3.m;
import p097w3.j;

/* JADX INFO: renamed from: x3.pd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2629pd implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15421o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ double q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f15422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15423s;
    public final /* synthetic */ State t;
    public final /* synthetic */ boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f15424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a f15425w;

    public C2629pd(double d4, int i5, int i6, a aVar, State state, String str, boolean z3, boolean z4, boolean z5) {
        this.f15421o = i5;
        this.p = z3;
        this.q = d4;
        this.f15422r = str;
        this.f15423s = i6;
        this.t = state;
        this.u = z4;
        this.f15424v = z5;
        this.f15425w = aVar;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer;
        float f5;
        int i5;
        Composer composer2;
        Composer composer3 = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1998732776, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous>.<anonymous>.<anonymous> (PrintOrderScreens.kt:168)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f6 = 16;
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(20), Dp.m6403constructorimpl(f6));
            float f7 = 12;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m548spacedBy0680j_4(Dp.m6403constructorimpl(f7)), Alignment.Companion.getStart(), composer3, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a constructor = companion2.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor);
            } else {
                composer3.useNode();
            }
            Composer composerM3407constructorimpl = Updater.m3407constructorimpl(composer3);
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = this.f15421o;
            float fQ = Q3.a.q(i6 / 100.0f, 0.0f, 1.0f);
            boolean z3 = this.p;
            long jColor = z3 ? ColorKt.Color(4294688548L) : ColorKt.Color(4281652121L);
            j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(jColor, 0.06f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(jColor, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1926926291, true, new C2613od(jColor, z3, i6, fQ), composer3, 54), composer3, 196614, 24);
            double pages = 0.0d;
            for (m mVar : (List) this.t.getValue()) {
                pages += ((((double) mVar.getPages()) * (mVar.getColor() == p087u3.j.COLOR ? 1.99d : 0.89d)) + 65.0d) * ((double) mVar.getCopies());
            }
            double d4 = this.q;
            double dMax = Math.max(0.0d, d4 - pages);
            composer3.startReplaceGroup(-826374015);
            if (o.b(this.f15422r, "lifetime") || dMax <= 0.0d) {
                composer = composer3;
            } else {
                String strY = Gd.y(dMax);
                Modifier.Companion companion3 = Modifier.Companion;
                b.m(f7, companion3, composer3, 6);
                float f8 = 8;
                Modifier modifierM669paddingVpY3zN5 = PaddingKt.m669paddingVpY3zN4(b.e(f7, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), f7), Color.m3926copywmQWz5c$default(ColorKt.Color(4289222135L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(ColorKt.Color(4289222135L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f7), Dp.m6403constructorimpl(f8));
                MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f8, Arrangement.INSTANCE, Alignment.Companion.getCenterVertically(), composer3, 54);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM669paddingVpY3zN5);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                a constructor2 = companion4.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM3407constructorimpl2 = Updater.m3407constructorimpl(composer3);
                e eVarG2 = p035i0.a.g(companion4, composerM3407constructorimpl2, measurePolicyI, composerM3407constructorimpl2, currentCompositionLocalMap2);
                if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
                }
                Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer = composer3;
                TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3078, 0, 131062);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append("Save ");
                long jM3964getWhite0d7_KjU = Color.Companion.m3964getWhite0d7_KjU();
                FontWeight.Companion companion5 = FontWeight.Companion;
                int iPushStyle = builder.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU, 0L, companion5.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                try {
                    builder.append(strY);
                    builder.pop(iPushStyle);
                    builder.append(" on this order with Diamond Pass!");
                    TextKt.m2433TextIbK3jfQ(builder.toAnnotatedString(), RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), ColorKt.Color(4290807036L), TextUnitKt.getSp(11), null, companion5.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer, 200064, 0, 262096);
                    composer.endNode();
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
            composer.endReplaceGroup();
            int i7 = this.f15423s;
            if (i7 >= 5) {
                Composer composer4 = composer;
                composer4.startReplaceGroup(154290033);
                Modifier.Companion companion6 = Modifier.Companion;
                Modifier modifierM669paddingVpY3zN6 = PaddingKt.m669paddingVpY3zN4(BorderKt.border(BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), f6), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6))), Dp.m6403constructorimpl(14), Dp.m6403constructorimpl(10));
                Alignment.Companion companion7 = Alignment.Companion;
                Alignment.Vertical centerVertically = companion7.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyI2 = androidx.compose.foundation.text.modifiers.a.i(8, arrangement, centerVertically, composer4, 54);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM669paddingVpY3zN6);
                ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                a constructor3 = companion8.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor3);
                } else {
                    composer4.useNode();
                }
                Composer composerM3407constructorimpl3 = Updater.m3407constructorimpl(composer4);
                e eVarG3 = p035i0.a.g(companion8, composerM3407constructorimpl3, measurePolicyI2, composerM3407constructorimpl3, currentCompositionLocalMap3);
                if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
                }
                Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion8.getSetModifier());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                f5 = f6;
                TextKt.m2432Text4IGK_g("🎉", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 3078, 0, 131062);
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance2, companion6, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion7.getStart(), composer4, 0);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierWeight$default);
                a constructor4 = companion8.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor4);
                } else {
                    composer4.useNode();
                }
                Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer4);
                e eVarG4 = p035i0.a.g(companion8, composerM3407constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl4, currentCompositionLocalMap4);
                if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
                }
                Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion8.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                long jColor2 = ColorKt.Color(4279286145L);
                FontWeight.Companion companion9 = FontWeight.Companion;
                TextKt.m2432Text4IGK_g("FREE SHIPPING UNLOCKED!", (Modifier) null, jColor2, TextUnitKt.getSp(10), (FontStyle) null, companion9.getBlack(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 12782982, 0, 130898);
                TextKt.m2432Text4IGK_g("Your order ships free — 5+ notebooks in cart", (Modifier) null, p107y3.a.p, TextUnitKt.getSp(10), (FontStyle) null, companion9.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer4, 200070, 0, 131026);
                composer4.endNode();
                composer4.endNode();
                composer4.endReplaceGroup();
                composer2 = composer4;
                i5 = 6;
            } else {
                Composer composer5 = composer;
                composer5.startReplaceGroup(156159798);
                Modifier.Companion companion10 = Modifier.Companion;
                Modifier modifierG = b.g(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), f6);
                Color.Companion companion11 = Color.Companion;
                Modifier modifierM669paddingVpY3zN7 = PaddingKt.m669paddingVpY3zN4(BorderKt.border(BackgroundKt.m207backgroundbw27NRU$default(modifierG, Color.m3926copywmQWz5c$default(companion11.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(companion11.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f6))), Dp.m6403constructorimpl(14), Dp.m6403constructorimpl(10));
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement2.getTop();
                Alignment.Companion companion12 = Alignment.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top, companion12.getStart(), composer5, 0);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierM669paddingVpY3zN7);
                ComposeUiNode.Companion companion13 = ComposeUiNode.Companion;
                a constructor5 = companion13.getConstructor();
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
                e eVarG5 = p035i0.a.g(companion13, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl5, currentCompositionLocalMap5);
                if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
                }
                Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion13.getSetModifier());
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion12.getCenterVertically(), composer5, 54);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default);
                a constructor6 = companion13.getConstructor();
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
                e eVarG6 = p035i0.a.g(companion13, composerM3407constructorimpl6, measurePolicyRowMeasurePolicy, composerM3407constructorimpl6, currentCompositionLocalMap6);
                if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
                }
                Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion13.getSetModifier());
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                int iMax = Math.max(0, 5 - i7);
                String str = iMax == 1 ? "notebook" : "notebooks";
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                builder2.append("🚚  Add ");
                long jM3964getWhite0d7_KjU2 = companion11.m3964getWhite0d7_KjU();
                FontWeight.Companion companion14 = FontWeight.Companion;
                int iPushStyle2 = builder2.pushStyle(new SpanStyle(jM3964getWhite0d7_KjU2, 0L, companion14.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                try {
                    builder2.append(String.valueOf(iMax));
                    builder2.pop(iPushStyle2);
                    builder2.append(" more " + str + " for ");
                    int iPushStyle3 = builder2.pushStyle(new SpanStyle(ColorKt.Color(4279286145L), 0L, companion14.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (AbstractC2168g) null));
                    try {
                        builder2.append("FREE shipping");
                        builder2.pop(iPushStyle3);
                        AnnotatedString annotatedString = builder2.toAnnotatedString();
                        long j5 = p107y3.a.p;
                        f5 = f6;
                        TextKt.m2433TextIbK3jfQ(annotatedString, null, j5, TextUnitKt.getSp(10), null, companion14.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer5, 200064, 0, 262098);
                        TextKt.m2432Text4IGK_g(androidx.compose.foundation.text.modifiers.a.k(i7, "/5"), (Modifier) null, j5, TextUnitKt.getSp(10), (FontStyle) null, companion14.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer5, 200064, 0, 131026);
                        composer5.endNode();
                        i5 = 6;
                        composer2 = composer5;
                        b.m(6, companion10, composer2, 6);
                        float fQ2 = Q3.a.q(i7 / 5.0f, 0.0f, 1.0f);
                        float f9 = 2;
                        Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), Dp.m6403constructorimpl(4)), f9), Color.m3926copywmQWz5c$default(companion11.m3964getWhite0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getTopStart(), false);
                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierM207backgroundbw27NRU$default);
                        a constructor7 = companion13.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor7);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer2);
                        e eVarG7 = p035i0.a.g(companion13, composerM3407constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl7, currentCompositionLocalMap7);
                        if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
                        }
                        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion13.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BoxKt.Box(BackgroundKt.background$default(b.g(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion10, 0.0f, 1, null), fQ2), f9), Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(ColorKt.Color(4279286145L)), Color.m3917boximpl(ColorKt.Color(4281652121L))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                        composer2.endNode();
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } catch (Throwable th2) {
                        builder2.pop(iPushStyle3);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    builder2.pop(iPushStyle2);
                    throw th3;
                }
            }
            Modifier.Companion companion15 = Modifier.Companion;
            float f10 = 8;
            b.m(f10, companion15, composer2, i5);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion15, 0.0f, 1, null);
            Arrangement arrangement3 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM548spacedBy0680j_4 = arrangement3.m548spacedBy0680j_4(Dp.m6403constructorimpl(f5));
            Alignment.Companion companion16 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM548spacedBy0680j_4, companion16.getCenterVertically(), composer2, 54);
            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion17 = ComposeUiNode.Companion;
            a constructor8 = companion17.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor8);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl8 = Updater.m3407constructorimpl(composer2);
            e eVarG8 = p035i0.a.g(companion17, composerM3407constructorimpl8, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl8, currentCompositionLocalMap8);
            if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
            }
            Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion17.getSetModifier());
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance4, companion15, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement3.getTop(), companion16.getStart(), composer2, 0);
            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default2);
            a constructor9 = companion17.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor9);
            } else {
                composer2.useNode();
            }
            Composer composerM3407constructorimpl9 = Updater.m3407constructorimpl(composer2);
            e eVarG9 = p035i0.a.g(companion17, composerM3407constructorimpl9, measurePolicyColumnMeasurePolicy4, composerM3407constructorimpl9, currentCompositionLocalMap9);
            if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
            }
            Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion17.getSetModifier());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i8 = MaterialTheme.$stable;
            TextStyle labelSmall = materialTheme.getTypography(composer2, i8).getLabelSmall();
            long j6 = p107y3.a.p;
            FontWeight.Companion companion18 = FontWeight.Companion;
            Composer composer6 = composer2;
            TextKt.m2432Text4IGK_g("SUBTOTAL", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : j6, (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion18.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer6, 6, 0, 65534);
            String strY2 = Gd.y(d4);
            TextStyle headlineMedium = materialTheme.getTypography(composer6, i8).getHeadlineMedium();
            Color.Companion companion19 = Color.Companion;
            TextKt.m2432Text4IGK_g(strY2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, headlineMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineMedium.spanStyle.m5841getColor0d7_KjU() : companion19.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineMedium.spanStyle.getFontWeight() : companion18.getExtraBold(), (16645977 & 8) != 0 ? headlineMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineMedium.platformStyle : null, (16645977 & 1048576) != 0 ? headlineMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineMedium.paragraphStyle.getTextMotion() : null), composer6, 0, 3120, 55294);
            composer6.endNode();
            boolean z4 = this.u || this.f15424v || z3;
            float f11 = f5;
            Modifier modifierM242clickableXHw0xAI$default = ClickableKt.m242clickableXHw0xAI$default(BackgroundKt.background$default(b.g(RowScope.weight$default(rowScopeInstance4, SizeKt.m699height3ABfNKs(companion15, Dp.m6403constructorimpl(50)), 1.2f, false, 2, null), f11), z4 ? Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.f15978a, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3917boximpl(Color.m3926copywmQWz5c$default(p107y3.a.f15979b, 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null) : Brush.Companion.m3876horizontalGradient8A3gB4$default(Brush.Companion, v.S(Color.m3917boximpl(p107y3.a.f15978a), Color.m3917boximpl(p107y3.a.f15979b)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), !z4, null, null, this.f15425w, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion16.getCenter(), false);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composer6.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer6, modifierM242clickableXHw0xAI$default);
            a constructor10 = companion17.getConstructor();
            if (composer6.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor10);
            } else {
                composer6.useNode();
            }
            Composer composerM3407constructorimpl10 = Updater.m3407constructorimpl(composer6);
            e eVarG10 = p035i0.a.g(companion17, composerM3407constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl10, currentCompositionLocalMap10);
            if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
            }
            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion17.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion16.getCenterVertically(), composer6, 48);
            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composer6.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer6, companion15);
            a constructor11 = companion17.getConstructor();
            if (composer6.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor11);
            } else {
                composer6.useNode();
            }
            Composer composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer6);
            e eVarG11 = p035i0.a.g(companion17, composerM3407constructorimpl11, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl11, currentCompositionLocalMap11);
            if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
            }
            Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier11, companion17.getSetModifier());
            TextKt.m2432Text4IGK_g("Continue", (Modifier) null, z4 ? Color.m3926copywmQWz5c$default(companion19.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null) : companion19.m3964getWhite0d7_KjU(), 0L, (FontStyle) null, companion18.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer6, 196614, 0, 131034);
            androidx.compose.foundation.text.modifiers.a.q(f10, companion15, composer6, 6);
            IconKt.m1877Iconww6aTOc(ArrowForwardKt.getArrowForward(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m713size3ABfNKs(companion15, Dp.m6403constructorimpl(f11)), z4 ? Color.m3926copywmQWz5c$default(companion19.m3964getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null) : companion19.m3964getWhite0d7_KjU(), composer6, 432, 0);
            composer6.endNode();
            composer6.endNode();
            composer6.endNode();
            composer6.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
