package p104y0;

import android.content.Context;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.internal.ads.C0709Bf;
import com.google.android.gms.internal.ads.Et;
import com.google.android.gms.internal.ads.InterfaceC1711ti;
import com.google.android.gms.internal.ads.InterfaceC1938yp;
import com.google.android.gms.internal.ads.KE;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.SD;
import p013c2.c;
import p100x1.h;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements c, InterfaceC1711ti, InterfaceC1938yp, Et {
    public static m q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15859o;
    public int p;

    public static synchronized m f() {
        try {
            if (q == null) {
                q = new m(3, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q;
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.Et
    /* JADX INFO: renamed from: a */
    public Object mo6683a() {
        switch (this.f15859o) {
            case 10:
                return new HandlerThread(KE.d(this.p, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(KE.d(this.p, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }

    @Override // p013c2.c
    public int b(Context context, String str, boolean z3) {
        return 0;
    }

    public void c(String str, String str2, Throwable... thArr) {
        if (this.p <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // p013c2.c
    public int d(Context context, String str) {
        return this.p;
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.p <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void g(String str, String str2, Throwable... thArr) {
        if (this.p <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void i(String str, String str2, Throwable... thArr) {
        if (this.p <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public int j() {
        int i5 = this.p;
        if (i5 == 2) {
            return 10;
        }
        if (i5 == 5) {
            return 11;
        }
        if (i5 == 29) {
            return 12;
        }
        if (i5 == 42) {
            return 16;
        }
        if (i5 != 22) {
            return i5 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1711ti
    /* JADX INFO: renamed from: l */
    public void mo6677l(Object obj) {
        switch (this.f15859o) {
            case 4:
                ((h) obj).R1(this.p);
                break;
            case 5:
            case 6:
            default:
                ((SD) obj).n(this.p);
                break;
            case 7:
                ((SD) obj).p0(this.p);
                break;
            case 8:
                ((SD) obj).z(this.p);
                break;
        }
    }

    public /* synthetic */ m(int i5, int i6) {
        this.f15859o = i6;
        this.p = i5;
    }

    public /* synthetic */ m(RD rd, int i5) {
        this.f15859o = 8;
        this.p = i5;
    }

    public /* synthetic */ m(RD rd, int i5, long j5) {
        this.f15859o = 7;
        this.p = i5;
    }

    public /* synthetic */ m(RD rd, int i5, C0709Bf c0709Bf, C0709Bf c0709Bf2) {
        this.f15859o = 9;
        this.p = i5;
    }

    public /* synthetic */ m(m mVar) {
        this.f15859o = 6;
        this.p = mVar.p;
    }
}
