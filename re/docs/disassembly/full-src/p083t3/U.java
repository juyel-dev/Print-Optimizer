package p083t3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C f13110o;
    public List p;
    public Y q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Iterator f13111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13112s;
    public final /* synthetic */ Y t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Y y4, d dVar) {
        super(2, dVar);
        this.t = y4;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new U(this.t, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    /* JADX WARN: Code duplicated, block: B:13:0x009b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0099 -> B:14:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            G3.a r1 = G3.a.f448o
            int r2 = r0.f13112s
            t3.Y r3 = r0.t
            r4 = 1
            r5 = 0
            a4.T r6 = r3.f13128i
            if (r2 == 0) goto L29
            if (r2 != r4) goto L21
            java.util.Iterator r2 = r0.f13111r
            t3.Y r3 = r0.q
            java.util.List r7 = r0.p
            java.util.List r7 = (java.util.List) r7
            kotlin.jvm.internal.C r8 = r0.f13110o
            o4.d.y(r18)
            r13 = r7
            r14 = r8
            goto L9c
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L29:
            o4.d.y(r18)
            C3.C r2 = C3.C.f167o
            r6.getClass()
            r6.j(r5, r2)
            kotlin.jvm.internal.C r2 = new kotlin.jvm.internal.C
            r2.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            a4.T r8 = r3.g
            java.lang.Object r8 = r8.getValue()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r14 = r2
            r13 = r7
            r2 = r8
        L4d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L9e
            java.lang.Object r7 = r2.next()
            r9 = r7
            u3.f r9 = (p087u3.f) r9
            com.notescrafter.service.PDFProcessor r7 = r3.f13124c
            android.net.Uri r8 = r9.getUri()
            r7.getClass()
            java.lang.String r10 = "uri"
            kotlin.jvm.internal.o.f(r8, r10)
            v3.n r10 = new v3.n
            r10.<init>(r7, r8, r5)
            N0.q r7 = new N0.q
            r7.<init>(r10)
            e4.e r8 = X3.H.f1766a
            e4.d r8 = e4.d.f11107o
            a4.f r15 = a4.AbstractC0211j.i(r7, r8)
            b4.m r12 = new b4.m
            r16 = 1
            r7 = r12
            r8 = r14
            r10 = r13
            r11 = r3
            r5 = r12
            r12 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            r0.f13110o = r14
            r7 = r13
            java.util.List r7 = (java.util.List) r7
            r0.p = r7
            r0.q = r3
            r0.f13111r = r2
            r0.f13112s = r4
            java.lang.Object r5 = r15.collect(r5, r0)
            if (r5 != r1) goto L9c
            return r1
        L9c:
            r5 = 0
            goto L4d
        L9e:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r13 = (java.util.Collection) r13
            r1.<init>(r13)
            r6.getClass()
            r2 = 0
            r6.j(r2, r1)
            B3.o r1 = B3.o.f154a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p083t3.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
