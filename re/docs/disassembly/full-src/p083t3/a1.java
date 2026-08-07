package p083t3;

import B3.k;
import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.SharedPreferences;
import com.notescrafter.PrintOrderViewModel;
import p102x3.Pa;
import p102x3.Va;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f13145o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ Pa q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Va f13147s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k kVar, PrintOrderViewModel printOrderViewModel, Pa pa, String str, Va va, d dVar) {
        super(2, dVar);
        this.f13145o = kVar;
        this.p = printOrderViewModel;
        this.q = pa;
        this.f13146r = str;
        this.f13147s = va;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        String str = this.f13146r;
        Va va = this.f13147s;
        return new a1(this.f13145o, this.p, this.q, str, va, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        a1 a1Var = (a1) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        a1Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Object obj2 = this.f13145o.f150o;
        if (!(obj2 instanceof B3.j)) {
            SharedPreferences.Editor editorEdit = this.p.f10889b.getSharedPreferences("auth_prefs", 0).edit();
            editorEdit.putString("user_phone", this.f13146r);
            editorEdit.putBoolean("user_phone_verified", true);
            editorEdit.apply();
            this.q.invoke();
        }
        Throwable thA = k.a(obj2);
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Verification failed";
            }
            this.f13147s.invoke(message);
        }
        return o.f154a;
    }
}
