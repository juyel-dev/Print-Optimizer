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

/* JADX INFO: loaded from: classes2.dex */
public final class Y4 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14702o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ PDFProcessor q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f14703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14704s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(MutableState mutableState, PDFProcessor pDFProcessor, b bVar, MutableState mutableState2, d dVar) {
        super(2, dVar);
        this.p = mutableState;
        this.q = pDFProcessor;
        this.f14703r = bVar;
        this.f14704s = mutableState2;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Y4(this.p, this.q, this.f14703r, this.f14704s, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Y4) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f14702o;
        if (i5 == 0) {
            o4.d.y(obj);
            Bitmap bitmap = (Bitmap) this.p.getValue();
            if (bitmap != null) {
                e4.e eVar = H.f1766a;
                e4.d dVar = e4.d.f11107o;
                X4 x4 = new X4(bitmap, this.q, this.f14703r, this.f14704s, null);
                this.f14702o = 1;
                if (A.C(dVar, x4, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f14704s.setValue(null);
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
