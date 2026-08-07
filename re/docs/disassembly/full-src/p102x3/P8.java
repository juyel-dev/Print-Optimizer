package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.InterfaceC0207f;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.notescrafter.service.PDFProcessor;
import com.notescrafter.utils.ReviewHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p087u3.b;
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public final class P8 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14286o;
    public final /* synthetic */ PDFProcessor p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14288s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14290w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14291x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P8(PDFProcessor pDFProcessor, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, d dVar) {
        super(2, dVar);
        this.p = pDFProcessor;
        this.q = context;
        this.f14287r = mutableState;
        this.f14288s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14289v = mutableState5;
        this.f14290w = mutableState6;
        this.f14291x = mutableState7;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new P8(this.p, this.q, this.f14287r, this.f14288s, this.t, this.u, this.f14289v, this.f14290w, this.f14291x, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((P8) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        Context context = this.q;
        a aVar = a.f448o;
        int i5 = this.f14286o;
        PDFProcessor pDFProcessor = this.p;
        MutableState mutableState = this.f14289v;
        MutableState mutableState2 = this.u;
        MutableState mutableState3 = this.f14287r;
        try {
            if (i5 == 0) {
                o4.d.y(obj);
                mutableState3.setValue(Boolean.TRUE);
                Float fValueOf = Float.valueOf(0.0f);
                MutableState mutableState4 = this.f14288s;
                mutableState4.setValue(fValueOf);
                MutableState mutableState5 = this.t;
                mutableState5.setValue("Loading pages...");
                mutableState2.setValue(null);
                mutableState.setValue(null);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) this.f14290w.getValue()).iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    C6 c6 = (C6) it.next();
                    int i7 = c6.f13844d;
                    int i8 = 0;
                    while (i8 < i7) {
                        arrayList.add(new g(i6, null, true, c6.f13841a, i8, null, null, 96, null));
                        i6++;
                        i8++;
                        it = it;
                    }
                }
                InterfaceC0207f interfaceC0207fN = pDFProcessor.n(arrayList, new b(false, false, false, false, 0, false, null, null, 252, null), new p087u3.e(p087u3.d.HIGH, p087u3.a.ORIGINAL, null, 0, 0, false, false, 124, null), "Merged_" + System.currentTimeMillis());
                C2735w8 c2735w8 = new C2735w8(1, mutableState4, mutableState5);
                this.f14286o = 1;
                if (interfaceC0207fN.collect(c2735w8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o4.d.y(obj);
            }
            File fileL = pDFProcessor.l();
            if (fileL == null || !fileL.exists()) {
                mutableState2.setValue("Failed to output merged file.");
            } else {
                mutableState.setValue(fileL);
                this.f14291x.setValue(Long.valueOf(fileL.length()));
                Toast.makeText(context, "PDFs merged successfully!", 0).show();
                ReviewHelper.INSTANCE.incrementSuccessAndPrompt(context);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "An unexpected error occurred.";
            }
            mutableState2.setValue(message);
        } finally {
            mutableState3.setValue(Boolean.FALSE);
        }
        return o.f154a;
    }
}
