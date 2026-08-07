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
public final class Ed extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f13940o;
    public final /* synthetic */ C p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ed(Context context, C c5, d dVar) {
        super(2, dVar);
        this.f13940o = context;
        this.p = c5;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Ed(this.f13940o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        Ed ed = (Ed) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        ed.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Toast.makeText(this.f13940o, "This PDF has " + this.p.f11692o + " pages. Maximum is 250 pages per notebook. Please split it and try again.", 1).show();
        return o.f154a;
    }
}
