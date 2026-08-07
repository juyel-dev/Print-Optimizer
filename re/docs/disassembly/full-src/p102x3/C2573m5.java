package p102x3;

import O3.a;
import java.util.List;

/* JADX INFO: renamed from: x3.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2573m5 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15309o;
    public final /* synthetic */ List p;

    public /* synthetic */ C2573m5(List list, int i5) {
        this.f15309o = i5;
        this.p = list;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f15309o) {
            case 0:
                return Integer.valueOf(this.p.size());
            default:
                return Integer.valueOf(this.p.size() + 1);
        }
    }
}
