package p082t2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1867x5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends AbstractC1867x5 implements G {
    public I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 1);
    }

    @Override // p082t2.G
    public final void E3(o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        P2(parcelB0, 20);
    }

    @Override // p082t2.G
    public final C2239i I1(o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        Parcel parcelE2 = e2(parcelB0, 21);
        C2239i c2239i = (C2239i) com.google.android.gms.internal.measurement.I.a(parcelE2, C2239i.CREATOR);
        parcelE2.recycle();
        return c2239i;
    }

    @Override // p082t2.G
    public final void I2(C2231e c2231e, o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, c2231e);
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        P2(parcelB0, 12);
    }

    @Override // p082t2.G
    public final List M0(String str, String str2, String str3, boolean z3) {
        Parcel parcelB0 = b0();
        parcelB0.writeString(null);
        parcelB0.writeString(str2);
        parcelB0.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.I.f10545a;
        parcelB0.writeInt(z3 ? 1 : 0);
        Parcel parcelE2 = e2(parcelB0, 15);
        ArrayList arrayListCreateTypedArrayList = parcelE2.createTypedArrayList(k1.CREATOR);
        parcelE2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p082t2.G
    public final void M3(k1 k1Var, o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, k1Var);
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        P2(parcelB0, 2);
    }

    @Override // p082t2.G
    public final void O1(long j5, String str, String str2, String str3) {
        Parcel parcelB0 = b0();
        parcelB0.writeLong(j5);
        parcelB0.writeString(str);
        parcelB0.writeString(str2);
        parcelB0.writeString(str3);
        P2(parcelB0, 10);
    }

    @Override // p082t2.G
    public final void O3(C2264v c2264v, o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, c2264v);
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        P2(parcelB0, 1);
    }

    @Override // p082t2.G
    public final List Q1(String str, String str2, String str3) {
        Parcel parcelB0 = b0();
        parcelB0.writeString(null);
        parcelB0.writeString(str2);
        parcelB0.writeString(str3);
        Parcel parcelE2 = e2(parcelB0, 17);
        ArrayList arrayListCreateTypedArrayList = parcelE2.createTypedArrayList(C2231e.CREATOR);
        parcelE2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p082t2.G
    public final void R0(o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        P2(parcelB0, 4);
    }

    @Override // p082t2.G
    public final List U(Bundle bundle, o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        com.google.android.gms.internal.measurement.I.c(parcelB0, bundle);
        Parcel parcelE2 = e2(parcelB0, 24);
        ArrayList arrayListCreateTypedArrayList = parcelE2.createTypedArrayList(d1.CREATOR);
        parcelE2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p082t2.G
    public final byte[] Y1(C2264v c2264v, String str) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, c2264v);
        parcelB0.writeString(str);
        Parcel parcelE2 = e2(parcelB0, 9);
        byte[] bArrCreateByteArray = parcelE2.createByteArray();
        parcelE2.recycle();
        return bArrCreateByteArray;
    }

    @Override // p082t2.G
    public final String g1(o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        Parcel parcelE2 = e2(parcelB0, 11);
        String string = parcelE2.readString();
        parcelE2.recycle();
        return string;
    }

    @Override // p082t2.G
    public final void j3(o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        P2(parcelB0, 6);
    }

    @Override // p082t2.G
    public final List u0(String str, String str2, o1 o1Var) {
        Parcel parcelB0 = b0();
        parcelB0.writeString(str);
        parcelB0.writeString(str2);
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        Parcel parcelE2 = e2(parcelB0, 16);
        ArrayList arrayListCreateTypedArrayList = parcelE2.createTypedArrayList(C2231e.CREATOR);
        parcelE2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p082t2.G
    public final List u3(String str, String str2, boolean z3, o1 o1Var) {
        Parcel parcelB0 = b0();
        parcelB0.writeString(str);
        parcelB0.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.I.f10545a;
        parcelB0.writeInt(z3 ? 1 : 0);
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        Parcel parcelE2 = e2(parcelB0, 14);
        ArrayList arrayListCreateTypedArrayList = parcelE2.createTypedArrayList(k1.CREATOR);
        parcelE2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p082t2.G
    public final void z0(o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        P2(parcelB0, 18);
    }

    @Override // p082t2.G
    /* JADX INFO: renamed from: U */
    public final void mo6719U(Bundle bundle, o1 o1Var) {
        Parcel parcelB0 = b0();
        com.google.android.gms.internal.measurement.I.c(parcelB0, bundle);
        com.google.android.gms.internal.measurement.I.c(parcelB0, o1Var);
        P2(parcelB0, 19);
    }
}
