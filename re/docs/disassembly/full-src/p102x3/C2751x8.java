package p102x3;

import B3.o;
import C3.w;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.InterfaceC0207f;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.notescrafter.service.PDFProcessor;
import com.notescrafter.utils.ReviewHelper;
import java.io.File;
import java.util.ArrayList;
import p087u3.b;
import p087u3.g;

/* JADX INFO: renamed from: x3.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2751x8 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15713o;
    public final /* synthetic */ PDFProcessor p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15715s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Uri f15719y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2751x8(d dVar, Context context, Uri uri, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, PDFProcessor pDFProcessor) {
        super(2, dVar);
        this.p = pDFProcessor;
        this.q = context;
        this.f15714r = mutableState;
        this.f15715s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f15716v = mutableState5;
        this.f15717w = mutableState6;
        this.f15718x = mutableState7;
        this.f15719y = uri;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        MutableState mutableState = this.f15718x;
        return new C2751x8(dVar, this.q, this.f15719y, this.f15714r, this.f15715s, this.t, this.u, this.f15716v, this.f15717w, mutableState, this.p);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2751x8) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z3;
        boolean z4;
        Context context = this.q;
        a aVar = a.f448o;
        int i5 = this.f15713o;
        PDFProcessor pDFProcessor = this.p;
        MutableState mutableState = this.u;
        MutableState mutableState2 = this.t;
        MutableState mutableState3 = this.f15714r;
        try {
            try {
                if (i5 == 0) {
                    o4.d.y(obj);
                    AbstractC2783z8.e(mutableState3, true);
                    MutableState mutableState4 = this.f15715s;
                    mutableState4.setValue("Inverting PDF colors...");
                    mutableState2.setValue(null);
                    mutableState.setValue(null);
                    Float fValueOf = Float.valueOf(0.0f);
                    MutableState mutableState5 = this.f15716v;
                    mutableState5.setValue(fValueOf);
                    String strD0 = W3.j.D0((String) this.f15717w.getValue());
                    T3.e eVarT = Q3.a.T(0, AbstractC2783z8.b(this.f15718x));
                    Uri uri = this.f15719y;
                    ArrayList arrayList = new ArrayList(w.Y(eVarT));
                    T3.d it = eVarT.iterator();
                    while (it.q) {
                        int iA = it.a();
                        ArrayList arrayList2 = arrayList;
                        Uri uri2 = uri;
                        arrayList2.add(new g(iA, null, true, uri2, iA, null, null, 96, null));
                        arrayList = arrayList2;
                        uri = uri2;
                    }
                    InterfaceC0207f interfaceC0207fN = pDFProcessor.n(arrayList, new b(true, false, false, false, 0, false, null, null, 240, null), new p087u3.e(p087u3.d.HIGH, p087u3.a.ORIGINAL, null, 0, 0, false, false, 60, null), strD0 + "_inverted");
                    C2735w8 c2735w8 = new C2735w8(0, mutableState5, mutableState4);
                    this.f15713o = 1;
                    if (interfaceC0207fN.collect(c2735w8, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        o4.d.y(obj);
                    } catch (Throwable th) {
                        th = th;
                        z3 = false;
                        AbstractC2783z8.e(mutableState3, z3);
                        throw th;
                    }
                }
                File fileL = pDFProcessor.l();
                if (fileL == null || !fileL.exists()) {
                    mutableState2.setValue("Failed to output inverted PDF.");
                } else {
                    mutableState.setValue(fileL);
                    Toast.makeText(context, "PDF inverted successfully!", 0).show();
                    ReviewHelper.INSTANCE.incrementSuccessAndPrompt(context);
                }
                z4 = false;
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Failed to invert PDF.";
                }
                mutableState2.setValue(message);
                z4 = false;
            }
            AbstractC2783z8.e(mutableState3, z4);
            return o.f154a;
        } catch (Throwable th2) {
            th = th2;
            z3 = false;
        }
    }
}
