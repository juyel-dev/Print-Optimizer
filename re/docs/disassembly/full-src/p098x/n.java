package p098x;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f13665a;

    static {
        new HashSet();
    }

    public n(Context context) {
        this.f13665a = (NotificationManager) context.getSystemService("notification");
    }
}
