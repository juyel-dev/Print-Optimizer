package p102x3;

import B3.o;
import C3.w;
import O3.c;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ToDoItem;
import com.notescrafter.utils.ToDoManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Da implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13872o;
    public final /* synthetic */ ToDoManager p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ToDoItem f13873r;

    public /* synthetic */ Da(ToDoManager toDoManager, MutableState mutableState, ToDoItem toDoItem, int i5) {
        this.f13872o = i5;
        this.p = toDoManager;
        this.q = mutableState;
        this.f13873r = toDoItem;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f13872o) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MutableState mutableState = this.q;
                List<ToDoItem> list = (List) mutableState.getValue();
                ArrayList arrayList = new ArrayList(w.Y(list));
                for (ToDoItem toDoItemCopy$default : list) {
                    if (toDoItemCopy$default.getId() == this.f13873r.getId()) {
                        toDoItemCopy$default = ToDoItem.copy$default(toDoItemCopy$default, 0L, null, zBooleanValue, 3, null);
                    }
                    arrayList.add(toDoItemCopy$default);
                }
                mutableState.setValue(arrayList);
                this.p.saveTasks((List) mutableState.getValue());
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                MutableState mutableState2 = this.q;
                List<ToDoItem> list2 = (List) mutableState2.getValue();
                ArrayList arrayList2 = new ArrayList(w.Y(list2));
                for (ToDoItem toDoItemCopy$default2 : list2) {
                    if (toDoItemCopy$default2.getId() == this.f13873r.getId()) {
                        toDoItemCopy$default2 = ToDoItem.copy$default(toDoItemCopy$default2, 0L, null, zBooleanValue2, 3, null);
                    }
                    arrayList2.add(toDoItemCopy$default2);
                }
                mutableState2.setValue(arrayList2);
                this.p.saveTasks((List) mutableState2.getValue());
                break;
        }
        return o.f154a;
    }
}
