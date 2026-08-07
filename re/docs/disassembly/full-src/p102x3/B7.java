package p102x3;

import O3.a;
import O3.c;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import p015d.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B7 implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f13796A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f13797B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f13798C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f13799D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f13800E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f13801F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ MutableState f13802G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ MutableState f13803H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final /* synthetic */ MutableState f13804I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final /* synthetic */ Object f13805J;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13806o = 1;
    public final /* synthetic */ a p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f13807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f13808s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ l u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ State f13809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ State f13810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f13811x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f13812y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f13813z;

    public /* synthetic */ B7(a aVar, MutableState mutableState, Context context, MutableState mutableState2, MutableState mutableState3, l lVar, State state, State state2, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, InterfaceC0200y interfaceC0200y, PDFProcessor pDFProcessor, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14) {
        this.p = aVar;
        this.q = mutableState;
        this.f13807r = context;
        this.f13808s = mutableState2;
        this.t = mutableState3;
        this.u = lVar;
        this.f13809v = state;
        this.f13810w = state2;
        this.f13811x = mutableState4;
        this.f13812y = mutableState5;
        this.f13813z = mutableState6;
        this.f13796A = mutableState7;
        this.f13797B = mutableState8;
        this.f13798C = mutableState9;
        this.f13799D = interfaceC0200y;
        this.f13805J = pDFProcessor;
        this.f13800E = mutableState10;
        this.f13801F = mutableState11;
        this.f13802G = mutableState12;
        this.f13803H = mutableState13;
        this.f13804I = mutableState14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.c
    public final Object invoke(Object obj) {
        MutableState mutableState;
        InterfaceC0200y interfaceC0200y;
        switch (this.f13806o) {
            case 0:
                LazyListScope LazyColumn = (LazyListScope) obj;
                o.f(LazyColumn, "$this$LazyColumn");
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1306846812, true, new C7(this.p)), 3, null);
                MutableState mutableState2 = this.q;
                File file = (File) mutableState2.getValue();
                MutableState mutableState3 = this.f13808s;
                MutableState mutableState4 = this.t;
                MutableState mutableState5 = this.f13811x;
                MutableState mutableState6 = this.f13812y;
                MutableState mutableState7 = this.f13813z;
                Context context = this.f13807r;
                MutableState mutableState8 = this.f13796A;
                MutableState mutableState9 = this.f13797B;
                MutableState mutableState10 = this.f13798C;
                if (file != null) {
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(66498537, true, new E7(context, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10)), 3, null);
                } else if (((Uri) mutableState8.getValue()) == null) {
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1748136901, true, new G7(this.u, this.f13809v, this.f13810w)), 3, null);
                    LazyListScope.item$default(LazyColumn, null, null, X0.e, 3, null);
                    LazyListScope.item$default(LazyColumn, null, null, X0.f14621f, 3, null);
                    LazyListScope.item$default(LazyColumn, null, null, X0.f14622h, 3, null);
                } else {
                    MutableState mutableState11 = this.f13801F;
                    MutableState mutableState12 = this.f13800E;
                    MutableState mutableState13 = mutableState6;
                    MutableState mutableState14 = mutableState4;
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1796353884, true, new I7(mutableState12, mutableState3, mutableState11, mutableState8, mutableState9)), 3, null);
                    Bitmap bitmap = (Bitmap) mutableState9.getValue();
                    InterfaceC0200y interfaceC0200y2 = this.f13799D;
                    if (bitmap != null) {
                        mutableState = mutableState5;
                        interfaceC0200y = interfaceC0200y2;
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-831101410, true, new K7(bitmap, mutableState14, mutableState5, mutableState13, mutableState7)), 3, null);
                        if (AbstractC2416c8.b(mutableState3) > 1) {
                            mutableState13 = mutableState13;
                            mutableState14 = mutableState14;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1835885831, true, new O7(interfaceC0200y, context, this.f13802G, mutableState8, mutableState3, mutableState9)), 3, null);
                        }
                    } else {
                        mutableState = mutableState5;
                        interfaceC0200y = interfaceC0200y2;
                    }
                    mutableState13 = mutableState13;
                    mutableState14 = mutableState14;
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1858440773, true, new Q7(mutableState14, mutableState, mutableState13, mutableState7)), 3, null);
                    MutableState mutableState15 = mutableState14;
                    InterfaceC0200y interfaceC0200y3 = interfaceC0200y;
                    MutableState mutableState16 = mutableState;
                    MutableState mutableState17 = mutableState13;
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-317475548, true, new S7(interfaceC0200y3, context, mutableState10, mutableState8, mutableState3, mutableState15, mutableState16, mutableState17, mutableState7, this.f13803H, this.f13804I, mutableState2, (MutableState) this.f13805J, mutableState12)), 3, null);
                }
                break;
            default:
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                o.f(LazyColumn2, "$this$LazyColumn");
                LazyListScope.item$default(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(1761293046, true, new C2561l9(this.p)), 3, null);
                MutableState mutableState18 = this.q;
                boolean zIsEmpty = ((List) mutableState18.getValue()).isEmpty();
                Context context2 = this.f13807r;
                MutableState mutableState19 = this.f13808s;
                MutableState mutableState20 = this.t;
                if (!zIsEmpty) {
                    LazyListScope.item$default(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-1303753733, true, new C2577m9(mutableState18)), 3, null);
                    List list = (List) mutableState18.getValue();
                    LazyColumn2.items(list.size(), null, new V3(list, 4), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new N8(list, context2, 1)));
                    LazyListScope.item$default(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-649361564, true, new C2625p9(mutableState19, mutableState18, mutableState20)), 3, null);
                } else if (((Uri) mutableState19.getValue()) == null) {
                    LazyListScope.item$default(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-156989225, true, new C2656r9(this.u, this.f13809v, this.f13810w)), 3, null);
                    LazyListScope.item$default(LazyColumn2, null, null, L1.f14149c, 3, null);
                    LazyListScope.item$default(LazyColumn2, null, null, L1.f14150d, 3, null);
                    LazyListScope.item$default(LazyColumn2, null, null, L1.f14151f, 3, null);
                } else {
                    MutableState mutableState21 = this.f13813z;
                    MutableState mutableState22 = this.f13811x;
                    MutableState mutableState23 = this.f13812y;
                    LazyListScope.item$default(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-1065108818, true, new C2688t9(mutableState22, mutableState23, mutableState21, mutableState19)), 3, null);
                    MutableState mutableState24 = this.f13796A;
                    LazyListScope.item$default(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-1529150633, true, new C2704u9(mutableState24)), 3, null);
                    MutableState mutableState25 = this.f13797B;
                    MutableState mutableState26 = this.f13798C;
                    LazyListScope.item$default(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-935661962, true, new C2720v9(mutableState24, mutableState25, mutableState26)), 3, null);
                    MutableState mutableState27 = this.f13803H;
                    MutableState mutableState28 = this.f13804I;
                    LazyListScope.item$default(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-342173291, true, new C2752x9(this.f13799D, context2, mutableState20, mutableState19, mutableState23, this.f13800E, mutableState18, mutableState22, mutableState24, mutableState25, this.f13801F, this.f13802G, mutableState27, mutableState28, mutableState26, (PDFProcessor) this.f13805J)), 3, null);
                }
                break;
        }
        return B3.o.f154a;
    }

    public /* synthetic */ B7(a aVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Context context, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, l lVar, State state, State state2, MutableState mutableState10, MutableState mutableState11, InterfaceC0200y interfaceC0200y, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15) {
        this.p = aVar;
        this.q = mutableState;
        this.f13808s = mutableState2;
        this.t = mutableState3;
        this.f13811x = mutableState4;
        this.f13812y = mutableState5;
        this.f13813z = mutableState6;
        this.f13807r = context;
        this.f13796A = mutableState7;
        this.f13797B = mutableState8;
        this.f13798C = mutableState9;
        this.u = lVar;
        this.f13809v = state;
        this.f13810w = state2;
        this.f13800E = mutableState10;
        this.f13801F = mutableState11;
        this.f13799D = interfaceC0200y;
        this.f13802G = mutableState12;
        this.f13803H = mutableState13;
        this.f13804I = mutableState14;
        this.f13805J = mutableState15;
    }
}
