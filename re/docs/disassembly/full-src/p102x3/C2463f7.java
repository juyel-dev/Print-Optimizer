package p102x3;

import O3.a;
import O3.c;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.notescrafter.service.PDFProcessor;
import com.notescrafter.utils.ToDoManager;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: x3.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2463f7 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14998o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15000s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15004y;

    public /* synthetic */ C2463f7(a aVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, State state, ToDoManager toDoManager, MutableState mutableState6, MutableState mutableState7) {
        this.f14998o = 2;
        this.p = aVar;
        this.f15000s = mutableState;
        this.t = mutableState2;
        this.u = mutableState3;
        this.f15001v = mutableState4;
        this.f15002w = mutableState5;
        this.q = state;
        this.f14999r = toDoManager;
        this.f15003x = mutableState6;
        this.f15004y = mutableState7;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f14998o) {
            case 0:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    MutableState mutableState = this.f15003x;
                    MutableState mutableState2 = this.f15004y;
                    A.t((InterfaceC0200y) this.p, null, null, new C2734w7(null, (Context) this.q, uri, this.f15000s, this.t, this.u, this.f15001v, this.f15002w, mutableState, mutableState2, (PDFProcessor) this.f14999r), 3);
                }
                break;
            case 1:
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    MutableState mutableState3 = this.f15003x;
                    MutableState mutableState4 = this.f15004y;
                    A.t((InterfaceC0200y) this.p, null, null, new C2784z9(null, (Context) this.q, uri2, this.f15000s, this.t, this.u, this.f15001v, this.f15002w, mutableState3, mutableState4, (PDFProcessor) this.f14999r), 3);
                }
                break;
            default:
                LazyListScope LazyColumn = (LazyListScope) obj;
                o.f(LazyColumn, "$this$LazyColumn");
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1403587037, true, new C2450ea((a) this.p)), 3, null);
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-978553062, true, new C2482ga(this.f15000s, this.t, this.u, this.f15001v)), 3, null);
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(965418843, true, new C2530ja(this.f15002w, (State) this.q)), 3, null);
                LazyListScope.item$default(LazyColumn, null, null, AbstractC2378a2.f14767b, 3, null);
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(558395357, true, new C2610oa((ToDoManager) this.f14999r, this.f15003x, this.f15004y)), 3, null);
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ C2463f7(InterfaceC0200y interfaceC0200y, Context context, PDFProcessor pDFProcessor, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, int i5) {
        this.f14998o = i5;
        this.p = interfaceC0200y;
        this.q = context;
        this.f14999r = pDFProcessor;
        this.f15000s = mutableState;
        this.t = mutableState2;
        this.u = mutableState3;
        this.f15001v = mutableState4;
        this.f15002w = mutableState5;
        this.f15003x = mutableState6;
        this.f15004y = mutableState7;
    }
}
