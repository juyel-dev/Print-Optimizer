package p062o0;

import A.e;
import C3.D;
import C3.I;
import C3.u;
import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;
import t4.w;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12049a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12052d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12053f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f12055i;

    public a(boolean z3, boolean z4, w wVar, Long l5, Long l6, Long l7, Long l8, Map extras) {
        o.f(extras, "extras");
        this.f12050b = z3;
        this.f12051c = z4;
        this.f12052d = wVar;
        this.e = l5;
        this.f12053f = l6;
        this.g = l7;
        this.f12054h = l8;
        this.f12055i = I.Q(extras);
    }

    public String toString() {
        switch (this.f12049a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f12050b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f12051c) {
                    arrayList.add("isDirectory");
                }
                Long l5 = (Long) this.e;
                if (l5 != null) {
                    arrayList.add("byteCount=" + l5);
                }
                Long l6 = (Long) this.f12053f;
                if (l6 != null) {
                    arrayList.add("createdAt=" + l6);
                }
                Long l7 = (Long) this.g;
                if (l7 != null) {
                    arrayList.add("lastModifiedAt=" + l7);
                }
                Long l8 = (Long) this.f12054h;
                if (l8 != null) {
                    arrayList.add("lastAccessedAt=" + l8);
                }
                Map map = (Map) this.f12055i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return u.v0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(boolean z3, boolean z4, w wVar, Long l5, Long l6, Long l7, Long l8) {
        this(z3, z4, wVar, l5, l6, l7, l8, D.f168o);
    }

    public a(Context context, String str, p077s0.a aVar, e eVar, ArrayList arrayList, boolean z3, int i5, Executor executor, Executor executor2, boolean z4, boolean z5) {
        this.f12052d = aVar;
        this.e = context;
        this.f12053f = str;
        this.g = eVar;
        this.f12054h = executor;
        this.f12055i = executor2;
        this.f12050b = z4;
        this.f12051c = z5;
    }
}
