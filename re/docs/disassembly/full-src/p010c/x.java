package p010c;

import B3.o;
import O3.a;
import kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes.dex */
public final class x extends p implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2528o;
    public final /* synthetic */ F p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(F f5, int i5) {
        super(0);
        this.f2528o = i5;
        this.p = f5;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f2528o) {
            case 0:
                this.p.c();
                break;
            case 1:
                this.p.b();
                break;
            default:
                this.p.c();
                break;
        }
        return o.f154a;
    }
}
