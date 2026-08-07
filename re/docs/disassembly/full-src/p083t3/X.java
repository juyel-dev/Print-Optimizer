package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import a4.InterfaceC0207f;
import a4.T;
import android.net.Uri;
import com.notescrafter.service.PDFProcessor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p087u3.b;
import p087u3.f;
import p087u3.g;
import p087u3.u;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13120o;
    public final /* synthetic */ Y p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y4, d dVar) {
        super(2, dVar);
        this.p = y4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new X(this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        String name;
        a aVar = a.f448o;
        int i5 = this.f13120o;
        Y y4 = this.p;
        T t = y4.u;
        PDFProcessor pDFProcessor = y4.f13124c;
        T t5 = y4.q;
        try {
            if (i5 == 0) {
                o4.d.y(obj);
                u.d dVar = new u.d(0, 100, 1, 1, 0.0f, "Starting Download...");
                t5.getClass();
                t5.j(null, dVar);
                Iterable iterable = (Iterable) y4.f13128i.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (((g) obj2).isSelected()) {
                        arrayList.add(obj2);
                    }
                }
                f fVar = (f) C3.u.r0((List) y4.g.getValue());
                InterfaceC0207f interfaceC0207fN = pDFProcessor.n(arrayList, (b) y4.f13130k.getValue(), (p087u3.e) y4.f13132m.getValue(), ((fVar == null || (name = fVar.getName()) == null) ? "document" : W3.j.D0(name)) + "_processed");
                W w4 = new W(y4);
                this.f13120o = 1;
                if (interfaceC0207fN.collect(w4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o4.d.y(obj);
            }
            File fileL = pDFProcessor.l();
            Long l5 = new Long(fileL != null ? fileL.length() : 0L);
            t.getClass();
            t.j(null, l5);
            u.a aVar2 = new u.a(((Number) y4.f13136s.getValue()).longValue(), ((Number) t.getValue()).longValue(), fileL != null ? Uri.fromFile(fileL) : null);
            t5.getClass();
            t5.j(null, aVar2);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            u.b bVar = new u.b(message);
            t5.getClass();
            t5.j(null, bVar);
        }
        return o.f154a;
    }
}
