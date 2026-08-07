package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.widget.Toast;
import kotlin.jvm.internal.C;

/* JADX INFO: loaded from: classes2.dex */
public final class Dd extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f13876o;
    public final /* synthetic */ C p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dd(Context context, C c5, d dVar) {
        super(2, dVar);
        this.f13876o = context;
        this.p = c5;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Dd(this.f13876o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Dd dd = (Dd) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        dd.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Toast.makeText(this.f13876o, "This PDF has only " + this.p.f11692o + " pages. Minimum is 20 pages per notebook.", 1).show();
        return o.f154a;
    }
}
