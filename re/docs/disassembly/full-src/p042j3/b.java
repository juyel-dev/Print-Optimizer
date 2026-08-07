package p042j3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11586b;

    public b(Set set, c cVar) {
        this.f11585a = b(set);
        this.f11586b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f11583a);
            sb.append('/');
            sb.append(aVar.f11584b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        c cVar = this.f11586b;
        synchronized (((HashSet) cVar.p)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.p);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f11585a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.p)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.p);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
