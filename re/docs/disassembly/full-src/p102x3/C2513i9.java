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

/* JADX INFO: renamed from: x3.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2513i9 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f15183o;
    public int p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f15184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f15185s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f15186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f15187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Uri f15188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15189y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2513i9(d dVar, Context context, Uri uri, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        super(2, dVar);
        this.q = context;
        this.f15184r = mutableState;
        this.f15185s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f15186v = mutableState5;
        this.f15187w = mutableState6;
        this.f15188x = uri;
        this.f15189y = mutableState7;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2513i9(dVar, this.q, this.f15188x, this.f15184r, this.f15185s, this.t, this.u, this.f15186v, this.f15187w, this.f15189y);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2513i9) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        E e;
        a aVar = a.f448o;
        int i5 = this.p;
        MutableState mutableState = this.u;
        MutableState mutableState2 = this.t;
        Context context = this.q;
        MutableState mutableState3 = this.f15184r;
        try {
            try {
                if (i5 == 0) {
                    o4.d.y(obj);
                    AbstractC2545k9.d(mutableState3, true);
                    this.f15185s.setValue("Compiling PDF...");
                    mutableState2.setValue(null);
                    mutableState.setValue(null);
                    this.f15186v.setValue(Float.valueOf(0.0f));
                    File file = new File(context.getExternalFilesDir(null), "NotesCrafterFiles");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    String strD0 = W3.j.D0((String) this.f15187w.getValue());
                    E e3 = new E();
                    e3.f11694o = new File(file, strD0.concat("_organized.pdf"));
                    int i6 = 1;
                    while (((File) e3.f11694o).exists()) {
                        e3.f11694o = new File(file, strD0 + "_organized_(" + i6 + ").pdf");
                        i6++;
                    }
                    e4.e eVar = H.f1766a;
                    e4.d dVar = e4.d.f11107o;
                    C2497h9 c2497h9 = new C2497h9(this.q, this.f15188x, e3, this.f15189y, this.f15185s, this.f15186v, null);
                    this.f15183o = e3;
                    this.p = 1;
                    if (A.C(dVar, c2497h9, this) == aVar) {
                        return aVar;
                    }
                    e = e3;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e = this.f15183o;
                    o4.d.y(obj);
                }
                mutableState.setValue((File) e.f11694o);
                z3 = false;
                Toast.makeText(context, "PDF saved successfully!", 0).show();
                ReviewHelper.INSTANCE.incrementSuccessAndPrompt(context);
            } catch (Exception e5) {
                String message = e5.getMessage();
                if (message == null) {
                    message = "Failed to save organized PDF.";
                }
                mutableState2.setValue(message);
                z3 = false;
            }
            AbstractC2545k9.d(mutableState3, z3);
            return o.f154a;
        } catch (Throwable th) {
            AbstractC2545k9.d(mutableState3, false);
            throw th;
        }
    }
}
