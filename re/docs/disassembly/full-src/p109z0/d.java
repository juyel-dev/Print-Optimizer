package p109z0;

import H0.i;
import H0.j;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p104y0.b;
import p104y0.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16039a = m.h("Schedulers");

    public static void a(b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        j jVarN = workDatabase.n();
        workDatabase.c();
        try {
            ArrayList arrayListB = jVarN.b(bVar.f15839h);
            ArrayList arrayListA = jVarN.a();
            if (arrayListB.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    jVarN.j(((i) it.next()).f470a, jCurrentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListB.size() > 0) {
                i[] iVarArr = (i[]) arrayListB.toArray(new i[arrayListB.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (cVar.b()) {
                        cVar.a(iVarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                i[] iVarArr2 = (i[]) arrayListA.toArray(new i[arrayListA.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    c cVar2 = (c) it3.next();
                    if (!cVar2.b()) {
                        cVar2.a(iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
