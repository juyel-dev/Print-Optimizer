package p082t2;

import T1.z;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2000b0;

/* JADX INFO: renamed from: t2.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2263u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12864d;
    public final Boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12865f;
    public final C2000b0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f12867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f12868j;

    public C2263u0(Context context, C2000b0 c2000b0, Long l5) {
        this.f12866h = true;
        z.i(context);
        Context applicationContext = context.getApplicationContext();
        z.i(applicationContext);
        this.f12861a = applicationContext;
        this.f12867i = l5;
        if (c2000b0 != null) {
            this.g = c2000b0;
            this.f12862b = c2000b0.t;
            this.f12863c = c2000b0.f10637s;
            this.f12864d = c2000b0.f10636r;
            this.f12866h = c2000b0.q;
            this.f12865f = c2000b0.p;
            this.f12868j = c2000b0.f10638v;
            Bundle bundle = c2000b0.u;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
