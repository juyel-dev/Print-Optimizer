package p102x3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* JADX INFO: renamed from: x3.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2449e9 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f14966o;
    public ParcelFileDescriptor p;
    public PdfRenderer q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14968s;
    public int t;
    public final /* synthetic */ Context u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Uri f14969v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14972y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2449e9(Context context, Uri uri, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, d dVar) {
        super(2, dVar);
        this.u = context;
        this.f14969v = uri;
        this.f14970w = mutableState;
        this.f14971x = mutableState2;
        this.f14972y = mutableState3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2449e9(this.u, this.f14969v, this.f14970w, this.f14971x, this.f14972y, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2449e9) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068 A[Catch: all -> 0x00ef, TRY_ENTER, TryCatch #5 {all -> 0x00ef, blocks: (B:23:0x0095, B:32:0x00e8, B:19:0x0068, B:36:0x00f3, B:37:0x00f6, B:24:0x009e, B:27:0x00ad, B:31:0x00b8), top: B:67:0x0095, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0094 -> B:67:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.C2449e9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
