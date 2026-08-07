package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import Y1.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.g;
import p064o2.AbstractC2198a;
import p064o2.H;
import p064o2.I;
import p064o2.J;
import p064o2.K;
import p064o2.L;
import p064o2.M;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends a {
    public static final Parcelable.Creator<Q> CREATOR = new C0157b(15);
    public static final byte[] p = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[][] f11188o;

    public Q(byte[][] bArr) {
        z.b(bArr != null);
        z.b(1 == ((bArr.length & 1) ^ 1));
        int i5 = 0;
        while (i5 < bArr.length) {
            z.b(i5 == 0 || bArr[i5] != null);
            int i6 = i5 + 1;
            z.b(bArr[i6] != null);
            int length = bArr[i6].length;
            z.b(length == 32 || length == 64);
            i5 += 2;
        }
        this.f11188o = bArr;
    }

    public static Q g(JSONObject jSONObject, boolean z3) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z3) {
                    arrayList.add(l(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(o(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(b.e(next));
                    if (z3) {
                        arrayList.add(l(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(o(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new Q((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject i(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
        } else {
            jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
            jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        }
        return jSONObject;
    }

    public static byte[] k(byte[] bArr) {
        L l5;
        H h5;
        int i5 = K.f12097a;
        M m5 = J.f12096a;
        boolean z3 = m5.q;
        int i6 = m5.p;
        MessageDigest messageDigest = m5.f12101o;
        if (z3) {
            try {
                l5 = new L((MessageDigest) messageDigest.clone(), i6);
            } catch (CloneNotSupportedException unused) {
                try {
                    l5 = new L(MessageDigest.getInstance(messageDigest.getAlgorithm()), i6);
                } catch (NoSuchAlgorithmException e) {
                    throw new AssertionError(e);
                }
            }
        } else {
            l5 = new L(MessageDigest.getInstance(messageDigest.getAlgorithm()), i6);
        }
        byte[] bArr2 = p;
        bArr2.getClass();
        int length = bArr2.length;
        if (l5.f12100c) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        MessageDigest messageDigest2 = l5.f12098a;
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (l5.f12100c) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr, 0, length2);
        if (l5.f12100c) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        l5.f12100c = true;
        int digestLength = messageDigest2.getDigestLength();
        int i7 = l5.f12099b;
        if (i7 == digestLength) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = I.f12095o;
            h5 = new H(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i7);
            char[] cArr2 = I.f12095o;
            h5 = new H(bArrCopyOf);
        }
        return (byte[]) h5.p.clone();
    }

    public static byte[] l(JSONObject jSONObject) throws JSONException {
        byte[] bArrE = b.e(jSONObject.getString("first"));
        if (bArrE.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrE;
        }
        byte[] bArrE2 = b.e(jSONObject.getString("second"));
        if (bArrE2.length == 32) {
            return AbstractC2198a.j(bArrE, bArrE2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] o(JSONObject jSONObject) {
        byte[] bArrK = k(b.e(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrK : AbstractC2198a.j(bArrK, k(b.e(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q) {
            return Arrays.deepEquals(this.f11188o, ((Q) obj).f11188o);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f11188o) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.f11188o;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i5 = 0; i5 < bArr.length; i5 += 2) {
                if (bArr[i5] == null) {
                    jSONObject.put("eval", i(bArr[i5 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(b.f(bArr[i5]), i(bArr[i5 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return androidx.compose.foundation.text.modifiers.a.z("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        byte[][] bArr = this.f11188o;
        if (bArr != null) {
            int iE2 = g.E(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            g.H(parcel, iE2);
        }
        g.H(parcel, iE);
    }
}
