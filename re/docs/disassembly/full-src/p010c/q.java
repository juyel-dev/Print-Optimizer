package p010c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.C0649j;
import androidx.core.view.T;
import androidx.core.view.U;
import androidx.core.view.V;
import androidx.core.view.W;
import kotlin.jvm.internal.o;
import o4.l;
import p013c2.g;
import p111z2.b;

/* JADX INFO: loaded from: classes.dex */
public class q extends b {
    @Override // p111z2.b
    public void x(H statusBarStyle, H navigationBarStyle, Window window, View view, boolean z3, boolean z4) {
        l u;
        o.f(statusBarStyle, "statusBarStyle");
        o.f(navigationBarStyle, "navigationBarStyle");
        o.f(window, "window");
        o.f(view, "view");
        g.s(window, false);
        window.setStatusBarColor(z3 ? statusBarStyle.f2482b : statusBarStyle.f2481a);
        window.setNavigationBarColor(z4 ? navigationBarStyle.f2482b : navigationBarStyle.f2481a);
        if (Build.VERSION.SDK_INT >= 30) {
            new C0649j(view, 9).f2260r = view;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            u = new W(window);
        } else if (i5 >= 30) {
            u = new V(window);
        } else {
            u = i5 >= 26 ? new U(window) : new T(window);
        }
        u.s(!z3);
        u.r(!z4);
    }
}
