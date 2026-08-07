package p088v;

import J0.b;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f13385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f13386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13387d;

    public final void finalize() {
        k kVar;
        j jVar = this.f13385b;
        if (jVar != null) {
            i iVar = jVar.p;
            if (!iVar.isDone()) {
                iVar.k(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f13384a, 3));
            }
        }
        if (this.f13387d || (kVar = this.f13386c) == null) {
            return;
        }
        kVar.j(null);
    }
}
