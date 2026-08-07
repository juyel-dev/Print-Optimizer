package p009b3;

import p014c3.b;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2427a;

    public g(i iVar) {
        this.f2427a = iVar;
    }

    @Override // p009b3.i
    public final boolean a(b bVar) {
        int i5 = bVar.f2574b;
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            return false;
        }
        this.f2427a.d(bVar.f2573a);
        return true;
    }

    @Override // p009b3.i
    public final boolean b(Exception exc) {
        return false;
    }
}
