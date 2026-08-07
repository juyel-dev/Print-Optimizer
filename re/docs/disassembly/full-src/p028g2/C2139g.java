package p028g2;

import T1.z;
import U1.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.g;

/* JADX INFO: renamed from: g2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2139g extends a {
    public static final Parcelable.Creator<C2139g> CREATOR = new U(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final K f11207o;
    public final V p;
    public final C2140h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final W f11208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f11209s;

    public C2139g(K k3, V v4, C2140h c2140h, W w4, String str) {
        this.f11207o = k3;
        this.p = v4;
        this.q = c2140h;
        this.f11208r = w4;
        this.f11209s = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2139g)) {
            return false;
        }
        C2139g c2139g = (C2139g) obj;
        return z.m(this.f11207o, c2139g.f11207o) && z.m(this.p, c2139g.p) && z.m(this.q, c2139g.q) && z.m(this.f11208r, c2139g.f11208r) && z.m(this.f11209s, c2139g.f11209s);
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            C2140h c2140h = this.q;
            if (c2140h != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", c2140h.f11210o);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            K k3 = this.f11207o;
            if (k3 != null) {
                jSONObject.put("uvm", k3.g());
            }
            W w4 = this.f11208r;
            if (w4 != null) {
                jSONObject.put("prf", w4.g());
            }
            String str = this.f11209s;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e3) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e3);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11207o, this.p, this.q, this.f11208r, this.f11209s});
    }

    public final String toString() {
        return androidx.compose.foundation.text.modifiers.a.z("AuthenticationExtensionsClientOutputs{", g().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.x(parcel, 1, this.f11207o, i5);
        g.x(parcel, 2, this.p, i5);
        g.x(parcel, 3, this.q, i5);
        g.x(parcel, 4, this.f11208r, i5);
        g.y(parcel, 5, this.f11209s);
        g.H(parcel, iE);
    }
}
