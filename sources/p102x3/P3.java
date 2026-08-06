package p102x3;

import C3.C;
import C3.w;
import O3.a;
import W3.q;
import androidx.compose.runtime.MutableState;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class P3 implements a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14279o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14280r;

    public /* synthetic */ P3(int i5, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f14279o = i5;
        this.p = mutableState;
        this.q = mutableState2;
        this.f14280r = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O3.a
    public final Object invoke() {
        switch (this.f14279o) {
            case 0:
                MutableState mutableState = this.p;
                File file = (File) mutableState.getValue();
                o.c(file);
                MutableState mutableState2 = this.q;
                File file2 = new File(file.getParent(), q.S((String) mutableState2.getValue(), ".pdf", true) ? (String) mutableState2.getValue() : androidx.compose.foundation.text.modifiers.a.l((String) mutableState2.getValue(), ".pdf"));
                if (file.renameTo(file2)) {
                    MutableState mutableState3 = this.f14280r;
                    List<H3> list = (List) mutableState3.getValue();
                    ArrayList arrayList = new ArrayList(w.Y(list));
                    for (H3 h5 : list) {
                        if (h5.f14014a.equals(file)) {
                            String name = file2.getName();
                            o.e(name, "getName(...)");
                            h5 = new H3(file2, name, h5.f14016c, h5.f14017d);
                        }
                        arrayList.add(h5);
                    }
                    mutableState3.setValue(arrayList);
                }
                mutableState.setValue(null);
                break;
            case 1:
                this.p.setValue(C.f167o);
                this.q.setValue(null);
                this.f14280r.setValue(null);
                break;
            case 2:
                this.p.setValue(null);
                this.q.setValue(null);
                this.f14280r.setValue(null);
                break;
            case 3:
                this.p.setValue(C.f167o);
                this.q.setValue(null);
                this.f14280r.setValue(null);
                break;
            case 4:
                MutableState mutableState4 = this.p;
                List list2 = (List) mutableState4.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (!((D6) obj).f13862d) {
                        arrayList2.add(obj);
                    }
                }
                mutableState4.setValue(arrayList2);
                this.q.setValue(null);
                this.f14280r.setValue(null);
                break;
            case 5:
                ArrayList arrayList3 = new ArrayList();
                MutableState mutableState5 = this.p;
                for (D6 d6 : (List) mutableState5.getValue()) {
                    arrayList3.add(d6);
                    if (d6.f13862d) {
                        String string = UUID.randomUUID().toString();
                        o.e(string, "toString(...)");
                        arrayList3.add(D6.a(d6, string, 0, false, 22));
                    }
                }
                mutableState5.setValue(arrayList3);
                this.q.setValue(null);
                this.f14280r.setValue(null);
                break;
            case 6:
                this.p.setValue(null);
                this.q.setValue(C.f167o);
                this.f14280r.setValue(null);
                break;
            default:
                this.p.setValue(Boolean.FALSE);
                this.q.setValue("");
                this.f14280r.setValue("");
                break;
        }
        return B3.o.f154a;
    }
}
