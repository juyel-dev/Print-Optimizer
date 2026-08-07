package p087u3;

import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static final int $stable = 0;
    private final String activity;
    private final String date;
    private final String location;

    public s(String date, String activity, String str) {
        o.f(date, "date");
        o.f(activity, "activity");
        this.date = date;
        this.activity = activity;
        this.location = str;
    }

    public static /* synthetic */ s copy$default(s sVar, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = sVar.date;
        }
        if ((i5 & 2) != 0) {
            str2 = sVar.activity;
        }
        if ((i5 & 4) != 0) {
            str3 = sVar.location;
        }
        return sVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.date;
    }

    public final String component2() {
        return this.activity;
    }

    public final String component3() {
        return this.location;
    }

    public final s copy(String date, String activity, String str) {
        o.f(date, "date");
        o.f(activity, "activity");
        return new s(date, activity, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return o.b(this.date, sVar.date) && o.b(this.activity, sVar.activity) && o.b(this.location, sVar.location);
    }

    public final String getActivity() {
        return this.activity;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getLocation() {
        return this.location;
    }

    public int hashCode() {
        int iC = a.c(this.date.hashCode() * 31, 31, this.activity);
        String str = this.location;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.date;
        String str2 = this.activity;
        return p035i0.a.p(p035i0.a.r("PrintTrackingActivity(date=", str, ", activity=", str2, ", location="), this.location, ")");
    }
}
