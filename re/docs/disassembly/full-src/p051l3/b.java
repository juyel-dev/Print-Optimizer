package p051l3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p079s3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11843b;

    public /* synthetic */ b(p pVar, int i5) {
        this.f11842a = i5;
        this.f11843b = pVar;
    }

    @Override // p051l3.p
    public final Object a(a aVar) {
        switch (this.f11842a) {
            case 0:
                return new AtomicLong(((Number) this.f11843b.a(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.y()) {
                    arrayList.add(Long.valueOf(((Number) this.f11843b.a(aVar)).longValue()));
                }
                aVar.j();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i5 = 0; i5 < size; i5++) {
                    atomicLongArray.set(i5, ((Long) arrayList.get(i5)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.L() != 9) {
                    return this.f11843b.a(aVar);
                }
                aVar.H();
                return null;
        }
    }

    @Override // p051l3.p
    public final void b(p079s3.b bVar, Object obj) throws IOException {
        switch (this.f11842a) {
            case 0:
                this.f11843b.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.g();
                int length = atomicLongArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    this.f11843b.b(bVar, Long.valueOf(atomicLongArray.get(i5)));
                }
                bVar.j();
                break;
            default:
                if (obj == null) {
                    bVar.y();
                } else {
                    this.f11843b.b(bVar, obj);
                }
                break;
        }
    }
}
