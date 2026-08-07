package p092v3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import a4.InterfaceC0208g;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.notescrafter.service.PDFProcessor;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ParcelFileDescriptor f13547o;
    public E p;
    public PdfRenderer q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13549s;
    public int t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f13550v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f13551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Uri f13552x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PDFProcessor pDFProcessor, Uri uri, d dVar) {
        super(2, dVar);
        this.f13551w = pDFProcessor;
        this.f13552x = uri;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        n nVar = new n(this.f13551w, this.f13552x, dVar);
        nVar.f13550v = obj;
        return nVar;
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC0208g) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[Catch: all -> 0x001f, Exception -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0023, blocks: (B:6:0x001a, B:20:0x0063), top: B:59:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a8 -> B:24:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ab -> B:24:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p092v3.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
