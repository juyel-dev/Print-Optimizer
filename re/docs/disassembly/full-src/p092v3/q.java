package p092v3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import a4.InterfaceC0208g;
import com.notescrafter.service.PDFProcessor;
import java.util.List;
import p087u3.b;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f13555A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ List f13556B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p087u3.e f13557C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ b f13558D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13559o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13560r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13561s;
    public int t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f13565y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f13566z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, PDFProcessor pDFProcessor, List list, p087u3.e eVar, b bVar, d dVar) {
        super(2, dVar);
        this.f13566z = str;
        this.f13555A = pDFProcessor;
        this.f13556B = list;
        this.f13557C = eVar;
        this.f13558D = bVar;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        q qVar = new q(this.f13566z, this.f13555A, this.f13556B, this.f13557C, this.f13558D, dVar);
        qVar.f13565y = obj;
        return qVar;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((InterfaceC0208g) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01f4 -> B:65:0x0203). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 3448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p092v3.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
