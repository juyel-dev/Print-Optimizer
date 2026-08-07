package p019e0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f11041a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f11042b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f11043c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f11044d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
