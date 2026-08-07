package p082t2;

import T1.z;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ C2267w0 f12412a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C2267w0 c2267w0 = this.f12412a;
        c2267w0.getClass();
        if ("IABTCF_TCString".equals(str)) {
            B0 b5 = c2267w0.f12884r;
            z.i(b5);
            b5.b(500L);
        }
    }
}
