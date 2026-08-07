package p082t2;

import T1.z;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12568d;
    public final /* synthetic */ U e;

    public V(U u, String str, boolean z3) {
        this.e = u;
        z.e(str);
        this.f12565a = str;
        this.f12566b = z3;
    }

    public final void a(boolean z3) {
        SharedPreferences.Editor editorEdit = this.e.s().edit();
        editorEdit.putBoolean(this.f12565a, z3);
        editorEdit.apply();
        this.f12568d = z3;
    }

    public final boolean b() {
        if (!this.f12567c) {
            this.f12567c = true;
            this.f12568d = this.e.s().getBoolean(this.f12565a, this.f12566b);
        }
        return this.f12568d;
    }
}
