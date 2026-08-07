package p015d;

import O3.c;
import androidx.lifecycle.InterfaceC0683w;
import kotlin.jvm.internal.p;
import p010c.F;
import p010c.v;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10943o;
    public final /* synthetic */ F p;
    public final /* synthetic */ InterfaceC0683w q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f10944r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(F f5, InterfaceC0683w interfaceC0683w, v vVar, int i5) {
        super(1);
        this.f10943o = i5;
        this.p = f5;
        this.q = interfaceC0683w;
        this.f10944r = vVar;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f10943o) {
            case 0:
                F f5 = this.p;
                InterfaceC0683w interfaceC0683w = this.q;
                h hVar = (h) this.f10944r;
                f5.a(interfaceC0683w, hVar);
                return new b(hVar, 1);
            default:
                F f6 = this.p;
                InterfaceC0683w interfaceC0683w2 = this.q;
                o oVar = (o) this.f10944r;
                f6.a(interfaceC0683w2, oVar);
                return new b(oVar, 2);
        }
    }
}
