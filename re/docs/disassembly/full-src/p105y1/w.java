package p105y1;

import android.content.Context;
import com.google.android.gms.internal.ads.C0779Nd;
import p082t2.AbstractC2252o0;
import p085u1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractC2252o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0779Nd f15964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15965c;

    public w(Context context, String str, String str2) {
        this.f15964b = new C0779Nd(k.f13311A.f13314c.v(context, str));
        this.f15965c = str2;
    }

    @Override // p082t2.AbstractC2252o0
    public final void c() {
        this.f15964b.k(this.f15965c);
    }
}
