package p106y2;

import C3.E;
import android.os.Bundle;
import java.util.Set;
import p013c2.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f15973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f15974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f15975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15976d;

    public a() {
        Bundle bundleF = g.F();
        Bundle bundleF2 = g.F();
        E e = E.f169o;
        this.f15973a = bundleF;
        this.f15974b = bundleF2;
        this.f15975c = e;
        bundleF.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundleF2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundleF.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 500);
        bundleF2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 500);
        this.f15976d = "958189564512-u6dke84iolme02slo0u8v9giego48imb.apps.googleusercontent.com";
    }
}
