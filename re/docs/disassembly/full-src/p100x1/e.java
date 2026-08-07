package p100x1;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f13702o;

    public e(c cVar) {
        this.f13702o = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.f13702o;
        cVar.f13687K = 2;
        cVar.p.finish();
    }
}
