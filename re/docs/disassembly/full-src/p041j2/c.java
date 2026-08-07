package p041j2;

import A2.d;
import K2.b;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p050l2.a;
import p101x2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {
    public final /* synthetic */ i p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 3);
        this.p = iVar;
    }

    @Override // A2.d
    public final boolean R1(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 1) {
            return false;
        }
        Status status = (Status) a.a(parcel, Status.CREATOR);
        a.b(parcel);
        b.r(status, null, this.p);
        return true;
    }
}
