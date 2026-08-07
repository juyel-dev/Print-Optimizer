package p102x3;

import B3.o;
import O3.a;
import O3.g;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.notescrafter.PrintOrderViewModel;
import java.util.List;
import kotlin.jvm.internal.p;
import p087u3.m;

/* JADX INFO: renamed from: x3.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2756xd extends p implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f15738o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15740s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2756xd(List list, PrintOrderViewModel printOrderViewModel, String str, MutableState mutableState, MutableState mutableState2) {
        super(4);
        this.f15738o = list;
        this.p = printOrderViewModel;
        this.q = str;
        this.f15739r = mutableState;
        this.f15740s = mutableState2;
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
            m mVar = (m) this.f15738o.get(iIntValue);
            composer.startReplaceGroup(22210775);
            composer.startReplaceGroup(-553466825);
            boolean zChanged = composer.changed(mVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new U3(1, this.f15739r, this.f15740s, mVar);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Gd.g(mVar, this.p, this.q, (a) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return o.f154a;
    }
}
