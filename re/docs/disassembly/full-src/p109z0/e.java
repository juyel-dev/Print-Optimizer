package p109z0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o4.d;
import p104y0.m;
import p104y0.n;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16040f = m.h("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16044d = new ArrayList();
    public boolean e;

    public e(k kVar, List list) {
        this.f16041a = kVar;
        this.f16042b = list;
        this.f16043c = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            String string = ((n) list.get(i5)).f15860a.toString();
            this.f16043c.add(string);
            this.f16044d.add(string);
        }
    }

    public static HashSet A(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }

    public static boolean z(e eVar, HashSet hashSet) {
        hashSet.addAll(eVar.f16043c);
        HashSet hashSetA = A(eVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetA.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(eVar.f16043c);
        return false;
    }
}
