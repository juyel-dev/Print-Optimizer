package p074r0;

import O3.c;
import android.view.View;
import com.notescrafter.app.R;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends p implements c {
    public static final h p = new h(1, 0);
    public static final h q = new h(1, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12329o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i5, int i6) {
        super(i5);
        this.f12329o = i6;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f12329o) {
            case 0:
                View view = (View) obj;
                o.f(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                o.f(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof g) {
                    return (g) tag;
                }
                return null;
        }
    }
}
