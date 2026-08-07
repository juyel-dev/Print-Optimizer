package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SnackbarResult;
import androidx.compose.runtime.MutableState;

/* JADX INFO: renamed from: t3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2302o extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13200o;
    public final /* synthetic */ SnackbarHostState p;
    public final /* synthetic */ Y q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f13201r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2302o(SnackbarHostState snackbarHostState, Y y4, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.p = snackbarHostState;
        this.q = y4;
        this.f13201r = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2302o(this.p, this.q, this.f13201r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2302o) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f13200o;
        if (i5 == 0) {
            o4.d.y(obj);
            SnackbarDuration snackbarDuration = SnackbarDuration.Indefinite;
            this.f13200o = 1;
            obj = SnackbarHostState.showSnackbar$default(this.p, "No Internet Connection. You can only view Downloads.", "GO TO DOWNLOADS", false, snackbarDuration, this, 4, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        if (((SnackbarResult) obj) == SnackbarResult.ActionPerformed) {
            this.f13201r.setValue("home");
            this.q.g(-1);
        }
        return o.f154a;
    }
}
