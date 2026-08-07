package p015d;

import B3.o;
import O3.a;
import kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f10942o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, boolean z3) {
        super(0);
        this.f10942o = hVar;
        this.p = z3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O3.a, kotlin.jvm.internal.l] */
    @Override // O3.a
    public final Object invoke() {
        h hVar = this.f10942o;
        hVar.f2524a = this.p;
        ?? r1 = hVar.f2526c;
        if (r1 != 0) {
            r1.invoke();
        }
        return o.f154a;
    }
}
