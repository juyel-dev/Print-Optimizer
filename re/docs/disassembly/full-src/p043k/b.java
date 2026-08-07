package p043k;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11607o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ c q;

    public b(c cVar, int i5, Uri uri, boolean z3, Bundle bundle) {
        this.q = cVar;
        this.f11607o = i5;
        this.p = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.p.f(this.f11607o, this.p);
    }
}
