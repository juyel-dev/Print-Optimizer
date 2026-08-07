package p033h3;

import android.util.Log;
import androidx.compose.foundation.text.modifiers.a;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f11493d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11496c;

    public t(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f11493d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(a.z("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f11494a = strSubstring;
        this.f11495b = str;
        this.f11496c = a.m(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f11494a.equals(tVar.f11494a) && this.f11495b.equals(tVar.f11495b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11495b, this.f11494a});
    }
}
