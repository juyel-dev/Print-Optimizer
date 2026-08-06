package p102x3;

import B3.o;
import O3.a;
import O3.c;
import O3.g;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.internal.p;
import n4.l;

/* JADX INFO: loaded from: classes2.dex */
public final class W3 extends p implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14564o = 0;
    public final /* synthetic */ List p;
    public final /* synthetic */ c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f14565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14566s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(List list, c cVar, c cVar2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        super(4);
        this.p = list;
        this.q = cVar;
        this.f14565r = cVar2;
        this.f14566s = mutableState;
        this.t = mutableState2;
        this.u = mutableState3;
    }

    @Override // O3.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i5;
        int i6;
        switch (this.f14564o) {
            case 0:
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
                    H3 h5 = (H3) this.p.get(iIntValue);
                    composer.startReplaceGroup(-1523591146);
                    composer.startReplaceGroup(-1573166037);
                    c cVar = this.q;
                    boolean zChanged = composer.changed(cVar) | composer.changedInstance(h5);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new T3(cVar, h5, 0);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    a aVar = (a) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1573163733);
                    c cVar2 = this.f14565r;
                    boolean zChanged2 = composer.changed(cVar2) | composer.changedInstance(h5);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new T3(cVar2, h5, 1);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    a aVar2 = (a) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1573161279);
                    boolean zChangedInstance = composer.changedInstance(h5);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new U3(0, this.f14566s, this.t, h5);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    a aVar3 = (a) objRememberedValue3;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1573155230);
                    boolean zChangedInstance2 = composer.changedInstance(h5);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new l(1, h5, (MutableState) this.u);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    X3.a(h5, aVar, aVar2, aVar3, (a) objRememberedValue4, null, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i6 = (composer2.changed(lazyGridItemScope) ? 4 : 2) | iIntValue4;
                } else {
                    i6 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i6 |= composer2.changed(iIntValue3) ? 32 : 16;
                }
                if ((i6 & 147) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1229287273, i6, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)");
                    }
                    p087u3.g gVar = (p087u3.g) this.p.get(iIntValue3);
                    composer2.startReplaceGroup(3320303);
                    int i7 = iIntValue3 + 1;
                    composer2.startReplaceGroup(1662678688);
                    List list = (List) this.u;
                    int i8 = (i6 & 112) ^ 48;
                    boolean z3 = true;
                    boolean zChangedInstance3 = composer2.changedInstance(list) | ((i8 > 32 && composer2.changed(iIntValue3)) || (i6 & 48) == 32);
                    c cVar3 = this.q;
                    boolean zChanged3 = zChangedInstance3 | composer2.changed(cVar3);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new Ta(list, cVar3, iIntValue3);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    a aVar4 = (a) objRememberedValue5;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1662687513);
                    c cVar4 = this.f14565r;
                    boolean zChanged4 = composer2.changed(cVar4) | ((i8 > 32 && composer2.changed(iIntValue3)) || (i6 & 48) == 32);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new J8(cVar4, iIntValue3, 4);
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    a aVar5 = (a) objRememberedValue6;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1662689303);
                    if ((i8 <= 32 || !composer2.changed(iIntValue3)) && (i6 & 48) != 32) {
                        z3 = false;
                    }
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (z3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new Ta(iIntValue3, this.f14566s, this.t);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    Ua.a(gVar, i7, aVar4, aVar5, (a) objRememberedValue7, null, composer2, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return o.f154a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(List list, List list2, c cVar, c cVar2, MutableState mutableState, MutableState mutableState2) {
        super(4);
        this.p = list;
        this.u = list2;
        this.q = cVar;
        this.f14565r = cVar2;
        this.f14566s = mutableState;
        this.t = mutableState2;
    }
}
