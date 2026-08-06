package com.notescrafter.utils;

import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class ToDoItem {
    public static final int $stable = 8;
    private final long id;
    private boolean isDone;
    private final String text;

    public ToDoItem(long j5, String text, boolean z3) {
        o.f(text, "text");
        this.id = j5;
        this.text = text;
        this.isDone = z3;
    }

    public static /* synthetic */ ToDoItem copy$default(ToDoItem toDoItem, long j5, String str, boolean z3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = toDoItem.id;
        }
        if ((i5 & 2) != 0) {
            str = toDoItem.text;
        }
        if ((i5 & 4) != 0) {
            z3 = toDoItem.isDone;
        }
        return toDoItem.copy(j5, str, z3);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.isDone;
    }

    public final ToDoItem copy(long j5, String text, boolean z3) {
        o.f(text, "text");
        return new ToDoItem(j5, text, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToDoItem)) {
            return false;
        }
        ToDoItem toDoItem = (ToDoItem) obj;
        return this.id == toDoItem.id && o.b(this.text, toDoItem.text) && this.isDone == toDoItem.isDone;
    }

    public final long getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDone) + a.c(Long.hashCode(this.id) * 31, 31, this.text);
    }

    public final boolean isDone() {
        return this.isDone;
    }

    public final void setDone(boolean z3) {
        this.isDone = z3;
    }

    public String toString() {
        return "ToDoItem(id=" + this.id + ", text=" + this.text + ", isDone=" + this.isDone + ")";
    }

    public /* synthetic */ ToDoItem(long j5, String str, boolean z3, int i5, AbstractC2168g abstractC2168g) {
        this((i5 & 1) != 0 ? System.currentTimeMillis() : j5, str, (i5 & 4) != 0 ? false : z3);
    }
}
