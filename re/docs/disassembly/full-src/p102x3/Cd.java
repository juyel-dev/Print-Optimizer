package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.widget.Toast;

/* JADX INFO: loaded from: classes2.dex */
public final class Cd extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f13851o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(Context context, d dVar) {
        super(2, dVar);
        this.f13851o = context;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Cd(this.f13851o, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Cd cd = (Cd) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        cd.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Toast.makeText(this.f13851o, "Could not read this PDF. Please try a different file.", 1).show();
        return o.f154a;
    }
}
