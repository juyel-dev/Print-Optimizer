package p083t3;

import O3.c;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: t3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2317w implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13221o;
    public final /* synthetic */ Y p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ C2317w(Y y4, MutableState mutableState, int i5) {
        this.f13221o = i5;
        this.p = y4;
        this.q = mutableState;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        String route = (String) obj;
        switch (this.f13221o) {
            case 0:
                o.f(route, "route");
                this.q.setValue(route);
                if (route.equals("flow")) {
                    Y y4 = this.p;
                    y4.h();
                    y4.g(0);
                }
                break;
            default:
                o.f(route, "route");
                boolean zEquals = route.equals("downloads");
                MutableState mutableState = this.q;
                if (zEquals) {
                    mutableState.setValue("home");
                    this.p.g(-1);
                } else {
                    mutableState.setValue(route);
                }
                break;
        }
        return B3.o.f154a;
    }
}
