package p090v1;

import java.util.Comparator;
import java.util.List;
import p067p1.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K0 implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ K0 f13417o = new K0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = l.f12274b;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
