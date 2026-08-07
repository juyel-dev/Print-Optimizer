package p026g0;

import E1.k;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends FutureTask {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f11170o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, k kVar) {
        super(kVar);
        this.f11170o = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f11170o;
        try {
            Object obj = get();
            if (aVar.f11168r.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (aVar.f11168r.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e3) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
