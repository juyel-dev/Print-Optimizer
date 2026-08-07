package p102x3;

import O3.a;
import W3.j;
import a4.T;
import com.notescrafter.PrintOrderViewModel;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import p083t3.C2275a0;
import p087u3.q;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oc implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14272o;
    public final /* synthetic */ PrintOrderViewModel p;

    public /* synthetic */ Oc(PrintOrderViewModel printOrderViewModel, int i5) {
        this.f14272o = i5;
        this.p = printOrderViewModel;
    }

    @Override // O3.a
    public final Object invoke() {
        switch (this.f14272o) {
            case 0:
                PrintOrderViewModel printOrderViewModel = this.p;
                printOrderViewModel.f10884W.i(null);
                printOrderViewModel.f10886Y.i(null);
                break;
            default:
                PrintOrderViewModel printOrderViewModel2 = this.p;
                String string = j.I0((String) printOrderViewModel2.u.getValue()).toString();
                String input = j.I0(((q) printOrderViewModel2.f10898i.getValue()).getPhone()).toString();
                Pattern patternCompile = Pattern.compile("\\D");
                o.e(patternCompile, "compile(...)");
                o.f(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                o.e(strReplaceAll, "replaceAll(...)");
                String strG0 = j.G0(strReplaceAll);
                if (string.length() == 6 && strG0.length() != 0) {
                    Boolean bool = Boolean.TRUE;
                    T t = printOrderViewModel2.f10906s;
                    t.getClass();
                    t.j(null, bool);
                    printOrderViewModel2.f10870I.i(null);
                    printOrderViewModel2.f10891c.o(strG0, string, new C2275a0(printOrderViewModel2, strG0, 1));
                }
                break;
        }
        return B3.o.f154a;
    }
}
