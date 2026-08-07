package p102x3;

import B3.o;
import C3.C;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.A;
import X3.H;
import X3.InterfaceC0200y;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.runtime.MutableState;

/* JADX INFO: loaded from: classes2.dex */
public final class V9 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14528o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ Uri q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14530s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14531v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14533x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V9(d dVar, Context context, Uri uri, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        super(2, dVar);
        this.p = context;
        this.q = uri;
        this.f14529r = mutableState;
        this.f14530s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14531v = mutableState5;
        this.f14532w = mutableState6;
        this.f14533x = mutableState7;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new V9(dVar, this.p, this.q, this.f14529r, this.f14530s, this.t, this.u, this.f14531v, this.f14532w, this.f14533x);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V9) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Uri uri = this.q;
        Context context = this.p;
        a aVar = a.f448o;
        int i5 = this.f14528o;
        MutableState mutableState = this.u;
        try {
            if (i5 == 0) {
                o4.d.y(obj);
                try {
                    context.getContentResolver().takePersistableUriPermission(uri, 1);
                } catch (Exception unused) {
                }
                this.f14529r.setValue(uri);
                this.f14530s.setValue(C.f167o);
                this.t.setValue(null);
                mutableState.setValue(null);
                String string = "Document.pdf";
                Cursor cursorQuery = context.getContentResolver().query(this.q, null, null, null, null);
                long j5 = 0;
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("_display_name");
                            int columnIndex2 = cursorQuery.getColumnIndex("_size");
                            string = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : "Document.pdf";
                            if (columnIndex2 >= 0) {
                                j5 = cursorQuery.getLong(columnIndex2);
                            }
                        }
                        Q3.a.l(cursorQuery, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Q3.a.l(cursorQuery, th);
                            throw th2;
                        }
                    }
                }
                this.f14531v.setValue(string);
                this.f14532w.setValue(Long.valueOf(j5));
                e4.e eVar = H.f1766a;
                e4.d dVar = e4.d.f11107o;
                U9 u9 = new U9(context, uri, this.f14533x, null);
                this.f14528o = 1;
                obj = A.C(dVar, u9, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o4.d.y(obj);
            }
        } catch (Exception unused2) {
            mutableState.setValue("Failed to load PDF file details.");
        }
        return o.f154a;
    }
}
