package p102x3;

import B3.o;
import C3.u;
import O3.c;
import W3.j;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ToDoItem;
import com.notescrafter.utils.ToDoManager;
import java.util.List;

/* JADX INFO: renamed from: x3.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2546ka implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15250o;
    public final /* synthetic */ ToDoManager p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15251r;

    public /* synthetic */ C2546ka(ToDoManager toDoManager, MutableState mutableState, MutableState mutableState2, int i5) {
        this.f15250o = i5;
        this.p = toDoManager;
        this.q = mutableState;
        this.f15251r = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.c
    public final Object invoke(Object obj) {
        o oVar = o.f154a;
        ToDoManager toDoManager = this.p;
        MutableState mutableState = this.f15251r;
        MutableState mutableState2 = this.q;
        KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
        switch (this.f15250o) {
            case 0:
                kotlin.jvm.internal.o.f(KeyboardActions, "$this$KeyboardActions");
                List list = AbstractC2642qa.f15449c;
                if (!j.m0((String) mutableState2.getValue())) {
                    mutableState.setValue(u.A0((List) mutableState.getValue(), new ToDoItem(0L, (String) mutableState2.getValue(), false, 5, null)));
                    toDoManager.saveTasks((List) mutableState.getValue());
                    mutableState2.setValue("");
                }
                break;
            case 1:
                kotlin.jvm.internal.o.f(KeyboardActions, "$this$KeyboardActions");
                if (!j.m0((String) mutableState2.getValue())) {
                    mutableState.setValue(u.A0((List) mutableState.getValue(), new ToDoItem(0L, (String) mutableState2.getValue(), false, 5, null)));
                    toDoManager.saveTasks((List) mutableState.getValue());
                    mutableState2.setValue("");
                }
                break;
            default:
                kotlin.jvm.internal.o.f(KeyboardActions, "$this$KeyboardActions");
                if (!j.m0((String) mutableState2.getValue())) {
                    mutableState.setValue(u.A0((List) mutableState.getValue(), new ToDoItem(0L, (String) mutableState2.getValue(), false, 5, null)));
                    toDoManager.saveTasks((List) mutableState.getValue());
                    mutableState2.setValue("");
                }
                break;
        }
        return oVar;
    }
}
