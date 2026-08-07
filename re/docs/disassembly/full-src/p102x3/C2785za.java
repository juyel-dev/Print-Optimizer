package p102x3;

import B3.o;
import C3.C;
import O3.a;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ToDoManager;
import java.util.List;

/* JADX INFO: renamed from: x3.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2785za implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15808o;
    public final /* synthetic */ ToDoManager p;
    public final /* synthetic */ MutableState q;

    public /* synthetic */ C2785za(ToDoManager toDoManager, MutableState mutableState, int i5) {
        this.f15808o = i5;
        this.p = toDoManager;
        this.q = mutableState;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f15808o) {
            case 0:
                C c5 = C.f167o;
                MutableState mutableState = this.q;
                mutableState.setValue(c5);
                this.p.saveTasks((List) mutableState.getValue());
                break;
            default:
                C c6 = C.f167o;
                MutableState mutableState2 = this.q;
                mutableState2.setValue(c6);
                this.p.saveTasks((List) mutableState2.getValue());
                break;
        }
        return o.f154a;
    }
}
