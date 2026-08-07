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

/* JADX INFO: loaded from: classes2.dex */
public final class Z7 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ float f14735A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ float f14736B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ E f14737C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f14738D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f14739E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f14740F;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PdfDocument f14741o;
    public ParcelFileDescriptor p;
    public PdfRenderer q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14743s;
    public int t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14744v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f14745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Uri f14746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f14747y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f14748z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z7(Context context, Uri uri, float f5, float f6, float f7, float f8, E e, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, d dVar) {
        super(2, dVar);
        this.f14745w = context;
        this.f14746x = uri;
        this.f14747y = f5;
        this.f14748z = f6;
        this.f14735A = f7;
        this.f14736B = f8;
        this.f14737C = e;
        this.f14738D = mutableState;
        this.f14739E = mutableState2;
        this.f14740F = mutableState3;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new Z7(this.f14745w, this.f14746x, this.f14747y, this.f14748z, this.f14735A, this.f14736B, this.f14737C, this.f14738D, this.f14739E, this.f14740F, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Z7) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:32:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:37:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0153 A[Catch: all -> 0x0157, TryCatch #2 {all -> 0x0157, blocks: (B:42:0x014c, B:44:0x0153, B:52:0x0172, B:53:0x0175), top: B:92:0x014c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a8 -> B:90:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.Z7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
