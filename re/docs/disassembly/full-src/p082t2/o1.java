package p082t2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends a {
    public static final Parcelable.Creator<o1> CREATOR = new C2229d(5);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f12784A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f12785B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f12786C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f12787D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f12788E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Boolean f12789F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f12790G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final List f12791H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f12792I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final String f12793J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final String f12794K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final String f12795L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f12796M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final long f12797N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f12798O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final String f12799P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f12800Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final long f12801R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final String f12802S;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f12803o;
    public final String p;
    public final String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f12805s;
    public final long t;
    public final String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f12806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f12808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f12809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f12810z;

    public o1(String str, String str2, String str3, long j5, String str4, long j6, long j7, String str5, boolean z3, boolean z4, String str6, long j8, int i5, boolean z5, boolean z6, String str7, Boolean bool, long j9, List list, String str8, String str9, String str10, boolean z7, long j10, int i6, String str11, int i7, long j11, String str12) {
        z.e(str);
        this.f12803o = str;
        this.p = TextUtils.isEmpty(str2) ? null : str2;
        this.q = str3;
        this.f12808x = j5;
        this.f12804r = str4;
        this.f12805s = j6;
        this.t = j7;
        this.u = str5;
        this.f12806v = z3;
        this.f12807w = z4;
        this.f12809y = str6;
        this.f12810z = 0L;
        this.f12784A = j8;
        this.f12785B = i5;
        this.f12786C = z5;
        this.f12787D = z6;
        this.f12788E = str7;
        this.f12789F = bool;
        this.f12790G = j9;
        this.f12791H = list;
        this.f12792I = null;
        this.f12793J = str8;
        this.f12794K = str9;
        this.f12795L = str10;
        this.f12796M = z7;
        this.f12797N = j10;
        this.f12798O = i6;
        this.f12799P = str11;
        this.f12800Q = i7;
        this.f12801R = j11;
        this.f12802S = str12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.y(parcel, 2, this.f12803o);
        g.y(parcel, 3, this.p);
        g.y(parcel, 4, this.q);
        g.y(parcel, 5, this.f12804r);
        g.I(parcel, 6, 8);
        parcel.writeLong(this.f12805s);
        g.I(parcel, 7, 8);
        parcel.writeLong(this.t);
        g.y(parcel, 8, this.u);
        g.I(parcel, 9, 4);
        parcel.writeInt(this.f12806v ? 1 : 0);
        g.I(parcel, 10, 4);
        parcel.writeInt(this.f12807w ? 1 : 0);
        g.I(parcel, 11, 8);
        parcel.writeLong(this.f12808x);
        g.y(parcel, 12, this.f12809y);
        g.I(parcel, 13, 8);
        parcel.writeLong(this.f12810z);
        g.I(parcel, 14, 8);
        parcel.writeLong(this.f12784A);
        g.I(parcel, 15, 4);
        parcel.writeInt(this.f12785B);
        g.I(parcel, 16, 4);
        parcel.writeInt(this.f12786C ? 1 : 0);
        g.I(parcel, 18, 4);
        parcel.writeInt(this.f12787D ? 1 : 0);
        g.y(parcel, 19, this.f12788E);
        Boolean bool = this.f12789F;
        if (bool != null) {
            g.I(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        g.I(parcel, 22, 8);
        parcel.writeLong(this.f12790G);
        g.A(parcel, 23, this.f12791H);
        g.y(parcel, 24, this.f12792I);
        g.y(parcel, 25, this.f12793J);
        g.y(parcel, 26, this.f12794K);
        g.y(parcel, 27, this.f12795L);
        g.I(parcel, 28, 4);
        parcel.writeInt(this.f12796M ? 1 : 0);
        g.I(parcel, 29, 8);
        parcel.writeLong(this.f12797N);
        g.I(parcel, 30, 4);
        parcel.writeInt(this.f12798O);
        g.y(parcel, 31, this.f12799P);
        g.I(parcel, 32, 4);
        parcel.writeInt(this.f12800Q);
        g.I(parcel, 34, 8);
        parcel.writeLong(this.f12801R);
        g.y(parcel, 35, this.f12802S);
        g.H(parcel, iE);
    }

    public o1(String str, String str2, String str3, String str4, long j5, long j6, String str5, boolean z3, boolean z4, long j7, String str6, long j8, long j9, int i5, boolean z5, boolean z6, String str7, Boolean bool, long j10, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z7, long j11, int i6, String str12, int i7, long j12, String str13) {
        this.f12803o = str;
        this.p = str2;
        this.q = str3;
        this.f12808x = j7;
        this.f12804r = str4;
        this.f12805s = j5;
        this.t = j6;
        this.u = str5;
        this.f12806v = z3;
        this.f12807w = z4;
        this.f12809y = str6;
        this.f12810z = j8;
        this.f12784A = j9;
        this.f12785B = i5;
        this.f12786C = z5;
        this.f12787D = z6;
        this.f12788E = str7;
        this.f12789F = bool;
        this.f12790G = j10;
        this.f12791H = arrayList;
        this.f12792I = str8;
        this.f12793J = str9;
        this.f12794K = str10;
        this.f12795L = str11;
        this.f12796M = z7;
        this.f12797N = j11;
        this.f12798O = i6;
        this.f12799P = str12;
        this.f12800Q = i7;
        this.f12801R = j12;
        this.f12802S = str13;
    }
}
