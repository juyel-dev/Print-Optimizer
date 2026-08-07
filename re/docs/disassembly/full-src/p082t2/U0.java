package p082t2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import p081t1.a;
import p081t1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class U0 extends h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12561d;
    public final W e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final W f12562f;
    public final W g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final W f12563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final W f12564i;

    public U0(j1 j1Var) {
        super(j1Var);
        this.f12561d = new HashMap();
        this.e = new W(f(), "last_delete_stale", 0L);
        this.f12562f = new W(f(), "backoff", 0L);
        this.g = new W(f(), "last_upload", 0L);
        this.f12563h = new W(f(), "last_upload_attempt", 0L);
        this.f12564i = new W(f(), "midnight_offset", 0L);
    }

    @Override // p082t2.h1
    public final boolean q() {
        return false;
    }

    public final String r(String str, boolean z3) {
        h();
        String str2 = z3 ? (String) s(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestV0 = n1.v0();
        if (messageDigestV0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestV0.digest(str2.getBytes())));
    }

    public final Pair s(String str) {
        V0 v4;
        a aVarA;
        h();
        C2236g0 c2236g0 = (C2236g0) this.f12783a;
        c2236g0.f12686n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f12561d;
        V0 v5 = (V0) map.get(str);
        if (v5 != null && jElapsedRealtime < v5.f12571c) {
            return new Pair(v5.f12569a, Boolean.valueOf(v5.f12570b));
        }
        C2235g c2235g = c2236g0.g;
        c2235g.getClass();
        long jQ = c2235g.q(str, AbstractC2268x.f12937c) + jElapsedRealtime;
        try {
            long jQ2 = c2235g.q(str, AbstractC2268x.f12939d);
            Context context = c2236g0.f12675a;
            if (jQ2 > 0) {
                try {
                    aVarA = b.a(context);
                } catch (PackageManager.NameNotFoundException unused) {
                    if (v5 != null && jElapsedRealtime < v5.f12571c + jQ2) {
                        return new Pair(v5.f12569a, Boolean.valueOf(v5.f12570b));
                    }
                    aVarA = null;
                }
            } else {
                aVarA = b.a(context);
            }
            if (aVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = aVarA.f12378a;
            boolean z3 = aVarA.f12379b;
            v4 = str2 != null ? new V0(jQ, str2, z3) : new V0(jQ, "", z3);
            map.put(str, v4);
            return new Pair(v4.f12569a, Boolean.valueOf(v4.f12570b));
        } catch (Exception e) {
            j().f12478m.f(e, "Unable to get advertising id");
            v4 = new V0(jQ, "", false);
        }
    }
}
