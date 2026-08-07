package p083t3;

import O3.a;
import com.notescrafter.MainActivity;
import kotlin.jvm.internal.p;

/* JADX INFO: renamed from: t3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2286g extends p implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13170o;
    public final /* synthetic */ MainActivity p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2286g(MainActivity mainActivity, int i5) {
        super(0);
        this.f13170o = i5;
        this.p = mainActivity;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13170o) {
            case 0:
                return this.p.e();
            default:
                return this.p.c();
        }
    }
}
