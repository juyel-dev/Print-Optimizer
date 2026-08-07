package p099x0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p035i0.a;
import p047l.C2174e;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f13670d;
    public final Parcel e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13671f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13675k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2174e(0), new C2174e(0), new C2174e(0));
    }

    @Override // p099x0.a
    public final b a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i5 = this.f13674j;
        if (i5 == this.f13671f) {
            i5 = this.g;
        }
        return new b(parcel, iDataPosition, i5, a.p(new StringBuilder(), this.f13672h, "  "), this.f13667a, this.f13668b, this.f13669c);
    }

    @Override // p099x0.a
    public final boolean e(int i5) {
        while (this.f13674j < this.g) {
            int i6 = this.f13675k;
            if (i6 == i5) {
                return true;
            }
            if (String.valueOf(i6).compareTo(String.valueOf(i5)) > 0) {
                return false;
            }
            int i7 = this.f13674j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i7);
            int i8 = parcel.readInt();
            this.f13675k = parcel.readInt();
            this.f13674j += i8;
        }
        return this.f13675k == i5;
    }

    @Override // p099x0.a
    public final void h(int i5) {
        int i6 = this.f13673i;
        SparseIntArray sparseIntArray = this.f13670d;
        Parcel parcel = this.e;
        if (i6 >= 0) {
            int i7 = sparseIntArray.get(i6);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i7);
            parcel.writeInt(iDataPosition - i7);
            parcel.setDataPosition(iDataPosition);
        }
        this.f13673i = i5;
        sparseIntArray.put(i5, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i5);
    }

    public b(Parcel parcel, int i5, int i6, String str, C2174e c2174e, C2174e c2174e2, C2174e c2174e3) {
        super(c2174e, c2174e2, c2174e3);
        this.f13670d = new SparseIntArray();
        this.f13673i = -1;
        this.f13675k = -1;
        this.e = parcel;
        this.f13671f = i5;
        this.g = i6;
        this.f13674j = i5;
        this.f13672h = str;
    }
}
