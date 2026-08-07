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

/* JADX INFO: renamed from: x3.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2719v8 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f15640A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f15641B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0200y f15642C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15643o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ Uri q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15645s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15649y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f15650z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2719v8(Context context, Uri uri, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, InterfaceC0200y interfaceC0200y, d dVar) {
        super(2, dVar);
        this.p = context;
        this.q = uri;
        this.f15644r = mutableState;
        this.f15645s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f15646v = mutableState5;
        this.f15647w = mutableState6;
        this.f15648x = mutableState7;
        this.f15649y = mutableState8;
        this.f15650z = mutableState9;
        this.f15640A = mutableState10;
        this.f15641B = mutableState11;
        this.f15642C = interfaceC0200y;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2719v8(this.p, this.q, this.f15644r, this.f15645s, this.t, this.u, this.f15646v, this.f15647w, this.f15648x, this.f15649y, this.f15650z, this.f15640A, this.f15641B, this.f15642C, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2719v8) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        int i5 = this.f15643o;
        MutableState mutableState = this.f15646v;
        MutableState mutableState2 = this.t;
        Uri uri = this.q;
        Context context = this.p;
        MutableState mutableState3 = this.f15644r;
        try {
            if (i5 == 0) {
                o4.d.y(obj);
                AbstractC2783z8.e(mutableState3, true);
                this.f15645s.setValue("Loading PDF...");
                mutableState2.setValue(null);
                this.u.setValue(null);
                mutableState.setValue(null);
                this.f15647w.setValue(1);
                this.f15648x.setValue(Float.valueOf(0.0f));
                try {
                    context.getContentResolver().takePersistableUriPermission(uri, 1);
                } catch (Exception unused) {
                }
                this.f15649y.setValue(uri);
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
                this.f15650z.setValue(string);
                this.f15640A.setValue(Long.valueOf(j5));
                e4.e eVar = H.f1766a;
                e4.d dVar = e4.d.f11107o;
                C2703u8 c2703u8 = new C2703u8(context, uri, this.f15641B, null);
                this.f15643o = 1;
                if (A.C(dVar, c2703u8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o4.d.y(obj);
            }
            A.t(this.f15642C, null, null, new C2687t8(context, uri, 0, mutableState, null), 3);
        } catch (Exception unused2) {
            mutableState2.setValue("Failed to load PDF file details.");
        } finally {
            AbstractC2783z8.e(mutableState3, false);
        }
        return o.f154a;
    }
}
