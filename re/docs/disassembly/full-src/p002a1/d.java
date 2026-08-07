package p002a1;

import O3.a;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f1948o = new d(0);

    @Override // O3.a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
