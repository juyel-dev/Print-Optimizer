package p083t3;

import A2.m;
import A2.s;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.util.Log;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SnackbarResult;
import p101x2.i;
import p111z2.f;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13211o;
    public final /* synthetic */ SnackbarHostState p;
    public final /* synthetic */ p036i2.e q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(SnackbarHostState snackbarHostState, p036i2.e eVar, d dVar) {
        super(2, dVar);
        this.p = snackbarHostState;
        this.q = eVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new r(this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f13211o;
        if (i5 == 0) {
            o4.d.y(obj);
            SnackbarDuration snackbarDuration = SnackbarDuration.Indefinite;
            this.f13211o = 1;
            obj = SnackbarHostState.showSnackbar$default(this.p, "An update has just been downloaded.", "RESTART", false, snackbarDuration, this, 4, null);
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
            p111z2.d dVar = (p111z2.d) this.q.p;
            String packageName = dVar.f16092c.getPackageName();
            p111z2.j jVar = dVar.f16090a;
            s sVar = jVar.f16099a;
            if (sVar == null) {
                Object[] objArr = {-9};
                m mVar = p111z2.j.e;
                mVar.getClass();
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", m.i(mVar.p, "onError(%d)", objArr));
                }
                p000a.a.n(new B2.a(-9));
            } else {
                p111z2.j.e.f("completeUpdate(%s)", packageName);
                i iVar = new i();
                sVar.a().post(new f(sVar, iVar, iVar, new f(jVar, iVar, iVar, packageName, 1), 2));
            }
        }
        return o.f154a;
    }
}
