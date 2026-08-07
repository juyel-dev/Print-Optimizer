package p092v3;

import B3.o;
import O3.c;
import java.util.concurrent.ConcurrentHashMap;
import p083t3.C2275a0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ConcurrentHashMap f13578o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f13579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2275a0 f13580s;

    public /* synthetic */ s(ConcurrentHashMap concurrentHashMap, int i5, int i6, long j5, C2275a0 c2275a0) {
        this.f13578o = concurrentHashMap;
        this.p = i5;
        this.q = i6;
        this.f13579r = j5;
        this.f13580s = c2275a0;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        Long l5 = (Long) obj;
        l5.getClass();
        Integer numValueOf = Integer.valueOf(this.p);
        ConcurrentHashMap concurrentHashMap = this.f13578o;
        concurrentHashMap.put(numValueOf, l5);
        long jLongValue = 0;
        for (int i5 = 0; i5 < this.q; i5++) {
            Long l6 = (Long) concurrentHashMap.get(Integer.valueOf(i5));
            jLongValue += l6 != null ? l6.longValue() : 0L;
        }
        this.f13580s.invoke(Integer.valueOf(Math.min(98, ((int) ((jLongValue / this.f13579r) * ((double) 90))) + 5)));
        return o.f154a;
    }
}
