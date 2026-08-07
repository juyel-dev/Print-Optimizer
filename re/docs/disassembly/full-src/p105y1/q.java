package p105y1;

import P0.c;
import com.google.android.gms.internal.ads.C0761Kd;
import com.google.android.gms.internal.ads.E;
import com.google.android.gms.internal.ads.G3;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.Xn;
import com.google.android.gms.internal.measurement.C;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends I3 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f15955A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final r f15956B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ byte[] f15957C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ HashMap f15958D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0761Kd f15959E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i5, String str, r rVar, C c5, byte[] bArr, HashMap map, C0761Kd c0761Kd) {
        super(i5, str, c5);
        this.f15957C = bArr;
        this.f15958D = map;
        this.f15959E = c0761Kd;
        this.f15955A = new Object();
        this.f15956B = rVar;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final c a(G3 g5) {
        String str;
        String str2;
        byte[] bArr = g5.f3735b;
        try {
            Map map = g5.f3736c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i5 = 1; i5 < strArrSplit.length; i5++) {
                    String[] strArrSplit2 = strArrSplit[i5].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new c(str, E.x(g5));
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final Map c() {
        HashMap map = this.f15958D;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(Object obj) {
        r rVar;
        String str = (String) obj;
        C0761Kd c0761Kd = this.f15959E;
        if (C0761Kd.c() && str != null) {
            c0761Kd.d("onNetworkResponseBody", new Xn(str.getBytes(), 19));
        }
        synchronized (this.f15955A) {
            rVar = this.f15956B;
        }
        rVar.b(str);
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final byte[] k() {
        byte[] bArr = this.f15957C;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
