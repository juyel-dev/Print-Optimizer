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
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ReviewHelper;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public final class X9 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f14661A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f14662o;
    public int p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14664s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14665v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Uri f14668y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f14669z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, Uri uri, MutableState mutableState8, MutableState mutableState9, d dVar) {
        super(2, dVar);
        this.q = context;
        this.f14663r = mutableState;
        this.f14664s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14665v = mutableState5;
        this.f14666w = mutableState6;
        this.f14667x = mutableState7;
        this.f14668y = uri;
        this.f14669z = mutableState8;
        this.f14661A = mutableState9;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new X9(this.q, this.f14663r, this.f14664s, this.t, this.u, this.f14665v, this.f14666w, this.f14667x, this.f14668y, this.f14669z, this.f14661A, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((X9) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableState mutableState;
        MutableState mutableState2;
        String message;
        Boolean bool;
        MutableState mutableState3;
        ArrayList arrayList;
        MutableState mutableState4;
        a aVar = a.f448o;
        int i5 = this.p;
        MutableState mutableState5 = this.t;
        MutableState mutableState6 = this.f14664s;
        Context context = this.q;
        MutableState mutableState7 = this.f14663r;
        try {
            try {
                if (i5 == 0) {
                    o4.d.y(obj);
                    mutableState7.setValue(Boolean.TRUE);
                    mutableState6.setValue(null);
                    mutableState5.setValue(C.f167o);
                    this.u.setValue(null);
                    this.f14665v.setValue(Float.valueOf(0.0f));
                    String strD0 = W3.j.D0((String) this.f14666w.getValue());
                    File file = new File(context.getExternalFilesDir(null), "NotesCrafterFiles");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    E e = new E();
                    e.f11694o = new File(file, strD0.concat("_images"));
                    int i6 = 1;
                    while (((File) e.f11694o).exists()) {
                        e.f11694o = new File(file, strD0 + "_images_(" + i6 + ")");
                        i6++;
                    }
                    ((File) e.f11694o).mkdirs();
                    float f5 = ((Y3) this.f14667x.getValue()).f14701o / 72.0f;
                    ArrayList arrayList2 = new ArrayList();
                    e4.e eVar = H.f1766a;
                    e4.d dVar = e4.d.f11107o;
                    mutableState = mutableState6;
                    try {
                        mutableState3 = mutableState7;
                        try {
                            W9 w9 = new W9(this.q, this.f14668y, f5, e, arrayList2, file, strD0, this.f14669z, this.f14661A, this.f14665v, this.u, null);
                            this.f14662o = arrayList2;
                            this.p = 1;
                            if (A.C(dVar, w9, this) == aVar) {
                                return aVar;
                            }
                            arrayList = arrayList2;
                            mutableState4 = mutableState5;
                        } catch (Exception e3) {
                            e = e3;
                            mutableState2 = mutableState3;
                            try {
                                message = e.getMessage();
                                if (message == null) {
                                    message = "Failed to convert PDF.";
                                }
                                mutableState.setValue(message);
                                bool = Boolean.FALSE;
                            } catch (Throwable th) {
                                th = th;
                                mutableState2.setValue(Boolean.FALSE);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mutableState2 = mutableState3;
                            mutableState2.setValue(Boolean.FALSE);
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        mutableState2 = mutableState7;
                        message = e.getMessage();
                        if (message == null) {
                            message = "Failed to convert PDF.";
                        }
                        mutableState.setValue(message);
                        bool = Boolean.FALSE;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = this.f14662o;
                    o4.d.y(obj);
                    mutableState4 = mutableState5;
                    mutableState = mutableState6;
                    mutableState3 = mutableState7;
                }
                mutableState4.setValue(arrayList);
                Toast.makeText(context, "Images converted successfully!", 0).show();
                ReviewHelper.INSTANCE.incrementSuccessAndPrompt(context);
                bool = Boolean.FALSE;
                mutableState2 = mutableState3;
            } catch (Throwable th3) {
                th = th3;
                mutableState2 = mutableState7;
            }
        } catch (Exception e6) {
            e = e6;
            mutableState = mutableState6;
        }
        mutableState2.setValue(bool);
        return o.f154a;
    }
}
