package p064o2;

import java.util.AbstractMap;

/* JADX INFO: renamed from: o2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2214q extends AbstractC2210m {
    public final /* synthetic */ r q;

    public C2214q(r rVar) {
        this.q = rVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i5) {
        r rVar = this.q;
        return new AbstractMap.SimpleImmutableEntry(rVar.f12152r.q.t.get(i5), rVar.f12152r.f12154r.get(i5));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q.f12152r.f12154r.size();
    }
}
