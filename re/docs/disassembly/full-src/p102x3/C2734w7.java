package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.notescrafter.service.PDFProcessor;

/* JADX INFO: renamed from: x3.w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2734w7 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15675o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ Uri q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f15676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15677s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f15680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15681y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2734w7(d dVar, Context context, Uri uri, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, PDFProcessor pDFProcessor) {
        super(2, dVar);
        this.p = context;
        this.q = uri;
        this.f15676r = pDFProcessor;
        this.f15677s = mutableState;
        this.t = mutableState2;
        this.u = mutableState3;
        this.f15678v = mutableState4;
        this.f15679w = mutableState5;
        this.f15680x = mutableState6;
        this.f15681y = mutableState7;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        MutableState mutableState = this.f15680x;
        MutableState mutableState2 = this.f15681y;
        return new C2734w7(dVar, this.p, this.q, this.f15677s, this.t, this.u, this.f15678v, this.f15679w, mutableState, mutableState2, this.f15676r);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2734w7) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        Context context = this.p;
        Uri uri = this.q;
        a aVar = a.f448o;
        int i5 = this.f15675o;
        MutableState mutableState = this.u;
        try {
            if (i5 == 0) {
                o4.d.y(obj);
                try {
                    context.getContentResolver().takePersistableUriPermission(uri, 1);
                } catch (Exception unused) {
                }
                this.f15677s.setValue(uri);
                this.t.setValue(null);
                mutableState.setValue(null);
                this.f15678v.setValue(null);
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
                this.f15679w.setValue(string);
                this.f15680x.setValue(Long.valueOf(j5));
                PDFProcessor pDFProcessor = this.f15676r;
                this.f15675o = 1;
                obj = pDFProcessor.m(uri, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o4.d.y(obj);
            }
            this.f15681y.setValue(Integer.valueOf(((Number) obj).intValue()));
        } catch (Exception unused2) {
            mutableState.setValue("Failed to load PDF details.");
        }
        return o.f154a;
    }
}
