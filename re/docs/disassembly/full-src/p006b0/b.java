package p006b0;

import B3.a;
import B3.j;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.InterfaceC0683w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import o4.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f2403a;

    static {
        Object objD;
        try {
            ClassLoader classLoader = InterfaceC0683w.class.getClassLoader();
            o.c(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof ProvidableCompositionLocal) {
                        objD = (ProvidableCompositionLocal) objInvoke;
                        break;
                    }
                } else if (!(annotations[i5] instanceof a)) {
                    i5++;
                }
                objD = null;
                break;
            }
        } catch (Throwable th) {
            objD = d.d(th);
        }
        ProvidableCompositionLocal providableCompositionLocalStaticCompositionLocalOf = (ProvidableCompositionLocal) (objD instanceof j ? null : objD);
        if (providableCompositionLocalStaticCompositionLocalOf == null) {
            providableCompositionLocalStaticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(a.f2402o);
        }
        f2403a = providableCompositionLocalStaticCompositionLocalOf;
    }
}
