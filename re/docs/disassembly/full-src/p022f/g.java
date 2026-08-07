package p022f;

import W.C0157b;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new C0157b(7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IntentSender f11127o;
    public final Intent p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11128r;

    public g(IntentSender intentSender, Intent intent, int i5, int i6) {
        this.f11127o = intentSender;
        this.p = intent;
        this.q = i5;
        this.f11128r = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        o.f(dest, "dest");
        dest.writeParcelable(this.f11127o, i5);
        dest.writeParcelable(this.p, i5);
        dest.writeInt(this.q);
        dest.writeInt(this.f11128r);
    }
}
