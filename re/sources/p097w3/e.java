package p097w3;

import O3.a;
import O3.c;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements O3.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Modifier f13614o;
    public final /* synthetic */ String p;
    public final /* synthetic */ c q;

    public e(Modifier modifier, String str, c cVar) {
        this.f13614o = modifier;
        this.p = str;
        this.q = cVar;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-466005706, iIntValue, -1, "com.notescrafter.ui.components.BottomNavBar.<anonymous> (BottomNavBar.kt:75)");
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(this.f13614o, 0.0f, 1, null));
            float fM6403constructorimpl = Dp.m6403constructorimpl(20);
            Color.Companion companion = Color.Companion;
            Modifier modifierM3585shadows4CzXII$default = ShadowKt.m3585shadows4CzXII$default(modifierNavigationBarsPadding, fM6403constructorimpl, null, false, 0L, Color.m3926copywmQWz5c$default(companion.m3953getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM3585shadows4CzXII$default);
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
            O3.e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
            if (composerM3407constructorimpl.getInserting() || !o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
            }
            Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m207backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.m3926copywmQWz5c$default(p107y3.a.g, 0.95f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 6);
            NavigationBarKt.m2003NavigationBarHsRjFd4(null, companion.m3962getTransparent0d7_KjU(), p107y3.a.f15990o, Dp.m6403constructorimpl(0), null, ComposableLambdaKt.rememberComposableLambda(1655150755, true, new d(this.p, this.q), composer, 54), composer, 200112, 17);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
