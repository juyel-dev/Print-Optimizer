package p065o3;

import W.P;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p051l3.d;
import p051l3.o;
import p051l3.p;
import p060n3.m;
import p079s3.a;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12182b = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f12183a;

    public h(d dVar) {
        this.f12183a = dVar;
    }

    @Override // p051l3.p
    public final Object a(a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int iL = aVar.L();
        int iB = P.b(iL);
        if (iB == 0) {
            aVar.c();
            arrayList = new ArrayList();
        } else if (iB != 2) {
            arrayList = null;
        } else {
            aVar.g();
            arrayList = new m(true);
        }
        if (arrayList == null) {
            return c(aVar, iL);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.y()) {
                String strF = arrayList instanceof Map ? aVar.F() : null;
                int iL2 = aVar.L();
                int iB2 = P.b(iL2);
                if (iB2 == 0) {
                    aVar.c();
                    arrayList2 = new ArrayList();
                } else if (iB2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.g();
                    arrayList2 = new m(true);
                }
                boolean z3 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(aVar, iL2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strF, arrayList2);
                }
                if (z3) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.j();
                } else {
                    aVar.n();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p051l3.p
    public final void b(b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.y();
            return;
        }
        Class<?> cls = obj.getClass();
        d dVar = this.f12183a;
        dVar.getClass();
        p pVarC = dVar.c(TypeToken.get((Class) cls));
        if (!(pVarC instanceof h)) {
            pVarC.b(bVar, obj);
        } else {
            bVar.h();
            bVar.n();
        }
    }

    public final Serializable c(a aVar, int i5) {
        int iB = P.b(i5);
        if (iB == 5) {
            return aVar.J();
        }
        if (iB == 6) {
            o.f11857o.getClass();
            return Double.valueOf(aVar.C());
        }
        if (iB == 7) {
            return Boolean.valueOf(aVar.B());
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(p076s.b.D(i5)));
        }
        aVar.H();
        return null;
    }
}
