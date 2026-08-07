package p088v;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p111z2.b;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13376d;
    public final AtomicReferenceFieldUpdater e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13377f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f13374b = atomicReferenceFieldUpdater;
        this.f13375c = atomicReferenceFieldUpdater2;
        this.f13376d = atomicReferenceFieldUpdater3;
        this.e = atomicReferenceFieldUpdater4;
        this.f13377f = atomicReferenceFieldUpdater5;
    }

    @Override // p111z2.b
    public final boolean e(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // p111z2.b
    public final boolean f(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13377f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // p111z2.b
    public final boolean g(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f13376d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // p111z2.b
    public final void t(f fVar, f fVar2) {
        this.f13375c.lazySet(fVar, fVar2);
    }

    @Override // p111z2.b
    public final void u(f fVar, Thread thread) {
        this.f13374b.lazySet(fVar, thread);
    }
}
