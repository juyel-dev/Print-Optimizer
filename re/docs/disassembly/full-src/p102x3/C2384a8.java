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

/* JADX INFO: renamed from: x3.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2384a8 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ float f14781A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ float f14782B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f14783C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f14784o;
    public int p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14786s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Uri f14789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f14790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f14791z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2384a8(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Uri uri, float f5, float f6, float f7, float f8, MutableState mutableState7, d dVar) {
        super(2, dVar);
        this.q = context;
        this.f14785r = mutableState;
        this.f14786s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14787v = mutableState5;
        this.f14788w = mutableState6;
        this.f14789x = uri;
        this.f14790y = f5;
        this.f14791z = f6;
        this.f14781A = f7;
        this.f14782B = f8;
        this.f14783C = mutableState7;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2384a8(this.q, this.f14785r, this.f14786s, this.t, this.u, this.f14787v, this.f14788w, this.f14789x, this.f14790y, this.f14791z, this.f14781A, this.f14782B, this.f14783C, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2384a8) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableState mutableState;
        MutableState mutableState2;
        String message;
        boolean z3;
        MutableState mutableState3;
        E e;
        a aVar = a.f448o;
        int i5 = this.p;
        MutableState mutableState4 = this.u;
        MutableState mutableState5 = this.t;
        Context context = this.q;
        MutableState mutableState6 = this.f14785r;
        try {
            try {
                if (i5 == 0) {
                    o4.d.y(obj);
                    AbstractC2416c8.e(mutableState6, true);
                    this.f14786s.setValue("Cropping PDF pages...");
                    mutableState5.setValue(null);
                    mutableState4.setValue(null);
                    this.f14787v.setValue(Float.valueOf(0.0f));
                    File file = new File(context.getExternalFilesDir(null), "NotesCrafterFiles");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    String strD0 = W3.j.D0((String) this.f14788w.getValue());
                    E e3 = new E();
                    e3.f11694o = new File(file, strD0.concat("_cropped.pdf"));
                    int i6 = 1;
                    while (((File) e3.f11694o).exists()) {
                        e3.f11694o = new File(file, strD0 + "_cropped_(" + i6 + ").pdf");
                        i6++;
                    }
                    e4.e eVar = H.f1766a;
                    e4.d dVar = e4.d.f11107o;
                    mutableState = mutableState5;
                    try {
                        mutableState3 = mutableState6;
                        try {
                            Z7 z7 = new Z7(this.q, this.f14789x, this.f14790y, this.f14791z, this.f14781A, this.f14782B, e3, this.f14783C, this.f14786s, this.f14787v, null);
                            e = e3;
                            this.f14784o = e;
                            this.p = 1;
                            if (A.C(dVar, z7, this) == aVar) {
                                return aVar;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            mutableState2 = mutableState3;
                            try {
                                message = e.getMessage();
                                if (message == null) {
                                    message = "Failed to crop PDF.";
                                }
                                mutableState.setValue(message);
                                z3 = false;
                            } catch (Throwable th) {
                                th = th;
                                AbstractC2416c8.e(mutableState2, false);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mutableState2 = mutableState3;
                            AbstractC2416c8.e(mutableState2, false);
                            throw th;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        mutableState2 = mutableState6;
                        message = e.getMessage();
                        if (message == null) {
                            message = "Failed to crop PDF.";
                        }
                        mutableState.setValue(message);
                        z3 = false;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e = this.f14784o;
                    o4.d.y(obj);
                    mutableState = mutableState5;
                    mutableState3 = mutableState6;
                }
                mutableState4.setValue((File) e.f11694o);
                z3 = false;
                Toast.makeText(context, "PDF cropped successfully!", 0).show();
                ReviewHelper.INSTANCE.incrementSuccessAndPrompt(context);
                mutableState2 = mutableState3;
            } catch (Throwable th3) {
                th = th3;
                mutableState2 = mutableState6;
            }
        } catch (Exception e7) {
            e = e7;
            mutableState = mutableState5;
        }
        AbstractC2416c8.e(mutableState2, z3);
        return o.f154a;
    }
}
