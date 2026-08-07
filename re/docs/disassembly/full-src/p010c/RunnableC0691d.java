package p010c;

import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: c.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0691d implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2489o;
    public final /* synthetic */ m p;

    public /* synthetic */ RunnableC0691d(m mVar, int i5) {
        this.f2489o = i5;
        this.p = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2489o) {
            case 0:
                m this$0 = this.p;
                o.f(this$0, "this$0");
                this$0.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!o.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!o.b(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
