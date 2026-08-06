package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O1.i;
import O3.e;
import X3.InterfaceC0200y;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import g4.p;
import g4.t;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class S0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13101o;
    public final /* synthetic */ String p;
    public final /* synthetic */ J q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f13102r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(PrintOrderViewModel printOrderViewModel, String str, J j5, D d4, d dVar) {
        super(2, dVar);
        this.f13101o = printOrderViewModel;
        this.p = str;
        this.q = j5;
        this.f13102r = d4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        J j5 = this.q;
        D d4 = this.f13102r;
        return new S0(this.f13101o, this.p, j5, d4, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        S0 s2 = (S0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        s2.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13101o;
        C2117x c2117x = printOrderViewModel.f10891c;
        J j5 = this.q;
        String str = this.p;
        C2291i0 c2291i0 = new C2291i0(printOrderViewModel, j5, str, this.f13102r, 1);
        c2117x.getClass();
        b bVarC = c2117x.c("https://notescrafter.com/api/print/shipping-addresses/" + str + "/default");
        String string = new JSONObject().toString();
        kotlin.jvm.internal.o.e(string, "toString(...)");
        Pattern pattern = p.f11330d;
        bVarC.i("POST", p003a2.a.g(string, p111z2.b.k("application/json")));
        ((t) c2117x.q).a(bVarC.d()).e(new i(c2291i0, 23));
        return o.f154a;
    }
}
