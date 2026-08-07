package p098x;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.AbstractC0657s;
import androidx.core.view.r;
import androidx.lifecycle.C0685y;
import androidx.lifecycle.InterfaceC0683w;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import com.notescrafter.app.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;
import p003a2.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends Activity implements InterfaceC0683w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0685y f13638o = new C0685y(this);

    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        boolean zBooleanValue;
        o.f(event, "event");
        View decorView = getWindow().getDecorView();
        o.e(decorView, "window.decorView");
        if (a.r(decorView, event)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(event);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z3 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null) {
                if (!a.f1952c) {
                    try {
                        a.f1953d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    a.f1952c = true;
                }
                Method method = a.f1953d;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, event);
                        if (objInvoke == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(event)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i5 = AbstractC0657s.f2269a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = r.f2265d;
            r rVar = (r) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (rVar == null) {
                rVar = new r();
                rVar.f2266a = null;
                rVar.f2267b = null;
                rVar.f2268c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, rVar);
            }
            if (event.getAction() == 0) {
                WeakHashMap weakHashMap = rVar.f2266a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = r.f2265d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (rVar.f2266a == null) {
                                rVar.f2266a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = r.f2265d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    rVar.f2266a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        rVar.f2266a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            View viewA = rVar.a(decorView2);
            if (event.getAction() == 0) {
                int keyCode = event.getKeyCode();
                if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (rVar.f2267b == null) {
                        rVar.f2267b = new SparseArray();
                    }
                    rVar.f2267b.put(keyCode, new WeakReference(viewA));
                }
            }
            if (viewA != null) {
                z3 = true;
            }
        }
        if (z3) {
            return true;
        }
        return event.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        o.f(event, "event");
        View decorView = getWindow().getDecorView();
        o.e(decorView, "window.decorView");
        if (a.r(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i5 = M.p;
        K.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        o.f(outState, "outState");
        this.f13638o.h();
        super.onSaveInstanceState(outState);
    }
}
