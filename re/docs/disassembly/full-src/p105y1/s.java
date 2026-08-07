package p105y1;

import D.j;
import P0.c;
import com.google.android.gms.internal.ads.C0761Kd;
import com.google.android.gms.internal.ads.C0809Sd;
import com.google.android.gms.internal.ads.C1945yw;
import com.google.android.gms.internal.ads.E;
import com.google.android.gms.internal.ads.G3;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.Xn;
import java.util.Map;
import p090v1.C2358m;
import p100x1.l;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends I3 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0809Sd f15960A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0761Kd f15961B;

    public s(String str, C0809Sd c0809Sd) {
        super(0, str, new l(c0809Sd));
        this.f15960A = c0809Sd;
        C0761Kd c0761Kd = new C0761Kd();
        this.f15961B = c0761Kd;
        if (C0761Kd.c()) {
            c0761Kd.d("onNetworkRequest", new C2358m(str, "GET", (Object) null, (Object) null));
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final c a(G3 g5) {
        return new c(g5, E.x(g5));
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(Object obj) {
        byte[] bArr;
        G3 g5 = (G3) obj;
        Map map = g5.f3736c;
        C0761Kd c0761Kd = this.f15961B;
        c0761Kd.getClass();
        if (C0761Kd.c()) {
            int i5 = g5.f3734a;
            c0761Kd.d("onNetworkResponse", new j(i5, map));
            if (i5 < 200 || i5 >= 300) {
                c0761Kd.d("onNetworkRequestError", new C1945yw(null, 6));
            }
        }
        if (C0761Kd.c() && (bArr = g5.f3735b) != null) {
            c0761Kd.d("onNetworkResponseBody", new Xn(bArr, 19));
        }
        this.f15960A.b(g5);
    }
}
