package p083t3;

import B3.j;
import B3.k;
import B3.o;
import C3.u;
import C3.w;
import O3.c;
import Q3.a;
import X3.A;
import X3.InterfaceC0200y;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Q;
import com.notescrafter.PrintOrderViewModel;
import com.notescrafter.service.PDFProcessor;
import java.util.ArrayList;
import java.util.List;
import p102x3.C2438de;
import p102x3.O8;
import p102x3.Pa;
import p102x3.Va;

/* JADX INFO: renamed from: t3.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2291i0 implements c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13179o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13180r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13181s;

    public /* synthetic */ C2291i0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, PrintOrderViewModel printOrderViewModel) {
        this.f13179o = 5;
        this.f13180r = mutableState;
        this.q = mutableState2;
        this.f13181s = mutableState3;
        this.p = printOrderViewModel;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        switch (this.f13179o) {
            case 0:
                PrintOrderViewModel printOrderViewModel = (PrintOrderViewModel) this.p;
                A.t(Q.h(printOrderViewModel), null, null, new C2293j0((k) obj, printOrderViewModel, (J) this.f13180r, (String) this.q, (D) this.f13181s, null), 3);
                return o.f154a;
            case 1:
                PrintOrderViewModel printOrderViewModel2 = (PrintOrderViewModel) this.p;
                A.t(Q.h(printOrderViewModel2), null, null, new R0((k) obj, printOrderViewModel2, (J) this.f13180r, (String) this.q, (D) this.f13181s, null), 3);
                return o.f154a;
            case 2:
                PrintOrderViewModel printOrderViewModel3 = (PrintOrderViewModel) this.p;
                A.t(Q.h(printOrderViewModel3), null, null, new a1((k) obj, printOrderViewModel3, (Pa) this.f13180r, (String) this.q, (Va) this.f13181s, null), 3);
                return o.f154a;
            case 3:
                List uris = (List) obj;
                kotlin.jvm.internal.o.f(uris, "uris");
                if (!uris.isEmpty()) {
                    List<Uri> list = uris;
                    ArrayList arrayList = new ArrayList(w.Y(list));
                    for (Uri uri : list) {
                        Cursor cursorQuery = ((Context) this.p).getContentResolver().query(uri, null, null, null, null);
                        String string = "Image.jpg";
                        long j5 = 0;
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    int columnIndex = cursorQuery.getColumnIndex("_display_name");
                                    int columnIndex2 = cursorQuery.getColumnIndex("_size");
                                    string = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : "Image.jpg";
                                    if (columnIndex2 >= 0) {
                                        j5 = cursorQuery.getLong(columnIndex2);
                                    }
                                }
                                a.l(cursorQuery, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    a.l(cursorQuery, th);
                                    throw th2;
                                }
                            }
                        }
                        arrayList.add(new C2438de(uri, string, j5));
                    }
                    MutableState mutableState = (MutableState) this.f13180r;
                    mutableState.setValue(u.z0((List) mutableState.getValue(), arrayList));
                    ((MutableState) this.q).setValue(null);
                    ((MutableState) this.f13181s).setValue(null);
                }
                return o.f154a;
            case 4:
                List uris2 = (List) obj;
                kotlin.jvm.internal.o.f(uris2, "uris");
                if (!uris2.isEmpty()) {
                    A.t((InterfaceC0200y) this.p, null, null, new O8(uris2, (Context) this.f13180r, (PDFProcessor) this.q, (MutableState) this.f13181s, null), 3);
                }
                return o.f154a;
            default:
                ((MutableState) this.f13180r).setValue(Boolean.FALSE);
                Object obj2 = ((k) obj).f150o;
                if (!(obj2 instanceof j)) {
                    ((MutableState) this.q).setValue((String) obj2);
                    ((MutableState) this.f13181s).setValue(Boolean.TRUE);
                }
                Throwable thA = k.a(obj2);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = "Failed to place order";
                    }
                    ((PrintOrderViewModel) this.p).f10908w.i(message);
                }
                return o.f154a;
        }
    }

    public /* synthetic */ C2291i0(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f13179o = i5;
        this.p = obj;
        this.f13180r = obj2;
        this.q = obj3;
        this.f13181s = obj4;
    }
}
