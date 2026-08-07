package p082t2;

import android.os.Looper;
import com.google.android.gms.internal.measurement.A4;
import com.google.android.gms.internal.measurement.C2009c3;
import com.google.android.gms.internal.measurement.C2015d3;
import com.google.android.gms.internal.measurement.C2039h3;
import com.google.android.gms.internal.measurement.C2051j3;
import com.google.android.gms.internal.measurement.C2067m3;
import com.google.android.gms.internal.measurement.C2072n3;
import com.google.android.gms.internal.measurement.C2077o3;
import com.google.android.gms.internal.measurement.C2082p3;
import com.google.android.gms.internal.measurement.C4;
import com.google.android.gms.internal.measurement.F3;
import com.google.android.gms.internal.measurement.H3;
import com.google.android.gms.internal.measurement.L3;
import com.google.android.gms.internal.measurement.N3;
import com.razorpay.AppSignatureHelper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C implements E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C f12415b = new C(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C f12416c = new C(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C f12417d = new C(2);
    public static final /* synthetic */ C e = new C(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C f12418f = new C(4);
    public static final /* synthetic */ C g = new C(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C f12419h = new C(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ C f12420i = new C(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C f12421j = new C(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C f12422k = new C(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C f12423l = new C(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12424a;

    public /* synthetic */ C(int i5) {
        this.f12424a = i5;
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // p082t2.E
    public Object a() {
        switch (this.f12424a) {
            case 0:
                List list = AbstractC2268x.f12933a;
                C2009c3.p.get();
                return Integer.valueOf((int) ((Long) C2015d3.f10657G.a()).longValue());
            case 1:
                List list2 = AbstractC2268x.f12933a;
                C2072n3.p.get();
                Boolean bool = (Boolean) C2082p3.e.a();
                bool.getClass();
                return bool;
            case 2:
                List list3 = AbstractC2268x.f12933a;
                C2072n3.p.get();
                Boolean bool2 = (Boolean) C2082p3.f10770d.a();
                bool2.getClass();
                return bool2;
            case 3:
                List list4 = AbstractC2268x.f12933a;
                C2039h3.p.get();
                Boolean bool3 = (Boolean) C2051j3.f10730a.a();
                bool3.getClass();
                return bool3;
            case 4:
                List list5 = AbstractC2268x.f12933a;
                C2072n3.p.get();
                Boolean bool4 = (Boolean) C2082p3.f10771f.a();
                bool4.getClass();
                return bool4;
            case 5:
                List list6 = AbstractC2268x.f12933a;
                F3.p.get();
                Boolean bool5 = (Boolean) H3.f10543b.a();
                bool5.booleanValue();
                return bool5;
            case 6:
                List list7 = AbstractC2268x.f12933a;
                F3.p.get();
                Boolean bool6 = (Boolean) H3.f10542a.a();
                bool6.getClass();
                return bool6;
            case 7:
                List list8 = AbstractC2268x.f12933a;
                C2067m3.p.get();
                Boolean bool7 = (Boolean) C2077o3.f10754a.a();
                bool7.getClass();
                return bool7;
            case 8:
                List list9 = AbstractC2268x.f12933a;
                L3.p.get();
                Boolean bool8 = (Boolean) N3.f10573a.a();
                bool8.getClass();
                return bool8;
            case AppSignatureHelper.NUM_HASHED_BYTES /* 9 */:
                List list10 = AbstractC2268x.f12933a;
                A4.p.get();
                Boolean bool9 = (Boolean) C4.f10437b.a();
                bool9.getClass();
                return bool9;
            default:
                List list11 = AbstractC2268x.f12933a;
                A4.p.get();
                Boolean bool10 = (Boolean) C4.f10436a.a();
                bool10.getClass();
                return bool10;
        }
    }
}
