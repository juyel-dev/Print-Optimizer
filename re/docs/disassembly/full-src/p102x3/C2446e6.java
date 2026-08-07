package p102x3;

import B3.o;
import F3.d;
import H3.j;
import O3.e;
import X3.InterfaceC0200y;
import android.content.Context;
import android.graphics.pdf.PdfDocument;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.E;

/* JADX INFO: renamed from: x3.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2446e6 extends j implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PdfDocument f14958o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f14960s;
    public final /* synthetic */ E t;
    public final /* synthetic */ MutableState u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableState f14961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MutableState f14962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MutableState f14963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MutableState f14964y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2446e6(Context context, E e, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, d dVar) {
        super(2, dVar);
        this.f14960s = context;
        this.t = e;
        this.u = mutableState;
        this.f14961v = mutableState2;
        this.f14962w = mutableState3;
        this.f14963x = mutableState4;
        this.f14964y = mutableState5;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2446e6(this.f14960s, this.t, this.u, this.f14961v, this.f14962w, this.f14963x, this.f14964y, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2446e6) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0086  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4 A[PHI: r10 r11
  0x00c4: PHI (r10v5 int) = (r10v4 int), (r10v4 int), (r10v10 int), (r10v10 int) binds: [B:32:0x00e0, B:37:0x00f5, B:21:0x00ad, B:26:0x00c2] A[DONT_GENERATE, DONT_INLINE]
  0x00c4: PHI (r11v5 int) = (r11v4 int), (r11v4 int), (r11v9 int), (r11v9 int) binds: [B:32:0x00e0, B:37:0x00f5, B:21:0x00ad, B:26:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8 A[PHI: r6 r9
  0x00f8: PHI (r6v15 int) = (r6v8 int), (r6v14 int), (r6v20 int) binds: [B:30:0x00d2, B:27:0x00c4, B:28:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00f8: PHI (r9v7 int) = (r9v2 int), (r9v6 int), (r9v11 int) binds: [B:30:0x00d2, B:27:0x00c4, B:28:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.C2446e6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
