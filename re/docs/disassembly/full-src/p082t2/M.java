package p082t2;

import T1.z;
import Y1.b;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.ads.C1003da;
import java.io.IOException;
import java.util.Map;
import p035i0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12485o = 1;
    public final int p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f12486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12487s;
    public final Object t;
    public final Object u;

    public M(String str, O o5, int i5, IOException iOException, byte[] bArr, Map map) {
        z.i(o5);
        this.f12486r = o5;
        this.p = i5;
        this.f12487s = iOException;
        this.t = bArr;
        this.q = str;
        this.u = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12485o) {
            case 0:
                U u = ((C2236g0) ((L) this.u).f12783a).f12680h;
                C2236g0.f(u);
                if (!u.f12771b) {
                    Log.println(6, ((L) this.u).y(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                L l5 = (L) this.u;
                if (l5.f12470c == 0) {
                    C2235g c2235g = ((C2236g0) l5.f12783a).g;
                    if (c2235g.e == null) {
                        synchronized (c2235g) {
                            try {
                                if (c2235g.e == null) {
                                    ApplicationInfo applicationInfo = ((C2236g0) c2235g.f12783a).f12675a.getApplicationInfo();
                                    String strG = b.g();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c2235g.e = Boolean.valueOf(str != null && str.equals(strG));
                                    }
                                    if (c2235g.e == null) {
                                        c2235g.e = Boolean.TRUE;
                                        c2235g.j().f12472f.g("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (c2235g.e.booleanValue()) {
                        ((L) this.u).f12470c = 'C';
                    } else {
                        ((L) this.u).f12470c = 'c';
                    }
                    break;
                }
                L l6 = (L) this.u;
                if (l6.f12471d < 0) {
                    l6.f12471d = 84002L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.p);
                L l7 = (L) this.u;
                char c5 = l7.f12470c;
                long j5 = l7.f12471d;
                String strP = L.p(true, this.q, this.f12486r, this.f12487s, this.t);
                StringBuilder sb = new StringBuilder("2");
                sb.append(cCharAt);
                sb.append(c5);
                sb.append(j5);
                String strP2 = a.p(sb, ":", strP);
                if (strP2.length() > 1024) {
                    strP2 = this.q.substring(0, Fields.RotationZ);
                }
                C1003da c1003da = u.f12545f;
                if (c1003da != null) {
                    U u5 = (U) c1003da.e;
                    u5.h();
                    if (((U) c1003da.e).s().getLong((String) c1003da.f6942b, 0L) == 0) {
                        c1003da.c();
                    }
                    if (strP2 == null) {
                        strP2 = "";
                    }
                    SharedPreferences sharedPreferencesS = u5.s();
                    String str2 = (String) c1003da.f6943c;
                    long j6 = sharedPreferencesS.getLong(str2, 0L);
                    String str3 = (String) c1003da.f6944d;
                    if (j6 <= 0) {
                        SharedPreferences.Editor editorEdit = u5.s().edit();
                        editorEdit.putString(str3, strP2);
                        editorEdit.putLong(str2, 1L);
                        editorEdit.apply();
                        return;
                    }
                    long j7 = j6 + 1;
                    boolean z3 = (u5.g().w0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j7;
                    SharedPreferences.Editor editorEdit2 = u5.s().edit();
                    if (z3) {
                        editorEdit2.putString(str3, strP2);
                    }
                    editorEdit2.putLong(str2, j7);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((O) this.f12486r).c(this.q, this.p, (IOException) this.f12487s, (byte[]) this.t, (Map) this.u);
                return;
        }
    }

    public M(L l5, int i5, String str, Object obj, Object obj2, Object obj3) {
        this.p = i5;
        this.q = str;
        this.f12486r = obj;
        this.f12487s = obj2;
        this.t = obj3;
        this.u = l5;
    }
}
