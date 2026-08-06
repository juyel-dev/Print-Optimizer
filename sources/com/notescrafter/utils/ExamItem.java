package com.notescrafter.utils;

import androidx.compose.foundation.text.modifiers.a;
import kotlin.jvm.internal.AbstractC2168g;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final class ExamItem {
    public static final int $stable = 0;
    private final long dateMillis;
    private final long id;
    private final String name;

    public ExamItem(long j5, String name, long j6) {
        o.f(name, "name");
        this.id = j5;
        this.name = name;
        this.dateMillis = j6;
    }

    public static /* synthetic */ ExamItem copy$default(ExamItem examItem, long j5, String str, long j6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = examItem.id;
        }
        long j7 = j5;
        if ((i5 & 2) != 0) {
            str = examItem.name;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            j6 = examItem.dateMillis;
        }
        return examItem.copy(j7, str2, j6);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.dateMillis;
    }

    public final ExamItem copy(long j5, String name, long j6) {
        o.f(name, "name");
        return new ExamItem(j5, name, j6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExamItem)) {
            return false;
        }
        ExamItem examItem = (ExamItem) obj;
        return this.id == examItem.id && o.b(this.name, examItem.name) && this.dateMillis == examItem.dateMillis;
    }

    public final long getDateMillis() {
        return this.dateMillis;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Long.hashCode(this.dateMillis) + a.c(Long.hashCode(this.id) * 31, 31, this.name);
    }

    public String toString() {
        return "ExamItem(id=" + this.id + ", name=" + this.name + ", dateMillis=" + this.dateMillis + ")";
    }

    public /* synthetic */ ExamItem(long j5, String str, long j6, int i5, AbstractC2168g abstractC2168g) {
        this((i5 & 1) != 0 ? System.currentTimeMillis() : j5, str, j6);
    }
}
