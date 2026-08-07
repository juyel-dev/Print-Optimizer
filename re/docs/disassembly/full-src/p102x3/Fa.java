package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.g;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ToDoItem;
import com.notescrafter.utils.ToDoManager;
import java.util.List;
import kotlin.jvm.internal.p;

/* JADX INFO: loaded from: classes2.dex */
public final class Fa extends p implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f13955o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ToDoManager f13956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f13957s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fa(List list, long j5, long j6, ToDoManager toDoManager, MutableState mutableState) {
        super(4);
        this.f13955o = list;
        this.p = j5;
        this.q = j6;
        this.f13956r = toDoManager;
        this.f13957s = mutableState;
    }

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i5;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i5 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i5 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i5 |= composer.changed(iIntValue) ? 32 : 16;
        }
        if ((i5 & 147) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            ToDoItem toDoItem = (ToDoItem) this.f13955o.get(iIntValue);
            composer.startReplaceGroup(1454111341);
            composer.startReplaceGroup(739650138);
            boolean zChangedInstance = composer.changedInstance(toDoItem);
            ToDoManager toDoManager = this.f13956r;
            boolean zChangedInstance2 = zChangedInstance | composer.changedInstance(toDoManager);
            Object objRememberedValue = composer.rememberedValue();
            MutableState mutableState = this.f13957s;
            if (zChangedInstance2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Da(toDoManager, mutableState, toDoItem, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            c cVar = (c) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(739658855);
            boolean zChangedInstance3 = composer.changedInstance(toDoItem) | composer.changedInstance(toDoManager);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Ea(toDoManager, mutableState, toDoItem, 0);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Ja.f(toDoItem, this.p, this.q, 0L, cVar, (a) objRememberedValue2, composer, 0, 8);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
