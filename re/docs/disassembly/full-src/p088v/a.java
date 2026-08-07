package p088v;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f13366d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationException f13368b;

    static {
        if (g.f13381r) {
            f13366d = null;
            f13365c = null;
        } else {
            f13366d = new a(false, null);
            f13365c = new a(true, null);
        }
    }

    public a(boolean z3, CancellationException cancellationException) {
        this.f13367a = z3;
        this.f13368b = cancellationException;
    }
}
