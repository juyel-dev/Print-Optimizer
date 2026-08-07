package p015d;

import N.b;
import Q3.a;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.p;
import p010c.k;
import p022f.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p implements O3.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f10937o;
    public final /* synthetic */ k p;
    public final /* synthetic */ String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f10938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ State f10939s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, k kVar, String str, a aVar2, State state) {
        super(1);
        this.f10937o = aVar;
        this.p = kVar;
        this.q = str;
        this.f10938r = aVar2;
        this.f10939s = state;
    }

    @Override // O3.c
    public final Object invoke(Object obj) {
        b bVar = new b(this.f10939s, 8);
        e eVarC = this.p.c(this.q, this.f10938r, bVar);
        a aVar = this.f10937o;
        aVar.f10934a = eVarC;
        return new b(aVar, 0);
    }
}
