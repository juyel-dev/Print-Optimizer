package p038j;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f11554s = new HashMap();

    @Override // p038j.f
    public final c c(Object obj) {
        return (c) this.f11554s.get(obj);
    }

    @Override // p038j.f
    public final Object g(Object obj) {
        Object objG = super.g(obj);
        this.f11554s.remove(obj);
        return objG;
    }
}
