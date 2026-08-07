package p033h3;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f11489d = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11492c;

    public s(String str, String str2, long j5) {
        this.f11490a = str;
        this.f11491b = str2;
        this.f11492c = j5;
    }

    public static String a(String str, String str2, long j5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j5);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static s b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new s(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new s(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }
}
