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
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ReviewHelper;
import java.io.File;
import kotlin.jvm.internal.E;

/* JADX INFO: renamed from: x3.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2415c7 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f14866A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ MutableState f14867B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f14868C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f14869D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f14870o;
    public int p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14872s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14873v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Uri f14874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f14875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f14876y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f14877z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415c7(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Uri uri, int i5, int i6, int i7, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, d dVar) {
        super(2, dVar);
        this.q = context;
        this.f14871r = mutableState;
        this.f14872s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14873v = mutableState5;
        this.f14874w = uri;
        this.f14875x = i5;
        this.f14876y = i6;
        this.f14877z = i7;
        this.f14866A = mutableState6;
        this.f14867B = mutableState7;
        this.f14868C = mutableState8;
        this.f14869D = mutableState9;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2415c7(this.q, this.f14871r, this.f14872s, this.t, this.u, this.f14873v, this.f14874w, this.f14875x, this.f14876y, this.f14877z, this.f14866A, this.f14867B, this.f14868C, this.f14869D, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2415c7) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableState mutableState;
        MutableState mutableState2;
        String message;
        Boolean bool;
        MutableState mutableState3;
        E e;
        a aVar = a.f448o;
        int i5 = this.p;
        MutableState mutableState4 = this.t;
        MutableState mutableState5 = this.f14872s;
        Context context = this.q;
        MutableState mutableState6 = this.f14871r;
        try {
            try {
                if (i5 == 0) {
                    o4.d.y(obj);
                    mutableState6.setValue(Boolean.TRUE);
                    mutableState5.setValue(null);
                    mutableState4.setValue(null);
                    this.u.setValue(Float.valueOf(0.0f));
                    File file = new File(context.getExternalFilesDir(null), "NotesCrafterFiles");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    String strD0 = W3.j.D0((String) this.f14873v.getValue());
                    E e3 = new E();
                    e3.f11694o = new File(file, strD0.concat("_numbered.pdf"));
                    int i6 = 1;
                    while (((File) e3.f11694o).exists()) {
                        e3.f11694o = new File(file, strD0 + "_numbered_(" + i6 + ").pdf");
                        i6++;
                    }
                    e4.e eVar = H.f1766a;
                    e4.d dVar = e4.d.f11107o;
                    mutableState = mutableState5;
                    try {
                        mutableState3 = mutableState6;
                        try {
                            C2399b7 c2399b7 = new C2399b7(this.q, this.f14874w, this.f14875x, this.f14876y, this.f14877z, e3, this.f14866A, this.f14867B, this.u, this.f14868C, this.f14869D, null);
                            e = e3;
                            this.f14870o = e;
                            this.p = 1;
                            if (A.C(dVar, c2399b7, this) == aVar) {
                                return aVar;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            mutableState2 = mutableState3;
                            try {
                                message = e.getMessage();
                                if (message == null) {
                                    message = "Failed to process PDF.";
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
                    } catch (Exception e6) {
                        e = e6;
                        mutableState2 = mutableState6;
                        message = e.getMessage();
                        if (message == null) {
                            message = "Failed to process PDF.";
                        }
                        mutableState.setValue(message);
                        bool = Boolean.FALSE;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e = this.f14870o;
                    o4.d.y(obj);
                    mutableState = mutableState5;
                    mutableState3 = mutableState6;
                }
                mutableState4.setValue((File) e.f11694o);
                Toast.makeText(context, "Page numbers added successfully!", 0).show();
                ReviewHelper.INSTANCE.incrementSuccessAndPrompt(context);
                bool = Boolean.FALSE;
                mutableState2 = mutableState3;
            } catch (Throwable th3) {
                th = th3;
                mutableState2 = mutableState6;
            }
        } catch (Exception e7) {
            e = e7;
            mutableState = mutableState5;
        }
        mutableState2.setValue(bool);
        return o.f154a;
    }
}
