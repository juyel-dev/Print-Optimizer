package p083t3;

import B3.j;
import B3.k;
import B3.o;
import O3.c;
import X3.A;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import p011c0.d;

/* JADX INFO: renamed from: t3.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2275a0 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13144o;
    public final /* synthetic */ PrintOrderViewModel p;
    public final /* synthetic */ String q;

    public /* synthetic */ C2275a0(PrintOrderViewModel printOrderViewModel, String str, int i5) {
        this.f13144o = i5;
        this.p = printOrderViewModel;
        this.q = str;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        o oVar = o.f154a;
        String str = this.q;
        PrintOrderViewModel printOrderViewModel = this.p;
        switch (this.f13144o) {
            case 0:
                d dVar = PrintOrderViewModel.f10861f0;
                A.t(Q.h(printOrderViewModel), null, null, new Z0((k) obj, null, printOrderViewModel, str), 3);
                break;
            case 1:
                d dVar2 = PrintOrderViewModel.f10861f0;
                A.t(Q.h(printOrderViewModel), null, null, new c1((k) obj, null, printOrderViewModel, str), 3);
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                d dVar3 = PrintOrderViewModel.f10861f0;
                if (iIntValue >= 100) {
                    iIntValue = 95;
                } else if (iIntValue < 10) {
                    iIntValue = 10;
                }
                printOrderViewModel.r(str, new C2281d0(iIntValue, 0));
                break;
            case 3:
                d dVar4 = PrintOrderViewModel.f10861f0;
                Object obj2 = ((k) obj).f150o;
                if (!(obj2 instanceof j)) {
                    A.t(Q.h(printOrderViewModel), null, null, new X0(printOrderViewModel, str, (String) obj2, null), 3);
                }
                Throwable thA = k.a(obj2);
                if (thA != null) {
                    A.t(Q.h(printOrderViewModel), null, null, new Y0(printOrderViewModel, str, thA, null), 3);
                }
                break;
            default:
                A.t(Q.h(printOrderViewModel), null, null, new C2318w0((k) obj, null, printOrderViewModel, str), 3);
                break;
        }
        return oVar;
    }
}
