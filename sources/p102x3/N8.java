package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import O3.g;
import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.p;
import n4.l;
import p097w3.j;

/* JADX INFO: loaded from: classes2.dex */
public final class N8 extends p implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14224o;
    public final /* synthetic */ List p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N8(List list, Object obj, int i5) {
        super(4);
        this.f14224o = i5;
        this.p = list;
        this.q = obj;
    }

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        o oVar = o.f154a;
        Object obj5 = this.q;
        List list = this.p;
        switch (this.f14224o) {
            case 0:
                LazyItemScope lazyItemScope = (LazyItemScope) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i5 = (iIntValue2 & 6) == 0 ? iIntValue2 | (composer.changed(lazyItemScope) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i5 |= composer.changed(iIntValue) ? 32 : 16;
                }
                int i6 = i5;
                if ((i6 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i6, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                    }
                    C6 c6 = (C6) list.get(iIntValue);
                    composer.startReplaceGroup(2000135963);
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierAnimateItem$default = LazyItemScope.animateItem$default(lazyItemScope, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, 7, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnimateItem$default);
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
                    e eVarG = p035i0.a.g(companion2, composerM3407constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3407constructorimpl, currentCompositionLocalMap);
                    if (composerM3407constructorimpl.getInserting() || !kotlin.jvm.internal.o.b(composerM3407constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        p035i0.a.t(currentCompositeKeyHash, composerM3407constructorimpl, currentCompositeKeyHash, eVarG);
                    }
                    Updater.m3414setimpl(composerM3407constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    j.a(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(5), 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1070004404, true, new K8(iIntValue, c6, (MutableState) obj5), composer, 54), composer, 196614, 30);
                    composer.endNode();
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            case 1:
                LazyItemScope lazyItemScope2 = (LazyItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i7 = (iIntValue4 & 6) == 0 ? iIntValue4 | (composer2.changed(lazyItemScope2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i7 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if ((i7 & 147) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1091073711, i7, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                    }
                    C2661re c2661re = (C2661re) list.get(iIntValue3);
                    composer2.startReplaceGroup(838380856);
                    j.a(PaddingKt.m670paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, Dp.m6403constructorimpl(5), 1, null), 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-127114891, true, new C2609o9(iIntValue3, (Context) obj5, c2661re), composer2, 54), composer2, 196614, 30);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i8 = (iIntValue6 & 6) == 0 ? iIntValue6 | (composer3.changed(lazyGridItemScope) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i8 |= composer3.changed(iIntValue5) ? 32 : 16;
                }
                if ((i8 & 147) == 146 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(699646206, i8, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                    }
                    Rd rd = (Rd) list.get(iIntValue5);
                    composer3.startReplaceGroup(-1490178993);
                    composer3.startReplaceGroup(-1987731949);
                    c cVar = (c) obj5;
                    boolean zChanged = composer3.changed(rd) | composer3.changed(cVar);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new l(5, rd, cVar);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    Ud.b(rd, (a) objRememberedValue, composer3, 0);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return oVar;
    }
}
