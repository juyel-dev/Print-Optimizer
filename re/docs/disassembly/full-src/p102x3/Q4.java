package p102x3;

import O3.a;
import O3.c;
import O3.f;
import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CloudUploadKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
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
import com.notescrafter.service.PDFProcessor;
import java.util.List;
import kotlin.jvm.internal.o;
import o4.d;
import p087u3.b;
import p087u3.e;
import p097w3.j;
import p097w3.q;
import p097w3.t;

/* JADX INFO: loaded from: classes2.dex */
public final class Q4 implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ a f14307A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Context f14308B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ a f14309C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScrollState f14310o;
    public final /* synthetic */ e p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f14312s;
    public final /* synthetic */ b t;
    public final /* synthetic */ PDFProcessor u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f14313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f14314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f14316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ List f14317z;

    public Q4(ScrollState scrollState, e eVar, String str, int i5, List list, b bVar, PDFProcessor pDFProcessor, c cVar, MutableIntState mutableIntState, MutableState mutableState, c cVar2, List list2, a aVar, Context context, a aVar2) {
        this.f14310o = scrollState;
        this.p = eVar;
        this.q = str;
        this.f14311r = i5;
        this.f14312s = list;
        this.t = bVar;
        this.u = pDFProcessor;
        this.f14313v = cVar;
        this.f14314w = mutableIntState;
        this.f14315x = mutableState;
        this.f14316y = cVar2;
        this.f14317z = list2;
        this.f14307A = aVar;
        this.f14308B = context;
        this.f14309C = aVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar;
        float f5;
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1227093403, iIntValue, -1, "com.notescrafter.ui.screens.EnhanceScreen.<anonymous>.<anonymous> (EnhanceScreen.kt:94)");
        }
        Modifier.Companion companion = Modifier.Companion;
        float f6 = 24;
        Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(WindowInsetsPadding_androidKt.imePadding(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), this.f14310o, false, null, false, 14, null)), Dp.m6403constructorimpl(f6), 0.0f, 2, null);
        Alignment.Companion companion2 = Alignment.Companion;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
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
        O3.e eVarG = p035i0.a.g(companion3, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
        if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
        }
        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f7 = 32;
        p076s.b.m(f7, companion, composer, 6);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i5 = MaterialTheme.$stable;
        TextStyle headlineMedium = materialTheme.getTypography(composer, i5).getHeadlineMedium();
        FontWeight.Companion companion4 = FontWeight.Companion;
        FontWeight bold = companion4.getBold();
        long j5 = p107y3.a.f15990o;
        TextKt.m2432Text4IGK_g("Enhance Document", (Modifier) null, j5, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineMedium, composer, 196998, 0, 65498);
        float f8 = 8;
        p076s.b.m(f8, companion, composer, 6);
        TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
        long j6 = p107y3.a.p;
        TextKt.m2432Text4IGK_g("Apply filters to improve quality and customize layout.", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(TextAlign.Companion.m6292getCentere0LSkKk()), 0L, 0, false, 2, 0, (c) null, bodyMedium, composer, 390, 3072, 56826);
        t.a(6, 4, d.s(1, 2, 3), null, composer, 438);
        p076s.b.m(f6, companion, composer, 6);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        long j7 = p107y3.a.t;
        String str = this.q;
        int i6 = this.f14311r;
        List list = this.f14312s;
        j.a(modifierFillMaxWidth$default, 0L, j7, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-713441024, true, new D4(str, i6, list), composer, 54), composer, 196998, 26);
        p076s.b.m(f6, companion, composer, 6);
        Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(f8), 7, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 48);
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
        O3.e eVarG2 = p035i0.a.g(companion3, composerM3407constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl2, currentCompositionLocalMap2);
        if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
        }
        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        TextKt.m2432Text4IGK_g("Enhancement", (Modifier) null, j5, 0L, (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getTitleMedium(), composer, 196998, 0, 65498);
        TextKt.m2432Text4IGK_g("Apply AI-inspired enhancements", (Modifier) null, j6, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 390, 0, 65530);
        composer.endNode();
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        b bVar = this.t;
        PDFProcessor pDFProcessor = this.u;
        c cVar2 = this.f14313v;
        MutableIntState mutableIntState = this.f14314w;
        j.a(modifierFillMaxWidth$default2, 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-681009609, true, new G4(list, bVar, pDFProcessor, cVar2, mutableIntState), composer, 54), composer, 196614, 30);
        float f9 = 16;
        p076s.b.m(f9, companion, composer, 6);
        j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1504820424, true, new H4(cVar2, this.f14315x, bVar), composer, 54), composer, 196614, 30);
        p076s.b.m(f9, companion, composer, 6);
        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        e eVar = this.p;
        c cVar3 = this.f14316y;
        j.a(modifierFillMaxWidth$default3, 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1966336057, true, new I4(eVar, cVar3), composer, 54), composer, 196614, 30);
        p076s.b.m(f9, companion, composer, 6);
        j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1142525242, true, new J4(eVar, cVar3), composer, 54), composer, 196614, 30);
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f9)), composer, 6);
        boolean z3 = eVar.getDocumentSize() == p087u3.a.ORIGINAL;
        float f10 = z3 ? 0.5f : 1.0f;
        boolean z4 = z3;
        j.a(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f10), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(318714427, true, new L4(eVar, z3, cVar3), composer, 54), composer, 196608, 30);
        p076s.b.m(f9, companion, composer, 6);
        j.a(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f10), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-505096388, true, new N4(eVar, z4, cVar3), composer, 54), composer, 196608, 30);
        composer.startReplaceGroup(-821856712);
        if (eVar.getNupColumns() * eVar.getNupRows() > 1) {
            p076s.b.m(f9, companion, composer, 6);
            cVar = cVar3;
            f5 = f10;
            j.a(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f10), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1795901349, true, new P4(eVar, z4, cVar3), composer, 54), composer, 196608, 30);
        } else {
            cVar = cVar3;
            f5 = f10;
        }
        composer.endReplaceGroup();
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(f9)), composer, 6);
        j.a(AlphaKt.alpha(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f5), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1328907203, true, new A4(this.f14317z, bVar, pDFProcessor, eVar, mutableIntState), composer, 54), composer, 196608, 30);
        p076s.b.m(f9, companion, composer, 6);
        j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2142249278, true, new C4(eVar, cVar), composer, 54), composer, 196614, 30);
        p076s.b.m(f7, companion, composer, 6);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m548spacedBy0680j_4(Dp.m6403constructorimpl(12)), companion2.getTop(), composer, 6);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
        a constructor3 = companion3.getConstructor();
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
        O3.e eVarG3 = p035i0.a.g(companion3, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy, composerM3407constructorimpl3, currentCompositionLocalMap3);
        if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
        }
        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ButtonKt.OutlinedButton(this.f14307A, SizeKt.m699height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion, 0.35f, false, 2, null), Dp.m6403constructorimpl(56)), false, RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f9)), ButtonDefaults.INSTANCE.m1530outlinedButtonColorsro_MJ88(Color.Companion.m3962getTransparent0d7_KjU(), j6, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 54, 12), null, BorderStrokeKt.m236BorderStrokecXLIe8U(Dp.m6403constructorimpl(1), p107y3.a.f15991r), null, null, V.f14505b, composer, 806879232, 420);
        ImageVector cloudUpload = CloudUploadKt.getCloudUpload(Icons.Outlined.INSTANCE);
        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 0.65f, false, 2, null);
        composer.startReplaceGroup(-514721038);
        Context context = this.f14308B;
        boolean zChangedInstance = composer.changedInstance(context);
        a aVar = this.f14309C;
        boolean zChanged = zChangedInstance | composer.changed(aVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new C2779z4(context, aVar, 0);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        q.a("Process File", (a) objRememberedValue, modifierWeight$default, cloudUpload, false, false, composer, 6, 48);
        composer.endNode();
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion, Dp.m6403constructorimpl(100)), composer, 6);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
