package p082t2;

import java.util.Comparator;

/* JADX INFO: renamed from: t2.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2271y0 implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ C2271y0 f12981o = new C2271y0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
    }
}
