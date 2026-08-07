package p028g2;

import T1.z;
import Y1.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.g;
import p036i2.e;
import p064o2.AbstractC2198a;
import p064o2.C2215s;
import p064o2.O;
import p064o2.Q;
import p064o2.W;
import p064o2.X;
import p064o2.b0;
import p064o2.c0;
import p064o2.d0;
import p064o2.e0;
import p064o2.f0;
import p064o2.g0;
import p064o2.h0;
import p064o2.j0;

/* JADX INFO: renamed from: g2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2142j extends AbstractC2144l {
    public static final Parcelable.Creator<C2142j> CREATOR = new U(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X f11214o;
    public final X p;
    public final X q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String[] f11215r;

    public C2142j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        z.i(bArr);
        X xS = X.s(bArr, bArr.length);
        z.i(bArr2);
        X xS2 = X.s(bArr2, bArr2.length);
        z.i(bArr3);
        X xS3 = X.s(bArr3, bArr3.length);
        this.f11214o = xS;
        this.p = xS2;
        this.q = xS3;
        z.i(strArr);
        this.f11215r = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2142j)) {
            return false;
        }
        C2142j c2142j = (C2142j) obj;
        return z.m(this.f11214o, c2142j.f11214o) && z.m(this.p, c2142j.p) && z.m(this.q, c2142j.q);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0147 A[Catch: JSONException -> 0x0021, g0 -> 0x01ab, TRY_LEAVE, TryCatch #6 {g0 -> 0x01ab, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0147, B:56:0x015d, B:59:0x0179, B:61:0x018e, B:63:0x0193, B:66:0x01ae, B:67:0x01b3, B:68:0x01b4, B:69:0x01bb, B:74:0x01c8, B:76:0x01d5, B:78:0x01e2, B:79:0x01f7, B:80:0x01fc, B:81:0x01fd, B:82:0x0202, B:88:0x0227, B:89:0x022c), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d5 A[Catch: JSONException -> 0x0021, g0 -> 0x01ab, TryCatch #6 {g0 -> 0x01ab, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0147, B:56:0x015d, B:59:0x0179, B:61:0x018e, B:63:0x0193, B:66:0x01ae, B:67:0x01b3, B:68:0x01b4, B:69:0x01bb, B:74:0x01c8, B:76:0x01d5, B:78:0x01e2, B:79:0x01f7, B:80:0x01fc, B:81:0x01fd, B:82:0x0202, B:88:0x0227, B:89:0x022c), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e2 A[Catch: JSONException -> 0x0021, g0 -> 0x01ab, TryCatch #6 {g0 -> 0x01ab, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0147, B:56:0x015d, B:59:0x0179, B:61:0x018e, B:63:0x0193, B:66:0x01ae, B:67:0x01b3, B:68:0x01b4, B:69:0x01bb, B:74:0x01c8, B:76:0x01d5, B:78:0x01e2, B:79:0x01f7, B:80:0x01fc, B:81:0x01fd, B:82:0x0202, B:88:0x0227, B:89:0x022c), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f7 A[Catch: JSONException -> 0x0021, g0 -> 0x01ab, TryCatch #6 {g0 -> 0x01ab, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0147, B:56:0x015d, B:59:0x0179, B:61:0x018e, B:63:0x0193, B:66:0x01ae, B:67:0x01b3, B:68:0x01b4, B:69:0x01bb, B:74:0x01c8, B:76:0x01d5, B:78:0x01e2, B:79:0x01f7, B:80:0x01fc, B:81:0x01fd, B:82:0x0202, B:88:0x0227, B:89:0x022c), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd A[Catch: JSONException -> 0x0021, g0 -> 0x01ab, TryCatch #6 {g0 -> 0x01ab, blocks: (B:42:0x0111, B:49:0x0136, B:51:0x0147, B:56:0x015d, B:59:0x0179, B:61:0x018e, B:63:0x0193, B:66:0x01ae, B:67:0x01b3, B:68:0x01b4, B:69:0x01bb, B:74:0x01c8, B:76:0x01d5, B:78:0x01e2, B:79:0x01f7, B:80:0x01fc, B:81:0x01fd, B:82:0x0202, B:88:0x0227, B:89:0x022c), top: B:130:0x0111, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0225  */
    public final JSONObject g() {
        h0 h0Var;
        long j5;
        h0 h0Var2;
        X x4;
        String[] strArr = this.f11215r;
        try {
            JSONObject jSONObject = new JSONObject();
            X x5 = this.p;
            if (x5 != null) {
                jSONObject.put("clientDataJSON", b.f(x5.t()));
            }
            X x6 = this.q;
            if (x6 != null) {
                jSONObject.put("attestationObject", b.f(x6.t()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (strArr[i5].equals("cable")) {
                    jSONArray.put(i5, "hybrid");
                } else {
                    jSONArray.put(i5, strArr[i5]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    h0 h0Var3 = (h0) ((e0) h0.e(x6.t()).c(e0.class)).p.get(new f0("authData"));
                    if (h0Var3 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    X x7 = ((b0) h0Var3.c(b0.class)).f12128o;
                    byte[] bArr = x7.p;
                    ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, x7.k()).asReadOnlyBuffer();
                    try {
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                        if ((byteBufferAsReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                        try {
                            try {
                                int iPosition = byteBufferAsReadOnlyBuffer.position();
                                int iR = X.r(iPosition, bArr.length, x7.k());
                                j0 j0Var = new j0((iR == 0 ? X.q : new W(bArr, iPosition, iR)).o());
                                try {
                                    h0 h0VarK = AbstractC2198a.k(j0Var);
                                    try {
                                        j0Var.close();
                                    } catch (IOException unused) {
                                    }
                                    C2215s c2215s = ((e0) h0VarK.c(e0.class)).p;
                                    h0 h0Var4 = (h0) c2215s.get(new d0(3L));
                                    h0 h0Var5 = (h0) c2215s.get(new d0(1L));
                                    if (h0Var4 == null || h0Var5 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j6 = ((d0) h0Var4.c(d0.class)).f12129o;
                                        long j7 = ((d0) h0Var5.c(d0.class)).f12129o;
                                        byte[] bArrJ = null;
                                        if (j7 == 1) {
                                            h0Var = (h0) c2215s.get(new d0(-1L));
                                            if (h0Var != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j8 = ((d0) h0Var.c(d0.class)).f12129o;
                                            j5 = j6;
                                            if (j7 != 2 && j8 == 1) {
                                                h0 h0Var6 = (h0) c2215s.get(new d0(-2L));
                                                h0 h0Var7 = (h0) c2215s.get(new d0(-3L));
                                                if (h0Var6 == null || h0Var7 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                X x8 = ((b0) h0Var6.c(b0.class)).f12128o;
                                                X x9 = ((b0) h0Var7.c(b0.class)).f12128o;
                                                if (x8.p.length != 32 || x9.p.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = AbstractC2198a.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), x8.t(), x9.t());
                                            } else if (j7 == 1 && j8 == 6) {
                                                h0Var2 = (h0) c2215s.get(new d0(-2L));
                                                if (h0Var2 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                x4 = ((b0) h0Var2.c(b0.class)).f12128o;
                                                if (x4.p.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = AbstractC2198a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), x4.t());
                                            }
                                        } else if (j7 == 2) {
                                            j7 = 2;
                                            h0Var = (h0) c2215s.get(new d0(-1L));
                                            if (h0Var != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j9 = ((d0) h0Var.c(d0.class)).f12129o;
                                            j5 = j6;
                                            if (j7 != 2) {
                                                if (j7 == 1) {
                                                    h0Var2 = (h0) c2215s.get(new d0(-2L));
                                                    if (h0Var2 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    x4 = ((b0) h0Var2.c(b0.class)).f12128o;
                                                    if (x4.p.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArrJ = AbstractC2198a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), x4.t());
                                                }
                                            } else if (j7 == 1) {
                                                h0Var2 = (h0) c2215s.get(new d0(-2L));
                                                if (h0Var2 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                x4 = ((b0) h0Var2.c(b0.class)).f12128o;
                                                if (x4.p.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = AbstractC2198a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), x4.t());
                                            }
                                        } else {
                                            j5 = j6;
                                        }
                                        byte[] bArr2 = bArrJ;
                                        jSONObject.put("authenticatorData", b.f(x7.t()));
                                        jSONObject.put("publicKeyAlgorithm", j5);
                                        if (bArr2 != null) {
                                            jSONObject.put("publicKey", Base64.encodeToString(bArr2, 11));
                                        }
                                        return jSONObject;
                                    } catch (g0 e) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        j0Var.close();
                                        throw th;
                                    } catch (IOException unused2) {
                                        throw th;
                                    }
                                }
                            } catch (g0 e3) {
                                e = e3;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (c0 e5) {
                            e = e5;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e6) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e6);
                    }
                } catch (g0 e7) {
                    throw new IllegalArgumentException("authData value has wrong type", e7);
                }
            } catch (c0 e8) {
                e = e8;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (g0 e9) {
                e = e9;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e10);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11214o})), Integer.valueOf(Arrays.hashCode(new Object[]{this.p})), Integer.valueOf(Arrays.hashCode(new Object[]{this.q}))});
    }

    public final String toString() {
        e eVar = new e(getClass().getSimpleName(), 22);
        O o5 = Q.f12109d;
        byte[] bArrT = this.f11214o.t();
        eVar.B(o5.c(bArrT, bArrT.length), "keyHandle");
        byte[] bArrT2 = this.p.t();
        eVar.B(o5.c(bArrT2, bArrT2.length), "clientDataJSON");
        byte[] bArrT3 = this.q.t();
        eVar.B(o5.c(bArrT3, bArrT3.length), "attestationObject");
        eVar.B(Arrays.toString(this.f11215r), "transports");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.v(parcel, 2, this.f11214o.t());
        g.v(parcel, 3, this.p.t());
        g.v(parcel, 4, this.q.t());
        g.z(parcel, 5, this.f11215r);
        g.H(parcel, iE);
    }
}
