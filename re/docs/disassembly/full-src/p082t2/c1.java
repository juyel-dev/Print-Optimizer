package p082t2;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f12619b = {"TcfDataEnabled", "GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12620a;

    public c1(HashMap map) {
        HashMap map2 = new HashMap();
        this.f12620a = map2;
        map2.putAll(map);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = f12619b;
        for (int i5 = 0; i5 < 7; i5++) {
            String str = strArr[i5];
            HashMap map = this.f12620a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    public final int b() {
        try {
            String str = (String) this.f12620a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c1) {
            return a().equalsIgnoreCase(((c1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
