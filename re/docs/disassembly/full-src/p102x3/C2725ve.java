package p102x3;

import B3.o;
import F3.d;
import G3.a;
import H3.j;
import M0.b;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.notescrafter.utils.ReviewHelper;
import java.util.List;

/* JADX INFO: renamed from: x3.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2725ve extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b f15656o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ MutableState q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2725ve(b bVar, Context context, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f15656o = bVar;
        this.p = context;
        this.q = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2725ve(this.f15656o, this.p, this.q, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        C2725ve c2725ve = (C2725ve) create((InterfaceC0200y) obj, (d) obj2);
        o oVar = o.f154a;
        c2725ve.invokeSuspend(oVar);
        return oVar;
    }

    @Override // H3.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f448o;
        o4.d.y(obj);
        List list = Ee.f13941a;
        this.q.setValue(Boolean.TRUE);
        Object obj2 = this.f15656o.f655o;
        ReviewHelper.INSTANCE.incrementSuccessAndPrompt(this.p);
        return o.f154a;
    }
}
