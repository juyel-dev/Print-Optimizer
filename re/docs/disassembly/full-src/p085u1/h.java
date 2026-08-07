package p085u1;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.M4;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements View.OnTouchListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f13304o;

    public h(j jVar) {
        this.f13304o = jVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        M4 m5 = this.f13304o.f13309v;
        if (m5 == null) {
            return false;
        }
        m5.f4804b.f(motionEvent);
        return false;
    }
}
