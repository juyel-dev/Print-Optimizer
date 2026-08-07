package p088v;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f13388v;

    public i(j jVar) {
        this.f13388v = jVar;
    }

    @Override // p088v.g
    public final String h() {
        h hVar = (h) this.f13388v.f13389o.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f13384a + "]";
    }
}
