package p111z2;

import A2.k;
import A2.m;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f16086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f16087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f16089d;
    public k e;

    public c(Context context) {
        m mVar = new m("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f16089d = new HashSet();
        this.e = null;
        this.f16086a = mVar;
        this.f16087b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f16088c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        k kVar;
        HashSet hashSet = this.f16089d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f16088c;
        if (!zIsEmpty && this.e == null) {
            k kVar2 = new k(this, 0);
            this.e = kVar2;
            int i5 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f16087b;
            if (i5 >= 33) {
                context.registerReceiver(kVar2, intentFilter, 2);
            } else {
                context.registerReceiver(kVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (kVar = this.e) == null) {
            return;
        }
        context.unregisterReceiver(kVar);
        this.e = null;
    }
}
