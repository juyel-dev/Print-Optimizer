package p105y1;

import java.util.ArrayList;
import p036i2.e;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f15951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[] f15952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f15953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f15954d;
    public int e;

    public p(e eVar) {
        ArrayList arrayList = (ArrayList) eVar.q;
        int size = arrayList.size();
        this.f15951a = (String[]) ((ArrayList) eVar.p).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            dArr[i5] = ((Double) arrayList.get(i5)).doubleValue();
        }
        this.f15952b = dArr;
        ArrayList arrayList2 = (ArrayList) eVar.f11537r;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i6 = 0; i6 < size3; i6++) {
            dArr2[i6] = ((Double) arrayList2.get(i6)).doubleValue();
        }
        this.f15953c = dArr2;
        this.f15954d = new int[size];
        this.e = 0;
    }
}
