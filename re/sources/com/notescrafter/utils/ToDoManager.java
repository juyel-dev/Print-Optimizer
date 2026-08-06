package com.notescrafter.utils;

import C3.C;
import C3.r;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import p051l3.d;

/* JADX INFO: loaded from: classes2.dex */
public final class ToDoManager {
    public static final int $stable = 8;
    private final String KEY_EXAMS;
    private final String KEY_TASKS;
    private final String PREFS_NAME;
    private final Context context;
    private final d gson;
    private final SharedPreferences prefs;

    public ToDoManager(Context context) {
        o.f(context, "context");
        this.context = context;
        this.PREFS_NAME = "notescrafter_todo_prefs";
        this.KEY_TASKS = "tasks_list";
        this.KEY_EXAMS = "exams_list";
        this.gson = new d();
        this.prefs = context.getSharedPreferences("notescrafter_todo_prefs", 0);
    }

    public final List<ExamItem> getExams() {
        String string = this.prefs.getString(this.KEY_EXAMS, null);
        C c5 = C.f167o;
        if (string == null) {
            return c5;
        }
        try {
            Object objB = this.gson.b(ExamItem[].class, string);
            o.e(objB, "fromJson(...)");
            List listB0 = r.b0((Object[]) objB);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB0) {
                if (((ExamItem) obj).getName() != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return c5;
        }
    }

    public final List<ToDoItem> getTasks() {
        String string = this.prefs.getString(this.KEY_TASKS, null);
        C c5 = C.f167o;
        if (string == null) {
            return c5;
        }
        try {
            Object objB = this.gson.b(ToDoItem[].class, string);
            o.e(objB, "fromJson(...)");
            List listB0 = r.b0((Object[]) objB);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB0) {
                if (((ToDoItem) obj).getText() != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return c5;
        }
    }

    public final void saveExams(List<ExamItem> exams) {
        o.f(exams, "exams");
        this.prefs.edit().putString(this.KEY_EXAMS, this.gson.e(exams)).apply();
    }

    public final void saveTasks(List<ToDoItem> tasks) {
        o.f(tasks, "tasks");
        this.prefs.edit().putString(this.KEY_TASKS, this.gson.e(tasks)).apply();
    }
}
