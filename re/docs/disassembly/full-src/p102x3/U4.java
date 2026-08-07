package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.notescrafter.service.PDFProcessor;
import p087u3.b;
import p087u3.g;

/* JADX INFO: loaded from: classes2.dex */
public final class U4 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14488o;
    public final /* synthetic */ g p;
    public final /* synthetic */ PDFProcessor q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f14489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14490s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(g gVar, PDFProcessor pDFProcessor, b bVar, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.p = gVar;
        this.q = pDFProcessor;
        this.f14489r = bVar;
        this.f14490s = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new U4(this.p, this.q, this.f14489r, this.f14490s, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U4) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f14488o;
        if (i5 == 0) {
            o4.d.y(obj);
            Bitmap thumbnail = this.p.getThumbnail();
            if (thumbnail != null) {
                e4.e eVar = H.f1766a;
                e4.d dVar = e4.d.f11107o;
                T4 t5 = new T4(thumbnail, this.q, this.f14489r, this.f14490s, null);
                this.f14488o = 1;
                if (A.C(dVar, t5, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f14490s.setValue(null);
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o4.d.y(obj);
        }
        return o.f154a;
    }
}
