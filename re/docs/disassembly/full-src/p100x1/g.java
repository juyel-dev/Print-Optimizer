package p100x1;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import p105y1.C2796g;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends RelativeLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2796g f13703o;
    public boolean p;

    public g(Context context, String str, String str2, String str3) {
        super(context);
        C2796g c2796g = new C2796g(context);
        c2796g.f15928c = str;
        this.f13703o = c2796g;
        c2796g.e = str2;
        c2796g.f15929d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.p) {
            return false;
        }
        this.f13703o.a(motionEvent);
        return false;
    }
}
