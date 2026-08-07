package p102x3;

import A2.t;
import O3.a;
import O3.c;
import O3.e;
import O3.f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AspectRatioKt;
import androidx.compose.material.icons.filled.CompareArrowsKt;
import androidx.compose.material.icons.filled.UnfoldMoreKt;
import androidx.compose.material.icons.filled.ZoomInKt;
import androidx.compose.material.icons.filled.ZoomOutKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p076s.b;

/* JADX INFO: renamed from: x3.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2717v6 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f15636o;
    public final /* synthetic */ EnumC2422ce p;
    public final /* synthetic */ a q;

    public C2717v6(c cVar, EnumC2422ce enumC2422ce, a aVar) {
        this.f15636o = cVar;
        this.p = enumC2422ce;
        this.q = aVar;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ImageVector aspectRatio;
        BoxScope GlassCard = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(GlassCard, "$this$GlassCard");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1484164628, iIntValue, -1, "com.notescrafter.ui.screens.FineTuneControls.<anonymous>.<anonymous> (LogoSelectionScreen.kt:507)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM670paddingVpY3zN4$default = PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m6403constructorimpl(16), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM670paddingVpY3zN4$default);
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
            e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyRowMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Icons icons = Icons.INSTANCE;
            ImageVector zoomOut = ZoomOutKt.getZoomOut(icons.getDefault());
            composer.startReplaceGroup(-1121290748);
            c cVar = this.f15636o;
            boolean zChanged = composer.changed(cVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new B5(cVar, 1);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            A6.e(zoomOut, (a) objRememberedValue, composer, 0);
            int iOrdinal = this.p.ordinal();
            if (iOrdinal == 0) {
                aspectRatio = AspectRatioKt.getAspectRatio(icons.getDefault());
            } else if (iOrdinal == 1) {
                aspectRatio = CompareArrowsKt.getCompareArrows(icons.getDefault());
            } else {
                if (iOrdinal != 2) {
                    throw new t();
                }
                aspectRatio = UnfoldMoreKt.getUnfoldMore(icons.getDefault());
            }
            Modifier modifierM713size3ABfNKs = SizeKt.m713size3ABfNKs(companion, Dp.m6403constructorimpl(48));
            long j5 = p107y3.a.f15978a;
            float f5 = 12;
            IconButtonKt.IconButton(this.q, b.e(f5, b.f(f5, modifierM713size3ABfNKs, Color.m3926copywmQWz5c$default(j5, 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m6403constructorimpl(1), Color.m3926copywmQWz5c$default(j5, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), false, null, null, ComposableLambdaKt.rememberComposableLambda(1233699349, true, new C2701u6(aspectRatio), composer, 54), composer, 196608, 28);
            ImageVector zoomIn = ZoomInKt.getZoomIn(icons.getDefault());
            composer.startReplaceGroup(-1121258620);
            boolean zChanged2 = composer.changed(cVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new B5(cVar, 2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            A6.e(zoomIn, (a) objRememberedValue2, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
