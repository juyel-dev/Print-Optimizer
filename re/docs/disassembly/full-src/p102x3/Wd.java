package p102x3;

import O3.c;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Wd implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14612o;
    public final /* synthetic */ c p;

    public /* synthetic */ Wd(c cVar, int i5) {
        this.f14612o = i5;
        this.p = cVar;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        List uris = (List) obj;
        switch (this.f14612o) {
            case 0:
                o.f(uris, "uris");
                if (!uris.isEmpty()) {
                    this.p.invoke(uris);
                }
                break;
            default:
                o.f(uris, "uris");
                if (!uris.isEmpty()) {
                    this.p.invoke(uris);
                }
                break;
        }
        return B3.o.f154a;
    }
}
