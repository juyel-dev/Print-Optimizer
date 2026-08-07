package p028g2;

import T1.z;
import Y1.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.g;
import p036i2.e;
import p064o2.O;
import p064o2.Q;
import p064o2.X;

/* JADX INFO: renamed from: g2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2141i extends AbstractC2144l {
    public static final Parcelable.Creator<C2141i> CREATOR = new U(7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X f11211o;
    public final X p;
    public final X q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X f11212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final X f11213s;

    public C2141i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        z.i(bArr);
        X xS = X.s(bArr, bArr.length);
        z.i(bArr2);
        X xS2 = X.s(bArr2, bArr2.length);
        z.i(bArr3);
        X xS3 = X.s(bArr3, bArr3.length);
        z.i(bArr4);
        X xS4 = X.s(bArr4, bArr4.length);
        X xS5 = bArr5 == null ? null : X.s(bArr5, bArr5.length);
        this.f11211o = xS;
        this.p = xS2;
        this.q = xS3;
        this.f11212r = xS4;
        this.f11213s = xS5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2141i)) {
            return false;
        }
        C2141i c2141i = (C2141i) obj;
        return z.m(this.f11211o, c2141i.f11211o) && z.m(this.p, c2141i.p) && z.m(this.q, c2141i.q) && z.m(this.f11212r, c2141i.f11212r) && z.m(this.f11213s, c2141i.f11213s);
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", b.f(this.p.t()));
            jSONObject.put("authenticatorData", b.f(this.q.t()));
            jSONObject.put("signature", b.f(this.f11212r.t()));
            X x4 = this.f11213s;
            if (x4 != null) {
                jSONObject.put("userHandle", b.f(x4 == null ? null : x4.t()));
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11211o})), Integer.valueOf(Arrays.hashCode(new Object[]{this.p})), Integer.valueOf(Arrays.hashCode(new Object[]{this.q})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11212r})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11213s}))});
    }

    public final String toString() {
        e eVar = new e(getClass().getSimpleName(), 22);
        O o5 = Q.f12109d;
        byte[] bArrT = this.f11211o.t();
        eVar.B(o5.c(bArrT, bArrT.length), "keyHandle");
        byte[] bArrT2 = this.p.t();
        eVar.B(o5.c(bArrT2, bArrT2.length), "clientDataJSON");
        byte[] bArrT3 = this.q.t();
        eVar.B(o5.c(bArrT3, bArrT3.length), "authenticatorData");
        byte[] bArrT4 = this.f11212r.t();
        eVar.B(o5.c(bArrT4, bArrT4.length), "signature");
        X x4 = this.f11213s;
        byte[] bArrT5 = x4 == null ? null : x4.t();
        if (bArrT5 != null) {
            eVar.B(o5.c(bArrT5, bArrT5.length), "userHandle");
        }
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.v(parcel, 2, this.f11211o.t());
        g.v(parcel, 3, this.p.t());
        g.v(parcel, 4, this.q.t());
        g.v(parcel, 5, this.f11212r.t());
        X x4 = this.f11213s;
        g.v(parcel, 6, x4 == null ? null : x4.t());
        g.H(parcel, iE);
    }
}
