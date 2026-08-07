package p067p1;

import T1.z;
import android.content.Context;
import com.google.android.gms.internal.ads.BinderC1923ya;
import p090v1.C2352j;
import p090v1.C2358m;
import p090v1.C2362o;
import p090v1.E;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f12259b;

    public b(Context context, String str) {
        z.j(context, "context cannot be null");
        C2358m c2358m = C2362o.f13474f.f13476b;
        BinderC1923ya binderC1923ya = new BinderC1923ya();
        c2358m.getClass();
        E e = (E) new C2352j(c2358m, context, str, binderC1923ya).d(context, false);
        this.f12258a = context;
        this.f12259b = e;
    }
}
