package p078s1;

import com.google.android.gms.internal.ads.C1131gE;
import com.google.android.gms.internal.ads.ID;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12345d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12346f;
    public boolean g;

    public c() {
        this.f12342a = false;
        this.f12343b = -1;
        this.f12344c = 0;
        this.f12345d = false;
        this.e = 1;
        this.g = false;
    }

    public void a(int i5) {
        this.f12342a = 1 == ((this.f12342a ? 1 : 0) | i5);
        this.f12343b += i5;
    }

    public c(ID id) {
        this.f12346f = id;
    }

    public /* synthetic */ c(c cVar) {
        this.f12342a = cVar.f12342a;
        this.f12343b = cVar.f12343b;
        this.f12344c = cVar.f12344c;
        this.f12345d = cVar.f12345d;
        this.e = cVar.e;
        this.f12346f = (C1131gE) cVar.f12346f;
        this.g = cVar.g;
    }
}
