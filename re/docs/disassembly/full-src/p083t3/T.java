package p083t3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.app.Application;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Application f13103o;
    public Y p;
    public Collection q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Iterator f13104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f13105s;
    public E t;
    public D u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y f13107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f13108x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Y y4, List list, d dVar) {
        super(2, dVar);
        this.f13107w = y4;
        this.f13108x = list;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new T(this.f13107w, this.f13108x, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x0082 A[Catch: all -> 0x0097, TryCatch #3 {all -> 0x0097, blocks: (B:18:0x007c, B:20:0x0082, B:22:0x0090, B:26:0x009c), top: B:56:0x007c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0090 A[Catch: all -> 0x0097, TryCatch #3 {all -> 0x0097, blocks: (B:18:0x007c, B:20:0x0082, B:22:0x0090, B:26:0x009c), top: B:56:0x007c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x009c A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #3 {all -> 0x0097, blocks: (B:18:0x007c, B:20:0x0082, B:22:0x0090, B:26:0x009c), top: B:56:0x007c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d0 -> B:52:0x00db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p083t3.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
