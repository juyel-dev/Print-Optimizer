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
import java.util.List;

/* JADX INFO: renamed from: x3.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2465f9 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f15006A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15007o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ Uri q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15009s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15010v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15011w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15013y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f15014z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2465f9(Context context, Uri uri, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, d dVar) {
        super(2, dVar);
        this.p = context;
        this.q = uri;
        this.f15008r = mutableState;
        this.f15009s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f15010v = mutableState5;
        this.f15011w = mutableState6;
        this.f15012x = mutableState7;
        this.f15013y = mutableState8;
        this.f15014z = mutableState9;
        this.f15006A = mutableState10;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2465f9(this.p, this.q, this.f15008r, this.f15009s, this.t, this.u, this.f15010v, this.f15011w, this.f15012x, this.f15013y, this.f15014z, this.f15006A, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2465f9) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Uri uri = this.q;
        Context context = this.p;
        a aVar = a.f448o;
        int i5 = this.f15007o;
        MutableState mutableState = this.t;
        MutableState mutableState2 = this.f15008r;
        try {
            if (i5 == 0) {
                o4.d.y(obj);
                AbstractC2545k9.d(mutableState2, true);
                this.f15009s.setValue("Loading PDF pages...");
                mutableState.setValue(null);
                this.u.setValue(null);
                this.f15010v.setValue(Float.valueOf(0.0f));
                try {
                    context.getContentResolver().takePersistableUriPermission(uri, 1);
                } catch (Exception unused) {
                }
                this.f15011w.setValue(uri);
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
                this.f15012x.setValue(string);
                this.f15013y.setValue(Long.valueOf(j5));
                e4.e eVar = H.f1766a;
                e4.d dVar = e4.d.f11107o;
                C2449e9 c2449e9 = new C2449e9(this.p, this.q, this.f15014z, this.f15009s, this.f15010v, null);
                this.f15007o = 1;
                objC = A.C(dVar, c2449e9, this);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o4.d.y(obj);
                objC = obj;
            }
            this.f15006A.setValue((List) objC);
        } catch (Exception unused2) {
            mutableState.setValue("Failed to load PDF file details.");
        } finally {
            AbstractC2545k9.d(mutableState2, false);
        }
        return o.f154a;
    }
}
