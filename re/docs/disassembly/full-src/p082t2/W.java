package p082t2;

import T1.z;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12575d;
    public final /* synthetic */ U e;

    public W(U u, String str, long j5) {
        this.e = u;
        z.e(str);
        this.f12572a = str;
        this.f12573b = j5;
    }

    public final long a() {
        if (!this.f12574c) {
            this.f12574c = true;
            this.f12575d = this.e.s().getLong(this.f12572a, this.f12573b);
        }
        return this.f12575d;
    }

    public final void b(long j5) {
        SharedPreferences.Editor editorEdit = this.e.s().edit();
        editorEdit.putLong(this.f12572a, j5);
        editorEdit.apply();
        this.f12575d = j5;
    }
}
