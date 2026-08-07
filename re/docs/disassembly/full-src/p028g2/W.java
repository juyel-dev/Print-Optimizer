package p028g2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.g;
import p064o2.X;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends a {
    public static final Parcelable.Creator<W> CREATOR = new U(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11192o;
    public final X p;

    public W(boolean z3, X x4) {
        this.f11192o = z3;
        this.p = x4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof W)) {
            return false;
        }
        W w4 = (W) obj;
        return this.f11192o == w4.f11192o && z.m(this.p, w4.p);
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f11192o) {
                jSONObject.put("enabled", true);
            }
            X x4 = this.p;
            byte[] bArrT = x4 == null ? null : x4.t();
            if (bArrT != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrT, 32), 11));
                if (bArrT.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrT, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11192o), this.p});
    }

    public final String toString() {
        return androidx.compose.foundation.text.modifiers.a.z("AuthenticationExtensionsPrfOutputs{", g().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.I(parcel, 1, 4);
        parcel.writeInt(this.f11192o ? 1 : 0);
        X x4 = this.p;
        g.v(parcel, 2, x4 == null ? null : x4.t());
        g.H(parcel, iE);
    }
}
