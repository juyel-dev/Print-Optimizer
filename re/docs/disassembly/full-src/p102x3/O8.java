package p102x3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.notescrafter.service.PDFProcessor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public final class O8 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f14259o;
    public PDFProcessor p;
    public Collection q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Iterator f14260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f14261s;
    public E t;
    public D u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f14263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f14264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PDFProcessor f14265y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ MutableState f14266z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8(List list, Context context, PDFProcessor pDFProcessor, MutableState mutableState, d dVar) {
        super(2, dVar);
        this.f14263w = list;
        this.f14264x = context;
        this.f14265y = pDFProcessor;
        this.f14266z = mutableState;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new O8(this.f14263w, this.f14264x, this.f14265y, this.f14266z, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O8) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x007c A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:18:0x0076, B:20:0x007c, B:22:0x008a, B:26:0x0096), top: B:50:0x0076, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x008a A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:18:0x0076, B:20:0x007c, B:22:0x008a, B:26:0x0096), top: B:50:0x0076, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096 A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:18:0x0076, B:20:0x007c, B:22:0x008a, B:26:0x0096), top: B:50:0x0076, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[Catch: Exception -> 0x00d8, TRY_LEAVE, TryCatch #3 {Exception -> 0x00d8, blocks: (B:6:0x001c, B:37:0x00c1, B:39:0x00c9, B:16:0x0058, B:27:0x009c, B:34:0x00a7, B:32:0x00a3, B:33:0x00a6, B:29:0x00a0, B:18:0x0076, B:20:0x007c, B:22:0x008a, B:26:0x0096), top: B:54:0x001c, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00be -> B:8:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x004a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.O8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
