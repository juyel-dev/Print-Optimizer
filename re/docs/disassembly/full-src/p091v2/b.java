package p091v2;

import R1.j;
import U1.a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p013c2.g;
import p028g2.U;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a implements j {
    public static final Parcelable.Creator<b> CREATOR = new U(21);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13508o;
    public final int p;
    public final Intent q;

    public b(int i5, int i6, Intent intent) {
        this.f13508o = i5;
        this.p = i6;
        this.q = intent;
    }

    @Override // R1.j
    public final Status getStatus() {
        return this.p == 0 ? Status.f2701s : Status.f2703w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f13508o);
        g.I(parcel, 2, 4);
        parcel.writeInt(this.p);
        g.x(parcel, 3, this.q, i5);
        g.H(parcel, iE);
    }
}
