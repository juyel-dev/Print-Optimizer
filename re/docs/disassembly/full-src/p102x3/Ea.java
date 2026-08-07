package p102x3;

import B3.o;
import O3.a;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ToDoItem;
import com.notescrafter.utils.ToDoManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Ea implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13934o;
    public final /* synthetic */ ToDoManager p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ToDoItem f13935r;

    public /* synthetic */ Ea(ToDoManager toDoManager, MutableState mutableState, ToDoItem toDoItem, int i5) {
        this.f13934o = i5;
        this.p = toDoManager;
        this.q = mutableState;
        this.f13935r = toDoItem;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f13934o) {
            case 0:
                MutableState mutableState = this.q;
                List list = (List) mutableState.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((ToDoItem) obj).getId() != this.f13935r.getId()) {
                        arrayList.add(obj);
                    }
                }
                mutableState.setValue(arrayList);
                this.p.saveTasks((List) mutableState.getValue());
                break;
            default:
                MutableState mutableState2 = this.q;
                List list2 = (List) mutableState2.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((ToDoItem) obj2).getId() != this.f13935r.getId()) {
                        arrayList2.add(obj2);
                    }
                }
                mutableState2.setValue(arrayList2);
                this.p.saveTasks((List) mutableState2.getValue());
                break;
        }
        return o.f154a;
    }
}
