package p009b3;

import Y2.d;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p014c3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f2430b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f2431c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f2432d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2433a;

    public j(d dVar) {
        this.f2433a = dVar;
    }

    public final boolean a(b bVar) {
        if (TextUtils.isEmpty(bVar.f2575c)) {
            return true;
        }
        long j5 = bVar.f2577f + bVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2433a.getClass();
        return j5 < timeUnit.toSeconds(System.currentTimeMillis()) + f2430b;
    }
}
