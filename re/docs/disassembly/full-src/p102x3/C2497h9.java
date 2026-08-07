package p102x3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.pdf.PdfDocument;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.E;

/* JADX INFO: renamed from: x3.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2497h9 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ MutableState f15148A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PdfDocument f15149o;
    public ParcelFileDescriptor p;
    public PdfRenderer q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f15150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15151s;
    public int t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f15152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Uri f15153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ E f15154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f15155y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f15156z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497h9(Context context, Uri uri, E e, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, d dVar) {
        super(2, dVar);
        this.f15152v = context;
        this.f15153w = uri;
        this.f15154x = e;
        this.f15155y = mutableState;
        this.f15156z = mutableState2;
        this.f15148A = mutableState3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2497h9(this.f15152v, this.f15153w, this.f15154x, this.f15155y, this.f15156z, this.f15148A, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2497h9) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e2 A[Catch: all -> 0x010e, TRY_ENTER, TryCatch #9 {all -> 0x010e, blocks: (B:27:0x00bc, B:30:0x00e2, B:32:0x010a, B:36:0x0111), top: B:95:0x00bc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x010a A[Catch: all -> 0x010e, TryCatch #9 {all -> 0x010e, blocks: (B:27:0x00bc, B:30:0x00e2, B:32:0x010a, B:36:0x0111), top: B:95:0x00bc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0141 A[Catch: all -> 0x0145, TryCatch #3 {all -> 0x0145, blocks: (B:26:0x00a5, B:37:0x013a, B:39:0x0141, B:20:0x006b, B:44:0x0150, B:45:0x0153, B:27:0x00bc, B:30:0x00e2, B:32:0x010a, B:36:0x0111), top: B:83:0x00a5, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a2 -> B:83:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.C2497h9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
