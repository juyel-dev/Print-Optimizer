package p060n3;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p051l3.d;
import p051l3.p;
import p051l3.q;
import p079s3.a;
import p079s3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f11922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f11925d;
    public final /* synthetic */ TypeToken e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f11926f;

    public e(f fVar, boolean z3, boolean z4, d dVar, TypeToken typeToken) {
        this.f11926f = fVar;
        this.f11923b = z3;
        this.f11924c = z4;
        this.f11925d = dVar;
        this.e = typeToken;
    }

    @Override // p051l3.p
    public final Object a(a aVar) throws IOException {
        if (this.f11923b) {
            aVar.R();
            return null;
        }
        p pVar = this.f11922a;
        if (pVar == null) {
            d dVar = this.f11925d;
            List list = dVar.e;
            q qVar = this.f11926f;
            if (!list.contains(qVar)) {
                qVar = dVar.f11848d;
            }
            Iterator it = list.iterator();
            boolean z3 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                TypeToken typeToken = this.e;
                if (!zHasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
                }
                q qVar2 = (q) it.next();
                if (z3) {
                    p pVarA = qVar2.a(dVar, typeToken);
                    if (pVarA != null) {
                        this.f11922a = pVarA;
                        pVar = pVarA;
                    }
                } else if (qVar2 == qVar) {
                    z3 = true;
                }
            }
        }
        return pVar.a(aVar);
    }

    @Override // p051l3.p
    public final void b(b bVar, Object obj) throws IOException {
        if (this.f11924c) {
            bVar.y();
            return;
        }
        p pVar = this.f11922a;
        if (pVar == null) {
            d dVar = this.f11925d;
            List list = dVar.e;
            q qVar = this.f11926f;
            if (!list.contains(qVar)) {
                qVar = dVar.f11848d;
            }
            Iterator it = list.iterator();
            boolean z3 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                TypeToken typeToken = this.e;
                if (!zHasNext) {
                    throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
                }
                q qVar2 = (q) it.next();
                if (z3) {
                    p pVarA = qVar2.a(dVar, typeToken);
                    if (pVarA != null) {
                        this.f11922a = pVarA;
                        pVar = pVarA;
                    }
                } else if (qVar2 == qVar) {
                    z3 = true;
                }
            }
        }
        pVar.b(bVar, obj);
    }
}
