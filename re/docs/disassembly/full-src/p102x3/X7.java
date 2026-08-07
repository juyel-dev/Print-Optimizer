package p102x3;

import B3.o;
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
public final class X7 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f14648A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f14649B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f14650C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14651o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ Uri q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14653s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14657y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f14658z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X7(Context context, Uri uri, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, InterfaceC0200y interfaceC0200y, d dVar) {
        super(2, dVar);
        this.p = context;
        this.q = uri;
        this.f14652r = mutableState;
        this.f14653s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14654v = mutableState5;
        this.f14655w = mutableState6;
        this.f14656x = mutableState7;
        this.f14657y = mutableState8;
        this.f14658z = mutableState9;
        this.f14648A = mutableState10;
        this.f14649B = mutableState11;
        this.f14650C = interfaceC0200y;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new X7(this.p, this.q, this.f14652r, this.f14653s, this.t, this.u, this.f14654v, this.f14655w, this.f14656x, this.f14657y, this.f14658z, this.f14648A, this.f14649B, this.f14650C, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((X7) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f14651o;
        MutableState mutableState = this.f14654v;
        MutableState mutableState2 = this.t;
        Uri uri = this.q;
        Context context = this.p;
        MutableState mutableState3 = this.f14652r;
        try {
            if (i5 == 0) {
                o4.d.y(obj);
                AbstractC2416c8.e(mutableState3, true);
                this.f14653s.setValue("Loading PDF...");
                mutableState2.setValue(null);
                this.u.setValue(null);
                mutableState.setValue(null);
                this.f14655w.setValue(1);
                this.f14656x.setValue(Float.valueOf(0.0f));
                try {
                    context.getContentResolver().takePersistableUriPermission(uri, 1);
                } catch (Exception unused) {
                }
                this.f14657y.setValue(uri);
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
                this.f14658z.setValue(string);
                this.f14648A.setValue(Long.valueOf(j5));
                e4.e eVar = H.f1766a;
                e4.d dVar = e4.d.f11107o;
                W7 w7 = new W7(context, uri, this.f14649B, null);
                this.f14651o = 1;
                if (A.C(dVar, w7, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o4.d.y(obj);
            }
            A.t(this.f14650C, null, null, new V7(context, uri, 0, mutableState, null), 3);
        } catch (Exception unused2) {
            mutableState2.setValue("Failed to load PDF file details.");
        } finally {
            AbstractC2416c8.e(mutableState3, false);
        }
        return o.f154a;
    }
}
