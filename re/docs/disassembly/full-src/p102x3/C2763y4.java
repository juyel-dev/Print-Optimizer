package p102x3;

import O3.a;
import O3.c;
import O3.f;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2763y4 implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f15749o;
    public final /* synthetic */ c p;
    public final /* synthetic */ int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15750r;

    public C2763y4(List list, c cVar, int i5, MutableState mutableState) {
        this.f15749o = list;
        this.p = cVar;
        this.q = i5;
        this.f15750r = mutableState;
    }

    @Override // O3.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope DropdownMenu = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        o.f(DropdownMenu, "$this$DropdownMenu");
        if ((iIntValue & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(400069395, iIntValue, -1, "com.notescrafter.ui.screens.DropdownSelector.<anonymous>.<anonymous>.<anonymous> (EnhanceScreen.kt:656)");
            }
            Iterator it = this.f15749o.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Number) it.next()).intValue();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1944773627, true, new C2747x4(iIntValue2, this.q), composer, 54);
                composer.startReplaceGroup(1837639602);
                c cVar = this.p;
                boolean zChanged = composer.changed(cVar) | composer.changed(iIntValue2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new T5(cVar, iIntValue2, this.f15750r);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (a) objRememberedValue, null, null, null, false, null, null, null, composer, 6, 508);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return B3.o.f154a;
    }
}
