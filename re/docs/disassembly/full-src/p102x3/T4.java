package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.notescrafter.service.PDFProcessor;
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class T4 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bitmap f14446o;
    public final /* synthetic */ PDFProcessor p;
    public final /* synthetic */ b q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14447r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(Bitmap bitmap, PDFProcessor pDFProcessor, b bVar, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f14446o = bitmap;
        this.p = pDFProcessor;
        this.q = bVar;
        this.f14447r = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new T4(this.f14446o, this.p, this.q, this.f14447r, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        T4 t5 = (T4) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        t5.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        Bitmap bitmap = this.f14446o;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmap.copy(config, true);
        kotlin.jvm.internal.o.c(bitmapCopy);
        this.p.k(bitmapCopy, this.q);
        this.f14447r.setValue(bitmapCopy);
        return o.f154a;
    }
}
