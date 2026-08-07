package p091v2;

import R1.j;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import p013c2.g;
import p028g2.U;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends a implements j {
    public static final Parcelable.Creator<e> CREATOR = new U(22);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f13509o;
    public final String p;

    public e(String str, ArrayList arrayList) {
        this.f13509o = arrayList;
        this.p = str;
    }

    @Override // R1.j
    public final Status getStatus() {
        return this.p != null ? Status.f2701s : Status.f2703w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.A(parcel, 1, this.f13509o);
        g.y(parcel, 2, this.p);
        g.H(parcel, iE);
    }
}
