package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.e;
import Y3.d;
import android.content.Context;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.ColorKt;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.utils.ToDoManager;
import java.util.List;
import p083t3.C2306q;

/* JADX INFO: renamed from: x3.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2579mb implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15317o = 0;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15318r;

    public C2579mb(PrintOrderViewModel printOrderViewModel, Context context, MutableState mutableState) {
        this.q = printOrderViewModel;
        this.f15318r = context;
        this.p = mutableState;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15317o) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                if ((iIntValue & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1682559956, iIntValue, -1, "com.notescrafter.ui.screens.PrintAddressesScreen.<anonymous> (PrintAddressesScreen.kt:537)");
                    }
                    composer.startReplaceGroup(-221478420);
                    PrintOrderViewModel printOrderViewModel = (PrintOrderViewModel) this.q;
                    boolean zChangedInstance = composer.changedInstance(printOrderViewModel);
                    Context context = (Context) this.f15318r;
                    boolean zChangedInstance2 = zChangedInstance | composer.changedInstance(context);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new C2306q(printOrderViewModel, this.p, context, 8);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    ButtonKt.Button((a) objRememberedValue, null, false, null, ButtonDefaults.INSTANCE.m1520buttonColorsro_MJ88(ColorKt.Color(4293870660L), 0L, 0L, 0L, composer, (ButtonDefaults.$stable << 12) | 6, 14), null, null, null, null, AbstractC2649r2.e, composer, 805306368, 494);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if ((iIntValue2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1865734692, iIntValue2, -1, "com.notescrafter.ui.screens.ToDoScreen.<anonymous> (ToDoScreen.kt:359)");
                    }
                    MutableState mutableState = this.p;
                    List list = (List) mutableState.getValue();
                    composer2.startReplaceGroup(394820350);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Bb(16, (MutableState) this.f15318r);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    a aVar = (a) objRememberedValue2;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(394822578);
                    ToDoManager toDoManager = (ToDoManager) this.q;
                    boolean zChangedInstance3 = composer2.changedInstance(toDoManager);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new d(11, toDoManager, mutableState);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    Ye.d(list, aVar, (c) objRememberedValue3, composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return o.f154a;
    }

    public C2579mb(ToDoManager toDoManager, MutableState mutableState, MutableState mutableState2) {
        this.q = toDoManager;
        this.p = mutableState;
        this.f15318r = mutableState2;
    }
}
