package p102x3;

import O3.a;
import O3.c;
import O3.e;
import O3.f;
import Y3.d;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.notescrafter.PrintOrderViewModel;
import java.util.Map;
import kotlin.jvm.internal.o;
import p076s.b;
import p083t3.O;
import p083t3.Z;
import p087u3.m;
import p092v3.h;
import p097w3.j;

/* JADX INFO: loaded from: classes2.dex */
public final class Bc implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13820o;
    public final /* synthetic */ m p;
    public final /* synthetic */ a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f13821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z f13822s;
    public final /* synthetic */ String t;
    public final /* synthetic */ double u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ double f13823v;

    public Bc(PrintOrderViewModel printOrderViewModel, m mVar, a aVar, boolean z3, Z z4, String str, double d4, double d5) {
        this.f13820o = printOrderViewModel;
        this.p = mVar;
        this.q = aVar;
        this.f13821r = z3;
        this.f13822s = z4;
        this.t = str;
        this.u = d4;
        this.f13823v = d5;
    }

    public static final Map b(State state) {
        return (Map) state.getValue();
    }

    public final void a(BoxScope GlassCard, Composer composer, int i5) {
        final int i6;
        int i7;
        float f5;
        PrintOrderViewModel printOrderViewModel;
        int i8;
        String str;
        float f6;
        Modifier.Companion companion;
        Object obj;
        char c5;
        Object obj2;
        int i9;
        int i10;
        PrintOrderViewModel printOrderViewModel2;
        m mVar;
        int i11;
        MaterialTheme materialTheme;
        Modifier.Companion companion2;
        ComposeUiNode.Companion companion3;
        Modifier.Companion companion4;
        Arrangement arrangement;
        float f7;
        Object obj3;
        int i12;
        o.f(GlassCard, "$this$GlassCard");
        if ((i5 & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1369657892, i5, -1, "com.notescrafter.ui.screens.NotebookConfiguratorCard.<anonymous> (PrintOrderScreens.kt:1314)");
        }
        Modifier.Companion companion5 = Modifier.Companion;
        float f8 = 20;
        Modifier modifierM668padding3ABfNKs = PaddingKt.m668padding3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m6403constructorimpl(f8));
        Arrangement arrangement2 = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement2.getTop();
        Alignment.Companion companion6 = Alignment.Companion;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion6.getStart(), composer, 0);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs);
        ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
        a constructor = companion7.getConstructor();
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
        e eVarG = p035i0.a.g(companion7, composerM3407constructorimpl, measurePolicyColumnMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
        if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
        }
        Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion7.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion6.getCenterVertically(), composer, 54);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
        a constructor2 = companion7.getConstructor();
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
        e eVarG2 = p035i0.a.g(companion7, composerM3407constructorimpl2, measurePolicyRowMeasurePolicy, composerM3407constructorimpl2, currentCompositionLocalMap2);
        if (composerM3407constructorimpl2.getInserting() || !o.b(composerM3407constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            p035i0.a.t(currentCompositeKeyHash2, composerM3407constructorimpl2, currentCompositeKeyHash2, eVarG2);
        }
        Updater.m3414setimpl(composerM3407constructorimpl2, modifierMaterializeModifier2, companion7.getSetModifier());
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getCenterVertically(), composer, 48);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion5);
        a constructor3 = companion7.getConstructor();
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
        e eVarG3 = p035i0.a.g(companion7, composerM3407constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3407constructorimpl3, currentCompositionLocalMap3);
        if (composerM3407constructorimpl3.getInserting() || !o.b(composerM3407constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            p035i0.a.t(currentCompositeKeyHash3, composerM3407constructorimpl3, currentCompositeKeyHash3, eVarG3);
        }
        Updater.m3414setimpl(composerM3407constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
        Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(28));
        Color.Companion companion8 = Color.Companion;
        float f9 = 8;
        Modifier modifierF = b.f(f9, modifierM713size3ABfNKs, Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null));
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierF);
        a constructor4 = companion7.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl4 = Updater.m3407constructorimpl(composer);
        e eVarG4 = p035i0.a.g(companion7, composerM3407constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl4, currentCompositionLocalMap4);
        if (composerM3407constructorimpl4.getInserting() || !o.b(composerM3407constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            p035i0.a.t(currentCompositeKeyHash4, composerM3407constructorimpl4, currentCompositeKeyHash4, eVarG4);
        }
        Updater.m3414setimpl(composerM3407constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
        int i13 = MaterialTheme.$stable;
        TextStyle labelSmall = materialTheme2.getTypography(composer, i13).getLabelSmall();
        FontWeight.Companion companion9 = FontWeight.Companion;
        float f10 = f8;
        TextKt.m2432Text4IGK_g("PDF", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall.spanStyle.m5841getColor0d7_KjU() : p107y3.a.d(), (16645977 & 2) != 0 ? labelSmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (16645977 & 4) != 0 ? labelSmall.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? labelSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? labelSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall.paragraphStyle.getTextMotion() : null), composer, 6, 0, 65534);
        composer.endNode();
        float f11 = 10;
        androidx.compose.foundation.text.modifiers.a.q(f11, companion5, composer, 6);
        m mVar2 = this.p;
        String fileName = mVar2.getFileName();
        if (fileName == null) {
            fileName = "Untitled Notebook";
        }
        TextStyle titleSmall = materialTheme2.getTypography(composer, i13).getTitleSmall();
        TextKt.m2432Text4IGK_g(fileName, SizeKt.m720widthInVpY3zN4$default(companion5, 0.0f, Dp.m6403constructorimpl(180), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, titleSmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? titleSmall.spanStyle.m5841getColor0d7_KjU() : companion8.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? titleSmall.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? titleSmall.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? titleSmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? titleSmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? titleSmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? titleSmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? titleSmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? titleSmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? titleSmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? titleSmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? titleSmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? titleSmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? titleSmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? titleSmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? titleSmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? titleSmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? titleSmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? titleSmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? titleSmall.platformStyle : null, (16645977 & 1048576) != 0 ? titleSmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? titleSmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? titleSmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? titleSmall.paragraphStyle.getTextMotion() : null), composer, 48, 0, 65532);
        composer.endNode();
        composer.startReplaceGroup(1102017710);
        final PrintOrderViewModel printOrderViewModel3 = this.f13820o;
        final m mVar3 = mVar2;
        boolean zChangedInstance = composer.changedInstance(printOrderViewModel3) | composer.changed(mVar3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            i6 = 0;
            objRememberedValue = new a() { // from class: x3.vc
                /* JADX WARN: Code duplicated, block: B:17:0x005f  */
                /* JADX WARN: Code duplicated, block: B:18:0x0064  */
                /* JADX WARN: Code duplicated, block: B:22:0x007a  */
                /* JADX WARN: Code duplicated, block: B:27:0x0094  */
                /* JADX WARN: Code duplicated, block: B:34:0x008b A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:36:0x0074 A[SYNTHETIC] */
                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v8 java.lang.Object, still in use, count: 2, list:
                      (r5v8 java.lang.Object) from 0x005b: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v8 java.lang.Object) binds: [B:14:0x005a, B:31:0x005b] A[DONT_GENERATE, DONT_INLINE]
                      (r5v8 java.lang.Object) from 0x004d: CHECK_CAST (u3.m) (r5v8 java.lang.Object)
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                    */
                @Override // O3.a
                public final java.lang.Object invoke() {
                    /*
                        r10 = this;
                        B3.o r0 = B3.o.f154a
                        com.notescrafter.PrintOrderViewModel r1 = r1
                        u3.m r2 = r2
                        int r3 = r3
                        switch(r3) {
                            case 0: goto L29;
                            case 1: goto L1a;
                            default: goto Lb;
                        }
                    Lb:
                        java.lang.String r2 = r2.getId()
                        N0.c r3 = new N0.c
                        r4 = 16
                        r3.<init>(r4)
                        r1.r(r2, r3)
                        return r0
                    L1a:
                        java.lang.String r2 = r2.getId()
                        N0.c r3 = new N0.c
                        r4 = 15
                        r3.<init>(r4)
                        r1.r(r2, r3)
                        return r0
                    L29:
                        java.lang.String r2 = r2.getId()
                        r1.getClass()
                        java.lang.String r3 = "id"
                        kotlin.jvm.internal.o.f(r2, r3)
                        a4.T r3 = r1.g
                        java.lang.Object r4 = r3.getValue()
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        java.util.Iterator r4 = r4.iterator()
                    L41:
                        boolean r5 = r4.hasNext()
                        r6 = 0
                        if (r5 == 0) goto L5a
                        java.lang.Object r5 = r4.next()
                        r7 = r5
                        u3.m r7 = (p087u3.m) r7
                        java.lang.String r7 = r7.getId()
                        boolean r7 = kotlin.jvm.internal.o.b(r7, r2)
                        if (r7 == 0) goto L41
                        goto L5b
                    L5a:
                        r5 = r6
                    L5b:
                        u3.m r5 = (p087u3.m) r5
                        if (r5 == 0) goto L64
                        java.lang.String r4 = r5.getR2FileKey()
                        goto L65
                    L64:
                        r4 = r6
                    L65:
                        java.lang.Object r5 = r3.getValue()
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.util.Iterator r5 = r5.iterator()
                    L74:
                        boolean r8 = r5.hasNext()
                        if (r8 == 0) goto L8f
                        java.lang.Object r8 = r5.next()
                        r9 = r8
                        u3.m r9 = (p087u3.m) r9
                        java.lang.String r9 = r9.getId()
                        boolean r9 = kotlin.jvm.internal.o.b(r9, r2)
                        if (r9 != 0) goto L74
                        r7.add(r8)
                        goto L74
                    L8f:
                        r3.j(r6, r7)
                        if (r4 == 0) goto La5
                        e0.a r2 = androidx.lifecycle.Q.h(r1)
                        e4.e r3 = X3.H.f1766a
                        e4.d r3 = e4.d.f11107o
                        t3.H0 r5 = new t3.H0
                        r5.<init>(r1, r4, r6)
                        r4 = 2
                        X3.A.t(r2, r3, r6, r5, r4)
                    La5:
                        r1.q()
                        r1.e()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p102x3.C2723vc.invoke():java.lang.Object");
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        } else {
            i6 = 0;
        }
        composer.endReplaceGroup();
        IconButtonKt.IconButton((a) objRememberedValue, SizeKt.m713size3ABfNKs(companion5, Dp.m6403constructorimpl(32)), false, null, null, X2.h(), composer, 196656, 28);
        composer.endNode();
        float f12 = 16;
        b.m(f12, companion5, composer, 6);
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composer, i6);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, i6);
        CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
        a constructor5 = companion7.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor5);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl5 = Updater.m3407constructorimpl(composer);
        ComposeUiNode.Companion companion10 = companion7;
        e eVarG5 = p035i0.a.g(companion10, composerM3407constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM3407constructorimpl5, currentCompositionLocalMap5);
        if (composerM3407constructorimpl5.getInserting() || !o.b(composerM3407constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            p035i0.a.t(currentCompositeKeyHash5, composerM3407constructorimpl5, currentCompositeKeyHash5, eVarG5);
        }
        Updater.m3414setimpl(composerM3407constructorimpl5, modifierMaterializeModifier5, companion10.getSetModifier());
        String uploadStatus = mVar3.getUploadStatus();
        int iHashCode = uploadStatus.hashCode();
        a aVar = this.q;
        switch (iHashCode) {
            case -1867169789:
                i7 = 1;
                f5 = f12;
                companion10 = companion10;
                mVar3 = mVar3;
                printOrderViewModel = printOrderViewModel3;
                i8 = 11;
                str = null;
                f6 = 0.0f;
                companion = companion5;
                obj = "success";
                if (!uploadStatus.equals(obj)) {
                    composer.startReplaceGroup(-184391719);
                    composer.endReplaceGroup();
                    obj2 = obj;
                    i9 = 6;
                    c5 = '6';
                } else {
                    composer.startReplaceGroup(-190482723);
                    c5 = '6';
                    obj2 = obj;
                    j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(p107y3.a.a(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(p107y3.a.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1614347819, true, new C2771yc(aVar, mVar3), composer, 54), composer, 197046, 24);
                    composer.endReplaceGroup();
                    f10 = f10;
                    i9 = 6;
                }
                break;
            case 3227604:
                i7 = 1;
                f5 = f12;
                companion10 = companion10;
                printOrderViewModel = printOrderViewModel3;
                f6 = 0.0f;
                companion = companion5;
                if (uploadStatus.equals("idle")) {
                    composer.startReplaceGroup(-196407629);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    composer.startReplaceGroup(1102045628);
                    boolean zChanged = composer.changed(aVar);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        i10 = 11;
                        objRememberedValue2 = new O(11, aVar);
                        composer.updateRememberedValue(objRememberedValue2);
                    } else {
                        i10 = 11;
                    }
                    composer.endReplaceGroup();
                    i8 = i10;
                    mVar3 = mVar3;
                    str = null;
                    j.a(ClickableKt.m242clickableXHw0xAI$default(modifierFillMaxWidth$default3, false, null, null, (a) objRememberedValue2, 7, null), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(p107y3.a.d(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, X2.i(), composer, 197040, 24);
                    composer.endReplaceGroup();
                    obj2 = "success";
                } else {
                    obj = "success";
                    str = null;
                    i8 = 11;
                    composer.startReplaceGroup(-184391719);
                    composer.endReplaceGroup();
                    obj2 = obj;
                }
                i9 = 6;
                c5 = '6';
                break;
            case 96784904:
                f5 = f12;
                printOrderViewModel = printOrderViewModel3;
                companion = companion5;
                if (!uploadStatus.equals("error")) {
                    companion10 = companion10;
                    obj = "success";
                    i7 = 1;
                    f6 = 0.0f;
                    str = null;
                    i8 = 11;
                    composer.startReplaceGroup(-184391719);
                    composer.endReplaceGroup();
                    obj2 = obj;
                    i9 = 6;
                    c5 = '6';
                } else {
                    composer.startReplaceGroup(-187376182);
                    i7 = 1;
                    f6 = 0.0f;
                    j.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(p107y3.a.b(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(p107y3.a.b(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-591294548, true, new C2787zc(aVar, mVar3), composer, 54), composer, 197046, 24);
                    composer.endReplaceGroup();
                    obj2 = "success";
                    i9 = 6;
                    str = null;
                    c5 = '6';
                    i8 = 11;
                }
                break;
            case 1239105089:
                if (uploadStatus.equals("uploading")) {
                    composer.startReplaceGroup(-193445579);
                    f5 = f12;
                    printOrderViewModel = printOrderViewModel3;
                    companion = companion5;
                    j.a(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(p107y3.a.e(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-474977110, true, new C2755xc(mVar3), composer, 54), composer, 197046, 24);
                    composer.endReplaceGroup();
                    c5 = '6';
                    obj2 = "success";
                    i7 = 1;
                    i9 = 6;
                    f6 = 0.0f;
                    str = null;
                    i8 = 11;
                    break;
                }
            default:
                i7 = 1;
                f5 = f12;
                companion10 = companion10;
                mVar3 = mVar3;
                printOrderViewModel = printOrderViewModel3;
                i8 = 11;
                str = null;
                f6 = 0.0f;
                companion = companion5;
                obj = "success";
                composer.startReplaceGroup(-184391719);
                composer.endReplaceGroup();
                obj2 = obj;
                i9 = 6;
                c5 = '6';
                break;
        }
        b.m(f10, companion, composer, i9);
        float f13 = f5;
        float f14 = i7;
        Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(b.e(f13, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.m699height3ABfNKs(SizeKt.fillMaxWidth$default(companion, f6, i7, str), Dp.m6403constructorimpl(340)), f13), Color.m3926copywmQWz5c$default(companion8.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f14), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), f6, Dp.m6403constructorimpl(f13), i7, str);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
        a constructor6 = companion10.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor6);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl6 = Updater.m3407constructorimpl(composer);
        ComposeUiNode.Companion companion11 = companion10;
        e eVarG6 = p035i0.a.g(companion11, composerM3407constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3407constructorimpl6, currentCompositionLocalMap6);
        if (composerM3407constructorimpl6.getInserting() || !o.b(composerM3407constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            p035i0.a.t(currentCompositeKeyHash6, composerM3407constructorimpl6, currentCompositeKeyHash6, eVarG6);
        }
        Updater.m3414setimpl(composerM3407constructorimpl6, modifierMaterializeModifier6, companion11.getSetModifier());
        boolean zB = o.b(mVar3.getUploadStatus(), obj2);
        Z z3 = this.f13822s;
        boolean z4 = this.f13821r;
        boolean z5 = z3.f13141c;
        String str2 = z3.f13140b;
        if (zB) {
            composer.startReplaceGroup(-1589101566);
            printOrderViewModel2 = printOrderViewModel;
            mVar = mVar3;
            Gd.f(mVar, printOrderViewModel2, SizeKt.fillMaxSize$default(companion, f6, i7, str), composer, 384);
            composer.endReplaceGroup();
        } else {
            printOrderViewModel2 = printOrderViewModel;
            mVar = mVar3;
            composer.startReplaceGroup(-1588845103);
            Gd.e(z3.a(), z4, str2 == null ? z5 ? "Max 4 words" : str : str2, SizeKt.fillMaxSize$default(companion, f6, i7, str), composer, 3072);
            composer.endReplaceGroup();
        }
        b.n(composer, f10, companion, composer, i9);
        TextStyle labelSmall2 = materialTheme2.getTypography(composer, i13).getLabelSmall();
        TextStyle textStyleM5917copyp1EtxEg = labelSmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall2.spanStyle.m5841getColor0d7_KjU() : z4 ? p107y3.a.b() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall2.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? labelSmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(i7), (16645977 & Fields.RotationX) != 0 ? labelSmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall2.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall2.paragraphStyle.getTextMotion() : null);
        final PrintOrderViewModel printOrderViewModel4 = printOrderViewModel2;
        final m mVar4 = mVar;
        String str3 = str2;
        float f15 = f10;
        int i14 = i9;
        Modifier.Companion companion12 = companion;
        TextKt.m2432Text4IGK_g("NOTEBOOK TITLE (ON COVER)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, textStyleM5917copyp1EtxEg, composer, 6, 0, 65534);
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion12, Dp.m6403constructorimpl(i14)), composer, i14);
        String name = mVar4.getName();
        TextFieldColors textFieldColorsM2076colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m2076colors0hiis_0(companion8.m3964getWhite0d7_KjU(), companion8.m3964getWhite0d7_KjU(), 0L, 0L, Color.m3926copywmQWz5c$default(companion8.m3953getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(companion8.m3953getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, null, z4 ? p107y3.a.b() : p107y3.a.e(), z4 ? Color.m3926copywmQWz5c$default(p107y3.a.b(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 221238, 0, 0, 0, 3072, 2147477452, 4095);
        float f16 = 12;
        RoundedCornerShape roundedCornerShapeM955RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m955RoundedCornerShape0680j_4(Dp.m6403constructorimpl(f16));
        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null);
        composer.startReplaceGroup(1102494141);
        boolean zChangedInstance2 = composer.changedInstance(printOrderViewModel4) | composer.changed(mVar4);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new d(9, printOrderViewModel4, mVar4);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(name, (c) objRememberedValue3, modifierFillMaxWidth$default4, false, false, (TextStyle) null, (e) null, (e) X2.j(), (e) null, (e) null, (e) null, (e) null, (e) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM955RoundedCornerShape0680j_4, textFieldColorsM2076colors0hiis_0, composer, 12583296, 12582912, 0, 1965944);
        composer.startReplaceGroup(1102525578);
        if (z4) {
            b.m(4, companion12, composer, 6);
            if (str3 == null) {
                str3 = z5 ? "Cover title cannot exceed 4 words." : "Title cover is required.";
            }
            long jB = p107y3.a.b();
            TextStyle bodySmall = materialTheme2.getTypography(composer, i13).getBodySmall();
            i11 = i13;
            companion2 = companion12;
            materialTheme = materialTheme2;
            TextKt.m2432Text4IGK_g(str3, (Modifier) null, jB, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall.spanStyle.m5841getColor0d7_KjU() : 0L, (16645977 & 2) != 0 ? bodySmall.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(i8), (16645977 & 4) != 0 ? bodySmall.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? bodySmall.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall.paragraphStyle.getTextMotion() : null), composer, 384, 0, 65530);
        } else {
            i11 = i13;
            materialTheme = materialTheme2;
            companion2 = companion12;
        }
        composer.endReplaceGroup();
        String upperCase = "Color Mode".toUpperCase();
        o.e(upperCase, "toUpperCase(...)");
        int i15 = i11;
        MaterialTheme materialTheme3 = materialTheme;
        TextStyle labelSmall3 = materialTheme3.getTypography(composer, i15).getLabelSmall();
        TextKt.m2432Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, labelSmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? labelSmall3.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? labelSmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? labelSmall3.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? labelSmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? labelSmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? labelSmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? labelSmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? labelSmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1), (16645977 & Fields.RotationX) != 0 ? labelSmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? labelSmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? labelSmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? labelSmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? labelSmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? labelSmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? labelSmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? labelSmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? labelSmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? labelSmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? labelSmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? labelSmall3.platformStyle : null, (16645977 & 1048576) != 0 ? labelSmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? labelSmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? labelSmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? labelSmall3.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
        Modifier.Companion companion13 = companion2;
        b.m(f9, companion13, composer, 6);
        float f17 = 4;
        Modifier modifierM668padding3ABfNKs2 = PaddingKt.m668padding3ABfNKs(b.e(f16, b.f(f16, SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.03f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f14), Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f17));
        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion6.getTop(), composer, 0);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierM668padding3ABfNKs2);
        a constructor7 = companion11.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor7);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl7 = Updater.m3407constructorimpl(composer);
        e eVarG7 = p035i0.a.g(companion11, composerM3407constructorimpl7, measurePolicyRowMeasurePolicy3, composerM3407constructorimpl7, currentCompositionLocalMap7);
        if (composerM3407constructorimpl7.getInserting() || !o.b(composerM3407constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            p035i0.a.t(currentCompositeKeyHash7, composerM3407constructorimpl7, currentCompositeKeyHash7, eVarG7);
        }
        Updater.m3414setimpl(composerM3407constructorimpl7, modifierMaterializeModifier7, companion11.getSetModifier());
        p087u3.j color = mVar4.getColor();
        p087u3.j jVar = p087u3.j.BW;
        boolean z6 = color == jVar;
        Modifier modifierM207backgroundbw27NRU$default = BackgroundKt.m207backgroundbw27NRU$default(b.g(RowScope.weight$default(rowScopeInstance, companion13, 1.0f, false, 2, null), f9), z6 ? Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null) : companion8.m3962getTransparent0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(918697168);
        boolean zChangedInstance3 = composer.changedInstance(printOrderViewModel4) | composer.changed(mVar4);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            final int i16 = 1;
            objRememberedValue4 = new a() { // from class: x3.vc
                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v8 java.lang.Object, still in use, count: 2, list:
                      (r5v8 java.lang.Object) from 0x005b: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v8 java.lang.Object) binds: [B:14:0x005a, B:31:0x005b] A[DONT_GENERATE, DONT_INLINE]
                      (r5v8 java.lang.Object) from 0x004d: CHECK_CAST (u3.m) (r5v8 java.lang.Object)
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                    */
                @Override // O3.a
                public final java.lang.Object invoke() {
                    /*
                        r10 = this;
                        B3.o r0 = B3.o.f154a
                        com.notescrafter.PrintOrderViewModel r1 = r1
                        u3.m r2 = r2
                        int r3 = r3
                        switch(r3) {
                            case 0: goto L29;
                            case 1: goto L1a;
                            default: goto Lb;
                        }
                    Lb:
                        java.lang.String r2 = r2.getId()
                        N0.c r3 = new N0.c
                        r4 = 16
                        r3.<init>(r4)
                        r1.r(r2, r3)
                        return r0
                    L1a:
                        java.lang.String r2 = r2.getId()
                        N0.c r3 = new N0.c
                        r4 = 15
                        r3.<init>(r4)
                        r1.r(r2, r3)
                        return r0
                    L29:
                        java.lang.String r2 = r2.getId()
                        r1.getClass()
                        java.lang.String r3 = "id"
                        kotlin.jvm.internal.o.f(r2, r3)
                        a4.T r3 = r1.g
                        java.lang.Object r4 = r3.getValue()
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        java.util.Iterator r4 = r4.iterator()
                    L41:
                        boolean r5 = r4.hasNext()
                        r6 = 0
                        if (r5 == 0) goto L5a
                        java.lang.Object r5 = r4.next()
                        r7 = r5
                        u3.m r7 = (p087u3.m) r7
                        java.lang.String r7 = r7.getId()
                        boolean r7 = kotlin.jvm.internal.o.b(r7, r2)
                        if (r7 == 0) goto L41
                        goto L5b
                    L5a:
                        r5 = r6
                    L5b:
                        u3.m r5 = (p087u3.m) r5
                        if (r5 == 0) goto L64
                        java.lang.String r4 = r5.getR2FileKey()
                        goto L65
                    L64:
                        r4 = r6
                    L65:
                        java.lang.Object r5 = r3.getValue()
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.util.Iterator r5 = r5.iterator()
                    L74:
                        boolean r8 = r5.hasNext()
                        if (r8 == 0) goto L8f
                        java.lang.Object r8 = r5.next()
                        r9 = r8
                        u3.m r9 = (p087u3.m) r9
                        java.lang.String r9 = r9.getId()
                        boolean r9 = kotlin.jvm.internal.o.b(r9, r2)
                        if (r9 != 0) goto L74
                        r7.add(r8)
                        goto L74
                    L8f:
                        r3.j(r6, r7)
                        if (r4 == 0) goto La5
                        e0.a r2 = androidx.lifecycle.Q.h(r1)
                        e4.e r3 = X3.H.f1766a
                        e4.d r3 = e4.d.f11107o
                        t3.H0 r5 = new t3.H0
                        r5.<init>(r1, r4, r6)
                        r4 = 2
                        X3.A.t(r2, r3, r6, r5, r4)
                    La5:
                        r1.q()
                        r1.e()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p102x3.C2723vc.invoke():java.lang.Object");
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierM670paddingVpY3zN4$default2 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default, false, null, null, (a) objRememberedValue4, 7, null), 0.0f, Dp.m6403constructorimpl(f11), 1, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default2);
        a constructor8 = companion11.getConstructor();
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
        e eVarG8 = p035i0.a.g(companion11, composerM3407constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3407constructorimpl8, currentCompositionLocalMap8);
        if (composerM3407constructorimpl8.getInserting() || !o.b(composerM3407constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            p035i0.a.t(currentCompositeKeyHash8, composerM3407constructorimpl8, currentCompositeKeyHash8, eVarG8);
        }
        Updater.m3414setimpl(composerM3407constructorimpl8, modifierMaterializeModifier8, companion11.getSetModifier());
        String strZ = androidx.compose.foundation.text.modifiers.a.z("B & W (", Gd.y(this.u), "/pg)");
        TextStyle bodySmall2 = materialTheme3.getTypography(composer, i15).getBodySmall();
        TextStyle textStyleM5917copyp1EtxEg2 = bodySmall2.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall2.spanStyle.m5841getColor0d7_KjU() : z6 ? companion8.m3964getWhite0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? bodySmall2.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall2.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? bodySmall2.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall2.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall2.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall2.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall2.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall2.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall2.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall2.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall2.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall2.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall2.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall2.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall2.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall2.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall2.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall2.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall2.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall2.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall2.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall2.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall2.paragraphStyle.getTextMotion() : null);
        TextAlign.Companion companion14 = TextAlign.Companion;
        int iM6292getCentere0LSkKk = companion14.m6292getCentere0LSkKk();
        TextOverflow.Companion companion15 = TextOverflow.Companion;
        TextKt.m2432Text4IGK_g(strZ, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(iM6292getCentere0LSkKk), 0L, companion15.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, textStyleM5917copyp1EtxEg2, composer, 0, 3120, 54782);
        composer.endNode();
        Modifier modifierM207backgroundbw27NRU$default2 = BackgroundKt.m207backgroundbw27NRU$default(b.g(RowScope.weight$default(rowScopeInstance, companion13, 1.0f, false, 2, null), f9), !z6 ? Color.m3926copywmQWz5c$default(companion8.m3964getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null) : companion8.m3962getTransparent0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(918734195);
        boolean zChangedInstance4 = composer.changedInstance(printOrderViewModel4) | composer.changed(mVar4);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            final int i17 = 2;
            objRememberedValue5 = new a() { // from class: x3.vc
                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v8 java.lang.Object, still in use, count: 2, list:
                      (r5v8 java.lang.Object) from 0x005b: PHI (r5 I:??) = (r5v1 java.lang.Object), (r5v8 java.lang.Object) binds: [B:14:0x005a, B:31:0x005b] A[DONT_GENERATE, DONT_INLINE]
                      (r5v8 java.lang.Object) from 0x004d: CHECK_CAST (u3.m) (r5v8 java.lang.Object)
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                    */
                @Override // O3.a
                public final java.lang.Object invoke() {
                    /*
                        r10 = this;
                        B3.o r0 = B3.o.f154a
                        com.notescrafter.PrintOrderViewModel r1 = r1
                        u3.m r2 = r2
                        int r3 = r3
                        switch(r3) {
                            case 0: goto L29;
                            case 1: goto L1a;
                            default: goto Lb;
                        }
                    Lb:
                        java.lang.String r2 = r2.getId()
                        N0.c r3 = new N0.c
                        r4 = 16
                        r3.<init>(r4)
                        r1.r(r2, r3)
                        return r0
                    L1a:
                        java.lang.String r2 = r2.getId()
                        N0.c r3 = new N0.c
                        r4 = 15
                        r3.<init>(r4)
                        r1.r(r2, r3)
                        return r0
                    L29:
                        java.lang.String r2 = r2.getId()
                        r1.getClass()
                        java.lang.String r3 = "id"
                        kotlin.jvm.internal.o.f(r2, r3)
                        a4.T r3 = r1.g
                        java.lang.Object r4 = r3.getValue()
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        java.util.Iterator r4 = r4.iterator()
                    L41:
                        boolean r5 = r4.hasNext()
                        r6 = 0
                        if (r5 == 0) goto L5a
                        java.lang.Object r5 = r4.next()
                        r7 = r5
                        u3.m r7 = (p087u3.m) r7
                        java.lang.String r7 = r7.getId()
                        boolean r7 = kotlin.jvm.internal.o.b(r7, r2)
                        if (r7 == 0) goto L41
                        goto L5b
                    L5a:
                        r5 = r6
                    L5b:
                        u3.m r5 = (p087u3.m) r5
                        if (r5 == 0) goto L64
                        java.lang.String r4 = r5.getR2FileKey()
                        goto L65
                    L64:
                        r4 = r6
                    L65:
                        java.lang.Object r5 = r3.getValue()
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.util.Iterator r5 = r5.iterator()
                    L74:
                        boolean r8 = r5.hasNext()
                        if (r8 == 0) goto L8f
                        java.lang.Object r8 = r5.next()
                        r9 = r8
                        u3.m r9 = (p087u3.m) r9
                        java.lang.String r9 = r9.getId()
                        boolean r9 = kotlin.jvm.internal.o.b(r9, r2)
                        if (r9 != 0) goto L74
                        r7.add(r8)
                        goto L74
                    L8f:
                        r3.j(r6, r7)
                        if (r4 == 0) goto La5
                        e0.a r2 = androidx.lifecycle.Q.h(r1)
                        e4.e r3 = X3.H.f1766a
                        e4.d r3 = e4.d.f11107o
                        t3.H0 r5 = new t3.H0
                        r5.<init>(r1, r4, r6)
                        r4 = 2
                        X3.A.t(r2, r3, r6, r5, r4)
                    La5:
                        r1.q()
                        r1.e()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p102x3.C2723vc.invoke():java.lang.Object");
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        Modifier modifierM670paddingVpY3zN4$default3 = PaddingKt.m670paddingVpY3zN4$default(ClickableKt.m242clickableXHw0xAI$default(modifierM207backgroundbw27NRU$default2, false, null, null, (a) objRememberedValue5, 7, null), 0.0f, Dp.m6403constructorimpl(f11), 1, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default3);
        a constructor9 = companion11.getConstructor();
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
        e eVarG9 = p035i0.a.g(companion11, composerM3407constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3407constructorimpl9, currentCompositionLocalMap9);
        if (composerM3407constructorimpl9.getInserting() || !o.b(composerM3407constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            p035i0.a.t(currentCompositeKeyHash9, composerM3407constructorimpl9, currentCompositeKeyHash9, eVarG9);
        }
        Updater.m3414setimpl(composerM3407constructorimpl9, modifierMaterializeModifier9, companion11.getSetModifier());
        String strZ2 = androidx.compose.foundation.text.modifiers.a.z("Color (", Gd.y(this.f13823v), "/pg)");
        TextStyle bodySmall3 = materialTheme3.getTypography(composer, i15).getBodySmall();
        TextKt.m2432Text4IGK_g(strZ2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6285boximpl(companion14.m6292getCentere0LSkKk()), 0L, companion15.m6342getEllipsisgIe3tQ8(), false, 1, 0, (c) null, bodySmall3.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall3.spanStyle.m5841getColor0d7_KjU() : !z6 ? companion8.m3964getWhite0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? bodySmall3.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? bodySmall3.spanStyle.getFontWeight() : companion9.getBold(), (16645977 & 8) != 0 ? bodySmall3.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall3.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall3.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall3.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall3.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall3.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall3.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall3.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall3.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall3.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall3.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall3.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall3.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall3.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall3.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall3.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall3.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall3.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall3.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall3.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall3.paragraphStyle.getTextMotion() : null), composer, 0, 3120, 54782);
        b.r(composer, f15, companion13, composer, 6);
        j.a(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), 0L, 0L, 0.0f, null, X2.a(), composer, 196614, 30);
        b.m(f15, companion13, composer, 6);
        String str4 = this.t;
        double dL = printOrderViewModel4.l(mVar4, str4);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceGroup(1102805944);
        boolean zChanged2 = composer.changed(context);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
            objRememberedValue6 = h.f13519y.p(context);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        B3.h hVar = (B3.h) b(SnapshotStateKt.collectAsState(((h) objRememberedValue6).f13538x, null, composer, 0, 1)).get(str4 == null ? "guest" : str4);
        if (hVar == null) {
            hVar = new B3.h(Double.valueOf(1.25d), Double.valueOf(3.35d));
        }
        double dDoubleValue = ((Number) hVar.f148o).doubleValue();
        double dDoubleValue2 = ((Number) hVar.p).doubleValue();
        if (mVar4.getColor() == jVar) {
            dDoubleValue2 = dDoubleValue;
        }
        j.a(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1860604908, true, new Ac(mVar4, dDoubleValue2, dL), composer, 54), composer, 196614, 30);
        SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion13, Dp.m6403constructorimpl(f16)), composer, 6);
        double dMax = Math.max(0.0d, dL - (((((double) mVar4.getPages()) * (mVar4.getColor() == p087u3.j.COLOR ? 1.99d : 0.89d)) + 65.0d) * ((double) mVar4.getCopies())));
        if (o.b(str4, "lifetime")) {
            composer.startReplaceGroup(-169032800);
            Modifier modifierM669paddingVpY3zN4 = PaddingKt.m669paddingVpY3zN4(b.e(f16, BackgroundKt.m207backgroundbw27NRU$default(b.g(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), f16), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m6403constructorimpl(f14), Color.m3926copywmQWz5c$default(ColorKt.Color(4279286145L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(f16), Dp.m6403constructorimpl(f9));
            MeasurePolicy measurePolicyI = androidx.compose.foundation.text.modifiers.a.i(f9, arrangement2, companion6.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifierM669paddingVpY3zN4);
            a constructor10 = companion11.getConstructor();
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
            e eVarG10 = p035i0.a.g(companion11, composerM3407constructorimpl10, measurePolicyI, composerM3407constructorimpl10, currentCompositionLocalMap10);
            if (composerM3407constructorimpl10.getInserting() || !o.b(composerM3407constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                p035i0.a.t(currentCompositeKeyHash10, composerM3407constructorimpl10, currentCompositeKeyHash10, eVarG10);
            }
            Updater.m3414setimpl(composerM3407constructorimpl10, modifierMaterializeModifier10, companion11.getSetModifier());
            companion3 = companion11;
            arrangement = arrangement2;
            TextKt.m2432Text4IGK_g("✨", (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 3078, 0, 131062);
            TextKt.m2432Text4IGK_g("DIAMOND PASS ACTIVE: MAX DISCOUNT APPLIED", (Modifier) null, ColorKt.Color(4281652121L), TextUnitKt.getSp(8), (FontStyle) null, companion9.getBold(), (FontFamily) null, TextUnitKt.getSp(0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, (TextStyle) null, composer, 12782982, 0, 130898);
            composer.endNode();
            companion4 = companion13;
            SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f16)), composer, 6);
            composer.endReplaceGroup();
            i12 = 1;
            f7 = 0.0f;
            obj3 = null;
        } else {
            companion3 = companion11;
            companion4 = companion13;
            arrangement = arrangement2;
            if (dMax > 0.0d) {
                composer.startReplaceGroup(-167883320);
                f7 = 0.0f;
                obj3 = null;
                j.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4287323382L), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3926copywmQWz5c$default(ColorKt.Color(4287323382L), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-969715824, true, new C2739wc(Gd.y(dMax)), composer, 54), composer, 197046, 24);
                SpacerKt.Spacer(SizeKt.m699height3ABfNKs(companion4, Dp.m6403constructorimpl(f16)), composer, 6);
                composer.endReplaceGroup();
            } else {
                f7 = 0.0f;
                obj3 = null;
                composer.startReplaceGroup(-166175623);
                composer.endReplaceGroup();
            }
            i12 = 1;
        }
        Modifier modifierM672paddingqDBjuR0$default = PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, f7, i12, obj3), 0.0f, Dp.m6403constructorimpl(f17), 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion6.getStart(), composer, 0);
        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierM672paddingqDBjuR0$default);
        a constructor11 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor11);
        } else {
            composer.useNode();
        }
        Composer composerM3407constructorimpl11 = Updater.m3407constructorimpl(composer);
        ComposeUiNode.Companion companion16 = companion3;
        e eVarG11 = p035i0.a.g(companion16, composerM3407constructorimpl11, measurePolicyColumnMeasurePolicy3, composerM3407constructorimpl11, currentCompositionLocalMap11);
        if (composerM3407constructorimpl11.getInserting() || !o.b(composerM3407constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
            p035i0.a.t(currentCompositeKeyHash11, composerM3407constructorimpl11, currentCompositeKeyHash11, eVarG11);
        }
        Updater.m3414setimpl(composerM3407constructorimpl11, modifierMaterializeModifier11, companion16.getSetModifier());
        String strY = Gd.y(dL);
        TextStyle headlineMedium = materialTheme3.getTypography(composer, i15).getHeadlineMedium();
        TextKt.m2432Text4IGK_g(strY, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, headlineMedium.m5917copyp1EtxEg((16645977 & 1) != 0 ? headlineMedium.spanStyle.m5841getColor0d7_KjU() : companion8.m3964getWhite0d7_KjU(), (16645977 & 2) != 0 ? headlineMedium.spanStyle.m5842getFontSizeXSAIIZE() : 0L, (16645977 & 4) != 0 ? headlineMedium.spanStyle.getFontWeight() : companion9.getExtraBold(), (16645977 & 8) != 0 ? headlineMedium.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? headlineMedium.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? headlineMedium.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? headlineMedium.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? headlineMedium.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? headlineMedium.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? headlineMedium.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? headlineMedium.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? headlineMedium.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? headlineMedium.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? headlineMedium.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? headlineMedium.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? headlineMedium.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? headlineMedium.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? headlineMedium.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? headlineMedium.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? headlineMedium.platformStyle : null, (16645977 & 1048576) != 0 ? headlineMedium.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? headlineMedium.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? headlineMedium.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? headlineMedium.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
        String str5 = Gd.y(dL / ((double) mVar4.getCopies())) + " per copy · " + mVar4.getCopies() + " " + (mVar4.getCopies() == 1 ? "copy" : "copies");
        TextStyle bodySmall4 = materialTheme3.getTypography(composer, i15).getBodySmall();
        TextKt.m2432Text4IGK_g(str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (c) null, bodySmall4.m5917copyp1EtxEg((16645977 & 1) != 0 ? bodySmall4.spanStyle.m5841getColor0d7_KjU() : p107y3.a.g(), (16645977 & 2) != 0 ? bodySmall4.spanStyle.m5842getFontSizeXSAIIZE() : TextUnitKt.getSp(i8), (16645977 & 4) != 0 ? bodySmall4.spanStyle.getFontWeight() : null, (16645977 & 8) != 0 ? bodySmall4.spanStyle.m5843getFontStyle4Lr2A7w() : null, (16645977 & 16) != 0 ? bodySmall4.spanStyle.m5844getFontSynthesisZQGJjVo() : null, (16645977 & 32) != 0 ? bodySmall4.spanStyle.getFontFamily() : null, (16645977 & 64) != 0 ? bodySmall4.spanStyle.getFontFeatureSettings() : null, (16645977 & Fields.SpotShadowColor) != 0 ? bodySmall4.spanStyle.m5845getLetterSpacingXSAIIZE() : 0L, (16645977 & Fields.RotationX) != 0 ? bodySmall4.spanStyle.m5840getBaselineShift5SSeXJ0() : null, (16645977 & Fields.RotationY) != 0 ? bodySmall4.spanStyle.getTextGeometricTransform() : null, (16645977 & Fields.RotationZ) != 0 ? bodySmall4.spanStyle.getLocaleList() : null, (16645977 & Fields.CameraDistance) != 0 ? bodySmall4.spanStyle.m5839getBackground0d7_KjU() : 0L, (16645977 & Fields.TransformOrigin) != 0 ? bodySmall4.spanStyle.getTextDecoration() : null, (16645977 & Fields.Shape) != 0 ? bodySmall4.spanStyle.getShadow() : null, (16645977 & Fields.Clip) != 0 ? bodySmall4.spanStyle.getDrawStyle() : null, (16645977 & Fields.CompositingStrategy) != 0 ? bodySmall4.paragraphStyle.m5797getTextAligne0LSkKk() : 0, (16645977 & 65536) != 0 ? bodySmall4.paragraphStyle.m5799getTextDirections_7Xco() : 0, (16645977 & Fields.RenderEffect) != 0 ? bodySmall4.paragraphStyle.m5795getLineHeightXSAIIZE() : 0L, (16645977 & 262144) != 0 ? bodySmall4.paragraphStyle.getTextIndent() : null, (16645977 & 524288) != 0 ? bodySmall4.platformStyle : null, (16645977 & 1048576) != 0 ? bodySmall4.paragraphStyle.getLineHeightStyle() : null, (16645977 & 2097152) != 0 ? bodySmall4.paragraphStyle.m5794getLineBreakrAG3T2k() : 0, (16645977 & 4194304) != 0 ? bodySmall4.paragraphStyle.m5792getHyphensvmbZdU8() : 0, (16645977 & 8388608) != 0 ? bodySmall4.paragraphStyle.getTextMotion() : null), composer, 0, 0, 65534);
        if (S2.b(composer)) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // O3.f
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return B3.o.f154a;
    }
}
