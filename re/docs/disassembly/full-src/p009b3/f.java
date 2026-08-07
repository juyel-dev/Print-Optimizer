package p009b3;

import p014c3.b;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f2425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2426b;

    public f(j jVar, i iVar) {
        this.f2425a = jVar;
        this.f2426b = iVar;
    }

    @Override // p009b3.i
    public final boolean a(b bVar) {
        if (bVar.f2574b != 4 || this.f2425a.a(bVar)) {
            return false;
        }
        String str = bVar.f2575c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f2426b.b(new a(bVar.e, str, bVar.f2577f));
        return true;
    }

    @Override // p009b3.i
    public final boolean b(Exception exc) {
        this.f2426b.c(exc);
        return true;
    }
}
