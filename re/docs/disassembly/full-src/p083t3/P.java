package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.widget.Toast;
import p092v3.h;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13091o;
    public final /* synthetic */ h p;
    public final /* synthetic */ Context q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(h hVar, Context context, d dVar) {
        super(2, dVar);
        this.p = hVar;
        this.q = context;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new P(this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        a aVar = a.f448o;
        int i5 = this.f13091o;
        Context context = this.q;
        if (i5 == 0) {
            o4.d.y(obj);
            this.f13091o = 1;
            objB = this.p.b(context, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
            objB = ((k) obj).f150o;
        }
        if (!(objB instanceof B3.j)) {
            Toast.makeText(context, "Welcome, " + ((String) objB) + "!", 0).show();
        }
        Throwable thA = k.a(objB);
        if (thA != null && !kotlin.jvm.internal.o.b(thA.getMessage(), "Sign-in cancelled")) {
            Toast.makeText(context, "Sign-in failed: " + thA.getMessage(), 0).show();
        }
        return o.f154a;
    }
}
