package p102x3;

import O3.c;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I3 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14055o = 1;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f14057s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ I3(Context context, InterfaceC0200y interfaceC0200y, PrintOrderViewModel printOrderViewModel, PDFProcessor pDFProcessor, MutableState mutableState, MutableState mutableState2) {
        this.f14056r = context;
        this.f14057s = interfaceC0200y;
        this.t = printOrderViewModel;
        this.u = pDFProcessor;
        this.p = mutableState;
        this.q = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f14055o) {
            case 0:
                LazyListScope LazyColumn = (LazyListScope) obj;
                o.f(LazyColumn, "$this$LazyColumn");
                List list = (List) this.p.getValue();
                LazyColumn.items(list.size(), null, new V3(list, 0), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new W3(list, (c) this.t, (c) this.u, this.q, (MutableState) this.f14056r, (MutableState) this.f14057s)));
                break;
            default:
                File file = (File) obj;
                o.f(file, "file");
                Gd.w(this.p, false);
                Uri uriFromFile = Uri.fromFile(file);
                o.e(uriFromFile, "fromFile(...)");
                A.t((InterfaceC0200y) this.f14057s, null, null, new Fd((String) this.q.getValue(), (Context) this.f14056r, uriFromFile, (PrintOrderViewModel) this.t, (PDFProcessor) this.u, null), 3);
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ I3(MutableState mutableState, c cVar, c cVar2, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.p = mutableState;
        this.t = cVar;
        this.u = cVar2;
        this.q = mutableState2;
        this.f14056r = mutableState3;
        this.f14057s = mutableState4;
    }
}
