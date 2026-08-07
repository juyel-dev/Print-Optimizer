package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import java.util.regex.Pattern;
import p083t3.C2324z0;

/* JADX INFO: renamed from: x3.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2419cb extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f14888o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14890s;
    public final /* synthetic */ MutableState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2419cb(PrintOrderViewModel printOrderViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, d dVar) {
        super(2, dVar);
        this.f14888o = printOrderViewModel;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14889r = mutableState3;
        this.f14890s = mutableState4;
        this.t = mutableState5;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2419cb(this.f14888o, this.p, this.q, this.f14889r, this.f14890s, this.t, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2419cb c2419cb = (C2419cb) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2419cb.invokeSuspend(oVar);
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        String input = (String) this.p.getValue();
        Pattern patternCompile = Pattern.compile("\\D");
        kotlin.jvm.internal.o.e(patternCompile, "compile(...)");
        kotlin.jvm.internal.o.f(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("");
        kotlin.jvm.internal.o.e(strReplaceAll, "replaceAll(...)");
        String strF0 = W3.j.F0(6, strReplaceAll);
        int length = strF0.length();
        MutableState mutableState = this.f14889r;
        if (length == 6) {
            Boolean bool = Boolean.TRUE;
            MutableState mutableState2 = this.q;
            mutableState2.setValue(bool);
            mutableState.setValue(null);
            C2492h4 c2492h4 = new C2492h4(mutableState2, this.f14890s, this.t, mutableState);
            PrintOrderViewModel printOrderViewModel = this.f14888o;
            printOrderViewModel.getClass();
            p019e0.a aVarH = Q.h(printOrderViewModel);
            e4.e eVar = H.f1766a;
            A.t(aVarH, e4.d.f11107o, null, new C2324z0(printOrderViewModel, strF0, c2492h4, null), 2);
        } else {
            mutableState.setValue(null);
        }
        return o.f154a;
    }
}
