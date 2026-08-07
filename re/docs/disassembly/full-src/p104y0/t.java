package p104y0;

import android.content.Context;
import androidx.compose.foundation.text.modifiers.a;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15866a = m.h("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f15866a;
        ListenableWorker listenableWorker = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            m.f().e(str2, a.y("Invalid class: ", str), th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                listenableWorker = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                m.f().e(str2, a.y("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.isUsed()) {
            return listenableWorker;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
