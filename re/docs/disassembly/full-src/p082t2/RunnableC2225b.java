package p082t2;

import T1.z;
import p047l.C2174e;

/* JADX INFO: renamed from: t2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2225b implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12600o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2258s f12601r;

    public /* synthetic */ RunnableC2225b(C2258s c2258s, String str, long j5, int i5) {
        this.f12600o = i5;
        this.p = str;
        this.q = j5;
        this.f12601r = c2258s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12600o) {
            case 0:
                C2258s c2258s = this.f12601r;
                c2258s.h();
                String str = this.p;
                z.e(str);
                C2174e c2174e = c2258s.f12837c;
                boolean zIsEmpty = c2174e.isEmpty();
                long j5 = this.q;
                if (zIsEmpty) {
                    c2258s.f12838d = j5;
                }
                Integer num = (Integer) c2174e.get(str);
                if (num != null) {
                    c2174e.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c2174e.q < 100) {
                    c2174e.put(str, 1);
                    c2258s.f12836b.put(str, Long.valueOf(j5));
                } else {
                    c2258s.j().f12474i.g("Too many ads visible");
                }
                break;
            default:
                C2258s c2258s2 = this.f12601r;
                c2258s2.h();
                String str2 = this.p;
                z.e(str2);
                C2174e c2174e2 = c2258s2.f12837c;
                Integer num2 = (Integer) c2174e2.get(str2);
                if (num2 == null) {
                    c2258s2.j().f12472f.f(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    L0 l0S = c2258s2.l().s(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c2174e2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        c2174e2.remove(str2);
                        C2174e c2174e3 = c2258s2.f12836b;
                        Long l5 = (Long) c2174e3.get(str2);
                        long j6 = this.q;
                        if (l5 == null) {
                            c2258s2.j().f12472f.g("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j6 - l5.longValue();
                            c2174e3.remove(str2);
                            c2258s2.r(str2, jLongValue, l0S);
                        }
                        if (c2174e2.isEmpty()) {
                            long j7 = c2258s2.f12838d;
                            if (j7 != 0) {
                                c2258s2.p(j6 - j7, l0S);
                                c2258s2.f12838d = 0L;
                            } else {
                                c2258s2.j().f12472f.g("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
