package p102x3;

import B3.o;
import O3.a;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.notescrafter.service.PDFProcessor;
import java.util.List;

/* JADX INFO: renamed from: x3.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2382a6 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14772o = 0;
    public final /* synthetic */ Context p;
    public final /* synthetic */ InterfaceC0200y q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14774s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14775v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f14778y;

    public /* synthetic */ C2382a6(InterfaceC0200y interfaceC0200y, MutableState mutableState, Context context, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        this.q = interfaceC0200y;
        this.f14773r = mutableState;
        this.p = context;
        this.f14774s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14775v = mutableState5;
        this.f14776w = mutableState6;
        this.f14777x = mutableState7;
        this.f14778y = mutableState8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14772o) {
            case 0:
                MutableState mutableState = this.f14773r;
                if (!((List) mutableState.getValue()).isEmpty()) {
                    A.t(this.q, null, null, new C2462f6(this.p, this.f14774s, this.t, this.u, this.f14775v, mutableState, this.f14776w, this.f14777x, (MutableState) this.f14778y, null), 3);
                }
                break;
            case 1:
                Uri uri = (Uri) this.f14773r.getValue();
                if (uri != null) {
                    MutableState mutableState2 = this.f14774s;
                    boolean zIsEmpty = ((List) mutableState2.getValue()).isEmpty();
                    Context context = this.p;
                    if (zIsEmpty) {
                        Toast.makeText(context, "No pages to save!", 0).show();
                    } else {
                        A.t(this.q, null, null, new C2513i9(null, context, uri, this.t, this.u, this.f14775v, this.f14776w, this.f14777x, (MutableState) this.f14778y, mutableState2), 3);
                    }
                }
                break;
            default:
                MutableState mutableState3 = this.f14773r;
                if (((List) mutableState3.getValue()).size() >= 2) {
                    A.t(this.q, null, null, new P8((PDFProcessor) this.f14778y, this.p, this.f14774s, this.t, this.u, this.f14775v, this.f14776w, mutableState3, this.f14777x, null), 3);
                }
                break;
        }
        return o.f154a;
    }

    public /* synthetic */ C2382a6(InterfaceC0200y interfaceC0200y, MutableState mutableState, PDFProcessor pDFProcessor, Context context, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        this.q = interfaceC0200y;
        this.f14773r = mutableState;
        this.f14778y = pDFProcessor;
        this.p = context;
        this.f14774s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14775v = mutableState5;
        this.f14776w = mutableState6;
        this.f14777x = mutableState7;
    }

    public /* synthetic */ C2382a6(Context context, InterfaceC0200y interfaceC0200y, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        this.p = context;
        this.q = interfaceC0200y;
        this.f14773r = mutableState;
        this.f14774s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14775v = mutableState5;
        this.f14776w = mutableState6;
        this.f14777x = mutableState7;
        this.f14778y = mutableState8;
    }
}
