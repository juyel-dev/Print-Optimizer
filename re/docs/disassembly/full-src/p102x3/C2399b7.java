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

/* JADX INFO: renamed from: x3.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2399b7 extends j implements e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f14826A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ E f14827B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ MutableState f14828C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ MutableState f14829D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MutableState f14830E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ MutableState f14831F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ MutableState f14832G;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PdfDocument f14833o;
    public ParcelFileDescriptor p;
    public PdfRenderer q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14835s;
    public int t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f14837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Uri f14838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f14839y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f14840z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2399b7(Context context, Uri uri, int i5, int i6, int i7, E e, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, d dVar) {
        super(2, dVar);
        this.f14837w = context;
        this.f14838x = uri;
        this.f14839y = i5;
        this.f14840z = i6;
        this.f14826A = i7;
        this.f14827B = e;
        this.f14828C = mutableState;
        this.f14829D = mutableState2;
        this.f14830E = mutableState3;
        this.f14831F = mutableState4;
        this.f14832G = mutableState5;
    }

    @Override // H3.a
    public final d create(Object obj, d dVar) {
        return new C2399b7(this.f14837w, this.f14838x, this.f14839y, this.f14840z, this.f14826A, this.f14827B, this.f14828C, this.f14829D, this.f14830E, this.f14831F, this.f14832G, dVar);
    }

    @Override // O3.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2399b7) create((InterfaceC0200y) obj, (d) obj2)).invokeSuspend(o.f154a);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x0102 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #10 {all -> 0x019b, blocks: (B:28:0x00fa, B:30:0x0102), top: B:113:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:34:0x015e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0160 A[Catch: all -> 0x0199, TryCatch #8 {all -> 0x0199, blocks: (B:32:0x0139, B:39:0x017c, B:41:0x018f, B:43:0x0195, B:49:0x01a8, B:42:0x0192, B:35:0x0160, B:37:0x0173, B:38:0x0177), top: B:109:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0173 A[Catch: all -> 0x0199, TryCatch #8 {all -> 0x0199, blocks: (B:32:0x0139, B:39:0x017c, B:41:0x018f, B:43:0x0195, B:49:0x01a8, B:42:0x0192, B:35:0x0160, B:37:0x0173, B:38:0x0177), top: B:109:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0177 A[Catch: all -> 0x0199, TryCatch #8 {all -> 0x0199, blocks: (B:32:0x0139, B:39:0x017c, B:41:0x018f, B:43:0x0195, B:49:0x01a8, B:42:0x0192, B:35:0x0160, B:37:0x0173, B:38:0x0177), top: B:109:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x018f A[Catch: all -> 0x0199, TryCatch #8 {all -> 0x0199, blocks: (B:32:0x0139, B:39:0x017c, B:41:0x018f, B:43:0x0195, B:49:0x01a8, B:42:0x0192, B:35:0x0160, B:37:0x0173, B:38:0x0177), top: B:109:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0192 A[Catch: all -> 0x0199, TryCatch #8 {all -> 0x0199, blocks: (B:32:0x0139, B:39:0x017c, B:41:0x018f, B:43:0x0195, B:49:0x01a8, B:42:0x0192, B:35:0x0160, B:37:0x0173, B:38:0x0177), top: B:109:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x019f  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b2 A[Catch: all -> 0x01b6, TryCatch #7 {all -> 0x01b6, blocks: (B:50:0x01ab, B:52:0x01b2, B:58:0x01d8, B:59:0x01db), top: B:107:0x01ab }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ae -> B:117:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // H3.a
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102x3.C2399b7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
