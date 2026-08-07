package p102x3;

import B3.o;
import O3.a;
import O3.c;
import com.notescrafter.utils.ToDoItem;

/* JADX INFO: renamed from: x3.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2737wa implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15695o;
    public final /* synthetic */ c p;
    public final /* synthetic */ ToDoItem q;

    public /* synthetic */ C2737wa(c cVar, ToDoItem toDoItem, int i5) {
        this.f15695o = i5;
        this.p = cVar;
        this.q = toDoItem;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f15695o) {
            case 0:
                this.p.invoke(Boolean.valueOf(!this.q.isDone()));
                break;
            default:
                this.p.invoke(Boolean.valueOf(!this.q.isDone()));
                break;
        }
        return o.f154a;
    }
}
