package p010c;

import O3.c;
import android.view.View;
import com.notescrafter.app.R;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes.dex */
public final class I extends p implements c {
    public static final I p = new I(1, 0);
    public static final I q = new I(1, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2483o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i5, int i6) {
        super(i5);
        this.f2483o = i6;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f2483o) {
            case 0:
                View it = (View) obj;
                o.f(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View it2 = (View) obj;
                o.f(it2, "it");
                Object tag = it2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof G) {
                    return (G) tag;
                }
                return null;
        }
    }
}
