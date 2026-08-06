package p097w3;

import C3.v;
import O3.a;
import O3.c;
import O3.f;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.NavigationBarItemDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.o;
import p083t3.C2290i;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f13613o;
    public final /* synthetic */ c p;

    public d(String str, c cVar) {
        this.f13613o = str;
        this.p = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zB;
        RowScope NavigationBar = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(NavigationBar, "$this$NavigationBar");
        int i5 = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(NavigationBar) ? 4 : 2;
        }
        int i6 = iIntValue;
        if ((i6 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1655150755, i6, -1, "com.notescrafter.ui.components.BottomNavBar.<anonymous>.<anonymous>.<anonymous> (BottomNavBar.kt:93)");
            }
            int i7 = 0;
            for (Object obj4 : f.f13615a) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    v.X();
                    throw null;
                }
                r rVar = (r) obj4;
                boolean zEquals = rVar.f13634c.equals("home");
                String str = this.f13613o;
                if (!zEquals) {
                    String str2 = rVar.f13634c;
                    if (str2.equals("settings")) {
                        if (o.b(str, "settings") || o.b(str, "my-addresses") || o.b(str, "community-pass")) {
                            zB = true;
                        } else {
                            zB = false;
                        }
                    } else if (!str2.equals("contact-us")) {
                        zB = o.b(str, str2);
                    } else if (o.b(str, "contact-us") || o.b(str, "live-chat")) {
                        zB = true;
                    } else {
                        zB = false;
                    }
                } else if (o.b(str, "home") || o.b(str, "flow") || o.b(str, "how-to-print") || o.b(str, "tools") || o.b(str, "print-price-calculator")) {
                    zB = true;
                } else {
                    zB = false;
                }
                boolean z3 = i7 == i5;
                composer.startReplaceGroup(-1322859292);
                c cVar = this.p;
                boolean zChanged = composer.changed(cVar) | composer.changed(rVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new C2290i(3, cVar, rVar);
                    composer.updateRememberedValue(objRememberedValue);
                }
                a aVar = (a) objRememberedValue;
                composer.endReplaceGroup();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1503080881, true, new b(z3, rVar, zB), composer, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1432745838, true, new c(rVar, zB), composer, 54);
                NavigationBarItemDefaults navigationBarItemDefaults = NavigationBarItemDefaults.INSTANCE;
                long jM3962getTransparent0d7_KjU = Color.Companion.m3962getTransparent0d7_KjU();
                long j5 = p107y3.a.f15978a;
                long j6 = p107y3.a.q;
                NavigationBarKt.NavigationBarItem(NavigationBar, zB, aVar, composableLambdaRememberComposableLambda, null, false, composableLambdaRememberComposableLambda2, false, navigationBarItemDefaults.m2001colors69fazGs(j5, j5, jM3962getTransparent0d7_KjU, j6, j6, 0L, 0L, composer, (NavigationBarItemDefaults.$stable << 21) | 28086, 96), null, composer, (i6 & 14) | 1575936, 344);
                composer = composer;
                i6 = i6;
                i5 = i5;
                i7 = i8;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
