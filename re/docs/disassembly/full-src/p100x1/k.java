package p100x1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageButton f13709o;
    public final c p;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(android.content.Context r7, p100x1.j r8, p100x1.c r9) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100x1.k.<init>(android.content.Context, x1.j, x1.c):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.p;
        if (cVar != null) {
            cVar.f13687K = 2;
            cVar.p.finish();
        }
    }
}
