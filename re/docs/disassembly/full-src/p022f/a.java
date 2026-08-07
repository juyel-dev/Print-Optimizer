package p022f;

import W.C0157b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0157b(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11121o;
    public final Intent p;

    public a(int i5, Intent intent) {
        this.f11121o = i5;
        this.p = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i5 = this.f11121o;
        if (i5 != -1) {
            strValueOf = i5 != 0 ? String.valueOf(i5) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.p);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        o.f(dest, "dest");
        dest.writeInt(this.f11121o);
        Intent intent = this.p;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i5);
        }
    }
}
