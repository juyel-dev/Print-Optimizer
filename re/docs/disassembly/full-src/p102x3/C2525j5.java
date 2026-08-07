package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.notescrafter.utils.ToDoItem;

/* JADX INFO: renamed from: x3.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2525j5 implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15214o = 2;
    public final /* synthetic */ Object p;
    public final /* synthetic */ long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15216s;
    public final /* synthetic */ Object t;

    public /* synthetic */ C2525j5(ToDoItem toDoItem, long j5, c cVar, a aVar, int i5) {
        this.p = toDoItem;
        this.q = j5;
        this.t = cVar;
        this.f15216s = aVar;
        this.f15215r = i5;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15214o) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f15215r | 1);
                String str = (String) this.p;
                a aVar = (a) this.f15216s;
                ComposableLambda composableLambda = (ComposableLambda) this.t;
                AbstractC2684t5.c(str, this.q, aVar, composableLambda, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).intValue();
                Gd.o((String) this.p, (String) this.f15216s, (ImageVector) this.t, this.q, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f15215r | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                Ye.e((ToDoItem) this.p, this.q, (c) this.t, (a) this.f15216s, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f15215r | 1));
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2525j5(String str, long j5, a aVar, ComposableLambda composableLambda, int i5) {
        this.p = str;
        this.q = j5;
        this.f15216s = aVar;
        this.t = composableLambda;
        this.f15215r = i5;
    }

    public /* synthetic */ C2525j5(String str, String str2, ImageVector imageVector, long j5, int i5) {
        this.p = str;
        this.f15216s = str2;
        this.t = imageVector;
        this.q = j5;
        this.f15215r = i5;
    }
}
