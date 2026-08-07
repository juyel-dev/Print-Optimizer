package p043k;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11606o = 1;
    public final /* synthetic */ c p;

    public a(c cVar, String str, Bundle bundle) {
        this.p = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11606o) {
            case 0:
                this.p.p.a();
                break;
            default:
                this.p.p.c();
                break;
        }
    }

    public a(c cVar, Bundle bundle) {
        this.p = cVar;
    }
}
