package p102x3;

import O3.f;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.o;
import p097w3.j;
import p107y3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class V8 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14526o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14527r;

    public V8(int i5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f14526o = i5;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14527r = mutableState3;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-486966906, iIntValue, -1, "com.notescrafter.ui.screens.PdfOrganizeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PdfOrganizeScreen.kt:841)");
        }
        j.a(PaddingKt.m672paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6403constructorimpl(12), 7, null), 0L, Color.m3926copywmQWz5c$default(a.f15978a, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1719629185, true, new U8(this.f14526o, this.p, this.q, this.f14527r), composer, 54), composer, 196998, 26);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return B3.o.f154a;
    }
}
