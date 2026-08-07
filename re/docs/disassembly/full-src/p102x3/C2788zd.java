package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.service.PDFProcessor;
import p015d.l;
import p083t3.C2290i;

/* JADX INFO: renamed from: x3.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2788zd implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f15813A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ boolean f15814B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ a f15815C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ a f15816D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ State f15817E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f15818F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ MutableState f15819G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Modifier f15820o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ InterfaceC0200y q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f15821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f15822s;
    public final /* synthetic */ l t;
    public final /* synthetic */ State u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f15823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f15824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ double f15825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f15826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f15827z;

    public C2788zd(Modifier modifier, Context context, InterfaceC0200y interfaceC0200y, PrintOrderViewModel printOrderViewModel, PDFProcessor pDFProcessor, l lVar, State state, int i5, boolean z3, double d4, String str, int i6, boolean z4, boolean z5, a aVar, a aVar2, State state2, MutableState mutableState, MutableState mutableState2) {
        this.f15820o = modifier;
        this.p = context;
        this.q = interfaceC0200y;
        this.f15821r = printOrderViewModel;
        this.f15822s = pDFProcessor;
        this.t = lVar;
        this.u = state;
        this.f15823v = i5;
        this.f15824w = z3;
        this.f15825x = d4;
        this.f15826y = str;
        this.f15827z = i6;
        this.f15813A = z4;
        this.f15814B = z5;
        this.f15815C = aVar;
        this.f15816D = aVar2;
        this.f15817E = state2;
        this.f15818F = mutableState;
        this.f15819G = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-520857555, iIntValue, -1, "com.notescrafter.ui.screens.PrintOrderUploadScreen.<anonymous> (PrintOrderScreens.kt:156)");
            }
            Modifier modifierImePadding = WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(this.f15820o, 0.0f, 1, null));
            long jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
            WindowInsets windowInsetsM738WindowInsetsa9UjIt4$default = WindowInsetsKt.m738WindowInsetsa9UjIt4$default(Dp.m6403constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
            State state = this.u;
            boolean z3 = this.f15814B;
            a aVar = this.f15815C;
            ScaffoldKt.m2141ScaffoldTvnljyQ(modifierImePadding, null, ComposableLambdaKt.rememberComposableLambda(597418162, true, new C2645qd(this.f15825x, this.f15823v, this.f15827z, aVar, state, this.f15826y, this.f15824w, this.f15813A, z3), composer, 54), null, null, 0, jM3962getTransparent0d7_KjU, 0L, windowInsetsM738WindowInsetsa9UjIt4$default, ComposableLambdaKt.rememberComposableLambda(-281563908, true, new C2772yd(this.f15827z, this.f15816D, this.f15818F, this.f15819G, state, this.f15817E, this.f15821r, this.f15826y, this.f15814B), composer, 54), composer, 806879616, 186);
            MutableState mutableState = this.f15819G;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer.startReplaceGroup(1855712631);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Bb(6, mutableState);
                    composer.updateRememberedValue(objRememberedValue);
                }
                a aVar2 = (a) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1855714887);
                boolean zChangedInstance = composer.changedInstance(this.p) | composer.changedInstance(this.q) | composer.changedInstance(this.f15821r) | composer.changedInstance(this.f15822s);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new I3(this.p, this.q, this.f15821r, this.f15822s, this.f15819G, this.f15818F);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                c cVar = (c) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1855722683);
                l lVar = this.t;
                boolean zChangedInstance2 = composer.changedInstance(lVar);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new C2290i(22, lVar, mutableState);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                Gd.h(aVar2, cVar, (a) objRememberedValue3, composer, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
