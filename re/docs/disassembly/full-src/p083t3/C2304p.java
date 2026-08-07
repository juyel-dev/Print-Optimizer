package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.NetworkUtils;

/* JADX INFO: renamed from: t3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2304p extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f13204o;
    public final /* synthetic */ InterfaceC0200y p;
    public final /* synthetic */ SnackbarHostState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y f13205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f13206s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2304p(Context context, InterfaceC0200y interfaceC0200y, SnackbarHostState snackbarHostState, Y y4, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f13204o = context;
        this.p = interfaceC0200y;
        this.q = snackbarHostState;
        this.f13205r = y4;
        this.f13206s = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2304p(this.f13204o, this.p, this.q, this.f13205r, this.f13206s, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2304p c2304p = (C2304p) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2304p.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        if (!NetworkUtils.INSTANCE.isInternetAvailable(this.f13204o)) {
            A.t(this.p, null, null, new C2302o(this.q, this.f13205r, this.f13206s, null), 3);
        }
        return o.f154a;
    }
}
