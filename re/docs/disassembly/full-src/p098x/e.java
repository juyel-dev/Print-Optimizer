package p098x;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f13640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f13641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13643d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f13644f;
    public final PendingIntent g;

    public e(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = IconCompat.b(2131165188);
        Bundle bundle = new Bundle();
        this.f13643d = true;
        this.f13641b = iconCompatB;
        if (iconCompatB.d() == 2) {
            this.e = iconCompatB.c();
        }
        this.f13644f = k.b(str);
        this.g = pendingIntent;
        this.f13640a = bundle;
        this.f13642c = true;
        this.f13643d = true;
    }
}
