package p060n3;

import Q3.a;
import java.util.Comparator;
import org.json.JSONObject;
import u4.f;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11930o;

    public /* synthetic */ i(int i5) {
        this.f11930o = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11930o) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                return a.u(((f) obj).f13344a, ((f) obj2).f13344a);
            default:
                return a.u(Integer.valueOf(((JSONObject) obj).getInt("partNumber")), Integer.valueOf(((JSONObject) obj2).getInt("partNumber")));
        }
    }
}
