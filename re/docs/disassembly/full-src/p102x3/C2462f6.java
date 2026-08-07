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
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ReviewHelper;
import java.io.File;
import kotlin.jvm.internal.E;

/* JADX INFO: renamed from: x3.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2462f6 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f14991o;
    public int p;
    public final /* synthetic */ Context q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MutableState f14992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MutableState f14993s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14997y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2462f6(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, d dVar) {
        super(2, dVar);
        this.q = context;
        this.f14992r = mutableState;
        this.f14993s = mutableState2;
        this.t = mutableState3;
        this.u = mutableState4;
        this.f14994v = mutableState5;
        this.f14995w = mutableState6;
        this.f14996x = mutableState7;
        this.f14997y = mutableState8;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2462f6(this.q, this.f14992r, this.f14993s, this.t, this.u, this.f14994v, this.f14995w, this.f14996x, this.f14997y, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2462f6) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        E e;
        a aVar = a.f448o;
        int i5 = this.p;
        MutableState mutableState = this.t;
        MutableState mutableState2 = this.f14993s;
        Context context = this.q;
        MutableState mutableState3 = this.f14992r;
        try {
            if (i5 == 0) {
                o4.d.y(obj);
                mutableState3.setValue(Boolean.TRUE);
                mutableState2.setValue(null);
                mutableState.setValue(null);
                this.u.setValue(Float.valueOf(0.0f));
                File file = new File(context.getExternalFilesDir(null), "NotesCrafterFiles");
                if (!file.exists()) {
                    file.mkdirs();
                }
                E e3 = new E();
                e3.f11694o = new File(file, "images_converted.pdf");
                int i6 = 1;
                while (((File) e3.f11694o).exists()) {
                    e3.f11694o = new File(file, "images_converted_(" + i6 + ").pdf");
                    i6++;
                }
                e4.e eVar = H.f1766a;
                e4.d dVar = e4.d.f11107o;
                C2446e6 c2446e6 = new C2446e6(this.q, e3, this.f14994v, this.f14995w, this.u, this.f14996x, this.f14997y, null);
                this.f14991o = e3;
                this.p = 1;
                if (A.C(dVar, c2446e6, this) == aVar) {
                    return aVar;
                }
                e = e3;
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e = this.f14991o;
                o4.d.y(obj);
            }
            mutableState.setValue((File) e.f11694o);
            Toast.makeText(context, "PDF created successfully!", 0).show();
            ReviewHelper.INSTANCE.incrementSuccessAndPrompt(context);
        } catch (Exception e5) {
            String message = e5.getMessage();
            if (message == null) {
                message = "Failed to compile PDF.";
            }
            mutableState2.setValue(message);
        } finally {
            mutableState3.setValue(Boolean.FALSE);
        }
        return o.f154a;
    }
}
