package p015d;

import O3.a;
import java.util.UUID;
import kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p implements a {
    public static final d p = new d(0, 0);
    public static final d q = new d(0, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f10940r = new d(0, 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10941o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i5, int i6) {
        super(i5);
        this.f10941o = i6;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f10941o) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
