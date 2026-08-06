package p083t3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O3.e;
import W3.q;
import X3.InterfaceC0200y;
import a4.T;
import android.app.Application;
import com.google.android.gms.internal.measurement.C2117x;
import com.notescrafter.PrintOrderViewModel;
import f1.g;
import g4.t;
import java.io.File;
import java.util.List;
import p087u3.m;

/* JADX INFO: renamed from: t3.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2310s0 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PrintOrderViewModel f13214o;
    public final /* synthetic */ List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2310s0(PrintOrderViewModel printOrderViewModel, List list, d dVar) {
        super(2, dVar);
        this.f13214o = printOrderViewModel;
        this.p = list;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2310s0(this.f13214o, this.p, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2310s0 c2310s0 = (C2310s0) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2310s0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        PrintOrderViewModel printOrderViewModel = this.f13214o;
        T t = printOrderViewModel.g;
        List<m> list = this.p;
        t.i(list);
        for (m mVar : list) {
            if (mVar.getR2FileKey() != null && mVar.getLocalPath() == null) {
                Application context = printOrderViewModel.f10889b;
                kotlin.jvm.internal.o.f(context, "context");
                String r2FileKey = mVar.getR2FileKey();
                if (r2FileKey != null) {
                    String strW = q.W(r2FileKey, "/", "_");
                    File file = new File(context.getCacheDir(), q.S(strW, ".pdf", true) ? "preview_".concat(strW) : androidx.compose.foundation.text.modifiers.a.z("preview_", strW, ".pdf"));
                    if (file.exists()) {
                        printOrderViewModel.r(mVar.getId(), new C2279c0(file, 0));
                    } else {
                        F f5 = new F(printOrderViewModel, mVar, r2FileKey, 3);
                        C2117x c2117x = printOrderViewModel.f10891c;
                        c2117x.getClass();
                        b bVarC = c2117x.c("https://notescrafter.com/api/print/preview-pdf/".concat(r2FileKey));
                        bVarC.g();
                        ((t) c2117x.q).a(bVarC.d()).e(new g(4, f5, file));
                    }
                }
            }
        }
        printOrderViewModel.e();
        return o.f154a;
    }
}
