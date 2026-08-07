package p083t3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f13114o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13116s;
    public final /* synthetic */ Y t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Y y4, d dVar) {
        super(2, dVar);
        this.t = y4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new V(this.t, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00dc -> B:31:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p083t3.V.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
