package p102x3;

import Q3.a;
import com.notescrafter.utils.ToDoItem;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class N3 implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14217o;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14217o) {
            case 0:
                return a.u(Long.valueOf(((H3) obj2).f14017d), Long.valueOf(((H3) obj).f14017d));
            case 1:
                return a.u(Boolean.valueOf(((ToDoItem) obj).isDone()), Boolean.valueOf(((ToDoItem) obj2).isDone()));
            case 2:
                return a.u(Boolean.valueOf(((ToDoItem) obj).isDone()), Boolean.valueOf(((ToDoItem) obj2).isDone()));
            case 3:
                return a.u(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            case 4:
                return a.u(Integer.valueOf(!o.b((String) ((Map.Entry) obj).getKey(), "Focus") ? 1 : 0), Integer.valueOf(!o.b((String) ((Map.Entry) obj2).getKey(), "Focus") ? 1 : 0));
            default:
                return a.u(Boolean.valueOf(((ToDoItem) obj).isDone()), Boolean.valueOf(((ToDoItem) obj2).isDone()));
        }
    }
}
