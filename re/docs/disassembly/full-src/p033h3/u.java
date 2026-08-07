package p033h3;

import M0.b;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f11497c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f11498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f11499b;

    public u(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f11499b = scheduledThreadPoolExecutor;
    }

    public final synchronized t a() {
        String str;
        t tVar;
        b bVar = this.f11498a;
        synchronized (((ArrayDeque) bVar.f656r)) {
            str = (String) ((ArrayDeque) bVar.f656r).peek();
        }
        Pattern pattern = t.f11493d;
        tVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                tVar = new t(strArrSplit[0], strArrSplit[1]);
            }
        }
        return tVar;
    }
}
