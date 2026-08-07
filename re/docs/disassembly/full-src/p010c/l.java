package p010c;

import B3.o;
import N.h;
import O3.a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.U;
import kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2504o;
    public final /* synthetic */ m p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i5) {
        super(0);
        this.f2504o = i5;
        this.p = mVar;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f2504o) {
            case 0:
                m mVar = this.p;
                return new U(mVar.getApplication(), mVar, mVar.getIntent() != null ? mVar.getIntent().getExtras() : null);
            case 1:
                this.p.reportFullyDrawn();
                return o.f154a;
            case 2:
                m mVar2 = this.p;
                return new u(mVar2.t, new l(mVar2, 1));
            default:
                m mVar3 = this.p;
                F f5 = new F(new RunnableC0691d(mVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.o.b(Looper.myLooper(), Looper.getMainLooper())) {
                        mVar3.f13638o.a(new C0693f(f5, mVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new h(9, mVar3, f5));
                    }
                }
                return f5;
        }
    }
}
