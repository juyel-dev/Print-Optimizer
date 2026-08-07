package p028g2;

import T1.z;
import U1.a;
import W.C0157b;
import Y1.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013c2.g;
import p064o2.AbstractC2201d;
import p064o2.C2199b;
import p064o2.C2202e;

/* JADX INFO: renamed from: g2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2153v extends a {
    public static final Parcelable.Creator<C2153v> CREATOR = new C0157b(16);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ResultReceiver f11237A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2156y f11238o;
    public final B p;
    public final byte[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f11239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f11240s;
    public final ArrayList t;
    public final C2145m u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f11241v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final H f11242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final EnumC2137e f11243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C2138f f11244y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f11245z;

    public C2153v(C2156y c2156y, B b5, byte[] bArr, ArrayList arrayList, Double d4, ArrayList arrayList2, C2145m c2145m, Integer num, H h5, String str, C2138f c2138f, String str2, ResultReceiver resultReceiver) {
        this.f11237A = resultReceiver;
        if (str2 != null) {
            try {
                C2153v c2153vG = g(new JSONObject(str2));
                this.f11238o = c2153vG.f11238o;
                this.p = c2153vG.p;
                this.q = c2153vG.q;
                this.f11239r = c2153vG.f11239r;
                this.f11240s = c2153vG.f11240s;
                this.t = c2153vG.t;
                this.u = c2153vG.u;
                this.f11241v = c2153vG.f11241v;
                this.f11242w = c2153vG.f11242w;
                this.f11243x = c2153vG.f11243x;
                this.f11244y = c2153vG.f11244y;
                this.f11245z = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        z.i(c2156y);
        this.f11238o = c2156y;
        z.i(b5);
        this.p = b5;
        z.i(bArr);
        this.q = bArr;
        z.i(arrayList);
        this.f11239r = arrayList;
        this.f11240s = d4;
        this.t = arrayList2;
        this.u = c2145m;
        this.f11241v = num;
        this.f11242w = h5;
        if (str != null) {
            try {
                this.f11243x = EnumC2137e.a(str);
            } catch (C2136d e3) {
                throw new IllegalArgumentException(e3);
            }
        } else {
            this.f11243x = null;
        }
        this.f11244y = c2138f;
        this.f11245z = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:103:0x026a  */
    /* JADX WARN: Code duplicated, block: B:104:0x027c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0286  */
    /* JADX WARN: Code duplicated, block: B:108:0x0298  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:119:0x02db  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:124:0x0308  */
    /* JADX WARN: Code duplicated, block: B:127:0x0312  */
    /* JADX WARN: Code duplicated, block: B:128:0x0324  */
    /* JADX WARN: Code duplicated, block: B:131:0x032e  */
    /* JADX WARN: Code duplicated, block: B:132:0x033a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0212  */
    /* JADX WARN: Code duplicated, block: B:98:0x0221 A[LOOP:3: B:96:0x021b->B:98:0x0221, LOOP_END] */
    public static C2153v g(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        C2145m c2145m;
        C2138f c2138f;
        EnumC2137e enumC2137eA;
        int i5;
        Q q;
        Q qG;
        Y y4;
        I i6;
        a0 a0Var;
        M m5;
        N n5;
        Z z3;
        O o5;
        C2151t c2151t;
        S s2;
        JSONArray jSONArray;
        ArrayList arrayList2;
        String str;
        int i7;
        ArrayList arrayList3;
        JSONArray jSONArray2;
        String str2;
        AbstractC2201d c2202e;
        int i8 = 1;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        C2156y c2156y = new C2156y(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        B b5 = new B(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), b.e(jSONObject3.getString("id")));
        byte[] bArrE = b.e(jSONObject.getString("challenge"));
        z.i(bArrE);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList4 = new ArrayList();
        for (int i9 = 0; i9 < jSONArray3.length(); i9++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i9);
            try {
                c2202e = new C2202e(new C2155x(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                c2202e = C2199b.f12127o;
            }
            if (c2202e.b()) {
                arrayList4.add(c2202e.a());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i10 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            arrayList = new ArrayList();
            int i11 = 0;
            while (i11 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i11);
                Parcelable.Creator<C2154w> creator = C2154w.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] bArrDecode = Base64.decode(jSONObject5.getString(str3), i10);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    str = str3;
                    i7 = i8;
                    arrayList3 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    int i12 = 0;
                    while (i12 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i12);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (p021e2.a unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i12++;
                        str3 = str2;
                    }
                    str = str3;
                    i7 = 1;
                    arrayList3 = new ArrayList(hashSet);
                }
                arrayList.add(new C2154w(string, bArrDecode, arrayList3));
                i11 += i7;
                i8 = i7;
                jSONArray4 = jSONArray4;
                str3 = str;
                i10 = 11;
            }
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            c2145m = new C2145m(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            c2145m = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            C2150s c2150s = jSONObject7.has("fidoAppIdExtension") ? new C2150s(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                c2150s = new C2150s(jSONObject7.getString("appid"));
            }
            C2150s c2150s2 = c2150s;
            if (!jSONObject7.has("prf")) {
                i5 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    qG = Q.g(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    q = null;
                }
                if (jSONObject7.has("cableAuthenticationExtension")) {
                    jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                    arrayList2 = new ArrayList();
                    while (i5 < jSONArray.length()) {
                        JSONObject jSONObject8 = jSONArray.getJSONObject(i5);
                        arrayList2.add(new X(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                        i5++;
                    }
                    y4 = new Y(arrayList2);
                } else {
                    y4 = null;
                }
                if (jSONObject7.has("userVerificationMethodExtension")) {
                    i6 = new I(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
                } else {
                    i6 = null;
                }
                if (jSONObject7.has("google_multiAssertionExtension")) {
                    a0Var = new a0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
                } else {
                    a0Var = null;
                }
                if (jSONObject7.has("google_sessionIdExtension")) {
                    m5 = new M(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
                } else {
                    m5 = null;
                }
                if (jSONObject7.has("google_silentVerificationExtension")) {
                    n5 = new N(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
                } else {
                    n5 = null;
                }
                if (jSONObject7.has("devicePublicKeyExtension")) {
                    jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    z3 = new Z();
                } else {
                    z3 = null;
                }
                if (jSONObject7.has("google_tunnelServerIdExtension")) {
                    o5 = new O(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
                } else {
                    o5 = null;
                }
                if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                    c2151t = new C2151t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
                } else {
                    c2151t = null;
                }
                if (jSONObject7.has("txAuthSimple")) {
                    s2 = new S(jSONObject7.getString("txAuthSimple"));
                } else {
                    s2 = null;
                }
                c2138f = new C2138f(c2150s2, y4, i6, a0Var, m5, n5, z3, o5, c2151t, q, s2, null);
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i5 = 0;
                qG = Q.g(jSONObject7.getJSONObject("prf"), false);
            }
            q = qG;
            if (jSONObject7.has("cableAuthenticationExtension")) {
                jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                arrayList2 = new ArrayList();
                while (i5 < jSONArray.length()) {
                    JSONObject jSONObject9 = jSONArray.getJSONObject(i5);
                    arrayList2.add(new X(jSONObject9.getLong("version"), Base64.decode(jSONObject9.getString("clientEid"), 11), Base64.decode(jSONObject9.getString("authenticatorEid"), 11), Base64.decode(jSONObject9.getString("sessionPreKey"), 11)));
                    i5++;
                }
                y4 = new Y(arrayList2);
            } else {
                y4 = null;
            }
            if (jSONObject7.has("userVerificationMethodExtension")) {
                i6 = new I(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            } else {
                i6 = null;
            }
            if (jSONObject7.has("google_multiAssertionExtension")) {
                a0Var = new a0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
            } else {
                a0Var = null;
            }
            if (jSONObject7.has("google_sessionIdExtension")) {
                m5 = new M(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
            } else {
                m5 = null;
            }
            if (jSONObject7.has("google_silentVerificationExtension")) {
                n5 = new N(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
            } else {
                n5 = null;
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
                jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                z3 = new Z();
            } else {
                z3 = null;
            }
            if (jSONObject7.has("google_tunnelServerIdExtension")) {
                o5 = new O(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
            } else {
                o5 = null;
            }
            if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                c2151t = new C2151t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
            } else {
                c2151t = null;
            }
            if (jSONObject7.has("txAuthSimple")) {
                s2 = new S(jSONObject7.getString("txAuthSimple"));
            } else {
                s2 = null;
            }
            c2138f = new C2138f(c2150s2, y4, i6, a0Var, m5, n5, z3, o5, c2151t, q, s2, null);
        } else {
            c2138f = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                enumC2137eA = EnumC2137e.a(jSONObject.getString("attestation"));
            } catch (C2136d e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                enumC2137eA = EnumC2137e.NONE;
            }
        } else {
            enumC2137eA = null;
        }
        return new C2153v(c2156y, b5, bArrE, arrayList4, dValueOf, arrayList, c2145m, null, null, enumC2137eA == null ? null : enumC2137eA.f11198o, c2138f, null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2153v)) {
            return false;
        }
        C2153v c2153v = (C2153v) obj;
        if (z.m(this.f11238o, c2153v.f11238o) && z.m(this.p, c2153v.p) && Arrays.equals(this.q, c2153v.q) && z.m(this.f11240s, c2153v.f11240s)) {
            ArrayList arrayList = this.f11239r;
            ArrayList arrayList2 = c2153v.f11239r;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
                ArrayList arrayList3 = this.t;
                ArrayList arrayList4 = c2153v.t;
                if (((arrayList3 == null && arrayList4 == null) || (arrayList3 != null && arrayList4 != null && arrayList3.containsAll(arrayList4) && arrayList4.containsAll(arrayList3))) && z.m(this.u, c2153v.u) && z.m(this.f11241v, c2153v.f11241v) && z.m(this.f11242w, c2153v.f11242w) && z.m(this.f11243x, c2153v.f11243x) && z.m(this.f11244y, c2153v.f11244y) && z.m(this.f11245z, c2153v.f11245z)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11238o, this.p, Integer.valueOf(Arrays.hashCode(this.q)), this.f11239r, this.f11240s, this.t, this.u, this.f11241v, this.f11242w, this.f11243x, this.f11244y, this.f11245z});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11238o);
        String strValueOf2 = String.valueOf(this.p);
        String strF = b.f(this.q);
        String strValueOf3 = String.valueOf(this.f11239r);
        String strValueOf4 = String.valueOf(this.t);
        String strValueOf5 = String.valueOf(this.u);
        String strValueOf6 = String.valueOf(this.f11242w);
        String strValueOf7 = String.valueOf(this.f11243x);
        String strValueOf8 = String.valueOf(this.f11244y);
        StringBuilder sbR = p035i0.a.r("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        p061o.a.g(sbR, strF, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbR.append(this.f11240s);
        sbR.append(", \n excludeList=");
        sbR.append(strValueOf4);
        sbR.append(", \n authenticatorSelection=");
        sbR.append(strValueOf5);
        sbR.append(", \n requestId=");
        sbR.append(this.f11241v);
        sbR.append(", \n tokenBinding=");
        sbR.append(strValueOf6);
        sbR.append(", \n attestationConveyancePreference=");
        sbR.append(strValueOf7);
        sbR.append(", \n authenticationExtensions=");
        sbR.append(strValueOf8);
        sbR.append("}");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE = g.E(parcel, 20293);
        g.x(parcel, 2, this.f11238o, i5);
        g.x(parcel, 3, this.p, i5);
        g.v(parcel, 4, this.q);
        g.D(parcel, 5, this.f11239r);
        Double d4 = this.f11240s;
        if (d4 != null) {
            g.I(parcel, 6, 8);
            parcel.writeDouble(d4.doubleValue());
        }
        g.D(parcel, 7, this.t);
        g.x(parcel, 8, this.u, i5);
        Integer num = this.f11241v;
        if (num != null) {
            g.I(parcel, 9, 4);
            parcel.writeInt(num.intValue());
        }
        g.x(parcel, 10, this.f11242w, i5);
        EnumC2137e enumC2137e = this.f11243x;
        g.y(parcel, 11, enumC2137e == null ? null : enumC2137e.f11198o);
        g.x(parcel, 12, this.f11244y, i5);
        g.y(parcel, 13, this.f11245z);
        g.x(parcel, 14, this.f11237A, i5);
        g.H(parcel, iE);
    }
}
